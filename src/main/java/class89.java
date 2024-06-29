import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class89 extends class103 {

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "J")
    private long field1806 = System.nanoTime();

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I")
    public final int method550(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field1806 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }
        class160.method1191(var6 / 1000000L, 0);
        long var8 = System.nanoTime();
        if (arg1 >= -126) {
            return -98;
        }
        int var10;
        for (var10 = 0; var10 < 10 && (var10 < 1 || this.field1806 < var8); var10++) {
            this.field1806 += (long) arg0 * 1000000L;
        }
        if (this.field1806 < var8) {
            this.field1806 = var8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public final void method552(int arg0) {
        this.field1806 = System.nanoTime();
        if (arg0 > -16) {
            this.method552(74);
        }
    }
}
