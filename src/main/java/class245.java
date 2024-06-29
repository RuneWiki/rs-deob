import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class245 {

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Z")
    public static volatile boolean field3923 = true;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[I")
    public static int[] field3921 = new int[5];

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field3927 = 0;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field3929 = new String[100];

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "[I")
    public static int[] field3928;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method1685(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3925++;
        if (arg7 < 128 || arg5 < 128 || arg7 > 13056 || arg5 > 13056) {
            class233.field3814 = -1;
            class133.field2124 = -1;
            return;
        }
        int var8 = class225.method1583(arg5, arg7, class250.field3980, 0) - arg6;
        int var9 = var8 - class17.field301;
        int var10 = class69.field1137[class200.field3187];
        if (arg1 != 124) {
            method1685(-47, (byte) 29, 44, -106, 64, 49, 114, 91);
        }
        int var11 = arg5 - class99.field1625;
        int var12 = class69.field1147[class200.field3187];
        int var13 = class69.field1137[class202.field3242];
        int var14 = arg7 - class54.field925;
        int var15 = class69.field1147[class202.field3242];
        int var16 = var11 * var15 + (var13 * var14) >> 16;
        int var17 = var11 * var13 - (var14 * var15) >> 16;
        int var19 = var9 * var10 - (var12 * var17) >> 16;
        int var20 = var9 * var12 + var10 * var17 >> 16;
        if (var20 >= 50) {
            class233.field3814 = (var19 << 9) / var20 + arg2;
            class133.field2124 = (var16 << 9) / var20 + arg0;
        } else {
            class233.field3814 = -1;
            class133.field2124 = -1;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public static void method1686(byte arg0) {
        if (arg0 != -110) {
            field3921 = null;
        }
        field3928 = null;
        field3921 = null;
        field3929 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static final void method1687(int arg0) {
        field3924++;
        class90.field1484.method472((byte) -63);
        if (arg0 != 9308) {
            method1686((byte) 42);
        }
    }
}
