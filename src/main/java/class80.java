import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class80 extends class112 {

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "J")
    private long field1440 = System.nanoTime();

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
    public final void method451(byte arg0) {
        if (arg0 != -59) {
            this.field1440 = 89L;
        }
        this.field1440 = System.nanoTime();
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BII)I")
    public final int method452(byte arg0, int arg1, int arg2) {
        long var4 = this.field1440 - System.nanoTime();
        int var6 = 0;
        long var7 = (long) arg2 * 1000000L;
        if (var4 < var7) {
            var4 = var7;
        }
        class151.method926((byte) 101, var4 / 1000000L);
        long var9 = System.nanoTime();
        while (var6 < 10 && (var6 < 1 || this.field1440 < var9)) {
            this.field1440 += (long) arg1 * 1000000L;
            var6++;
        }
        if (this.field1440 < var9) {
            this.field1440 = var9;
        }
        if (arg0 != 38) {
            this.method452((byte) -36, -40, -61);
        }
        return var6;
    }
}
