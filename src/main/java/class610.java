import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class610 extends class75 {

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    private int field8667 = 0;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    private int field8668 = 1;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "J")
    private long field8670 = 0L;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "[J")
    private long[] field8671 = new long[10];

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "J")
    private long field8669 = 0L;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "J")
    private long field8672 = 0L;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZJ)I", line = 4)
    public final int method716(boolean arg0, long arg1) {
        if (!arg0) {
            this.field8667 = 16;
        }
        if (this.field8670 > this.field8669) {
            this.field8672 += this.field8670 - this.field8669;
            this.field8669 += this.field8670 - this.field8669;
            this.field8670 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field8670 += arg1;
            var4++;
        } while (var4 < 10 && this.field8670 < this.field8669);
        if (this.field8670 < this.field8669) {
            this.field8670 = this.field8669;
        }
        return var4;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)J", line = 39)
    public final long method721(int arg0) {
        if (arg0 != 2259880) {
            this.field8672 = -103L;
        }
        return this.field8669;
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)J", line = 51)
    private final long method3466(int arg0) {
        long var2 = class508.method2860(false) * 1000000L;
        long var4 = var2 - this.field8672;
        this.field8672 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field8671[this.field8667] = var4;
            this.field8667 = (this.field8667 + 1) % 10;
            if (this.field8668 < 10) {
                this.field8668++;
            }
        }
        long var6 = 0L;
        if (arg0 == -11) {
            for (int var8 = 1; var8 <= this.field8668; var8++) {
                var6 += this.field8671[(this.field8667 + 10 - var8) % 10];
            }
            return var6 / (long) this.field8668;
        } else {
            return 40L;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V", line = 85)
    public final void method720(boolean arg0) {
        if (!arg0) {
            this.method722(2);
        }
        if (this.field8670 > this.field8669) {
            this.field8669 += this.field8670 - this.field8669;
        }
        this.field8672 = 0L;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)J", line = 100)
    public final long method722(int arg0) {
        this.field8669 += this.method3466(-11);
        if (arg0 < 7) {
            this.method720(true);
        }
        return this.field8670 > this.field8669 ? (this.field8670 - this.field8669) / 1000000L : 0L;
    }
}
