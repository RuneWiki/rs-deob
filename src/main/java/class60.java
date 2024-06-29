import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class60 extends class6 {

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "J")
    private long field1029 = System.nanoTime();

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public final void method17(int arg0) {
        this.field1029 = System.nanoTime();
        int var2 = -69 % ((arg0 + 12) / 60);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)I")
    public final int method19(int arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field1029 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }
        class172.method1130(var6 / 1000000L, (byte) -79);
        int var8 = 0;
        long var9 = System.nanoTime();
        if (arg0 != -580924254) {
            this.field1029 = 32L;
        }
        while (var8 < 10 && (var8 < 1 || this.field1029 < var9)) {
            var8++;
            this.field1029 += (long) arg2 * 1000000L;
        }
        if (this.field1029 < var9) {
            this.field1029 = var9;
        }
        return var8;
    }
}
