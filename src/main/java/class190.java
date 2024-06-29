import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class190 extends class252 {

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "J")
    private long field3313 = System.nanoTime();

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public final void method420(byte arg0) {
        if (arg0 == -91) {
            this.field3313 = System.nanoTime();
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)I")
    public final int method419(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        int var6 = 0;
        long var7 = this.field3313 - System.nanoTime();
        if (arg1 >= -73) {
            this.method420((byte) 44);
        }
        if (var7 < var4) {
            var7 = var4;
        }
        class226.method1543(var7 / 1000000L, -738);
        long var9 = System.nanoTime();
        while (var6 < 10 && (var6 < 1 || var9 > this.field3313)) {
            var6++;
            this.field3313 += (long) arg0 * 1000000L;
        }
        if (var9 > this.field3313) {
            this.field3313 = var9;
        }
        return var6;
    }
}
