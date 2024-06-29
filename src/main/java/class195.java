import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class195 extends class4 {

    @OriginalMember(owner = "client!ld", name = "Hb", descriptor = "Lub;")
    public static class227 field3314 = class257.method1749("<col=ffffff>", 17263);

    @OriginalMember(owner = "client!ld", name = "Kb", descriptor = "Z")
    public static boolean field3317 = false;

    @OriginalMember(owner = "client!ld", name = "Gb", descriptor = "Lub;")
    private static class227 field3313 = class257.method1749("wishes to trade with you)3", 17263);

    @OriginalMember(owner = "client!ld", name = "Fb", descriptor = "Lub;")
    public static class227 field3312 = class257.method1749("welle2:", 17263);

    @OriginalMember(owner = "client!ld", name = "Qb", descriptor = "Lub;")
    public static class227 field3323 = field3313;

    @OriginalMember(owner = "client!ld", name = "Ob", descriptor = "[[[I")
    public static int[][][] field3321 = new int[2][][];

    @OriginalMember(owner = "client!ld", name = "Lb", descriptor = "I")
    public static int field3318 = 0;

    @OriginalMember(owner = "client!ld", name = "Rb", descriptor = "[Lub;")
    public static class227[] field3324 = new class227[100];

    @OriginalMember(owner = "client!ld", name = "Eb", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!ld", name = "Jb", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!ld", name = "Mb", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!ld", name = "Nb", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!ld", name = "Pb", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!ld", name = "Sb", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!ld", name = "Tb", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!ld", name = "Ub", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!ld", name = "Ib", descriptor = "Lhj;")
    public class147 field3315;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "()I")
    public final int method88() {
        ++field3319;
        return super.field107;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field3325;
        if (this.field3315 != null) {
            class51 var11 = ~super.field101 != 0 && ~super.field60 == -1 ? class25.method127(true, super.field101) : null;
            class51 var12 = super.field82 == -1 || super.field82 == super.field61 && var11 != null ? null : class25.method127(true, super.field82);
            class48 var13 = this.field3315.method929(super.field72, var12, (byte) 112, var11, super.field52);
            if (var13 != null) {
                super.field107 = var13.method88();
                class147 var14 = this.field3315;
                if (var14.field2563 != null) {
                    var14 = var14.method933(29882);
                }
                if (class220.field3721 && var14.field2571) {
                    class48 var15 = class142.method899(this.field3315.field2543, this.field3315.field2537, super.field103, this.field3315.field2542, super.field99, false, this.field3315.field2556, var12 != null ? super.field72 : super.field52, var12 != null ? var12 : var11, super.field74, super.field50, var13, arg0, this.field3315.field2578);
                    var15.method85(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (~this.field3315.field2522 != -1 && ~this.field3315.field2564 != -1) {
                    int var19 = class62.field1136[arg0];
                    int var20 = class62.field1143[arg0];
                    short var21 = this.field3315.field2522;
                    short var22 = this.field3315.field2564;
                    int var23 = var21 / 2;
                    int var24 = -var22 / 2;
                    int var25 = -var21 / 2;
                    int var26 = var19 * var24 - -(var20 * var25) >> 16;
                    int var27 = var20 * var24 + -(var19 * var25) >> 16;
                    int var28 = -var22 / 2;
                    int var29 = var20 * var28 + -(var19 * var23) >> 16;
                    int var30 = class193.method1227(super.field50 + var26, true, class64.field1171, super.field99 - -var27);
                    int var31 = var19 * var28 + var20 * var23 >> 16;
                    int var32 = class193.method1227(super.field50 + var31, true, class64.field1171, super.field99 + var29);
                    int var33 = -var21 / 2;
                    int var34 = var22 / 2;
                    int var35 = var20 * var34 + -(var19 * var33) >> 16;
                    int var36 = var22 / 2;
                    int var37 = var30 < var32 ? var30 : var32;
                    int var38 = var21 / 2;
                    int var39 = var19 * var34 + var20 * var33 >> 16;
                    int var40 = var19 * var36 + var20 * var38 >> 16;
                    int var41 = class193.method1227(super.field50 + var39, true, class64.field1171, super.field99 - -var35);
                    int var42 = var20 * var36 - var19 * var38 >> 16;
                    int var43 = class193.method1227(super.field50 + var40, true, class64.field1171, super.field99 + var42);
                    int var44 = ~var41 < ~var30 ? var30 : var41;
                    int var45 = var30 + var43;
                    int var46 = var41 >= var43 ? var43 : var41;
                    if (var32 + var41 < var45) {
                        var45 = var32 + var41;
                    }
                    int var47 = ~var32 <= ~var43 ? var43 : var32;
                    var16 = (int) (325.95D * Math.atan2((double) (-var46 + var37), (double) var22)) & 2047;
                    if (var16 != 0) {
                        var13.method269(var16);
                    }
                    var17 = (int) (Math.atan2((double) (-var47 + var44), (double) var21) * 325.95D) & 2047;
                    if (var17 != 0) {
                        var13.method287(var17);
                    }
                    var18 = (var45 >> 1) + -super.field74;
                    if (~var18 != -1) {
                        var13.method277(0, var18, 0);
                    }
                }
                class48 var48 = null;
                if (super.field69 != -1 && super.field109 != -1) {
                    class145 var49 = class179.method1149(super.field69, -115);
                    var48 = var49.method914(128, super.field109);
                    if (var48 != null) {
                        var48.method277(0, -super.field46, 0);
                        if (var49.field2499) {
                            if (~var16 != -1) {
                                var48.method269(var16);
                            }
                            if (~var17 != -1) {
                                var48.method287(var17);
                            }
                            if (var18 != 0) {
                                var48.method277(0, var18, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class55) var13).method325(var48);
                }
                if (~this.field3315.field2542 == -2) {
                    var13.field854 = true;
                }
                var13.method85(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)Z")
    public static final boolean method1234(int arg0, byte arg1) {
        ++field3311;
        if (class30.field489[arg0]) {
            return true;
        } else if (!class87.field1505.method873(arg0, 26536)) {
            return false;
        } else {
            int var2 = class87.field1505.method875(-2, arg0);
            if (var2 == 0) {
                class30.field489[arg0] = true;
                return true;
            } else {
                if (class102.field1792[arg0] == null) {
                    class102.field1792[arg0] = new class105[var2];
                }
                if (arg1 > -1) {
                    method1235((byte) 125, 25);
                }
                for (int var3 = 0; ~var2 < ~var3; ++var3) {
                    if (class102.field1792[arg0][var3] == null) {
                        byte[] var4 = class87.field1505.method884(var3, -86, arg0);
                        if (var4 != null) {
                            class102.field1792[arg0][var3] = new class105();
                            class102.field1792[arg0][var3].field1861 = (arg0 << 16) + var3;
                            if (~var4[0] != 0) {
                                class102.field1792[arg0][var3].method647(new class226(var4), (byte) 53);
                            } else {
                                class102.field1792[arg0][var3].method643(0, new class226(var4));
                            }
                        }
                    }
                }
                class30.field489[arg0] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)V")
    public static final void method1235(byte arg0, int arg1) {
        ++field3326;
        if (arg1 == -1 && !class171.field2869) {
            class221.method1397(-121);
        } else if (~arg1 != 0 && (class13.field248 != arg1 || !class40.method212(-120)) && class179.field3072 != 0 && !class171.field2869) {
            class29.method148(class179.field3072, class14.field270, false, 2, arg1, 0, false);
        }
        class13.field248 = arg1;
        if (arg0 > -59) {
            method1236((byte) -114);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)Z")
    public final boolean method14(byte arg0) {
        ++field3322;
        if (arg0 != -35) {
            this.method85(83, 30, 72, -31, 33, -33, 106, -74, 8L);
        }
        return this.field3315 != null;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
    public static void method1236(byte arg0) {
        field3321 = null;
        field3314 = null;
        field3312 = null;
        field3324 = null;
        if (arg0 >= -53) {
            method1235((byte) -37, -34);
        }
        field3313 = null;
        field3323 = null;
    }
}
