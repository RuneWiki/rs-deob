import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class143 extends class72 {

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "J")
    private long field2051 = 0L;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "J")
    private long field2050 = 0L;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    private int field2053 = 0;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "J")
    private long field2052 = 0L;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "[J")
    private long[] field2055 = new long[10];

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    private int field2054 = 1;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)J")
    public final long method474(byte arg0) {
        return arg0 == 90 ? this.field2050 : 112L;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)I")
    public final int method472(int arg0, int arg1) {
        this.field2050 += this.method999((byte) 80);
        long var3 = (long) arg0 * 1000000L;
        if (arg1 != 14965) {
            return -122;
        } else if (this.field2050 < this.field2051) {
            class94.method674((this.field2051 - this.field2050) / 1000000L, 1);
            this.field2052 += this.field2051 - this.field2050;
            this.field2050 += this.field2051 - this.field2050;
            this.field2051 += var3;
            return 1;
        } else {
            int var5 = 0;
            do {
                var5++;
                this.field2051 += var3;
            } while (var5 < 10 && this.field2051 < this.field2050);
            if (this.field2050 > this.field2051) {
                this.field2051 = this.field2050;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)J")
    private final long method999(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field2052;
        this.field2052 = var2;
        int var6 = 92 % ((arg0 - 2) / 37);
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2055[this.field2053] = var4;
            this.field2053 = (this.field2053 + 1) % 10;
            if (this.field2054 < 1) {
                this.field2054++;
            }
        }
        long var7 = 0L;
        for (int var9 = 1; var9 <= this.field2054; var9++) {
            var7 += this.field2055[(this.field2053 + 10 - var9) % 10];
        }
        return var7 / (long) this.field2054;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public final void method473(int arg0) {
        if (arg0 != -3512) {
            this.method472(120, 109);
        }
        if (this.field2050 < this.field2051) {
            this.field2050 += this.field2051 - this.field2050;
        }
        this.field2052 = 0L;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class143() {
        this.field2050 = System.nanoTime();
        this.field2051 = System.nanoTime();
    }
}
