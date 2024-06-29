import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class54 {

    @OriginalMember(owner = "client!he", name = "a", descriptor = "[I")
    public static int[] field1340 = new int[500];

    @OriginalMember(owner = "client!he", name = "v", descriptor = "Lfc;")
    private static class39 field1361 = class90.method774("Too many connections from your address)3", -112);

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[I")
    public static int[] field1347 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!he", name = "o", descriptor = "[[B")
    public static byte[][] field1354 = new byte[50][];

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Lfc;")
    public static class39 field1357 = class90.method774("backhmid1", -123);

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Lfc;")
    private static class39 field1351 = class90.method774("Please try using a different world)3", -108);

    @OriginalMember(owner = "client!he", name = "d", descriptor = "[[B")
    public static byte[][] field1343 = new byte[1000][];

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Lfc;")
    public static class39 field1356 = field1351;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lfc;")
    public static class39 field1348 = field1351;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "Lfc;")
    public static class39 field1364 = field1351;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lfc;")
    public static class39 field1345 = field1361;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lfc;")
    public static class39 field1350 = field1351;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "Lfc;")
    public static class39 field1360 = field1351;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "Lfc;")
    public static class39 field1353 = field1351;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public int field1349;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public int field1352;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public int field1366;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "Loc;")
    public static class100 field1358;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "Lqb;")
    public class113 field1365;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "Lma;")
    public static class84 field1367;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILq;)V", line = 28)
    public static final void method565(int arg0, class111 arg1) {
        arg1.field2875 = false;
        if (arg1.field2869 != -1) {
            class116 var2 = class38.method430(2238, arg1.field2869);
            if (var2 == null || var2.field3057 == null) {
                arg1.field2869 = -1;
            } else {
                arg1.field2906++;
                if (arg1.field2892 < var2.field3057.length && arg1.field2906 > var2.field3035[arg1.field2892]) {
                    arg1.field2906 = 1;
                    arg1.field2892++;
                    class62.method611(arg1.field2892, (byte) -124, arg1.field2916, arg1.field2909, var2);
                }
                if (arg1.field2892 >= var2.field3057.length) {
                    arg1.field2906 = 0;
                    arg1.field2892 = 0;
                    class62.method611(arg1.field2892, (byte) -70, arg1.field2916, arg1.field2909, var2);
                }
            }
        }
        if (arg1.field2891 != -1 && arg1.field2883 <= class70.field1654) {
            if (arg1.field2866 < 0) {
                arg1.field2866 = 0;
            }
            int var3 = class60.method598(arg1.field2891, 32).field2691;
            if (var3 == -1) {
                arg1.field2891 = -1;
            } else {
                class116 var4 = class38.method430(2238, var3);
                if (var4 == null || var4.field3057 == null) {
                    arg1.field2891 = -1;
                } else {
                    arg1.field2860++;
                    if (var4.field3057.length > arg1.field2866 && var4.field3035[arg1.field2866] < arg1.field2860) {
                        arg1.field2860 = 1;
                        arg1.field2866++;
                        class62.method611(arg1.field2866, (byte) -104, arg1.field2916, arg1.field2909, var4);
                    }
                    if (arg1.field2866 >= var4.field3057.length && (arg1.field2866 < 0 || var4.field3057.length <= arg1.field2866)) {
                        arg1.field2891 = -1;
                    }
                }
            }
        }
        field1355++;
        if (arg1.field2888 != -1 && arg1.field2911 <= 1) {
            class116 var5 = class38.method430(2238, arg1.field2888);
            if (var5.field3051 == 1 && arg1.field2884 > 0 && class70.field1654 >= arg1.field2904 && arg1.field2880 < class70.field1654) {
                arg1.field2911 = 1;
                return;
            }
        }
        if (arg1.field2888 != -1 && arg1.field2911 == 0) {
            class116 var6 = class38.method430(2238, arg1.field2888);
            if (var6 == null || var6.field3057 == null) {
                arg1.field2888 = -1;
            } else {
                arg1.field2885++;
                if (arg1.field2886 < var6.field3057.length && var6.field3035[arg1.field2886] < arg1.field2885) {
                    arg1.field2885 = 1;
                    arg1.field2886++;
                    class62.method611(arg1.field2886, (byte) -91, arg1.field2916, arg1.field2909, var6);
                }
                if (arg1.field2886 >= var6.field3057.length) {
                    arg1.field2864++;
                    arg1.field2886 -= var6.field3041;
                    if (arg1.field2864 >= var6.field3047) {
                        arg1.field2888 = -1;
                    } else if (arg1.field2886 >= 0 && var6.field3057.length > arg1.field2886) {
                        class62.method611(arg1.field2886, (byte) -123, arg1.field2916, arg1.field2909, var6);
                    } else {
                        arg1.field2888 = -1;
                    }
                }
                arg1.field2875 = var6.field3061;
            }
        }
        if (arg1.field2911 > 0) {
            arg1.field2911--;
        }
        if (arg0 > -121) {
            method567(-52, -81);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIII)V", line = 169)
    public static final void method566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class139.field3503.method48(arg5, arg2, arg1);
        field1362++;
        if (arg3 != 10450) {
            return;
        }
        if (var6 != 0) {
            int var7 = arg0;
            if (var6 > 0) {
                var7 = arg4;
            }
            int var8 = (52736 - arg1 * 512) * 4 + arg2 * 4 + 24624;
            int var9 = class139.field3503.method43(arg5, arg2, arg1, var6);
            int var10 = var9 & 0x1F;
            int var11 = var6 >> 14 & 0x7FFF;
            int[] var12 = class70.field1638.field240;
            int var13 = var9 >> 6 & 0x3;
            class35 var14 = class90.method776(var11, arg3 ^ 0xFFFFD753);
            if (var14.field921 == -1) {
                if (var10 == 0 || var10 == 2) {
                    if (var13 == 0) {
                        var12[var8] = var7;
                        var12[var8 + 512] = var7;
                        var12[var8 + 1024] = var7;
                        var12[var8 + 1536] = var7;
                    } else if (var13 == 1) {
                        var12[var8] = var7;
                        var12[var8 + 1] = var7;
                        var12[var8 + 2] = var7;
                        var12[var8 + 3] = var7;
                    } else if (var13 == 2) {
                        var12[var8 + 3] = var7;
                        var12[var8 + 3 + 512] = var7;
                        var12[var8 + 3 + 1024] = var7;
                        var12[var8 + 1536 + 3] = var7;
                    } else if (var13 == 3) {
                        var12[var8 + 1536] = var7;
                        var12[var8 + 1536 + 1] = var7;
                        var12[var8 + 1536 + 2] = var7;
                        var12[var8 + 1536 + 3] = var7;
                    }
                }
                if (var10 == 3) {
                    if (var13 == 0) {
                        var12[var8] = var7;
                    } else if (var13 == 1) {
                        var12[var8 + 3] = var7;
                    } else if (var13 == 2) {
                        var12[var8 + 3 + 1536] = var7;
                    } else if (var13 == 3) {
                        var12[var8 + 1536] = var7;
                    }
                }
                if (var10 == 2) {
                    if (var13 == 3) {
                        var12[var8] = var7;
                        var12[var8 + 512] = var7;
                        var12[var8 + 1024] = var7;
                        var12[var8 + 1536] = var7;
                    } else if (var13 == 0) {
                        var12[var8] = var7;
                        var12[var8 + 1] = var7;
                        var12[var8 + 2] = var7;
                        var12[var8 + 3] = var7;
                    } else if (var13 == 1) {
                        var12[var8 + 3] = var7;
                        var12[var8 + 3 + 512] = var7;
                        var12[var8 + 3 + 1024] = var7;
                        var12[var8 + 1539] = var7;
                    } else if (var13 == 2) {
                        var12[var8 + 1536] = var7;
                        var12[var8 + 1536 + 1] = var7;
                        var12[var8 + 2 + 1536] = var7;
                        var12[var8 + 3 + 1536] = var7;
                    }
                }
            } else {
                class141 var15 = class119.field3101[var14.field921];
                if (var15 != null) {
                    int var16 = (var14.field912 * 4 - var15.field3543) / 2;
                    int var17 = (var14.field930 * 4 - var15.field3546) / 2;
                    var15.method1155(arg2 * 4 + var16 + 48, (104 - arg1 + -var14.field930) * 4 + 48 - -var17);
                }
            }
        }
        int var18 = class139.field3503.method46(arg5, arg2, arg1);
        if (var18 != 0) {
            int var19 = class139.field3503.method43(arg5, arg2, arg1, var18);
            int var20 = var19 >> 6 & 0x3;
            int var21 = var19 & 0x1F;
            int var22 = var18 >> 14 & 0x7FFF;
            class35 var23 = class90.method776(var22, -125);
            if (var23.field921 != -1) {
                class141 var27 = class119.field3101[var23.field921];
                if (var27 != null) {
                    int var28 = (var23.field912 * 4 - var27.field3543) / 2;
                    int var29 = (var23.field930 * 4 - var27.field3546) / 2;
                    var27.method1155(arg2 * 4 + var28 + 48, (104 - (arg1 - -var23.field930)) * 4 + 48 + var29);
                }
            } else if (var21 == 9) {
                int[] var24 = class70.field1638.field240;
                int var25 = 15658734;
                if (var18 > 0) {
                    var25 = 15597568;
                }
                int var26 = (103 - arg1) * 512 * 4 + arg2 * 4 + 24624;
                if (var20 == 0 || var20 == 2) {
                    var24[var26 + 1536] = var25;
                    var24[var26 + 1024 + 1] = var25;
                    var24[var26 + 512 + 2] = var25;
                    var24[var26 + 3] = var25;
                } else {
                    var24[var26] = var25;
                    var24[var26 + 512 + 1] = var25;
                    var24[var26 + 1024 + 2] = var25;
                    var24[var26 + 3 + 1536] = var25;
                }
            }
        }
        int var30 = class139.field3503.method76(arg5, arg2, arg1);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class35 var32 = class90.method776(var31, -122);
        if (var32.field921 == -1) {
            return;
        }
        class141 var33 = class119.field3101[var32.field921];
        if (var33 != null) {
            int var34 = (var32.field930 * 4 - var33.field3546) / 2;
            int var35 = (var32.field912 * 4 - var33.field3543) / 2;
            var33.method1155(arg2 * 4 + var35 + 48, (-var32.field930 + -arg1 + 104) * 4 + 48 + var34);
            return;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lob;", line = 411)
    public static final class99 method567(int arg0, int arg1) {
        field1342++;
        int var2 = arg1 >> 16;
        if (arg0 <= 38) {
            method567(25, 10);
        }
        int var3 = arg1 & 0xFFFF;
        if (class65.field1571[var2] == null || class65.field1571[var2][var3] == null) {
            boolean var4 = class66.method631(0, var2);
            if (!var4) {
                return null;
            }
        }
        return class65.field1571[var2][var3];
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Lma;", line = 441)
    public static final class84 method568(int arg0) {
        class84 var1 = new class84(class72.field1686, class101.field2515, class115.field3026, class1.field27, class15.field395);
        field1363++;
        class114.method994(-24);
        if (arg0 != 103) {
            field1354 = null;
        }
        return var1;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 467)
    public static final void method569(int arg0) {
        field1344++;
        if (class71.field1661 != 0 && class71.field1661 != 3) {
            return;
        }
        if (class13.field343 == 1) {
            int var1 = class26.field758 - 5 - 4;
            int var2 = class34.field889 - 550 - 25;
            if (var2 >= 0 && var1 >= 0 && var2 < 146 && var1 < 151) {
                var1 -= 75;
                var2 -= 73;
                int var3 = class62.field1532 + class26.field753 & 0x7FF;
                int var4 = class40.field1124[var3];
                int var5 = class40.field1114[var3];
                int var6 = (class153.field3759 + 256) * var4 >> 8;
                int var7 = (class153.field3759 + 256) * var5 >> 8;
                int var8 = var1 * var7 - var2 * var6 >> 11;
                int var9 = class94.field2197.field2909 - var8 >> 7;
                int var10 = var1 * var6 + var2 * var7 >> 11;
                int var11 = class94.field2197.field2916 + var10 >> 7;
                boolean var12 = class93.method790(true, -1, 0, 1, 0, 0, var9, class94.field2197.field2926[0], 0, 0, class94.field2197.field2913[0], var11);
                if (var12) {
                    class79.field1794.method326(var2, (byte) -43);
                    class79.field1794.method326(var1, (byte) -53);
                    class79.field1794.method325(class62.field1532, -76);
                    class79.field1794.method326(57, (byte) -95);
                    class79.field1794.method326(class26.field753, (byte) -120);
                    class79.field1794.method326(class153.field3759, (byte) -74);
                    class79.field1794.method326(89, (byte) -64);
                    class79.field1794.method325(class94.field2197.field2916, -109);
                    class79.field1794.method325(class94.field2197.field2909, 76);
                    class79.field1794.method326(class121.field3169, (byte) -96);
                    class79.field1794.method326(63, (byte) -34);
                }
            }
        }
        if (arg0 > -86) {
            field1343 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 553)
    public static void method570(byte arg0) {
        field1354 = null;
        field1361 = null;
        field1360 = null;
        field1348 = null;
        field1357 = null;
        field1350 = null;
        field1353 = null;
        field1364 = null;
        if (arg0 <= 5) {
            return;
        }
        field1356 = null;
        field1345 = null;
        field1347 = null;
        field1367 = null;
        field1343 = null;
        field1351 = null;
        field1358 = null;
        field1340 = null;
    }
}
