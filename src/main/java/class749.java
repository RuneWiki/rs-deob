import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public abstract class class749 {

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "Z")
    private boolean field10475;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    private int field10471;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
    private int field10473;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "Loea;")
    public class594 field10467;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
    public int field10464;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field10463 = -1;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public static int field10465;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field10466;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public static int field10468;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    public static int field10469;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    public static int field10470;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public static int field10474;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "Lbda;")
    public static class503 field10472;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IBLhn;Lgs;)V")
    public static final void method4165(int arg0, byte arg1, class718 arg2, class43 arg3) {
        field10474++;
        if (class570.field8115 >= 50 || arg2 == null || arg2.field10070 == null || arg2.field10070.length <= arg0 || arg2.field10070[arg0] == null) {
            return;
        }
        int var4 = arg2.field10070[arg0][0];
        int var5 = var4 >> 8;
        int var6 = (var4 & 0xF2) >> 5;
        if (arg2.field10070[arg0].length > 1) {
            int var7 = (int) ((double) arg2.field10070[arg0].length * Math.random());
            if (var7 > 0) {
                var5 = arg2.field10070[arg0][var7];
            }
        }
        int var8 = var4 & 0x1F;
        int var9 = 256;
        if (arg2.field10052 != null && arg2.field10067 != null) {
            var9 = (int) ((double) (arg2.field10067[arg0] - arg2.field10052[arg0]) * Math.random()) + arg2.field10052[arg0];
        }
        int var10 = arg2.field10063 == null ? 255 : arg2.field10063[arg0];
        if (var8 == 0) {
            if (class468.field6748 == arg3) {
                if (!arg2.field10059) {
                    class247.method1652(var9, var6, true, var10, var5, 0);
                    return;
                }
                class335.method2140(-122, var9, var5, var10, var6, false, 0);
            }
        } else if (class471.field6781.field6685.method3134(27669) != 0) {
            int var11 = arg3.field644 - 256 >> 9;
            if (arg1 < 36) {
                field10470 = 23;
            }
            int var12 = arg3.field648 - 256 >> 9;
            int var13 = class468.field6748 == arg3 ? 0 : (arg3.field649 << 24) + var8 - (-(var11 << 16) - (var12 << 8));
            class719.field10073[class570.field8115++] = new class710((byte) (arg2.field10059 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg3);
        }
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(B)V")
    public static void method4166(byte arg0) {
        int var1 = 126 % ((arg0 + 6) / 61);
        field10472 = null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BI)I")
    public static final int method4167(byte arg0, int arg1) {
        field10469++;
        if (arg0 <= 19) {
            method4167((byte) 83, -31);
        }
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(B)V")
    public abstract void method3076(byte arg0);

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([BII)V")
    public final void method4168(byte[] arg0, int arg1, int arg2) {
        if (arg2 != -24038) {
            field10463 = 4;
        }
        this.method3076((byte) -123);
        field10468++;
        if (this.field10473 >= arg1) {
            OpenGL.glBufferSubDataARBub(this.field10471, 0, arg1, arg0, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field10471, arg1, arg0, 0, this.field10475 ? 35040 : 35044);
            this.field10467.field8563 += arg1 - this.field10473;
            this.field10473 = arg1;
        }
    }

    @OriginalMember(owner = "client!lr", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field10466++;
        this.field10467.method3416(this.field10464, 114, this.field10473);
        super.finalize();
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I[Ldm;IIIZIIIII)V")
    public static final void method4169(int arg0, class50[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field10465++;
        class359.field5046.method584(arg10, arg6, arg0, arg2);
        for (int var11 = 0; var11 < arg1.length; var11++) {
            class50 var12 = arg1[var11];
            if (var12 != null && (var12.field791 == arg7 || arg7 == -1412584499 && class755.field10512 == var12)) {
                int var13 = var12.field719 + arg9;
                int var14 = var12.field856 + arg8;
                int var15 = var12.field783 + var13 + 1;
                int var16 = var14 - (-var12.field830 - 1);
                int var17;
                if (arg3 == -1) {
                    class745.field10438[class114.field1830].setBounds(var12.field719 + arg9, var12.field856 + arg8, var12.field783, var12.field830);
                    var17 = class114.field1830++;
                } else {
                    var17 = arg3;
                }
                var12.field794 = var17;
                var12.field787 = class605.field8787;
                if (!client.method1948(var12)) {
                    if (var12.field740 != 0) {
                        class76.method764(2047, var12);
                    }
                    int var18 = var12.field719 + arg9;
                    int var19 = var12.field856 + arg8;
                    int var20 = 0;
                    int var21 = 0;
                    if (class200.field2876) {
                        var20 = class228.method1570((byte) 73);
                        var21 = class252.method1712((byte) 37);
                    }
                    int var22 = var12.field731;
                    if (class588.field8274 && (client.method1943(var12).field4679 != 0 || var12.field765 == 0) && var22 > 127) {
                        var22 = 127;
                    }
                    if (class755.field10512 == var12) {
                        if (arg7 != -1412584499 && (class425.field5951 == var12.field862 || class262.field3830 == var12.field862)) {
                            class306.field4310 = arg9;
                            class369.field5173 = arg8;
                            class224.field3206 = arg1;
                            continue;
                        }
                        if (class246.field3441 && class34.field454) {
                            int var23 = class422.field5917.method1597(127) + var20;
                            int var24 = var21 + class422.field5917.method1592(true);
                            int var25 = var24 - class128.field1933;
                            int var26 = var23 - class404.field5633;
                            if (var26 < class113.field1808) {
                                var26 = class113.field1808;
                            }
                            if (class113.field1808 + class148.field2266.field783 < var12.field783 + var26) {
                                var26 = class148.field2266.field783 + class113.field1808 - var12.field783;
                            }
                            if (var25 < class274.field3907) {
                                var25 = class274.field3907;
                            }
                            if (var12.field830 + var25 > class274.field3907 - -class148.field2266.field830) {
                                var25 = class274.field3907 + class148.field2266.field830 - var12.field830;
                            }
                            var18 = var26;
                            var19 = var25;
                        }
                        if (class262.field3830 == var12.field862) {
                            var22 = 128;
                        }
                    }
                    int var29;
                    int var30;
                    int var31;
                    int var32;
                    if (var12.field765 == 2) {
                        var31 = arg0;
                        var29 = arg6;
                        var32 = arg2;
                        var30 = arg10;
                    } else {
                        int var27 = var12.field783 + var18;
                        int var28 = var12.field830 + var19;
                        if (var12.field765 == 9) {
                            var27++;
                            var28++;
                        }
                        var29 = arg6 >= var19 ? arg6 : var19;
                        var30 = arg10 < var18 ? var18 : arg10;
                        var31 = var27 >= arg0 ? arg0 : var27;
                        var32 = var28 >= arg2 ? arg2 : var28;
                    }
                    if (var31 > var30 && var29 < var32) {
                        if (var12.field740 != 0) {
                            if (class492.field7007 == var12.field740 || class407.field5674 == var12.field740) {
                                class62.method671(var18, var19, -106, var12);
                                if (!class200.field2876) {
                                    class16.method100(var12.field830, var18, class407.field5674 == var12.field740, 5093, var12.field783, var19);
                                    class359.field5046.method584(arg10, arg6, arg0, arg2);
                                }
                                class329.field4646[var17] = true;
                                continue;
                            }
                            if (class349.field4934 == var12.field740) {
                                if (var12.method445((byte) -76, class359.field5046) != null) {
                                    class565.method3297(arg4 ^ 0xFFFFEFF2);
                                    class496.method2986((byte) -72, var12, class359.field5046, var19, var18);
                                    class443.field6170[var17] = true;
                                    class359.field5046.method584(arg10, arg6, arg0, arg2);
                                    if (class200.field2876) {
                                        if (arg5) {
                                            class6.method33(true, var16, var14, var13, var15);
                                        } else {
                                            class2.method6(var15, var14, var13, (byte) 109, var16);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class183.field2612 == var12.field740) {
                                if (var12.method445((byte) -76, class359.field5046) != null) {
                                    class601.method3494(var19, var12, var18, arg4 ^ 0x6394);
                                    class443.field6170[var17] = true;
                                    class359.field5046.method584(arg10, arg6, arg0, arg2);
                                    if (class200.field2876) {
                                        if (arg5) {
                                            class6.method33(true, var16, var14, var13, var15);
                                        } else {
                                            class2.method6(var15, var14, var13, (byte) 35, var16);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class528.field7506 == var12.field740) {
                                class331.method2119(class679.field9571, var12.field783, var12.field830, -75, var19, var18, class359.field5046);
                                class329.field4646[var17] = true;
                                class359.field5046.method584(arg10, arg6, arg0, arg2);
                                continue;
                            }
                            if (class179.field2577 == var12.field740) {
                                class184.method1314(var12.field830, var19, class359.field5046, var12.field783, arg4 ^ 0xFFFFEFAD, var18);
                                class329.field4646[var17] = true;
                                class359.field5046.method584(arg10, arg6, arg0, arg2);
                                continue;
                            }
                            if (class618.field8934 == var12.field740) {
                                if (!class143.field2194 && !class646.field9151) {
                                    continue;
                                }
                                int var33 = var12.field783 + var18;
                                int var34 = var19 + 15;
                                if (class200.field2876) {
                                    if (arg5) {
                                        class6.method33(true, var16, var14, var13, var15);
                                    } else {
                                        class2.method6(var15, var14, var13, (byte) 35, var16);
                                    }
                                }
                                if (class143.field2194) {
                                    int var35 = -256;
                                    if (class77.field1452 < 20) {
                                        var35 = -65536;
                                    }
                                    class722.field10090.method662(var33, -1, var35, "Fps:" + class77.field1452, var34, (byte) 96);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (var37 > 98304) {
                                        if (class709.field9913) {
                                            class656.method3698(false);
                                            for (int var39 = 0; var39 < 10; var39++) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            if (var37 > 65536) {
                                                class570.method3327((byte) 45, 4, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                            }
                                        }
                                        var38 = -65536;
                                    }
                                    class722.field10090.method662(var33, -1, var38, "Mem:" + var37 + "k", var34, (byte) 100);
                                    var34 += 15;
                                    class722.field10090.method662(var33, -1, -256, "In:" + class186.field2684 + "B/s Out:" + class252.field3601 + "B/s", var34, (byte) 102);
                                    var34 += 15;
                                    int var40 = class359.field5046.method641() / 1024;
                                    class722.field10090.method662(var33, -1, ~var40 < -65537 ? -65536 : -256, "Offheap:" + var40 + "k", var34, (byte) 96);
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < 37; var44++) {
                                        if (class250.field3530[var44] != null) {
                                            var41 += class250.field3530[var44].method1379(true);
                                            var42 += class250.field3530[var44].method1380((byte) -105);
                                            var43 += class250.field3530[var44].method1378((byte) 114);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class180.method1290(true, arg4 ^ 0x6050, 2, 0, (long) var46) + "% (" + var45 + "%)";
                                    class242.field3393.method662(var33, -1, -256, var47, var34, (byte) 96);
                                    var34 += 12;
                                }
                                if (class20.field260 > 0) {
                                    class242.field3393.method662(var33, -1, -256, "Particles: " + class414.field5756 + " / " + class20.field260, var34, (byte) 85);
                                }
                                var34 += 12;
                                if (class646.field9151) {
                                    class242.field3393.method662(var33, -1, -256, "Polys: " + class359.field5046.method594() + " Models: " + class359.field5046.method598(), var34, (byte) 124);
                                    var34 += 12;
                                    class242.field3393.method662(var33, -1, -256, "Ls: " + class702.field9856 + " La: " + class78.field1465 + " NPC: " + class360.field5055 + " Pl: " + class527.field7496, var34, (byte) 67);
                                    var34 += 12;
                                    class230.method1581(true);
                                }
                                class329.field4646[var17] = true;
                                continue;
                            }
                        }
                        if (var12.field765 == 0) {
                            if (class329.field4645 == var12.field740 && class359.field5046.method562()) {
                                class359.field5046.method625(var18, var19, var12.field783, var12.field830);
                            }
                            method4169(var31, arg1, var32, var17, arg4, arg5, var29, var12.field792, var19 - var12.field869, -var12.field790 + var18, var30);
                            if (var12.field863 != null) {
                                method4169(var31, var12.field863, var32, var17, -4183, arg5, var29, var12.field792, var19 - var12.field869, -var12.field790 + var18, var30);
                            }
                            class548 var48 = (class548) class310.field4383.method4203(true, (long) var12.field792);
                            if (var48 != null) {
                                class165.method1226(var30, var48.field7723, var32, var19, var29, (byte) 60, var31, var18, var17);
                            }
                            if (class329.field4645 == var12.field740 && class359.field5046.method562()) {
                                class359.field5046.method533();
                            }
                            class359.field5046.method584(arg10, arg6, arg0, arg2);
                        }
                        if (class280.field3932[var17] || class478.field6822 > 1) {
                            if (var12.field765 == 3) {
                                if (var22 == 0) {
                                    if (var12.field758) {
                                        class359.field5046.method630(var18, var19, var12.field783, var12.field830, var12.field874, 0);
                                    } else {
                                        class359.field5046.method616(var18, var19, var12.field783, var12.field830, var12.field874, 0);
                                    }
                                } else if (var12.field758) {
                                    class359.field5046.method630(var18, var19, var12.field783, var12.field830, 255 - (var22 & 0xFF) << 24 | var12.field874 & 0xFFFFFF, 1);
                                } else {
                                    class359.field5046.method616(var18, var19, var12.field783, var12.field830, 255 - (var22 & 0xFF) << 24 | var12.field874 & 0xFFFFFF, 1);
                                }
                                if (class200.field2876) {
                                    if (arg5) {
                                        class6.method33(true, var16, var14, var13, var15);
                                    } else {
                                        class2.method6(var15, var14, var13, (byte) 62, var16);
                                    }
                                }
                            } else if (var12.field765 == 4) {
                                class59 var49 = var12.method451((byte) 121, class359.field5046);
                                if (var49 != null) {
                                    int var50 = var12.field874;
                                    String var51 = var12.field859;
                                    if (var12.field861 != -1) {
                                        class253 var52 = class558.field7942.method721(106, var12.field861);
                                        var51 = var52.field3644;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((var52.field3623 == 1 || var12.field748 != 1) && var12.field748 != -1) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class432.method2620(false, var12.field748);
                                        }
                                    }
                                    if (var12.field803 != -1) {
                                        var51 = class706.method3958((byte) 90, var12.field803);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class508.field7243 == var12) {
                                        var51 = class281.field3972.method1839((byte) 45, class744.field10426);
                                        var50 = var12.field874;
                                    }
                                    if (class445.field6183) {
                                        class359.field5046.method583(var18, var19, var12.field783 + var18, var19 - -var12.field830);
                                    }
                                    var49.method658(var18, var12.field825, null, var12.field710 ? 255 - (var22 & 0xFF) << 24 : -1, 0, class237.field3358, true, var50 | 255 - (var22 & 0xFF) << 24, var12.field812, var12.field830, var12.field829, var19, var51, null, var12.field783, var12.field840, 0);
                                    if (class445.field6183) {
                                        class359.field5046.method584(arg10, arg6, arg0, arg2);
                                    }
                                    if (var51.trim().length() > 0) {
                                        if (!class445.field6183) {
                                            class323 var53 = class268.method1793(class359.field5046, (byte) -109, var12.field801);
                                            int var54 = var53.method2072(var12.field783, class237.field3358, var51, (byte) 40);
                                            int var55 = var53.method2077(-1, class237.field3358, var12.field825, var12.field783, var51);
                                            if (class200.field2876) {
                                                if (arg5) {
                                                    class6.method33(true, var19 + var55, var19, var18, var18 + var54);
                                                } else {
                                                    class2.method6(var18 + var54, var19, var18, (byte) 114, var19 + var55);
                                                }
                                            }
                                        } else if (class200.field2876) {
                                            if (arg5) {
                                                class6.method33(true, var16, var14, var13, var15);
                                            } else {
                                                class2.method6(var15, var14, var13, (byte) 46, var16);
                                            }
                                        }
                                    }
                                } else if (class592.field8309) {
                                    class262.method1776(arg4 ^ 0xFFFFEFA9, var12);
                                }
                            } else if (var12.field765 == 5) {
                                if (var12.field749 < 0) {
                                    class743 var57;
                                    if (var12.field861 != -1) {
                                        class90 var56 = var12.field720 ? class468.field6748.field4932 : null;
                                        var57 = class558.field7942.method726(var12.field861, var12.field762, var12.field748, class359.field5046, var12.field795 | 0xFF000000, var12.field745, (byte) -85, var56);
                                    } else if (var12.field803 == -1) {
                                        var57 = var12.method447(class359.field5046, 6473);
                                    } else {
                                        var57 = class64.method685(6, class359.field5046, var12.field803);
                                    }
                                    if (var57 != null) {
                                        int var58 = var57.method82();
                                        int var59 = var57.method83();
                                        int var60 = 255 - (var22 & 0xFF) << 24 | (var12.field874 == 0 ? 16777215 : var12.field874 & 0xFFFFFF);
                                        if (var12.field706) {
                                            class359.field5046.method583(var18, var19, var12.field783 + var18, var19 - -var12.field830);
                                            if (var12.field835 != 0) {
                                                int var61 = (var58 - (1 - var12.field783)) / var58;
                                                int var62 = (var12.field830 + var59 - 1) / var59;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var12.field874 == 0) {
                                                            var57.method4134((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field835);
                                                        } else {
                                                            var57.method4141((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field835, 0, var60, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var12.field874 == 0 && var22 == 0) {
                                                var57.method4137(var18, var19, var12.field783, var12.field830);
                                            } else {
                                                var57.method91(var18, var19, var12.field783, var12.field830, 0, var60, 1);
                                            }
                                            class359.field5046.method584(arg10, arg6, arg0, arg2);
                                        } else if (var12.field874 == 0 && var22 == 0) {
                                            if (var12.field835 != 0) {
                                                var57.method4134((float) var12.field783 / 2.0F + (float) var18, (float) var12.field830 / 2.0F + (float) var19, var12.field783 * 4096 / var58, var12.field835);
                                            } else if (var12.field783 == var58 && var12.field830 == var59) {
                                                var57.method4135(var18, var19);
                                            } else {
                                                var57.method4136(var18, var19, var12.field783, var12.field830);
                                            }
                                        } else if (var12.field835 != 0) {
                                            var57.method4141((float) var12.field783 / 2.0F + (float) var18, (float) var12.field830 / 2.0F + (float) var19, var12.field783 * 4096 / var58, var12.field835, 0, var60, 1);
                                        } else if (var12.field783 == var58 && var12.field830 == var59) {
                                            var57.method86(var18, var19, 0, var60, 1);
                                        } else {
                                            var57.method4143(var18, var19, var12.field783, var12.field830, 0, var60, 1);
                                        }
                                    } else if (class592.field8309) {
                                        class262.method1776(0, var12);
                                    }
                                } else {
                                    var12.method454(class206.field2944, (byte) -115, class569.field8108).method2021(var19, -22449, var12.field830, var12.field771 << 3, var12.field783, var12.field761 << 3, class359.field5046, 0, 0, var18);
                                }
                                if (class200.field2876) {
                                    if (arg5) {
                                        class6.method33(true, var16, var14, var13, var15);
                                    } else {
                                        class2.method6(var15, var14, var13, (byte) 35, var16);
                                    }
                                }
                            } else if (var12.field765 == 6) {
                                class205.method1430(-108);
                                class469 var65 = null;
                                int var66 = 0;
                                if (var12.field861 != -1) {
                                    class253 var74 = class558.field7942.method721(-20, var12.field861);
                                    if (var74 != null) {
                                        class253 var75 = var74.method1718(false, var12.field748);
                                        class718 var76 = var12.field853 == -1 ? null : class698.field9806.method851(var12.field853, arg4 + 4181);
                                        class90 var77 = var12.field720 ? class468.field6748.field4932 : null;
                                        var65 = var75.method1730(var77, var76, var12.field798, 2048, (byte) 45, var12.field714, 1, var12.field751, class359.field5046);
                                        if (var65 == null) {
                                            class262.method1776(0, var12);
                                        } else {
                                            var66 = -var65.method338() >> 1;
                                        }
                                    }
                                } else if (var12.field851 == 5) {
                                    int var67 = var12.field780;
                                    if (var67 >= 0 && var67 < 2048) {
                                        class349 var68 = class165.field2442[var67];
                                        class718 var69 = var12.field853 == -1 ? null : class698.field9806.method851(var12.field853, arg4 ^ 0x1057);
                                        if (var68 != null && (class675.field9486 == var67 || class46.method415(false, var68.field4939) == var12.field819)) {
                                            var65 = var68.field4932.method846(var12.field751, 0, var12.field714, null, 0, 0, null, var12.field798, class742.field10408, null, class134.field2102, class698.field9806, -1, class675.field9475, true, 2048, class284.field4039, class359.field5046, 117, var69, class558.field7942);
                                        }
                                    }
                                } else if (var12.field851 == 8 || var12.field851 == 9) {
                                    class380 var71 = class105.method908(0, false, var12.field780);
                                    class718 var72 = var12.field853 == -1 ? null : class698.field9806.method851(var12.field853, -2);
                                    if (var71 != null) {
                                        class90 var73 = var12.field720 ? class468.field6748.field4932 : null;
                                        var65 = var71.method2381(-241, var12.field751, var12.field851 == 9, var12.field714, var12.field819, class359.field5046, var73, 2048, var72, var12.field798);
                                    }
                                } else if (var12.field853 == -1) {
                                    var65 = var12.method452(-1, class742.field10408, (byte) -122, null, class284.field4039, class698.field9806, 2048, class558.field7942, class134.field2102, class468.field6748.field4932, class675.field9475, class359.field5046, 0, -1);
                                    if (var65 == null && class592.field8309) {
                                        class262.method1776(0, var12);
                                    }
                                } else {
                                    class718 var70 = class698.field9806.method851(var12.field853, -2);
                                    var65 = var12.method452(var12.field714, class742.field10408, (byte) -88, var70, class284.field4039, class698.field9806, 2048, class558.field7942, class134.field2102, class468.field6748.field4932, class675.field9475, class359.field5046, var12.field751, var12.field798);
                                    if (var65 == null && class592.field8309) {
                                        class262.method1776(0, var12);
                                    }
                                }
                                if (var65 != null) {
                                    int var78;
                                    if (var12.field814 > 0) {
                                        var78 = (var12.field783 << 9) / var12.field814;
                                    } else {
                                        var78 = 512;
                                    }
                                    int var79;
                                    if (var12.field876 > 0) {
                                        var79 = (var12.field830 << 9) / var12.field876;
                                    } else {
                                        var79 = 512;
                                    }
                                    int var80 = var12.field783 / 2 + var18;
                                    int var81 = var12.field830 / 2 + var19;
                                    if (!var12.field844) {
                                        var80 += var12.field736 * var78 >> 9;
                                        var81 += var12.field804 * var79 >> 9;
                                    }
                                    class57.field1066.method181();
                                    class359.field5046.method538(class57.field1066);
                                    class359.field5046.method545(var80, var81, var78, var79);
                                    class359.field5046.method619();
                                    if (var12.field813) {
                                        class359.field5046.method539(false);
                                    }
                                    if (var12.field844) {
                                        class25.field369.method172(var12.field875);
                                        class25.field369.method182(var12.field733);
                                        class25.field369.method156(var12.field838);
                                        class25.field369.method149(var12.field736, var12.field804, var12.field870);
                                    } else {
                                        int var82 = (var12.field753 << 2) * class316.field4487[var12.field875 << 3] >> 14;
                                        int var83 = (var12.field753 << 2) * class316.field4490[var12.field875 << 3] >> 14;
                                        class25.field369.method190(-var12.field838 << 3);
                                        class25.field369.method182(var12.field733 << 3);
                                        class25.field369.method149(var12.field776 << 2, (var12.field764 << 2) + var66 + var82, var83 - -(var12.field764 << 2));
                                        class25.field369.method188(var12.field875 << 3);
                                    }
                                    var12.method440(class359.field5046, class605.field8787, 0, var65, class25.field369);
                                    if (class445.field6183) {
                                        class359.field5046.method583(var18, var19, var12.field783 + var18, var12.field830 + var19);
                                    }
                                    if (var12.field844) {
                                        if (var12.field865) {
                                            var65.method343(class25.field369, null, var12.field753, 1);
                                        } else {
                                            var65.method329(class25.field369, null, 1);
                                            if (var12.field709 != null) {
                                                class359.field5046.method593(var12.field709.method4180());
                                            }
                                        }
                                    } else if (var12.field865) {
                                        var65.method343(class25.field369, null, var12.field753 << 2, 1);
                                    } else {
                                        var65.method329(class25.field369, null, 1);
                                        if (var12.field709 != null) {
                                            class359.field5046.method593(var12.field709.method4180());
                                        }
                                    }
                                    if (class445.field6183) {
                                        class359.field5046.method584(arg10, arg6, arg0, arg2);
                                    }
                                    if (var12.field813) {
                                        class359.field5046.method539(true);
                                    }
                                }
                                if (class200.field2876) {
                                    if (arg5) {
                                        class6.method33(true, var16, var14, var13, var15);
                                    } else {
                                        class2.method6(var15, var14, var13, (byte) 45, var16);
                                    }
                                }
                            } else if (var12.field765 == 9) {
                                int var84;
                                int var85;
                                int var86;
                                int var87;
                                if (var12.field806) {
                                    var87 = var18;
                                    var86 = var19;
                                    var84 = var12.field830 + var19;
                                    var85 = var12.field783 + var18;
                                } else {
                                    var84 = var19;
                                    var85 = var12.field783 + var18;
                                    var86 = var12.field830 + var19;
                                    var87 = var18;
                                }
                                if (var12.field718 == 1) {
                                    class359.field5046.method553(var87, var84, var85, var86, var12.field874, 0);
                                } else {
                                    class359.field5046.method626(var87, var84, var85, var86, var12.field874, var12.field718, 0);
                                }
                                if (class200.field2876) {
                                    if (arg5) {
                                        class6.method33(true, var16, var14, var13, var15);
                                    } else {
                                        class2.method6(var15, var14, var13, (byte) 61, var16);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg4 != -4183) {
            field10472 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Loea;I[BIZ)V")
    public class749(class594 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field10475 = arg4;
        this.field10471 = arg1;
        this.field10473 = arg3;
        this.field10467 = arg0;
        OpenGL.glGenBuffersARB(1, class717.field10036, 0);
        this.field10464 = class717.field10036[0];
        this.method3076((byte) -123);
        OpenGL.glBufferDataARBub(arg1, this.field10473, arg2, 0, this.field10475 ? 35040 : 35044);
        this.field10467.field8563 += this.field10473;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Loea;ILjaclib/memory/Buffer;IZ)V")
    public class749(class594 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field10473 = arg3;
        this.field10475 = arg4;
        this.field10471 = arg1;
        this.field10467 = arg0;
        OpenGL.glGenBuffersARB(1, class717.field10036, 0);
        this.field10464 = class717.field10036[0];
        this.method3076((byte) -128);
        OpenGL.glBufferDataARBa(arg1, this.field10473, arg2.getAddress(), this.field10475 ? 35040 : 35044);
        this.field10467.field8563 += this.field10473;
    }
}
