import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class298 extends class137 {

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "J")
    private long field5102 = System.nanoTime();

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 4)
    public final void method435(int arg0) {
        if (arg0 != -14047) {
            this.method432((byte) 121, 20, 26);
        }
        this.field5102 = System.nanoTime();
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII)I", line = 15)
    public final int method432(byte arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        if (arg0 != -125) {
            return -121;
        }
        int var6 = 0;
        long var7 = this.field5102 - System.nanoTime();
        if (var4 > var7) {
            var7 = var4;
        }
        class237.method1628((byte) -88, var7 / 1000000L);
        long var9 = System.nanoTime();
        while (var6 < 10 && (var6 < 1 || this.field5102 < var9)) {
            var6++;
            this.field5102 += (long) arg2 * 1000000L;
        }
        if (var9 > this.field5102) {
            this.field5102 = var9;
        }
        return var6;
    }
}
