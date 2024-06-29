import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class23 implements Runnable {

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Lwg;")
    private class198 field335 = new class198();

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public int field343 = 0;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Z")
    private boolean field351 = false;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field350;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Lui;")
    public static class98 field342 = new class98(50);

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "Ll;")
    public static class12 field353 = null;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Z")
    public static boolean field345;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "[[B")
    public static byte[][] field352;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILsl;)V", line = 5)
    private final void method199(int arg0, class212 arg1) {
        field346++;
        class198 var3 = this.field335;
        synchronized (this.field335) {
            if (arg0 != 26353) {
                this.field350 = (Thread) null;
            }
            this.field335.method1353(-1, arg1);
            this.field343++;
            this.field335.notifyAll();
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)J", line = 21)
    public static final long method200(int arg0, int arg1, int arg2) {
        class50 var3 = class264.field4230[arg0][arg1][arg2];
        return var3 == null || var3.field747 == null ? 0L : var3.field747.field3128;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lqe;IB)Lsl;", line = 33)
    public final class212 method201(class218 arg0, int arg1, byte arg2) {
        class212 var4 = new class212();
        field344++;
        var4.field3222 = 1;
        class198 var5 = this.field335;
        synchronized (this.field335) {
            class212 var6 = (class212) this.field335.method1350(0);
            while (true) {
                if (var6 == null) {
                    if (arg2 >= 0) {
                        this.method201((class218) null, 3, (byte) 121);
                    }
                    break;
                }
                if (((long) arg1) == var6.field5011 && var6.field3224 == arg0 && var6.field3222 == 2) {
                    var4.field3223 = var6.field3223;
                    var4.field1513 = false;
                    return var4;
                }
                var6 = (class212) this.field335.method1351(-89);
            }
        }
        var4.field3223 = arg0.method1477(arg1, 117);
        var4.field1513 = false;
        var4.field1518 = true;
        return var4;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 68)
    public static final void method202(int arg0, int arg1) {
        field341++;
        class211 var2 = class17.method115(arg0, arg1, 4086);
        var2.method1435((byte) -2);
    }

    @OriginalMember(owner = "client!vd", name = "run", descriptor = "()V", line = 79)
    public final void run() {
        while (!this.field351) {
            class198 var1 = this.field335;
            class212 var2;
            synchronized (this.field335) {
                var2 = (class212) this.field335.method1352(false);
                if (var2 == null) {
                    try {
                        this.field335.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field343--;
            }
            try {
                if (var2.field3222 == 2) {
                    var2.field3224.method1476(var2.field3223, (int) var2.field5011, var2.field3223.length, (byte) -112);
                } else if (var2.field3222 == 3) {
                    var2.field3223 = var2.field3224.method1477((int) var2.field5011, 67);
                }
            } catch (Exception var6) {
                class326.method2328(var6, (String) null, true);
            }
            var2.field1513 = false;
        }
        field347++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lqe;I[BZ)Lsl;", line = 125)
    public final class212 method203(class218 arg0, int arg1, byte[] arg2, boolean arg3) {
        field334++;
        if (!arg3) {
            return (class212) null;
        }
        class212 var5 = new class212();
        var5.field1518 = false;
        var5.field5011 = (long) arg1;
        var5.field3222 = 2;
        var5.field3223 = arg2;
        var5.field3224 = arg0;
        this.method199(26353, var5);
        return var5;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 811)
    public class23() {
        class158 var1 = class96.field1382.method1952(0, 5, this);
        while (var1.field2542 == 0) {
            class177.method1246(10L, -32644);
        }
        if (var1.field2542 == 2) {
            throw new RuntimeException();
        }
        this.field350 = (Thread) var1.field2538;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IJ)V", line = 150)
    public static final void method204(int arg0, long arg1) {
        field348++;
        if (class269.field4427 == 1 || class269.field4427 == 5) {
            class54.method393((byte) 118, arg1);
        } else if (class269.field4427 == 2) {
            class251.method1785((byte) -92);
        } else {
            class79.method537((byte) 44);
        }
        if (!class286.field4681) {
            if (class148.field2396 != 0) {
                class138.field2181 = class107.field1533;
                class39.field595 = class267.field4401;
            } else if (class161.field2569 == 0) {
                class138.field2181 = class305.field4988;
                class39.field595 = class130.field1982;
            } else {
                class39.field595 = class69.field1074;
                class138.field2181 = class241.field3777;
            }
            class109.field1622[0] = class83.field1199;
            class300.field4949[0] = 1011;
            class117.field1701 = 1;
            class39.field570[0] = class214.field3275;
            class190.field2938[0] = "";
        }
        class145.method1022((long) class58.field875);
        if (class345.field5538 != -1) {
            class171.method1183(class345.field5538, (byte) -73);
        }
        for (int var3 = arg0; var3 < class60.field916; var3++) {
            if (class116.field1694[var3]) {
                class324.field5309[var3] = true;
            }
            class319.field5267[var3] = class116.field1694[var3];
            class116.field1694[var3] = false;
        }
        class56.field857 = class58.field875;
        class25.field383 = -1;
        if (class245.field3886) {
            class315.field5198 = true;
        }
        class342.field5505 = null;
        class291.field4836 = -1;
        class259.field4100 = null;
        if (class345.field5538 != -1) {
            class60.field916 = 0;
            class61.method448(arg0 ^ 0xFFFFAC65);
        }
        if (class245.field3886) {
            class335.method2379();
        } else {
            class317.method2290();
        }
        class242.method1692(arg0 ^ 0x1);
        if (class286.field4681) {
            if (class98.field1408) {
                class165.method1151(-23337);
            } else {
                class34.method290(18);
            }
        } else if (class259.field4100 != null) {
            class357.method2485(class355.field5639, (byte) 85, class177.field2775, class259.field4100);
        } else if (class25.field383 != -1) {
            class357.method2485(class25.field383, (byte) 113, class291.field4836, (class264) null);
        }
        int var4 = class286.field4681 ? -1 : class353.method2465(81);
        if (var4 == -1) {
            var4 = class297.field4923;
        }
        class20.method125(26039, var4);
        if (class40.field611 == 1) {
            class40.field611 = 2;
        }
        if (class28.field423 == 1) {
            class28.field423 = 2;
        }
        if (class166.field2616 == 3) {
            for (int var5 = 0; var5 < class60.field916; var5++) {
                if (class319.field5267[var5]) {
                    if (class245.field3886) {
                        class335.method2365(class21.field263[var5], class265.field4360[var5], class138.field2179[var5], class189.field2926[var5], 16711935, 128);
                    } else {
                        class317.method2270(class21.field263[var5], class265.field4360[var5], class138.field2179[var5], class189.field2926[var5], 16711935, 128);
                    }
                } else if (class324.field5309[var5]) {
                    if (class245.field3886) {
                        class335.method2365(class21.field263[var5], class265.field4360[var5], class138.field2179[var5], class189.field2926[var5], 16711680, 128);
                    } else {
                        class317.method2270(class21.field263[var5], class265.field4360[var5], class138.field2179[var5], class189.field2926[var5], 16711680, 128);
                    }
                }
            }
        }
        class248.method1754(class329.field5388.field4783, class120.field1779, class329.field5388.field4796, 7083, class215.field3322);
        class215.field3322 = 0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([Lgd;IIIIIZ[B)[I", line = 303)
    public static final int[] method205(class154[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, byte[] arg7) {
        field340++;
        byte var8;
        if (arg6) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg6) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg3 + var10 > 0 && arg3 + var10 < 103 && (arg1 + var11) > 0 && arg1 + var11 < 103) {
                            arg0[var9].field2491[arg3 + var10][arg1 + var11] = class235.method1623(arg0[var9].field2491[arg3 + var10][arg1 + var11], -2097153);
                        }
                    }
                }
            }
        }
        class313 var12 = new class313(arg7);
        int var13 = arg3 + arg4;
        int var14 = arg1 + arg2;
        for (int var15 = 0; var15 < var8; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    class102.method661(arg1 + var17, var13 + var16, var12, 103, 0, false, 0, 0, arg6, var15, var14 + var17, arg3 + var16);
                }
            }
        }
        boolean var18 = false;
        boolean var19 = false;
        while (var12.field5137 < var12.field5124.length) {
            int var20 = var12.method2224(-128);
            if (var20 == 128) {
                class183.field2846[0] = var12.method2250(-1613178296);
                var18 = true;
                class183.field2846[1] = var12.method2214(0);
                class183.field2846[2] = var12.method2214(0);
                class183.field2846[3] = var12.method2214(0);
                class183.field2846[4] = var12.method2250(-1613178296);
            } else {
                if (var20 != 129) {
                    var12.field5137--;
                    break;
                }
                for (int var21 = 0; var21 < 4; var21++) {
                    byte var22 = var12.method2200(99);
                    if (var22 == 0) {
                        int var23 = arg3;
                        int var24 = arg1;
                        int var25 = arg3 + 64;
                        if (arg3 < 0) {
                            var23 = 0;
                        } else if (arg3 >= 104) {
                            var23 = 104;
                        }
                        int var26 = arg1 + 64;
                        if (arg1 < 0) {
                            var24 = 0;
                        } else if (arg1 >= 104) {
                            var24 = 104;
                        }
                        if (var25 < 0) {
                            var25 = 0;
                        } else if (var25 >= 104) {
                            var25 = 104;
                        }
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 >= 104) {
                            var26 = 104;
                        }
                        while (var25 > var23) {
                            while (var24 < var26) {
                                class37.field559[var21][var23][var24] = 0;
                                var24++;
                            }
                            var23++;
                        }
                    } else if (var22 == 1) {
                        for (int var31 = 0; var31 < 64; var31 += 4) {
                            for (int var32 = 0; var32 < 64; var32 += 4) {
                                byte var33 = var12.method2200(-93);
                                for (int var34 = var31 + arg3; var34 < arg3 + var31 + 4; var34++) {
                                    for (int var35 = arg1 + var32; var35 < (arg1 + var32 + 4); var35++) {
                                        if (var34 >= 0 && var34 < 104 && var35 >= 0 && var35 < 104) {
                                            class37.field559[var21][var34][var35] = var33;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var22 == 2 && var21 > 0) {
                        int var27 = arg3;
                        int var28 = arg3 + 64;
                        int var29 = arg1 + 64;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 >= 104) {
                            var28 = 104;
                        }
                        int var30 = arg1;
                        if (arg3 < 0) {
                            var27 = 0;
                        } else if (arg3 >= 104) {
                            var27 = 104;
                        }
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 >= 104) {
                            var29 = 104;
                        }
                        if (arg1 < 0) {
                            var30 = 0;
                        } else if (arg1 >= 104) {
                            var30 = 104;
                        }
                        while (var28 > var27) {
                            while (var29 > var30) {
                                class37.field559[var21][var27][var30] = class37.field559[var21 - 1][var27][var30];
                                var30++;
                            }
                            var27++;
                        }
                    }
                }
                var19 = true;
            }
        }
        if (class245.field3886 && !arg6) {
            class52 var36 = null;
            while (true) {
                while (var12.field5137 < var12.field5124.length) {
                    int var37 = var12.method2224(-125);
                    if (var37 == 0) {
                        var36 = new class52(var12);
                    } else if (var37 == 1) {
                        int var38 = var12.method2224(-121);
                        if (var38 > 0) {
                            for (int var39 = 0; var39 < var38; var39++) {
                                class241 var40 = new class241(var12);
                                if (var40.field3798 == 31) {
                                    class318 var41 = class31.method265(var12.method2250(-1613178296), (byte) -53);
                                    var40.method1689(var41.field5242, (byte) 90, var41.field5240, var41.field5243, var41.field5245);
                                }
                                var40.field3807 += arg1 << 7;
                                var40.field3783 += arg3 << 7;
                                int var42 = var40.field3807 >> 7;
                                int var43 = var40.field3783 >> 7;
                                if (var43 >= 0 && var42 >= 0 && var43 < 104 && var42 < 104) {
                                    var40.field3805 = (class148.field2392[1][var43][var42] & 0x2) != 0;
                                    var40.field3800 = class101.field1457[var40.field3784][var43][var42] - var40.field3800;
                                    class254.method1810(var40);
                                }
                            }
                        }
                    } else if (var37 == 2) {
                        if (var36 == null) {
                            var36 = new class52();
                        }
                        var36.method378(var12, 101);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var36 == null) {
                    var36 = new class52();
                }
                for (int var44 = 0; var44 < 8; var44++) {
                    for (int var45 = 0; var45 < 8; var45++) {
                        int var46 = (arg3 >> 3) + var44;
                        int var47 = (arg1 >> 3) + var45;
                        if (var46 >= 0 && var46 < 13 && var47 >= 0 && var47 < 13) {
                            class236.field3742[var46][var47] = var36;
                        }
                    }
                }
                break;
            }
        }
        if (arg5 < 94) {
            field345 = false;
        }
        if (!var19) {
            for (int var48 = 0; var48 < 4; var48++) {
                for (int var49 = 0; var49 < 16; var49++) {
                    for (int var50 = 0; var50 < 16; var50++) {
                        int var51 = (arg3 >> 2) + var49;
                        int var52 = (arg1 >> 2) + var50;
                        if (var51 >= 0 && var51 < 26 && var52 >= 0 && var52 < 26) {
                            class37.field559[var48][var51][var52] = 0;
                        }
                    }
                }
            }
        }
        return var18 ? class183.field2846 : null;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Lqe;IB)Lsl;", line = 721)
    public final class212 method206(class218 arg0, int arg1, byte arg2) {
        if (arg2 <= 1) {
            return (class212) null;
        }
        field336++;
        class212 var4 = new class212();
        var4.field5011 = (long) arg1;
        var4.field3222 = 3;
        var4.field3224 = arg0;
        var4.field1518 = false;
        this.method199(26353, var4);
        return var4;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 744)
    public static void method207(int arg0) {
        field352 = (byte[][]) null;
        if (arg0 != -29288) {
            method205((class154[]) null, 73, -3, -38, -72, -70, false, (byte[]) null);
        }
        field342 = null;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 761)
    public final void method208(int arg0) {
        field339++;
        this.field351 = true;
        class198 var2 = this.field335;
        synchronized (this.field335) {
            this.field335.notifyAll();
        }
        try {
            this.field350.join();
        } catch (InterruptedException var5) {
        }
        this.field350 = null;
        if (arg0 != 64) {
            field353 = (class12) null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILnm;Lnm;)V", line = 785)
    public static final void method209(int arg0, class221 arg1, class221 arg2) {
        if (arg0 != -3213) {
            return;
        }
        field349++;
        class302.field4967 = class342.method2414(arg2, 0, arg1, 84, class358.field5675);
        if (class245.field3886) {
            class115.field1686 = class229.method1558(0, arg1, class358.field5675, 16383, arg2);
        } else {
            class115.field1686 = (class82) class302.field4967;
        }
        class287.field4740 = class342.method2414(arg2, 0, arg1, arg0 ^ 0xFFFFF32C, class181.field2821);
        class31.field471 = class342.method2414(arg2, 0, arg1, -122, class147.field2373);
    }
}
