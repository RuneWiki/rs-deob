import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class127 extends class176 {

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "[J")
    private long[] field1866 = new long[10];

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    private int field1867 = 0;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "J")
    private long field1870 = 0L;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "J")
    private long field1868 = 0L;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    private int field1871 = 1;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "J")
    private long field1869 = 0L;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)J")
    public final long method912(int arg0) {
        if (arg0 != 11604) {
            this.field1867 = -123;
        }
        return this.field1868;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)J")
    private final long method913(int arg0) {
        long var2 = class197.method1454((byte) -104) * 1000000L;
        long var4 = var2 - this.field1869;
        long var6 = 0L;
        this.field1869 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1866[this.field1867] = var4;
            if (this.field1871 < 10) {
                this.field1871++;
            }
            this.field1867 = (this.field1867 + 1) % 10;
        }
        int var8 = 1;
        if (arg0 != -6701) {
            this.method913(122);
        }
        while (this.field1871 >= var8) {
            var6 += this.field1866[(this.field1867 + 10 - var8) % 10];
            var8++;
        }
        return var6 / (long) this.field1871;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public final void method914(int arg0) {
        if (arg0 == 1) {
            this.field1869 = 0L;
            if (this.field1868 < this.field1870) {
                this.field1868 += this.field1870 - this.field1868;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)I")
    public final int method915(int arg0, int arg1, int arg2) {
        class43.method324((long) arg0, 53);
        this.field1868 += this.method913(-6701);
        long var4 = (long) arg1 * 1000000L;
        if (arg2 != 1) {
            this.field1871 = -104;
        }
        if (this.field1868 < this.field1870) {
            class43.method324((this.field1870 - this.field1868) / 1000000L, arg2 ^ 0x4B);
            this.field1869 += this.field1870 - this.field1868;
            this.field1868 += this.field1870 - this.field1868;
            this.field1870 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field1870 += var4;
            var6++;
        } while (var6 < 10 && this.field1870 < this.field1868);
        if (this.field1868 > this.field1870) {
            this.field1870 = this.field1868;
        }
        return var6;
    }
}
