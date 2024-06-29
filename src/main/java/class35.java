import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class35 extends class212 {

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "J")
    private long field685 = System.nanoTime();

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIZ)I")
    public final int method257(int arg0, int arg1, boolean arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field685 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class153.method1098((byte) 76, var6 / 1000000L);
        long var8 = System.nanoTime();
        int var10 = 0;
        if (!arg2) {
            this.method258(-31);
        }
        while (var10 < 10 && (var10 < 1 || this.field685 < var8)) {
            var10++;
            this.field685 += (long) arg0 * 1000000L;
        }
        if (var8 > this.field685) {
            this.field685 = var8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
    public final void method258(int arg0) {
        this.field685 = System.nanoTime();
        if (arg0 != 2047) {
            this.method257(-88, -40, true);
        }
    }
}
