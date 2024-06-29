import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class1 extends class642 {

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    private int field5 = 0;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
    private int field6 = 2000;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
    private int field8 = 16;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
    private int field12 = 0;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
    private int field13 = 4096;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
    public static int field4 = 0;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "[B")
    public static byte[] field2 = new byte[2048];

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    public static int field1 = 0;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "Z")
    public static boolean field9 = false;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V", line = 17)
    public class1() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILgk;B)V", line = 20)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            this.field13 = arg1.method3169(26488);
                        }
                    } else {
                        this.field12 = arg1.method3169(26488);
                    }
                } else {
                    this.field8 = arg1.method3115(29871);
                }
            } else {
                this.field6 = arg1.method3169(26488);
            }
        } else {
            this.field5 = arg1.method3115(29871);
        }
        ++field3;
        if (arg2 < 29) {
            field1 = 26;
        }
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V", line = 79)
    public final void method2(int arg0) {
        class531.method3078(false);
        if (arg0 == 6276) {
            ++field10;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)[I", line = 93)
    public final int[] method3(int arg0, int arg1) {
        ++field11;
        if (arg1 != -9) {
            this.method1(-102, (class540) null, (byte) 77);
        }
        int[] var3 = super.field9216.method1185(arg0, arg1 + -113);
        if (super.field9216.field2418) {
            int var4 = this.field13 >> 1;
            int[][] var5 = super.field9216.method1188(0);
            Random var6 = new Random((long) this.field5);
            for (int var7 = 0; ~this.field6 < ~var7; ++var7) {
                int var8 = this.field13 <= 0 ? this.field12 : this.field12 + class339.method2095(true, var6, this.field13) + -var4;
                int var9 = (var8 & 4095) >> 4;
                int var10 = class339.method2095(true, var6, class338.field4909);
                int var11 = class339.method2095(true, var6, class106.field1578);
                int var12 = var10 - -(class641.field9196[var9] * this.field8 >> 12);
                int var13 = (class229.field3042[var9] * this.field8 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = -var10 + var12;
                if (var15 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class339.method2095(true, var6, 4096) >> 2) + 1024;
                    int var27 = var11 >= var13 ? -1 : 1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        int var29 = (-var10 + var28) * var25 + (var26 - -1024);
                        int var30 = class412.field6121 & var28;
                        int var31 = var21 & class553.field8133;
                        var24 += var23;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (~var24 < -1) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V", line = 243)
    public static void method4(byte arg0) {
        int var1 = -13 % ((arg0 - -29) / 57);
        field2 = null;
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(B)V", line = 252)
    public static final void method5(byte arg0) {
        ++field7;
        if (arg0 >= -67) {
            field9 = false;
        }
        ++class629.field9112;
        class654 var1 = class631.method3628(class186.field2521, (byte) -51, class357.field5280);
        var1.field9358.method3110(0, 38);
        class444.method2623(119, var1);
    }
}
