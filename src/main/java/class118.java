import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class118 extends class237 {

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "J")
    private long field2162 = System.nanoTime();

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 4)
    public final void method839(int arg0) {
        this.field2162 = System.nanoTime();
        if (arg0 != -11677) {
            this.method837(-124, -67, 108);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)I", line = 15)
    public final int method837(int arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field2162 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        int var8 = 0;
        class177.method1342(var6 / 1000000L, arg0 - 22301);
        long var9 = System.nanoTime();
        if (arg0 != 22302) {
            this.method839(-66);
        }
        while (var8 < 10 && (var8 < 1 || this.field2162 < var9)) {
            var8++;
            this.field2162 += (long) arg2 * 1000000L;
        }
        if (this.field2162 < var9) {
            this.field2162 = var9;
        }
        return var8;
    }
}
