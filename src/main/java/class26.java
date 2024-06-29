import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class26 extends class187 {

    @OriginalMember(owner = "client!di", name = "i", descriptor = "J")
    private long field329 = System.nanoTime();

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public final void method149(int arg0) {
        this.field329 = System.nanoTime();
        if (arg0 != 16) {
            this.method149(127);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)I")
    public final int method150(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        long var6 = this.field329 - System.nanoTime();
        int var8 = 0;
        if (arg2 != -1) {
            this.field329 = 53L;
        }
        if (var6 < var4) {
            var6 = var4;
        }
        class73.method464((byte) -123, var6 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field329)) {
            var8++;
            this.field329 += (long) arg1 * 1000000L;
        }
        if (this.field329 < var9) {
            this.field329 = var9;
        }
        return var8;
    }
}
