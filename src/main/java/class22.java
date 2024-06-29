import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class22 {

    @OriginalMember(owner = "client!d", name = "d", descriptor = "[I")
    public static int[] field361 = new int[256];

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Z")
    public static boolean field365;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Z")
    public static boolean field367;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lv;")
    private static class146 field364;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "[I")
    public static int[] field369;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Lv;")
    public static class146 field374;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Lv;")
    public static class146 field372;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Lv;")
    private static class146 field370;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "Lv;")
    private static class146 field378;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Lv;")
    public static class146 field366;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "Lv;")
    public static class146 field379;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "Lv;")
    public static class146 field377;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Lv;")
    public static class146 field371;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Lv;")
    private static class146 field368;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Z")
    public static boolean field375;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Lv;")
    public static class146 field376;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Ldc;")
    public static class25 field363;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "[I")
    public static int[] field362;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method140(int arg0) {
        field372 = null;
        field377 = null;
        field374 = null;
        field378 = null;
        if (arg0 != 2892) {
            field367 = false;
        }
        field376 = null;
        field362 = null;
        field366 = null;
        field368 = null;
        field371 = null;
        field370 = null;
        field369 = null;
        field363 = null;
        field379 = null;
        field361 = null;
        field364 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lue;B)V")
    public static final void method141(class144 arg0, byte arg1) {
        for (int var2 = 0; var2 < class68.field1541.length; var2++) {
            class68.field1541[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class68.field1541[var16] = (int) (Math.random() * 256.0D);
        }
        if (arg1 != -45) {
            field378 = null;
        }
        field359++;
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class9.field176[var15] = (class68.field1541[var15 + 1] + class68.field1541[var15 - 128] + class68.field1541[var15 - 1] + class68.field1541[var15 + 128]) / 4;
                }
            }
            int[] var13 = class68.field1541;
            class68.field1541 = class9.field176;
            class9.field176 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field3287; var7++) {
            for (int var8 = 0; var8 < arg0.field3280; var8++) {
                if (arg0.field3286[var6++] != 0) {
                    int var9 = var7 + arg0.field3282 + 16;
                    int var10 = var8 + arg0.field3284 + 16;
                    int var11 = (var9 << 7) + var10;
                    class68.field1541[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public static final void method142(int arg0) {
        field358++;
        if (arg0 != 1) {
            method142(2);
        }
        if (class1.field8 != null) {
            class1.field8.method1071((byte) 104);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field361[var0] = var1;
        }
        field365 = true;
        field367 = false;
        field364 = class159.method1226((byte) -37, "No response from server)3");
        field369 = new int[] { 1, -1, -1, 1 };
        field374 = class159.method1226((byte) -37, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");
        field372 = class159.method1226((byte) -37, "Fallen lassen");
        field370 = class159.method1226((byte) -37, "glow1:");
        field378 = class159.method1226((byte) -37, "Try again in 60 secs)3)3)3");
        field366 = field364;
        field379 = field370;
        field377 = field370;
        field371 = field378;
        field368 = class159.method1226((byte) -37, "Please subscribe)1 or use a different world)3");
        field375 = false;
        field376 = field368;
    }
}
