import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class47 extends class33 {

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "J")
    private long field695 = System.nanoTime();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 4)
    public final void method278(int arg0) {
        if (arg0 != -22393) {
            this.field695 = -85L;
        }
        this.field695 = System.nanoTime();
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)I", line = 15)
    public final int method277(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        int var6 = -68 % ((arg0 - 16) / 56);
        long var7 = this.field695 - System.nanoTime();
        int var9 = 0;
        if (var4 > var7) {
            var7 = var4;
        }
        class288.method1976((byte) 125, var7 / 1000000L);
        long var10 = System.nanoTime();
        while (var9 < 10 && (var9 < 1 || this.field695 < var10)) {
            var9++;
            this.field695 += (long) arg1 * 1000000L;
        }
        if (var10 > this.field695) {
            this.field695 = var10;
        }
        return var9;
    }
}
