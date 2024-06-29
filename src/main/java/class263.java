import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class263 extends class302 {

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "J")
    private long field4489 = System.nanoTime();

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIB)I", line = 7)
    public final int method1729(int arg0, int arg1, byte arg2) {
        long var4 = this.field4489 - System.nanoTime();
        long var6 = (long) arg0 * 1000000L;
        if (var6 > var4) {
            var4 = var6;
        }
        class116.method759(-1, var4 / 1000000L);
        long var8 = System.nanoTime();
        int var10;
        for (var10 = 0; var10 < 10 && (var10 < 1 || this.field4489 < var8); var10++) {
            this.field4489 += (long) arg1 * 1000000L;
        }
        if (var8 > this.field4489) {
            this.field4489 = var8;
        }
        int var11 = -32 / ((arg2 + 28) / 37);
        return var10;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V", line = 36)
    public final void method1728(byte arg0) {
        if (arg0 != 24) {
            this.method1729(-118, -4, (byte) -7);
        }
        this.field4489 = System.nanoTime();
    }
}
