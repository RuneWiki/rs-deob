import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class170 extends class235 {

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "J")
    private long field3143 = System.nanoTime();

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public final void method154(byte arg0) {
        this.field3143 = System.nanoTime();
        if (arg0 != -105) {
            this.method154((byte) -108);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)I")
    public final int method152(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field3143 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        if (arg0 != 2) {
            this.method154((byte) 57);
        }
        int var8 = 0;
        class212.method1488(var6 / 1000000L, -52);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field3143)) {
            var8++;
            this.field3143 += (long) arg1 * 1000000L;
        }
        if (this.field3143 < var9) {
            this.field3143 = var9;
        }
        return var8;
    }
}
