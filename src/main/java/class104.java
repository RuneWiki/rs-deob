import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class104 extends class130 {

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "J")
    private long field1975 = System.nanoTime();

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)I")
    public final int method573(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field1975 - System.nanoTime();
        int var8 = 0;
        if (var4 > var6) {
            var6 = var4;
        }
        class137.method873(var6 / 1000000L, -967787128);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field1975)) {
            this.field1975 += (long) arg1 * 1000000L;
            var8++;
        }
        if (var9 > this.field1975) {
            this.field1975 = var9;
        }
        int var11 = -47 % ((arg0 - 65) / 34);
        return var8;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public final void method572(int arg0) {
        if (arg0 != 1) {
            this.field1975 = 45L;
        }
        this.field1975 = System.nanoTime();
    }
}
