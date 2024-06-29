import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class35 extends class190 {

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "J")
    private long field670 = System.nanoTime();

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)I")
    public final int method221(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field670 - System.nanoTime();
        if (arg1 != 1) {
            this.method222(-91);
        }
        if (var6 < var4) {
            var6 = var4;
        }
        int var8 = 0;
        class25.method151(var6 / 1000000L, (byte) 0);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field670)) {
            this.field670 += (long) arg0 * 1000000L;
            var8++;
        }
        if (var9 > this.field670) {
            this.field670 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public final void method222(int arg0) {
        if (arg0 < 106) {
            this.method222(-83);
        }
        this.field670 = System.nanoTime();
    }
}
