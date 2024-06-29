import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class86 extends class1 {

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "J")
    private long field2057 = System.nanoTime();

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)I")
    public final int method4(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        int var6 = 0;
        if (arg2 != -7604) {
            return -102;
        }
        long var7 = this.field2057 - System.nanoTime();
        if (var4 > var7) {
            var7 = var4;
        }
        class196.method1281((byte) -8, var7 / 1000000L);
        long var9 = System.nanoTime();
        while (var6 < 10 && (var6 < 1 || var9 > this.field2057)) {
            this.field2057 += (long) arg1 * 1000000L;
            var6++;
        }
        if (var9 > this.field2057) {
            this.field2057 = var9;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public final void method1(byte arg0) {
        if (arg0 != -13) {
            this.method1((byte) -105);
        }
        this.field2057 = System.nanoTime();
    }
}
