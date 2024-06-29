import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class115 extends class67 {

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "J")
    private long field1678 = System.nanoTime();

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)I", line = 5)
    public final int method489(int arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        if (arg2 > -12) {
            this.field1678 = -59L;
        }
        long var6 = this.field1678 - System.nanoTime();
        int var8 = 0;
        if (var6 < var4) {
            var6 = var4;
        }
        class300.method2068(125, var6 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field1678 < var9)) {
            this.field1678 += (long) arg0 * 1000000L;
            var8++;
        }
        if (var9 > this.field1678) {
            this.field1678 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V", line = 45)
    public final void method490(boolean arg0) {
        this.field1678 = System.nanoTime();
        if (!arg0) {
            this.method490(true);
        }
    }
}
