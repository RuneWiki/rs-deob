import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class152 extends class214 {

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "J")
    private long field2503 = System.nanoTime();

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)I", line = 6)
    public final int method936(byte arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field2503 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        if (arg0 != 34) {
            this.method936((byte) 101, -85, 52);
        }
        int var8 = 0;
        class2.method11((byte) -20, var6 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field2503 < var9)) {
            var8++;
            this.field2503 += (long) arg1 * 1000000L;
        }
        if (this.field2503 < var9) {
            this.field2503 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 44)
    public final void method937(byte arg0) {
        this.field2503 = System.nanoTime();
        if (arg0 >= -45) {
            this.field2503 = 32L;
        }
    }
}
