import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class58 extends class170 {

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "J")
    private long field939 = System.nanoTime();

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BII)I")
    public final int method307(byte arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field939 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class39.method212(-116, var6 / 1000000L);
        int var8 = 0;
        if (arg0 != -44) {
            this.field939 = 108L;
        }
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field939)) {
            this.field939 += (long) arg2 * 1000000L;
            var8++;
        }
        if (this.field939 < var9) {
            this.field939 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public final void method308(int arg0) {
        this.field939 = System.nanoTime();
        if (arg0 != 0) {
            this.field939 = 77L;
        }
    }
}
