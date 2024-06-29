import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class94 extends class93 {

    @OriginalMember(owner = "client!q", name = "t", descriptor = "J")
    private long field2049;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V", line = 4)
    public final void method187(boolean arg0) {
        this.method186(7971);
        if (arg0) {
            this.method183((byte) -99, 127, 45);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BII)I", line = 17)
    public final int method183(byte arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field2049 - System.nanoTime();
        int var8 = 0;
        if (var4 > var6) {
            var6 = var4;
        }
        class113.method873(true, var6 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field2049 < var9)) {
            this.field2049 += (long) arg1 * 1000000L;
            var8++;
        }
        if (this.field2049 < var9) {
            this.field2049 = var9;
        }
        if (arg0 <= 59) {
            this.field2049 = 107L;
        }
        return var8;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V", line = 44)
    public class94() {
        this.method186(7971);
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V", line = 53)
    public final void method186(int arg0) {
        if (arg0 != 7971) {
            this.field2049 = 125L;
        }
        this.field2049 = System.nanoTime();
    }
}
