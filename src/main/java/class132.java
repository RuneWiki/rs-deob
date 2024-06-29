import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class132 extends class176 {

    @OriginalMember(owner = "client!of", name = "q", descriptor = "Z")
    public boolean field2866 = false;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public static int field2869 = 0;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field2871 = 0;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field2873 = -1;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "Lgg;")
    public static class63 field2877 = class116.method911(43, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!of", name = "A", descriptor = "Lgg;")
    public static class63 field2876 = class116.method911(43, "p11_full");

    @OriginalMember(owner = "client!of", name = "C", descriptor = "Lgg;")
    private static class63 field2878 = class116.method911(43, "Please remove ");

    @OriginalMember(owner = "client!of", name = "u", descriptor = "Lgg;")
    public static class63 field2870 = field2878;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "Lgg;")
    public static class63 field2874 = field2878;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public int field2865;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public int field2875;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Lfc;")
    public static class51 field2868;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)V")
    public static final void method968(int arg0, int arg1) {
        int[] var2 = class101.field2369.field3994;
        field2867++;
        int var3 = var2.length;
        for (int var4 = arg1; var4 < var3; var4++) {
            var2[var4] = 1;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (103 - var5) * 4 * 512 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class49.field1194[arg0][var21][var5] & 0x18) == 0) {
                    class134.method978(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class49.field1194[arg0 + 1][var21][var5] & 0x8) != 0) {
                    class134.method978(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class101.field2369.method1327();
        int var6 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (-10 + 238 + (int) (Math.random() * 20.0D) << 16) + 228;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class49.field1194[arg0][var19][var8] & 0x18) == 0) {
                    class60.method559(var7, var19, -128, var8, var6, arg0);
                }
                if (arg0 < 3 && (class49.field1194[arg0 + 1][var19][var8] & 0x8) != 0) {
                    class60.method559(var7, var19, -122, var8, var6, arg0 + 1);
                }
            }
        }
        class14.field320 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                long var11 = class21.method221(class112.field2528, var9, var10);
                if (var11 != 0L) {
                    int var13 = class167.method1133(true, (int) (var11 >>> 32) & Integer.MAX_VALUE).field917;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class157.field3267[class112.field2528].field1909;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var14 > var9 - 3 && (var16[var14 - 1][var15] & 0x12C0108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var14 < var9 + 3 && (var16[var14 + 1][var15] & 0x12C0180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var15 > var10 - 3 && (var16[var14][var15 - 1] & 0x12C0102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var15 < var10 + 3 && (var16[var14][var15 + 1] & 0x12C0120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class166.field3406[class14.field320] = class8.field181[var13];
                        class163.field3364[class14.field320] = var14;
                        class56.field1487[class14.field320] = var15;
                        class14.field320++;
                    }
                }
            }
        }
        class63.field1621.method191((byte) -67);
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(Z)V")
    public static void method969(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2876 = null;
        field2877 = null;
        field2878 = null;
        field2868 = null;
        field2874 = null;
        field2870 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIII)V")
    public static final void method970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class199.field3979 * 128) {
            arg0 = class199.field3979 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class13.field298 * 128) {
            arg2 = class13.field298 * 128 - 1;
        }
        class155.field3245++;
        class123.field2720 = class25.field571[arg3];
        class195.field3915 = class25.field576[arg3];
        class22.field511 = class25.field571[arg4];
        class68.field1705 = class25.field576[arg4];
        class13.field316 = class139.field2985[(arg3 - 128) / 32][arg4 / 64];
        class138.field2971 = arg0;
        class103.field2373 = arg1;
        class14.field344 = arg2;
        client.field704 = arg0 / 128;
        class74.field1830 = arg2 / 128;
        class48.field1180 = arg5;
        class129.field2820 = client.field704 - class98.field2329;
        if (class129.field2820 < 0) {
            class129.field2820 = 0;
        }
        class186.field3750 = class74.field1830 - class98.field2329;
        if (class186.field3750 < 0) {
            class186.field3750 = 0;
        }
        class166.field3396 = client.field704 + class98.field2329;
        if (class166.field3396 > class199.field3979) {
            class166.field3396 = class199.field3979;
        }
        class142.field3039 = class98.field2329 + class74.field1830;
        if (class142.field3039 > class13.field298) {
            class142.field3039 = class13.field298;
        }
        class203.method1340();
        class176.field3624 = 0;
        for (int var6 = class32.field788; var6 < class168.field3469; var6++) {
            class96[][] var31 = class148.field3117[var6];
            for (int var32 = class129.field2820; var32 < class166.field3396; var32++) {
                for (int var33 = class186.field3750; var33 < class142.field3039; var33++) {
                    class96 var34 = var31[var32][var33];
                    if (var34 != null) {
                        if (var34.field2270 <= arg5 && (class13.field316[var32 + class98.field2329 - client.field704][var33 + class98.field2329 - class74.field1830] || class97.field2310[var6][var32][var33] - arg1 >= 2000)) {
                            var34.field2281 = true;
                            var34.field2291 = true;
                            if (var34.field2272 > 0) {
                                var34.field2285 = true;
                            } else {
                                var34.field2285 = false;
                            }
                            class176.field3624++;
                        } else {
                            var34.field2281 = false;
                            var34.field2291 = false;
                            var34.field2286 = 0;
                        }
                    }
                }
            }
        }
        for (int var7 = class32.field788; var7 < class168.field3469; var7++) {
            class96[][] var20 = class148.field3117[var7];
            for (int var21 = -class98.field2329; var21 <= 0; var21++) {
                int var22 = client.field704 + var21;
                int var23 = client.field704 - var21;
                if (var22 >= class129.field2820 || var23 < class166.field3396) {
                    for (int var24 = -class98.field2329; var24 <= 0; var24++) {
                        int var25 = class74.field1830 + var24;
                        int var26 = class74.field1830 - var24;
                        if (var22 >= class129.field2820) {
                            if (var25 >= class186.field3750) {
                                class96 var27 = var20[var22][var25];
                                if (var27 != null && var27.field2281) {
                                    class43.method411(var27, true);
                                }
                            }
                            if (var26 < class142.field3039) {
                                class96 var28 = var20[var22][var26];
                                if (var28 != null && var28.field2281) {
                                    class43.method411(var28, true);
                                }
                            }
                        }
                        if (var23 < class166.field3396) {
                            if (var25 >= class186.field3750) {
                                class96 var29 = var20[var23][var25];
                                if (var29 != null && var29.field2281) {
                                    class43.method411(var29, true);
                                }
                            }
                            if (var26 < class142.field3039) {
                                class96 var30 = var20[var23][var26];
                                if (var30 != null && var30.field2281) {
                                    class43.method411(var30, true);
                                }
                            }
                        }
                        if (class176.field3624 == 0) {
                            class139.field2984 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var8 = class32.field788; var8 < class168.field3469; var8++) {
            class96[][] var9 = class148.field3117[var8];
            for (int var10 = -class98.field2329; var10 <= 0; var10++) {
                int var11 = client.field704 + var10;
                int var12 = client.field704 - var10;
                if (var11 >= class129.field2820 || var12 < class166.field3396) {
                    for (int var13 = -class98.field2329; var13 <= 0; var13++) {
                        int var14 = class74.field1830 + var13;
                        int var15 = class74.field1830 - var13;
                        if (var11 >= class129.field2820) {
                            if (var14 >= class186.field3750) {
                                class96 var16 = var9[var11][var14];
                                if (var16 != null && var16.field2281) {
                                    class43.method411(var16, false);
                                }
                            }
                            if (var15 < class142.field3039) {
                                class96 var17 = var9[var11][var15];
                                if (var17 != null && var17.field2281) {
                                    class43.method411(var17, false);
                                }
                            }
                        }
                        if (var12 < class166.field3396) {
                            if (var14 >= class186.field3750) {
                                class96 var18 = var9[var12][var14];
                                if (var18 != null && var18.field2281) {
                                    class43.method411(var18, false);
                                }
                            }
                            if (var15 < class142.field3039) {
                                class96 var19 = var9[var12][var15];
                                if (var19 != null && var19.field2281) {
                                    class43.method411(var19, false);
                                }
                            }
                        }
                        if (class176.field3624 == 0) {
                            class139.field2984 = false;
                            return;
                        }
                    }
                }
            }
        }
        class139.field2984 = false;
    }
}
