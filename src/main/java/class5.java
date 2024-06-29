import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 implements Runnable {

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field106 = 0;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Lic;")
    public static class59 field109 = class59.method433(0, "<img=1>");

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "[J")
    public static long[] field110 = new long[100];

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lwd;")
    public static class157 field103 = new class157(new byte[5000]);

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Lic;")
    private static class59 field111 = class59.method433(0, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lic;")
    public static class59 field112 = class59.method433(0, " <col=ffffff>");

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "Lic;")
    public static class59 field116 = field111;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Lic;")
    private static class59 field113 = class59.method433(0, "white:");

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "[Lic;")
    public static class59[] field117 = new class59[100];

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "Lic;")
    public static class59 field119 = class59.method433(0, "m-Ochte sich mit Ihnen duellieren)3");

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Lic;")
    public static class59 field114 = field113;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Lic;")
    public static class59 field115 = null;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "Lic;")
    public static class59 field118 = field113;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static final void method24(int arg0) {
        field99++;
        if (arg0 != 13680) {
            method25(5, -19);
        }
        for (int var1 = 0; var1 < class106.field2526; var1++) {
            int var2 = class3.field62[var1];
            class90 var3 = class47.field1210[var2];
            int var4 = class10.field213.method1194(false);
            if ((var4 & 0x10) != 0) {
                var3.field2276 = class21.method119(9, class10.field213.method1161((byte) 60));
                var3.field1745 = var3.field2276.field2851;
                var3.field1748 = var3.field2276.field2839;
                var3.field1737 = var3.field2276.field2822;
                var3.field1713 = var3.field2276.field2803;
                var3.field1693 = var3.field2276.field2807;
                var3.field1717 = var3.field2276.field2824;
                var3.field1757 = var3.field2276.field2816;
                var3.field1712 = var3.field2276.field2817;
                var3.field1710 = var3.field2276.field2802;
            }
            if ((var4 & 0x4) != 0) {
                int var5 = class10.field213.method1173(false);
                int var6 = class10.field213.method1170((byte) -21);
                var3.method550(var6, (byte) -25, class23.field561, var5);
                var3.field1684 = class23.field561 + 300;
                var3.field1695 = class10.field213.method1194(false);
                var3.field1696 = class10.field213.method1170((byte) 102);
            }
            if ((var4 & 0x40) != 0) {
                var3.field1711 = class10.field213.method1211(false);
                if (var3.field1711 == 65535) {
                    var3.field1711 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field1697 = class10.field213.method1214((byte) -46);
                var3.field1720 = 100;
            }
            if ((var4 & 0x1) != 0) {
                var3.field1744 = class10.field213.method1211(false);
                var3.field1726 = class10.field213.method1211(false);
            }
            if ((var4 & 0x2) != 0) {
                int var7 = class10.field213.method1161((byte) 60);
                int var8 = class10.field213.method1199(arg0 - 13574);
                if (var7 == 65535) {
                    var7 = -1;
                }
                if (var3.field1685 == var7 && var7 != -1) {
                    int var9 = class49.method381(var7, (byte) 109).field623;
                    if (var9 == 1) {
                        var3.field1691 = 0;
                        var3.field1709 = var8;
                        var3.field1754 = 0;
                        var3.field1743 = 0;
                    }
                    if (var9 == 2) {
                        var3.field1743 = 0;
                    }
                } else if (var7 == -1 || var3.field1685 == -1 || class49.method381(var7, (byte) 116).field638 >= class49.method381(var3.field1685, (byte) 113).field638) {
                    var3.field1685 = var7;
                    var3.field1691 = 0;
                    var3.field1743 = 0;
                    var3.field1681 = var3.field1715;
                    var3.field1709 = var8;
                    var3.field1754 = 0;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var10 = class10.field213.method1173(false);
                int var11 = class10.field213.method1170((byte) -54);
                var3.method550(var11, (byte) -25, class23.field561, var10);
                var3.field1684 = class23.field561 + 300;
                var3.field1695 = class10.field213.method1170((byte) -50);
                var3.field1696 = class10.field213.method1173(false);
            }
            if ((var4 & 0x8) != 0) {
                var3.field1682 = class10.field213.method1180(-128);
                int var12 = class10.field213.method1175((byte) -91);
                if (var3.field1682 == 65535) {
                    var3.field1682 = -1;
                }
                var3.field1746 = class23.field561 + (var12 & 0xFFFF);
                var3.field1739 = 0;
                var3.field1689 = var12 >> 16;
                var3.field1705 = 0;
                if (var3.field1746 > class23.field561) {
                    var3.field1739 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Z")
    public static final boolean method25(int arg0, int arg1) {
        if (arg0 != -123) {
            method27(-91, 8, 27, 80, 117);
        }
        field101++;
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public static void method26(int arg0) {
        field113 = null;
        field109 = null;
        field110 = null;
        field114 = null;
        int var1 = 111 / ((4 - arg0) / 48);
        field116 = null;
        field111 = null;
        field118 = null;
        field117 = null;
        field112 = null;
        field119 = null;
        field115 = null;
        field103 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIII)V")
    public static final void method27(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field102++;
        for (class86 var5 = (class86) class61.field1561.method682(arg4); var5 != null; var5 = (class86) class61.field1561.method684((byte) -65)) {
            if (var5.field2162 != -1 || var5.field2167 != null) {
                int var6 = 0;
                if (var5.field2148 < arg1) {
                    var6 += arg1 - var5.field2148;
                } else if (arg1 < var5.field2171) {
                    var6 += var5.field2171 - arg1;
                }
                if (var5.field2158 < arg2) {
                    var6 += arg2 - var5.field2158;
                } else if (arg2 < var5.field2151) {
                    var6 += var5.field2151 - arg2;
                }
                if (var6 - 64 > var5.field2170 || class73.field1804 == 0 || var5.field2150 != arg0) {
                    if (var5.field2146 != null) {
                        class120.field2766.method1081(var5.field2146);
                        var5.field2146 = null;
                    }
                    if (var5.field2157 != null) {
                        class120.field2766.method1081(var5.field2157);
                        var5.field2157 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field2170 - var6) * class73.field1804 / var5.field2170;
                    if (var5.field2146 != null) {
                        var5.field2146.method568(var7);
                    } else if (var5.field2162 >= 0) {
                        class101 var8 = class101.method809(class103.field2514, var5.field2162, 0);
                        if (var8 != null) {
                            class104 var9 = var8.method810().method816(class157.field3459);
                            class71 var10 = class71.method582(var9, 100, var7);
                            var10.method575(-1);
                            class120.field2766.method1076(var10);
                            var5.field2146 = var10;
                        }
                    }
                    if (var5.field2157 != null) {
                        var5.field2157.method568(var7);
                        if (!var5.field2157.method927((byte) 124)) {
                            var5.field2157 = null;
                        }
                    } else if (var5.field2167 != null && (var5.field2174 -= arg3) <= 0) {
                        int var11 = (int) (Math.random() * (double) var5.field2167.length);
                        class101 var12 = class101.method809(class103.field2514, var5.field2167[var11], 0);
                        if (var12 != null) {
                            class104 var13 = var12.method810().method816(class157.field3459);
                            class71 var14 = class71.method582(var13, 100, var7);
                            var14.method575(0);
                            class120.field2766.method1076(var14);
                            var5.field2157 = var14;
                            var5.field2174 = var5.field2164 + (int) ((double) (var5.field2147 - var5.field2164) * Math.random());
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "run", descriptor = "()V")
    public final void run() {
        field104++;
        try {
            while (true) {
                class83 var1 = class152.field3301;
                class52 var2;
                synchronized (class152.field3301) {
                    var2 = (class52) class152.field3301.method682(0);
                }
                if (var2 == null) {
                    class126.method962(false, 100L);
                    Object var3 = class63.field1614;
                    synchronized (class63.field1614) {
                        if (class80.field1995 <= 1) {
                            class80.field1995 = 0;
                            class63.field1614.notifyAll();
                            return;
                        }
                        class80.field1995--;
                    }
                } else {
                    if (var2.field1290 == 0) {
                        var2.field1295.method847(var2.field1293.length, (int) var2.field2736, true, var2.field1293);
                        class83 var4 = class152.field3301;
                        synchronized (class152.field3301) {
                            var2.method929(109);
                        }
                    } else if (var2.field1290 == 1) {
                        var2.field1293 = var2.field1295.method849((int) var2.field2736, 126);
                        class83 var5 = class152.field3301;
                        synchronized (class152.field3301) {
                            class134.field2972.method689(var2, (byte) -128);
                        }
                    }
                    Object var6 = class63.field1614;
                    synchronized (class63.field1614) {
                        if (class80.field1995 <= 1) {
                            class80.field1995 = 0;
                            class63.field1614.notifyAll();
                            return;
                        }
                        class80.field1995 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class86.method704(var17, null, 4436);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILwf;)Z")
    public static final boolean method28(int arg0, class159 arg1) {
        field100++;
        if (class35.field925) {
            if (class112.method915(arg1, -2042430560) != 0) {
                return false;
            }
            if (arg1.field3612 == 0) {
                return false;
            }
        }
        return arg0 == -1 ? arg1.field3622 : false;
    }
}
