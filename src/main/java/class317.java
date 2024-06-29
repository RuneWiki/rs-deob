import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class317 extends class40 {

    @OriginalMember(owner = "client!ur", name = "K", descriptor = "I")
    private int field4645 = 32768;

    @OriginalMember(owner = "client!ur", name = "L", descriptor = "[S")
    public static short[] field4646 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ur", name = "U", descriptor = "I")
    public static int field4655 = 0;

    @OriginalMember(owner = "client!ur", name = "R", descriptor = "Lub;")
    public static class15 field4652 = new class15(64);

    @OriginalMember(owner = "client!ur", name = "W", descriptor = "[I")
    public static int[] field4657 = new int[6];

    @OriginalMember(owner = "client!ur", name = "V", descriptor = "I")
    public static int field4656 = 0;

    @OriginalMember(owner = "client!ur", name = "X", descriptor = "Lub;")
    public static class15 field4658 = new class15(64);

    @OriginalMember(owner = "client!ur", name = "Y", descriptor = "[Ljava/lang/String;")
    public static String[] field4659 = new String[8];

    @OriginalMember(owner = "client!ur", name = "Z", descriptor = "[I")
    public static int[] field4660 = new int[100];

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!ur", name = "N", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!ur", name = "O", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!ur", name = "P", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!ur", name = "S", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!ur", name = "T", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!ur", name = "Q", descriptor = "Lbb;")
    public static class182 field4651;

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V", line = 3)
    public class317() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILlf;)V", line = 17)
    public final void method43(int arg0, int arg1, class130 arg2) {
        ++field4649;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field550 = arg2.method837(true) == 1;
            }
        } else {
            this.field4645 = arg2.method798(false) << 4;
        }
        if (arg1 < 79) {
            this.field4645 = -115;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIZII)V", line = 57)
    public static final void method2112(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field4648;
        if (class110.field1418 == arg0) {
            class431.method2693(false, -1);
        } else {
            class374.field5339 = class110.field1418;
            class358.method2335((byte) 49, 0);
        }
        class444.field6346 = arg2;
        class425.field6082 = arg4;
        class425.field6078 = arg1;
        class176.method1251(arg3);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZC)Z", line = 76)
    public static final boolean method2113(boolean arg0, char arg1) {
        ++field4653;
        if (arg1 >= ' ' && ~arg1 >= -127) {
            return true;
        } else if (~arg1 <= -161 && ~arg1 >= -256) {
            return true;
        } else {
            if (arg0) {
                field4646 = null;
            }
            return ~arg1 == -8365 || arg1 == 338 || ~arg1 == -8213 || arg1 == 339 || ~arg1 == -377;
        }
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)V", line = 97)
    public static void method2114(int arg0) {
        if (arg0 < -100) {
            field4651 = null;
            field4652 = null;
            field4660 = null;
            field4646 = null;
            field4658 = null;
            field4659 = null;
            field4657 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)[I", line = 115)
    public final int[] method44(byte arg0, int arg1) {
        ++field4647;
        int[] var3 = super.field551.method185(65280, arg1);
        if (super.field551.field441) {
            int[] var4 = this.method266((byte) -116, arg1, 1);
            int[] var5 = this.method266((byte) -116, arg1, 2);
            for (int var6 = 0; var6 < class410.field5886; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field4645 >> 12;
                int var9 = class185.field2650[var7] * var8 >> 12;
                int var10 = class357.field5166[var7] * var8 >> 12;
                int var11 = class84.field1067 & (var9 >> 12) + var6;
                int var12 = (var10 >> 12) + arg1 & class169.field2395;
                int[] var13 = this.method266((byte) -116, var12, 0);
                var3[var6] = var13[var11];
            }
        }
        return arg0 > -20 ? null : var3;
    }

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "(B)V", line = 164)
    public final void method39(byte arg0) {
        if (arg0 != -23) {
            this.method112(62, 60);
        }
        ++field4650;
        class187.method1341(true);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)[[I", line = 179)
    public final int[][] method112(int arg0, int arg1) {
        if (arg0 != 1) {
            field4659 = null;
        }
        ++field4654;
        int[][] var3 = super.field555.method2070(arg0 + -1, arg1);
        if (super.field555.field4489) {
            int[] var4 = this.method266((byte) -116, arg1, 1);
            int[] var5 = this.method266((byte) -116, arg1, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class410.field5886; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field4645 >> 12;
                int var12 = class185.field2650[var10] * var11 >> 12;
                int var13 = class357.field5166[var10] * var11 >> 12;
                int var14 = class84.field1067 & (var12 >> 12) + var9;
                int var15 = class169.field2395 & (var13 >> 12) + arg1;
                int[][] var16 = this.method261(0, arg0 ^ 28553, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }
}
