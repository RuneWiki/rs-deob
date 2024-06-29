import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class12 extends class303 {

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "J")
    private long field168 = System.nanoTime();

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V", line = 5)
    public final void method56(byte arg0) {
        this.field168 = System.nanoTime();
        if (arg0 > 0) {
            this.method56((byte) 93);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(III)I", line = 24)
    public final int method57(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        if (arg1 != 32493) {
            this.field168 = -19L;
        }
        long var6 = this.field168 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }
        int var8 = 0;
        class137.method1027(var6 / 1000000L, 0);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field168)) {
            this.field168 += (long) arg2 * 1000000L;
            var8++;
        }
        if (this.field168 < var9) {
            this.field168 = var9;
        }
        return var8;
    }
}
