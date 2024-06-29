import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class85 extends class54 {

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "J")
    private long field1967;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)I")
    public final int method444(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        long var6 = this.field1967 - System.nanoTime();
        int var8 = 0;
        if (arg1 != -16207) {
            return -8;
        }
        if (var6 < var4) {
            var6 = var4;
        }
        class82.method691(var6 / 1000000L, (byte) -107);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field1967)) {
            this.field1967 += (long) arg2 * 1000000L;
            var8++;
        }
        if (this.field1967 < var9) {
            this.field1967 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public final void method440(byte arg0) {
        if (arg0 <= -90) {
            this.method441(-127);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public final void method441(int arg0) {
        if (arg0 >= -79) {
            this.field1967 = 14L;
        }
        this.field1967 = System.nanoTime();
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class85() {
        this.method441(-116);
    }
}
