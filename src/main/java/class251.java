import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class251 extends class104 {

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "J")
    private long field4404 = System.nanoTime();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I")
    public final int method841(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field4404 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }
        int var8 = 0;
        class107.method866(arg1 ^ arg1, var6 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field4404 < var9)) {
            var8++;
            this.field4404 += (long) arg0 * 1000000L;
        }
        if (var9 > this.field4404) {
            this.field4404 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public final void method842(int arg0) {
        if (arg0 > -106) {
            this.method842(33);
        }
        this.field4404 = System.nanoTime();
    }
}
