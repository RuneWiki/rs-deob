import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class86 extends class79 {

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "J")
    private long field2099 = System.nanoTime();

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)I")
    public final int method665(int arg0, int arg1, byte arg2) {
        long var4 = this.field2099 - System.nanoTime();
        long var6 = (long) arg1 * 1000000L;
        if (var4 < var6) {
            var4 = var6;
        }
        int var8 = 0;
        class139.method1042(-101, var4 / 1000000L);
        if (arg2 < 114) {
            return -17;
        }
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field2099 < var9)) {
            this.field2099 += (long) arg0 * 1000000L;
            var8++;
        }
        if (this.field2099 < var9) {
            this.field2099 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public final void method660(int arg0) {
        this.field2099 = System.nanoTime();
        if (arg0 != -6646) {
            this.field2099 = 99L;
        }
    }
}
