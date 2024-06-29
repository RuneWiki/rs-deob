import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class37 extends class59 {

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "J")
    private long field916;

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V", line = 3)
    public class37() {
        this.method233(0);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I", line = 13)
    public final int method231(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        int var6 = -18 / ((16 - arg0) / 52);
        long var7 = this.field916 - System.nanoTime();
        if (var4 > var7) {
            var7 = var4;
        }
        int var9 = 0;
        class51.method400((byte) 35, var7 / 1000000L);
        long var10 = System.nanoTime();
        while (var9 < 10 && (var9 < 1 || this.field916 < var10)) {
            this.field916 += (long) arg1 * 1000000L;
            var9++;
        }
        if (var10 > this.field916) {
            this.field916 = var10;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V", line = 44)
    public final void method232(boolean arg0) {
        if (arg0) {
            this.field916 = 63L;
        }
        this.method233(0);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 54)
    public final void method233(int arg0) {
        if (arg0 == 0) {
            this.field916 = System.nanoTime();
        }
    }
}
