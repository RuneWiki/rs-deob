import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class621 extends class646 {

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "I")
    private int field8840 = 585;

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "Lvh;")
    public static class125 field8846 = new class125(17, 7);

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
    public static int field8845;

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "Lus;")
    public static class308 field8844;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "[Li;")
    public static class682[] field8841;

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    public class621() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIB)V")
    public static final void method3502(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field8842;
        if (arg4 == 77) {
            if (~class512.field7620 >= ~arg2 && class94.field1398 >= arg2) {
                int var5 = class367.method2203(class198.field3084, class627.field8931, arg3, true);
                int var6 = class367.method2203(class198.field3084, class627.field8931, arg0, true);
                class64.method526(var6, var5, arg1, arg4 + -77, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lek;IB)V")
    public final void method295(class465 arg0, int arg1, byte arg2) {
        ++field8847;
        if (arg2 < 7) {
            method3502(23, 74, -80, -18, (byte) -56);
        }
        if (arg1 == 0) {
            this.field8840 = arg0.method2755((byte) -57);
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)V")
    public static void method3503(int arg0) {
        int var1 = -47 % ((27 - arg0) / 38);
        field8841 = null;
        field8846 = null;
        field8844 = null;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(IB)[I")
    public final int[] method424(int arg0, byte arg1) {
        ++field8845;
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (arg1 != -120) {
            field8844 = null;
        }
        if (super.field9156.field5075) {
            int var4 = class78.field1195[arg0];
            for (int var5 = 0; ~class89.field1330 < ~var5; ++var5) {
                int var6 = class518.field7652[var5];
                if (this.field8840 < var6 && ~var6 > ~(4096 - this.field8840) && ~(2048 - this.field8840) > ~var4 && var4 < this.field8840 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field8840);
                    var3[var5] = -var10 + 4096;
                } else if (~(-this.field8840 + 2048) > ~var6 && ~(2048 - -this.field8840) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 <= -1 ? var11 : -var11;
                    int var13 = var12 - this.field8840;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field8840);
                } else if (this.field8840 <= var4 && var4 <= 4096 - this.field8840) {
                    if (~this.field8840 >= ~var6 && ~var6 >= ~(-this.field8840 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field8840);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field8840;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field8840 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(III)Z")
    public static final boolean method3504(int arg0, int arg1, int arg2) {
        ++field8843;
        if (arg2 > -7) {
            field8846 = null;
        }
        return class636.method3591(-9676, arg0, arg1) & class34.method299(arg0, arg1, -80);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lr;IIIIIIZZ)V")
    public static final void method3505(class98 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class490.field7029 = arg0;
        class34.field487 = arg1;
        class215.field3244 = class34.field487 > 1 && class490.field7029.method786();
        class49.field637 = arg2;
        class457.field6576 = 1 << class49.field637;
        class211.field3229 = class457.field6576 >> 1;
        Math.sqrt((double) (class211.field3229 * class211.field3229 + class211.field3229 * class211.field3229));
        class596.field8626 = arg3;
        class33.field474 = arg4;
        class687.field9758 = arg5;
        class668.field9389 = arg6;
        class233.field3451 = class186.method1327(2689);
        class609.method3457(100);
        class608.field8743 = new class293[arg3][class33.field474][class687.field9758];
        field8841 = new class682[arg3];
        if (arg7) {
            class544.field7990 = new int[class33.field474][class687.field9758];
            class352.field4941 = new byte[class33.field474][class687.field9758];
            class453.field6524 = new short[class33.field474][class687.field9758];
            class667.field9371 = new class293[1][class33.field474][class687.field9758];
            class340.field4723 = new class682[1];
        } else {
            class544.field7990 = null;
            class352.field4941 = null;
            class453.field6524 = null;
            class667.field9371 = null;
            class340.field4723 = null;
        }
        if (arg8) {
            class155.field2554 = new long[arg3][arg4][arg5];
            class126.field2067 = new class8[65535];
            class235.field3491 = new boolean[65535];
            class410.field5858 = 0;
        } else {
            class155.field2554 = null;
            class126.field2067 = null;
            class235.field3491 = null;
            class410.field5858 = 0;
        }
        class699.method3928(false);
        class431.field6138 = new class204[2][];
        class431.field6138[0] = new class204[class680.field9679[0]];
        class431.field6138[1] = new class204[class680.field9679[1]];
        class310.field4305 = new int[2];
        class430.field6131 = new class204[2][];
        class430.field6131[0] = new class204[class643.field9140[0]];
        class430.field6131[1] = new class204[class643.field9140[1]];
        class352.field4945 = new int[2];
        class128.field2093 = new class204[2][];
        class128.field2093[0] = new class204[class540.field7939[0]];
        class128.field2093[1] = new class204[class540.field7939[1]];
        class108.field1764 = new int[2];
        class186.field2923 = new class204[10000];
        class386.field5651 = 0;
        class229.field3400 = new class204[5000];
        class634.field8979 = 0;
        class88.field1308 = new class144[5000];
        class136.field2197 = 0;
        class678.field9661 = new boolean[class668.field9389 + class668.field9389 + 1][class668.field9389 + class668.field9389 + 1];
        class513.field7625 = new boolean[class668.field9389 + class668.field9389 + 2][class668.field9389 + class668.field9389 + 2];
        if (class215.field3244) {
            class128.field2095 = new boolean[arg3][class668.field9389 + class668.field9389 + 1][class668.field9389 + class668.field9389 + 1];
            class390.field5686 = new boolean[arg3][][];
            if (class355.field4980 != null) {
                class619.method3496();
            }
            class355.field4980 = new class181[class34.field487];
            class490.field7029.method751(class355.field4980.length + 1);
            class490.field7029.method807(0);
            for (int var9 = 0; var9 < class355.field4980.length; ++var9) {
                class355.field4980[var9] = new class181(var9 + 1, class490.field7029);
                (new Thread(class355.field4980[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class34.field487 == 2) {
                var10 = 4;
                class255.field3675 = 2;
            } else if (class34.field487 == 3) {
                var10 = 6;
                class255.field3675 = 3;
            } else {
                var10 = 8;
                class255.field3675 = 4;
            }
            class254.field3674 = new class312[var10];
            for (int var11 = 0; var11 < var10; ++var11) {
                class254.field3674[var11] = new class312(class50.field662[class34.field487 - 2][var11]);
            }
        } else {
            class255.field3675 = 1;
        }
        class599.field8655 = new int[class255.field3675 - 1];
        class697.field9887 = new int[class255.field3675 - 1];
    }
}
