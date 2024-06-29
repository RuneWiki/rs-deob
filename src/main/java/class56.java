import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class56 extends class25 {

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "J")
    private long field1417;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V", line = 6)
    public final void method225(byte arg0) {
        int var2 = -55 % ((85 - arg0) / 34);
        this.field1417 = System.nanoTime();
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)I", line = 16)
    public final int method228(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        int var6 = arg2;
        long var7 = this.field1417 - System.nanoTime();
        if (var7 < var4) {
            var7 = var4;
        }
        class127.method1004(var7 / 1000000L, arg2 - 105);
        long var9 = System.nanoTime();
        while (var6 < 10 && (var6 < 1 || var9 > this.field1417)) {
            var6++;
            this.field1417 += (long) arg1 * 1000000L;
        }
        if (var9 > this.field1417) {
            this.field1417 = var9;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V", line = 43)
    public final void method224(byte arg0) {
        if (arg0 != 33) {
            this.field1417 = -95L;
        }
        this.method225((byte) 122);
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V", line = 51)
    public class56() {
        this.method225((byte) -34);
    }
}
