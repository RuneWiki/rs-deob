import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class128 extends class135 {

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    private int field1849 = 1;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "J")
    private long field1852 = 0L;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "J")
    private long field1850 = 0L;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "J")
    private long field1851 = 0L;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "[J")
    private long[] field1853 = new long[10];

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    private int field1848 = 0;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public final void method838(int arg0) {
        if (arg0 != 65535) {
            this.field1853 = null;
        }
        this.field1852 = 0L;
        if (this.field1851 < this.field1850) {
            this.field1851 += this.field1850 - this.field1851;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)J")
    public final long method839(boolean arg0) {
        return arg0 ? this.field1851 : -12L;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(III)I")
    public final int method840(int arg0, int arg1, int arg2) {
        class247.method1595((long) arg0, (byte) -83);
        if (arg2 != 0) {
            return 33;
        }
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.method841(arg2 ^ 0x1);
        this.field1851 += var6;
        if (this.field1851 >= this.field1850) {
            int var10 = 0;
            do {
                var10++;
                this.field1850 += var4;
            } while (var10 < 10 && this.field1851 > this.field1850);
            if (this.field1850 < this.field1851) {
                this.field1850 = this.field1851;
            }
            return var10;
        }
        while (this.field1850 > this.field1851) {
            long var8 = this.field1850 - this.field1851;
            if (var8 > var6) {
                var8 = var6;
            }
            if (var8 < 1000000L) {
                var8 = 1000000L;
            }
            class247.method1595((var8 + 500000L) / 1000000L, (byte) -83);
            var6 = this.method841(arg2 + 1);
            this.field1851 += var6;
        }
        this.field1850 += var4;
        return 1;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)J")
    private final long method841(int arg0) {
        long var2 = 0L;
        long var4 = class86.method509(false) * 1000000L;
        long var6 = var4 - this.field1852;
        this.field1852 = var4;
        if (var6 > 0L && var6 < 5000000000L) {
            this.field1853[this.field1848] = var6;
            this.field1848 = (this.field1848 + 1) % 10;
            if (this.field1849 < 10) {
                this.field1849++;
            }
        }
        for (int var8 = arg0; var8 <= this.field1849; var8++) {
            var2 += this.field1853[(this.field1848 + 10 - var8) % 10];
        }
        return var2 / (long) this.field1849;
    }
}
