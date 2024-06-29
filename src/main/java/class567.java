import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class567 {

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Lme;")
    private class668 field7407 = new class668(64);

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Lme;")
    private class668 field7408 = new class668(100);

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Lpe;")
    private class615 field7406;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Lff;")
    public static class277 field7401;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Ljava/lang/String;")
    public static String field7404;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V", line = 3)
    public final void method3028(int arg0, int arg1) {
        field7399++;
        class668 var3 = this.field7407;
        synchronized (this.field7407) {
            if (arg1 != 256) {
                this.method3036(58);
            }
            this.field7407.method3659(arg1 - 370, arg0);
        }
        class668 var4 = this.field7408;
        synchronized (this.field7408) {
            this.field7408.method3659(arg1 - 377, arg0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 19)
    public final void method3029(int arg0) {
        class668 var2 = this.field7407;
        synchronized (this.field7407) {
            this.field7407.method3656((byte) 0);
        }
        field7403++;
        class668 var3 = this.field7408;
        synchronized (this.field7408) {
            this.field7408.method3656((byte) 0);
            if (arg0 != 19464) {
                this.method3036(-114);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V", line = 36)
    public static void method3030(byte arg0) {
        field7401 = null;
        if (arg0 >= -29) {
            method3033(-41, -33, -90, -78);
        }
        field7404 = null;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)Ljq;", line = 48)
    public final class348 method3031(int arg0, int arg1) {
        field7398++;
        class668 var3 = this.field7407;
        class348 var4;
        synchronized (this.field7407) {
            var4 = (class348) this.field7407.method3655(34, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class615 var5 = this.field7406;
        byte[] var6;
        synchronized (this.field7406) {
            var6 = this.field7406.method3346(-1, class156.method1118(arg1, 1649011527), class248.method1557(arg1, 127));
        }
        class348 var7 = new class348();
        var7.field4439 = arg1;
        var7.field4445 = this;
        if (var6 != null) {
            var7.method2000(-121, new class418(var6));
        }
        var7.method1997((byte) -80);
        int var8 = 33 / ((-arg0 - 4) / 49);
        class668 var9 = this.field7407;
        synchronized (this.field7407) {
            this.field7407.method3650((long) arg1, -108, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)Z", line = 84)
    public static final boolean method3032(int arg0) throws IOException {
        field7397++;
        if (class2.field15 == null) {
            return false;
        }
        if (class159.field1991 == null) {
            if (class655.field9124) {
                if (!class2.field15.method278(1, 5)) {
                    return false;
                }
                class2.field15.method279(19311, class230.field3069.field5393, 0, 1);
                class655.field9124 = false;
                class11.field117++;
                class187.field2386 = 0;
            }
            class230.field3069.field5367 = 0;
            if (class230.field3069.method2839((byte) 25)) {
                if (!class2.field15.method278(1, 5)) {
                    return false;
                }
                class2.field15.method279(19311, class230.field3069.field5393, 1, 1);
                class11.field117++;
                class187.field2386 = 0;
            }
            class655.field9124 = true;
            class361[] var1 = class468.method2598(false);
            int var2 = class230.field3069.method2840(24571);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class230.field3069.field5367);
            }
            class159.field1991 = var1[var2];
            class88.field1169 = class159.field1991.field4665;
        }
        if (class88.field1169 == -1) {
            if (!class2.field15.method278(1, 5)) {
                return false;
            }
            class2.field15.method279(19311, class230.field3069.field5393, 0, 1);
            class187.field2386 = 0;
            class88.field1169 = class230.field3069.field5393[0] & 0xFF;
            class11.field117++;
        }
        if (class88.field1169 == -2) {
            if (!class2.field15.method278(2, 5)) {
                return false;
            }
            class2.field15.method279(arg0 ^ 0xFFFFBC23, class230.field3069.field5393, 0, 2);
            class230.field3069.field5367 = 0;
            class88.field1169 = class230.field3069.method2393(arg0 - 28499);
            class11.field117 += 2;
            class187.field2386 = 0;
        }
        if (class88.field1169 > 0) {
            if (!class2.field15.method278(class88.field1169, 5)) {
                return false;
            }
            class230.field3069.field5367 = 0;
            class2.field15.method279(19311, class230.field3069.field5393, 0, class88.field1169);
            class187.field2386 = 0;
            class11.field117 += class88.field1169;
        }
        class703.field9808 = class455.field5941;
        class455.field5941 = class378.field4845;
        class378.field4845 = class159.field1991;
        if (class278.field3645 == class159.field1991) {
            class144.method1077(-28630);
            class159.field1991 = null;
            return false;
        } else if (class325.field4234 == class159.field1991) {
            int var3 = class230.field3069.method2393(-30727);
            int var4 = class230.field3069.method2412(255);
            if (class522.method2803(arg0 + 2148, var3)) {
                class304.method1795(-1, 3, -1, var4, false);
            }
            class159.field1991 = null;
            return true;
        } else if (class323.field4182 == class159.field1991) {
            int var5 = class230.field3069.method2355(82);
            int var6 = class230.field3069.method2393(-30727);
            int var7 = class230.field3069.method2390((byte) 99);
            if (var7 == 65535) {
                var7 = -1;
            }
            if (class522.method2803(-91, var6)) {
                class332.method1914(var7, var5, (byte) -107);
            }
            class159.field1991 = null;
            return true;
        } else if (class159.field1991 == class158.field1981) {
            int var8 = class230.field3069.method2400((byte) 36);
            int var9 = class230.field3069.method2355(88);
            int var10 = class230.field3069.method2396(arg0 + 2121);
            String var11 = "";
            String var12 = var11;
            if ((var10 & 0x1) != 0) {
                var11 = class230.field3069.method2394(arg0 ^ 0xFFFFF748);
                if ((var10 & 0x2) == 0) {
                    var12 = var11;
                } else {
                    var12 = class230.field3069.method2394(4);
                }
            }
            String var13 = class230.field3069.method2394(4);
            if (var8 == 99) {
                class697.method3800(var13, 1);
            } else if (var12.equals("") || !class336.method1924((byte) 127, var12)) {
                class495.method2696(-1, var9, var12, var8, var11, var13, var11);
            } else {
                class159.field1991 = null;
                return true;
            }
            class159.field1991 = null;
            return true;
        } else if (class407.field5187 == class159.field1991) {
            class105.method781(class91.field1194, (byte) 75);
            class159.field1991 = null;
            return true;
        } else if (class595.field8049 == class159.field1991) {
            int var14 = class230.field3069.method2393(-30727);
            int var15 = class230.field3069.method2396(86);
            boolean var16 = (var15 & 0x1) == 1;
            while (class88.field1169 > class230.field3069.field5367) {
                int var17 = class230.field3069.method2400((byte) 36);
                int var18 = class230.field3069.method2393(-30727);
                int var19 = 0;
                if (var18 != 0) {
                    var19 = class230.field3069.method2396(6);
                    if (var19 == 255) {
                        var19 = class230.field3069.method2355(48);
                    }
                }
                class203.method1320(var19, var18 - 1, var16, 30768, var17, var14);
            }
            class188.field2418[class597.method3238(31, class237.field3192++)] = var14;
            class159.field1991 = null;
            return true;
        } else if (class260.field3500 == class159.field1991) {
            if (class196.field2562 != -1) {
                class491.method2685(0, 2626, class196.field2562);
            }
            class159.field1991 = null;
            return true;
        } else if (class219.field2882 == class159.field1991) {
            String var20 = class230.field3069.method2394(4);
            int var21 = class230.field3069.method2393(-30727);
            String var22 = class196.field2553.method24(var21, 32767).method248(1, class230.field3069);
            class647.method3562(0, null, 8192, var22, var21, var20, var20, 19, var20);
            class159.field1991 = null;
            return true;
        } else if (class282.field3679 == class159.field1991) {
            int var23 = class230.field3069.method2399(true);
            int var24 = class230.field3069.method2379((byte) -123);
            String var25 = class230.field3069.method2394(4);
            if (class522.method2803(-61, var24)) {
                class150.method1103(var25, var23, -123);
            }
            class159.field1991 = null;
            return true;
        } else if (class323.field4196 == class159.field1991) {
            class153.field1948 = class230.field3069.method2365(-46);
            class578.field7883 = class230.field3069.method2396(arg0 + 2294) == 1;
            class159.field1991 = null;
            return true;
        } else if (class313.field4061 == class159.field1991) {
            int var26 = class230.field3069.method2399(true);
            int var27 = class230.field3069.method2405((byte) 125);
            boolean var28 = (var27 & 0x1) == 1;
            class543.method2881(var28, var26, 128);
            class188.field2418[class597.method3238(31, class237.field3192++)] = var26;
            class159.field1991 = null;
            return true;
        } else if (class2.field8 == class159.field1991) {
            class250.method1577(3, false);
            class159.field1991 = null;
            return false;
        } else if (class453.field5916 == class159.field1991) {
            int var29 = class230.field3069.method2406((byte) 40);
            int var30 = class230.field3069.method2393(-30727);
            int var31 = class230.field3069.method2379((byte) -101);
            if (var31 == 65535) {
                var31 = -1;
            }
            int var32 = class230.field3069.method2406((byte) 40);
            if (class522.method2803(-127, var30)) {
                class156.method1121((byte) 49, var29, var32, var31);
                class696 var33 = class232.field3109.method1292(0, var31);
                class50.method451(var33.field9551, var29, var33.field9524, -128, var33.field9504);
                class348.method2003(var33.field9518, var33.field9526, arg0 - 1835600060, var29, var33.field9572);
            }
            class159.field1991 = null;
            return true;
        } else if (class159.field1991 == class122.field1565) {
            int var34 = class230.field3069.method2393(-30727);
            if (class522.method2803(arg0 ^ 0x8E8, var34)) {
                class284.method1696(-50);
            }
            class159.field1991 = null;
            return true;
        } else if (class427.field5530 == class159.field1991) {
            class82.method635(false, arg0 + 2101);
            class159.field1991 = null;
            return true;
        } else if (class303.field3956 == class159.field1991) {
            int var35 = class230.field3069.method2393(-30727);
            if (var35 == 65535) {
                var35 = -1;
            }
            int var36 = class230.field3069.method2396(arg0 + 2339);
            int var37 = class230.field3069.method2393(-30727);
            int var38 = class230.field3069.method2396(69);
            class520.method2795(false, var38, var35, var36, var37);
            class159.field1991 = null;
            return true;
        } else if (class53.field722 == class159.field1991) {
            int var39 = class230.field3069.method2396(arg0 ^ 0xFFFFF72E);
            int var40 = var39 >> 5;
            int var41 = var39 & 0x1F;
            if (var41 == 0) {
                class434.field5591[var40] = null;
                class159.field1991 = null;
                return true;
            }
            class514 var42 = new class514();
            var42.field6726 = var41;
            var42.field6732 = class230.field3069.method2396(88);
            if (var42.field6732 >= 0 && var42.field6732 < class126.field1635.length) {
                if (var42.field6726 == 1 || var42.field6726 == 10) {
                    var42.field6730 = class230.field3069.method2393(arg0 ^ 0x70B5);
                    class230.field3069.field5367 += 6;
                } else if (var42.field6726 >= 2 && var42.field6726 <= 6) {
                    if (var42.field6726 == 2) {
                        var42.field6731 = 256;
                        var42.field6727 = 256;
                    }
                    if (var42.field6726 == 3) {
                        var42.field6731 = 256;
                        var42.field6727 = 0;
                    }
                    if (var42.field6726 == 4) {
                        var42.field6731 = 256;
                        var42.field6727 = 512;
                    }
                    if (var42.field6726 == 5) {
                        var42.field6727 = 256;
                        var42.field6731 = 0;
                    }
                    if (var42.field6726 == 6) {
                        var42.field6731 = 512;
                        var42.field6727 = 256;
                    }
                    var42.field6726 = 2;
                    var42.field6725 = class230.field3069.method2396(arg0 + 2123);
                    var42.field6727 += class230.field3069.method2393(arg0 ^ 0x70B5) - class100.field1326 << 9;
                    var42.field6731 += class230.field3069.method2393(arg0 - 28499) - class186.field2376 << 9;
                    var42.field6729 = class230.field3069.method2396(arg0 ^ 0x8D9) << 2;
                    var42.field6733 = class230.field3069.method2393(-30727);
                }
                var42.field6738 = class230.field3069.method2393(arg0 ^ 0x70B5);
                if (var42.field6738 == 65535) {
                    var42.field6738 = -1;
                }
                class434.field5591[var40] = var42;
            }
            class159.field1991 = null;
            return true;
        } else if (class677.field9341 == class159.field1991) {
            class105.method781(class559.field7308, (byte) 75);
            class159.field1991 = null;
            return true;
        } else if (class458.field6006 == class159.field1991) {
            int var43 = class230.field3069.method2402(-1028506808);
            int var44 = class230.field3069.method2379((byte) -101);
            if (var44 == 65535) {
                var44 = -1;
            }
            int var45 = class230.field3069.method2390((byte) 120);
            if (class522.method2803(-124, var45)) {
                class304.method1795(-1, 1, var44, var43, false);
            }
            class159.field1991 = null;
            return true;
        } else if (class491.field6504 == class159.field1991) {
            int var46 = class230.field3069.method2393(-30727);
            String var47 = class230.field3069.method2394(4);
            Object[] var48 = new Object[var47.length() + 1];
            for (int var49 = var47.length() - 1; var49 >= 0; var49--) {
                if (var47.charAt(var49) == 's') {
                    var48[var49 + 1] = class230.field3069.method2394(4);
                } else {
                    var48[var49 + 1] = Integer.valueOf(class230.field3069.method2355(72));
                }
            }
            var48[0] = Integer.valueOf(class230.field3069.method2355(class392.method2234(arg0, -2265)));
            if (class522.method2803(-53, var46)) {
                class155 var50 = new class155();
                var50.field1962 = var48;
                class709.method3885(var50);
            }
            class159.field1991 = null;
            return true;
        } else if (class190.field2438 == class159.field1991) {
            int var51 = class230.field3069.method2393(arg0 - 28499);
            if (class522.method2803(-100, var51)) {
                class680.method3739((byte) -63);
            }
            class159.field1991 = null;
            return true;
        } else if (class283.field3687 == class159.field1991) {
            int var52 = class230.field3069.method2355(52);
            int var53 = class230.field3069.method2399(true);
            int var54 = class230.field3069.method2359(arg0 + 2230);
            int var55 = class230.field3069.method2383(65280);
            if (class522.method2803(-85, var53)) {
                class110.method845(var54, var55, var52, (byte) 97);
            }
            class159.field1991 = null;
            return true;
        } else if (class407.field5185 == class159.field1991) {
            class602.field8104 = class230.field3069.method2383(arg0 ^ 0xFFFF084C);
            class159.field1991 = null;
            class149.field1924 = class166.field2089;
            return true;
        } else if (class575.field7532 == class159.field1991) {
            class684.field9398 = class230.field3069.method2396(-104);
            class149.field1924 = class166.field2089;
            class159.field1991 = null;
            return true;
        } else if (class578.field7874 == class159.field1991) {
            String var56 = class230.field3069.method2394(4);
            int var57 = class230.field3069.method2393(-30727);
            int var58 = class230.field3069.method2355(49);
            if (class522.method2803(arg0 ^ 0x88A, var57)) {
                class384.method2189(var56, var58, false);
            }
            class159.field1991 = null;
            return true;
        } else if (class564.field7358 == class159.field1991) {
            int var59 = class230.field3069.method2396(-114);
            int var60 = class230.field3069.method2396(-128);
            int var61 = class230.field3069.method2355(35);
            class553.field7248[var59] = var61;
            class638.field8880[var59] = var60;
            class243.field3256[var59] = 1;
            int var62 = class352.field4530[var59] - 1;
            for (int var63 = 0; var63 < var62; var63++) {
                if (var61 >= class622.field8371[var63]) {
                    class243.field3256[var59] = var63 + 2;
                }
            }
            class380.field4887[class597.method3238(31, class537.field6990++)] = var59;
            class159.field1991 = null;
            return true;
        } else if (class453.field5912 == class159.field1991) {
            int var64 = class230.field3069.method2393(-30727);
            int var65 = class230.field3069.method2412(255);
            int var66 = class230.field3069.method2399(true);
            if (class522.method2803(-96, var66)) {
                class368.method2117(12, var65, var64);
            }
            class159.field1991 = null;
            return true;
        } else if (class304.field4002 == class159.field1991) {
            int var67 = class230.field3069.method2379((byte) -90);
            int var68 = class230.field3069.method2399(true);
            int var69 = class230.field3069.method2390((byte) 97);
            if (class522.method2803(-68, var69)) {
                class51.method456(var68, 0, 90, var67);
            }
            class159.field1991 = null;
            return true;
        } else if (class307.field4021 == class159.field1991) {
            int var70 = class230.field3069.method2393(-30727);
            int var71 = class230.field3069.method2355(78);
            if (class522.method2803(-128, var70)) {
                class270 var72 = (class270) class700.field9763.method39((long) var71, 31750);
                if (var72 != null) {
                    class298.method1764(false, arg0 + 2118, true, var72);
                }
                if (class357.field4636 != null) {
                    class386.method2199(class357.field4636, false);
                    class357.field4636 = null;
                }
            }
            class159.field1991 = null;
            return true;
        } else if (class413.field5315 == class159.field1991) {
            class377.method2157((byte) 112);
            class159.field1991 = null;
            return true;
        } else if (class518.field6775 == class159.field1991) {
            class105.method781(class605.field8191, (byte) 75);
            class159.field1991 = null;
            return true;
        } else if (class489.field6493 == class159.field1991) {
            class105.method781(class493.field6523, (byte) 75);
            class159.field1991 = null;
            return true;
        } else if (class525.field6843 == class159.field1991) {
            int var73 = class230.field3069.method2393(-30727);
            int var74 = class230.field3069.method2393(-30727);
            int var75 = class230.field3069.method2393(-30727);
            int var76 = class230.field3069.method2393(arg0 - 28499);
            if (class522.method2803(-79, var73) && class322.field4179[var74] != null) {
                for (int var77 = var75; var77 < var76; var77++) {
                    int var78 = class230.field3069.method2364(-120);
                    if (class322.field4179[var74].length > var77 && class322.field4179[var74][var77] != null) {
                        class322.field4179[var74][var77].field6371 = var78;
                    }
                }
            }
            class159.field1991 = null;
            return true;
        } else if (class7.field66 == class159.field1991) {
            class642.field8931 = class581.method3188(class230.field3069.method2396(-126), arg0 + 2231);
            class159.field1991 = null;
            return true;
        } else if (class533.field6936 == class159.field1991) {
            class407.field5172 = class88.field1169 > 2 ? class230.field3069.method2394(4) : class604.field8150.method3280((byte) -121, class144.field1890);
            class460.field6041 = class88.field1169 <= 0 ? -1 : class230.field3069.method2393(-30727);
            class159.field1991 = null;
            if (class460.field6041 == 65535) {
                class460.field6041 = -1;
            }
            return true;
        } else if (class159.field1991 == class131.field1721) {
            String var79 = class230.field3069.method2394(arg0 + 2232);
            boolean var80 = class230.field3069.method2396(-109) == 1;
            String var81;
            if (var80) {
                var81 = class230.field3069.method2394(4);
            } else {
                var81 = var79;
            }
            int var82 = class230.field3069.method2393(-30727);
            byte var83 = class230.field3069.method2387((byte) 107);
            boolean var84 = false;
            if (var83 == -128) {
                var84 = true;
            }
            if (var84) {
                if (class76.field1038 == 0) {
                    class159.field1991 = null;
                    return true;
                }
                boolean var90 = false;
                int var91;
                for (var91 = 0; var91 < class76.field1038 && (!class265.field3540[var91].field9052.equals(var81) || class265.field3540[var91].field9058 != var82); var91++) {
                }
                if (class76.field1038 > var91) {
                    while (class76.field1038 - 1 > var91) {
                        class265.field3540[var91] = class265.field3540[var91 + 1];
                        var91++;
                    }
                    class76.field1038--;
                    class265.field3540[class76.field1038] = null;
                }
            } else {
                String var85 = class230.field3069.method2394(4);
                class650 var86 = new class650();
                var86.field9052 = var81;
                var86.field9050 = var79;
                var86.field9054 = class315.method1841((byte) 127, var86.field9052);
                var86.field9049 = var83;
                var86.field9056 = var85;
                var86.field9058 = var82;
                int var87;
                for (var87 = class76.field1038 - 1; var87 >= 0; var87--) {
                    int var88 = class265.field3540[var87].field9054.compareTo(var86.field9054);
                    if (var88 == 0) {
                        class265.field3540[var87].field9058 = var82;
                        class265.field3540[var87].field9049 = var83;
                        class265.field3540[var87].field9056 = var85;
                        if (var81.equals(class233.field3130.field2492)) {
                            class446.field5733 = var83;
                        }
                        class159.field1991 = null;
                        class331.field4310 = class166.field2089;
                        return true;
                    }
                    if (var88 < 0) {
                        break;
                    }
                }
                if (class76.field1038 >= class265.field3540.length) {
                    class159.field1991 = null;
                    return true;
                }
                for (int var89 = class76.field1038 - 1; var89 > var87; var89--) {
                    class265.field3540[var89 + 1] = class265.field3540[var89];
                }
                if (class76.field1038 == 0) {
                    class265.field3540 = new class650[100];
                }
                class265.field3540[var87 + 1] = var86;
                class76.field1038++;
                if (var81.equals(class233.field3130.field2492)) {
                    class446.field5733 = var83;
                }
            }
            class159.field1991 = null;
            class331.field4310 = class166.field2089;
            return true;
        } else if (class513.field6720 == class159.field1991) {
            class578.method3166(-120);
            class159.field1991 = null;
            return false;
        } else if (class536.field6982 == class159.field1991) {
            class397.field5054.method1715((byte) -91);
            class314.field4073 += 32;
            class159.field1991 = null;
            return true;
        } else if (class219.field2879 == class159.field1991) {
            class250.method1577(3, class642.field8932);
            class159.field1991 = null;
            return false;
        } else if (class331.field4306 == class159.field1991) {
            int var92 = class230.field3069.method2405((byte) 125);
            int var93 = class230.field3069.method2399(true);
            if (class522.method2803(-100, var93)) {
                class41.field578 = var92;
            }
            class159.field1991 = null;
            return true;
        } else if (class185.field2365 == class159.field1991) {
            int var94 = class230.field3069.method2379((byte) -127);
            int var95 = class230.field3069.method2355(94);
            int var96 = class230.field3069.method2393(-30727);
            if (class522.method2803(-77, var96)) {
                class17.method98(false, var95, var94);
            }
            class159.field1991 = null;
            return true;
        } else if (class574.field7484 == class159.field1991) {
            int var97 = class230.field3069.method2390((byte) 126);
            int var98 = class230.field3069.method2402(-1028506808);
            int var99 = class230.field3069.method2355(90);
            int var100 = class230.field3069.method2379((byte) -104);
            if (class522.method2803(-63, var97)) {
                class304.method1795(var98, 5, var100, var99, false);
            }
            class159.field1991 = null;
            return true;
        } else if (class694.field9489 == class159.field1991) {
            class323.field4195 = class230.field3069.method2396(40);
            class159.field1991 = null;
            return true;
        } else if (client.field1206 == class159.field1991) {
            int var101 = class230.field3069.method2393(-30727);
            class193 var102;
            if (class353.field4536 == var101) {
                var102 = class233.field3130;
            } else {
                var102 = class592.field8019[var101];
            }
            if (var102 == null) {
                class159.field1991 = null;
                return true;
            }
            int var103 = class230.field3069.method2393(-30727);
            int var104 = class230.field3069.method2396(53);
            boolean var105 = (var103 & 0x8000) != 0;
            if (var102.field2492 != null && var102.field2469 != null) {
                boolean var106 = false;
                if (var104 <= 1) {
                    if (!var105 && !(!class578.field7883 || class282.field3678) || class597.field8076) {
                        var106 = true;
                    } else if (class336.method1924((byte) 127, var102.field2492)) {
                        var106 = true;
                    }
                }
                if (!var106 && class225.field2930 == 0) {
                    int var107 = -1;
                    String var109;
                    if (var105) {
                        var103 &= 0x7FFF;
                        class371 var108 = class66.method543(-102, class230.field3069);
                        var107 = var108.field4784;
                        var109 = var108.field4781.method248(1, class230.field3069);
                    } else {
                        var109 = class442.method2507(class568.method3039(class230.field3069, false), -14);
                    }
                    var102.field3017 = var109.trim();
                    var102.field2967 = var103 >> 8;
                    var102.field2999 = 150;
                    var102.field2957 = var103 & 0xFF;
                    int var110;
                    if (var104 == 1 || var104 == 2) {
                        var110 = var105 ? 17 : 1;
                    } else {
                        var110 = var105 ? 17 : 2;
                    }
                    if (var104 == 2) {
                        class647.method3562(0, null, 8192, var109, var107, "<img=1>" + var102.method1270((byte) -116, true), "<img=1>" + var102.method1274(arg0 ^ 0x8B3, false), var110, var102.field2473);
                    } else if (var104 == 1) {
                        class647.method3562(0, null, 8192, var109, var107, "<img=0>" + var102.method1270((byte) -116, true), "<img=0>" + var102.method1274(-1, false), var110, var102.field2473);
                    } else {
                        class647.method3562(0, null, 8192, var109, var107, var102.method1270((byte) -116, true), var102.method1274(-1, false), var110, var102.field2473);
                    }
                }
            }
            class159.field1991 = null;
            return true;
        } else if (class549.field7130 == class159.field1991) {
            int var111 = class230.field3069.method2379((byte) -108);
            int var112 = class230.field3069.method2393(arg0 ^ 0x70B5);
            int var113 = class230.field3069.method2379((byte) -114);
            int var114 = class230.field3069.method2412(255);
            int var115 = class230.field3069.method2390((byte) 115);
            if (class522.method2803(-96, var115)) {
                class50.method451(var112, var114, var111, -128, var113);
            }
            class159.field1991 = null;
            return true;
        } else if (class20.field218 == class159.field1991) {
            int var116 = class230.field3069.method2379((byte) -126);
            String var117 = class230.field3069.method2394(arg0 ^ 0xFFFFF748);
            int var118 = class230.field3069.method2393(arg0 ^ 0x70B5);
            if (class522.method2803(arg0 ^ 0x8CD, var116)) {
                class150.method1103(var117, var118, arg0 + 2274);
            }
            class159.field1991 = null;
            return true;
        } else if (class194.field2536 == class159.field1991) {
            while (class88.field1169 > class230.field3069.field5367) {
                boolean var129 = class230.field3069.method2396(-111) == 1;
                String var130 = class230.field3069.method2394(4);
                String var131 = class230.field3069.method2394(4);
                int var132 = class230.field3069.method2393(-30727);
                int var133 = class230.field3069.method2396(-106);
                String var134 = "";
                boolean var135 = false;
                if (var132 > 0) {
                    var134 = class230.field3069.method2394(4);
                    var135 = class230.field3069.method2396(-123) == 1;
                }
                for (int var136 = 0; var136 < class665.field9225; var136++) {
                    if (var129) {
                        if (var131.equals(class405.field5160[var136])) {
                            class405.field5160[var136] = var130;
                            var130 = null;
                            class329.field4274[var136] = var131;
                            break;
                        }
                    } else if (var130.equals(class405.field5160[var136])) {
                        if (class565.field7387[var136] != var132) {
                            boolean var137 = true;
                            for (class691 var138 = (class691) class225.field2926.method2101(260); var138 != null; var138 = (class691) class225.field2926.method2098((byte) 57)) {
                                if (var138.field9437.equals(var130)) {
                                    if (var132 != 0 && var138.field9435 == 0) {
                                        var137 = false;
                                        var138.method2227(100);
                                    } else if (var132 == 0 && var138.field9435 != 0) {
                                        var137 = false;
                                        var138.method2227(74);
                                    }
                                }
                            }
                            if (var137) {
                                class225.field2926.method2104((byte) -22, new class691(var130, var132));
                            }
                            class565.field7387[var136] = var132;
                        }
                        class329.field4274[var136] = var131;
                        class636.field8849[var136] = var134;
                        class509.field6673[var136] = var133;
                        var130 = null;
                        class51.field713[var136] = var135;
                        break;
                    }
                }
                if (var130 != null && class665.field9225 < 200) {
                    class405.field5160[class665.field9225] = var130;
                    class329.field4274[class665.field9225] = var131;
                    class565.field7387[class665.field9225] = var132;
                    class636.field8849[class665.field9225] = var134;
                    class509.field6673[class665.field9225] = var133;
                    class51.field713[class665.field9225] = var135;
                    class665.field9225++;
                }
            }
            class532.field6926 = 2;
            class352.field4527 = class166.field2089;
            boolean var119 = false;
            int var120 = class665.field9225;
            while (var120 > 0) {
                boolean var121 = true;
                var120--;
                for (int var122 = 0; var122 < var120; var122++) {
                    if (class565.field7387[var122] != class423.field5473.field3554 && class565.field7387[var122 + 1] == class423.field5473.field3554 || class565.field7387[var122] == 0 && class565.field7387[var122 + 1] != 0) {
                        int var123 = class565.field7387[var122];
                        class565.field7387[var122] = class565.field7387[var122 + 1];
                        class565.field7387[var122 + 1] = var123;
                        String var124 = class636.field8849[var122];
                        class636.field8849[var122] = class636.field8849[var122 + 1];
                        class636.field8849[var122 + 1] = var124;
                        String var125 = class405.field5160[var122];
                        class405.field5160[var122] = class405.field5160[var122 + 1];
                        class405.field5160[var122 + 1] = var125;
                        String var126 = class329.field4274[var122];
                        class329.field4274[var122] = class329.field4274[var122 + 1];
                        class329.field4274[var122 + 1] = var126;
                        int var127 = class509.field6673[var122];
                        class509.field6673[var122] = class509.field6673[var122 + 1];
                        class509.field6673[var122 + 1] = var127;
                        boolean var128 = class51.field713[var122];
                        class51.field713[var122] = class51.field713[var122 + 1];
                        var121 = false;
                        class51.field713[var122 + 1] = var128;
                    }
                }
                if (var121) {
                    break;
                }
            }
            class159.field1991 = null;
            return true;
        } else if (class288.field3720 == class159.field1991) {
            class105.method781(class240.field3243, (byte) 75);
            class159.field1991 = null;
            return true;
        } else if (class437.field5654 == class159.field1991) {
            boolean var139 = class230.field3069.method2396(-122) == 1;
            String var140 = class230.field3069.method2394(4);
            String var141 = var140;
            if (var139) {
                var141 = class230.field3069.method2394(4);
            }
            long var142 = class230.field3069.method2377(-605269408);
            long var144 = (long) class230.field3069.method2393(-30727);
            long var146 = (long) class230.field3069.method2364(arg0 ^ 0x8FC);
            int var148 = class230.field3069.method2396(84);
            int var149 = class230.field3069.method2393(-30727);
            long var150 = (var144 << 32) + var146;
            boolean var152 = false;
            int var153 = 0;
            while (true) {
                if (var153 >= 100) {
                    if (var148 <= 1 && class336.method1924((byte) 126, var141)) {
                        var152 = true;
                    }
                    break;
                }
                if (class460.field6034[var153] == var150) {
                    var152 = true;
                    break;
                }
                var153++;
            }
            if (!var152 && class225.field2930 == 0) {
                class460.field6034[class656.field9161] = var150;
                class656.field9161 = (class656.field9161 + 1) % 100;
                String var154 = class196.field2553.method24(var149, arg0 + 34995).method248(1, class230.field3069);
                if (var148 == 2) {
                    class647.method3562(0, class283.method1694(0, var142), 8192, var154, var149, "<img=1>" + var140, "<img=1>" + var141, 20, var140);
                } else if (var148 == 1) {
                    class647.method3562(0, class283.method1694(0, var142), 8192, var154, var149, "<img=0>" + var140, "<img=0>" + var141, 20, var140);
                } else {
                    class647.method3562(0, class283.method1694(0, var142), 8192, var154, var149, var140, var141, 20, var140);
                }
            }
            class159.field1991 = null;
            return true;
        } else if (class398.field5070 == class159.field1991) {
            int var155 = class230.field3069.method2393(-30727);
            if (var155 == 65535) {
                var155 = -1;
            }
            int var156 = class230.field3069.method2396(-114);
            int var157 = class230.field3069.method2393(arg0 ^ 0x70B5);
            int var158 = class230.field3069.method2396(-113);
            class285.method1700(var156, var155, (byte) 49, var157, true, var158);
            class159.field1991 = null;
            return true;
        } else if (class361.field4667 == class159.field1991) {
            class105.method781(class581.field7908, (byte) 75);
            class159.field1991 = null;
            return true;
        } else if (class668.field9275 == class159.field1991) {
            class331.field4310 = class166.field2089;
            if (class88.field1169 == 0) {
                class265.field3540 = null;
                class159.field1991 = null;
                class428.field5543 = null;
                class438.field5665 = null;
                class76.field1038 = 0;
                return true;
            }
            class438.field5665 = class230.field3069.method2394(4);
            boolean var159 = class230.field3069.method2396(-26) == 1;
            if (var159) {
                class230.field3069.method2394(4);
            }
            long var160 = class230.field3069.method2377(-605269408);
            class428.field5543 = class84.method641(arg0 + 2265, var160);
            class535.field6973 = class230.field3069.method2387((byte) 116);
            int var162 = class230.field3069.method2396(arg0 + 2113);
            if (var162 == 255) {
                class159.field1991 = null;
                return true;
            }
            class76.field1038 = var162;
            class650[] var163 = new class650[100];
            for (int var164 = 0; var164 < class76.field1038; var164++) {
                var163[var164] = new class650();
                var163[var164].field9050 = class230.field3069.method2394(4);
                boolean var170 = class230.field3069.method2396(arg0 + 2283) == 1;
                if (var170) {
                    var163[var164].field9052 = class230.field3069.method2394(4);
                } else {
                    var163[var164].field9052 = var163[var164].field9050;
                }
                var163[var164].field9054 = class315.method1841((byte) 114, var163[var164].field9052);
                var163[var164].field9058 = class230.field3069.method2393(-30727);
                var163[var164].field9049 = class230.field3069.method2387((byte) -103);
                var163[var164].field9056 = class230.field3069.method2394(4);
                if (var163[var164].field9052.equals(class233.field3130.field2492)) {
                    class446.field5733 = var163[var164].field9049;
                }
            }
            boolean var165 = false;
            int var166 = class76.field1038;
            while (var166 > 0) {
                var166--;
                boolean var167 = true;
                for (int var168 = 0; var168 < var166; var168++) {
                    if (var163[var168].field9054.compareTo(var163[var168 + 1].field9054) > 0) {
                        class650 var169 = var163[var168];
                        var163[var168] = var163[var168 + 1];
                        var163[var168 + 1] = var169;
                        var167 = false;
                    }
                }
                if (var167) {
                    break;
                }
            }
            class265.field3540 = var163;
            class159.field1991 = null;
            return true;
        } else if (class223.field2915 == class159.field1991) {
            class105.method781(class83.field1129, (byte) 75);
            class159.field1991 = null;
            return true;
        } else if (class159.field1991 == class124.field1605) {
            int var171 = class230.field3069.method2379((byte) -124);
            int var172 = class230.field3069.method2355(76);
            int var173 = class230.field3069.method2393(-30727);
            if (class522.method2803(-59, var173)) {
                class662.method3628(var171, (byte) 120, var172);
            }
            class159.field1991 = null;
            return true;
        } else if (class678.field9348 == class159.field1991) {
            boolean var174 = class230.field3069.method2396(-118) == 1;
            String var175 = class230.field3069.method2394(4);
            String var176 = var175;
            if (var174) {
                var176 = class230.field3069.method2394(4);
            }
            long var177 = (long) class230.field3069.method2393(-30727);
            long var179 = (long) class230.field3069.method2364(-128);
            int var181 = class230.field3069.method2396(-121);
            int var182 = class230.field3069.method2393(-30727);
            long var183 = (var177 << 32) + var179;
            boolean var185 = false;
            int var186 = 0;
            while (true) {
                if (var186 >= 100) {
                    if (var181 <= 1 && class336.method1924((byte) 127, var176)) {
                        var185 = true;
                    }
                    break;
                }
                if (class460.field6034[var186] == var183) {
                    var185 = true;
                    break;
                }
                var186++;
            }
            if (!var185 && class225.field2930 == 0) {
                class460.field6034[class656.field9161] = var183;
                class656.field9161 = (class656.field9161 + 1) % 100;
                String var187 = class196.field2553.method24(var182, 32767).method248(arg0 ^ 0xFFFFF74D, class230.field3069);
                if (var181 == 2) {
                    class647.method3562(0, null, 8192, var187, var182, "<img=1>" + var175, "<img=1>" + var176, 18, var175);
                } else if (var181 == 1) {
                    class647.method3562(0, null, 8192, var187, var182, "<img=0>" + var175, "<img=0>" + var176, 18, var175);
                } else {
                    class647.method3562(0, null, 8192, var187, var182, var175, var176, 18, var175);
                }
            }
            class159.field1991 = null;
            return true;
        } else if (class162.field2014 == class159.field1991) {
            boolean var188 = class230.field3069.method2396(arg0 ^ 0x8C0) == 1;
            byte[] var189 = new byte[class88.field1169 - 1];
            class230.field3069.method2398(var189, 0, 15, class88.field1169 - 1);
            class326.method1889((byte) 120, var189, var188);
            class159.field1991 = null;
            return true;
        } else if (class260.field3506 == class159.field1991) {
            int var190 = class230.field3069.method2379((byte) -118);
            int var191 = class230.field3069.method2406((byte) 40);
            class397.field5054.method1721(var190, 14972, var191);
            class159.field1991 = null;
            return true;
        } else if (class159.field1991 == class148.field1911) {
            class159.field1991 = null;
            return false;
        } else if (class238.field3203 == class159.field1991) {
            int var192 = class230.field3069.method2393(-30727);
            int var193 = class230.field3069.method2396(arg0 + 2107);
            int var194 = class230.field3069.method2396(-126);
            int var195 = class230.field3069.method2393(arg0 ^ 0x70B5) << 2;
            int var196 = class230.field3069.method2396(-115);
            int var197 = class230.field3069.method2396(111);
            if (class522.method2803(-96, var192)) {
                class203.method1321(true, var195, var197, var193, var196, var194, (byte) -115);
            }
            class159.field1991 = null;
            return true;
        } else if (class370.field4767 == class159.field1991) {
            int var198 = class230.field3069.method2379((byte) -96);
            int var199 = class230.field3069.method2355(75);
            if (class522.method2803(-57, var198)) {
                class304.method1795(0, 5, class353.field4536, var199, false);
            }
            class159.field1991 = null;
            return true;
        } else if (class324.field4209 == class159.field1991) {
            if (class114.field1483 != null) {
                class658.method3617(class260.field3509.field1293, -1, -1, false, 11015);
            }
            byte[] var200 = new byte[class88.field1169];
            class230.field3069.method2836(0, 0, var200, class88.field1169);
            String var201 = class638.method3522(var200, class88.field1169, arg0 ^ 0xFFFFF72B, 0);
            class183.method1227(false, var201, true, class364.field4697 == 1, class688.field9413);
            class159.field1991 = null;
            return true;
        } else if (class207.field2673 == class159.field1991) {
            class105.method781(class530.field6875, (byte) 75);
            class159.field1991 = null;
            return true;
        } else if (class222.field2900 == class159.field1991) {
            class101.method766(class88.field1169, class230.field3069, (byte) 50);
            class159.field1991 = null;
            return true;
        } else if (class159.field1991 == class156.field1973) {
            class105.method781(class25.field295, (byte) 75);
            class159.field1991 = null;
            return true;
        } else if (class431.field5574 == class159.field1991) {
            String var202 = class230.field3069.method2394(arg0 + 2232);
            String var203 = class442.method2507(class568.method3039(class230.field3069, false), -14);
            class495.method2696(arg0 + 2227, 0, var202, 6, var202, var203, var202);
            class159.field1991 = null;
            return true;
        } else if (class275.field3613 == class159.field1991) {
            class602.field8102 = class230.field3069.method2375(-8643) << 3;
            class178.field2200 = class230.field3069.method2375(-8643) << 3;
            class656.field9160 = class230.field3069.method2363(arg0 + 2101);
            class159.field1991 = null;
            return true;
        } else if (class547.field7092 == class159.field1991) {
            byte var204 = class230.field3069.method2387((byte) 102);
            int var205 = class230.field3069.method2390((byte) 101);
            class397.field5054.method1720(arg0 + 2228, var205, var204);
            class159.field1991 = null;
            return true;
        } else if (class239.field3215 == class159.field1991) {
            int var206 = class230.field3069.method2393(-30727);
            if (var206 == 65535) {
                var206 = -1;
            }
            int var207 = class230.field3069.method2413((byte) -108);
            int var208 = class230.field3069.method2396(-105);
            class631.method3502(-1, var207, var208, var206);
            class159.field1991 = null;
            return true;
        } else if (class290.field3744 == class159.field1991) {
            int var209 = class230.field3069.method2363(94);
            int var210 = class230.field3069.method2364(-88);
            int var211 = class230.field3069.method2379((byte) -91);
            if (var211 == 65535) {
                var211 = -1;
            }
            class33.method264((byte) 46, var210, var209, var211);
            class159.field1991 = null;
            return true;
        } else if (class550.field7142 == class159.field1991) {
            boolean var212 = class230.field3069.method2396(4) == 1;
            String var213 = class230.field3069.method2394(4);
            String var214 = var213;
            if (var212) {
                var214 = class230.field3069.method2394(4);
            }
            int var215 = class230.field3069.method2396(-126);
            boolean var216 = false;
            if (var215 <= 1) {
                if (!(!class578.field7883 || class282.field3678) || class597.field8076) {
                    var216 = true;
                } else if (var215 <= 1 && class336.method1924((byte) 127, var214)) {
                    var216 = true;
                }
            }
            if (!var216 && class225.field2930 == 0) {
                String var217 = class442.method2507(class568.method3039(class230.field3069, false), -14);
                if (var215 == 2) {
                    class647.method3562(0, null, 8192, var217, -1, "<img=1>" + var213, "<img=1>" + var214, 24, var213);
                } else if (var215 == 1) {
                    class647.method3562(0, null, arg0 + 10420, var217, -1, "<img=0>" + var213, "<img=0>" + var214, 24, var213);
                } else {
                    class647.method3562(0, null, 8192, var217, -1, var213, var214, 24, var213);
                }
            }
            class159.field1991 = null;
            return true;
        } else if (class412.field5310 == class159.field1991) {
            class463.method2588(class230.field3069.method2394(4), (byte) -31);
            class159.field1991 = null;
            return true;
        } else if (class572.field7454 == class159.field1991) {
            class105.method781(class596.field8050, (byte) 75);
            class159.field1991 = null;
            return true;
        } else if (class159.field1991 == class124.field1604) {
            int var218 = class230.field3069.method2393(-30727);
            int var219 = class230.field3069.method2396(-117);
            int var220 = class230.field3069.method2396(110);
            int var221 = class230.field3069.method2393(arg0 - 28499) << 2;
            int var222 = class230.field3069.method2396(69);
            int var223 = class230.field3069.method2396(-31);
            if (class522.method2803(-60, var218)) {
                class72.method579(var223, var219, var221, var220, var222, false);
            }
            class159.field1991 = null;
            return true;
        } else if (class668.field9277 == class159.field1991) {
            int var224 = class230.field3069.method2406((byte) 40);
            int var225 = class230.field3069.method2405((byte) 126);
            int var226 = class230.field3069.method2399(true);
            int var227 = class230.field3069.method2393(-30727);
            int var228 = class230.field3069.method2399(true);
            boolean var229 = (var225 & 0x80) != 0;
            if ((var224 >> 30) != 0) {
                int var230 = var224 >> 28 & 0x3;
                int var231 = ((var224 & 0xFFFC5BB) >> 14) - class100.field1326;
                int var232 = (var224 & 0x3FFF) - class186.field2376;
                if (var231 >= 0 && var232 >= 0 && class611.field8258 > var231 && class656.field9155 > var232) {
                    int var233 = var231 * 512 + 256;
                    int var234 = var232 * 512 + 256;
                    int var235 = var230;
                    if (var230 < 3 && class589.method3215(var231, (byte) -52, var232)) {
                        var235 = var230 + 1;
                    }
                    class46 var236 = new class46(var227, 0, class424.field5503, var230, var235, var233, class332.method1916(1218445319, var234, var230, var233) - var226, var234, var231, var231, var232, var232, var225 & 0x7);
                    class21.field231.method2087(new class225(var236), 63);
                }
            } else if (var224 >> 29 != 0) {
                int var237 = var224 & 0xFFFF;
                class234 var238 = (class234) class505.field6640.method39((long) var237, 31750);
                if (var238 != null) {
                    if (var227 == 65535) {
                        var227 = -1;
                    }
                    class532 var239 = var238.field3131;
                    boolean var240 = true;
                    int var241 = var229 ? var239.field3006 : var239.field2984;
                    if (var227 != -1 && var241 != -1) {
                        if (var227 == var241) {
                            class322 var242 = class91.field1202.method986(var227, false);
                            if (var242.field4166 && var242.field4173 != -1) {
                                class348 var243 = class552.field7163.method3031(-127, var242.field4173);
                                int var244 = var243.field4447;
                                if (var244 == 0 || var244 == 2) {
                                    var240 = false;
                                } else if (var244 == 1) {
                                    var240 = true;
                                }
                            }
                        } else {
                            class322 var245 = class91.field1202.method986(var227, false);
                            class322 var246 = class91.field1202.method986(var241, false);
                            if (var245.field4173 != -1 && var246.field4173 != -1) {
                                class348 var247 = class552.field7163.method3031(-62, var245.field4173);
                                class348 var248 = class552.field7163.method3031(65, var246.field4173);
                                if (var248.field4466 > var247.field4466) {
                                    var240 = false;
                                }
                            }
                        }
                    }
                    if (var240) {
                        if (var229) {
                            var239.field3023 = 1;
                            var239.field2969 = 0;
                            var239.field2981 = var226;
                            var239.field3026 = 0;
                            var239.field3022 = var225 & 0x7;
                            var239.field3006 = var227;
                            var239.field3019 = class424.field5503 + var228;
                            if (class424.field5503 < var239.field3019) {
                                var239.field3026 = -1;
                            }
                            if (var239.field3006 != -1 && class424.field5503 == var239.field3019) {
                                int var251 = class91.field1202.method986(var239.field3006, false).field4173;
                                if (var251 != -1) {
                                    class348 var252 = class552.field7163.method3031(103, var251);
                                    if (var252 != null && var252.field4463 != null) {
                                        class451.method2548(var252, var239.field508, var239.field503, var239.field506, 255, false, 0);
                                    }
                                }
                            }
                        } else {
                            var239.field2984 = var227;
                            var239.field2968 = var226;
                            var239.field2949 = 0;
                            var239.field2952 = 0;
                            var239.field2971 = var225 & 0x7;
                            var239.field2975 = class424.field5503 + var228;
                            var239.field2987 = 1;
                            if (class424.field5503 < var239.field2975) {
                                var239.field2949 = -1;
                            }
                            if (var239.field2984 != -1 && class424.field5503 == var239.field2975) {
                                int var249 = class91.field1202.method986(var239.field2984, false).field4173;
                                if (var249 != -1) {
                                    class348 var250 = class552.field7163.method3031(-107, var249);
                                    if (var250 != null && var250.field4463 != null) {
                                        class451.method2548(var250, var239.field508, var239.field503, var239.field506, 255, false, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if ((var224 >> 28) != 0) {
                int var253 = var224 & 0xFFFF;
                class193 var254;
                if (class353.field4536 == var253) {
                    var254 = class233.field3130;
                } else {
                    var254 = class592.field8019[var253];
                }
                if (var254 != null) {
                    if (var227 == 65535) {
                        var227 = -1;
                    }
                    boolean var255 = true;
                    int var256 = var229 ? var254.field3006 : var254.field2984;
                    if (var227 != -1 && var256 != -1) {
                        if (var227 == var256) {
                            class322 var261 = class91.field1202.method986(var227, false);
                            if (var261.field4166 && var261.field4173 != -1) {
                                class348 var262 = class552.field7163.method3031(arg0 + 2345, var261.field4173);
                                int var263 = var262.field4447;
                                if (var263 == 0 || var263 == 2) {
                                    var255 = false;
                                } else if (var263 == 1) {
                                    var255 = true;
                                }
                            }
                        } else {
                            class322 var257 = class91.field1202.method986(var227, false);
                            class322 var258 = class91.field1202.method986(var256, false);
                            if (var257.field4173 != -1 && var258.field4173 != -1) {
                                class348 var259 = class552.field7163.method3031(49, var257.field4173);
                                class348 var260 = class552.field7163.method3031(59, var258.field4173);
                                if (var260.field4466 > var259.field4466) {
                                    var255 = false;
                                }
                            }
                        }
                    }
                    if (var255) {
                        if (var229) {
                            var254.field2969 = 0;
                            var254.field3022 = var225 & 0x7;
                            var254.field2981 = var226;
                            var254.field3026 = 0;
                            var254.field3019 = class424.field5503 + var228;
                            var254.field3006 = var227;
                            var254.field3023 = 1;
                            if (var254.field3019 > class424.field5503) {
                                var254.field3026 = -1;
                            }
                            if (var254.field3006 == 65535) {
                                var254.field3006 = -1;
                            }
                            if (var254.field3006 != -1 && class424.field5503 == var254.field3019) {
                                int var264 = class91.field1202.method986(var254.field3006, false).field4173;
                                if (var264 != -1) {
                                    class348 var265 = class552.field7163.method3031(-90, var264);
                                    if (var265 != null && var265.field4463 != null) {
                                        class451.method2548(var265, var254.field508, var254.field503, var254.field506, arg0 ^ 0xFFFFF7B3, class233.field3130 == var254, 0);
                                    }
                                }
                            }
                        } else {
                            var254.field2952 = 0;
                            var254.field2971 = var225 & 0x7;
                            var254.field2975 = class424.field5503 + var228;
                            var254.field2968 = var226;
                            var254.field2984 = var227;
                            var254.field2949 = 0;
                            var254.field2987 = 1;
                            if (var254.field2984 == 65535) {
                                var254.field2984 = -1;
                            }
                            if (class424.field5503 < var254.field2975) {
                                var254.field2949 = -1;
                            }
                            if (var254.field2984 != -1 && class424.field5503 == var254.field2975) {
                                int var266 = class91.field1202.method986(var254.field2984, false).field4173;
                                if (var266 != -1) {
                                    class348 var267 = class552.field7163.method3031(82, var266);
                                    if (var267 != null && var267.field4463 != null) {
                                        class451.method2548(var267, var254.field508, var254.field503, var254.field506, 255, class233.field3130 == var254, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class159.field1991 = null;
            return true;
        } else if (class350.field4479 == class159.field1991) {
            class230.field3069.field5367 += 28;
            if (class230.field3069.method2378((byte) -127)) {
                class136.method989(class230.field3069.field5367 - 28, 16, class230.field3069);
            }
            class159.field1991 = null;
            return true;
        } else if (class253.field3449 == class159.field1991) {
            int var268 = class230.field3069.method2396(-124);
            int var269 = class230.field3069.method2390((byte) 111);
            class397.field5054.method1721(var269, arg0 ^ 0xFFFFCD30, var268);
            class159.field1991 = null;
            return true;
        } else if (class297.field3887 == class159.field1991) {
            class105.method781(class389.field4983, (byte) 75);
            class159.field1991 = null;
            return true;
        } else if (class159.field1991 == class12.field125) {
            int var270 = class230.field3069.method2399(true);
            int var271 = class230.field3069.method2355(95);
            int var272 = class230.field3069.method2396(54);
            if (class522.method2803(-70, var270)) {
                class114.method863(var271, arg0 - 9015, var272);
            }
            class159.field1991 = null;
            return true;
        } else if (class78.field1054 == class159.field1991) {
            class602.field8102 = class230.field3069.method2384(arg0 ^ 0xFFFF88B3) << 3;
            class656.field9160 = class230.field3069.method2405((byte) 124);
            class178.field2200 = class230.field3069.method2381(arg0 + 2102) << 3;
            for (class37 var273 = (class37) class197.field2589.method42((byte) 104); var273 != null; var273 = (class37) class197.field2589.method40(false)) {
                int var275 = (int) (var273.field5499 >> 28 & 0x3L);
                int var276 = (int) (var273.field5499 & 0x3FFFL);
                int var277 = var276 - class100.field1326;
                int var278 = (int) (var273.field5499 >> 14 & 0x3FFFL);
                int var279 = var278 - class186.field2376;
                if (class656.field9160 == var275 && var277 >= class178.field2200 && class178.field2200 + 8 > var277 && class602.field8102 <= var279 && var279 < (class602.field8102 + 8)) {
                    var273.method2438((byte) -86);
                    if (var277 >= 0 && var279 >= 0 && var277 < class611.field8258 && var279 < class656.field9155) {
                        class210.method1353(var279, var277, 65535, class656.field9160);
                    }
                }
            }
            for (class549 var274 = (class549) class354.field4574.method2090(true); var274 != null; var274 = (class549) class354.field4574.method2088(-152)) {
                if (class178.field2200 <= var274.field7116 && var274.field7116 < (class178.field2200 + 8) && var274.field7125 >= class602.field8102 && var274.field7125 < (class602.field8102 + 8) && class656.field9160 == var274.field7123) {
                    var274.field7121 = 0;
                }
            }
            class159.field1991 = null;
            return true;
        } else if (class701.field9781 == class159.field1991) {
            int var280 = class230.field3069.method2390((byte) 102);
            int var281 = class230.field3069.method2390((byte) 117);
            byte var282 = class230.field3069.method2381(-117);
            if (class522.method2803(arg0 + 2124, var281)) {
                class17.method98(false, var282, var280);
            }
            class159.field1991 = null;
            return true;
        } else if (class159.field1991 == class109.field1414) {
            int var283 = class230.field3069.method2393(-30727);
            int var284 = class230.field3069.method2393(-30727);
            int var285 = class230.field3069.method2390((byte) 118);
            int var286 = class230.field3069.method2355(arg0 ^ 0xFFFFF700);
            int var287 = class230.field3069.method2399(true);
            if (class522.method2803(-119, var285)) {
                class304.method1795(var284, 7, var287 | var283 << 16, var286, false);
            }
            class159.field1991 = null;
            return true;
        } else if (class46.field638 == class159.field1991) {
            class364.field4701 = class230.field3069.method2413((byte) -102);
            class681.field9384 = class230.field3069.method2413((byte) -119);
            class159.field1991 = null;
            return true;
        } else if (class159.field1991 == class136.field1791) {
            int var288 = class230.field3069.method2396(-14);
            int var289 = class230.field3069.method2396(91);
            int var290 = class230.field3069.method2399(true);
            if (var290 == 65535) {
                var290 = -1;
            }
            String var291 = class230.field3069.method2394(4);
            if (var289 >= 1 && var289 <= 8) {
                if (var291.equalsIgnoreCase("null")) {
                    var291 = null;
                }
                class428.field5544[var289 - 1] = var291;
                class704.field9811[var289 - 1] = var290;
                class652.field9069[var289 - 1] = var288 == 0;
            }
            class159.field1991 = null;
            return true;
        } else if (class594.field8023 == class159.field1991) {
            int var292 = class230.field3069.method2393(arg0 - 28499);
            int var293 = class230.field3069.method2396(-104);
            boolean var294 = (var293 & 0x1) == 1;
            class60.method510(var292, var294, 13063);
            int var295 = class230.field3069.method2393(-30727);
            for (int var296 = 0; var296 < var295; var296++) {
                int var297 = class230.field3069.method2363(-122);
                if (var297 == 255) {
                    var297 = class230.field3069.method2412(arg0 + 2483);
                }
                int var298 = class230.field3069.method2379((byte) -123);
                class203.method1320(var297, var298 - 1, var294, 30768, var296, var292);
            }
            class188.field2418[class597.method3238(31, class237.field3192++)] = var292;
            class159.field1991 = null;
            return true;
        } else if (class159.field1991 == class129.field1648) {
            class105.method781(class337.field4361, (byte) 75);
            class159.field1991 = null;
            return true;
        } else if (class283.field3688 == class159.field1991) {
            int var299 = class230.field3069.method2390((byte) 117);
            if (var299 == 65535) {
                var299 = -1;
            }
            int var300 = class230.field3069.method2399(true);
            int var301 = class230.field3069.method2355(116);
            if (class522.method2803(arg0 ^ 0x8DE, var300)) {
                class304.method1795(-1, 2, var299, var301, false);
            }
            class159.field1991 = null;
            return true;
        } else if (class254.field3457 == class159.field1991) {
            class105.method781(class298.field3898, (byte) 75);
            class159.field1991 = null;
            return true;
        } else if (class380.field4886 == class159.field1991) {
            boolean var302 = class230.field3069.method2396(94) == 1;
            String var303 = class230.field3069.method2394(4);
            String var304 = var303;
            if (var302) {
                var304 = class230.field3069.method2394(4);
            }
            int var305 = class230.field3069.method2396(28);
            int var306 = class230.field3069.method2393(-30727);
            boolean var307 = false;
            if (var305 <= 1 && class336.method1924((byte) 126, var304)) {
                var307 = true;
            }
            if (!var307 && class225.field2930 == 0) {
                String var308 = class196.field2553.method24(var306, arg0 + 34995).method248(1, class230.field3069);
                if (var305 == 2) {
                    class647.method3562(0, null, 8192, var308, var306, "<img=1>" + var303, "<img=1>" + var304, 25, var303);
                } else if (var305 == 1) {
                    class647.method3562(0, null, 8192, var308, var306, "<img=0>" + var303, "<img=0>" + var304, 25, var303);
                } else {
                    class647.method3562(0, null, 8192, var308, var306, var303, var304, 25, var303);
                }
            }
            class159.field1991 = null;
            return true;
        } else if (class679.field9366 == class159.field1991) {
            class105.method781(class679.field9360, (byte) 75);
            class159.field1991 = null;
            return true;
        } else if (class407.field5181 == class159.field1991) {
            int var309 = class230.field3069.method2355(65);
            class100.field1323 = class688.field9413.method1049(var309, -16719);
            class159.field1991 = null;
            return true;
        } else if (class658.field9174 == class159.field1991) {
            boolean var310 = class230.field3069.method2396(-128) == 1;
            String var311 = class230.field3069.method2394(4);
            String var312 = var311;
            if (var310) {
                var312 = class230.field3069.method2394(4);
            }
            long var313 = (long) class230.field3069.method2393(-30727);
            long var315 = (long) class230.field3069.method2364(-62);
            int var317 = class230.field3069.method2396(-105);
            long var318 = (var313 << 32) + var315;
            boolean var320 = false;
            int var321 = 0;
            while (true) {
                if (var321 >= 100) {
                    if (var317 <= 1) {
                        if (!(!class578.field7883 || class282.field3678) || class597.field8076) {
                            var320 = true;
                        } else if (class336.method1924((byte) 127, var312)) {
                            var320 = true;
                        }
                    }
                    break;
                }
                if (class460.field6034[var321] == var318) {
                    var320 = true;
                    break;
                }
                var321++;
            }
            if (!var320 && class225.field2930 == 0) {
                class460.field6034[class656.field9161] = var318;
                class656.field9161 = (class656.field9161 + 1) % 100;
                String var322 = class442.method2507(class568.method3039(class230.field3069, false), -14);
                if (var317 == 2) {
                    class647.method3562(0, null, 8192, var322, -1, "<img=1>" + var311, "<img=1>" + var312, 7, var311);
                } else if (var317 == 1) {
                    class647.method3562(0, null, 8192, var322, -1, "<img=0>" + var311, "<img=0>" + var312, 7, var311);
                } else {
                    class647.method3562(0, null, 8192, var322, -1, var311, var312, 3, var311);
                }
            }
            class159.field1991 = null;
            return true;
        } else if (class571.field7447 == class159.field1991) {
            int var323 = class230.field3069.method2379((byte) -101);
            int var324 = class230.field3069.method2402(arg0 ^ 0x3D4DCC04);
            int var325 = class230.field3069.method2390((byte) 122);
            int var326 = class230.field3069.method2393(-30727);
            if (class522.method2803(-57, var326)) {
                class216.method1384(var324, (var323 << 16) + var325, (byte) 111);
            }
            class159.field1991 = null;
            return true;
        } else if (class159.field1991 == class141.field1860) {
            int var327 = class230.field3069.method2393(arg0 ^ 0x70B5);
            int var328 = class230.field3069.method2380(2);
            int var329 = class230.field3069.method2412(255);
            if (class522.method2803(-81, var327)) {
                class535.method2849(var328, var329, (byte) 109);
            }
            class159.field1991 = null;
            return true;
        } else if (class426.field5524 == class159.field1991) {
            class703.field9804 = class230.field3069.method2396(arg0 ^ 0x8B0);
            for (int var330 = 0; var330 < class703.field9804; var330++) {
                class408.field5236[var330] = class230.field3069.method2394(4);
                class379.field4851[var330] = class230.field3069.method2394(4);
                if (class379.field4851[var330].equals("")) {
                    class379.field4851[var330] = class408.field5236[var330];
                }
                class580.field7903[var330] = class230.field3069.method2394(4);
                class329.field4285[var330] = class230.field3069.method2394(4);
                if (class329.field4285[var330].equals("")) {
                    class329.field4285[var330] = class580.field7903[var330];
                }
                class185.field2367[var330] = false;
            }
            class159.field1991 = null;
            class352.field4527 = class166.field2089;
            return true;
        } else if (class483.field6433 == class159.field1991) {
            int var331 = class230.field3069.method2402(arg0 ^ 0x3D4DCC04);
            int var332 = class230.field3069.method2355(53);
            int var333 = class230.field3069.method2399(true);
            if (class522.method2803(-72, var333)) {
                class270 var334 = (class270) class700.field9763.method39((long) var331, 31750);
                class270 var335 = (class270) class700.field9763.method39((long) var332, arg0 + 33978);
                if (var335 != null) {
                    class298.method1764(false, -113, var334 == null || var334.field3588 != var335.field3588, var335);
                }
                if (var334 != null) {
                    var334.method2438((byte) -115);
                    class700.field9763.method38(var334, arg0 ^ 0xFFFFF740, (long) var332);
                }
                class477 var336 = class600.method3268(127, var331);
                if (var336 != null) {
                    class386.method2199(var336, false);
                }
                class477 var337 = class600.method3268(-63, var332);
                if (var337 != null) {
                    class386.method2199(var337, false);
                    class133.method965(arg0 ^ 0x8EBF17BC, true, var337);
                }
                if (class196.field2562 != -1) {
                    class491.method2685(1, arg0 + 4854, class196.field2562);
                }
            }
            class159.field1991 = null;
            return true;
        } else {
            if (arg0 != -2228) {
                method3035(null, 21, -103, 26, null);
            }
            if (class626.field8752 == class159.field1991) {
                boolean var338 = class230.field3069.method2396(arg0 ^ 0x8D6) == 1;
                String var339 = class230.field3069.method2394(arg0 + 2232);
                String var340 = var339;
                if (var338) {
                    var340 = class230.field3069.method2394(4);
                }
                long var341 = class230.field3069.method2377(-605269408);
                long var343 = (long) class230.field3069.method2393(-30727);
                long var345 = (long) class230.field3069.method2364(arg0 + 2144);
                int var347 = class230.field3069.method2396(-115);
                long var348 = (var343 << 32) + var345;
                boolean var350 = false;
                int var351 = 0;
                while (true) {
                    if (var351 >= 100) {
                        if (var347 <= 1) {
                            if (!(!class578.field7883 || class282.field3678) || class597.field8076) {
                                var350 = true;
                            } else if (class336.method1924((byte) 127, var340)) {
                                var350 = true;
                            }
                        }
                        break;
                    }
                    if (class460.field6034[var351] == var348) {
                        var350 = true;
                        break;
                    }
                    var351++;
                }
                if (!var350 && class225.field2930 == 0) {
                    class460.field6034[class656.field9161] = var348;
                    class656.field9161 = (class656.field9161 + 1) % 100;
                    String var352 = class442.method2507(class568.method3039(class230.field3069, false), -14);
                    if (var347 == 2 || var347 == 3) {
                        class647.method3562(0, class283.method1694(0, var341), 8192, var352, -1, "<img=1>" + var339, "<img=1>" + var340, 9, var339);
                    } else if (var347 == 1) {
                        class647.method3562(0, class283.method1694(arg0 ^ 0xFFFFF74C, var341), 8192, var352, -1, "<img=0>" + var339, "<img=0>" + var340, 9, var339);
                    } else {
                        class647.method3562(0, class283.method1694(0, var341), 8192, var352, -1, var339, var340, 9, var339);
                    }
                }
                class159.field1991 = null;
                return true;
            } else if (class260.field3504 == class159.field1991) {
                int var353 = class230.field3069.method2379((byte) -106);
                if (var353 == 65535) {
                    var353 = -1;
                }
                int var354 = class230.field3069.method2393(arg0 ^ 0x70B5);
                int var355 = class230.field3069.method2393(-30727);
                if (var355 == 65535) {
                    var355 = -1;
                }
                int var356 = class230.field3069.method2355(97);
                int var357 = class230.field3069.method2402(-1028506808);
                if (class522.method2803(arg0 ^ 0x8F1, var354)) {
                    for (int var358 = var355; var358 <= var353; var358++) {
                        long var359 = ((long) var357 << 32) + ((long) var358);
                        class162 var361 = (class162) class691.field9442.method39(var359, 31750);
                        class162 var362;
                        if (var361 != null) {
                            var362 = new class162(var356, var361.field2018);
                            var361.method2438((byte) -108);
                        } else if (var358 == -1) {
                            var362 = new class162(var356, class600.method3268(116, var357).field6304.field2018);
                        } else {
                            var362 = new class162(var356, -1);
                        }
                        class691.field9442.method38(var362, -13, var359);
                    }
                }
                class159.field1991 = null;
                return true;
            } else if (class311.field4039 == class159.field1991) {
                int var363 = class230.field3069.method2363(-116);
                int var364 = class230.field3069.method2390((byte) 125);
                int var365 = class230.field3069.method2393(arg0 ^ 0x70B5);
                if (class522.method2803(-108, var364)) {
                    if (var363 == 2) {
                        class693.method3775(-72);
                    }
                    class196.field2562 = var365;
                    class388.method2221(var365, (byte) -50);
                    class380.method2169(true, false);
                    class709.method3890(class196.field2562);
                    for (int var366 = 0; var366 < 100; var366++) {
                        class53.field719[var366] = true;
                    }
                }
                class159.field1991 = null;
                return true;
            } else if (class41.field576 == class159.field1991) {
                int var367 = class230.field3069.method2393(-30727);
                int var368 = class230.field3069.method2363(arg0 + 2239);
                int var369 = class230.field3069.method2412(255);
                int var370 = class230.field3069.method2399(true);
                if (class522.method2803(-55, var367)) {
                    class270 var371 = (class270) class700.field9763.method39((long) var369, 31750);
                    if (var371 != null) {
                        class298.method1764(false, arg0 + 2137, var371.field3588 != var370, var371);
                    }
                    class529.method2817(var369, var370, false, false, var368);
                }
                class159.field1991 = null;
                return true;
            } else if (class435.field5641 == class159.field1991) {
                class656.field9160 = class230.field3069.method2405((byte) 127);
                class602.field8102 = class230.field3069.method2384(32767) << 3;
                class178.field2200 = class230.field3069.method2381(127) << 3;
                while (class88.field1169 > class230.field3069.field5367) {
                    class285 var372 = class593.method3223(108)[class230.field3069.method2396(-111)];
                    class105.method781(var372, (byte) 75);
                }
                class159.field1991 = null;
                return true;
            } else if (class72.field993 == class159.field1991) {
                class105.method781(class275.field3609, (byte) 75);
                class159.field1991 = null;
                return true;
            } else if (class556.field7270 == class159.field1991) {
                for (int var373 = 0; var373 < class592.field8019.length; var373++) {
                    if (class592.field8019[var373] != null) {
                        class592.field8019[var373].field2979 = null;
                        class592.field8019[var373].field3021 = -1;
                    }
                }
                for (int var374 = 0; var374 < class480.field6406; var374++) {
                    class93.field1230[var374].field3131.field2979 = null;
                    class93.field1230[var374].field3131.field3021 = -1;
                }
                class159.field1991 = null;
                return true;
            } else if (class461.field6050 == class159.field1991) {
                int var375 = class230.field3069.method2355(84);
                int var376 = class230.field3069.method2379((byte) -118);
                int var377 = class230.field3069.method2393(arg0 ^ 0x70B5);
                if (var377 == 65535) {
                    var377 = -1;
                }
                int var378 = class230.field3069.method2399(true);
                int var379 = class230.field3069.method2393(-30727);
                if (var379 == 65535) {
                    var379 = -1;
                }
                if (class522.method2803(-75, var378)) {
                    for (int var380 = var377; var380 <= var379; var380++) {
                        long var381 = ((long) var375 << 32) + (long) var380;
                        class162 var383 = (class162) class691.field9442.method39(var381, arg0 ^ 0xFFFF8B4A);
                        class162 var384;
                        if (var383 != null) {
                            var384 = new class162(var383.field2020, var376);
                            var383.method2438((byte) 109);
                        } else if (var380 == -1) {
                            var384 = new class162(class600.method3268(-90, var375).field6304.field2020, var376);
                        } else {
                            var384 = new class162(0, var376);
                        }
                        class691.field9442.method38(var384, -126, var381);
                    }
                }
                class159.field1991 = null;
                return true;
            } else if (class159.field1991 == class143.field1875) {
                int var385 = class230.field3069.method2396(-118);
                if (class230.field3069.method2396(-126) == 0) {
                    class8.field85[var385] = new class160();
                } else {
                    class230.field3069.field5367--;
                    class8.field85[var385] = new class160(class230.field3069);
                }
                class346.field4423 = class166.field2089;
                class159.field1991 = null;
                return true;
            } else if (class166.field2082 == class159.field1991) {
                int var386 = class230.field3069.method2363(96);
                int var387 = class230.field3069.method2405((byte) 125);
                if (var387 == 255) {
                    var386 = -1;
                    var387 = -1;
                }
                class294.method1738((byte) 83, var386, var387);
                class159.field1991 = null;
                return true;
            } else if (class665.field9228 == class159.field1991) {
                int var388 = class230.field3069.method2355(126);
                int var389 = class230.field3069.method2399(true);
                int var390 = class230.field3069.method2393(arg0 - 28499);
                if (class522.method2803(-98, var389)) {
                    class691.method3761(arg0 + 2100, var390, var388);
                }
                class159.field1991 = null;
                return true;
            } else if (class190.field2425 == class159.field1991) {
                int var391 = class230.field3069.method2405((byte) 126);
                int var392 = class230.field3069.method2393(-30727);
                int[] var393 = new int[4];
                for (int var394 = 0; var394 < 4; var394++) {
                    var393[var394] = class230.field3069.method2393(-30727);
                }
                class234 var395 = (class234) class505.field6640.method39((long) var392, 31750);
                if (var395 != null) {
                    class232.method1473(true, var393, var395.field3131, var391);
                }
                class159.field1991 = null;
                return true;
            } else if (class276.field3622 == class159.field1991) {
                int var396 = class230.field3069.method2393(arg0 - 28499);
                int var397 = class230.field3069.method2396(-126);
                int var398 = class230.field3069.method2396(arg0 + 2119);
                int var399 = class230.field3069.method2396(-128);
                int var400 = class230.field3069.method2396(-5);
                int var401 = class230.field3069.method2393(-30727);
                if (class522.method2803(-97, var396)) {
                    class86.field1150[var397] = true;
                    class522.field6812[var397] = var398;
                    class288.field3722[var397] = var399;
                    class388.field4969[var397] = var400;
                    class433.field5583[var397] = var401;
                }
                class159.field1991 = null;
                return true;
            } else if (class645.field8975 == class159.field1991) {
                int var402 = class230.field3069.method2396(arg0 ^ 0x8AA);
                boolean var403 = (var402 & 0x1) == 1;
                String var404 = class230.field3069.method2394(4);
                String var405 = class230.field3069.method2394(4);
                if (var405.equals("")) {
                    var405 = var404;
                }
                String var406 = class230.field3069.method2394(4);
                String var407 = class230.field3069.method2394(4);
                if (var407.equals("")) {
                    var407 = var406;
                }
                if (var403) {
                    for (int var408 = 0; var408 < class703.field9804; var408++) {
                        if (class379.field4851[var408].equals(var407)) {
                            class408.field5236[var408] = var404;
                            class379.field4851[var408] = var405;
                            class580.field7903[var408] = var406;
                            class329.field4285[var408] = var407;
                            break;
                        }
                    }
                } else {
                    class408.field5236[class703.field9804] = var404;
                    class379.field4851[class703.field9804] = var405;
                    class580.field7903[class703.field9804] = var406;
                    class329.field4285[class703.field9804] = var407;
                    class185.field2367[class703.field9804] = class597.method3238(2, var402) == 2;
                    class703.field9804++;
                }
                class352.field4527 = class166.field2089;
                class159.field1991 = null;
                return true;
            } else if (class159.field1991 == class13.field141) {
                class82.method635(true, -127);
                class159.field1991 = null;
                return true;
            } else if (class168.field2099 == class159.field1991) {
                class588.method3212((byte) -78, class230.field3069, class688.field9413, class88.field1169);
                class159.field1991 = null;
                return true;
            } else if (class38.field549 == class159.field1991) {
                int var409 = class230.field3069.method2393(arg0 ^ 0x70B5);
                if (var409 == 65535) {
                    var409 = -1;
                }
                int var410 = class230.field3069.method2396(-125);
                int var411 = class230.field3069.method2393(arg0 ^ 0x70B5);
                int var412 = class230.field3069.method2396(-108);
                class285.method1700(var410, var409, (byte) 118, var411, false, var412);
                class159.field1991 = null;
                return true;
            } else if (class588.field7989 == class159.field1991) {
                class159.field1991 = null;
                class532.field6926 = 1;
                class352.field4527 = class166.field2089;
                return true;
            } else if (class665.field9233 == class159.field1991) {
                class105.method781(class158.field1979, (byte) 75);
                class159.field1991 = null;
                return true;
            } else if (class168.field2097 == class159.field1991) {
                int var413 = class230.field3069.method2406((byte) 40);
                int var414 = class230.field3069.method2379((byte) -100);
                class397.field5054.method1720(0, var414, var413);
                class159.field1991 = null;
                return true;
            } else if (class59.field802 == class159.field1991) {
                if (class61.method517((byte) 81, class566.field7391)) {
                    class112.field1466 = (int) ((float) class230.field3069.method2393(arg0 ^ 0x70B5) * 2.5F);
                } else {
                    class112.field1466 = class230.field3069.method2393(-30727) * 30;
                }
                class149.field1924 = class166.field2089;
                class159.field1991 = null;
                return true;
            } else if (class480.field6403 == class159.field1991) {
                int var415 = class230.field3069.method2390((byte) 125);
                if (var415 == 65535) {
                    var415 = -1;
                }
                int var416 = class230.field3069.method2406((byte) 40);
                int var417 = (var416 & 0x3A2CA23C) >> 28;
                int var418 = var416 >> 14 & 0x3FFF;
                int var419 = var416 & 0x3FFF;
                int var420 = class230.field3069.method2413((byte) -115);
                int var421 = var420 >> 2;
                int var422 = var420 & 0x3;
                int var423 = var418 - class100.field1326;
                int var424 = class367.field4731[var421];
                int var425 = var419 - class186.field2376;
                class550.method2912(true, var423, var417, var421, var422, var415, var424, var425);
                class159.field1991 = null;
                return true;
            } else {
                class698.method3809("T1 - " + (class159.field1991 == null ? -1 : class159.field1991.method2071(-103)) + "," + (class455.field5941 == null ? -1 : class455.field5941.method2071(-115)) + "," + (class703.field9808 == null ? -1 : class703.field9808.method2071(arg0 + 2155)) + " - " + class88.field1169, (byte) 121, null);
                class250.method1577(3, false);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)Lwk;", line = 3367)
    public static final class227 method3033(int arg0, int arg1, int arg2, int arg3) {
        field7405++;
        class530 var4 = class483.field6438[arg0][arg2][arg3];
        if (var4 == null) {
            return null;
        }
        class227 var5 = null;
        int var6 = -1;
        class571 var7 = var4.field6887;
        if (arg1 != 256) {
            method3030((byte) 68);
        }
        while (var7 != null) {
            class34 var8 = var7.field7444;
            if (var8 instanceof class227) {
                class227 var9 = (class227) var8;
                int var10 = (var9.method1265(arg1 - 129) - 1) * 256 + 252;
                int var11 = var9.field506 - var10 >> 9;
                int var12 = var9.field503 - var10 >> 9;
                int var13 = var9.field506 + var10 >> 9;
                int var14 = var9.field503 + var10 >> 9;
                if (var11 <= arg2 && var12 <= arg3 && arg2 <= var13 && var14 >= arg3) {
                    int var15 = (var14 + 1 - arg3) * (var13 + 1 - arg2);
                    if (var6 < var15) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
            var7 = var7.field7445;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)Lga;", line = 3428)
    public final class63 method3034(int arg0, int arg1) {
        field7400++;
        class668 var3 = this.field7408;
        class63 var4;
        synchronized (this.field7408) {
            var4 = (class63) this.field7408.method3655(-108, (long) arg1);
            if (var4 == null) {
                var4 = new class63(arg1);
                this.field7408.method3650((long) arg1, -104, var4);
            }
            if (arg0 > -10) {
                this.method3036(-60);
            }
        }
        synchronized (var4) {
            return var4.method529(false) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lw;III[Z)V", line = 3455)
    public static final void method3035(class605 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class477.field6327 == class392.field4997) {
            return;
        }
        int var5 = class353.field4540[arg1].method669(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class88 var7 = class353.field4540[var6];
                if (var7 != null) {
                    var7.method667(arg0, arg2, var5 - var7.method669(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V", line = 3487)
    public final void method3036(int arg0) {
        field7402++;
        class668 var2 = this.field7407;
        synchronized (this.field7407) {
            this.field7407.method3658(0);
            if (arg0 <= 27) {
                this.method3031(-52, -25);
            }
        }
        class668 var3 = this.field7408;
        synchronized (this.field7408) {
            this.field7408.method3658(0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lvd;ILpe;Lpe;Lpe;)V", line = 3513)
    public class567(class635 arg0, int arg1, class615 arg2, class615 arg3, class615 arg4) {
        this.field7406 = arg2;
        if (this.field7406 != null) {
            int var6 = this.field7406.method3366(-117) - 1;
            this.field7406.method3341(var6, -19046);
        }
        class35.method274(arg4, (byte) 14, 2, arg3);
    }
}
