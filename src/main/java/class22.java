import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class22 extends class20 {

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "J")
    private long field444 = System.nanoTime();

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public final void method175(int arg0) {
        this.field444 = System.nanoTime();
        if (arg0 < 119) {
            this.method176(50, -18, -104);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I")
    public final int method176(int arg0, int arg1, int arg2) {
        long var4 = this.field444 - System.nanoTime();
        long var6 = (long) arg1 * 1000000L;
        if (var4 < var6) {
            var4 = var6;
        }
        class33.method283(-51, var4 / 1000000L);
        long var8 = System.nanoTime();
        int var10;
        for (var10 = 0; var10 < 10 && (var10 < 1 || var8 > this.field444); var10++) {
            this.field444 += (long) arg2 * 1000000L;
        }
        if (arg0 > -122) {
            return 93;
        } else {
            if (var8 > this.field444) {
                this.field444 = var8;
            }
            return var10;
        }
    }
}
