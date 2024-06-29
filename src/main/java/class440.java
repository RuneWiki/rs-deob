import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class440 extends class271 {

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "J")
    private long field6413 = 0L;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "J")
    private long field6414 = 0L;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    private int field6415 = 1;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    private int field6417 = 0;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "[J")
    private long[] field6418 = new long[10];

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "J")
    private long field6416 = 0L;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I", line = 3)
    public final int method715(int arg0, int arg1) {
        if (arg0 != 69) {
            this.field6416 = 105L;
        }
        this.field6413 += this.method2630((byte) 118);
        long var3 = (long) arg1 * 1000000L;
        if (this.field6413 < this.field6414) {
            class496.method2931((byte) 125, (this.field6414 - this.field6413) / 1000000L);
            this.field6416 += this.field6414 - this.field6413;
            this.field6413 += this.field6414 - this.field6413;
            this.field6414 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field6414 += var3;
            var5++;
        } while (var5 < 10 && this.field6413 > this.field6414);
        if (this.field6414 < this.field6413) {
            this.field6414 = this.field6413;
        }
        return var5;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V", line = 39)
    public final void method714(boolean arg0) {
        this.field6416 = 0L;
        if (arg0) {
            this.field6416 = 36L;
        }
        if (this.field6413 < this.field6414) {
            this.field6413 += this.field6414 - this.field6413;
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V", line = 103)
    public class440() {
        this.field6414 = this.field6413 = jagmisc.nanoTime();
        if (this.field6413 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)J", line = 57)
    public final long method716(byte arg0) {
        if (arg0 <= 121) {
            this.method715(-24, 125);
        }
        return this.field6413;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)J", line = 67)
    private final long method2630(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field6416;
        this.field6416 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6418[this.field6417] = var4;
            this.field6417 = (this.field6417 + 1) % 10;
            if (this.field6415 < 1) {
                this.field6415++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field6415; var8++) {
            var6 += this.field6418[(this.field6417 + 10 - var8) % 10];
        }
        if (arg0 < 114) {
            this.field6414 = 91L;
        }
        return var6 / (long) this.field6415;
    }
}
