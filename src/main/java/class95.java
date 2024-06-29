import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class95 extends class38 {

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "J")
    private long field1763 = System.nanoTime();

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public final void method283(byte arg0) {
        this.field1763 = System.nanoTime();
        if (arg0 != 13) {
            this.field1763 = 43L;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZII)I")
    public final int method286(boolean arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field1763 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class151.method996(12121, var6 / 1000000L);
        int var8 = 0;
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field1763 < var9)) {
            this.field1763 += (long) arg1 * 1000000L;
            var8++;
        }
        if (var9 > this.field1763) {
            this.field1763 = var9;
        }
        if (!arg0) {
            this.field1763 = 34L;
        }
        return var8;
    }
}
