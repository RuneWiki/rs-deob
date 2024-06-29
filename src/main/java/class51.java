import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class51 extends class424 {

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    private int field704 = 1;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "[J")
    private long[] field705 = new long[10];

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    private int field706 = 0;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "J")
    private long field707 = 0L;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "J")
    private long field708 = 0L;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "J")
    private long field709 = 0L;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)I", line = 3)
    public final int method383(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method386(-108);
        }
        this.field709 += this.method384(10);
        long var3 = (long) arg0 * 1000000L;
        if (this.field708 > this.field709) {
            class388.method2433((this.field708 - this.field709) / 1000000L, 114);
            this.field707 += this.field708 - this.field709;
            this.field709 += this.field708 - this.field709;
            this.field708 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field708 += var3;
        } while (var5 < 10 && this.field708 < this.field709);
        if (this.field709 > this.field708) {
            this.field708 = this.field709;
        }
        return var5;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)J", line = 40)
    private final long method384(int arg0) {
        long var2 = class58.method427((byte) -19) * 1000000L;
        if (arg0 != 10) {
            this.field708 = -43L;
        }
        long var4 = var2 - this.field707;
        this.field707 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field705[this.field706] = var4;
            if (this.field704 < 10) {
                this.field704++;
            }
            this.field706 = (this.field706 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field704; var8++) {
            var6 += this.field705[(this.field706 + 10 - var8) % 10];
        }
        return var6 / (long) this.field704;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)J", line = 76)
    public final long method385(byte arg0) {
        if (arg0 != -71) {
            this.method384(64);
        }
        return this.field709;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 89)
    public final void method386(int arg0) {
        if (this.field709 < this.field708) {
            this.field709 += this.field708 - this.field709;
        }
        this.field707 = 0L;
        if (arg0 != 1206) {
            this.field705 = null;
        }
    }
}
