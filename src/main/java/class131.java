import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class131 extends class203 {

    @OriginalMember(owner = "client!nb", name = "hc", descriptor = "[J")
    public static long[] field2499 = new long[200];

    @OriginalMember(owner = "client!nb", name = "mc", descriptor = "[[B")
    public static byte[][] field2504 = new byte[1000][];

    @OriginalMember(owner = "client!nb", name = "ic", descriptor = "Lob;")
    public static class141 field2500 = class175.method1195(40, "");

    @OriginalMember(owner = "client!nb", name = "jc", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!nb", name = "lc", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!nb", name = "qc", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!nb", name = "rc", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!nb", name = "sc", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!nb", name = "tc", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!nb", name = "pc", descriptor = "Lai;")
    public class10 field2507;

    @OriginalMember(owner = "client!nb", name = "kc", descriptor = "Lqe;")
    public static class164 field2502;

    @OriginalMember(owner = "client!nb", name = "nc", descriptor = "[I")
    public static int[] field2505;

    @OriginalMember(owner = "client!nb", name = "oc", descriptor = "[[[Lpd;")
    public static class153[][][] field2506;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method834(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (~arg7 <= ~class68.field1323 && arg6 <= class136.field2590 && class35.field698 <= arg4 && class130.field2470 >= arg3) {
            class88.method597(true, arg5, arg0, arg2, arg4, arg3, arg7, arg6);
        } else {
            class18.method108(arg0, arg6, arg7, arg2, arg4, 19, arg5, arg3);
        }
        ++field2510;
        if (arg1 != -13949) {
            method836(113, (byte) 80, (class141) null, (class141) null);
        }
    }

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)V")
    public static void method835(int arg0) {
        field2505 = null;
        field2499 = null;
        field2506 = null;
        field2502 = null;
        if (arg0 != -31056) {
            field2499 = null;
        }
        field2504 = null;
        field2500 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBLob;Lob;)V")
    public static final void method836(int arg0, byte arg1, class141 arg2, class141 arg3) {
        if (arg1 >= -94) {
            field2505 = null;
        }
        ++field2509;
        class125.method805(-11840, arg2, (class141) null, arg3, arg0);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()I")
    public final int method16() {
        ++field2503;
        return super.field3846;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field2511;
        if (this.field2507 != null) {
            class26 var11 = ~super.field3851 != 0 && ~super.field3861 == -1 ? class114.method736(15619, super.field3851) : null;
            class26 var12 = super.field3828 == -1 || ~super.field3874 == ~super.field3828 && var11 != null ? null : class114.method736(15619, super.field3828);
            class56 var13 = this.field2507.method66(true, super.field3887, var11, var12, super.field3875);
            if (var13 != null) {
                super.field3846 = var13.method16();
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                if (~this.field2507.field173 != -1 && ~this.field2507.field209 != -1) {
                    int var17 = class44.field854[arg0];
                    int var18 = class44.field843[arg0];
                    short var19 = this.field2507.field173;
                    short var20 = this.field2507.field209;
                    int var21 = -var20 / 2;
                    int var22 = -var19 / 2;
                    int var23 = var18 * var21 - var17 * var22 >> 16;
                    int var24 = var17 * var21 + var18 * var22 >> 16;
                    int var25 = class206.method1360(class66.field1287, super.field3889 + var24, (byte) 40, super.field3854 - -var23);
                    int var26 = var19 / 2;
                    int var27 = -var20 / 2;
                    int var28 = var17 * var27 + var18 * var26 >> 16;
                    int var29 = var18 * var27 - var17 * var26 >> 16;
                    int var30 = -var19 / 2;
                    int var31 = class206.method1360(class66.field1287, super.field3889 - -var28, (byte) 40, super.field3854 + var29);
                    int var32 = var20 / 2;
                    int var33 = var17 * var32 + var18 * var30 >> 16;
                    int var34 = var20 / 2;
                    int var35 = var18 * var32 + -(var17 * var30) >> 16;
                    int var36 = class206.method1360(class66.field1287, super.field3889 - -var33, (byte) 40, super.field3854 + var35);
                    int var37 = var19 / 2;
                    int var38 = var17 * var34 + var18 * var37 >> 16;
                    int var39 = var18 * var34 + -(var17 * var37) >> 16;
                    int var40 = var25 >= var31 ? var31 : var25;
                    int var41 = class206.method1360(class66.field1287, super.field3889 + var38, (byte) 40, super.field3854 + var39);
                    int var42 = var25 + var41;
                    if (var31 - -var36 < var42) {
                        var42 = var31 + var36;
                    }
                    int var43 = var36 >= var41 ? var41 : var36;
                    var16 = 2047 & (int) (325.95D * Math.atan2((double) (-var43 + var40), (double) var20));
                    if (~var16 != -1) {
                        var13.method378(var16);
                    }
                    int var44 = var41 > var31 ? var31 : var41;
                    int var45 = ~var25 <= ~var36 ? var36 : var25;
                    var14 = (int) (325.95D * Math.atan2((double) (-var44 + var45), (double) var19)) & 2047;
                    if (var14 != 0) {
                        var13.method380(var14);
                    }
                    var15 = (var42 >> 1) - super.field3864;
                    if (~var15 != -1) {
                        var13.method384(0, var15, 0);
                    }
                }
                class56 var46 = null;
                if (super.field3827 != -1 && ~super.field3883 != 0) {
                    class107 var47 = class111.method730(super.field3827, -73);
                    var46 = var47.method708(13557, super.field3883);
                    if (var46 != null) {
                        var46.method384(0, -super.field3829, 0);
                        if (var47.field2058) {
                            if (var16 != 0) {
                                var46.method378(var16);
                            }
                            if (var14 != 0) {
                                var46.method380(var14);
                            }
                            if (~var15 != -1) {
                                var46.method384(0, var15, 0);
                            }
                        }
                    }
                }
                if (var46 != null) {
                    var13 = ((class75) var13).method519(var46);
                }
                if (~this.field2507.field205 == -2) {
                    var13.field1092 = true;
                }
                var13.method10(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)Z")
    public final boolean method251(byte arg0) {
        if (arg0 < 67) {
            this.method251((byte) 98);
        }
        ++field2508;
        return this.field2507 != null;
    }
}
