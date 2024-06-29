import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class323 extends class237 {

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "J")
    private long field4947 = 0L;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "J")
    private long field4948 = 0L;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "[J")
    private long[] field4949 = new long[10];

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
    private int field4951 = 1;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "J")
    private long field4950 = 0L;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    private int field4952 = 0;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V", line = 5)
    public final void method4(int arg0) {
        if (this.field4948 < this.field4947) {
            this.field4948 += this.field4947 - this.field4948;
        }
        this.field4950 = arg0;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)I", line = 15)
    public final int method1(int arg0, int arg1) {
        if (arg0 != 5309) {
            return 4;
        }
        this.field4948 += this.method2007(10);
        long var3 = (long) arg1 * 1000000L;
        if (this.field4948 < this.field4947) {
            class389.method2332(-127, (this.field4947 - this.field4948) / 1000000L);
            this.field4950 += this.field4947 - this.field4948;
            this.field4948 += this.field4947 - this.field4948;
            this.field4947 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field4947 += var3;
        } while (var5 < 10 && this.field4948 > this.field4947);
        if (this.field4947 < this.field4948) {
            this.field4947 = this.field4948;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)J", line = 51)
    public final long method2(boolean arg0) {
        return arg0 ? this.field4948 : -27L;
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V", line = 99)
    public class323() {
        this.field4947 = this.field4948 = jagmisc.nanoTime();
        if (this.field4948 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)J", line = 64)
    private final long method2007(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field4950;
        if (arg0 != 10) {
            this.method4(-67);
        }
        this.field4950 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4949[this.field4952] = var4;
            if (this.field4951 < 1) {
                this.field4951++;
            }
            this.field4952 = (this.field4952 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field4951; var8++) {
            var6 += this.field4949[(this.field4952 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4951;
    }
}
