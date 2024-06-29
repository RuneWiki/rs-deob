import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class453 {

    @OriginalMember(owner = "client!us", name = "h", descriptor = "J")
    private long field2 = 0L;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "J")
    private long field1 = 0L;

    @OriginalMember(owner = "client!us", name = "j", descriptor = "[J")
    private long[] field4 = new long[10];

    @OriginalMember(owner = "client!us", name = "i", descriptor = "I")
    private int field3 = 1;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "I")
    private int field5 = 0;

    @OriginalMember(owner = "client!us", name = "l", descriptor = "J")
    private long field6 = 0L;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)J", line = 4)
    public final long method1(int arg0) {
        if (arg0 == 0) {
            this.field2 += this.method2(-125);
            return this.field2 < this.field1 ? (this.field1 - this.field2) / 1000000L : 0L;
        } else {
            return 90L;
        }
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(I)J", line = 22)
    private final long method2(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field6;
        this.field6 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4[this.field5] = var4;
            this.field5 = (this.field5 + 1) % 10;
            if (this.field3 < 1) {
                this.field3++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field3; var8++) {
            var6 += this.field4[(this.field5 - (var8 - 10)) % 10];
        }
        int var9 = -114 / ((arg0 + 18) / 54);
        return var6 / (long) this.field3;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(B)V", line = 52)
    public final void method3(byte arg0) {
        if (this.field2 < this.field1) {
            this.field2 += this.field1 - this.field2;
        }
        this.field6 = 0L;
        int var2 = 114 % ((-arg0 - 28) / 40);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(JZ)I", line = 64)
    public final int method4(long arg0, boolean arg1) {
        if (arg1) {
            return 111;
        } else if (this.field2 < this.field1) {
            this.field6 += this.field1 - this.field2;
            this.field2 += this.field1 - this.field2;
            this.field1 += arg0;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field1 += arg0;
            } while (var4 < 10 && this.field1 < this.field2);
            if (this.field1 < this.field2) {
                this.field1 = this.field2;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)J", line = 98)
    public final long method5(int arg0) {
        if (arg0 != 56) {
            this.field4 = null;
        }
        return this.field2;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V", line = 113)
    public class1() {
        this.field2 = System.nanoTime();
        this.field1 = System.nanoTime();
    }
}
