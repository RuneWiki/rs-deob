import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class145 extends class28 {

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "J")
    private long field3299 = System.nanoTime();

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZII)I")
    public final int method143(boolean arg0, int arg1, int arg2) {
        long var4 = this.field3299 - System.nanoTime();
        if (!arg0) {
            this.field3299 = 63L;
        }
        int var6 = 0;
        long var7 = (long) arg1 * 1000000L;
        if (var4 < var7) {
            var4 = var7;
        }
        class50.method360(var4 / 1000000L, 10);
        long var9 = System.nanoTime();
        while (var6 < 10 && (var6 < 1 || this.field3299 < var9)) {
            var6++;
            this.field3299 += (long) arg2 * 1000000L;
        }
        if (this.field3299 < var9) {
            this.field3299 = var9;
        }
        return var6;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public final void method145(int arg0) {
        this.field3299 = System.nanoTime();
        if (arg0 != -1) {
            this.method145(-84);
        }
    }
}
