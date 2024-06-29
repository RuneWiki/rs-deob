import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class224 extends class137 {

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "J")
    private long field3425 = System.nanoTime();

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V")
    public final void method352(boolean arg0) {
        this.field3425 = System.nanoTime();
        if (!arg0) {
            this.field3425 = -105L;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)I")
    public final int method353(int arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field3425 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }
        int var8 = 0;
        class150.method1011((byte) 41, var6 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field3425)) {
            this.field3425 += (long) arg2 * 1000000L;
            var8++;
        }
        if (this.field3425 < var9) {
            this.field3425 = var9;
        }
        if (arg0 != 2) {
            this.field3425 = -87L;
        }
        return var8;
    }
}
