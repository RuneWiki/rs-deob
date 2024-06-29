import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class217 extends class4 {

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "J")
    private long field3943 = System.nanoTime();

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BII)I")
    public final int method25(byte arg0, int arg1, int arg2) {
        long var4 = this.field3943 - System.nanoTime();
        long var6 = (long) arg2 * 1000000L;
        int var8 = 0;
        if (var4 < var6) {
            var4 = var6;
        }
        class82.method617((byte) 31, var4 / 1000000L);
        long var9 = System.nanoTime();
        if (arg0 != 53) {
            this.field3943 = -75L;
        }
        while (var8 < 10 && (var8 < 1 || var9 > this.field3943)) {
            var8++;
            this.field3943 += (long) arg1 * 1000000L;
        }
        if (this.field3943 < var9) {
            this.field3943 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public final void method28(int arg0) {
        this.field3943 = System.nanoTime();
        int var2 = -79 % ((arg0 - 2) / 39);
    }
}
