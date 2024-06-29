import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class110 extends class79 {

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "J")
    private long field2749;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 4)
    public final void method573(int arg0) {
        this.method574(-10115);
        int var2 = 20 % ((arg0 + 76) / 48);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 13)
    public final void method574(int arg0) {
        if (arg0 == -10115) {
            this.field2749 = System.nanoTime();
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)I", line = 24)
    public final int method576(int arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field2749 - System.nanoTime();
        if (arg2 != 9799) {
            this.method573(32);
        }
        if (var6 < var4) {
            var6 = var4;
        }
        class86.method756(var6 / 1000000L, -86);
        long var8 = System.nanoTime();
        int var10;
        for (var10 = 0; var10 < 10 && (var10 < 1 || this.field2749 < var8); var10++) {
            this.field2749 += (long) arg0 * 1000000L;
        }
        if (this.field2749 < var8) {
            this.field2749 = var8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V", line = 54)
    public class110() {
        this.method574(-10115);
    }
}
