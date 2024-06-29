import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class106 extends class91 {

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "J")
    private long field2032 = System.nanoTime();

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I")
    public final int method211(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        int var6 = 0;
        long var7 = this.field2032 - System.nanoTime();
        if (var7 < var4) {
            var7 = var4;
        }
        if (arg1 != -19) {
            return -96;
        }
        class91.method636(-5, var7 / 1000000L);
        long var9 = System.nanoTime();
        while (var6 < 10 && (var6 < 1 || this.field2032 < var9)) {
            this.field2032 += (long) arg2 * 1000000L;
            var6++;
        }
        if (var9 > this.field2032) {
            this.field2032 = var9;
        }
        return var6;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
    public final void method210(boolean arg0) {
        this.field2032 = System.nanoTime();
        if (!arg0) {
            this.method210(false);
        }
    }
}
