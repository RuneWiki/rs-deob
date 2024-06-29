import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class51 extends class1 {

    @OriginalMember(owner = "client!ef", name = "qb", descriptor = "I")
    private int field1033 = 32768;

    @OriginalMember(owner = "client!ef", name = "pb", descriptor = "I")
    public static int field1032 = 0;

    @OriginalMember(owner = "client!ef", name = "jb", descriptor = "I")
    public static int field1026 = 0;

    @OriginalMember(owner = "client!ef", name = "ob", descriptor = "[I")
    public static int[] field1031 = new int[32];

    @OriginalMember(owner = "client!ef", name = "sb", descriptor = "Loc;")
    public static class151 field1035 = class137.method873(2, "leuchten3:");

    @OriginalMember(owner = "client!ef", name = "ub", descriptor = "I")
    public static int field1037 = 0;

    @OriginalMember(owner = "client!ef", name = "tb", descriptor = "Loc;")
    public static class151 field1036 = class137.method873(2, "sl_stars");

    @OriginalMember(owner = "client!ef", name = "hb", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!ef", name = "ib", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!ef", name = "kb", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ef", name = "lb", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!ef", name = "mb", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!ef", name = "nb", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!ef", name = "gb", descriptor = "Lsd;")
    public static class192 field1023;

    @OriginalMember(owner = "client!ef", name = "rb", descriptor = "[Lcg;")
    public static class30[] field1034;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field1030;
        int[][] var3 = super.field13.method578(arg0, -1);
        if (super.field13.field1658) {
            int[] var4 = this.method4(arg0, -100, 1);
            int[] var5 = this.method4(arg0, -120, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class202.field3603 > var9; ++var9) {
                int var10 = var5[var9] * this.field1033 >> 12;
                int var11 = (1045809 & var4[var9] * 255) >> 12;
                int var12 = class164.field2963[var11] * var10 >> 12;
                int var13 = class78.field1510 & var9 - -(var12 >> 12);
                int var14 = class22.field476[var11] * var10 >> 12;
                int var15 = arg0 - -(var14 >> 12) & class155.field2804;
                int[][] var16 = this.method8(0, (byte) 70, var15);
                var6[var9] = var16[0][var13];
                var7[var9] = var16[1][var13];
                var8[var9] = var16[2][var13];
            }
        }
        if (arg1 != -81) {
            field1032 = 58;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIII)V")
    public static final void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class228.field4032 * 128) {
            arg0 = class228.field4032 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class225.field3924 * 128) {
            arg2 = class225.field3924 * 128 - 1;
        }
        ++class11.field201;
        class228.field4027 = class61.field1191[arg3];
        class142.field2584 = class61.field1208[arg3];
        class39.field797 = class61.field1191[arg4];
        class14.field325 = class61.field1208[arg4];
        class205.field3637 = class158.field2851[(arg3 - 128) / 32][arg4 / 64];
        class1.field42 = arg0;
        class116.field2084 = arg1;
        class73.field1426 = arg2;
        class66.field1271 = arg0 / 128;
        class36.field736 = arg2 / 128;
        class132.field2419 = arg5;
        class170.field3093 = class66.field1271 - class27.field573;
        if (class170.field3093 < 0) {
            class170.field3093 = 0;
        }
        class164.field2961 = class36.field736 - class27.field573;
        if (class164.field2961 < 0) {
            class164.field2961 = 0;
        }
        class178.field3211 = class66.field1271 + class27.field573;
        if (class178.field3211 > class228.field4032) {
            class178.field3211 = class228.field4032;
        }
        class72.field1418 = class36.field736 + class27.field573;
        if (class72.field1418 > class225.field3924) {
            class72.field1418 = class225.field3924;
        }
        class189.method1173();
        class7.field107 = 0;
        for (int var6 = class212.field3734; var6 < class116.field2100; ++var6) {
            class72[][] var31 = class95.field1776[var6];
            for (int var32 = class170.field3093; var32 < class178.field3211; ++var32) {
                for (int var33 = class164.field2961; var33 < class72.field1418; ++var33) {
                    class72 var34 = var31[var32][var33];
                    if (var34 != null) {
                        if (var34.field1402 <= arg5 && (class205.field3637[var32 - class66.field1271 + class27.field573][var33 - class36.field736 + class27.field573] || class233.field4286[var6][var32][var33] - arg1 >= 2000)) {
                            var34.field1401 = true;
                            var34.field1396 = true;
                            if (var34.field1397 > 0) {
                                var34.field1410 = true;
                            } else {
                                var34.field1410 = false;
                            }
                            ++class7.field107;
                        } else {
                            var34.field1401 = false;
                            var34.field1396 = false;
                            var34.field1393 = 0;
                        }
                    }
                }
            }
        }
        for (int var7 = class212.field3734; var7 < class116.field2100; ++var7) {
            class72[][] var20 = class95.field1776[var7];
            for (int var21 = -class27.field573; var21 <= 0; ++var21) {
                int var22 = class66.field1271 + var21;
                int var23 = class66.field1271 - var21;
                if (var22 >= class170.field3093 || var23 < class178.field3211) {
                    for (int var24 = -class27.field573; var24 <= 0; ++var24) {
                        int var25 = class36.field736 + var24;
                        int var26 = class36.field736 - var24;
                        if (var22 >= class170.field3093) {
                            if (var25 >= class164.field2961) {
                                class72 var27 = var20[var22][var25];
                                if (var27 != null && var27.field1401) {
                                    class212.method1331(var27, true);
                                }
                            }
                            if (var26 < class72.field1418) {
                                class72 var28 = var20[var22][var26];
                                if (var28 != null && var28.field1401) {
                                    class212.method1331(var28, true);
                                }
                            }
                        }
                        if (var23 < class178.field3211) {
                            if (var25 >= class164.field2961) {
                                class72 var29 = var20[var23][var25];
                                if (var29 != null && var29.field1401) {
                                    class212.method1331(var29, true);
                                }
                            }
                            if (var26 < class72.field1418) {
                                class72 var30 = var20[var23][var26];
                                if (var30 != null && var30.field1401) {
                                    class212.method1331(var30, true);
                                }
                            }
                        }
                        if (class7.field107 == 0) {
                            class138.field2510 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var8 = class212.field3734; var8 < class116.field2100; ++var8) {
            class72[][] var9 = class95.field1776[var8];
            for (int var10 = -class27.field573; var10 <= 0; ++var10) {
                int var11 = class66.field1271 + var10;
                int var12 = class66.field1271 - var10;
                if (var11 >= class170.field3093 || var12 < class178.field3211) {
                    for (int var13 = -class27.field573; var13 <= 0; ++var13) {
                        int var14 = class36.field736 + var13;
                        int var15 = class36.field736 - var13;
                        if (var11 >= class170.field3093) {
                            if (var14 >= class164.field2961) {
                                class72 var16 = var9[var11][var14];
                                if (var16 != null && var16.field1401) {
                                    class212.method1331(var16, false);
                                }
                            }
                            if (var15 < class72.field1418) {
                                class72 var17 = var9[var11][var15];
                                if (var17 != null && var17.field1401) {
                                    class212.method1331(var17, false);
                                }
                            }
                        }
                        if (var12 < class178.field3211) {
                            if (var14 >= class164.field2961) {
                                class72 var18 = var9[var12][var14];
                                if (var18 != null && var18.field1401) {
                                    class212.method1331(var18, false);
                                }
                            }
                            if (var15 < class72.field1418) {
                                class72 var19 = var9[var12][var15];
                                if (var19 != null && var19.field1401) {
                                    class212.method1331(var19, false);
                                }
                            }
                        }
                        if (class7.field107 == 0) {
                            class138.field2510 = false;
                            return;
                        }
                    }
                }
            }
        }
        class138.field2510 = false;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        if (arg0 != 107) {
            field1036 = null;
        }
        ++field1029;
        int[] var3 = super.field21.method1182(arg1, arg0 ^ -31672);
        if (super.field21.field3388) {
            int[] var4 = this.method4(arg1, -117, 1);
            int[] var5 = this.method4(arg1, arg0 ^ -14, 2);
            for (int var6 = 0; class202.field3603 > var6; ++var6) {
                int var7 = var5[var6] * this.field1033 >> 12;
                int var8 = (var4[var6] & 4091) >> 4;
                int var9 = class22.field476[var8] * var7 >> 12;
                int var10 = class164.field2963[var8] * var7 >> 12;
                int var11 = class155.field2804 & (var9 >> 12) + arg1;
                int var12 = (var10 >> 12) + var6 & class78.field1510;
                int[] var13 = this.method4(var11, -121, 0);
                var3[var6] = var13[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        ++field1024;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field27 = arg2.method1475(255) == 1;
            }
        } else {
            this.field1033 = arg2.method1490((byte) 73) << 4;
        }
        if (arg0 != 0) {
            field1035 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public final void method2(int arg0) {
        if (arg0 != 3) {
            field1037 = -78;
        }
        class182.method1146(false);
        ++field1027;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class51() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(B)V")
    public static void method355(byte arg0) {
        field1031 = null;
        field1035 = null;
        field1023 = null;
        field1034 = null;
        field1036 = null;
        int var1 = 80 % ((19 - arg0) / 42);
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)V")
    public static final void method356(int arg0, int arg1) {
        ++field1028;
        if (arg1 != -1) {
            if (class197.method1234(arg1, arg0 + 65)) {
                class232[] var2 = class115.field2067[arg1];
                if (arg0 == 32) {
                    for (int var3 = 0; var2.length > var3; ++var3) {
                        class232 var4 = var2[var3];
                        if (var4.field4187 != null) {
                            class224 var5 = new class224();
                            var5.field3895 = var4.field4187;
                            var5.field3905 = var4;
                            class231.method1509(2000000, 127, var5);
                        }
                    }
                }
            }
        }
    }
}
