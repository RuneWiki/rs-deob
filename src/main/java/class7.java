import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class7 extends class13 {

    @OriginalMember(owner = "client!b", name = "n", descriptor = "J")
    private long field105;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)I", line = 5)
    public final int method41(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        if (arg1 != 9104) {
            this.field105 = 115L;
        }
        long var6 = this.field105 - System.nanoTime();
        int var8 = 0;
        if (var6 < var4) {
            var6 = var4;
        }
        class113.method833(var6 / 1000000L, true);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field105)) {
            var8++;
            this.field105 += (long) arg2 * 1000000L;
        }
        if (var9 > this.field105) {
            this.field105 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 35)
    public class7() {
        this.method42(false);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V", line = 44)
    public final void method42(boolean arg0) {
        this.field105 = System.nanoTime();
        if (arg0) {
            this.method42(true);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V", line = 54)
    public final void method43(byte arg0) {
        this.method42(false);
        if (arg0 < 39) {
            this.method41(81, -3, 88);
        }
    }
}
