import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class10 extends class128 {

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "J")
    private long field195;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V", line = 6)
    public final void method71(int arg0) {
        int var2 = 71 % ((-arg0 - 15) / 50);
        this.method72(0);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V", line = 12)
    public class10() {
        this.method72(0);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V", line = 21)
    public final void method72(int arg0) {
        if (arg0 == 0) {
            this.field195 = System.nanoTime();
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)I", line = 32)
    public final int method73(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        long var6 = this.field195 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class47.method447((byte) -64, var6 / 1000000L);
        long var8 = System.nanoTime();
        int var10 = arg1;
        while (var10 < 10 && (var10 < 1 || var8 > this.field195)) {
            var10++;
            this.field195 += (long) arg2 * 1000000L;
        }
        if (this.field195 < var8) {
            this.field195 = var8;
        }
        return var10;
    }
}
