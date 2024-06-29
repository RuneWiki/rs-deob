import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class62 extends class106 {

    @OriginalMember(owner = "client!j", name = "w", descriptor = "J")
    private long field1227 = System.nanoTime();

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BII)I")
    public final int method175(byte arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        int var6 = 82 / ((-arg0 - 27) / 52);
        long var7 = this.field1227 - System.nanoTime();
        if (var7 < var4) {
            var7 = var4;
        }
        int var9 = 0;
        class104.method822(35, var7 / 1000000L);
        long var10 = System.nanoTime();
        while (var9 < 10 && (var9 < 1 || var10 > this.field1227)) {
            var9++;
            this.field1227 += (long) arg1 * 1000000L;
        }
        if (var10 > this.field1227) {
            this.field1227 = var10;
        }
        return var9;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public final void method177(int arg0) {
        this.field1227 = System.nanoTime();
        if (arg0 != 2) {
            this.method177(104);
        }
    }
}
