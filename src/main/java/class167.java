import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class167 extends class211 {

    @OriginalMember(owner = "client!kt", name = "M", descriptor = "I")
    private int field2293 = 1;

    @OriginalMember(owner = "client!kt", name = "I", descriptor = "I")
    private int field2294 = 204;

    @OriginalMember(owner = "client!kt", name = "J", descriptor = "I")
    private int field2298 = 1;

    @OriginalMember(owner = "client!kt", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field2305 = new String[] { method1489(method1488("*\u001e4kX")), method1489(method1488("/\u001fvF")), method1489(method1488(":D4\u0004\r")), method1489(method1488("*\u001e4iX")), method1489(method1488("oJNC\u001d$JnK\u001b$\u0004 \n")), method1489(method1488("mJh_\u001e/\u0003tMJa")), method1489(method1488("\u0004\u0007s^\u0004$\u0018i\u0010P")), method1489(method1488("*\u001e4lX")), method1489(method1488("\u0011\u000bh^\u0019\"\u0006\u007f\n\u00038\u0019nO\u001da\tu_\u001e5P:")), method1489(method1488(",\u0019")), method1489(method1488("a:{X\u0004(\tvO\u0003{J")), method1489(method1488("*\u001e4nX")), method1489(method1488("*\u001e4hX")), method1489(method1488("5\bs")), method1489(method1488("+\u000b}^\u0018$\u0005hK")), method1489(method1488("*\u001e4oX")), method1489(method1488("-\u0005}M\u0015%\u0003t")), method1489(method1488("a\u001aiC\n$P")), method1489(method1488(";\u000bj")), method1489(method1488("#\u0006{D\u001bo\u001di")), method1489(method1488(".\u001a\u007fD\u0003/")), method1489(method1488("4\u0004`K\u0000")), method1489(method1488("-\u0019mZP1\u0005i\u0010")), method1489(method1488("-\u0019mZ\u0002a\u001auYJ")) };

    @OriginalMember(owner = "client!kt", name = "H", descriptor = "I")
    public static int field2300 = 0;

    @OriginalMember(owner = "client!kt", name = "E", descriptor = "[[I")
    public static int[][] field2303 = new int[6][];

    @OriginalMember(owner = "client!kt", name = "F", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!kt", name = "O", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!kt", name = "K", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!kt", name = "L", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!kt", name = "D", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!kt", name = "N", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!kt", name = "C", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(II)[I", line = 4)
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field2302;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (arg0 != 8217) {
                return null;
            } else {
                if (super.field3231.field57) {
                    for (int var4 = 0; ~var4 > ~class343.field5332; ++var4) {
                        int var5 = class88.field997[var4];
                        int var6 = class302.field4735[arg1];
                        int var7 = this.field2298 * var5 >> 12;
                        int var8 = this.field2293 * var6 >> 12;
                        int var9 = var5 % (4096 / this.field2298) * this.field2298;
                        int var10 = var6 % (4096 / this.field2293) * this.field2293;
                        if (~this.field2294 < ~var10) {
                            for (var7 -= var8; ~var7 > -1; var7 += 4) {
                            }
                            while (var7 > 3) {
                                var7 -= 4;
                            }
                            if (var7 != 1) {
                                var3[var4] = 0;
                                continue;
                            }
                            if (~this.field2294 < ~var9) {
                                var3[var4] = 0;
                                continue;
                            }
                        }
                        if (this.field2294 > var9) {
                            int var11;
                            for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                            }
                            while (~var11 < -4) {
                                var11 -= 4;
                            }
                            if (var11 > 0) {
                                var3[var4] = 0;
                                continue;
                            }
                        }
                        var3[var4] = 4096;
                    }
                }
                return var3;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field2305[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "(I)V", line = 89)
    public static void method1484(int arg0) {
        try {
            field2303 = null;
            if (arg0 != 8) {
                field2300 = -117;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2305[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V", line = 157)
    public class167() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BILib;)V", line = 107)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg0 <= 67) {
                field2300 = -103;
            }
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (arg1 == 2) {
                        this.field2294 = arg2.method1445((byte) 114);
                    }
                } else {
                    this.field2293 = arg2.method1455((byte) 62);
                }
            } else {
                this.field2298 = arg2.method1455((byte) 62);
            }
            ++field2296;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field2305[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2305[2] : field2305[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIB)I", line = 162)
    public static final int method1485(int arg0, int arg1, byte arg2) {
        try {
            arg0 = (arg1 & 127) * arg0 >> 7;
            ++field2295;
            if (~arg0 > -3) {
                arg0 = 2;
            } else if (~arg0 < -127) {
                arg0 = 126;
            }
            int var3 = -59 / ((arg2 - -64) / 34);
            return (arg1 & 65408) - -arg0;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field2305[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)V", line = 183)
    public static final void method1486(int arg0) {
        try {
            ++field2297;
            if (~class251.field3897 != -1 && ~class251.field3897 != -11) {
                try {
                    short var1;
                    if (class456.field6644 == 0) {
                        var1 = 250;
                    } else {
                        var1 = 2000;
                    }
                    if (class219.field3387 && class251.field3897 >= 6) {
                        var1 = 6000;
                    }
                    if (~(++class69.field735) < ~var1) {
                        if (class629.field9198 != null) {
                            class629.field9198.method2700((byte) 115);
                            class629.field9198 = null;
                        }
                        if (~class456.field6644 <= -4) {
                            class251.field3897 = 0;
                            class20.method134(false, -5);
                            return;
                        }
                        if (class429.field6309 != 2) {
                            class149.field1830.method145((byte) 122);
                        } else {
                            class54.field592.method145((byte) 80);
                        }
                        ++class456.field6644;
                        class251.field3897 = 1;
                        class69.field735 = 0;
                    }
                    if (class251.field3897 == 1) {
                        if (~class429.field6309 != -3) {
                            class695.field10144 = class149.field1830.method146(class580.field8601, (byte) -124);
                        } else {
                            class695.field10144 = class54.field592.method146(class580.field8601, (byte) -125);
                        }
                        class251.field3897 = 2;
                    }
                    if (~class251.field3897 == -3) {
                        if (~class695.field10144.field503 == -3) {
                            throw new IOException();
                        }
                        if (class695.field10144.field503 != 1) {
                            return;
                        }
                        class629.field9198 = class341.method2835(15000, false, (Socket) class695.field10144.field499);
                        class695.field10144 = null;
                        class704.method5137(arg0 + -6240);
                        class280 var2 = class454.method3475((byte) 124);
                        if (!class219.field3387) {
                            var2.field4197.method1428((byte) -24, class27.field328.field9786);
                        } else {
                            var2.field4197.method1428((byte) -24, class27.field339.field9786);
                            var2.field4197.method1406(0, 380332136);
                            int var3 = var2.field4197.field2201;
                            var2.field4197.method1412(true, 652);
                            if (~class429.field6309 == -3) {
                                var2.field4197.method1428((byte) -24, ~class138.field1645 != -14 ? 0 : 1);
                            }
                            class163 var4 = class686.method5027(0);
                            var4.method1428((byte) -24, class472.field6852);
                            var4.method1406((int) (Math.random() * 9.9999999E7D), arg0 ^ 380332152);
                            var4.method1428((byte) -24, field2300);
                            var4.method1412(true, class676.field9805);
                            for (int var5 = 0; ~var5 > -7; ++var5) {
                                var4.method1412(true, (int) (9.9999999E7D * Math.random()));
                            }
                            var4.method1443(class21.field245, 255);
                            var4.method1428((byte) -24, class447.field6576.field83);
                            var4.method1428((byte) -24, (int) (9.9999999E7D * Math.random()));
                            var4.method1420(class77.field886, (byte) 85, class298.field4702);
                            var2.field4197.method1454(var4.field2201, 0, var4.field2209, (byte) 70);
                            var2.field4197.method1459((byte) 7, -var3 + var2.field4197.field2201);
                        }
                        class106.method934((byte) 53, var2);
                        class443.method3401(arg0 + -17);
                        class251.field3897 = 3;
                    }
                    if (class251.field3897 == 3) {
                        if (!class629.field9198.method2698(-36, 1)) {
                            return;
                        }
                        class629.field9198.method2697(0, 1, arg0 + -14, class430.field6332.field2209);
                        int var6 = class430.field6332.field2209[0] & 255;
                        if (var6 != 0) {
                            class251.field3897 = 0;
                            class20.method134(false, var6);
                            class629.field9198.method2700((byte) 125);
                            class629.field9198 = null;
                            class37.method241((byte) -54);
                            return;
                        }
                        if (class219.field3387) {
                            class251.field3897 = 4;
                        } else {
                            class251.field3897 = 8;
                        }
                    }
                    if (class251.field3897 == 4) {
                        if (!class629.field9198.method2698(-125, 2)) {
                            return;
                        }
                        class629.field9198.method2697(0, 2, arg0 ^ 18, class430.field6332.field2209);
                        class430.field6332.field2201 = 0;
                        class430.field6332.field2201 = class430.field6332.method1445((byte) 109);
                        class251.field3897 = 5;
                    }
                    if (class251.field3897 == 5) {
                        if (!class629.field9198.method2698(-127, class430.field6332.field2201)) {
                            return;
                        }
                        class629.field9198.method2697(0, class430.field6332.field2201, arg0 + -14, class430.field6332.field2209);
                        class430.field6332.method1417(class360.field5500, arg0 + 6606);
                        class430.field6332.field2201 = 0;
                        String var7 = class430.field6332.method1399(-31376);
                        class430.field6332.field2201 = 0;
                        String var8 = field2305[20];
                        if (!class296.field4464 || ~class38.method253(var7, class580.field8601, arg0 + -15, 1, var8).field503 == -3) {
                            class140.method1200(var7, true, var8, false, class580.field8601, ~class289.field4305.field812.method1610(false) == -2);
                        }
                        class251.field3897 = 6;
                    }
                    if (class251.field3897 == 6) {
                        if (!class629.field9198.method2698(arg0 + 58, 1)) {
                            return;
                        }
                        class629.field9198.method2697(0, 1, arg0 + -14, class430.field6332.field2209);
                        if ((class430.field6332.field2209[0] & 255) == 1) {
                            class251.field3897 = 7;
                        }
                    }
                    if (class251.field3897 == 7) {
                        if (!class629.field9198.method2698(arg0 + -60, 16)) {
                            return;
                        }
                        class629.field9198.method2697(0, 16, 2, class430.field6332.field2209);
                        class430.field6332.field2201 = 16;
                        class430.field6332.method1417(class360.field5500, 6622);
                        class430.field6332.field2201 = 0;
                        class122.field1439 = class76.field872 = class762.method5520(false, class430.field6332.method1435(23));
                        class422.field6215 = class430.field6332.method1435(41);
                        class251.field3897 = 8;
                    }
                    if (~class251.field3897 == -9) {
                        class430.field6332.field2201 = 0;
                        class704.method5137(arg0 + -6240);
                        class280 var9 = class454.method3475((byte) -122);
                        class22 var10 = var9.field4197;
                        if (class429.field6309 != 2) {
                            class675 var11;
                            if (!class219.field3387) {
                                var11 = class27.field332;
                            } else {
                                var11 = class27.field340;
                            }
                            var10.method1428((byte) -24, var11.field9786);
                            var10.method1406(0, 380332136);
                            int var12 = var10.field2201;
                            int var13 = var10.field2201;
                            if (!class219.field3387) {
                                var10.method1412(true, 652);
                                class163 var14 = class313.method2641(-104);
                                var10.method1454(var14.field2201, 0, var14.field2209, (byte) 76);
                                var13 = var10.field2201;
                                var10.method1464(class122.field1439, 255);
                            }
                            var10.method1428((byte) -24, class447.field6576.field83);
                            var10.method1428((byte) -24, field2300);
                            class638.method4684(86, var10);
                            var10.method1464(class335.field5229, 255);
                            var10.method1412(true, class676.field9805);
                            class398.method3137((byte) 87, var10);
                            var10.method1460(var13, var10.field2201, class360.field5500, false);
                            var10.method1459((byte) 7, -var12 + var10.field2201);
                        } else {
                            class675 var15;
                            if (class219.field3387) {
                                var15 = class27.field340;
                            } else {
                                var15 = class27.field330;
                            }
                            var10.method1428((byte) -24, var15.field9786);
                            var10.method1406(0, 380332136);
                            int var16 = var10.field2201;
                            int var17 = var10.field2201;
                            if (!class219.field3387) {
                                var10.method1412(true, 652);
                                var10.method1428((byte) -24, ~class138.field1645 != -14 ? 0 : 1);
                                int var18 = var10.field2201;
                                class163 var19 = class313.method2641(120);
                                var10.method1454(var19.field2201, 0, var19.field2209, (byte) 109);
                                var17 = var10.field2201;
                                var10.method1464(class122.field1439, arg0 + 239);
                            }
                            var10.method1428((byte) -24, class591.field8684);
                            var10.method1428((byte) -24, class451.method3463(arg0 + -15));
                            var10.method1406(class179.field2489, 380332136);
                            var10.method1406(class94.field1062, 380332136);
                            var10.method1428((byte) -24, class289.field4305.field826.method4430(false));
                            class638.method4684(120, var10);
                            var10.method1464(class335.field5229, arg0 + 239);
                            var10.method1412(true, class676.field9805);
                            class163 var20 = class289.field4305.method658(12);
                            var10.method1428((byte) -24, var20.field2201);
                            var10.method1454(var20.field2201, 0, var20.field2209, (byte) 71);
                            class28.field344 = true;
                            class163 var21 = new class163(class306.field4779.method67(false));
                            class306.field4779.method69(-66, var21);
                            var10.method1454(var21.field2209.length, 0, var21.field2209, (byte) 80);
                            var10.method1406(class544.field8130, 380332136);
                            var10.method1443(class580.field8597, arg0 + 239);
                            var10.method1428((byte) -24, class205.field3172 != null ? 1 : 0);
                            if (class205.field3172 != null) {
                                var10.method1464(class205.field3172, arg0 + 239);
                            }
                            var10.method1428((byte) -24, class517.method3930(field2305[14], (byte) 127) ? 1 : 0);
                            var10.method1428((byte) -24, !class296.field4464 ? 0 : 1);
                            class398.method3137((byte) 108, var10);
                            var10.method1460(var17, var10.field2201, class360.field5500, false);
                            var10.method1459((byte) 7, var10.field2201 - var16);
                        }
                        class106.method934((byte) 53, var9);
                        class443.method3401(-1);
                        class279.field4190 = new class216(class360.field5500);
                        for (int var22 = 0; var22 < 4; ++var22) {
                            class360.field5500[var22] += 50;
                        }
                        class430.field6332.method152(class360.field5500, 15378);
                        class360.field5500 = null;
                        class251.field3897 = 9;
                    }
                    if (~class251.field3897 == -10) {
                        if (!class629.field9198.method2698(arg0 + -143, 1)) {
                            return;
                        }
                        class629.field9198.method2697(0, 1, 2, class430.field6332.field2209);
                        int var23 = class430.field6332.field2209[0] & 255;
                        if (~var23 != -22) {
                            if (~var23 != -30) {
                                if (var23 == 1) {
                                    class251.field3897 = 10;
                                    class20.method134(false, var23);
                                    return;
                                }
                                if (var23 == 2) {
                                    class251.field3897 = 13;
                                } else {
                                    if (var23 != 15) {
                                        if (~var23 == -24 && class456.field6644 < 3) {
                                            ++class456.field6644;
                                            class251.field3897 = 1;
                                            class69.field735 = 0;
                                            class629.field9198.method2700((byte) 100);
                                            class629.field9198 = null;
                                            return;
                                        }
                                        if (class374.field5703 && !class219.field3387 && class472.field6852 != -1 && var23 == 35) {
                                            class251.field3897 = 1;
                                            class69.field735 = 0;
                                            class219.field3387 = true;
                                            class629.field9198.method2700((byte) 99);
                                            class629.field9198 = null;
                                            return;
                                        }
                                        class251.field3897 = 0;
                                        class20.method134(false, var23);
                                        class629.field9198.method2700((byte) 101);
                                        class629.field9198 = null;
                                        class37.method241((byte) -80);
                                        return;
                                    }
                                    class476.field6930 = -2;
                                    class251.field3897 = 19;
                                }
                            } else {
                                class251.field3897 = 18;
                            }
                        } else {
                            class251.field3897 = 12;
                        }
                    }
                    if (class251.field3897 == 11) {
                        class704.method5137(-6224);
                        class280 var24 = class454.method3475((byte) -109);
                        class22 var25 = var24.field4197;
                        var25.method157((byte) 107, class279.field4190);
                        var25.method153(-2, class27.field336.field9786);
                        class106.method934((byte) 53, var24);
                        class443.method3401(-1);
                        class251.field3897 = 9;
                    } else if (~class251.field3897 == -13) {
                        if (class629.field9198.method2698(arg0 ^ -112, 1)) {
                            class629.field9198.method2697(0, 1, arg0 ^ 18, class430.field6332.field2209);
                            int var26 = 255 & class430.field6332.field2209[0];
                            class251.field3897 = 0;
                            class562.field8355 = var26 * 50;
                            class20.method134(false, 21);
                            class629.field9198.method2700((byte) 124);
                            class629.field9198 = null;
                            class37.method241((byte) -22);
                        }
                    } else if (~class251.field3897 == -19) {
                        if (class629.field9198.method2698(-22, 1)) {
                            class629.field9198.method2697(0, 1, 2, class430.field6332.field2209);
                            class470.field6826 = class430.field6332.field2209[0] & 255;
                            class251.field3897 = 0;
                            class20.method134(false, 29);
                            class629.field9198.method2700((byte) 99);
                            class629.field9198 = null;
                            class37.method241((byte) -31);
                        }
                    } else if (class251.field3897 == 13) {
                        if (class629.field9198.method2698(8, 1)) {
                            class629.field9198.method2697(0, 1, arg0 ^ 18, class430.field6332.field2209);
                            class251.field3897 = 14;
                            class123.field1447 = class430.field6332.field2209[0] & 255;
                        }
                    } else {
                        if (~class251.field3897 == -15) {
                            class22 var27 = class430.field6332;
                            if (class429.field6309 == 2) {
                                if (!class629.field9198.method2698(43, class123.field1447)) {
                                    return;
                                }
                                class629.field9198.method2697(0, class123.field1447, 2, var27.field2209);
                                var27.field2201 = 0;
                                class757.field10995 = var27.method1455((byte) 62);
                                class132.field1539 = var27.method1455((byte) 62);
                                class352.field5427 = ~var27.method1455((byte) 62) == -2;
                                class277.field4172 = ~var27.method1455((byte) 62) == -2;
                                class748.field10893 = ~var27.method1455((byte) 62) == -2;
                                class428.field6294 = var27.method1455((byte) 62) == 1;
                                class722.field10458 = var27.method1445((byte) 108);
                                class233.field3519 = ~var27.method1455((byte) 62) == -2;
                                class605.field8864 = var27.method1437((byte) 105);
                                class709.field10277 = ~var27.method1455((byte) 62) == -2;
                                class417.field6144.method3026(1, class709.field10277);
                                class540.field7920.method4996(class709.field10277, 28);
                                class262.field4035.method4251(120, class709.field10277);
                            } else {
                                if (!class629.field9198.method2698(-126, class123.field1447)) {
                                    return;
                                }
                                class629.field9198.method2697(0, class123.field1447, 2, var27.field2209);
                                var27.field2201 = 0;
                                class757.field10995 = var27.method1455((byte) 62);
                                class132.field1539 = var27.method1455((byte) 62);
                                class352.field5427 = var27.method1455((byte) 62) == 1;
                                class277.field4172 = ~var27.method1455((byte) 62) == -2;
                                class748.field10893 = var27.method1455((byte) 62) == 1;
                                class416.field6130 = var27.method1435(98);
                                class577.field8564 = class416.field6130 + -class430.method3299(arg0 + 90) + -var27.method1450(30546);
                                int var28 = var27.method1455((byte) 62);
                                class409.field6058 = (var28 & 2) != 0;
                                class233.field3519 = ~(var28 & 1) != -1;
                                class458.field6672 = var27.method1453((byte) 101);
                                class405.field6041 = var27.method1445((byte) 106);
                                class667.field9697 = var27.method1445((byte) 120);
                                class219.field3386 = var27.method1445((byte) 121);
                                class185.field2555 = var27.method1453((byte) 102);
                                class334.field5227 = class580.field8601.method211(class185.field2555, 105);
                                class553.field8241 = var27.method1455((byte) 62);
                                class85.field954 = var27.method1445((byte) 119);
                                class101.field1114 = var27.method1445((byte) 122);
                                class559.field8331 = var27.method1455((byte) 62) == 1;
                                class225.field3446.field10506 = class225.field3446.field10491 = class422.field6223 = var27.method1399(-31376);
                                class253.field3917 = var27.method1455((byte) 62);
                                class1.field11 = var27.method1453((byte) 121);
                                class493.field7069 = ~var27.method1455((byte) 62) == -2;
                                class242.field3663 = new class21();
                                class242.field3663.field243 = var27.method1445((byte) 126);
                                if (~class242.field3663.field243 == -65536) {
                                    class242.field3663.field243 = -1;
                                }
                                class242.field3663.field250 = var27.method1399(-31376);
                                if (class64.field667 != class31.field364) {
                                    class242.field3663.field242 = class242.field3663.field243 + 40000;
                                    class242.field3663.field252 = class242.field3663.field243 + 50000;
                                }
                                if (class64.field667 != class3.field17 && (class779.field11332 != class64.field667 || ~class757.field10995 > -3) && (class54.field592.method144(64, class546.field8156) || class54.field592.method144(106, class123.field1448))) {
                                    class293.method2398(-92);
                                }
                            }
                            if ((!class352.field5427 || class748.field10893) && !class233.field3519) {
                                try {
                                    class600.method4461(class629.field9206, field2305[21], (byte) 115);
                                } catch (Throwable var34) {
                                }
                            } else {
                                try {
                                    class600.method4461(class629.field9206, field2305[18], (byte) -68);
                                } catch (Throwable var36) {
                                    if (class586.field8634) {
                                        try {
                                            class629.field9206.getAppletContext().showDocument(new URL(class629.field9206.getCodeBase(), field2305[19]), field2305[13]);
                                        } catch (Exception var35) {
                                        }
                                    }
                                }
                            }
                            if (class64.field667 == class31.field364) {
                                try {
                                    class600.method4461(class629.field9206, field2305[16], (byte) 116);
                                } catch (Throwable var33) {
                                }
                            }
                            if (class429.field6309 != 2) {
                                class251.field3897 = 0;
                                class20.method134(false, 2);
                                class630.method4664(-21510);
                                class86.method728(7, (byte) -96);
                                class662.field9567 = null;
                                return;
                            }
                            class251.field3897 = 16;
                        }
                        if (class251.field3897 == arg0) {
                            if (!class629.field9198.method2698(122, 3)) {
                                return;
                            }
                            class629.field9198.method2697(0, 3, 2, class430.field6332.field2209);
                            class251.field3897 = 17;
                        }
                        if (~class251.field3897 == -18) {
                            class22 var29 = class430.field6332;
                            var29.field2201 = 0;
                            if (var29.method150(255)) {
                                if (!class629.field9198.method2698(-127, 1)) {
                                    return;
                                }
                                class629.field9198.method2697(3, 1, arg0 ^ 18, var29.field2209);
                            }
                            class662.field9567 = class156.method1307(0)[var29.method151((byte) 77)];
                            class476.field6930 = var29.method1445((byte) 122);
                            class251.field3897 = 15;
                        }
                        if (class251.field3897 == 15) {
                            if (class629.field9198.method2698(44, class476.field6930)) {
                                class629.field9198.method2697(0, class476.field6930, arg0 + -14, class430.field6332.field2209);
                                class430.field6332.field2201 = 0;
                                class251.field3897 = 0;
                                int var30 = class476.field6930;
                                class20.method134(false, 2);
                                class618.method4601(false);
                                class599.method4455(class430.field6332, 28258);
                                class247.field3771 = -1;
                                if (class662.field9567 != class104.field1211) {
                                    class593.method4416((byte) -76);
                                } else {
                                    class66.method565(8);
                                }
                                if (~class430.field6332.field2201 != ~var30) {
                                    throw new RuntimeException(field2305[22] + class430.field6332.field2201 + field2305[17] + var30);
                                } else {
                                    class662.field9567 = null;
                                }
                            }
                        } else if (~class251.field3897 == -20) {
                            if (~class476.field6930 == 1) {
                                if (!class629.field9198.method2698(arg0 ^ 36, 2)) {
                                    return;
                                }
                                class629.field9198.method2697(0, 2, arg0 + -14, class430.field6332.field2209);
                                class430.field6332.field2201 = 0;
                                class476.field6930 = class430.field6332.method1445((byte) 127);
                            }
                            if (class629.field9198.method2698(84, class476.field6930)) {
                                class629.field9198.method2697(0, class476.field6930, 2, class430.field6332.field2209);
                                class430.field6332.field2201 = 0;
                                int var31 = class476.field6930;
                                class251.field3897 = 0;
                                class20.method134(false, 15);
                                class532.method4024(-115);
                                class599.method4455(class430.field6332, 28258);
                                if (class430.field6332.field2201 != var31) {
                                    throw new RuntimeException(field2305[23] + class430.field6332.field2201 + field2305[17] + var31);
                                } else {
                                    class662.field9567 = null;
                                }
                            }
                        }
                    }
                } catch (IOException var37) {
                    if (class629.field9198 != null) {
                        class629.field9198.method2700((byte) 114);
                        class629.field9198 = null;
                    }
                    if (~class456.field6644 <= -4) {
                        class251.field3897 = 0;
                        class20.method134(false, -4);
                        class37.method241((byte) -111);
                    } else {
                        if (~class429.field6309 == -3) {
                            class54.field592.method145((byte) 83);
                        } else {
                            class149.field1830.method145((byte) 71);
                        }
                        class251.field3897 = 1;
                        class69.field735 = 0;
                        ++class456.field6644;
                    }
                }
            }
        } catch (RuntimeException var38) {
            throw class759.method5498(var38, field2305[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(JLha;I)V", line = 912)
    public static final void method1487(long arg0, class66 arg1, int arg2) {
        try {
            class298.field4700 = 0;
            class599.field8811 = class384.field5811;
            class12.field143 = 0;
            ++field2299;
            class384.field5811 = arg2;
            long var4 = class430.method3299(arg2 + 69);
            for (class619 var6 = (class619) class253.field3926.method4538(false); var6 != null; var6 = (class619) class253.field3926.method4543(0)) {
                if (var6.method4619(arg1, arg0)) {
                    ++class298.field4700;
                }
            }
            if (class385.field5821 && arg0 % 100L == 0L) {
                System.out.println(field2305[8] + class253.field3926.method4537(-64) + field2305[5] + class298.field4700);
                System.out.println(field2305[6] + class12.field143 + field2305[10] + class384.field5811 + field2305[4] + (class430.method3299(arg2 + 120) - var4) + field2305[9]);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field2305[7] + arg0 + ',' + (arg1 != null ? field2305[2] : field2305[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1488(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 112);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1489(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 65;
                    break;
                case 1:
                    var10005 = 106;
                    break;
                case 2:
                    var10005 = 26;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 112;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
