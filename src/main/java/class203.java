import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class203 extends class296 {

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    private int field2944 = 0;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "J")
    private long field2947 = 0L;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "J")
    private long field2945 = 0L;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    private int field2943 = 1;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "[J")
    private long[] field2948 = new long[10];

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "J")
    private long field2946 = 0L;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZJ)I", line = 6)
    public final int method1271(boolean arg0, long arg1) {
        if (arg0) {
            return -57;
        } else if (this.field2946 > this.field2945) {
            this.field2947 += this.field2946 - this.field2945;
            this.field2945 += this.field2946 - this.field2945;
            this.field2946 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                this.field2946 += arg1;
                var4++;
            } while (var4 < 10 && this.field2946 < this.field2945);
            if (this.field2945 > this.field2946) {
                this.field2946 = this.field2945;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)J", line = 43)
    private final long method1326(int arg0) {
        if (arg0 != -11802) {
            this.method1272(-2);
        }
        long var2 = class681.method3802(-23600) * 1000000L;
        long var4 = var2 - this.field2947;
        this.field2947 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2948[this.field2944] = var4;
            if (this.field2943 < 10) {
                this.field2943++;
            }
            this.field2944 = (this.field2944 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field2943; var8++) {
            var6 += this.field2948[(this.field2944 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2943;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)J", line = 77)
    public final long method1273(int arg0) {
        this.field2945 += this.method1326(-11802);
        if (this.field2945 < this.field2946) {
            return (this.field2946 - this.field2945) / 1000000L;
        } else if (arg0 < 7) {
            return -68L;
        } else {
            return 0L;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)J", line = 97)
    public final long method1272(int arg0) {
        if (arg0 != -1) {
            this.field2948 = null;
        }
        return this.field2945;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 120)
    public final void method1269(int arg0) {
        this.field2947 = 0L;
        if (this.field2946 > this.field2945) {
            this.field2945 += this.field2946 - this.field2945;
        }
        int var2 = -62 % ((79 - arg0) / 39);
    }
}
