import java.awt.Color;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class263 extends InputStream {

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Z")
    public static boolean field3835 = false;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3836 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!th", name = "read", descriptor = "()I")
    public final int read() {
        class210.method1342(-122, 30000L);
        field3834++;
        return -1;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;ZB)Z")
    public static final boolean method1673(int arg0, String arg1, boolean arg2, byte arg3) {
        field3833++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var4 = -94 % ((arg3 - 38) / 35);
        boolean var5 = false;
        boolean var6 = false;
        int var7 = 0;
        int var8 = arg1.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg1.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var5 = true;
                    continue;
                }
                if (var10 == '+' && arg2) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                return false;
            }
            if (var12 >= arg0) {
                return false;
            }
            if (var5) {
                var12 = -var12;
            }
            int var11 = arg0 * var7 + var12;
            if ((var11 / arg0) != var7) {
                return false;
            }
            var7 = var11;
            var6 = true;
        }
        return var6;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method1674(int arg0) {
        field3836 = null;
        if (arg0 != 36) {
            method1674(24);
        }
    }
}
