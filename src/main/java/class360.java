import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class360 extends class401 {

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "J")
    private long field5184 = 0L;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "J")
    private long field5185 = 0L;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "J")
    private long field5187 = 0L;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
    private int field5188 = 0;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
    private int field5186 = 1;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "[J")
    private long[] field5189 = new long[10];

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)J", line = 4)
    public final long method1698(int arg0) {
        this.field5184 += this.method2305(10);
        if (arg0 > -60) {
            this.field5187 = 17L;
        }
        return this.field5185 > this.field5184 ? (this.field5185 - this.field5184) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V", line = 20)
    public final void method1699(byte arg0) {
        this.field5187 = 0L;
        if (arg0 < 88) {
            this.method1699((byte) -4);
        }
        if (this.field5184 < this.field5185) {
            this.field5184 += this.field5185 - this.field5184;
        }
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)J", line = 36)
    private final long method2305(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field5187;
        if (arg0 != 10) {
            return -56L;
        }
        this.field5187 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5189[this.field5188] = var4;
            if (this.field5186 < 1) {
                this.field5186++;
            }
            this.field5188 = (this.field5188 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5186; var8++) {
            var6 += this.field5189[(this.field5188 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5186;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IJ)I", line = 68)
    public final int method1697(int arg0, long arg1) {
        if (arg0 != 71) {
            return 22;
        } else if (this.field5185 > this.field5184) {
            this.field5187 += this.field5185 - this.field5184;
            this.field5184 += this.field5185 - this.field5184;
            this.field5185 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field5185 += arg1;
            } while (var4 < 10 && this.field5184 > this.field5185);
            if (this.field5185 < this.field5184) {
                this.field5185 = this.field5184;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)J", line = 101)
    public final long method1696(int arg0) {
        return arg0 == -18931 ? this.field5184 : -36L;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V", line = 116)
    public class360() {
        this.field5184 = System.nanoTime();
        this.field5185 = System.nanoTime();
    }
}
