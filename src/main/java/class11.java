import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class11 extends class106 {

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "J")
    private long field347;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZII)I", line = 7)
    public final int method82(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method83((byte) -80);
        }
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field347 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }
        int var8 = 0;
        class37.method375(-1, var6 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field347 < var9)) {
            var8++;
            this.field347 += (long) arg1 * 1000000L;
        }
        if (this.field347 < var9) {
            this.field347 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 35)
    public class11() {
        this.method83((byte) -90);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 45)
    public final void method83(byte arg0) {
        int var2 = -94 / ((23 - arg0) / 39);
        this.field347 = System.nanoTime();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 53)
    public final void method84(int arg0) {
        this.method83((byte) 108);
        if (arg0 != -1450) {
            this.method83((byte) -14);
        }
    }
}
