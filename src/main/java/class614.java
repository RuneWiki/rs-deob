import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class614 extends class56 {

    @OriginalMember(owner = "client!jaa", name = "K", descriptor = "I")
    private int field8596 = 4;

    @OriginalMember(owner = "client!jaa", name = "L", descriptor = "I")
    private int field8597 = 4;

    @OriginalMember(owner = "client!jaa", name = "F", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field8591 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!jaa", name = "J", descriptor = "[[I")
    public static int[][] field8595 = new int[6][];

    @OriginalMember(owner = "client!jaa", name = "I", descriptor = "Ljava/lang/String;")
    public static String field8594 = null;

    @OriginalMember(owner = "client!jaa", name = "N", descriptor = "Lgda;")
    public static class53 field8599 = new class53(68, -1);

    @OriginalMember(owner = "client!jaa", name = "P", descriptor = "I")
    public static int field8601 = 0;

    @OriginalMember(owner = "client!jaa", name = "Q", descriptor = "Lbd;")
    public static class60 field8602 = new class60(11, 7);

    @OriginalMember(owner = "client!jaa", name = "D", descriptor = "I")
    public static int field8589;

    @OriginalMember(owner = "client!jaa", name = "E", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!jaa", name = "G", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!jaa", name = "H", descriptor = "I")
    public static int field8593;

    @OriginalMember(owner = "client!jaa", name = "M", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!jaa", name = "O", descriptor = "I")
    public static int field8600;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILee;I)V", line = 4)
    public final void method6(int arg0, class675 arg1, int arg2) {
        ++field8590;
        if (arg0 != 3731) {
            field8591 = null;
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field8597 = arg1.method3750((byte) 35);
            }
        } else {
            this.field8596 = arg1.method3750((byte) 35);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILha;IZIII)V", line = 43)
    public static final void method3434(int arg0, int arg1, class58 arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        ++field8600;
        arg2.method417(arg5, arg7, arg1, (byte) 95, arg6, arg0);
        if (!arg4) {
            field8595 = null;
        }
        arg2.method417(arg3, arg7 + 1, arg1 + 1, (byte) 122, 16, arg0 + -2);
        arg2.method393(arg1 + 18, arg3, arg6 + -19, arg0 + -2, 95, arg7 - -1);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IZ)[I", line = 56)
    public final int[] method24(int arg0, boolean arg1) {
        ++field8589;
        if (!arg1) {
            this.field8597 = 71;
        }
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (super.field673.field8073) {
            int var4 = class328.field4576 / this.field8596;
            int var5 = class226.field3050 / this.field8597;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method367(4463, 0, class226.field3050 * var6 / var5);
            } else {
                var7 = this.method367(4463, 0, 0);
            }
            for (int var8 = 0; ~class328.field4576 < ~var8; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class328.field4576 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V", line = 116)
    public static final void method3435(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class377.field5290 = true;
        class370.field5217 = class362.field5135.method404() > 0;
        class317.field4405 = arg15;
        class136.field1982 = arg1 >> class660.field9038;
        class481.field6801 = arg3 >> class660.field9038;
        class373.field5241 = arg1;
        class644.field8823 = arg3;
        class147.field2112 = arg2;
        class24.field338 = class136.field1982 - class453.field6405;
        if (class24.field338 < 0) {
            class542.field7577 = -class24.field338;
            class24.field338 = 0;
        } else {
            class542.field7577 = 0;
        }
        class513.field7322 = class481.field6801 - class453.field6405;
        if (class513.field7322 < 0) {
            class280.field3976 = -class513.field7322;
            class513.field7322 = 0;
        } else {
            class280.field3976 = 0;
        }
        class28.field373 = class453.field6405 + class136.field1982;
        if (class28.field373 > class492.field6939) {
            class28.field373 = class492.field6939;
        }
        class6.field76 = class481.field6801 + class453.field6405;
        if (class6.field76 > class365.field5171) {
            class6.field76 = class365.field5171;
        }
        boolean[][] var19 = class589.field8299;
        boolean[][] var20 = class178.field2384;
        if (class317.field4405) {
            for (int var21 = 0; var21 < class453.field6405 + class453.field6405 + 2; ++var21) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class453.field6405 + class453.field6405 + 2; ++var24) {
                    if (var24 > 1) {
                        class679.field9321[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class136.field1982 - class453.field6405 + var21;
                    int var26 = class481.field6801 - class453.field6405 + var24;
                    if (var25 >= 0 && var26 >= 0 && var25 < class492.field6939 && var26 < class365.field5171) {
                        int var27 = var25 << class660.field9038;
                        int var28 = var26 << class660.field9038;
                        int var29 = class588.field8292[class588.field8292.length - 1].method1816((byte) -36, var26, var25) - (1000 << class660.field9038 - 7);
                        int var30 = class135.field1969 != null ? class135.field1969[0].method1816((byte) 124, var26, var25) + class586.field8250 : class588.field8292[0].method1816((byte) -122, var26, var25) + class586.field8250;
                        var23 = arg16 >= 0 ? class362.field5135.method454(var27, var29, var28, var27, var30, var28, arg16) : class362.field5135.method442(var27, var29, var28, var27, var30, var28);
                        class178.field2384[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class178.field2384[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class679.field9321[var24 - 1] & class679.field9321[var24] & var22 & var23;
                        class589.field8299[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class679.field9321[class453.field6405 + class453.field6405] = var22;
                class679.field9321[class453.field6405 + class453.field6405 + 1] = var23;
            }
            if (arg16 >= 0) {
                class377.field5290 = false;
            } else {
                class492.field6938 = arg5;
                class125.field1520 = arg6;
                class125.field1517 = arg7;
                class227.field3057 = arg8;
                class491.field6933 = arg9;
                class242.method1548(arg10, 0, class362.field5135);
            }
        } else {
            if (class114.field1374 == null) {
                class114.field1374 = new boolean[class492.field6939 + class492.field6939 + 1][class492.field6939 + class365.field5171 + 1];
            }
            for (int var32 = 0; var32 < class114.field1374.length; ++var32) {
                for (int var42 = 0; var42 < class114.field1374[0].length; ++var42) {
                    class114.field1374[var32][var42] = true;
                }
            }
            class178.field2384 = class114.field1374;
            class589.field8299 = class114.field1374;
            class24.field338 = 0;
            class513.field7322 = 0;
            class28.field373 = class492.field6939;
            class6.field76 = class365.field5171;
            class377.field5290 = false;
        }
        class182.method1149(false, class362.field5135);
        if (!class471.field6690.field6598) {
            class360 var33 = class471.field6690.field6595;
            for (class387 var34 = (class387) var33.method2301(-31182); var34 != null; var34 = (class387) var33.method2310(43)) {
                var34.method3646((byte) -103);
                class266.method1739(0, var34);
            }
        }
        if (class370.field5217) {
            for (int var35 = 0; var35 < class101.field1208; ++var35) {
                class290.field4085[var35].method1562(arg14, 18223, arg0);
            }
        }
        if (class661.field9049) {
            class248.field3305 = class362.field5135.method395();
            class362.field5135.method398(class341.field4745);
            int var36 = (class341.field4745[2] - class341.field4745[0]) / class470.field6674;
            for (int var37 = 0; var37 < class470.field6674 - 1; ++var37) {
                class549.field7663[var37] = (var37 + 1) * var36 + class552.field7766[var37];
            }
            for (int var38 = 0; var38 < class682.field9362.length; ++var38) {
                class682.field9362[var38].method600();
            }
        }
        if (class480.field6790 != null) {
            if (class661.field9049) {
                class425.method2598(0);
            }
            class695.method3920(true);
            class362.field5135.method422(-1, 1583160, 40, 127);
            class409.method2528(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class661.field9049) {
                class657.method3605();
            }
            class362.field5135.method414();
            class695.method3920(false);
        }
        class409.method2528(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class661.field9049) {
            for (int var39 = 0; var39 < class634.field8744; ++var39) {
                class43.field527[var39] = class373.field5239[var39];
            }
            class425.method2598(0);
            for (int var40 = 0; var40 < class682.field9362.length; ++var40) {
                class682.field9362[var40].method600();
            }
        }
        if (class661.field9049) {
            class657.method3605();
            for (int var41 = 0; var41 < class634.field8744; ++var41) {
                class373.field5239[var41] = class43.field527[var41];
            }
            if (class679.field9327 == 2) {
                int var10002;
                if (class656.field8998[0] < class656.field8998[1]) {
                    if (class552.field7766[0] + class549.field7663[0] > class341.field4745[0]) {
                        var10002 = class552.field7766[0]++;
                    }
                } else if (class656.field8998[0] > class656.field8998[1] && class552.field7766[0] + class549.field7663[0] < class341.field4745[2]) {
                    var10002 = class552.field7766[0]--;
                }
            }
        }
        if (!class317.field4405) {
            class589.field8299 = var19;
            class178.field2384 = var20;
        }
        class418.method2566();
    }

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "(I)V", line = 402)
    public static final void method3436(int arg0) {
        ++field8593;
        if (class703.field9787 != null) {
            for (int var1 = 0; ~var1 > ~class703.field9787.length; ++var1) {
                for (int var2 = 0; class703.field9787[var1].length > var2; ++var2) {
                    class703.field9787[var1][var2] = class218.field2849;
                }
            }
        }
        int var3 = 84 / ((31 - arg0) / 39);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)V", line = 432)
    public static final void method3437(boolean arg0) {
        ++field8598;
        if (arg0) {
            method3437(true);
        }
        if (~class316.field4374.toLowerCase().indexOf("microsoft") != 0) {
            class124.field1505[188] = 71;
            class124.field1505[219] = 42;
            class124.field1505[222] = 59;
            class124.field1505[221] = 43;
            class124.field1505[220] = 74;
            class124.field1505[186] = 57;
            class124.field1505[189] = 26;
            class124.field1505[190] = 72;
            class124.field1505[192] = 58;
            class124.field1505[223] = 28;
            class124.field1505[187] = 27;
            class124.field1505[191] = 73;
        } else {
            class124.field1505[91] = 42;
            if (class316.field4390 != null) {
                class124.field1505[222] = 58;
                class124.field1505[192] = 28;
                class124.field1505[520] = 59;
            } else {
                class124.field1505[192] = 58;
                class124.field1505[222] = 59;
            }
            class124.field1505[46] = 72;
            class124.field1505[47] = 73;
            class124.field1505[44] = 71;
            class124.field1505[93] = 43;
            class124.field1505[61] = 27;
            class124.field1505[59] = 57;
            class124.field1505[92] = 74;
            class124.field1505[45] = 26;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "()V", line = 501)
    public class614() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Z)V", line = 485)
    public static void method3438(boolean arg0) {
        field8599 = null;
        field8595 = null;
        if (arg0) {
            field8591 = null;
            field8602 = null;
            field8594 = null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II)[[I", line = 507)
    public final int[][] method5(int arg0, int arg1) {
        ++field8592;
        int[][] var3 = super.field668.method3009(arg1 ^ arg1, arg0);
        if (super.field668.field7292) {
            int var4 = class328.field4576 / this.field8596;
            int var5 = class226.field3050 / this.field8597;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method369(0, 126, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method369(class226.field3050 * var7 / var5, 33, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class328.field4576; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class328.field4576 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }
}
