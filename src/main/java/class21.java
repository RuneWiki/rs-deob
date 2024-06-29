import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public class class21 extends class9 {

    @OriginalMember(owner = "mapview!la", name = "j", descriptor = "[J")
    private long[] field235 = new long[10];

    @OriginalMember(owner = "mapview!la", name = "h", descriptor = "I")
    private int field233 = 256;

    @OriginalMember(owner = "mapview!la", name = "p", descriptor = "I")
    private int field241 = 1;

    @OriginalMember(owner = "mapview!la", name = "u", descriptor = "I")
    private int field246 = 0;

    @OriginalMember(owner = "mapview!la", name = "q", descriptor = "J")
    private long field242 = class5.method24((byte) 106);

    @OriginalMember(owner = "mapview!la", name = "o", descriptor = "Lia;")
    public static class15 field240 = class28.method196("Apothecary", false);

    @OriginalMember(owner = "mapview!la", name = "m", descriptor = "Z")
    public static volatile boolean field238 = true;

    @OriginalMember(owner = "mapview!la", name = "s", descriptor = "Lia;")
    public static class15 field244 = class28.method196("Loom", false);

    @OriginalMember(owner = "mapview!la", name = "r", descriptor = "I")
    public static volatile int field243 = 0;

    @OriginalMember(owner = "mapview!la", name = "i", descriptor = "Lia;")
    public static class15 field234 = class28.method196("", false);

    @OriginalMember(owner = "mapview!la", name = "t", descriptor = "I")
    public static int field245 = -1;

    @OriginalMember(owner = "mapview!la", name = "k", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "mapview!la", name = "n", descriptor = "Lia;")
    public static class15 field239;

    @OriginalMember(owner = "mapview!la", name = "l", descriptor = "[I")
    public static int[] field237;

    @OriginalMember(owner = "mapview!la", name = "g", descriptor = "[Lia;")
    public static class15[] field232;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(III)I", line = 6)
    public final int method48(int arg0, int arg1, int arg2) {
        int var4 = this.field233;
        this.field233 = 300;
        int var5 = this.field241;
        this.field241 = 1;
        this.field242 = class5.method24((byte) 97);
        if (arg2 > -92) {
            this.field242 = -60L;
        }
        if (this.field235[this.field236] == 0L) {
            this.field241 = var5;
            this.field233 = var4;
        } else if (this.field242 > this.field235[this.field236]) {
            this.field233 = (int) ((long) (arg1 * 2560) / (this.field242 - this.field235[this.field236]));
        }
        if (this.field233 < 25) {
            this.field233 = 25;
        }
        if (this.field233 > 256) {
            this.field233 = 256;
            this.field241 = (int) ((long) arg1 - (this.field242 - this.field235[this.field236]) / 10L);
        }
        if (arg1 < this.field241) {
            this.field241 = arg1;
        }
        this.field235[this.field236] = this.field242;
        this.field236 = (this.field236 + 1) % 10;
        if (this.field241 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field235[var6] != 0L) {
                    this.field235[var6] += this.field241;
                }
            }
        }
        int var7 = 0;
        if (arg0 > this.field241) {
            this.field241 = arg0;
        }
        class2.method15((long) this.field241, 114);
        while (this.field246 < 256) {
            var7++;
            this.field246 += this.field233;
        }
        this.field246 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(I)V", line = 85)
    public static void method150(int arg0) {
        field232 = null;
        field234 = null;
        field240 = null;
        field244 = null;
        field237 = null;
        if (arg0 != 32) {
            method150(-116);
        }
        field239 = null;
    }

    @OriginalMember(owner = "mapview!la", name = "<init>", descriptor = "()V", line = 165)
    public class21() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field235[var1] = this.field242;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lb;", line = 135)
    public static final class2 method151(Throwable arg0, String arg1) {
        class2 var2;
        if (arg0 instanceof class2) {
            var2 = (class2) arg0;
            var2.field14 = var2.field14 + ' ' + arg1;
        } else {
            var2 = new class2(arg0, arg1);
        }
        return var2;
    }
}
