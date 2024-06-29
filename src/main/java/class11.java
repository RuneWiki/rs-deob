import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class11 extends class96 {

    @OriginalMember(owner = "client!b", name = "j", descriptor = "J")
    private long field173 = System.nanoTime();

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)I")
    public final int method50(int arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field173 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class38.method209(var6 / 1000000L, -7296);
        int var8 = 0;
        long var9 = System.nanoTime();
        if (arg2 <= 5) {
            this.method51(-85);
        }
        while (var8 < 10 && (var8 < 1 || var9 > this.field173)) {
            var8++;
            this.field173 += (long) arg0 * 1000000L;
        }
        if (var9 > this.field173) {
            this.field173 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public final void method51(int arg0) {
        if (arg0 > 88) {
            this.field173 = System.nanoTime();
        }
    }
}
