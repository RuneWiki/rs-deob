import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class112 extends class143 {

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "J")
    private long field1918 = System.nanoTime();

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)I")
    public final int method833(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        long var6 = this.field1918 - System.nanoTime();
        if (arg1 != -5999) {
            return 62;
        }
        if (var4 > var6) {
            var6 = var4;
        }
        class147.method1066(var6 / 1000000L, 0);
        long var8 = System.nanoTime();
        int var10 = 0;
        while (var10 < 10 && (var10 < 1 || this.field1918 < var8)) {
            var10++;
            this.field1918 += (long) arg2 * 1000000L;
        }
        if (var8 > this.field1918) {
            this.field1918 = var8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public final void method834(byte arg0) {
        int var2 = -38 % ((arg0 + 39) / 49);
        this.field1918 = System.nanoTime();
    }
}
