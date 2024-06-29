import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class256 extends class334 {

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "I")
    private int field3653 = 0;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
    private int field3652 = 0;

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
    private int field3659 = 4096;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "I")
    private int field3654 = 16;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "I")
    private int field3660 = 2000;

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "[Lfw;")
    public static class716[] field3661 = new class716[6];

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lha;ILgga;)V")
    public static final void method1682(class475 arg0, int arg1, class513 arg2) {
        ++field3662;
        class418[] var3 = class418.method2472(arg2, class561.field7772, 0);
        class401.field5530 = new class85[var3.length];
        for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
            class401.field5530[var4] = arg0.method487(var3[var4], true);
        }
        class418[] var5 = class418.method2472(arg2, class406.field5590, 0);
        class456.field6223 = new class85[var5.length];
        for (int var6 = 0; var6 < var5.length; ++var6) {
            class456.field6223[var6] = arg0.method487(var5[var6], true);
        }
        class418[] var7 = class418.method2472(arg2, class229.field3331, 0);
        class478.field6575 = new class85[var7.length];
        for (int var8 = 0; ~var8 > ~var7.length; ++var8) {
            class478.field6575[var8] = arg0.method487(var7[var8], true);
        }
        class418[] var9 = class418.method2472(arg2, class616.field8743, 0);
        class150.field2405 = new class85[var9.length];
        for (int var10 = 0; ~var9.length < ~var10; ++var10) {
            class150.field2405[var10] = arg0.method487(var9[var10], true);
        }
        class418[] var11 = class418.method2472(arg2, class759.field10512, 0);
        class91.field1308 = new class85[var11.length];
        for (int var12 = 0; ~var11.length < ~var12; ++var12) {
            class91.field1308[var12] = arg0.method487(var11[var12], true);
        }
        class418[] var13 = class418.method2472(arg2, class663.field9340, 0);
        class491.field6736 = new class85[var13.length];
        for (int var14 = 0; ~var13.length < ~var14; ++var14) {
            class491.field6736[var14] = arg0.method487(var13[var14], true);
        }
        class418[] var15 = class418.method2472(arg2, class707.field9902, 0);
        class143.field2327 = new class85[var15.length];
        for (int var16 = 0; var16 < var15.length; ++var16) {
            class143.field2327[var16] = arg0.method487(var15[var16], true);
        }
        class418[] var17 = class418.method2472(arg2, class55.field874, 0);
        class329.field4677 = new class85[var17.length];
        for (int var18 = 0; var17.length > var18; ++var18) {
            class329.field4677[var18] = arg0.method487(var17[var18], true);
        }
        if (arg1 <= 63) {
            field3661 = null;
        }
        class418[] var19 = class418.method2472(arg2, class458.field6263, 0);
        class447.field6168 = new class85[var19.length];
        for (int var20 = 0; ~var19.length < ~var20; ++var20) {
            class447.field6168[var20] = arg0.method487(var19[var20], true);
        }
        class418[] var21 = class418.method2472(arg2, class216.field3152, 0);
        class673.field9427 = new class85[var21.length];
        for (int var22 = 0; var22 < var21.length; ++var22) {
            class673.field9427[var22] = arg0.method487(var21[var22], true);
        }
        class418[] var23 = class418.method2472(arg2, class737.field10232, 0);
        class352.field4999 = new class85[var23.length];
        for (int var24 = 0; ~var24 > ~var23.length; ++var24) {
            class352.field4999[var24] = arg0.method487(var23[var24], true);
        }
        class418[] var25 = class418.method2472(arg2, class107.field1530, 0);
        class581.field8365 = new class85[var25.length];
        for (int var26 = 0; ~var26 > ~var25.length; ++var26) {
            class581.field8365[var26] = arg0.method487(var25[var26], true);
        }
        class727.field10127 = arg0.method487(class418.method2468(arg2, class81.field1204, 0), true);
        class315.field4468 = arg0.method487(class418.method2468(arg2, class58.field896, 0), true);
        class418[] var27 = class418.method2472(arg2, class27.field286, 0);
        class664.field9358 = new class85[var27.length];
        for (int var28 = 0; var27.length > var28; ++var28) {
            class664.field9358[var28] = arg0.method487(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
    public static void method1683(boolean arg0) {
        field3661 = null;
        if (arg0) {
            method1685((String) null, (byte) 44);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V")
    public final void method27(byte arg0) {
        class177.method1292(0);
        ++field3658;
        if (arg0 > -27) {
            this.field3659 = -128;
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
    public class256() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZLol;)V")
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (arg1) {
            method1684((byte) -70, (class373) null);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            this.field3659 = arg2.method2565((byte) -95);
                        }
                    } else {
                        this.field3652 = arg2.method2565((byte) -123);
                    }
                } else {
                    this.field3654 = arg2.method2557(14929);
                }
            } else {
                this.field3660 = arg2.method2565((byte) -95);
            }
        } else {
            this.field3653 = arg2.method2557(14929);
        }
        ++field3656;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLkja;)I")
    public static final int method1684(byte arg0, class373 arg1) {
        if (arg0 > -49) {
            method1684((byte) -70, (class373) null);
        }
        ++field3657;
        int var2 = arg1.method2222(8, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (~var2 == -2) {
            var3 = arg1.method2222(8, 5);
        } else if (~var2 == -3) {
            var3 = arg1.method2222(8, 8);
        } else {
            var3 = arg1.method2222(8, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)[I")
    public final int[] method28(int arg0, int arg1) {
        ++field3651;
        int[] var3 = super.field4743.method1027((byte) -114, arg0);
        if (super.field4743.field1993) {
            int var4 = this.field3659 >> 1;
            int[][] var5 = super.field4743.method1024((byte) 123);
            Random var6 = new Random((long) this.field3653);
            for (int var7 = 0; ~var7 > ~this.field3660; ++var7) {
                int var8 = ~this.field3659 < -1 ? this.field3652 - (var4 + -class728.method4047(116, this.field3659, var6)) : this.field3652;
                int var9 = var8 >> 4 & 255;
                int var10 = class728.method4047(121, class439.field6099, var6);
                int var11 = class728.method4047(119, class327.field4668, var6);
                int var12 = (class615.field8725[var9] * this.field3654 >> 12) + var10;
                int var13 = var11 - -(class254.field3643[var9] * this.field3654 >> 12);
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || ~var14 != -1) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
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
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class728.method4047(123, 4096, var6) >> 2) + 1024;
                    int var27 = ~var11 > ~var13 ? 1 : -1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        int var29 = var26 + 1024 - -((-var10 + var28) * var25);
                        int var30 = class478.field6578 & var28;
                        int var31 = var21 & class147.field2360;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (~var24 < -1) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        if (arg1 != -22563988) {
            method1684((byte) -26, (class373) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method1685(String arg0, byte arg1) {
        if (arg1 != -105) {
            method1684((byte) -111, (class373) null);
        }
        ++field3655;
        return class538.method3121(arg0, true, 10, -126);
    }
}
