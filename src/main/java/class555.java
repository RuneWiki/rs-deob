import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class555 extends class642 {

    @OriginalMember(owner = "client!qw", name = "C", descriptor = "I")
    private int field8144 = 12288;

    @OriginalMember(owner = "client!qw", name = "E", descriptor = "I")
    private int field8146 = 2048;

    @OriginalMember(owner = "client!qw", name = "K", descriptor = "I")
    private int field8152 = 0;

    @OriginalMember(owner = "client!qw", name = "G", descriptor = "I")
    private int field8148 = 4096;

    @OriginalMember(owner = "client!qw", name = "I", descriptor = "I")
    private int field8150 = 8192;

    @OriginalMember(owner = "client!qw", name = "N", descriptor = "I")
    private int field8155 = 2048;

    @OriginalMember(owner = "client!qw", name = "J", descriptor = "I")
    private int field8151 = 0;

    @OriginalMember(owner = "client!qw", name = "O", descriptor = "Lco;")
    public static class589 field8156 = new class589();

    @OriginalMember(owner = "client!qw", name = "B", descriptor = "I")
    public static int field8143;

    @OriginalMember(owner = "client!qw", name = "D", descriptor = "I")
    public static int field8145;

    @OriginalMember(owner = "client!qw", name = "F", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!qw", name = "H", descriptor = "I")
    public static int field8149;

    @OriginalMember(owner = "client!qw", name = "L", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!qw", name = "M", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!qw", name = "P", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(B)V")
    public static void method3226(byte arg0) {
        field8156 = null;
        if (arg0 != 59) {
            method3226((byte) 86);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILgk;B)V")
    public final void method1(int arg0, class540 arg1, byte arg2) {
        ++field8145;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field8150 = arg1.method3169(26488);
                                }
                            } else {
                                this.field8148 = arg1.method3169(26488);
                            }
                        } else {
                            this.field8144 = arg1.method3169(26488);
                        }
                    } else {
                        this.field8155 = arg1.method3169(26488);
                    }
                } else {
                    this.field8151 = arg1.method3169(26488);
                }
            } else {
                this.field8152 = arg1.method3169(26488);
            }
        } else {
            this.field8146 = arg1.method3169(26488);
        }
        if (arg2 <= 29) {
            method3226((byte) -1);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(III)Z")
    private final boolean method3227(int arg0, int arg1, int arg2) {
        ++field8153;
        int var4 = (arg0 + arg1) * this.field8144 >> 12;
        if (arg2 <= 36) {
            this.method3228(89, -66, -49);
        }
        int var5 = class641.field9196[(var4 * 255 & 1044650) >> 12];
        int var6 = (var5 << 12) / this.field8144;
        int var7 = (var6 << 12) / this.field8150;
        int var8 = this.field8148 * var7 >> 12;
        return ~var8 < ~(-arg0 + arg1) && -var8 < -arg0 + arg1;
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "()V")
    public class555() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(III)Z")
    private final boolean method3228(int arg0, int arg1, int arg2) {
        ++field8154;
        int var4 = (arg0 - arg1) * this.field8144 >> 12;
        int var5 = class641.field9196[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field8144;
        int var7 = (var6 << 12) / this.field8150;
        if (arg2 != 0) {
            method3226((byte) 72);
        }
        int var8 = this.field8148 * var7 >> 12;
        return ~(arg0 + arg1) > ~var8 && -var8 < arg0 + arg1;
    }

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "(I)V")
    public final void method2(int arg0) {
        ++field8149;
        if (arg0 == 6276) {
            class531.method3078(false);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IZ[BI)[B")
    public static final byte[] method3229(int arg0, boolean arg1, byte[] arg2, int arg3) {
        ++field8147;
        byte[] var4 = new byte[arg0];
        if (arg1) {
            field8156 = null;
        }
        class667.method3739(arg2, arg3, var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field8143;
        int[] var3 = super.field9216.method1185(arg0, -115);
        if (super.field9216.field2418) {
            int var4 = class400.field6026[arg0] - 2048;
            for (int var5 = 0; class338.field4909 > var5; ++var5) {
                int var6 = class542.field8026[var5] + -2048;
                int var7 = this.field8146 + var6;
                int var8 = ~var7 > 2047 ? var7 - -4096 : var7;
                int var9 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var10 = this.field8152 + var4;
                int var11 = ~var10 > 2047 ? var10 - -4096 : var10;
                int var12 = ~var11 < -2049 ? var11 - 4096 : var11;
                int var13 = this.field8151 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 - -4096;
                int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                int var16 = this.field8155 + var4;
                int var17 = var16 >= -2048 ? var16 : var16 + 4096;
                int var18 = var17 > 2048 ? var17 + -4096 : var17;
                var3[var5] = !this.method3228(var12, var9, 0) && !this.method3227(var15, var18, 90) ? 0 : 4096;
            }
        }
        if (arg1 != -9) {
            this.field8150 = 86;
        }
        return var3;
    }
}
