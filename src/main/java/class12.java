import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class12 extends class162 {

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "J")
    private long field198 = System.nanoTime();

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)I", line = 6)
    public final int method109(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field198 - System.nanoTime();
        int var8 = 0;
        if (var6 < var4) {
            var6 = var4;
        }
        if (arg0 != -22102) {
            this.method110(-7);
        }
        class232.method1493(var6 / 1000000L, (byte) -51);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field198 < var9)) {
            var8++;
            this.field198 += (long) arg1 * 1000000L;
        }
        if (this.field198 < var9) {
            this.field198 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 43)
    public final void method110(int arg0) {
        if (arg0 > -52) {
            this.field198 = -58L;
        }
        this.field198 = System.nanoTime();
    }
}
