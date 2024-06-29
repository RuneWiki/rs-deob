import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class593 extends class243 {

    @OriginalMember(owner = "client!nu", name = "N", descriptor = "I")
    private int field8267 = 0;

    @OriginalMember(owner = "client!nu", name = "O", descriptor = "I")
    private int field8268 = 10;

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
    private int field8257 = 2048;

    @OriginalMember(owner = "client!nu", name = "K", descriptor = "I")
    public static int field8264 = 0;

    @OriginalMember(owner = "client!nu", name = "F", descriptor = "I")
    public static int field8259;

    @OriginalMember(owner = "client!nu", name = "G", descriptor = "I")
    public static int field8260;

    @OriginalMember(owner = "client!nu", name = "H", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!nu", name = "J", descriptor = "I")
    public static int field8263;

    @OriginalMember(owner = "client!nu", name = "L", descriptor = "I")
    public static int field8265;

    @OriginalMember(owner = "client!nu", name = "P", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!nu", name = "M", descriptor = "Lui;")
    public static class231 field8266;

    @OriginalMember(owner = "client!nu", name = "E", descriptor = "[I")
    private int[] field8258;

    @OriginalMember(owner = "client!nu", name = "I", descriptor = "[I")
    private int[] field8262;

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
    public class593() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(B)V")
    public final void method85(byte arg0) {
        this.method3288((byte) -6);
        ++field8260;
        if (arg0 != 66) {
            field8266 = null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILji;B)V")
    public final void method1(int arg0, class611 arg1, byte arg2) {
        ++field8263;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field8267 = arg1.method3428((byte) -126);
                }
            } else {
                this.field8257 = arg1.method3402((byte) 127);
            }
        } else {
            this.field8268 = arg1.method3428((byte) 4);
        }
        if (arg2 >= -92) {
            this.method85((byte) 102);
        }
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)V")
    public static void method3287(int arg0) {
        field8266 = null;
        if (arg0 != 4096) {
            method3287(45);
        }
    }

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "(B)V")
    private final void method3288(byte arg0) {
        ++field8265;
        this.field8258 = new int[this.field8268 + 1];
        this.field8262 = new int[this.field8268 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field8268;
        int var4 = this.field8257 * var3 >> 12;
        int var5 = 0;
        if (arg0 != -6) {
            this.field8257 = -68;
        }
        while (var5 < this.field8268) {
            this.field8262[var5] = var2;
            this.field8258[var5] = var2 + var4;
            var2 += var3;
            ++var5;
        }
        this.field8262[this.field8268] = 4096;
        this.field8258[this.field8268] = this.field8258[0] + 4096;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)[I")
    public final int[] method5(int arg0, int arg1) {
        ++field8259;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (super.field3164.field9250) {
            int var4 = class685.field9613[arg1];
            if (~this.field8267 == -1) {
                short var5 = 0;
                for (int var6 = 0; this.field8268 > var6; ++var6) {
                    if (~var4 <= ~this.field8262[var6] && ~this.field8262[var6 + 1] < ~var4) {
                        if (~this.field8258[var6] < ~var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class373.method2196(var3, 0, class687.field9628, var5);
            } else {
                for (int var7 = 0; var7 < class687.field9628; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class666.field9279[var7];
                    int var11 = this.field8267;
                    if (var11 != 1) {
                        if (~var11 != -3) {
                            if (~var11 == -4) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var10 + -4096 + var4 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~this.field8268 < ~var12; ++var12) {
                        if (~this.field8262[var12] >= ~var8 && ~this.field8262[var12 - -1] < ~var8) {
                            if (~this.field8258[var12] < ~var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        if (arg0 != 255) {
            field8264 = -81;
        }
        return var3;
    }
}
