import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class241 extends class548 {

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "J")
    private long field3412 = 0L;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "J")
    private long field3413 = 0L;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "[J")
    private long[] field3415 = new long[10];

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    private int field3414 = 0;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "J")
    private long field3416 = 0L;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    private int field3417 = 1;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)J", line = 3)
    private final long method1603(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field3416;
        this.field3416 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3415[this.field3414] = var4;
            this.field3414 = (this.field3414 + 1) % 10;
            if (this.field3417 < 1) {
                this.field3417++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field3417; var8++) {
            var6 += this.field3415[(this.field3414 + 10 - var8) % 10];
        }
        if (arg0 != 105) {
            this.method1605(20);
        }
        return var6 / (long) this.field3417;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(JI)I", line = 38)
    public final int method1604(long arg0, int arg1) {
        if (arg1 != 50) {
            this.method1606((byte) -71);
        }
        if (this.field3412 < this.field3413) {
            this.field3416 += this.field3413 - this.field3412;
            this.field3412 += this.field3413 - this.field3412;
            this.field3413 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field3413 += arg0;
        } while (var4 < 10 && this.field3413 < this.field3412);
        if (this.field3413 < this.field3412) {
            this.field3413 = this.field3412;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 116)
    public class241() {
        this.field3413 = this.field3412 = jagmisc.nanoTime();
        if (this.field3412 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)J", line = 74)
    public final long method1605(int arg0) {
        if (arg0 != 12948) {
            this.method1605(-53);
        }
        this.field3412 += this.method1603((byte) 105);
        return this.field3412 < this.field3413 ? (this.field3413 - this.field3412) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V", line = 91)
    public final void method1606(byte arg0) {
        int var2 = -121 / ((-arg0 - 69) / 41);
        this.field3416 = 0L;
        if (this.field3412 < this.field3413) {
            this.field3412 += this.field3413 - this.field3412;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)J", line = 103)
    public final long method1607(byte arg0) {
        if (arg0 > -71) {
            this.method1605(79);
        }
        return this.field3412;
    }
}
