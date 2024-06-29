import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class156 extends class104 {

    @OriginalMember(owner = "client!id", name = "k", descriptor = "J")
    private long field2714 = System.nanoTime();

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)I")
    public final int method695(int arg0, int arg1, int arg2) {
        if (arg1 != 3867493) {
            this.field2714 = -62L;
        }
        long var4 = this.field2714 - System.nanoTime();
        int var6 = 0;
        long var7 = (long) arg2 * 1000000L;
        if (var7 > var4) {
            var4 = var7;
        }
        class38.method259(var4 / 1000000L, arg1 ^ 0x3B78F9);
        long var9 = System.nanoTime();
        while (var6 < 10 && (var6 < 1 || var9 > this.field2714)) {
            this.field2714 += (long) arg0 * 1000000L;
            var6++;
        }
        if (var9 > this.field2714) {
            this.field2714 = var9;
        }
        return var6;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public final void method693(byte arg0) {
        this.field2714 = System.nanoTime();
        int var2 = -14 / ((47 - arg0) / 33);
    }
}
