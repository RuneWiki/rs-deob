import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class41 extends class131 {

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "J")
    private long field919;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public final void method22(byte arg0) {
        this.method23(true);
        if (arg0 != -21) {
            this.method23(false);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        this.field919 = System.nanoTime();
        if (!arg0) {
            this.method30(88, false, -99);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZI)I")
    public final int method30(int arg0, boolean arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        long var6 = this.field919 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class28.method219(arg1, var6 / 1000000L);
        int var8 = 0;
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field919)) {
            this.field919 += (long) arg2 * 1000000L;
            var8++;
        }
        if (var9 > this.field919) {
            this.field919 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class41() {
        this.method23(true);
    }
}
