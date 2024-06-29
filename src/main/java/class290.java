import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class290 extends class266 {

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "Z")
    public static boolean field4925 = false;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "Lma;")
    public static class5 field4932 = class12.method119("3D)2Softwarebibliothek gestartet)3", (byte) 120);

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "Lma;")
    public static class5 field4921 = class12.method119("Clientscript error in: ", (byte) 98);

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
    public static int field4934 = 0;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "I")
    public int field4923;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "I")
    public int field4926;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "I")
    public int field4928;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    public int field4935;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "Lma;")
    public class5 field4924;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "Z")
    public static boolean field4938;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "[I")
    public int[] field4930;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "[I")
    public int[] field4936;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "[Lbf;")
    public class209[] field4929;

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "[Lma;")
    public class5[] field4927;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIZIIII)V", line = 5)
    public static final void method1959(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field4931++;
        if (arg0 < 128 || arg6 < 128 || arg0 > 13056 || arg6 > 13056) {
            class39.field597 = -1;
            class79.field1218 = -1;
            return;
        }
        int var8 = class20.method161(arg6, arg0, 1, class276.field4701) - arg5;
        int var9 = var8 - class27.field437;
        int var10 = class229.field3805[class207.field3287];
        int var11 = arg6 - class303.field5108;
        int var12 = arg0 - class239.field3970;
        int var13 = class229.field3805[class114.field1710];
        int var14 = class229.field3806[class207.field3287];
        if (arg3) {
            field4938 = false;
        }
        int var15 = class229.field3806[class114.field1710];
        int var16 = var11 * var13 + var12 * var15 >> 16;
        int var17 = var11 * var15 - var12 * var13 >> 16;
        int var19 = var9 * var14 - var10 * var17 >> 16;
        int var20 = var9 * var10 + (var14 * var17) >> 16;
        if (var20 >= 50) {
            int var22 = arg4 * 512 >> 8;
            class79.field1218 = arg1 + (var19 * var22 / var20);
            int var23 = arg7 * 512 >> 8;
            class39.field597 = arg2 + (var16 * var23 / var20);
        } else {
            class39.field597 = -1;
            class79.field1218 = -1;
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V", line = 86)
    public static void method1960(byte arg0) {
        if (arg0 == 47) {
            field4921 = null;
            field4932 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V", line = 98)
    public static final void method1961(boolean arg0) {
        if (!arg0) {
            class12.field234.method523(122);
            field4933++;
        }
    }
}
