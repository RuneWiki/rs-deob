import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class517 extends class57 {

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "J")
    private long field7355 = 0L;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "J")
    private long field7356 = 0L;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "J")
    private long field7357 = 0L;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "[J")
    private long[] field7359 = new long[10];

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
    private int field7358 = 1;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "I")
    private int field7360 = 0;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)J", line = 4)
    public final long method312(int arg0) {
        if (arg0 < 106) {
            this.method310((byte) 25);
        }
        return this.field7356;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BJ)I", line = 15)
    public final int method309(byte arg0, long arg1) {
        int var4 = 13 / ((arg0 + 71) / 51);
        if (this.field7355 > this.field7356) {
            this.field7357 += this.field7355 - this.field7356;
            this.field7356 += this.field7355 - this.field7356;
            this.field7355 += arg1;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field7355 += arg1;
        } while (var5 < 10 && this.field7355 < this.field7356);
        if (this.field7355 < this.field7356) {
            this.field7355 = this.field7356;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(B)J", line = 48)
    private final long method3040(byte arg0) {
        long var2 = System.nanoTime();
        if (arg0 >= -93) {
            return -91L;
        }
        long var4 = var2 - this.field7357;
        this.field7357 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7359[this.field7360] = var4;
            this.field7360 = (this.field7360 + 1) % 10;
            if (this.field7358 < 1) {
                this.field7358++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field7358; var8++) {
            var6 += this.field7359[(this.field7360 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7358;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V", line = 82)
    public final void method310(byte arg0) {
        if (this.field7356 < this.field7355) {
            this.field7356 += this.field7355 - this.field7356;
        }
        int var2 = 30 % ((-arg0 - 62) / 49);
        this.field7357 = 0L;
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V", line = 116)
    public class517() {
        this.field7356 = System.nanoTime();
        this.field7355 = System.nanoTime();
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)J", line = 98)
    public final long method311(byte arg0) {
        this.field7356 += this.method3040((byte) -110);
        if (arg0 <= 45) {
            this.field7357 = 5L;
        }
        return this.field7355 <= this.field7356 ? 0L : (this.field7355 - this.field7356) / 1000000L;
    }
}
