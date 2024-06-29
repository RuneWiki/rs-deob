import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class43 extends class466 {

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "J")
    private long field646 = 0L;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "J")
    private long field647 = 0L;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "[J")
    private long[] field649 = new long[10];

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "J")
    private long field650 = 0L;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    private int field648 = 1;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    private int field651 = 0;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)J")
    public final long method334(byte arg0) {
        if (arg0 < 47) {
            this.method336(101);
        }
        return this.field647;
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)J")
    private final long method335(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field650;
        this.field650 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field649[this.field651] = var4;
            if (this.field648 < 1) {
                this.field648++;
            }
            this.field651 = (this.field651 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field648; var8++) {
            var6 += this.field649[(this.field651 + 10 - var8) % 10];
        }
        if (arg0 > -91) {
            this.field651 = -77;
        }
        return var6 / (long) this.field648;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
    public final void method336(int arg0) {
        if (this.field647 < this.field646) {
            this.field647 += this.field646 - this.field647;
        }
        this.field650 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class43() {
        this.field647 = System.nanoTime();
        this.field646 = System.nanoTime();
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)I")
    public final int method337(int arg0, int arg1) {
        if (arg1 != 8) {
            return -49;
        }
        long var3 = (long) arg0 * 1000000L;
        this.field647 += this.method335(-112);
        if (this.field646 > this.field647) {
            class106.method710((this.field646 - this.field647) / 1000000L, (byte) 6);
            this.field650 += this.field646 - this.field647;
            this.field647 += this.field646 - this.field647;
            this.field646 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field646 += var3;
        } while (var5 < 10 && this.field647 > this.field646);
        if (this.field647 > this.field646) {
            this.field646 = this.field647;
        }
        return var5;
    }
}
