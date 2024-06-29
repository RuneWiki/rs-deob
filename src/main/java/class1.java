import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class402 {

    @OriginalMember(owner = "client!us", name = "Q", descriptor = "I")
    private int field22 = 0;

    @OriginalMember(owner = "client!us", name = "W", descriptor = "I")
    private int field28 = -1;

    @OriginalMember(owner = "client!us", name = "hb", descriptor = "I")
    private int field39 = -32768;

    @OriginalMember(owner = "client!us", name = "ib", descriptor = "I")
    private int field40 = 0;

    @OriginalMember(owner = "client!us", name = "V", descriptor = "Z")
    private boolean field27 = false;

    @OriginalMember(owner = "client!us", name = "gb", descriptor = "I")
    private int field38;

    @OriginalMember(owner = "client!us", name = "J", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "client!us", name = "u", descriptor = "I")
    public int field1;

    @OriginalMember(owner = "client!us", name = "x", descriptor = "I")
    private int field4;

    @OriginalMember(owner = "client!us", name = "y", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!us", name = "T", descriptor = "I")
    private int field25;

    @OriginalMember(owner = "client!us", name = "U", descriptor = "I")
    private int field26;

    @OriginalMember(owner = "client!us", name = "Z", descriptor = "Z")
    private boolean field31;

    @OriginalMember(owner = "client!us", name = "R", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "client!us", name = "v", descriptor = "Ljv;")
    private class57 field2;

    @OriginalMember(owner = "client!us", name = "ab", descriptor = "Z")
    public static boolean field32 = false;

    @OriginalMember(owner = "client!us", name = "ob", descriptor = "Z")
    public static boolean field46;

    @OriginalMember(owner = "client!us", name = "qb", descriptor = "[[I")
    public static int[][] field48;

    @OriginalMember(owner = "client!us", name = "rb", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!us", name = "pb", descriptor = "Ls;")
    public static class186 field47;

    @OriginalMember(owner = "client!us", name = "D", descriptor = "D")
    private double field10;

    @OriginalMember(owner = "client!us", name = "G", descriptor = "D")
    private double field12;

    @OriginalMember(owner = "client!us", name = "Y", descriptor = "D")
    private double field30;

    @OriginalMember(owner = "client!us", name = "cb", descriptor = "D")
    private double field34;

    @OriginalMember(owner = "client!us", name = "eb", descriptor = "D")
    private double field36;

    @OriginalMember(owner = "client!us", name = "fb", descriptor = "D")
    private double field37;

    @OriginalMember(owner = "client!us", name = "mb", descriptor = "D")
    private double field44;

    @OriginalMember(owner = "client!us", name = "A", descriptor = "D")
    private double field7;

    @OriginalMember(owner = "client!us", name = "kb", descriptor = "F")
    public static float field42;

    @OriginalMember(owner = "client!us", name = "H", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!us", name = "I", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!us", name = "K", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!us", name = "L", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!us", name = "M", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!us", name = "N", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!us", name = "O", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!us", name = "P", descriptor = "I")
    private int field21;

    @OriginalMember(owner = "client!us", name = "S", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!us", name = "X", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!us", name = "w", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "bb", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!us", name = "db", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!us", name = "jb", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!us", name = "lb", descriptor = "I")
    private int field43;

    @OriginalMember(owner = "client!us", name = "nb", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!us", name = "z", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!us", name = "B", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!us", name = "C", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!us", name = "E", descriptor = "Loi;")
    private class53 field11;

    // $FF: synthetic field
    @OriginalMember(owner = "client!us", name = "sb", descriptor = "Ljava/lang/Class;")
    public static Class field50;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIII)V")
    public final void method1(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field27) {
            double var6 = (double) (arg0 - super.field6073);
            double var8 = (double) (arg1 - super.field6078);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field10 = (double) this.field26 * var6 / var10 + (double) super.field6073;
            this.field37 = (double) this.field26 * var8 / var10 + (double) super.field6078;
            if (this.field31) {
                this.field36 = (double) (class483.method2899(super.field6084, (int) this.field10, (int) this.field37, false) - this.field25);
            } else {
                this.field36 = (double) super.field6083;
            }
        }
        ++field3;
        if (arg4 != -4) {
            method13(-58, (byte[]) null, 94, 11);
        }
        double var12 = (double) (-arg3 + this.field5 + 1);
        this.field44 = ((double) arg0 + -this.field10) / var12;
        this.field7 = ((double) arg1 - this.field37) / var12;
        this.field30 = Math.sqrt(this.field7 * this.field7 + this.field44 * this.field44);
        if (~this.field4 == 0) {
            this.field34 = ((double) arg2 - this.field36) / var12;
        } else {
            if (!this.field27) {
                this.field34 = -this.field30 * Math.tan((double) this.field4 * 0.02454369D);
            }
            this.field12 = ((double) arg2 - this.field36 + -(this.field34 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
    public class1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, -arg4 + class483.method2899(arg1, arg2, arg3, false), arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field38 = arg0;
        this.field15 = arg9;
        this.field1 = arg10;
        this.field4 = arg7;
        this.field5 = arg6;
        this.field25 = arg4;
        this.field27 = false;
        this.field26 = arg8;
        this.field31 = arg11;
        this.field23 = arg5;
        int var13 = class514.field7469.method595(-12186, this.field38).field7734;
        if (var13 != -1) {
            this.field2 = class422.field6355.method236(var13, (byte) -80);
        } else {
            this.field2 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(B)V")
    public final void method2(byte arg0) {
        if (this.field11 != null) {
            this.field11.method499();
        }
        ++field14;
        if (arg0 != -66) {
            method13(-23, (byte[]) null, 102, -77);
        }
    }

    @OriginalMember(owner = "client!us", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field11 != null) {
            this.field11.method499();
        }
        ++field20;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BILza;)Z")
    public static final boolean method3(byte arg0, int arg1, class288 arg2) {
        ++field16;
        int var3 = (class339.field5099 + -104) / 2;
        int var4 = (class484.field7129 + -104) / 2;
        boolean var5 = true;
        if (arg0 >= -44) {
            return true;
        } else {
            for (int var6 = var3; ~var6 > ~(var3 + 104); ++var6) {
                for (int var51 = var4; ~var51 > ~(var4 - -104); ++var51) {
                    for (int var52 = arg1; ~var52 >= -4; ++var52) {
                        if (class377.method2314(var52, arg1, var51, var6, false)) {
                            int var53 = var52;
                            if (class304.method1941(var51, var6, 1)) {
                                var53 = var52 - 1;
                            }
                            if (~var53 <= -1) {
                                var5 &= class510.method3056(var53, false, var51, var6);
                            }
                        }
                    }
                }
            }
            if (!var5) {
                return false;
            } else {
                int[] var7 = new int[262144];
                for (int var8 = 0; ~var8 > ~var7.length; ++var8) {
                    var7[var8] = -16777216;
                }
                class88.field1792 = arg2.method335(var7, 0, 512, 512, 512);
                class242.method1579((byte) -122);
                int var9 = -16777216 | (-10 + (int) (20.0D * Math.random()) + 238 << 8) + (238 - -((int) (Math.random() * 20.0D)) - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
                int var10 = -16777216 | -10 + (int) (20.0D * Math.random()) + 238 << 16;
                int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (8.0D * Math.random()) << 8 | (int) (8.0D * Math.random());
                boolean[][] var12 = new boolean[class136.field2290][class136.field2290];
                for (int var13 = var3; ~(var3 + 104) < ~var13; var13 += class136.field2290) {
                    for (int var36 = var4; ~var36 > ~(var4 + 104); var36 += class136.field2290) {
                        arg2.method371(0, 0, class136.field2290 * 4, class136.field2290 * 4);
                        arg2.method294(-16777216);
                        for (int var37 = arg1; ~var37 >= -4; ++var37) {
                            for (int var44 = 0; var44 < class136.field2290; ++var44) {
                                for (int var50 = 0; class136.field2290 > var50; ++var50) {
                                    var12[var44][var50] = class377.method2314(var37, arg1, var36 + var50, var13 + var44, false);
                                }
                            }
                            class531.field7727[var37].method184(0, 0, 1024, var13, var36, var13 - -class136.field2290, var36 - -class136.field2290, var12);
                            if (!class105.field1965) {
                                for (int var45 = -4; class136.field2290 > var45; ++var45) {
                                    for (int var46 = -4; ~class136.field2290 < ~var46; ++var46) {
                                        int var47 = var13 + var45;
                                        int var48 = var36 + var46;
                                        if (~var47 <= ~var3 && var48 >= var4 && class377.method2314(var37, arg1, var48, var47, false)) {
                                            int var49 = var37;
                                            if (class304.method1941(var48, var47, 1)) {
                                                var49 = var37 - 1;
                                            }
                                            if (~var49 <= -1) {
                                                class196.method1319(-3, var48, var10, var9, arg2, var49, (-var46 + class136.field2290) * 4 + -4, var47, var45 * 4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (class105.field1965) {
                            class63 var38 = class67.field1367[arg1];
                            for (int var39 = 0; var39 < class136.field2290; ++var39) {
                                for (int var40 = 0; class136.field2290 > var40; ++var40) {
                                    int var41 = var13 - -var39;
                                    int var42 = var36 + var40;
                                    int var43 = var38.field1283[-var38.field1301 + var41][-var38.field1286 + var42];
                                    if ((var43 & 1076101120) == 0) {
                                        if (~(8388608 & var43) != -1) {
                                            arg2.method1810(4, -1713569622, (byte) -45, (-var40 + class136.field2290) * 4 + -4, var39 * 4);
                                        } else if ((var43 & 33554432) == 0) {
                                            if ((134217728 & var43) == 0) {
                                                if (~(var43 & 536870912) != -1) {
                                                    arg2.method1804(117, 4, var39 * 4, (-var40 + class136.field2290) * 4 + -4, -1713569622);
                                                }
                                            } else {
                                                arg2.method1810(4, -1713569622, (byte) -116, (-var40 + class136.field2290) * 4 + -1, var39 * 4);
                                            }
                                        } else {
                                            arg2.method1804(124, 4, var39 * 4 + 3, (-var40 + class136.field2290) * 4 - 4, -1713569622);
                                        }
                                    } else {
                                        arg2.method1809((class136.field2290 - var40) * 4 + -4, var39 * 4, -1713569622, 4, 4, -7456);
                                    }
                                }
                            }
                        }
                        arg2.method327(0, 0, class136.field2290 * 4, class136.field2290 * 4, var11, 2);
                        class88.field1792.method150((var13 - var3) * 4 + 48, -(class136.field2290 * 4) + 464 + -((-var4 + var36) * 4), class136.field2290 * 4, class136.field2290 * 4, 0, 0);
                    }
                }
                arg2.method321();
                arg2.method294(-16777215);
                class102.method895(0);
                class50.field1000 = 0;
                class373.field5471.method1891(-3);
                if (!class105.field1965) {
                    for (int var14 = var3; ~(var3 + 104) < ~var14; ++var14) {
                        for (int var20 = var4; ~(var4 - -104) < ~var20; ++var20) {
                            for (int var21 = arg1; ~var21 >= ~(arg1 + 1) && ~var21 >= -4; ++var21) {
                                if (class377.method2314(var21, arg1, var20, var14, false)) {
                                    class425 var22 = (class425) class296.method1911(var21, var14, var20);
                                    if (var22 == null) {
                                        var22 = (class425) class479.method2859(var21, var14, var20, field50 != null ? field50 : (field50 = method20("rj")));
                                    }
                                    if (var22 == null) {
                                        var22 = (class425) class211.method1435(var21, var14, var20);
                                    }
                                    if (var22 == null) {
                                        var22 = (class425) class498.method3008(var21, var14, var20);
                                    }
                                    if (var22 != null) {
                                        class306 var23 = class123.field2142.method1530((byte) -121, var22.method224(-10848));
                                        if (!var23.field4647 || class7.field110) {
                                            int var24 = var23.field4615;
                                            if (var23.field4593 != null) {
                                                for (int var25 = 0; var25 < var23.field4593.length; ++var25) {
                                                    if (var23.field4593[var25] != -1) {
                                                        class306 var26 = class123.field2142.method1530((byte) -15, var23.field4593[var25]);
                                                        if (~var26.field4615 <= -1) {
                                                            var24 = var26.field4615;
                                                        }
                                                    }
                                                }
                                            }
                                            if (~var24 <= -1) {
                                                boolean var27 = false;
                                                if (~var24 <= -1) {
                                                    class25 var28 = class309.field4682.method1247(false, var24);
                                                    if (var28 != null && var28.field353) {
                                                        var27 = true;
                                                    }
                                                }
                                                int var29 = var14;
                                                int var30 = var20;
                                                if (var27) {
                                                    int[][] var31 = class67.field1367[var21].field1283;
                                                    int var32 = class67.field1367[var21].field1301;
                                                    int var33 = class67.field1367[var21].field1286;
                                                    for (int var34 = 0; ~var34 > -11; ++var34) {
                                                        int var35 = (int) (Math.random() * 4.0D);
                                                        if (~var35 == -1 && ~var3 > ~var29 && ~(var14 + -3) > ~var29 && (var31[var29 + -1 + -var32][-var33 + var30] & 2883848) == 0) {
                                                            --var29;
                                                        }
                                                        if (~var35 == -2 && ~(var3 + -1 + 104) < ~var29 && var29 < var14 + 3 && (2883968 & var31[-var32 + 1 + var29][var30 - var33]) == 0) {
                                                            ++var29;
                                                        }
                                                        if (var35 == 2 && ~var30 < ~var4 && ~(var20 + -3) > ~var30 && ~(var31[-var32 + var29][var30 + -1 + -var33] & 2883842) == -1) {
                                                            --var30;
                                                        }
                                                        if (var35 == 3 && var30 < var4 + -1 + 104 && ~(var20 + 3) < ~var30 && ~(var31[-var32 + var29][var30 + 1 + -var33] & 2883872) == -1) {
                                                            ++var30;
                                                        }
                                                    }
                                                }
                                                class517.field7505[class50.field1000] = var23.field4626;
                                                class341.field5129[class50.field1000] = var29;
                                                class436.field6493[class50.field1000] = var30;
                                                ++class50.field1000;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class256.field3933 != null) {
                        class249.field3845.field6834 = 1;
                        class309.field4682.method1249(64, -106, 1024);
                        for (int var15 = 0; ~class256.field3933.field5143 < ~var15; ++var15) {
                            int var16 = class256.field3933.field5149[var15];
                            if (var16 >> 28 == class15.field266.field6084) {
                                int var17 = (var16 >> 14 & 16383) - class496.field7292;
                                int var18 = (16383 & var16) + -class212.field3378;
                                if (~var17 <= -1 && class339.field5099 > var17 && ~var18 <= -1 && class484.field7129 > var18) {
                                    class373.field5471.method1885(false, new class100(var15));
                                } else {
                                    class25 var19 = class309.field4682.method1247(false, class256.field3933.field5148[var15]);
                                    if (var19.field371 != null && ~(var19.field377 + var17) <= -1 && ~(var19.field365 + var17) > ~class339.field5099 && var18 - -var19.field367 >= 0 && ~(var19.field369 + var18) > ~class484.field7129) {
                                        class373.field5471.method1885(false, new class100(var15));
                                    }
                                }
                            }
                        }
                        class309.field4682.method1249(64, -114, 128);
                        class249.field3845.field6834 = 2;
                        class249.field3845.method2742(0);
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
    public static void method4(int arg0) {
        field47 = null;
        field48 = null;
        if (arg0 != 0) {
            method4(123);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IILza;)Le;")
    private final class374 method5(int arg0, int arg1, class288 arg2) {
        ++field8;
        if (arg0 != 4157) {
            field32 = false;
        }
        class533 var4 = class514.field7469.method595(arg0 + -16343, this.field38);
        return var4.method3143(this.field28, class422.field6355, (byte) 110, arg1, this.field40, this.field22, arg2);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Le;Lza;I)V")
    private final void method6(class374 arg0, class288 arg1, int arg2) {
        ++field13;
        class393[] var4 = arg0.method737();
        class13[] var5 = arg0.method720();
        if ((this.field11 == null || this.field11.field1131) && (var4 != null || var5 != null)) {
            this.field11 = new class53(class62.field1268);
        }
        if (this.field11 != null) {
            this.field11.method501(arg1, (long) class62.field1268, var4, var5, false);
            this.field11.method493(super.field6084, super.field6082, super.field6081, super.field6077, super.field6075);
        }
        if (arg2 != 16383) {
            this.field21 = -79;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lqi;)V")
    public static final void method7(class402 arg0) {
        for (int var1 = arg0.field6082; var1 <= arg0.field6081; ++var1) {
            for (int var2 = arg0.field6077; var2 <= arg0.field6075; ++var2) {
                class234 var3 = class518.field7511[arg0.field6084][var1][var2];
                if (var3 != null) {
                    class440 var4 = var3.field3607;
                    class440 var5 = null;
                    while (var4 != null) {
                        if (var4.field6530 == arg0) {
                            if (var5 != null) {
                                var5.field6528 = var4.field6528;
                            } else {
                                var3.field3607 = var4.field6528;
                            }
                            var4.method2623((byte) 49);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field6528;
                    }
                    var3.field3608 = 0;
                    for (class440 var6 = var3.field3607; var6 != null; var6 = var6.field6528) {
                        var3.field3608 = (byte) (var3.field3608 | var6.field6526);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "h", descriptor = "(I)I")
    public final int method8(int arg0) {
        ++field33;
        if (arg0 != 0) {
            this.field44 = -0.20808133600566914D;
        }
        return this.field39;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BLza;)V")
    public final void method9(byte arg0, class288 arg1) {
        ++field45;
        class374 var3 = this.method5(4157, 0, arg1);
        if (arg0 >= -98) {
            this.method6((class374) null, (class288) null, 95);
        }
        if (var3 != null) {
            class124 var4 = arg1.method364();
            var4.method838(this.field21);
            var4.method826(this.field43);
            var4.method834((int) this.field10, (int) this.field36, (int) this.field37);
            this.field39 = var3.method736();
            this.method6(var3, arg1, 16383);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Li;III[Z)Z")
    public static final boolean method10(class31 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class520.field7560 != class293.field4481) {
            int var6 = class531.field7727[arg1].method186(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class38 var8 = class531.field7727[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method186(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method182(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method180(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!us", name = "i", descriptor = "(I)V")
    public final void method11(int arg0) {
        ++field35;
        super.field6082 = super.field6081 = (short) ((int) (this.field10 / 128.0D));
        if (arg0 <= 55) {
            this.field2 = null;
        }
        super.field6077 = super.field6075 = (short) ((int) (this.field37 / 128.0D));
    }

    @OriginalMember(owner = "client!us", name = "f", descriptor = "(I)V")
    public final void method12(int arg0) {
        int var2 = 56 % ((-35 - arg0) / 44);
        ++field18;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I[BII)I")
    public static final int method13(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field29;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg2; ++var5) {
            var4 = class466.field6925[(var4 ^ arg1[var5]) & 255] ^ var4 >>> 8;
        }
        int var6 = -51 % (-arg3 / 61);
        return ~var4;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZLza;II)Z")
    public final boolean method14(boolean arg0, class288 arg1, int arg2, int arg3) {
        if (arg0) {
            method3((byte) 90, -76, (class288) null);
        }
        ++field9;
        return false;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(Lza;I)Lnd;")
    public final class385 method15(class288 arg0, int arg1) {
        ++field17;
        class374 var3 = this.method5(4157, 2048, arg0);
        if (var3 == null) {
            return null;
        } else {
            class124 var4 = arg0.method364();
            var4.method838(this.field21);
            if (arg1 != 2) {
                this.field12 = 0.19770953235598324D;
            }
            var4.method826(this.field43);
            var4.method834((int) this.field10, (int) this.field36, (int) this.field37);
            if (this.field11 != null) {
                class502 var5 = this.field11.method490();
                arg0.method298(var3, var5, var4, (class313) null, 0);
            } else {
                var3.method723(var4, (class313) null, 0);
            }
            this.field39 = var3.method736();
            this.method6(var3, arg0, 16383);
            return null;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(II)Z")
    public static final boolean method16(int arg0, int arg1) {
        ++field6;
        if (class182.field2935[arg0]) {
            return true;
        } else if (!class458.field6783.method2744(20560, arg0)) {
            return false;
        } else if (arg1 != 1465669104) {
            return false;
        } else {
            int var2 = class458.field6783.method2763(arg0, arg1 ^ -1465669107);
            if (var2 == 0) {
                class182.field2935[arg0] = true;
                return true;
            } else {
                if (class419.field6326[arg0] == null) {
                    class419.field6326[arg0] = new class388[var2];
                }
                for (int var3 = 0; var3 < var2; ++var3) {
                    if (class419.field6326[arg0][var3] == null) {
                        byte[] var4 = class458.field6783.method2757(arg0, var3, (byte) -121);
                        if (var4 != null) {
                            class388 var5 = class419.field6326[arg0][var3] = new class388();
                            var5.field5700 = (arg0 << 16) + var3;
                            if (~var4[0] != 0) {
                                throw new IllegalStateException("if1");
                            }
                            var5.method2378(new class289(var4), (byte) -69);
                        }
                    }
                }
                class182.field2935[arg0] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(II)V")
    public final void method17(int arg0, int arg1) {
        this.field37 += (double) arg1 * this.field7;
        this.field10 += (double) arg1 * this.field44;
        if (arg0 != -16777215) {
            method4(119);
        }
        this.field27 = true;
        ++field19;
        if (this.field31) {
            this.field36 = (double) (class483.method2899(super.field6084, (int) this.field10, (int) this.field37, false) - this.field25);
        } else if (this.field4 != -1) {
            this.field36 += this.field12 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field34;
            this.field34 += (double) arg1 * this.field12;
        } else {
            this.field36 += (double) arg1 * this.field34;
        }
        this.field43 = 16383 & (int) (Math.atan2(this.field44, this.field7) * 2607.5945876176133D) - -8192;
        this.field21 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field34, this.field30));
        if (this.field2 != null) {
            this.field40 += arg1;
            while (true) {
                do {
                    do {
                        if (~this.field2.field1210[this.field22] <= ~this.field40) {
                            return;
                        }
                        this.field40 -= this.field2.field1210[this.field22];
                        ++this.field22;
                        if (this.field22 >= this.field2.field1202.length) {
                            this.field22 -= this.field2.field1215;
                            if (this.field22 < 0 || this.field2.field1202.length <= this.field22) {
                                this.field22 = 0;
                            }
                        }
                        this.field28 = this.field22 + 1;
                    } while (~this.field2.field1202.length < ~this.field28);
                    this.field28 -= this.field2.field1215;
                } while (this.field28 >= 0 && ~this.field28 > ~this.field2.field1202.length);
                this.field28 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IBILvs;Lza;ZI)V")
    public final void method18(int arg0, byte arg1, int arg2, class421 arg3, class288 arg4, boolean arg5, int arg6) {
        if (arg1 == 93) {
            ++field24;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)Z")
    public final boolean method19(byte arg0) {
        if (arg0 < 121) {
            return false;
        } else {
            ++field41;
            return false;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method20(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class309("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field46 = true;
        field48 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
        field49 = 0;
        field47 = new class186(43, -2);
    }
}
