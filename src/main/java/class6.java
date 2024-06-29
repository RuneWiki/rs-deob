import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class31 {

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "J")
    private long field97;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public final void method28(boolean arg0) {
        this.method29(9165);
        if (arg0) {
            this.field97 = -113L;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    private final void method29(int arg0) {
        this.field97 = System.nanoTime();
        if (arg0 != 9165) {
            this.method30(-54, 110, 0);
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class6() {
        this.method29(9165);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)I")
    public final int method30(int arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field97 - System.nanoTime();
        int var8 = 40 % ((arg2 - 52) / 49);
        int var9 = 0;
        if (var4 > var6) {
            var6 = var4;
        }
        class31.method247(var6 / 1000000L, (byte) 123);
        long var10 = System.nanoTime();
        while (var9 < 10 && (var9 < 1 || var10 > this.field97)) {
            var9++;
            this.field97 += (long) arg0 * 1000000L;
        }
        if (this.field97 < var10) {
            this.field97 = var10;
        }
        return var9;
    }
}
