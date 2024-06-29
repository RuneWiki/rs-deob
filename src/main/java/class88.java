import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class88 extends class262 {

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "J")
    private long field1476 = System.nanoTime();

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
    public final void method270(int arg0) {
        if (arg0 != 2) {
            this.method276(38, 7, 24);
        }
        this.field1476 = System.nanoTime();
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)I")
    public final int method276(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        int var6 = arg1;
        long var7 = this.field1476 - System.nanoTime();
        if (var4 > var7) {
            var7 = var4;
        }
        class250.method1640(var7 / 1000000L, -72);
        long var9 = System.nanoTime();
        while (var6 < 10 && (var6 < 1 || var9 > this.field1476)) {
            var6++;
            this.field1476 += (long) arg2 * 1000000L;
        }
        if (var9 > this.field1476) {
            this.field1476 = var9;
        }
        return var6;
    }
}
