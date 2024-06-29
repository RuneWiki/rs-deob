import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class274 {

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "Lre;")
    private class603 field3904 = new class603();

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    private int field3895;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    private int field3889;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "Lhe;")
    private class372 field3903;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field3893 = 0;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "[Lvs;")
    public static class593[] field3907;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lte;Z)V", line = 3)
    private final void method1731(class616 arg0, boolean arg1) {
        if (arg0 != null) {
            arg0.method1304((byte) 7);
            arg0.method2597(77);
            this.field3889 += arg0.field8671;
        }
        field3901++;
        if (!arg1) {
            this.method1744(-94, 68);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lvm;IBLjava/lang/Object;)V", line = 21)
    private final void method1732(class688 arg0, int arg1, byte arg2, Object arg3) {
        field3894++;
        if (arg1 > this.field3895) {
            throw new IllegalStateException("s>cs");
        }
        this.method1740(arg2 ^ 0x14, arg0);
        this.field3889 -= arg1;
        while (this.field3889 < 0) {
            class616 var6 = (class616) this.field3904.method3510(-37);
            this.method1731(var6, true);
        }
        if (arg2 != 20) {
            this.field3904 = null;
        }
        class117 var5 = new class117(arg0, arg3, arg1);
        this.field3903.method2278((byte) -118, arg0.method52((byte) 31), var5);
        this.field3904.method3505(var5, 4);
        var5.field6154 = 0L;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 55)
    public static void method1733(byte arg0) {
        field3907 = null;
        if (arg0 != 18) {
            field3907 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B[IIII[IIZII[I[I[III[[[BIZ)V", line = 70)
    public static final void method1734(byte arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, boolean arg7, int arg8, int arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, byte[][][] arg15, int arg16, boolean arg17) {
        field3891++;
        if (class22.field234 == -1) {
            return;
        }
        int[] var18 = class502.field7152.method434();
        int var19 = var18[0];
        int var20 = var18[1];
        int var21 = var18[2];
        int var22 = var18[3];
        int var23 = var21;
        int var24 = var22;
        if (class22.field234 == 1) {
            var24 = (int) ((double) class164.field2604 * (double) var22 / (double) class589.field8349);
            var23 = (int) ((double) class164.field2604 * (double) var21 / (double) class589.field8349);
        }
        if (!class226.field3323) {
            if (class22.field234 == 1) {
                class258.method1685(50);
            }
            int var25 = arg6 - class742.field10406;
            int var26 = arg2 - class594.field8434;
            int var27 = arg4 - class13.field183;
            int var28 = (int) (((double) var27 * class267.field3829 + (double) var25 * class269.field3849 + (double) var26 * class25.field263) * (double) var23 / (double) arg3);
            int var29 = (int) (((double) var27 * class748.field10460 + (double) var25 * class327.field4667 + (double) var26 * class293.field4191) * (double) var24 / (double) arg3);
            double var30 = (double) var27 * class461.field6794 + (double) var25 * class611.field8638 + (double) var26 * class281.field3981;
            int var32 = class298.field4224 + var28 - class246.field3575;
            int var33 = class250.field3617 + var29 - class697.field9618;
            int var34 = class443.field6590 + var32;
            int var35 = class164.field2604 + var33;
            if (!(var32 < 0 || var33 < 0 || var34 > class519.field7421 || class589.field8349 < var35) || class22.field234 == 2) {
                if (class22.field234 == 2) {
                    class606.field8556 = -var30;
                }
                class210.field3078 = var32;
                class304.field4305 = var33;
            } else if (var34 > 0 && var35 > 0 && var32 < class519.field7421 && class589.field8349 > var33) {
                int var36 = var32 - class298.field4224;
                int var37 = var33 - class250.field3617;
                int var38 = 0;
                int var39 = 0;
                int var40 = 0;
                int var41 = 0;
                double var42 = 0.0D;
                if (class22.field234 == 0) {
                    var39 = var37;
                    var38 = var36;
                    var42 = class606.field8556 + var30;
                } else if (class22.field234 == 1) {
                    var40 = var36 / class634.field8902;
                    var41 = var37 / class437.field6477;
                    var39 = class437.field6477 * var41;
                    var38 = class634.field8902 * var40;
                    var42 = (class606.field8556 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 + var37 * var37);
                }
                double var44 = -var42;
                int var46 = 0;
                int var47 = 0;
                int var48 = 0;
                int var49 = 0;
                int var50 = 0;
                int var51 = 0;
                int var52;
                int var53;
                int var54;
                int var55;
                if (var38 >= 0) {
                    var52 = 0;
                    var53 = class519.field7421 - var38;
                    var54 = var38;
                    if (class22.field234 == 1) {
                        var50 = var40;
                        var48 = class73.field1021 - var40;
                    }
                    var55 = var53;
                } else {
                    var52 = -var38;
                    var53 = class519.field7421 + var38;
                    var55 = 0;
                    var54 = var52;
                    if (class22.field234 == 1) {
                        var48 = 0;
                        var50 = -var40;
                    }
                }
                int var56;
                int var57;
                int var58;
                int var59;
                int var60;
                int var61;
                if (var39 >= 0) {
                    var56 = 0;
                    var57 = class589.field8349 - var39;
                    var58 = var57;
                    if (class22.field234 == 1) {
                        var49 = 0;
                        var46 = class627.field8770 - var41;
                        var47 = var41;
                        var51 = var46;
                    }
                    var59 = 0;
                    var60 = var57;
                    var61 = var39;
                } else {
                    var57 = class589.field8349 + var39;
                    var58 = 0;
                    var56 = -var39;
                    var61 = var56;
                    var59 = var56;
                    if (class22.field234 == 1) {
                        var46 = 0;
                        var47 = -var41;
                        var51 = class627.field8770 + var41;
                        var49 = var47;
                    }
                    var60 = var57;
                }
                class243 var62 = class547.field7814.field1682;
                for (class187 var63 = (class187) var62.method1615((byte) 56); var63 != null; var63 = (class187) var62.method1625(-103)) {
                    class102[] var69 = var63.field2851;
                    boolean var70 = true;
                    for (int var71 = 0; var71 < var69.length; var71++) {
                        class102 var72 = var69[var71];
                        int var73 = var72.field1432;
                        int var74 = var72.field1431;
                        int var75 = var72.field1433;
                        int var76 = var72.field1434;
                        int var77 = var72.field1429;
                        int var78;
                        var72.field1433 = var78 = var75 - var38;
                        int var79;
                        var72.field1432 = var79 = var73 - var38;
                        int var80;
                        var72.field1431 = var80 = var74 - var39;
                        int var81;
                        var72.field1434 = var81 = var76 - var39;
                        if (var70) {
                            int var82 = (var79 >= var78 ? var78 : var79) - var77;
                            if (class519.field7421 >= var82) {
                                int var83 = (var81 <= var80 ? var81 : var80) - var77;
                                if (class589.field8349 >= var83) {
                                    int var84 = var77 + (var79 >= var78 ? var79 : var78);
                                    if (var84 >= 0) {
                                        int var85 = (var80 < var81 ? var81 : var80) + var77;
                                        if (var85 >= 0) {
                                            var70 = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var70) {
                        var63.method385((byte) -87);
                        class387.method2494(2780, var63);
                    }
                }
                if (class22.field234 == 0) {
                    class502.field7152.method452(class753.field10520);
                }
                class502.field7152.method430(-var38, -var39);
                class502.field7152.method424(var52, var56, var53, var57, var44);
                class331.method2094(~arg13, class606.field8556 + var44);
                class108.field1507 = class606.field8556 + var44;
                if (class22.field234 == 1) {
                    class92.field1280 = var24;
                    class80.field1130 = var19 - class246.field3575 - var38;
                    class371.field5330 = var23;
                    class246.field3578 = var20 - (class697.field9618 + var39);
                    class502.field7152.method500(class80.field1130, class246.field3578, class371.field5330, class92.field1280);
                } else {
                    class80.field1130 = var19 + class298.field4224 - class246.field3575 - var38;
                    class371.field5330 = var23;
                    class246.field3578 = class250.field3617 + var20 - class697.field9618 - var39;
                    class92.field1280 = var24;
                    class502.field7152.method500(class80.field1130, class246.field3578, class371.field5330, class92.field1280);
                }
                class448.method2765(class547.field7814);
                if (var61 > 0) {
                    class502.field7152.method476(0, var58, class519.field7421, var58 + var61);
                    class502.field7152.method444();
                    class502.field7152.method502(class332.field4765);
                    class142.method987(arg16, arg6, arg2, arg4, arg15, arg1, arg12, arg5, arg10, arg11, arg8, arg0, arg14, arg9, arg17, arg7, arg3, 1, false);
                }
                if (var54 > 0) {
                    class502.field7152.method476(var55, var59, var54 + var55, var59 - -var60);
                    class502.field7152.method444();
                    class502.field7152.method502(class332.field4765);
                    class142.method987(arg16, arg6, arg2, arg4, arg15, arg1, arg12, arg5, arg10, arg11, arg8, arg0, arg14, arg9, arg17, arg7, arg3, 1, false);
                }
                class502.field7152.method469();
                class466.method2827();
                if (class22.field234 == 0) {
                    class502.field7152.method538();
                }
                class606.field8556 += var44;
                class697.field9618 += var39;
                class246.field3575 += var38;
                class210.field3078 = class298.field4224 + var28 - class246.field3575;
                class304.field4305 = class250.field3617 + var29 - class697.field9618;
                if (class22.field234 == 1) {
                    class672.field9372 += var40;
                    class386.field5833 += var41;
                    for (int var64 = 0; var64 < class627.field8770; var64++) {
                        int var65 = class291.method1859(class627.field8770, (byte) -97, class386.field5833 + var64) * class73.field1021;
                        for (int var66 = 0; var66 < class73.field1021; var66++) {
                            int var67 = class291.method1859(class73.field1021, (byte) -97, var66 + class672.field9372) + var65;
                            boolean var68 = var64 >= var46 && var64 < (var46 + var47) || var49 <= var64 && var64 < var49 + var51 && var66 >= var48 && (var48 + var50) > var66;
                            class302.field4293[var67].method1372(class634.field8902 * var66, class437.field6477 * var64, class634.field8902, class437.field6477, 0, 0, var68, true);
                        }
                    }
                }
            } else {
                class226.field3323 = true;
            }
        }
        if (class226.field3323) {
            class210.field3078 = class298.field4224;
            class246.field3575 = 0;
            class13.field183 = arg4;
            class594.field8434 = arg2;
            class742.field10406 = arg6;
            class304.field4305 = class250.field3617;
            class697.field9618 = 0;
            class606.field8556 = 0.0D;
            if (class22.field234 == 0) {
                class502.field7152.method452(class753.field10520);
            }
            class502.field7152.method469();
            class502.field7152.method444();
            class502.field7152.method502(class332.field4765);
            class234.field3411.method775(class742.field10406, class594.field8434, class13.field183, class679.field9433, class188.field2861, class209.field3067);
            class502.field7152.method534(class234.field3411);
            if (class22.field234 == 1) {
                class246.field3578 = var20;
                class371.field5330 = var23;
                class92.field1280 = var24;
                class80.field1130 = var19;
                class502.field7152.method500(class80.field1130, class246.field3578, class371.field5330, class92.field1280);
            } else {
                class80.field1130 = class298.field4224 + var19;
                class92.field1280 = var24;
                class246.field3578 = class250.field3617 + var20;
                class371.field5330 = var23;
                class502.field7152.method500(class80.field1130, class246.field3578, class371.field5330, class92.field1280);
            }
            class108.field1507 = 0.0D;
            class547.field7814.method893((byte) -93);
            class448.method2765(class547.field7814);
            class142.method987(arg16, arg6, arg2, arg4, arg15, arg1, arg12, arg5, arg10, arg11, arg8, arg0, arg14, arg9, arg17, arg7, arg3, 1, false);
            class466.method2827();
            class226.field3323 = false;
            if (class22.field234 == 0) {
                class502.field7152.method538();
            }
            if (class22.field234 == 1) {
                class451.method2769(true);
            }
        }
        if (class22.field234 == 0) {
            class753.field10520.method1371(class210.field3078, class304.field4305, class443.field6590, class164.field2604, 0, 0, true, true);
        }
        class271.field3871++;
        class331.method2094(~arg13, class606.field8556);
        class659.field9225 = class606.field8556;
        if (~class22.field234 == arg13 || class22.field234 == 2) {
            if (class22.field234 == 2) {
                class502.field7152.method502(class332.field4765);
                class502.field7152.method444();
            }
            class642.field9013 = var24;
            class289.field4126 = var20 - (class697.field9618 - class250.field3617) - class304.field4305;
            class186.field2846 = var23;
            class489.field6993 = var19 + class298.field4224 - class246.field3575 - class210.field3078;
            class502.field7152.method500(class489.field6993, class289.field4126, class186.field2846, class642.field9013);
        } else if (class22.field234 == 1) {
            class289.field4126 = var20 - class697.field9618;
            class489.field6993 = var19 - class246.field3575;
            class186.field2846 = var23;
            class642.field9013 = var24;
            class502.field7152.method500(class489.field6993, class289.field4126, class186.field2846, class642.field9013);
            class502.field7152.method476(class210.field3078, class304.field4305, class210.field3078 + class443.field6590, class304.field4305 + class164.field2604);
        }
        class142.method987(arg16, arg6, arg2, arg4, arg15, arg1, arg12, arg5, arg10, arg11, arg8, arg0, arg14, arg9, arg17, arg7, arg3, class22.field234 == 2 ? 0 : 2, class22.field234 == 1);
        class502.field7152.method469();
        class502.field7152.method500(var19, var20, var21, var22);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I", line = 509)
    public final int method1735(int arg0) {
        if (arg0 != 0) {
            method1734((byte) 110, null, -55, -66, -92, null, 80, false, -49, 113, null, null, null, -8, -56, null, 36, true);
        }
        field3900++;
        return this.field3895;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V", line = 522)
    public final void method1736(int arg0) {
        if (arg0 <= -23) {
            this.field3904.method3503(-16);
            field3902++;
            this.field3903.method2289(1393);
            this.field3889 = this.field3895;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILvm;Ljava/lang/Object;)V", line = 539)
    public final void method1737(int arg0, class688 arg1, Object arg2) {
        this.method1732(arg1, 1, (byte) 20, arg2);
        int var4 = -8 % ((arg0 + 11) / 48);
        field3899++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lvm;I)Ljava/lang/Object;", line = 549)
    public final Object method1738(class688 arg0, int arg1) {
        field3890++;
        long var3 = arg0.method52((byte) 31);
        for (class616 var5 = (class616) this.field3903.method2287(var3, (byte) -117); var5 != null; var5 = (class616) this.field3903.method2280(true)) {
            if (var5.field8672.method50(-6508, arg0)) {
                Object var6 = var5.method35((byte) 88);
                if (var6 != null) {
                    if (var5.method36(false)) {
                        class117 var7 = new class117(arg0, var6, var5.field8671);
                        this.field3903.method2278((byte) -47, var5.field2810, var7);
                        this.field3904.method3505(var7, 4);
                        var7.field6154 = 0L;
                        var5.method1304((byte) 7);
                        var5.method2597(85);
                    } else {
                        this.field3904.method3505(var5, 4);
                        var5.field6154 = 0L;
                    }
                    return var6;
                }
                var5.method1304((byte) 7);
                var5.method2597(104);
                this.field3889 += var5.field8671;
            }
        }
        if (arg1 <= 93) {
            field3907 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V", line = 601)
    public final void method1739(byte arg0) {
        for (class616 var2 = (class616) this.field3904.method3508(-2); var2 != null; var2 = (class616) this.field3904.method3507(-107)) {
            if (var2.method36(false)) {
                var2.method1304((byte) 7);
                var2.method2597(arg0 + 18);
                this.field3889 += var2.field8671;
            }
        }
        field3897++;
        if (arg0 != 89) {
            this.method1732(null, -71, (byte) -85, null);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILvm;)V", line = 629)
    private final void method1740(int arg0, class688 arg1) {
        field3892++;
        long var3 = arg1.method52((byte) 31);
        for (class616 var5 = (class616) this.field3903.method2287(var3, (byte) -117); var5 != null; var5 = (class616) this.field3903.method2280(true)) {
            if (var5.field8672.method50(-6508, arg1)) {
                this.method1731(var5, true);
                break;
            }
        }
        if (arg0 != 0) {
            this.field3903 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)I", line = 657)
    public final int method1741(boolean arg0) {
        field3896++;
        if (!arg0) {
            this.field3904 = null;
        }
        return this.field3889;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V", line = 673)
    public static final void method1742(int arg0, byte arg1) {
        if (arg1 != 108) {
            field3893 = -18;
        }
        field3905++;
        class150 var2 = class676.method3885(1000, 16, arg0);
        var2.method1115(true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lrg;B)V", line = 688)
    public static final void method1743(class645 arg0, byte arg1) {
        field3906++;
        if (arg1 != 34) {
            return;
        }
        byte[] var2 = new byte[24];
        if (class73.field1020 != null) {
            try {
                class73.field1020.method3417(109, 0L);
                class73.field1020.method3414(var2, (byte) 37);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method3703(0, var2, 24, 128);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V", line = 733)
    public final void method1744(int arg0, int arg1) {
        if (class576.field8151 != null) {
            for (class616 var3 = (class616) this.field3904.method3508(-2); var3 != null; var3 = (class616) this.field3904.method3507(-58)) {
                if (var3.method36(false)) {
                    if (var3.method35((byte) 88) == null) {
                        var3.method1304((byte) 7);
                        var3.method2597(-128);
                        this.field3889 += var3.field8671;
                    }
                } else if ((long) arg1 < ++var3.field6154) {
                    class616 var4 = class576.field8151.method3836(116, var3);
                    this.field3903.method2278((byte) -40, var3.field2810, var4);
                    class386.method2488(true, var4, var3);
                    var3.method1304((byte) 7);
                    var3.method2597(123);
                }
            }
        }
        field3898++;
        if (arg0 != 0) {
            this.method1739((byte) 47);
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V", line = 782)
    public class274(int arg0) {
        this.field3895 = arg0;
        this.field3889 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field3903 = new class372(var2);
    }
}
