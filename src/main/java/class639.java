import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class639 extends class136 {

    @OriginalMember(owner = "client!hda", name = "C", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!hda", name = "E", descriptor = "I")
    public static int field9299;

    @OriginalMember(owner = "client!hda", name = "F", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!hda", name = "H", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!hda", name = "G", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field9301;

    @OriginalMember(owner = "client!hda", name = "I", descriptor = "[B")
    private byte[] field9303;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(B)V")
    public static void method3696(byte arg0) {
        field9301 = null;
        if (arg0 != -34) {
            field9301 = null;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method3697(byte arg0, String arg1) {
        field9300++;
        if (arg0 != 80) {
            field9301 = null;
        }
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V")
    public class639() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIII)[B")
    public final byte[] method3698(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 2) {
            field9299++;
            this.field9303 = new byte[arg0 * arg1 * arg2 * 2];
            this.method2367(arg1, arg2, true, arg0);
            return this.field9303;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Ljava/lang/String;ZLra;B)V")
    public static final void method3699(String arg0, boolean arg1, class91 arg2, byte arg3) {
        field9298++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class208.field2944.method2822(null, 28353, arg0, 250);
        int var8 = class208.field2944.method2813(arg0, 250, null, (byte) -109) * 13;
        if (arg3 != 82) {
            return;
        }
        class69.field1165.method1321(var5 - var4, -var4 + var6, var4 + var7 + var4, var8 - -var4 + var4, -16777216, 0);
        class69.field1165.method1325(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var4 + var8, -1, 0);
        arg2.method673(-1, 1, -1, var6, 0, 0, arg0, 0, null, null, 1, var5, var8, var7, -1, null);
        class481.method2802(-128, var6 - var4, -var4 + var5, var4 + var8 + var4, var4 + var4 + var7);
        if (arg1) {
            try {
                class69.field1165.method1307();
            } catch (class589 var9) {
            }
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(BIB)V")
    public final void method916(byte arg0, int arg1, byte arg2) {
        field9302++;
        int var4 = arg1 * 2;
        int var5 = arg0 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field9303[var10001] = (byte) (var5 * 3 >> 5);
        this.field9303[var6] = (byte) (var5 * 3 >> 5);
        if (arg2 != 114) {
            this.method3698(70, -61, 78, -52);
        }
    }
}
