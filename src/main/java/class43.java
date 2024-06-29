import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class43 extends class262 {

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "J")
    private long field676 = System.nanoTime();

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 4)
    public final void method113(int arg0) {
        this.field676 = System.nanoTime();
        if (arg0 != -12725) {
            this.method112(102, 82, -69);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)I", line = 16)
    public final int method112(int arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field676 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }
        if (arg2 >= -122) {
            this.method113(27);
        }
        int var8 = 0;
        class313.method2158(var6 / 1000000L, true);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field676)) {
            this.field676 += (long) arg0 * 1000000L;
            var8++;
        }
        if (var9 > this.field676) {
            this.field676 = var9;
        }
        return var8;
    }
}
