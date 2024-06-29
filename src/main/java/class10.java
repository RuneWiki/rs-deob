import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class10 extends class133 {

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "J")
    private long field227 = System.nanoTime();

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)I")
    public final int method101(int arg0, int arg1, int arg2) {
        long var4 = this.field227 - System.nanoTime();
        long var6 = (long) arg2 * 1000000L;
        if (var4 < var6) {
            var4 = var6;
        }
        if (arg0 <= 59) {
            return -127;
        }
        class159.method1130(var4 / 1000000L, 0);
        long var8 = System.nanoTime();
        int var10 = 0;
        while (var10 < 10 && (var10 < 1 || this.field227 < var8)) {
            var10++;
            this.field227 += (long) arg1 * 1000000L;
        }
        if (var8 > this.field227) {
            this.field227 = var8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public final void method102(int arg0) {
        if (arg0 != -1) {
            this.field227 = 72L;
        }
        this.field227 = System.nanoTime();
    }
}
