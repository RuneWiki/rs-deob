import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 extends class125 {

    @OriginalMember(owner = "client!de", name = "s", descriptor = "Z")
    public static boolean field705 = false;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Lod;")
    private static class101 field706 = class46.method335(76, "wishes to duel with you)3");

    @OriginalMember(owner = "client!de", name = "v", descriptor = "Lod;")
    public static class101 field708 = field706;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "Llb;")
    public static class78 field712 = new class78();

    @OriginalMember(owner = "client!de", name = "G", descriptor = "Lod;")
    public static class101 field719 = class46.method335(-114, "lila:");

    @OriginalMember(owner = "client!de", name = "I", descriptor = "[I")
    public static int[] field721 = new int[5];

    @OriginalMember(owner = "client!de", name = "M", descriptor = "Lod;")
    public static class101 field725 = class46.method335(-123, "");

    @OriginalMember(owner = "client!de", name = "P", descriptor = "Lod;")
    private static class101 field728 = class46.method335(-98, "wave:");

    @OriginalMember(owner = "client!de", name = "H", descriptor = "Lod;")
    public static class101 field720 = class46.method335(-51, "http:)4)4www)3runescape)3com");

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public static int field718 = 0;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "Lod;")
    public static class101 field714 = field728;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "Lod;")
    public static class101 field715 = class46.method335(-70, "headicons_prayer");

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "Z")
    public static boolean field729 = true;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "Lod;")
    private static class101 field716 = class46.method335(86, "World");

    @OriginalMember(owner = "client!de", name = "J", descriptor = "Lod;")
    public static class101 field722 = field716;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "Lod;")
    public static class101 field723 = field716;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field724 = 0;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "Lod;")
    public static class101 field731 = field728;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "Lod;")
    public static class101 field732 = class46.method335(-66, "au");

    @OriginalMember(owner = "client!de", name = "y", descriptor = "B")
    public byte field711;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "Lod;")
    public class101 field707;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "Lt;")
    public static class132 field717;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "Lc;")
    public static class15 field727;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "Leb;")
    public static class31 field730;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "[Lqe;")
    public static class116[] field726;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lia;II)V")
    public static final void method218(class57 arg0, int arg1, int arg2) {
        field703++;
        if (arg2 < -37) {
            class82.method597(arg1, arg0.field1298, (byte) -102, arg0.field1341);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILia;I)V")
    public static final void method219(int arg0, class57 arg1, int arg2) {
        field713++;
        if (class143.field3305 < arg1.field1322) {
            class82.method604(arg1, 1);
        } else if (arg1.field1349 < class143.field3305) {
            class84.method613(arg0 + 84, arg1);
        } else {
            class158.method1221(-29431, arg1);
        }
        if (arg1.field1341 < 128 || arg1.field1298 < 128 || arg1.field1341 >= 13184 || arg1.field1298 >= 13184) {
            arg1.field1322 = 0;
            arg1.field1300 = -1;
            arg1.field1341 = arg1.field1291[0] * 128 + arg1.field1334 * 64;
            arg1.field1298 = arg1.field1271[0] * 128 + arg1.field1334 * 64;
            arg1.field1311 = -1;
            arg1.field1349 = 0;
            arg1.method405(0);
        }
        if (class82.field1778 == arg1 && (arg1.field1341 < 1536 || arg1.field1298 < 1536 || arg1.field1341 >= 11776 || arg1.field1298 >= 11776)) {
            arg1.field1311 = -1;
            arg1.field1349 = 0;
            arg1.field1298 = arg1.field1271[0] * 128 + arg1.field1334 * 64;
            arg1.field1322 = 0;
            arg1.field1300 = -1;
            arg1.field1341 = arg1.field1291[0] * 128 + arg1.field1334 * 64;
            arg1.method405(0);
        }
        class29.method232((byte) -44, arg1);
        class5.method24(arg1, (byte) -70);
        if (arg0 != 0) {
            method221(false);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lqe;B)V")
    public static final void method220(class116 arg0, byte arg1) {
        field709++;
        for (int var2 = 0; var2 < class95.field2037.length; var2++) {
            class95.field2037[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class95.field2037[var16] = (int) (Math.random() * 256.0D);
        }
        if (arg1 != 34) {
            field706 = null;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class134.field3056[var15] = (class95.field2037[var15 + 1] + class95.field2037[var15 - 128] + class95.field2037[var15 + -1] + class95.field2037[var15 + 128]) / 4;
                }
            }
            int[] var13 = class95.field2037;
            class95.field2037 = class134.field3056;
            class134.field3056 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field2574; var7++) {
            for (int var8 = 0; var8 < arg0.field2572; var8++) {
                if (arg0.field2569[var6++] != 0) {
                    int var9 = var8 + arg0.field2567 + 16;
                    int var10 = arg0.field2570 + var7 + 16;
                    int var11 = var9 + (var10 << 7);
                    class95.field2037[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
    public static void method221(boolean arg0) {
        field722 = null;
        field716 = null;
        field717 = null;
        field725 = null;
        field732 = null;
        field727 = null;
        field708 = null;
        field731 = null;
        field728 = null;
        field715 = null;
        field721 = null;
        if (!arg0) {
            return;
        }
        field726 = null;
        field712 = null;
        field719 = null;
        field720 = null;
        field723 = null;
        field706 = null;
        field714 = null;
        field730 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method222(KeyEvent arg0, int arg1) {
        int var2 = arg0.getKeyChar();
        if (arg1 != 0) {
            field708 = null;
        }
        field700++;
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)V")
    public static final void method223(boolean arg0) {
        class118.field2611.method425((byte) -93);
        int var1 = class118.field2611.method426(arg0, 8);
        field701++;
        if (class40.field959 > var1) {
            for (int var2 = var1; var2 < class40.field959; var2++) {
                class3.field55[class24.field579++] = class73.field1586[var2];
            }
        }
        if (var1 > class40.field959) {
            throw new RuntimeException("gnpov1");
        }
        class40.field959 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class73.field1586[var3];
            class62 var5 = class18.field376[var4];
            int var6 = class118.field2611.method426(true, 1);
            if (var6 == 0) {
                class73.field1586[class40.field959++] = var4;
                var5.field1283 = class143.field3305;
            } else {
                int var7 = class118.field2611.method426(arg0, 2);
                if (var7 == 0) {
                    class73.field1586[class40.field959++] = var4;
                    var5.field1283 = class143.field3305;
                    class39.field935[class11.field176++] = var4;
                } else if (var7 == 1) {
                    class73.field1586[class40.field959++] = var4;
                    var5.field1283 = class143.field3305;
                    int var8 = class118.field2611.method426(true, 3);
                    var5.method402((byte) -118, var8, false);
                    int var9 = class118.field2611.method426(arg0, 1);
                    if (var9 == 1) {
                        class39.field935[class11.field176++] = var4;
                    }
                } else if (var7 == 2) {
                    class73.field1586[class40.field959++] = var4;
                    var5.field1283 = class143.field3305;
                    int var10 = class118.field2611.method426(true, 3);
                    var5.method402((byte) -27, var10, true);
                    int var11 = class118.field2611.method426(true, 3);
                    var5.method402((byte) -66, var11, true);
                    int var12 = class118.field2611.method426(arg0, 1);
                    if (var12 == 1) {
                        class39.field935[class11.field176++] = var4;
                    }
                } else if (var7 == 3) {
                    class3.field55[class24.field579++] = var4;
                }
            }
        }
    }
}
