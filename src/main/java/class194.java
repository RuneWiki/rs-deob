import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class194 extends class77 {

    @OriginalMember(owner = "client!te", name = "i", descriptor = "J")
    private long field3724 = System.nanoTime();

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public final void method415(byte arg0) {
        if (arg0 == 112) {
            this.field3724 = System.nanoTime();
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)I")
    public final int method413(int arg0, int arg1, int arg2) {
        long var4 = this.field3724 - System.nanoTime();
        int var6 = 0;
        long var7 = (long) arg1 * 1000000L;
        if (var7 > var4) {
            var4 = var7;
        }
        if (arg0 > -93) {
            this.field3724 = 118L;
        }
        class93.method638(var4 / 1000000L, (byte) -8);
        long var9 = System.nanoTime();
        while (var6 < 10 && (var6 < 1 || this.field3724 < var9)) {
            this.field3724 += (long) arg2 * 1000000L;
            var6++;
        }
        if (var9 > this.field3724) {
            this.field3724 = var9;
        }
        return var6;
    }
}
