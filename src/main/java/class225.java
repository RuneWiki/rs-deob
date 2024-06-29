import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class225 extends class134 {

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "J")
    private long field4043 = System.nanoTime();

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public final void method979(byte arg0) {
        if (arg0 > -55) {
            this.field4043 = -118L;
        }
        this.field4043 = System.nanoTime();
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)I")
    public final int method978(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field4043 - System.nanoTime();
        if (arg1 != 4) {
            this.field4043 = -7L;
        }
        int var8 = 0;
        if (var6 < var4) {
            var6 = var4;
        }
        class53.method290(var6 / 1000000L, true);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field4043)) {
            this.field4043 += (long) arg0 * 1000000L;
            var8++;
        }
        if (var9 > this.field4043) {
            this.field4043 = var9;
        }
        return var8;
    }
}
