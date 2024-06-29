import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class597 {

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "[I")
    public static int[] field8643 = new int[64];

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "[I")
    public static int[] field8640 = new int[8];

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "Lrg;")
    public static class548 field8646 = new class548(61, 3);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field8639;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field8647;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Lia;")
    public static class504 field8642;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "[[S")
    public static short[][] field8645;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILqa;Lra;ZZII)V")
    public static final void method3452(int arg0, class206 arg1, class90 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        if (arg4) {
            class590.field8548.method299((class185.field2239 - class590.field8548.method292()) / 2, (class426.field5495 - class590.field8548.method286()) / 2);
            class442.field6107.method299((class185.field2239 - class442.field6107.method292()) / 2, 18);
        }
        field8641++;
        String var7 = "";
        if (class486.field6795 == class341.field4399) {
            var7 = class89.field1092.method987(class31.field247, 22);
        } else if (class341.field4399 == class320.field4082) {
            var7 = class91.field1125.method987(class31.field247, 22);
        }
        arg2.method534(11740, var7, -1, class426.field5495 / 2 - 26, arg5, class185.field2239 / 2);
        int var8 = class426.field5495 / 2 - 18;
        arg1.method1142(class185.field2239 / 2 - 152, var8, 304, 34, arg6, 0);
        if (!arg3) {
            method3453(-125, -30, -31, -107, -42, -19, -63);
        }
        arg1.method1142(class185.field2239 / 2 - 151, var8 + 1, 302, 32, 0, 0);
        arg1.method1133(class185.field2239 / 2 - 150, var8 + 2, class183.field2223 * 3, 30, arg0, 0);
        arg1.method1133(class183.field2223 * 3 + class185.field2239 / 2 - 150, var8 - -2, 300 - (class183.field2223 * 3), 30, 0, 0);
        arg2.method534(11740, class183.field2221, -1, class426.field5495 / 2 + 4, arg5, class185.field2239 / 2);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class639.method3664(arg5, 128);
        field8644++;
        int var7 = 0;
        int var8 = arg5 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class328.field4287[arg0];
        int var16 = arg6 - var8;
        int var17 = arg6 + var8;
        class62.method363(var16, -127, arg3, var15, arg6 - arg5);
        class62.method363(var17, -128, arg2, var15, var16);
        int var18 = -109 / ((78 - arg4) / 41);
        class62.method363(arg5 + arg6, -128, arg3, var15, var17);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class466.field6526[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var19 = class328.field4287[arg0 + var9];
                    int[] var20 = class328.field4287[arg0 - var9];
                    int var21 = class466.field6526[var9];
                    int var22 = arg6 + var7;
                    int var23 = arg6 - var7;
                    int var24 = arg6 + var21;
                    int var25 = arg6 - var21;
                    class62.method363(var25, -128, arg3, var19, var23);
                    class62.method363(var24, -127, arg2, var19, var25);
                    class62.method363(var22, -127, arg3, var19, var24);
                    class62.method363(var25, -128, arg3, var20, var23);
                    class62.method363(var24, -128, arg2, var20, var25);
                    class62.method363(var22, -127, arg3, var20, var24);
                } else {
                    int[] var26 = class328.field4287[arg0 + var9];
                    int[] var27 = class328.field4287[arg0 - var9];
                    int var28 = arg6 + var7;
                    int var29 = arg6 - var7;
                    class62.method363(var28, -128, arg3, var26, var29);
                    class62.method363(var28, -127, arg3, var27, var29);
                }
            }
            int[] var30 = class328.field4287[arg0 + var7];
            int[] var31 = class328.field4287[arg0 - var7];
            int var32 = arg6 + var9;
            int var33 = arg6 - var9;
            if (var7 >= var8) {
                class62.method363(var32, -128, arg3, var30, var33);
                class62.method363(var32, -128, arg3, var31, var33);
            } else {
                int var34 = var11 < var7 ? class466.field6526[var7] : var11;
                int var35 = arg6 + var34;
                int var36 = arg6 - var34;
                class62.method363(var36, -128, arg3, var30, var33);
                class62.method363(var35, -128, arg2, var30, var36);
                class62.method363(var32, -128, arg3, var30, var35);
                class62.method363(var36, -127, arg3, var31, var33);
                class62.method363(var35, -128, arg2, var31, var36);
                class62.method363(var32, -128, arg3, var31, var35);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8647++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static void method3454(byte arg0) {
        field8642 = null;
        field8646 = null;
        field8640 = null;
        if (arg0 <= -35) {
            field8643 = null;
            field8645 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)Z")
    public final boolean method3455(byte arg0) {
        field8639++;
        if (arg0 != 77) {
            method3453(-29, -95, -106, 96, 67, -99, -106);
        }
        return class104.field1269 == this | class537.field7555 == this;
    }
}
