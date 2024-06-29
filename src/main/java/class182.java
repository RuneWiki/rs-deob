import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class182 extends class130 {

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "J")
    private long field3654 = System.nanoTime();

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBI)I")
    public final int method926(int arg0, byte arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        long var6 = this.field3654 - System.nanoTime();
        int var8 = 0;
        if (var6 < var4) {
            var6 = var4;
        }
        if (arg1 != 119) {
            return 53;
        }
        class132.method969(var6 / 1000000L, (byte) 58);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field3654)) {
            var8++;
            this.field3654 += (long) arg2 * 1000000L;
        }
        if (var9 > this.field3654) {
            this.field3654 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public final void method928(int arg0) {
        this.field3654 = System.nanoTime();
        if (arg0 != 5) {
            this.method926(-36, (byte) -65, -121);
        }
    }
}
