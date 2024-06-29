import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class246 extends class171 {

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "J")
    private long field4324 = System.nanoTime();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIB)I")
    public final int method47(int arg0, int arg1, byte arg2) {
        long var4 = (long) arg0 * 1000000L;
        if (arg2 != -103) {
            this.field4324 = 5L;
        }
        long var6 = this.field4324 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        int var8 = 0;
        class215.method1457(var6 / 1000000L, (byte) 117);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field4324 < var9)) {
            this.field4324 += (long) arg1 * 1000000L;
            var8++;
        }
        if (var9 > this.field4324) {
            this.field4324 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public final void method45(byte arg0) {
        if (arg0 != -111) {
            this.method45((byte) -35);
        }
        this.field4324 = System.nanoTime();
    }
}
