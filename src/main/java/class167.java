import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class167 extends class28 {

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "J")
    private long field2425 = System.nanoTime();

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)I")
    public final int method207(int arg0, int arg1, int arg2) {
        long var4 = this.field2425 - System.nanoTime();
        long var6 = (long) arg1 * 1000000L;
        if (var4 < var6) {
            var4 = var6;
        }
        class98.method660(var4 / 1000000L, -75);
        long var8 = System.nanoTime();
        int var10;
        for (var10 = arg2; var10 < 10 && (var10 < 1 || var8 > this.field2425); var10++) {
            this.field2425 += (long) arg0 * 1000000L;
        }
        if (this.field2425 < var8) {
            this.field2425 = var8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public final void method208(byte arg0) {
        this.field2425 = System.nanoTime();
        if (arg0 < 110) {
            this.method208((byte) -113);
        }
    }
}
