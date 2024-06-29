import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class235 extends class60 {

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "J")
    private long field4049 = System.nanoTime();

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)I")
    public final int method330(int arg0, int arg1, int arg2) {
        if (arg2 != 10931) {
            this.field4049 = -22L;
        }
        long var4 = this.field4049 - System.nanoTime();
        long var6 = (long) arg1 * 1000000L;
        if (var4 < var6) {
            var4 = var6;
        }
        class100.method711(0, var4 / 1000000L);
        int var8 = 0;
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field4049 < var9)) {
            this.field4049 += (long) arg0 * 1000000L;
            var8++;
        }
        if (var9 > this.field4049) {
            this.field4049 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public final void method331(int arg0) {
        this.field4049 = System.nanoTime();
        if (arg0 != 9995) {
            this.field4049 = -114L;
        }
    }
}
