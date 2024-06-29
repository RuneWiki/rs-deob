import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class175 implements Runnable {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "[Lsg;")
    public volatile class169[] field3314 = new class169[2];

    @OriginalMember(owner = "client!td", name = "k", descriptor = "Z")
    public volatile boolean field3323 = false;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Z")
    public volatile boolean field3325 = false;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field3313 = 0;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "Lsd;")
    private static class166 field3321 = class135.method935("jlv", 0);

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Lsd;")
    private static class166 field3317 = class135.method935("Please enter your username)3", 0);

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Lsd;")
    public static class166 field3315 = class135.method935("Begeben Sie sich in ein freies Gebiet)1 um", 0);

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lsd;")
    public static class166 field3316 = class135.method935("mapfunction", 0);

    @OriginalMember(owner = "client!td", name = "j", descriptor = "Lsd;")
    public static class166 field3322 = field3317;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "[I")
    public static int[] field3319 = new int[128];

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Laa;")
    public static class2 field3318;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Lih;")
    public class80 field3320;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static final void method1197(int arg0) {
        short var1 = 256;
        field3324++;
        if (class86.field1717 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class86.field1717 > 768) {
                    class135.field2642[var2] = class51.method379(class177.field3342[var2], class178.method1209(arg0, 0), class199.field3959[var2], 1024 - class86.field1717);
                } else if (class86.field1717 > 256) {
                    class135.field2642[var2] = class177.field3342[var2];
                } else {
                    class135.field2642[var2] = class51.method379(class199.field3959[var2], 16711935, class177.field3342[var2], 256 - class86.field1717);
                }
            }
        } else if (class153.field2947 <= 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                class135.field2642[var3] = class199.field3959[var3];
            }
        } else {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class153.field2947 > 768) {
                    class135.field2642[var4] = class51.method379(class92.field1812[var4], 16711935, class199.field3959[var4], 1024 - class153.field2947);
                } else if (class153.field2947 <= 256) {
                    class135.field2642[var4] = class51.method379(class199.field3959[var4], 16711935, class92.field1812[var4], 256 - class153.field2947);
                } else {
                    class135.field2642[var4] = class92.field1812[var4];
                }
            }
        }
        int var5 = 0;
        int var6 = class76.field1547.field3012 * 9;
        int var7 = 0;
        for (int var8 = 1; var8 < var1 - 1; var8++) {
            int var21 = (var1 - var8) * class195.field3861[var8] / var1 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var24 = class19.field341[var5++];
                int var25 = class76.field1547.field3014[var6++];
                if (var24 == 0) {
                    class35.field657.field3014[var7++] = var25;
                } else {
                    int var27 = 256 - var24;
                    int var28 = class135.field2642[var24];
                    class35.field657.field3014[var7++] = class22.method151(var24 * class22.method151(var28, 65280) + class22.method151(var25, 65280) * var27, 16711680) + class22.method151(var27 * class22.method151(16711935, var25) + class22.method151(var28, 16711935) * var24, -16711936) >> 8;
                }
            }
            for (int var23 = 0; var23 < var21; var23++) {
                class35.field657.field3014[var7++] = class76.field1547.field3014[var6++];
            }
            var6 += class76.field1547.field3012 - 128;
        }
        int var9 = 0;
        int var10 = 0;
        class35.field657.method1051(0, 9);
        if (arg0 != 16711935) {
            method1198(111);
        }
        int var11 = class76.field1547.field3012 * 9 + 128;
        for (int var12 = 1; var12 < var1 - 1; var12++) {
            int var13 = (var1 - var12) * class195.field3861[var12] / var1 + 22;
            if (var13 < 0) {
                var13 = 0;
            }
            for (int var14 = 0; var14 < var13; var14++) {
                int var10001 = var9++;
                var11--;
                class59.field1215.field3014[var10001] = class76.field1547.field3014[var11];
            }
            for (int var15 = var13; var15 < 128; var15++) {
                int var16 = class19.field341[var10++];
                var11--;
                int var17 = class76.field1547.field3014[var11];
                if (var16 == 0) {
                    class59.field1215.field3014[var9++] = var17;
                } else {
                    int var19 = 256 - var16;
                    int var20 = class135.field2642[var16];
                    class59.field1215.field3014[var9++] = class22.method151(var16 * class22.method151(var20, 65280) + var19 * class22.method151(65280, var17), 16711680) + class22.method151(-16711936, var16 * class22.method151(var20, 16711935) + class22.method151(16711935, var17) * var19) >> 8;
                }
            }
            var11 += class76.field1547.field3012 + 128;
            var10 += var13;
        }
        class59.field1215.method1051(637, 9);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static void method1198(int arg0) {
        field3318 = null;
        field3322 = null;
        field3316 = null;
        field3321 = null;
        field3317 = null;
        field3319 = null;
        if (arg0 != 256) {
            method1197(39);
        }
        field3315 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lsd;I)I")
    public static final int method1199(class166 arg0, int arg1) {
        field3327++;
        if (class116.field2246 == 1) {
            return 7;
        } else if (arg0.method1142(27575, class134.field2598)) {
            return 1;
        } else if (arg0.method1142(27575, class182.field3463)) {
            return 1;
        } else if (arg0.method1142(arg1 ^ 0x313E, class4.field86)) {
            return 2;
        } else if (arg0.method1142(27575, field3321)) {
            return 2;
        } else if (arg0.method1142(arg1 ^ 0x313E, class121.field2375)) {
            return 3;
        } else if (arg1 != 23177) {
            return 65;
        } else if (arg0.method1142(arg1 + 4398, class165.field3128)) {
            return 4;
        } else if (arg0.method1142(27575, class27.field465)) {
            return 4;
        } else if (arg0.method1142(27575, class129.field2535)) {
            return 5;
        } else if (arg0.method1142(27575, class187.field3573)) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!td", name = "run", descriptor = "()V")
    public final void run() {
        this.field3325 = true;
        try {
            while (!this.field3323) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class169 var2 = this.field3314[var1];
                    if (var2 != null) {
                        var2.method1170(false);
                    }
                }
                class189.method1260(10L, 1);
                class134.method929(null, 1001, this.field3320);
            }
        } catch (Exception var9) {
            class32.method238((byte) -65, var9, null);
        } finally {
            Object var6 = null;
            this.field3325 = false;
        }
        field3326++;
    }
}
