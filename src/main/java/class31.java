import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!qa")
public class class31 extends class23 {

    @OriginalMember(owner = "mapview!qa", name = "q", descriptor = "[J")
    private long[] field404 = new long[10];

    @OriginalMember(owner = "mapview!qa", name = "h", descriptor = "[I")
    public static int[] field395 = new int[256];

    @OriginalMember(owner = "mapview!qa", name = "p", descriptor = "Lw;")
    public static class38 field403 = class35.method219(" map", true);

    @OriginalMember(owner = "mapview!qa", name = "s", descriptor = "Lw;")
    public static class38 field406 = class35.method219("Next page", true);

    @OriginalMember(owner = "mapview!qa", name = "t", descriptor = "Lw;")
    public static class38 field407 = class35.method219("mapscene", true);

    @OriginalMember(owner = "mapview!qa", name = "w", descriptor = "Lw;")
    public static class38 field410 = class35.method219("Find", true);

    @OriginalMember(owner = "mapview!qa", name = "k", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "mapview!qa", name = "l", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "mapview!qa", name = "o", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "mapview!qa", name = "r", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "mapview!qa", name = "v", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "mapview!qa", name = "u", descriptor = "J")
    private long field408;

    @OriginalMember(owner = "mapview!qa", name = "j", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field397;

    @OriginalMember(owner = "mapview!qa", name = "i", descriptor = "[I")
    public static int[] field396;

    @OriginalMember(owner = "mapview!qa", name = "n", descriptor = "[I")
    public static int[] field401;

    @OriginalMember(owner = "mapview!qa", name = "m", descriptor = "[Ld;")
    public static class7[] field400;

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
            field395[var0] = var1;
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "c", descriptor = "(I)V", line = 22)
    public static void method192(int arg0) {
        int var1 = 49 / ((arg0 + 59) / 50);
        field397 = null;
        field410 = null;
        field403 = null;
        field401 = null;
        field396 = null;
        field406 = null;
        field400 = null;
        field407 = null;
        field395 = null;
    }

    @OriginalMember(owner = "mapview!qa", name = "b", descriptor = "(I)V", line = 45)
    public final void method132(int arg0) {
        this.field399 = arg0;
        this.field405 = 1;
        this.field398 = 256;
        this.field408 = class6.method25(arg0 - 67);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field404[var2] = this.field408;
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "<init>", descriptor = "()V", line = 82)
    public class31() {
        this.method132(0);
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(BII)I", line = 93)
    public final int method133(byte arg0, int arg1, int arg2) {
        int var4 = this.field398;
        this.field398 = 300;
        int var5 = this.field405;
        if (arg0 != -70) {
            this.method133((byte) 125, -54, -36);
        }
        this.field405 = 1;
        this.field408 = class6.method25(-116);
        if (this.field404[this.field402] == 0L) {
            this.field398 = var4;
            this.field405 = var5;
        } else if (this.field408 > this.field404[this.field402]) {
            this.field398 = (int) ((long) (arg1 * 2560) / (this.field408 - this.field404[this.field402]));
        }
        if (this.field398 < 25) {
            this.field398 = 25;
        }
        if (this.field398 > 256) {
            this.field398 = 256;
            this.field405 = (int) ((long) arg1 - (this.field408 - this.field404[this.field402]) / 10L);
        }
        if (this.field405 > arg1) {
            this.field405 = arg1;
        }
        this.field404[this.field402] = this.field408;
        this.field402 = (this.field402 + 1) % 10;
        if (this.field405 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field404[var6] != 0L) {
                    this.field404[var6] += this.field405;
                }
            }
        }
        if (this.field405 < arg2) {
            this.field405 = arg2;
        }
        int var7 = 0;
        class8.method36((long) this.field405, 10);
        while (this.field399 < 256) {
            this.field399 += this.field398;
            var7++;
        }
        this.field399 &= 0xFF;
        return var7;
    }
}
