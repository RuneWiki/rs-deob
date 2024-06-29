import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class671 extends class694 {

    @OriginalMember(owner = "client!ww", name = "G", descriptor = "I")
    private int field9448 = 1365;

    @OriginalMember(owner = "client!ww", name = "F", descriptor = "I")
    private int field9447 = 0;

    @OriginalMember(owner = "client!ww", name = "L", descriptor = "I")
    private int field9453 = 20;

    @OriginalMember(owner = "client!ww", name = "M", descriptor = "I")
    private int field9454 = 0;

    @OriginalMember(owner = "client!ww", name = "H", descriptor = "I")
    public static int field9449;

    @OriginalMember(owner = "client!ww", name = "I", descriptor = "I")
    public static int field9450;

    @OriginalMember(owner = "client!ww", name = "J", descriptor = "I")
    public static int field9451;

    @OriginalMember(owner = "client!ww", name = "K", descriptor = "I")
    public static int field9452;

    @OriginalMember(owner = "client!ww", name = "N", descriptor = "I")
    public static int field9455;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field9450;
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (super.field9751.field6674) {
            for (int var4 = 0; var4 < class465.field6544; ++var4) {
                int var5 = (class346.field4994[var4] << 12) / this.field9448 + this.field9454;
                int var6 = (class105.field1409[arg1] << 12) / this.field9448 + this.field9447;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && ~var13 > ~this.field9453) {
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = var7 + var11 + -var12;
                    var12 = var10 * var10 >> 12;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = var13 < this.field9453 - 1 ? (var13 << 12) / this.field9453 : 0;
            }
        }
        if (arg0 < 112) {
            this.field9454 = -46;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IB)V")
    public static final void method3711(int arg0, byte arg1) {
        ++field9451;
        if (class474.method2690(arg0, -256197904)) {
            class140[] var2 = class676.field9545[arg0];
            if (arg1 <= -48) {
                for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                    class140 var4 = var2[var3];
                    if (var4 != null) {
                        var4.field1955 = 0;
                        var4.field2110 = 0;
                        var4.field2001 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        int var4 = 121 % ((arg2 - 58) / 63);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field9447 = arg1.method743((byte) -13);
                    }
                } else {
                    this.field9454 = arg1.method743((byte) -18);
                }
            } else {
                this.field9453 = arg1.method743((byte) -71);
            }
        } else {
            this.field9448 = arg1.method743((byte) -16);
        }
        ++field9449;
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "()V")
    public class671() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)V")
    public static final void method3712(byte arg0) {
        class279.method1692();
        if (arg0 < -21) {
            ++field9452;
        }
    }
}
