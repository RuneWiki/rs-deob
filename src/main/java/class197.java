import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class197 extends class360 {

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "J")
    private long field2969 = 0L;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "J")
    private long field2970 = 0L;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    private int field2971 = 1;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "[J")
    private long[] field2972 = new long[10];

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    private int field2974 = 0;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "J")
    private long field2973 = 0L;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)J")
    private final long method1176(int arg0) {
        long var2 = jagmisc.nanoTime();
        if (arg0 != 3174) {
            this.method150((byte) 55);
        }
        long var4 = var2 - this.field2973;
        this.field2973 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2972[this.field2974] = var4;
            this.field2974 = (this.field2974 + 1) % 10;
            if (this.field2971 < 1) {
                this.field2971++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field2971; var8++) {
            var6 += this.field2972[(this.field2974 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2971;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)J")
    public final long method150(byte arg0) {
        if (arg0 <= 121) {
            this.field2971 = 88;
        }
        return this.field2969;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
    public final int method151(int arg0, int arg1) {
        this.field2969 += this.method1176(3174);
        long var3 = (long) arg1 * 1000000L;
        int var5 = -41 % ((arg0 - 15) / 43);
        if (this.field2969 < this.field2970) {
            class109.method674((byte) 99, (this.field2970 - this.field2969) / 1000000L);
            this.field2973 += this.field2970 - this.field2969;
            this.field2969 += this.field2970 - this.field2969;
            this.field2970 += var3;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field2970 += var3;
        } while (var6 < 10 && this.field2970 < this.field2969);
        if (this.field2969 > this.field2970) {
            this.field2970 = this.field2969;
        }
        return var6;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public final void method149(int arg0) {
        if (this.field2969 < this.field2970) {
            this.field2969 += this.field2970 - this.field2969;
        }
        this.field2973 = 0L;
        if (arg0 < 84) {
            this.method1176(-2);
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class197() {
        this.field2970 = this.field2969 = jagmisc.nanoTime();
        if (this.field2969 == 0L) {
            throw new RuntimeException();
        }
    }
}
