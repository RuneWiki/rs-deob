import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class393 extends class427 {

    @OriginalMember(owner = "client!mea", name = "h", descriptor = "J")
    private long field5478 = 0L;

    @OriginalMember(owner = "client!mea", name = "i", descriptor = "J")
    private long field5479 = 0L;

    @OriginalMember(owner = "client!mea", name = "j", descriptor = "[J")
    private long[] field5480 = new long[10];

    @OriginalMember(owner = "client!mea", name = "k", descriptor = "I")
    private int field5481 = 0;

    @OriginalMember(owner = "client!mea", name = "l", descriptor = "J")
    private long field5482 = 0L;

    @OriginalMember(owner = "client!mea", name = "m", descriptor = "I")
    private int field5483 = 1;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(JI)I", line = 4)
    public final int method1059(long arg0, int arg1) {
        int var4 = -60 / ((arg1 + 56) / 57);
        if (this.field5479 < this.field5478) {
            this.field5482 += this.field5478 - this.field5479;
            this.field5479 += this.field5478 - this.field5479;
            this.field5478 += arg0;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field5478 += arg0;
        } while (var5 < 10 && this.field5478 < this.field5479);
        if (this.field5478 < this.field5479) {
            this.field5478 = this.field5479;
        }
        return var5;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)J", line = 35)
    public final long method1061(byte arg0) {
        this.field5479 += this.method2246((byte) -30);
        if (this.field5479 < this.field5478) {
            return (this.field5478 - this.field5479) / 1000000L;
        } else if (arg0 == 73) {
            return 0L;
        } else {
            return -62L;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)J", line = 51)
    public final long method1060(int arg0) {
        return arg0 == 73 ? this.field5479 : -8L;
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "()V", line = 100)
    public class393() {
        this.field5478 = this.field5479 = jagmisc.nanoTime();
        if (this.field5479 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(B)J", line = 64)
    private final long method2246(byte arg0) {
        if (arg0 > -3) {
            this.method1061((byte) 58);
        }
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field5482;
        this.field5482 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5480[this.field5481] = var4;
            this.field5481 = (this.field5481 + 1) % 10;
            if (this.field5483 < 1) {
                this.field5483++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5483; var8++) {
            var6 += this.field5480[(this.field5481 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5483;
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(I)V", line = 117)
    public final void method1062(int arg0) {
        this.field5482 = 0L;
        if (this.field5478 > this.field5479) {
            this.field5479 += this.field5478 - this.field5479;
        }
        if (arg0 != 20054) {
            this.field5482 = 57L;
        }
    }
}
