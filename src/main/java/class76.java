import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class76 {

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field1810 = 0;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Lkc;")
    private static class67 field1805 = class19.method144("Error connecting to server)3", 119);

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lkc;")
    public static class67 field1806 = field1805;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "Ljava/lang/Object;")
    public static Object field1814 = new Object();

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Lta;")
    public static class119 field1817;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "[I")
    public static int[] field1818;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "[Lab;")
    public static class3[] field1816;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Led;ILed;IB)Led;", line = 17)
    public static final class33 method613(class33 arg0, int arg1, class33 arg2, int arg3, byte arg4) {
        class33 var5 = class32.method273(0, arg2.field728, arg2.field806, class54.field1305[arg2.field740 >> 16], arg2.field740, arg2.field704, -128, arg1, arg0, arg2.field733, 0, arg3);
        field1804++;
        if (arg4 > -46) {
            method618(true, null, null);
        }
        if (var5 == null) {
            if (arg2.field700 != null) {
                var5 = class32.method273(0, arg2.field728, arg2.field806, arg2.field700, arg2.field740, arg2.field704, -128, arg1, arg0, arg2.field733, 0, arg3);
            }
            return var5;
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 37)
    public static void method614(byte arg0) {
        field1805 = null;
        if (arg0 != 15) {
            field1817 = null;
        }
        field1806 = null;
        field1814 = null;
        field1817 = null;
        field1818 = null;
        field1816 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLc;B)Z", line = 52)
    public static final boolean method615(boolean arg0, class15 arg1, byte arg2) {
        class48.field1163 = 20;
        field1813++;
        try {
            if (arg2 == 85) {
                class52.field1280 = (class127) Class.forName("ie").getDeclaredConstructor().newInstance();
                return true;
            } else {
                return true;
            }
        } catch (Throwable var4) {
            class51 var3 = arg1.method134(false);
            if (var3 != null) {
                class52.field1280 = new class118(arg1, var3);
                return true;
            } else if (arg0) {
                class52.field1280 = new class129(arg1);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V", line = 100)
    public static final void method616(byte arg0) {
        field1812++;
        try {
            if (class61.field1456 == 0) {
                if (class71.field1679 != null) {
                    class71.field1679.method751(-2);
                    class71.field1679 = null;
                }
                class116.field2734 = 0;
                class130.field3056 = null;
                class61.field1456 = 1;
                class85.field2010 = false;
            }
            if (arg0 > -105) {
                field1814 = null;
            }
            if (class61.field1456 == 1) {
                if (class130.field3056 == null) {
                    class130.field3056 = class83.field1966.method135(class141.field3404, 0);
                }
                if (class130.field3056.field1464 == 2) {
                    throw new IOException();
                }
                if (class130.field3056.field1464 == 1) {
                    class71.field1679 = new class97((Socket) class130.field3056.field1467, class83.field1966);
                    class130.field3056 = null;
                    class61.field1456 = 2;
                }
            }
            if (class61.field1456 == 2) {
                long var1 = class44.field1070 = class20.field415.method532(-68);
                class54.field1295.field3347 = 0;
                class54.field1295.method1115((byte) 49, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class54.field1295.method1115((byte) 49, var3);
                class71.field1679.method754(2, 32741, 0, class54.field1295.field3325);
                class61.field1456 = 3;
                class112.field2558.field3347 = 0;
            }
            if (class61.field1456 == 3) {
                int var4 = class71.field1679.method756((byte) -103);
                if (var4 != 0) {
                    class11.method99(false, var4);
                    return;
                }
                class61.field1456 = 4;
                class112.field2558.field3347 = 0;
            }
            if (class61.field1456 == 4) {
                if (class112.field2558.field3347 < 8) {
                    int var5 = class71.field1679.method752((byte) -115);
                    if (8 - class112.field2558.field3347 < var5) {
                        var5 = 8 - class112.field2558.field3347;
                    }
                    if (var5 > 0) {
                        class71.field1679.method749(class112.field2558.field3347, var5, 106, class112.field2558.field3325);
                        class112.field2558.field3347 += var5;
                    }
                }
                if (class112.field2558.field3347 == 8) {
                    class112.field2558.field3347 = 0;
                    class127.field2978 = class112.field2558.method1095(-1952572256);
                    class61.field1456 = 5;
                }
            }
            if (class61.field1456 == 5) {
                class54.field1295.field3347 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class127.field2978 >> 32), (int) class127.field2978 };
                class54.field1295.method1115((byte) 49, 10);
                class54.field1295.method1100(var6[0], (byte) -38);
                class54.field1295.method1100(var6[1], (byte) -82);
                class54.field1295.method1100(var6[2], (byte) 97);
                class54.field1295.method1100(var6[3], (byte) 102);
                class54.field1295.method1100(class83.field1966.field333, (byte) -13);
                class54.field1295.method1083((byte) -95, class20.field415.method532(-85));
                class54.field1295.method1090((byte) -78, class20.field419);
                class54.field1295.method1104(-122, class137.field3258, class119.field2808);
                class58.field1374.field3347 = 0;
                if (class30.field638 == 40) {
                    class58.field1374.method1115((byte) 49, 18);
                } else {
                    class58.field1374.method1115((byte) 49, 16);
                }
                class58.field1374.method1115((byte) 49, class54.field1295.field3347 + 61);
                class58.field1374.method1100(445, (byte) 111);
                class58.field1374.method1115((byte) 49, class45.field1105 ? 1 : 0);
                class58.field1374.method1100(class104.field2346.field63, (byte) -57);
                class58.field1374.method1100(class94.field2160.field63, (byte) 121);
                class58.field1374.method1100(class117.field2788.field63, (byte) 117);
                class58.field1374.method1100(class30.field639.field63, (byte) -108);
                class58.field1374.method1100(class71.field1684.field63, (byte) 93);
                class58.field1374.method1100(class132.field3138.field63, (byte) -80);
                class58.field1374.method1100(class133.field3173.field63, (byte) -111);
                class58.field1374.method1100(class34.field827.field63, (byte) 120);
                class58.field1374.method1100(class38.field877.field63, (byte) 106);
                class58.field1374.method1100(class103.field2318.field63, (byte) -84);
                class58.field1374.method1100(class121.field2837.field63, (byte) 108);
                class58.field1374.method1100(class121.field2826.field63, (byte) -86);
                class58.field1374.method1100(class135.field3236.field63, (byte) 98);
                class58.field1374.method1100(class134.field3214.field63, (byte) -93);
                class58.field1374.method1117(0, 40, class54.field1295.field3325, class54.field1295.field3347);
                class71.field1679.method754(class58.field1374.field3347, 32741, 0, class58.field1374.field3325);
                class54.field1295.method715((byte) 51, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class112.field2558.method715((byte) -111, var6);
                class61.field1456 = 6;
            }
            if (class61.field1456 == 6 && class71.field1679.method752((byte) -115) > 0) {
                int var8 = class71.field1679.method756((byte) -110);
                if (var8 == 21 && class30.field638 == 20) {
                    class61.field1456 = 7;
                } else if (var8 == 2) {
                    class61.field1456 = 9;
                } else if (var8 == 15 && class30.field638 == 40) {
                    class101.method775(false);
                    return;
                } else if (var8 == 23 && class22.field486 < 1) {
                    class61.field1456 = 0;
                    class22.field486++;
                } else {
                    class11.method99(false, var8);
                    return;
                }
            }
            if (class61.field1456 == 7 && class71.field1679.method752((byte) -115) > 0) {
                class135.field3247 = class71.field1679.method756((byte) -115) * 60 + 180;
                class61.field1456 = 8;
            }
            if (class61.field1456 == 8) {
                class116.field2734 = 0;
                class18.method141(false, class7.field172, class94.field2147, class63.method479(new class67[] { class71.method586(103, class135.field3247 / 60), class106.field2392 }, 0));
                if (--class135.field3247 <= 0) {
                    class61.field1456 = 0;
                }
            } else {
                if (class61.field1456 == 9 && class71.field1679.method752((byte) -115) >= 8) {
                    class97.field2195 = class71.field1679.method756((byte) -90);
                    client.field463 = class71.field1679.method756((byte) -114) == 1;
                    class22.field485 = class71.field1679.method756((byte) -116);
                    class22.field485 <<= 0x8;
                    class22.field485 += class71.field1679.method756((byte) -87);
                    class130.field3050 = class71.field1679.method756((byte) -108);
                    class71.field1679.method749(0, 1, -78, class112.field2558.field3325);
                    class112.field2558.field3347 = 0;
                    class12.field280 = class112.field2558.method708((byte) -123);
                    class71.field1679.method749(0, 2, -103, class112.field2558.field3325);
                    class112.field2558.field3347 = 0;
                    class133.field3166 = class112.field2558.method1072(2);
                    class61.field1456 = 10;
                }
                if (class61.field1456 != 10) {
                    class116.field2734++;
                    if (class116.field2734 > 2000) {
                        if (class22.field486 < 1) {
                            if (class141.field3404 == class100.field2240) {
                                class141.field3404 = class32.field692;
                            } else {
                                class141.field3404 = class100.field2240;
                            }
                            class22.field486++;
                            class61.field1456 = 0;
                        } else {
                            class11.method99(false, -3);
                        }
                    }
                } else if (class71.field1679.method752((byte) -115) >= class133.field3166) {
                    class112.field2558.field3347 = 0;
                    class71.field1679.method749(0, class133.field3166, -120, class112.field2558.field3325);
                    class4.method40(19);
                    class29.field614 = -1;
                    class60.method474(-25619, false);
                    class12.field280 = -1;
                }
            }
        } catch (IOException var9) {
            if (class22.field486 < 1) {
                class61.field1456 = 0;
                class22.field486++;
                if (class141.field3404 == class100.field2240) {
                    class141.field3404 = class32.field692;
                } else {
                    class141.field3404 = class100.field2240;
                }
            } else {
                class11.method99(false, -2);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(JZ)V", line = 407)
    public static final void method617(long arg0, boolean arg1) {
        field1803++;
        try {
            if (arg1) {
                field1816 = null;
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLac;Lac;)I", line = 429)
    public static final int method618(boolean arg0, class4 arg1, class4 arg2) {
        field1808++;
        int var3 = 0;
        if (arg1.method25(class63.field1486, -118, class20.field395)) {
            var3++;
        }
        if (arg2.method25(class104.field2343, 92, class20.field395)) {
            var3++;
        }
        if (arg2.method25(class11.field247, 127, class20.field395)) {
            var3++;
        }
        if (!arg0) {
            field1814 = null;
        }
        if (arg2.method25(class111.field2545, 92, class20.field395)) {
            var3++;
        }
        if (arg2.method25(class84.field1978, -49, class20.field395)) {
            var3++;
        }
        return var3;
    }
}
