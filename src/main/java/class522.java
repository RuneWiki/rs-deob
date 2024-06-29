import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class522 extends class35 {

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "[J")
    private long[] field7698 = new long[10];

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "J")
    private long field7701 = 0L;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "J")
    private long field7699 = 0L;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "J")
    private long field7700 = 0L;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    private int field7702 = 0;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    private int field7703 = 1;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)J", line = 5)
    public final long method263(int arg0) {
        if (arg0 != 11854) {
            this.method263(83);
        }
        return this.field7699;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)I", line = 15)
    public final int method262(int arg0, boolean arg1) {
        if (!arg1) {
            this.field7699 = -46L;
        }
        long var3 = (long) arg0 * 1000000L;
        this.field7699 += this.method3084(-103);
        if (this.field7701 > this.field7699) {
            class444.method2667(-28210, (this.field7701 - this.field7699) / 1000000L);
            this.field7700 += this.field7701 - this.field7699;
            this.field7699 += this.field7701 - this.field7699;
            this.field7701 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field7701 += var3;
        } while (var5 < 10 && this.field7699 > this.field7701);
        if (this.field7699 > this.field7701) {
            this.field7701 = this.field7699;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V", line = 60)
    public final void method264(int arg0) {
        if (arg0 == 19499) {
            if (this.field7701 > this.field7699) {
                this.field7699 += this.field7701 - this.field7699;
            }
            this.field7700 = 0L;
        }
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)J", line = 80)
    private final long method3084(int arg0) {
        if (arg0 >= -29) {
            this.method3084(84);
        }
        long var2 = class19.method91((byte) 127) * 1000000L;
        long var4 = var2 - this.field7700;
        this.field7700 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7698[this.field7702] = var4;
            this.field7702 = (this.field7702 + 1) % 10;
            if (this.field7703 < 10) {
                this.field7703++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field7703; var8++) {
            var6 += this.field7698[(this.field7702 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7703;
    }
}
