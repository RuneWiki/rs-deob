import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class164 extends class327 {

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "J")
    private long field2557 = System.nanoTime();

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V", line = 4)
    public final void method430(boolean arg0) {
        this.field2557 = System.nanoTime();
        if (arg0) {
            this.field2557 = -6L;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)I", line = 16)
    public final int method432(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field2557 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        int var8 = 0;
        class279.method1991(116, var6 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field2557 < var9)) {
            this.field2557 += (long) arg0 * 1000000L;
            var8++;
        }
        if (arg1 <= 98) {
            return 127;
        } else {
            if (var9 > this.field2557) {
                this.field2557 = var9;
            }
            return var8;
        }
    }
}
