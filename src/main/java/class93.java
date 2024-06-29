import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class93 extends class103 {

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "J")
    private long field2217 = System.nanoTime();

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public final void method13(boolean arg0) {
        this.field2217 = System.nanoTime();
        if (arg0) {
            this.method12(2, 82, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIB)I")
    public final int method12(int arg0, int arg1, byte arg2) {
        int var4 = 0;
        long var5 = this.field2217 - System.nanoTime();
        long var7 = (long) arg1 * 1000000L;
        if (var7 > var5) {
            var5 = var7;
        }
        class6.method51(var5 / 1000000L, arg2 - 14356);
        long var9 = System.nanoTime();
        while (var4 < 10 && (var4 < 1 || var9 > this.field2217)) {
            this.field2217 += (long) arg0 * 1000000L;
            var4++;
        }
        if (arg2 != 12) {
            this.method12(-83, -91, (byte) -62);
        }
        if (var9 > this.field2217) {
            this.field2217 = var9;
        }
        return var4;
    }
}
