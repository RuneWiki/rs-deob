import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class70 extends class164 {

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "J")
    private long field1370 = System.nanoTime();

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
    public final int method320(int arg0, int arg1, int arg2) {
        long var4 = this.field1370 - System.nanoTime();
        int var6 = 0;
        long var7 = (long) arg0 * 1000000L;
        if (var7 > var4) {
            var4 = var7;
        }
        if (arg2 < 77) {
            this.method319(96);
        }
        class156.method1027(0, var4 / 1000000L);
        long var9 = System.nanoTime();
        while (var6 < 10 && (var6 < 1 || var9 > this.field1370)) {
            this.field1370 += (long) arg1 * 1000000L;
            var6++;
        }
        if (this.field1370 < var9) {
            this.field1370 = var9;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public final void method319(int arg0) {
        if (arg0 > -79) {
            this.field1370 = -20L;
        }
        this.field1370 = System.nanoTime();
    }
}
