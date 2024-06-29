import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class83 implements Runnable {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Lwb;")
    public static class130 field1949 = class26.method212("@cr1@", -32376);

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lwb;")
    public static class130 field1951 = class26.method212("Fertigkeit)2", -32376);

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Lwb;")
    private static class130 field1960 = class26.method212("Loading interfaces )2 ", -32376);

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Lwb;")
    public static class130 field1954 = class26.method212("zur-Uck auf die RuneScape)2Webseite gehen", -32376);

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field1962 = -1;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lwb;")
    public static class130 field1957 = field1960;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field1961 = -1;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lda;")
    public static class20 field1955;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lmc;")
    public static class75 field1952;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "[I")
    public static int[] field1959;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)[Lqd;", line = 10)
    public static final class100[] method619(byte arg0) {
        field1958++;
        class100[] var1 = new class100[class93.field2254];
        for (int var2 = 0; var2 < class93.field2254; var2++) {
            class100 var3 = var1[var2] = new class100();
            var3.field2411 = class97.field2352;
            var3.field2405 = class106.field2580;
            var3.field2406 = class31.field876[var2];
            var3.field2408 = client.field548[var2];
            var3.field2407 = class115.field2839[var2];
            var3.field2409 = class26.field758[var2];
            var3.field2410 = class31.field869;
            var3.field2412 = class119.field2920[var2];
        }
        if (arg0 != -32) {
            field1952 = null;
        }
        class15.method116((byte) -55);
        return var1;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V", line = 52)
    public static final void method620(int arg0, int arg1, int arg2) {
        field1963++;
        class108 var3 = class23.field674[class71.field1818][arg2][arg1];
        if (var3 == null) {
            class79.field1926.method286(class71.field1818, arg2, arg1);
            return;
        }
        int var4 = arg0;
        class46 var5 = null;
        for (class46 var6 = (class46) var3.method813(82); var6 != null; var6 = (class46) var3.method814((byte) -19)) {
            class67 var11 = class84.method630((byte) 11, var6.field1233);
            int var12 = var11.field1731;
            if (var11.field1714 == 1) {
                var12 = (var6.field1248 + 1) * var12;
            }
            if (var12 > var4) {
                var4 = var12;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class79.field1926.method286(class71.field1818, arg2, arg1);
            return;
        }
        class46 var7 = null;
        var3.method810(var5, -30206);
        class46 var8 = (class46) var3.method813(-83);
        class46 var9 = null;
        while (var8 != null) {
            if (var5.field1233 != var8.field1233) {
                if (var9 == null) {
                    var9 = var8;
                }
                if (var8.field1233 != var9.field1233 && var7 == null) {
                    var7 = var8;
                }
            }
            var8 = (class46) var3.method814((byte) -19);
        }
        int var10 = (arg1 << 7) + arg2 + 1610612736;
        class79.field1926.method276(class71.field1818, arg2, arg1, class27.method219(336137319, class71.field1818, arg1 * 128 + 64, arg2 * 128 + 64), var5, var10, var9, var7);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILce;Z)V", line = 134)
    public static final void method621(int arg0, class18 arg1, boolean arg2) {
        field1950++;
        if (class45.field1207 != null) {
            try {
                class45.field1207.method148(arg0 - 114);
            } catch (Exception var8) {
            }
            class45.field1207 = null;
        }
        class45.field1207 = arg1;
        class99.method736(-108, arg2);
        if (arg0 != -2) {
            return;
        }
        class26.field736 = 0;
        class84.field1980.field1057 = 0;
        class109.field2644 = null;
        class14.field405 = null;
        while (true) {
            class99 var3 = (class99) class120.field2927.method75(11);
            if (var3 == null) {
                while (true) {
                    class99 var4 = (class99) class52.field1356.method75(arg0 + 54);
                    if (var4 == null) {
                        if (class47.field1267 != 0) {
                            try {
                                class36 var5 = new class36(4);
                                var5.method330(-1, 4);
                                var5.method330(-1, class47.field1267);
                                var5.method353(0, 65280);
                                class45.field1207.method145(0, 4, 0, var5.field1067);
                            } catch (IOException var7) {
                                try {
                                    class45.field1207.method148(arg0 ^ 0x6);
                                } catch (Exception var6) {
                                }
                                class45.field1207 = null;
                                class29.field817++;
                            }
                        }
                        class103.field2525 = 0;
                        class6.field229 = class90.method668(false);
                        return;
                    }
                    class106.field2579.method458((byte) -102, var4);
                    class95.field2304.method80(var4.field2329, var4, -1);
                    class21.field604--;
                    class129.field3051++;
                }
            }
            class15.field438.method80(var3.field2329, var3, -1);
            class21.field596--;
            class79.field1914++;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBIII[B[Luc;)V", line = 209)
    public static final void method622(int arg0, byte arg1, int arg2, int arg3, int arg4, byte[] arg5, class121[] arg6) {
        field1965++;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg3 + var13 > 0 && arg3 + var13 < 103 && arg0 + var14 > 0 && arg0 + var14 < 103) {
                        arg6[var7].field2964[arg3 + var13][arg0 + var14] = class32.method257(arg6[var7].field2964[arg3 + var13][arg0 + var14], -16777217);
                    }
                }
            }
        }
        class36 var8 = new class36(arg5);
        int var9 = -73 % ((arg1 - 13) / 41);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    class40.method395(arg0 + var12, arg4, var10, arg2, var8, 32, 0, var11 + arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "run", descriptor = "()V", line = 275)
    public final void run() {
        field1964++;
        try {
            while (true) {
                class108 var1 = class71.field1800;
                class37 var2;
                synchronized (class71.field1800) {
                    var2 = (class37) class71.field1800.method813(-116);
                }
                if (var2 == null) {
                    class37.method375(-1, 100L);
                    Object var3 = class31.field871;
                    synchronized (class31.field871) {
                        if (class21.field600 <= 1) {
                            class21.field600 = 0;
                            class31.field871.notifyAll();
                            return;
                        }
                        class21.field600--;
                    }
                } else {
                    if (var2.field1092 == 0) {
                        var2.field1081.method51(var2.field1086.length, (int) var2.field2329, -14317, var2.field1086);
                        class108 var5 = class71.field1800;
                        synchronized (class71.field1800) {
                            var2.method714((byte) -95);
                        }
                    } else if (var2.field1092 == 1) {
                        var2.field1086 = var2.field1081.method55((int) var2.field2329, -9171);
                        class108 var4 = class71.field1800;
                        synchronized (class71.field1800) {
                            class4.field162.method819(var2, -95);
                        }
                    }
                    Object var6 = class31.field871;
                    synchronized (class31.field871) {
                        if (class21.field600 <= 1) {
                            class21.field600 = 0;
                            class31.field871.notifyAll();
                            return;
                        }
                        class21.field600 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class33.method264(null, var17, (byte) 73);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 347)
    public static void method623(int arg0) {
        field1957 = null;
        if (arg0 > -49) {
            return;
        }
        field1959 = null;
        field1951 = null;
        field1952 = null;
        field1954 = null;
        field1949 = null;
        field1960 = null;
        field1955 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V", line = 400)
    public static final void method624(byte arg0) {
        class68.field1763 = new int[104];
        class8.field288 = new byte[4][104][104];
        class8.field263 = new byte[4][104][104];
        class81.field1941 = new int[105][105];
        class106.field2578 = new int[104];
        class43.field1188 = new byte[4][104][104];
        class117.field2895 = new int[4][105][105];
        class105.field2536 = new int[104];
        class4.field167 = new int[104];
        class6.field228 = new byte[4][104][104];
        field1956++;
        class128.field3028 = 99;
        class56.field1441 = new int[104];
        class117.field2879 = new byte[4][105][105];
        int var1 = 92 / ((arg0 + 54) / 40);
    }
}
