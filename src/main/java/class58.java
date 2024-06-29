import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class58 extends class131 {

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "J")
    private long field1281 = System.nanoTime();

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public final void method346(int arg0) {
        this.field1281 = System.nanoTime();
        if (arg0 != -724) {
            this.method340(8, 78, false);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZ)I")
    public final int method340(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field1281 = -122L;
        }
        long var4 = this.field1281 - System.nanoTime();
        long var6 = (long) arg0 * 1000000L;
        if (var4 < var6) {
            var4 = var6;
        }
        class9.method42(0, var4 / 1000000L);
        long var8 = System.nanoTime();
        int var10;
        for (var10 = 0; var10 < 10 && (var10 < 1 || this.field1281 < var8); var10++) {
            this.field1281 += (long) arg1 * 1000000L;
        }
        if (this.field1281 < var8) {
            this.field1281 = var8;
        }
        return var10;
    }
}
