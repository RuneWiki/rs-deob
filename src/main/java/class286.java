import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class286 extends class82 {

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
    private int field3728 = 585;

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "[I")
    public static int[] field3730 = new int[32];

    @OriginalMember(owner = "client!ng", name = "S", descriptor = "[I")
    public static int[] field3733;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "[Lha;")
    public static class52[] field3726;

    static {
        new class180("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field3733 = new int[4096];
    }

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "(I)V", line = 4)
    public static void method1608(int arg0) {
        field3726 = null;
        field3733 = null;
        if (arg0 != -4262) {
            method1608(-119);
        }
        field3730 = null;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V", line = 143)
    public class286() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(II)[I", line = 22)
    public final int[] method201(int arg0, int arg1) {
        ++field3727;
        if (arg1 != 12218) {
            this.method201(54, -56);
        }
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            int var4 = class85.field1036[arg0];
            for (int var5 = 0; class629.field9033 > var5; ++var5) {
                int var6 = class366.field4817[var5];
                if (~var6 < ~this.field3728 && var6 < -this.field3728 + 4096 && ~var4 < ~(-this.field3728 + 2048) && this.field3728 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field3728);
                    var3[var5] = 4096 - var10;
                } else if (-this.field3728 + 2048 < var6 && ~var6 > ~(2048 - -this.field3728)) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field3728;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field3728 + 2048);
                } else if (~var4 <= ~this.field3728 && ~var4 >= ~(-this.field3728 + 4096)) {
                    if (var6 >= this.field3728 && ~(-this.field3728 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field3728);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field3728;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field3728);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILos;)V", line = 104)
    public final void method198(int arg0, int arg1, class374 arg2) {
        int var4 = -78 / ((arg1 - -69) / 42);
        if (arg0 == 0) {
            this.field3728 = arg2.method2136(false);
        }
        ++field3732;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(II)I", line = 129)
    public static final int method1609(int arg0, int arg1) {
        if (arg0 != 127) {
            return -29;
        } else {
            ++field3731;
            return 127 & arg1;
        }
    }
}
