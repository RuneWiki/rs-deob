import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class148 {

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Lje;")
    public static class67 field3389 = class85.method592(255, "Hidden)2");

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[[[I")
    public static int[][][] field3381 = new int[4][13][13];

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Lje;")
    private static class67 field3391 = class85.method592(255, "To play on this world move to a free area first");

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field3385 = 0;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Lje;")
    public static class67 field3392 = class85.method592(255, "titlebox");

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lje;")
    private static class67 field3382 = class85.method592(255, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field3394 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Lje;")
    public static class67 field3384 = field3391;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Lje;")
    public static class67 field3397 = class85.method592(255, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "[I")
    public static int[] field3395 = new int[] { 57, 20, 35, 31, 19, 42, 50, 17 };

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Lje;")
    public static class67 field3386 = class85.method592(255, "Die Verbindung konnte");

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "Lje;")
    public static class67 field3400 = field3382;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field3401 = -1;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Lje;")
    public static class67 field3399 = class85.method592(255, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Lje;")
    private static class67 field3383 = class85.method592(255, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members");

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "Lje;")
    public static class67 field3396 = field3383;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "J")
    public static long field3390;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method1139(int arg0) {
        field3396 = null;
        field3391 = null;
        field3382 = null;
        field3399 = null;
        field3400 = null;
        field3397 = null;
        field3383 = null;
        field3395 = null;
        field3392 = null;
        int var1 = 121 % ((arg0 + 35) / 40);
        field3384 = null;
        field3389 = null;
        field3386 = null;
        field3381 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILjava/awt/Component;ILq;)Lt;")
    public static final class132 method1140(int arg0, int arg1, Component arg2, int arg3, class111 arg4) {
        field3387++;
        if (class84.field1873 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class132 var5 = (class132) Class.forName("ia").getDeclaredConstructor().newInstance();
                var5.field2895 = new int[(class41.field765 ? 2 : 1) * 256];
                var5.field2923 = arg3;
                var5.method399(arg2);
                var5.field2924 = (arg3 & 0xFFFFFC00) + arg1;
                if (var5.field2924 > 16384) {
                    var5.field2924 = 16384;
                }
                var5.method401(var5.field2924);
                if (client.field395 > 0 && class44.field815 == null) {
                    class44.field815 = new class129();
                    class44.field815.field2828 = arg4;
                    arg4.method875(client.field395, class44.field815, 2);
                }
                if (class44.field815 != null) {
                    if (class44.field815.field2825[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class44.field815.field2825[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class153 var6 = new class153(arg4, arg0);
                    var6.field2923 = arg3;
                    var6.field2895 = new int[(class41.field765 ? 2 : 1) * 256];
                    var6.method399(arg2);
                    var6.field2924 = 16384;
                    var6.method401(var6.field2924);
                    if (client.field395 > 0 && class44.field815 == null) {
                        class44.field815 = new class129();
                        class44.field815.field2828 = arg4;
                        arg4.method875(client.field395, class44.field815, arg1 ^ 0x402);
                    }
                    if (class44.field815 != null) {
                        if (class44.field815.field2825[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class44.field815.field2825[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class132();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method1141(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field3393++;
        int var9 = 122 % ((23 - arg5) / 57);
        if (class135.method1024(arg1, (byte) -15)) {
            class49.field945 = null;
            class77.method546(arg8, arg7, arg3, arg0, arg6, -1, (byte) -66, arg2, class55.field1062[arg1], arg4);
            if (class49.field945 != null) {
                class77.method546(arg8, arg7, arg3, arg0, arg6, -1412584499, (byte) -119, class25.field454, class49.field945, class80.field1764);
                class49.field945 = null;
            }
        } else if (arg3 == -1) {
            for (int var10 = 0; var10 < 100; var10++) {
                class80.field1774[var10] = true;
            }
        } else {
            class80.field1774[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)[B")
    public static final synchronized byte[] method1142(int arg0, byte arg1) {
        field3402++;
        if (arg1 != -83) {
            method1142(-84, (byte) 111);
        }
        if (arg0 == 100 && class107.field2453 > 0) {
            byte[] var2 = class129.field2844[--class107.field2453];
            class129.field2844[class107.field2453] = null;
            return var2;
        } else if (arg0 == 5000 && class30.field528 > 0) {
            byte[] var3 = class24.field433[--class30.field528];
            class24.field433[class30.field528] = null;
            return var3;
        } else if (arg0 == 30000 && class40.field724 > 0) {
            byte[] var4 = class19.field364[--class40.field724];
            class19.field364[class40.field724] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }
}
