import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class48 extends class63 {

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "J")
    private long field1280;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I")
    public final int method358(int arg0, int arg1, int arg2) {
        long var4 = this.field1280 - System.nanoTime();
        long var6 = (long) arg0 * 1000000L;
        if (var4 < var6) {
            var4 = var6;
        }
        int var8 = 0;
        if (arg1 != -1) {
            this.method354((byte) -113);
        }
        class72.method548(arg1 ^ 0x79, var4 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || this.field1280 < var9)) {
            this.field1280 += (long) arg2 * 1000000L;
            var8++;
        }
        if (var9 > this.field1280) {
            this.field1280 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)V")
    public final void method351(byte arg0) {
        this.method354((byte) 34);
        if (arg0 != 47) {
            this.method354((byte) -38);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public final void method354(byte arg0) {
        this.field1280 = System.nanoTime();
        if (arg0 != 34) {
            this.field1280 = -9L;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class48() {
        this.method354((byte) 34);
    }
}
