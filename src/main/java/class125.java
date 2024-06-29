import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class125 extends class149 {

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "J")
    private long field3193;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I", line = 5)
    public final int method352(int arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field3193 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class61.method609(-112, var6 / 1000000L);
        long var8 = System.nanoTime();
        int var10 = 0;
        while (var10 < 10 && (var10 < 1 || var8 > this.field3193)) {
            var10++;
            this.field3193 += (long) arg0 * 1000000L;
        }
        if (var8 > this.field3193) {
            this.field3193 = var8;
        }
        if (arg2 != 512) {
            this.field3193 = 24L;
        }
        return var10;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 39)
    public final void method351(byte arg0) {
        int var2 = 92 / ((-arg0 - 17) / 54);
        this.method349(512);
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V", line = 45)
    public class125() {
        this.method349(512);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V", line = 54)
    public final void method349(int arg0) {
        this.field3193 = System.nanoTime();
        if (arg0 != 512) {
            this.method349(-15);
        }
    }
}
