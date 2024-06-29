import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class33 extends class65 {

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "J")
    private long field486 = System.nanoTime();

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public final void method193(byte arg0) {
        this.field486 = System.nanoTime();
        int var2 = -67 / ((arg0 + 79) / 44);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BII)I")
    public final int method194(byte arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field486 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }
        if (arg0 < 57) {
            return -35;
        }
        class151.method1074(-107, var6 / 1000000L);
        long var8 = System.nanoTime();
        int var10 = 0;
        while (var10 < 10 && (var10 < 1 || var8 > this.field486)) {
            var10++;
            this.field486 += (long) arg2 * 1000000L;
        }
        if (this.field486 < var8) {
            this.field486 = var8;
        }
        return var10;
    }
}
