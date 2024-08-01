import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ud")
public class class188 extends class190 {

    @OriginalMember(owner = "ud", name = "h", descriptor = "J")
    private long field3617 = System.nanoTime();

    @OriginalMember(owner = "ud", name = "a", descriptor = "(IIB)I")
    public final int method872(int arg0, int arg1, byte arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field3617 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        int var8 = 0;
        class54.method354(var6 / 1000000L, -64);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field3617)) {
            var8++;
            this.field3617 += (long) arg0 * 1000000L;
        }
        if (var9 > this.field3617) {
            this.field3617 = var9;
        }
        if (arg2 != -58) {
            this.method874(-28);
        }
        return var8;
    }

    @OriginalMember(owner = "ud", name = "b", descriptor = "(I)V")
    public final void method874(int arg0) {
        this.field3617 = System.nanoTime();
        if (arg0 != 0) {
            this.method874(114);
        }
    }
}
