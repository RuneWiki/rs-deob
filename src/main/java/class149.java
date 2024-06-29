import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class149 extends class180 {

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "J")
    private long field3120 = System.nanoTime();

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public final void method1017(int arg0) {
        this.field3120 = System.nanoTime();
        if (arg0 > -114) {
            this.field3120 = 34L;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBI)I")
    public final int method1018(int arg0, byte arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        if (arg1 > -34) {
            this.method1018(-16, (byte) 26, -61);
        }
        long var6 = this.field3120 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class204.method1347(var6 / 1000000L, false);
        long var8 = System.nanoTime();
        int var10 = 0;
        while (var10 < 10 && (var10 < 1 || var8 > this.field3120)) {
            var10++;
            this.field3120 += (long) arg0 * 1000000L;
        }
        if (var8 > this.field3120) {
            this.field3120 = var8;
        }
        return var10;
    }
}
