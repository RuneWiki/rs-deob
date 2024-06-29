import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class220 extends class202 {

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "J")
    private long field3979 = System.nanoTime();

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public final void method385(byte arg0) {
        if (arg0 == -115) {
            this.field3979 = System.nanoTime();
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)I")
    public final int method386(int arg0, int arg1, int arg2) {
        if (arg2 != -19769) {
            return -103;
        }
        long var4 = this.field3979 - System.nanoTime();
        long var6 = (long) arg0 * 1000000L;
        int var8 = 0;
        if (var4 < var6) {
            var4 = var6;
        }
        class165.method1167(-22942, var4 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field3979)) {
            var8++;
            this.field3979 += (long) arg1 * 1000000L;
        }
        if (this.field3979 < var9) {
            this.field3979 = var9;
        }
        return var8;
    }
}
