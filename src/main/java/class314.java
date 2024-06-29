import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class314 extends class99 {

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "J")
    private long field5397 = System.nanoTime();

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBI)I", line = 6)
    public final int method715(int arg0, byte arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        long var6 = this.field5397 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class46.method381(var6 / 1000000L, -89);
        int var8 = 0;
        long var9 = System.nanoTime();
        if (arg1 <= 22) {
            return -6;
        }
        while (var8 < 10 && (var8 < 1 || this.field5397 < var9)) {
            this.field5397 += (long) arg2 * 1000000L;
            var8++;
        }
        if (var9 > this.field5397) {
            this.field5397 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 45)
    public final void method709(int arg0) {
        if (arg0 != 2) {
            this.field5397 = -2L;
        }
        this.field5397 = System.nanoTime();
    }
}
