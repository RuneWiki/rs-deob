import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class244 extends class201 {

    @OriginalMember(owner = "client!at", name = "k", descriptor = "J")
    private long field3510 = 0L;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "J")
    private long field3509 = 0L;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "I")
    private int field3512 = 1;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "I")
    private int field3514 = 0;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "J")
    private long field3511 = 0L;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "[J")
    private long[] field3513 = new long[10];

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)I")
    public final int method238(int arg0, int arg1) {
        if (arg0 < 57) {
            this.field3513 = null;
        }
        this.field3509 += this.method1527((byte) 112);
        long var3 = (long) arg1 * 1000000L;
        if (this.field3510 > this.field3509) {
            class322.method1935(true, (this.field3510 - this.field3509) / 1000000L);
            this.field3511 += this.field3510 - this.field3509;
            this.field3509 += this.field3510 - this.field3509;
            this.field3510 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field3510 += var3;
            var5++;
        } while (var5 < 10 && this.field3509 > this.field3510);
        if (this.field3510 < this.field3509) {
            this.field3510 = this.field3509;
        }
        return var5;
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)J")
    public final long method236(int arg0) {
        return arg0 >= -123 ? -108L : this.field3509;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
    public final void method237(byte arg0) {
        if (arg0 > -121) {
            this.field3512 = 4;
        }
        this.field3511 = 0L;
        if (this.field3509 < this.field3510) {
            this.field3509 += this.field3510 - this.field3509;
        }
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(B)J")
    private final long method1527(byte arg0) {
        long var2 = System.nanoTime();
        if (arg0 <= 14) {
            return 84L;
        }
        long var4 = var2 - this.field3511;
        this.field3511 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3513[this.field3514] = var4;
            if (this.field3512 < 1) {
                this.field3512++;
            }
            this.field3514 = (this.field3514 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field3512; var8++) {
            var6 += this.field3513[(this.field3514 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3512;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V")
    public class244() {
        this.field3509 = System.nanoTime();
        this.field3510 = System.nanoTime();
    }
}
