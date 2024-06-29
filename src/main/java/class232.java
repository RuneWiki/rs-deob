import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class232 extends class208 {

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "J")
    private long field3849 = System.nanoTime();

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public final void method1462(int arg0) {
        this.field3849 = System.nanoTime();
        if (arg0 != -1) {
            this.method1463(true, 87, -15);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZII)I")
    public final int method1463(boolean arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field3849 - System.nanoTime();
        int var8 = 0;
        if (var6 < var4) {
            var6 = var4;
        }
        class115.method752((byte) -62, var6 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field3849)) {
            this.field3849 += (long) arg2 * 1000000L;
            var8++;
        }
        if (arg0) {
            return -102;
        } else {
            if (this.field3849 < var9) {
                this.field3849 = var9;
            }
            return var8;
        }
    }
}
