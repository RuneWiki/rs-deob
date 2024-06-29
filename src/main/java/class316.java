import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class316 extends class289 {

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "J")
    private long field5362 = System.nanoTime();

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 5)
    public final void method277(int arg0) {
        if (arg0 == 100) {
            this.field5362 = System.nanoTime();
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)I", line = 23)
    public final int method275(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        int var6 = 88 / ((15 - arg2) / 58);
        int var7 = 0;
        long var8 = this.field5362 - System.nanoTime();
        if (var4 > var8) {
            var8 = var4;
        }
        class160.method1227(var8 / 1000000L, false);
        long var10 = System.nanoTime();
        while (var7 < 10 && (var7 < 1 || this.field5362 < var10)) {
            var7++;
            this.field5362 += (long) arg1 * 1000000L;
        }
        if (var10 > this.field5362) {
            this.field5362 = var10;
        }
        return var7;
    }
}
