import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class3 extends class206 {

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "J")
    private long field40 = System.nanoTime();

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIB)I")
    public final int method12(int arg0, int arg1, byte arg2) {
        long var4 = (long) arg0 * 1000000L;
        long var6 = this.field40 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        int var8 = 0;
        class234.method1603(var6 / 1000000L, 103);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field40 < var9)) {
            this.field40 += (long) arg1 * 1000000L;
            var8++;
        }
        if (var9 > this.field40) {
            this.field40 = var9;
        }
        if (arg2 >= -79) {
            this.method12(25, 64, (byte) -112);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public final void method13(byte arg0) {
        this.field40 = System.nanoTime();
        int var2 = 115 % ((arg0 + 28) / 61);
    }
}
