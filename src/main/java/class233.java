import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class233 extends class12 {

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "J")
    private long field4067 = System.nanoTime();

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)I")
    public final int method31(int arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field4067 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        int var8 = 0;
        int var9 = 0 / ((-arg0 - 9) / 35);
        class95.method632(true, var6 / 1000000L);
        long var10 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var10 > this.field4067)) {
            this.field4067 += (long) arg2 * 1000000L;
            var8++;
        }
        if (var10 > this.field4067) {
            this.field4067 = var10;
        }
        return var8;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public final void method32(byte arg0) {
        if (arg0 < 65) {
            this.field4067 = -87L;
        }
        this.field4067 = System.nanoTime();
    }
}
