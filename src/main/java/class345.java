import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class345 extends class284 {

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "J")
    private long field5068 = 0L;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "J")
    private long field5069 = 0L;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "[J")
    private long[] field5071 = new long[10];

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    private int field5070 = 1;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "J")
    private long field5072 = 0L;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    private int field5073 = 0;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)J")
    public final long method706(boolean arg0) {
        this.field5068 += this.method2170(4621);
        if (this.field5069 > this.field5068) {
            return (this.field5069 - this.field5068) / 1000000L;
        } else {
            if (!arg0) {
                this.field5070 = 24;
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)J")
    private final long method2170(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field5072;
        this.field5072 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5071[this.field5073] = var4;
            if (this.field5070 < 1) {
                this.field5070++;
            }
            this.field5073 = (this.field5073 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5070; var8++) {
            var6 += this.field5071[(this.field5073 + 10 - var8) % 10];
        }
        if (arg0 != 4621) {
            this.method706(true);
        }
        return var6 / (long) this.field5070;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)J")
    public final long method702(int arg0) {
        return arg0 == 3 ? this.field5068 : -58L;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public final void method703(int arg0) {
        if (this.field5068 < this.field5069) {
            this.field5068 += this.field5069 - this.field5068;
        }
        this.field5072 = 0L;
        if (arg0 != -19014) {
            this.method704(-85, 21L);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IJ)I")
    public final int method704(int arg0, long arg1) {
        if (arg0 != -65536) {
            return -32;
        } else if (this.field5069 > this.field5068) {
            this.field5072 += this.field5069 - this.field5068;
            this.field5068 += this.field5069 - this.field5068;
            this.field5069 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field5069 += arg1;
            } while (var4 < 10 && this.field5068 > this.field5069);
            if (this.field5069 < this.field5068) {
                this.field5069 = this.field5068;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class345() {
        this.field5068 = System.nanoTime();
        this.field5069 = System.nanoTime();
    }
}
