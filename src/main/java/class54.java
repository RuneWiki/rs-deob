import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class54 extends class637 {

    @OriginalMember(owner = "client!nca", name = "D", descriptor = "Lbv;")
    public static class567 field771 = new class567("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!nca", name = "G", descriptor = "[[Z")
    public static boolean[][] field774 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!nca", name = "I", descriptor = "I")
    public static int field776 = 0;

    @OriginalMember(owner = "client!nca", name = "H", descriptor = "Liu;")
    public static class517 field775 = new class517(106, 8);

    @OriginalMember(owner = "client!nca", name = "J", descriptor = "Lnn;")
    public static class214 field777 = new class214(11, 17);

    @OriginalMember(owner = "client!nca", name = "K", descriptor = "Z")
    public static boolean field778 = false;

    @OriginalMember(owner = "client!nca", name = "L", descriptor = "Lbv;")
    public static class567 field779 = new class567("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!nca", name = "M", descriptor = "[J")
    public static long[] field780 = new long[32];

    @OriginalMember(owner = "client!nca", name = "A", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!nca", name = "B", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!nca", name = "C", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!nca", name = "E", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!nca", name = "F", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!nca", name = "N", descriptor = "[Lji;")
    public static class314[] field781;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIIB)V")
    public final void method448(int arg0, int arg1, int arg2, byte arg3) {
        ++field773;
        super.field9251 = arg2;
        super.field9249 = arg0;
        if (arg3 == 24) {
            super.field9253 = arg1;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field768;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = -arg5 + arg1;
        int var12 = -arg5 + arg7;
        int var13 = arg1 * arg1;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        if (arg4 == -1295904959) {
            int var17 = var14 << 1;
            int var18 = var13 << 1;
            int var19 = var16 << 1;
            int var20 = var15 << 1;
            int var21 = arg7 << 1;
            int var22 = var12 << 1;
            int var23 = (-var21 + 1) * var13 + var17;
            int var24 = -((var21 + -1) * var18) + var14;
            int var25 = (-var22 + 1) * var15 + var19;
            int var26 = var16 - (var22 + -1) * var20;
            int var27 = var13 << 2;
            int var28 = var14 << 2;
            int var29 = var15 << 2;
            int var30 = var16 << 2;
            int var31 = var17 * 3;
            int var32 = (var21 + -3) * var18;
            int var33 = var19 * 3;
            int var34 = (var22 - 3) * var20;
            int var35 = var28;
            int var36 = (arg7 - 1) * var27;
            int var37 = var30;
            int var38 = (var12 + -1) * var29;
            int[] var39 = class495.field6944[arg2];
            class614.method3490(arg6, -arg1 + arg3, -94, var39, -var11 + arg3);
            class614.method3490(arg0, -var11 + arg3, -128, var39, arg3 + var11);
            class614.method3490(arg6, arg3 - -var11, -120, var39, arg1 + arg3);
            while (~var9 < -1) {
                boolean var40 = ~var9 >= ~var12;
                if (~var23 > -1) {
                    while (~var23 > -1) {
                        var24 += var35;
                        var23 += var31;
                        ++var8;
                        var35 += var28;
                        var31 += var28;
                    }
                }
                if (var40) {
                    if (~var25 > -1) {
                        while (var25 < 0) {
                            var26 += var37;
                            var25 += var33;
                            ++var10;
                            var37 += var30;
                            var33 += var30;
                        }
                    }
                    if (~var26 > -1) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        ++var10;
                        var33 += var30;
                    }
                    var25 += -var38;
                    var26 += -var34;
                    var34 -= var29;
                    var38 -= var29;
                }
                if (var24 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    ++var8;
                    var31 += var28;
                }
                var24 += -var32;
                var23 += -var36;
                --var9;
                var32 -= var27;
                var36 -= var27;
                int var41 = arg2 - var9;
                int var42 = arg2 + var9;
                int var43 = arg3 + var8;
                int var44 = -var8 + arg3;
                if (!var40) {
                    class614.method3490(arg6, var44, -126, class495.field6944[var41], var43);
                    class614.method3490(arg6, var44, -107, class495.field6944[var42], var43);
                } else {
                    int var45 = arg3 + var10;
                    int var46 = -var10 + arg3;
                    class614.method3490(arg6, var44, -90, class495.field6944[var41], var46);
                    class614.method3490(arg0, var46, -100, class495.field6944[var41], var45);
                    class614.method3490(arg6, var45, -97, class495.field6944[var41], var43);
                    class614.method3490(arg6, var44, -128, class495.field6944[var42], var46);
                    class614.method3490(arg0, var46, -128, class495.field6944[var42], var45);
                    class614.method3490(arg6, var45, -100, class495.field6944[var42], var43);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(IIIIIF)V")
    public class54(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IF)V")
    public final void method450(int arg0, float arg1) {
        ++field770;
        super.field9252 = arg1;
        if (arg0 != 5065) {
            field775 = null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)V")
    public static void method451(byte arg0) {
        field774 = null;
        field777 = null;
        field775 = null;
        field781 = null;
        field780 = null;
        if (arg0 != -45) {
            method452((class561) null, false);
        }
        field771 = null;
        field779 = null;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lgp;Z)V")
    public static final void method452(class561 arg0, boolean arg1) {
        ++field769;
        class313.field4567 = arg0;
        if (arg1) {
            method452((class561) null, false);
        }
    }
}
