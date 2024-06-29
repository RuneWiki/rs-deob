import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class280 extends class214 implements class193 {

    @OriginalMember(owner = "client!qq", name = "eb", descriptor = "B")
    private byte field3947;

    @OriginalMember(owner = "client!qq", name = "U", descriptor = "Z")
    private boolean field3937;

    @OriginalMember(owner = "client!qq", name = "cb", descriptor = "B")
    private byte field3945;

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "Z")
    private boolean field3926;

    @OriginalMember(owner = "client!qq", name = "db", descriptor = "B")
    private byte field3946;

    @OriginalMember(owner = "client!qq", name = "F", descriptor = "S")
    private short field3922;

    @OriginalMember(owner = "client!qq", name = "V", descriptor = "Z")
    private boolean field3938;

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "Lmj;")
    private class394 field3923;

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "Lmc;")
    private class69 field3931;

    @OriginalMember(owner = "client!qq", name = "E", descriptor = "Z")
    public static boolean field3921 = false;

    @OriginalMember(owner = "client!qq", name = "A", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!qq", name = "M", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!qq", name = "P", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!qq", name = "Q", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!qq", name = "R", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!qq", name = "S", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!qq", name = "T", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!qq", name = "X", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!qq", name = "Y", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!qq", name = "Z", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!qq", name = "ab", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!qq", name = "bb", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!qq", name = "fb", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!qq", name = "gb", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!qq", name = "W", descriptor = "Lsg;")
    public static class226 field3939;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Luo;BI)Lmj;", line = 4)
    private final class394 method1825(class345 arg0, byte arg1, int arg2) {
        ++field3942;
        int var4 = -13 % ((arg1 - 40) / 58);
        if (this.field3923 != null && ~arg0.method139(this.field3923.method1424(), arg2) == -1) {
            return this.field3923;
        } else {
            class33 var5 = this.method1829(arg0, (byte) 45, false, arg2);
            return var5 == null ? null : var5.field516;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)I", line = 23)
    public final int method672(int arg0) {
        ++field3920;
        if (arg0 != 17011) {
            method1830(4, -91, -113);
        }
        return this.field3945;
    }

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "(I)V", line = 34)
    public static void method1826(int arg0) {
        if (arg0 == -30862) {
            field3939 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(Z)V", line = 44)
    public static final void method1827(boolean arg0) {
        ++field3928;
        class239 var1 = class436.method2740(15, 0, -323285792);
        var1.method1628(14478);
        if (!arg0) {
            method1826(89);
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)I", line = 60)
    public final int method684(int arg0) {
        ++field3934;
        return arg0 != -13726 ? 76 : this.field3946;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILuo;)V", line = 75)
    public final void method676(int arg0, class345 arg1) {
        ++field3927;
        if (arg0 >= -58) {
            method1827(true);
        }
        Object var3 = null;
        class69 var5;
        if (this.field3931 == null && this.field3938) {
            class33 var4 = this.method1829(arg1, (byte) 45, true, 131072);
            var5 = var4 == null ? null : var4.field520;
        } else {
            var5 = this.field3931;
            this.field3931 = null;
        }
        if (var5 != null) {
            class423.method2681(var5, this.field3947, super.field2985, super.field2990, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)I", line = 106)
    public final int method1398(int arg0) {
        ++field3933;
        if (arg0 != 0) {
            this.method685(121, (class345) null, 113);
        }
        return this.field3923 == null ? 0 : this.field3923.method1443();
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Luo;I)V", line = 118)
    public final void method677(class345 arg0, int arg1) {
        ++field3932;
        Object var3 = null;
        if (arg1 <= 33) {
            method1833(-11, -7, 117, (byte) -3, (class345) null, (class64) null);
        }
        class69 var5;
        if (this.field3931 == null && this.field3938) {
            class33 var4 = this.method1829(arg0, (byte) 45, true, 131072);
            var5 = var4 != null ? var4.field520 : null;
        } else {
            var5 = this.field3931;
            this.field3931 = null;
        }
        if (var5 != null) {
            class91.method648(var5, this.field3947, super.field2985, super.field2990, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(Luo;I)V", line = 146)
    public final void method678(class345 arg0, int arg1) {
        ++field3924;
        if (arg1 != -22948) {
            this.field3922 = -80;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)I", line = 160)
    public final int method689(byte arg0) {
        ++field3949;
        if (arg0 != -83) {
            method1831(5, -116);
        }
        return this.field3922 & 65535;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZI[Lms;IIIIII)V", line = 175)
    public static final void method1828(int arg0, boolean arg1, int arg2, class453[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (!arg1) {
            ++field3940;
            class64.field949.method136(arg8, arg9, arg2, arg7);
            for (int var10 = 0; arg3.length > var10; ++var10) {
                class453 var11 = arg3[var10];
                if (var11 != null && (~var11.field6470 == ~arg4 || ~arg4 == 1412584498 && class432.field6109 == var11)) {
                    int var12;
                    if (arg0 == -1) {
                        class192.field2642[class154.field2170].setBounds(var11.field6363 - -arg5, var11.field6418 + arg6, var11.field6342, var11.field6447);
                        var12 = class154.field2170++;
                    } else {
                        var12 = arg0;
                    }
                    var11.field6315 = class276.field3837;
                    var11.field6319 = var12;
                    if (!client.method1097(var11)) {
                        if (~var11.field6403 < -1) {
                            class57.method460(var11, (byte) 119);
                        }
                        int var13 = var11.field6363 + arg5;
                        int var14 = var11.field6418 + arg6;
                        int var15 = var11.field6333;
                        if (class293.field4106 && (client.method1091(var11).field1985 != 0 || ~var11.field6356 == -1) && var15 > 127) {
                            var15 = 127;
                        }
                        if (class432.field6109 == var11) {
                            if (arg4 != -1412584499 && !var11.field6385) {
                                class254.field3583 = arg6;
                                class90.field1254 = arg3;
                                class83.field1185 = arg5;
                                continue;
                            }
                            if (class5.field92 && class292.field4095) {
                                int var16 = class239.field3410.method1071((byte) -12);
                                int var17 = class239.field3410.method1068((byte) 81);
                                int var18 = var16 - class243.field3451;
                                int var19 = var17 - class73.field1048;
                                if (~class326.field4459 < ~var18) {
                                    var18 = class326.field4459;
                                }
                                if (var11.field6342 + var18 > class326.field4459 + client.field2275.field6342) {
                                    var18 = -var11.field6342 + client.field2275.field6342 + class326.field4459;
                                }
                                if (class373.field5242 > var19) {
                                    var19 = class373.field5242;
                                }
                                if (var11.field6447 + var19 > class373.field5242 + client.field2275.field6447) {
                                    var19 = -var11.field6447 + class373.field5242 - -client.field2275.field6447;
                                }
                                var13 = var18;
                                var14 = var19;
                            }
                            if (!var11.field6385) {
                                var15 = 128;
                            }
                        }
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        if (~var11.field6356 == -3) {
                            var20 = arg9;
                            var21 = arg7;
                            var22 = arg8;
                            var23 = arg2;
                        } else {
                            int var24 = var11.field6342 + var13;
                            int var25 = var11.field6447 + var14;
                            var20 = ~var14 >= ~arg9 ? arg9 : var14;
                            var22 = ~arg8 <= ~var13 ? arg8 : var13;
                            if (var11.field6356 == 9) {
                                ++var25;
                                ++var24;
                            }
                            var23 = var24 >= arg2 ? arg2 : var24;
                            var21 = var25 < arg7 ? var25 : arg7;
                        }
                        if (~var23 < ~var22 && ~var20 > ~var21) {
                            if (var11.field6403 != 0) {
                                if (~var11.field6403 == -1338 || var11.field6403 == 1403) {
                                    class377.method2413(var11.field6447, var14, ~var11.field6403 == -1404, -113, var11.field6342, var13);
                                    class377.field5395[var12] = true;
                                    class64.field949.method136(arg8, arg9, arg2, arg7);
                                    continue;
                                }
                                if (var11.field6403 == 1338) {
                                    if (var11.method2811(class64.field949, (byte) -113) != null) {
                                        class285.method1860(12);
                                        class90.method642(class64.field949, var11, var14, var13, (byte) -43);
                                        class25.field458[var12] = true;
                                        class64.field949.method136(arg8, arg9, arg2, arg7);
                                    }
                                    continue;
                                }
                                if (var11.field6403 == 1339) {
                                    if (var11.method2811(class64.field949, (byte) -113) != null) {
                                        class173.method1139(var11, -277, var14, var13);
                                        class25.field458[var12] = true;
                                        class64.field949.method136(arg8, arg9, arg2, arg7);
                                    }
                                    continue;
                                }
                                if (var11.field6403 == 1400) {
                                    class150.method1019(var14, var13, class163.field2253, var11.field6342, class64.field949, var11.field6447, arg1);
                                    class377.field5395[var12] = true;
                                    class64.field949.method136(arg8, arg9, arg2, arg7);
                                    continue;
                                }
                                if (var11.field6403 == 1401) {
                                    class198.method1291(var13, 0, var11.field6447, var14, var11.field6342, class64.field949);
                                    class377.field5395[var12] = true;
                                    class64.field949.method136(arg8, arg9, arg2, arg7);
                                    continue;
                                }
                                if (var11.field6403 == 1405) {
                                    if (!class420.field5963 && !class359.field4899) {
                                        continue;
                                    }
                                    int var26 = var11.field6342 + var13;
                                    int var27 = var14 + 15;
                                    if (class420.field5963) {
                                        class159.field2234.method2284(var26, 0, var27, -256, -1, "Fps:" + class70.field1030);
                                        var27 += 15;
                                        Runtime var28 = Runtime.getRuntime();
                                        int var29 = (int) ((var28.totalMemory() + -var28.freeMemory()) / 1024L);
                                        int var30 = -256;
                                        if (~var29 < -65537) {
                                            var30 = -65536;
                                        }
                                        class159.field2234.method2284(var26, 0, var27, var30, -1, "Mem:" + var29 + "k");
                                        var27 += 15;
                                        int var31 = class64.field949.method145() / 1024;
                                        class159.field2234.method2284(var26, 0, var27, var31 <= 65536 ? -256 : -65536, -1, "Offheap:" + var31 + "k");
                                        var27 += 15;
                                        int var32 = 0;
                                        int var33 = 0;
                                        int var34 = 0;
                                        for (int var35 = 0; ~var35 > -30; ++var35) {
                                            var32 += class273.field3788[var35].method1130(true);
                                            var33 += class273.field3788[var35].method1140(-125);
                                            var34 += class273.field3788[var35].method1133((byte) 1);
                                        }
                                        int var36 = var34 * 100 / var32;
                                        int var37 = var33 * 10000 / var32;
                                        String var38 = "Cache:" + class279.method1818(true, 0, 2, (long) var37, 79) + "% (" + var36 + "%)";
                                        class51.field711.method2284(var26, 0, var27, -256, -1, var38);
                                        var27 += 12;
                                    }
                                    if (~class274.field3820 < -1) {
                                        class51.field711.method2284(var26, 0, var27, -256, -1, "Particles: " + class302.field4167 + " / " + class274.field3820);
                                    }
                                    var27 += 12;
                                    if (class359.field4899) {
                                        class51.field711.method2284(var26, 0, var27, -256, -1, "Polys: " + class64.field949.method64() + " Models: " + class64.field949.method131());
                                        var27 += 12;
                                        class51.field711.method2284(var26, 0, var27, -256, -1, "Ls: " + class360.field4983 + " La: " + class452.field6307 + " NPC: " + class205.field2820 + " Pl: " + class414.field5885);
                                        var27 += 12;
                                        class361.method2319((byte) -36);
                                    }
                                    class377.field5395[var12] = true;
                                    continue;
                                }
                            }
                            if (var11.field6356 == 0) {
                                if (~var11.field6403 == -1408 && class64.field949.method141()) {
                                    class64.field949.method45(var13, var14, var11.field6342, var11.field6447);
                                }
                                method1828(var12, false, var23, arg3, var11.field6314, -var11.field6444 + var13, var14 - var11.field6344, var21, var22, var20);
                                if (var11.field6382 != null) {
                                    method1828(var12, false, var23, var11.field6382, var11.field6314, var13 - var11.field6444, var14 - var11.field6344, var21, var22, var20);
                                }
                                class26 var39 = (class26) class454.field6477.method886((long) var11.field6314, 25651);
                                if (var39 != null) {
                                    class98.method710(var39.field463, var21, var23, var13, var20, var12, -1, var14, var22);
                                }
                                if (~var11.field6403 == -1408 && class64.field949.method141()) {
                                    class64.field949.method95();
                                    class360.field4980 = true;
                                }
                                class64.field949.method136(arg8, arg9, arg2, arg7);
                            }
                            if (class141.field2028[var12] || class18.field318 > 1) {
                                if (~var11.field6356 == -4) {
                                    if (~var15 != -1) {
                                        if (var11.field6440) {
                                            class64.field949.method56(var13, var14, var11.field6342, var11.field6447, 16777215 & var11.field6320 | 255 - (var15 & 255) << 24, 1);
                                        } else {
                                            class64.field949.method59(var13, var14, var11.field6342, var11.field6447, -(255 & var15) + 255 << 24 | 16777215 & var11.field6320, 1);
                                        }
                                    } else if (!var11.field6440) {
                                        class64.field949.method59(var13, var14, var11.field6342, var11.field6447, var11.field6320, 0);
                                    } else {
                                        class64.field949.method56(var13, var14, var11.field6342, var11.field6447, var11.field6320, 0);
                                    }
                                } else if (var11.field6356 == 4) {
                                    class357 var40 = var11.method2808(14310, class64.field949);
                                    if (var40 == null) {
                                        if (class197.field2705) {
                                            class404.method2531(26878, var11);
                                        }
                                    } else {
                                        int var41 = var11.field6320;
                                        String var42 = var11.field6397;
                                        if (~var11.field6452 != 0) {
                                            class360 var43 = class51.method433((byte) 87, var11.field6452);
                                            var42 = var43.field4938;
                                            if (var42 == null) {
                                                var42 = "null";
                                            }
                                            if ((~var43.field4958 == -2 || ~var11.field6396 != -2) && ~var11.field6396 != 0) {
                                                var42 = "<col=ff9040>" + var42 + "</col> x" + class132.method911(var11.field6396, (byte) -44);
                                            }
                                        }
                                        if (class109.field1567 == var11) {
                                            var42 = class129.field1823.method2763(-83, class210.field2935);
                                            var41 = var11.field6320;
                                        }
                                        if (class128.field1791) {
                                            class64.field949.method53(var13, var14, var11.field6342 + var13, var14 - -var11.field6447);
                                        }
                                        var40.method2287(var11.field6468 ? -16777216 : -1, 0, var11.field6342, -16777216 | var41, var11.field6326, var14, var42, arg1, var11.field6447, var11.field6317, var11.field6373, 0, (int[]) null, var13, (class241) null, class278.field3900);
                                        if (class128.field1791) {
                                            class64.field949.method136(arg8, arg9, arg2, arg7);
                                        }
                                    }
                                } else if (var11.field6356 == 5) {
                                    if (var11.field6398 < 0) {
                                        class226 var44;
                                        if (var11.field6452 == -1) {
                                            var44 = var11.method2813(class64.field949, 16777215);
                                        } else {
                                            class133 var45 = var11.field6379 ? class412.field5841.field1934 : null;
                                            var44 = class212.method1396(class64.field949, var11.field6325, var11.field6368, var45, (byte) 116, var11.field6396, -16777216 | var11.field6401, var11.field6452);
                                        }
                                        if (var44 == null) {
                                            if (class197.field2705) {
                                                class404.method2531(26878, var11);
                                            }
                                        } else {
                                            int var46 = var44.method597();
                                            int var47 = var44.method596();
                                            if (!var11.field6417) {
                                                if (~var15 != -1) {
                                                    int var48 = 16777215 | -(var15 & 255) + 255 << 24;
                                                    if (var11.field6459 != 0) {
                                                        var44.method1497((float) var11.field6342 / 2.0F + (float) var13, (float) var11.field6447 / 2.0F + (float) var14, var11.field6342 * 4096 / var46, var11.field6459, 1, var48, 1);
                                                    } else if (var11.field6342 == var46 && ~var11.field6447 == ~var47) {
                                                        var44.method587(var13, var14, 1, var48, 1);
                                                    } else {
                                                        var44.method588(var13, var14, var11.field6342, var11.field6447, 1, var48, 1);
                                                    }
                                                } else if (~var11.field6459 != -1) {
                                                    var44.method1499((float) var11.field6342 / 2.0F + (float) var13, (float) var11.field6447 / 2.0F + (float) var14, var11.field6342 * 4096 / var46, var11.field6459);
                                                } else if (var11.field6342 == var46 && ~var11.field6447 == ~var47) {
                                                    var44.method1501(var13, var14);
                                                } else {
                                                    var44.method1498(var13, var14, var11.field6342, var11.field6447);
                                                }
                                            } else {
                                                class64.field949.method53(var13, var14, var13 - -var11.field6342, var11.field6447 + var14);
                                                if (var11.field6459 != 0) {
                                                    int var49 = (var11.field6342 + var46 + -1) / var46;
                                                    int var50 = (var47 + -1 + var11.field6447) / var47;
                                                    for (int var51 = 0; var49 > var51; ++var51) {
                                                        for (int var52 = 0; ~var50 < ~var52; ++var52) {
                                                            var44.method1499((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field6459);
                                                        }
                                                    }
                                                } else if (~var15 != -1) {
                                                    var44.method593(var13, var14, var11.field6342, var11.field6447, 1, 16777215 | 255 - (255 & var15) << 24, 1);
                                                } else {
                                                    var44.method593(var13, var14, var11.field6342, var11.field6447, 0, 0, 1);
                                                }
                                                class64.field949.method136(arg8, arg9, arg2, arg7);
                                            }
                                        }
                                    } else {
                                        var11.method2817(17349).method2441(-36, var11.field6447, var11.field6342, 0, var11.field6337 << 3, 0, var13, var11.field6391 << 3, class64.field949, var14);
                                    }
                                } else if (var11.field6356 != 6) {
                                    if (var11.field6356 == 9) {
                                        int var72;
                                        int var73;
                                        int var74;
                                        int var75;
                                        if (var11.field6435) {
                                            var72 = var11.field6342 + var13;
                                            var73 = var11.field6447 + var14;
                                            var74 = var14;
                                            var75 = var13;
                                        } else {
                                            var73 = var14;
                                            var75 = var13;
                                            var72 = var11.field6342 + var13;
                                            var74 = var11.field6447 + var14;
                                        }
                                        if (~var11.field6335 == -2) {
                                            class64.field949.method119(var75, var73, var72, var74, var11.field6320, 0);
                                        } else {
                                            class64.field949.method134(var75, var73, var72, var74, var11.field6320, var11.field6335, 0);
                                        }
                                    }
                                } else {
                                    class134.method941((byte) 38);
                                    class394 var53 = null;
                                    int var54 = 0;
                                    if (~var11.field6452 == 0) {
                                        if (var11.field6445 == 5) {
                                            if (var11.field6323 == -1) {
                                                var53 = class211.field2945.method920(-1, 1024, (class411) null, -1, (class66[]) null, 30740, -1, class64.field949, -1, 0, 0, true, (class411) null);
                                            } else {
                                                int var55 = var11.field6323;
                                                class134 var56;
                                                if (class40.field588 != var55) {
                                                    var56 = class381.field5447[var55];
                                                } else {
                                                    var56 = class412.field5841;
                                                }
                                                class411 var57 = ~var11.field6371 == 0 ? null : class108.method761((byte) -82, var11.field6371);
                                                if (var56 != null && (var55 == 2047 || ~class413.method2590((byte) 101, var56.field1922) == ~var11.field6332)) {
                                                    var53 = var56.field1934.method920(var11.field6427, 1024, var57, -1, (class66[]) null, 30740, var11.field6399, class64.field949, 0, 0, var11.field6421, true, (class411) null);
                                                }
                                            }
                                        } else if (var11.field6445 != 8 && var11.field6445 != 9) {
                                            if (var11.field6371 != -1) {
                                                class411 var58 = class108.method761((byte) -82, var11.field6371);
                                                var53 = var11.method2816(class412.field5841.field1934, class64.field949, var11.field6421, var11.field6427, var11.field6399, -1498609168, 1024, var58);
                                                if (var53 == null && class197.field2705) {
                                                    class404.method2531(26878, var11);
                                                }
                                            } else {
                                                var53 = var11.method2816(class412.field5841.field1934, class64.field949, 0, -1, -1, -1498609168, 1024, (class411) null);
                                                if (var53 == null && class197.field2705) {
                                                    class404.method2531(26878, var11);
                                                }
                                            }
                                        } else {
                                            class304 var59 = class356.method2281(var11.field6323, false, 0);
                                            class411 var60 = var11.field6371 != -1 ? class108.method761((byte) -82, var11.field6371) : null;
                                            if (var59 != null) {
                                                class133 var61 = var11.field6379 ? class412.field5841.field1934 : null;
                                                var53 = var59.method1962(-126, var61, var60, var11.field6399, var11.field6421, 1024, var11.field6427, var11.field6445 == 9, class64.field949, var11.field6332);
                                            }
                                        }
                                    } else {
                                        class360 var62 = class51.method433((byte) 87, var11.field6452);
                                        if (var62 != null) {
                                            class360 var63 = var62.method2307(-11, var11.field6396);
                                            class411 var64 = var11.field6371 != -1 ? class108.method761((byte) -82, var11.field6371) : null;
                                            class133 var65 = var11.field6379 ? class412.field5841.field1934 : null;
                                            var53 = var63.method2303(class64.field949, var64, 1024, 1, var11.field6421, var11.field6427, var11.field6399, 128, var65);
                                            if (var53 == null) {
                                                class404.method2531(26878, var11);
                                            } else {
                                                var54 = -var53.method1443() / 2;
                                            }
                                        }
                                    }
                                    if (var53 != null) {
                                        int var66;
                                        if (~var11.field6405 >= -1) {
                                            var66 = 512;
                                        } else {
                                            var66 = (var11.field6342 << 9) / var11.field6405;
                                        }
                                        int var67;
                                        if (var11.field6338 > 0) {
                                            var67 = (var11.field6447 << 9) / var11.field6338;
                                        } else {
                                            var67 = 512;
                                        }
                                        int var68 = (var11.field6388 * var66 >> 9) + (var13 - -(var11.field6342 / 2));
                                        int var69 = var11.field6447 / 2 + (var14 - -(var11.field6448 * var67 >> 9));
                                        class335.field4613.method693();
                                        class64.field949.method126(class335.field4613);
                                        int var70 = class133.field1913[var11.field6465 << 3] * var11.field6375 >> 15;
                                        int var71 = class133.field1908[var11.field6465 << 3] * var11.field6375 >> 15;
                                        class64.field949.method63(var68, var69, var66, var67);
                                        class64.field949.method80((float) var11.field6428, var11.field6463 ? (float) var11.field6402 : (float) var11.field6402 * 1.5F);
                                        if (class360.field4980) {
                                            class64.field949.method143();
                                            class64.field949.method135();
                                            class64.field949.method136(arg8, arg9, arg2, arg7);
                                            class360.field4980 = false;
                                        }
                                        if (var11.field6432) {
                                            class64.field949.method96(false);
                                        }
                                        class423.field5985.method700(-var11.field6354 << 3);
                                        class423.field5985.method704(var11.field6456 << 3);
                                        class423.field5985.method696(var11.field6380, var70 - (-var54 - var11.field6469), var11.field6469 + var71);
                                        class423.field5985.method695(var11.field6465 << 3);
                                        if (class128.field1791) {
                                            class64.field949.method53(var13, var14, var13 - -var11.field6342, var11.field6447 + var14);
                                        }
                                        if (!var11.field6463) {
                                            var53.method1416(class423.field5985, (class84) null, 1);
                                        } else {
                                            var53.method1464(class423.field5985, (class84) null, var11.field6375, 1);
                                        }
                                        if (class128.field1791) {
                                            class64.field949.method136(arg8, arg9, arg2, arg7);
                                        }
                                        if (var11.field6432) {
                                            class64.field949.method96(true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILuo;I)Lmj;", line = 833)
    public final class394 method685(int arg0, class345 arg1, int arg2) {
        ++field3929;
        if (arg2 != -9380) {
            this.field3923 = null;
        }
        return this.method1825(arg1, (byte) 127, arg0);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Luo;BZI)Lvg;", line = 844)
    private final class33 method1829(class345 arg0, byte arg1, boolean arg2, int arg3) {
        ++field3943;
        class64 var5 = class375.method2395((byte) 36, 65535 & this.field3922);
        if (arg1 != 45) {
            return null;
        } else {
            class242 var6;
            class242 var7;
            if (this.field3926) {
                var6 = class214.field2979[this.field3947];
                var7 = class418.field5939[0];
            } else {
                if (this.field3947 >= 3) {
                    var7 = null;
                } else {
                    var7 = class418.field5939[this.field3947 - -1];
                }
                var6 = class418.field5939[this.field3947];
            }
            return var5.method497(arg0, this.field3945, super.field2985, this.field3946, var6, (byte) -11, super.field2975, var7, super.field2990, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZLuo;)Laj;", line = 874)
    public final class170 method681(boolean arg0, class345 arg1) {
        ++field3944;
        if (this.field3923 == null) {
            return null;
        } else {
            class417 var3 = arg1.method84();
            var3.method702(super.field2989 + super.field2985, super.field2975, super.field2990 + super.field2980);
            if (!arg0) {
                method1833(-111, 8, -41, (byte) -43, (class345) null, (class64) null);
            }
            class170 var4 = null;
            if (this.field3937) {
                var4 = class175.method1152((byte) 72, 1);
            }
            this.field3923.method1416(var3, var4 == null ? null : var4.field2333[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILuo;I)Z", line = 901)
    public final boolean method675(int arg0, int arg1, class345 arg2, int arg3) {
        ++field3941;
        class394 var5 = this.method1825(arg2, (byte) -49, 65536);
        if (arg1 != -20759) {
            this.method676(3, (class345) null);
        }
        if (var5 != null) {
            class417 var6 = arg2.method84();
            var6.method702(super.field2985, super.field2975, super.field2990);
            return var5.method1465(arg3, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)Z", line = 923)
    public static final boolean method1830(int arg0, int arg1, int arg2) {
        int var3 = class14.field279[arg0][arg1][arg2];
        if (-class328.field4548 == var3) {
            return false;
        } else if (class328.field4548 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class181.method1184(var4 + 1, class375.field5354[arg0].method737(arg1, arg2), var5 + 1) && class181.method1184(var4 + 128 - 1, class375.field5354[arg0].method737(arg1 + 1, arg2), var5 + 1) && class181.method1184(var4 + 128 - 1, class375.field5354[arg0].method737(arg1 + 1, arg2 + 1), var5 + 128 - 1) && class181.method1184(var4 + 1, class375.field5354[arg0].method737(arg1, arg2 + 1), var5 + 128 - 1)) {
                class14.field279[arg0][arg1][arg2] = class328.field4548;
                return true;
            } else {
                class14.field279[arg0][arg1][arg2] = -class328.field4548;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)V", line = 948)
    public static final void method1831(int arg0, int arg1) {
        class331.method2132((byte) 8);
        ++field3925;
        if (arg1 != 25212) {
            field3939 = null;
        }
        int var2 = class205.method1333(arg0, -1).field483;
        if (~var2 != -1) {
            int var3 = class297.field4156[arg0];
            if (~var2 == -6) {
                class382.field5456 = var3;
            }
            if (var2 == 6) {
                class253.field3563 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "(I)V", line = 973)
    public static final void method1832(int arg0) {
        class87 var1 = (class87) class121.field1699.method646(48);
        if (arg0 >= -10) {
            method1831(34, -10);
        }
        while (var1 != null) {
            if (class428.method2708((byte) -87, var1.field1217)) {
                class39.method364(1461, var1);
            }
            var1 = (class87) class121.field1699.method641(false);
        }
        ++field3948;
        if (class90.field1260 != 1) {
            class285.method1861(class432.field6101, 28659, class211.field2952, class18.field330, class151.field2135);
            int var2 = class95.field1313.method2156(class80.field1143.method2763(-123, class210.field2935), 60);
            for (class87 var3 = (class87) class121.field1699.method646(48); var3 != null; var3 = (class87) class121.field1699.method641(false)) {
                int var4 = class249.method1672(-1889368032, var3);
                if (~var2 > ~var4) {
                    var2 = var4;
                }
            }
            class432.field6101 = class90.field1260 * 16 + (!class173.field2367 ? 22 : 26);
            class151.field2135 = var2 + 8;
        } else {
            class271.field3762 = false;
            class285.method1861(class432.field6101, 28659, class211.field2952, class18.field330, class151.field2135);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIBLuo;Lgm;)V", line = 1027)
    public static final void method1833(int arg0, int arg1, int arg2, byte arg3, class345 arg4, class64 arg5) {
        ++field3930;
        class322 var6 = class171.method1123(arg5.field871, 125);
        if (var6.field4421 != -1) {
            int var7;
            if (!arg5.field877) {
                var7 = 0;
            } else {
                int var8 = arg5.field923 + arg0;
                var7 = var8 & 3;
            }
            class226 var9 = var6.method2077(arg4, -21177, var7, arg5.field936);
            if (var9 != null) {
                int var10 = 4 % ((arg3 - -23) / 40);
                int var11 = arg5.field872;
                int var12 = arg5.field950;
                if ((1 & var7) == 1) {
                    var11 = arg5.field950;
                    var12 = arg5.field872;
                }
                int var13 = var9.method597();
                int var14 = var9.method596();
                if (var6.field4422) {
                    var14 = var12 * 4;
                    var13 = var11 * 4;
                }
                if (~var6.field4418 != -1) {
                    var9.method588(arg1, -(var12 * 4) + 4 + arg2, var13, var14, 1, var6.field4418 | -16777216, 1);
                } else {
                    var9.method1498(arg1, arg2 - (var12 + -1) * 4, var13, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)Z", line = 1083)
    public final boolean method691(byte arg0) {
        ++field3936;
        if (arg0 != -72) {
            this.field3922 = -44;
        }
        return this.field3938;
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Luo;Lgm;IIIIZIIIII)V", line = 1098)
    public class280(class345 arg0, class64 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class142.method977(arg10, -84, arg11));
        this.field3947 = (byte) arg2;
        super.field2990 = (short) arg5;
        this.field3937 = ~arg1.field922 != -1 && !arg6;
        this.field3945 = (byte) arg11;
        this.field3926 = arg6;
        this.field3946 = (byte) arg10;
        super.field2985 = (short) arg3;
        this.field3922 = (short) arg1.field916;
        this.field3938 = arg0.method125() && arg1.field939 && !this.field3926 && ~class327.field4508 != -1;
        class33 var13 = this.method1829(arg0, (byte) 45, this.field3938, 1024);
        if (var13 != null) {
            this.field3923 = var13.field516;
            this.field3931 = var13.field520;
        }
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)V", line = 1126)
    public final void method680(int arg0) {
        if (this.field3923 != null) {
            this.field3923.method1467();
        }
        ++field3935;
        if (arg0 != -24686) {
            this.field3922 = 95;
        }
    }
}
