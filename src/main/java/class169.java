import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class169 {

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    private int field3172 = -1;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    private int field3174 = 0;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "[B")
    public static byte[] field3171 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field3184 = 127;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "Lsg;")
    public static class30 field3180 = class57.method539(160, true);

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public static int field3185 = 127;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "Lsg;")
    public static class30 field3186 = class167.method1221((byte) 33, "Texturen geladen)3");

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public int field3177;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public int field3183;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILaa;I)V")
    public final void method1244(int arg0, class8 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method63((byte) 125);
            if (var4 == 0) {
                field3178++;
                if (arg2 != 9482) {
                    field3171 = null;
                    return;
                }
                return;
            }
            this.method1246(84, arg1, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lmc;BII)Lpj;")
    public static final class152 method1245(class151 arg0, byte arg1, int arg2, int arg3) {
        field3176++;
        if (class224.method1608(arg2, arg3, arg0, 0)) {
            if (arg1 != 108) {
                method1247((byte) 57, 55, -88);
            }
            return class122.method929(arg1 - 108);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILaa;II)V")
    private final void method1246(int arg0, class8 arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field3174 = arg1.method60(23888);
            this.method1250(this.field3174, 0);
        } else if (arg3 == 2) {
            this.field3172 = arg1.method65((byte) 123);
            if (this.field3172 == 65535) {
                this.field3172 = -1;
            }
        } else if (arg3 == 3) {
            arg1.method65((byte) 117);
        }
        if (arg0 <= 80) {
            this.field3177 = 74;
        }
        field3173++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BII)I")
    public static final int method1247(byte arg0, int arg1, int arg2) {
        field3182++;
        if (arg0 != 48) {
            method1248(2);
        }
        int var3 = arg2 * 57 + arg1;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7FD09D1) >> 19;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static final void method1248(int arg0) {
        class32.field810 = null;
        class180.field3330 = null;
        class189.field3446 = null;
        field3175++;
        class194.field3505 = null;
        class30.field599 = null;
        class166.field3050 = null;
        if (arg0 <= 69) {
            return;
        }
        class170.field3203 = null;
        class232.field4142 = null;
        class244.field4367 = null;
        class231.field4111 = null;
        class16.field329 = null;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public static void method1249(int arg0) {
        field3186 = null;
        field3180 = null;
        if (arg0 != -1) {
            method1247((byte) 84, -4, -1);
        }
        field3171 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
    private final void method1250(int arg0, int arg1) {
        field3170++;
        double var3 = (double) ((arg0 & 0xFFDABF) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 < var5) {
            var9 = var5;
        }
        double var11 = (double) arg1;
        double var13 = var3;
        double var15 = 0.0D;
        if (var7 > var9) {
            var9 = var7;
        }
        if (var5 < var3) {
            var13 = var5;
        }
        if (var13 > var7) {
            var13 = var7;
        }
        double var17 = (var9 + var13) / 2.0D;
        this.field3181 = (int) (var17 * 256.0D);
        if (var9 != var13) {
            if (var3 == var9) {
                var11 = (var5 - var7) / (var9 - var13);
            } else if (var5 == var9) {
                var11 = (var7 - var3) / (var9 - var13) + 2.0D;
            } else if (var7 == var9) {
                var11 = (var3 - var5) / (var9 - var13) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var9 - var13) / (var9 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var13) / (2.0D - var9 - var13);
            }
        }
        this.field3183 = (int) (var15 * 256.0D);
        if (this.field3181 < 0) {
            this.field3181 = 0;
        } else if (this.field3181 > 255) {
            this.field3181 = 255;
        }
        if (this.field3183 < 0) {
            this.field3183 = 0;
        } else if (this.field3183 > 255) {
            this.field3183 = 255;
        }
        double var19 = var11 / 6.0D;
        if (var17 > 0.5D) {
            this.field3177 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3177 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3177 < 1) {
            this.field3177 = 1;
        }
        this.field3179 = (int) ((double) this.field3177 * var19);
    }
}
