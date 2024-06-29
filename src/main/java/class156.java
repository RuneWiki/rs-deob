import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class156 extends class251 {

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "J")
    private long field2812 = System.nanoTime();

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V", line = 4)
    public final void method260(int arg0) {
        this.field2812 = System.nanoTime();
        if (arg0 != -22746) {
            this.field2812 = -106L;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZI)I", line = 18)
    public final int method256(int arg0, boolean arg1, int arg2) {
        int var4 = 0;
        long var5 = this.field2812 - System.nanoTime();
        long var7 = (long) arg2 * 1000000L;
        if (var7 > var5) {
            var5 = var7;
        }
        class204.method1510(var5 / 1000000L, 1);
        long var9 = System.nanoTime();
        if (!arg1) {
            this.field2812 = 17L;
        }
        while (var4 < 10 && (var4 < 1 || this.field2812 < var9)) {
            var4++;
            this.field2812 += (long) arg0 * 1000000L;
        }
        if (var9 > this.field2812) {
            this.field2812 = var9;
        }
        return var4;
    }
}
