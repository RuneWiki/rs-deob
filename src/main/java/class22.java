import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class22 {

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "[Ljava/awt/Color;")
    public static Color[] field299 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "[I")
    public static int[] field300 = new int[256];

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "Lss;")
    public static class140 field303 = new class140(2, 4);

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "Z")
    public static boolean field305 = true;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "[I")
    public static int[] field304;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
    public static void method136(int arg0) {
        if (arg0 != 0) {
            method136(-52);
        }
        field304 = null;
        field299 = null;
        field303 = null;
        field300 = null;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
    public static final void method137(int arg0) {
        if (arg0 >= 80) {
            field301++;
            class170.field2011.method1165((byte) 118);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
    public static final String method138(int arg0, int arg1, boolean arg2, int arg3) {
        field302++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg2 && arg0 >= 0) {
            if (arg1 != 32405) {
                field300 = null;
            }
            int var4 = 2;
            int var5 = arg0 / arg3;
            while (var5 != 0) {
                var5 /= arg3;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg3;
                int var9 = var8 - (arg0 * arg3);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg3);
        }
    }
}
