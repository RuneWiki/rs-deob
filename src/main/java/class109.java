import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class109 extends class152 {

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "J")
    private long field1808 = System.nanoTime();

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)I", line = 6)
    public final int method804(int arg0, int arg1, int arg2) {
        if (arg2 != -31130) {
            this.field1808 = -108L;
        }
        long var4 = this.field1808 - System.nanoTime();
        long var6 = (long) arg1 * 1000000L;
        int var8 = 0;
        if (var6 > var4) {
            var4 = var6;
        }
        class183.method1360(false, var4 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field1808)) {
            var8++;
            this.field1808 += (long) arg0 * 1000000L;
        }
        if (var9 > this.field1808) {
            this.field1808 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 36)
    public final void method805(int arg0) {
        this.field1808 = System.nanoTime();
        if (arg0 != -6838) {
            this.field1808 = -14L;
        }
    }
}
