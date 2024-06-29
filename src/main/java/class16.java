import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public class class16 extends class21 {

    @OriginalMember(owner = "mapview!ha", name = "r", descriptor = "[J")
    private long[] field179 = new long[10];

    @OriginalMember(owner = "mapview!ha", name = "j", descriptor = "[[[[B")
    public static byte[][][][] field171 = new byte[5][][][];

    @OriginalMember(owner = "mapview!ha", name = "l", descriptor = "[I")
    public static int[] field173 = new int[256];

    @OriginalMember(owner = "mapview!ha", name = "q", descriptor = "Ld;")
    public static class7 field178 = class38.method251((byte) 54, "world");

    @OriginalMember(owner = "mapview!ha", name = "i", descriptor = "Ld;")
    public static class7 field170 = class38.method251((byte) -70, "Magic Shop");

    @OriginalMember(owner = "mapview!ha", name = "k", descriptor = "Ld;")
    public static class7 field172 = class38.method251((byte) -100, "Hunter Store");

    @OriginalMember(owner = "mapview!ha", name = "v", descriptor = "Ld;")
    public static class7 field183;

    @OriginalMember(owner = "mapview!ha", name = "m", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "mapview!ha", name = "n", descriptor = "I")
    private int field175;

    @OriginalMember(owner = "mapview!ha", name = "s", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "mapview!ha", name = "t", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "mapview!ha", name = "u", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "mapview!ha", name = "o", descriptor = "J")
    private long field176;

    @OriginalMember(owner = "mapview!ha", name = "p", descriptor = "[I")
    public static int[] field177;

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
            field173[var0] = var1;
        }
        field183 = class38.method251((byte) 104, "mapfunction");
    }

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "(B)V", line = 13)
    public static void method119(byte arg0) {
        field173 = null;
        int var1 = -66 / ((arg0 - 39) / 51);
        field183 = null;
        field170 = null;
        field177 = null;
        field171 = null;
        field172 = null;
        field178 = null;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(III)I", line = 50)
    public final int method120(int arg0, int arg1, int arg2) {
        int var4 = this.field181;
        int var5 = this.field174;
        this.field181 = 1;
        this.field174 = 300;
        this.field176 = class11.method103(arg0 ^ 0xFFFFC612);
        if (this.field179[this.field180] == 0L) {
            this.field181 = var4;
            this.field174 = var5;
        } else if (this.field179[this.field180] < this.field176) {
            this.field174 = (int) ((long) (arg2 * 2560) / (this.field176 - this.field179[this.field180]));
        }
        if (this.field174 < 25) {
            this.field174 = 25;
        }
        if (this.field174 > 256) {
            this.field174 = 256;
            this.field181 = (int) ((long) arg2 - (this.field176 - this.field179[this.field180]) / 10L);
        }
        if (arg2 < this.field181) {
            this.field181 = arg2;
        }
        this.field179[this.field180] = this.field176;
        this.field180 = (this.field180 + 1) % 10;
        if (this.field181 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field179[var6] != 0L) {
                    this.field179[var6] += this.field181;
                }
            }
        }
        int var7 = 0;
        if (arg0 != -29158) {
            field171 = null;
        }
        if (this.field181 < arg1) {
            this.field181 = arg1;
        }
        class28.method205((long) this.field181, (byte) 121);
        while (this.field175 < 256) {
            var7++;
            this.field175 += this.field174;
        }
        this.field175 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!ha", name = "<init>", descriptor = "()V", line = 196)
    public class16() {
        this.method122((byte) 124);
    }

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "(I)V", line = 135)
    public static final void method121(int arg0) {
        class18 var1 = class21.field236;
        synchronized (class21.field236) {
            class2.field7 = class26.field368;
            if (arg0 != 16126) {
                method119((byte) 7);
            }
            if (class20.field228 >= 0) {
                while (class30.field439 != class20.field228) {
                    int var2 = class36.field478[class30.field439];
                    class30.field439 = class30.field439 + 1 & 0x7F;
                    if (var2 < 0) {
                        class29.field432[~var2] = false;
                    } else {
                        class29.field432[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class29.field432[var3] = false;
                }
                class20.field228 = class30.field439;
            }
            class26.field368 = class8.field96;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "(B)V", line = 177)
    public final void method122(byte arg0) {
        this.field175 = 0;
        this.field181 = 1;
        this.field174 = 256;
        this.field176 = class11.method103(18440);
        int var2 = 62 % ((1 - arg0) / 60);
        for (int var3 = 0; var3 < 10; var3++) {
            this.field179[var3] = this.field176;
        }
    }
}
