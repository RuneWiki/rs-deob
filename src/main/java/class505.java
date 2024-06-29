import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class505 extends class349 {

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
    private int field6823 = 0;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    private int field6824 = 0;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    private int field6828 = 2000;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    private int field6831 = 16;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    private int field6832 = 4096;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "[I")
    public static int[] field6826 = new int[5];

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field6827;
        int var3 = 44 % ((56 - arg0) / 41);
        int[] var4 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            int var5 = this.field6832 >> 1;
            int[][] var6 = super.field5109.method3084(-61);
            Random var7 = new Random((long) this.field6824);
            for (int var8 = 0; this.field6828 > var8; ++var8) {
                int var9 = this.field6832 <= 0 ? this.field6823 : this.field6823 + (class571.method3224((byte) 119, this.field6832, var7) - var5);
                int var10 = 255 & var9 >> 4;
                int var11 = class571.method3224((byte) -42, class39.field497, var7);
                int var12 = class571.method3224((byte) 118, class442.field6080, var7);
                int var13 = var11 - -(class15.field127[var10] * this.field6831 >> 12);
                int var14 = (class339.field4960[var10] * this.field6831 >> 12) + var12;
                int var15 = var14 - var12;
                int var16 = -var11 + var13;
                if (~var16 != -1 || var15 != 0) {
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var17 = ~var15 < ~var16;
                    if (var17) {
                        int var18 = var11;
                        int var19 = var13;
                        var11 = var12;
                        var12 = var18;
                        var13 = var14;
                        var14 = var19;
                    }
                    if (var11 > var13) {
                        int var20 = var11;
                        int var21 = var12;
                        var11 = var13;
                        var13 = var20;
                        var12 = var14;
                        var14 = var21;
                    }
                    int var22 = var12;
                    int var23 = -var11 + var13;
                    int var24 = -var12 + var14;
                    int var25 = -var23 / 2;
                    int var26 = 2048 / var23;
                    int var27 = -(class571.method3224((byte) -36, 4096, var7) >> 2) + 1024;
                    if (~var24 > -1) {
                        var24 = -var24;
                    }
                    int var28 = var12 < var14 ? 1 : -1;
                    for (int var29 = var11; ~var13 < ~var29; ++var29) {
                        int var30 = (var29 - var11) * var26 + var27 - -1024;
                        int var31 = var29 & class144.field1839;
                        int var32 = var22 & class4.field38;
                        if (var17) {
                            var6[var32][var31] = var30;
                        } else {
                            var6[var31][var32] = var30;
                        }
                        var25 += var24;
                        if (var25 > 0) {
                            var22 -= -var28;
                            var25 += -var23;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V")
    public final void method11(byte arg0) {
        ++field6830;
        class55.method350(0);
        if (arg0 > -51) {
            method2855(18);
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class505() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V")
    public static void method2855(int arg0) {
        field6826 = null;
        if (arg0 <= 118) {
            method2856(81, -117, 14, (byte) 3, 106, 74, 71);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        ++field6825;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            this.field6832 = arg2.method922((byte) -115);
                        }
                    } else {
                        this.field6823 = arg2.method922((byte) -128);
                    }
                } else {
                    this.field6831 = arg2.method957((byte) -115);
                }
            } else {
                this.field6828 = arg2.method922((byte) -127);
            }
        } else {
            this.field6824 = arg2.method957((byte) -93);
        }
        if (arg0 != 4095) {
            method2856(12, -8, -49, (byte) 124, -79, -88, -93);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIBIII)V")
    public static final void method2856(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field6829;
        int var7 = class191.method1226(arg4, class609.field8313, class19.field169, 16);
        int var8 = class191.method1226(arg0, class609.field8313, class19.field169, 16);
        int var9 = class191.method1226(arg1, class398.field5676, class298.field3995, 16);
        int var10 = class191.method1226(arg2, class398.field5676, class298.field3995, 16);
        int var11 = class191.method1226(arg4 + arg5, class609.field8313, class19.field169, 16);
        int var12 = class191.method1226(-arg5 + arg0, class609.field8313, class19.field169, 16);
        int var13 = var7;
        if (arg3 >= -43) {
            method2855(61);
        }
        while (~var11 < ~var13) {
            class653.method3620(var10, var9, false, arg6, class319.field4673[var13]);
            ++var13;
        }
        for (int var14 = var8; var14 > var12; --var14) {
            class653.method3620(var10, var9, false, arg6, class319.field4673[var14]);
        }
        int var15 = class191.method1226(arg1 - -arg5, class398.field5676, class298.field3995, 16);
        int var16 = class191.method1226(-arg5 + arg2, class398.field5676, class298.field3995, 16);
        for (int var17 = var11; var12 >= var17; ++var17) {
            int[] var18 = class319.field4673[var17];
            class653.method3620(var15, var9, false, arg6, var18);
            class653.method3620(var10, var16, false, arg6, var18);
        }
    }
}
