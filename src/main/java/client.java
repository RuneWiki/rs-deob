import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class145 {

    @OriginalMember(owner = "client!client", name = "F", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5496 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Lcs;")
    public static class351 field5513 = new class351(8, -1);

    @OriginalMember(owner = "client!client", name = "C", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lfc;")
    public static class343 field5507;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
    public static int[] field5498;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lms;)Ltc;")
    public static final class67 method2321(class363 arg0) {
        class67 var1 = (class67) class233.field3288.method2614(((long) arg0.field5096 << 32) + (long) arg0.field5047, 88);
        return var1 == null ? arg0.field5130 : var1;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method2322(byte arg0) {
        field5506++;
        boolean var2 = class374.field5299.method2768(10834);
        if (!var2) {
            this.method2335(27763);
        }
        if (arg0 <= 5) {
            this.method2328(49);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method2323() {
        for (int var0 = 0; var0 < class200.field2875; var0++) {
            int[] var1 = class292.field4012[var0];
            for (int var2 = 0; var2 < class422.field5811; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method888(int arg0) {
        field5501++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class112.method697(1024);
        class205.field2948 = new class96(class343.field4703);
        class374.field5299 = new class471();
        if (class439.field6020 != class175.field2585) {
            class270.field3748 = new byte[50][];
        }
        class123.method759(0, class343.field4703);
        if (class96.field1373 == class396.field5558) {
            class84.field1264 = this.getCodeBase().getHost();
            class363.field5074 = 443;
            class154.field2228 = 43594;
        } else if (class356.method2140(class96.field1373, 256)) {
            class84.field1264 = this.getCodeBase().getHost();
            class154.field2228 = class349.field4788 + 40000;
            class363.field5074 = class349.field4788 + 50000;
        } else if (class96.field1373 == class280.field3859) {
            class154.field2228 = class349.field4788 + 40000;
            class84.field1264 = "127.0.0.1";
            class363.field5074 = class349.field4788 + 50000;
        }
        class267.field3718 = class84.field1264;
        class270.field3736 = class154.field2228;
        class230.field3247 = class363.field5074;
        class381.field5400 = class154.field2228;
        if (class307.field4208 == class172.field2553) {
            class491.field6933 = 16777215;
            class335.field4599 = 0;
            class132.field1856 = class119.field1676;
            class282.field3879 = class303.field4154;
            class214.field3037 = class421.field5798;
            class444.field6137 = class438.field6008;
            class228.field3215 = true;
        } else {
            class214.field3037 = class127.field1755;
            class282.field3879 = class82.field1230;
            class444.field6137 = class268.field3726;
            class132.field1856 = class58.field916;
        }
        if (class14.field222 == 3) {
            class355.field4955 = class349.field4788;
        }
        class363.field5157 = class270.field3736;
        class146.field2069 = class82.field1234 = class323.field4457 = class22.field376 = new short[256];
        class194.field2757 = class459.method2714(1197694608, class138.field1965);
        class56.field902 = class349.method2092(true, class138.field1965, -1);
        class155.field2235 = class229.method1441(-30953);
        if (class155.field2235 != null) {
            class155.field2235.method305(class138.field1965, 24346);
        }
        class172.field2559 = class14.field222;
        try {
            if (class343.field4703.field225 != null) {
                class378.field5344 = new class317(class343.field4703.field225, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class350.field4796[var3] = new class317(class343.field4703.field232[var3], 6000, 0);
                }
                class242.field3432 = new class317(class343.field4703.field236, 6000, 0);
                class251.field3526 = new class18(255, class378.field5344, class242.field3432, 500000);
                class491.field6929 = new class317(class343.field4703.field227, 24, 0);
                class343.field4703.field227 = null;
                class343.field4703.field225 = null;
                class343.field4703.field236 = null;
                class343.field4703.field232 = null;
            }
        } catch (IOException var4) {
            class491.field6929 = null;
            class242.field3432 = null;
            class378.field5344 = null;
            class251.field3526 = null;
        }
        if (class96.field1373 != class396.field5558) {
            class321.field4385 = true;
        }
        if (arg0 <= -116) {
            class54.field885 = (class305.field4173 == class172.field2553 ? class3.field34 : class267.field3715).method695(-125, class487.field6867);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method2324() {
        int var0 = class163.field2345;
        int[] var1 = class482.field6800;
        boolean var2 = class181.field2629 == 1 && var0 > 200 || class181.field2629 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class23 var12 = class310.field4235[var1[var3]];
            if (var12.method190(-36)) {
                var12.method510((byte) -100);
                if (var12.field6753 >= 0 && var12.field6747 >= 0 && var12.field6751 < class200.field2875 && var12.field6749 < class422.field5811) {
                    var12.field391 = var12.field1127 ? var2 : false;
                    if (class2.field21 == var12) {
                        var12.field1114 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field1123) {
                            var13++;
                        }
                        if (var12.field1069 > class356.field4972) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method206(0) << 2);
                        if (class104.field1493 == 0) {
                            var14 += 32;
                        } else {
                            var14 += 128;
                        }
                        var14 += 256;
                        var12.field1114 = var14 + 1;
                    }
                } else {
                    var12.field1114 = -1;
                }
            } else {
                var12.field1114 = -1;
            }
        }
        for (int var4 = 0; var4 < class32.field520; var4++) {
            class196 var9 = class256.field3581[class42.field718[var4]];
            if (var9.method1246(-126) && var9.field2789.method772(-32339, class320.field4376)) {
                var9.method510((byte) -108);
                if (var9.field6753 >= 0 && var9.field6747 >= 0 && var9.field6751 < class200.field2875 && var9.field6749 < class422.field5811) {
                    int var10 = 0;
                    if (!var9.field1123) {
                        var10++;
                    }
                    if (var9.field1069 > class356.field4972) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method206(0) << 2);
                    if (class104.field1493 == 0) {
                        if (var9.field2789.field1783) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class104.field1493 == 1) {
                        if (var9.field2789.field1783) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field2789.field1782) {
                        var11 += 1024;
                    } else if (!var9.field2789.field1753) {
                        var11 += 256;
                    }
                    var9.field1114 = var11 + 1;
                } else {
                    var9.field1114 = -1;
                }
            } else {
                var9.field1114 = -1;
            }
        }
        for (int var5 = 0; var5 < class51.field860.length; var5++) {
            class147 var6 = class51.field860[var5];
            if (var6 != null) {
                if (var6.field2071 == 1) {
                    class196 var7 = class256.field3581[var6.field2074];
                    if (var7 != null && var7.field1114 >= 0) {
                        var7.field1114 += 2048;
                    }
                } else if (var6.field2071 == 10) {
                    class23 var8 = class310.field4235[var6.field2074];
                    if (var8 != null && class2.field21 != var8 && var8.field1114 >= 0) {
                        var8.field1114 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method2325() {
        class275.field3812 = 0;
        for (int var0 = 0; var0 < class32.field520; var0++) {
            class196 var1 = class256.field3581[class42.field718[var0]];
            if (var1.field1123 && var1.method204((byte) 58) != -1) {
                int var2 = (var1.method206(0) - 1) * 64 + 60;
                int var3 = var1.field6765 - var2 >> 7;
                int var4 = var1.field6746 - var2 >> 7;
                class75 var5 = class153.method923(var1.field6766, var4, var3, (byte) 59);
                if (var5 != null) {
                    int var6 = var5.field1119;
                    if (var5 instanceof class196) {
                        var6 += 2048;
                    }
                    if (var5.field1082 == 0 && var5.method204((byte) 18) != -1) {
                        class47.field760[class275.field3812] = var6;
                        class301.field4129[class275.field3812] = var6;
                        class275.field3812++;
                        var5.field1082++;
                    }
                    class47.field760[class275.field3812] = var6;
                    class301.field4129[class275.field3812] = var1.field1119 + 2048;
                    class275.field3812++;
                    var5.field1082++;
                }
            }
        }
        class297.method1830(class47.field760, class275.field3812 - 1, class301.field4129, 0, -2026513144);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method2326(int arg0) {
        if (!class447.field6170) {
            for (int var2 = 0; var2 < class2.field17; var2++) {
                if (class374.field5291[var2].method987(-110) == 's' || class374.field5291[var2].method987(-125) == 'S') {
                    class447.field6170 = true;
                    break;
                }
            }
        }
        field5502++;
        if (class196.field2792 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class193.method1237(-9581);
            if (class33.field537 == 0L) {
                class33.field537 = var5;
            }
            if (var4 > 16384 && var5 - class33.field537 < 5000L) {
                if (var5 - class337.field4624 > 1000L) {
                    System.gc();
                    class337.field4624 = var5;
                }
                class184.field2677 = class317.field4302.method695(-117, class487.field6867);
                class165.field2432 = 5;
            } else {
                class184.field2677 = class371.field5244.method695(-112, class487.field6867);
                class196.field2792 = 10;
                class165.field2432 = 5;
            }
        } else if (class196.field2792 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class308.field4209[var7] = class274.method1721(class200.field2875, 5, class422.field5811);
            }
            class184.field2677 = class164.field2408.method695(-124, class487.field6867);
            class196.field2792 = 20;
            class165.field2432 = 10;
        } else if (class196.field2792 == 20) {
            if (class478.field6758 == null) {
                class478.field6758 = new class256(class374.field5299, class205.field2948);
            }
            if (class478.field6758.method1591((byte) -126)) {
                class204.field2930 = class239.method1497(0, 1000000, false, 1, true);
                class440.field6035 = class239.method1497(1, 1000000, false, 1, true);
                class63.field969 = class239.method1497(2, 1000000, false, 1, true);
                class346.field4729 = class239.method1497(3, 1000000, false, 1, true);
                class464.field6523 = class239.method1497(4, 1000000, false, 1, true);
                class336.field4611 = class239.method1497(5, 1000000, true, 1, true);
                class101.field1440 = class239.method1497(6, 1000000, true, 1, false);
                class160.field2302 = class239.method1497(7, 1000000, false, 1, true);
                class120.field1685 = class239.method1497(8, 1000000, false, 1, true);
                class341.field4651 = class239.method1497(9, 1000000, false, 1, true);
                class85.field1283 = class239.method1497(10, 1000000, false, 1, true);
                class172.field2548 = class239.method1497(11, 1000000, false, 1, true);
                class451.field6193 = class239.method1497(12, 1000000, false, 1, true);
                class441.field6048 = class239.method1497(13, 1000000, false, 1, true);
                class182.field2641 = class239.method1497(14, 1000000, false, 1, false);
                class432.field5954 = class239.method1497(15, 1000000, false, 1, true);
                class454.field6275 = class239.method1497(16, 1000000, false, 1, true);
                class475.field6725 = class239.method1497(17, 1000000, false, 1, true);
                class357.field4988 = class239.method1497(18, 1000000, false, 1, true);
                class47.field763 = class239.method1497(19, 1000000, false, 1, true);
                class460.field6480 = class239.method1497(20, 1000000, false, 1, true);
                class254.field3551 = class239.method1497(21, 1000000, false, 1, true);
                class330.field4544 = class239.method1497(22, 1000000, false, 1, true);
                class183.field2667 = class239.method1497(23, 1000000, true, 1, true);
                class228.field3227 = class239.method1497(24, 1000000, false, 1, true);
                class370.field5237 = class239.method1497(25, 1000000, false, 1, true);
                class440.field6040 = class239.method1497(26, 1000000, true, 1, true);
                class106.field1530 = class239.method1497(27, 1000000, false, 1, true);
                class126.field1721 = class239.method1497(28, 1000000, true, 1, true);
                class184.field2677 = class323.field4434.method695(-128, class487.field6867);
                class165.field2432 = 15;
                class196.field2792 = 30;
            } else {
                class184.field2677 = class268.field3720.method695(-113, class487.field6867);
                class165.field2432 = 12;
            }
        } else {
            int var8 = -124 / ((-arg0 - 24) / 55);
            if (class196.field2792 == 30) {
                int var9 = 0;
                for (int var10 = 0; var10 < 29; var10++) {
                    var9 += class55.field901[var10].method823((byte) 26) * class99.field1404[var10] / 100;
                }
                if (var9 == 100) {
                    class184.field2677 = class107.field1534.method695(-112, class487.field6867);
                    class165.field2432 = 20;
                    class335.method1995(class120.field1685, true);
                    class394.method2356(class120.field1685, (byte) 22);
                    class196.field2792 = 40;
                } else {
                    if (var9 != 0) {
                        class184.field2677 = class301.field4128.method695(-117, class487.field6867) + var9 + "%";
                    }
                    class165.field2432 = 20;
                }
            } else if (class196.field2792 == 40) {
                if (class126.field1721.method2039(-40)) {
                    this.method2332(class126.field1721.method2038((byte) -58, 1), (byte) -89);
                    class184.field2677 = class293.field4017.method695(-121, class487.field6867);
                    class196.field2792 = 50;
                    class165.field2432 = 25;
                } else {
                    class184.field2677 = class137.field1942.method695(-114, class487.field6867) + class126.field1721.method2045(0) + "%";
                    class165.field2432 = 25;
                }
            } else if (class196.field2792 == 50) {
                class363.method2204(22050, class255.field3578, 2, 1830961316);
                class39.field664 = new class35();
                class39.field664.method283(128, (byte) 101, 9);
                class36.field622 = class459.method2712(class138.field1965, 256, 22050, 0, class343.field4703);
                class36.field622.method1028(class39.field664, 48);
                class292.method1806(class182.field2641, class39.field664, class464.field6523, class432.field5954, (byte) -85);
                class2.field22 = class459.method2712(class138.field1965, 256, 2048, 1, class343.field4703);
                class386.field5445 = new class209();
                class2.field22.method1028(class386.field5445, 48);
                class240.field3383 = new class81(22050, class245.field3463);
                class456.field6307 = class101.field1440.method2042(100, "scape main");
                class184.field2677 = class36.field621.method695(-124, class487.field6867);
                class196.field2792 = 60;
                class165.field2432 = 30;
            } else if (class196.field2792 == 60) {
                int var11 = class41.method345(79, class120.field1685, class441.field6048);
                int var12 = class196.method1247(6);
                if (var11 < var12) {
                    class184.field2677 = class250.field3510.method695(-112, class487.field6867) + var11 * 100 / var12 + "%";
                    class165.field2432 = 35;
                } else {
                    class184.field2677 = class67.field997.method695(-114, class487.field6867);
                    class165.field2432 = 35;
                    class196.field2792 = 70;
                }
            } else if (class196.field2792 == 70) {
                int var13 = class230.method1446(0, class120.field1685);
                int var14 = class227.method1431((byte) 68);
                if (var13 < var14) {
                    class184.field2677 = class317.field4301.method695(-119, class487.field6867) + var13 * 100 / var14 + "%";
                    class165.field2432 = 40;
                } else {
                    class184.field2677 = class282.field3866.method695(-128, class487.field6867);
                    class196.field2792 = 80;
                    class165.field2432 = 40;
                }
            } else if (class196.field2792 == 80) {
                if (class440.field6040.method2039(113)) {
                    class19.field315 = new class378(class440.field6040, class341.field4651, class120.field1685);
                    class184.field2677 = class437.field5991.method695(-123, class487.field6867);
                    class165.field2432 = 45;
                    class196.field2792 = 90;
                } else {
                    class184.field2677 = class232.field3278.method695(-121, class487.field6867) + class440.field6040.method2045(0) + "%";
                    class165.field2432 = 45;
                }
            } else if (class196.field2792 == 90) {
                class184.field2677 = class318.field4343.method695(-114, class487.field6867);
                class165.field2432 = 50;
                class196.field2792 = 95;
            } else if (class196.field2792 == 95) {
                if (class447.field6170) {
                    class13.field210 = 0;
                    class211.field2977 = 0;
                    class222.field3135 = 0;
                    class47.field768 = 0;
                    class411.field5693 = 1;
                }
                class447.field6170 = true;
                class155.method941(17201, class343.field4703);
                class50.method395(0, false, class47.field768);
                class184.field2677 = class48.field779.method695(-118, class487.field6867);
                class196.field2792 = 100;
                class165.field2432 = 55;
            } else if (class196.field2792 == 100) {
                class225.method1418(class338.field4636, 0, class441.field6048, class120.field1685);
                class184.field2677 = class8.field153.method695(-118, class487.field6867);
                class165.field2432 = 60;
                class8.method94(5, -47);
                class196.field2792 = 110;
            } else if (class196.field2792 == 110) {
                class63.field969.method2039(103);
                byte var15 = 0;
                int var16 = var15 + class63.field969.method2045(0);
                class454.field6275.method2039(-26);
                int var17 = var16 + class454.field6275.method2045(0);
                class475.field6725.method2039(-74);
                int var18 = var17 + class475.field6725.method2045(0);
                class357.field4988.method2039(115);
                int var19 = var18 + class357.field4988.method2045(0);
                class47.field763.method2039(-77);
                int var20 = var19 + class47.field763.method2045(0);
                class460.field6480.method2039(98);
                int var21 = var20 + class460.field6480.method2045(0);
                class254.field3551.method2039(-110);
                int var22 = var21 + class254.field3551.method2045(0);
                class330.field4544.method2039(-96);
                int var23 = var22 + class330.field4544.method2045(0);
                class228.field3227.method2039(82);
                int var24 = var23 + class228.field3227.method2045(0);
                class370.field5237.method2039(-117);
                int var25 = var24 + class370.field5237.method2045(0);
                class106.field1530.method2039(-57);
                int var26 = var25 + class106.field1530.method2045(0);
                if (var26 < 1100) {
                    class184.field2677 = class70.field1036.method695(-112, class487.field6867) + var26 / 11 + "%";
                    class165.field2432 = 65;
                } else {
                    class68.field1007 = new class159(class172.field2553, class487.field6867, class63.field969);
                    class363.field5161 = new class477(class172.field2553, class487.field6867, class63.field969);
                    class38.field659 = new class222(class172.field2553, class487.field6867, class63.field969, class120.field1685);
                    class293.field4024 = new class284(class172.field2553, class487.field6867, class475.field6725);
                    class33.field532 = new class441(class172.field2553, class487.field6867, class63.field969);
                    class59.field928 = new class332(class172.field2553, class487.field6867, class63.field969);
                    class393.field5529 = new class195(class172.field2553, class487.field6867, class63.field969, class160.field2302);
                    class101.field1446 = new class6(class172.field2553, class487.field6867, class63.field969);
                    class448.field6178 = new class182(class172.field2553, class487.field6867, class63.field969);
                    class304.field4160 = new class347(class172.field2553, class487.field6867, true, class454.field6275, class160.field2302);
                    class292.field4009 = new class7(class172.field2553, class487.field6867, class63.field969, class120.field1685);
                    class425.field5861 = new class48(class172.field2553, class487.field6867, class63.field969, class120.field1685);
                    class467.field6550 = new class215(class172.field2553, class487.field6867, true, class357.field4988, class160.field2302);
                    class58.field918 = new class41(class172.field2553, class487.field6867, true, class68.field1007, class47.field763, class160.field2302);
                    class192.field2728 = new class54(class172.field2553, class487.field6867, class63.field969);
                    class31.field505 = new class157(class172.field2553, class487.field6867, class460.field6480, class204.field2930, class440.field6035);
                    class487.field6864 = new class436(class172.field2553, class487.field6867, class63.field969);
                    class191.field2725 = new class110(class172.field2553, class487.field6867, class63.field969);
                    class163.field2348 = new class79(class172.field2553, class487.field6867, class254.field3551, class160.field2302);
                    class375.field5314 = new class394(class172.field2553, class487.field6867, class63.field969);
                    class70.field1039 = new class174(class172.field2553, class487.field6867, class63.field969);
                    class347.field4733 = new class71(class172.field2553, class487.field6867, class63.field969);
                    class147.field2084 = new class51(class172.field2553, class487.field6867, class330.field4544);
                    class181.field2632 = new class416(class172.field2553, class487.field6867, class63.field969);
                    class268.method1682(class346.field4729, class160.field2302, class120.field1685, -21221, class441.field6048);
                    class466.method2746(class370.field5237, class228.field3227, (byte) 31, new class366());
                    class50.method400(-90, class370.field5237, class228.field3227);
                    class184.field2677 = class53.field871.method695(-119, class487.field6867);
                    class165.field2432 = 65;
                    class191.method1230(-122);
                    class304.field4160.method2082((byte) -13, !class410.method2404(-1));
                    class320.field4376 = new class237();
                    class319.method1927((byte) -127);
                    class196.field2792 = 120;
                }
            } else if (class196.field2792 == 120) {
                int var27 = class53.method415(class120.field1685, (byte) -58);
                int var28 = class119.method748(22461);
                if (var28 > var27) {
                    class184.field2677 = class153.field2197.method695(-116, class487.field6867) + var27 * 100 / var28 + "%";
                    class165.field2432 = 70;
                } else {
                    class375.method2241(class338.field4636, -8292, class120.field1685);
                    class321.method1939(-1778512387, class145.field2027);
                    class184.field2677 = class199.field2853.method695(-117, class487.field6867);
                    class196.field2792 = 130;
                    class165.field2432 = 70;
                }
            } else if (class196.field2792 == 130) {
                class184.field2677 = class90.field1341.method695(-113, class487.field6867);
                class196.field2792 = 140;
                class165.field2432 = 75;
            } else if (class196.field2792 == 140) {
                if (class85.field1283.method2051("", "huffman", -1)) {
                    class449 var29 = new class449(class85.field1283.method2024("", "huffman", 0));
                    class371.method2224(-22982, var29);
                    class184.field2677 = class350.field4790.method695(-118, class487.field6867);
                    class196.field2792 = 150;
                    class165.field2432 = 80;
                } else {
                    class184.field2677 = class238.field3361.method695(-121, class487.field6867) + "0%";
                    class165.field2432 = 80;
                }
            } else if (class196.field2792 == 150) {
                if (!class346.field4729.method2039(-128)) {
                    class184.field2677 = class488.field6884.method695(-128, class487.field6867) + class346.field4729.method2045(0) * 3 / 4 + "%";
                    class165.field2432 = 85;
                } else if (!class451.field6193.method2039(90)) {
                    class184.field2677 = class488.field6884.method695(-112, class487.field6867) + (class451.field6193.method2045(0) / 10 + 75) + "%";
                    class165.field2432 = 85;
                } else if (!class441.field6048.method2039(-61)) {
                    class184.field2677 = class488.field6884.method695(-121, class487.field6867) + (class441.field6048.method2045(0) / 20 + 85) + "%";
                    class165.field2432 = 85;
                } else if (class183.field2667.method2052("details", -107)) {
                    class379.method2273(class183.field2667, class33.field532, class59.field928, class304.field4160, class292.field4009, class425.field5861, class320.field4376);
                    class198.method1263(class106.field1530, (byte) -91);
                    class449.method2606(class19.field315, class160.field2302, -1);
                    class184.field2677 = class81.field1215.method695(-127, class487.field6867);
                    class165.field2432 = 85;
                    class196.field2792 = 160;
                } else {
                    class184.field2677 = class488.field6884.method695(-127, class487.field6867) + (class183.field2667.method2049("details", 0) / 10 + 90) + "%";
                    class165.field2432 = 85;
                }
            } else if (class196.field2792 == 160) {
                int var30 = class462.method2732(-1);
                if (var30 == -1) {
                    class184.field2677 = class329.field4539.method695(-114, class487.field6867);
                    class165.field2432 = 90;
                } else if (var30 == 7 || var30 == 9) {
                    this.method896("worldlistfull", false);
                    class8.method94(1000, 124);
                } else if (class449.field6183) {
                    class184.field2677 = class416.field5729.method695(-123, class487.field6867);
                    class165.field2432 = 90;
                    class196.field2792 = 170;
                } else {
                    this.method896("worldlistio_" + var30, false);
                    class8.method94(1000, -59);
                }
            } else if (class196.field2792 == 170) {
                class2.field19 = new boolean[class347.field4733.field1049];
                class64.field975 = new int[class347.field4733.field1049];
                class438.field6012 = new String[class70.field1039.field2561];
                for (int var31 = 0; var31 < class347.field4733.field1049; var31++) {
                    if (class347.field4733.method494((byte) -27, var31).field5522 == 0) {
                        class2.field19[var31] = true;
                        class439.field6024++;
                    }
                    class64.field975[var31] = -1;
                }
                class52.method410(18525);
                class199.field2856 = class346.field4729.method2042(100, "loginscreen");
                class336.field4611.method2036(-9200, false, true);
                class101.field1440.method2036(-9200, true, true);
                class120.field1685.method2036(-9200, true, true);
                class441.field6048.method2036(-9200, true, true);
                class85.field1283.method2036(-9200, true, true);
                class346.field4729.method2036(-9200, true, true);
                class63.field969.field4693 = 2;
                class23.field397 = true;
                class475.field6725.field4693 = 2;
                class454.field6275.field4693 = 2;
                class357.field4988.field4693 = 2;
                class47.field763.field4693 = 2;
                class460.field6480.field4693 = 2;
                class254.field3551.field4693 = 2;
                class356.method2139(-1, class411.field5693, (byte) 121, false, -1);
                class184.field2677 = class157.field2254.method695(-118, class487.field6867);
                class196.field2792 = 180;
                class165.field2432 = 95;
            } else if (class196.field2792 == 180) {
                class35.method295((byte) -125, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method2327() {
        int var0 = class163.field2345;
        int[] var1 = class482.field6800;
        int var2 = class80.field1209 ? var0 : class32.field520 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class75 var4;
            if (var3 < var0) {
                var4 = class310.field4235[var1[var3]];
            } else {
                var4 = class256.field3581[class42.field718[var3 - var0]];
            }
            if (var4.field1114 >= 0) {
                int var5 = var4.method206(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6765 & 0x7F) == 0 && (var4.field6746 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field6765 & 0x7F) == 64 && (var4.field6746 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class23 && var4.field1145 != null && class356.field4972 >= var4.field1145.field3875 && class356.field4972 < var4.field1145.field3873) {
                    ((class23) var4).field391 = false;
                }
                var4.field6755 = class418.method2441(var4.field6746, var4.field6766, var4.field6765, -16778);
                class249.method1542(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method2328(int arg0) {
        field5509++;
        class42.field717++;
        class99.method628((class363) null, 104, -1, -1);
        class61.method446(-1, -1, (byte) 86, (class363) null);
        class464.method2736(false);
        class122.field1700++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class196 var12 = class256.field3581[var2];
            if (var12 != null) {
                byte var13 = var12.field2789.field1751;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method206(0);
                    if ((var13 & 0x2) != 0 && var12.field1142 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field1144[0] + var15;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (var17 > class200.field2875 - var14 - 1) {
                                var17 = class200.field2875 - var14 - 1;
                            }
                            int var18 = var12.field1140[0] + var16;
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (var18 > (class422.field5811 - var14 - 1)) {
                                var18 = class422.field5811 - var14 - 1;
                            }
                            int var19 = class24.method209(var12.field1140[0], -1, var14, class308.field4209[var12.field6766], var17, var12.field1144[0], true, var14, 0, class259.field3614, var18, 0, var14, class233.field3285, 0);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field1144[var20] = class233.field3285[var19 - (var20 + 1)];
                                    var12.field1140[var20] = class259.field3614[var19 - var20 - 1];
                                    var12.field1147[var20] = 1;
                                }
                                var12.field1142 = var19;
                            }
                        }
                    }
                    class99.method630(var12, 1, true);
                    int var21 = class286.method1766(124, var12);
                    class438.method2543(class58.field914, 52, class367.field5225, var21, var12);
                    class31.method246((byte) 111, var12);
                }
            }
        }
        if (arg0 <= 50) {
            this.method900((byte) -48);
        }
        if (class228.field3230 == 0 && class73.field1058 == 0) {
            if (class375.field5312 == 2) {
                class138.method845(-77);
            } else {
                class332.method1974(31699);
            }
            if ((class436.field5982 >> 7) < 14 || class200.field2875 - 14 <= class436.field5982 >> 7 || class106.field1525 >> 7 < 14 || (class106.field1525 >> 7) >= (class422.field5811 - 14)) {
                class484.method2833((byte) 87);
            }
        }
        while (true) {
            class32 var3;
            class363 var4;
            class363 var5;
            do {
                var3 = (class32) class327.field4504.method1548(8779);
                if (var3 == null) {
                    while (true) {
                        class32 var6;
                        class363 var7;
                        class363 var8;
                        do {
                            var6 = (class32) class375.field5310.method1548(8779);
                            if (var6 == null) {
                                while (true) {
                                    class32 var9;
                                    class363 var10;
                                    class363 var11;
                                    do {
                                        var9 = (class32) class31.field503.method1548(8779);
                                        if (var9 == null) {
                                            if (class146.field2070 != null) {
                                                class334.method1985(74);
                                            }
                                            if ((class356.field4972 % 1500) == 0) {
                                                class181.method1188((byte) 78);
                                            }
                                            class307.method1859((byte) 82);
                                            if (class146.field2067 && class193.method1237(-9581) - 60000L > class30.field493) {
                                                class10.method99(127);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field517;
                                        if (var10.field5047 < 0) {
                                            break;
                                        }
                                        var11 = class292.method1804((byte) -55, var10.field5062);
                                    } while (var11 == null || var11.field5113 == null || var10.field5047 >= var11.field5113.length || var11.field5113[var10.field5047] != var10);
                                    class212.method1331(var9);
                                }
                            }
                            var7 = var6.field517;
                            if (var7.field5047 < 0) {
                                break;
                            }
                            var8 = class292.method1804((byte) -86, var7.field5062);
                        } while (var8 == null || var8.field5113 == null || var8.field5113.length <= var7.field5047 || var8.field5113[var7.field5047] != var7);
                        class212.method1331(var6);
                    }
                }
                var4 = var3.field517;
                if (var4.field5047 < 0) {
                    break;
                }
                var5 = class292.method1804((byte) -65, var4.field5062);
            } while (var5 == null || var5.field5113 == null || var5.field5113.length <= var4.field5047 || var5.field5113[var4.field5047] != var4);
            class212.method1331(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method901(byte arg0) {
        field5504++;
        if (class478.field6764 == 1000 || arg0 != 5) {
            return;
        }
        long var2 = class81.method559((byte) -105) / 1000000L - class286.field3909;
        class286.field3909 = class81.method559((byte) -120) / 1000000L;
        boolean var4 = class27.method226(-120);
        if (var4 && class7.field122 && class36.field622 != null) {
            class36.field622.method1030(32250);
        }
        if (class478.field6764 == 30 || class478.field6764 == 10) {
            if (class332.field4559 != 0L && class332.field4559 < class193.method1237(-9581)) {
                class356.method2139(class304.field4157, class18.method156((byte) 52), (byte) 124, false, class221.field3111);
            } else if (class338.field4636.method1121() && class79.field1194) {
                class294.method1821(true);
            }
        }
        if (class90.field1344 == null) {
            Container var5;
            if (class240.field3384 == null) {
                var5 = class343.field4703.field234;
            } else {
                var5 = class240.field3384;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class240.field3384 == var5) {
                Insets var8 = class240.field3384.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class3.field28 != var6 || class77.field1166 != var7) {
                if (class338.field4636 == null || class338.field4636.method1085()) {
                    class112.method697(1024);
                } else {
                    class77.field1166 = var7;
                    class3.field28 = var6;
                }
                class332.field4559 = class193.method1237(arg0 ^ 0xFFFFDA96) + 500L;
            }
        }
        if (class90.field1344 != null && !class332.field4550 && (class478.field6764 == 30 || class478.field6764 == 10)) {
            class356.method2139(-1, class411.field5693, (byte) 118, false, -1);
        }
        boolean var9 = false;
        if (class280.field3857) {
            class280.field3857 = false;
            var9 = true;
        }
        if (var9) {
            class406.method2384(-1);
        }
        if (class338.field4636 != null && class338.field4636.method1145() || class18.method156((byte) 92) != 1) {
            class480.method2825(9742);
        }
        if (class478.field6764 == 0) {
            class317.method1911(class165.field2432, class327.field4522[class376.field5320], class410.field5688[class376.field5320], var9, 16, class18.field292[class376.field5320], class184.field2677);
        } else if (class478.field6764 == 5) {
            class290.method1788(class327.field4522[class376.field5320].getRGB(), var9 | class338.field4636.method1145(), class338.field4636, class410.field5688[class376.field5320].getRGB(), 2, class211.field2981, class18.field292[class376.field5320].getRGB());
        } else if (class478.field6764 == 10) {
            class20.method177(5);
        } else if (class478.field6764 == 25 || class478.field6764 == 28) {
            if (class181.field2626 == 1) {
                if (class228.field3233 < class455.field6292) {
                    class228.field3233 = class455.field6292;
                }
                int var10 = (class228.field3233 - class455.field6292) * 50 / class228.field3233;
                class442.method2568(class262.field3662, 0, class480.field6789.method695(arg0 - 131, class487.field6867) + "<br>(" + var10 + "%)", true);
            } else if (class181.field2626 == 2) {
                if (class198.field2842 > class314.field4262) {
                    class314.field4262 = class198.field2842;
                }
                int var11 = (class314.field4262 - class198.field2842) * 50 / class314.field4262 + 50;
                class442.method2568(class262.field3662, arg0 - 5, class480.field6789.method695(arg0 + -117, class487.field6867) + "<br>(" + var11 + "%)", true);
            } else {
                class442.method2568(class262.field3662, 0, class480.field6789.method695(-128, class487.field6867), true);
            }
        } else if (class478.field6764 == 30) {
            class162.method984(var2, true);
        } else if (class478.field6764 == 40) {
            class442.method2568(class262.field3662, 0, class166.field2443.method695(-118, class487.field6867) + "<br>" + class229.field3240.method695(-114, class487.field6867), true);
        }
        if (class365.field5208 == 3) {
            for (int var12 = 0; var12 < class417.field5736; var12++) {
                Rectangle var13 = class180.field2611[var12];
                if (class180.field2613[var12]) {
                    class338.field4636.method2860(var13.height, var13.width, var13.x, -1996553985, var13.y, arg0 ^ 0x4);
                } else if (class258.field3607[var12]) {
                    class338.field4636.method2860(var13.height, var13.width, var13.x, -1996554240, var13.y, 1);
                }
            }
        }
        if (class460.method2719((byte) -15)) {
            class162.method983(class338.field4636, arg0 - 5);
        }
        if ((class478.field6764 == 30 || class478.field6764 == 10) && class365.field5208 == 0 && class18.method156((byte) 42) == 1 && !var9 && class14.field220.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class417.field5736; var15++) {
                if (class258.field3607[var15]) {
                    class258.field3607[var15] = false;
                    class172.field2557[var14++] = class180.field2611[var15];
                }
            }
            class338.field4636.method1072(class172.field2557, var14);
        } else if (class478.field6764 != 0) {
            class338.field4636.method1122();
            for (int var16 = 0; var16 < class417.field5736; var16++) {
                class258.field3607[var16] = false;
            }
        }
        if (class205.field2933 == 0) {
            class258.method1603(arg0 - 654, 15L);
        } else if (class205.field2933 == 1) {
            class258.method1603(arg0 - 654, 10L);
        } else if (class205.field2933 == 2) {
            class258.method1603(-649, 5L);
        } else if (class205.field2933 == 3) {
            class258.method1603(arg0 ^ 0xFFFFFD72, 2L);
        }
        if (class23.field397) {
            class266.method1678(false);
        }
        if (class447.field6170 && class478.field6764 == 10 && class182.field2652 != -1) {
            class447.field6170 = false;
            class155.method941(17201, class343.field4703);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class401.method2375("argument count", -115);
            }
            class349.field4788 = Integer.parseInt(arg0[0]);
            class96.field1373 = class280.field3859;
            if (arg0[1].equals("live")) {
                class439.field6020 = class175.field2585;
            } else if (arg0[1].equals("rc")) {
                class439.field6020 = class259.field3613;
            } else if (arg0[1].equals("wip")) {
                class439.field6020 = class39.field669;
            } else {
                class401.method2375("modewhat", -33);
            }
            class487.field6867 = class191.method1227(10106, arg0[2]);
            if (class487.field6867 == -1) {
                if (arg0[2].equals("english")) {
                    class487.field6867 = 0;
                } else if (arg0[2].equals("german")) {
                    class487.field6867 = 1;
                } else {
                    class401.method2375("language", -37);
                }
            }
            class486.field6856 = false;
            class389.field5486 = false;
            if (arg0[3].equals("game0")) {
                class172.field2553 = class305.field4173;
            } else if (arg0[3].equals("game1")) {
                class172.field2553 = class307.field4208;
            } else {
                class401.method2375("game", -125);
            }
            class303.field4156 = 0;
            class376.field5320 = class172.field2553.field4528;
            class283.field3892 = true;
            class9.field185 = true;
            class474.field6642 = 0;
            class172.field2556 = "";
            client var1 = new client();
            class334.field4582 = var1;
            var1.method902(class439.field6020.method2064(false) + 32, 768, class172.field2553.field4527, false, 29, 1024, 50, 572);
            class240.field3384.setLocation(40, 40);
        } catch (Exception var3) {
            class181.method1190((byte) -54, (String) null, var3);
        }
        field5499++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lms;)Lms;")
    public static final class363 method2329(class363 arg0) {
        int var1 = method2321(arg0).method472(-114);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class292.method1804((byte) -125, arg0.field5062);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method2330(int arg0, int arg1) {
        if (arg0 <= 20) {
            field5503 = -44;
        }
        class374.field5299.field6607++;
        class374.field5299.field6610 = arg1;
        class127.field1781 = null;
        class50.field848 = 0;
        class373.field5289 = null;
        field5508++;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method893(int arg0) {
        field5505++;
        if (class478.field6764 == 1000) {
            return;
        }
        class356.field4972++;
        if (class356.field4972 % 1000 == arg0) {
            GregorianCalendar var2 = new GregorianCalendar();
            class224.field3184 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class227.field3205.setSeed((long) class224.field3184);
        }
        if (class356.field4972 % 50 == 0) {
            class235.field3327 = class309.field4223;
            class309.field4223 = 0;
            class355.field4953 = class336.field4612;
            class336.field4612 = 0;
        }
        this.method2322((byte) 83);
        if (class478.field6758 != null) {
            class478.field6758.method1594(arg0 - 1);
        }
        class104.method658(2);
        class172.method1155(15547);
        class194.field2757.method530(arg0 - 21261);
        class56.field902.method1304((byte) 81);
        if (class155.field2235 != null) {
            int var3 = class155.field2235.method304(true);
            class109.field1545 = var3;
        }
        if (class338.field4636 != null) {
            class338.field4636.method1099((int) class193.method1237(-9581));
        }
        class99.method633(false);
        class2.field17 = 0;
        for (class304 var4 = class194.field2757.method529(-36); var4 != null && class2.field17 < 128; var4 = class194.field2757.method529(-68)) {
            if (var4.method985((byte) 123) != 1) {
                char var5 = var4.method987(-55);
                if (!class153.method928(arg0 ^ 0xFFFFFFB6) || var5 != '`' && var5 != '§') {
                    class374.field5291[class2.field17] = var4;
                    class2.field17++;
                } else if (class460.method2719((byte) -15)) {
                    class299.method1832((byte) -128);
                } else {
                    class167.method1033(arg0 + 349);
                }
            }
        }
        class8.field169 = null;
        for (class161 var6 = class56.field902.method1309(30445); var6 != null; var6 = class56.field902.method1309(arg0 ^ 0x76EC)) {
            int var7 = var6.method976(118);
            if (var7 == -1) {
                class314.field4256.method1553((byte) -85, var6);
            } else if (class272.method1694(false, var7)) {
                class8.field169 = var6;
            }
        }
        if (class460.method2719((byte) -15)) {
            class294.method1814((byte) 59);
        }
        if (class478.field6764 == 0) {
            this.method2326(arg0 + 74);
            class334.method1986(8776);
        } else if (class478.field6764 == 5) {
            this.method2326(85);
            class334.method1986(8776);
        } else if (class478.field6764 == 25 || class478.field6764 == 28) {
            class488.method2868(-27897);
        }
        if (class478.field6764 == 10) {
            this.method2328(97);
            class335.method1993((byte) 83);
            class309.method1867((byte) -117);
            class486.method2857((byte) -86);
        } else if (class478.field6764 == 30) {
            class337.method2007((byte) 84);
        } else if (class478.field6764 == 40) {
            class486.method2857((byte) -74);
            if (class353.field4917 != -3 && class353.field4917 != 2 && class353.field4917 != 15) {
                class166.method1021(62);
            }
        }
        class430.method2521(117, class338.field4636);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lms;)Z")
    public static final boolean method2331(class363 arg0) {
        if (class443.field6112) {
            if (method2321(arg0).field995 != 0) {
                return false;
            }
            if (arg0.field5093 == 0) {
                return false;
            }
        }
        return arg0.field5179;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field5497++;
        if (!this.method899((byte) 78)) {
            return;
        }
        class349.field4788 = Integer.parseInt(this.getParameter("worldid"));
        class96.field1373 = class59.method437(-60, Integer.parseInt(this.getParameter("modewhere")));
        if (!class356.method2140(class96.field1373, 256) && class96.field1373 != class396.field5558) {
            class96.field1373 = class396.field5558;
        }
        class439.field6020 = class286.method1763(Integer.parseInt(this.getParameter("modewhat")), 0);
        if (class439.field6020 != class39.field669 && class439.field6020 != class259.field3613 && class439.field6020 != class175.field2585) {
            class439.field6020 = class175.field2585;
        }
        try {
            class487.field6867 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class487.field6867 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class389.field5486 = true;
        } else {
            class389.field5486 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class486.field6856 = true;
        } else {
            class486.field6856 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class289.field3974 = true;
        } else {
            class289.field3974 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class172.field2553 = class307.field4208;
        } else {
            class172.field2553 = class305.field4173;
        }
        try {
            class303.field4156 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class303.field4156 = 0;
        }
        class317.field4310 = this.getParameter("quiturl");
        class172.field2556 = this.getParameter("settings");
        if (class172.field2556 == null) {
            class172.field2556 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class474.field6642 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class474.field6642 = 0;
            }
        }
        class376.field5320 = Integer.parseInt(this.getParameter("colourid"));
        if (class376.field5320 < 0 || class376.field5320 >= class410.field5688.length) {
            class376.field5320 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class283.field3892 = true;
            class9.field185 = true;
        }
        class334.field4582 = this;
        if (class305.field4173 == class172.field2553) {
            class451.field6225 = 503;
            class407.field5642 = 765;
        } else if (class307.field4208 == class172.field2553) {
            class451.field6225 = 480;
            class407.field5642 = 640;
        }
        this.method891(4394, class439.field6020.method2064(false) + 32, class451.field6225, 572, class407.field5642);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V")
    private final void method2332(byte[] arg0, byte arg1) {
        field5500++;
        class425 var3 = new class425(arg0);
        if (arg1 != -89) {
            field5507 = null;
        }
        while (true) {
            while (true) {
                while (true) {
                    int var4 = var3.method2503(true);
                    if (var4 == 0) {
                        return;
                    }
                    if (var4 == 1) {
                        int[] var9 = class148.field2096 = new int[6];
                        var9[0] = var3.method2508(true);
                        var9[1] = var3.method2508(true);
                        var9[2] = var3.method2508(true);
                        var9[3] = var3.method2508(true);
                        var9[4] = var3.method2508(true);
                        var9[5] = var3.method2508(true);
                    } else if (var4 == 4) {
                        int var5 = var3.method2503(true);
                        class37.field640 = new int[var5];
                        for (int var6 = 0; var6 < var5; var6++) {
                            class37.field640[var6] = var3.method2508(true);
                            if (class37.field640[var6] == 65535) {
                                class37.field640[var6] = -1;
                            }
                        }
                    } else if (var4 == 5) {
                        int var7 = var3.method2503(true);
                        class136.field1932 = new int[var7];
                        for (int var8 = 0; var8 < var7; var8++) {
                            class136.field1932[var8] = var3.method2508(true);
                            if (class136.field1932[var8] == 65535) {
                                class136.field1932[var8] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public static void method2333(boolean arg0) {
        if (!arg0) {
            method2325();
        }
        field5496 = null;
        field5498 = null;
        field5513 = null;
        field5507 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lms;IIIIIIIII)V")
    public static final void method2334(class363[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class363 var11 = arg0[var10];
            if (var11 != null && var11.field5062 == arg1) {
                int var12 = var11.field5145 + arg6;
                int var13 = var11.field5183 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field5093 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field5101 + var12;
                    int var19 = var11.field5200 + var13;
                    if (var11.field5093 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field5093 == 0 || var11.field5133 || method2321(var11).field995 != 0 || class128.field1819 == var11 || class37.field639 == var11.field5080) {
                    if (!method2331(var11)) {
                        if (class146.field2070 == var11) {
                            class454.field6273 = true;
                            class235.field3323 = var12;
                            class114.field1608 = var13;
                        }
                        if (var11.field5185 || var14 < var16 && var15 < var17) {
                            if (var11.field5093 == 0 && var11.field5134 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class32 var20 = (class32) class31.field503.method1544(-88); var20 != null; var20 = (class32) class31.field503.method1546((byte) -42)) {
                                    if (var20.field515) {
                                        var20.method1182(28818);
                                        var20.field517.field5053 = false;
                                    }
                                }
                                if (class105.field1508 == 0) {
                                    class146.field2070 = null;
                                    class128.field1819 = null;
                                }
                                class77.field1169 = 0;
                                class77.field1167 = false;
                                class216.field3070 = false;
                                if (!class351.field4800) {
                                    class394.method2355(127);
                                }
                            }
                            boolean var21;
                            if (class56.field902.method1301(13820) >= var14 && class56.field902.method1305(255) >= var15 && class56.field902.method1301(13820) < var16 && class56.field902.method1305(255) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class351.field4800 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class485.method2852(arg9 - var13, (byte) 71, arg8 - var12, var11);
                            }
                            boolean var22 = false;
                            if (class56.field902.method1303(255) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            if (class8.field169 != null && class8.field169.method976(82) == 0 && class8.field169.method980(65) >= var14 && class8.field169.method972(false) >= var15 && class8.field169.method980(42) < var16 && class8.field169.method972(false) < var17) {
                                var23 = true;
                            }
                            if (var11.field5153 != null) {
                                for (int var24 = 0; var24 < var11.field5153.length; var24++) {
                                    if (class194.field2757.method531(var11.field5153[var24], 127)) {
                                        if (var11.field5072 == null || class356.field4972 >= var11.field5072[var24]) {
                                            byte var25 = var11.field5171[var24];
                                            if (var25 == 0 || ((var25 & 0x8) == 0 || !class194.field2757.method531(86, 81) && !class194.field2757.method531(82, 49) && !class194.field2757.method531(81, 79)) && ((var25 & 0x2) == 0 || class194.field2757.method531(86, 45)) && ((var25 & 0x1) == 0 || class194.field2757.method531(82, 51)) && ((var25 & 0x4) == 0 || class194.field2757.method531(81, 74))) {
                                                class233.method1469(var24 + 1, -1, "", var11.field5096, 26233);
                                                int var26 = var11.field5119[var24];
                                                if (var11.field5072 == null) {
                                                    var11.field5072 = new int[var11.field5153.length];
                                                }
                                                if (var26 == 0) {
                                                    var11.field5072[var24] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field5072[var24] = class356.field4972 + var26;
                                                }
                                            }
                                        }
                                    } else if (var11.field5072 != null) {
                                        var11.field5072[var24] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class54.method425((byte) 104, var11, class8.field169.method972(false) - var13, class8.field169.method980(127) - var12);
                            }
                            if (class146.field2070 != null && class146.field2070 != var11 && var21 && method2321(var11).method476((byte) -111)) {
                                class411.field5699 = var11;
                            }
                            if (class128.field1819 == var11) {
                                class235.field3328 = true;
                                class317.field4305 = var12;
                                class381.field5402 = var13;
                            }
                            if (var11.field5133 || var11.field5080 != 0) {
                                if (var21 && class109.field1545 != 0 && var11.field5173 != null) {
                                    class32 var27 = new class32();
                                    var27.field515 = true;
                                    var27.field517 = var11;
                                    var27.field514 = class109.field1545;
                                    var27.field518 = var11.field5173;
                                    class31.field503.method1553((byte) -80, var27);
                                }
                                if (class146.field2070 != null || class351.field4800 || class460.field6484 != var11.field5080 && class77.field1169 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field5080 != 0) {
                                    if (class272.field3775 == var11.field5080 || class254.field3553 == var11.field5080) {
                                        class235.field3315 = var11;
                                        if (class444.field6124 != null) {
                                            class444.field6124.method848(class338.field4636, var11.field5200, (byte) -95);
                                        }
                                        if (class272.field3775 == var11.field5080) {
                                            if (!class351.field4800 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class60.method441(arg9, class338.field4636, -116, arg8);
                                                for (class99 var28 = (class99) class119.field1669.method2823(113); var28 != null; var28 = (class99) class119.field1669.method2818(0)) {
                                                    if (arg8 >= var28.field1390 && arg8 < var28.field1393 && arg9 >= var28.field1392 && arg9 < var28.field1391) {
                                                        class394.method2355(127);
                                                        class299.method1833(-7406, var28.field1394);
                                                    }
                                                }
                                            }
                                            class99.method628(var11, -69, var13, var12);
                                            continue;
                                        }
                                    }
                                    if (class37.field639 == var11.field5080) {
                                        if (var11.method2198(class338.field4636, 0) == null || class306.field4191 != 0 && class306.field4191 != 3 || class351.field4800 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var29 = arg8 - var12;
                                        int var30 = arg9 - var13;
                                        int var31 = var11.field5193[var30];
                                        if (var29 < var31 || var29 > var11.field5174[var30] + var31) {
                                            continue;
                                        }
                                        int var32 = var29 - var11.field5101 / 2;
                                        int var33 = var30 - var11.field5200 / 2;
                                        int var34;
                                        if (class375.field5312 == 4) {
                                            var34 = (int) class418.field5750 & 0x3FFF;
                                        } else {
                                            var34 = (int) class418.field5750 + class361.field5042 & 0x3FFF;
                                        }
                                        int var35 = class432.field5955[var34];
                                        int var36 = class432.field5957[var34];
                                        if (class375.field5312 != 4) {
                                            var35 = (class351.field4804 + 256) * var35 >> 8;
                                            var36 = (class351.field4804 + 256) * var36 >> 8;
                                        }
                                        int var37 = var32 * var36 + var33 * var35 >> 15;
                                        int var38 = var33 * var36 - var32 * var35 >> 15;
                                        int var39;
                                        int var40;
                                        if (class375.field5312 == 4) {
                                            var39 = (class299.field4120 >> 7) + (var37 >> 2);
                                            var40 = (class293.field4021 >> 7) - (var38 >> 2);
                                        } else {
                                            int var41 = (class2.field21.method206(0) - 1) * 64;
                                            var39 = (class2.field21.field6765 - var41 >> 7) + (var37 >> 2);
                                            var40 = (class2.field21.field6746 - var41 >> 7) - (var38 >> 2);
                                        }
                                        if (class184.field2678 && (class416.field5733 & 0x40) != 0) {
                                            class363 var42 = class485.method2840(class58.field919, class99.field1406, (byte) 21);
                                            if (var42 == null) {
                                                class7.method84(36);
                                            } else {
                                                class225.method1415(false, var39, " ->", var40, 2, 1L, class90.field1346, var11.field5195, class238.field3363, 0, true);
                                            }
                                            continue;
                                        }
                                        if (class307.field4208 == class172.field2553) {
                                            class225.method1415(false, var39, "", var40, 6, 1L, -1, -1, class66.field981.method695(-125, class487.field6867), 0, true);
                                        }
                                        class225.method1415(false, var39, "", var40, 9, 1L, -1, -1, class449.field6181, 0, true);
                                        continue;
                                    }
                                    if (class460.field6484 == var11.field5080) {
                                        class233.field3307 = var11;
                                        if (var21) {
                                            class77.field1167 = true;
                                        }
                                        if (var23) {
                                            int var43 = (int) ((double) (class8.field169.method980(40) - var12 - var11.field5101 / 2) * 2.0D / (double) class379.field5372);
                                            int var44 = (int) (-((double) (class8.field169.method972(false) - var13 - var11.field5200 / 2) * 2.0D / (double) class379.field5372));
                                            int var45 = class192.field2753 + var43 + class379.field5393;
                                            int var46 = class417.field5743 + var44 + class379.field5379;
                                            class200 var47 = class295.method1827(-476678640);
                                            if (var47 == null) {
                                                continue;
                                            }
                                            int[] var48 = new int[3];
                                            var47.method1269(124, var45, var46, var48);
                                            if (var48 != null) {
                                                if (class194.field2757.method531(82, 102) && class159.field2292 > 0) {
                                                    class160.method971(var48[1], var48[2], 63, var48[0]);
                                                    continue;
                                                }
                                                class216.field3070 = true;
                                                class293.field4023 = var48[0];
                                                class275.field3804 = var48[1];
                                                class233.field3308 = var48[2];
                                            }
                                            class77.field1169 = 1;
                                            class30.field500 = false;
                                            class465.field6532 = class56.field902.method1301(13820);
                                            class106.field1516 = class56.field902.method1305(255);
                                            continue;
                                        }
                                        if (var22 && class77.field1169 > 0) {
                                            if (class77.field1169 == 1 && (class465.field6532 != class56.field902.method1301(13820) || class106.field1516 != class56.field902.method1305(255))) {
                                                class288.field3955 = class192.field2753;
                                                class82.field1233 = class417.field5743;
                                                class77.field1169 = 2;
                                            }
                                            if (class77.field1169 == 2) {
                                                class30.field500 = true;
                                                class183.method1201((byte) -99, class288.field3955 + (int) ((double) (class465.field6532 - class56.field902.method1301(13820)) * 2.0D / (double) class379.field5365));
                                                class318.method1923((byte) 38, class82.field1233 - (int) ((double) (class106.field1516 - class56.field902.method1305(255)) * 2.0D / (double) class379.field5365));
                                            }
                                            continue;
                                        }
                                        if (class77.field1169 > 0 && !class30.field500) {
                                            if ((class337.field4618 == 1 || class126.method763((byte) -117)) && class161.field2310 > 2) {
                                                class79.method544(class106.field1516, class465.field6532, 0);
                                            } else if (class471.method2758(0)) {
                                                class79.method544(class106.field1516, class465.field6532, 0);
                                            }
                                        }
                                        class77.field1169 = 0;
                                        continue;
                                    }
                                    if (class172.field2555 == var11.field5080) {
                                        if (var22) {
                                            class242.method1514(var11.field5200, class56.field902.method1301(13820) - var12, var11.field5101, 0, class56.field902.method1305(255) - var13);
                                        }
                                        continue;
                                    }
                                    if (class214.field3021 == var11.field5080) {
                                        class61.method446(var12, var13, (byte) 109, var11);
                                        continue;
                                    }
                                }
                                if (!var11.field5148 && var23) {
                                    var11.field5148 = true;
                                    if (var11.field5144 != null) {
                                        class32 var49 = new class32();
                                        var49.field515 = true;
                                        var49.field517 = var11;
                                        var49.field511 = class8.field169.method980(80) - var12;
                                        var49.field514 = class8.field169.method972(false) - var13;
                                        var49.field518 = var11.field5144;
                                        class31.field503.method1553((byte) -81, var49);
                                    }
                                }
                                if (var11.field5148 && var22 && var11.field5107 != null) {
                                    class32 var50 = new class32();
                                    var50.field515 = true;
                                    var50.field517 = var11;
                                    var50.field511 = class56.field902.method1301(13820) - var12;
                                    var50.field514 = class56.field902.method1305(255) - var13;
                                    var50.field518 = var11.field5107;
                                    class31.field503.method1553((byte) -97, var50);
                                }
                                if (var11.field5148 && !var22) {
                                    var11.field5148 = false;
                                    if (var11.field5165 != null) {
                                        class32 var51 = new class32();
                                        var51.field515 = true;
                                        var51.field517 = var11;
                                        var51.field511 = class56.field902.method1301(13820) - var12;
                                        var51.field514 = class56.field902.method1305(255) - var13;
                                        var51.field518 = var11.field5165;
                                        class375.field5310.method1553((byte) -102, var51);
                                    }
                                }
                                if (var22 && var11.field5156 != null) {
                                    class32 var52 = new class32();
                                    var52.field515 = true;
                                    var52.field517 = var11;
                                    var52.field511 = class56.field902.method1301(13820) - var12;
                                    var52.field514 = class56.field902.method1305(255) - var13;
                                    var52.field518 = var11.field5156;
                                    class31.field503.method1553((byte) -105, var52);
                                }
                                if (!var11.field5053 && var21) {
                                    var11.field5053 = true;
                                    if (var11.field5105 != null) {
                                        class32 var53 = new class32();
                                        var53.field515 = true;
                                        var53.field517 = var11;
                                        var53.field511 = class56.field902.method1301(13820) - var12;
                                        var53.field514 = class56.field902.method1305(255) - var13;
                                        var53.field518 = var11.field5105;
                                        class31.field503.method1553((byte) -106, var53);
                                    }
                                }
                                if (var11.field5053 && var21 && var11.field5150 != null) {
                                    class32 var54 = new class32();
                                    var54.field515 = true;
                                    var54.field517 = var11;
                                    var54.field511 = class56.field902.method1301(13820) - var12;
                                    var54.field514 = class56.field902.method1305(255) - var13;
                                    var54.field518 = var11.field5150;
                                    class31.field503.method1553((byte) -107, var54);
                                }
                                if (var11.field5053 && !var21) {
                                    var11.field5053 = false;
                                    if (var11.field5110 != null) {
                                        class32 var55 = new class32();
                                        var55.field515 = true;
                                        var55.field517 = var11;
                                        var55.field511 = class56.field902.method1301(13820) - var12;
                                        var55.field514 = class56.field902.method1305(255) - var13;
                                        var55.field518 = var11.field5110;
                                        class375.field5310.method1553((byte) -106, var55);
                                    }
                                }
                                if (var11.field5128 != null) {
                                    class32 var56 = new class32();
                                    var56.field517 = var11;
                                    var56.field518 = var11.field5128;
                                    class327.field4504.method1553((byte) -109, var56);
                                }
                                if (var11.field5109 != null && class487.field6870 > var11.field5203) {
                                    if (var11.field5129 == null || class487.field6870 - var11.field5203 > 32) {
                                        class32 var61 = new class32();
                                        var61.field517 = var11;
                                        var61.field518 = var11.field5109;
                                        class31.field503.method1553((byte) -91, var61);
                                    } else {
                                        label672: for (int var57 = var11.field5203; var57 < class487.field6870; var57++) {
                                            int var58 = class5.field111[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var11.field5129.length; var59++) {
                                                if (var11.field5129[var59] == var58) {
                                                    class32 var60 = new class32();
                                                    var60.field517 = var11;
                                                    var60.field518 = var11.field5109;
                                                    class31.field503.method1553((byte) -101, var60);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5203 = class487.field6870;
                                }
                                if (var11.field5170 != null && class455.field6294 > var11.field5149) {
                                    if (var11.field5159 == null || class455.field6294 - var11.field5149 > 32) {
                                        class32 var66 = new class32();
                                        var66.field517 = var11;
                                        var66.field518 = var11.field5170;
                                        class31.field503.method1553((byte) -99, var66);
                                    } else {
                                        label648: for (int var62 = var11.field5149; var62 < class455.field6294; var62++) {
                                            int var63 = class419.field5785[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var11.field5159.length; var64++) {
                                                if (var11.field5159[var64] == var63) {
                                                    class32 var65 = new class32();
                                                    var65.field517 = var11;
                                                    var65.field518 = var11.field5170;
                                                    class31.field503.method1553((byte) -100, var65);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5149 = class455.field6294;
                                }
                                if (var11.field5204 != null && class343.field4690 > var11.field5139) {
                                    if (var11.field5176 == null || class343.field4690 - var11.field5139 > 32) {
                                        class32 var71 = new class32();
                                        var71.field517 = var11;
                                        var71.field518 = var11.field5204;
                                        class31.field503.method1553((byte) -83, var71);
                                    } else {
                                        label624: for (int var67 = var11.field5139; var67 < class343.field4690; var67++) {
                                            int var68 = class199.field2855[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var11.field5176.length; var69++) {
                                                if (var11.field5176[var69] == var68) {
                                                    class32 var70 = new class32();
                                                    var70.field517 = var11;
                                                    var70.field518 = var11.field5204;
                                                    class31.field503.method1553((byte) -123, var70);
                                                    break label624;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5139 = class343.field4690;
                                }
                                if (var11.field5190 != null && class429.field5909 > var11.field5141) {
                                    if (var11.field5167 == null || class429.field5909 - var11.field5141 > 32) {
                                        class32 var76 = new class32();
                                        var76.field517 = var11;
                                        var76.field518 = var11.field5190;
                                        class31.field503.method1553((byte) -101, var76);
                                    } else {
                                        label600: for (int var72 = var11.field5141; var72 < class429.field5909; var72++) {
                                            int var73 = class244.field3455[var72 & 0x1F];
                                            for (int var74 = 0; var74 < var11.field5167.length; var74++) {
                                                if (var11.field5167[var74] == var73) {
                                                    class32 var75 = new class32();
                                                    var75.field517 = var11;
                                                    var75.field518 = var11.field5190;
                                                    class31.field503.method1553((byte) -117, var75);
                                                    break label600;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5141 = class429.field5909;
                                }
                                if (var11.field5058 != null && class210.field2963 > var11.field5162) {
                                    if (var11.field5158 == null || class210.field2963 - var11.field5162 > 32) {
                                        class32 var81 = new class32();
                                        var81.field517 = var11;
                                        var81.field518 = var11.field5058;
                                        class31.field503.method1553((byte) -94, var81);
                                    } else {
                                        label576: for (int var77 = var11.field5162; var77 < class210.field2963; var77++) {
                                            int var78 = class110.field1554[var77 & 0x1F];
                                            for (int var79 = 0; var79 < var11.field5158.length; var79++) {
                                                if (var11.field5158[var79] == var78) {
                                                    class32 var80 = new class32();
                                                    var80.field517 = var11;
                                                    var80.field518 = var11.field5058;
                                                    class31.field503.method1553((byte) -106, var80);
                                                    break label576;
                                                }
                                            }
                                        }
                                    }
                                    var11.field5162 = class210.field2963;
                                }
                                if (class471.field6595 > var11.field5112 && var11.field5069 != null) {
                                    class32 var82 = new class32();
                                    var82.field517 = var11;
                                    var82.field518 = var11.field5069;
                                    class31.field503.method1553((byte) -104, var82);
                                }
                                if (class145.field2047 > var11.field5112 && var11.field5140 != null) {
                                    class32 var83 = new class32();
                                    var83.field517 = var11;
                                    var83.field518 = var11.field5140;
                                    class31.field503.method1553((byte) -128, var83);
                                }
                                if (class245.field3465 > var11.field5112 && var11.field5147 != null) {
                                    class32 var84 = new class32();
                                    var84.field517 = var11;
                                    var84.field518 = var11.field5147;
                                    class31.field503.method1553((byte) -90, var84);
                                }
                                if (class56.field908 > var11.field5112 && var11.field5180 != null) {
                                    class32 var85 = new class32();
                                    var85.field517 = var11;
                                    var85.field518 = var11.field5180;
                                    class31.field503.method1553((byte) -125, var85);
                                }
                                if (class103.field1464 > var11.field5112 && var11.field5104 != null) {
                                    class32 var86 = new class32();
                                    var86.field517 = var11;
                                    var86.field518 = var11.field5104;
                                    class31.field503.method1553((byte) -107, var86);
                                }
                                var11.field5112 = class122.field1700;
                                if (var11.field5118 != null) {
                                    for (int var87 = 0; var87 < class2.field17; var87++) {
                                        class32 var88 = new class32();
                                        var88.field517 = var11;
                                        var88.field507 = class374.field5291[var87].method990(0);
                                        var88.field522 = class374.field5291[var87].method987(-97);
                                        var88.field518 = var11.field5118;
                                        class31.field503.method1553((byte) -127, var88);
                                    }
                                }
                                if (class138.field1954 && var11.field5070 != null) {
                                    class32 var89 = new class32();
                                    var89.field517 = var11;
                                    var89.field518 = var11.field5070;
                                    class31.field503.method1553((byte) -87, var89);
                                }
                            }
                            if (var11.field5093 == 5 && var11.field5103 != -1) {
                                var11.method2203(class487.field6864, 0, class191.field2725).method848(class338.field4636, var11.field5200, (byte) -37);
                            }
                            class239.method1499(-1, var11);
                            if (var11.field5093 == 0) {
                                method2334(arg0, var11.field5096, var14, var15, var16, var17, var12 - var11.field5111, var13 - var11.field5186, arg8, arg9);
                                if (var11.field5113 != null) {
                                    method2334(var11.field5113, var11.field5096, var14, var15, var16, var17, var12 - var11.field5111, var13 - var11.field5186, arg8, arg9);
                                }
                                class465 var90 = (class465) class231.field3258.method2614((long) var11.field5096, 104);
                                if (var90 != null) {
                                    if (class305.field4173 == class172.field2553 && var90.field6530 == 0 && !class351.field4800 && var21 && !class443.field6112) {
                                        class394.method2355(127);
                                    }
                                    class99.method632(var13, arg9, var15, var14, var17, arg8, var12, var16, var90.field6527, 3);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class239.method1499(-1, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method900(byte arg0) {
        method2333(true);
        field5511++;
        class236.method1480((byte) -113);
        class225.method1420(160);
        class265.method1670(-107);
        class77.method532(arg0 ^ 0xFFFFFFCB);
        class20.method171(81);
        class117.method740(1);
        class180.method1183((byte) -111);
        class255.method1588((byte) 104);
        class454.method2624(0);
        class145.method885(arg0 ^ 0xFFFF8A3F);
        class417.method2437(true);
        class345.method2062(2);
        class248.method1538((byte) 53);
        class328.method1967(-106);
        class250.method1557((byte) 71);
        class487.method2861(-101);
        class147.method908((byte) -71);
        class237.method1487(-1);
        class249.method1554(6);
        class36.method306(false);
        class456.method2631(-102);
        class96.method619(true);
        class256.method1596((byte) -91);
        class136.method838(-4);
        class343.method2030(45);
        class317.method1915(true);
        class18.method158(true);
        class104.method660((byte) -109);
        class222.method1404(109);
        class441.method2560(-62);
        class332.method1978(true);
        class195.method1242(-122);
        class6.method80(arg0 ^ 0x44);
        class182.method1198(127);
        class347.method2078(29149);
        class7.method89(-7207);
        class48.method379((byte) -65);
        class215.method1364(2130);
        class41.method343((byte) -54);
        class159.method965((byte) 127);
        class54.method423(97);
        class157.method952(false);
        class436.method2536(21750);
        class110.method685(false);
        class79.method547(arg0 - 149);
        class394.method2361((byte) 98);
        class174.method1158(-68);
        class51.method401(66);
        class416.method2429(15);
        class196.method1249(-88);
        class133.method798((byte) 31);
        class52.method409(65535);
        class189.method1223(arg0 - 7249);
        class400.method2372(-36);
        class272.method1696(arg0 ^ 0xFFFFFFBB);
        class115.method728(18545);
        class200.method1273(arg0 ^ 0x40);
        class107.method675((byte) -87);
        class139.method851((byte) -114);
        class479.method2821(27660);
        class363.method2202(0);
        class275.method1724(-249);
        class480.method2828(arg0 - 11965);
        class446.method2598(-51);
        class35.method261((byte) -86);
        class167.method1038((byte) -128);
        class81.method561(0);
        class425.method2477(false);
        class372.method2231(29607);
        class75.method507((byte) 24);
        class485.method2843((byte) 56);
        class406.method2387(-32695);
        class464.method2737(2);
        class103.method650((byte) 105);
        class155.method945(arg0 ^ 0x760D);
        class465.method2741(false);
        class67.method469((byte) -95);
        class351.method2098((byte) 104);
        class90.method610((byte) 96);
        class168.method1042(-13325);
        class76.method523(0);
        class85.method588(-88);
        class232.method1460((byte) 2);
        class269.method1684((byte) 44);
        class473.method2777((byte) 110);
        class488.method2871((byte) 110);
        class63.method461((byte) -121);
        class31.method247(arg0 - 12631);
        class301.method1835((byte) 82);
        class37.method310(1204766634);
        class472.method2772(7);
        class258.method1602((byte) 2);
        class350.method2096(true);
        class435.method2531((byte) 53);
        class407.method2392((byte) -93);
        class53.method416(-5913);
        class183.method1202(arg0 ^ 0x44);
        class58.method436((byte) 1);
        class15.method146(arg0 - 63);
        class13.method110((byte) -75);
        class60.method444((byte) -45);
        class308.method1864(68);
        class38.method315((byte) -114);
        class254.method1577(arg0 + 57);
        class475.method2786((byte) 34);
        class172.method1156(arg0 ^ 0x40);
        class127.method766((byte) 127);
        class164.method1011(2000);
        class166.method1020(arg0 - 17);
        class336.method2006(13);
        class482.method2832(false);
        class130.method791((byte) 125);
        class121.method754(arg0 ^ 0x40);
        class43.method354(true);
        class82.method563((byte) 91);
        class399.method2370(-55);
        class8.method95(arg0 ^ 0x4A97);
        class213.method1336();
        class377.method2251((byte) -121);
        class305.method1852((byte) -21);
        class437.method2542(-18559);
        class126.method764((byte) -78);
        class148.method910((byte) -96);
        class344.method2058((byte) -111);
        class491.method2878(128);
        class212.method1330();
        class379.method2264();
        class118.method743(-110);
        class163.method993(-104);
        class141.method869();
        class443.method2578(true);
        class442.method2565((byte) 120);
        class460.method2720(-14508);
        class239.method1501(3);
        class378.method2253(110);
        class184.method1203(false);
        class192.method1236(5);
        class154.method937(false);
        class382.method2289(arg0 - 63);
        class307.method1856(arg0 - 64);
        class318.method1921((byte) -118);
        class335.method1991((byte) 51);
        class310.method1871(-80);
        class277.method1735(-125);
        class228.method1436(arg0 ^ 0x39);
        class381.method2286((byte) 107);
        class78.method536(-1);
        class221.method1398(false);
        class29.method235((byte) -126);
        class224.method1414(true);
        class302.method1840(arg0 ^ 0xFFFFF167);
        class321.method1933(false);
        class393.method2346(true);
        class319.method1926((byte) -117);
        class11.method106(0);
        class389.method2317(-1);
        class366.method2212((byte) -44);
        class202.method1283(false);
        class285.method1762(-118);
        class198.method1260((byte) -126);
        class449.method2607(-1);
        class283.method1758((byte) 75);
        class56.method432(-116);
        class445.method2592(-65536);
        class62.method459();
        class175.method1159(21);
        class334.method1987((byte) -105);
        class129.method784(4);
        class267.method1681(60);
        class388.method2307(arg0 ^ 0x3BF);
        class125.method761(true);
        class32.method249(false);
        class84.method582((byte) -127);
        class33.method255((byte) -1);
        class478.method2814(arg0 - 24);
        class280.method1748(-8);
        class370.method2223(0);
        class70.method488(arg0 - 9);
        class83.method566();
        class282.method1756((byte) -74);
        class303.method1842(5000);
        class490.method2874(arg0 ^ 0x40);
        class270.method1688(false);
        class367.method2218((byte) 4);
        class242.method1517(-54);
        class467.method2751(false);
        class146.method904(true);
        class216.method1367(true);
        class80.method551(64);
        class459.method2715(arg0 + 1197694544);
        class178.method1164(55);
        class132.method794(false);
        class240.method1504(1);
        class462.method2734(-112);
        class152.method918((byte) 104);
        class330.method1972(-113);
        class380.method2280((byte) 42);
        class158.method958();
        class108.method676(false);
        class123.method758(-24952);
        class99.method629(arg0 - 59);
        class233.method1466((byte) 126);
        class114.method718(-68);
        class401.method2374(76);
        class418.method2440((byte) 92);
        class484.method2834((byte) 0);
        class101.method644(-124);
        class30.method244((byte) -125);
        class119.method746(255);
        class137.method841(-116);
        class392.method2341((byte) 67);
        class55.method428((byte) 97);
        class16.method153();
        class356.method2142(false);
        class309.method1869(0);
        class293.method1810((byte) 112);
        class353.method2130(arg0 + 16455);
        class409.method2398((byte) 31);
        class371.method2225(84);
        class287.method1768(0);
        class290.method1785(32767);
        class73.method499(30976);
        class64.method464(arg0 - 21);
        class373.method2238(-18603);
        class313.method1891();
        class419.method2442(59);
        class374.method2239(114);
        class109.method679(4);
        class22.method184((byte) 76);
        class153.method927(arg0 ^ 0x17);
        class241.method1509(0);
        class440.method2555((byte) 20);
        class197.method1254((byte) -7);
        class295.method1828(65358);
        class323.method1945(-105);
        class383.method2293(-4814);
        class50.method397((byte) -85);
        class203.method1289(arg0 - 64);
        class251.method1561(66);
        class210.method1321(arg0 ^ 0x40);
        class204.method1293(arg0 ^ 0x25AF);
        class94.method617();
        class279.method1744();
        class66.method466(64);
        class226.method1430((byte) -6);
        class238.method1496(arg0 ^ 0xFFFFF8FE);
        class329.method1968(6);
        class128.method783((byte) 53);
        class360.method2165();
        class316.method1900();
        class346.method2066((byte) -114);
        class276.method1725();
        class27.method231(arg0 - 87);
        class47.method371(64);
        class214.method1350(21648);
        class10.method101(27523);
        class341.method2019((byte) 72);
        class444.method2586(arg0 - 9);
        class205.method1294(0);
        class439.method2551((byte) 122);
        class59.method438(arg0 - 6702);
        class421.method2446(16449);
        class430.method2522(false);
        class294.method1816((byte) -90);
        class306.method1853(arg0 ^ 0x49);
        if (arg0 != 64) {
            field5498 = null;
        }
        class135.method820(-106);
        class349.method2091((byte) -80);
        class235.method1479((byte) -59);
        class455.method2626(511421932);
        class325.method1956((byte) 67);
        class411.method2410(arg0 - 29099);
        class451.method2612(17036);
        class312.method1882(arg0 - 983492253);
        class243.method1522(10123);
        class191.method1229(64);
        class396.method2368((byte) 56);
        class327.method1966((byte) -98);
        class199.method1264(arg0 ^ 0x11);
        class431.method2524(true);
        class105.method670((byte) -110);
        class262.method1620(arg0 + 45);
        class266.method1679(false);
        class181.method1191(28931);
        class231.method1452((byte) 42);
        class39.method321((byte) -109);
        class61.method445(-23082);
        class194.method1239(102);
        class438.method2545(684);
        class320.method1929(95);
        class355.method2136((byte) 42);
        class227.method1432(4080);
        class2.method9(arg0 - 186);
        class357.method2144(arg0 ^ 0xFFFFFFC9);
        class376.method2245(true);
        class448.method2603((byte) 115);
        class3.method17((byte) -22);
        class286.method1764((byte) 13);
        class422.method2448((byte) 60);
        class375.method2242((byte) -15);
        class274.method1722(65535);
        class326.method1960((byte) -77);
        class120.method751((byte) -128);
        class42.method348(true);
        class468.method2755(27988);
        class211.method1326(-22984);
        class434.method2529(arg0 ^ 0x41);
        class19.method161((byte) 111);
        class138.method843((byte) 99);
        class352.method2105();
        class246.method1533();
        class259.method1606(109);
        class261.method1613((byte) -107);
        class46.method361(7);
        class268.method1683((byte) -103);
        class160.method970(126);
        class244.method1523(16);
        class68.method479(arg0 ^ 0x5924);
        class230.method1448(-63);
        class466.method2745((byte) -84);
        class338.method2010((byte) 12);
        class102.method647(true);
        class314.method1894(true);
        class229.method1439((byte) -81);
        class304.method1845((byte) 11);
        class161.method975(-16802);
        class410.method2406((byte) 106);
        class423.method2452((byte) 19);
        class9.method97(41);
        class21.method182(9773);
        class106.method673(0);
        class162.method988(1792106936);
        class489.method2872((byte) -9);
        class386.method2302(76);
        class5.method78(false);
        class292.method1805(24790);
        class432.method2528((byte) 121);
        class289.method1782((byte) -113);
        class387.method2303(true);
        class299.method1834((byte) -126);
        if (class145.field2055) {
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method2335(int arg0) {
        field5510++;
        if (class374.field5299.field6607 > class231.field3259) {
            class52.field867 = (class374.field5299.field6607 * 50 - 50) * 5;
            if (class381.field5400 == class363.field5157) {
                class363.field5157 = class230.field3247;
            } else {
                class363.field5157 = class381.field5400;
            }
            if (class52.field867 > 3000) {
                class52.field867 = 3000;
            }
            if (class374.field5299.field6607 >= 2 && class374.field5299.field6610 == 6) {
                this.method896("js5connect_outofdate", false);
                class478.field6764 = 1000;
                return;
            }
            if (class374.field5299.field6607 >= 4 && class374.field5299.field6610 == -1) {
                this.method896("js5crc", false);
                class478.field6764 = 1000;
                return;
            }
            if (class374.field5299.field6607 >= 4 && (class478.field6764 == 0 || class478.field6764 == 5)) {
                if (class374.field5299.field6610 == 7 || class374.field5299.field6610 == 9) {
                    this.method896("js5connect_full", false);
                } else if (class374.field5299.field6610 > 0) {
                    this.method896("js5connect", false);
                } else {
                    this.method896("js5io", false);
                }
                class478.field6764 = 1000;
                return;
            }
        }
        class231.field3259 = class374.field5299.field6607;
        if (class52.field867 > 0) {
            class52.field867--;
            return;
        }
        try {
            if (class50.field848 == 0) {
                class373.field5289 = class343.field4703.method125((byte) 31, class267.field3718, class363.field5157);
                class50.field848++;
            }
            if (class50.field848 == 1) {
                if (class373.field5289.field5789 == 2) {
                    this.method2330(47, 1000);
                    return;
                }
                if (class373.field5289.field5789 == 1) {
                    class50.field848++;
                }
            }
            if (class50.field848 == 2) {
                class127.field1781 = new class456((Socket) class373.field5289.field5791, class343.field4703);
                class425 var2 = new class425(5);
                var2.method2470((byte) -74, class430.field5931.field6474);
                var2.method2481(572, true);
                class127.field1781.method2635(0, 5, var2.field5886, arg0 - 42872);
                class50.field848++;
                class334.field4583 = class193.method1237(-9581);
            }
            if (arg0 == 27763) {
                if (class50.field848 == 3) {
                    if (class478.field6764 == 0 || class478.field6764 == 5 || class127.field1781.method2634(-87) > 0) {
                        int var3 = class127.field1781.method2630((byte) 111);
                        if (var3 != 0) {
                            this.method2330(53, var3);
                            return;
                        }
                        class50.field848++;
                    } else if (class193.method1237(-9581) - class334.field4583 > 30000L) {
                        this.method2330(23, 1001);
                        return;
                    }
                }
                if (class50.field848 == 4) {
                    boolean var4 = class478.field6764 == 5 || class478.field6764 == 10 || class478.field6764 == 28;
                    class374.field5299.method2759(!var4, class127.field1781, (byte) 127);
                    class50.field848 = 0;
                    class373.field5289 = null;
                    class127.field1781 = null;
                }
            }
        } catch (IOException var5) {
            this.method2330(94, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method2336(int arg0) {
        int var1 = class163.field2345;
        int[] var2 = class482.field6800;
        int var3 = class80.field1209 ? var1 : class32.field520 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class75 var5;
            if (var4 < var1) {
                var5 = class310.field4235[var2[var4]];
            } else {
                var5 = class256.field3581[class42.field718[var4 - var1]];
            }
            if (var5.field6766 == arg0) {
                var5.field1082 = 0;
                if (var5.field1114 < 0) {
                    var5.field1123 = false;
                } else {
                    int var6 = var5.method206(0);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field6765 & 0x7F) != 0 || (var5.field6746 & 0x7F) != 0) {
                            var5.field1123 = false;
                            continue;
                        }
                    } else if ((var5.field6765 & 0x7F) != 64 || (var5.field6746 & 0x7F) != 64) {
                        var5.field1123 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field6765 >> 7;
                        int var8 = var5.field6746 >> 7;
                        if (class292.field4012[var7][var8] != var5.field1114) {
                            var5.field1123 = true;
                            continue;
                        }
                        if (class126.field1733[var7][var8] > 1) {
                            var10002 = class126.field1733[var7][var8]--;
                            var5.field1123 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field6765 - var9 >> 7;
                        int var11 = var5.field6746 - var9 >> 7;
                        int var12 = var5.field6765 + var9 >> 7;
                        int var13 = var5.field6746 + var9 >> 7;
                        if (!class277.method1740(var11, var13, var10, var12, 94, var5.field1114)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class292.field4012[var14][var15] == var5.field1114) {
                                        var10002 = class126.field1733[var14][var15]--;
                                    }
                                }
                            }
                            var5.field1123 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class23 && var5.field1145 != null && class356.field4972 >= var5.field1145.field3875 && class356.field4972 < var5.field1145.field3873) {
                        ((class23) var5).field391 = false;
                    }
                    var5.field1123 = false;
                    var5.field6755 = class418.method2441(var5.field6746, var5.field6766, var5.field6765, -16778);
                    class249.method1542(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public static final void method2337(int arg0) {
        int var1 = class163.field2345;
        int[] var2 = class482.field6800;
        for (int var3 = 0; var3 < class32.field520 + var1; var3++) {
            class75 var4;
            if (var3 < var1) {
                var4 = class310.field4235[var2[var3]];
            } else {
                var4 = class256.field3581[class42.field718[var3 - var1]];
            }
            if (var4.field6766 == arg0 && var4.field1114 >= 0) {
                int var5 = var4.method206(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6765 & 0x7F) != 0 || (var4.field6746 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field6765 & 0x7F) != 64 || (var4.field6746 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field6765 >> 7;
                    int var7 = var4.field6746 >> 7;
                    if (var4.field1114 > class292.field4012[var6][var7]) {
                        class292.field4012[var6][var7] = var4.field1114;
                        class126.field1733[var6][var7] = 1;
                    } else if (class292.field4012[var6][var7] == var4.field1114) {
                        var10002 = class126.field1733[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field6765 - var8 >> 7;
                    int var10 = var4.field6746 - var8 >> 7;
                    int var11 = var4.field6765 + var8 >> 7;
                    int var12 = var4.field6746 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field1114 > class292.field4012[var13][var14]) {
                                class292.field4012[var13][var14] = var4.field1114;
                                class126.field1733[var13][var14] = 1;
                            } else if (class292.field4012[var13][var14] == var4.field1114) {
                                var10002 = class126.field1733[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method897(int arg0) {
        if (arg0 != 31404) {
            return;
        }
        if (class146.field2067) {
            class10.method99(98);
        }
        field5495++;
        if (class338.field4636 != null) {
            class338.field4636.method2867(-8615);
        }
        if (class90.field1344 != null) {
            class204.method1292(class343.field4703, class90.field1344, -2);
            class90.field1344 = null;
        }
        if (class237.field3339 != null) {
            class237.field3339.method2632(32214);
            class237.field3339 = null;
        }
        if (class155.field2235 != null) {
            class155.field2235.method307(arg0 ^ 0x4A1, class138.field1965);
        }
        class155.field2235 = null;
        if (class36.field622 != null) {
            class36.field622.method1032((byte) -105);
        }
        if (class2.field22 != null) {
            class2.field22.method1032((byte) -127);
        }
        class374.field5299.method2767(false);
        class205.field2948.method620(5);
        if (class346.field4731 != null) {
            class346.field4731.method1225(arg0 - 31493);
            class346.field4731 = null;
        }
    }
}
