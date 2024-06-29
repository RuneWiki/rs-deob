import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class21 extends class123 {

    @OriginalMember(owner = "client!db", name = "n", descriptor = "J")
    private long field440;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public final void method61(int arg0) {
        if (arg0 <= 72) {
            this.field440 = -47L;
        }
        this.method140(0);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class21() {
        this.method140(0);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BII)I")
    public final int method63(byte arg0, int arg1, int arg2) {
        long var4 = this.field440 - System.nanoTime();
        if (arg0 < 12) {
            this.field440 = -103L;
        }
        long var6 = (long) arg2 * 1000000L;
        if (var4 < var6) {
            var4 = var6;
        }
        class108.method814((byte) 15, var4 / 1000000L);
        long var8 = System.nanoTime();
        int var10;
        for (var10 = 0; var10 < 10 && (var10 < 1 || var8 > this.field440); var10++) {
            this.field440 += (long) arg1 * 1000000L;
        }
        if (var8 > this.field440) {
            this.field440 = var8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    private final void method140(int arg0) {
        if (arg0 != 0) {
            this.method63((byte) 69, -125, -35);
        }
        this.field440 = System.nanoTime();
    }
}
