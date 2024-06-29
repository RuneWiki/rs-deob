import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class11 extends class57 {

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "J")
    private long field225;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V", line = 4)
    public final void method78(int arg0) {
        if (arg0 >= -68) {
            this.field225 = -20L;
        }
        this.method80(64);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BII)I", line = 16)
    public final int method79(byte arg0, int arg1, int arg2) {
        long var4 = this.field225 - System.nanoTime();
        int var6 = -70 / ((arg0 + 40) / 59);
        long var7 = (long) arg1 * 1000000L;
        int var9 = 0;
        if (var4 < var7) {
            var4 = var7;
        }
        class13.method86(var4 / 1000000L, 1);
        long var10 = System.nanoTime();
        while (var9 < 10 && (var9 < 1 || this.field225 < var10)) {
            var9++;
            this.field225 += (long) arg2 * 1000000L;
        }
        if (this.field225 < var10) {
            this.field225 = var10;
        }
        return var9;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V", line = 45)
    public final void method80(int arg0) {
        this.field225 = System.nanoTime();
        if (arg0 != 64) {
            this.field225 = 69L;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 54)
    public class11() {
        this.method80(64);
    }
}
