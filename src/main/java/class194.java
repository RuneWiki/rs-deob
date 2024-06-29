import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class194 extends class184 {

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "J")
    private long field3562 = System.nanoTime();

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public final void method460(int arg0) {
        if (arg0 != 382) {
            this.method459(115, 101, (byte) -58);
        }
        this.field3562 = System.nanoTime();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)I")
    public final int method459(int arg0, int arg1, byte arg2) {
        long var4 = (long) arg0 * 1000000L;
        long var6 = this.field3562 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class225.method1471(var6 / 1000000L, -23364);
        long var8 = System.nanoTime();
        int var10 = 0;
        if (arg2 != 85) {
            this.field3562 = -90L;
        }
        while (var10 < 10 && (var10 < 1 || var8 > this.field3562)) {
            this.field3562 += (long) arg1 * 1000000L;
            var10++;
        }
        if (var8 > this.field3562) {
            this.field3562 = var8;
        }
        return var10;
    }
}
