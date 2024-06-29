import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class215 extends class12 {

    @OriginalMember(owner = "client!f", name = "k", descriptor = "J")
    private long field3959 = System.nanoTime();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)I")
    public final int method101(int arg0, int arg1, int arg2) {
        long var4 = this.field3959 - System.nanoTime();
        long var6 = (long) arg0 * 1000000L;
        if (arg2 != 13855) {
            this.field3959 = 18L;
        }
        int var8 = 0;
        if (var6 > var4) {
            var4 = var6;
        }
        class61.method347(var4 / 1000000L, 1);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field3959)) {
            var8++;
            this.field3959 += (long) arg1 * 1000000L;
        }
        if (this.field3959 < var9) {
            this.field3959 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public final void method96(int arg0) {
        if (arg0 == -257) {
            this.field3959 = System.nanoTime();
        }
    }
}
