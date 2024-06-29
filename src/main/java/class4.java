import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 extends class91 {

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "J")
    private long field67;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
    public final void method25(boolean arg0) {
        if (!arg0) {
            this.method27((byte) 89);
        }
        this.method27((byte) -31);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)I")
    public final int method26(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        long var6 = this.field67 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }
        if (arg2 < 55) {
            return 76;
        }
        class22.method149(65, var6 / 1000000L);
        int var8 = 0;
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field67 < var9)) {
            var8++;
            this.field67 += (long) arg1 * 1000000L;
        }
        if (this.field67 < var9) {
            this.field67 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class4() {
        this.method27((byte) -31);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
    public final void method27(byte arg0) {
        this.field67 = System.nanoTime();
        if (arg0 != -31) {
            this.field67 = 50L;
        }
    }
}
