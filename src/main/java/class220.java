import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class220 extends class17 {

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    private int field3173 = 4096;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    private int field3174 = 409;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "[I")
    private int[] field3171 = new int[3];

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    private int field3169 = 4096;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    private int field3179 = 4096;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public static int field3166 = 0;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "Z")
    public static boolean field3170 = false;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "Lhm;")
    public static class150 field3180 = null;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
    public static final void method1362(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= arg3) {
            class447.method2605(-7, arg3, arg1, arg0, class112.field1523[arg4]);
        } else {
            class447.method2605(-7, arg0, arg1, arg3, class112.field1523[arg4]);
        }
        if (arg2 != 2) {
            method1366((byte[]) null, -70);
        }
        ++field3167;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field3178;
        int[][] var3 = super.field201.method1851(arg0, (byte) -56);
        if (super.field201.field4431) {
            int[][] var4 = this.method91(0, arg1 + 25, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class530.field7763; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field3171[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field3174 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field3171[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field3174) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field3171[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field3174) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field3169 * var12 >> 12;
                            var9[var11] = this.field3179 * var14 >> 12;
                            var10[var11] = this.field3173 * var16 >> 12;
                        }
                    }
                }
            }
        }
        if (arg1 != -25) {
            this.field3171 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        ++field3165;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            int var5 = arg0.method2323((byte) 84);
                            this.field3171[1] = class239.method1507(65280, var5) >> 4;
                            this.field3171[2] = class239.method1507(255, var5) >> 12;
                            this.field3171[0] = class239.method1507(267386880, var5 << 4);
                        }
                    } else {
                        this.field3169 = arg0.method2338(0);
                    }
                } else {
                    this.field3179 = arg0.method2338(arg2 ^ 5159);
                }
            } else {
                this.field3173 = arg0.method2338(0);
            }
        } else {
            this.field3174 = arg0.method2338(0);
        }
        if (arg2 != 5159) {
            this.field3171 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIZ)I")
    public static final int method1363(int arg0, int arg1, int arg2, boolean arg3) {
        ++field3168;
        class167 var4 = class119.method803(arg3, arg0, 0);
        if (var4 == null) {
            return -1;
        } else {
            int var5 = -76 % ((64 - arg2) / 57);
            return arg1 >= 0 && ~var4.field2432.length < ~arg1 ? var4.field2432[arg1] : -1;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1364(int arg0, byte arg1, int arg2) {
        ++field3172;
        if (arg1 != -3) {
            field3175 = 5;
        }
        return ~(34 & arg0) != -1;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class220() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)V")
    public static void method1365(int arg0) {
        field3180 = null;
        if (arg0 != 267386880) {
            field3175 = -62;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1366(byte[] arg0, int arg1) {
        if (arg1 != -24315) {
            field3175 = -12;
        }
        ++field3177;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class182.method1135(arg0, 0, var3, 0, var2);
        return var3;
    }
}
