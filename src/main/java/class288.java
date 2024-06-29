import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class288 extends class76 {

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "J")
    private long field4558 = System.nanoTime();

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public final void method516(int arg0) {
        if (arg0 != -29395) {
            this.field4558 = 106L;
        }
        this.field4558 = System.nanoTime();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIB)I")
    public final int method514(int arg0, int arg1, byte arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field4558 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class170.method1183(var6 / 1000000L, (byte) -109);
        long var8 = System.nanoTime();
        int var10;
        for (var10 = 0; var10 < 10 && (var10 < 1 || var8 > this.field4558); var10++) {
            this.field4558 += (long) arg0 * 1000000L;
        }
        if (arg2 >= -52) {
            this.field4558 = -40L;
        }
        if (this.field4558 < var8) {
            this.field4558 = var8;
        }
        return var10;
    }
}
