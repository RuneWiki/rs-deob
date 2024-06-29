import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class11 extends class102 {

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "J")
    private long field222;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V", line = 4)
    public final void method60(boolean arg0) {
        this.method62(103);
        if (arg0) {
            this.field222 = -88L;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZII)I", line = 16)
    public final int method61(boolean arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field222 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class58.method498(var6 / 1000000L, 10);
        int var8 = 0;
        if (!arg0) {
            this.field222 = 81L;
        }
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field222)) {
            this.field222 += (long) arg2 * 1000000L;
            var8++;
        }
        if (this.field222 < var9) {
            this.field222 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 45)
    public class11() {
        this.method62(103);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 54)
    public final void method62(int arg0) {
        this.field222 = System.nanoTime();
        if (arg0 != 103) {
            this.field222 = -2L;
        }
    }
}
