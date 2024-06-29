import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class17 extends class122 {

    @OriginalMember(owner = "client!db", name = "p", descriptor = "J")
    private long field361 = System.nanoTime();

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIB)I")
    public final int method169(int arg0, int arg1, byte arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field361 - System.nanoTime();
        int var8 = 0;
        if (var6 < var4) {
            var6 = var4;
        }
        class174.method1196((byte) 109, var6 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field361 < var9)) {
            this.field361 += (long) arg0 * 1000000L;
            var8++;
        }
        if (this.field361 < var9) {
            this.field361 = var9;
        }
        int var11 = -4 / ((14 - arg2) / 47);
        return var8;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public final void method170(int arg0) {
        if (arg0 != -30820) {
            this.field361 = 42L;
        }
        this.field361 = System.nanoTime();
    }
}
