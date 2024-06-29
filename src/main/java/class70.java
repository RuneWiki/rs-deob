import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class70 extends class235 {

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "J")
    private long field1112 = System.nanoTime();

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public final void method480(int arg0) {
        if (arg0 == -8543) {
            this.field1112 = System.nanoTime();
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBI)I")
    public final int method481(int arg0, byte arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field1112 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class144.method1008(123, var6 / 1000000L);
        long var8 = System.nanoTime();
        int var10;
        for (var10 = 0; var10 < 10 && (var10 < 1 || var8 > this.field1112); var10++) {
            this.field1112 += (long) arg0 * 1000000L;
        }
        if (var8 > this.field1112) {
            this.field1112 = var8;
        }
        if (arg1 != 9) {
            this.field1112 = 113L;
        }
        return var10;
    }
}
