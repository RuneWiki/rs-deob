import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class51 extends class152 {

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "J")
    private long field1177 = System.nanoTime();

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)I")
    public final int method13(int arg0, int arg1, int arg2) {
        if (arg0 != 128) {
            return 19;
        }
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field1177 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class127.method981((byte) -86, var6 / 1000000L);
        int var8 = 0;
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field1177 < var9)) {
            this.field1177 += (long) arg1 * 1000000L;
            var8++;
        }
        if (this.field1177 < var9) {
            this.field1177 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        int var2 = -14 / ((-arg0 - 36) / 47);
        this.field1177 = System.nanoTime();
    }
}
