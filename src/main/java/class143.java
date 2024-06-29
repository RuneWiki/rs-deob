import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class143 extends class141 {

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "J")
    private long field3234 = System.nanoTime();

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
    public final void method148(byte arg0) {
        if (arg0 != -10) {
            this.field3234 = -105L;
        }
        this.field3234 = System.nanoTime();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)I")
    public final int method146(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.method148((byte) 40);
        }
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field3234 - System.nanoTime();
        int var8 = 0;
        if (var6 < var4) {
            var6 = var4;
        }
        class128.method1007((byte) 93, var6 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field3234 < var9)) {
            this.field3234 += (long) arg0 * 1000000L;
            var8++;
        }
        if (this.field3234 < var9) {
            this.field3234 = var9;
        }
        return var8;
    }
}
