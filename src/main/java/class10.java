import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class10 extends class309 {

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "J")
    private long field96 = System.nanoTime();

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 4)
    public final void method40(int arg0) {
        this.field96 = System.nanoTime();
        if (arg0 != 0) {
            this.field96 = 3L;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIB)I", line = 18)
    public final int method41(int arg0, int arg1, byte arg2) {
        long var4 = this.field96 - System.nanoTime();
        int var6 = 0;
        long var7 = (long) arg0 * 1000000L;
        if (var7 > var4) {
            var4 = var7;
        }
        class99.method792(-1, var4 / 1000000L);
        long var9 = System.nanoTime();
        if (arg2 != -30) {
            return -28;
        }
        while (var6 < 10 && (var6 < 1 || var9 > this.field96)) {
            this.field96 += (long) arg1 * 1000000L;
            var6++;
        }
        if (var9 > this.field96) {
            this.field96 = var9;
        }
        return var6;
    }
}
