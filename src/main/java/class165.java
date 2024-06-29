import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class165 extends class211 {

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "J")
    private long field2790 = System.nanoTime();

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)I", line = 5)
    public final int method1230(int arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field2790 - System.nanoTime();
        int var8 = 0;
        if (var4 > var6) {
            var6 = var4;
        }
        class235.method1708(72, var6 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field2790 < var9)) {
            var8++;
            this.field2790 += (long) arg2 * 1000000L;
        }
        if (this.field2790 < var9) {
            this.field2790 = var9;
        }
        int var11 = -118 % ((arg0 - 57) / 40);
        return var8;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 36)
    public final void method1231(int arg0) {
        if (arg0 != -26981) {
            this.method1230(16, -85, -118);
        }
        this.field2790 = System.nanoTime();
    }
}
