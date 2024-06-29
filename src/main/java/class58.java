import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class58 extends class156 {

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "J")
    private long field974 = System.nanoTime();

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public final void method401(byte arg0) {
        if (arg0 < 41) {
            this.method401((byte) -6);
        }
        this.field974 = System.nanoTime();
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BII)I")
    public final int method402(byte arg0, int arg1, int arg2) {
        if (arg0 != 85) {
            this.field974 = 0L;
        }
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field974 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }
        class43.method358(var6 / 1000000L, false);
        long var8 = System.nanoTime();
        int var10 = 0;
        while (var10 < 10 && (var10 < 1 || this.field974 < var8)) {
            var10++;
            this.field974 += (long) arg1 * 1000000L;
        }
        if (this.field974 < var8) {
            this.field974 = var8;
        }
        return var10;
    }
}
