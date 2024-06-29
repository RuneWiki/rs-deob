import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field15 = 0;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field28 = 0;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field16 = -1;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "J")
    public static long field22 = 0L;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field24 = 1;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "[Lna;")
    public static class31[] field17 = new class31[50];

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field25;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "[I")
    public static int[] field23;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "[[S")
    public static short[][] field26;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "[[[B")
    public static byte[][][] field18;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method7(int arg0) {
        field26 = null;
        field17 = null;
        field18 = null;
        field25 = null;
        if (arg0 == 1) {
            field23 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)I")
    public static final int method8(int arg0, boolean arg1) {
        if (arg1) {
            return -26;
        } else {
            field20++;
            return arg0 >> 17 & 0x7;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ldf;I)V")
    public static final void method9(class51 arg0, int arg1) {
        field19++;
        if (class179.field2954 >= 2) {
            if (arg0.method292(true, class189.field3171)) {
                class255.method1741(-100);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class147.method1064(class20.method104(-100, new class51[] { class37.field566, class51.method311(var4, arg1 - 17591), class43.field687 }), (class51) null, (byte) 124, 0);
            }
            if (arg0.method292(true, class74.field1173)) {
                class246.method1675(-1);
            }
            if (arg0.method292(true, class176.field2886)) {
                class100.method734(true, 25);
            }
            if (arg0.method292(true, class264.field4626)) {
                class172.field2812 = true;
            }
            if (arg0.method292(true, class145.field2419)) {
                class172.field2812 = false;
            }
            if (arg0.method292(true, class257.field4499)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class159.field2605[var5].field2787[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method276(-114, class182.field3000) && class239.field4155 != 0) {
                class83.method645(arg1 ^ 0xFFFFAE0D, arg0.method279((byte) -55, 6).method274((byte) 11));
            }
            if (arg0.method292(true, class157.field2588) && class239.field4155 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method276(-112, class31.field458)) {
                class90.field1487 = arg0.method279((byte) -55, 12).method310(-1).method274((byte) 11);
                class147.method1064(class20.method104(-1, new class51[] { class64.field1042, class51.method311(class90.field1487, 10) }), (class51) null, (byte) 85, 0);
            }
            if (arg0.method292(true, class230.field4028)) {
                class79.field1263 = true;
            }
        }
        class176.field2880++;
        class95.field1575.method424((byte) 86, 64);
        class95.field1575.method919(-4742, arg0.method293(false) - 1);
        class95.field1575.method896((byte) 0, arg0.method279((byte) -55, 2));
        if (arg1 != 17601) {
            field22 = 87L;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(JI)V")
    public static final void method10(long arg0, int arg1) {
        field21++;
        if (arg0 == 0L) {
            return;
        }
        int var3 = 0;
        int var4 = 91 / ((-arg1 - 64) / 45);
        while (var3 < class184.field3051) {
            if (class122.field2079[var3] == arg0) {
                class184.field3051--;
                for (int var5 = var3; var5 < class184.field3051; var5++) {
                    class216.field3749[var5] = class216.field3749[var5 + 1];
                    class96.field1588[var5] = class96.field1588[var5 + 1];
                    class149.field2492[var5] = class149.field2492[var5 + 1];
                    class122.field2079[var5] = class122.field2079[var5 + 1];
                    class30.field433[var5] = class30.field433[var5 + 1];
                    class201.field3352[var5] = class201.field3352[var5 + 1];
                }
                class204.field3418 = class189.field3173;
                class95.field1570++;
                class95.field1575.method424((byte) 94, 48);
                class95.field1575.method885(arg0, (byte) -126);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)Ljg;")
    public static final class158 method11(int arg0) {
        if (arg0 <= 32) {
            field24 = 67;
        }
        field27++;
        class158 var1 = new class158(class13.field194, class122.field2078, class96.field1591[0], class125.field2123[0], class221.field3837[0], class106.field1751[0], class67.field1100[0], class139.field2327);
        class111.method804((byte) -14);
        return var1;
    }
}
