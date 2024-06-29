import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class290 extends class64 {

    @OriginalMember(owner = "client!l", name = "m", descriptor = "J")
    private long field4948 = System.nanoTime();

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(III)I", line = 6)
    public final int method493(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        long var6 = this.field4948 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class281.method2041((byte) 126, var6 / 1000000L);
        int var8 = 0;
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field4948 < var9)) {
            this.field4948 += (long) arg2 * 1000000L;
            var8++;
        }
        if (arg1 > -72) {
            return 47;
        } else {
            if (var9 > this.field4948) {
                this.field4948 = var9;
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 45)
    public final void method490(int arg0) {
        this.field4948 = System.nanoTime();
        if (arg0 > -26) {
            this.field4948 = 124L;
        }
    }
}
