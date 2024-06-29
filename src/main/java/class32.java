import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class32 extends class51 {

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "J")
    private long field762;

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V", line = 3)
    public class32() {
        this.method306((byte) 98);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)I", line = 14)
    public final int method304(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        if (arg0 != -2) {
            this.method304(-50, 33, 12);
        }
        int var6 = 0;
        long var7 = this.field762 - System.nanoTime();
        if (var7 < var4) {
            var7 = var4;
        }
        class75.method634(var7 / 1000000L, 20306);
        long var9 = System.nanoTime();
        while (var6 < 10 && (var6 < 1 || this.field762 < var9)) {
            this.field762 += (long) arg1 * 1000000L;
            var6++;
        }
        if (this.field762 < var9) {
            this.field762 = var9;
        }
        return var6;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 44)
    public final void method305(byte arg0) {
        this.method306((byte) 81);
        if (arg0 != -47) {
            this.method305((byte) -87);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V", line = 54)
    public final void method306(byte arg0) {
        if (arg0 >= 10) {
            this.field762 = System.nanoTime();
        }
    }
}
