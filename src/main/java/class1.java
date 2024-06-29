import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class1 extends class237 {

    @OriginalMember(owner = "client!is", name = "f", descriptor = "J")
    private long field1 = 0L;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "J")
    private long field2 = 0L;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "J")
    private long field4 = 0L;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    private int field3 = 1;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "[J")
    private long[] field6 = new long[10];

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    private int field5 = 0;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)I")
    public final int method1(int arg0, int arg1) {
        if (arg0 != 5309) {
            this.method2(false);
        }
        long var3 = (long) arg1 * 1000000L;
        this.field2 += this.method3(10);
        if (this.field1 > this.field2) {
            class389.method2332(-115, (this.field1 - this.field2) / 1000000L);
            this.field4 += this.field1 - this.field2;
            this.field2 += this.field1 - this.field2;
            this.field1 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field1 += var3;
        } while (var5 < 10 && this.field2 > this.field1);
        if (this.field2 > this.field1) {
            this.field1 = this.field2;
        }
        return var5;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)J")
    public final long method2(boolean arg0) {
        return arg0 ? this.field2 : -68L;
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(I)J")
    private final long method3(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field4;
        this.field4 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6[this.field5] = var4;
            if (this.field3 < 1) {
                this.field3++;
            }
            this.field5 = (this.field5 + 1) % 10;
        }
        if (arg0 != 10) {
            this.method3(102);
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field3; var8++) {
            var6 += this.field6[(this.field5 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3;
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
    public class1() {
        this.field2 = System.nanoTime();
        this.field1 = System.nanoTime();
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public final void method4(int arg0) {
        this.field4 = arg0;
        if (this.field1 > this.field2) {
            this.field2 += this.field1 - this.field2;
        }
    }
}
