import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class100 extends class143 {

    @OriginalMember(owner = "client!la", name = "o", descriptor = "J")
    private long field1864 = System.nanoTime();

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)I")
    public final int method270(int arg0, int arg1, int arg2) {
        if (arg2 < 92) {
            return -111;
        }
        long var4 = this.field1864 - System.nanoTime();
        long var6 = (long) arg1 * 1000000L;
        if (var6 > var4) {
            var4 = var6;
        }
        client.method203(var4 / 1000000L, (byte) -63);
        int var8 = 0;
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field1864 < var9)) {
            var8++;
            this.field1864 += (long) arg0 * 1000000L;
        }
        if (var9 > this.field1864) {
            this.field1864 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public final void method265(int arg0) {
        if (arg0 >= -126) {
            this.method265(5);
        }
        this.field1864 = System.nanoTime();
    }
}
