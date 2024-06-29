import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class284 {

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field4854 = 0;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Lga;")
    public static class18 field4850 = new class18();

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "[J")
    public static long[] field4856 = new long[256];

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method1953(boolean arg0) {
        if (class263.field4484 != null) {
            class263.field4484.method1282(true);
            class263.field4484 = null;
        }
        field4849++;
        class176.method1160(76);
        class116.method751();
        for (int var1 = 0; var1 < 4; var1++) {
            class180.field3102[var1].method688((byte) 32);
        }
        class79.method522(0);
        System.gc();
        class267.method1802(2, 16);
        class232.field3936 = -1;
        class306.field5263 = false;
        class169.method1072((byte) -95, true);
        class107.field1833 = 0;
        class183.field3158 = false;
        class214.field3637 = 0;
        for (int var2 = 0; var2 < class38.field555.length; var2++) {
            class38.field555[var2] = null;
        }
        class297.field5033 = 0;
        class242.field4078 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class149.field2436[var3] = null;
            class177.field3041[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class33.field493[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class177.field3046[var5][var6][var7] = null;
                }
            }
        }
        class40.method250(arg0);
        class245.field4173 = 0;
        class241.method1620(28);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBI)V", line = 96)
    public static final void method1954(int arg0, byte arg1, int arg2) {
        if (arg1 > -24) {
            field4856 = (long[]) null;
        }
        if (arg2 == 4 && !class2.field26) {
            arg0 = 2;
            arg2 = 2;
        }
        field4852++;
        if (class38.field547 != arg2) {
            if (class1.field7) {
                return;
            }
            if (class38.field547 != 0) {
                class207.field3560[class38.field547].method245();
            }
            if (arg2 != 0) {
                class39 var3 = class207.field3560[arg2];
                var3.method247();
                var3.method246(arg0);
            }
            class283.field4823 = arg0;
            class38.field547 = arg2;
        } else if (arg2 != 0 && class283.field4823 != arg0) {
            class207.field3560[arg2].method246(arg0);
            class283.field4823 = arg0;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V", line = 155)
    public static void method1955(byte arg0) {
        field4850 = null;
        int var1 = 16 / ((61 - arg0) / 44);
        field4856 = null;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V", line = 165)
    public static final void method1956(byte arg0) {
        field4847++;
        class138 var1 = class121.field2017;
        synchronized (class121.field2017) {
            class177.field3051 = class18.field215;
            if (arg0 <= 90) {
                method1956((byte) -70);
            }
            class237.field3963++;
            class109.field1849 = class30.field464;
            class163.field2700 = class226.field3807;
            class61.field859 = class92.field1558;
            class47.field647 = class192.field3292;
            class269.field4537 = class7.field78;
            class116.field1974 = class154.field2531;
            class92.field1558 = 0;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()V", line = 191)
    public static final void method1957() {
        class162.field2661 = (class160[][][]) null;
        class140.field2329 = (int[][]) null;
        class228.field3834 = (int[][][]) null;
        class199.field3396 = (class100[][]) null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(JIIIILbe;B)V", line = 201)
    public static final void method1958(long arg0, int arg1, int arg2, int arg3, int arg4, class283 arg5, byte arg6) {
        field4851++;
        class229 var8 = new class229(128);
        var8.method1499(true, 10);
        var8.method1510((byte) 56, (int) (Math.random() * 99999.0D));
        var8.method1510((byte) 108, 511);
        var8.method1544((byte) 8, arg0);
        var8.method1515((int) (Math.random() * 9.9999999E7D), 113);
        var8.method1520(arg5, -95);
        var8.method1515((int) (Math.random() * 9.9999999E7D), 94);
        var8.method1510((byte) 96, class303.field5117);
        var8.method1499(true, arg1);
        var8.method1499(true, arg2);
        var8.method1515((int) (Math.random() * 9.9999999E7D), 56);
        var8.method1510((byte) 98, arg4);
        var8.method1510((byte) 63, arg3);
        if (arg6 > -7) {
            field4854 = 53;
        }
        var8.method1515((int) (Math.random() * 9.9999999E7D), 55);
        var8.method1500(class6.field53, class190.field3245, 114);
        class228.field3831.field3905 = 0;
        class228.field3831.method1499(true, 134);
        class228.field3831.method1499(true, var8.field3905);
        class228.field3831.method1530(0, var8.field3905, true, var8.field3879);
        class2.field20 = -3;
        class194.field3316 = 1;
        class62.field862 = 0;
        class166.field2773 = 0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4856[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIII)V", line = 252)
    public static final void method1959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class222.field3727 == 0) {
            class254.field4286++;
            int var7 = class195.field3324;
            int var8 = class138.field2291;
            int var9 = class103.field1762;
            int var10 = class305.field5202;
            int var11 = (arg4 - arg6) * (var9 - var10) / arg0 + var10;
            int var12 = (arg5 - arg3) * (var8 - var7) / arg2 + var7;
            if (class103.field1760 && (class12.field112 & 0x40) == 64) {
                class69 var13 = class225.method1480((byte) 126, class175.field3023, class143.field2373);
                if (var13 == null) {
                    class46.method270(-102);
                } else {
                    class275.method1848(var12, class89.field1514, 0L, (byte) -60, var11, class174.field2979, (short) 7);
                }
            } else {
                class275.method1848(var12, class180.field3114, 0L, (byte) -60, var11, class213.field3616, (short) 35);
            }
        }
        field4853++;
        long var14 = -1L;
        if (arg1 != -15801) {
            field4854 = 76;
        }
        for (int var16 = 0; var16 < class278.field4648; var16++) {
            long var17 = class262.field4464[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) var17 >> 29 & 0x3;
            int var21 = ((int) var17 & 0x3FC5) >> 7;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var20 == 2 && class88.method565(class61.field850, var19, var21, var17)) {
                    class281 var23 = class254.method1722(0, var22);
                    if (var23.field4752 != null) {
                        var23 = var23.method1873((byte) 40);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class222.field3727 == 1) {
                        class192.field3295++;
                        class275.method1848(var19, class40.field562, var17, (byte) -60, var21, class299.method2022(new class283[] { class222.field3745, class90.field1520, var23.field4715 }, (byte) 76), (short) 24);
                    } else if (!class103.field1760) {
                        class307.field5268++;
                        class283[] var24 = var23.field4740;
                        if (class164.field2707) {
                            var24 = class71.method468(var24, (byte) -120);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class104.field1774++;
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 57;
                                    }
                                    if (var25 == 1) {
                                        var26 = 38;
                                    }
                                    if (var25 == 2) {
                                        var26 = 42;
                                    }
                                    if (var25 == 3) {
                                        var26 = 30;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1006;
                                    }
                                    class275.method1848(var19, var24[var25], var17, (byte) -60, var21, class299.method2022(new class283[] { class70.field1196, var23.field4715 }, (byte) 105), var26);
                                }
                            }
                        }
                        class275.method1848(var19, class298.field5042, (long) var23.field4693, (byte) -60, var21, class299.method2022(new class283[] { class70.field1196, var23.field4715 }, (byte) 114), (short) 1002);
                    } else if ((class12.field112 & 0x4) == 4) {
                        class248.field4231++;
                        class275.method1848(var19, class89.field1514, var17, (byte) -60, var21, class299.method2022(new class283[] { class135.field2272, class90.field1520, var23.field4715 }, (byte) 124), (short) 21);
                    }
                }
                if (var20 == 1) {
                    class60 var27 = class33.field493[var22];
                    if (var27.field822.field2157 == 1 && (var27.field1193 & 0x7F) == 64 && (var27.field1210 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < class242.field4078; var28++) {
                            class60 var29 = class33.field493[class219.field3698[var28]];
                            if (var29 != null && var27 != var29 && var29.field822.field2157 == 1 && var27.field1193 == var29.field1193 && var27.field1210 == var29.field1210) {
                                class184.method1215(var19, var21, (byte) -124, var29.field822, class219.field3698[var28]);
                            }
                        }
                        for (int var30 = 0; var30 < class297.field5033; var30++) {
                            class191 var31 = class149.field2436[class162.field2666[var30]];
                            if (var31 != null && var27.field1193 == var31.field1193 && var27.field1210 == var31.field1210) {
                                class220.method1443(-93, var31, class162.field2666[var30], var21, var19);
                            }
                        }
                    }
                    class184.method1215(var19, var21, (byte) -124, var27.field822, var22);
                }
                if (var20 == 0) {
                    class191 var32 = class149.field2436[var22];
                    if ((var32.field1193 & 0x7F) == 64 && (var32.field1210 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < class242.field4078; var33++) {
                            class60 var34 = class33.field493[class219.field3698[var33]];
                            if (var34 != null && var34.field822.field2157 == 1 && var32.field1193 == var34.field1193 && var32.field1210 == var34.field1210) {
                                class184.method1215(var19, var21, (byte) -125, var34.field822, class219.field3698[var33]);
                            }
                        }
                        for (int var35 = 0; var35 < class297.field5033; var35++) {
                            class191 var36 = class149.field2436[class162.field2666[var35]];
                            if (var36 != null && var32 != var36 && var32.field1193 == var36.field1193 && var32.field1210 == var36.field1210) {
                                class220.method1443(arg1 + 15916, var36, class162.field2666[var35], var21, var19);
                            }
                        }
                    }
                    class220.method1443(94, var32, var22, var21, var19);
                }
                if (var20 == 3) {
                    class269 var37 = class177.field3046[class61.field850][var19][var21];
                    if (var37 != null) {
                        for (class215 var38 = (class215) var37.method1816(arg1 + 15929); var38 != null; var38 = (class215) var37.method1811(3)) {
                            int var39 = var38.field3641.field789;
                            class304 var40 = class103.method676(var39, -1);
                            if (class222.field3727 == 1) {
                                class275.method1848(var19, class40.field562, (long) var39, (byte) -60, var21, class299.method2022(new class283[] { class222.field3745, class168.field2816, var40.field5155 }, (byte) 21), (short) 26);
                                class19.field229++;
                            } else if (!class103.field1760) {
                                class283[] var41 = var40.field5151;
                                class18.field213++;
                                if (class164.field2707) {
                                    var41 = class71.method468(var41, (byte) -116);
                                }
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        class270.field4555++;
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 34;
                                        }
                                        if (var42 == 1) {
                                            var43 = 36;
                                        }
                                        if (var42 == 2) {
                                            var43 = 44;
                                        }
                                        if (var42 == 3) {
                                            var43 = 19;
                                        }
                                        if (var42 == 4) {
                                            var43 = 33;
                                        }
                                        class275.method1848(var19, var41[var42], (long) var39, (byte) -60, var21, class299.method2022(new class283[] { class245.field4163, var40.field5155 }, (byte) 9), var43);
                                    } else if (var42 == 2) {
                                        class275.method1848(var19, class58.field793, (long) var39, (byte) -60, var21, class299.method2022(new class283[] { class245.field4163, var40.field5155 }, (byte) 89), (short) 44);
                                        class296.field5022++;
                                    }
                                }
                                class275.method1848(var19, class298.field5042, (long) var39, (byte) -60, var21, class299.method2022(new class283[] { class245.field4163, var40.field5155 }, (byte) 12), (short) 1004);
                            } else if ((class12.field112 & 0x1) == 1) {
                                class275.method1848(var19, class89.field1514, (long) var39, (byte) -60, var21, class299.method2022(new class283[] { class135.field2272, class168.field2816, var40.field5155 }, (byte) 33), (short) 6);
                                class216.field3665++;
                            }
                        }
                    }
                }
            }
        }
    }
}
