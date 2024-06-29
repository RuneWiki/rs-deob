import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class445 extends class330 {

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "J")
    private long field6165 = 0L;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "J")
    private long field6164 = 0L;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "J")
    private long field6167 = 0L;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    private int field6168 = 1;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "[J")
    private long[] field6166 = new long[10];

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    private int field6169 = 0;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)J")
    public final long method1986(byte arg0) {
        if (arg0 < 44) {
            this.method1985((byte) 95, -40);
        }
        return this.field6165;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)I")
    public final int method1985(byte arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        this.field6165 += this.method2757(10);
        if (arg0 != 105) {
            return -31;
        } else if (this.field6164 > this.field6165) {
            class219.method1330((this.field6164 - this.field6165) / 1000000L, true);
            this.field6167 += this.field6164 - this.field6165;
            this.field6165 += this.field6164 - this.field6165;
            this.field6164 += var3;
            return 1;
        } else {
            int var5 = 0;
            do {
                this.field6164 += var3;
                var5++;
            } while (var5 < 10 && this.field6164 < this.field6165);
            if (this.field6164 < this.field6165) {
                this.field6164 = this.field6165;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)J")
    private final long method2757(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field6167;
        this.field6167 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6166[this.field6169] = var4;
            this.field6169 = (this.field6169 + 1) % 10;
            if (this.field6168 < 1) {
                this.field6168++;
            }
        }
        if (arg0 != 10) {
            this.method1984((byte) -126);
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field6168; var8++) {
            var6 += this.field6166[(this.field6169 + 10 - var8) % 10];
        }
        return var6 / (long) this.field6168;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)V")
    public final void method1984(byte arg0) {
        if (this.field6164 > this.field6165) {
            this.field6165 += this.field6164 - this.field6165;
        }
        if (arg0 != 117) {
            this.field6168 = -25;
        }
        this.field6167 = 0L;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    public class445() {
        this.field6164 = this.field6165 = jagmisc.nanoTime();
        if (this.field6165 == 0L) {
            throw new RuntimeException();
        }
    }
}
