import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class26 extends class13 {

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "J")
    private long field336 = System.nanoTime();

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public final void method80(byte arg0) {
        int var2 = 107 / ((-arg0 - 3) / 36);
        this.field336 = System.nanoTime();
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IBI)I")
    public final int method77(int arg0, byte arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        int var6 = 0;
        if (arg1 < 45) {
            this.method77(-56, (byte) 47, 73);
        }
        long var7 = this.field336 - System.nanoTime();
        if (var7 < var4) {
            var7 = var4;
        }
        class28.method182(var7 / 1000000L, 123);
        long var9 = System.nanoTime();
        while (var6 < 10 && (var6 < 1 || var9 > this.field336)) {
            var6++;
            this.field336 += (long) arg2 * 1000000L;
        }
        if (var9 > this.field336) {
            this.field336 = var9;
        }
        return var6;
    }
}
