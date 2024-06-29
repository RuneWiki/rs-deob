import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class304 extends class128 {

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
    private int field4724 = 585;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    public static int field4719 = -1;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V", line = 3)
    public class304() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(BI)[I", line = 8)
    public final int[] method126(byte arg0, int arg1) {
        if (arg0 <= 100) {
            method2129((byte) -89, -109);
        }
        field4718++;
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            int var4 = class49.field600[arg1];
            for (int var5 = 0; var5 < class10.field141; var5++) {
                int var6 = class334.field5157[var5];
                if (var6 > this.field4724 && var6 < 4096 - this.field4724 && (2048 - this.field4724) < var4 && var4 < this.field4724 + 2048) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field4724);
                    var3[var5] = 4096 - var10;
                } else if (2048 - this.field4724 < var6 && var6 < (this.field4724 + 2048)) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field4724;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field4724);
                } else if (this.field4724 > var4 || (4096 - this.field4724) < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field4724;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field4724);
                } else if (this.field4724 <= var6 && (4096 - this.field4724) >= var6) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field4724);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(BI)V", line = 87)
    public static final void method2129(byte arg0, int arg1) {
        class270.field4255.method1236(arg0 - 495037121, arg1);
        if (arg0 != 104) {
            field4721 = -108;
        }
        field4716++;
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(III)V", line = 101)
    public static final void method2130(int arg0, int arg1, int arg2) {
        int var3 = class225.field3192 * arg1 >> 8;
        if (arg0 > -18) {
            method2130(-20, -31, -24);
        }
        field4722++;
        if (arg2 == -1 && !class253.field3838) {
            class149.method1001((byte) -112);
        } else if (arg2 != -1 && (class195.field2794 != arg2 || !class236.method1683(0)) && var3 != 0 && !class253.field3838) {
            class137.method915(2, 1, var3, 0, arg2, class318.field4892, false);
        }
        class195.field2794 = arg2;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(III)Lbm;", line = 134)
    public static final class146 method2131(int arg0, int arg1, int arg2) {
        class225 var3 = class158.field2184[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class146 var4 = var3.field3206;
            var3.field3206 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BIILlc;)Z", line = 146)
    public static final boolean method2132(byte arg0, int arg1, int arg2, class175 arg3) {
        field4720++;
        byte[] var4 = arg3.method1199(28815, arg2, arg1);
        if (arg0 >= -25) {
            return true;
        } else if (var4 == null) {
            return false;
        } else {
            class161.method1063(var4, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lp;II)V", line = 170)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg2 <= -85) {
            if (arg1 == 0) {
                this.field4724 = arg0.method624(14612);
            }
            field4723++;
        }
    }
}
