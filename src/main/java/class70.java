import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class70 extends class271 {

    @OriginalMember(owner = "client!om", name = "k", descriptor = "J")
    private long field1084 = System.nanoTime();

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V", line = 5)
    public final void method368(int arg0) {
        int var2 = 37 / ((-arg0 - 82) / 42);
        this.field1084 = System.nanoTime();
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)I", line = 14)
    public final int method369(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            return 37;
        }
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field1084 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class126.method862(var6 / 1000000L, 64);
        int var8 = 0;
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field1084 < var9)) {
            var8++;
            this.field1084 += (long) arg2 * 1000000L;
        }
        if (var9 > this.field1084) {
            this.field1084 = var9;
        }
        return var8;
    }
}
