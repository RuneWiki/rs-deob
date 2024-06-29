import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class76 extends class50 {

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "J")
    private long field1409 = System.nanoTime();

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V", line = 4)
    public final void method343(byte arg0) {
        if (arg0 <= -29) {
            this.field1409 = System.nanoTime();
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)I", line = 16)
    public final int method338(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field1409 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }
        if (arg1 != -3) {
            this.method343((byte) -72);
        }
        int var8 = 0;
        class177.method1213(0, var6 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field1409 < var9)) {
            var8++;
            this.field1409 += (long) arg0 * 1000000L;
        }
        if (var9 > this.field1409) {
            this.field1409 = var9;
        }
        return var8;
    }
}
