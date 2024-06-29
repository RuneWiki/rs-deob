import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class406 extends class615 {

    @OriginalMember(owner = "client!rp", name = "M", descriptor = "I")
    private int field5473 = 0;

    @OriginalMember(owner = "client!rp", name = "N", descriptor = "I")
    private int field5474 = 20;

    @OriginalMember(owner = "client!rp", name = "L", descriptor = "I")
    private int field5472 = 0;

    @OriginalMember(owner = "client!rp", name = "F", descriptor = "I")
    private int field5466 = 1365;

    @OriginalMember(owner = "client!rp", name = "J", descriptor = "[B")
    public static byte[] field5470 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!rp", name = "G", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!rp", name = "H", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!rp", name = "K", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!rp", name = "I", descriptor = "Lbi;")
    public static class449 field5469;

    @OriginalMember(owner = "client!rp", name = "O", descriptor = "[I")
    public static int[] field5475;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IB)[I")
    public final int[] method8(int arg0, byte arg1) {
        ++field5468;
        int[] var3 = super.field8125.method298(arg0, 80);
        if (arg1 != -18) {
            this.method8(-123, (byte) -111);
        }
        if (super.field8125.field579) {
            for (int var4 = 0; var4 < class505.field6740; ++var4) {
                int var5 = (class168.field2599[var4] << 12) / this.field5466 + this.field5472;
                int var6 = (class402.field5353[arg0] << 12) / this.field5466 + this.field5473;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && ~this.field5474 < ~var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var7 + var11;
                    var12 = var10 * var10 >> 12;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = var13 < this.field5474 - 1 ? (var13 << 12) / this.field5474 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "(I)V")
    public static void method2334(int arg0) {
        if (arg0 == -16385) {
            field5475 = null;
            field5470 = null;
            field5469 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
    public class406() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BILeh;)V")
    public final void method15(byte arg0, int arg1, class335 arg2) {
        ++field5467;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.field5473 = arg2.method2001((byte) -83);
                    }
                } else {
                    this.field5472 = arg2.method2001((byte) -83);
                }
            } else {
                this.field5474 = arg2.method2001((byte) -83);
            }
        } else {
            this.field5466 = arg2.method2001((byte) -83);
        }
        if (arg0 <= 44) {
            field5469 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIII)V")
    public static final void method2335(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -32648) {
            method2335(-127, 1, -51, -120, -1);
        }
        ++field5471;
        class382 var5 = class396.method2276(86, 10, arg0);
        var5.method2232(120);
        var5.field5106 = arg3;
        var5.field5099 = arg4;
        var5.field5104 = arg1;
    }
}
