import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class144 extends class555 {

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "J")
    private long field2293 = 0L;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    private int field2292 = 0;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "J")
    private long field2296 = 0L;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    private int field2295 = 1;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "[J")
    private long[] field2294 = new long[10];

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "J")
    private long field2297 = 0L;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(JI)I", line = 3)
    public final int method1091(long arg0, int arg1) {
        if (arg1 > -123) {
            this.method1091(20L, 44);
        }
        if (this.field2293 < this.field2296) {
            this.field2297 += this.field2296 - this.field2293;
            this.field2293 += this.field2296 - this.field2293;
            this.field2296 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field2296 += arg0;
        } while (var4 < 10 && this.field2293 > this.field2296);
        if (this.field2296 < this.field2293) {
            this.field2296 = this.field2293;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)J", line = 37)
    public final long method1092(int arg0) {
        this.field2293 += this.method1095(0);
        if (this.field2293 < this.field2296) {
            return (this.field2296 - this.field2293) / 1000000L;
        } else if (arg0 == 6407) {
            return 0L;
        } else {
            return 67L;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 54)
    public final void method1093(byte arg0) {
        if (this.field2293 < this.field2296) {
            this.field2293 += this.field2296 - this.field2293;
        }
        int var2 = -80 / ((arg0 - 21) / 57);
        this.field2297 = 0L;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)J", line = 72)
    public final long method1094(int arg0) {
        if (arg0 != -21571) {
            this.method1095(-54);
        }
        return this.field2293;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)J", line = 90)
    private final long method1095(int arg0) {
        long var2 = class375.method2193(arg0 + 116) * 1000000L;
        long var4 = var2 - this.field2297;
        this.field2297 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2294[this.field2292] = var4;
            if (this.field2295 < 10) {
                this.field2295++;
            }
            this.field2292 = (this.field2292 + 1) % 10;
        }
        long var6 = (long) arg0;
        for (int var8 = 1; var8 <= this.field2295; var8++) {
            var6 += this.field2294[(this.field2292 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2295;
    }
}
