import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class120 extends class89 {

    @OriginalMember(owner = "client!td", name = "z", descriptor = "J")
    private long field2846;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 4)
    public final void method436(int arg0) {
        this.method435((byte) -113);
        if (arg0 != 0) {
            this.field2846 = 67L;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V", line = 14)
    public final void method435(byte arg0) {
        this.field2846 = System.nanoTime();
        if (arg0 >= -20) {
            this.method435((byte) 9);
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V", line = 23)
    public class120() {
        this.method435((byte) -82);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I", line = 34)
    public final int method432(int arg0, int arg1, int arg2) {
        long var4 = this.field2846 - System.nanoTime();
        long var6 = (long) arg1 * 1000000L;
        if (arg0 != 4) {
            this.field2846 = 56L;
        }
        int var8 = 0;
        if (var6 > var4) {
            var4 = var6;
        }
        class82.method696(arg0 - 1, var4 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field2846 < var9)) {
            this.field2846 += (long) arg2 * 1000000L;
            var8++;
        }
        if (var9 > this.field2846) {
            this.field2846 = var9;
        }
        return var8;
    }
}
