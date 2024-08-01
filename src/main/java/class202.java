import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("w")
public class class202 implements Runnable {

    @OriginalMember(owner = "w", name = "a", descriptor = "Llf;")
    public static class109 field3971 = class35.method275(" )2> <col=00ffff>", 2);

    @OriginalMember(owner = "w", name = "c", descriptor = "I")
    public static int field3973 = 0;

    @OriginalMember(owner = "w", name = "l", descriptor = "I")
    public static int field3982 = 0;

    @OriginalMember(owner = "w", name = "e", descriptor = "[Lu;")
    public static class184[] field3975 = new class184[2048];

    @OriginalMember(owner = "w", name = "m", descriptor = "I")
    public static int field3983 = 0;

    @OriginalMember(owner = "w", name = "b", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "w", name = "d", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "w", name = "h", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "w", name = "i", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "w", name = "j", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "w", name = "k", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "w", name = "f", descriptor = "[I")
    public static int[] field3976;

    @OriginalMember(owner = "w", name = "g", descriptor = "[I")
    public static int[] field3977;

    @OriginalMember(owner = "w", name = "a", descriptor = "(IIIIILlb;II)V")
    public static final void method1329(int arg0, int arg1, int arg2, int arg3, int arg4, class105 arg5, int arg6, int arg7) {
        field3980++;
        if (class181.field3420 && (class88.field1827[0][arg6][arg7] & 0x2) == 0) {
            if ((class88.field1827[arg0][arg6][arg7] & 0x10) != 0) {
                return;
            }
            if (class161.method1097(arg7, (byte) -99, arg0, arg6) != class165.field3101) {
                return;
            }
        }
        if (arg0 < class83.field1687) {
            class83.field1687 = arg0;
        }
        class78 var8 = class140.method1000(arg1, 0);
        int var9;
        int var10;
        if (arg2 == 1 || arg2 == 3) {
            var10 = var8.field1501;
            var9 = var8.field1498;
        } else {
            var9 = var8.field1501;
            var10 = var8.field1498;
        }
        if (arg4 != 16) {
            field3973 = -18;
        }
        int var11;
        int var12;
        if (arg6 + var9 <= 104) {
            var11 = (var9 + 1 >> 1) + arg6;
            var12 = (var9 >> 1) + arg6;
        } else {
            var11 = arg6 + 1;
            var12 = arg6;
        }
        int var13;
        int var14;
        if (arg7 + var10 > 104) {
            var13 = arg7;
            var14 = arg7 + 1;
        } else {
            var13 = arg7 + (var10 >> 1);
            var14 = (var10 + 1 >> 1) + arg7;
        }
        int[][] var15 = class184.field3448[arg0];
        int var16 = (arg6 << 7) + (var9 << 6);
        int var17 = (arg7 << 7) + (var10 << 6);
        int var18 = var15[var11][var13] + var15[var12][var14] + var15[var11][var14] + var15[var12][var13] >> 2;
        long var19 = (long) (arg6 | 0x40000000 | arg7 << 7 | arg3 << 14 | arg2 << 20);
        if (var8.field1527 == 0) {
            var19 |= Long.MIN_VALUE;
        }
        if (var8.field1502 == 1) {
            var19 |= 0x400000L;
        }
        long var21 = var19 | (long) arg1 << 32;
        if (var8.method501(arg4 - 17)) {
            class152.method1047(arg2, -107, arg7, var8, arg0, arg6);
        }
        if (arg3 == 22) {
            if (!class181.field3420 || var8.field1527 != 0 || var8.field1511 == 1 || var8.field1526) {
                class95 var23;
                if (var8.field1544 == -1 && var8.field1528 == null) {
                    var23 = var8.method493(var17, var16, 22, arg2, -1, var18, var15);
                } else {
                    var23 = new class19(arg1, 22, arg2, arg0, arg6, arg7, var8.field1544, true, null);
                }
                class169.method1132(arg0, arg6, arg7, var18, var23, var21);
                if (var8.field1511 == 1 && arg5 != null) {
                    arg5.method757(arg7, arg6, (byte) 123);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class95 var49;
            if (var8.field1544 == -1 && var8.field1528 == null) {
                var49 = var8.method493(var17, var16, 10, arg2, -1, var18, var15);
            } else {
                var49 = new class19(arg1, 10, arg2, arg0, arg6, arg7, var8.field1544, true, null);
            }
            if (var49 != null && class206.method1350(arg0, arg6, arg7, var18, var9, var10, var49, arg3 == 11 ? 256 : 0, var21) && var8.field1538) {
                int var50 = 15;
                if (var49 instanceof class189) {
                    var50 = ((class189) var49).method1280() / 4;
                    if (var50 > 30) {
                        var50 = 30;
                    }
                }
                for (int var51 = 0; var51 <= var9; var51++) {
                    for (int var52 = 0; var52 <= var10; var52++) {
                        if (var50 > class204.field4018[arg0][arg6 + var51][arg7 + var52]) {
                            class204.field4018[arg0][arg6 + var51][arg7 + var52] = (byte) var50;
                        }
                    }
                }
            }
            if (var8.field1511 != 0 && arg5 != null) {
                arg5.method752(arg6, var9, true, var8.field1539, arg7, var10);
            }
        } else if (arg3 >= 12) {
            class95 var24;
            if (var8.field1544 == -1 && var8.field1528 == null) {
                var24 = var8.method493(var17, var16, arg3, arg2, -1, var18, var15);
            } else {
                var24 = new class19(arg1, arg3, arg2, arg0, arg6, arg7, var8.field1544, true, null);
            }
            class206.method1350(arg0, arg6, arg7, var18, 1, 1, var24, 0, var21);
            if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg0 > 0) {
                class187.field3577[arg0][arg6][arg7] = class31.method262(class187.field3577[arg0][arg6][arg7], 2340);
            }
            if (var8.field1511 != 0 && arg5 != null) {
                arg5.method752(arg6, var9, true, var8.field1539, arg7, var10);
            }
        } else if (arg3 == 0) {
            class95 var25;
            if (var8.field1544 == -1 && var8.field1528 == null) {
                var25 = var8.method493(var17, var16, 0, arg2, -1, var18, var15);
            } else {
                var25 = new class19(arg1, 0, arg2, arg0, arg6, arg7, var8.field1544, true, null);
            }
            class127.method923(arg0, arg6, arg7, var18, var25, null, class21.field471[arg2], 0, var21);
            if (arg2 == 0) {
                if (var8.field1538) {
                    class204.field4018[arg0][arg6][arg7] = 50;
                    class204.field4018[arg0][arg6][arg7 + 1] = 50;
                }
                if (var8.field1537) {
                    class187.field3577[arg0][arg6][arg7] = class31.method262(class187.field3577[arg0][arg6][arg7], 585);
                }
            } else if (arg2 == 1) {
                if (var8.field1538) {
                    class204.field4018[arg0][arg6][arg7 + 1] = 50;
                    class204.field4018[arg0][arg6 + 1][arg7 + 1] = 50;
                }
                if (var8.field1537) {
                    class187.field3577[arg0][arg6][arg7 + 1] = class31.method262(class187.field3577[arg0][arg6][arg7 + 1], 1170);
                }
            } else if (arg2 == 2) {
                if (var8.field1538) {
                    class204.field4018[arg0][arg6 + 1][arg7] = 50;
                    class204.field4018[arg0][arg6 + 1][arg7 + 1] = 50;
                }
                if (var8.field1537) {
                    class187.field3577[arg0][arg6 + 1][arg7] = class31.method262(class187.field3577[arg0][arg6 + 1][arg7], 585);
                }
            } else if (arg2 == 3) {
                if (var8.field1538) {
                    class204.field4018[arg0][arg6][arg7] = 50;
                    class204.field4018[arg0][arg6 + 1][arg7] = 50;
                }
                if (var8.field1537) {
                    class187.field3577[arg0][arg6][arg7] = class31.method262(class187.field3577[arg0][arg6][arg7], 1170);
                }
            }
            if (var8.field1511 != 0 && arg5 != null) {
                arg5.method756(arg6, var8.field1539, arg2, -1, arg3, arg7);
            }
            if (var8.field1510 != 16) {
                class186.method1263(arg0, arg6, arg7, var8.field1510);
            }
        } else if (arg3 == 1) {
            class95 var26;
            if (var8.field1544 == -1 && var8.field1528 == null) {
                var26 = var8.method493(var17, var16, 1, arg2, -1, var18, var15);
            } else {
                var26 = new class19(arg1, 1, arg2, arg0, arg6, arg7, var8.field1544, true, null);
            }
            class127.method923(arg0, arg6, arg7, var18, var26, null, class24.field535[arg2], 0, var21);
            if (var8.field1538) {
                if (arg2 == 0) {
                    class204.field4018[arg0][arg6][arg7 + 1] = 50;
                } else if (arg2 == 1) {
                    class204.field4018[arg0][arg6 + 1][arg7 + 1] = 50;
                } else if (arg2 == 2) {
                    class204.field4018[arg0][arg6 + 1][arg7] = 50;
                } else if (arg2 == 3) {
                    class204.field4018[arg0][arg6][arg7] = 50;
                }
            }
            if (var8.field1511 != 0 && arg5 != null) {
                arg5.method756(arg6, var8.field1539, arg2, -1, arg3, arg7);
            }
        } else if (arg3 == 2) {
            int var27 = arg2 + 1 & 0x3;
            class95 var28;
            class95 var29;
            if (var8.field1544 == -1 && var8.field1528 == null) {
                var28 = var8.method493(var17, var16, 2, arg2 + 4, -1, var18, var15);
                var29 = var8.method493(var17, var16, 2, var27, arg4 ^ 0xFFFFFFEF, var18, var15);
            } else {
                var28 = new class19(arg1, 2, arg2 + 4, arg0, arg6, arg7, var8.field1544, true, null);
                var29 = new class19(arg1, 2, var27, arg0, arg6, arg7, var8.field1544, true, null);
            }
            class127.method923(arg0, arg6, arg7, var18, var28, var29, class21.field471[arg2], class21.field471[var27], var21);
            if (var8.field1537) {
                if (arg2 == 0) {
                    class187.field3577[arg0][arg6][arg7] = class31.method262(class187.field3577[arg0][arg6][arg7], 585);
                    class187.field3577[arg0][arg6][arg7 + 1] = class31.method262(class187.field3577[arg0][arg6][arg7 + 1], 1170);
                } else if (arg2 == 1) {
                    class187.field3577[arg0][arg6][arg7 + 1] = class31.method262(class187.field3577[arg0][arg6][arg7 + 1], 1170);
                    class187.field3577[arg0][arg6 + 1][arg7] = class31.method262(class187.field3577[arg0][arg6 + 1][arg7], 585);
                } else if (arg2 == 2) {
                    class187.field3577[arg0][arg6 + 1][arg7] = class31.method262(class187.field3577[arg0][arg6 + 1][arg7], 585);
                    class187.field3577[arg0][arg6][arg7] = class31.method262(class187.field3577[arg0][arg6][arg7], 1170);
                } else if (arg2 == 3) {
                    class187.field3577[arg0][arg6][arg7] = class31.method262(class187.field3577[arg0][arg6][arg7], 1170);
                    class187.field3577[arg0][arg6][arg7] = class31.method262(class187.field3577[arg0][arg6][arg7], 585);
                }
            }
            if (var8.field1511 != 0 && arg5 != null) {
                arg5.method756(arg6, var8.field1539, arg2, -1, arg3, arg7);
            }
            if (var8.field1510 != 16) {
                class186.method1263(arg0, arg6, arg7, var8.field1510);
            }
        } else if (arg3 == 3) {
            class95 var30;
            if (var8.field1544 == -1 && var8.field1528 == null) {
                var30 = var8.method493(var17, var16, 3, arg2, -1, var18, var15);
            } else {
                var30 = new class19(arg1, 3, arg2, arg0, arg6, arg7, var8.field1544, true, null);
            }
            class127.method923(arg0, arg6, arg7, var18, var30, null, class24.field535[arg2], 0, var21);
            if (var8.field1538) {
                if (arg2 == 0) {
                    class204.field4018[arg0][arg6][arg7 + 1] = 50;
                } else if (arg2 == 1) {
                    class204.field4018[arg0][arg6 + 1][arg7 + 1] = 50;
                } else if (arg2 == 2) {
                    class204.field4018[arg0][arg6 + 1][arg7] = 50;
                } else if (arg2 == 3) {
                    class204.field4018[arg0][arg6][arg7] = 50;
                }
            }
            if (var8.field1511 != 0 && arg5 != null) {
                arg5.method756(arg6, var8.field1539, arg2, -1, arg3, arg7);
            }
        } else if (arg3 == 9) {
            class95 var31;
            if (var8.field1544 == -1 && var8.field1528 == null) {
                var31 = var8.method493(var17, var16, arg3, arg2, -1, var18, var15);
            } else {
                var31 = new class19(arg1, arg3, arg2, arg0, arg6, arg7, var8.field1544, true, null);
            }
            class206.method1350(arg0, arg6, arg7, var18, 1, 1, var31, 0, var21);
            if (var8.field1511 != 0 && arg5 != null) {
                arg5.method752(arg6, var9, true, var8.field1539, arg7, var10);
            }
            if (var8.field1510 != 16) {
                class186.method1263(arg0, arg6, arg7, var8.field1510);
            }
        } else if (arg3 == 4) {
            class95 var32;
            if (var8.field1544 == -1 && var8.field1528 == null) {
                var32 = var8.method493(var17, var16, 4, arg2, arg4 ^ 0xFFFFFFEF, var18, var15);
            } else {
                var32 = new class19(arg1, 4, arg2, arg0, arg6, arg7, var8.field1544, true, null);
            }
            class36.method277(arg0, arg6, arg7, var18, var32, null, class21.field471[arg2], 0, 0, 0, var21);
        } else if (arg3 == 5) {
            long var33 = class18.method155(arg0, arg6, arg7);
            int var35 = 16;
            if (var33 != 0L) {
                var35 = class140.method1000((int) (var33 >>> 32) & Integer.MAX_VALUE, 0).field1510;
            }
            class95 var36;
            if (var8.field1544 == -1 && var8.field1528 == null) {
                var36 = var8.method493(var17, var16, 4, arg2, -1, var18, var15);
            } else {
                var36 = new class19(arg1, 4, arg2, arg0, arg6, arg7, var8.field1544, true, null);
            }
            class36.method277(arg0, arg6, arg7, var18, var36, null, class21.field471[arg2], 0, class95.field1939[arg2] * var35, class203.field3996[arg2] * var35, var21);
        } else if (arg3 == 6) {
            int var37 = 8;
            long var38 = class18.method155(arg0, arg6, arg7);
            if (var38 != 0L) {
                var37 = class140.method1000(Integer.MAX_VALUE & (int) (var38 >>> 32), 0).field1510 / 2;
            }
            class95 var40;
            if (var8.field1544 == -1 && var8.field1528 == null) {
                var40 = var8.method493(var17, var16, 4, arg2 + 4, -1, var18, var15);
            } else {
                var40 = new class19(arg1, 4, arg2 + 4, arg0, arg6, arg7, var8.field1544, true, null);
            }
            class36.method277(arg0, arg6, arg7, var18, var40, null, 256, arg2, class42.field885[arg2] * var37, class103.field2045[arg2] * var37, var21);
        } else if (arg3 == 7) {
            int var41 = arg2 + 2 & 0x3;
            class95 var42;
            if (var8.field1544 == -1 && var8.field1528 == null) {
                var42 = var8.method493(var17, var16, 4, var41 + 4, -1, var18, var15);
            } else {
                var42 = new class19(arg1, 4, var41 + 4, arg0, arg6, arg7, var8.field1544, true, null);
            }
            class36.method277(arg0, arg6, arg7, var18, var42, null, 256, var41, 0, 0, var21);
        } else if (arg3 == 8) {
            long var43 = class18.method155(arg0, arg6, arg7);
            int var45 = 8;
            if (var43 != 0L) {
                var45 = class140.method1000(Integer.MAX_VALUE & (int) (var43 >>> 32), 0).field1510 / 2;
            }
            int var46 = arg2 + 2 & 0x3;
            class95 var47;
            class95 var48;
            if (var8.field1544 == -1 && var8.field1528 == null) {
                var47 = var8.method493(var17, var16, 4, arg2 + 4, arg4 ^ 0xFFFFFFEF, var18, var15);
                var48 = var8.method493(var17, var16, 4, var46 + 4, -1, var18, var15);
            } else {
                var47 = new class19(arg1, 4, arg2 + 4, arg0, arg6, arg7, var8.field1544, true, null);
                var48 = new class19(arg1, 4, var46 + 4, arg0, arg6, arg7, var8.field1544, true, null);
            }
            class36.method277(arg0, arg6, arg7, var18, var47, var48, 256, arg2, class42.field885[arg2] * var45, class103.field2045[arg2] * var45, var21);
        }
    }

    @OriginalMember(owner = "w", name = "a", descriptor = "(B)V")
    public static void method1330(byte arg0) {
        field3977 = null;
        if (arg0 != -92) {
            method1332(35, null, 61, 51);
        }
        field3976 = null;
        field3971 = null;
        field3975 = null;
    }

    @OriginalMember(owner = "w", name = "run", descriptor = "()V")
    public final void run() {
        field3979++;
        try {
            while (true) {
                class181 var1 = class51.field1037;
                class136 var2;
                synchronized (class51.field1037) {
                    var2 = (class136) class51.field1037.method1230(122);
                }
                if (var2 == null) {
                    class54.method354(100L, 69);
                    Object var6 = class203.field3987;
                    synchronized (class203.field3987) {
                        if (class21.field475 <= 1) {
                            class21.field475 = 0;
                            class203.field3987.notifyAll();
                            return;
                        }
                        class21.field475--;
                    }
                } else {
                    if (var2.field2626 == 0) {
                        var2.field2624.method1344(var2.field2635, (int) var2.field1381, 255, var2.field2635.length);
                        class181 var4 = class51.field1037;
                        synchronized (class51.field1037) {
                            var2.method452(true);
                        }
                    } else if (var2.field2626 == 1) {
                        var2.field2635 = var2.field2624.method1342((int) var2.field1381, (byte) 97);
                        class181 var3 = class51.field1037;
                        synchronized (class51.field1037) {
                            class72.field1395.method1231(var2, 0);
                        }
                    }
                    Object var5 = class203.field3987;
                    synchronized (class203.field3987) {
                        if (class21.field475 <= 1) {
                            class21.field475 = 0;
                            class203.field3987.notifyAll();
                            return;
                        }
                        class21.field475 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class9.method43(null, -80, var17);
        }
    }

    @OriginalMember(owner = "w", name = "b", descriptor = "(B)V")
    public static final void method1331(byte arg0) {
        field3978++;
        for (class91 var1 = (class91) class148.field2854.method1230(82); var1 != null; var1 = (class91) class148.field2854.method1234(-1)) {
            if (var1.field1871 != null) {
                var1.method664(0);
            }
        }
        if (arg0 > -122) {
            method1332(-53, null, 116, 50);
        }
    }

    @OriginalMember(owner = "w", name = "a", descriptor = "(ILvg;II)V")
    public static final void method1332(int arg0, class200 arg1, int arg2, int arg3) {
        int var4 = -46 / ((arg0 + 24) / 57);
        if (arg1.field3922 == 1) {
            class136.field2630++;
            class12.method81(arg1.field3866, 0, arg1.field3818, (short) 34, 0L, 500, class174.field3306);
        }
        field3981++;
        if (arg1.field3922 == 2 && !class123.field2360) {
            class109 var5 = class8.method37(0, arg1);
            if (var5 != null) {
                class12.method81(arg1.field3866, -1, var5, (short) 28, 0L, 500, class36.method279(new class109[] { class40.field840, arg1.field3923 }, 127));
                class199.field3806++;
            }
        }
        if (arg1.field3922 == 3) {
            class131.field2538++;
            class12.method81(arg1.field3866, 0, class178.field3364, (short) 16, 0L, 500, class174.field3306);
        }
        if (arg1.field3922 == 4) {
            class12.method81(arg1.field3866, 0, arg1.field3818, (short) 21, 0L, 500, class174.field3306);
            class147.field2830++;
        }
        if (arg1.field3922 == 5) {
            class39.field833++;
            class12.method81(arg1.field3866, 0, arg1.field3818, (short) 10, 0L, 500, class174.field3306);
        }
        if (arg1.field3922 == 6 && class159.field2980 == null) {
            class12.method81(arg1.field3866, -1, arg1.field3818, (short) 36, 0L, 500, class174.field3306);
            class200.field3951++;
        }
        if (arg1.field3875 == 2) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.field3901; var7++) {
                for (int var8 = 0; var8 < arg1.field3881; var8++) {
                    int var9 = (arg1.field3827 + 32) * var8;
                    int var10 = (arg1.field3948 + 32) * var7;
                    if (var6 < 20) {
                        var9 += arg1.field3870[var6];
                        var10 += arg1.field3884[var6];
                    }
                    if (var9 <= arg3 && arg2 >= var10 && arg3 < var9 + 32 && var10 + 32 > arg2) {
                        class7.field106 = arg1;
                        class159.field2978 = var6;
                        if (arg1.field3925[var6] > 0) {
                            class83 var11 = class128.method926(arg1.field3925[var6] - 1, -4);
                            if (class140.field2725 == 1 && class18.method153(class126.method918(arg1, 113), 16908)) {
                                if (class96.field1959 != arg1.field3866 || class47.field973 != var6) {
                                    class178.field3357++;
                                    class12.method81(arg1.field3866, var6, class70.field1350, (short) 4, (long) var11.field1639, 500, class36.method279(new class109[] { class204.field4001, class85.field1743, var11.field1644 }, -73));
                                }
                            } else if (!class123.field2360 || !class18.method153(class126.method918(arg1, 99), 16908)) {
                                class131.field2535++;
                                class109[] var12 = var11.field1681;
                                if (class10.field165) {
                                    var12 = class103.method741((byte) -95, var12);
                                }
                                if (class18.method153(class126.method918(arg1, 120), 16908)) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var12 != null && var12[var13] != null) {
                                            byte var14;
                                            if (var13 == 3) {
                                                var14 = 20;
                                            } else {
                                                var14 = 3;
                                            }
                                            class12.method81(arg1.field3866, var6, var12[var13], var14, (long) var11.field1639, 500, class36.method279(new class109[] { class79.field1559, var11.field1644 }, -47));
                                            field3974++;
                                        } else if (var13 == 4) {
                                            class40.field853++;
                                            class12.method81(arg1.field3866, var6, class77.field1484, (short) 3, (long) var11.field1639, 500, class36.method279(new class109[] { class79.field1559, var11.field1644 }, -32));
                                        }
                                    }
                                }
                                if (class178.method1212(1, class126.method918(arg1, 120))) {
                                    class12.method81(arg1.field3866, var6, class70.field1350, (short) 17, (long) var11.field1639, 500, class36.method279(new class109[] { class79.field1559, var11.field1644 }, 122));
                                    class174.field3241++;
                                }
                                if (class18.method153(class126.method918(arg1, 125), 16908) && var12 != null) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var12[var15] != null) {
                                            class184.field3450++;
                                            byte var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 15;
                                            }
                                            if (var15 == 1) {
                                                var16 = 29;
                                            }
                                            if (var15 == 2) {
                                                var16 = 7;
                                            }
                                            class12.method81(arg1.field3866, var6, var12[var15], var16, (long) var11.field1639, 500, class36.method279(new class109[] { class79.field1559, var11.field1644 }, 127));
                                        }
                                    }
                                }
                                class109[] var17 = arg1.field3944;
                                if (class10.field165) {
                                    var17 = class103.method741((byte) -97, var17);
                                }
                                if (var17 != null) {
                                    for (int var18 = 4; var18 >= 0; var18--) {
                                        if (var17[var18] != null) {
                                            class163.field3046++;
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 39;
                                            }
                                            if (var18 == 1) {
                                                var19 = 45;
                                            }
                                            if (var18 == 2) {
                                                var19 = 24;
                                            }
                                            if (var18 == 3) {
                                                var19 = 41;
                                            }
                                            if (var18 == 4) {
                                                var19 = 42;
                                            }
                                            class12.method81(arg1.field3866, var6, var17[var18], var19, (long) var11.field1639, 500, class36.method279(new class109[] { class79.field1559, var11.field1644 }, -3));
                                        }
                                    }
                                }
                                class12.method81(arg1.field3866, var6, class55.field1103, (short) 1005, (long) var11.field1639, 500, class36.method279(new class109[] { class79.field1559, var11.field1644 }, 117));
                            } else if ((class156.field2939 & 0x10) == 16) {
                                class163.field3045++;
                                class12.method81(arg1.field3866, var6, class116.field2296, (short) 46, (long) var11.field1639, 500, class36.method279(new class109[] { class170.field3161, class85.field1743, var11.field1644 }, -16));
                            }
                        }
                    }
                    var6++;
                }
            }
        }
        if (!arg1.field3946) {
            return;
        }
        if (!class123.field2360) {
            for (int var20 = 9; var20 >= 5; var20--) {
                class109 var24 = class24.method213(arg1, (byte) 107, var20);
                if (var24 != null) {
                    class12.method81(arg1.field3866, arg1.field3900, var24, (short) 1002, (long) (var20 + 1), 500, arg1.field3821);
                    class181.field3418++;
                }
            }
            class109 var21 = class8.method37(0, arg1);
            if (var21 != null) {
                class12.method81(arg1.field3866, arg1.field3900, var21, (short) 28, 0L, 500, arg1.field3821);
                class199.field3806++;
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class109 var23 = class24.method213(arg1, (byte) 115, var22);
                if (var23 != null) {
                    class12.method81(arg1.field3866, arg1.field3900, var23, (short) 14, (long) (var22 + 1), 500, arg1.field3821);
                    class181.field3418++;
                }
            }
            if (!class41.method302((byte) -19, class126.method918(arg1, 124))) {
                return;
            }
            class12.method81(arg1.field3866, arg1.field3900, class117.field2307, (short) 36, 0L, 500, class174.field3306);
            class200.field3951++;
        } else if (class42.method304(class126.method918(arg1, 99), 2547355) && (class156.field2939 & 0x20) == 32) {
            class159.field2977++;
            class12.method81(arg1.field3866, arg1.field3900, class116.field2296, (short) 44, 0L, 500, class36.method279(new class109[] { class170.field3161, class115.field2281, arg1.field3821 }, -90));
            return;
        }
    }
}
