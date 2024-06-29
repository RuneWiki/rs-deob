import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class345 extends class421 implements class210 {

    @OriginalMember(owner = "client!m", name = "I", descriptor = "Lgk;")
    public class374 field4773;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "Z")
    private boolean field4758;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "Lrc;")
    public static class108 field4761 = new class108(20, -2);

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public static int field4774 = 0;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public static int field4775;

    static {
        new class151("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lvc;Lnm;IIIIIZIII)V", line = 3)
    public class345(class89 arg0, class267 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class6.method35(arg8, arg9, 104));
        this.field4773 = new class374(arg0, arg1, arg8, arg9, arg2, arg3, super.field5833, super.field5831, arg7, arg10);
        this.field4758 = arg1.field3902 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILvc;II)Z", line = 15)
    public final boolean method77(int arg0, class89 arg1, int arg2, int arg3) {
        ++field4754;
        class468 var5 = this.field4773.method2288(-1, arg1, false, 65536, super.field5831, super.field5833, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg0 != 0) {
                field4761 = null;
            }
            class257 var6 = arg1.method306();
            var6.method96(super.field5833, super.field5830, super.field5831);
            return var5.method1593(arg2, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lvc;I)Lep;", line = 35)
    public final class309 method69(class89 arg0, int arg1) {
        ++field4763;
        if (arg1 != 10228) {
            return null;
        } else {
            class468 var3 = this.field4773.method2288(-1, arg0, true, 1024, super.field5831, super.field5833, false);
            if (var3 == null) {
                return null;
            } else {
                class257 var4 = arg0.method306();
                var4.method96(super.field5833, super.field5830, super.field5831);
                class309 var5 = null;
                if (this.field4758) {
                    var5 = class163.method1205((byte) 40, 1);
                }
                if (this.field4773.field5163 != null) {
                    class404 var6 = this.field4773.field5163.method896();
                    arg0.method384(var3, var6, var4, var5 != null ? var5.field4383[0] : null, 0);
                } else {
                    var3.method1592(var4, var5 != null ? var5.field4383[0] : null, 0);
                }
                this.field4773.method2283(arg0, super.field5831 >> 7, super.field5833 >> 7, super.field5833 >> 7, super.field5831 >> 7, true, var3, (byte) -125);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)Z", line = 73)
    public final boolean method68(int arg0) {
        ++field4756;
        int var2 = -98 / ((2 - arg0) / 57);
        return false;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(ZLvc;)V", line = 83)
    public final void method86(boolean arg0, class89 arg1) {
        ++field4760;
        class468 var3 = this.field4773.method2288(-1, arg1, true, 131072, super.field5831, super.field5833, true);
        if (!arg0) {
            if (var3 != null) {
                this.field4773.method2283(arg1, super.field5831 >> 7, super.field5833 >> 7, super.field5833 >> 7, super.field5831 >> 7, false, var3, (byte) -121);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(B)Z", line = 99)
    public final boolean method82(byte arg0) {
        ++field4766;
        return arg0 < 89 ? false : this.field4773.method2279((byte) -97);
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V", line = 113)
    public static void method2145(int arg0) {
        field4761 = null;
        if (arg0 != -441) {
            method2147((String) null, (byte) -70);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)I", line = 123)
    public final int method80(int arg0) {
        ++field4764;
        if (arg0 != 10143) {
            this.method77(-61, (class89) null, 95, 8);
        }
        return this.field4773.field5156;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZIIIIIII[Lae;)V", line = 137)
    public static final void method2146(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class172[] arg9) {
        ++field4762;
        class374.field5152.method453(arg7, arg5, arg0, arg3);
        if (arg1) {
            method2145(122);
        }
        for (int var10 = 0; ~arg9.length < ~var10; ++var10) {
            class172 var11 = arg9[var10];
            if (var11 != null && (~var11.field2532 == ~arg2 || arg2 == -1412584499 && class464.field6538 == var11)) {
                int var12;
                if (arg6 != -1) {
                    var12 = arg6;
                } else {
                    class341.field4711[class173.field2636].setBounds(var11.field2502 - -arg8, var11.field2466 - -arg4, var11.field2554, var11.field2579);
                    var12 = class173.field2636++;
                }
                var11.field2591 = class364.field5010;
                var11.field2535 = var12;
                if (!client.method551(var11)) {
                    if (var11.field2624 != 0) {
                        class399.method2400(var11, false);
                    }
                    int var13 = var11.field2502 - -arg8;
                    int var14 = var11.field2466 + arg4;
                    int var15 = var11.field2531;
                    if (class79.field1162 && (client.method547(var11).field1544 != 0 || ~var11.field2602 == -1) && ~var15 < -128) {
                        var15 = 127;
                    }
                    if (class464.field6538 == var11) {
                        if (arg2 != -1412584499 && (~class450.field6411 == ~var11.field2586 || ~class301.field4264 == ~var11.field2586)) {
                            class142.field1985 = arg9;
                            class137.field1914 = arg4;
                            class199.field2933 = arg8;
                            continue;
                        }
                        if (class122.field1672 && class442.field6293) {
                            int var16 = class175.field2661.method1625((byte) -128);
                            int var17 = class175.field2661.method1617(false);
                            int var18 = var16 - class423.field5856;
                            int var19 = var17 - class135.field1876;
                            if (~var18 > ~class340.field4703) {
                                var18 = class340.field4703;
                            }
                            if (var19 < class315.field4454) {
                                var19 = class315.field4454;
                            }
                            if (~(class340.field4703 + class86.field1215.field2554) > ~(var11.field2554 + var18)) {
                                var18 = class340.field4703 + class86.field1215.field2554 - var11.field2554;
                            }
                            var13 = var18;
                            if (class315.field4454 + class86.field1215.field2579 < var11.field2579 + var19) {
                                var19 = class315.field4454 + class86.field1215.field2579 + -var11.field2579;
                            }
                            var14 = var19;
                        }
                        if (class301.field4264 == var11.field2586) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (~var11.field2602 != -3) {
                        int var20 = var11.field2554 + var13;
                        int var21 = var11.field2579 + var14;
                        var22 = arg7 >= var13 ? arg7 : var13;
                        if (var11.field2602 == 9) {
                            ++var21;
                            ++var20;
                        }
                        var23 = var14 <= arg5 ? arg5 : var14;
                        var24 = arg3 > var21 ? var21 : arg3;
                        var25 = ~var20 > ~arg0 ? var20 : arg0;
                    } else {
                        var22 = arg7;
                        var25 = arg0;
                        var23 = arg5;
                        var24 = arg3;
                    }
                    if (var22 < var25 && var23 < var24) {
                        if (var11.field2624 != 0) {
                            if (class136.field1892 == var11.field2624 || class430.field5981 == var11.field2624) {
                                class279.method1867(var11.field2554, var11.field2579, class430.field5981 == var11.field2624, var13, var14, (byte) 100);
                                class424.field5879[var12] = true;
                                class374.field5152.method453(arg7, arg5, arg0, arg3);
                                continue;
                            }
                            if (class466.field6576 == var11.field2624) {
                                if (var11.method1253(-14775, class374.field5152) != null) {
                                    class208.method1423((byte) -75);
                                    class158.method1129(var11, -76, var13, var14, class374.field5152);
                                    class184.field2783[var12] = true;
                                    class374.field5152.method453(arg7, arg5, arg0, arg3);
                                }
                                continue;
                            }
                            if (~class173.field2638 == ~var11.field2624) {
                                if (var11.method1253(-14775, class374.field5152) != null) {
                                    class393.method2374(var13, var14, var11, 16383);
                                    class184.field2783[var12] = true;
                                    class374.field5152.method453(arg7, arg5, arg0, arg3);
                                }
                                continue;
                            }
                            if (class129.field1761 == var11.field2624) {
                                class218.method1502(var14, var11.field2579, -1, var13, var11.field2554, class74.field1071, class374.field5152);
                                class424.field5879[var12] = true;
                                class374.field5152.method453(arg7, arg5, arg0, arg3);
                                continue;
                            }
                            if (class344.field4750 == var11.field2624) {
                                class35.method212((byte) -59, class374.field5152, var11.field2554, var14, var13, var11.field2579);
                                class424.field5879[var12] = true;
                                class374.field5152.method453(arg7, arg5, arg0, arg3);
                                continue;
                            }
                            if (class111.field1568 == var11.field2624) {
                                if (!class76.field1129 && !class183.field2760) {
                                    continue;
                                }
                                int var26 = var11.field2554 + var13;
                                int var27 = var14 - -15;
                                if (class76.field1129) {
                                    class189.field2830.method1380(var26, var27, "Fps:" + class59.field851, -1, -256, 83);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (~var29 < -65537) {
                                        var30 = -65536;
                                    }
                                    class189.field2830.method1380(var26, var27, "Mem:" + var29 + "k", -1, var30, 92);
                                    var27 += 15;
                                    class189.field2830.method1380(var26, var27, "In:" + class308.field4374 + "B/s Out:" + class119.field1655 + "B/s", -1, -256, -41);
                                    var27 += 15;
                                    int var31 = class374.field5152.method322() / 1024;
                                    class189.field2830.method1380(var26, var27, "Offheap:" + var31 + "k", -1, var31 > 65536 ? -65536 : -256, -67);
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; ~var35 > -30; ++var35) {
                                        var32 += class13.field111[var35].method1328(!arg1);
                                        var33 += class13.field111[var35].method1332((byte) -86);
                                        var34 += class13.field111[var35].method1331((byte) 108);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class227.method1546(0, 2, 116, (long) var37, true) + "% (" + var36 + "%)";
                                    class411.field5629.method1380(var26, var27, var38, -1, -256, -123);
                                    var27 += 12;
                                }
                                if (~class414.field5682 < -1) {
                                    class411.field5629.method1380(var26, var27, "Particles: " + class406.field5540 + " / " + class414.field5682, -1, -256, -67);
                                }
                                var27 += 12;
                                if (class183.field2760) {
                                    class411.field5629.method1380(var26, var27, "Polys: " + class374.field5152.method300() + " Models: " + class374.field5152.method332(), -1, -256, -98);
                                    var27 += 12;
                                    class411.field5629.method1380(var26, var27, "Ls: " + class166.field2418 + " La: " + class323.field4517 + " NPC: " + class312.field4413 + " Pl: " + class333.field4631, -1, -256, -83);
                                    class208.method1422(-32766);
                                    var27 += 12;
                                }
                                class424.field5879[var12] = true;
                                continue;
                            }
                        }
                        if (~var11.field2602 == -1) {
                            if (class282.field4058 == var11.field2624 && class374.field5152.method379()) {
                                class374.field5152.method382(var13, var14, var11.field2554, var11.field2579);
                            }
                            method2146(var25, arg1, var11.field2543, var24, -var11.field2518 + var14, var23, var12, var22, -var11.field2477 + var13, arg9);
                            if (var11.field2541 != null) {
                                method2146(var25, false, var11.field2543, var24, -var11.field2518 + var14, var23, var12, var22, -var11.field2477 + var13, var11.field2541);
                            }
                            class249 var39 = (class249) class310.field4399.method1104(-124, (long) var11.field2543);
                            if (var39 != null) {
                                class181.method1300(var22, var12, var25, var13, -91, var14, var39.field3593, var23, var24);
                            }
                            if (~class282.field4058 == ~var11.field2624 && class374.field5152.method379()) {
                                class374.field5152.method351();
                                class266.field3834 = true;
                            }
                            class374.field5152.method453(arg7, arg5, arg0, arg3);
                        }
                        if (class432.field6115[var12] || class419.field5821 > 1) {
                            if (var11.field2602 == 3) {
                                if (~var15 == -1) {
                                    if (!var11.field2594) {
                                        class374.field5152.method348(var13, var14, var11.field2554, var11.field2579, var11.field2482, 0);
                                    } else {
                                        class374.field5152.method438(var13, var14, var11.field2554, var11.field2579, var11.field2482, 0);
                                    }
                                } else if (!var11.field2594) {
                                    class374.field5152.method348(var13, var14, var11.field2554, var11.field2579, 255 - (var15 & 255) << 24 | var11.field2482 & 16777215, 1);
                                } else {
                                    class374.field5152.method438(var13, var14, var11.field2554, var11.field2579, var11.field2482 & 16777215 | -(255 & var15) + 255 << 24, 1);
                                }
                            } else if (~var11.field2602 == -5) {
                                class199 var40 = var11.method1245(class374.field5152, (byte) 94);
                                if (var40 == null) {
                                    if (class241.field3511) {
                                        class184.method1314(var11, 58);
                                    }
                                } else {
                                    int var41 = var11.field2482;
                                    String var42 = var11.field2476;
                                    if (~var11.field2483 != 0) {
                                        class156 var43 = class373.field5128.method1644(var11.field2483, 105);
                                        var42 = var43.field2189;
                                        if (var42 == null) {
                                            var42 = "null";
                                        }
                                        if ((~var43.field2212 == -2 || ~var11.field2608 != -2) && var11.field2608 != -1) {
                                            var42 = "<col=ff9040>" + var42 + "</col> x" + class310.method1979((byte) 108, var11.field2608);
                                        }
                                    }
                                    if (class315.field4453 == var11) {
                                        var42 = class436.field6208.method1078(class66.field967, 100);
                                        var41 = var11.field2482;
                                    }
                                    if (class8.field63) {
                                        class374.field5152.method443(var13, var14, var11.field2554 + var13, var14 - -var11.field2579);
                                    }
                                    var40.method1378(var11.field2579, (int[]) null, var41 | -(255 & var15) + 255 << 24, 0, var14, (byte) -104, var11.field2544, var42, (class405) null, var11.field2467, var11.field2554, class307.field4353, var11.field2529, !var11.field2465 ? -1 : -(var15 & 255) + 255 << 24, var13, 0);
                                    if (class8.field63) {
                                        class374.field5152.method453(arg7, arg5, arg0, arg3);
                                    }
                                }
                            } else if (var11.field2602 == 5) {
                                if (~var11.field2617 <= -1) {
                                    var11.method1246(class97.field1377, class39.field534, 107).method2685(var11.field2558 << 3, class374.field5152, var11.field2579, 0, var14, 0, 0, var11.field2509 << 3, var13, var11.field2554);
                                } else {
                                    class417 var44;
                                    if (var11.field2483 == -1) {
                                        var44 = var11.method1252(-6233, class374.field5152);
                                    } else {
                                        class424 var45 = var11.field2599 ? class262.field3781.field498 : null;
                                        var44 = class373.field5128.method1651(var11.field2608, class374.field5152, var11.field2483, var45, -16777216 | var11.field2626, (byte) 96, var11.field2542, var11.field2584);
                                    }
                                    if (var44 == null) {
                                        if (class241.field3511) {
                                            class184.method1314(var11, 89);
                                        }
                                    } else {
                                        int var46 = var44.method1294();
                                        int var47 = var44.method1295();
                                        if (!var11.field2592) {
                                            if (var15 == 0) {
                                                if (~var11.field2589 == -1) {
                                                    if (var11.field2554 == var46 && var11.field2579 == var47) {
                                                        var44.method2493(var13, var14);
                                                    } else {
                                                        var44.method2497(var13, var14, var11.field2554, var11.field2579);
                                                    }
                                                } else {
                                                    var44.method2492((float) var11.field2554 / 2.0F + (float) var13, (float) var11.field2579 / 2.0F + (float) var14, var11.field2554 * 4096 / var46, var11.field2589);
                                                }
                                            } else {
                                                int var48 = -(255 & var15) + 255 << 24 | 16777215;
                                                if (var11.field2589 == 0) {
                                                    if (var11.field2554 == var46 && var11.field2579 == var47) {
                                                        var44.method722(var13, var14, 1, var48, 1);
                                                    } else {
                                                        var44.method725(var13, var14, var11.field2554, var11.field2579, 1, var48, 1);
                                                    }
                                                } else {
                                                    var44.method2495((float) var11.field2554 / 2.0F + (float) var13, (float) var11.field2579 / 2.0F + (float) var14, var11.field2554 * 4096 / var46, var11.field2589, 1, var48, 1);
                                                }
                                            }
                                        } else {
                                            class374.field5152.method443(var13, var14, var11.field2554 + var13, var14 - -var11.field2579);
                                            if (var11.field2589 != 0) {
                                                int var49 = (var46 - (1 - var11.field2554)) / var46;
                                                int var50 = (var11.field2579 + -1 + var47) / var47;
                                                for (int var51 = 0; ~var49 < ~var51; ++var51) {
                                                    for (int var52 = 0; var52 < var50; ++var52) {
                                                        var44.method2492((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var14 - -(var47 * var52)), 4096, var11.field2589);
                                                    }
                                                }
                                            } else if (var15 != 0) {
                                                var44.method1292(var13, var14, var11.field2554, var11.field2579, 1, 16777215 | 255 - (255 & var15) << 24, 1);
                                            } else {
                                                var44.method1292(var13, var14, var11.field2554, var11.field2579, 0, 0, 1);
                                            }
                                            class374.field5152.method453(arg7, arg5, arg0, arg3);
                                        }
                                    }
                                }
                            } else if (var11.field2602 != 6) {
                                if (var11.field2602 == 9) {
                                    int var72;
                                    int var73;
                                    int var74;
                                    int var75;
                                    if (var11.field2540) {
                                        var72 = var11.field2579 + var14;
                                        var73 = var13;
                                        var74 = var13 - -var11.field2554;
                                        var75 = var14;
                                    } else {
                                        var74 = var11.field2554 + var13;
                                        var73 = var13;
                                        var75 = var11.field2579 + var14;
                                        var72 = var14;
                                    }
                                    if (var11.field2526 != 1) {
                                        class374.field5152.method442(var73, var72, var74, var75, var11.field2482, var11.field2526, 0);
                                    } else {
                                        class374.field5152.method321(var73, var72, var74, var75, var11.field2482, 0);
                                    }
                                }
                            } else {
                                class1.method2(-60);
                                class468 var53 = null;
                                int var54 = 0;
                                if (var11.field2483 == -1) {
                                    if (~var11.field2488 != -6) {
                                        if (var11.field2488 != 8 && ~var11.field2488 != -10) {
                                            if (~var11.field2597 == 0) {
                                                var53 = var11.method1239(class382.field5247, -1, -9897, class363.field5001, (class303) null, -1, class353.field4854, 0, class374.field5152, class373.field5128, class262.field3781.field498, 1024, class386.field5289, class416.field5691);
                                                if (var53 == null && class241.field3511) {
                                                    class184.method1314(var11, 103);
                                                }
                                            } else {
                                                class303 var55 = class386.field5289.method1856(105, var11.field2597);
                                                var53 = var11.method1239(class382.field5247, var11.field2559, -9897, class363.field5001, var55, var11.field2528, class353.field4854, var11.field2585, class374.field5152, class373.field5128, class262.field3781.field498, 1024, class386.field5289, class416.field5691);
                                                if (var53 == null && class241.field3511) {
                                                    class184.method1314(var11, 100);
                                                }
                                            }
                                        } else {
                                            class48 var56 = class317.method2019((byte) -109, var11.field2551, false);
                                            class303 var57 = ~var11.field2597 == 0 ? null : class386.field5289.method1856(30, var11.field2597);
                                            if (var56 != null) {
                                                class424 var58 = !var11.field2599 ? null : class262.field3781.field498;
                                                var53 = var56.method485(var11.field2559, 1024, var11.field2585, var57, var11.field2528, var11.field2492, var58, 5, ~var11.field2488 == -10, class374.field5152);
                                            }
                                        }
                                    } else {
                                        int var59 = var11.field2551;
                                        if (var59 >= 0 && ~var59 > -2049) {
                                            class39 var60 = class112.field1570[var59];
                                            class303 var61 = ~var11.field2597 == 0 ? null : class386.field5289.method1856(111, var11.field2597);
                                            if (var60 != null && (class168.field2432 == var59 || class118.method916((byte) 57, var60.field485) == var11.field2492)) {
                                                var53 = var60.field498.method2520(class416.field5691, var61, 0, (class305[]) null, var11.field2585, class374.field5152, class373.field5128, 0, -1, 1024, var11.field2528, class386.field5289, true, class353.field4854, var11.field2559, (class303) null, class382.field5247, class363.field5001, (byte) -99);
                                            }
                                        }
                                    }
                                } else {
                                    class156 var62 = class373.field5128.method1644(var11.field2483, 112);
                                    if (var62 != null) {
                                        class156 var63 = var62.method1123(-41, var11.field2608);
                                        class303 var64 = var11.field2597 != -1 ? class386.field5289.method1856(31, var11.field2597) : null;
                                        class424 var65 = var11.field2599 ? class262.field3781.field498 : null;
                                        var53 = var63.method1124(1, var11.field2585, (byte) -95, 1024, class374.field5152, var11.field2559, var11.field2528, var64, var65);
                                        if (var53 == null) {
                                            class184.method1314(var11, 108);
                                        } else {
                                            var54 = -var53.method1591() / 2;
                                        }
                                    }
                                }
                                if (var53 != null) {
                                    int var66;
                                    if (var11.field2521 <= 0) {
                                        var66 = 512;
                                    } else {
                                        var66 = (var11.field2554 << 9) / var11.field2521;
                                    }
                                    int var67;
                                    if (~var11.field2513 < -1) {
                                        var67 = (var11.field2579 << 9) / var11.field2513;
                                    } else {
                                        var67 = 512;
                                    }
                                    int var68 = var11.field2554 / 2 + (var13 - -(var11.field2479 * var66 >> 9));
                                    int var69 = (var11.field2606 * var67 >> 9) + var14 - -(var11.field2579 / 2);
                                    class119.field1654.method100();
                                    class374.field5152.method454(class119.field1654);
                                    int var70 = class319.field4501[var11.field2578 << 3] * var11.field2519 >> 15;
                                    int var71 = class319.field4504[var11.field2578 << 3] * var11.field2519 >> 15;
                                    class374.field5152.method448(var68, var69, var66, var67);
                                    class374.field5152.method378((float) var11.field2489, var11.field2616 ? (float) var11.field2583 : (float) var11.field2583 * 1.5F);
                                    if (~arg2 == 1412584498 || class266.field3834) {
                                        class374.field5152.method360();
                                        class374.field5152.method417();
                                        class374.field5152.method453(arg7, arg5, arg0, arg3);
                                        class266.field3834 = false;
                                    }
                                    if (var11.field2595) {
                                        class374.field5152.method308(false);
                                    }
                                    class369.field5089.method101(-var11.field2491 << 3);
                                    class369.field5089.method102(var11.field2556 << 3);
                                    class369.field5089.method107(var11.field2596, var54 + var70 + var11.field2581, var11.field2581 + var71);
                                    class369.field5089.method104(var11.field2578 << 3);
                                    if (class8.field63) {
                                        class374.field5152.method443(var13, var14, var11.field2554 + var13, var11.field2579 + var14);
                                    }
                                    if (!var11.field2616) {
                                        var53.method1592(class369.field5089, (class63) null, 1);
                                    } else {
                                        var53.method1573(class369.field5089, (class63) null, var11.field2519, 1);
                                    }
                                    if (class8.field63) {
                                        class374.field5152.method453(arg7, arg5, arg0, arg3);
                                    }
                                    if (var11.field2595) {
                                        class374.field5152.method308(true);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V", line = 791)
    public final void method75(byte arg0) {
        if (arg0 != 111) {
            this.field4773 = null;
        }
        ++field4765;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLvc;)V", line = 809)
    public final void method78(boolean arg0, class89 arg1) {
        if (!arg0) {
            field4761 = null;
        }
        ++field4767;
        this.field4773.method2278(arg1, 4);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 820)
    public static final int method2147(String arg0, byte arg1) {
        ++field4757;
        if (arg1 != 110) {
            field4761 = null;
        }
        return 1 + arg0.length();
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)I", line = 832)
    public final int method71(byte arg0) {
        if (arg0 < 81) {
            this.field4758 = true;
        }
        ++field4771;
        return this.field4773.field5171;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BILvc;)Ln;", line = 845)
    public final class468 method76(byte arg0, int arg1, class89 arg2) {
        ++field4768;
        if (arg0 != -106) {
            field4775 = 105;
        }
        return this.field4773.method2288(arg0 + 105, arg2, false, arg1, 0, 0, false);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)I", line = 858)
    public final int method83(byte arg0) {
        ++field4755;
        if (arg0 < 70) {
            field4761 = null;
        }
        return this.field4773.field5172;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lvc;B)V", line = 871)
    public final void method85(class89 arg0, byte arg1) {
        ++field4759;
        this.field4773.method2281(arg0, 131072);
        if (arg1 != -24) {
            field4774 = 83;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([BIIB)I", line = 884)
    public static final int method2148(byte[] arg0, int arg1, int arg2, byte arg3) {
        ++field4770;
        int var4 = -1;
        int var5 = 80 / ((arg3 - 47) / 57);
        for (int var6 = arg2; var6 < arg1; ++var6) {
            var4 = class304.field4323[(var4 ^ arg0[var6]) & 255] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 906)
    public final void method84(int arg0) {
        if (arg0 != 16805) {
            field4775 = -106;
        }
        ++field4769;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZILvc;IILuq;I)V", line = 916)
    public final void method70(boolean arg0, int arg1, class89 arg2, int arg3, int arg4, class316 arg5, int arg6) {
        ++field4772;
        if (arg1 <= 40) {
            this.method69((class89) null, 94);
        }
        throw new IllegalStateException();
    }
}
