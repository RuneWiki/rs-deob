import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class302 {

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "Z")
    public boolean field4269 = true;

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
    private int field4275 = -1;

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "Ldw;")
    private class664 field4271;

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "Leq;")
    private class141 field4276;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
    private int field4267;

    @OriginalMember(owner = "client!hga", name = "l", descriptor = "I")
    private int field4278;

    @OriginalMember(owner = "client!hga", name = "r", descriptor = "I")
    private int field4284;

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "Lfba;")
    private class350 field4273;

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "Lpa;")
    private class399 field4272;

    @OriginalMember(owner = "client!hga", name = "n", descriptor = "Lcb;")
    private class633 field4280;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
    public static int field4268 = 0;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "D")
    public static double field4270;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!hga", name = "k", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!hga", name = "m", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!hga", name = "p", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!hga", name = "q", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIII)V")
    public static final void method1986(int arg0, int arg1, int arg2, int arg3) {
        class262 var4 = class137.field1948[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class225 var5 = var4.field3841;
        class225 var6 = var4.field3850;
        if (var5 != null) {
            var5.field3029 = (short) (var5.field3029 * arg3 / (0x10 << class371.field5241 - 7));
            var5.field3022 = (short) (var5.field3022 * arg3 / (0x10 << class371.field5241 - 7));
        }
        if (var6 != null) {
            var6.field3029 = (short) (var6.field3029 * arg3 / (0x10 << class371.field5241 - 7));
            var6.field3022 = (short) (var6.field3022 * arg3 / (0x10 << class371.field5241 - 7));
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V")
    public final void method1987(byte arg0) {
        if (arg0 != 25) {
            this.method1987((byte) 23);
        }
        field4279++;
        this.method1989(64, this.field4284, this.field4272);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIB[B)V")
    public final void method1988(int arg0, int arg1, byte arg2, byte[] arg3) {
        this.field4280.method2486(arg2 ^ 0xFFFFFF94, arg1 * this.field4271.method3735(arg0, arg2 ^ 0xFFFFFFEE), arg3, arg0);
        if (arg2 == -19) {
            field4274++;
            this.method1989(34, arg1, this.field4280);
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IILpa;)V")
    private final void method1989(int arg0, int arg1, class399 arg2) {
        field4281++;
        if (arg1 != 0) {
            this.method1991((byte) -91);
            int var4 = 97 / ((arg0 + 33) / 50);
            this.field4271.method3681(this.field4273, 0);
            this.field4271.method3688(0, arg1, 4, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method1990(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field4283++;
        int var8 = 109 % ((arg0 + 47) / 61);
        if ((arg5 ? class332.field4707.field4795.method1140(0) : class332.field4707.field4782.method1140(0)) != 0 && arg1 != 0 && class12.field108 < 50 && arg2 != -1) {
            class669.field9235[class12.field108++] = new class396((byte) (arg5 ? 3 : 2), arg2, arg1, arg6, arg7, arg4, arg3, null);
        }
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(B)V")
    private final void method1991(byte arg0) {
        field4282++;
        if (!this.field4269) {
            return;
        }
        this.field4269 = false;
        byte[] var2 = this.field4276.field2007;
        byte[] var3 = this.field4271.field9155;
        int var4 = 0;
        int var5 = this.field4276.field1999;
        if (arg0 != -91) {
            return;
        }
        int var6 = this.field4276.field1999 * this.field4278 + this.field4267;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field4273 != null && this.field4275 == var4) {
            this.field4269 = false;
            return;
        }
        this.field4275 = var4;
        int var8 = this.field4267 + (this.field4278 * var5);
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field4276.field1999 - 128;
        }
        if (this.field4273 == null) {
            this.field4273 = new class350(this.field4271, 3553, 6406, 128, 128, false, this.field4271.field9155, 6406, false);
            this.field4273.method2230(3314, false, false);
            this.field4273.method3292(3, true);
        } else {
            this.field4273.method2236(0, this.field4271.field9155, 128, 0, false, 0, 128, false, 6406, 0);
        }
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(IIII)V")
    public static final void method1992(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -1) {
            field4268 = 104;
        }
        int var4 = arg1 * class332.field4707.field4766.method1140(0) >> 8;
        field4277++;
        if (var4 == 0 || arg3 == -1) {
            return;
        }
        if (!class350.field4966 && class61.field883 != -1 && class77.method571(-1) && !class220.method1294(122)) {
            class627.field8436 = class571.method3352(false);
            class261 var5 = class38.method203(116, class627.field8436);
            class714.method4013(var5, 512, true);
        }
        class720.method4033(false, 0, var4, class95.field1311, arg3, false);
        class333.method2131((byte) -59, 255, -1);
        class350.field4966 = true;
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Ldw;Leq;Lrq;IIIII)V")
    public class302(class664 arg0, class141 arg1, class485 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4271 = arg0;
        this.field4276 = arg1;
        this.field4267 = arg6;
        this.field4278 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field4814 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field6752[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field4284 = var10;
        if (var10 <= 0) {
            this.field4273 = null;
        } else {
            class63 var14 = new class63(var10 * 2);
            if (this.field4271.field9051) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field4814 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field6752[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method492(-2, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field4814 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field6752[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method499(-25094, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field4272 = this.field4271.method3696(0, var14.field954, var14.field956, false, 5123);
            this.field4280 = new class633(this.field4271, 5123, null, 1);
        }
    }
}
