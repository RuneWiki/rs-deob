import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class148 extends class437 {

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "J")
    private long field1877 = 0L;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "J")
    private long field1878 = 0L;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    private int field1879 = 1;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "[J")
    private long[] field1880 = new long[10];

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    private int field1881 = 0;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "J")
    private long field1882 = 0L;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)J", line = 4)
    private final long method793(int arg0) {
        long var2 = jagmisc.nanoTime();
        if (arg0 <= 3) {
            this.field1882 = -57L;
        }
        long var4 = var2 - this.field1882;
        this.field1882 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1880[this.field1881] = var4;
            this.field1881 = (this.field1881 + 1) % 10;
            if (this.field1879 < 1) {
                this.field1879++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1879; var8++) {
            var6 += this.field1880[(this.field1881 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1879;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)J", line = 37)
    public final long method139(boolean arg0) {
        if (!arg0) {
            this.method793(-68);
        }
        return this.field1877;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V", line = 103)
    public class148() {
        this.field1878 = this.field1877 = jagmisc.nanoTime();
        if (this.field1877 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)I", line = 50)
    public final int method136(int arg0, int arg1) {
        this.field1877 += this.method793(85);
        if (arg0 != 1) {
            return 101;
        }
        long var3 = (long) arg1 * 1000000L;
        if (this.field1878 > this.field1877) {
            class370.method2235((this.field1878 - this.field1877) / 1000000L, 10);
            this.field1882 += this.field1878 - this.field1877;
            this.field1877 += this.field1878 - this.field1877;
            this.field1878 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field1878 += var3;
        } while (var5 < 10 && this.field1878 < this.field1877);
        if (this.field1878 < this.field1877) {
            this.field1878 = this.field1877;
        }
        return var5;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V", line = 91)
    public final void method137(byte arg0) {
        if (arg0 != -57) {
            this.method793(-39);
        }
        if (this.field1877 < this.field1878) {
            this.field1877 += this.field1878 - this.field1877;
        }
        this.field1882 = 0L;
    }
}
