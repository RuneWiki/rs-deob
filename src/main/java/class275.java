import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class275 extends class198 {

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "J")
    private long field4210 = System.nanoTime();

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 12)
    public final void method1360(int arg0) {
        this.field4210 = System.nanoTime();
        if (arg0 != -1) {
            this.field4210 = -62L;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)I", line = 23)
    public final int method1359(int arg0, int arg1, int arg2) {
        if (arg0 != -23781) {
            this.method1359(27, -30, -30);
        }
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field4210 - System.nanoTime();
        int var8 = 0;
        if (var6 < var4) {
            var6 = var4;
        }
        class93.method662(arg0 ^ 0x5ECC, var6 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field4210 < var9)) {
            this.field4210 += (long) arg2 * 1000000L;
            var8++;
        }
        if (var9 > this.field4210) {
            this.field4210 = var9;
        }
        return var8;
    }
}
