import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class324 extends class80 {

    @OriginalMember(owner = "client!vq", name = "O", descriptor = "Z")
    private boolean field4935 = true;

    @OriginalMember(owner = "client!vq", name = "Q", descriptor = "Z")
    private boolean field4937 = true;

    @OriginalMember(owner = "client!vq", name = "J", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!vq", name = "K", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!vq", name = "L", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!vq", name = "N", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!vq", name = "P", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!vq", name = "I", descriptor = "Lph;")
    public static class459 field4929;

    @OriginalMember(owner = "client!vq", name = "M", descriptor = "[Lmv;")
    public static class255[] field4933;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(B)V", line = 3)
    public static void method2064(byte arg0) {
        field4933 = null;
        if (arg0 == 124) {
            field4929 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(II)[[I", line = 14)
    public final int[][] method29(int arg0, int arg1) {
        ++field4930;
        int[][] var3 = super.field1589.method859(arg1, arg0 ^ 128);
        if (super.field1589.field1884) {
            int[][] var4 = this.method713(0, -58, this.field4937 ? -arg1 + class359.field5269 : arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field4935) {
                for (int var11 = 0; class137.field2308 > var11; ++var11) {
                    var8[var11] = var5[class308.field4672 - var11];
                    var9[var11] = var6[class308.field4672 - var11];
                    var10[var11] = var7[class308.field4672 - var11];
                }
            } else {
                for (int var12 = 0; ~class137.field2308 < ~var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        if (arg0 != 255) {
            this.method29(-77, 93);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "(II)V", line = 80)
    public static final void method2065(int arg0, int arg1) {
        ++field4932;
        if (arg1 != 4061) {
            field4929 = null;
        }
        class18 var2 = class140.method1047(7, arg0, false);
        var2.method123(20983);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILnn;)V", line = 93)
    public final void method26(int arg0, int arg1, class289 arg2) {
        ++field4936;
        int var4 = -97 % ((arg1 - 28) / 53);
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field1591 = arg2.method1858(-3256) == 1;
                }
            } else {
                this.field4937 = ~arg2.method1858(-3256) == -2;
            }
        } else {
            this.field4935 = arg2.method1858(-3256) == 1;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)[I", line = 136)
    public final int[] method25(int arg0, int arg1) {
        ++field4934;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (super.field1601.field124) {
            int[] var4 = this.method710(!this.field4937 ? arg0 : class359.field5269 - arg0, 0, (byte) 120);
            if (!this.field4935) {
                class394.method2447(var4, 0, var3, 0, class137.field2308);
            } else {
                for (int var5 = 0; var5 < class137.field2308; ++var5) {
                    var3[var5] = var4[-var5 + class308.field4672];
                }
            }
        }
        if (arg1 != -16828) {
            this.field4937 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[[[Lak;ZIZI)Z", line = 176)
    public static final boolean method2066(int arg0, class234[][][] arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        ++field4931;
        if (!arg4) {
            field4933 = null;
        }
        byte var6 = arg2 ? 1 : (byte) (255 & class184.field2958);
        if (class249.field3848[class211.field3371][arg5][arg0] == var6) {
            return false;
        } else if ((class22.field333[class211.field3371][arg5][arg0] & 4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class258.field3947[var7] = arg5;
            int var35 = var7 + 1;
            class339.field5107[var7] = arg0;
            class249.field3848[class211.field3371][arg5][arg0] = var6;
            while (var35 != var8) {
                int var9 = class258.field3947[var8] & 65535;
                int var10 = class258.field3947[var8] >> 16 & 255;
                int var11 = 255 & class258.field3947[var8] >> 24;
                int var12 = 65535 & class339.field5107[var8];
                int var13 = class339.field5107[var8] >> 16 & 255;
                var8 = var8 + 1 & 4095;
                boolean var14 = false;
                if ((class22.field333[class211.field3371][var9][var12] & 4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class211.field3371 + 1; var16 <= 3; ++var16) {
                    if (~(8 & class22.field333[var16][var9][var12]) == -1) {
                        if (var14 && arg1[var16][var9][var12] != null) {
                            if (arg1[var16][var9][var12].field3610 != null) {
                                int var20 = class533.method3142(var10, 822);
                                if (~arg1[var16][var9][var12].field3610.field1007 == ~var20 || arg1[var16][var9][var12].field3613 != null && arg1[var16][var9][var12].field3613.field1007 == var20) {
                                    continue;
                                }
                                if (~var11 != -1) {
                                    int var21 = class533.method3142(var11, 822);
                                    if (arg1[var16][var9][var12].field3610.field1007 == var21 || arg1[var16][var9][var12].field3613 != null && arg1[var16][var9][var12].field3613.field1007 == var21) {
                                        continue;
                                    }
                                }
                                if (~var13 != -1) {
                                    int var22 = class533.method3142(var13, 822);
                                    if (arg1[var16][var9][var12].field3610.field1007 == var22 || arg1[var16][var9][var12].field3613 != null && ~arg1[var16][var9][var12].field3613.field1007 == ~var22) {
                                        continue;
                                    }
                                }
                            }
                            class234 var23 = arg1[var16][var9][var12];
                            if (var23.field3607 != null) {
                                for (class440 var24 = var23.field3607; var24 != null; var24 = var24.field6528) {
                                    class402 var25 = var24.field6530;
                                    if (var25 instanceof class425) {
                                        class425 var26 = (class425) var25;
                                        int var27 = var26.method225(false);
                                        int var28 = var26.method231(23);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var28 << 6 | var27;
                                        if (~var10 == ~var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class234 var30 = arg1[var16][var9][var12];
                        if (var30 != null && var30.field3607 != null) {
                            for (class440 var31 = var30.field3607; var31 != null; var31 = var31.field6528) {
                                class402 var32 = var31.field6530;
                                if (~var32.field6082 != ~var32.field6081 || var32.field6077 != var32.field6075) {
                                    for (int var33 = var32.field6082; ~var33 >= ~var32.field6081; ++var33) {
                                        for (int var34 = var32.field6077; ~var32.field6075 <= ~var34; ++var34) {
                                            class249.field3848[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class249.field3848[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class520.field7560[class211.field3371 + 1].method177(var9, var12);
                    if (~class50.field1008[arg3] > ~var17) {
                        class50.field1008[arg3] = var17;
                    }
                    int var18 = var9 << 7;
                    int var19 = var12 << 7;
                    if (class321.field4904[arg3] > var18) {
                        class321.field4904[arg3] = var18;
                    } else if (var18 > class403.field6086[arg3]) {
                        class403.field6086[arg3] = var18;
                    }
                    if (class322.field4925[arg3] > var19) {
                        class322.field4925[arg3] = var19;
                    } else if (~var19 < ~class464.field6884[arg3]) {
                        class464.field6884[arg3] = var19;
                    }
                }
                if (!var14) {
                    if (~var9 <= -2 && ~class249.field3848[class211.field3371][var9 + -1][var12] != ~var6) {
                        class258.field3947[var35] = class418.method2558(class418.method2558(var9 + -1, 1179648), -754974720);
                        class339.field5107[var35] = class418.method2558(var12, 1245184);
                        class249.field3848[class211.field3371][var9 + -1][var12] = var6;
                        var35 = var35 - -1 & 4095;
                    }
                    ++var12;
                    if (~var12 > ~class484.field7129) {
                        if (~(var9 + -1) <= -1 && ~class249.field3848[class211.field3371][var9 + -1][var12] != ~var6 && ~(class22.field333[class211.field3371][var9][var12] & 4) == -1 && (4 & class22.field333[class211.field3371][var9 + -1][var12 + -1]) == 0) {
                            class258.field3947[var35] = class418.method2558(1375731712, class418.method2558(var9 - 1, 1179648));
                            class339.field5107[var35] = class418.method2558(1245184, var12);
                            var35 = 4095 & var35 + 1;
                            class249.field3848[class211.field3371][var9 + -1][var12] = var6;
                        }
                        if (~class249.field3848[class211.field3371][var9][var12] != ~var6) {
                            class258.field3947[var35] = class418.method2558(class418.method2558(var9, 5373952), 318767104);
                            class339.field5107[var35] = class418.method2558(var12, 5439488);
                            var35 = 4095 & var35 + 1;
                            class249.field3848[class211.field3371][var9][var12] = var6;
                        }
                        if (var9 - -1 < class339.field5099 && ~class249.field3848[class211.field3371][var9 + 1][var12] != ~var6 && (class22.field333[class211.field3371][var9][var12] & 4) == 0 && ~(4 & class22.field333[class211.field3371][var9 + 1][var12 - 1]) == -1) {
                            class258.field3947[var35] = class418.method2558(-1845493760, class418.method2558(5373952, var9 + 1));
                            class339.field5107[var35] = class418.method2558(var12, 5439488);
                            var35 = 4095 & var35 + 1;
                            class249.field3848[class211.field3371][var9 - -1][var12] = var6;
                        }
                    }
                    --var12;
                    if (var9 + 1 < class339.field5099 && class249.field3848[class211.field3371][var9 + 1][var12] != var6) {
                        class258.field3947[var35] = class418.method2558(class418.method2558(9568256, var9 + 1), 1392508928);
                        class339.field5107[var35] = class418.method2558(9633792, var12);
                        var35 = var35 + 1 & 4095;
                        class249.field3848[class211.field3371][var9 + 1][var12] = var6;
                    }
                    --var12;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class249.field3848[class211.field3371][var9 + -1][var12] != var6 && ~(4 & class22.field333[class211.field3371][var9][var12]) == -1 && ~(class22.field333[class211.field3371][var9 + -1][var12 + 1] & 4) == -1) {
                            class258.field3947[var35] = class418.method2558(class418.method2558(var9 + -1, 13762560), 301989888);
                            class339.field5107[var35] = class418.method2558(var12, 13828096);
                            var35 = 4095 & var35 - -1;
                            class249.field3848[class211.field3371][var9 + -1][var12] = var6;
                        }
                        if (~class249.field3848[class211.field3371][var9][var12] != ~var6) {
                            class258.field3947[var35] = class418.method2558(-1828716544, class418.method2558(var9, 13762560));
                            class339.field5107[var35] = class418.method2558(var12, 13828096);
                            var35 = 4095 & var35 + 1;
                            class249.field3848[class211.field3371][var9][var12] = var6;
                        }
                        if (~class339.field5099 < ~(var9 - -1) && ~class249.field3848[class211.field3371][var9 + 1][var12] != ~var6 && ~(class22.field333[class211.field3371][var9][var12] & 4) == -1 && ~(4 & class22.field333[class211.field3371][var9 + 1][var12 + 1]) == -1) {
                            class258.field3947[var35] = class418.method2558(-771751936, class418.method2558(var9 + 1, 9568256));
                            class339.field5107[var35] = class418.method2558(9633792, var12);
                            class249.field3848[class211.field3371][var9 - -1][var12] = var6;
                            var35 = var35 - -1 & 4095;
                        }
                    }
                }
            }
            if (~class50.field1008[arg3] != 999999) {
                class50.field1008[arg3] += 10;
                class321.field4904[arg3] -= 50;
                class403.field6086[arg3] += 50;
                class464.field6884[arg3] += 50;
                class322.field4925[arg3] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V", line = 498)
    public class324() {
        super(1, false);
    }
}
