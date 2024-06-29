import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class90 extends class30 {

    @OriginalMember(owner = "client!n", name = "j", descriptor = "J")
    private long field2305;

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class90() {
        this.method247(39);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)I")
    public final int method248(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        int var6 = -74 % ((arg2 + 35) / 35);
        int var7 = 0;
        long var8 = this.field2305 - System.nanoTime();
        if (var4 > var8) {
            var8 = var4;
        }
        class112.method913(1, var8 / 1000000L);
        long var10 = System.nanoTime();
        while (var7 < 10 && (var7 < 1 || this.field2305 < var10)) {
            this.field2305 += (long) arg1 * 1000000L;
            var7++;
        }
        if (this.field2305 < var10) {
            this.field2305 = var10;
        }
        return var7;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public final void method246(int arg0) {
        if (arg0 != 8670) {
            this.field2305 = -74L;
        }
        this.method247(40);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public final void method247(int arg0) {
        if (arg0 > 38) {
            this.field2305 = System.nanoTime();
        }
    }
}
