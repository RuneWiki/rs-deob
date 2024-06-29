import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class302 extends class208 {

    @OriginalMember(owner = "client!wm", name = "Gb", descriptor = "[[I")
    public static int[][] field4738 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!wm", name = "Cb", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!wm", name = "Db", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!wm", name = "Eb", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!wm", name = "Hb", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!wm", name = "Fb", descriptor = "Luk;")
    public static class203 field4737;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(FI)V")
    public final void method2030(float arg0, int arg1) {
        ++field4734;
        int var3 = NativeStream.floatToRawIntBits(arg0);
        super.field3193[super.field3162++] = (byte) (var3 >> 24);
        super.field3193[super.field3162++] = (byte) (var3 >> 16);
        super.field3193[super.field3162++] = (byte) (var3 >> 8);
        super.field3193[super.field3162++] = (byte) var3;
        if (arg1 != 9) {
            this.method2030(-1.8799772F, 122);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III[Lgi;IIIIII)V")
    public static final void method2031(int arg0, int arg1, int arg2, class437[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4735;
        class19.field198.method1307(arg5, arg0, arg9, arg2);
        for (int var10 = arg1; ~arg3.length < ~var10; ++var10) {
            class437 var11 = arg3[var10];
            if (var11 != null && (var11.field6599 == arg7 || arg7 == -1412584499 && class477.field7309 == var11)) {
                int var12;
                if (arg4 == -1) {
                    class18.field194[class126.field1703].setBounds(var11.field6666 - -arg8, var11.field6644 + arg6, var11.field6615, var11.field6730);
                    var12 = class126.field1703++;
                } else {
                    var12 = arg4;
                }
                var11.field6698 = class88.field1278;
                var11.field6646 = var12;
                if (!client.method512(var11)) {
                    if (var11.field6688 != 0) {
                        class436.method2748(var11, 81);
                    }
                    int var13 = var11.field6666 - -arg8;
                    int var14 = var11.field6644 - -arg6;
                    int var15 = var11.field6713;
                    if (class223.field3757 && (~client.method492(var11).field7149 != -1 || ~var11.field6729 == -1) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class477.field7309 == var11) {
                        if (~arg7 != 1412584498 && (~class249.field4053 == ~var11.field6661 || class537.field7865 == var11.field6661)) {
                            class94.field1371 = arg6;
                            class476.field7287 = arg3;
                            class371.field5704 = arg8;
                            continue;
                        }
                        if (class361.field5593 && class6.field76) {
                            int var16 = class472.field7240.method2038(-49);
                            int var17 = class472.field7240.method2043((byte) -119);
                            int var18 = var16 - class7.field87;
                            int var19 = var17 - class38.field383;
                            if (var18 < class56.field904) {
                                var18 = class56.field904;
                            }
                            if (~(class56.field904 - -class326.field5117.field6615) > ~(var18 - -var11.field6615)) {
                                var18 = class56.field904 + class326.field5117.field6615 + -var11.field6615;
                            }
                            if (~var19 > ~class390.field5931) {
                                var19 = class390.field5931;
                            }
                            var13 = var18;
                            if (class390.field5931 + class326.field5117.field6730 < var19 - -var11.field6730) {
                                var19 = class390.field5931 + class326.field5117.field6730 + -var11.field6730;
                            }
                            var14 = var19;
                        }
                        if (class537.field7865 == var11.field6661) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field6729 != 2) {
                        int var20 = var11.field6615 + var13;
                        int var21 = var11.field6730 + var14;
                        if (~var11.field6729 == -10) {
                            ++var21;
                            ++var20;
                        }
                        var22 = ~arg5 <= ~var13 ? arg5 : var13;
                        var23 = ~var14 >= ~arg0 ? arg0 : var14;
                        var24 = arg2 > var21 ? var21 : arg2;
                        var25 = ~var20 > ~arg9 ? var20 : arg9;
                    } else {
                        var25 = arg9;
                        var24 = arg2;
                        var22 = arg5;
                        var23 = arg0;
                    }
                    if (var22 < var25 && ~var24 < ~var23) {
                        if (~var11.field6688 != -1) {
                            if (~class411.field6238 == ~var11.field6688 || ~class464.field7124 == ~var11.field6688) {
                                class231.method1649(~class464.field7124 == ~var11.field6688, var13, var14, var11.field6615, (byte) -120, var11.field6730);
                                class520.field7707[var12] = true;
                                class19.field198.method1307(arg5, arg0, arg9, arg2);
                                continue;
                            }
                            if (class301.field4733 == var11.field6688) {
                                if (var11.method2761(class19.field198, (byte) 116) != null) {
                                    class500.method3052(0);
                                    class223.method1621(32, var13, class19.field198, var11, var14);
                                    class98.field1414[var12] = true;
                                    class19.field198.method1307(arg5, arg0, arg9, arg2);
                                }
                                continue;
                            }
                            if (~class317.field4954 == ~var11.field6688) {
                                if (var11.method2761(class19.field198, (byte) 34) != null) {
                                    class322.method2149(var13, var14, var11, -101);
                                    class98.field1414[var12] = true;
                                    class19.field198.method1307(arg5, arg0, arg9, arg2);
                                }
                                continue;
                            }
                            if (~class376.field5788 == ~var11.field6688) {
                                class10.method66(var11.field6615, var11.field6730, class161.field2206, var13, class19.field198, (byte) 98, var14);
                                class520.field7707[var12] = true;
                                class19.field198.method1307(arg5, arg0, arg9, arg2);
                                continue;
                            }
                            if (~class409.field6199 == ~var11.field6688) {
                                class51.method362(var14, class19.field198, (byte) 78, var13, var11.field6615, var11.field6730);
                                class520.field7707[var12] = true;
                                class19.field198.method1307(arg5, arg0, arg9, arg2);
                                continue;
                            }
                            if (class504.field7550 == var11.field6688) {
                                if (!class150.field2014 && !class222.field3744) {
                                    continue;
                                }
                                int var26 = var11.field6615 + var13;
                                int var27 = var14 + 15;
                                if (class150.field2014) {
                                    int var28 = -256;
                                    if (class305.field4800 < 20) {
                                        var28 = -65536;
                                    }
                                    class128.field1741.method2005(var28, (byte) 25, var26, -1, var27, "Fps:" + class305.field4800);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() + -var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 65536) {
                                        var31 = -65536;
                                    }
                                    class128.field1741.method2005(var31, (byte) 25, var26, -1, var27, "Mem:" + var30 + "k");
                                    var27 += 15;
                                    class128.field1741.method2005(-256, (byte) 25, var26, -1, var27, "In:" + class452.field7012 + "B/s Out:" + class55.field809 + "B/s");
                                    var27 += 15;
                                    int var32 = class19.field198.method1258() / 1024;
                                    class128.field1741.method2005(var32 > 65536 ? -65536 : -256, (byte) 25, var26, -1, var27, "Offheap:" + var32 + "k");
                                    var27 += 15;
                                    int var33 = 0;
                                    int var34 = 0;
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < 30; ++var36) {
                                        var33 += class102.field1484[var36].method2157(arg1 + -103);
                                        var34 += class102.field1484[var36].method2156(757);
                                        var35 += class102.field1484[var36].method2151(0);
                                    }
                                    int var37 = var35 * 100 / var33;
                                    int var38 = var34 * 10000 / var33;
                                    String var39 = "Cache:" + class301.method2026((long) var38, 0, true, 2, 4160) + "% (" + var37 + "%)";
                                    class315.field4923.method2005(-256, (byte) 25, var26, -1, var27, var39);
                                    var27 += 12;
                                }
                                if (class537.field7866 > 0) {
                                    class315.field4923.method2005(-256, (byte) 25, var26, -1, var27, "Particles: " + class463.field7122 + " / " + class537.field7866);
                                }
                                var27 += 12;
                                if (class222.field3744) {
                                    class315.field4923.method2005(-256, (byte) 25, var26, -1, var27, "Polys: " + class19.field198.method1327() + " Models: " + class19.field198.method1276());
                                    var27 += 12;
                                    class315.field4923.method2005(-256, (byte) 25, var26, -1, var27, "Ls: " + class456.field7043 + " La: " + class418.field6343 + " NPC: " + class358.field5563 + " Pl: " + class321.field4988);
                                    class414.method2637((byte) -7);
                                    var27 += 12;
                                }
                                class520.field7707[var12] = true;
                                continue;
                            }
                        }
                        if (~var11.field6729 == -1) {
                            if (class232.field3838 == var11.field6688 && class19.field198.method1239()) {
                                class19.field198.method1281(var13, var14, var11.field6615, var11.field6730);
                            }
                            method2031(var23, arg1, var24, arg3, var12, var22, -var11.field6613 + var14, var11.field6751, -var11.field6649 + var13, var25);
                            if (var11.field6675 != null) {
                                method2031(var23, arg1, var24, var11.field6675, var12, var22, -var11.field6613 + var14, var11.field6751, -var11.field6649 + var13, var25);
                            }
                            class301 var40 = (class301) class423.field6414.method1122((byte) 59, (long) var11.field6751);
                            if (var40 != null) {
                                class532.method3161(var40.field4721, var13, var25, var12, var14, var24, var22, ~arg1, var23);
                            }
                            if (~class232.field3838 == ~var11.field6688 && class19.field198.method1239()) {
                                class19.field198.method1264();
                                class294.field4634 = true;
                            }
                            class19.field198.method1307(arg5, arg0, arg9, arg2);
                        }
                        if (class442.field6875[var12] || class64.field1005 > 1) {
                            if (var11.field6729 == 3) {
                                if (~var15 != -1) {
                                    if (var11.field6643) {
                                        class19.field198.method1260(var13, var14, var11.field6615, var11.field6730, -(255 & var15) + 255 << 24 | var11.field6622 & 16777215, 1);
                                    } else {
                                        class19.field198.method1284(var13, var14, var11.field6615, var11.field6730, var11.field6622 & 16777215 | -(255 & var15) + 255 << 24, 1);
                                    }
                                } else if (!var11.field6643) {
                                    class19.field198.method1284(var13, var14, var11.field6615, var11.field6730, var11.field6622, 0);
                                } else {
                                    class19.field198.method1260(var13, var14, var11.field6615, var11.field6730, var11.field6622, 0);
                                }
                            } else if (var11.field6729 == 4) {
                                class299 var41 = var11.method2765(-4754, class19.field198);
                                if (var41 == null) {
                                    if (class328.field5147) {
                                        class479.method2962(-128, var11);
                                    }
                                } else {
                                    int var42 = var11.field6622;
                                    String var43 = var11.field6742;
                                    if (var11.field6716 != -1) {
                                        class196 var44 = class337.field5262.method2077((byte) -65, var11.field6716);
                                        var43 = var44.field3034;
                                        if (var43 == null) {
                                            var43 = "null";
                                        }
                                        if ((~var44.field2973 == -2 || var11.field6678 != 1) && ~var11.field6678 != 0) {
                                            var43 = "<col=ff9040>" + var43 + "</col> x" + class290.method1954((byte) 108, var11.field6678);
                                        }
                                    }
                                    if (class322.field5031 == var11) {
                                        var43 = class65.field1012.method1583(108, class12.field131);
                                        var42 = var11.field6622;
                                    }
                                    if (class421.field6387) {
                                        class19.field198.method1290(var13, var14, var13 - -var11.field6615, var11.field6730 + var14);
                                    }
                                    var41.method2019((class453) null, 0, var43, var11.field6733, var11.field6744 ? -(var15 & 255) + 255 << 24 : -1, class447.field6944, (int[]) null, var13, 255 - (var15 & 255) << 24 | var42, var11.field6615, 0, 499, var11.field6662, var11.field6694, var11.field6600, var11.field6730, var14);
                                    if (class421.field6387) {
                                        class19.field198.method1307(arg5, arg0, arg9, arg2);
                                    }
                                }
                            } else if (var11.field6729 == 5) {
                                if (~var11.field6657 <= -1) {
                                    var11.method2756(class187.field2727, (byte) -121, class93.field1361).method1385(var11.field6635 << 3, var11.field6606 << 3, var11.field6730, var11.field6615, arg1 + -1, 0, 0, var14, class19.field198, var13);
                                } else {
                                    class139 var46;
                                    if (~var11.field6716 != 0) {
                                        class78 var45 = !var11.field6676 ? null : class358.field5565.field5430;
                                        var46 = class337.field5262.method2074((byte) 111, var11.field6749 | -16777216, class19.field198, var11.field6611, var11.field6716, var11.field6609, var45, var11.field6678);
                                    } else {
                                        var46 = var11.method2757(arg1 ^ -97, class19.field198);
                                    }
                                    if (var46 != null) {
                                        int var47 = var46.method623();
                                        int var48 = var46.method618();
                                        int var49 = (~var11.field6622 == -1 ? 16777215 : var11.field6622 & 16777215) | -(var15 & 255) + 255 << 24;
                                        if (!var11.field6665) {
                                            if (var11.field6622 == 0 && var15 == 0) {
                                                if (var11.field6737 != 0) {
                                                    var46.method846((float) var11.field6615 / 2.0F + (float) var13, (float) var11.field6730 / 2.0F + (float) var14, var11.field6615 * 4096 / var47, var11.field6737);
                                                } else if (var11.field6615 == var47 && ~var11.field6730 == ~var48) {
                                                    var46.method852(var13, var14);
                                                } else {
                                                    var46.method851(var13, var14, var11.field6615, var11.field6730);
                                                }
                                            } else if (~var11.field6737 != -1) {
                                                var46.method845((float) var11.field6615 / 2.0F + (float) var13, (float) var11.field6730 / 2.0F + (float) var14, var11.field6615 * 4096 / var47, var11.field6737, 0, var49, 1);
                                            } else if (var11.field6615 == var47 && ~var11.field6730 == ~var48) {
                                                var46.method620(var13, var14, 0, var49, 1);
                                            } else {
                                                var46.method630(var13, var14, var11.field6615, var11.field6730, 0, var49, 1);
                                            }
                                        } else {
                                            class19.field198.method1290(var13, var14, var11.field6615 + var13, var11.field6730 + var14);
                                            if (~var11.field6737 != -1) {
                                                int var50 = (var47 + -1 + var11.field6615) / var47;
                                                int var51 = (var11.field6730 + var48 + -1) / var48;
                                                for (int var52 = 0; var50 > var52; ++var52) {
                                                    for (int var53 = 0; ~var53 > ~var51; ++var53) {
                                                        if (var11.field6622 != 0) {
                                                            var46.method845((float) var47 / 2.0F + (float) (var47 * var52 + var13), (float) var48 / 2.0F + (float) (var48 * var53 + var14), 4096, var11.field6737, 0, var49, 1);
                                                        } else {
                                                            var46.method846((float) var47 / 2.0F + (float) (var47 * var52 + var13), (float) var48 / 2.0F + (float) (var48 * var53 + var14), 4096, var11.field6737);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field6622 == 0 && var15 == 0) {
                                                var46.method847(var13, var14, var11.field6615, var11.field6730);
                                            } else {
                                                var46.method619(var13, var14, var11.field6615, var11.field6730, 0, var49, 1);
                                            }
                                            class19.field198.method1307(arg5, arg0, arg9, arg2);
                                        }
                                    } else if (class328.field5147) {
                                        class479.method2962(arg1 + -96, var11);
                                    }
                                }
                            } else if (~var11.field6729 != -7) {
                                if (~var11.field6729 == -10) {
                                    int var73;
                                    int var74;
                                    int var75;
                                    int var76;
                                    if (!var11.field6603) {
                                        var73 = var14;
                                        var74 = var13;
                                        var75 = var11.field6615 + var13;
                                        var76 = var11.field6730 + var14;
                                    } else {
                                        var73 = var11.field6730 + var14;
                                        var75 = var11.field6615 + var13;
                                        var76 = var14;
                                        var74 = var13;
                                    }
                                    if (var11.field6748 != 1) {
                                        class19.field198.method1280(var74, var73, var75, var76, var11.field6622, var11.field6748, 0);
                                    } else {
                                        class19.field198.method1262(var74, var73, var75, var76, var11.field6622, 0);
                                    }
                                }
                            } else {
                                class436.method2747(-125);
                                class536 var54 = null;
                                int var55 = 0;
                                if (~var11.field6716 == 0) {
                                    if (~var11.field6608 != -6) {
                                        if (~var11.field6608 != -9 && ~var11.field6608 != -10) {
                                            if (var11.field6605 != -1) {
                                                class363 var56 = class388.field5915.method1703(var11.field6605, -12536);
                                                var54 = var11.method2751(class19.field199, class19.field198, var56, var11.field6659, class6.field72, class358.field5565.field5430, class388.field5915, var11.field6610, class17.field178, 2048, class96.field1394, class337.field5262, (byte) 125, var11.field6621);
                                                if (var54 == null && class328.field5147) {
                                                    class479.method2962(-97, var11);
                                                }
                                            } else {
                                                var54 = var11.method2751(class19.field199, class19.field198, (class363) null, -1, class6.field72, class358.field5565.field5430, class388.field5915, 0, class17.field178, 2048, class96.field1394, class337.field5262, (byte) 100, -1);
                                                if (var54 == null && class328.field5147) {
                                                    class479.method2962(arg1 ^ -120, var11);
                                                }
                                            }
                                        } else {
                                            class339 var57 = class154.method940(var11.field6755, false, (byte) 119);
                                            class363 var58 = ~var11.field6605 != 0 ? class388.field5915.method1703(var11.field6605, -12536) : null;
                                            if (var57 != null) {
                                                class78 var59 = var11.field6676 ? class358.field5565.field5430 : null;
                                                var54 = var57.method2246(class19.field198, var58, var11.field6608 == 9, var11.field6610, arg1 ^ -28, var11.field6731, var59, var11.field6659, var11.field6621, 2048);
                                            }
                                        }
                                    } else {
                                        int var60 = var11.field6755;
                                        if (var60 >= 0 && ~var60 > -2049) {
                                            class350 var61 = class264.field4276[var60];
                                            class363 var62 = var11.field6605 != -1 ? class388.field5915.method1703(var11.field6605, -12536) : null;
                                            if (var61 != null && (~class528.field7772 == ~var60 || ~class479.method2964((byte) 126, var61.field5443) == ~var11.field6731)) {
                                                var54 = var61.field5430.method566((class363) null, class337.field5262, class6.field72, var62, (byte) 126, 0, true, class19.field199, class19.field198, var11.field6621, 2048, var11.field6659, -1, class17.field178, var11.field6610, 0, (class75[]) null, class388.field5915, class96.field1394);
                                            }
                                        }
                                    }
                                } else {
                                    class196 var63 = class337.field5262.method2077((byte) -65, var11.field6716);
                                    if (var63 != null) {
                                        class196 var64 = var63.method1352(-5311, var11.field6678);
                                        class363 var65 = ~var11.field6605 == 0 ? null : class388.field5915.method1703(var11.field6605, -12536);
                                        class78 var66 = var11.field6676 ? class358.field5565.field5430 : null;
                                        var54 = var64.method1339(var11.field6659, (byte) -107, 1, var65, var11.field6610, var11.field6621, var66, class19.field198, 2048);
                                        if (var54 == null) {
                                            class479.method2962(arg1 + -108, var11);
                                        } else {
                                            var55 = -var54.method305() >> 1;
                                        }
                                    }
                                }
                                if (var54 != null) {
                                    int var67;
                                    if (~var11.field6702 < -1) {
                                        var67 = (var11.field6615 << 9) / var11.field6702;
                                    } else {
                                        var67 = 512;
                                    }
                                    int var68;
                                    if (~var11.field6624 < -1) {
                                        var68 = (var11.field6730 << 9) / var11.field6624;
                                    } else {
                                        var68 = 512;
                                    }
                                    int var69 = (var11.field6728 * var67 >> 9) + var13 - -(var11.field6615 / 2);
                                    int var70 = var11.field6730 / 2 - -(var11.field6689 * var68 >> 9) + var14;
                                    class520.field7712.method161();
                                    class19.field198.method1314(class520.field7712);
                                    class19.field198.method1277(var69, var70, var67, var68);
                                    class19.field198.method1309((float) (var11.field6710 << 0), var11.field6690 ? (float) (var11.field6734 << 0) : (float) (var11.field6734 << 0) * 1.5F);
                                    if (~arg7 == 1412584498 || class294.field4634) {
                                        class19.field198.method1228();
                                        class19.field198.method1316();
                                        class19.field198.method1307(arg5, arg0, arg9, arg2);
                                        class294.field4634 = false;
                                    }
                                    if (var11.field6651) {
                                        class19.field198.method1240(false);
                                    }
                                    int var71 = (var11.field6709 << 0) * class147.field1988[var11.field6670 << 3] >> 15;
                                    int var72 = (var11.field6709 << 0) * class147.field1986[var11.field6670 << 3] >> 15;
                                    class510.field7602.method162(-var11.field6677 << 3);
                                    class510.field7602.method160(var11.field6695 << 3);
                                    class510.field7602.method163(var11.field6740 << 0, (var11.field6726 << 0) + var71 + var55, (var11.field6726 << 0) + var72);
                                    class510.field7602.method166(var11.field6670 << 3);
                                    if (class421.field6387) {
                                        class19.field198.method1290(var13, var14, var13 - -var11.field6615, var14 - -var11.field6730);
                                    }
                                    if (var11.field6690) {
                                        var54.method313(class510.field7602, (class182) null, var11.field6709 << 0, 1);
                                    } else {
                                        var54.method295(class510.field7602, (class182) null, 1);
                                    }
                                    if (class421.field6387) {
                                        class19.field198.method1307(arg5, arg0, arg9, arg2);
                                    }
                                    if (var11.field6651) {
                                        class19.field198.method1240(true);
                                    }
                                    class19.field198.method1309(0.0F, 0.0F);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "(I)V")
    public static void method2032(int arg0) {
        field4737 = null;
        field4738 = null;
        if (arg0 != 15) {
            method2031(16, -17, 116, (class437[]) null, 111, 70, -37, -95, -19, -9);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III[BIII)Z")
    public static final boolean method2033(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        ++field4736;
        if (arg5 != 1671601056) {
            field4737 = null;
        }
        int var7 = arg6 % arg1;
        int var8;
        if (~var7 != -1) {
            var8 = -var7 + arg1;
        } else {
            var8 = 0;
        }
        int var9 = -((arg2 + -1 + arg1) / arg1);
        int var10 = -((arg6 + -1 - -arg1) / arg1);
        for (int var11 = var9; var11 < 0; ++var11) {
            for (int var12 = var10; ~var12 > -1; ++var12) {
                if (~arg3[arg0] == -1) {
                    return true;
                }
                arg0 += arg1;
            }
            int var13 = arg0 - var8;
            if (~arg3[var13 - 1] == -1) {
                return true;
            }
            arg0 = arg4 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I)V")
    public class302(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(FZ)V")
    public final void method2034(float arg0, boolean arg1) {
        ++field4739;
        if (!arg1) {
            int var3 = NativeStream.floatToRawIntBits(arg0);
            super.field3193[super.field3162++] = (byte) var3;
            super.field3193[super.field3162++] = (byte) (var3 >> 8);
            super.field3193[super.field3162++] = (byte) (var3 >> 16);
            super.field3193[super.field3162++] = (byte) (var3 >> 24);
        }
    }
}
