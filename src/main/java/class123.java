import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class123 extends class151 {

    @OriginalMember(owner = "client!re", name = "m", descriptor = "J")
    private long field2790 = System.nanoTime();

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(III)I")
    public final int method18(int arg0, int arg1, int arg2) {
        long var4 = this.field2790 - System.nanoTime();
        long var6 = (long) arg0 * 1000000L;
        if (var4 < var6) {
            var4 = var6;
        }
        class126.method962(false, var4 / 1000000L);
        int var8 = 0;
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field2790 < var9)) {
            this.field2790 += (long) arg1 * 1000000L;
            var8++;
        }
        if (arg2 == 23535) {
            if (this.field2790 < var9) {
                this.field2790 = var9;
            }
            return var8;
        } else {
            return -63;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public final void method16(int arg0) {
        if (arg0 == 0) {
            this.field2790 = System.nanoTime();
        }
    }
}
