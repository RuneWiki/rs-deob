import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class239 extends class389 {

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "[J")
    private long[] field3587 = new long[10];

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    private int field3588 = 1;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "J")
    private long field3589 = 0L;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    private int field3590 = 0;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "J")
    private long field3591 = 0L;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "J")
    private long field3592 = 0L;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)J")
    private final long method1611(byte arg0) {
        long var2 = class375.method2397((byte) -75) * 1000000L;
        long var4 = var2 - this.field3589;
        this.field3589 = var2;
        if (arg0 <= 58) {
            this.field3592 = 87L;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3587[this.field3590] = var4;
            this.field3590 = (this.field3590 + 1) % 10;
            if (this.field3588 < 10) {
                this.field3588++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field3588; var8++) {
            var6 += this.field3587[(this.field3590 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3588;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IZ)I")
    public final int method1431(int arg0, boolean arg1) {
        if (arg1) {
            this.method1430(2);
        }
        this.field3592 += this.method1611((byte) 59);
        long var3 = (long) arg0 * 1000000L;
        if (this.field3591 > this.field3592) {
            class468.method2848((this.field3591 - this.field3592) / 1000000L, (byte) -98);
            this.field3589 += this.field3591 - this.field3592;
            this.field3592 += this.field3591 - this.field3592;
            this.field3591 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field3591 += var3;
            var5++;
        } while (var5 < 10 && this.field3592 > this.field3591);
        if (this.field3591 < this.field3592) {
            this.field3591 = this.field3592;
        }
        return var5;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public final void method1433(int arg0) {
        if (arg0 != 15954) {
            this.method1433(-98);
        }
        if (this.field3592 < this.field3591) {
            this.field3592 += this.field3591 - this.field3592;
        }
        this.field3589 = 0L;
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)J")
    public final long method1430(int arg0) {
        if (arg0 < 12) {
            this.field3592 = 109L;
        }
        return this.field3592;
    }
}
