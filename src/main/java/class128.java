import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class128 {

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Lkh;")
    private static class117 field2367 = class224.method1450((byte) 105, "Create a free account");

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "Lkh;")
    public static class117 field2369 = field2367;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Lkh;")
    public static class117 field2372 = class224.method1450((byte) -22, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Lkh;")
    public static class117 field2368 = class224.method1450((byte) -96, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static volatile int field2371 = 0;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field2375 = 0;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public int field2364;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public int field2366;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public int field2370;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public int field2378;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "Lkh;")
    public class117 field2377;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Z")
    public boolean field2363;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "[I")
    public static int[] field2361;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)[B")
    public static final byte[] method874(int arg0, int arg1) {
        if (arg0 != 255) {
            return null;
        }
        field2373++;
        class115 var2 = (class115) class191.field3402.method506(arg0 ^ 0xFE, (long) arg1);
        if (var2 == null) {
            Random var3 = new Random((long) arg1);
            byte[] var4 = new byte[512];
            for (int var5 = 0; var5 < 255; var5++) {
                var4[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class223.method1447(var7, var3, (byte) -79);
                byte var9 = var4[var8];
                var4[var8] = var4[var7];
                var4[var7] = var4[511 - var6] = var9;
            }
            var2 = new class115(var4);
            class191.field3402.method497((long) arg1, var2, -95);
        }
        return var2.field2138;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method875(int arg0) {
        field2367 = null;
        field2372 = null;
        field2361 = null;
        field2368 = null;
        field2369 = null;
        if (arg0 != -1608) {
            method874(-114, 22);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILkb;Z)V")
    public static final void method876(int arg0, class111 arg1, boolean arg2) {
        field2374++;
        if (class229.field4122 != null) {
            try {
                class229.field4122.method748((byte) -84);
            } catch (Exception var8) {
            }
            class229.field4122 = null;
        }
        class229.field4122 = arg1;
        class171.method1202(arg0 + 111, arg2);
        class95.field1746 = 0;
        class103.field1880.field2643 = arg0;
        class233.field4197 = null;
        class40.field920 = null;
        while (true) {
            class166 var3 = (class166) class228.field4108.method456((byte) 113);
            if (var3 == null) {
                while (true) {
                    class166 var4 = (class166) class71.field1364.method456((byte) 117);
                    if (var4 == null) {
                        if (class200.field3637 != 0) {
                            try {
                                class145 var5 = new class145(4);
                                var5.method1002(false, 4);
                                var5.method1002(false, class200.field3637);
                                var5.method993(false, 0);
                                class229.field4122.method750(0, var5.field2613, -7115, 4);
                            } catch (IOException var7) {
                                try {
                                    class229.field4122.method748((byte) -84);
                                } catch (Exception var6) {
                                }
                                class229.field4122 = null;
                                class5.field85++;
                            }
                        }
                        class127.field2348 = 0;
                        class43.field946 = class4.method31((byte) 47);
                        return;
                    }
                    class36.field825.method711((byte) -113, var4);
                    class27.field669.method461(var4.field389, (byte) -117, var4);
                    class34.field799++;
                    class216.field3933--;
                }
            }
            class94.field1731.method461(var3.field389, (byte) -24, var3);
            class186.field3334--;
            class45.field968++;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIII)I")
    public static final int method877(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= -76) {
            method878((byte) -82, null, null, null, null);
        }
        if (arg3 > 243) {
            arg1 >>= 0x4;
        } else if (arg3 > 217) {
            arg1 >>= 0x3;
        } else if (arg3 > 192) {
            arg1 >>= 0x2;
        } else if (arg3 > 179) {
            arg1 >>= 0x1;
        }
        field2376++;
        return (arg3 >> 1) + ((arg2 >> 2 << 10) + (arg1 >> 5 << 7));
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLkh;Lai;Lkh;Lai;)Lmg;")
    public static final class138 method878(byte arg0, class117 arg1, class10 arg2, class117 arg3, class10 arg4) {
        int var5 = arg4.method84(arg3, 1491);
        if (arg0 != 90) {
            field2368 = null;
        }
        field2365++;
        int var6 = arg4.method102(false, arg1, var5);
        return class136.method904(arg2, arg4, var6, (byte) 127, var5);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)Lkh;")
    public static final class117 method879(int arg0, byte arg1) {
        field2362++;
        if (arg0 < 999999999) {
            return class42.method358(arg0, (byte) 34);
        } else {
            if (arg1 != -53) {
                method879(-80, (byte) 10);
            }
            return class94.field1730;
        }
    }
}
