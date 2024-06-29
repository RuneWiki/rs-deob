import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class72 extends class221 {

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "J")
    private long field1402 = System.nanoTime();

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public final void method415(byte arg0) {
        if (arg0 == 105) {
            this.field1402 = System.nanoTime();
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)I")
    public final int method417(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        long var6 = this.field1402 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class84.method645(arg1 ^ 0xFFFFD8EB, var6 / 1000000L);
        long var8 = System.nanoTime();
        int var10;
        for (var10 = 0; var10 < 10 && (var10 < 1 || var8 > this.field1402); var10++) {
            this.field1402 += (long) arg2 * 1000000L;
        }
        if (arg1 != -10006) {
            this.field1402 = -119L;
        }
        if (var8 > this.field1402) {
            this.field1402 = var8;
        }
        return var10;
    }
}
