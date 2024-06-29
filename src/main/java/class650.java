import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class650 extends class624 {

    @OriginalMember(owner = "client!lha", name = "k", descriptor = "J")
    private long field8760 = 0L;

    @OriginalMember(owner = "client!lha", name = "n", descriptor = "J")
    private long field8763 = 0L;

    @OriginalMember(owner = "client!lha", name = "j", descriptor = "[J")
    private long[] field8759 = new long[10];

    @OriginalMember(owner = "client!lha", name = "i", descriptor = "I")
    private int field8758 = 1;

    @OriginalMember(owner = "client!lha", name = "m", descriptor = "J")
    private long field8762 = 0L;

    @OriginalMember(owner = "client!lha", name = "l", descriptor = "I")
    private int field8761 = 0;

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(I)V", line = 4)
    public final void method1517(int arg0) {
        if (this.field8763 < this.field8760) {
            this.field8763 += this.field8760 - this.field8763;
        }
        this.field8762 = arg0;
    }

    @OriginalMember(owner = "client!lha", name = "c", descriptor = "(B)J", line = 16)
    public final long method1516(byte arg0) {
        return arg0 >= -10 ? -103L : this.field8763;
    }

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "(B)J", line = 27)
    public final long method1519(byte arg0) {
        if (arg0 <= 99) {
            return 127L;
        } else {
            this.field8763 += this.method3608(1);
            return this.field8763 < this.field8760 ? (this.field8760 - this.field8763) / 1000000L : 0L;
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(JB)I", line = 43)
    public final int method1515(long arg0, byte arg1) {
        if (arg1 >= -121) {
            return -70;
        } else if (this.field8763 < this.field8760) {
            this.field8762 += this.field8760 - this.field8763;
            this.field8763 += this.field8760 - this.field8763;
            this.field8760 += arg0;
            return 1;
        } else {
            int var4 = 0;
            do {
                this.field8760 += arg0;
                var4++;
            } while (var4 < 10 && this.field8760 < this.field8763);
            if (this.field8760 < this.field8763) {
                this.field8760 = this.field8763;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "(I)J", line = 96)
    private final long method3608(int arg0) {
        long var2 = class401.method2440(false) * 1000000L;
        long var4 = var2 - this.field8762;
        this.field8762 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field8759[this.field8761] = var4;
            this.field8761 = (this.field8761 + 1) % 10;
            if (this.field8758 < 10) {
                this.field8758++;
            }
        }
        long var6 = 0L;
        for (int var8 = arg0; var8 <= this.field8758; var8++) {
            var6 += this.field8759[(this.field8761 + 10 - var8) % 10];
        }
        return var6 / (long) this.field8758;
    }
}
