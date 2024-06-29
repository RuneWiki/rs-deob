import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class108 extends class9 {

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "J")
    private long field2550 = System.nanoTime();

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)I")
    public final int method58(int arg0, int arg1, int arg2) {
        long var4 = this.field2550 - System.nanoTime();
        if (arg1 != 1) {
            this.method57(-47);
        }
        long var6 = (long) arg2 * 1000000L;
        if (var4 < var6) {
            var4 = var6;
        }
        class54.method427(var4 / 1000000L, -27166);
        long var8 = System.nanoTime();
        int var10 = 0;
        while (var10 < 10 && (var10 < 1 || var8 > this.field2550)) {
            var10++;
            this.field2550 += (long) arg0 * 1000000L;
        }
        if (var8 > this.field2550) {
            this.field2550 = var8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public final void method57(int arg0) {
        if (arg0 > 110) {
            this.field2550 = System.nanoTime();
        }
    }
}
