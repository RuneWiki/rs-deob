import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class484 extends class485 {

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "J")
    private long field7201 = 0L;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "J")
    private long field7200 = 0L;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "J")
    private long field7202 = 0L;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    private int field7203 = 0;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "[J")
    private long[] field7205 = new long[10];

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    private int field7204 = 1;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)J")
    public final long method883(int arg0) {
        if (arg0 != 10679) {
            this.field7203 = 115;
        }
        return this.field7200;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public final void method884(int arg0) {
        if (arg0 != -18051) {
            this.field7201 = 12L;
        }
        this.field7202 = 0L;
        if (this.field7201 > this.field7200) {
            this.field7200 += this.field7201 - this.field7200;
        }
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)J")
    private final long method2882(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field7202;
        this.field7202 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7205[this.field7203] = var4;
            if (this.field7204 < 1) {
                this.field7204++;
            }
            this.field7203 = (this.field7203 + 1) % 10;
        }
        long var6 = (long) arg0;
        for (int var8 = 1; var8 <= this.field7204; var8++) {
            var6 += this.field7205[(this.field7203 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7204;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)I")
    public final int method885(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        this.field7200 += this.method2882(0);
        if (arg0 > -4) {
            return 110;
        } else if (this.field7201 > this.field7200) {
            class71.method583((this.field7201 - this.field7200) / 1000000L, 42);
            this.field7202 += this.field7201 - this.field7200;
            this.field7200 += this.field7201 - this.field7200;
            this.field7201 += var3;
            return 1;
        } else {
            int var5 = 0;
            do {
                this.field7201 += var3;
                var5++;
            } while (var5 < 10 && this.field7200 > this.field7201);
            if (this.field7200 > this.field7201) {
                this.field7201 = this.field7200;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
    public class484() {
        this.field7201 = this.field7200 = jagmisc.nanoTime();
        if (this.field7200 == 0L) {
            throw new RuntimeException();
        }
    }
}
