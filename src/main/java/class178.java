import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class178 extends class249 {

    @OriginalMember(owner = "client!me", name = "j", descriptor = "J")
    private long field3030 = System.nanoTime();

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 12)
    public final void method736(byte arg0) {
        if (arg0 != 41) {
            this.field3030 = 35L;
        }
        this.field3030 = System.nanoTime();
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IBI)I", line = 23)
    public final int method740(int arg0, byte arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        if (arg1 < 86) {
            this.method736((byte) 120);
        }
        long var6 = this.field3030 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }
        class267.method1871(10, var6 / 1000000L);
        long var8 = System.nanoTime();
        int var10 = 0;
        while (var10 < 10 && (var10 < 1 || this.field3030 < var8)) {
            var10++;
            this.field3030 += (long) arg0 * 1000000L;
        }
        if (var8 > this.field3030) {
            this.field3030 = var8;
        }
        return var10;
    }
}
