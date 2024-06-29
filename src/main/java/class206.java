import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class206 {

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Lm;")
    private class179 field3015 = new class179();

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "[I")
    public static int[] field3025 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field3027 = -1;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "Z")
    public static boolean field3020 = true;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "Lm;")
    private class179 field3030;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V", line = 7)
    public static void method1554(byte arg0) {
        field3025 = null;
        if (arg0 != 35) {
            field3027 = 11;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Lml;", line = 17)
    public static final class451 method1555(int arg0, int arg1) {
        field3024++;
        class451 var2 = (class451) class376.field5322.method103(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class292.field4338.method1355(arg0, -12607, arg1);
        class451 var4 = new class451();
        if (var3 != null) {
            var4.method2806(new class37(var3), arg0, (byte) 97);
        }
        var4.method2807((byte) 89, arg0);
        class376.field5322.method113(var4, 0, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lm;ILm;)V", line = 40)
    public static final void method1556(class179 arg0, int arg1, class179 arg2) {
        if (arg2.field2665 != null) {
            arg2.method1398(110);
        }
        if (arg1 != 569) {
            method1555(-108, 122);
        }
        field3017++;
        arg2.field2665 = arg0;
        arg2.field2664 = arg0.field2664;
        arg2.field2665.field2664 = arg2;
        arg2.field2664.field2665 = arg2;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 59)
    public final void method1557(int arg0) {
        field3019++;
        if (arg0 != 1) {
            field3025 = null;
        }
        while (true) {
            class179 var2 = this.field3015.field2664;
            if (this.field3015 == var2) {
                this.field3030 = null;
                return;
            }
            var2.method1398(110);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)Lm;", line = 88)
    public final class179 method1558(int arg0) {
        if (arg0 != -2) {
            return null;
        }
        field3018++;
        class179 var2 = this.field3015.field2664;
        if (this.field3015 == var2) {
            return null;
        } else {
            var2.method1398(110);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)I", line = 107)
    public final int method1559(byte arg0) {
        field3026++;
        int var2 = 0;
        if (arg0 != 95) {
            return 47;
        }
        class179 var3 = this.field3015.field2664;
        while (this.field3015 != var3) {
            var3 = var3.field2664;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIZ)V", line = 131)
    public static final void method1560(int arg0, int arg1, boolean arg2) {
        field3021++;
        class221 var3 = class447.method2795(1, (byte) -49, arg1);
        var3.method1692(0);
        if (arg2) {
            method1561(-81, -74);
        }
        var3.field3297 = arg0;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)Lnq;", line = 146)
    public static final class124 method1561(int arg0, int arg1) {
        field3016++;
        class18 var2 = class168.field2483;
        class124 var4;
        synchronized (class168.field2483) {
            int var3 = 106 / ((21 - arg0) / 59);
            var4 = (class124) class168.field2483.method103(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = class439.field6388.method1355(class237.method1727(arg1, (byte) 13), -12607, class391.method2486(arg1, 1808545736));
        class124 var6 = new class124();
        var6.field1974 = arg1;
        if (var5 != null) {
            var6.method1050(new class37(var5), (byte) -39);
        }
        var6.method1055((byte) 40);
        if (var6.field1957 != -1) {
            var6.method1044((byte) -114, method1561(-55, var6.field1973), method1561(85, var6.field1957));
        }
        if (var6.field2034 != -1) {
            var6.method1054(false, method1561(122, var6.field2034), method1561(-80, var6.field1998));
        }
        if (!class308.field4506 && var6.field2001) {
            var6.field1999 = class234.field3393;
            var6.field2024 = class174.field2594;
            var6.field1976 = 0;
            var6.field1996 = class331.field4765;
            var6.field2021 = null;
            var6.field2017 = false;
        }
        class18 var7 = class168.field2483;
        synchronized (class168.field2483) {
            class168.field2483.method113(var6, 0, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 667)
    public class206() {
        this.field3015.field2664 = this.field3015;
        this.field3015.field2665 = this.field3015;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)Lm;", line = 202)
    public final class179 method1562(int arg0) {
        if (arg0 != -4) {
            method1563((byte) 96);
        }
        field3029++;
        class179 var2 = this.field3030;
        if (this.field3015 == var2) {
            this.field3030 = null;
            return null;
        } else {
            this.field3030 = var2.field2664;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V", line = 231)
    public static final void method1563(byte arg0) {
        if (arg0 >= -39) {
            field3014 = -55;
        }
        field3023++;
        if (class419.field6072 == 0 || class419.field6072 == 5) {
            return;
        }
        try {
            if ((++class394.field5758) > 2000) {
                if (class124.field2028 != null) {
                    class124.field2028.method1654(-21013);
                    class124.field2028 = null;
                }
                if (class256.field3704 >= 1) {
                    class419.field6072 = 0;
                    class11.field159 = -5;
                    return;
                }
                if (class86.field1396 == class250.field3621) {
                    class86.field1396 = class397.field5833;
                } else {
                    class86.field1396 = class250.field3621;
                }
                class394.field5758 = 0;
                class419.field6072 = 1;
                class256.field3704++;
            }
            if (class419.field6072 == 1) {
                class20.field296 = class188.field2783.method1383(class86.field1396, true, class447.field6515);
                class419.field6072 = 2;
            }
            if (class419.field6072 == 2) {
                if (class20.field296.field2121 == 2) {
                    throw new IOException();
                }
                if (class20.field296.field2121 != 1) {
                    return;
                }
                class124.field2028 = new class219((Socket) class20.field296.field2125, class188.field2783);
                class20.field296 = null;
                long var1 = class359.field5118 = class437.method2739(37, class441.field6409);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class13.field216.field565 = 0;
                class13.field216.method267(14, false);
                class13.field216.method267(var3, false);
                class124.field2028.method1653(class13.field216.field578, 3, 2, 0);
                if (class157.field2389 != null) {
                    class157.field2389.method2257(-17664);
                }
                if (class91.field1446 != null) {
                    class91.field1446.method2257(-17664);
                }
                int var4 = class124.field2028.method1662(1);
                if (class157.field2389 != null) {
                    class157.field2389.method2257(-17664);
                }
                if (class91.field1446 != null) {
                    class91.field1446.method2257(-17664);
                }
                if (var4 != 0) {
                    class11.field159 = var4;
                    class419.field6072 = 0;
                    class124.field2028.method1654(-21013);
                    class124.field2028 = null;
                    return;
                }
                class419.field6072 = 3;
            }
            if (class419.field6072 == 3) {
                if (class124.field2028.method1655(-10561) < 8) {
                    return;
                }
                class124.field2028.method1659(-88, class268.field4020.field578, 8, 0);
                class268.field4020.field565 = 0;
                class439.field6382 = class268.field4020.method315(-112);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), 0, 0 };
                class13.field216.field565 = 0;
                var5[2] = (int) (class439.field6382 >> 32);
                var5[3] = (int) class439.field6382;
                class13.field216.method267(10, false);
                class13.field216.method275(var5[0], 1414495172);
                class13.field216.method275(var5[1], 1414495172);
                class13.field216.method275(var5[2], 1414495172);
                class13.field216.method275(var5[3], 1414495172);
                class13.field216.method269(81, class437.method2739(37, class441.field6409));
                class13.field216.method265((byte) -47, class422.field6148);
                class13.field216.method303(22, class367.field5223, class372.field5276);
                class48.field782.field565 = 0;
                if (class240.field3463 == 40) {
                    class48.field782.method267(18, false);
                } else {
                    class48.field782.method267(16, false);
                }
                class48.field782.method324(161 - (-class13.field216.field565 - class429.method2677(class170.field2531, 1)), -103);
                class48.field782.method275(558, 1414495172);
                class48.field782.method267(class106.field1752, false);
                class48.field782.method267(class285.method2015(6071), false);
                class48.field782.method324(class113.field1819, -61);
                class48.field782.method324(class277.field4170, -122);
                class48.field782.method267(class319.field4614, false);
                class345.method2229((byte) -109, class48.field782);
                class48.field782.method265((byte) -64, class170.field2531);
                class48.field782.method275(class351.field4986, 1414495172);
                class48.field782.method275(class16.method94(false), 1414495172);
                class196.field2870 = true;
                class48.field782.method324(class51.field826, -79);
                class48.field782.method275(class362.field5159.method1327((byte) -124), 1414495172);
                class48.field782.method275(class399.field5867.method1327((byte) -120), 1414495172);
                class48.field782.method275(class217.field3222.method1327((byte) -99), 1414495172);
                class48.field782.method275(class240.field3469.method1327((byte) -95), 1414495172);
                class48.field782.method275(class176.field2622.method1327((byte) -115), 1414495172);
                class48.field782.method275(class119.field1862.method1327((byte) -94), 1414495172);
                class48.field782.method275(class446.field6501.method1327((byte) -109), 1414495172);
                class48.field782.method275(class270.field4043.method1327((byte) -115), 1414495172);
                class48.field782.method275(class100.field1561.method1327((byte) -127), 1414495172);
                class48.field782.method275(class446.field6488.method1327((byte) -101), 1414495172);
                class48.field782.method275(class74.field1282.method1327((byte) -120), 1414495172);
                class48.field782.method275(class151.field2312.method1327((byte) -105), 1414495172);
                class48.field782.method275(class132.field2126.method1327((byte) -103), 1414495172);
                class48.field782.method275(class275.field4139.method1327((byte) -106), 1414495172);
                class48.field782.method275(class109.field1780.method1327((byte) -106), 1414495172);
                class48.field782.method275(class273.field4105.method1327((byte) -117), 1414495172);
                class48.field782.method275(class238.field3425.method1327((byte) -103), 1414495172);
                class48.field782.method275(class361.field5141.method1327((byte) -122), 1414495172);
                class48.field782.method275(class247.field3585.method1327((byte) -120), 1414495172);
                class48.field782.method275(class40.field620.method1327((byte) -106), 1414495172);
                class48.field782.method275(class48.field783.method1327((byte) -98), 1414495172);
                class48.field782.method275(class28.field422.method1327((byte) -128), 1414495172);
                class48.field782.method275(class12.field208.method1327((byte) -116), 1414495172);
                class48.field782.method275(class49.field785.method1327((byte) -102), 1414495172);
                class48.field782.method275(class390.field5644.method1327((byte) -123), 1414495172);
                class48.field782.method275(class323.field4659.method1327((byte) -114), 1414495172);
                class48.field782.method275(class394.field5753.method1327((byte) -97), 1414495172);
                class48.field782.method275(class293.field4352.method1327((byte) -108), 1414495172);
                class48.field782.method275(class347.field4910.method1327((byte) -101), 1414495172);
                class48.field782.method313(0, class13.field216.field578, 25100, class13.field216.field565);
                class124.field2028.method1653(class48.field782.field578, 3, class48.field782.field565, 0);
                class13.field216.method2777(var5, false);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class268.field4020.method2777(var5, false);
                class419.field6072 = 4;
            }
            if (class419.field6072 == 4) {
                if (class124.field2028.method1655(-10561) < 1) {
                    return;
                }
                int var7 = class124.field2028.method1662(1);
                if (var7 == 21) {
                    class419.field6072 = 7;
                } else if (var7 == 29) {
                    class419.field6072 = 10;
                } else if (var7 == 1) {
                    class419.field6072 = 5;
                    class11.field159 = var7;
                    return;
                } else if (var7 == 2) {
                    class419.field6072 = 8;
                } else if (var7 == 15) {
                    class11.field159 = var7;
                    class419.field6072 = 0;
                    return;
                } else if (var7 == 23 && class256.field3704 < 1) {
                    class256.field3704++;
                    class394.field5758 = 0;
                    class419.field6072 = 1;
                    class124.field2028.method1654(-21013);
                    class124.field2028 = null;
                    return;
                } else {
                    class419.field6072 = 0;
                    class11.field159 = var7;
                    class124.field2028.method1654(-21013);
                    class124.field2028 = null;
                    return;
                }
            }
            if (class419.field6072 == 6) {
                class13.field216.field565 = 0;
                class13.field216.method2781(false, 17);
                class124.field2028.method1653(class13.field216.field578, 3, class13.field216.field565, 0);
                class419.field6072 = 4;
            } else if (class419.field6072 == 7) {
                if (class124.field2028.method1655(-10561) >= 1) {
                    class170.field2541 = (class124.field2028.method1662(1) + 3) * 60;
                    class419.field6072 = 0;
                    class11.field159 = 21;
                    class124.field2028.method1654(-21013);
                    class124.field2028 = null;
                }
            } else if (class419.field6072 != 10) {
                if (class419.field6072 == 8) {
                    if (class124.field2028.method1655(-10561) < 14) {
                        return;
                    }
                    class124.field2028.method1659(120, class268.field4020.field578, 14, 0);
                    class268.field4020.field565 = 0;
                    class289.field4315 = class268.field4020.method271((byte) 105);
                    class278.field4188 = class268.field4020.method271((byte) 108);
                    class223.field3313 = class268.field4020.method271((byte) 104) == 1;
                    class36.field509 = class268.field4020.method271((byte) 104) == 1;
                    class72.field1208 = class268.field4020.method271((byte) 123) == 1;
                    class198.field2892 = class268.field4020.method271((byte) 108) == 1;
                    class132.field2128 = class268.field4020.method271((byte) 125) == 1;
                    class379.field5381 = class268.field4020.method320((byte) -87);
                    class389.field5581 = class268.field4020.method271((byte) 127) == 1;
                    class121.field1908 = class268.field4020.method271((byte) 111) == 1;
                    class372.method2373(7, class121.field1908);
                    class265.method1891(class121.field1908, (byte) 0);
                    class378.method2401(-31660, class121.field1908);
                    if ((!class223.field3313 || class72.field1208) && !class389.field5581) {
                        try {
                            class412.method2587(class188.field2783.field2639, -74, "unzap");
                        } catch (Throwable var10) {
                        }
                    } else {
                        try {
                            class412.method2587(class188.field2783.field2639, -117, "zap");
                        } catch (Throwable var9) {
                        }
                    }
                    if (class360.field5124 == 0) {
                        try {
                            class412.method2587(class188.field2783.field2639, -115, "loggedin");
                        } catch (Throwable var8) {
                        }
                    }
                    class197.field2876 = class268.field4020.method2784(0);
                    class51.field824 = class268.field4020.method320((byte) -87);
                    class419.field6072 = 9;
                }
                if (class419.field6072 == 9 && class124.field2028.method1655(-10561) >= class51.field824) {
                    class268.field4020.field565 = 0;
                    class124.field2028.method1659(119, class268.field4020.field578, class51.field824, 0);
                    class419.field6072 = 0;
                    class11.field159 = 2;
                    class136.method1114(118);
                    class135.field2160 = -1;
                    class23.method160((byte) 54, false);
                    class197.field2876 = -1;
                }
            } else if (class124.field2028.method1655(-10561) >= 1) {
                class13.field219 = class124.field2028.method1662(1);
                class419.field6072 = 0;
                class11.field159 = 29;
                class124.field2028.method1654(-21013);
                class124.field2028 = null;
            }
        } catch (IOException var11) {
            if (class124.field2028 != null) {
                class124.field2028.method1654(-21013);
                class124.field2028 = null;
            }
            if (class256.field3704 < 1) {
                class256.field3704++;
                if (class86.field1396 == class250.field3621) {
                    class86.field1396 = class397.field5833;
                } else {
                    class86.field1396 = class250.field3621;
                }
                class394.field5758 = 0;
                class419.field6072 = 1;
            } else {
                class419.field6072 = 0;
                class11.field159 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BLm;)V", line = 614)
    public final void method1564(byte arg0, class179 arg1) {
        if (arg1.field2665 != null) {
            arg1.method1398(110);
        }
        field3022++;
        arg1.field2665 = this.field3015.field2665;
        arg1.field2664 = this.field3015;
        if (arg0 != 106) {
            this.field3015 = null;
        }
        arg1.field2665.field2664 = arg1;
        arg1.field2664.field2665 = arg1;
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)Lm;", line = 646)
    public final class179 method1565(int arg0) {
        if (arg0 != 1) {
            this.field3015 = null;
        }
        field3028++;
        class179 var2 = this.field3015.field2664;
        if (this.field3015 == var2) {
            this.field3030 = null;
            return null;
        } else {
            this.field3030 = var2.field2664;
            return var2;
        }
    }
}
