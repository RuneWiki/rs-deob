import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class503 extends class263 {

    @OriginalMember(owner = "client!dv", name = "G", descriptor = "[I")
    public static int[] field7410 = new int[13];

    @OriginalMember(owner = "client!dv", name = "H", descriptor = "I")
    public static int field7411 = 0;

    @OriginalMember(owner = "client!dv", name = "L", descriptor = "Ldp;")
    public static class347 field7415 = new class347("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!dv", name = "I", descriptor = "F")
    public static float field7412;

    @OriginalMember(owner = "client!dv", name = "E", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!dv", name = "F", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!dv", name = "J", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!dv", name = "K", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!dv", name = "M", descriptor = "Lok;")
    public static class74 field7416;

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "()V", line = 4)
    public class503() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIB)V", line = 8)
    public static final void method2978(int arg0, int arg1, int arg2, byte arg3) {
        ++field7409;
        if (arg3 != 83) {
            field7410 = null;
        }
        class506 var4 = class14.method185(-1304589728, arg1, 11);
        var4.method2992(0);
        var4.field7441 = arg0;
        var4.field7442 = arg2;
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(IB)[[I", line = 28)
    public final int[][] method34(int arg0, byte arg1) {
        ++field7408;
        if (arg1 >= -45) {
            return null;
        } else {
            int[][] var3 = super.field3912.method2649(arg0, false);
            if (super.field3912.field6681) {
                int[][] var4 = this.method1646(0, 2, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class367.field5597 > var11; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = -var7[var11] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IB)[I", line = 79)
    public final int[] method33(int arg0, byte arg1) {
        ++field7414;
        if (arg1 < 40) {
            field7416 = null;
        }
        int[] var3 = super.field3917.method41(arg0, 1);
        if (super.field3917.field91) {
            int[] var4 = this.method1644(0, 0, arg0);
            for (int var5 = 0; ~var5 > ~class367.field5597; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "(B)V", line = 112)
    public static void method2979(byte arg0) {
        field7410 = null;
        field7415 = null;
        field7416 = null;
        if (arg0 <= 41) {
            method2979((byte) -48);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZLgk;)V", line = 127)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        ++field7413;
        if (arg1) {
            if (~arg0 == -1) {
                super.field3927 = arg2.method2765(123) == 1;
            }
        }
    }
}
