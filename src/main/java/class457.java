import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class457 extends class148 {

    @OriginalMember(owner = "client!og", name = "O", descriptor = "[I")
    public static int[] field6759 = new int[16384];

    @OriginalMember(owner = "client!og", name = "P", descriptor = "[I")
    public static int[] field6760 = new int[16384];

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "[B")
    public static byte[] field6761;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field6758;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field6760[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field6759[var2] = (int) (32768.0D * Math.cos((double) var2 * var0));
        }
        field6761 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method25(int arg0, int arg1) {
        ++field6758;
        if (arg0 > -65) {
            method2741(81);
        }
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            int[] var4 = this.method971(false, arg1, 0);
            for (int var5 = 0; ~var5 > ~class320.field4579; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V", line = 36)
    public static void method2741(int arg0) {
        field6759 = null;
        field6761 = null;
        field6760 = null;
        int var1 = 77 % ((14 - arg0) / 55);
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V", line = 48)
    public static final void method2742(int arg0) {
        class134.field2050.method841((byte) 19);
        ++field6755;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class88.field1341[var1] = 0L;
        }
        for (int var2 = 0; ~var2 > -33; ++var2) {
            class377.field5759[var2] = 0L;
        }
        class69.field1043 = arg0;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII)V", line = 71)
    public static final void method2743(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -61 % ((arg2 - 35) / 35);
        ++field6754;
        float var6 = (float) class460.field6830 / (float) class460.field6815;
        int var7 = arg0;
        int var8 = arg4;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg0 * var6);
        } else {
            var7 = (int) ((float) arg4 / var6);
        }
        int var9 = arg1 - (arg0 - var7) / 2;
        int var10 = arg3 - (arg4 - var8) / 2;
        class521.field7721 = -1;
        class83.field1289 = -1;
        class271.field3940 = class460.field6815 * var9 / var7;
        class335.field4715 = -(class460.field6830 * var10 / var8) + class460.field6830;
        class34.method194((byte) -70);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI)[[I", line = 99)
    public final int[][] method27(boolean arg0, int arg1) {
        ++field6757;
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (super.field2189.field6033) {
            int[][] var4 = this.method974(true, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class320.field4579 > var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = 4096 - var7[var11];
            }
        }
        if (!arg0) {
            field6760 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILdh;I)V", line = 149)
    public final void method23(int arg0, class209 arg1, int arg2) {
        ++field6756;
        int var4 = -85 % ((-88 - arg2) / 33);
        if (~arg0 == -1) {
            super.field2183 = arg1.method1428(32122) == 1;
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V", line = 165)
    public class457() {
        super(1, false);
    }
}
