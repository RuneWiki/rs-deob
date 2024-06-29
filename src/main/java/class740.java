import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class class740 implements class573 {

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    private int field10347 = 0;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    private int field10356 = -1;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    private int field10335;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Lai;")
    public class597 field10341;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Z")
    private boolean field10333;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field10346 = 0;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field10334;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field10337;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field10338;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field10339;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field10340;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field10342;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    private int field10343;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field10348;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field10349;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field10350;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field10351;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field10352;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static int field10353;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    private int field10354;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Leu;")
    public static class478 field10336;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Lur;")
    public static class535 field10344;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field10355;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "[I")
    public static int[] field10345;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZIIIZIIIII[Ltp;)V")
    public static final void method4117(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class532[] arg10) {
        field10339++;
        class275.field3370.method432(arg1, arg7, arg3, arg5);
        for (int var11 = 0; var11 < arg10.length; var11++) {
            class532 var12 = arg10[var11];
            if (var12 != null && (var12.field7580 == arg9 || arg9 == -1412584499 && class344.field4474 == var12)) {
                int var13 = var12.field7615 + arg8;
                int var14 = var12.field7641 + arg2;
                int var15 = var13 + var12.field7658 + 1;
                int var16 = var12.field7573 + var14 + 1;
                int var17;
                if (arg6 == -1) {
                    class452.field6510[class717.field10056].setBounds(var12.field7615 + arg8, var12.field7641 + arg2, var12.field7658, var12.field7573);
                    var17 = class717.field10056++;
                } else {
                    var17 = arg6;
                }
                var12.field7568 = var17;
                var12.field7667 = class392.field5398;
                if (!client.method1788(var12)) {
                    if (var12.field7664 != 0) {
                        class428.method2677(var12, 80);
                    }
                    int var18 = var12.field7615 + arg8;
                    int var19 = var12.field7641 + arg2;
                    int var20 = 0;
                    int var21 = 0;
                    if (class397.field5443) {
                        var20 = class389.method2400(54);
                        var21 = class752.method4192(1);
                    }
                    int var22 = var12.field7682;
                    if (class19.field164 && (client.method1779(var12).field10498 != 0 || var12.field7543 == 0) && var22 > 127) {
                        var22 = 127;
                    }
                    if (class344.field4474 == var12) {
                        if (arg9 != -1412584499 && (class98.field1028 == var12.field7556 || class411.field5617 == var12.field7556)) {
                            class382.field5234 = arg8;
                            class93.field987 = arg10;
                            class261.field3243 = arg2;
                            continue;
                        }
                        if (class85.field903 && class65.field659) {
                            int var23 = var20 + class353.field4537.method694((byte) -65);
                            int var24 = class353.field4537.method691((byte) -115) + var21;
                            int var25 = var23 - class356.field4557;
                            int var26 = var24 - class408.field5588;
                            if (class631.field9069 > var25) {
                                var25 = class631.field9069;
                            }
                            if (class631.field9069 + class68.field694.field7658 < var12.field7658 + var25) {
                                var25 = class631.field9069 + class68.field694.field7658 - var12.field7658;
                            }
                            if (class687.field9702 > var26) {
                                var26 = class687.field9702;
                            }
                            if (var12.field7573 + var26 > class687.field9702 + class68.field694.field7573) {
                                var26 = class687.field9702 + class68.field694.field7573 - var12.field7573;
                            }
                            var18 = var25;
                            var19 = var26;
                        }
                        if (class411.field5617 == var12.field7556) {
                            var22 = 128;
                        }
                    }
                    int var27;
                    int var28;
                    int var29;
                    int var30;
                    if (var12.field7543 == 2) {
                        var27 = arg5;
                        var28 = arg7;
                        var29 = arg3;
                        var30 = arg1;
                    } else {
                        int var31 = var18 + var12.field7658;
                        int var32 = var12.field7573 + var19;
                        var28 = var19 <= arg7 ? arg7 : var19;
                        var30 = arg1 < var18 ? var18 : arg1;
                        if (var12.field7543 == 9) {
                            var31++;
                            var32++;
                        }
                        var27 = var32 >= arg5 ? arg5 : var32;
                        var29 = arg3 <= var31 ? arg3 : var31;
                    }
                    if (var29 > var30 && var27 > var28) {
                        if (var12.field7664 != 0) {
                            if (class299.field3717 == var12.field7664 || class624.field8934 == var12.field7664) {
                                class203.method1223(var19, var18, (byte) -109, var12);
                                if (!class397.field5443) {
                                    class512.method3026((byte) 112, var19, var12.field7573, var18, var12.field7658, class624.field8934 == var12.field7664);
                                    class275.field3370.method432(arg1, arg7, arg3, arg5);
                                }
                                class272.field3360[var17] = true;
                                continue;
                            }
                            if (class628.field9021 == var12.field7664) {
                                if (var12.method3127(class275.field3370, (byte) -76) != null) {
                                    class381.method2343(arg0);
                                    class621.method3556(var12, var18, class275.field3370, 7, var19);
                                    class344.field4472[var17] = true;
                                    class275.field3370.method432(arg1, arg7, arg3, arg5);
                                    if (class397.field5443) {
                                        if (arg4) {
                                            class16.method75(var14, (byte) -124, var16, var13, var15);
                                        } else {
                                            class594.method3394(-2, var13, var16, var15, var14);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class279.field3427 == var12.field7664) {
                                if (var12.method3127(class275.field3370, (byte) -95) != null) {
                                    class623.method3564(var12, var19, var18, 2);
                                    class344.field4472[var17] = true;
                                    class275.field3370.method432(arg1, arg7, arg3, arg5);
                                    if (class397.field5443) {
                                        if (arg4) {
                                            class16.method75(var14, (byte) -2, var16, var13, var15);
                                        } else {
                                            class594.method3394(-2, var13, var16, var15, var14);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class478.field6828 == var12.field7664) {
                                class448.method2769((byte) 39, class100.field1044, class275.field3370, var18, var12.field7573, var19, var12.field7658);
                                class272.field3360[var17] = true;
                                class275.field3370.method432(arg1, arg7, arg3, arg5);
                                continue;
                            }
                            if (class319.field4075 == var12.field7664) {
                                class315.method1876(121, var12.field7658, var12.field7573, var19, class275.field3370, var18);
                                class272.field3360[var17] = true;
                                class275.field3370.method432(arg1, arg7, arg3, arg5);
                                continue;
                            }
                            if (class744.field10389 == var12.field7664) {
                                if (!class127.field1333 && !class479.field6857) {
                                    continue;
                                }
                                int var33 = var12.field7658 + var18;
                                int var34 = var19 + 15;
                                if (class397.field5443) {
                                    if (arg4) {
                                        class16.method75(var14, (byte) 89, var16, var13, var15);
                                    } else {
                                        class594.method3394(-2, var13, var16, var15, var14);
                                    }
                                }
                                if (class127.field1333) {
                                    int var35 = -256;
                                    if (class429.field6239 < 20) {
                                        var35 = -65536;
                                    }
                                    class720.field10104.method441(var35, "Fps:" + class429.field6239, var34, -1, (byte) -47, var33);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (var37 > 98304) {
                                        var38 = -65536;
                                        if (class750.field10490) {
                                            class64.method484(true);
                                            for (int var39 = 0; var39 < 10; var39++) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            if (var37 > 65536) {
                                                class490.method2948((byte) -55, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", 4);
                                            }
                                        }
                                    }
                                    class720.field10104.method441(var38, "Mem:" + var37 + "k", var34, -1, (byte) -47, var33);
                                    var34 += 15;
                                    class720.field10104.method441(-256, "In:" + class661.field9437 + "B/s Out:" + class664.field9451 + "B/s", var34, -1, (byte) -47, var33);
                                    var34 += 15;
                                    int var40 = class275.field3370.method406() / 1024;
                                    class720.field10104.method441(var40 <= 65536 ? -256 : -65536, "Offheap:" + var40 + "k", var34, -1, (byte) -47, var33);
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < 37; var44++) {
                                        if (class24.field224[var44] != null) {
                                            var41 += class24.field224[var44].method2128(0);
                                            var42 += class24.field224[var44].method2142(-99);
                                            var43 += class24.field224[var44].method2132((byte) -18);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class347.method2065(0, 2, (byte) 12, true, (long) var46) + "% (" + var45 + "%)";
                                    class322.field4116.method441(-256, var47, var34, -1, (byte) -47, var33);
                                    var34 += 12;
                                }
                                if (class313.field3890 > 0) {
                                    class322.field4116.method441(-256, "Particles: " + class179.field2106 + " / " + class313.field3890, var34, -1, (byte) -47, var33);
                                }
                                var34 += 12;
                                if (class479.field6857) {
                                    class322.field4116.method441(-256, "Polys: " + class275.field3370.method318() + " Models: " + class275.field3370.method346(), var34, -1, (byte) -47, var33);
                                    var34 += 12;
                                    class322.field4116.method441(-256, "Ls: " + class535.field7737 + " La: " + class68.field695 + " NPC: " + class179.field2107 + " Pl: " + class735.field10274, var34, -1, (byte) -47, var33);
                                    var34 += 12;
                                    class223.method1293(667);
                                }
                                class272.field3360[var17] = true;
                                continue;
                            }
                        }
                        if (var12.field7543 == 0) {
                            if (class533.field7716 == var12.field7664 && class275.field3370.method358()) {
                                class275.field3370.method439(var18, var19, var12.field7658, var12.field7573);
                            }
                            method4117(false, var30, var19 - var12.field7571, var29, arg4, var27, var17, var28, var18 - var12.field7567, var12.field7704, arg10);
                            if (var12.field7632 != null) {
                                method4117(false, var30, var19 - var12.field7571, var29, arg4, var27, var17, var28, var18 - var12.field7567, var12.field7704, var12.field7632);
                            }
                            class424 var48 = (class424) class153.field1688.method1754(false, (long) var12.field7704);
                            if (var48 != null) {
                                class84.method593(-122, var17, var28, var48.field6159, var30, var18, var19, var27, var29);
                            }
                            if (class533.field7716 == var12.field7664 && class275.field3370.method358()) {
                                class275.field3370.method384();
                            }
                            class275.field3370.method432(arg1, arg7, arg3, arg5);
                        }
                        if (class459.field6560[var17] || class475.field6775 > 1) {
                            if (var12.field7543 == 3) {
                                if (var22 == 0) {
                                    if (var12.field7548) {
                                        class275.field3370.method370(var18, var19, var12.field7658, var12.field7573, var12.field7694, 0);
                                    } else {
                                        class275.field3370.method399(var18, var19, var12.field7658, var12.field7573, var12.field7694, 0);
                                    }
                                } else if (var12.field7548) {
                                    class275.field3370.method370(var18, var19, var12.field7658, var12.field7573, var12.field7694 & 0xFFFFFF | 255 - (var22 & 0xFF) << 24, 1);
                                } else {
                                    class275.field3370.method399(var18, var19, var12.field7658, var12.field7573, 255 - (var22 & 0xFF) << 24 | var12.field7694 & 0xFFFFFF, 1);
                                }
                                if (class397.field5443) {
                                    if (arg4) {
                                        class16.method75(var14, (byte) -117, var16, var13, var15);
                                    } else {
                                        class594.method3394(-2, var13, var16, var15, var14);
                                    }
                                }
                            } else if (var12.field7543 == 4) {
                                class59 var49 = var12.method3114(90, class275.field3370);
                                if (var49 != null) {
                                    int var50 = var12.field7694;
                                    String var51 = var12.field7620;
                                    if (var12.field7691 != -1) {
                                        class431 var52 = class361.field4643.method912((byte) 1, var12.field7691);
                                        var51 = var52.field6294;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((var52.field6297 == 1 || var12.field7593 != 1) && var12.field7593 != -1) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class298.method1766(var12.field7593, (byte) -101);
                                        }
                                    }
                                    if (var12.field7687 != -1) {
                                        var51 = class591.method3385((byte) 88, var12.field7687);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class468.field6697 == var12) {
                                        var51 = class486.field6935.method2936(class489.field6978, 72);
                                        var50 = var12.field7694;
                                    }
                                    if (class518.field7371) {
                                        class275.field3370.method438(var18, var19, var18 + var12.field7658, var12.field7573 + var19);
                                    }
                                    var49.method449(var12.field7557, arg0, var18, class323.field4118, var12.field7573, var12.field7678, var51, var19, 255 - (var22 & 0xFF) << 24 | var50, var12.field7609 ? 255 - (var22 & 0xFF) << 24 : -1, var12.field7652, var12.field7689, null, 0, null, 0, var12.field7658);
                                    if (class518.field7371) {
                                        class275.field3370.method432(arg1, arg7, arg3, arg5);
                                    }
                                    if (var51.trim().length() > 0) {
                                        if (!class518.field7371) {
                                            class535 var53 = class633.method3638(84, class275.field3370, var12.field7604);
                                            int var54 = var53.method3141(class323.field4118, (byte) -59, var51, var12.field7658);
                                            int var55 = var53.method3143(var12.field7658, var12.field7689, -1, var51, class323.field4118);
                                            if (class397.field5443) {
                                                if (arg4) {
                                                    class16.method75(var19, (byte) -126, var19 + var55, var18, var18 + var54);
                                                } else {
                                                    class594.method3394(-2, var18, var19 + var55, var18 + var54, var19);
                                                }
                                            }
                                        } else if (class397.field5443) {
                                            if (arg4) {
                                                class16.method75(var14, (byte) -120, var16, var13, var15);
                                            } else {
                                                class594.method3394(-2, var13, var16, var15, var14);
                                            }
                                        }
                                    }
                                } else if (class377.field4930) {
                                    class11.method50(var12, (byte) -118);
                                }
                            } else if (var12.field7543 == 5) {
                                if (var12.field7616 >= 0) {
                                    var12.method3122((byte) 36, class430.field6249, class82.field857).method2632(var12.field7658, 0, 0, var12.field7573, var12.field7710 << 3, arg0, var12.field7621 << 3, class275.field3370, var18, var19);
                                } else {
                                    class131 var56;
                                    if (var12.field7691 != -1) {
                                        class429 var57 = var12.field7686 ? class90.field937.field2201 : null;
                                        var56 = class361.field4643.method905(var12.field7649, var12.field7600, var12.field7593, class275.field3370, var12.field7691, var57, 17302, var12.field7579 | 0xFF000000);
                                    } else if (var12.field7687 == -1) {
                                        var56 = var12.method3117(class275.field3370, -31);
                                    } else {
                                        var56 = class581.method3344(var12.field7687, 59, class275.field3370);
                                    }
                                    if (var56 != null) {
                                        int var58 = var56.method501();
                                        int var59 = var56.method510();
                                        int var60 = 255 - (var22 & 0xFF) << 24 | (var12.field7694 == 0 ? 16777215 : var12.field7694 & 0xFFFFFF);
                                        if (var12.field7562) {
                                            class275.field3370.method438(var18, var19, var12.field7658 + var18, var12.field7573 + var19);
                                            if (var12.field7706 != 0) {
                                                int var61 = (var58 + var12.field7658 - 1) / var58;
                                                int var62 = (var59 + var12.field7573 - 1) / var59;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var12.field7694 == 0) {
                                                            var56.method821((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var19 - -(var59 * var64)), 4096, var12.field7706);
                                                        } else {
                                                            var56.method817((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field7706, 0, var60, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var12.field7694 == 0 && var22 == 0) {
                                                var56.method819(var18, var19, var12.field7658, var12.field7573);
                                            } else {
                                                var56.method513(var18, var19, var12.field7658, var12.field7573, 0, var60, 1);
                                            }
                                            class275.field3370.method432(arg1, arg7, arg3, arg5);
                                        } else if (var12.field7694 == 0 && var22 == 0) {
                                            if (var12.field7706 != 0) {
                                                var56.method821((float) var12.field7658 / 2.0F + (float) var18, (float) var12.field7573 / 2.0F + (float) var19, var12.field7658 * 4096 / var58, var12.field7706);
                                            } else if (var12.field7658 == var58 && var12.field7573 == var59) {
                                                var56.method824(var18, var19);
                                            } else {
                                                var56.method814(var18, var19, var12.field7658, var12.field7573);
                                            }
                                        } else if (var12.field7706 != 0) {
                                            var56.method817((float) var12.field7658 / 2.0F + (float) var18, (float) var12.field7573 / 2.0F + (float) var19, var12.field7658 * 4096 / var58, var12.field7706, 0, var60, 1);
                                        } else if (var12.field7658 == var58 && var12.field7573 == var59) {
                                            var56.method512(var18, var19, 0, var60, 1);
                                        } else {
                                            var56.method818(var18, var19, var12.field7658, var12.field7573, 0, var60, 1);
                                        }
                                    } else if (class377.field4930) {
                                        class11.method50(var12, (byte) -97);
                                    }
                                }
                                if (class397.field5443) {
                                    if (arg4) {
                                        class16.method75(var14, (byte) 104, var16, var13, var15);
                                    } else {
                                        class594.method3394(-2, var13, var16, var15, var14);
                                    }
                                }
                            } else if (var12.field7543 == 6) {
                                class533.method3132(0);
                                class470 var65 = null;
                                int var66 = 0;
                                if (var12.field7691 != -1) {
                                    class431 var67 = class361.field4643.method912((byte) 1, var12.field7691);
                                    if (var67 != null) {
                                        class431 var68 = var67.method2705(1, var12.field7593);
                                        class25 var69 = var12.field7705 == -1 ? null : class637.field9158.method1905(100, var12.field7705);
                                        class429 var70 = var12.field7686 ? class90.field937.field2201 : null;
                                        var65 = var68.method2696(var12.field7547, var12.field7695, 1, var69, class275.field3370, var70, var12.field7636, 2048, (byte) -14);
                                        if (var65 == null) {
                                            class11.method50(var12, (byte) -113);
                                        } else {
                                            var66 = -var65.method190() >> 1;
                                        }
                                    }
                                } else if (var12.field7685 == 5) {
                                    int var71 = var12.field7596;
                                    if (var71 >= 0 && var71 < 2048) {
                                        class183 var72 = class75.field792[var71];
                                        class25 var73 = var12.field7705 == -1 ? null : class637.field9158.method1905(104, var12.field7705);
                                        if (var72 != null && (class701.field9893 == var71 || class478.method2877(var72.field2157, (byte) -17) == var12.field7555)) {
                                            var65 = var72.field2201.method2685(-1, var73, class606.field8619, class275.field3370, var12.field7636, class361.field4643, class722.field10125, 0, class637.field9158, class451.field6506, var12.field7695, null, 2048, class182.field2148, true, 0, 0, (byte) 57, null, null, var12.field7547);
                                        }
                                    }
                                } else if (var12.field7685 == 8 || var12.field7685 == 9) {
                                    class755 var75 = class149.method926(Integer.MIN_VALUE, false, var12.field7596);
                                    class25 var76 = var12.field7705 == -1 ? null : class637.field9158.method1905(80, var12.field7705);
                                    if (var75 != null) {
                                        class429 var77 = var12.field7686 ? class90.field937.field2201 : null;
                                        var65 = var75.method4198((byte) -79, var77, 2048, var76, var12.field7547, var12.field7555, var12.field7685 == 9, var12.field7636, class275.field3370, var12.field7695);
                                    }
                                } else if (var12.field7705 == -1) {
                                    var65 = var12.method3112(null, class637.field9158, true, class182.field2148, -1, -1, class90.field937.field2201, class361.field4643, class275.field3370, class451.field6506, 0, class606.field8619, 2048, class722.field10125);
                                    if (var65 == null && class377.field4930) {
                                        class11.method50(var12, (byte) -102);
                                    }
                                } else {
                                    class25 var74 = class637.field9158.method1905(105, var12.field7705);
                                    var65 = var12.method3112(var74, class637.field9158, !arg0, class182.field2148, var12.field7547, var12.field7695, class90.field937.field2201, class361.field4643, class275.field3370, class451.field6506, var12.field7636, class606.field8619, 2048, class722.field10125);
                                    if (var65 == null && class377.field4930) {
                                        class11.method50(var12, (byte) -109);
                                    }
                                }
                                if (var65 != null) {
                                    int var78;
                                    if (var12.field7653 <= 0) {
                                        var78 = 512;
                                    } else {
                                        var78 = (var12.field7658 << 9) / var12.field7653;
                                    }
                                    int var79;
                                    if (var12.field7619 <= 0) {
                                        var79 = 512;
                                    } else {
                                        var79 = (var12.field7573 << 9) / var12.field7619;
                                    }
                                    int var80 = var12.field7658 / 2 + var18;
                                    int var81 = var12.field7573 / 2 + var19;
                                    if (!var12.field7617) {
                                        var81 += var12.field7669 * var79 >> 9;
                                        var80 += var12.field7700 * var78 >> 9;
                                    }
                                    class667.field9490.method1026();
                                    class275.field3370.method339(class667.field9490);
                                    class275.field3370.method400(var80, var81, var78, var79);
                                    class275.field3370.method319();
                                    if (var12.field7592) {
                                        class275.field3370.method364(false);
                                    }
                                    if (var12.field7617) {
                                        class672.field9542.method1022(var12.field7594);
                                        class672.field9542.method1036(var12.field7654);
                                        class672.field9542.method1032(var12.field7546);
                                        class672.field9542.method1033(var12.field7700, var12.field7669, var12.field7587);
                                    } else {
                                        int var82 = (var12.field7657 << 2) * class260.field3230[var12.field7594 << 3] >> 14;
                                        int var83 = (var12.field7657 << 2) * class260.field3229[var12.field7594 << 3] >> 14;
                                        class672.field9542.method1021(-var12.field7546 << 3);
                                        class672.field9542.method1036(var12.field7654 << 3);
                                        class672.field9542.method1033(var12.field7563 << 2, (var12.field7607 << 2) + var66 + var82, (var12.field7607 << 2) + var83);
                                        class672.field9542.method1025(var12.field7594 << 3);
                                    }
                                    var12.method3119(var65, class275.field3370, class392.field5398, 65535, class672.field9542);
                                    if (class518.field7371) {
                                        class275.field3370.method438(var18, var19, var12.field7658 + var18, var12.field7573 + var19);
                                    }
                                    if (var12.field7617) {
                                        if (var12.field7670) {
                                            var65.method188(class672.field9542, null, var12.field7657, 1);
                                        } else {
                                            var65.method228(class672.field9542, null, 1);
                                            if (var12.field7542 != null) {
                                                class275.field3370.method391(var12.field7542.method1539());
                                            }
                                        }
                                    } else if (var12.field7670) {
                                        var65.method188(class672.field9542, null, var12.field7657 << 2, 1);
                                    } else {
                                        var65.method228(class672.field9542, null, 1);
                                        if (var12.field7542 != null) {
                                            class275.field3370.method391(var12.field7542.method1539());
                                        }
                                    }
                                    if (class518.field7371) {
                                        class275.field3370.method432(arg1, arg7, arg3, arg5);
                                    }
                                    if (var12.field7592) {
                                        class275.field3370.method364(true);
                                    }
                                }
                                if (class397.field5443) {
                                    if (arg4) {
                                        class16.method75(var14, (byte) 23, var16, var13, var15);
                                    } else {
                                        class594.method3394(-2, var13, var16, var15, var14);
                                    }
                                }
                            } else if (var12.field7543 == 9) {
                                int var84;
                                int var85;
                                int var86;
                                int var87;
                                if (var12.field7598) {
                                    var84 = var12.field7573 + var19;
                                    var87 = var12.field7658 + var18;
                                    var86 = var19;
                                    var85 = var18;
                                } else {
                                    var84 = var19;
                                    var85 = var18;
                                    var86 = var19 + var12.field7573;
                                    var87 = var12.field7658 + var18;
                                }
                                if (var12.field7618 == 1) {
                                    class275.field3370.method380(var85, var84, var87, var86, var12.field7694, 0);
                                } else {
                                    class275.field3370.method437(var85, var84, var87, var86, var12.field7694, var12.field7618, 0);
                                }
                                if (class397.field5443) {
                                    if (arg4) {
                                        class16.method75(var14, (byte) -126, var16, var13, var15);
                                    } else {
                                        class594.method3394(-2, var13, var16, var15, var14);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0) {
            method4117(true, 13, -94, 110, false, -71, 96, 48, 93, 112, null);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    private final void method4118(int arg0) {
        field10351++;
        if (arg0 != 1359519171) {
            this.field10355 = null;
        }
        if (this.field10356 >= 0) {
            return;
        }
        if (this.field10341.field8514) {
            OpenGL.glGenBuffersARB(1, class582.field8230, 0);
            this.field10356 = class582.field8230[0];
            OpenGL.glBindBufferARB(this.field10335, this.field10356);
        } else {
            this.field10356 = 0;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)I")
    public int method265(boolean arg0) {
        if (!arg0) {
            this.field10354 = -7;
        }
        field10337++;
        return this.field10354;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljaggl/MapBuffer;I)Z")
    public final boolean method4119(MapBuffer arg0, int arg1) {
        field10340++;
        boolean var3 = true;
        if (this.field10347 != arg1) {
            if (this.field10356 > 0) {
                OpenGL.glBindBufferARB(this.field10335, this.field10356);
                if (this.field10347 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field10335, 0, this.field10343, this.field10341.field5036.getAddress());
                } else {
                    var3 = arg0.method3572();
                }
            }
            this.field10347 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public void method262(boolean arg0) {
        field10352++;
        if (!arg0) {
            this.field10355 = null;
        }
        if (this.field10356 > 0) {
            this.field10341.method3402(this.field10354, this.field10356, true);
            this.field10356 = -1;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljaggl/MapBuffer;ZB)Ljaclib/memory/Buffer;")
    public final Buffer method4120(MapBuffer arg0, boolean arg1, byte arg2) {
        field10353++;
        if (this.field10347 == 0) {
            this.method4118(1359519171);
            if (this.field10356 <= 0) {
                this.field10347 = 2;
                return this.field10355;
            }
            OpenGL.glBindBufferARB(this.field10335, this.field10356);
            if (arg1) {
                OpenGL.glBufferDataARBub(this.field10335, this.field10343, null, 0, this.field10333 ? 35040 : 35044);
                if (this.field10341.field5036.field9515 >= this.field10354) {
                    this.field10347 = 1;
                    return this.field10341.field5036;
                }
            }
            if (!arg0.method3571() && arg0.method3570(this.field10335, this.field10354, 35001)) {
                this.field10347 = 2;
                return arg0;
            }
        }
        if (arg2 > -1) {
            this.field10335 = 21;
        }
        return null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILoh;Ld;)V")
    public static final void method4121(int arg0, class404 arg1, class150 arg2) {
        class537.field7763 = arg2;
        field10334++;
        if (arg0 == -1) {
            class396.field5429 = arg1;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILjaclib/memory/Source;I)Z")
    public final boolean method4122(int arg0, Source arg1, int arg2) {
        field10342++;
        if (arg0 != 0) {
            field10345 = null;
        }
        if (arg2 <= this.field10343) {
            if (this.field10356 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field10335, this.field10356);
            OpenGL.glBufferSubDataARBa(this.field10335, 0, this.field10354, arg1.getAddress());
            this.field10341.field5046 += arg2 - this.field10354;
        } else {
            this.method4118(1359519171);
            if (this.field10356 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field10335, this.field10356);
            OpenGL.glBufferDataARBa(this.field10335, arg2, arg1.getAddress(), this.field10333 ? 35040 : 35044);
            this.field10341.field5046 += arg2 - this.field10354;
            this.field10343 = arg2;
        }
        this.field10354 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
    public void method267(int arg0, int arg1) {
        if (arg0 != 30903) {
            this.field10335 = -32;
        }
        field10349++;
        if (this.field10343 < arg1) {
            this.method4118(1359519171);
            if (this.field10356 > 0) {
                OpenGL.glBindBufferARB(this.field10335, this.field10356);
                OpenGL.glBufferDataARBub(this.field10335, arg1, null, 0, this.field10333 ? 35040 : 35044);
                this.field10341.field5046 += arg1 - this.field10343;
            } else {
                this.field10355 = this.field10341.method2314(false, arg1, false);
            }
            this.field10343 = arg1;
        }
        this.field10354 = arg1;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    public static void method4123(int arg0) {
        field10336 = null;
        if (arg0 > 22) {
            field10345 = null;
            field10344 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)J")
    public final long method4124(int arg0) {
        if (arg0 != 0) {
            this.field10341 = null;
        }
        field10348++;
        return this.field10356 == 0 ? this.field10355.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!qc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method262(true);
        field10350++;
        super.finalize();
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V")
    public final void method4125(int arg0) {
        if (this.field10341.field8514) {
            OpenGL.glBindBufferARB(this.field10335, this.field10356);
        }
        field10338++;
        if (arg0 >= -75) {
            method4121(-42, null, null);
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lai;IZ)V")
    public class740(class597 arg0, int arg1, boolean arg2) {
        this.field10335 = arg1;
        this.field10341 = arg0;
        this.field10333 = arg2;
    }
}
