import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class56 extends class175 {

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "J")
    private long field1162 = System.nanoTime();

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZII)I")
    public final int method328(boolean arg0, int arg1, int arg2) {
        int var4 = 0;
        long var5 = (long) arg1 * 1000000L;
        long var7 = this.field1162 - System.nanoTime();
        if (var7 < var5) {
            var7 = var5;
        }
        class58.method357(-24534, var7 / 1000000L);
        long var9 = System.nanoTime();
        while (var4 < 10 && (var4 < 1 || var9 > this.field1162)) {
            var4++;
            this.field1162 += (long) arg2 * 1000000L;
        }
        if (this.field1162 < var9) {
            this.field1162 = var9;
        }
        if (!arg0) {
            this.field1162 = -97L;
        }
        return var4;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public final void method329(int arg0) {
        if (arg0 != 32) {
            this.method328(true, -102, 79);
        }
        this.field1162 = System.nanoTime();
    }
}
