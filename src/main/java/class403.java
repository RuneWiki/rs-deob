import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class403 extends class168 {

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "J")
    private long field5826 = 0L;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "J")
    private long field5825 = 0L;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    private int field5827 = 0;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    private int field5830 = 1;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "J")
    private long field5829 = 0L;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "[J")
    private long[] field5828 = new long[10];

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)I")
    public final int method990(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method986(-127);
        }
        this.field5826 += this.method2486(false);
        long var3 = (long) arg0 * 1000000L;
        if (this.field5825 > this.field5826) {
            class316.method1873((this.field5825 - this.field5826) / 1000000L, false);
            this.field5829 += this.field5825 - this.field5826;
            this.field5826 += this.field5825 - this.field5826;
            this.field5825 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field5825 += var3;
            var5++;
        } while (var5 < 10 && this.field5826 > this.field5825);
        if (this.field5825 < this.field5826) {
            this.field5825 = this.field5826;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
    public final void method986(int arg0) {
        this.field5829 = 0L;
        if (this.field5826 < this.field5825) {
            this.field5826 += this.field5825 - this.field5826;
        }
        if (arg0 != 9) {
            this.method985(117);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)J")
    private final long method2486(boolean arg0) {
        long var2 = jagmisc.nanoTime();
        if (arg0) {
            return -118L;
        }
        long var4 = var2 - this.field5829;
        this.field5829 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5828[this.field5827] = var4;
            this.field5827 = (this.field5827 + 1) % 10;
            if (this.field5830 < 1) {
                this.field5830++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5830; var8++) {
            var6 += this.field5828[(this.field5827 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5830;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)J")
    public final long method985(int arg0) {
        return arg0 == 1 ? this.field5826 : -45L;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
    public class403() {
        this.field5825 = this.field5826 = jagmisc.nanoTime();
        if (this.field5826 == 0L) {
            throw new RuntimeException();
        }
    }
}
