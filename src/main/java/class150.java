import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class150 extends class13 {

    @OriginalMember(owner = "client!w", name = "u", descriptor = "J")
    private long field3523;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    public final void method136(int arg0) {
        if (arg0 != 25593) {
            this.method133(92, (byte) 52, -86);
        }
        this.method131((byte) 57);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public final void method131(byte arg0) {
        this.field3523 = System.nanoTime();
        if (arg0 != 57) {
            this.method133(-69, (byte) 20, -62);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IBI)I")
    public final int method133(int arg0, byte arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        if (arg1 >= -112) {
            return -48;
        }
        long var6 = this.field3523 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        int var8 = 0;
        class79.method673(2, var6 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field3523)) {
            var8++;
            this.field3523 += (long) arg0 * 1000000L;
        }
        if (var9 > this.field3523) {
            this.field3523 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    public class150() {
        this.method131((byte) 57);
    }
}
