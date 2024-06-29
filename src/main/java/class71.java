import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class71 extends class39 {

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "J")
    private long field1273 = System.nanoTime();

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBI)I")
    public final int method85(int arg0, byte arg1, int arg2) {
        long var4 = this.field1273 - System.nanoTime();
        long var6 = (long) arg2 * 1000000L;
        if (var4 < var6) {
            var4 = var6;
        }
        int var8 = 0;
        class238.method1548((byte) -122, var4 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field1273 < var9)) {
            this.field1273 += (long) arg0 * 1000000L;
            var8++;
        }
        int var11 = -66 / ((arg1 + 49) / 45);
        if (this.field1273 < var9) {
            this.field1273 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public final void method86(int arg0) {
        this.field1273 = System.nanoTime();
        int var2 = -6 % ((arg0 + 80) / 35);
    }
}
