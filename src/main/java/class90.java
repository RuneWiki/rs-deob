import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class90 extends class3 {

    @OriginalMember(owner = "client!na", name = "z", descriptor = "J")
    private long field2213;

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class90() {
        this.method18(-15127);
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
    public final void method17(int arg0) {
        if (arg0 != 14) {
            this.field2213 = 83L;
        }
        this.method18(arg0 ^ 0xFFFFC4E7);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)I")
    public final int method19(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field2213 - System.nanoTime();
        if (arg1 != 9) {
            return 92;
        }
        int var8 = 0;
        if (var6 < var4) {
            var6 = var4;
        }
        class57.method509(-128, var6 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field2213 < var9)) {
            this.field2213 += (long) arg0 * 1000000L;
            var8++;
        }
        if (var9 > this.field2213) {
            this.field2213 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
    public final void method18(int arg0) {
        this.field2213 = System.nanoTime();
        if (arg0 != -15127) {
            this.field2213 = 58L;
        }
    }
}
