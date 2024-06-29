import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class41 extends class234 {

    @OriginalMember(owner = "client!vf", name = "bb", descriptor = "I")
    public static int field612 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!vf", name = "ab", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!vf", name = "cb", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!vf", name = "db", descriptor = "Lah;")
    public static class126 field614;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)[[I", line = 5)
    public final int[][] method249(int arg0, byte arg1) {
        field613++;
        if (arg1 != 51) {
            method333((byte) -75);
        }
        int[][] var3 = this.field5232.method1101(arg0, true);
        if (this.field5232.field2446 && this.method1647(false)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = arg0 % this.field3743 * this.field3743;
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class105.field1630; var8++) {
                int var9 = this.field3742[var8 % this.field3741 + var6];
                var7[var8] = class270.method1860(var9 << 4, 4080);
                var5[var8] = class270.method1860(var9 >> 4, 4080);
                var4[var8] = class270.method1860(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIII)I", line = 56)
    public static final int method332(int arg0, int arg1, int arg2, int arg3) {
        field611++;
        if (arg0 == arg1) {
            return arg0;
        }
        if (arg3 <= 41) {
            field612 = 50;
        }
        int var4 = 128 - arg2;
        int var5 = (arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00;
        int var6 = (arg0 >>> 7 & 0x1FE01FE) * var4 + (arg1 >>> 7 & 0x1FE01FE) * arg2 & 0xFF00FF00;
        return var6 + (var5 >> 7);
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)V", line = 78)
    public static void method333(byte arg0) {
        if (arg0 <= 51) {
            method332(-52, -87, -30, -116);
        }
        field614 = null;
    }
}
