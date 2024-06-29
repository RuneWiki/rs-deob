import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class345 extends class149 {

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    private int field5398 = 4096;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    private int field5401 = 16;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    private int field5402 = 0;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    private int field5403 = 2000;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    private int field5404 = 0;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "[I")
    public static int[] field5407 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIIII)V", line = 10)
    public static final void method2203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5399;
        if (~class396.field6021 >= ~arg5 && ~arg5 >= ~class443.field6591 && class396.field6021 <= arg2 && arg2 <= class443.field6591 && ~arg7 <= ~class396.field6021 && ~class443.field6591 <= ~arg7 && ~class396.field6021 >= ~arg9 && ~class443.field6591 <= ~arg9 && arg0 >= class410.field6176 && class158.field2302 >= arg0 && arg3 >= class410.field6176 && ~class158.field2302 <= ~arg3 && class410.field6176 <= arg1 && ~class158.field2302 <= ~arg1 && class410.field6176 <= arg8 && ~arg8 >= ~class158.field2302) {
            class206.method1431(arg7, arg2, (byte) -85, arg9, arg8, arg1, arg5, arg0, arg4, arg3);
        } else {
            class168.method1182(arg3, arg2, arg1, arg7, arg4, arg0, arg5, arg9, arg8, 264031916);
        }
        if (arg6 > -120) {
            field5407 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 44)
    public class345() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(III)Z", line = 30)
    public static final boolean method2204(int arg0, int arg1, int arg2) {
        if (arg1 != -10059) {
            return false;
        } else {
            ++field5397;
            return class511.method3045(arg0, (byte) 42, arg2) || class408.method2489(arg0, arg2, -22050);
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V", line = 52)
    public final void method99(int arg0) {
        if (arg0 <= -86) {
            ++field5406;
            class117.method761(0);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V", line = 63)
    public static void method2205(boolean arg0) {
        if (arg0) {
            field5407 = null;
        }
        field5407 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBLtl;)V", line = 74)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (arg1 != 35) {
            this.method92(-123, 1);
        }
        ++field5405;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            this.field5398 = arg2.method631(10494);
                        }
                    } else {
                        this.field5402 = arg2.method631(arg1 + 10459);
                    }
                } else {
                    this.field5401 = arg2.method618((byte) 100);
                }
            } else {
                this.field5403 = arg2.method631(10494);
            }
        } else {
            this.field5404 = arg2.method618((byte) 100);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I", line = 149)
    public final int[] method92(int arg0, int arg1) {
        ++field5400;
        int[] var3 = super.field2152.method2891(arg1, (byte) 85);
        if (arg0 != -10835) {
            this.field5398 = -62;
        }
        if (super.field2152.field7051) {
            int var4 = this.field5398 >> 1;
            int[][] var5 = super.field2152.method2888(arg0 ^ -10811);
            Random var6 = new Random((long) this.field5404);
            for (int var7 = 0; var7 < this.field5403; ++var7) {
                int var8 = ~this.field5398 < -1 ? -var4 + this.field5402 + class455.method2740(-8, var6, this.field5398) : this.field5402;
                int var9 = var8 >> 4 & 255;
                int var10 = class455.method2740(-8, var6, class316.field4838);
                int var11 = class455.method2740(-8, var6, class150.field2159);
                int var12 = (class253.field3510[var9] * this.field5401 >> 12) + var10;
                int var13 = (class25.field406[var9] * this.field5401 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || var14 != 0) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class455.method2740(-8, var6, 4096) >> 2);
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var27 = var13 <= var11 ? -1 : 1;
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        int var29 = (var28 - var10) * var25 + (var26 - -1024);
                        int var30 = class320.field4897 & var28;
                        int var31 = var21 & class51.field694;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
