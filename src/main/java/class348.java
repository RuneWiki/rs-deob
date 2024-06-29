import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class348 {

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "Loo;")
    public class439 field5279 = new class439();

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "[I")
    public static int[] field5267 = new int[32];

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "[I")
    public static int[] field5281;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "Lgf;")
    public static class180 field5280;

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "Loo;")
    private class439 field5283;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)Loo;")
    public final class439 method2254(int arg0) {
        field5269++;
        class439 var2 = this.field5279.field6403;
        if (this.field5279 == var2) {
            return null;
        }
        if (arg0 != -8) {
            this.field5283 = null;
        }
        var2.method2663(-120);
        return var2;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIBI[B)V")
    public static final void method2255(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, byte[] arg6) {
        field5284++;
        if (arg1 > 0 && !class390.method2453(-2628, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class390.method2453(-2628, arg2)) {
            int var7 = class80.method645(-6408, arg0);
            int var8 = 0;
            int var9 = -23 / ((arg4 + 74) / 46);
            int var10 = arg2 > arg1 ? arg1 : arg2;
            int var11 = arg1 >> 1;
            int var12 = arg2 >> 1;
            byte[] var13 = arg6;
            byte[] var14 = new byte[var7 * var11 * var12];
            while (true) {
                OpenGL.glTexImage2Dub(arg5, var8, arg3, arg1, arg2, 0, arg0, 5121, var13, 0);
                if (var10 <= 1) {
                    return;
                }
                int var15 = arg1 * var7;
                byte[] var16 = var14;
                for (int var17 = 0; var17 < var7; var17++) {
                    int var18 = var17;
                    int var19 = var17;
                    int var20 = var15 + var17;
                    for (int var21 = 0; var21 < var12; var21++) {
                        for (int var22 = 0; var22 < var11; var22++) {
                            byte var23 = var13[var19];
                            int var24 = var7 + var19;
                            int var25 = var13[var24] + var23;
                            int var26 = var13[var20] + var25;
                            var19 = var7 + var24;
                            int var27 = var7 + var20;
                            int var28 = var13[var27] + var26;
                            var20 = var7 + var27;
                            var14[var18] = (byte) (var28 >> 2);
                            var18 += var7;
                        }
                        var19 += var15;
                        var20 += var15;
                    }
                }
                var14 = var13;
                arg1 = var11;
                arg2 = var12;
                var13 = var16;
                var12 >>= 0x1;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)Loo;")
    public final class439 method2256(int arg0) {
        field5266++;
        class439 var2 = this.field5283;
        int var3 = 26 % ((-arg0 - 12) / 38);
        if (this.field5279 == var2) {
            this.field5283 = null;
            return null;
        } else {
            this.field5283 = var2.field6403;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Loo;")
    public final class439 method2257(byte arg0) {
        if (arg0 <= 90) {
            field5285 = -6;
        }
        field5263++;
        class439 var2 = this.field5279.field6403;
        if (this.field5279 == var2) {
            this.field5283 = null;
            return null;
        } else {
            this.field5283 = var2.field6403;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Loo;Lko;I)V")
    private final void method2258(class439 arg0, class348 arg1, int arg2) {
        field5271++;
        class439 var4 = this.field5279.field6396;
        this.field5279.field6396 = arg0.field6396;
        int var5 = -4 % ((arg2 + 15) / 55);
        arg0.field6396.field6403 = this.field5279;
        if (this.field5279 != arg0) {
            arg0.field6396 = arg1.field5279.field6396;
            arg0.field6396.field6403 = arg0;
            var4.field6403 = arg1.field5279;
            arg1.field5279.field6396 = var4;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2259(int arg0, String arg1) {
        field5278++;
        if (arg1.equals("")) {
            return;
        }
        if (arg0 >= -29) {
            method2255(64, -31, 79, -104, (byte) 49, -25, null);
        }
        class169.field2535++;
        class114.method841(false, class271.field3926);
        class86.field1436.method1923((byte) 62, class8.method57(-100, arg1));
        class86.field1436.method1882((byte) -93, arg1);
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)Loo;")
    public final class439 method2260(int arg0) {
        if (arg0 != 2) {
            method2255(-7, -22, 31, -61, (byte) 49, 96, null);
        }
        field5270++;
        class439 var2 = this.field5279.field6396;
        if (this.field5279 == var2) {
            this.field5283 = null;
            return null;
        } else {
            this.field5283 = var2.field6396;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IBZ)V")
    public static final void method2261(int arg0, byte arg1, boolean arg2) {
        field5277++;
        if (arg0 == 0) {
            class394.field5821 = class162.method1179(class31.field503, -87, arg0, class397.field5830.field142 * 2, class112.field1785, class237.field3440);
        } else {
            if (arg2) {
                class394.field5821 = class162.method1179(class31.field503, -66, 0, 0, class112.field1785, class237.field3440);
                class394.field5821.method436(0);
                class12 var3 = class114.method842(-97, class420.field6181, 0, class490.field7147);
                class488 var4 = class394.field5821.method453(var3, class158.method1137(class460.field6798, class490.field7147, 0), true);
                class54.method392((byte) -67, true, class239.field3480.method1273(true, class370.field5530), var4);
                class394.field5821.method521();
                class248.method1582((byte) -23);
                class394.field5821.method1174(-1);
            }
            try {
                class394.field5821 = class162.method1179(class31.field503, -78, arg0, class397.field5830.field142 * 2, class112.field1785, class237.field3440);
                if (class394.field5821.method525()) {
                    class16 var5 = class394.field5821.method452(78643200);
                    class394.field5821.method449(var5);
                }
            } catch (Throwable var6) {
                arg0 = 0;
                class394.field5821 = class162.method1179(class31.field503, -4, 0, 0, class112.field1785, class237.field3440);
            }
        }
        class399.field5865 = arg0;
        class292.method1812(103);
        if (arg1 >= -66) {
            field5281 = null;
        }
        if (!class394.field5821.method519()) {
            class485.field7096 = 1;
        }
        class394.field5821.method465(class485.field7096);
        class394.field5821.method468(0);
        class394.field5821.method479(8);
        class81.field1351 = class394.field5821.method428();
        class402.field5902 = class394.field5821.method428();
        class162.method1177(1);
        class394.field5821.method475(!class397.field5830.field110);
        if (class394.field5821.method474()) {
            class115.method848(class397.field5830.field130, 4729);
        }
        class436.method2639(class83.field1366 >> 3, 0, class237.field3436 >> 3, class394.field5821);
        class193.method1317(16711680);
        class439.field6395 = false;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)V")
    public static void method2262(byte arg0) {
        field5267 = null;
        field5281 = null;
        field5280 = null;
        if (arg0 != -121) {
            field5267 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V")
    public static final void method2263(boolean arg0) {
        field5265++;
        if (class112.field1784 == 0 || class112.field1784 == 5 || arg0) {
            return;
        }
        try {
            if (++class207.field2986 > 2000) {
                if (class138.field2091 != null) {
                    class138.field2091.method694(arg0);
                    class138.field2091 = null;
                }
                if (class333.field5120 >= 1) {
                    class72.field1206 = -5;
                    class112.field1784 = 0;
                    return;
                }
                class333.field5120++;
                class207.field2986 = 0;
                class112.field1784 = 1;
                if (class334.field5129 == class289.field4153) {
                    class334.field5129 = class231.field3376;
                } else {
                    class334.field5129 = class289.field4153;
                }
            }
            if (class112.field1784 == 1) {
                class178.field2699 = class112.field1785.method1962(1, class102.field1633, class334.field5129);
                class112.field1784 = 2;
            }
            if (class112.field1784 == 2) {
                if (class178.field2699.field1604 == 2) {
                    throw new IOException();
                }
                if (class178.field2699.field1604 != 1) {
                    return;
                }
                class138.field2091 = new class85((Socket) class178.field2699.field1608, class112.field1785);
                class178.field2699 = null;
                long var1 = class488.field7124 = class358.method2309(class371.field5564, (byte) -83);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class86.field1436.field4333 = 0;
                class86.field1436.method1923((byte) 62, class224.field3248.field6584);
                class86.field1436.method1923((byte) 62, var3);
                class138.field2091.method695(2, 0, class86.field1436.field4326, (byte) 110);
                class13.method125(-4);
                int var4 = class138.field2091.method697(0);
                class13.method125(-4);
                if (var4 != 0) {
                    class112.field1784 = 0;
                    class72.field1206 = var4;
                    class138.field2091.method694(false);
                    class138.field2091 = null;
                    return;
                }
                class112.field1784 = 3;
            }
            if (class112.field1784 == 3) {
                if (class138.field2091.method693((byte) -123) < 8) {
                    return;
                }
                class138.field2091.method691(0, class387.field5738.field4326, 115, 8);
                class387.field5738.field4333 = 0;
                class273.field3945 = class387.field5738.method1917((byte) 4);
                class303 var5 = new class303(70);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class273.field3945 >> 32), (int) class273.field3945 };
                var5.method1923((byte) 62, 10);
                var5.method1892(397825512, var6[0]);
                var5.method1892(397825512, var6[1]);
                var5.method1892(397825512, var6[2]);
                var5.method1892(397825512, var6[3]);
                var5.method1872(-1, class358.method2309(class371.field5564, (byte) -83));
                var5.method1882((byte) 79, class87.field1472);
                var5.method1913(class256.field3696, 97, class520.field7635);
                class86.field1436.field4333 = 0;
                if (class17.field266 == 40) {
                    class86.field1436.method1923((byte) 62, class224.field3252.field6584);
                } else {
                    class86.field1436.method1923((byte) 62, class224.field3250.field6584);
                }
                class86.field1436.method1874(0, (byte) -110);
                int var7 = class86.field1436.field4333;
                class86.field1436.method1892(397825512, 588);
                class86.field1436.method1923((byte) 62, class337.field5148);
                class86.field1436.method1923((byte) 62, class428.method2611(1));
                class86.field1436.method1874(class112.field1780, (byte) -110);
                class86.field1436.method1874(class477.field7003, (byte) -110);
                class86.field1436.method1923((byte) 62, class397.field5830.field142);
                class300.method1850(-109, class86.field1436);
                class86.field1436.method1882((byte) -121, class475.field6992);
                class86.field1436.method1892(397825512, class389.field5759);
                class303 var8 = class397.field5830.method1296(3809);
                class86.field1436.method1923((byte) 62, var8.field4333);
                class86.field1436.method1876(0, 4, var8.field4326, var8.field4333);
                class439.field6395 = true;
                class86.field1436.method1874(class473.field6978, (byte) -110);
                class86.field1436.method1892(397825512, class445.field6540.method659(-24256));
                class86.field1436.method1892(397825512, class327.field5068.method659(-24256));
                class86.field1436.method1892(397825512, class200.field2917.method659(-24256));
                class86.field1436.method1892(397825512, class104.field1648.method659(-24256));
                class86.field1436.method1892(397825512, class250.field3600.method659(-24256));
                class86.field1436.method1892(397825512, class490.field7157.method659(-24256));
                class86.field1436.method1892(397825512, class427.field6244.method659(-24256));
                class86.field1436.method1892(397825512, class300.field4276.method659(-24256));
                class86.field1436.method1892(397825512, class460.field6798.method659(-24256));
                class86.field1436.method1892(397825512, class488.field7115.method659(-24256));
                class86.field1436.method1892(397825512, class515.field7577.method659(-24256));
                class86.field1436.method1892(397825512, class515.field7580.method659(-24256));
                class86.field1436.method1892(397825512, class334.field5125.method659(-24256));
                class86.field1436.method1892(397825512, class420.field6181.method659(-24256));
                class86.field1436.method1892(397825512, class272.field3933.method659(-24256));
                class86.field1436.method1892(397825512, class380.field5670.method659(-24256));
                class86.field1436.method1892(397825512, class34.field526.method659(-24256));
                class86.field1436.method1892(397825512, class16.field249.method659(-24256));
                class86.field1436.method1892(397825512, class36.field544.method659(-24256));
                class86.field1436.method1892(397825512, class8.field120.method659(-24256));
                class86.field1436.method1892(397825512, class484.field7095.method659(-24256));
                class86.field1436.method1892(397825512, class496.field7216.method659(-24256));
                class86.field1436.method1892(397825512, class24.field435.method659(-24256));
                class86.field1436.method1892(397825512, class511.field7543.method659(-24256));
                class86.field1436.method1892(397825512, class143.field2120.method659(-24256));
                class86.field1436.method1892(397825512, class378.field5646.method659(-24256));
                class86.field1436.method1892(397825512, class26.field454.method659(-24256));
                class86.field1436.method1892(397825512, class387.field5735.method659(-24256));
                class86.field1436.method1892(397825512, class93.field1533.method659(-24256));
                class86.field1436.method1892(397825512, class447.field6544.method659(-24256));
                class86.field1436.method1876(0, 4, var5.field4326, var5.field4333);
                class86.field1436.method1907(-1, class86.field1436.field4333 - var7);
                class138.field2091.method695(class86.field1436.field4333, 0, class86.field1436.field4326, (byte) 115);
                class86.field1436.method2858(var6, (byte) 110);
                for (int var9 = 0; var9 < 4; var9++) {
                    var6[var9] += 50;
                }
                class387.field5738.method2858(var6, (byte) -76);
                class112.field1784 = 4;
            }
            if (class112.field1784 == 4) {
                if (class138.field2091.method693((byte) -128) < 1) {
                    return;
                }
                int var10 = class138.field2091.method697(0);
                if (var10 == 21) {
                    class112.field1784 = 7;
                } else if (var10 == 29) {
                    class112.field1784 = 11;
                } else if (var10 == 1) {
                    class72.field1206 = var10;
                    class112.field1784 = 5;
                    return;
                } else if (var10 == 2) {
                    class112.field1784 = 8;
                } else if (var10 == 15) {
                    class112.field1784 = 12;
                    class133.field2060 = -2;
                } else if (var10 == 23 && class333.field5120 < 1) {
                    class207.field2986 = 0;
                    class112.field1784 = 1;
                    class333.field5120++;
                    class138.field2091.method694(false);
                    class138.field2091 = null;
                    return;
                } else {
                    class112.field1784 = 0;
                    class72.field1206 = var10;
                    class138.field2091.method694(false);
                    class138.field2091 = null;
                    return;
                }
            }
            if (class112.field1784 == 6) {
                class86.field1436.field4333 = 0;
                class86.field1436.method2852(114, class224.field3251.field6584);
                class138.field2091.method695(class86.field1436.field4333, 0, class86.field1436.field4326, (byte) 123);
                class112.field1784 = 4;
            } else if (class112.field1784 == 7) {
                if (class138.field2091.method693((byte) -122) >= 1) {
                    class333.field5119 = class138.field2091.method697(0) * 60 + 180;
                    class72.field1206 = 21;
                    class112.field1784 = 0;
                    class138.field2091.method694(false);
                    class138.field2091 = null;
                }
            } else if (class112.field1784 != 11) {
                if (class112.field1784 == 8) {
                    if (class138.field2091.method693((byte) -122) < 13) {
                        return;
                    }
                    class138.field2091.method691(0, class387.field5738.field4326, 122, 13);
                    class387.field5738.field4333 = 0;
                    class42.field642 = class387.field5738.method1918((byte) 124);
                    class57.field824 = class387.field5738.method1918((byte) 99);
                    class170.field2554 = class387.field5738.method1918((byte) -96) == 1;
                    class101.field1622 = class387.field5738.method1918((byte) -75) == 1;
                    class97.field1573 = class387.field5738.method1918((byte) 108) == 1;
                    class72.field1209 = class387.field5738.method1918((byte) -50) == 1;
                    class64.field1128 = class387.field5738.method1868(0);
                    class333.field5121 = class387.field5738.method1918((byte) -78) == 1;
                    class22.field394 = class387.field5738.method1918((byte) 95) == 1;
                    class246.field3567.method618((byte) 125, class22.field394);
                    class8.field111.method3079(class22.field394, (byte) 108);
                    class500.field7358.method1613(class22.field394, 6410);
                    if ((!class170.field2554 || class97.field1573) && !class333.field5121) {
                        try {
                            class426.method2606("unzap", class112.field1785.field4458, 21615);
                        } catch (Throwable var15) {
                        }
                    } else {
                        try {
                            class426.method2606("zap", class112.field1785.field4458, 21615);
                        } catch (Throwable var16) {
                            if (class8.field125) {
                                try {
                                    class112.field1785.field4458.getAppletContext().showDocument(new URL(class112.field1785.field4458.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var14) {
                                }
                            }
                        }
                    }
                    if (class502.field7371 == class108.field1683) {
                        try {
                            class426.method2606("loggedin", class112.field1785.field4458, 21615);
                        } catch (Throwable var13) {
                        }
                    }
                    class112.field1784 = 10;
                }
                if (class112.field1784 == 10) {
                    if (class387.field5738.method2850((byte) -106)) {
                        if (class138.field2091.method693((byte) -119) < 1) {
                            return;
                        }
                        class138.field2091.method691(class387.field5738.field4333 + 2, class387.field5738.field4326, 126, 1);
                    }
                    class18.field281 = class314.method1984(-1)[class387.field5738.method2846((byte) -110)];
                    class133.field2060 = class387.field5738.method1868(0);
                    class112.field1784 = 9;
                }
                if (class112.field1784 == 9) {
                    if (class138.field2091.method693((byte) -127) >= class133.field2060) {
                        class138.field2091.method691(0, class387.field5738.field4326, 127, class133.field2060);
                        class387.field5738.field4333 = 0;
                        class72.field1206 = 2;
                        class112.field1784 = 0;
                        int var11 = class133.field2060;
                        class365.method2355(true);
                        class473.method2829(-8512, class387.field5738);
                        class351.field5335 = -1;
                        class154.method1119(-118);
                        if (class387.field5738.field4333 != var11) {
                            throw new RuntimeException("lswp pos:" + class387.field5738.field4333 + " psize:" + var11);
                        }
                        class18.field281 = null;
                    }
                } else if (class112.field1784 == 12) {
                    if (class133.field2060 == -2) {
                        if (class138.field2091.method693((byte) -120) < 2) {
                            return;
                        }
                        class138.field2091.method691(0, class387.field5738.field4326, 118, 2);
                        class387.field5738.field4333 = 0;
                        class133.field2060 = class387.field5738.method1868(0);
                    }
                    if (class138.field2091.method693((byte) -125) >= class133.field2060) {
                        class138.field2091.method691(0, class387.field5738.field4326, 115, class133.field2060);
                        class387.field5738.field4333 = 0;
                        class112.field1784 = 0;
                        int var12 = class133.field2060;
                        class72.field1206 = 15;
                        class466.method2778((byte) 120);
                        class473.method2829(-8512, class387.field5738);
                        if (class387.field5738.field4333 != var12) {
                            throw new RuntimeException("lswpr pos:" + class387.field5738.field4333 + " psize:" + var12);
                        }
                        class18.field281 = null;
                    }
                }
            } else if (class138.field2091.method693((byte) -122) >= 1) {
                class192.field2820 = class138.field2091.method697(0);
                class72.field1206 = 29;
                class112.field1784 = 0;
                class138.field2091.method694(false);
                class138.field2091 = null;
            }
        } catch (IOException var17) {
            if (class138.field2091 != null) {
                class138.field2091.method694(false);
                class138.field2091 = null;
            }
            if (class333.field5120 >= 1) {
                class72.field1206 = -4;
                class112.field1784 = 0;
            } else {
                if (class334.field5129 == class289.field4153) {
                    class334.field5129 = class231.field3376;
                } else {
                    class334.field5129 = class289.field4153;
                }
                class207.field2986 = 0;
                class333.field5120++;
                class112.field1784 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V")
    public final void method2264(int arg0) {
        if (arg0 < 14) {
            this.field5283 = null;
        }
        while (true) {
            class439 var2 = this.field5279.field6403;
            if (this.field5279 == var2) {
                field5275++;
                this.field5283 = null;
                return;
            }
            var2.method2663(-119);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLoo;)V")
    public final void method2265(byte arg0, class439 arg1) {
        field5273++;
        if (arg1.field6396 != null) {
            arg1.method2663(-116);
        }
        arg1.field6403 = this.field5279.field6403;
        arg1.field6396 = this.field5279;
        arg1.field6396.field6403 = arg1;
        if (arg0 > -1) {
            method2263(false);
        }
        arg1.field6403.field6396 = arg1;
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)I")
    public final int method2266(int arg0) {
        field5276++;
        if (arg0 != -1) {
            return -75;
        }
        int var2 = 0;
        class439 var3 = this.field5279.field6403;
        while (this.field5279 != var3) {
            var3 = var3.field6403;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lko;I)V")
    public final void method2267(class348 arg0, int arg1) {
        field5268++;
        if (arg1 >= -40) {
            this.method2266(-114);
        }
        this.method2258(this.field5279.field6403, arg0, 72);
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)Z")
    public final boolean method2268(byte arg0) {
        field5264++;
        if (arg0 > -89) {
            field5280 = null;
        }
        return this.field5279.field6403 == this.field5279;
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)Loo;")
    public final class439 method2269(byte arg0) {
        field5272++;
        class439 var2 = this.field5283;
        if (this.field5279 == var2) {
            this.field5283 = null;
            return null;
        } else {
            this.field5283 = var2.field6396;
            int var3 = 99 % ((51 - arg0) / 38);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILoo;)V")
    public final void method2270(int arg0, class439 arg1) {
        if (arg1.field6396 != null) {
            arg1.method2663(arg0 - 107);
        }
        field5282++;
        if (arg0 == 0) {
            arg1.field6403 = this.field5279;
            arg1.field6396 = this.field5279.field6396;
            arg1.field6396.field6403 = arg1;
            arg1.field6403.field6396 = arg1;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLir;)V")
    public static final void method2271(byte arg0, class22 arg1) {
        arg1.field398 = false;
        field5274++;
        if (arg1.field373 != -1) {
            class357 var2 = class311.field4455.method1233(true, arg1.field373);
            if (var2 == null || var2.field5395 == null) {
                arg1.field393 = false;
                arg1.field373 = -1;
            } else {
                label402: {
                    arg1.field367++;
                    if (var2.field5395.length > arg1.field389 && arg1.field367 > var2.field5408[arg1.field389]) {
                        arg1.field367 = 1;
                        arg1.field371++;
                        arg1.field389++;
                        class435.method2635(arg1.field5538, 232, arg1.field5539, arg1.field389, var2, class95.field1558 == arg1, arg1.field5529);
                    }
                    if (var2.field5395.length <= arg1.field389) {
                        arg1.field367 = 0;
                        arg1.field389 = 0;
                        if (arg1.field393) {
                            arg1.field373 = arg1.method192(true).method2682(86);
                            if (arg1.field373 == -1) {
                                arg1.field393 = false;
                                break label402;
                            }
                            var2 = class311.field4455.method1233(true, arg1.field373);
                        }
                        class435.method2635(arg1.field5538, 232, arg1.field5539, arg1.field389, var2, class95.field1558 == arg1, arg1.field5529);
                    }
                    arg1.field371 = arg1.field389 + 1;
                    if (var2.field5395.length <= arg1.field371) {
                        arg1.field371 = 0;
                    }
                }
            }
        }
        if (arg1.field359 != -1 && arg1.field396 <= class180.field2734) {
            class246 var3 = class450.field6582.method1475(arg1.field359, true);
            int var4 = var3.field3547;
            if (var4 == -1) {
                arg1.field359 = -1;
            } else {
                label404: {
                    class357 var5 = class311.field4455.method1233(true, var4);
                    if (var3.field3543) {
                        if (var5.field5406 == 3) {
                            if (arg1.field411 > 0 && arg1.field314 <= class180.field2734 && class180.field2734 > arg1.field358) {
                                arg1.field359 = -1;
                                break label404;
                            }
                        } else if (var5.field5406 == 1 && arg1.field411 > 0 && arg1.field314 <= class180.field2734 && class180.field2734 > arg1.field358) {
                            arg1.field396 = class180.field2734 + 1;
                            break label404;
                        }
                    }
                    if (var5 == null || var5.field5395 == null) {
                        arg1.field359 = -1;
                    } else {
                        if (arg1.field360 < 0) {
                            arg1.field360 = 0;
                            class435.method2635(arg1.field5538, 232, arg1.field5539, 0, var5, class95.field1558 == arg1, arg1.field5529);
                        }
                        arg1.field351++;
                        if (arg1.field360 < var5.field5395.length && arg1.field351 > var5.field5408[arg1.field360]) {
                            arg1.field351 = 1;
                            arg1.field360++;
                            class435.method2635(arg1.field5538, 232, arg1.field5539, arg1.field360, var5, class95.field1558 == arg1, arg1.field5529);
                        }
                        if (arg1.field360 >= var5.field5395.length) {
                            if (var3.field3543) {
                                arg1.field332++;
                                arg1.field360 -= var5.field5402;
                                if (var5.field5394 <= arg1.field332) {
                                    arg1.field359 = -1;
                                } else if (arg1.field360 >= 0 && arg1.field360 < var5.field5395.length) {
                                    class435.method2635(arg1.field5538, 232, arg1.field5539, arg1.field360, var5, class95.field1558 == arg1, arg1.field5529);
                                } else {
                                    arg1.field359 = -1;
                                }
                            } else {
                                arg1.field359 = -1;
                            }
                        }
                        arg1.field316 = arg1.field360 + 1;
                        if (var5.field5395.length <= arg1.field316) {
                            if (var3.field3543) {
                                arg1.field316 -= var5.field5402;
                                if ((arg1.field332 + 1) >= var5.field5394) {
                                    arg1.field316 = -1;
                                } else if (arg1.field316 < 0 || var5.field5395.length <= arg1.field316) {
                                    arg1.field316 = -1;
                                }
                            } else {
                                arg1.field316 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field372 != -1 && class180.field2734 >= arg1.field333) {
            class246 var6 = class450.field6582.method1475(arg1.field372, true);
            int var7 = var6.field3547;
            if (var7 == -1) {
                arg1.field372 = -1;
            } else {
                label407: {
                    class357 var8 = class311.field4455.method1233(true, var7);
                    if (var6.field3543) {
                        if (var8.field5406 == 3) {
                            if (arg1.field411 > 0 && arg1.field314 <= class180.field2734 && arg1.field358 < class180.field2734) {
                                arg1.field372 = -1;
                                break label407;
                            }
                        } else if (var8.field5406 == 1 && arg1.field411 > 0 && class180.field2734 >= arg1.field314 && class180.field2734 > arg1.field358) {
                            arg1.field333 = class180.field2734 + 1;
                            break label407;
                        }
                    }
                    if (var8 == null || var8.field5395 == null) {
                        arg1.field372 = -1;
                    } else {
                        if (arg1.field380 < 0) {
                            arg1.field380 = 0;
                            class435.method2635(arg1.field5538, 232, arg1.field5539, 0, var8, class95.field1558 == arg1, arg1.field5529);
                        }
                        arg1.field327++;
                        if (arg1.field380 < var8.field5395.length && arg1.field327 > var8.field5408[arg1.field380]) {
                            arg1.field327 = 1;
                            arg1.field380++;
                            class435.method2635(arg1.field5538, 232, arg1.field5539, arg1.field380, var8, class95.field1558 == arg1, arg1.field5529);
                        }
                        if (var8.field5395.length <= arg1.field380) {
                            if (var6.field3543) {
                                arg1.field380 -= var8.field5402;
                                arg1.field340++;
                                if (var8.field5394 <= arg1.field340) {
                                    arg1.field372 = -1;
                                } else if (arg1.field380 >= 0 && var8.field5395.length > arg1.field380) {
                                    class435.method2635(arg1.field5538, 232, arg1.field5539, arg1.field380, var8, class95.field1558 == arg1, arg1.field5529);
                                } else {
                                    arg1.field372 = -1;
                                }
                            } else {
                                arg1.field372 = -1;
                            }
                        }
                        arg1.field321 = arg1.field380 + 1;
                        if (arg1.field321 >= var8.field5395.length) {
                            if (var6.field3543) {
                                arg1.field321 -= var8.field5402;
                                if (var8.field5394 <= arg1.field340 + 1) {
                                    arg1.field321 = -1;
                                } else if (arg1.field321 < 0 || arg1.field321 >= var8.field5395.length) {
                                    arg1.field321 = -1;
                                }
                            } else {
                                arg1.field321 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field320 != -1 && arg1.field345 <= 1) {
            class357 var9 = class311.field4455.method1233(true, arg1.field320);
            if (var9.field5406 == 3) {
                if (arg1.field411 > 0 && class180.field2734 >= arg1.field314 && arg1.field358 < class180.field2734) {
                    arg1.field320 = -1;
                }
            } else if (var9.field5406 == 1 && arg1.field411 > 0 && arg1.field314 <= class180.field2734 && class180.field2734 > arg1.field358) {
                arg1.field345 = 2;
            }
        }
        if (arg1.field320 != -1 && arg1.field345 == 0) {
            class357 var10 = class311.field4455.method1233(true, arg1.field320);
            if (var10 == null || var10.field5395 == null) {
                arg1.field320 = -1;
            } else {
                arg1.field383++;
                if (arg1.field322 < var10.field5395.length && var10.field5408[arg1.field322] < arg1.field383) {
                    arg1.field322++;
                    arg1.field383 = 1;
                    class435.method2635(arg1.field5538, 232, arg1.field5539, arg1.field322, var10, class95.field1558 == arg1, arg1.field5529);
                }
                if (arg1.field322 >= var10.field5395.length) {
                    arg1.field322 -= var10.field5402;
                    arg1.field307++;
                    if (arg1.field307 >= var10.field5394) {
                        arg1.field320 = -1;
                    } else if (arg1.field322 >= 0 && arg1.field322 < var10.field5395.length) {
                        class435.method2635(arg1.field5538, 232, arg1.field5539, arg1.field322, var10, class95.field1558 == arg1, arg1.field5529);
                    } else {
                        arg1.field320 = -1;
                    }
                }
                arg1.field348 = arg1.field322 + 1;
                if (arg1.field348 >= var10.field5395.length) {
                    arg1.field348 -= var10.field5402;
                    if (var10.field5394 <= (arg1.field307 + 1)) {
                        arg1.field348 = -1;
                    } else if (arg1.field348 < 0 || arg1.field348 >= var10.field5395.length) {
                        arg1.field348 = -1;
                    }
                }
                arg1.field398 = var10.field5410;
            }
        }
        if (arg1.field345 > 0) {
            arg1.field345--;
        }
        if (arg0 != -54) {
            return;
        }
        for (int var11 = 0; var11 < arg1.field318.length; var11++) {
            class228 var12 = arg1.field318[var11];
            if (var12 != null) {
                if (var12.field3345 > 0) {
                    var12.field3345--;
                } else {
                    class357 var13 = class311.field4455.method1233(true, var12.field3341);
                    if (var13 == null || var13.field5395 == null) {
                        arg1.field318[var11] = null;
                    } else {
                        var12.field3342++;
                        if (var13.field5395.length > var12.field3340 && var12.field3342 > var13.field5408[var12.field3340]) {
                            var12.field3342 = 1;
                            var12.field3340++;
                            class435.method2635(arg1.field5538, 232, arg1.field5539, var12.field3340, var13, class95.field1558 == arg1, arg1.field5529);
                        }
                        if (var13.field5395.length <= var12.field3340) {
                            var12.field3344++;
                            var12.field3340 -= var13.field5402;
                            if (var13.field5394 <= var12.field3344) {
                                arg1.field318[var11] = null;
                            } else if (var12.field3340 >= 0 && var12.field3340 < var13.field5395.length) {
                                class435.method2635(arg1.field5538, 232, arg1.field5539, var12.field3340, var13, class95.field1558 == arg1, arg1.field5529);
                            } else {
                                arg1.field318[var11] = null;
                            }
                        }
                        var12.field3346 = var12.field3340 + 1;
                        if (var13.field5395.length <= var12.field3346) {
                            var12.field3346 -= var13.field5402;
                            if (var13.field5394 <= var12.field3344 + 1) {
                                var12.field3346 = -1;
                            } else if (var12.field3346 < 0 || var12.field3346 >= var13.field5395.length) {
                                var12.field3346 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
    public class348() {
        this.field5279.field6396 = this.field5279;
        this.field5279.field6403 = this.field5279;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field5267[var1] = var0 - 1;
            var0 += var0;
        }
        field5281 = new int[2];
        field5280 = new class180("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");
        field5285 = 0;
    }
}
