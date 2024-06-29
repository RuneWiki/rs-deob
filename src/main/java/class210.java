import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class210 extends class68 {

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Z")
    public static boolean field3583 = false;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "Lve;")
    private static class255 field3588 = class87.method607(107, "level:");

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "Lve;")
    private static class255 field3591 = class87.method607(82, "scroll:");

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "Lve;")
    public static class255 field3581 = field3588;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "Lve;")
    public static class255 field3584 = field3591;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "Lve;")
    public static class255 field3582 = field3591;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "Lrg;")
    public static class88 field3586;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "[I")
    public static int[] field3579;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIIII)V", line = 24)
    public static final void method1508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 <= 106) {
            field3581 = (class255) null;
        }
        for (int var9 = 0; var9 < class266.field4506.field846; var9++) {
            int var10 = class266.field4506.field837[var9] - class225.field3768;
            int var11 = 16777215;
            int var12 = class297.field5084 + (class41.field636 - 1) - class266.field4506.field855[var9];
            int var13 = class266.field4506.method335(3, var9);
            int var14 = arg1 + ((arg8 - arg1) * (var10 - arg4) / (arg5 - arg4));
            int var15 = (arg6 - arg7) * (var12 - arg2) / (arg0 - arg2) + arg7;
            class228 var16 = null;
            if (var13 == 0) {
                if ((double) class59.field905 == 3.0D) {
                    var16 = class41.field647;
                }
                if ((double) class59.field905 == 4.0D) {
                    var16 = class93.field1602;
                }
                if ((double) class59.field905 == 6.0D) {
                    var16 = class239.field3997;
                }
                if ((double) class59.field905 == 8.0D) {
                    var16 = class30.field479;
                }
            }
            if (var13 == 1) {
                if ((double) class59.field905 == 3.0D) {
                    var16 = class239.field3997;
                }
                if ((double) class59.field905 == 4.0D) {
                    var16 = class30.field479;
                }
                if ((double) class59.field905 == 6.0D) {
                    var16 = class215.field3659;
                }
                if ((double) class59.field905 == 8.0D) {
                    var16 = class81.field1318;
                }
            }
            if (var13 == 2) {
                var11 = 16755200;
                if ((double) class59.field905 == 3.0D) {
                    var16 = class215.field3659;
                }
                if ((double) class59.field905 == 4.0D) {
                    var16 = class81.field1318;
                }
                if ((double) class59.field905 == 6.0D) {
                    var16 = class277.field4766;
                }
                if ((double) class59.field905 == 8.0D) {
                    var16 = class144.field2397;
                }
            }
            if (class266.field4506.field843[var9] != -1) {
                var11 = class266.field4506.field843[var9];
            }
            if (var16 != null) {
                class255[] var17 = new class255[class266.field4506.field854[var9].method1755(60, (byte) -117) + 1];
                class6.field82.method490(class266.field4506.field854[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var15 - (var18 - 1) * var16.method1577() / 2;
                int var20 = var19 + var16.method1583() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class255 var22 = (var18 - 1) == var21 ? var17[var21] : var17[var21].method1780(var17[var21].method1774(-41) - 4, -10449, 0);
                    var16.method1576(var22, var14, var20, var11, true);
                    var20 += var16.method1577();
                }
            }
        }
        field3587++;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 146)
    public static void method1509(int arg0) {
        field3581 = null;
        field3582 = null;
        field3588 = null;
        field3579 = null;
        field3586 = null;
        if (arg0 == 16755200) {
            field3591 = null;
            field3584 = null;
        }
    }
}
