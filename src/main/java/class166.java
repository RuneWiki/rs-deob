import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class166 extends class115 {

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "J")
    private long field3097 = System.nanoTime();

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BII)I")
    public final int method23(byte arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field3097 - System.nanoTime();
        int var8 = 111 / ((57 - arg0) / 41);
        int var9 = 0;
        if (var6 < var4) {
            var6 = var4;
        }
        class91.method677(0, var6 / 1000000L);
        long var10 = System.nanoTime();
        while (var9 < 10 && (var9 < 1 || var10 > this.field3097)) {
            var9++;
            this.field3097 += (long) arg1 * 1000000L;
        }
        if (var10 > this.field3097) {
            this.field3097 = var10;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public final void method18(int arg0) {
        this.field3097 = System.nanoTime();
        if (arg0 != -1006) {
            this.field3097 = -36L;
        }
    }
}
