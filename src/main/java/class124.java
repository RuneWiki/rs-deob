import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class124 extends class9 {

    @OriginalMember(owner = "client!le", name = "t", descriptor = "J")
    private long field2315 = System.nanoTime();

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)I")
    public final int method41(int arg0, int arg1, int arg2) {
        long var4 = this.field2315 - System.nanoTime();
        if (arg1 != -1) {
            this.method39((byte) -28);
        }
        int var6 = 0;
        long var7 = (long) arg0 * 1000000L;
        if (var7 > var4) {
            var4 = var7;
        }
        class130.method856(1, var4 / 1000000L);
        long var9 = System.nanoTime();
        while (var6 < 10 && (var6 < 1 || this.field2315 < var9)) {
            var6++;
            this.field2315 += (long) arg2 * 1000000L;
        }
        if (var9 > this.field2315) {
            this.field2315 = var9;
        }
        return var6;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public final void method39(byte arg0) {
        if (arg0 == -18) {
            this.field2315 = System.nanoTime();
        }
    }
}
