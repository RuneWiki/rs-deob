import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class203 extends class512 {

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "Llo;")
    public static class306 field3206 = new class306("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "F")
    public static float field3210 = 1.0F;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "[I")
    public static int[] field3212 = new int[1];

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
    public class203() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)[I")
    public final int[] method75(int arg0, byte arg1) {
        int var3 = 106 % ((43 - arg1) / 48);
        ++field3207;
        int[] var4 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            int[] var5 = this.method3013(false, 0, arg0);
            for (int var6 = 0; class402.field6113 > var6; ++var6) {
                var4[var6] = -var5[var6] + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZILia;)V")
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        if (arg1 == 0) {
            super.field7491 = arg2.method126((byte) -83) == 1;
        }
        if (!arg0) {
            field3211 = 49;
        }
        ++field3209;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(B)V")
    public static void method1333(byte arg0) {
        if (arg0 <= -45) {
            field3206 = null;
            field3212 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)[[I")
    public final int[][] method278(int arg0, int arg1) {
        ++field3205;
        int[][] var3 = super.field7496.method2777(arg1, 0);
        int var4 = 4 % ((-40 - arg0) / 47);
        if (super.field7496.field6942) {
            int[][] var5 = this.method3012(arg1, 61, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; ~class402.field6113 < ~var12; ++var12) {
                var9[var12] = -var6[var12] + 4096;
                var10[var12] = -var7[var12] + 4096;
                var11[var12] = -var8[var12] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLqs;I)Lhi;")
    public static final class315 method1334(byte arg0, class496 arg1, int arg2) {
        if (arg0 < 78) {
            return null;
        } else {
            ++field3208;
            byte[] var3 = arg1.method2942(arg2, -10365);
            return var3 == null ? null : new class315(var3);
        }
    }
}
