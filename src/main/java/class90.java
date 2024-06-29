import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class90 extends class122 {

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "J")
    private long field1545 = System.nanoTime();

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public final void method534(byte arg0) {
        if (arg0 <= 48) {
            this.method534((byte) 98);
        }
        this.field1545 = System.nanoTime();
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)I")
    public final int method535(int arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field1545 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class171.method1088(117, var6 / 1000000L);
        if (arg0 != 6724) {
            this.method534((byte) 118);
        }
        int var8 = 0;
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field1545)) {
            var8++;
            this.field1545 += (long) arg2 * 1000000L;
        }
        if (var9 > this.field1545) {
            this.field1545 = var9;
        }
        return var8;
    }
}
