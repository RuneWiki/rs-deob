import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class516 {

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    private int field7482;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    private int field7478;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    private int field7470;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    private int field7477;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public int field7479;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public int field7480;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public int field7469;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public int field7472;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
    public int field7484;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public int field7474;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "Lcb;")
    public static class631 field7483 = new class631(27, 15);

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "Lcb;")
    public static class631 field7485 = new class631(56, 7);

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIBIIIIIII)V", line = 4)
    public final void method3085(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field7475++;
        if (arg3 < 29) {
            return;
        }
        this.field7477 = arg6;
        this.field7470 = arg8;
        this.field7478 = arg10 * arg10;
        this.field7482 = arg2;
        this.field7472 = this.field7482 + arg7;
        this.field7469 = this.field7482 + arg0;
        this.field7480 = this.field7477 + arg5;
        this.field7479 = this.field7470 + arg4;
        this.field7484 = this.field7470 + arg1;
        this.field7474 = this.field7477 + arg9;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIB)Z", line = 25)
    public final boolean method3086(int arg0, int arg1, int arg2, byte arg3) {
        field7481++;
        if (arg3 <= 109) {
            method3088((byte) -83);
        }
        if (arg1 < this.field7469 || this.field7472 < arg1) {
            return false;
        } else if (this.field7479 > arg0 || this.field7484 < arg0) {
            return false;
        } else if (arg2 >= this.field7474 && this.field7480 >= arg2) {
            int var5 = arg1 - this.field7482;
            int var6 = arg2 - this.field7477;
            return var5 * var5 + (var6 * var6) < this.field7478;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)Z", line = 51)
    public static final boolean method3087(int arg0) throws IOException {
        field7471++;
        if (class166.field2624 == null) {
            return false;
        }
        if (class153.field2383 == null) {
            if (class675.field9535) {
                if (!class166.field2624.method3114(1, (byte) 126)) {
                    return false;
                }
                class166.field2624.method3120(0, (byte) -36, 1, class624.field8742.field4543);
                class43.field735++;
                class675.field9535 = false;
                class618.field8707 = 0;
            }
            class624.field8742.field4534 = 0;
            if (class624.field8742.method3897(255)) {
                if (!class166.field2624.method3114(1, (byte) 125)) {
                    return false;
                }
                class166.field2624.method3120(1, (byte) -36, 1, class624.field8742.field4543);
                class618.field8707 = 0;
                class43.field735++;
            }
            class675.field9535 = true;
            class334[] var1 = class705.method3916(0);
            int var2 = class624.field8742.method3907(false);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class624.field8742.field4534);
            }
            class153.field2383 = var1[var2];
            class495.field7166 = class153.field2383.field4894;
        }
        if (class495.field7166 == -1) {
            if (!class166.field2624.method3114(1, (byte) 126)) {
                return false;
            }
            class166.field2624.method3120(0, (byte) -36, 1, class624.field8742.field4543);
            class495.field7166 = class624.field8742.field4543[0] & 0xFF;
            class43.field735++;
            class618.field8707 = 0;
        }
        if (class495.field7166 == -2) {
            if (!class166.field2624.method3114(2, (byte) 126)) {
                return false;
            }
            class166.field2624.method3120(0, (byte) -36, 2, class624.field8742.field4543);
            class624.field8742.field4534 = 0;
            class495.field7166 = class624.field8742.method1989((byte) -54);
            class43.field735 += 2;
            class618.field8707 = 0;
        }
        if (class495.field7166 > 0) {
            if (!class166.field2624.method3114(class495.field7166, (byte) 125)) {
                return false;
            }
            class624.field8742.field4534 = 0;
            class166.field2624.method3120(0, (byte) -36, class495.field7166, class624.field8742.field4543);
            class43.field735 += class495.field7166;
            class618.field8707 = 0;
        }
        class340.field4998 = class263.field4081;
        class263.field4081 = class424.field6233;
        class424.field6233 = class153.field2383;
        if (class398.field5917 == class153.field2383) {
            int var3 = class624.field8742.method1989((byte) -35);
            if (var3 == 65535) {
                var3 = -1;
            }
            int var4 = class624.field8742.method1987(-19);
            int var5 = class624.field8742.method1989((byte) -99);
            int var6 = class624.field8742.method1987(-74);
            int var7 = class624.field8742.method1989((byte) -108);
            class522.method3110(var5, var7, 50, var6, var3, var4, false);
            class153.field2383 = null;
            return true;
        } else if (class89.field1363 == class153.field2383) {
            class495.field7168 = class624.field8742.method1987(-74);
            class104.field1543 = class180.field3060;
            class153.field2383 = null;
            return true;
        } else if (class440.field6413 == class153.field2383) {
            int var8 = class624.field8742.method1972(-128) << 2;
            int var9 = class624.field8742.method1987(-71);
            int var10 = class624.field8742.method1945(arg0 - 1);
            int var11 = class624.field8742.method1987(-36);
            int var12 = class624.field8742.method1924(5970);
            class229.method1597(127);
            class390.method2440(var12, var8, 1, var10, var11, true, var9);
            class153.field2383 = null;
            return true;
        } else if (class713.field10027 == class153.field2383) {
            class492.method2994(class539.field7701, (byte) 70);
            class153.field2383 = null;
            return true;
        } else if (class393.field5871 == class153.field2383) {
            class422.field6216.method2015((byte) 24);
            class153.field2383 = null;
            class122.field1869 += 32;
            return true;
        } else if (class75.field1110 == class153.field2383) {
            int var13 = class624.field8742.method1989((byte) -102);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = class624.field8742.method1945(0);
            int var15 = class624.field8742.method1945(0);
            class114.method921((byte) 111, var13, var15, var14);
            class153.field2383 = null;
            return true;
        } else if (class377.field5671 == class153.field2383) {
            int var16 = class624.field8742.method1972(-128);
            if (var16 == 65535) {
                var16 = -1;
            }
            int var17 = class624.field8742.method1987(arg0 ^ 0xFFFFFFB8);
            int var18 = class624.field8742.method1952(22085);
            class641.method3622(-193, var17, var18, var16);
            class153.field2383 = null;
            return true;
        } else if (class402.field5982 == class153.field2383) {
            int var19 = class624.field8742.method1989((byte) -116);
            int var20 = class624.field8742.method1937(arg0 - 1);
            class229.method1597(97);
            class319.method2082(var19, var20, arg0 - 26221);
            class153.field2383 = null;
            return true;
        } else if (class618.field8710 == class153.field2383) {
            String var21 = class624.field8742.method1958(arg0 ^ 0xFFFFF293);
            int var22 = class624.field8742.method1989((byte) -78);
            String var23 = class536.field7684.method1493(1, var22).method3708(class624.field8742, (byte) 105);
            class487.method2961(var21, 19, var22, null, -108, 0, var23, var21, var21);
            class153.field2383 = null;
            return true;
        } else if (class231.field3717 == class153.field2383) {
            int var24 = class624.field8742.method1989((byte) -39);
            class573 var25;
            if (class673.field9516 == var24) {
                var25 = class145.field2251;
            } else {
                var25 = class279.field4271[var24];
            }
            if (var25 == null) {
                class153.field2383 = null;
                return true;
            }
            int var26 = class624.field8742.method1989((byte) -55);
            int var27 = class624.field8742.method1987(-59);
            boolean var28 = (var26 & 0x8000) != 0;
            if (var25.field8146 != null && var25.field8138 != null) {
                boolean var29 = false;
                if (var27 <= 1) {
                    if (!var28 && (class311.field4698 && !class355.field5385 || class330.field4867)) {
                        var29 = true;
                    } else if (class372.method2368(21, var25.field8146)) {
                        var29 = true;
                    }
                }
                if (!var29 && class178.field3052 == 0) {
                    int var30 = -1;
                    String var31;
                    if (var28) {
                        var26 &= 0x7FFF;
                        class662 var32 = class485.method2943(class624.field8742, 1);
                        var30 = var32.field9421;
                        var31 = var32.field9420.method3708(class624.field8742, (byte) 105);
                    } else {
                        var31 = class86.method757(class121.method950(32767, class624.field8742), -126);
                    }
                    var25.field1633 = var31.trim();
                    var25.field1643 = var26 & 0xFF;
                    var25.field1646 = var26 >> 8;
                    var25.field1665 = 150;
                    int var33;
                    if (var27 == 1 || var27 == 2) {
                        var33 = var28 ? 17 : 1;
                    } else {
                        var33 = var28 ? 17 : 2;
                    }
                    if (var27 == 2) {
                        class487.method2961("<img=1>" + var25.method3326(true, true), var33, var30, null, -91, 0, var31, var25.field8137, "<img=1>" + var25.method3329(false, (byte) 117));
                    } else if (var27 == 1) {
                        class487.method2961("<img=0>" + var25.method3326(true, true), var33, var30, null, arg0 ^ 0xFFFFFF8F, 0, var31, var25.field8137, "<img=0>" + var25.method3329(false, (byte) 84));
                    } else {
                        class487.method2961(var25.method3326(true, true), var33, var30, null, -124, 0, var31, var25.field8137, var25.method3329(false, (byte) 81));
                    }
                }
            }
            class153.field2383 = null;
            return true;
        } else if (class183.field3090 == class153.field2383) {
            class312.method2058(class495.field7166, class624.field8742, arg0 - 1);
            class153.field2383 = null;
            return true;
        } else if (class430.field6293 == class153.field2383) {
            boolean var34 = class624.field8742.method1988(97) == 1;
            class229.method1597(59);
            class153.field2383 = null;
            class125.field1913 = var34;
            return true;
        } else if (class552.field7868 == class153.field2383) {
            int var35 = class624.field8742.method1989((byte) -106);
            int var36 = class624.field8742.method1974(-1);
            class229.method1597(98);
            class270.method1782(var36, arg0 ^ 0x4D, var35);
            class153.field2383 = null;
            return true;
        } else if (class153.field2383 == class114.field1778) {
            int var37 = class624.field8742.method1972(-128);
            int var38 = class624.field8742.method1924(arg0 + 5969);
            boolean var39 = (var38 & 0x1) == 1;
            class173.method1366(var37, var39, -107);
            class308.field4654[class636.method3603(class651.field9249++, 31)] = var37;
            class153.field2383 = null;
            return true;
        } else if (class424.field6231 == class153.field2383) {
            class492.method2994(class466.field6797, (byte) 119);
            class153.field2383 = null;
            return true;
        } else if (class616.field8687 == class153.field2383) {
            class145.field2252 = class680.method3790(-12624, class624.field8742.method1987(-80));
            class153.field2383 = null;
            return true;
        } else if (class335.field4913 == class153.field2383) {
            int var40 = class624.field8742.method1972(-128);
            int var41 = class624.field8742.method1978(arg0 ^ 0x26DB);
            int var42 = class624.field8742.method1961(true);
            int var43 = class624.field8742.method1938(-1);
            class229.method1597(arg0 ^ 0x46);
            class526.method3126((byte) -82, var42 << 16 | var43, var41, 7, var40);
            class153.field2383 = null;
            return true;
        } else if (class474.field6878 == class153.field2383) {
            int var44 = class624.field8742.method1961(true);
            int var45 = class624.field8742.method1972(-128);
            int var46 = class624.field8742.method1974(-1);
            int var47 = class624.field8742.method1972(arg0 - 129);
            int var48 = class624.field8742.method1924(5970);
            boolean var49 = (var48 & 0x80) != 0;
            int var50 = var48 & 0x7;
            int var51 = (var48 & 0x79) >> 3;
            if (var51 == 15) {
                var51 = -1;
            }
            if (var46 >> 30 != 0) {
                int var52 = (var46 & 0x336839D2) >> 28;
                int var53 = (var46 >> 14 & 0x3FFF) - class265.field4123;
                int var54 = (var46 & 0x3FFF) - class723.field10155;
                if (var53 >= 0 && var54 >= 0 && class191.field3229 > var53 && class314.field4720 > var54) {
                    int var55 = var53 * 512 + 256;
                    int var56 = var54 * 512 + 256;
                    int var57 = var52;
                    if (var52 < 3 && class584.method3365(false, var53, var54)) {
                        var57 = var52 + 1;
                    }
                    class758 var58 = new class758(var47, var44, class199.field3403, var52, var57, var55, class232.method1611(var56, var55, var52, (byte) -110) - var45, var56, var53, var53, var54, var54, var50);
                    class85.field1253.method3472(arg0 + 83, new class548(var58));
                }
            } else if ((var46 >> 29) != 0) {
                int var59 = var46 & 0xFFFF;
                class53 var60 = (class53) class332.field4881.method3512(true, (long) var59);
                if (var60 != null) {
                    if (var47 == 65535) {
                        var47 = -1;
                    }
                    class461 var61 = var60.field847;
                    boolean var62 = true;
                    int var63 = var49 ? var61.field1693 : var61.field1595;
                    if (var47 != -1 && var63 != -1) {
                        if (var47 == var63) {
                            class417 var64 = class41.field718.method1529((byte) 40, var47);
                            if (var64.field6123 && var64.field6136 != -1) {
                                class82 var65 = class83.field1219.method2358((byte) -120, var64.field6136);
                                int var66 = var65.field1195;
                                if (var66 == 0 || var66 == 2) {
                                    var62 = false;
                                } else if (var66 == 1) {
                                    var62 = true;
                                }
                            }
                        } else {
                            class417 var67 = class41.field718.method1529((byte) 37, var47);
                            class417 var68 = class41.field718.method1529((byte) 19, var63);
                            if (var67.field6136 != -1 && var68.field6136 != -1) {
                                class82 var69 = class83.field1219.method2358((byte) 117, var67.field6136);
                                class82 var70 = class83.field1219.method2358((byte) -52, var68.field6136);
                                if (var70.field1199 > var69.field1199) {
                                    var62 = false;
                                }
                            }
                        }
                    }
                    if (var62) {
                        if (var49) {
                            var61.field1625 = 1;
                            var61.field1693 = var47;
                            var61.field1658 = var51;
                            var61.field1627 = var45;
                            var61.field1673 = 0;
                            var61.field1648 = class199.field3403 + var44;
                            var61.field1632 = 0;
                            var61.field1677 = var50;
                            if (class199.field3403 < var61.field1648) {
                                var61.field1632 = -1;
                            }
                            if (var61.field1693 != -1 && class199.field3403 == var61.field1648) {
                                int var73 = class41.field718.method1529((byte) 34, var61.field1693).field6136;
                                if (var73 != -1) {
                                    class82 var74 = class83.field1219.method2358((byte) -69, var73);
                                    if (var74 != null && var74.field1197 != null && !var61.field1630) {
                                        class262.method1747(var61, 0, var74, -26868);
                                    }
                                }
                            }
                        } else {
                            var61.field1601 = 1;
                            var61.field1595 = var47;
                            var61.field1662 = 0;
                            var61.field1599 = var51;
                            var61.field1682 = var45;
                            var61.field1684 = 0;
                            var61.field1669 = class199.field3403 + var44;
                            var61.field1639 = var50;
                            if (var61.field1669 > class199.field3403) {
                                var61.field1662 = -1;
                            }
                            if (var61.field1595 != -1 && class199.field3403 == var61.field1669) {
                                int var71 = class41.field718.method1529((byte) 14, var61.field1595).field6136;
                                if (var71 != -1) {
                                    class82 var72 = class83.field1219.method2358((byte) 90, var71);
                                    if (var72 != null && var72.field1197 != null && !var61.field1630) {
                                        class262.method1747(var61, 0, var72, arg0 ^ 0xFFFF970D);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (var46 >> 28 != 0) {
                int var75 = var46 & 0xFFFF;
                class573 var76;
                if (class673.field9516 == var75) {
                    var76 = class145.field2251;
                } else {
                    var76 = class279.field4271[var75];
                }
                if (var76 != null) {
                    if (var47 == 65535) {
                        var47 = -1;
                    }
                    boolean var77 = true;
                    int var78 = var49 ? var76.field1693 : var76.field1595;
                    if (var47 != -1 && var78 != -1) {
                        if (var47 == var78) {
                            class417 var79 = class41.field718.method1529((byte) 106, var47);
                            if (var79.field6123 && var79.field6136 != -1) {
                                class82 var80 = class83.field1219.method2358((byte) -72, var79.field6136);
                                int var81 = var80.field1195;
                                if (var81 == 0 || var81 == 2) {
                                    var77 = false;
                                } else if (var81 == 1) {
                                    var77 = true;
                                }
                            }
                        } else {
                            class417 var82 = class41.field718.method1529((byte) 72, var47);
                            class417 var83 = class41.field718.method1529((byte) 31, var78);
                            if (var82.field6136 != -1 && var83.field6136 != -1) {
                                class82 var84 = class83.field1219.method2358((byte) -87, var82.field6136);
                                class82 var85 = class83.field1219.method2358((byte) -66, var83.field6136);
                                if (var84.field1199 < var85.field1199) {
                                    var77 = false;
                                }
                            }
                        }
                    }
                    if (var77) {
                        if (var49) {
                            var76.field1658 = var51;
                            var76.field1648 = class199.field3403 + var44;
                            var76.field1693 = var47;
                            var76.field1632 = 0;
                            var76.field1677 = var50;
                            var76.field1673 = 0;
                            var76.field1627 = var45;
                            var76.field1625 = 1;
                            if (class199.field3403 < var76.field1648) {
                                var76.field1632 = -1;
                            }
                            if (var76.field1693 == 65535) {
                                var76.field1693 = -1;
                            }
                            if (var76.field1693 != -1 && class199.field3403 == var76.field1648) {
                                int var88 = class41.field718.method1529((byte) 108, var76.field1693).field6136;
                                if (var88 != -1) {
                                    class82 var89 = class83.field1219.method2358((byte) -53, var88);
                                    if (var89 != null && var89.field1197 != null && !var76.field1630) {
                                        class262.method1747(var76, 0, var89, -26868);
                                    }
                                }
                            }
                        } else {
                            var76.field1599 = var51;
                            var76.field1601 = 1;
                            var76.field1669 = class199.field3403 + var44;
                            var76.field1662 = 0;
                            var76.field1639 = var50;
                            var76.field1684 = 0;
                            var76.field1595 = var47;
                            var76.field1682 = var45;
                            if (var76.field1595 == 65535) {
                                var76.field1595 = -1;
                            }
                            if (class199.field3403 < var76.field1669) {
                                var76.field1662 = -1;
                            }
                            if (var76.field1595 != -1 && class199.field3403 == var76.field1669) {
                                int var86 = class41.field718.method1529((byte) 123, var76.field1595).field6136;
                                if (var86 != -1) {
                                    class82 var87 = class83.field1219.method2358((byte) 97, var86);
                                    if (var87 != null && var87.field1197 != null && !var76.field1630) {
                                        class262.method1747(var76, 0, var87, arg0 - 26869);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class153.field2383 = null;
            return true;
        } else if (class59.field923 == class153.field2383) {
            int var90 = class624.field8742.method1968((byte) 34);
            int var91 = class624.field8742.method1934(-2);
            int var92 = class624.field8742.method1987(-79);
            String var93 = "";
            String var94 = var93;
            if ((var92 & 0x1) != 0) {
                var93 = class624.field8742.method1958(-3438);
                if ((var92 & 0x2) == 0) {
                    var94 = var93;
                } else {
                    var94 = class624.field8742.method1958(-3438);
                }
            }
            String var95 = class624.field8742.method1958(-3438);
            if (var90 == 99) {
                class400.method2484(26852, var95);
            } else if (var94.equals("") || !class372.method2368(arg0 ^ 0x5F, var94)) {
                class157.method1177(var93, var91, var95, var94, var93, arg0, var90);
            } else {
                class153.field2383 = null;
                return true;
            }
            class153.field2383 = null;
            return true;
        } else if (class153.field2383 == class100.field1482) {
            class652.method3665(class624.field8742.method1958(-3438), true);
            class153.field2383 = null;
            return true;
        } else if (class402.field5979 == class153.field2383) {
            int var96 = class624.field8742.method1972(-128);
            int var97 = class624.field8742.method1989((byte) -124);
            int var98 = class624.field8742.method1989((byte) -81);
            int var99 = class624.field8742.method1978(9946);
            class229.method1597(106);
            class25.method139(var97, var96, var98, var99, (byte) 98);
            class153.field2383 = null;
            return true;
        } else if (class371.field5625 == class153.field2383) {
            class129.field2118 = class624.field8742.method1987(-78);
            class153.field2383 = null;
            return true;
        } else if (class258.field4047 == class153.field2383) {
            int var100 = class624.field8742.method1924(arg0 + 5969);
            int var101 = class624.field8742.method1987(-83);
            String var102 = class624.field8742.method1958(-3438);
            int var103 = class624.field8742.method1972(-128);
            if (var103 == 65535) {
                var103 = -1;
            }
            if (var101 >= 1 && var101 <= 8) {
                if (var102.equalsIgnoreCase("null")) {
                    var102 = null;
                }
                class379.field5700[var101 - 1] = var102;
                class166.field2563[var101 - 1] = var103;
                class742.field10413[var101 - 1] = var100 == 0;
            }
            class153.field2383 = null;
            return true;
        } else if (class3.field9 == class153.field2383) {
            int var104 = class624.field8742.method1938(-1);
            String var105 = class624.field8742.method1958(-3438);
            class229.method1597(70);
            class699.method3887(2, var104, var105);
            class153.field2383 = null;
            return true;
        } else if (class544.field7776 == class153.field2383) {
            int var106 = class624.field8742.method1938(-1);
            int var107 = class624.field8742.method1938(arg0 - 2);
            class229.method1597(arg0 ^ 0x5D);
            class211.method1530(0, var107, -1, var106);
            class153.field2383 = null;
            return true;
        } else if (class343.field5089 == class153.field2383) {
            int var108 = class624.field8742.method1987(arg0 - 98);
            int var109 = var108 >> 5;
            int var110 = var108 & 0x1F;
            if (var110 == 0) {
                class541.field7732[var109] = null;
                class153.field2383 = null;
                return true;
            }
            class251 var111 = new class251();
            var111.field3993 = var110;
            var111.field3991 = class624.field8742.method1987(-49);
            if (var111.field3991 >= 0 && class466.field6800.length > var111.field3991) {
                if (var111.field3993 == 1 || var111.field3993 == 10) {
                    var111.field3990 = class624.field8742.method1989((byte) -34);
                    class624.field8742.field4534 += 6;
                } else if (var111.field3993 >= 2 && var111.field3993 <= 6) {
                    if (var111.field3993 == 2) {
                        var111.field4000 = 256;
                        var111.field3996 = 256;
                    }
                    if (var111.field3993 == 3) {
                        var111.field3996 = 256;
                        var111.field4000 = 0;
                    }
                    if (var111.field3993 == 4) {
                        var111.field3996 = 256;
                        var111.field4000 = 512;
                    }
                    if (var111.field3993 == 5) {
                        var111.field4000 = 256;
                        var111.field3996 = 0;
                    }
                    if (var111.field3993 == 6) {
                        var111.field4000 = 256;
                        var111.field3996 = 512;
                    }
                    var111.field3993 = 2;
                    var111.field3995 = class624.field8742.method1987(-27);
                    var111.field4000 += class624.field8742.method1989((byte) -123) - class265.field4123 << 9;
                    var111.field3996 += class624.field8742.method1989((byte) -32) - class723.field10155 << 9;
                    var111.field3997 = class624.field8742.method1987(-70) << 2;
                    var111.field3999 = class624.field8742.method1989((byte) -96);
                }
                var111.field3998 = class624.field8742.method1989((byte) -46);
                if (var111.field3998 == 65535) {
                    var111.field3998 = -1;
                }
                class541.field7732[var109] = var111;
            }
            class153.field2383 = null;
            return true;
        } else if (class45.field768 == class153.field2383) {
            boolean var112 = class624.field8742.method1987(arg0 ^ 0xFFFFFFE7) == 1;
            String var113 = class624.field8742.method1958(-3438);
            String var114 = var113;
            if (var112) {
                var114 = class624.field8742.method1958(-3438);
            }
            long var115 = class624.field8742.method1928(arg0 + 10184);
            long var117 = (long) class624.field8742.method1989((byte) -37);
            long var119 = (long) class624.field8742.method1952(22085);
            int var121 = class624.field8742.method1987(arg0 - 51);
            int var122 = class624.field8742.method1989((byte) -48);
            long var123 = (var117 << 32) + var119;
            boolean var125 = false;
            int var126 = 0;
            while (true) {
                if (var126 >= 100) {
                    if (var121 <= 1 && class372.method2368(-126, var114)) {
                        var125 = true;
                    }
                    break;
                }
                if (class550.field7845[var126] == var123) {
                    var125 = true;
                    break;
                }
                var126++;
            }
            if (!var125 && class178.field3052 == 0) {
                class550.field7845[class514.field7458] = var123;
                class514.field7458 = (class514.field7458 + 1) % 100;
                String var127 = class536.field7684.method1493(1, var122).method3708(class624.field8742, (byte) 105);
                if (var121 == 2) {
                    class487.method2961("<img=1>" + var113, 20, var122, class693.method3870(var115, -1), -115, 0, var127, var113, "<img=1>" + var114);
                } else if (var121 == 1) {
                    class487.method2961("<img=0>" + var113, 20, var122, class693.method3870(var115, arg0 - 2), -97, 0, var127, var113, "<img=0>" + var114);
                } else {
                    class487.method2961(var113, 20, var122, class693.method3870(var115, -1), -99, 0, var127, var113, var114);
                }
            }
            class153.field2383 = null;
            return true;
        } else if (class522.field7532 == class153.field2383) {
            class680.method3788(12453);
            class153.field2383 = null;
            return true;
        } else if (class395.field5893 == class153.field2383) {
            class732.field10290 = class624.field8742.method1945(0);
            class358.field5454 = class624.field8742.method1945(arg0 ^ 0x1);
            class153.field2383 = null;
            return true;
        } else if (class46.field775 == class153.field2383) {
            int var128 = class624.field8742.method1938(-1);
            class229.method1597(arg0 + 66);
            class393.method2447(var128, -9502);
            class153.field2383 = null;
            return true;
        } else if (class45.field769 == class153.field2383) {
            class734.field10336 = class624.field8742.method1984(4) << 3;
            class470.field6824 = class624.field8742.method1945(arg0 - 1);
            class112.field1730 = class624.field8742.method1930(arg0 - 268435457) << 3;
            class153.field2383 = null;
            return true;
        } else if (class448.field6536 == class153.field2383) {
            int var129 = class624.field8742.method1937(0);
            int var130 = class624.field8742.method1974(-1);
            int var131 = class624.field8742.method1972(-128);
            if (var131 == 65535) {
                var131 = -1;
            }
            class229.method1597(arg0 ^ 0x62);
            class219.method1564((byte) -14, var131, var130, var129);
            class688 var132 = class556.field7917.method741(-62, var131);
            class25.method139(var132.field9699, var132.field9708, var132.field9733, var129, (byte) -83);
            class733.method4093(var132.field9758, (byte) -128, var132.field9744, var129, var132.field9723);
            class153.field2383 = null;
            return true;
        } else if (class268.field4137 == class153.field2383) {
            class492.method2994(class32.field302, (byte) 54);
            class153.field2383 = null;
            return true;
        } else if (arg0 != 1) {
            return true;
        } else if (class402.field5981 == class153.field2383) {
            class237.method1635((byte) -18);
            class153.field2383 = null;
            return false;
        } else if (class461.field6685 == class153.field2383) {
            class492.method2994(class474.field6883, (byte) 63);
            class153.field2383 = null;
            return true;
        } else if (class153.field2383 == class120.field1838) {
            int var133 = class624.field8742.method1988(113);
            int var134 = class624.field8742.method1938(-1) << 2;
            int var135 = class624.field8742.method1987(arg0 ^ 0xFFFFFF91);
            int var136 = class624.field8742.method1924(5970);
            int var137 = class624.field8742.method1945(0);
            class229.method1597(arg0 + 124);
            class239.method1656(var135, var136, var134, true, var137, var133);
            class153.field2383 = null;
            return true;
        } else if (class532.field7654 == class153.field2383) {
            int var138 = class624.field8742.method1989((byte) -34);
            int var139 = class624.field8742.method1987(arg0 ^ 0xFFFFFFD1);
            boolean var140 = (var139 & 0x1) == 1;
            class275.method1805(var138, (byte) 126, var140);
            int var141 = class624.field8742.method1989((byte) -126);
            for (int var142 = 0; var142 < var141; var142++) {
                int var143 = class624.field8742.method1945(0);
                if (var143 == 255) {
                    var143 = class624.field8742.method1978(9946);
                }
                int var144 = class624.field8742.method1938(arg0 ^ 0xFFFFFFFE);
                class666.method3736(var140, var142, var144 - 1, arg0 ^ 0xFFFFFF90, var138, var143);
            }
            class308.field4654[class636.method3603(31, class651.field9249++)] = var138;
            class153.field2383 = null;
            return true;
        } else if (class484.field6994 == class153.field2383) {
            byte var145 = class624.field8742.method1983(15575);
            int var146 = class624.field8742.method1989((byte) -64);
            class229.method1597(59);
            class63.method616(var145, var146, arg0 ^ 0xFFFFFFA9);
            class153.field2383 = null;
            return true;
        } else if (class673.field9525 == class153.field2383) {
            class734.field10337 = class624.field8742.method1977((byte) -120);
            class153.field2383 = null;
            class104.field1543 = class180.field3060;
            return true;
        } else if (class374.field5650 == class153.field2383) {
            class492.method2994(class97.field1427, (byte) 88);
            class153.field2383 = null;
            return true;
        } else if (class486.field7029 == class153.field2383) {
            class694.method3874(class195.field3351, 0);
            class153.field2383 = null;
            return false;
        } else if (class47.field785 == class153.field2383) {
            class624.field8742.field4534 += 28;
            if (class624.field8742.method1942(63)) {
                class455.method2792(class624.field8742.field4534 - 28, class624.field8742, (byte) 63);
            }
            class153.field2383 = null;
            return true;
        } else if (class629.field8835 == class153.field2383) {
            int var147 = class624.field8742.method1929(0);
            int var148 = class624.field8742.method1977((byte) -118);
            int var149 = class624.field8742.method1937(0);
            class229.method1597(112);
            class1.method2(11, var149, var148, var147);
            class153.field2383 = null;
            return true;
        } else if (class672.field9511 == class153.field2383) {
            class492.method2994(class475.field6900, (byte) 57);
            class153.field2383 = null;
            return true;
        } else if (class91.field1368 == class153.field2383) {
            int var150 = class624.field8742.method1938(-1);
            int var151 = class624.field8742.method1934(~arg0);
            class229.method1597(86);
            class686.method3826(arg0 - 21468, var151, var150);
            class153.field2383 = null;
            return true;
        } else if (class677.field9549 == class153.field2383) {
            int var152 = class624.field8742.method1972(-128);
            int var153 = class624.field8742.method1974(-1);
            class422.field6216.method2016(var153, var152, (byte) 79);
            class153.field2383 = null;
            return true;
        } else if (class73.field1099 == class153.field2383) {
            int var154 = class624.field8742.method1974(arg0 - 2);
            class229.method1597(102);
            class526.method3126((byte) -82, -1, var154, 3, -1);
            class153.field2383 = null;
            return true;
        } else if (class632.field8877 == class153.field2383) {
            int var155 = class624.field8742.method1934(-2);
            class606.field8566 = class706.field9962.method4057(31358, var155);
            class153.field2383 = null;
            return true;
        } else if (class29.field281 == class153.field2383) {
            int var156 = class624.field8742.method1989((byte) -59);
            if (var156 == 65535) {
                var156 = -1;
            }
            int var157 = class624.field8742.method1987(arg0 - 35);
            int var158 = class624.field8742.method1989((byte) -127);
            int var159 = class624.field8742.method1987(-123);
            int var160 = class624.field8742.method1989((byte) -59);
            class146.method1122(var159, var158, var156, var160, (byte) -113, var157);
            class153.field2383 = null;
            return true;
        } else if (class155.field2397 == class153.field2383) {
            class492.method2994(class756.field10533, (byte) 127);
            class153.field2383 = null;
            return true;
        } else if (class356.field5388 == class153.field2383) {
            int var161 = class624.field8742.method1938(-1);
            if (var161 == 65535) {
                var161 = -1;
            }
            int var162 = class624.field8742.method1972(-128);
            if (var162 == 65535) {
                var162 = -1;
            }
            int var163 = class624.field8742.method1937(0);
            int var164 = class624.field8742.method1989((byte) -40);
            class229.method1597(81);
            for (int var165 = var162; var165 <= var161; var165++) {
                long var166 = ((long) var163 << 32) + (long) var165;
                class285 var168 = (class285) class488.field7060.method3512(true, var166);
                class285 var169;
                if (var168 != null) {
                    var169 = new class285(var168.field4391, var164);
                    var168.method636((byte) 97);
                } else if (var165 == -1) {
                    var169 = new class285(class65.method638(var163, arg0 + 1668949295).field5262.field4391, var164);
                } else {
                    var169 = new class285(0, var164);
                }
                class488.field7060.method3516(255, var166, var169);
            }
            class153.field2383 = null;
            return true;
        } else if (class60.field933 == class153.field2383) {
            class694.method3874(false, 0);
            class153.field2383 = null;
            return false;
        } else if (class425.field6239 == class153.field2383) {
            String var170 = class624.field8742.method1958(-3438);
            Object[] var171 = new Object[var170.length() + 1];
            for (int var172 = var170.length() - 1; var172 >= 0; var172--) {
                if (var170.charAt(var172) == 's') {
                    var171[var172 + 1] = class624.field8742.method1958(-3438);
                } else {
                    var171[var172 + 1] = Integer.valueOf(class624.field8742.method1934(-2));
                }
            }
            var171[0] = Integer.valueOf(class624.field8742.method1934(class584.method3367(arg0, -1)));
            class229.method1597(68);
            class700 var173 = new class700();
            var173.field9891 = var171;
            class464.method2838(var173);
            class153.field2383 = null;
            return true;
        } else if (class713.field10022 == class153.field2383) {
            class555.field7910 = class495.field7166 > 2 ? class624.field8742.method1958(arg0 ^ 0xFFFFF293) : class641.field9019.method3621(98, class467.field6804);
            class246.field3952 = class495.field7166 <= 0 ? -1 : class624.field8742.method1989((byte) -32);
            if (class246.field3952 == 65535) {
                class246.field3952 = -1;
            }
            class153.field2383 = null;
            return true;
        } else if (class180.field3058 == class153.field2383) {
            int var174 = class624.field8742.method1989((byte) -81);
            if (var174 == 65535) {
                var174 = -1;
            }
            int var175 = class624.field8742.method1937(0);
            int var176 = class624.field8742.method1961(true);
            if (var176 == 65535) {
                var176 = -1;
            }
            int var177 = class624.field8742.method1937(0);
            class229.method1597(arg0 ^ 0x78);
            for (int var178 = var176; var178 <= var174; var178++) {
                long var179 = ((long) var175 << 32) + ((long) var178);
                class285 var181 = (class285) class488.field7060.method3512(true, var179);
                class285 var182;
                if (var181 != null) {
                    var182 = new class285(var177, var181.field4385);
                    var181.method636((byte) 97);
                } else if (var178 == -1) {
                    var182 = new class285(var177, class65.method638(var175, 1668949296).field5262.field4385);
                } else {
                    var182 = new class285(var177, -1);
                }
                class488.field7060.method3516(255, var179, var182);
            }
            class153.field2383 = null;
            return true;
        } else if (class630.field8858 == class153.field2383) {
            boolean var183 = class624.field8742.method1987(-75) == 1;
            String var184 = class624.field8742.method1958(-3438);
            String var185 = var184;
            if (var183) {
                var185 = class624.field8742.method1958(-3438);
            }
            long var186 = class624.field8742.method1928(10185);
            long var188 = (long) class624.field8742.method1989((byte) -115);
            long var190 = (long) class624.field8742.method1952(arg0 + 22084);
            int var192 = class624.field8742.method1987(-97);
            long var193 = (var188 << 32) + var190;
            boolean var195 = false;
            int var196 = 0;
            while (true) {
                if (var196 >= 100) {
                    if (var192 <= 1) {
                        if (!(!class311.field4698 || class355.field5385) || class330.field4867) {
                            var195 = true;
                        } else if (class372.method2368(arg0 - 125, var185)) {
                            var195 = true;
                        }
                    }
                    break;
                }
                if (class550.field7845[var196] == var193) {
                    var195 = true;
                    break;
                }
                var196++;
            }
            if (!var195 && class178.field3052 == 0) {
                class550.field7845[class514.field7458] = var193;
                class514.field7458 = (class514.field7458 + 1) % 100;
                String var197 = class86.method757(class121.method950(32767, class624.field8742), -117);
                if (var192 == 2 || var192 == 3) {
                    class487.method2961("<img=1>" + var184, 9, -1, class693.method3870(var186, arg0 - 2), -85, 0, var197, var184, "<img=1>" + var185);
                } else if (var192 == 1) {
                    class487.method2961("<img=0>" + var184, 9, -1, class693.method3870(var186, -1), arg0 - 94, 0, var197, var184, "<img=0>" + var185);
                } else {
                    class487.method2961(var184, 9, -1, class693.method3870(var186, -1), -107, 0, var197, var184, var185);
                }
            }
            class153.field2383 = null;
            return true;
        } else if (class583.field8237 == class153.field2383) {
            class492.method2994(class398.field5913, (byte) 53);
            class153.field2383 = null;
            return true;
        } else if (class675.field9536 == class153.field2383) {
            class229.method1597(108);
            class625.method3533((byte) -107);
            class153.field2383 = null;
            return true;
        } else if (class189.field3181 == class153.field2383) {
            class459.field6655 = class624.field8742.method1947((byte) -117);
            class311.field4698 = class624.field8742.method1987(-20) == 1;
            class153.field2383 = null;
            return true;
        } else if (class186.field3116 == class153.field2383) {
            int var198 = class624.field8742.method1988(106);
            class229.method1597(118);
            class153.field2383 = null;
            class661.field9416 = var198;
            return true;
        } else if (class16.field158 == class153.field2383) {
            class492.method2994(class98.field1456, (byte) 110);
            class153.field2383 = null;
            return true;
        } else if (class31.field297 == class153.field2383) {
            int var199 = class624.field8742.method1987(-80);
            int var200 = class624.field8742.method1972(-128);
            int var201 = class624.field8742.method1934(arg0 - 3);
            class229.method1597(66);
            class520 var202 = (class520) class36.field340.method3512(true, (long) var201);
            if (var202 != null) {
                class197.method1479(var202.field7511 != var200, var202, false, (byte) 37);
            }
            class325.method2104(var200, var199, false, var201, (byte) -99);
            class153.field2383 = null;
            return true;
        } else if (class620.field8722 == class153.field2383) {
            int var203 = class624.field8742.method1988(arg0 + 123);
            int var204 = var203 >> 2;
            int var205 = var203 & 0x3;
            int var206 = class611.field8620[var204];
            int var207 = class624.field8742.method1937(0);
            int var208 = (var207 & 0x3D594CFF) >> 28;
            int var209 = var207 >> 14 & 0x3FFF;
            int var210 = var207 & 0x3FFF;
            int var211 = class624.field8742.method1961(true);
            if (var211 == 65535) {
                var211 = -1;
            }
            int var212 = var209 - class265.field4123;
            int var213 = var210 - class723.field10155;
            class308.method2039(var212, (byte) 88, var208, var213, var204, var206, var211, var205);
            class153.field2383 = null;
            return true;
        } else if (class204.field3434 == class153.field2383) {
            class153.field2383 = null;
            class755.field10522 = 1;
            class70.field1084 = class180.field3060;
            return true;
        } else if (class701.field9912 == class153.field2383) {
            int var214 = class624.field8742.method1972(-128);
            String var215 = class624.field8742.method1958(-3438);
            class229.method1597(116);
            class699.method3887(arg0 ^ 0x3, var214, var215);
            class153.field2383 = null;
            return true;
        } else if (class569.field8075 == class153.field2383) {
            int var216 = class624.field8742.method1934(-2);
            int var217 = class624.field8742.method1929(0);
            class229.method1597(124);
            class366.method2345(var216, var217, 127);
            class153.field2383 = null;
            return true;
        } else if (class33.field309 == class153.field2383) {
            int var218 = class624.field8742.method1937(arg0 ^ 0x1);
            String var219 = class624.field8742.method1958(-3438);
            class229.method1597(82);
            class325.method2103(var218, (byte) -64, var219);
            class153.field2383 = null;
            return true;
        } else if (class574.field8158 == class153.field2383) {
            int var220 = class624.field8742.method1987(-65);
            boolean var221 = (var220 & 0x1) == 1;
            String var222 = class624.field8742.method1958(-3438);
            String var223 = class624.field8742.method1958(arg0 ^ 0xFFFFF293);
            if (var223.equals("")) {
                var223 = var222;
            }
            String var224 = class624.field8742.method1958(-3438);
            String var225 = class624.field8742.method1958(-3438);
            if (var225.equals("")) {
                var225 = var224;
            }
            if (var221) {
                for (int var226 = 0; var226 < class270.field4155; var226++) {
                    if (class387.field5800[var226].equals(var225)) {
                        class379.field5697[var226] = var222;
                        class387.field5800[var226] = var223;
                        class603.field8536[var226] = var224;
                        class73.field1097[var226] = var225;
                        break;
                    }
                }
            } else {
                class379.field5697[class270.field4155] = var222;
                class387.field5800[class270.field4155] = var223;
                class603.field8536[class270.field4155] = var224;
                class73.field1097[class270.field4155] = var225;
                class92.field1371[class270.field4155] = class636.method3603(var220, 2) == 2;
                class270.field4155++;
            }
            class70.field1084 = class180.field3060;
            class153.field2383 = null;
            return true;
        } else if (class271.field4160 == class153.field2383) {
            String var227 = class624.field8742.method1958(-3438);
            String var228 = class86.method757(class121.method950(arg0 ^ 0x7FFE, class624.field8742), arg0 - 119);
            class157.method1177(var227, 0, var228, var227, var227, 1, 6);
            class153.field2383 = null;
            return true;
        } else if (class252.field4006 == class153.field2383) {
            int var229 = class624.field8742.method1945(0);
            byte var230 = class624.field8742.method1930(-268435456);
            class229.method1597(86);
            class564.method3273((byte) -109, var229, var230);
            class153.field2383 = null;
            return true;
        } else if (class310.field4680 == class153.field2383) {
            int var231 = class624.field8742.method1978(9946);
            class229.method1597(94);
            class526.method3126((byte) -82, class673.field9516, var231, 5, 0);
            class153.field2383 = null;
            return true;
        } else if (class559.field7932 == class153.field2383) {
            int var232 = class624.field8742.method1924(arg0 ^ 0x1753);
            int var233 = class624.field8742.method1937(0);
            int var234 = class624.field8742.method1987(-103);
            class747.field10443[var232] = var233;
            class498.field7226[var232] = var234;
            class226.field3629[var232] = 1;
            int var235 = class530.field7620[var232] - 1;
            for (int var236 = 0; var236 < var235; var236++) {
                if (var233 >= class599.field8484[var236]) {
                    class226.field3629[var232] = var236 + 2;
                }
            }
            class425.field6242[class636.method3603(class565.field8014++, 31)] = var232;
            class153.field2383 = null;
            return true;
        } else if (class735.field10357 == class153.field2383) {
            int var237 = class624.field8742.method1989((byte) -59);
            if (var237 == 65535) {
                var237 = -1;
            }
            int var238 = class624.field8742.method1987(arg0 ^ 0xFFFFFFFC);
            int var239 = class624.field8742.method1989((byte) -87);
            int var240 = class624.field8742.method1987(-71);
            class522.method3110(var239, 256, 50, var240, var237, var238, true);
            class153.field2383 = null;
            return true;
        } else if (class341.field4999 == class153.field2383) {
            if (class673.field9523 != -1) {
                class101.method834(false, 0, class673.field9523);
            }
            class153.field2383 = null;
            return true;
        } else if (class63.field983 == class153.field2383) {
            int var241 = class624.field8742.method1978(9946);
            int var242 = class624.field8742.method1961(true);
            class422.field6216.method2014(var241, 95, var242);
            class153.field2383 = null;
            return true;
        } else if (class702.field9938 == class153.field2383) {
            int var243 = class624.field8742.method1974(-1);
            int var244 = class624.field8742.method1961(true);
            class229.method1597(120);
            if (var244 == 65535) {
                var244 = -1;
            }
            class526.method3126((byte) -82, var244, var243, 1, -1);
            class153.field2383 = null;
            return true;
        } else if (class666.field9461 == class153.field2383) {
            boolean var245 = class624.field8742.method1987(-43) == 1;
            byte[] var246 = new byte[class495.field7166 - 1];
            class624.field8742.method1936(0, arg0 + 10045, class495.field7166 + -1, var246);
            class377.method2379(var245, (byte) 81, var246);
            class153.field2383 = null;
            return true;
        } else if (class5.field35 == class153.field2383) {
            class734.field10336 = class624.field8742.method1983(15575) << 3;
            class470.field6824 = class624.field8742.method1924(5970);
            class112.field1730 = class624.field8742.method1984(4) << 3;
            while (class495.field7166 > class624.field8742.field4534) {
                class430 var247 = class733.method4094((byte) -60)[class624.field8742.method1987(-47)];
                class492.method2994(var247, (byte) 115);
            }
            class153.field2383 = null;
            return true;
        } else if (class372.field5637 == class153.field2383) {
            class354.method2269(class706.field9962, arg0 ^ 0xFFFFFF89, class624.field8742, class495.field7166);
            class153.field2383 = null;
            return true;
        } else if (class526.field7573 == class153.field2383) {
            int var248 = class624.field8742.method1989((byte) -72);
            int var249 = class624.field8742.method1987(-22);
            boolean var250 = (var249 & 0x1) == 1;
            while (class624.field8742.field4534 < class495.field7166) {
                int var251 = class624.field8742.method1968((byte) 37);
                int var252 = class624.field8742.method1989((byte) -116);
                int var253 = 0;
                if (var252 != 0) {
                    var253 = class624.field8742.method1987(-101);
                    if (var253 == 255) {
                        var253 = class624.field8742.method1934(~arg0);
                    }
                }
                class666.method3736(var250, var251, var252 - 1, -79, var248, var253);
            }
            class308.field4654[class636.method3603(31, class651.field9249++)] = var248;
            class153.field2383 = null;
            return true;
        } else if (class732.field10291 == class153.field2383) {
            class203.method1501((byte) -125);
            class153.field2383 = null;
            return false;
        } else if (class463.field6736 == class153.field2383) {
            while (class495.field7166 > class624.field8742.field4534) {
                boolean var264 = class624.field8742.method1987(-8) == 1;
                String var265 = class624.field8742.method1958(arg0 ^ 0xFFFFF293);
                String var266 = class624.field8742.method1958(-3438);
                int var267 = class624.field8742.method1989((byte) -45);
                int var268 = class624.field8742.method1987(arg0 - 44);
                String var269 = "";
                boolean var270 = false;
                if (var267 > 0) {
                    var269 = class624.field8742.method1958(-3438);
                    var270 = class624.field8742.method1987(arg0 - 27) == 1;
                }
                for (int var271 = 0; var271 < class468.field6818; var271++) {
                    if (var264) {
                        if (var266.equals(class562.field7961[var271])) {
                            class562.field7961[var271] = var265;
                            class624.field8745[var271] = var266;
                            var265 = null;
                            break;
                        }
                    } else if (var265.equals(class562.field7961[var271])) {
                        if (class412.field6077[var271] != var267) {
                            boolean var272 = true;
                            for (class673 var273 = (class673) class696.field9870.method3272(-119); var273 != null; var273 = (class673) class696.field9870.method3274(false)) {
                                if (var273.field9521.equals(var265)) {
                                    if (var267 != 0 && var273.field9524 == 0) {
                                        var273.method3610(-25057);
                                        var272 = false;
                                    } else if (var267 == 0 && var273.field9524 != 0) {
                                        var273.method3610(-25057);
                                        var272 = false;
                                    }
                                }
                            }
                            if (var272) {
                                class696.field9870.method3266(new class673(var265, var267), true);
                            }
                            class412.field6077[var271] = var267;
                        }
                        class624.field8745[var271] = var266;
                        class492.field7133[var271] = var269;
                        class152.field2375[var271] = var268;
                        class271.field4168[var271] = var270;
                        var265 = null;
                        break;
                    }
                }
                if (var265 != null && class468.field6818 < 200) {
                    class562.field7961[class468.field6818] = var265;
                    class624.field8745[class468.field6818] = var266;
                    class412.field6077[class468.field6818] = var267;
                    class492.field7133[class468.field6818] = var269;
                    class152.field2375[class468.field6818] = var268;
                    class271.field4168[class468.field6818] = var270;
                    class468.field6818++;
                }
            }
            class755.field10522 = 2;
            class70.field1084 = class180.field3060;
            boolean var254 = false;
            int var255 = class468.field6818;
            while (var255 > 0) {
                boolean var256 = true;
                var255--;
                for (int var257 = 0; var257 < var255; var257++) {
                    if (class412.field6077[var257] != class229.field3703.field7542 && class412.field6077[var257 + 1] == class229.field3703.field7542 || class412.field6077[var257] == 0 && class412.field6077[var257 + 1] != 0) {
                        int var258 = class412.field6077[var257];
                        class412.field6077[var257] = class412.field6077[var257 + 1];
                        class412.field6077[var257 + 1] = var258;
                        String var259 = class492.field7133[var257];
                        class492.field7133[var257] = class492.field7133[var257 + 1];
                        class492.field7133[var257 + 1] = var259;
                        String var260 = class562.field7961[var257];
                        class562.field7961[var257] = class562.field7961[var257 + 1];
                        class562.field7961[var257 + 1] = var260;
                        String var261 = class624.field8745[var257];
                        class624.field8745[var257] = class624.field8745[var257 + 1];
                        class624.field8745[var257 + 1] = var261;
                        int var262 = class152.field2375[var257];
                        class152.field2375[var257] = class152.field2375[var257 + 1];
                        class152.field2375[var257 + 1] = var262;
                        boolean var263 = class271.field4168[var257];
                        class271.field4168[var257] = class271.field4168[var257 + 1];
                        class271.field4168[var257 + 1] = var263;
                        var256 = false;
                    }
                }
                if (var256) {
                    break;
                }
            }
            class153.field2383 = null;
            return true;
        } else if (class286.field4403 == class153.field2383) {
            if (class563.method3255(class521.field7529, (byte) -40)) {
                class152.field2373 = (int) ((float) class624.field8742.method1989((byte) -70) * 2.5F);
            } else {
                class152.field2373 = class624.field8742.method1989((byte) -53) * 30;
            }
            class104.field1543 = class180.field3060;
            class153.field2383 = null;
            return true;
        } else if (class724.field10169 == class153.field2383) {
            int var274 = class624.field8742.method1938(-1);
            int var275 = class624.field8742.method1937(arg0 ^ 0x1);
            class229.method1597(arg0 ^ 0x5C);
            class63.method616(var275, var274, arg0 - 90);
            class153.field2383 = null;
            return true;
        } else if (class501.field7281 == class153.field2383) {
            int var276 = class624.field8742.method1978(9946);
            int var277 = class624.field8742.method1924(5970);
            class229.method1597(90);
            class590.method3388(var277, var276, 0);
            class153.field2383 = null;
            return true;
        } else if (class153.field2383 == class116.field1797) {
            int var278 = class624.field8742.method1972(-128);
            int var279 = class624.field8742.method1934(-2);
            int var280 = class624.field8742.method1934(-2);
            class229.method1597(90);
            class526.method3126((byte) -82, var278, var279, 5, var280);
            class153.field2383 = null;
            return true;
        } else if (class56.field890 == class153.field2383) {
            boolean var281 = class624.field8742.method1987(arg0 ^ 0xFFFFFFC6) == 1;
            String var282 = class624.field8742.method1958(-3438);
            String var283 = var282;
            if (var281) {
                var283 = class624.field8742.method1958(-3438);
            }
            int var284 = class624.field8742.method1987(-70);
            int var285 = class624.field8742.method1989((byte) -49);
            boolean var286 = false;
            if (var284 <= 1 && class372.method2368(-124, var283)) {
                var286 = true;
            }
            if (!var286 && class178.field3052 == 0) {
                String var287 = class536.field7684.method1493(arg0, var285).method3708(class624.field8742, (byte) 105);
                if (var284 == 2) {
                    class487.method2961("<img=1>" + var282, 25, var285, null, -126, 0, var287, var282, "<img=1>" + var283);
                } else if (var284 == 1) {
                    class487.method2961("<img=0>" + var282, 25, var285, null, arg0 ^ 0xFFFFFF88, 0, var287, var282, "<img=0>" + var283);
                } else {
                    class487.method2961(var282, 25, var285, null, -103, 0, var287, var282, var283);
                }
            }
            class153.field2383 = null;
            return true;
        } else if (class617.field8703 == class153.field2383) {
            class279.field4273 = class180.field3060;
            if (class495.field7166 == 0) {
                class380.field5708 = 0;
                class206.field3454 = null;
                class153.field2383 = null;
                class594.field8345 = null;
                class435.field6353 = null;
                return true;
            }
            class435.field6353 = class624.field8742.method1958(-3438);
            boolean var288 = class624.field8742.method1987(-75) == 1;
            if (var288) {
                class624.field8742.method1958(-3438);
            }
            long var289 = class624.field8742.method1928(10185);
            class206.field3454 = class77.method694(var289, (byte) -95);
            class195.field3353 = class624.field8742.method1984(arg0 ^ 0x5);
            int var291 = class624.field8742.method1987(-31);
            if (var291 == 255) {
                class153.field2383 = null;
                return true;
            }
            class380.field5708 = var291;
            class664[] var292 = new class664[100];
            for (int var293 = 0; var293 < class380.field5708; var293++) {
                var292[var293] = new class664();
                var292[var293].field9437 = class624.field8742.method1958(-3438);
                boolean var299 = class624.field8742.method1987(arg0 - 124) == 1;
                if (var299) {
                    var292[var293].field9438 = class624.field8742.method1958(-3438);
                } else {
                    var292[var293].field9438 = var292[var293].field9437;
                }
                var292[var293].field9433 = class519.method3095(var292[var293].field9438, false);
                var292[var293].field9439 = class624.field8742.method1989((byte) -53);
                var292[var293].field9434 = class624.field8742.method1984(4);
                var292[var293].field9435 = class624.field8742.method1958(-3438);
                if (var292[var293].field9438.equals(class145.field2251.field8146)) {
                    class252.field4005 = var292[var293].field9434;
                }
            }
            boolean var294 = false;
            int var295 = class380.field5708;
            while (var295 > 0) {
                boolean var296 = true;
                var295--;
                for (int var297 = 0; var297 < var295; var297++) {
                    if (var292[var297].field9433.compareTo(var292[var297 + 1].field9433) > 0) {
                        class664 var298 = var292[var297];
                        var292[var297] = var292[var297 + 1];
                        var292[var297 + 1] = var298;
                        var296 = false;
                    }
                }
                if (var296) {
                    break;
                }
            }
            class594.field8345 = var292;
            class153.field2383 = null;
            return true;
        } else if (class595.field8365 == class153.field2383) {
            int var300 = class624.field8742.method1989((byte) -38);
            byte var301 = class624.field8742.method1983(15575);
            class422.field6216.method2016(var301, var300, (byte) 22);
            class153.field2383 = null;
            return true;
        } else if (class165.field2534 == class153.field2383) {
            int var302 = class624.field8742.method1961(true);
            int var303 = class624.field8742.method1945(0);
            class229.method1597(104);
            class476.method2901(-82, true, var302, var303);
            class153.field2383 = null;
            return true;
        } else if (class424.field6235 == class153.field2383) {
            class492.method2994(class53.field845, (byte) 98);
            class153.field2383 = null;
            return true;
        } else if (class679.field9570 == class153.field2383) {
            class492.method2994(class379.field5698, (byte) 119);
            class153.field2383 = null;
            return true;
        } else if (class268.field4140 == class153.field2383) {
            int var304 = class624.field8742.method1987(-31);
            if (class624.field8742.method1987(-112) == 0) {
                class550.field7839[var304] = new class97();
            } else {
                class624.field8742.field4534--;
                class550.field7839[var304] = new class97(class624.field8742);
            }
            class153.field2383 = null;
            class590.field8318 = class180.field3060;
            return true;
        } else if (class380.field5710 == class153.field2383) {
            int var305 = class624.field8742.method1989((byte) -85);
            int var306 = class624.field8742.method1924(5970);
            class229.method1597(arg0 + 125);
            if (var306 == 2) {
                class497.method3015((byte) -125);
            }
            class673.field9523 = var305;
            class195.method1471(false, var305);
            class173.method1363(false, (byte) 55);
            class464.method2847(class673.field9523);
            for (int var307 = 0; var307 < 100; var307++) {
                class6.field66[var307] = true;
            }
            class153.field2383 = null;
            return true;
        } else if (class604.field8540 == class153.field2383) {
            if (class196.field3382 != null) {
                class562.method3253(false, false, class654.field9289.field5421.method2689(3), -1, -1);
            }
            byte[] var308 = new byte[class495.field7166];
            class624.field8742.method3898(var308, class495.field7166, 0, (byte) -57);
            String var309 = class33.method168(true, var308, 0, class495.field7166);
            class405.method2498(arg0 + 2, class706.field9962, var309, true, class654.field9289.field5415.method2004(arg0 ^ 0x2) == 1);
            class153.field2383 = null;
            return true;
        } else if (class153.field2383 == class15.field153) {
            int[] var310 = new int[4];
            for (int var311 = 0; var311 < 4; var311++) {
                var310[var311] = class624.field8742.method1972(-128);
            }
            int var312 = class624.field8742.method1987(arg0 ^ 0xFFFFFFDB);
            int var313 = class624.field8742.method1989((byte) -33);
            class53 var314 = (class53) class332.field4881.method3512(true, (long) var313);
            if (var314 != null) {
                class570.method3306(var314.field847, var312, (byte) -124, var310);
            }
            class153.field2383 = null;
            return true;
        } else if (class662.field9422 == class153.field2383) {
            int var315 = class624.field8742.method1989((byte) -126);
            int var316 = class624.field8742.method1989((byte) -65);
            int var317 = class624.field8742.method1989((byte) -98);
            class229.method1597(arg0 + 111);
            if (class158.field2453[var315] != null) {
                for (int var318 = var316; var318 < var317; var318++) {
                    int var319 = class624.field8742.method1952(22085);
                    if (var318 < class158.field2453[var315].length && class158.field2453[var315][var318] != null) {
                        class158.field2453[var315][var318].field5271 = var319;
                    }
                }
            }
            class153.field2383 = null;
            return true;
        } else if (class620.field8719 == class153.field2383) {
            boolean var320 = class624.field8742.method1987(arg0 - 103) == 1;
            String var321 = class624.field8742.method1958(arg0 - 3439);
            String var322 = var321;
            if (var320) {
                var322 = class624.field8742.method1958(-3438);
            }
            long var323 = (long) class624.field8742.method1989((byte) -115);
            long var325 = (long) class624.field8742.method1952(22085);
            int var327 = class624.field8742.method1987(arg0 ^ 0xFFFFFFFD);
            int var328 = class624.field8742.method1989((byte) -79);
            long var329 = (var323 << 32) + var325;
            boolean var331 = false;
            int var332 = 0;
            while (true) {
                if (var332 >= 100) {
                    if (var327 <= 1 && class372.method2368(arg0 ^ 0xFFFFFF85, var322)) {
                        var331 = true;
                    }
                    break;
                }
                if (class550.field7845[var332] == var329) {
                    var331 = true;
                    break;
                }
                var332++;
            }
            if (!var331 && class178.field3052 == 0) {
                class550.field7845[class514.field7458] = var329;
                class514.field7458 = (class514.field7458 + 1) % 100;
                String var333 = class536.field7684.method1493(arg0, var328).method3708(class624.field8742, (byte) 105);
                if (var327 == 2) {
                    class487.method2961("<img=1>" + var321, 18, var328, null, -84, 0, var333, var321, "<img=1>" + var322);
                } else if (var327 == 1) {
                    class487.method2961("<img=0>" + var321, 18, var328, null, arg0 - 124, 0, var333, var321, "<img=0>" + var322);
                } else {
                    class487.method2961(var321, 18, var328, null, arg0 - 84, 0, var333, var321, var322);
                }
            }
            class153.field2383 = null;
            return true;
        } else if (class153.field2383 == class100.field1478) {
            int var334 = class624.field8742.method1945(arg0 - 1);
            int var335 = class624.field8742.method1924(5970);
            int var336 = class624.field8742.method1987(-51);
            int var337 = class624.field8742.method1972(arg0 - 129);
            int var338 = class624.field8742.method1924(5970);
            class229.method1597(93);
            class235.field3785[var338] = true;
            class707.field9972[var338] = var334;
            class601.field8509[var338] = var336;
            class617.field8699[var338] = var335;
            class68.field1066[var338] = var337;
            class153.field2383 = null;
            return true;
        } else if (class82.field1194 == class153.field2383) {
            class241.method1677(0);
            class153.field2383 = null;
            return true;
        } else if (class740.field10379 == class153.field2383) {
            class492.method2994(class229.field3701, (byte) 64);
            class153.field2383 = null;
            return true;
        } else if (class521.field7525 == class153.field2383) {
            String var339 = class624.field8742.method1958(-3438);
            boolean var340 = class624.field8742.method1987(arg0 - 73) == 1;
            String var341;
            if (var340) {
                var341 = class624.field8742.method1958(-3438);
            } else {
                var341 = var339;
            }
            int var342 = class624.field8742.method1989((byte) -102);
            byte var343 = class624.field8742.method1984(4);
            boolean var344 = false;
            if (var343 == -128) {
                var344 = true;
            }
            if (var344) {
                if (class380.field5708 == 0) {
                    class153.field2383 = null;
                    return true;
                }
                boolean var345 = false;
                int var346;
                for (var346 = 0; class380.field5708 > var346 && (!class594.field8345[var346].field9438.equals(var341) || class594.field8345[var346].field9439 != var342); var346++) {
                }
                if (class380.field5708 > var346) {
                    while (var346 < (class380.field5708 - 1)) {
                        class594.field8345[var346] = class594.field8345[var346 + 1];
                        var346++;
                    }
                    class380.field5708--;
                    class594.field8345[class380.field5708] = null;
                }
            } else {
                String var347 = class624.field8742.method1958(-3438);
                class664 var348 = new class664();
                var348.field9438 = var341;
                var348.field9437 = var339;
                var348.field9433 = class519.method3095(var348.field9438, false);
                var348.field9434 = var343;
                var348.field9439 = var342;
                var348.field9435 = var347;
                int var349;
                for (var349 = class380.field5708 - 1; var349 >= 0; var349--) {
                    int var350 = class594.field8345[var349].field9433.compareTo(var348.field9433);
                    if (var350 == 0) {
                        class594.field8345[var349].field9439 = var342;
                        class594.field8345[var349].field9434 = var343;
                        class594.field8345[var349].field9435 = var347;
                        if (var341.equals(class145.field2251.field8146)) {
                            class252.field4005 = var343;
                        }
                        class153.field2383 = null;
                        class279.field4273 = class180.field3060;
                        return true;
                    }
                    if (var350 < 0) {
                        break;
                    }
                }
                if (class380.field5708 >= class594.field8345.length) {
                    class153.field2383 = null;
                    return true;
                }
                for (int var351 = class380.field5708 - 1; var351 > var349; var351--) {
                    class594.field8345[var351 + 1] = class594.field8345[var351];
                }
                if (class380.field5708 == 0) {
                    class594.field8345 = new class664[100];
                }
                class594.field8345[var349 + 1] = var348;
                class380.field5708++;
                if (var341.equals(class145.field2251.field8146)) {
                    class252.field4005 = var343;
                }
            }
            class279.field4273 = class180.field3060;
            class153.field2383 = null;
            return true;
        } else if (class540.field7706 == class153.field2383) {
            int var352 = class624.field8742.method1987(-37);
            int var353 = class624.field8742.method1938(arg0 ^ 0xFFFFFFFE);
            class422.field6216.method2014(var352, arg0 ^ 0x61, var353);
            class153.field2383 = null;
            return true;
        } else if (class756.field10534 == class153.field2383) {
            class270.field4155 = class624.field8742.method1987(-113);
            for (int var354 = 0; var354 < class270.field4155; var354++) {
                class379.field5697[var354] = class624.field8742.method1958(-3438);
                class387.field5800[var354] = class624.field8742.method1958(-3438);
                if (class387.field5800[var354].equals("")) {
                    class387.field5800[var354] = class379.field5697[var354];
                }
                class603.field8536[var354] = class624.field8742.method1958(arg0 - 3439);
                class73.field1097[var354] = class624.field8742.method1958(-3438);
                if (class73.field1097[var354].equals("")) {
                    class73.field1097[var354] = class603.field8536[var354];
                }
                class92.field1371[var354] = false;
            }
            class70.field1084 = class180.field3060;
            class153.field2383 = null;
            return true;
        } else if (class210.field3496 == class153.field2383) {
            class229.method1597(78);
            class14.method73(87);
            class153.field2383 = null;
            return true;
        } else if (class348.field5126 == class153.field2383) {
            class153.field2383 = null;
            return false;
        } else if (class493.field7142 == class153.field2383) {
            boolean var355 = class624.field8742.method1987(-110) == 1;
            String var356 = class624.field8742.method1958(-3438);
            String var357 = var356;
            if (var355) {
                var357 = class624.field8742.method1958(-3438);
            }
            long var358 = (long) class624.field8742.method1989((byte) -46);
            long var360 = (long) class624.field8742.method1952(22085);
            int var362 = class624.field8742.method1987(arg0 - 74);
            long var363 = (var358 << 32) + var360;
            boolean var365 = false;
            int var366 = 0;
            while (true) {
                if (var366 >= 100) {
                    if (var362 <= 1) {
                        if (!(!class311.field4698 || class355.field5385) || class330.field4867) {
                            var365 = true;
                        } else if (class372.method2368(-126, var357)) {
                            var365 = true;
                        }
                    }
                    break;
                }
                if (class550.field7845[var366] == var363) {
                    var365 = true;
                    break;
                }
                var366++;
            }
            if (!var365 && class178.field3052 == 0) {
                class550.field7845[class514.field7458] = var363;
                class514.field7458 = (class514.field7458 + 1) % 100;
                String var367 = class86.method757(class121.method950(32767, class624.field8742), -91);
                if (var362 == 2) {
                    class487.method2961("<img=1>" + var356, 7, -1, null, arg0 ^ 0xFFFFFF9E, 0, var367, var356, "<img=1>" + var357);
                } else if (var362 == 1) {
                    class487.method2961("<img=0>" + var356, 7, -1, null, arg0 - 84, 0, var367, var356, "<img=0>" + var357);
                } else {
                    class487.method2961(var356, 3, -1, null, -93, 0, var367, var356, var357);
                }
            }
            class153.field2383 = null;
            return true;
        } else if (class328.field4836 == class153.field2383) {
            int var368 = class624.field8742.method1945(0);
            int var369 = class624.field8742.method1988(arg0 ^ 0x59);
            if (var369 == 255) {
                var368 = -1;
                var369 = -1;
            }
            class612.method3496(var368, var369, (byte) -93);
            class153.field2383 = null;
            return true;
        } else if (class707.field9970 == class153.field2383) {
            int var370 = class624.field8742.method1961(true);
            class229.method1597(126);
            class188.method1429(var370, 76);
            class153.field2383 = null;
            return true;
        } else if (class153.field2383 == class139.field2174) {
            class492.method2994(class100.field1475, (byte) 116);
            class153.field2383 = null;
            return true;
        } else if (class185.field3107 == class153.field2383) {
            int var371 = class624.field8742.method1937(arg0 - 1);
            class229.method1597(78);
            class520 var372 = (class520) class36.field340.method3512(true, (long) var371);
            if (var372 != null) {
                class197.method1479(true, var372, false, (byte) 37);
            }
            if (class139.field2176 != null) {
                class717.method3960(class139.field2176, (byte) 38);
                class139.field2176 = null;
            }
            class153.field2383 = null;
            return true;
        } else if (class37.field370 == class153.field2383) {
            int var373 = class624.field8742.method1974(-1);
            int var374 = class624.field8742.method1961(true);
            class229.method1597(100);
            class172.method1360(var373, false, var374);
            class153.field2383 = null;
            return true;
        } else if (class336.field4922 == class153.field2383) {
            class492.method2994(class515.field7468, (byte) 98);
            class153.field2383 = null;
            return true;
        } else if (class554.field7898 == class153.field2383) {
            int var375 = class624.field8742.method1978(9946);
            int var376 = class624.field8742.method1972(-128);
            if (var376 == 65535) {
                var376 = -1;
            }
            class229.method1597(71);
            class551.method3213(16, var376, var375);
            class153.field2383 = null;
            return true;
        } else if (class449.field6542 == class153.field2383) {
            int var377 = class624.field8742.method1937(0);
            int var378 = class624.field8742.method1974(arg0 - 2);
            class229.method1597(91);
            class520 var379 = (class520) class36.field340.method3512(true, (long) var378);
            class520 var380 = (class520) class36.field340.method3512(true, (long) var377);
            if (var380 != null) {
                class197.method1479(var379 == null || var379.field7511 != var380.field7511, var380, false, (byte) 37);
            }
            if (var379 != null) {
                var379.method636((byte) 97);
                class36.field340.method3516(255, (long) var377, var379);
            }
            class353 var381 = class65.method638(var378, arg0 ^ 0x637A2531);
            if (var381 != null) {
                class717.method3960(var381, (byte) 117);
            }
            class353 var382 = class65.method638(var377, 1668949296);
            if (var382 != null) {
                class717.method3960(var382, (byte) 38);
                class134.method1083(true, (byte) 113, var382);
            }
            if (class673.field9523 != -1) {
                class101.method834(false, 1, class673.field9523);
            }
            class153.field2383 = null;
            return true;
        } else if (class603.field8524 == class153.field2383) {
            boolean var383 = class624.field8742.method1987(-36) == 1;
            String var384 = class624.field8742.method1958(-3438);
            String var385 = var384;
            if (var383) {
                var385 = class624.field8742.method1958(arg0 ^ 0xFFFFF293);
            }
            int var386 = class624.field8742.method1987(-105);
            boolean var387 = false;
            if (var386 <= 1) {
                if (!(!class311.field4698 || class355.field5385) || class330.field4867) {
                    var387 = true;
                } else if (var386 <= 1 && class372.method2368(47, var385)) {
                    var387 = true;
                }
            }
            if (!var387 && class178.field3052 == 0) {
                String var388 = class86.method757(class121.method950(32767, class624.field8742), -87);
                if (var386 == 2) {
                    class487.method2961("<img=1>" + var384, 24, -1, null, -92, 0, var388, var384, "<img=1>" + var385);
                } else if (var386 == 1) {
                    class487.method2961("<img=0>" + var384, 24, -1, null, -124, 0, var388, var384, "<img=0>" + var385);
                } else {
                    class487.method2961(var384, 24, -1, null, -119, 0, var388, var384, var385);
                }
            }
            class153.field2383 = null;
            return true;
        } else if (class33.field312 == class153.field2383) {
            for (int var389 = 0; var389 < class279.field4271.length; var389++) {
                if (class279.field4271[var389] != null) {
                    class279.field4271[var389].field1591 = null;
                    class279.field4271[var389].field1695 = -1;
                }
            }
            for (int var390 = 0; var390 < class271.field4162; var390++) {
                class501.field7280[var390].field847.field1591 = null;
                class501.field7280[var390].field847.field1695 = -1;
            }
            class153.field2383 = null;
            return true;
        } else if (class223.field3616 == class153.field2383) {
            int var391 = class624.field8742.method1934(-2);
            int var392 = class624.field8742.method1972(-128);
            if (var392 == 65535) {
                var392 = -1;
            }
            class229.method1597(81);
            class526.method3126((byte) -82, var392, var391, 2, -1);
            class153.field2383 = null;
            return true;
        } else if (class439.field6397 == class153.field2383) {
            int var393 = class624.field8742.method1961(true);
            int var394 = class624.field8742.method1989((byte) -102);
            int var395 = class624.field8742.method1974(arg0 ^ 0xFFFFFFFE);
            class229.method1597(arg0 ^ 0x41);
            class711.method3938(var395, (var394 << 16) + var393, 0);
            class153.field2383 = null;
            return true;
        } else if (class367.field5585 == class153.field2383) {
            class734.field10336 = class624.field8742.method1930(-268435456) << 3;
            class470.field6824 = class624.field8742.method1945(0);
            class112.field1730 = class624.field8742.method1984(4) << 3;
            for (class477 var396 = (class477) class665.field9441.method3508((byte) -77); var396 != null; var396 = (class477) class665.field9441.method3520(arg0 ^ 0xFFFFFFFE)) {
                int var398 = (int) (var396.field1039 >> 28 & 0x3L);
                int var399 = (int) (var396.field1039 & 0x3FFFL);
                int var400 = var399 - class265.field4123;
                int var401 = (int) (var396.field1039 >> 14 & 0x3FFFL);
                int var402 = var401 - class723.field10155;
                if (class470.field6824 == var398 && var400 >= class112.field1730 && (class112.field1730 + 8) > var400 && var402 >= class734.field10336 && (class734.field10336 + 8) > var402) {
                    var396.method636((byte) 97);
                    if (var400 >= 0 && var402 >= 0 && class191.field3229 > var400 && class314.field4720 > var402) {
                        class7.method30(var400, var402, class470.field6824, (byte) -116);
                    }
                }
            }
            for (class248 var397 = (class248) class641.field9057.method3463((byte) -50); var397 != null; var397 = (class248) class641.field9057.method3469((byte) 107)) {
                if (var397.field3971 >= class112.field1730 && var397.field3971 < (class112.field1730 + 8) && var397.field3964 >= class734.field10336 && var397.field3964 < class734.field10336 + 8 && class470.field6824 == var397.field3965) {
                    var397.field3966 = 0;
                }
            }
            class153.field2383 = null;
            return true;
        } else if (class526.field7566 == class153.field2383) {
            int var403 = class624.field8742.method1974(-1);
            class229.method1597(arg0 ^ 0x66);
            class153.field2383 = null;
            if (var403 == -1) {
                class87.field1279 = -1;
                class275.field4202 = -1;
            } else {
                int var404 = var403 >> 14 & 0x3FFF;
                int var405 = var403 & 0x3FFF;
                int var406 = var404 - class265.field4123;
                int var407 = var405 - class723.field10155;
                if (var406 < 0) {
                    var406 = 0;
                } else if (class191.field3229 <= var406) {
                    var406 = class191.field3229;
                }
                class87.field1279 = (var406 << 9) + 256;
                if (var407 < 0) {
                    var407 = 0;
                } else if (var407 >= class314.field4720) {
                    var407 = class314.field4720;
                }
                class275.field4202 = (var407 << 9) + 256;
            }
            return true;
        } else {
            class333.method2135(null, "T1 - " + (class153.field2383 == null ? -1 : class153.field2383.method2143((byte) 24)) + "," + (class263.field4081 == null ? -1 : class263.field4081.method2143((byte) 24)) + "," + (class340.field4998 == null ? -1 : class340.field4998.method2143((byte) 24)) + " - " + class495.field7166, -77);
            class694.method3874(false, 0);
            return true;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V", line = 3266)
    public static void method3088(byte arg0) {
        field7485 = null;
        field7483 = null;
        int var1 = -65 % ((60 - arg0) / 59);
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V", line = 3282)
    public static final void method3089(int arg0) {
        if (class356.method2276(class521.field7529, (byte) 54) || class563.method3255(class521.field7529, (byte) -40)) {
            class104.method855((byte) -59, class329.field4857 >> 12, class497.field7212 >> 12, 5000);
        } else {
            int var1 = class145.field2251.field1702[0] >> 3;
            int var2 = class145.field2251.field1704[0] >> 3;
            if (var1 >= 0 && var1 < class191.field3229 >> 3 && var2 >= 0 && var2 < class314.field4720 >> 3) {
                class104.method855((byte) -59, var2, var1, 5000);
            } else {
                class104.method855((byte) -59, class314.field4720 >> 4, class191.field3229 >> 4, 0);
            }
        }
        field7476++;
        if (arg0 != -1) {
            method3088((byte) 105);
        }
        class143.method1107(0);
        class321.method2083((byte) -85);
        class759.method4222((byte) 35);
        class33.method170(85);
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 3320)
    public class516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field7482 = arg0;
        this.field7478 = arg3 * arg3;
        this.field7470 = arg1;
        this.field7477 = arg2;
        this.field7479 = this.field7470 + arg6;
        this.field7480 = this.field7477 + arg9;
        this.field7469 = this.field7482 + arg4;
        this.field7472 = this.field7482 + arg5;
        this.field7484 = this.field7470 + arg7;
        this.field7474 = this.field7477 + arg8;
    }
}
