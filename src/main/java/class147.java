import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class147 extends class610 {

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    private int field1882 = 1;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "[J")
    private long[] field1878 = new long[10];

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    private int field1879 = 0;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "J")
    private long field1881 = 0L;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "J")
    private long field1880 = 0L;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "J")
    private long field1883 = 0L;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)J")
    public final long method839(int arg0) {
        int var2 = 11 / ((44 - arg0) / 37);
        return this.field1880;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
    public final void method840(byte arg0) {
        this.field1881 = 0L;
        if (this.field1883 > this.field1880) {
            this.field1880 += this.field1883 - this.field1880;
        }
        int var2 = -109 / ((arg0 + 41) / 42);
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)J")
    public final long method841(byte arg0) {
        this.field1880 += this.method843(true);
        if (arg0 < 97) {
            return -108L;
        } else if (this.field1883 > this.field1880) {
            return (this.field1883 - this.field1880) / 1000000L;
        } else {
            return 0L;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IJ)I")
    public final int method842(int arg0, long arg1) {
        if (arg0 > -45) {
            this.field1879 = 65;
        }
        if (this.field1883 > this.field1880) {
            this.field1881 += this.field1883 - this.field1880;
            this.field1880 += this.field1883 - this.field1880;
            this.field1883 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field1883 += arg1;
            var4++;
        } while (var4 < 10 && this.field1883 < this.field1880);
        if (this.field1883 < this.field1880) {
            this.field1883 = this.field1880;
        }
        return var4;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)J")
    private final long method843(boolean arg0) {
        long var2 = class502.method2786(-7114) * 1000000L;
        long var4 = var2 - this.field1881;
        this.field1881 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1878[this.field1879] = var4;
            if (this.field1882 < 10) {
                this.field1882++;
            }
            this.field1879 = (this.field1879 + 1) % 10;
        }
        long var6 = 0L;
        if (!arg0) {
            this.method843(false);
        }
        for (int var8 = 1; var8 <= this.field1882; var8++) {
            var6 += this.field1878[(this.field1879 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1882;
    }
}
