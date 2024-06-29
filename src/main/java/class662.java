import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class662 {

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "Lmga;")
    private class666 field9406 = new class666(64);

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "Lmga;")
    public class666 field9411 = new class666(30);

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "Lbi;")
    public class449 field9404;

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "Lbi;")
    private class449 field9410;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public static int field9400;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    public static int field9401;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
    public static int field9402;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
    public static int field9403;

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
    public static int field9405;

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
    public static int field9407;

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
    public static int field9408;

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!pw", name = "m", descriptor = "I")
    public int field9412;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)I", line = 11)
    public static final int method3719(int arg0) {
        if (arg0 != -1) {
            return 34;
        }
        field9400++;
        if (class216.field3087 == null) {
            return class31.field498 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)Z", line = 26)
    public static final boolean method3720(int arg0) throws IOException {
        field9401++;
        if (class370.field4996 == null) {
            return false;
        }
        if (class403.field5396 == null) {
            if (class681.field9598) {
                if (!class370.field4996.method635(1, 119)) {
                    return false;
                }
                class370.field4996.method632(-64, 1, 0, class439.field6039.field4600);
                class681.field9598 = false;
                class396.field5263 = 0;
                class68.field1032++;
            }
            class439.field6039.field4619 = 0;
            if (class439.field6039.method1309((byte) 0)) {
                if (!class370.field4996.method635(1, arg0 + 89)) {
                    return false;
                }
                class370.field4996.method632(-119, 1, 1, class439.field6039.field4600);
                class396.field5263 = 0;
                class68.field1032++;
            }
            class681.field9598 = true;
            class298[] var1 = class322.method1954(arg0 + 26431);
            int var2 = class439.field6039.method1314(arg0 ^ 0xC8);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class439.field6039.field4619);
            }
            class403.field5396 = var1[var2];
            class269.field3754 = class403.field5396.field4189;
        }
        if (class269.field3754 == -1) {
            if (!class370.field4996.method635(1, arg0 ^ 0xFFFFFF0D)) {
                return false;
            }
            class370.field4996.method632(-22, 1, 0, class439.field6039.field4600);
            class68.field1032++;
            class396.field5263 = 0;
            class269.field3754 = class439.field6039.field4600[0] & 0xFF;
        }
        if (class269.field3754 == -2) {
            if (!class370.field4996.method635(2, -69)) {
                return false;
            }
            class370.field4996.method632(-119, 2, 0, class439.field6039.field4600);
            class439.field6039.field4619 = 0;
            class269.field3754 = class439.field6039.method2001((byte) -83);
            class68.field1032 += 2;
            class396.field5263 = 0;
        }
        if (class269.field3754 > 0) {
            if (!class370.field4996.method635(class269.field3754, 85)) {
                return false;
            }
            class439.field6039.field4619 = 0;
            class370.field4996.method632(-56, class269.field3754, 0, class439.field6039.field4600);
            class396.field5263 = 0;
            class68.field1032 += class269.field3754;
        }
        class17.field272 = class102.field1525;
        class102.field1525 = class147.field2353;
        class147.field2353 = class403.field5396;
        if (class449.field6127 == class403.field5396) {
            class524.method2931(class140.field2257, -67);
            class403.field5396 = null;
            return true;
        } else if (class663.field9418 == class403.field5396) {
            while (class439.field6039.field4619 < class269.field3754) {
                boolean var13 = class439.field6039.method2034(255) == 1;
                String var14 = class439.field6039.method2029((byte) -110);
                String var15 = class439.field6039.method2029((byte) -92);
                int var16 = class439.field6039.method2001((byte) -83);
                int var17 = class439.field6039.method2034(255);
                String var18 = "";
                boolean var19 = false;
                if (var16 > 0) {
                    var18 = class439.field6039.method2029((byte) -125);
                    var19 = class439.field6039.method2034(255) == 1;
                }
                for (int var20 = 0; var20 < class408.field5515; var20++) {
                    if (var13) {
                        if (var15.equals(class398.field5296[var20])) {
                            class398.field5296[var20] = var14;
                            class34.field529[var20] = var15;
                            var14 = null;
                            break;
                        }
                    } else if (var14.equals(class398.field5296[var20])) {
                        if (class358.field4848[var20] != var16) {
                            boolean var21 = true;
                            for (class266 var22 = (class266) class530.field7061.method328(arg0 + 190); var22 != null; var22 = (class266) class530.field7061.method331((byte) 124)) {
                                if (var22.field3695.equals(var14)) {
                                    if (var16 != 0 && var22.field3691 == 0) {
                                        var21 = false;
                                        var22.method2787(false);
                                    } else if (var16 == 0 && var22.field3691 != 0) {
                                        var22.method2787(false);
                                        var21 = false;
                                    }
                                }
                            }
                            if (var21) {
                                class530.field7061.method327(new class266(var14, var16), true);
                            }
                            class358.field4848[var20] = var16;
                        }
                        class34.field529[var20] = var15;
                        class561.field7436[var20] = var18;
                        class410.field5541[var20] = var17;
                        var14 = null;
                        class68.field1029[var20] = var19;
                        break;
                    }
                }
                if (var14 != null && class408.field5515 < 200) {
                    class398.field5296[class408.field5515] = var14;
                    class34.field529[class408.field5515] = var15;
                    class358.field4848[class408.field5515] = var16;
                    class561.field7436[class408.field5515] = var18;
                    class410.field5541[class408.field5515] = var17;
                    class68.field1029[class408.field5515] = var19;
                    class408.field5515++;
                }
            }
            class410.field5544 = class367.field4959;
            class59.field916 = 2;
            boolean var3 = false;
            int var4 = class408.field5515;
            while (var4 > 0) {
                boolean var5 = true;
                var4--;
                for (int var6 = 0; var6 < var4; var6++) {
                    if (class358.field4848[var6] != class214.field3059.field2955 && class358.field4848[var6 + 1] == class214.field3059.field2955 || class358.field4848[var6] == 0 && class358.field4848[var6 + 1] != 0) {
                        int var7 = class358.field4848[var6];
                        class358.field4848[var6] = class358.field4848[var6 + 1];
                        class358.field4848[var6 + 1] = var7;
                        String var8 = class561.field7436[var6];
                        class561.field7436[var6] = class561.field7436[var6 + 1];
                        class561.field7436[var6 + 1] = var8;
                        String var9 = class398.field5296[var6];
                        class398.field5296[var6] = class398.field5296[var6 + 1];
                        class398.field5296[var6 + 1] = var9;
                        String var10 = class34.field529[var6];
                        class34.field529[var6] = class34.field529[var6 + 1];
                        class34.field529[var6 + 1] = var10;
                        int var11 = class410.field5541[var6];
                        class410.field5541[var6] = class410.field5541[var6 + 1];
                        class410.field5541[var6 + 1] = var11;
                        boolean var12 = class68.field1029[var6];
                        class68.field1029[var6] = class68.field1029[var6 + 1];
                        var5 = false;
                        class68.field1029[var6 + 1] = var12;
                    }
                }
                if (var5) {
                    break;
                }
            }
            class403.field5396 = null;
            return true;
        } else if (class534.field7089 == class403.field5396) {
            int var23 = class439.field6039.method2034(255);
            int var24 = class439.field6039.method1996(false);
            class80.field1261.method1366(var24, (byte) -86, var23);
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class11.field204) {
            int var25 = class439.field6039.method2007((byte) 105);
            int var26 = class439.field6039.method1996(false);
            int var27 = class439.field6039.method2001((byte) -83);
            int var28 = class439.field6039.method2033(5051);
            int var29 = class439.field6039.method2013(arg0 ^ 0xB9);
            boolean var30 = (var28 & 0x80) != 0;
            if (var25 >> 30 != 0) {
                int var31 = var25 >> 28 & 0x3;
                int var32 = ((var25 & 0xFFFD3F6) >> 14) - class473.field6334;
                int var33 = (var25 & 0x3FFF) - class233.field3269;
                if (var32 >= 0 && var33 >= 0 && class34.field530 > var32 && class34.field531 > var33) {
                    int var34 = var32 * 512 + 256;
                    int var35 = var33 * 512 + 256;
                    int var36 = var31;
                    if (var31 < 3 && class69.method541(0, var33, var32)) {
                        var36 = var31 + 1;
                    }
                    class236 var37 = new class236(var26, 0, class642.field8626, var31, var36, var34, class315.method1878(var34, 2921, var31, var35) - var29, var35, var32, var32, var33, var33, var28 & 0x7);
                    class666.field9449.method3265(new class99(var37), (byte) -109);
                }
            } else if (var25 >> 29 != 0) {
                int var38 = var25 & 0xFFFF;
                class280 var39 = (class280) class616.field8143.method2918((long) var38, (byte) -127);
                if (var39 != null) {
                    if (var26 == 65535) {
                        var26 = -1;
                    }
                    class287 var40 = var39.field3983;
                    boolean var41 = true;
                    int var42 = var30 ? var40.field5631 : var40.field5602;
                    if (var26 != -1 && var42 != -1) {
                        if (var26 == var42) {
                            class580 var43 = class120.field2028.method3725(var26, (byte) 109);
                            if (var43.field7701 && var43.field7723 != -1) {
                                class616 var44 = class636.field8570.method231(var43.field7723, arg0 ^ 0x2D4E);
                                int var45 = var44.field8162;
                                if (var45 == 0 || var45 == 2) {
                                    var41 = false;
                                } else if (var45 == 1) {
                                    var41 = true;
                                }
                            }
                        } else {
                            class580 var46 = class120.field2028.method3725(var26, (byte) 80);
                            class580 var47 = class120.field2028.method3725(var42, (byte) 61);
                            if (var46.field7723 != -1 && var47.field7723 != -1) {
                                class616 var48 = class636.field8570.method231(var46.field7723, -11764);
                                class616 var49 = class636.field8570.method231(var47.field7723, -11764);
                                if (var49.field8155 > var48.field8155) {
                                    var41 = false;
                                }
                            }
                        }
                    }
                    if (var41) {
                        if (var30) {
                            var40.field5617 = class642.field8626 + var27;
                            var40.field5616 = 1;
                            var40.field5631 = var26;
                            var40.field5582 = var28 & 0x7;
                            var40.field5579 = var29;
                            var40.field5546 = 0;
                            var40.field5620 = 0;
                            if (var40.field5617 > class642.field8626) {
                                var40.field5546 = -1;
                            }
                            if (var40.field5631 != -1 && class642.field8626 == var40.field5617) {
                                int var52 = class120.field2028.method3725(var40.field5631, (byte) 87).field7723;
                                if (var52 != -1) {
                                    class616 var53 = class636.field8570.method231(var52, arg0 - 11574);
                                    if (var53 != null && var53.field8160 != null) {
                                        class373.method2199(var40.field8609, var40.field8620, (byte) 106, var40.field8612, 0, var53, false);
                                    }
                                }
                            }
                        } else {
                            var40.field5569 = var29;
                            var40.field5607 = 1;
                            var40.field5572 = 0;
                            var40.field5602 = var26;
                            var40.field5615 = class642.field8626 + var27;
                            var40.field5588 = var28 & 0x7;
                            var40.field5598 = 0;
                            if (var40.field5615 > class642.field8626) {
                                var40.field5598 = -1;
                            }
                            if (var40.field5602 != -1 && class642.field8626 == var40.field5615) {
                                int var50 = class120.field2028.method3725(var40.field5602, (byte) 76).field7723;
                                if (var50 != -1) {
                                    class616 var51 = class636.field8570.method231(var50, -11764);
                                    if (var51 != null && var51.field8160 != null) {
                                        class373.method2199(var40.field8609, var40.field8620, (byte) 114, var40.field8612, 0, var51, false);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (var25 >> 28 != 0) {
                int var54 = var25 & 0xFFFF;
                class403 var55;
                if (class416.field5693 == var54) {
                    var55 = class199.field2897;
                } else {
                    var55 = class572.field7601[var54];
                }
                if (var55 != null) {
                    if (var26 == 65535) {
                        var26 = -1;
                    }
                    boolean var56 = true;
                    int var57 = var30 ? var55.field5631 : var55.field5602;
                    if (var26 != -1 && var57 != -1) {
                        if (var26 == var57) {
                            class580 var62 = class120.field2028.method3725(var26, (byte) 112);
                            if (var62.field7701 && var62.field7723 != -1) {
                                class616 var63 = class636.field8570.method231(var62.field7723, arg0 - 11574);
                                int var64 = var63.field8162;
                                if (var64 == 0 || var64 == 2) {
                                    var56 = false;
                                } else if (var64 == 1) {
                                    var56 = true;
                                }
                            }
                        } else {
                            class580 var58 = class120.field2028.method3725(var26, (byte) 125);
                            class580 var59 = class120.field2028.method3725(var57, (byte) 118);
                            if (var58.field7723 != -1 && var59.field7723 != -1) {
                                class616 var60 = class636.field8570.method231(var58.field7723, -11764);
                                class616 var61 = class636.field8570.method231(var59.field7723, -11764);
                                if (var60.field8155 < var61.field8155) {
                                    var56 = false;
                                }
                            }
                        }
                    }
                    if (var56) {
                        if (var30) {
                            var55.field5631 = var26;
                            var55.field5582 = var28 & 0x7;
                            var55.field5579 = var29;
                            var55.field5617 = class642.field8626 + var27;
                            var55.field5546 = 0;
                            var55.field5616 = 1;
                            var55.field5620 = 0;
                            if (class642.field8626 < var55.field5617) {
                                var55.field5546 = -1;
                            }
                            if (var55.field5631 == 65535) {
                                var55.field5631 = -1;
                            }
                            if (var55.field5631 != -1 && class642.field8626 == var55.field5617) {
                                int var67 = class120.field2028.method3725(var55.field5631, (byte) 55).field7723;
                                if (var67 != -1) {
                                    class616 var68 = class636.field8570.method231(var67, -11764);
                                    if (var68 != null && var68.field8160 != null) {
                                        class373.method2199(var55.field8609, var55.field8620, (byte) 104, var55.field8612, 0, var68, class199.field2897 == var55);
                                    }
                                }
                            }
                        } else {
                            var55.field5615 = class642.field8626 + var27;
                            var55.field5602 = var26;
                            var55.field5588 = var28 & 0x7;
                            var55.field5569 = var29;
                            var55.field5572 = 0;
                            var55.field5598 = 0;
                            var55.field5607 = 1;
                            if (class642.field8626 < var55.field5615) {
                                var55.field5598 = -1;
                            }
                            if (var55.field5602 == 65535) {
                                var55.field5602 = -1;
                            }
                            if (var55.field5602 != -1 && class642.field8626 == var55.field5615) {
                                int var65 = class120.field2028.method3725(var55.field5602, (byte) 89).field7723;
                                if (var65 != -1) {
                                    class616 var66 = class636.field8570.method231(var65, arg0 ^ 0x2D4E);
                                    if (var66 != null && var66.field8160 != null) {
                                        class373.method2199(var55.field8609, var55.field8620, (byte) 124, var55.field8612, 0, var66, class199.field2897 == var55);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class333.field4561) {
            class524.method2931(class266.field3698, -93);
            class403.field5396 = null;
            return true;
        } else if (class476.field6344 == class403.field5396) {
            class708.field9924 = class599.method3299((byte) 125, class439.field6039.method2034(255));
            class403.field5396 = null;
            return true;
        } else if (class615.field8131 == class403.field5396) {
            int var69 = class439.field6039.method2001((byte) -83);
            int var70 = class439.field6039.method2034(arg0 + 445);
            boolean var71 = (var70 & 0x1) == 1;
            class316.method1885(var69, -17422, var71);
            int var72 = class439.field6039.method2001((byte) -83);
            for (int var73 = 0; var73 < var72; var73++) {
                int var74 = class439.field6039.method2013(120);
                int var75 = class439.field6039.method2033(5051);
                if (var75 == 255) {
                    var75 = class439.field6039.method1984((byte) 20);
                }
                class187.method1232(var69, var71, var75, var74 - 1, true, var73);
            }
            class369.field4984[class571.method3139(31, class11.field203++)] = var69;
            class403.field5396 = null;
            return true;
        } else if (class492.field6632 == class403.field5396) {
            class524.method2931(class252.field3466, arg0 ^ 0x8B);
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class124.field2081) {
            int var76 = class439.field6039.method2024((byte) 47);
            int var77 = class439.field6039.method2034(255);
            boolean var78 = (var77 & 0x1) == 1;
            class23.method211(var78, (byte) 71, var76);
            class369.field4984[class571.method3139(31, class11.field203++)] = var76;
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class356.field4833) {
            class524.method2931(class326.field4504, arg0 ^ 0x9D);
            class403.field5396 = null;
            return true;
        } else if (class602.field8001 == class403.field5396) {
            int var79 = class439.field6039.method1996(false);
            int var80 = class439.field6039.method2001((byte) -83);
            int var81 = class439.field6039.method2045(-98);
            if (class298.method1821(var79, -110)) {
                class513.method2854(var81, var80, 126);
            }
            class403.field5396 = null;
            return true;
        } else if (class87.field1324 == class403.field5396) {
            int var82 = class439.field6039.method2001((byte) -83);
            if (var82 == 65535) {
                var82 = -1;
            }
            int var83 = class439.field6039.method2013(-33);
            int var84 = class439.field6039.method1992(6);
            if (class298.method1821(var83, -105)) {
                class706.method3897(var84, 1, -1, var82, 1);
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class28.field455) {
            class55.method365((byte) -104, false);
            class403.field5396 = null;
            return false;
        } else if (class670.field9500 == class403.field5396) {
            int var85 = class439.field6039.method2045(-98);
            int var86 = class439.field6039.method2013(117);
            if (var86 == 65535) {
                var86 = -1;
            }
            int var87 = class439.field6039.method1996(false);
            int var88 = class439.field6039.method2045(-98);
            int var89 = class439.field6039.method2001((byte) -83);
            if (var89 == 65535) {
                var89 = -1;
            }
            if (class298.method1821(var87, -118)) {
                for (int var90 = var89; var90 <= var86; var90++) {
                    long var91 = ((long) var88 << 32) + ((long) var90);
                    class52 var93 = (class52) class170.field2615.method2918(var91, (byte) -58);
                    class52 var94;
                    if (var93 != null) {
                        var94 = new class52(var85, var93.field729);
                        var93.method2797(-110);
                    } else if (var90 == -1) {
                        var94 = new class52(var85, class153.method1078(65535, var88).field8287.field729);
                    } else {
                        var94 = new class52(var85, -1);
                    }
                    class170.field2615.method2911(var91, var94, (byte) -28);
                }
            }
            class403.field5396 = null;
            return true;
        } else if (class51.field712 == class403.field5396) {
            int var95 = class439.field6039.method2024((byte) 30);
            int var96 = class439.field6039.method2037(4);
            int var97 = class439.field6039.method1992(arg0 ^ 0xFFFFFF64);
            if (class298.method1821(var95, arg0 ^ 0xF1)) {
                class703.method3888(var96, var97, (byte) 107);
            }
            class403.field5396 = null;
            return true;
        } else if (class691.field9733 == class403.field5396) {
            int var98 = class439.field6039.method1984((byte) 20);
            int var99 = class439.field6039.method2013(arg0 ^ 0xFFFFFF3A);
            int var100 = class439.field6039.method2024((byte) 101);
            if (class298.method1821(var99, -81)) {
                class585.method3215(var98, -48, var100);
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class189.field2792) {
            int var101 = class439.field6039.method2046((byte) -127);
            int var102 = class439.field6039.method2013(-7);
            int var103 = class439.field6039.method1996(false);
            if (class298.method1821(var103, -102)) {
                if (var101 == 2) {
                    class529.method2952((byte) 100);
                }
                class251.field3463 = var102;
                class94.method740(var102, false);
                class476.method2670((byte) -39, false);
                class544.method3015(class251.field3463);
                for (int var104 = 0; var104 < 100; var104++) {
                    class511.field6834[var104] = true;
                }
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class143.field2315) {
            boolean var105 = class439.field6039.method2034(255) == 1;
            byte[] var106 = new byte[class269.field3754 - 1];
            class439.field6039.method1985((byte) 0, class269.field3754 - 1, var106, 0);
            class94.method742(var105, var106, false);
            class403.field5396 = null;
            return true;
        } else if (class6.field183 == class403.field5396) {
            int var107 = class439.field6039.method2001((byte) -83);
            int var108 = class439.field6039.method2013(116);
            int var109 = class439.field6039.method1996(false);
            int var110 = class439.field6039.method2001((byte) -83);
            int var111 = class439.field6039.method2007((byte) 118);
            if (class298.method1821(var108, -83)) {
                class136.method1012(var107, (byte) 119, var110, var109, var111);
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class138.field2237) {
            int var112 = class439.field6039.method2001((byte) -83);
            if (var112 == 65535) {
                var112 = -1;
            }
            int var113 = class439.field6039.method2034(255);
            int var114 = class439.field6039.method2001((byte) -83);
            int var115 = class439.field6039.method2034(255);
            class505.method2800(var114, var115, true, var112, true, var113);
            class403.field5396 = null;
            return true;
        } else if (class467.field6282 == class403.field5396) {
            class350.method2085((byte) -128, class439.field6039, class269.field3754);
            class403.field5396 = null;
            return true;
        } else if (class602.field7997 == class403.field5396) {
            int var116 = class439.field6039.method2001((byte) -83);
            int var117 = class439.field6039.method2007((byte) 101);
            int var118 = class439.field6039.method2024((byte) 95);
            if (class298.method1821(var118, -80)) {
                class174.method1178(var116, (byte) -108, var117);
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class301.field4202) {
            if (class216.field3087 != null) {
                class212.method1359(class344.field4718.field5439, true, -1, -1, false);
            }
            byte[] var119 = new byte[class269.field3754];
            class439.field6039.method1316((byte) -120, class269.field3754, var119, 0);
            String var120 = class190.method1244(var119, 0, class269.field3754, 73);
            class405.method2332(class688.field9669, var120, true, class571.field7587 == 1, (byte) 23);
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class119.field2014) {
            class175.field2692 = class439.field6039.method1993(-756647768);
            class569.field7560 = class439.field6039.method2034(arg0 + 445) == 1;
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class16.field258) {
            int var121 = class439.field6039.method2046((byte) 63);
            int var122 = class439.field6039.method2013(112);
            if (var122 == 65535) {
                var122 = -1;
            }
            int var123 = class439.field6039.method2028(true);
            String var124 = class439.field6039.method2029((byte) -96);
            if (var123 >= 1 && var123 <= 8) {
                if (var124.equalsIgnoreCase("null")) {
                    var124 = null;
                }
                class408.field5520[var123 - 1] = var124;
                class710.field9938[var123 - 1] = var122;
                class275.field3847[var123 - 1] = var121 == 0;
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class317.field4361) {
            byte var125 = class439.field6039.method2000(true);
            int var126 = class439.field6039.method1996(false);
            int var127 = class439.field6039.method2013(arg0 + 315);
            if (class298.method1821(var127, -104)) {
                class513.method2854(var125, var126, arg0 ^ 0xDB);
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class112.field1949) {
            int var128 = class439.field6039.method2001((byte) -83);
            int var129 = class439.field6039.method1984((byte) 20);
            int var130 = class439.field6039.method2013(106);
            int var131 = class439.field6039.method2001((byte) -83);
            int var132 = class439.field6039.method2013(102);
            if (class298.method1821(var131, -78)) {
                class706.method3897(var129, 7, var130, var128 << 16 | var132, 1);
            }
            class403.field5396 = null;
            return true;
        } else if (class619.field8216 == class403.field5396) {
            class524.method2931(class72.field1128, -86);
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class383.field5115) {
            int var133 = class439.field6039.method1984((byte) 20);
            int var134 = class439.field6039.method2024((byte) 90);
            int var135 = class439.field6039.method2013(-33);
            if (var135 == 65535) {
                var135 = -1;
            }
            if (class298.method1821(var134, -94)) {
                class119.method929(17559, var133, var135);
            }
            class403.field5396 = null;
            return true;
        } else if (class685.field9629 == class403.field5396) {
            class148.field2364 = class269.field3754 <= 2 ? class72.field1090.method546(class516.field6892, (byte) -35) : class439.field6039.method2029((byte) -118);
            class216.field3083 = class269.field3754 > 0 ? class439.field6039.method2001((byte) -83) : -1;
            if (class216.field3083 == 65535) {
                class216.field3083 = -1;
            }
            class403.field5396 = null;
            return true;
        } else if (client.field3875 == class403.field5396) {
            int var136 = class439.field6039.method2046((byte) -98);
            int var137 = class439.field6039.method2028(true);
            int var138 = class439.field6039.method2013(-107);
            if (var138 == 65535) {
                var138 = -1;
            }
            class425.method2431(var137, arg0 + 190, var138, var136);
            class403.field5396 = null;
            return true;
        } else if (class80.field1262 == class403.field5396) {
            int var139 = class439.field6039.method1990((byte) -86);
            int var140 = class439.field6039.method2001((byte) -83);
            if (var140 == 65535) {
                var140 = -1;
            }
            int var141 = class439.field6039.method2034(255);
            class2.method12(-26338, var141, var139, var140);
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class233.field3261) {
            class439.field6039.field4619 += 28;
            if (class439.field6039.method2043((byte) -89)) {
                class98.method758(class439.field6039.field4619 - 28, class439.field6039, 2);
            }
            class403.field5396 = null;
            return true;
        } else if (class615.field8123 == class403.field5396) {
            int var142 = class439.field6039.method2033(5051);
            int var143 = class439.field6039.method1984((byte) 20);
            int var144 = class439.field6039.method2013(118);
            if (class298.method1821(var144, -63)) {
                class242.method1485(var142, var143, (byte) -74);
            }
            class403.field5396 = null;
            return true;
        } else if (class503.field6721 == class403.field5396) {
            boolean var145 = class439.field6039.method2034(255) == 1;
            String var146 = class439.field6039.method2029((byte) -98);
            String var147 = var146;
            if (var145) {
                var147 = class439.field6039.method2029((byte) -82);
            }
            long var148 = (long) class439.field6039.method2001((byte) -83);
            long var150 = (long) class439.field6039.method2042((byte) 53);
            int var152 = class439.field6039.method2034(arg0 ^ 0xFFFFFFBD);
            int var153 = class439.field6039.method2001((byte) -83);
            long var154 = (var148 << 32) + var150;
            boolean var156 = false;
            int var157 = 0;
            while (true) {
                if (var157 >= 100) {
                    if (var152 <= 1 && class591.method3249(var147, 87)) {
                        var156 = true;
                    }
                    break;
                }
                if (class124.field2083[var157] == var154) {
                    var156 = true;
                    break;
                }
                var157++;
            }
            if (!var156 && class654.field8866 == 0) {
                class124.field2083[class431.field5904] = var154;
                class431.field5904 = (class431.field5904 + 1) % 100;
                String var158 = class29.field478.method3816(var153, true).method261((byte) 32, class439.field6039);
                if (var152 == 2) {
                    class173.method1171(var146, 18, "<img=1>" + var146, 0, var158, null, var153, "<img=1>" + var147, (byte) -71);
                } else if (var152 == 1) {
                    class173.method1171(var146, 18, "<img=0>" + var146, 0, var158, null, var153, "<img=0>" + var147, (byte) -112);
                } else {
                    class173.method1171(var146, 18, var146, 0, var158, null, var153, var147, (byte) -119);
                }
            }
            class403.field5396 = null;
            return true;
        } else if (class84.field1297 == class403.field5396) {
            class466.field6279 = class439.field6039.method2034(255);
            class301.field4203 = class367.field4959;
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class29.field482) {
            class524.method2931(class516.field6891, -45);
            class403.field5396 = null;
            return true;
        } else if (class669.field9497 == class403.field5396) {
            int var159 = class439.field6039.method1997(-129);
            int var160 = class439.field6039.method2045(-98);
            int var161 = class439.field6039.method2034(255);
            String var162 = "";
            String var163 = var162;
            if ((var161 & 0x1) != 0) {
                var162 = class439.field6039.method2029((byte) -60);
                if ((var161 & 0x2) == 0) {
                    var163 = var162;
                } else {
                    var163 = class439.field6039.method2029((byte) -111);
                }
            }
            String var164 = class439.field6039.method2029((byte) -87);
            if (var159 == 99) {
                class415.method2378(0, var164);
            } else if (var163.equals("") || !class591.method3249(var163, 119)) {
                class135.method1011(var162, var162, var164, var159, var163, var160, 111);
            } else {
                class403.field5396 = null;
                return true;
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class381.field5094) {
            class80.field1261.method1361(7360);
            class403.field5396 = null;
            class575.field7602 += 32;
            return true;
        } else if (class403.field5396 == class235.field3312) {
            class559.method3079(class439.field6039.method2029((byte) -108), (byte) 119);
            class403.field5396 = null;
            return true;
        } else if (class488.field6598 == class403.field5396) {
            class524.method2931(class307.field4237, arg0 ^ 0xF9);
            class403.field5396 = null;
            return true;
        } else if (class526.field7005 == class403.field5396) {
            class524.method2931(class326.field4503, arg0 ^ 0xA5);
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class141.field2259) {
            boolean var165 = class439.field6039.method2034(255) == 1;
            String var166 = class439.field6039.method2029((byte) -81);
            String var167 = var166;
            if (var165) {
                var167 = class439.field6039.method2029((byte) -87);
            }
            int var168 = class439.field6039.method2034(255);
            boolean var169 = false;
            if (var168 <= 1) {
                if (!(!class569.field7560 || class674.field9538) || class261.field3587) {
                    var169 = true;
                } else if (var168 <= 1 && class591.method3249(var167, 120)) {
                    var169 = true;
                }
            }
            if (!var169 && class654.field8866 == 0) {
                String var170 = class115.method917((byte) -124, class625.method3428(124, class439.field6039));
                if (var168 == 2) {
                    class173.method1171(var166, 24, "<img=1>" + var166, 0, var170, null, -1, "<img=1>" + var167, (byte) -62);
                } else if (var168 == 1) {
                    class173.method1171(var166, 24, "<img=0>" + var166, 0, var170, null, -1, "<img=0>" + var167, (byte) -44);
                } else {
                    class173.method1171(var166, 24, var166, 0, var170, null, -1, var167, (byte) -37);
                }
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class110.field1621) {
            class504.field6729 = class439.field6039.method2034(arg0 + 445);
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class243.field3396) {
            class55.method365((byte) -98, class280.field3984);
            class403.field5396 = null;
            return false;
        } else if (class504.field6725 == class403.field5396) {
            int var171 = class439.field6039.method2033(5051);
            int var172 = var171 >> 2;
            int var173 = var171 & 0x3;
            int var174 = class216.field3088[var172];
            int var175 = class439.field6039.method2024((byte) 94);
            if (var175 == 65535) {
                var175 = -1;
            }
            int var176 = class439.field6039.method2007((byte) 115);
            int var177 = (var176 & 0x3833023A) >> 28;
            int var178 = var176 >> 14 & 0x3FFF;
            int var179 = var178 - class473.field6334;
            int var180 = var176 & 0x3FFF;
            int var181 = var180 - class233.field3269;
            class378.method2218(var172, var174, var175, 125, var173, var181, var177, var179);
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class209.field2992) {
            int var182 = class439.field6039.method2045(-98);
            int var183 = class439.field6039.method2033(5051);
            int var184 = class439.field6039.method2034(arg0 ^ 0xFFFFFFBD);
            class368.field4978[var184] = var182;
            class548.field7316[var184] = var183;
            class263.field3652[var184] = 1;
            int var185 = class233.field3266[var184] - 1;
            for (int var186 = 0; var186 < var185; var186++) {
                if (class26.field435[var186] <= var182) {
                    class263.field3652[var184] = var186 + 2;
                }
            }
            class436.field5974[class571.method3139(class256.field3545++, 31)] = var184;
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class29.field475) {
            String var187 = class439.field6039.method2029((byte) -99);
            boolean var188 = class439.field6039.method2034(255) == 1;
            String var189;
            if (var188) {
                var189 = class439.field6039.method2029((byte) -120);
            } else {
                var189 = var187;
            }
            int var190 = class439.field6039.method2001((byte) -83);
            byte var191 = class439.field6039.method2040(-101);
            boolean var192 = false;
            if (var191 == -128) {
                var192 = true;
            }
            if (var192) {
                if (class156.field2457 == 0) {
                    class403.field5396 = null;
                    return true;
                }
                boolean var198 = false;
                int var199;
                for (var199 = 0; var199 < class156.field2457 && (!class636.field8571[var199].field3128.equals(var189) || class636.field8571[var199].field3124 != var190); var199++) {
                }
                if (class156.field2457 > var199) {
                    while ((class156.field2457 - 1) > var199) {
                        class636.field8571[var199] = class636.field8571[var199 + 1];
                        var199++;
                    }
                    class156.field2457--;
                    class636.field8571[class156.field2457] = null;
                }
            } else {
                String var193 = class439.field6039.method2029((byte) -90);
                class221 var194 = new class221();
                var194.field3129 = var187;
                var194.field3128 = var189;
                var194.field3123 = class166.method1138(var194.field3128, 3317);
                var194.field3130 = var193;
                var194.field3127 = var191;
                var194.field3124 = var190;
                int var195;
                for (var195 = class156.field2457 - 1; var195 >= 0; var195--) {
                    int var196 = class636.field8571[var195].field3123.compareTo(var194.field3123);
                    if (var196 == 0) {
                        class636.field8571[var195].field3124 = var190;
                        class636.field8571[var195].field3127 = var191;
                        class636.field8571[var195].field3130 = var193;
                        if (var189.equals(class199.field2897.field5398)) {
                            class355.field4824 = var191;
                        }
                        class711.field9946 = class367.field4959;
                        class403.field5396 = null;
                        return true;
                    }
                    if (var196 < 0) {
                        break;
                    }
                }
                if (class636.field8571.length <= class156.field2457) {
                    class403.field5396 = null;
                    return true;
                }
                for (int var197 = class156.field2457 - 1; var197 > var195; var197--) {
                    class636.field8571[var197 + 1] = class636.field8571[var197];
                }
                if (class156.field2457 == 0) {
                    class636.field8571 = new class221[100];
                }
                class636.field8571[var195 + 1] = var194;
                class156.field2457++;
                if (var189.equals(class199.field2897.field5398)) {
                    class355.field4824 = var191;
                }
            }
            class403.field5396 = null;
            class711.field9946 = class367.field4959;
            return true;
        } else if (class403.field5396 == class179.field2742) {
            class18.field311 = class439.field6039.method2034(255);
            for (int var200 = 0; var200 < class18.field311; var200++) {
                class3.field38[var200] = class439.field6039.method2029((byte) -95);
                class236.field3318[var200] = class439.field6039.method2029((byte) -67);
                if (class236.field3318[var200].equals("")) {
                    class236.field3318[var200] = class3.field38[var200];
                }
                class260.field3574[var200] = class439.field6039.method2029((byte) -92);
                class25.field426[var200] = class439.field6039.method2029((byte) -84);
                if (class25.field426[var200].equals("")) {
                    class25.field426[var200] = class260.field3574[var200];
                }
                class135.field2196[var200] = false;
            }
            class403.field5396 = null;
            class410.field5544 = class367.field4959;
            return true;
        } else if (class44.field632 == class403.field5396) {
            int var201 = class439.field6039.method2046((byte) -120);
            int[] var202 = new int[4];
            for (int var203 = 0; var203 < 4; var203++) {
                var202[var203] = class439.field6039.method2001((byte) -83);
            }
            int var204 = class439.field6039.method2001((byte) -83);
            class280 var205 = (class280) class616.field8143.method2918((long) var204, (byte) -127);
            if (var205 != null) {
                class24.method221(arg0 + 189, var201, var205.field3983, var202);
            }
            class403.field5396 = null;
            return true;
        } else if (class664.field9425 == class403.field5396) {
            class169.method1153((byte) 101, false);
            class403.field5396 = null;
            return true;
        } else if (class443.field6075 == class403.field5396) {
            int var206 = class439.field6039.method2028(true);
            int var207 = class439.field6039.method1996(false);
            if (class298.method1821(var207, -86)) {
                class458.field6220 = var206;
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class18.field308) {
            class524.method2931(class418.field5722, -49);
            class403.field5396 = null;
            return true;
        } else if (class415.field5677 == class403.field5396) {
            int var208 = class439.field6039.method2001((byte) -83);
            int var209 = class439.field6039.method2045(-98);
            if (class298.method1821(var208, -85)) {
                class140 var210 = (class140) class264.field3667.method2918((long) var209, (byte) -127);
                if (var210 != null) {
                    class345.method2074(arg0 + 191, var210, false, true);
                }
                if (class436.field5966 != null) {
                    class463.method2624(false, class436.field5966);
                    class436.field5966 = null;
                }
            }
            class403.field5396 = null;
            return true;
        } else if (class615.field8133 == class403.field5396) {
            byte var211 = class439.field6039.method2023((byte) 46);
            int var212 = class439.field6039.method1996(false);
            class80.field1261.method1364(arg0 ^ 0xFA, var212, var211);
            class403.field5396 = null;
            return true;
        } else if (class445.field6087 == class403.field5396) {
            class417.field5712 = class439.field6039.method2028(true);
            class139.field2249 = class439.field6039.method2044(81) << 3;
            class618.field8194 = class439.field6039.method2040(arg0 + 149) << 3;
            for (class354 var213 = (class354) class262.field3643.method2915(122); var213 != null; var213 = (class354) class262.field3643.method2912((byte) 108)) {
                int var215 = (int) (var213.field6724 >> 28 & 0x3L);
                int var216 = (int) (var213.field6724 & 0x3FFFL);
                int var217 = var216 - class473.field6334;
                int var218 = (int) (var213.field6724 >> 14 & 0x3FFFL);
                int var219 = var218 - class233.field3269;
                if (class417.field5712 == var215 && var217 >= class618.field8194 && var217 < class618.field8194 + 8 && var219 >= class139.field2249 && var219 < (class139.field2249 + 8)) {
                    var213.method2797(84);
                    if (var217 >= 0 && var219 >= 0 && var217 < class34.field530 && var219 < class34.field531) {
                        class454.method2593(var217, var219, 85, class417.field5712);
                    }
                }
            }
            for (class135 var214 = (class135) class94.field1444.method3257(arg0 + 142); var214 != null; var214 = (class135) class94.field1444.method3263((byte) -119)) {
                if (var214.field2195 >= class618.field8194 && var214.field2195 < class618.field8194 + 8 && class139.field2249 <= var214.field2198 && (class139.field2249 + 8) > var214.field2198 && class417.field5712 == var214.field2194) {
                    var214.field2205 = 0;
                }
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class205.field2963) {
            int var220 = class439.field6039.method2001((byte) -83);
            int var221 = class439.field6039.method2034(arg0 ^ 0xFFFFFFBD);
            int var222 = class439.field6039.method2034(255);
            int var223 = class439.field6039.method2001((byte) -83) << 2;
            int var224 = class439.field6039.method2034(arg0 + 445);
            int var225 = class439.field6039.method2034(255);
            if (class298.method1821(var220, -127)) {
                class97.method752(var222, var221, var225, true, var223, var224);
            }
            class403.field5396 = null;
            return true;
        } else if (class490.field6608 == class403.field5396) {
            if (client.method1691(false, class32.field525)) {
                class108.field1587 = (int) ((float) class439.field6039.method2001((byte) -83) * 2.5F);
            } else {
                class108.field1587 = class439.field6039.method2001((byte) -83) * 30;
            }
            class403.field5396 = null;
            class301.field4203 = class367.field4959;
            return true;
        } else if (arg0 != -190) {
            return true;
        } else if (class547.field7296 == class403.field5396) {
            class618.field8194 = class439.field6039.method2000(true) << 3;
            class139.field2249 = class439.field6039.method2044(arg0 ^ 0x81) << 3;
            class417.field5712 = class439.field6039.method2028(true);
            while (class269.field3754 > class439.field6039.field4619) {
                class71 var226 = class99.method762(false)[class439.field6039.method2034(255)];
                class524.method2931(var226, -88);
            }
            class403.field5396 = null;
            return true;
        } else if (class61.field921 == class403.field5396) {
            int var227 = class439.field6039.method1996(false);
            if (var227 == 65535) {
                var227 = -1;
            }
            int var228 = class439.field6039.method2013(97);
            if (var228 == 65535) {
                var228 = -1;
            }
            int var229 = class439.field6039.method2001((byte) -83);
            int var230 = class439.field6039.method2045(-98);
            int var231 = class439.field6039.method2013(arg0 + 65);
            if (class298.method1821(var229, arg0 + 89)) {
                for (int var232 = var227; var232 <= var228; var232++) {
                    long var233 = ((long) var230 << 32) + (long) var232;
                    class52 var235 = (class52) class170.field2615.method2918(var233, (byte) -25);
                    class52 var236;
                    if (var235 != null) {
                        var236 = new class52(var235.field725, var231);
                        var235.method2797(-116);
                    } else if (var232 == -1) {
                        var236 = new class52(class153.method1078(65535, var230).field8287.field725, var231);
                    } else {
                        var236 = new class52(0, var231);
                    }
                    class170.field2615.method2911(var233, var236, (byte) -28);
                }
            }
            class403.field5396 = null;
            return true;
        } else if (class627.field8459 == class403.field5396) {
            int var237 = class439.field6039.method1996(false);
            int var238 = class439.field6039.method2007((byte) 90);
            int var239 = class439.field6039.method2024((byte) 25);
            if (var239 == 65535) {
                var239 = -1;
            }
            if (class298.method1821(var237, -73)) {
                class706.method3897(var238, 2, -1, var239, 1);
            }
            class403.field5396 = null;
            return true;
        } else if (class450.field6175 == class403.field5396) {
            int var240 = class439.field6039.method2001((byte) -83);
            int var241 = class439.field6039.method1984((byte) 20);
            class80.field1261.method1364(-110, var240, var241);
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class164.field2560) {
            class524.method2931(class308.field4241, arg0 ^ 0xF8);
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class313.field4303) {
            int var242 = class439.field6039.method2034(255);
            boolean var243 = (var242 & 0x1) == 1;
            String var244 = class439.field6039.method2029((byte) -101);
            String var245 = class439.field6039.method2029((byte) -65);
            if (var245.equals("")) {
                var245 = var244;
            }
            String var246 = class439.field6039.method2029((byte) -95);
            String var247 = class439.field6039.method2029((byte) -89);
            if (var247.equals("")) {
                var247 = var246;
            }
            if (var243) {
                for (int var248 = 0; var248 < class18.field311; var248++) {
                    if (class236.field3318[var248].equals(var247)) {
                        class3.field38[var248] = var244;
                        class236.field3318[var248] = var245;
                        class260.field3574[var248] = var246;
                        class25.field426[var248] = var247;
                        break;
                    }
                }
            } else {
                class3.field38[class18.field311] = var244;
                class236.field3318[class18.field311] = var245;
                class260.field3574[class18.field311] = var246;
                class25.field426[class18.field311] = var247;
                class135.field2196[class18.field311] = class571.method3139(2, var242) == 2;
                class18.field311++;
            }
            class410.field5544 = class367.field4959;
            class403.field5396 = null;
            return true;
        } else if (class561.field7442 == class403.field5396) {
            int var249 = class439.field6039.method1996(false);
            int var250 = class439.field6039.method2007((byte) 125);
            int var251 = class439.field6039.method2033(5051);
            int var252 = class439.field6039.method2001((byte) -83);
            if (class298.method1821(var252, -70)) {
                class140 var253 = (class140) class264.field3667.method2918((long) var250, (byte) -127);
                if (var253 != null) {
                    class345.method2074(1, var253, false, var253.field2256 != var249);
                }
                class420.method2411(var249, var250, 0, false, var251);
            }
            class403.field5396 = null;
            return true;
        } else if (class62.field944 == class403.field5396) {
            int var254 = class439.field6039.method2034(255);
            if (class439.field6039.method2034(255) == 0) {
                class656.field8946[var254] = new class154();
            } else {
                class439.field6039.field4619--;
                class656.field8946[var254] = new class154(class439.field6039);
            }
            class656.field8940 = class367.field4959;
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class371.field5009) {
            String var255 = class439.field6039.method2029((byte) -113);
            String var256 = class115.method917((byte) -124, class625.method3428(127, class439.field6039));
            class135.method1011(var255, var255, var256, 6, var255, 0, -127);
            class403.field5396 = null;
            return true;
        } else if (class508.field6777 == class403.field5396) {
            int var257 = class439.field6039.method2034(arg0 ^ 0xFFFFFFBD);
            int var258 = var257 >> 5;
            int var259 = var257 & 0x1F;
            if (var259 == 0) {
                class129.field2154[var258] = null;
                class403.field5396 = null;
                return true;
            }
            class149 var260 = new class149();
            var260.field2385 = var259;
            var260.field2389 = class439.field6039.method2034(255);
            if (var260.field2389 >= 0 && var260.field2389 < class179.field2737.length) {
                if (var260.field2385 == 1 || var260.field2385 == 10) {
                    var260.field2383 = class439.field6039.method2001((byte) -83);
                    class439.field6039.field4619 += 6;
                } else if (var260.field2385 >= 2 && var260.field2385 <= 6) {
                    if (var260.field2385 == 2) {
                        var260.field2390 = 256;
                        var260.field2377 = 256;
                    }
                    if (var260.field2385 == 3) {
                        var260.field2377 = 0;
                        var260.field2390 = 256;
                    }
                    if (var260.field2385 == 4) {
                        var260.field2390 = 256;
                        var260.field2377 = 512;
                    }
                    if (var260.field2385 == 5) {
                        var260.field2390 = 0;
                        var260.field2377 = 256;
                    }
                    if (var260.field2385 == 6) {
                        var260.field2377 = 256;
                        var260.field2390 = 512;
                    }
                    var260.field2385 = 2;
                    var260.field2380 = class439.field6039.method2034(255);
                    var260.field2377 += class439.field6039.method2001((byte) -83) - class473.field6334 << 9;
                    var260.field2390 += class439.field6039.method2001((byte) -83) - class233.field3269 << 9;
                    var260.field2375 = class439.field6039.method2034(255) << 2;
                    var260.field2376 = class439.field6039.method2001((byte) -83);
                }
                var260.field2378 = class439.field6039.method2001((byte) -83);
                if (var260.field2378 == 65535) {
                    var260.field2378 = -1;
                }
                class129.field2154[var258] = var260;
            }
            class403.field5396 = null;
            return true;
        } else if (class548.field7310 == class403.field5396) {
            int var261 = class439.field6039.method2001((byte) -83);
            if (var261 == 65535) {
                var261 = -1;
            }
            int var262 = class439.field6039.method2034(255);
            int var263 = class439.field6039.method2001((byte) -83);
            int var264 = class439.field6039.method2034(255);
            class506.method2810(var262, -51, var264, var263, var261);
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class208.field2983) {
            int var265 = class439.field6039.method2007((byte) 91);
            int var266 = class439.field6039.method2024((byte) 69);
            class80.field1261.method1366(var266, (byte) -86, var265);
            class403.field5396 = null;
            return true;
        } else if (class683.field9611 == class403.field5396) {
            int var267 = class439.field6039.method2001((byte) -83);
            class403 var268;
            if (class416.field5693 == var267) {
                var268 = class199.field2897;
            } else {
                var268 = class572.field7601[var267];
            }
            if (var268 == null) {
                class403.field5396 = null;
                return true;
            }
            int var269 = class439.field6039.method2001((byte) -83);
            int var270 = class439.field6039.method2034(255);
            boolean var271 = (var269 & 0x8000) != 0;
            if (var268.field5398 != null && var268.field5362 != null) {
                boolean var272 = false;
                if (var270 <= 1) {
                    if (!var271 && !(!class569.field7560 || class674.field9538) || class261.field3587) {
                        var272 = true;
                    } else if (class591.method3249(var268.field5398, arg0 + 281)) {
                        var272 = true;
                    }
                }
                if (!var272 && class654.field8866 == 0) {
                    int var273 = -1;
                    String var275;
                    if (var271) {
                        var269 &= 0x7FFF;
                        class84 var274 = class200.method1297(0, class439.field6039);
                        var273 = var274.field1295;
                        var275 = var274.field1290.method261((byte) 32, class439.field6039);
                    } else {
                        var275 = class115.method917((byte) -124, class625.method3428(arg0 ^ 0xFFFFFF3C, class439.field6039));
                    }
                    var268.field5587 = var275.trim();
                    var268.field5599 = 150;
                    var268.field5597 = var269 >> 8;
                    var268.field5558 = var269 & 0xFF;
                    int var276;
                    if (var270 == 1 || var270 == 2) {
                        var276 = var271 ? 17 : 1;
                    } else {
                        var276 = var271 ? 17 : 2;
                    }
                    if (var270 == 2) {
                        class173.method1171(var268.field5378, var276, "<img=1>" + var268.method2316(true, (byte) 116), 0, var275, null, var273, "<img=1>" + var268.method2311(false, 31596), (byte) -82);
                    } else if (var270 == 1) {
                        class173.method1171(var268.field5378, var276, "<img=0>" + var268.method2316(true, (byte) 117), 0, var275, null, var273, "<img=0>" + var268.method2311(false, 31596), (byte) -79);
                    } else {
                        class173.method1171(var268.field5378, var276, var268.method2316(true, (byte) 127), 0, var275, null, var273, var268.method2311(false, 31596), (byte) -123);
                    }
                }
            }
            class403.field5396 = null;
            return true;
        } else if (class599.field7948 == class403.field5396) {
            int var277 = class439.field6039.method1996(false);
            int var278 = class439.field6039.method1984((byte) 20);
            if (class298.method1821(var277, -106)) {
                class706.method3897(var278, 3, -1, -1, arg0 ^ 0xFFFFFF43);
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class244.field3414) {
            int var279 = class439.field6039.method1984((byte) 20);
            int var280 = class439.field6039.method2013(-47);
            if (class298.method1821(var280, -118)) {
                class706.method3897(var279, 5, 0, class416.field5693, 1);
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class340.field4696) {
            int var281 = class439.field6039.method2001((byte) -83);
            int var282 = class439.field6039.method2001((byte) -83);
            int var283 = class439.field6039.method2001((byte) -83);
            int var284 = class439.field6039.method2001((byte) -83);
            if (class298.method1821(var281, -82) && class601.field7977[var282] != null) {
                for (int var285 = var283; var285 < var284; var285++) {
                    int var286 = class439.field6039.method2042((byte) 53);
                    if (class601.field7977[var282].length > var285 && class601.field7977[var282][var285] != null) {
                        class601.field7977[var282][var285].field8410 = var286;
                    }
                }
            }
            class403.field5396 = null;
            return true;
        } else if (class5.field127 == class403.field5396) {
            int var287 = class439.field6039.method2034(255);
            int var288 = class439.field6039.method2033(5051);
            if (var288 == 255) {
                var288 = -1;
                var287 = -1;
            }
            class313.method1867(var287, arg0 ^ 0xFFFFFF4D, var288);
            class403.field5396 = null;
            return true;
        } else if (class527.field7024 == class403.field5396) {
            int var289 = class439.field6039.method2045(arg0 ^ 0xDC);
            class243.field3395 = class688.field9669.method2909(var289, (byte) -128);
            class403.field5396 = null;
            return true;
        } else if (class684.field9624 == class403.field5396) {
            int var290 = class439.field6039.method1992(arg0 ^ 0xCF);
            int var291 = class439.field6039.method2013(-96);
            int var292 = class439.field6039.method2001((byte) -83);
            int var293 = class439.field6039.method1984((byte) 20);
            if (class298.method1821(var291, -78)) {
                class706.method3897(var293, 5, var290, var292, 1);
            }
            class403.field5396 = null;
            return true;
        } else if (class64.field982 == class403.field5396) {
            int var294 = class439.field6039.method1984((byte) 20);
            int var295 = class439.field6039.method1996(false);
            int var296 = class439.field6039.method2024((byte) 55);
            int var297 = class439.field6039.method2001((byte) -83);
            if (class298.method1821(var295, -113)) {
                class454.method2594(var294, (var296 << 16) + var297, arg0 ^ 0xFFFF9541);
            }
            class403.field5396 = null;
            return true;
        } else if (class617.field8191 == class403.field5396) {
            class711.field9946 = class367.field4959;
            if (class269.field3754 == 0) {
                class636.field8571 = null;
                class156.field2457 = 0;
                class551.field7334 = null;
                class403.field5396 = null;
                class382.field5102 = null;
                return true;
            }
            class382.field5102 = class439.field6039.method2029((byte) -66);
            boolean var298 = class439.field6039.method2034(255) == 1;
            if (var298) {
                class439.field6039.method2029((byte) -77);
            }
            long var299 = class439.field6039.method2016((byte) -60);
            class551.field7334 = class170.method1158((byte) -106, var299);
            class600.field7968 = class439.field6039.method2040(-127);
            int var301 = class439.field6039.method2034(255);
            if (var301 == 255) {
                class403.field5396 = null;
                return true;
            }
            class156.field2457 = var301;
            class221[] var302 = new class221[100];
            for (int var303 = 0; var303 < class156.field2457; var303++) {
                var302[var303] = new class221();
                var302[var303].field3129 = class439.field6039.method2029((byte) -62);
                boolean var309 = class439.field6039.method2034(255) == 1;
                if (var309) {
                    var302[var303].field3128 = class439.field6039.method2029((byte) -98);
                } else {
                    var302[var303].field3128 = var302[var303].field3129;
                }
                var302[var303].field3123 = class166.method1138(var302[var303].field3128, 3317);
                var302[var303].field3124 = class439.field6039.method2001((byte) -83);
                var302[var303].field3127 = class439.field6039.method2040(-100);
                var302[var303].field3130 = class439.field6039.method2029((byte) -128);
                if (var302[var303].field3128.equals(class199.field2897.field5398)) {
                    class355.field4824 = var302[var303].field3127;
                }
            }
            boolean var304 = false;
            int var305 = class156.field2457;
            while (var305 > 0) {
                boolean var306 = true;
                var305--;
                for (int var307 = 0; var307 < var305; var307++) {
                    if (var302[var307].field3123.compareTo(var302[var307 + 1].field3123) > 0) {
                        class221 var308 = var302[var307];
                        var302[var307] = var302[var307 + 1];
                        var302[var307 + 1] = var308;
                        var306 = false;
                    }
                }
                if (var306) {
                    break;
                }
            }
            class403.field5396 = null;
            class636.field8571 = var302;
            return true;
        } else if (class403.field5396 == class18.field310) {
            class524.method2931(class690.field9709, arg0 + 129);
            class403.field5396 = null;
            return true;
        } else if (class477.field6358 == class403.field5396) {
            int var310 = class439.field6039.method2001((byte) -83);
            int var311 = class439.field6039.method2013(arg0 + 151);
            int var312 = class439.field6039.method2013(109);
            if (class298.method1821(var311, -95)) {
                class11.method127(0, arg0 + 317, var312, var310);
            }
            class403.field5396 = null;
            return true;
        } else if (class551.field7336 == class403.field5396) {
            class403.field5396 = null;
            return false;
        } else if (class403.field5396 == class395.field5204) {
            class524.method2931(class425.field5846, -78);
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class164.field2571) {
            class524.method2931(class305.field4228, -128);
            class403.field5396 = null;
            return true;
        } else if (class624.field8270 == class403.field5396) {
            int var313 = class439.field6039.method2001((byte) -83);
            int var314 = class439.field6039.method2034(255);
            int var315 = class439.field6039.method2034(arg0 ^ 0xFFFFFFBD);
            int var316 = class439.field6039.method2034(255);
            int var317 = class439.field6039.method2034(arg0 ^ 0xFFFFFFBD);
            int var318 = class439.field6039.method2001((byte) -83);
            if (class298.method1821(var313, -94)) {
                class141.field2262[var314] = true;
                class480.field6412[var314] = var315;
                class198.field2883[var314] = var316;
                class102.field1523[var314] = var317;
                class460.field6243[var314] = var318;
            }
            class403.field5396 = null;
            return true;
        } else if (class425.field5848 == class403.field5396) {
            class621.method3402(class439.field6039, class269.field3754, false, class688.field9669);
            class403.field5396 = null;
            return true;
        } else if (class655.field8873 == class403.field5396) {
            class2.field27 = class439.field6039.method2033(5051);
            class605.field8022 = class439.field6039.method2034(255);
            class403.field5396 = null;
            return true;
        } else if (class595.field7862 == class403.field5396) {
            boolean var319 = class439.field6039.method2034(255) == 1;
            String var320 = class439.field6039.method2029((byte) -95);
            String var321 = var320;
            if (var319) {
                var321 = class439.field6039.method2029((byte) -101);
            }
            long var322 = (long) class439.field6039.method2001((byte) -83);
            long var324 = (long) class439.field6039.method2042((byte) 53);
            int var326 = class439.field6039.method2034(255);
            long var327 = (var322 << 32) + var324;
            boolean var329 = false;
            int var330 = 0;
            while (true) {
                if (var330 >= 100) {
                    if (var326 <= 1) {
                        if (!(!class569.field7560 || class674.field9538) || class261.field3587) {
                            var329 = true;
                        } else if (class591.method3249(var321, 92)) {
                            var329 = true;
                        }
                    }
                    break;
                }
                if (class124.field2083[var330] == var327) {
                    var329 = true;
                    break;
                }
                var330++;
            }
            if (!var329 && class654.field8866 == 0) {
                class124.field2083[class431.field5904] = var327;
                class431.field5904 = (class431.field5904 + 1) % 100;
                String var331 = class115.method917((byte) -124, class625.method3428(127, class439.field6039));
                if (var326 == 2) {
                    class173.method1171(var320, 7, "<img=1>" + var320, 0, var331, null, -1, "<img=1>" + var321, (byte) -81);
                } else if (var326 == 1) {
                    class173.method1171(var320, 7, "<img=0>" + var320, 0, var331, null, -1, "<img=0>" + var321, (byte) -79);
                } else {
                    class173.method1171(var320, 3, var320, 0, var331, null, -1, var321, (byte) -119);
                }
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class366.field4955) {
            int var332 = class439.field6039.method2001((byte) -83);
            int var333 = class439.field6039.method2034(255);
            int var334 = class439.field6039.method2034(255);
            int var335 = class439.field6039.method2001((byte) -83) << 2;
            int var336 = class439.field6039.method2034(255);
            int var337 = class439.field6039.method2034(arg0 ^ 0xFFFFFFBD);
            if (class298.method1821(var332, -99)) {
                class162.method1124(var337, -101, var335, true, var333, var336, var334);
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class207.field2978) {
            int var338 = class439.field6039.method2045(-98);
            String var339 = class439.field6039.method2029((byte) -82);
            int var340 = class439.field6039.method1996(false);
            if (class298.method1821(var340, -96)) {
                class398.method2285(11298, var338, var339);
            }
            class403.field5396 = null;
            return true;
        } else if (class561.field7443 == class403.field5396) {
            int var341 = class439.field6039.method2001((byte) -83);
            if (class298.method1821(var341, -84)) {
                class561.method3084(arg0 + 189);
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class122.field2035) {
            int var342 = class439.field6039.method2013(105);
            String var343 = class439.field6039.method2029((byte) -82);
            int var344 = class439.field6039.method1996(false);
            if (class298.method1821(var344, -118)) {
                class275.method1671(var343, var342, true);
            }
            class403.field5396 = null;
            return true;
        } else if (class416.field5692 == class403.field5396) {
            class169.method1153((byte) 101, true);
            class403.field5396 = null;
            return true;
        } else if (class438.field6033 == class403.field5396) {
            int var345 = class439.field6039.method1984((byte) 20);
            int var346 = class439.field6039.method1996(false);
            int var347 = class439.field6039.method2013(111);
            if (class298.method1821(var346, -68)) {
                class429.method2447(var347, var345, (byte) 55);
            }
            class403.field5396 = null;
            return true;
        } else if (class691.field9732 == class403.field5396) {
            int var348 = class439.field6039.method2001((byte) -83);
            int var349 = class439.field6039.method2034(arg0 ^ 0xFFFFFFBD);
            boolean var350 = (var349 & 0x1) == 1;
            while (class269.field3754 > class439.field6039.field4619) {
                int var351 = class439.field6039.method1997(-129);
                int var352 = class439.field6039.method2001((byte) -83);
                int var353 = 0;
                if (var352 != 0) {
                    var353 = class439.field6039.method2034(255);
                    if (var353 == 255) {
                        var353 = class439.field6039.method2045(-98);
                    }
                }
                class187.method1232(var348, var350, var353, var352 - 1, true, var351);
            }
            class369.field4984[class571.method3139(class11.field203++, 31)] = var348;
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class355.field4829) {
            String var354 = class439.field6039.method2029((byte) -68);
            int var355 = class439.field6039.method2024((byte) 56);
            int var356 = class439.field6039.method2024((byte) 99);
            if (class298.method1821(var356, -110)) {
                class275.method1671(var354, var355, true);
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class318.field4364) {
            class153.method1075(-119);
            class403.field5396 = null;
            return false;
        } else if (class502.field6712 == class403.field5396) {
            class628.method3455(arg0 ^ 0xFFFFFF42);
            class403.field5396 = null;
            return false;
        } else if (class78.field1224 == class403.field5396) {
            class524.method2931(class314.field4310, -49);
            class403.field5396 = null;
            return true;
        } else if (class615.field8138 == class403.field5396) {
            int var357 = class439.field6039.method2001((byte) -83);
            String var358 = class439.field6039.method2029((byte) -77);
            Object[] var359 = new Object[var358.length() + 1];
            for (int var360 = var358.length() - 1; var360 >= 0; var360--) {
                if (var358.charAt(var360) == 's') {
                    var359[var360 + 1] = class439.field6039.method2029((byte) -103);
                } else {
                    var359[var360 + 1] = Integer.valueOf(class439.field6039.method2045(-98));
                }
            }
            var359[0] = Integer.valueOf(class439.field6039.method2045(arg0 + 92));
            if (class298.method1821(var357, -125)) {
                class48 var361 = new class48();
                var361.field681 = var359;
                class544.method3013(var361);
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class355.field4818) {
            class524.method2931(class522.field6978, -121);
            class403.field5396 = null;
            return true;
        } else if (class693.field9750 == class403.field5396) {
            boolean var362 = class439.field6039.method2034(255) == 1;
            String var363 = class439.field6039.method2029((byte) -108);
            String var364 = var363;
            if (var362) {
                var364 = class439.field6039.method2029((byte) -128);
            }
            long var365 = class439.field6039.method2016((byte) -60);
            long var367 = (long) class439.field6039.method2001((byte) -83);
            long var369 = (long) class439.field6039.method2042((byte) 53);
            int var371 = class439.field6039.method2034(255);
            long var372 = (var367 << 32) + var369;
            boolean var374 = false;
            int var375 = 0;
            while (true) {
                if (var375 >= 100) {
                    if (var371 <= 1) {
                        if (!(!class569.field7560 || class674.field9538) || class261.field3587) {
                            var374 = true;
                        } else if (class591.method3249(var364, 78)) {
                            var374 = true;
                        }
                    }
                    break;
                }
                if (class124.field2083[var375] == var372) {
                    var374 = true;
                    break;
                }
                var375++;
            }
            if (!var374 && class654.field8866 == 0) {
                class124.field2083[class431.field5904] = var372;
                class431.field5904 = (class431.field5904 + 1) % 100;
                String var376 = class115.method917((byte) -124, class625.method3428(arg0 + 316, class439.field6039));
                if (var371 == 2 || var371 == 3) {
                    class173.method1171(var363, 9, "<img=1>" + var363, 0, var376, class236.method1471(var365, (byte) -46), -1, "<img=1>" + var364, (byte) -82);
                } else if (var371 == 1) {
                    class173.method1171(var363, 9, "<img=0>" + var363, 0, var376, class236.method1471(var365, (byte) -46), -1, "<img=0>" + var364, (byte) -56);
                } else {
                    class173.method1171(var363, 9, var363, 0, var376, class236.method1471(var365, (byte) -46), -1, var364, (byte) -113);
                }
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class177.field2722) {
            for (int var377 = 0; var377 < class572.field7601.length; var377++) {
                if (class572.field7601[var377] != null) {
                    class572.field7601[var377].field5576 = null;
                    class572.field7601[var377].field5575 = -1;
                }
            }
            for (int var378 = 0; var378 < class176.field2705; var378++) {
                class51.field718[var378].field3983.field5576 = null;
                class51.field718[var378].field3983.field5575 = -1;
            }
            class403.field5396 = null;
            return true;
        } else if (class538.field7098 == class403.field5396) {
            int var379 = class439.field6039.method2036(-28748);
            int var380 = class439.field6039.method2045(-98);
            int var381 = class439.field6039.method2001((byte) -83);
            int var382 = class439.field6039.method2036(-28748);
            if (class298.method1821(var381, -105)) {
                class190.method1241(var379, var382, var380, 0);
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class101.field1516) {
            int var383 = class439.field6039.method2001((byte) -83);
            int var384 = class439.field6039.method2007((byte) -61);
            int var385 = class439.field6039.method2024((byte) 111);
            if (var385 == 65535) {
                var385 = -1;
            }
            int var386 = class439.field6039.method1984((byte) 20);
            if (class298.method1821(var383, -104)) {
                class566.method3101(var384, var386, var385, (byte) 105);
                class577 var387 = class193.field2826.method1047(var385, -1);
                class136.method1012(var387.field7665, (byte) -9, var387.field7619, var387.field7625, var386);
                class406.method2335(var386, var387.field7678, -32648, var387.field7673, var387.field7632);
            }
            class403.field5396 = null;
            return true;
        } else if (class565.field7472 == class403.field5396) {
            boolean var388 = class439.field6039.method2034(255) == 1;
            String var389 = class439.field6039.method2029((byte) -95);
            String var390 = var389;
            if (var388) {
                var390 = class439.field6039.method2029((byte) -122);
            }
            int var391 = class439.field6039.method2034(255);
            int var392 = class439.field6039.method2001((byte) -83);
            boolean var393 = false;
            if (var391 <= 1 && class591.method3249(var390, arg0 ^ 0xFFFFFF0A)) {
                var393 = true;
            }
            if (!var393 && class654.field8866 == 0) {
                String var394 = class29.field478.method3816(var392, true).method261((byte) 32, class439.field6039);
                if (var391 == 2) {
                    class173.method1171(var389, 25, "<img=1>" + var389, 0, var394, null, var392, "<img=1>" + var390, (byte) -125);
                } else if (var391 == 1) {
                    class173.method1171(var389, 25, "<img=0>" + var389, 0, var394, null, var392, "<img=0>" + var390, (byte) -64);
                } else {
                    class173.method1171(var389, 25, var389, 0, var394, null, var392, var390, (byte) -42);
                }
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class244.field3409) {
            int var395 = class439.field6039.method2007((byte) 112);
            int var396 = class439.field6039.method2001((byte) -83);
            if (class298.method1821(var396, arg0 ^ 0xCA)) {
                if (var395 == -1) {
                    class173.field2668 = -1;
                    class376.field5068 = -1;
                } else {
                    int var397 = var395 >> 14 & 0x3FFF;
                    int var398 = var397 - class473.field6334;
                    int var399 = var395 & 0x3FFF;
                    int var400 = var399 - class233.field3269;
                    if (var398 < 0) {
                        var398 = 0;
                    } else if (var398 >= class34.field530) {
                        var398 = class34.field530;
                    }
                    if (var400 < 0) {
                        var400 = 0;
                    } else if (class34.field531 <= var400) {
                        var400 = class34.field531;
                    }
                    class376.field5068 = (var398 << 9) + 256;
                    class173.field2668 = (var400 << 9) + 256;
                }
            }
            class403.field5396 = null;
            return true;
        } else if (class693.field9748 == class403.field5396) {
            int var401 = class439.field6039.method2001((byte) -83);
            if (var401 == 65535) {
                var401 = -1;
            }
            int var402 = class439.field6039.method2034(255);
            int var403 = class439.field6039.method2001((byte) -83);
            int var404 = class439.field6039.method2034(arg0 + 445);
            class505.method2800(var403, var404, true, var401, false, var402);
            class403.field5396 = null;
            return true;
        } else if (class597.field7934 == class403.field5396) {
            int var405 = class439.field6039.method2001((byte) -83);
            if (class298.method1821(var405, -103)) {
                class262.method1604((byte) 26);
            }
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class112.field1943) {
            if (class251.field3463 != -1) {
                class294.method1810(arg0 + 116, 0, class251.field3463);
            }
            class403.field5396 = null;
            return true;
        } else if (class540.field7114 == class403.field5396) {
            boolean var406 = class439.field6039.method2034(255) == 1;
            String var407 = class439.field6039.method2029((byte) -95);
            String var408 = var407;
            if (var406) {
                var408 = class439.field6039.method2029((byte) -60);
            }
            long var409 = class439.field6039.method2016((byte) -60);
            long var411 = (long) class439.field6039.method2001((byte) -83);
            long var413 = (long) class439.field6039.method2042((byte) 53);
            int var415 = class439.field6039.method2034(arg0 + 445);
            int var416 = class439.field6039.method2001((byte) -83);
            long var417 = (var411 << 32) + var413;
            boolean var419 = false;
            int var420 = 0;
            while (true) {
                if (var420 >= 100) {
                    if (var415 <= 1 && class591.method3249(var408, 43)) {
                        var419 = true;
                    }
                    break;
                }
                if (class124.field2083[var420] == var417) {
                    var419 = true;
                    break;
                }
                var420++;
            }
            if (!var419 && class654.field8866 == 0) {
                class124.field2083[class431.field5904] = var417;
                class431.field5904 = (class431.field5904 + 1) % 100;
                String var421 = class29.field478.method3816(var416, true).method261((byte) 32, class439.field6039);
                if (var415 == 2) {
                    class173.method1171(var407, 20, "<img=1>" + var407, 0, var421, class236.method1471(var409, (byte) -46), var416, "<img=1>" + var408, (byte) -60);
                } else if (var415 == 1) {
                    class173.method1171(var407, 20, "<img=0>" + var407, 0, var421, class236.method1471(var409, (byte) -46), var416, "<img=0>" + var408, (byte) -127);
                } else {
                    class173.method1171(var407, 20, var407, 0, var421, class236.method1471(var409, (byte) -46), var416, var408, (byte) -56);
                }
            }
            class403.field5396 = null;
            return true;
        } else if (class460.field6236 == class403.field5396) {
            class93.method730((byte) 3);
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class267.field3707) {
            class618.field8194 = class439.field6039.method2023((byte) 46) << 3;
            class417.field5712 = class439.field6039.method2033(5051);
            class139.field2249 = class439.field6039.method2044(-82) << 3;
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class26.field436) {
            String var422 = class439.field6039.method2029((byte) -111);
            int var423 = class439.field6039.method2001((byte) -83);
            String var424 = class29.field478.method3816(var423, true).method261((byte) 32, class439.field6039);
            class173.method1171(var422, 19, var422, 0, var424, null, var423, var422, (byte) -104);
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class128.field2147) {
            class335.field4661 = class439.field6039.method2022(-29089);
            class301.field4203 = class367.field4959;
            class403.field5396 = null;
            return true;
        } else if (class403.field5396 == class332.field4547) {
            int var425 = class439.field6039.method1992(82);
            int var426 = class439.field6039.method1996(false);
            int var427 = class439.field6039.method1984((byte) 20);
            if (class298.method1821(var426, -73)) {
                class140 var428 = (class140) class264.field3667.method2918((long) var425, (byte) -125);
                class140 var429 = (class140) class264.field3667.method2918((long) var427, (byte) 54);
                if (var429 != null) {
                    class345.method2074(1, var429, false, var428 == null || var428.field2256 != var429.field2256);
                }
                if (var428 != null) {
                    var428.method2797(-116);
                    class264.field3667.method2911((long) var427, var428, (byte) -28);
                }
                class625 var430 = class153.method1078(arg0 + 65725, var425);
                if (var430 != null) {
                    class463.method2624(false, var430);
                }
                class625 var431 = class153.method1078(65535, var427);
                if (var431 != null) {
                    class463.method2624(false, var431);
                    class209.method1340(var431, true, -1);
                }
                if (class251.field3463 != -1) {
                    class294.method1810(-56, 1, class251.field3463);
                }
            }
            class403.field5396 = null;
            return true;
        } else if (class405.field5435 == class403.field5396) {
            class524.method2931(class502.field6716, -46);
            class403.field5396 = null;
            return true;
        } else if (class51.field717 == class403.field5396) {
            class403.field5396 = null;
            class59.field916 = 1;
            class410.field5544 = class367.field4959;
            return true;
        } else {
            class259.method1586(null, "T1 - " + (class403.field5396 == null ? -1 : class403.field5396.method1822(110)) + "," + (class102.field1525 == null ? -1 : class102.field1525.method1822(-126)) + "," + (class17.field272 == null ? -1 : class17.field272.method1822(-122)) + " - " + class269.field3754, (byte) 8);
            class55.method365((byte) -127, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)V", line = 3349)
    public static final void method3721(byte arg0) {
        if (arg0 != -18) {
            return;
        }
        field9405++;
        try {
            if (class71.field1059 == 1) {
                int var1 = class568.field7553.method1705((byte) -15);
                if (var1 > 0 && class568.field7553.method1710((byte) 127)) {
                    int var2 = var1 - class515.field6877;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class568.field7553.method1717((byte) -96, var2);
                } else {
                    class568.field7553.method1737(true);
                    class568.field7553.method1718(83);
                    class117.field1991 = null;
                    if (class704.field9906 == null) {
                        class71.field1059 = 0;
                    } else {
                        class71.field1059 = 2;
                    }
                    class70.field1058 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class568.field7553.method1737(true);
            class704.field9906 = null;
            class70.field1058 = null;
            class117.field1991 = null;
            class71.field1059 = 0;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)V", line = 3394)
    public final void method3722(boolean arg0) {
        if (arg0) {
            return;
        }
        class666 var2 = this.field9406;
        synchronized (this.field9406) {
            this.field9406.method3748(6);
        }
        field9403++;
        class666 var3 = this.field9411;
        synchronized (this.field9411) {
            this.field9411.method3748(6);
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(Z)V", line = 3417)
    public final void method3723(boolean arg0) {
        field9409++;
        class666 var2 = this.field9406;
        synchronized (this.field9406) {
            if (!arg0) {
                method3721((byte) -119);
            }
            this.field9406.method3739(0);
        }
        class666 var3 = this.field9411;
        synchronized (this.field9411) {
            this.field9411.method3739(0);
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZI)V", line = 3434)
    public final void method3724(boolean arg0, int arg1) {
        class666 var3 = this.field9406;
        synchronized (this.field9406) {
            this.field9406.method3740((byte) 60, arg1);
        }
        field9408++;
        class666 var4 = this.field9411;
        synchronized (this.field9411) {
            this.field9411.method3740((byte) 60, arg1);
            if (!arg0) {
                this.field9411 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IB)Ltl;", line = 3450)
    public final class580 method3725(int arg0, byte arg1) {
        field9407++;
        if (arg1 < 24) {
            this.field9411 = null;
        }
        class666 var3 = this.field9406;
        class580 var4;
        synchronized (this.field9406) {
            var4 = (class580) this.field9406.method3750((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field9410;
        byte[] var6;
        synchronized (this.field9410) {
            var6 = this.field9410.method2537(false, class695.method3847(false, arg0), class472.method2661(arg0, 255));
        }
        class580 var7 = new class580();
        var7.field7710 = arg0;
        var7.field7720 = this;
        if (var6 != null) {
            var7.method3181(new class335(var6), -11894);
        }
        class666 var8 = this.field9406;
        synchronized (this.field9406) {
            this.field9406.method3745(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IZ)V", line = 3482)
    public final void method3726(int arg0, boolean arg1) {
        field9402++;
        this.field9412 = arg0;
        if (arg1) {
            method3721((byte) -51);
        }
        class666 var3 = this.field9411;
        synchronized (this.field9411) {
            this.field9411.method3739(0);
        }
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lpca;ILbi;Lbi;)V", line = 3504)
    public class662(class671 arg0, int arg1, class449 arg2, class449 arg3) {
        this.field9404 = arg3;
        this.field9410 = arg2;
        int var5 = this.field9410.method2545(0) - 1;
        this.field9410.method2527(0, var5);
    }
}
