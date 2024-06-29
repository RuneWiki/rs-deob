import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class188 extends class26 {

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "J")
    private long field3020 = System.nanoTime();

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 5)
    public final void method243(byte arg0) {
        this.field3020 = System.nanoTime();
        int var2 = -109 / ((arg0 + 51) / 36);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)I", line = 24)
    public final int method244(int arg0, int arg1, int arg2) {
        if (arg0 != 15) {
            return 112;
        }
        int var4 = 0;
        long var5 = this.field3020 - System.nanoTime();
        long var7 = (long) arg1 * 1000000L;
        if (var5 < var7) {
            var5 = var7;
        }
        class272.method1918((byte) 22, var5 / 1000000L);
        long var9 = System.nanoTime();
        while (var4 < 10 && (var4 < 1 || this.field3020 < var9)) {
            this.field3020 += (long) arg2 * 1000000L;
            var4++;
        }
        if (var9 > this.field3020) {
            this.field3020 = var9;
        }
        return var4;
    }
}
