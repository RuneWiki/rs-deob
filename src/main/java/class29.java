import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class29 extends class256 {

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "J")
    private long field441 = System.nanoTime();

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public final void method202(int arg0) {
        if (arg0 == 103) {
            this.field441 = System.nanoTime();
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BII)I")
    public final int method203(byte arg0, int arg1, int arg2) {
        long var4 = this.field441 - System.nanoTime();
        long var6 = (long) arg2 * 1000000L;
        if (var4 < var6) {
            var4 = var6;
        }
        class190.method1311(var4 / 1000000L, arg0 ^ 0xFFFFFFD6);
        if (arg0 != -41) {
            this.method203((byte) -1, 86, -83);
        }
        long var8 = System.nanoTime();
        int var10 = 0;
        while (var10 < 10 && (var10 < 1 || var8 > this.field441)) {
            var10++;
            this.field441 += (long) arg1 * 1000000L;
        }
        if (this.field441 < var8) {
            this.field441 = var8;
        }
        return var10;
    }
}
