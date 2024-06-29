import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class408 extends class417 {

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "J")
    private long field5646 = 0L;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "J")
    private long field5647 = 0L;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "[J")
    private long[] field5648 = new long[10];

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    private int field5649 = 1;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    private int field5651 = 0;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "J")
    private long field5650 = 0L;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V")
    public final void method1570(int arg0) {
        if (this.field5646 < this.field5647) {
            this.field5646 += this.field5647 - this.field5646;
        }
        this.field5650 = 0L;
        if (arg0 < 29) {
            this.field5648 = (long[]) null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BI)I")
    public final int method1569(byte arg0, int arg1) {
        if (arg0 <= 90) {
            this.field5648 = (long[]) null;
        }
        long var3 = (long) arg1 * 1000000L;
        this.field5646 += this.method2394(-8912);
        if (this.field5646 < this.field5647) {
            class258.method1603(-649, (this.field5647 - this.field5646) / 1000000L);
            this.field5650 += this.field5647 - this.field5646;
            this.field5646 += this.field5647 - this.field5646;
            this.field5647 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field5647 += var3;
            var5++;
        } while (var5 < 10 && this.field5647 < this.field5646);
        if (this.field5646 > this.field5647) {
            this.field5647 = this.field5646;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)J")
    public final long method1568(int arg0) {
        int var2 = 93 / ((arg0 + 20) / 62);
        return this.field5646;
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)J")
    private final long method2394(int arg0) {
        if (arg0 != -8912) {
            return -58L;
        }
        long var2 = System.nanoTime();
        long var4 = var2 - this.field5650;
        this.field5650 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5648[this.field5651] = var4;
            this.field5651 = (this.field5651 + 1) % 10;
            if (this.field5649 < 1) {
                this.field5649++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5649; var8++) {
            var6 += this.field5648[(this.field5651 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5649;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
    public class408() {
        this.field5646 = System.nanoTime();
        this.field5647 = System.nanoTime();
    }
}
