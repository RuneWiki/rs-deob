import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class444 extends class263 {

    @OriginalMember(owner = "client!at", name = "H", descriptor = "I")
    private int field6523 = 4;

    @OriginalMember(owner = "client!at", name = "I", descriptor = "I")
    private int field6524 = 4;

    @OriginalMember(owner = "client!at", name = "J", descriptor = "Z")
    public static boolean field6525;

    @OriginalMember(owner = "client!at", name = "M", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!at", name = "L", descriptor = "Luv;")
    public static class2 field6527;

    @OriginalMember(owner = "client!at", name = "N", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!at", name = "E", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!at", name = "F", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!at", name = "G", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!at", name = "K", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!at", name = "O", descriptor = "[[[I")
    public static int[][][] field6530;

    static {
        new class347("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field6525 = false;
        new class347("Ok", "Okay", "OK", "Ok");
        field6528 = 0;
        field6527 = new class2(50, 6);
        field6529 = 0;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IZLgk;)V", line = 14)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (arg1) {
            ++field6526;
            if (~arg0 != -1) {
                if (~arg0 == -2) {
                    this.field6524 = arg2.method2765(120);
                }
            } else {
                this.field6523 = arg2.method2765(86);
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(IB)[[I", line = 48)
    public final int[][] method34(int arg0, byte arg1) {
        ++field6522;
        int[][] var3 = super.field3912.method2649(arg0, false);
        if (arg1 > -45) {
            field6525 = false;
        }
        if (super.field3912.field6681) {
            int var4 = class367.field5597 / this.field6523;
            int var5 = class372.field5635 / this.field6524;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method1646(0, 2, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1646(0, 2, class372.field5635 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class367.field5597 < ~var14; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class367.field5597 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V", line = 119)
    public class444() {
        super(1, false);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IB)[I", line = 124)
    public final int[] method33(int arg0, byte arg1) {
        if (arg1 < 40) {
            return null;
        } else {
            ++field6520;
            int[] var3 = super.field3917.method41(arg0, 1);
            if (super.field3917.field91) {
                int var4 = class367.field5597 / this.field6523;
                int var5 = class372.field5635 / this.field6524;
                int[] var6;
                if (~var5 >= -1) {
                    var6 = this.method1644(0, 0, 0);
                } else {
                    int var7 = arg0 % var5;
                    var6 = this.method1644(0, 0, class372.field5635 * var7 / var5);
                }
                for (int var8 = 0; ~var8 > ~class367.field5597; ++var8) {
                    if (var4 > 0) {
                        int var9 = var8 % var4;
                        var3[var8] = var6[class367.field5597 * var9 / var4];
                    } else {
                        var3[var8] = var6[0];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!at", name = "d", descriptor = "(B)V", line = 181)
    public static void method2607(byte arg0) {
        field6530 = null;
        if (arg0 <= -76) {
            field6527 = null;
        }
    }
}
