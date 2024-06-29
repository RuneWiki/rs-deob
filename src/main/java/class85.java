import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class85 extends class118 {

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "J")
    private long field1617 = System.nanoTime();

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V", line = 4)
    public final void method609(boolean arg0) {
        this.field1617 = System.nanoTime();
        if (arg0) {
            this.field1617 = 121L;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I", line = 15)
    public final int method610(int arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field1617 - System.nanoTime();
        int var8 = 0;
        if (var6 < var4) {
            var6 = var4;
        }
        class235.method1675((byte) -22, var6 / 1000000L);
        long var9 = System.nanoTime();
        if (arg2 <= 13) {
            return 18;
        }
        while (var8 < 10 && (var8 < 1 || this.field1617 < var9)) {
            this.field1617 += (long) arg0 * 1000000L;
            var8++;
        }
        if (var9 > this.field1617) {
            this.field1617 = var9;
        }
        return var8;
    }
}
