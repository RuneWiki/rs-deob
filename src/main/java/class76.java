import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class76 extends class163 {

    @OriginalMember(owner = "client!id", name = "l", descriptor = "J")
    private long field1716 = System.nanoTime();

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)I")
    public final int method535(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        if (arg1 != 1000) {
            this.field1716 = -124L;
        }
        long var6 = this.field1716 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        int var8 = 0;
        class53.method409(var6 / 1000000L, -25391);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field1716 < var9)) {
            this.field1716 += (long) arg0 * 1000000L;
            var8++;
        }
        if (var9 > this.field1716) {
            this.field1716 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public final void method536(byte arg0) {
        if (arg0 != 61) {
            this.method536((byte) -41);
        }
        this.field1716 = System.nanoTime();
    }
}
