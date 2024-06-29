import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class117 extends class59 {

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "J")
    private long field2886;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V", line = 6)
    public final void method90(byte arg0) {
        int var2 = -128 % ((arg0 + 7) / 49);
        this.method91(1);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 14)
    public final void method91(int arg0) {
        this.field2886 = System.nanoTime();
        if (arg0 != 1) {
            this.field2886 = -100L;
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V", line = 22)
    public class117() {
        this.method91(1);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZI)I", line = 32)
    public final int method92(int arg0, boolean arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        long var6 = this.field2886 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class121.method958(var6 / 1000000L, (byte) 123);
        long var8 = System.nanoTime();
        int var10;
        for (var10 = 0; var10 < 10 && (var10 < 1 || var8 > this.field2886); var10++) {
            this.field2886 += (long) arg2 * 1000000L;
        }
        if (arg1) {
            this.method90((byte) 6);
        }
        if (this.field2886 < var8) {
            this.field2886 = var8;
        }
        return var10;
    }
}
