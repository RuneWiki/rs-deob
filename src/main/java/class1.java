import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class1 extends class211 {

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "J")
    private long field2 = 0L;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "J")
    private long field1 = 0L;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "J")
    private long field3 = 0L;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    private int field4 = 0;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "[J")
    private long[] field6 = new long[10];

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    private int field5 = 1;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)J", line = 5)
    private final long method1(boolean arg0) {
        if (!arg0) {
            this.method2(78);
        }
        long var2 = System.nanoTime();
        long var4 = var2 - this.field3;
        this.field3 = var2;
        long var6 = 0L;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6[this.field4] = var4;
            if (this.field5 < 1) {
                this.field5++;
            }
            this.field4 = (this.field4 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field5; var8++) {
            var6 += this.field6[(this.field4 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)J", line = 38)
    public final long method2(int arg0) {
        if (arg0 != 0) {
            this.field4 = -119;
        }
        return this.field1;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V", line = 104)
    public class1() {
        this.field1 = System.nanoTime();
        this.field2 = System.nanoTime();
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V", line = 56)
    public final void method3(int arg0) {
        if (arg0 != 31) {
            this.field6 = (long[]) null;
        }
        if (this.field2 > this.field1) {
            this.field1 += this.field2 - this.field1;
        }
        this.field3 = 0L;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(III)I", line = 70)
    public final int method4(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        if (arg2 != 2) {
            return -16;
        }
        class188.method1443(10, (long) arg1);
        this.field1 += this.method1(true);
        if (this.field1 < this.field2) {
            class188.method1443(10, (this.field2 - this.field1) / 1000000L);
            this.field3 += this.field2 - this.field1;
            this.field1 += this.field2 - this.field1;
            this.field2 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field2 += var4;
        } while (var6 < 10 && this.field2 < this.field1);
        if (this.field1 > this.field2) {
            this.field2 = this.field1;
        }
        return var6;
    }
}
