import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class249 extends class162 {

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "J")
    private long field4536 = System.nanoTime();

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)I")
    public final int method163(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field4536 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class59.method356(false, var6 / 1000000L);
        long var8 = System.nanoTime();
        int var10 = 0;
        while (var10 < 10 && (var10 < 1 || this.field4536 < var8)) {
            var10++;
            this.field4536 += (long) arg1 * 1000000L;
        }
        if (arg0 != 5) {
            this.field4536 = -43L;
        }
        if (this.field4536 < var8) {
            this.field4536 = var8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public final void method158(boolean arg0) {
        this.field4536 = System.nanoTime();
        if (arg0) {
            this.method163(79, -107, -62);
        }
    }
}
