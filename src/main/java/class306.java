import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class306 extends class209 {

    @OriginalMember(owner = "client!c", name = "j", descriptor = "J")
    private long field4783 = System.nanoTime();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 4)
    public final void method1142(byte arg0) {
        this.field4783 = System.nanoTime();
        if (arg0 != 61) {
            this.method1144(-85, -119, -30);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I", line = 24)
    public final int method1144(int arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field4783 - System.nanoTime();
        if (arg0 != -223016735) {
            this.method1142((byte) -113);
        }
        if (var4 > var6) {
            var6 = var4;
        }
        class97.method768(var6 / 1000000L, arg0 + 223016796);
        long var8 = System.nanoTime();
        int var10;
        for (var10 = 0; var10 < 10 && (var10 < 1 || var8 > this.field4783); var10++) {
            this.field4783 += (long) arg2 * 1000000L;
        }
        if (this.field4783 < var8) {
            this.field4783 = var8;
        }
        return var10;
    }
}
