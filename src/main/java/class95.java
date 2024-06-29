import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class95 extends class119 {

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "Lr;")
    public static class66 field1827 = class93.method641(43, "::gc");

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "Lqc;")
    public static class245 field1823 = new class245(5);

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public static int field1831 = 0;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "Lr;")
    public static class66 field1833 = class93.method641(43, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "Lnj;")
    public static class230 field1834 = new class230(64);

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field1836 = 0;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "Lik;")
    public static class117 field1835;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "Lcj;")
    public static class28 field1832;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "Lcj;")
    public static class28 field1837;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z[[[Laa;IIIB)Z")
    public static final boolean method651(boolean arg0, class16[][][] arg1, int arg2, int arg3, int arg4, byte arg5) {
        byte var6 = arg0 ? 1 : (byte) (class214.field3683 & 0xFF);
        field1822++;
        if (class102.field2000[class196.field3401][arg3][arg2] == var6) {
            return false;
        } else if ((class47.field846[class196.field3401][arg3][arg2] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class188.field3263[var7] = arg3;
            int var8 = -107 % ((arg5 + 16) / 61);
            int var9 = 0;
            int var32 = var7 + 1;
            class176.field3099[var7] = arg2;
            class102.field2000[class196.field3401][arg3][arg2] = var6;
            while (var32 != var9) {
                int var10 = (class188.field3263[var9] & 0xFF5D07) >> 16;
                int var11 = class188.field3263[var9] & 0xFFFF;
                int var12 = class188.field3263[var9] >> 24 & 0xFF;
                int var13 = class176.field3099[var9] & 0xFFFF;
                int var14 = (class176.field3099[var9] & 0xFF055A) >> 16;
                boolean var15 = false;
                var9 = var9 + 1 & 0xFFF;
                if ((class47.field846[class196.field3401][var11][var13] & 0x4) == 0) {
                    var15 = true;
                }
                boolean var16 = false;
                label225: for (int var17 = class196.field3401 + 1; var17 <= 3; var17++) {
                    if ((class47.field846[var17][var11][var13] & 0x8) == 0) {
                        if (var15 && arg1[var17][var11][var13] != null) {
                            if (arg1[var17][var11][var13].field205 != null) {
                                int var20 = class114.method759(var10, false);
                                if (arg1[var17][var11][var13].field205.field855 == var20 || arg1[var17][var11][var13].field205.field845 == var20) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var21 = class114.method759(var12, false);
                                    if (arg1[var17][var11][var13].field205.field855 == var21 || arg1[var17][var11][var13].field205.field845 == var21) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var22 = class114.method759(var14, false);
                                    if (arg1[var17][var11][var13].field205.field855 == var22 || arg1[var17][var11][var13].field205.field845 == var22) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var17][var11][var13].field220 != null) {
                                for (int var23 = 0; var23 < arg1[var17][var11][var13].field219; var23++) {
                                    int var24 = (int) (arg1[var17][var11][var13].field220[var23].field780 >> 14 & 0x3FL);
                                    if (var24 == 21) {
                                        var24 = 19;
                                    }
                                    int var25 = (int) (arg1[var17][var11][var13].field220[var23].field780 >> 20 & 0x3L);
                                    int var26 = var25 << 6 | var24;
                                    if (var10 == var26 || var12 != 0 && var12 == var26 || var14 != 0 && var14 == var26) {
                                        continue label225;
                                    }
                                }
                            }
                        }
                        var16 = true;
                        class16 var27 = arg1[var17][var11][var13];
                        if (var27 != null && var27.field219 > 0) {
                            for (int var28 = 0; var28 < var27.field219; var28++) {
                                class44 var29 = var27.field220[var28];
                                if (var29.field791 != var29.field775 || var29.field790 != var29.field771) {
                                    for (int var30 = var29.field791; var30 <= var29.field775; var30++) {
                                        for (int var31 = var29.field790; var31 <= var29.field771; var31++) {
                                            class102.field2000[var17][var30][var31] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class102.field2000[var17][var11][var13] = var6;
                    }
                }
                if (var16) {
                    if (class247.field4296[arg4] < class30.field453[class196.field3401 + 1][var11][var13]) {
                        class247.field4296[arg4] = class30.field453[class196.field3401 + 1][var11][var13];
                    }
                    int var18 = var11 << 7;
                    if (var18 < class101.field1962[arg4]) {
                        class101.field1962[arg4] = var18;
                    } else if (var18 > class162.field2911[arg4]) {
                        class162.field2911[arg4] = var18;
                    }
                    int var19 = var13 << 7;
                    if (var19 < class240.field4160[arg4]) {
                        class240.field4160[arg4] = var19;
                    } else if (var19 > class230.field3979[arg4]) {
                        class230.field3979[arg4] = var19;
                    }
                }
                if (!var15) {
                    if (var11 >= 1 && class102.field2000[class196.field3401][var11 - 1][var13] != var6) {
                        class188.field3263[var32] = class73.method521(class73.method521(1179648, var11 - 1), -754974720);
                        class176.field3099[var32] = class73.method521(1245184, var13);
                        var32 = var32 + 1 & 0xFFF;
                        class102.field2000[class196.field3401][var11 - 1][var13] = var6;
                    }
                    var13++;
                    if (var13 < 104) {
                        if (var11 - 1 >= 0 && class102.field2000[class196.field3401][var11 - 1][var13] != var6 && (class47.field846[class196.field3401][var11][var13] & 0x4) == 0 && (class47.field846[class196.field3401][var11 - 1][var13 - 1] & 0x4) == 0) {
                            class188.field3263[var32] = class73.method521(class73.method521(1179648, var11 - 1), 1375731712);
                            class176.field3099[var32] = class73.method521(var13, 1245184);
                            var32 = var32 + 1 & 0xFFF;
                            class102.field2000[class196.field3401][var11 - 1][var13] = var6;
                        }
                        if (class102.field2000[class196.field3401][var11][var13] != var6) {
                            class188.field3263[var32] = class73.method521(class73.method521(5373952, var11), 318767104);
                            class176.field3099[var32] = class73.method521(5439488, var13);
                            var32 = var32 + 1 & 0xFFF;
                            class102.field2000[class196.field3401][var11][var13] = var6;
                        }
                        if (var11 + 1 < 104 && class102.field2000[class196.field3401][var11 + 1][var13] != var6 && (class47.field846[class196.field3401][var11][var13] & 0x4) == 0 && (class47.field846[class196.field3401][var11 + 1][var13 - 1] & 0x4) == 0) {
                            class188.field3263[var32] = class73.method521(class73.method521(var11 + 1, 5373952), -1845493760);
                            class176.field3099[var32] = class73.method521(5439488, var13);
                            class102.field2000[class196.field3401][var11 + 1][var13] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                    }
                    var13--;
                    if ((var11 + 1) < 104 && class102.field2000[class196.field3401][var11 + 1][var13] != var6) {
                        class188.field3263[var32] = class73.method521(1392508928, class73.method521(var11 + 1, 9568256));
                        class176.field3099[var32] = class73.method521(var13, 9633792);
                        var32 = var32 + 1 & 0xFFF;
                        class102.field2000[class196.field3401][var11 + 1][var13] = var6;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if ((var11 - 1) >= 0 && class102.field2000[class196.field3401][var11 - 1][var13] != var6 && (class47.field846[class196.field3401][var11][var13] & 0x4) == 0 && (class47.field846[class196.field3401][var11 - 1][var13 + 1] & 0x4) == 0) {
                            class188.field3263[var32] = class73.method521(class73.method521(13762560, var11 - 1), 301989888);
                            class176.field3099[var32] = class73.method521(var13, 13828096);
                            var32 = var32 + 1 & 0xFFF;
                            class102.field2000[class196.field3401][var11 - 1][var13] = var6;
                        }
                        if (class102.field2000[class196.field3401][var11][var13] != var6) {
                            class188.field3263[var32] = class73.method521(class73.method521(var11, 13762560), -1828716544);
                            class176.field3099[var32] = class73.method521(var13, 13828096);
                            class102.field2000[class196.field3401][var11][var13] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if (var11 + 1 < 104 && class102.field2000[class196.field3401][var11 + 1][var13] != var6 && (class47.field846[class196.field3401][var11][var13] & 0x4) == 0 && (class47.field846[class196.field3401][var11 + 1][var13 + 1] & 0x4) == 0) {
                            class188.field3263[var32] = class73.method521(class73.method521(9568256, var11 + 1), -771751936);
                            class176.field3099[var32] = class73.method521(9633792, var13);
                            var32 = var32 + 1 & 0xFFF;
                            class102.field2000[class196.field3401][var11 + 1][var13] = var6;
                        }
                    }
                }
            }
            if (class247.field4296[arg4] != -1000000) {
                class247.field4296[arg4] += 10;
                class101.field1962[arg4] -= 50;
                class162.field2911[arg4] += 50;
                class230.field3979[arg4] += 50;
                class240.field4160[arg4] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
    public static final void method652(boolean arg0) {
        if (arg0) {
            field1828++;
            class69.field1379.method1613((byte) 94);
            class94.field1806.method1613((byte) 94);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILlh;)V")
    public static final void method653(int arg0, class249 arg1) {
        field1829++;
        if (arg0 < 28) {
            field1834 = null;
        }
        int var2 = class81.field1584 >> 2 << 10;
        byte[][] var3 = new byte[class33.field500][class89.field1727];
        int var4 = class67.field1349 >> 1;
        while (arg1.field4350.length > arg1.field4335) {
            int var33 = 0;
            int var34 = 0;
            boolean var35 = false;
            if (arg1.method1677(-6677) == 1) {
                var33 = arg1.method1677(-6677);
                var34 = arg1.method1677(-6677);
                var35 = true;
            }
            int var36 = arg1.method1677(-6677);
            int var37 = arg1.method1677(-6677);
            int var38 = var36 * 64 - class73.field1439;
            int var39 = class89.field1727 - (var37 * 64 - class16.field208) - 1;
            if (var38 >= 0 && var39 - 63 >= 0 && var38 + 63 < class33.field500 && class89.field1727 > var39) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var3[var38 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var35 || (var33 * 8) <= var40 && var33 * 8 + 8 > var40 && var42 >= (var34 * 8) && (var34 * 8 + 8) > var42) {
                            var41[var39 - var42] = arg1.method1682(3390);
                        }
                    }
                }
            } else if (var35) {
                arg1.field4335 += 64;
            } else {
                arg1.field4335 += 4096;
            }
        }
        int var5 = class33.field500;
        int var6 = class89.field1727;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var5 > var27) {
                    int var28 = var3[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class190 var29 = class205.method1328(var28 - 1, (byte) -128);
                        var9[var13] += var29.field3288;
                        var7[var13] += var29.field3293;
                        var8[var13] += var29.field3283;
                        var10[var13] += var29.field3281;
                        var10002 = var11[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var3[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class190 var32 = class205.method1328(var31 - 1, (byte) -128);
                        var9[var13] -= var32.field3288;
                        var7[var13] -= var32.field3293;
                        var8[var13] -= var32.field3283;
                        var10[var13] -= var32.field3281;
                        var10002 = var11[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int var14 = 0;
                int[][] var15 = class9.field98[var12 >> 6];
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 - 5;
                    int var22 = var20 + 5;
                    if (var6 > var22) {
                        var14 += var9[var22];
                        var16 += var7[var22];
                        var18 += var11[var22];
                        var17 += var8[var22];
                        var19 += var10[var22];
                    }
                    if (var21 >= 0) {
                        var18 -= var11[var21];
                        var14 -= var9[var21];
                        var17 -= var8[var21];
                        var19 -= var10[var21];
                        var16 -= var7[var21];
                    }
                    if (var20 >= 0 && var18 > 0) {
                        int[] var23 = var15[var20 >> 6];
                        int var24 = var19 == 0 ? 0 : class35.method195(var16 / var18, (byte) -82, var17 / var18, var14 * 256 / var19);
                        if (var3[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var15[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var4;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var2 + var24 & 0xFC00) + var25 + (var24 & 0x380);
                            var23[class115.method767(63, var12) + (class115.method767(63, var20) << 6)] = class123.field2317[class36.method200(2, 96, var26)];
                        } else if (var23 != null) {
                            var23[class115.method767(63, var12) + (class115.method767(63, var20) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BII)I")
    public static final int method654(byte arg0, int arg1, int arg2) {
        if (arg0 == 20) {
            field1826++;
            int var3 = arg2 - 1 & arg1 >> 31;
            return ((arg1 >>> 31) + arg1) % arg2 + var3;
        } else {
            return -120;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLwd;)V")
    public static final void method655(byte arg0, class221 arg1) {
        if (arg0 >= -3) {
            return;
        }
        arg1.field3779 = false;
        field1825++;
        if (arg1.field3777 != null) {
            arg1.field3777.field951 = 0;
        }
        for (class221 var2 = arg1.method278(); var2 != null; var2 = arg1.method308()) {
            method655((byte) -10, var2);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
    public static void method656(byte arg0) {
        if (arg0 != 15) {
            method654((byte) -48, 88, 69);
        }
        field1823 = null;
        field1827 = null;
        field1837 = null;
        field1832 = null;
        field1835 = null;
        field1833 = null;
        field1834 = null;
    }
}
