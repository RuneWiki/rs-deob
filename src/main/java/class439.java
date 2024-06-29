import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class439 extends class751 {

    @OriginalMember(owner = "client!mba", name = "F", descriptor = "I")
    private int field6288 = 0;

    @OriginalMember(owner = "client!mba", name = "H", descriptor = "I")
    private int field6289 = 1;

    @OriginalMember(owner = "client!mba", name = "E", descriptor = "I")
    private int field6287 = 0;

    @OriginalMember(owner = "client!mba", name = "C", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!mba", name = "D", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!mba", name = "I", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!mba", name = "B", descriptor = "Lcb;")
    public static class544 field6284;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V")
    public final void method1454(byte arg0) {
        class55.method355((byte) -83);
        ++field6285;
        if (arg0 < 123) {
            this.field6289 = -75;
        }
    }

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "(I)V")
    public static void method2659(int arg0) {
        field6284 = null;
        if (arg0 != 4096) {
            method2659(85);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)[I")
    public final int[] method365(int arg0, int arg1) {
        ++field6286;
        if (arg1 != 4095) {
            return null;
        } else {
            int[] var3 = super.field10405.method3601(true, arg0);
            if (super.field10405.field8923) {
                int var4 = class619.field8728[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; ~var6 > ~class673.field9452; ++var6) {
                    int var7 = class179.field2708[var6];
                    int var8 = var7 - 2048 >> 1;
                    int var9;
                    if (~this.field6287 == -1) {
                        var9 = (var7 - var4) * this.field6289;
                    } else {
                        int var10 = var5 * var5 + var8 * var8 >> 12;
                        int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                        var9 = (int) ((double) (this.field6289 * var11) * 3.141592653589793D);
                    }
                    int var12 = var9 - (-4096 & var9);
                    if (~this.field6288 != -1) {
                        if (~this.field6288 == -3) {
                            var12 -= 2048;
                            if (var12 < 0) {
                                var12 = -var12;
                            }
                            var12 = -var12 + 2048 << 1;
                        }
                    } else {
                        var12 = class792.field10865[(4089 & var12) >> 4] + 4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILrv;I)V")
    public final void method309(int arg0, class120 arg1, int arg2) {
        int var4 = -4 % ((25 - arg0) / 63);
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field6289 = arg1.method842(2384);
                }
            } else {
                this.field6288 = arg1.method842(2384);
            }
        } else {
            this.field6287 = arg1.method842(2384);
        }
        ++field6290;
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "()V")
    public class439() {
        super(0, true);
    }
}
