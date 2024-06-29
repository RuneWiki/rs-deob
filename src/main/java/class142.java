import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class142 extends class15 {

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "J")
    private long field3129 = System.nanoTime();

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public final void method173(boolean arg0) {
        this.field3129 = System.nanoTime();
        if (!arg0) {
            this.field3129 = 97L;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)I")
    public final int method175(int arg0, int arg1, int arg2) {
        long var4 = this.field3129 - System.nanoTime();
        int var6 = 0;
        if (arg1 >= -47) {
            this.field3129 = -113L;
        }
        long var7 = (long) arg2 * 1000000L;
        if (var4 < var7) {
            var4 = var7;
        }
        class99.method797(var4 / 1000000L, false);
        long var9 = System.nanoTime();
        while (var6 < 10 && (var6 < 1 || var9 > this.field3129)) {
            var6++;
            this.field3129 += (long) arg0 * 1000000L;
        }
        if (var9 > this.field3129) {
            this.field3129 = var9;
        }
        return var6;
    }
}
