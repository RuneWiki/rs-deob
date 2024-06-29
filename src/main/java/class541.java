import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class541 extends class747 {

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    private int field7517 = -1;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "Lbaa;")
    public static class130 field7521 = new class130(64);

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    public int field7516;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public int field7518;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "[I")
    public int[] field7513;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ldc;II)V")
    public final void method183(class63 arg0, int arg1, int arg2) {
        ++field7519;
        if (arg1 != 11608) {
            this.method3203(true);
        }
        if (arg2 == 0) {
            this.field7517 = arg0.method482(arg1 ^ -772603248);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public final void method727(byte arg0) {
        super.method727(arg0);
        ++field7512;
        this.field7513 = null;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(B)Z")
    public final boolean method3200(byte arg0) {
        ++field7515;
        if (arg0 < 22) {
            return true;
        } else if (this.field7513 != null) {
            return true;
        } else if (~this.field7517 <= -1) {
            class52 var2 = ~class196.field2635 <= -1 ? class52.method374(class211.field2791, class196.field2635, this.field7517) : class52.method382(class211.field2791, this.field7517);
            var2.method377();
            this.field7513 = var2.method379();
            this.field7516 = var2.field767;
            this.field7518 = var2.field766;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(Z)V")
    public static void method3201(boolean arg0) {
        if (arg0) {
            field7521 = null;
        }
        field7521 = null;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)[[I")
    public int[][] method688(int arg0, int arg1) {
        ++field7514;
        int[][] var3 = super.field10289.method2200(0, arg1);
        int var4 = 85 % ((35 - arg0) / 58);
        if (super.field10289.field4906 && this.method3200((byte) 89)) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int var8 = (~class414.field5865 != ~this.field7518 ? this.field7518 * arg1 / class414.field5865 : arg1) * this.field7516;
            if (class73.field1095 == this.field7516) {
                for (int var9 = 0; var9 < class73.field1095; ++var9) {
                    int var10 = this.field7513[var8++];
                    var7[var9] = class665.method3759(255, var10) << 4;
                    var6[var9] = class665.method3759(var10 >> 4, 4080);
                    var5[var9] = class665.method3759(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; class73.field1095 > var11; ++var11) {
                    int var12 = this.field7516 * var11 / class73.field1095;
                    int var13 = this.field7513[var8 + var12];
                    var7[var11] = class665.method3759(var13, 255) << 4;
                    var6[var11] = class665.method3759(65280, var13) >> 4;
                    var5[var11] = class665.method3759(var13 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class541() {
        super(0, false);
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(Z)V")
    public static final void method3202(boolean arg0) {
        if (arg0) {
            method3202(true);
        }
        if (class363.field5183 != null) {
            for (int var1 = 0; var1 < class414.field5864; ++var1) {
                class363.field5183[var1] = null;
            }
            class363.field5183 = null;
        }
        ++field7520;
        if (class625.field8414 != null) {
            for (int var2 = 0; ~class726.field10070 < ~var2; ++var2) {
                class625.field8414[var2] = null;
            }
            class625.field8414 = null;
        }
        if (class166.field2285 != null) {
            for (int var3 = 0; var3 < class312.field4339; ++var3) {
                class166.field2285[var3] = null;
            }
            class166.field2285 = null;
        }
        class316.field4387 = null;
        class87.field1241 = null;
        class466.field6481 = -1;
        class702.field9783 = -1;
        class77.field1127 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)I")
    public final int method3203(boolean arg0) {
        ++field7522;
        if (arg0) {
            this.field7513 = null;
        }
        return this.field7517;
    }
}
