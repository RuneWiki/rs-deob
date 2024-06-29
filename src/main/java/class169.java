import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class169 implements class365 {

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "Lqo;")
    private class141 field2456 = new class141(128);

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "[I")
    private int[] field2457 = new int[class513.field7614.field196];

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "[I")
    public int[] field2448 = new int[class513.field7614.field196];

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "Z")
    public static boolean field2461;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "Lqo;")
    public static class141 field2459;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "I")
    public static int field2463;

    static {
        new class375(null, "der Spieler ist momentan nicht verfügbar.", null, null);
        field2458 = 0;
        field2461 = false;
        field2459 = new class141(8);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILof;)V", line = 9)
    public static final void method1184(int arg0, class321 arg1) {
        field2460++;
        arg1.method2077(8);
        int var2 = class452.field6641;
        class322 var3 = class339.field5365 = class439.field6539[var2] = new class322();
        var3.field5254 = var2;
        int var4 = arg1.method2084((byte) -118, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFF9AF) >> 14;
        int var7 = var4 & 0x3FFF;
        var3.field5339[0] = var6 - class82.field1105;
        var3.field2217 = (var3.field5339[0] << 7) + (var3.method2091(-15245) << 6);
        var3.field5344[0] = var7 - class437.field6477;
        var3.field2215 = (var3.field5344[0] << 7) + (var3.method2091(-15245) << 6);
        class195.field2770 = var3.field2210 = var5;
        if (class289.field4303[var2] != null) {
            var3.method2098(class289.field4303[var2], (byte) -80);
        }
        class442.field6574 = 0;
        class320.field4896[class442.field6574++] = var2;
        class493.field7206[var2] = 0;
        if (arg0 <= 90) {
            method1184(19, null);
        }
        class40.field621 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method2084((byte) -118, 18);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFF70) >> 8;
                int var12 = var9 & 0xFF;
                class314 var13 = class57.field759[var8] = new class314();
                var13.field4805 = 0;
                var13.field4807 = -1;
                var13.field4799 = false;
                var13.field4798 = (var10 << 28) + (var11 << 14) + var12;
                class520.field7705[class40.field621++] = var8;
                class493.field7206[var8] = 0;
            }
        }
        arg1.method2085(7);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V", line = 82)
    public final void method1185(int arg0) {
        field2452++;
        for (int var2 = 0; var2 < class513.field7614.field196; var2++) {
            class341 var3 = class513.field7614.method102(var2, 16);
            if (var3 != null && var3.field5378 == 0) {
                this.field2457[var2] = 0;
                this.field2448[var2] = 0;
            }
        }
        this.field2456 = new class141(128);
        if (arg0 != -17100) {
            this.method1190(true, -122, 9);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIB)V", line = 114)
    public final void method1186(int arg0, int arg1, byte arg2) {
        field2455++;
        this.field2457[arg0] = arg1;
        if (arg2 < 69) {
            this.field2456 = null;
        }
        class97 var4 = (class97) this.field2456.method943((long) arg0, -1);
        if (var4 == null) {
            class97 var5 = new class97(4611686018427387905L);
            this.field2456.method940((long) arg0, -109, var5);
        } else if (var4.field1406 != 4611686018427387905L) {
            var4.field1406 = class264.method1698(true) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)I", line = 142)
    public final int method1187(int arg0, int arg1) {
        field2447++;
        class379 var3 = class144.field2075.method649(arg1, -12235);
        if (arg0 < 43) {
            field2458 = 107;
        }
        int var4 = var3.field5782;
        int var5 = var3.field5785;
        int var6 = var3.field5788;
        int var7 = class206.field2919[var6 - var5];
        return var7 & this.field2448[var4] >> var5;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V", line = 164)
    public static void method1188(byte arg0) {
        field2459 = null;
        if (arg0 <= 105) {
            method1188((byte) 79);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIZ)V", line = 176)
    public final void method1189(int arg0, int arg1, boolean arg2) {
        field2454++;
        class379 var4 = class144.field2075.method649(arg0, -12235);
        int var5 = var4.field5782;
        if (arg2) {
            this.method1189(-100, 89, true);
        }
        int var6 = var4.field5785;
        int var7 = var4.field5788;
        int var8 = class206.field2919[var7 - var6];
        if (arg1 < 0 || var8 < arg1) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method1186(var5, var9 & arg1 << var6 | this.field2457[var5] & ~var9, (byte) 98);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZII)V", line = 211)
    public final void method1190(boolean arg0, int arg1, int arg2) {
        field2450++;
        if (!arg0) {
            this.method1190(true, 67, -17);
        }
        class379 var4 = class144.field2075.method649(arg1, -12235);
        int var5 = var4.field5782;
        int var6 = var4.field5785;
        int var7 = var4.field5788;
        int var8 = class206.field2919[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method1191(119, this.field2448[var5] & ~var9 | arg2 << var6 & var9, var5);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)V", line = 239)
    public final void method1191(int arg0, int arg1, int arg2) {
        if (arg0 <= 112) {
            return;
        }
        field2453++;
        this.field2448[arg2] = arg1;
        class97 var4 = (class97) this.field2456.method943((long) arg2, -1);
        if (var4 == null) {
            class97 var5 = new class97(class264.method1698(true) + 500L);
            this.field2456.method940((long) arg2, -52, var5);
        } else {
            var4.field1406 = class264.method1698(true) + 500L;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIII[Ljb;BIII)V", line = 262)
    public static final void method1192(int arg0, int arg1, int arg2, int arg3, int arg4, class499[] arg5, byte arg6, int arg7, int arg8, int arg9) {
        class337.field5242.method1046(arg2, arg4, arg0, arg8);
        field2451++;
        for (int var10 = 0; var10 < arg5.length; var10++) {
            class499 var11 = arg5[var10];
            if (var11 != null && (var11.field7322 == arg3 || arg3 == -1412584499 && class362.field5615 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class383.field5834[class425.field6335].setBounds(var11.field7326 + arg9, var11.field7337 - -arg1, var11.field7348, var11.field7386);
                    var12 = class425.field6335++;
                } else {
                    var12 = arg7;
                }
                var11.field7370 = class405.field6116;
                var11.field7383 = var12;
                if (!client.method452(var11)) {
                    if (var11.field7369 != 0) {
                        class375.method2336((byte) -76, var11);
                    }
                    int var13 = var11.field7326 + arg9;
                    int var14 = var11.field7337 + arg1;
                    int var15 = var11.field7349;
                    if (class197.field2788 && (client.method450(var11).field5891 != 0 || var11.field7355 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class362.field5615 == var11) {
                        if (arg3 != -1412584499 && (class113.field1575 == var11.field7443 || class518.field7690 == var11.field7443)) {
                            class152.field2205 = arg1;
                            class1.field16 = arg5;
                            class444.field6604 = arg9;
                            continue;
                        }
                        if (class237.field3370 && class181.field2577) {
                            int var16 = class346.field5419.method812(false);
                            int var17 = class346.field5419.method811(false);
                            int var18 = var17 - class460.field6750;
                            int var19 = var16 - class103.field1475;
                            if (var19 < class441.field6562) {
                                var19 = class441.field6562;
                            }
                            if ((var11.field7348 + var19) > (class441.field6562 + class439.field6543.field7348)) {
                                var19 = class441.field6562 + class439.field6543.field7348 - var11.field7348;
                            }
                            if (var18 < class354.field5495) {
                                var18 = class354.field5495;
                            }
                            var13 = var19;
                            if (var11.field7386 + var18 > class354.field5495 + class439.field6543.field7386) {
                                var18 = class354.field5495 + class439.field6543.field7386 - var11.field7386;
                            }
                            var14 = var18;
                        }
                        if (class518.field7690 == var11.field7443) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field7355 == 2) {
                        var20 = arg0;
                        var21 = arg8;
                        var22 = arg2;
                        var23 = arg4;
                    } else {
                        int var24 = var13 + var11.field7348;
                        int var25 = var11.field7386 + var14;
                        var22 = arg2 < var13 ? var13 : arg2;
                        var23 = arg4 >= var14 ? arg4 : var14;
                        if (var11.field7355 == 9) {
                            var25++;
                            var24++;
                        }
                        var20 = arg0 <= var24 ? arg0 : var24;
                        var21 = var25 < arg8 ? var25 : arg8;
                    }
                    if (var20 > var22 && var23 < var21) {
                        if (var11.field7369 != 0) {
                            if (class301.field4445 == var11.field7369 || class127.field1802 == var11.field7369) {
                                class82.method525(var11.field7348, var11.field7386, var14, class127.field1802 == var11.field7369, (byte) -91, var13);
                                class326.field5002[var12] = true;
                                class337.field5242.method1046(arg2, arg4, arg0, arg8);
                                continue;
                            }
                            if (class144.field2076 == var11.field7369) {
                                if (var11.method2975((byte) -128, class337.field5242) != null) {
                                    class300.method1929((byte) -4);
                                    class314.method2041(var14, var13, var11, (byte) -94, class337.field5242);
                                    class527.field7783[var12] = true;
                                    class337.field5242.method1046(arg2, arg4, arg0, arg8);
                                }
                                continue;
                            }
                            if (class377.field5751 == var11.field7369) {
                                if (var11.method2975((byte) -128, class337.field5242) != null) {
                                    class407.method2487(var11, var14, var13, false);
                                    class527.field7783[var12] = true;
                                    class337.field5242.method1046(arg2, arg4, arg0, arg8);
                                }
                                continue;
                            }
                            if (class101.field1449 == var11.field7369) {
                                class235.method1590(var14, var11.field7348, class500.field7448, var13, var11.field7386, (byte) -51, class337.field5242);
                                class326.field5002[var12] = true;
                                class337.field5242.method1046(arg2, arg4, arg0, arg8);
                                continue;
                            }
                            if (class104.field1499 == var11.field7369) {
                                class151.method989(-20755, var14, var11.field7386, var11.field7348, class337.field5242, var13);
                                class326.field5002[var12] = true;
                                class337.field5242.method1046(arg2, arg4, arg0, arg8);
                                continue;
                            }
                            if (class150.field2164 == var11.field7369) {
                                if (!class430.field6388 && !class113.field1578) {
                                    continue;
                                }
                                int var26 = var13 + var11.field7348;
                                int var27 = var14 + 15;
                                if (class430.field6388) {
                                    class84.field1153.method240(var27, var26, "Fps:" + class167.field2433, -256, (byte) 78, -1);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class84.field1153.method240(var27, var26, "Mem:" + var29 + "k", var30, (byte) 91, -1);
                                    var27 += 15;
                                    class84.field1153.method240(var27, var26, "In:" + class512.field7599 + "B/s Out:" + class394.field5986 + "B/s", -256, (byte) 79, -1);
                                    var27 += 15;
                                    int var31 = class337.field5242.method1111() / 1024;
                                    class84.field1153.method240(var27, var26, "Offheap:" + var31 + "k", var31 > 65536 ? -65536 : -256, (byte) 126, -1);
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 30; var35++) {
                                        var32 += class76.field1032[var35].method1430((byte) -15);
                                        var33 += class76.field1032[var35].method1421(-32668);
                                        var34 += class76.field1032[var35].method1420(-84);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class433.method2594(0, 0, 2, true, (long) var37) + "% (" + var36 + "%)";
                                    class23.field349.method240(var27, var26, var38, -256, (byte) 75, -1);
                                    var27 += 12;
                                }
                                if (class339.field5364 > 0) {
                                    class23.field349.method240(var27, var26, "Particles: " + class269.field3732 + " / " + class339.field5364, -256, (byte) 108, -1);
                                }
                                var27 += 12;
                                if (class113.field1578) {
                                    class23.field349.method240(var27, var26, "Polys: " + class337.field5242.method1054() + " Models: " + class337.field5242.method1068(), -256, (byte) 116, -1);
                                    var27 += 12;
                                    class23.field349.method240(var27, var26, "Ls: " + class189.field2656 + " La: " + class263.field3675 + " NPC: " + class295.field4366 + " Pl: " + class251.field3479, -256, (byte) 87, -1);
                                    var27 += 12;
                                    class296.method1906(0);
                                }
                                class326.field5002[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field7355 == 0) {
                            if (class234.field3324 == var11.field7369 && class337.field5242.method1146()) {
                                class337.field5242.method1039(var13, var14, var11.field7348, var11.field7386);
                            }
                            method1192(var20, var14 - var11.field7389, var22, var11.field7312, var23, arg5, (byte) -125, var12, var21, var13 - var11.field7418);
                            if (var11.field7423 != null) {
                                method1192(var20, var14 - var11.field7389, var22, var11.field7312, var23, var11.field7423, (byte) -96, var12, var21, var13 - var11.field7418);
                            }
                            class407 var39 = (class407) class27.field449.method943((long) var11.field7312, -1);
                            if (var39 != null) {
                                class369.method2302(var20, var13, var21, var22, var12, var39.field6155, var14, var23, -118);
                            }
                            if (class234.field3324 == var11.field7369 && class337.field5242.method1146()) {
                                class337.field5242.method1121();
                                class369.field5663 = true;
                            }
                            class337.field5242.method1046(arg2, arg4, arg0, arg8);
                        }
                        if (class15.field252[var12] || class103.field1467 > 1) {
                            if (var11.field7355 == 3) {
                                if (var15 == 0) {
                                    if (var11.field7313) {
                                        class337.field5242.method1112(var13, var14, var11.field7348, var11.field7386, var11.field7421, 0);
                                    } else {
                                        class337.field5242.method1125(var13, var14, var11.field7348, var11.field7386, var11.field7421, 0);
                                    }
                                } else if (var11.field7313) {
                                    class337.field5242.method1112(var13, var14, var11.field7348, var11.field7386, 255 - (var15 & 0xFF) << 24 | var11.field7421 & 0xFFFFFF, 1);
                                } else {
                                    class337.field5242.method1125(var13, var14, var11.field7348, var11.field7386, 255 - (var15 & 0xFF) << 24 | var11.field7421 & 0xFFFFFF, 1);
                                }
                            } else if (var11.field7355 == 4) {
                                class33 var40 = var11.method2978((byte) -96, class337.field5242);
                                if (var40 != null) {
                                    int var41 = var11.field7421;
                                    String var42 = var11.field7437;
                                    if (var11.field7310 != -1) {
                                        class61 var43 = class84.field1154.method2451(-1, var11.field7310);
                                        var42 = var43.field827;
                                        if (var42 == null) {
                                            var42 = "null";
                                        }
                                        if ((var43.field861 == 1 || var11.field7284 != 1) && var11.field7284 != -1) {
                                            var42 = "<col=ff9040>" + var42 + "</col> x" + class100.method682(var11.field7284, 64);
                                        }
                                    }
                                    if (class112.field1571 == var11) {
                                        var42 = class10.field134.method2335((byte) -100, class288.field4292);
                                        var41 = var11.field7421;
                                    }
                                    if (class377.field5750) {
                                        class337.field5242.method1110(var13, var14, var11.field7348 + var13, var11.field7386 + var14);
                                    }
                                    var40.method244(var41 | 255 - (var15 & 0xFF) << 24, 0, null, class41.field635, var11.field7348, (byte) 50, null, var11.field7386, var11.field7327, var11.field7321, var11.field7403 ? 255 - (var15 & 0xFF) << 24 : -1, var13, var11.field7351, var11.field7427, var14, var42, 0);
                                    if (class377.field5750) {
                                        class337.field5242.method1046(arg2, arg4, arg0, arg8);
                                    }
                                } else if (class382.field5817) {
                                    class338.method2189((byte) 106, var11);
                                }
                            } else if (var11.field7355 == 5) {
                                if (var11.field7429 < 0) {
                                    class191 var45;
                                    if (var11.field7310 == -1) {
                                        var45 = var11.method2982(-116, class337.field5242);
                                    } else {
                                        class395 var44 = var11.field7325 ? class339.field5365.field4943 : null;
                                        var45 = class84.field1154.method2449((byte) -102, var44, class337.field5242, var11.field7310, var11.field7284, var11.field7391 | 0xFF000000, var11.field7410, var11.field7445);
                                    }
                                    if (var45 != null) {
                                        int var46 = var45.method209();
                                        int var47 = var45.method219();
                                        int var48 = (var11.field7421 == 0 ? 16777215 : var11.field7421 & 0xFFFFFF) | 255 - (var15 & 0xFF) << 24;
                                        if (var11.field7374) {
                                            class337.field5242.method1110(var13, var14, var11.field7348 + var13, var14 - -var11.field7386);
                                            if (var11.field7350 != 0) {
                                                int var49 = (-(-var46 - var11.field7348) - 1) / var46;
                                                int var50 = (var47 + var11.field7386 - 1) / var47;
                                                for (int var51 = 0; var51 < var49; var51++) {
                                                    for (int var52 = 0; var52 < var50; var52++) {
                                                        if (var11.field7421 == 0) {
                                                            var45.method1333((float) var46 / 2.0F + (float) (var13 + (var46 * var51)), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field7350);
                                                        } else {
                                                            var45.method1336((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var14 - -(var47 * var52)), 4096, var11.field7350, 0, var48, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field7421 == 0 && var15 == 0) {
                                                var45.method1335(var13, var14, var11.field7348, var11.field7386);
                                            } else {
                                                var45.method212(var13, var14, var11.field7348, var11.field7386, 0, var48, 1);
                                            }
                                            class337.field5242.method1046(arg2, arg4, arg0, arg8);
                                        } else if (var11.field7421 == 0 && var15 == 0) {
                                            if (var11.field7350 != 0) {
                                                var45.method1333((float) var11.field7348 / 2.0F + (float) var13, (float) var11.field7386 / 2.0F + (float) var14, var11.field7348 * 4096 / var46, var11.field7350);
                                            } else if (var11.field7348 == var46 && var11.field7386 == var47) {
                                                var45.method1332(var13, var14);
                                            } else {
                                                var45.method1339(var13, var14, var11.field7348, var11.field7386);
                                            }
                                        } else if (var11.field7350 != 0) {
                                            var45.method1336((float) var11.field7348 / 2.0F + (float) var13, (float) var11.field7386 / 2.0F + (float) var14, var11.field7348 * 4096 / var46, var11.field7350, 0, var48, 1);
                                        } else if (var11.field7348 == var46 && var11.field7386 == var47) {
                                            var45.method32(var13, var14, 0, var48, 1);
                                        } else {
                                            var45.method34(var13, var14, var11.field7348, var11.field7386, 0, var48, 1);
                                        }
                                    } else if (class382.field5817) {
                                        class338.method2189((byte) 119, var11);
                                    }
                                } else {
                                    var11.method2983(-224, class296.field4391, class496.field7258).method3121(var11.field7441 << 3, var11.field7348, var11.field7396 << 3, 0, var14, class337.field5242, var11.field7386, 0, -125, var13);
                                }
                            } else if (var11.field7355 == 6) {
                                class1.method5(true);
                                class201 var53 = null;
                                int var54 = 0;
                                if (var11.field7310 != -1) {
                                    class61 var62 = class84.field1154.method2451(-1, var11.field7310);
                                    if (var62 != null) {
                                        class61 var63 = var62.method409(var11.field7284, 12);
                                        class270 var64 = var11.field7438 == -1 ? null : class260.field3621.method1934(122, var11.field7438);
                                        class395 var65 = var11.field7325 ? class339.field5365.field4943 : null;
                                        var53 = var63.method413(2048, (byte) -23, var65, 1, class337.field5242, var64, var11.field7287, var11.field7412, var11.field7335);
                                        if (var53 == null) {
                                            class338.method2189((byte) 101, var11);
                                        } else {
                                            var54 = -var53.method306() >> 1;
                                        }
                                    }
                                } else if (var11.field7380 == 5) {
                                    int var55 = var11.field7358;
                                    if (var55 >= 0 && var55 < 2048) {
                                        class322 var56 = class439.field6539[var55];
                                        class270 var57 = var11.field7438 == -1 ? null : class260.field3621.method1934(118, var11.field7438);
                                        if (var56 != null && (class452.field6641 == var55 || class528.method3123(-28124, var56.field4947) == var11.field7317)) {
                                            var53 = var56.field4943.method2429(0, class186.field2620, class36.field583, 0, true, var11.field7287, true, class75.field1012, 2048, class337.field5242, var11.field7335, -1, class84.field1154, null, null, class410.field6175, class260.field3621, var57, var11.field7412);
                                        }
                                    }
                                } else if (var11.field7380 == 8 || var11.field7380 == 9) {
                                    class410 var59 = class261.method1684(var11.field7358, 25, false);
                                    class270 var60 = var11.field7438 == -1 ? null : class260.field3621.method1934(119, var11.field7438);
                                    if (var59 != null) {
                                        class395 var61 = var11.field7325 ? class339.field5365.field4943 : null;
                                        var53 = var59.method2495(var60, 2048, var11.field7380 == 9, var61, class337.field5242, var11.field7317, var11.field7412, var11.field7335, var11.field7287, 0);
                                    }
                                } else if (var11.field7438 == -1) {
                                    var53 = var11.method2984(0, true, null, 2048, class260.field3621, -1, class84.field1154, class337.field5242, class339.field5365.field4943, class36.field583, class410.field6175, class75.field1012, class186.field2620, -1);
                                    if (var53 == null && class382.field5817) {
                                        class338.method2189((byte) 124, var11);
                                    }
                                } else {
                                    class270 var58 = class260.field3621.method1934(121, var11.field7438);
                                    var53 = var11.method2984(var11.field7287, true, var58, 2048, class260.field3621, var11.field7412, class84.field1154, class337.field5242, class339.field5365.field4943, class36.field583, class410.field6175, class75.field1012, class186.field2620, var11.field7335);
                                    if (var53 == null && class382.field5817) {
                                        class338.method2189((byte) 111, var11);
                                    }
                                }
                                if (var53 != null) {
                                    int var66;
                                    if (var11.field7311 > 0) {
                                        var66 = (var11.field7348 << 9) / var11.field7311;
                                    } else {
                                        var66 = 512;
                                    }
                                    int var67;
                                    if (var11.field7282 > 0) {
                                        var67 = (var11.field7386 << 9) / var11.field7282;
                                    } else {
                                        var67 = 512;
                                    }
                                    int var68 = (var11.field7364 * var66 >> 9) + var11.field7348 / 2 + var13;
                                    int var69 = (var11.field7297 * var67 >> 9) + (var14 + (var11.field7386 / 2));
                                    class245.field3425.method189();
                                    class337.field5242.method1064(class245.field3425);
                                    class337.field5242.method1127(var68, var69, var66, var67);
                                    class337.field5242.method1087((float) (var11.field7428 << 0), var11.field7419 ? (float) (var11.field7357 << 0) : (float) (var11.field7357 << 0) * 1.5F);
                                    if (arg3 == -1412584499 || class369.field5663) {
                                        class337.field5242.method1107();
                                        class337.field5242.method1066();
                                        class337.field5242.method1046(arg2, arg4, arg0, arg8);
                                        class369.field5663 = false;
                                    }
                                    if (var11.field7420) {
                                        class337.field5242.method1144(false);
                                    }
                                    int var70 = (var11.field7424 << 0) * class525.field7760[var11.field7306 << 3] >> 15;
                                    int var71 = (var11.field7424 << 0) * class525.field7763[var11.field7306 << 3] >> 15;
                                    class445.field6617.method178(-var11.field7346 << 3);
                                    class445.field6617.method181(var11.field7329 << 3);
                                    class445.field6617.method177(var11.field7320 << 0, var70 + (var11.field7339 << 0) + var54, (var11.field7339 << 0) + var71);
                                    class445.field6617.method186(var11.field7306 << 3);
                                    if (class377.field5750) {
                                        class337.field5242.method1110(var13, var14, var11.field7348 + var13, var11.field7386 + var14);
                                    }
                                    if (var11.field7419) {
                                        var53.method291(class445.field6617, null, var11.field7424 << 0, 1);
                                    } else {
                                        var53.method318(class445.field6617, null, 1);
                                    }
                                    if (class377.field5750) {
                                        class337.field5242.method1046(arg2, arg4, arg0, arg8);
                                    }
                                    if (var11.field7420) {
                                        class337.field5242.method1144(true);
                                    }
                                    class337.field5242.method1087(0.0F, 0.0F);
                                }
                            } else if (var11.field7355 == 9) {
                                int var72;
                                int var73;
                                int var74;
                                int var75;
                                if (var11.field7400) {
                                    var72 = var14 + var11.field7386;
                                    var73 = var14;
                                    var74 = var13;
                                    var75 = var11.field7348 + var13;
                                } else {
                                    var74 = var13;
                                    var73 = var14 + var11.field7386;
                                    var75 = var11.field7348 + var13;
                                    var72 = var14;
                                }
                                if (var11.field7316 == 1) {
                                    class337.field5242.method1074(var74, var72, var75, var73, var11.field7421, 0);
                                } else {
                                    class337.field5242.method1073(var74, var72, var75, var73, var11.field7421, var11.field7316, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg6 >= -25) {
            field2463 = -5;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ)I", line = 923)
    public final int method1193(int arg0, boolean arg1) {
        if (arg1) {
            this.method1186(103, 109, (byte) 120);
        }
        field2449++;
        return this.field2448[arg0];
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BZ)I", line = 935)
    public final int method1194(byte arg0, boolean arg1) {
        field2462++;
        long var3 = class264.method1698(true);
        if (arg0 != -123) {
            this.field2456 = null;
        }
        for (class97 var5 = arg1 ? (class97) this.field2456.method948(34) : (class97) this.field2456.method938(-105); var5 != null; var5 = (class97) this.field2456.method938(-124)) {
            if ((var5.field1406 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field1406 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field6799;
                    this.field2448[var6] = this.field2457[var6];
                    var5.method2785((byte) -120);
                    return var6;
                }
                var5.method2785((byte) -120);
            }
        }
        return -1;
    }
}
