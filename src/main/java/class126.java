import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class126 extends class274 {

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "J")
    private long field2178 = System.nanoTime();

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBI)I", line = 6)
    public final int method835(int arg0, byte arg1, int arg2) {
        int var4 = 65 % ((arg1 + 28) / 49);
        long var5 = this.field2178 - System.nanoTime();
        long var7 = (long) arg0 * 1000000L;
        int var9 = 0;
        if (var5 < var7) {
            var5 = var7;
        }
        class127.method843(-52, var5 / 1000000L);
        long var10 = System.nanoTime();
        while (var9 < 10 && (var9 < 1 || var10 > this.field2178)) {
            var9++;
            this.field2178 += (long) arg2 * 1000000L;
        }
        if (this.field2178 < var10) {
            this.field2178 = var10;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V", line = 37)
    public final void method836(byte arg0) {
        this.field2178 = System.nanoTime();
        if (arg0 > -81) {
            this.field2178 = -25L;
        }
    }
}
