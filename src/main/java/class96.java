import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class96 extends class14 {

    @OriginalMember(owner = "client!q", name = "q", descriptor = "J")
    private long field2449;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 5)
    public final void method57(int arg0) {
        this.method54(true);
        if (arg0 != 0) {
            this.method56(-14, 112, -92);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)I", line = 19)
    public final int method56(int arg0, int arg1, int arg2) {
        int var4 = 0;
        long var5 = this.field2449 - System.nanoTime();
        long var7 = (long) arg2 * 1000000L;
        if (var5 < var7) {
            var5 = var7;
        }
        class30.method282((byte) -65, var5 / 1000000L);
        long var9 = System.nanoTime();
        while (var4 < 10 && (var4 < 1 || this.field2449 < var9)) {
            var4++;
            this.field2449 += (long) arg1 * 1000000L;
        }
        if (arg0 != 4) {
            this.method54(false);
        }
        if (this.field2449 < var9) {
            this.field2449 = var9;
        }
        return var4;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V", line = 47)
    public final void method54(boolean arg0) {
        if (!arg0) {
            this.field2449 = 63L;
        }
        this.field2449 = System.nanoTime();
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V", line = 55)
    public class96() {
        this.method54(true);
    }
}
