import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class406 extends class30 {

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "J")
    private long field5861 = 0L;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "J")
    private long field5862 = 0L;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "J")
    private long field5864 = 0L;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "[J")
    private long[] field5863 = new long[10];

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    private int field5865 = 0;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    private int field5866 = 1;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)I", line = 6)
    public final int method301(int arg0, int arg1) {
        this.field5861 += this.method2532(arg0 ^ 0x2684);
        long var3 = (long) arg1 * 1000000L;
        if (arg0 != -9862) {
            this.field5864 = 46L;
        }
        if (this.field5861 < this.field5862) {
            class418.method2587(false, (this.field5862 - this.field5861) / 1000000L);
            this.field5864 += this.field5862 - this.field5861;
            this.field5861 += this.field5862 - this.field5861;
            this.field5862 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field5862 += var3;
        } while (var5 < 10 && this.field5862 < this.field5861);
        if (this.field5862 < this.field5861) {
            this.field5862 = this.field5861;
        }
        return var5;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)J", line = 42)
    public final long method303(byte arg0) {
        int var2 = -15 % ((-arg0 - 71) / 32);
        return this.field5861;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)J", line = 51)
    private final long method2532(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field5864;
        this.field5864 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5863[this.field5865] = var4;
            this.field5865 = (this.field5865 + 1) % 10;
            if (this.field5866 < 1) {
                this.field5866++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5866; var8++) {
            var6 += this.field5863[(this.field5865 + 10 - var8) % 10];
        }
        if (arg0 != -2) {
            this.field5862 = -10L;
        }
        return var6 / (long) this.field5866;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 102)
    public class406() {
        this.field5861 = System.nanoTime();
        this.field5862 = System.nanoTime();
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 91)
    public final void method302(byte arg0) {
        this.field5864 = 0L;
        if (this.field5862 > this.field5861) {
            this.field5861 += this.field5862 - this.field5861;
        }
        if (arg0 >= -20) {
            this.method303((byte) 115);
        }
    }
}
