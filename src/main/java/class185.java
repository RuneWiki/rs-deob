import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class185 extends class669 {

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "J")
    private long field2348 = 0L;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "J")
    private long field2349 = 0L;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "J")
    private long field2352 = 0L;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "[J")
    private long[] field2351 = new long[10];

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    private int field2350 = 1;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    private int field2353 = 0;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)J", line = 4)
    public final long method643(int arg0) {
        if (arg0 != 26262) {
            this.method641(23);
        }
        return this.field2349;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V", line = 14)
    public final void method641(int arg0) {
        this.field2352 = arg0;
        if (this.field2349 < this.field2348) {
            this.field2349 += this.field2348 - this.field2349;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)J", line = 26)
    public final long method639(int arg0) {
        this.field2349 += this.method1145(-82);
        if (this.field2348 > this.field2349) {
            return (this.field2348 - this.field2349) / 1000000L;
        } else if (arg0 > -96) {
            return 28L;
        } else {
            return 0L;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(JB)I", line = 43)
    public final int method640(long arg0, byte arg1) {
        int var4 = -9 % ((arg1 - 50) / 63);
        if (this.field2349 < this.field2348) {
            this.field2352 += this.field2348 - this.field2349;
            this.field2349 += this.field2348 - this.field2349;
            this.field2348 += arg0;
            return 1;
        }
        int var5 = 0;
        do {
            this.field2348 += arg0;
            var5++;
        } while (var5 < 10 && this.field2348 < this.field2349);
        if (this.field2349 > this.field2348) {
            this.field2348 = this.field2349;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 78)
    public class185() {
        this.field2349 = System.nanoTime();
        this.field2348 = System.nanoTime();
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)J", line = 91)
    private final long method1145(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field2352;
        this.field2352 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2351[this.field2353] = var4;
            this.field2353 = (this.field2353 + 1) % 10;
            if (this.field2350 < 1) {
                this.field2350++;
            }
        }
        long var6 = 0L;
        if (arg0 > -76) {
            this.field2348 = 70L;
        }
        for (int var8 = 1; var8 <= this.field2350; var8++) {
            var6 += this.field2351[(this.field2353 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2350;
    }
}
