import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class84 extends class83 {

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "J")
    private long field1397 = System.nanoTime();

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)I")
    public final int method5(int arg0, int arg1, int arg2) {
        if (arg2 != -405) {
            this.method6(65);
        }
        long var4 = this.field1397 - System.nanoTime();
        long var6 = (long) arg1 * 1000000L;
        if (var4 < var6) {
            var4 = var6;
        }
        class18.method142(true, var4 / 1000000L);
        long var8 = System.nanoTime();
        int var10 = 0;
        while (var10 < 10 && (var10 < 1 || var8 > this.field1397)) {
            var10++;
            this.field1397 += (long) arg0 * 1000000L;
        }
        if (var8 > this.field1397) {
            this.field1397 = var8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public final void method6(int arg0) {
        this.field1397 = System.nanoTime();
        if (arg0 != -6660) {
            this.field1397 = -15L;
        }
    }
}
