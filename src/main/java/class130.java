import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class130 extends class141 {

    @OriginalMember(owner = "client!te", name = "q", descriptor = "J")
    private long field3141;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public final void method815(int arg0) {
        this.field3141 = System.nanoTime();
        if (arg0 > -121) {
            this.field3141 = -119L;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BII)I")
    public final int method814(byte arg0, int arg1, int arg2) {
        if (arg0 != 80) {
            this.method817(false);
        }
        long var4 = this.field3141 - System.nanoTime();
        long var6 = (long) arg1 * 1000000L;
        if (var4 < var6) {
            var4 = var6;
        }
        class60.method611(var4 / 1000000L, true);
        long var8 = System.nanoTime();
        int var10 = 0;
        while (var10 < 10 && (var10 < 1 || var8 > this.field3141)) {
            var10++;
            this.field3141 += (long) arg2 * 1000000L;
        }
        if (this.field3141 < var8) {
            this.field3141 = var8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class130() {
        this.method815(-123);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
    public final void method817(boolean arg0) {
        this.method815(-125);
        if (arg0) {
            this.field3141 = 45L;
        }
    }
}
