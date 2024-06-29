import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class168 extends class162 {

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "J")
    private long field3225 = System.nanoTime();

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public final void method1093(int arg0) {
        this.field3225 = System.nanoTime();
        if (arg0 != 0) {
            this.method1095(-58, -78, 19);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)I")
    public final int method1095(int arg0, int arg1, int arg2) {
        long var4 = this.field3225 - System.nanoTime();
        long var6 = (long) arg2 * 1000000L;
        if (var4 < var6) {
            var4 = var6;
        }
        class189.method1260(var4 / 1000000L, 1);
        long var8 = System.nanoTime();
        int var10;
        for (var10 = arg0; var10 < 10 && (var10 < 1 || this.field3225 < var8); var10++) {
            this.field3225 += (long) arg1 * 1000000L;
        }
        if (var8 > this.field3225) {
            this.field3225 = var8;
        }
        return var10;
    }
}
