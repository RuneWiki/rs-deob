import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class223 extends class71 {

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "J")
    private long field3884 = System.nanoTime();

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V", line = 4)
    public final void method451(int arg0) {
        this.field3884 = System.nanoTime();
        if (arg0 <= 111) {
            this.field3884 = -91L;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)I", line = 22)
    public final int method449(int arg0, int arg1, int arg2) {
        if (arg0 != 1504371521) {
            return 5;
        }
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field3884 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class290.method2001(var6 / 1000000L, false);
        long var8 = System.nanoTime();
        int var10;
        for (var10 = 0; var10 < 10 && (var10 < 1 || var8 > this.field3884); var10++) {
            this.field3884 += (long) arg1 * 1000000L;
        }
        if (this.field3884 < var8) {
            this.field3884 = var8;
        }
        return var10;
    }
}
