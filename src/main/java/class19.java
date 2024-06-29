import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 extends class2 {

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "Lkc;")
    private static class67 field369 = method144("Oct", 112);

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "Lkc;")
    private static class67 field371 = method144("Jul", 89);

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "Lkc;")
    public static class67 field372 = method144("Mem:", 91);

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "Lkc;")
    private static class67 field365 = method144("Jan", 114);

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Lkc;")
    private static class67 field366 = method144("Mar", 69);

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public static int field376 = 0;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "Lkc;")
    private static class67 field374 = method144("Nov", 103);

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "Lkc;")
    private static class67 field368 = method144("Checking for updates )2 ", 112);

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field364 = 0;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "Lkc;")
    private static class67 field387 = method144("Dec", 100);

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "Lkc;")
    private static class67 field361 = method144("Feb", 99);

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "Lkc;")
    private static class67 field381 = method144("Aug", 78);

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Lkc;")
    private static class67 field363 = method144("Loading )2 please wait)3", 90);

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "Lkc;")
    private static class67 field382 = method144("Apr", 93);

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "Lkc;")
    public static class67 field362 = field368;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "Lkc;")
    private static class67 field385 = method144("May", 79);

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "Lkc;")
    private static class67 field394 = method144("Jun", 92);

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "Lkc;")
    public static class67 field373 = field363;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "Lkc;")
    private static class67 field377 = method144("Sep", 81);

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "[[B")
    public static byte[][] field386 = new byte[250][];

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "[Lkc;")
    public static class67[] field391 = new class67[] { field365, field361, field366, field382, field385, field394, field371, field381, field377, field369, field374, field387 };

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "Lcd;")
    public class19 field383;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "Lcd;")
    public class19 field389;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "Ljava/awt/Image;")
    public static Image field379;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "[I")
    public static int[] field380;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "[Lnd;")
    public static class86[] field367;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;I)Lkc;", line = 9)
    public static final class67 method144(String arg0, int arg1) {
        field375++;
        if (arg1 < 67) {
            return null;
        }
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class67 var4 = new class67();
        var4.field1597 = new byte[var3];
        int var5 = 0;
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field1597[var4.field1572++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field1597[var4.field1572++] = (byte) var6;
            }
        }
        var4.method530((byte) 59);
        return var4.method524(true);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 75)
    public static void method145(byte arg0) {
        field361 = null;
        field381 = null;
        field368 = null;
        if (arg0 >= -33) {
            field364 = -31;
        }
        field373 = null;
        field367 = null;
        field363 = null;
        field369 = null;
        field366 = null;
        field382 = null;
        field391 = null;
        field377 = null;
        field379 = null;
        field374 = null;
        field371 = null;
        field385 = null;
        field372 = null;
        field362 = null;
        field394 = null;
        field387 = null;
        field386 = null;
        field380 = null;
        field365 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIILr;I)V", line = 107)
    public static final void method146(int arg0, int arg1, int arg2, int arg3, class106 arg4, int arg5) {
        field393++;
        class55 var6 = new class55();
        var6.field1350 = arg4.field2427;
        var6.field1338 = arg4.field2386 * 128;
        int var7 = arg4.field2369;
        var6.field1320 = arg5;
        var6.field1329 = arg0 * 128;
        var6.field1340 = arg4.field2378;
        if (arg1 > -97) {
            field382 = null;
        }
        var6.field1317 = arg2 * 128;
        int var8 = arg4.field2432;
        if (arg3 == 1 || arg3 == 3) {
            var7 = arg4.field2432;
            var8 = arg4.field2369;
        }
        var6.field1315 = (arg0 + var8) * 128;
        var6.field1325 = arg4.field2373;
        var6.field1347 = (arg2 + var7) * 128;
        var6.field1328 = arg4.field2393;
        if (arg4.field2433 != null) {
            var6.field1336 = arg4;
            var6.method444((byte) 36);
        }
        class25.field527.method95((byte) 72, var6);
        if (var6.field1328 != null) {
            var6.field1319 = var6.field1325 + (int) (Math.random() * (double) (var6.field1350 - var6.field1325));
        }
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V", line = 152)
    public static final void method147(int arg0) {
        for (int var1 = 0; var1 < class138.field3303; var1++) {
            int var10002 = class91.field2116[var1]--;
            if (class91.field2116[var1] >= -10) {
                class8 var3 = class122.field2874[var1];
                if (var3 == null) {
                    var3 = class8.method73(class71.field1684, class133.field3167[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class91.field2116[var1] += var3.method74();
                    class122.field2874[var1] = var3;
                }
                if (class91.field2116[var1] < 0) {
                    int var10;
                    if (class74.field1773[var1] == 0) {
                        var10 = class65.field1531;
                    } else {
                        int var4 = (class74.field1773[var1] & 0xFF) * 128;
                        int var5 = class74.field1773[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class69.field1640.field1260;
                        int var7 = class74.field1773[var1] >> 8 & 0xFF;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var8 = var7 * 128 + 64 - class69.field1640.field1190;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + var6 - 128;
                        if (var4 < var9) {
                            class91.field2116[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class54.field1298 / var4;
                    }
                    class16 var11 = var3.method75().method136(client.field480);
                    class27 var12 = class27.method211(var11, 100, var10);
                    var12.method209(class98.field2215[var1] - 1);
                    class121.field2836.method1059(var12);
                    class91.field2116[var1] = -100;
                }
            } else {
                class138.field3303--;
                for (int var2 = var1; var2 < class138.field3303; var2++) {
                    class133.field3167[var2] = class133.field3167[var2 + 1];
                    class122.field2874[var2] = class122.field2874[var2 + 1];
                    class98.field2215[var2] = class98.field2215[var2 + 1];
                    class91.field2116[var2] = class91.field2116[var2 + 1];
                    class74.field1773[var2] = class74.field1773[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 != -100) {
            field382 = null;
        }
        if (class141.field3393 > 0) {
            class141.field3393 -= 20;
            if (class141.field3393 < 0) {
                class141.field3393 = 0;
            }
            if (class141.field3393 == 0 && class96.field2169 != 0 && class29.field616 != -1) {
                class135.method1049(80, 0, class133.field3173, class29.field616, 0, false, class96.field2169);
            }
        }
        field370++;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V", line = 295)
    public static final void method148(byte arg0) {
        field378++;
        class82.field1954 = new class59(32);
        if (arg0 > -68) {
            method150(null, null, null, (byte) -111);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILac;II)Ldf;", line = 307)
    public static final class28 method149(int arg0, class4 arg1, int arg2, int arg3) {
        field392++;
        if (method151((byte) -92, arg1, arg3, arg0)) {
            return arg2 == -1 ? class121.method945(-1) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lac;Lkc;Lkc;B)Lab;", line = 345)
    public static final class3 method150(class4 arg0, class67 arg1, class67 arg2, byte arg3) {
        field388++;
        int var4 = arg0.method31(arg2, arg3 ^ 0x12);
        int var5 = arg0.method35(var4, arg1, arg3 ^ 0x48);
        return arg3 == 18 ? class25.method193(var5, var4, (byte) -96, arg0) : null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLac;II)Z", line = 365)
    public static final boolean method151(byte arg0, class4 arg1, int arg2, int arg3) {
        field384++;
        byte[] var4 = arg1.method27(arg3, true, arg2);
        if (var4 == null) {
            return false;
        }
        if (arg0 >= -2) {
            field371 = null;
        }
        class14.method116(var4, -21239);
        return true;
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V", line = 388)
    public final void method152(int arg0) {
        if (arg0 != -128) {
            field379 = null;
        }
        field390++;
        if (this.field383 != null) {
            this.field383.field389 = this.field389;
            this.field389.field383 = this.field383;
            this.field389 = null;
            this.field383 = null;
        }
    }
}
