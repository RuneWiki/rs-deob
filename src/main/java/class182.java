import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class182 extends class86 {

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "J")
    private long field3600 = System.nanoTime();

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)I")
    public final int method204(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        long var6 = this.field3600 - System.nanoTime();
        int var8 = 0;
        if (var6 < var4) {
            var6 = var4;
        }
        class21.method98(var6 / 1000000L, (byte) 38);
        int var9 = 0 % ((27 - arg1) / 52);
        long var10 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field3600 < var10)) {
            var8++;
            this.field3600 += (long) arg2 * 1000000L;
        }
        if (var10 > this.field3600) {
            this.field3600 = var10;
        }
        return var8;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public final void method205(byte arg0) {
        int var2 = -94 / ((70 - arg0) / 54);
        this.field3600 = System.nanoTime();
    }
}
