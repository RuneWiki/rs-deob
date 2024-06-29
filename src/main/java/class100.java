import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class100 extends class75 {

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "Lod;")
    public static class101 field2165 = class46.method335(100, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "Lod;")
    public static class101 field2168 = class46.method335(125, "(Udns");

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "Lod;")
    public static class101 field2163 = class46.method335(-117, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "[I")
    public static int[] field2173 = new int[500];

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public int field2156;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
    public int field2157;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
    public int field2159;

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    public int field2169;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "Lod;")
    public class101 field2162;

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "Lc;")
    public static class15 field2154;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "[I")
    public int[] field2166;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "[I")
    public int[] field2172;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "[Lod;")
    public class101[] field2171;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "[[Lsa;")
    public static class126[][] field2161;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lod;Lc;Lod;I)[Lqe;")
    public static final class116[] method691(class101 arg0, class15 arg1, class101 arg2, int arg3) {
        int var4 = arg1.method110(0, arg0);
        if (arg3 != -1860) {
            method695(117, -26, null);
        }
        field2167++;
        int var5 = arg1.method125(arg3 + 1862, arg2, var4);
        return class119.method897(arg1, var5, var4, (byte) 95);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Z")
    public static final boolean method692(int arg0, byte arg1) {
        field2170++;
        if (arg1 < 113) {
            field2154 = null;
        }
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    public static void method693(byte arg0) {
        field2163 = null;
        field2173 = null;
        field2161 = null;
        field2165 = null;
        if (arg0 > -6) {
            method693((byte) -108);
        }
        field2154 = null;
        field2168 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBI)V")
    public static final void method694(int arg0, byte arg1, int arg2) {
        field2158++;
        if (class32.field842 != 0 && class32.field842 != 3 || (arg1 != -34 || class119.field2629 != 1)) {
            return;
        }
        int var3 = class147.field3369 - arg2 - 25;
        int var4 = class80.field1684 - arg0 - 5;
        if (var3 < 0 || var4 < 0 || var3 >= 146 || var4 >= 151) {
            return;
        }
        var3 -= 73;
        var4 -= 75;
        int var5 = class97.field2100 + class79.field1652 & 0x7FF;
        int var6 = class124.field2709[var5];
        int var7 = (class141.field3260 + 256) * var6 >> 8;
        int var8 = class124.field2717[var5];
        int var9 = (class141.field3260 + 256) * var8 >> 8;
        int var10 = var3 * var9 + var4 * var7 >> 11;
        int var11 = class82.field1778.field1341 + var10 >> 7;
        int var12 = var4 * var9 - var3 * var7 >> 11;
        int var13 = class82.field1778.field1298 - var12 >> 7;
        boolean var14 = class40.method306(var13, 0, 0, 0, true, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var11, 1, (byte) 47);
        if (!var14) {
            return;
        }
        class17.field364.method1101(var3, (byte) -32);
        class17.field364.method1101(var4, (byte) -32);
        class17.field364.method1068(class97.field2100, 28588);
        class17.field364.method1101(57, (byte) -32);
        class17.field364.method1101(class79.field1652, (byte) -32);
        class17.field364.method1101(class141.field3260, (byte) -32);
        class17.field364.method1101(89, (byte) -32);
        class17.field364.method1068(class82.field1778.field1341, 28588);
        class17.field364.method1068(class82.field1778.field1298, 28588);
        class17.field364.method1101(class24.field598, (byte) -32);
        class17.field364.method1101(63, (byte) -32);
        return;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILod;)V")
    public static final void method695(int arg0, int arg1, class101 arg2) {
        class13.field270++;
        int var3 = -19 % ((arg0 - 41) / 60);
        field2160++;
        class17.field364.method419(191, (byte) 0);
        class17.field364.method1049(1, arg1);
        class17.field364.method1074(-2417, arg2.method717(-96));
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
    public static final void method696(int arg0) {
        field2164++;
        if (!class83.field1815) {
            return;
        }
        class92.field1982 = null;
        class98.field2131 = null;
        class95.field2037 = null;
        if (arg0 != -13856) {
            method697(-36);
        }
        class56.field1268 = null;
        class131.field2986 = null;
        class11.field172 = null;
        class93.field2006 = null;
        class102.field2250 = null;
        class133.field3040 = null;
        class106.field2280 = null;
        class119.field2618 = null;
        class89.field1926 = null;
        class119.field2634 = null;
        class61.field1367 = null;
        class5.field64 = null;
        class156.field3580 = null;
        class15.field310 = null;
        class131.field2996 = null;
        class63.field1430 = null;
        class134.field3056 = null;
        class33.method254(2, -60);
        class17.method136(true, 2);
        class83.field1815 = false;
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V")
    public static final void method697(int arg0) {
        field2155++;
        try {
            if (arg0 >= -90) {
                method691(null, null, null, -25);
            }
            if (class129.field2939 == null) {
                class129.field2939 = new class90(class129.field2954, class15.method101(-64, new class101[] { class27.field720, class26.field667, class146.field3352 }).method705((byte) -125));
            } else {
                byte[] var1 = class129.field2939.method635(30000);
                if (var1 != null) {
                    class138 var2 = new class138(var1);
                    class158.field3630 = var2.method1098(true);
                    class95.field2042 = new class34[class158.field3630];
                    for (int var3 = 0; var3 < class158.field3630; var3++) {
                        class34 var4 = class95.field2042[var3] = new class34();
                        int var5 = var2.method1098(true);
                        var4.field879 = var5 & 0x7FFF;
                        var4.field875 = (var5 & 0x8000) != 0;
                        var4.field877 = var2.method1058((byte) 114);
                        var4.field880 = var2.method1056(32767);
                        var4.field865 = var3;
                        var4.field876 = class20.method157(-18696, var4.field877);
                    }
                    class134.method1035(0, class95.field2042, class80.field1709, class95.field2042.length - 1, class3.field54, -111);
                    class53.field1210 = true;
                    class129.field2939 = null;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class129.field2939 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)V")
    public static final void method698(int arg0) {
        field2153++;
        try {
            if (class118.field2602 == 0) {
                if (class90.field1958 != null) {
                    class90.field1958.method444((byte) -85);
                    class90.field1958 = null;
                }
                class83.field1820 = false;
                class43.field1034 = 0;
                class118.field2602 = 1;
                class143.field3299 = null;
            }
            if (class118.field2602 == 1) {
                if (class143.field3299 == null) {
                    class143.field3299 = class129.field2954.method1172(123, class98.field2116, class80.field1704);
                }
                if (class143.field3299.field1591 == 2) {
                    throw new IOException();
                }
                if (class143.field3299.field1591 == 1) {
                    class90.field1958 = new class64((Socket) class143.field3299.field1590, class129.field2954);
                    class143.field3299 = null;
                    class118.field2602 = 2;
                }
            }
            if (class118.field2602 == 2) {
                long var1 = class24.field597 = class85.field1856.method717(-96);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class17.field364.field3175 = 0;
                class17.field364.method1101(14, (byte) -32);
                class17.field364.method1101(var3, (byte) -32);
                class90.field1958.method442(2, -95, 0, class17.field364.field3213);
                class118.field2602 = 3;
                class118.field2611.field3175 = 0;
            }
            if (class118.field2602 == 3) {
                if (class105.field2259 != null) {
                    class105.field2259.method146((byte) 83);
                }
                if (class138.field3150 != null) {
                    class138.field3150.method146((byte) 36);
                }
                int var4 = class90.field1958.method437(16466);
                if (class105.field2259 != null) {
                    class105.field2259.method146((byte) 107);
                }
                if (class138.field3150 != null) {
                    class138.field3150.method146((byte) 98);
                }
                if (var4 != 0) {
                    class46.method333(-123, var4);
                    return;
                }
                class118.field2602 = 4;
                class118.field2611.field3175 = 0;
            }
            if (class118.field2602 == 4) {
                if (class118.field2611.field3175 < 8) {
                    int var5 = class90.field1958.method443((byte) -66);
                    if (8 - class118.field2611.field3175 < var5) {
                        var5 = 8 - class118.field2611.field3175;
                    }
                    if (var5 > 0) {
                        class90.field1958.method440(var5, (byte) 110, class118.field2611.field3175, class118.field2611.field3213);
                        class118.field2611.field3175 += var5;
                    }
                }
                if (class118.field2611.field3175 == 8) {
                    class118.field2611.field3175 = 0;
                    class154.field3504 = class118.field2611.method1065(-124);
                    class118.field2602 = 5;
                }
            }
            if (class118.field2602 == 5) {
                int[] var6 = new int[4];
                class17.field364.field3175 = 0;
                var6[2] = (int) (class154.field3504 >> 32);
                var6[1] = (int) (Math.random() * 9.9999999E7D);
                var6[3] = (int) class154.field3504;
                var6[0] = (int) (Math.random() * 9.9999999E7D);
                class17.field364.method1101(10, (byte) -32);
                class17.field364.method1090((byte) 38, var6[0]);
                class17.field364.method1090((byte) 38, var6[1]);
                class17.field364.method1090((byte) 38, var6[2]);
                class17.field364.method1090((byte) 38, var6[3]);
                class17.field364.method1087(class85.field1856.method717(arg0 ^ 0xFFFFFFA8), -79);
                class17.field364.method1070(class85.field1846, true);
                class17.field364.method1061(class31.field798, (byte) -114, class90.field1947);
                class140.field3220.field3175 = 0;
                if (class145.field3335 == 40) {
                    class140.field3220.method1101(18, (byte) -32);
                } else {
                    class140.field3220.method1101(16, (byte) -32);
                }
                class140.field3220.method1101(class17.field364.field3175 + 93, (byte) -32);
                class140.field3220.method1090((byte) 38, 465);
                class140.field3220.method1101(class10.field152 ? 1 : 0, (byte) -32);
                class50.method371(class140.field3220, 14702);
                class140.field3220.method1090((byte) 38, class47.field1113.field341);
                class140.field3220.method1090((byte) 38, class27.field717.field341);
                class140.field3220.method1090((byte) 38, class86.field1907.field341);
                class140.field3220.method1090((byte) 38, class150.field3436.field341);
                class140.field3220.method1090((byte) 38, class141.field3258.field341);
                class140.field3220.method1090((byte) 38, class152.field3469.field341);
                class140.field3220.method1090((byte) 38, class12.field245.field341);
                class140.field3220.method1090((byte) 38, class31.field810.field341);
                class140.field3220.method1090((byte) 38, class20.field442.field341);
                class140.field3220.method1090((byte) 38, class54.field1236.field341);
                class140.field3220.method1090((byte) 38, class85.field1864.field341);
                class140.field3220.method1090((byte) 38, class97.field2103.field341);
                class140.field3220.method1090((byte) 38, class130.field2960.field341);
                class140.field3220.method1090((byte) 38, class153.field3478.field341);
                class140.field3220.method1090((byte) 38, class132.field3025.field341);
                class140.field3220.method1090((byte) 38, class131.field2983.field341);
                class140.field3220.method1106(0, class17.field364.field3213, class17.field364.field3175, true);
                class90.field1958.method442(class140.field3220.field3175, -114, 0, class140.field3220.field3213);
                class17.field364.method420((byte) 113, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class118.field2611.method420((byte) -119, var6);
                class118.field2602 = 6;
            }
            if (class118.field2602 == 6 && class90.field1958.method443((byte) -110) > 0) {
                int var8 = class90.field1958.method437(16466);
                if (var8 == 21 && class145.field3335 == 20) {
                    class118.field2602 = 7;
                } else if (var8 == 2) {
                    class118.field2602 = 9;
                } else if (var8 == 15 && class145.field3335 == 40) {
                    class36.method272(112);
                    return;
                } else if (var8 == 23 && class15.field334 < 1) {
                    class118.field2602 = 0;
                    class15.field334++;
                } else {
                    class46.method333(-111, var8);
                    return;
                }
            }
            if (class118.field2602 == 7 && class90.field1958.method443((byte) -118) > 0) {
                class61.field1372 = class90.field1958.method437(arg0 + 16458) * 60 + 180;
                class118.field2602 = 8;
            }
            if (class118.field2602 == 8) {
                class43.field1034 = 0;
                class53.method383(class40.field943, class15.method101(-60, new class101[] { class82.method592(false, class61.field1372 / 60), class85.field1886 }), -5, class80.field1691);
                if (--class61.field1372 <= 0) {
                    class118.field2602 = 0;
                }
            } else {
                if (class118.field2602 == 9 && class90.field1958.method443((byte) -70) >= 8) {
                    class142.field3277 = class90.field1958.method437(16466);
                    class150.field3440 = class90.field1958.method437(arg0 ^ 0x405A) == 1;
                    class115.field2542 = class90.field1958.method437(16466);
                    class115.field2542 <<= 0x8;
                    class115.field2542 += class90.field1958.method437(16466);
                    class23.field541 = class90.field1958.method437(16466);
                    class90.field1958.method440(1, (byte) 106, 0, class118.field2611.field3213);
                    class118.field2611.field3175 = 0;
                    class44.field1048 = class118.field2611.method424(8);
                    class90.field1958.method440(2, (byte) 114, 0, class118.field2611.field3213);
                    class118.field2611.field3175 = 0;
                    class8.field121 = class118.field2611.method1098(true);
                    class118.field2602 = 10;
                }
                if (arg0 != 8) {
                    method696(-40);
                }
                if (class118.field2602 != 10) {
                    class43.field1034++;
                    if (class43.field1034 > 2000) {
                        if (class15.field334 < 1) {
                            if (class98.field2116 == class26.field665) {
                                class98.field2116 = class61.field1369;
                            } else {
                                class98.field2116 = class26.field665;
                            }
                            class15.field334++;
                            class118.field2602 = 0;
                        } else {
                            class46.method333(97, -3);
                        }
                    }
                } else if (class90.field1958.method443((byte) -64) >= class8.field121) {
                    class118.field2611.field3175 = 0;
                    class90.field1958.method440(class8.field121, (byte) 64, 0, class118.field2611.field3213);
                    class5.method25(0);
                    class146.field3339 = -1;
                    class48.method358(false, false);
                    class44.field1048 = -1;
                }
            }
        } catch (IOException var9) {
            if (class15.field334 < 1) {
                class118.field2602 = 0;
                if (class98.field2116 == class26.field665) {
                    class98.field2116 = class61.field1369;
                } else {
                    class98.field2116 = class26.field665;
                }
                class15.field334++;
            } else {
                class46.method333(arg0 ^ 0x2, -2);
            }
        }
    }
}
