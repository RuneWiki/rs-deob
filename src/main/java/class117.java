import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class117 extends class157 {

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "J")
    private long field2201 = System.nanoTime();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)I")
    public final int method162(int arg0, int arg1, int arg2) {
        long var4 = this.field2201 - System.nanoTime();
        long var6 = (long) arg2 * 1000000L;
        int var8 = arg0;
        if (var4 < var6) {
            var4 = var6;
        }
        class187.method1360((byte) 64, var4 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field2201)) {
            var8++;
            this.field2201 += (long) arg1 * 1000000L;
        }
        if (var9 > this.field2201) {
            this.field2201 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
    public final void method161(boolean arg0) {
        if (!arg0) {
            this.field2201 = 23L;
        }
        this.field2201 = System.nanoTime();
    }
}
