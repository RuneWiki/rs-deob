import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class97 extends class20 {

    @OriginalMember(owner = "client!q", name = "h", descriptor = "J")
    private long field1561 = System.nanoTime();

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 4)
    public final void method138(byte arg0) {
        this.field1561 = System.nanoTime();
        if (arg0 != -82) {
            this.method141(125, -99, 100);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)I", line = 23)
    public final int method141(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field1561 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }
        class83.method556(var6 / 1000000L, 125);
        if (arg0 != -4) {
            this.method141(93, 75, -28);
        }
        long var8 = System.nanoTime();
        int var10 = 0;
        while (var10 < 10 && (var10 < 1 || var8 > this.field1561)) {
            var10++;
            this.field1561 += (long) arg1 * 1000000L;
        }
        if (var8 > this.field1561) {
            this.field1561 = var8;
        }
        return var10;
    }
}
