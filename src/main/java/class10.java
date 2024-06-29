import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class10 extends class183 {

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "J")
    private long field121 = System.nanoTime();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V", line = 4)
    public final void method36(byte arg0) {
        if (arg0 < 87) {
            this.method37(false, 63, 33);
        }
        this.field121 = System.nanoTime();
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZII)I", line = 26)
    public final int method37(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.field121 = 21L;
        }
        int var4 = 0;
        long var5 = (long) arg2 * 1000000L;
        long var7 = this.field121 - System.nanoTime();
        if (var5 > var7) {
            var7 = var5;
        }
        class300.method2054(10, var7 / 1000000L);
        long var9 = System.nanoTime();
        while (var4 < 10 && (var4 < 1 || this.field121 < var9)) {
            var4++;
            this.field121 += (long) arg1 * 1000000L;
        }
        if (this.field121 < var9) {
            this.field121 = var9;
        }
        return var4;
    }
}
