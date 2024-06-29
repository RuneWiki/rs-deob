import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class101 {

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Lid;")
    public static class60 field2456 = class11.method72("und loggen sich dann erneut ein)3", (byte) -89);

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Lmc;")
    public static class86 field2457 = new class86(512);

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Lid;")
    public static class60 field2460 = class11.method72("Fehler bei der Verbindung zum Server)3", (byte) -17);

    @OriginalMember(owner = "client!od", name = "q", descriptor = "Lid;")
    private static class60 field2463 = class11.method72("green:", (byte) -122);

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Lid;")
    public static class60 field2466 = field2463;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field2468 = 0;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Lid;")
    public static class60 field2467 = field2463;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Lqd;")
    public static class115 field2459 = new class115(64);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public int field2448;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public int field2450;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public int field2452;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public int field2455;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public int field2464;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Lha;")
    public class50 field2451;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "[Lkf;")
    public static class75[] field2470;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BJ)V")
    public static final void method790(byte arg0, long arg1) {
        field2454++;
        if (arg1 != 0L) {
            class22.field519.method1214(85, 0);
            class9.field139++;
            class22.field519.method830(arg1, 99);
            int var3 = 56 % ((arg0 - 62) / 62);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static final void method791(byte arg0) {
        field2458++;
        class131.field2964.method920((byte) 14);
        class89.field2209.method920((byte) 14);
        if (arg0 != -73) {
            field2461 = -76;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method792(int arg0) {
        field2457 = null;
        field2463 = null;
        field2467 = null;
        field2456 = null;
        field2459 = null;
        if (arg0 == 2185) {
            field2466 = null;
            field2460 = null;
            field2470 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public static final void method793(int arg0) {
        field2462++;
        class133 var1 = class145.field3268;
        synchronized (class145.field3268) {
            class28.field672 = class136.field3084;
            class43.field1153 = class120.field2754;
            class21.field494 = class19.field462;
            class60.field1466 = class45.field1189;
            class140.field3185 = class87.field2173;
            class139.field3174 = class61.field1536;
            class45.field1195 = class136.field3085;
            if (arg0 != -13021) {
                field2463 = null;
            }
            class45.field1189 = 0;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILfd;)I")
    public static final int method794(int arg0, int arg1, class40 arg2) {
        field2447++;
        if (arg2.field1019 == null || arg1 >= arg2.field1019.length) {
            return -2;
        }
        try {
            if (arg0 != -29559) {
                method790((byte) -97, -30L);
            }
            int var3 = 0;
            int var4 = 0;
            byte var5 = 0;
            int[] var6 = arg2.field1019[arg1];
            while (true) {
                int var7 = var6[var4++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var3;
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 1) {
                    var9 = class85.field2080[var6[var4++]];
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 2) {
                    var9 = class40.field1043[var6[var4++]];
                }
                if (var7 == 3) {
                    var9 = class32.field751[var6[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var6[var4++] << 16;
                    int var11 = var10 + var6[var4++];
                    class40 var12 = class132.method1041(true, var11);
                    int var13 = var6[var4++];
                    if (var13 != -1 && (!class85.method710(var13, 10).field2133 || class31.field719)) {
                        for (int var14 = 0; var14 < var12.field1053.length; var14++) {
                            if (var13 + 1 == var12.field1053[var14]) {
                                var9 += var12.field993[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class43.field1158[var6[var4++]];
                }
                if (var7 == 6) {
                    var9 = class132.field2997[class40.field1043[var6[var4++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class43.field1158[var6[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class107.field2640.field13;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class63.field1578[var15]) {
                            var9 += class40.field1043[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var6[var4++] << 16;
                    int var17 = var16 + var6[var4++];
                    class40 var18 = class132.method1041(true, var17);
                    int var19 = var6[var4++];
                    if (var19 != -1 && (!class85.method710(var19, arg0 + 29569).field2133 || class31.field719)) {
                        for (int var20 = 0; var20 < var18.field1053.length; var20++) {
                            if (var19 + 1 == var18.field1053[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class131.field2982;
                }
                if (var7 == 12) {
                    var9 = class66.field1610;
                }
                if (var7 == 13) {
                    int var21 = class43.field1158[var6[var4++]];
                    int var22 = var6[var4++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var6[var4++];
                    var9 = class75.method568((byte) -105, var23);
                }
                if (var7 == 18) {
                    var9 = (class107.field2640.field854 >> 7) + class41.field1095;
                }
                if (var7 == 19) {
                    var9 = (class107.field2640.field828 >> 7) + class144.field3240;
                }
                if (var7 == 20) {
                    var9 = var6[var4++];
                }
                if (var8 == 0) {
                    if (var5 == 0) {
                        var3 += var9;
                    }
                    if (var5 == 1) {
                        var3 -= var9;
                    }
                    if (var5 == 2 && var9 != 0) {
                        var3 /= var9;
                    }
                    if (var5 == 3) {
                        var3 *= var9;
                    }
                    var5 = 0;
                } else {
                    var5 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
    public static final void method795(boolean arg0) {
        field2449++;
        if (!class1.field17) {
            return;
        }
        class40 var1 = class158.method1218(12777, class10.field159, class135.field3073);
        if (var1 != null && var1.field1069 != null) {
            class15 var2 = new class15();
            var2.field361 = var1;
            var2.field353 = var1.field1069;
            class61.method467(false, var2);
        }
        class1.field17 = arg0;
        class12.method79(-30833, var1);
    }
}
