import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class288 extends class300 {

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "I")
    private int field4649 = 4096;

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "I")
    private int field4646 = 4096;

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
    private int field4651 = 4096;

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "[J")
    public static long[] field4652 = new long[256];

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4655;

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "[S")
    public static short[] field4654;

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field4657;

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "Ljava/lang/String;")
    public static String field4656;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZZ)V")
    public static final void method1965(boolean arg0, boolean arg1) {
        class3.field46 = arg1;
        ++field4648;
        if (!arg0) {
            class15.field216 = !class60.method384(-4);
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(B)V")
    public static void method1966(byte arg0) {
        field4654 = null;
        field4652 = null;
        if (arg0 > 61) {
            field4657 = null;
            field4655 = null;
            field4656 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        ++field4650;
        int var3 = 126 % (-arg0 / 47);
        int[][] var4 = super.field4786.method538(arg1, (byte) 126);
        if (super.field4786.field1200) {
            int[][] var5 = this.method2021(arg1, false, 0);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var4[0];
            int[] var9 = var4[2];
            int[] var10 = var4[1];
            int[] var11 = var5[2];
            for (int var12 = 0; ~class180.field2826 < ~var12; ++var12) {
                int var13 = var7[var12];
                int var14 = var11[var12];
                int var15 = var6[var12];
                if (var13 == var14 && var14 == var15) {
                    var8[var12] = this.field4646 * var13 >> 12;
                    var10[var12] = this.field4651 * var14 >> 12;
                    var9[var12] = this.field4649 * var15 >> 12;
                } else {
                    var8[var12] = this.field4646;
                    var10[var12] = this.field4651;
                    var9[var12] = this.field4649;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    public class288() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field4649 = arg0.method1186((byte) -95);
                }
            } else {
                this.field4651 = arg0.method1186((byte) -115);
            }
        } else {
            this.field4646 = arg0.method1186((byte) -124);
        }
        ++field4647;
        if (arg1 > -43) {
            this.field4646 = -86;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if (~(1L & var1) == -2L) {
                    var1 = -3932672073523589310L ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field4652[var0] = var1;
        }
        field4655 = "Loaded world list data";
        field4653 = -1;
        field4654 = new short[] { 6798, 8741, 25238, 4626, 4550 };
        field4657 = "flash3:";
        field4656 = "scroll:";
    }
}
