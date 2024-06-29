import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class391 extends class75 {

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "J")
    private long field5507 = 0L;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "J")
    private long field5508 = 0L;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    private int field5509 = 1;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "J")
    private long field5511 = 0L;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "[J")
    private long[] field5510 = new long[10];

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    private int field5512 = 0;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)I")
    public final int method401(byte arg0, int arg1) {
        if (arg0 != -51) {
            return -33;
        }
        this.field5508 += this.method2495(-6163);
        long var3 = (long) arg1 * 1000000L;
        if (this.field5508 < this.field5507) {
            class150.method907((this.field5507 - this.field5508) / 1000000L, (byte) -32);
            this.field5511 += this.field5507 - this.field5508;
            this.field5508 += this.field5507 - this.field5508;
            this.field5507 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field5507 += var3;
        } while (var5 < 10 && this.field5507 < this.field5508);
        if (this.field5508 > this.field5507) {
            this.field5507 = this.field5508;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)J")
    public final long method399(int arg0) {
        return arg0 == 1 ? this.field5508 : -68L;
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)J")
    private final long method2495(int arg0) {
        if (arg0 != -6163) {
            this.method401((byte) 16, -39);
        }
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field5511;
        this.field5511 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5510[this.field5512] = var4;
            if (this.field5509 < 1) {
                this.field5509++;
            }
            this.field5512 = (this.field5512 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5509; var8++) {
            var6 += this.field5510[(this.field5512 - (var8 - 10)) % 10];
        }
        return var6 / (long) this.field5509;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class391() {
        this.field5507 = this.field5508 = jagmisc.nanoTime();
        if (this.field5508 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
    public final void method400(int arg0) {
        this.field5511 = 0L;
        if (arg0 > -83) {
            this.method2495(9);
        }
        if (this.field5508 < this.field5507) {
            this.field5508 += this.field5507 - this.field5508;
        }
    }
}
