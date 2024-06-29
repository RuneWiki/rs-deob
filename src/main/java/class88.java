import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class88 extends class298 {

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
    private int field1097 = 585;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "[I")
    public static int[] field1092 = new int[25];

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "[I")
    public static int[] field1091 = new int[100];

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "[I")
    public static int[] field1096;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILvt;)V")
    public final void method10(int arg0, int arg1, class179 arg2) {
        ++field1094;
        if (~arg1 == -1) {
            this.field1097 = arg2.method916(21933);
        }
        if (arg0 >= -44) {
            this.method10(-8, 69, (class179) null);
        }
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(B)V")
    public static void method443(byte arg0) {
        field1092 = null;
        if (arg0 <= 103) {
            method443((byte) -71);
        }
        field1096 = null;
        field1091 = null;
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(III)Lqa;")
    public static final class263 method444(int arg0, int arg1, int arg2) {
        if (class293.field4356[arg0][arg1][arg2] == null) {
            boolean var3 = class293.field4356[0][arg1][arg2] != null && class293.field4356[0][arg1][arg2].field3788 != null;
            if (var3 && arg0 >= class346.field4937 - 1) {
                return null;
            }
            class31.method159(arg0, arg1, arg2);
        }
        return class293.field4356[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class88() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)[I")
    public final int[] method13(int arg0, boolean arg1) {
        ++field1095;
        if (!arg1) {
            field1091 = null;
        }
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (super.field4443.field6915) {
            int var4 = class156.field1865[arg0];
            for (int var5 = 0; ~var5 > ~class158.field1877; ++var5) {
                int var6 = class236.field3260[var5];
                if (this.field1097 < var6 && 4096 - this.field1097 > var6 && ~var4 < ~(-this.field1097 + 2048) && var4 < this.field1097 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field1097 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (var6 > -this.field1097 + 2048 && ~var6 > ~(this.field1097 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field1097;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field1097 + 2048);
                } else if (~var4 <= ~this.field1097 && ~(-this.field1097 + 4096) <= ~var4) {
                    if (var6 >= this.field1097 && var6 <= 4096 - this.field1097) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field1097);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field1097;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field1097 + 2048);
                }
            }
        }
        return var3;
    }
}
