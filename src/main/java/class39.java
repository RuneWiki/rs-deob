import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class39 extends class307 {

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "J")
    private long field599 = 0L;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "J")
    private long field600 = 0L;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    private int field602 = 0;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    private int field601 = 1;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "J")
    private long field604 = 0L;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "[J")
    private long[] field603 = new long[10];

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)J")
    public final long method273(byte arg0) {
        if (arg0 != -106) {
            this.method274(6);
        }
        return this.field599;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)J")
    private final long method274(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field604;
        this.field604 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field603[this.field602] = var4;
            if (this.field601 < 1) {
                this.field601++;
            }
            this.field602 = (this.field602 + 1) % 10;
        }
        if (arg0 != 10) {
            return 97L;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field601; var8++) {
            var6 += this.field603[(this.field602 + 10 - var8) % 10];
        }
        return var6 / (long) this.field601;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public final void method275(byte arg0) {
        if (arg0 <= -52) {
            this.field604 = 0L;
            if (this.field599 < this.field600) {
                this.field599 += this.field600 - this.field599;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBI)I")
    public final int method276(int arg0, byte arg1, int arg2) {
        class33.method250((long) arg2, 256);
        if (arg1 > -25) {
            return 7;
        }
        this.field599 += this.method274(10);
        long var4 = (long) arg0 * 1000000L;
        if (this.field599 < this.field600) {
            class33.method250((this.field600 - this.field599) / 1000000L, 256);
            this.field604 += this.field600 - this.field599;
            this.field599 += this.field600 - this.field599;
            this.field600 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field600 += var4;
            var6++;
        } while (var6 < 10 && this.field600 < this.field599);
        if (this.field600 < this.field599) {
            this.field600 = this.field599;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class39() {
        this.field600 = this.field599 = jagmisc.nanoTime();
        if (this.field599 == 0L) {
            throw new RuntimeException();
        }
    }
}
