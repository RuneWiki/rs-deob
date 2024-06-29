import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class227 extends class300 {

    @OriginalMember(owner = "client!of", name = "F", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!of", name = "H", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!of", name = "I", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(III)Z")
    public static final boolean method1602(int arg0, int arg1, int arg2) {
        ++field3523;
        if (arg2 != 4) {
            return true;
        } else {
            if (arg1 == 11) {
                arg1 = 10;
            }
            class191 var3 = class128.method822(arg0, (byte) -84);
            if (arg1 >= 5 && ~arg1 >= -9) {
                arg1 = 4;
            }
            return var3.method1343((byte) -56, arg1);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            super.field4784 = ~arg0.method1218(-57) == -2;
        }
        ++field3520;
        if (arg1 < -43) {
            ;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        ++field3521;
        if (arg1 != -957953300) {
            return null;
        } else {
            int[] var3 = super.field4797.method217(arg0, true);
            if (super.field4797.field470) {
                int[] var4 = this.method2018(0, -1, arg0);
                for (int var5 = 0; ~class180.field2826 < ~var5; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        int var3 = 5 / (-arg0 / 47);
        int[][] var4 = super.field4786.method538(arg1, (byte) 14);
        if (super.field4786.field1200) {
            int[][] var5 = this.method2021(arg1, false, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var5[1];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            for (int var12 = 0; class180.field2826 > var12; ++var12) {
                var9[var12] = -var6[var12] + 4096;
                var11[var12] = -var8[var12] + 4096;
                var10[var12] = 4096 - var7[var12];
            }
        }
        ++field3522;
        return var4;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class227() {
        super(1, false);
    }
}
