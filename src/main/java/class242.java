import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class242 extends class226 {

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "J")
    private long field4159 = System.nanoTime();

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public final void method1557(int arg0) {
        this.field4159 = System.nanoTime();
        if (arg0 <= 53) {
            this.method1561(78, 115, (byte) 85);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIB)I")
    public final int method1561(int arg0, int arg1, byte arg2) {
        long var4 = this.field4159 - System.nanoTime();
        long var6 = (long) arg0 * 1000000L;
        if (var4 < var6) {
            var4 = var6;
        }
        class52.method417((byte) -115, var4 / 1000000L);
        long var8 = System.nanoTime();
        int var10;
        for (var10 = 0; var10 < 10 && (var10 < 1 || var8 > this.field4159); var10++) {
            this.field4159 += (long) arg1 * 1000000L;
        }
        if (var8 > this.field4159) {
            this.field4159 = var8;
        }
        if (arg2 <= 119) {
            this.field4159 = 30L;
        }
        return var10;
    }
}
