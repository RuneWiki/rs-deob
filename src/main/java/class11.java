import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class11 extends class53 {

    @OriginalMember(owner = "client!b", name = "o", descriptor = "J")
    private long field224 = System.nanoTime();

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public final void method85(int arg0) {
        if (arg0 == 14087) {
            this.field224 = System.nanoTime();
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(III)I")
    public final int method86(int arg0, int arg1, int arg2) {
        if (arg2 != 19845) {
            this.field224 = 34L;
        }
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field224 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }
        int var8 = 0;
        class76.method666(var6 / 1000000L, 1);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field224)) {
            this.field224 += (long) arg0 * 1000000L;
            var8++;
        }
        if (this.field224 < var9) {
            this.field224 = var9;
        }
        return var8;
    }
}
