import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class32 extends class464 {

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "J")
    private long field459 = 0L;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "J")
    private long field460 = 0L;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "J")
    private long field463 = 0L;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
    private int field464 = 1;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "[J")
    private long[] field461 = new long[10];

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
    private int field462 = 0;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "(I)V", line = 3)
    public final void method442(int arg0) {
        if (this.field459 < this.field460) {
            this.field459 += this.field460 - this.field459;
        }
        this.field463 = 0L;
        if (arg0 != -201) {
            this.method445(-67);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)J", line = 16)
    private final long method443(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field463;
        this.field463 = var2;
        if (arg0 != -14) {
            return 74L;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field461[this.field462] = var4;
            this.field462 = (this.field462 + 1) % 10;
            if (this.field464 < 1) {
                this.field464++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field464; var8++) {
            var6 += this.field461[(this.field462 + 10 - var8) % 10];
        }
        return var6 / (long) this.field464;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(JI)I", line = 50)
    public final int method444(long arg0, int arg1) {
        if (arg1 != 20359) {
            this.field464 = 116;
        }
        if (this.field460 > this.field459) {
            this.field463 += this.field460 - this.field459;
            this.field459 += this.field460 - this.field459;
            this.field460 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field460 += arg0;
        } while (var4 < 10 && this.field459 > this.field460);
        if (this.field460 < this.field459) {
            this.field460 = this.field459;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V", line = 117)
    public class32() {
        this.field460 = this.field459 = jagmisc.nanoTime();
        if (this.field459 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "(I)J", line = 88)
    public final long method445(int arg0) {
        if (arg0 <= 42) {
            this.method444(22L, -2);
        }
        return this.field459;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)J", line = 98)
    public final long method446(int arg0) {
        this.field459 += this.method443((byte) -14);
        if (this.field460 > this.field459) {
            return (this.field460 - this.field459) / 1000000L;
        } else {
            if (arg0 >= -1) {
                this.field464 = -65;
            }
            return 0L;
        }
    }
}
