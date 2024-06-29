import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class133 extends class174 {

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "Lrk;")
    public class257 field2530 = new class257();

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "La;")
    public class47 field2535 = new class47();

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "Lea;")
    private class37 field2517;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "Ljd;")
    public static class86 field2519 = null;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "Ljd;")
    public static class86 field2509 = class122.method868("Loading world list data", true);

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "J")
    public static long field2520 = 0L;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public static int field2514 = 0;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    public static int field2513 = 2;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "[[I")
    public static int[][] field2533 = new int[104][104];

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "Lbj;")
    public static class151 field2532;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[Lig;Z)V")
    public static final void method944(int arg0, class9[] arg1, boolean arg2) {
        int var3 = 109 % ((-arg0 - 67) / 38);
        byte var4;
        if (arg2) {
            var4 = 1;
        } else {
            var4 = 4;
        }
        if (!arg2) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        if ((class86.field1693[var5][var6][var7] & 0x1) == 1) {
                            int var8 = var5;
                            if ((class86.field1693[1][var6][var7] & 0x2) == 2) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method62(var7, (byte) -127, var6);
                            }
                        }
                    }
                }
            }
            class5.field69 += (int) (Math.random() * 5.0D) - 2;
            class151.field2824 += (int) (Math.random() * 5.0D) - 2;
            if (class5.field69 < -8) {
                class5.field69 = -8;
            }
            if (class5.field69 > 8) {
                class5.field69 = 8;
            }
            if (class151.field2824 < -16) {
                class151.field2824 = -16;
            }
            if (class151.field2824 > 16) {
                class151.field2824 = 16;
            }
        }
        int var9 = class5.field69 >> 2 << 10;
        field2516++;
        int var10 = class151.field2824 >> 1;
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var4; var13++) {
            byte[][] var52 = class144.field2732[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    byte var102 = 74;
                    int var103 = class35.field796[var13][var101 + 1][var55] - class35.field796[var13][var101 - 1][var55];
                    int var104 = class35.field796[var13][var101][var55 + 1] - class35.field796[var13][var101][var55 - 1];
                    int var105 = (int) Math.sqrt((double) (var103 * var103 + var104 * var104 + 65536));
                    int var106 = -65536 / var105;
                    int var107 = (var103 << 8) / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var107 * -50 + var106 * -10 + var108 * -50) / var54 + var102;
                    int var110 = (var52[var101][var55] >> 1) + (var52[var101][var55 - 1] >> 2) + (var52[var101][var55 + 1] >> 3) + (var52[var101 - -1][var55] >> 3) + (var52[var101 + -1][var55] >> 2);
                    var12[var101][var55] = var109 - var110;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class61.field1214[var56] = 0;
                class267.field4714[var56] = 0;
                class255.field4537[var56] = 0;
                class213.field3840[var56] = 0;
                class271.field4758[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var86 = 0; var86 < 104; var86++) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (var95 < 104) {
                        int var96 = class44.field988[var13][var95][var86] & 0xFF;
                        if (var96 > 0) {
                            class234 var97 = class217.method1532(var96 - 1, -11);
                            class61.field1214[var86] += var97.field4225;
                            class267.field4714[var86] += var97.field4227;
                            class255.field4537[var86] += var97.field4226;
                            class213.field3840[var86] += var97.field4240;
                            var10002 = class271.field4758[var86]++;
                        }
                    }
                    int var98 = var57 - 5;
                    if (var98 >= 0) {
                        int var99 = class44.field988[var13][var98][var86] & 0xFF;
                        if (var99 > 0) {
                            class234 var100 = class217.method1532(var99 - 1, -113);
                            class61.field1214[var86] -= var100.field4225;
                            class267.field4714[var86] -= var100.field4227;
                            class255.field4537[var86] -= var100.field4226;
                            class213.field3840[var86] -= var100.field4240;
                            var10002 = class271.field4758[var86]--;
                        }
                    }
                }
                if (var57 >= 0) {
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    for (int var92 = -5; var92 < 104; var92++) {
                        int var93 = var92 - 5;
                        int var94 = var92 + 5;
                        if (var94 < 104) {
                            var90 += class213.field3840[var94];
                            var87 += class61.field1214[var94];
                            var91 += class271.field4758[var94];
                            var89 += class255.field4537[var94];
                            var88 += class267.field4714[var94];
                        }
                        if (var93 >= 0) {
                            var87 -= class61.field1214[var93];
                            var89 -= class255.field4537[var93];
                            var91 -= class271.field4758[var93];
                            var90 -= class213.field3840[var93];
                            var88 -= class267.field4714[var93];
                        }
                        if (var92 >= 0 && var91 > 0) {
                            var11[var57][var92] = class168.method1210(3, var87 * 256 / var90, var89 / var91, var88 / var91);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var59 = 1; var59 < 103; var59++) {
                    if (arg2 || class171.method1225(-127) || (class86.field1693[0][var58][var59] & 0x2) != 0 || (class86.field1693[var13][var58][var59] & 0x10) == 0 && class66.method470(var59, -104, var13, var58) == class6.field235) {
                        if (class86.field1703 > var13) {
                            class86.field1703 = var13;
                        }
                        int var60 = class44.field988[var13][var58][var59] & 0xFF;
                        int var61 = class219.field3928[var13][var58][var59] & 0xFF;
                        if (var60 > 0 || var61 > 0) {
                            int var62 = class35.field796[var13][var58][var59];
                            int var63 = class35.field796[var13][var58 + 1][var59 + 1];
                            int var64 = class35.field796[var13][var58 + 1][var59];
                            int var65 = class35.field796[var13][var58][var59 + 1];
                            if (var13 > 0) {
                                boolean var66 = true;
                                if (var60 == 0 && class41.field922[var13][var58][var59] != 0) {
                                    var66 = false;
                                }
                                if (var61 > 0 && !class86.method593(var61 - 1, false).field3371) {
                                    var66 = false;
                                }
                                if (var66 && var62 == var64 && var62 == var63 && var62 == var65) {
                                    class180.field3250[var13][var58][var59] = class49.method377(class180.field3250[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var68;
                            if (var60 <= 0) {
                                var67 = 0;
                                var68 = -1;
                            } else {
                                var68 = var11[var58][var59];
                                int var69 = (var68 & 0x7F) + var10;
                                if (var69 < 0) {
                                    var69 = 0;
                                } else if (var69 > 127) {
                                    var69 = 127;
                                }
                                int var70 = (var68 + var9 & 0xFC00) + (var68 & 0x380) + var69;
                                var67 = class145.field2747[class195.method1360(102, var70, 96)];
                            }
                            int var71 = var12[var58 + 1][var59];
                            int var72 = var12[var58][var59];
                            int var73 = var12[var58 + 1][var59 + 1];
                            int var74 = var12[var58][var59 + 1];
                            if (var61 == 0) {
                                class215.method1521(var13, var58, var59, 0, 0, -1, var62, var64, var63, var65, class195.method1360(-84, var68, var72), class195.method1360(112, var68, var71), class195.method1360(69, var68, var73), class195.method1360(-117, var68, var74), 0, 0, 0, 0, var67, 0);
                            } else {
                                int var75 = class41.field922[var13][var58][var59] + 1;
                                byte var76 = class10.field315[var13][var58][var59];
                                class190 var77 = class86.method593(var61 - 1, false);
                                int var78 = var77.field3367;
                                if (var78 >= 0 && !class145.field2756.method186(var78, (byte) -97)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var80;
                                if (var78 >= 0) {
                                    var79 = class145.field2747[class56.method411(class145.field2756.method188((byte) -119, var78), 96, 1)];
                                    var80 = -1;
                                } else if (var77.field3370 == -1) {
                                    var80 = -2;
                                    var79 = 0;
                                } else {
                                    var80 = var77.field3370;
                                    int var81 = (var80 & 0x7F) + var10;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var9 + var80 & 0xFC00) + (var80 & 0x380) + var81;
                                    var79 = class145.field2747[class56.method411(var82, 96, 1)];
                                }
                                if (var77.field3369 >= 0) {
                                    int var83 = var77.field3369;
                                    int var84 = (var83 & 0x7F) + var10;
                                    if (var84 < 0) {
                                        var84 = 0;
                                    } else if (var84 > 127) {
                                        var84 = 127;
                                    }
                                    int var85 = (var9 + var83 & 0xFC00) + (var83 & 0x380) + var84;
                                    var79 = class145.field2747[class56.method411(var85, 96, 1)];
                                }
                                class215.method1521(var13, var58, var59, var75, var76, var78, var62, var64, var63, var65, class195.method1360(-97, var68, var72), class195.method1360(-112, var68, var71), class195.method1360(-72, var68, var73), class195.method1360(83, var68, var74), class56.method411(var80, var72, 1), class56.method411(var80, var71, 1), class56.method411(var80, var73, 1), class56.method411(var80, var74, 1), var67, var79);
                            }
                        }
                    }
                }
            }
            class44.field988[var13] = null;
            class219.field3928[var13] = null;
            class41.field922[var13] = null;
            class10.field315[var13] = null;
            class144.field2732[var13] = null;
        }
        class68.method481(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var51 = 0; var51 < 104; var51++) {
                if ((class86.field1693[1][var14][var51] & 0x2) == 2) {
                    class65.method462(var14, var51);
                }
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 <= 104; var16++) {
                for (int var17 = 0; var17 <= 104; var17++) {
                    if ((class180.field3250[var15][var17][var16] & 0x1) != 0) {
                        int var18;
                        for (var18 = var16; var18 > 0 && (class180.field3250[var15][var17][var18 - 1] & 0x1) != 0; var18--) {
                        }
                        int var19 = var16;
                        int var20 = var15;
                        while (var19 < 104 && (class180.field3250[var15][var17][var19 + 1] & 0x1) != 0) {
                            var19++;
                        }
                        label347: while (var20 > 0) {
                            for (int var21 = var18; var21 <= var19; var21++) {
                                if ((class180.field3250[var20 - 1][var17][var21] & 0x1) == 0) {
                                    break label347;
                                }
                            }
                            var20--;
                        }
                        int var22;
                        label335: for (var22 = var15; var22 < 3; var22++) {
                            for (int var23 = var18; var23 <= var19; var23++) {
                                if ((class180.field3250[var22 + 1][var17][var23] & 0x1) == 0) {
                                    break label335;
                                }
                            }
                        }
                        int var24 = (var22 + 1 - var20) * (var19 + 1 - var18);
                        if (var24 >= 8) {
                            short var25 = 240;
                            int var26 = class35.field796[var22][var17][var18] - var25;
                            int var27 = class35.field796[var20][var17][var18];
                            class238.method1638(1, var17 * 128, var17 * 128, var18 * 128, var19 * 128 + 128, var26, var27);
                            for (int var28 = var20; var28 <= var22; var28++) {
                                for (int var29 = var18; var29 <= var19; var29++) {
                                    class180.field3250[var28][var17][var29] = class1.method5(class180.field3250[var28][var17][var29], -2);
                                }
                            }
                        }
                    }
                    if ((class180.field3250[var15][var17][var16] & 0x2) != 0) {
                        int var30 = var17;
                        int var31 = var15;
                        int var32 = var17;
                        int var33 = var15;
                        while (var32 < 104 && (class180.field3250[var15][var32 + 1][var16] & 0x2) != 0) {
                            var32++;
                        }
                        while (var30 > 0 && (class180.field3250[var15][var30 - 1][var16] & 0x2) != 0) {
                            var30--;
                        }
                        label401: while (var31 > 0) {
                            for (int var34 = var30; var34 <= var32; var34++) {
                                if ((class180.field3250[var31 - 1][var34][var16] & 0x2) == 0) {
                                    break label401;
                                }
                            }
                            var31--;
                        }
                        label390: while (var33 < 3) {
                            for (int var35 = var30; var35 <= var32; var35++) {
                                if ((class180.field3250[var33 + 1][var35][var16] & 0x2) == 0) {
                                    break label390;
                                }
                            }
                            var33++;
                        }
                        int var36 = (var33 + 1 - var31) * (var32 + 1 - var30);
                        if (var36 >= 8) {
                            int var37 = class35.field796[var31][var30][var16];
                            short var38 = 240;
                            int var39 = class35.field796[var33][var30][var16] - var38;
                            class238.method1638(2, var30 * 128, var32 * 128 + 128, var16 * 128, var16 * 128, var39, var37);
                            for (int var40 = var31; var40 <= var33; var40++) {
                                for (int var41 = var30; var41 <= var32; var41++) {
                                    class180.field3250[var40][var41][var16] = class1.method5(class180.field3250[var40][var41][var16], -3);
                                }
                            }
                        }
                    }
                    if ((class180.field3250[var15][var17][var16] & 0x4) != 0) {
                        int var42 = var17;
                        int var43 = var16;
                        int var44 = var17;
                        int var45;
                        for (var45 = var16; var45 > 0 && (class180.field3250[var15][var17][var45 - 1] & 0x4) != 0; var45--) {
                        }
                        while (var43 < 104 && (class180.field3250[var15][var17][var43 + 1] & 0x4) != 0) {
                            var43++;
                        }
                        label454: while (var44 > 0) {
                            for (int var46 = var45; var46 <= var43; var46++) {
                                if ((class180.field3250[var15][var44 - 1][var46] & 0x4) == 0) {
                                    break label454;
                                }
                            }
                            var44--;
                        }
                        label443: while (var42 < 104) {
                            for (int var47 = var45; var47 <= var43; var47++) {
                                if ((class180.field3250[var15][var42 + 1][var47] & 0x4) == 0) {
                                    break label443;
                                }
                            }
                            var42++;
                        }
                        if ((var42 + 1 - var44) * (var43 + 1 - var45) >= 4) {
                            int var48 = class35.field796[var15][var44][var45];
                            class238.method1638(4, var44 * 128, var42 * 128 + 128, var45 * 128, var43 * 128 + 128, var48, var48);
                            for (int var49 = var44; var49 <= var42; var49++) {
                                for (int var50 = var45; var50 <= var43; var50++) {
                                    class180.field3250[var15][var49][var50] = class1.method5(class180.field3250[var15][var49][var50], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V")
    public static final void method945(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= arg0) {
            class56.method412(arg3, (byte) -116, arg0, class249.field4420[arg1], arg2);
        } else {
            class56.method412(arg3, (byte) -113, arg2, class249.field4420[arg1], arg0);
        }
        field2531++;
        if (arg4 != 1949) {
            method951();
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "()Lk;")
    public final class174 method283() {
        field2510++;
        class88 var1 = (class88) this.field2530.method1737((byte) 74);
        if (var1 == null) {
            return null;
        } else if (var1.field1762 == null) {
            return this.method276();
        } else {
            return var1.field1762;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILub;I)V")
    private final void method946(int arg0, class88 arg1, int arg2) {
        field2534++;
        if ((this.field2517.field861[arg1.field1738] & 0x4) != 0 && arg1.field1736 < 0) {
            int var4 = this.field2517.field853[arg1.field1738] / class65.field1277;
            int var5 = (var4 + 1048575 - arg1.field1764) / var4;
            arg1.field1764 = arg0 * var4 + arg1.field1764 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field2517.field846[arg1.field1738] == 0) {
                    arg1.field1762 = class266.method1826(arg1.field1760, arg1.field1762.method1813(), arg1.field1762.method1833(), arg1.field1762.method1808());
                } else {
                    arg1.field1762 = class266.method1826(arg1.field1760, arg1.field1762.method1813(), 0, arg1.field1762.method1808());
                    this.field2517.method297((byte) -119, arg1.field1763.field1250[arg1.field1742] < 0, arg1);
                }
                if (arg1.field1763.field1250[arg1.field1742] < 0) {
                    arg1.field1762.method1830(-1);
                }
                arg0 = arg1.field1764 / var4;
            }
        }
        arg1.field1762.method277(arg0);
        if (arg2 != 1048575) {
            this.method946(55, (class88) null, -11);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjd;)V")
    public static final void method947(int arg0, class86 arg1) {
        field2511++;
        if (class162.field3053 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg1.method622(-2);
        if ((long) arg0 == var3) {
            return;
        }
        while (var2 < class162.field3053.length && class162.field3053[var2].field3759 != var3) {
            var2++;
        }
        if (var2 < class162.field3053.length && class162.field3053[var2] != null) {
            class36.field809.method1356(151, true);
            class36.field809.method1399((byte) -6, class162.field3053[var2].field3759);
            class57.field1163++;
        }
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
    public static void method948(int arg0) {
        field2519 = null;
        if (arg0 != -1) {
            field2514 = -94;
        }
        field2533 = null;
        field2532 = null;
        field2509 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()I")
    public final int method302() {
        field2527++;
        return 0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)V")
    public static final void method949(int arg0, byte arg1) {
        field2529++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class49.method382(true);
        } else if (arg0 == 2) {
            class125.method885(arg1 + 116);
        } else {
            throw new RuntimeException();
        }
        if (arg1 != 11) {
            field2513 = 109;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lmd;")
    public static final class211 method950(Throwable arg0, String arg1) {
        field2512++;
        class211 var2;
        if (arg0 instanceof class211) {
            var2 = (class211) arg0;
            var2.field3825 = var2.field3825 + ' ' + arg1;
        } else {
            var2 = new class211(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
    public final void method277(int arg0) {
        this.field2535.method277(arg0);
        field2526++;
        for (class88 var2 = (class88) this.field2530.method1737((byte) 74); var2 != null; var2 = (class88) this.field2530.method1740(-8843)) {
            if (!this.field2517.method287(var2, (byte) -87)) {
                int var3 = arg0;
                do {
                    if (var2.field1766 >= var3) {
                        this.method946(var3, var2, 1048575);
                        var2.field1766 -= var3;
                        break;
                    }
                    this.method946(var2.field1766, var2, 1048575);
                    var3 -= var2.field1766;
                } while (!this.field2517.method313(var3, (int[]) null, var2, 0, (byte) 112));
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "()V")
    public static final void method951() {
        for (int var0 = 0; var0 < class265.field4677; var0++) {
            class228 var1 = class158.field2971[var0];
            class263.method1787(var1);
            class158.field2971[var0] = null;
        }
        class265.field4677 = 0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Lq;")
    public static final class122 method952(int arg0, int arg1) {
        field2523++;
        class122 var2 = (class122) class195.field3502.method701((byte) -123, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class171.field3161.method1084((byte) -117, class57.method414((byte) -103, arg0), class220.method1553(arg0, 100));
        if (arg1 != 127) {
            method947(-61, (class86) null);
        }
        class122 var4 = new class122();
        if (var3 != null) {
            var4.method863(new class200(var3), arg1 ^ 0x37A);
        }
        var4.method864(true);
        class195.field3502.method696((long) arg0, var4, (byte) -96);
        return var4;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
    public static final Object method953(byte[] arg0, boolean arg1, int arg2) {
        field2524++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class201.field3626) {
            try {
                class61 var3 = (class61) Class.forName("pg").getDeclaredConstructor().newInstance();
                var3.method437(arg0, (byte) 31);
                return var3;
            } catch (Throwable var4) {
                class201.field3626 = true;
            }
        }
        if (arg2 != -27691) {
            method953((byte[]) null, false, 19);
        }
        return arg1 ? class135.method969(arg0, 0) : arg0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILub;III[I)V")
    private final void method954(int arg0, class88 arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if ((this.field2517.field861[arg1.field1738] & 0x4) != 0 && arg1.field1736 < 0) {
            int var7 = this.field2517.field853[arg1.field1738] / class65.field1277;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field1764) / var7;
                if (var8 > arg2) {
                    arg1.field1764 += arg2 * var7;
                    break;
                }
                arg2 -= var8;
                arg1.field1762.method281(arg5, arg4, var8);
                int var9 = class65.field1277 / 100;
                arg1.field1764 += var7 * var8 - 1048576;
                arg4 += var8;
                class266 var10 = arg1.field1762;
                int var11 = 262144 / var7;
                if (var11 < var9) {
                    var9 = var11;
                }
                if (this.field2517.field846[arg1.field1738] == 0) {
                    arg1.field1762 = class266.method1826(arg1.field1760, var10.method1813(), var10.method1833(), var10.method1808());
                } else {
                    arg1.field1762 = class266.method1826(arg1.field1760, var10.method1813(), 0, var10.method1808());
                    this.field2517.method297((byte) -119, arg1.field1763.field1250[arg1.field1742] < 0, arg1);
                    arg1.field1762.method1810(var9, var10.method1833());
                }
                if (arg1.field1763.field1250[arg1.field1742] < 0) {
                    arg1.field1762.method1830(-1);
                }
                var10.method1802(var9);
                var10.method281(arg5, arg4, arg0 - arg4);
                if (var10.method1821()) {
                    this.field2535.method371(var10);
                }
            }
        }
        field2515++;
        arg1.field1762.method281(arg5, arg4, arg2);
        if (arg3 < 95) {
            method949(36, (byte) 35);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILwj;II)V")
    public static final void method955(int arg0, int arg1, class6 arg2, int arg3, int arg4) {
        if (class186.field3299 < 3) {
            ((class167) class157.field2962).method717(arg4, arg0, arg2.field163, arg2.field131, class157.field2962.field1846 / 2, class157.field2962.field1835 / 2, class86.field1664, 256, arg2.field209, arg2.field200);
        } else {
            class131.method934(arg4, arg0, 0, arg2.field209, arg2.field200);
        }
        field2522++;
        class204.field3686[arg3] = true;
        if (arg1 != 0) {
            field2509 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIBII)V")
    public static final void method956(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2525++;
        int var6 = class171.method1221(class56.field1143, class50.field1050, 21419, arg1);
        int var7 = class171.method1221(class56.field1143, class50.field1050, 21419, arg5);
        int var8 = -85 % ((arg3 + 7) / 32);
        int var9 = class171.method1221(class129.field2473, class49.field1044, 21419, arg0);
        int var10 = class171.method1221(class129.field2473, class49.field1044, 21419, arg4);
        for (int var11 = var6; var11 <= var7; var11++) {
            class56.method412(arg2, (byte) -127, var10, class249.field4420[var11], var9);
        }
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "()Lk;")
    public final class174 method276() {
        field2528++;
        class88 var1;
        do {
            var1 = (class88) this.field2530.method1740(-8843);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1762 == null);
        return var1.field1762;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "([III)V")
    public final void method281(int[] arg0, int arg1, int arg2) {
        this.field2535.method281(arg0, arg1, arg2);
        field2518++;
        for (class88 var4 = (class88) this.field2530.method1737((byte) 74); var4 != null; var4 = (class88) this.field2530.method1740(-8843)) {
            if (!this.field2517.method287(var4, (byte) -109)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field1766 >= var6) {
                        this.method954(var5 + var6, var4, var6, 122, var5, arg0);
                        var4.field1766 -= var6;
                        break;
                    }
                    this.method954(var5 + var6, var4, var4.field1766, 108, var5, arg0);
                    var6 -= var4.field1766;
                    var5 += var4.field1766;
                } while (!this.field2517.method313(var6, arg0, var4, var5, (byte) 118));
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lea;)V")
    public class133(class37 arg0) {
        this.field2517 = arg0;
    }
}
