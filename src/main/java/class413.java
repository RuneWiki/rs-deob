import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class413 extends class13 {

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "[I")
    public static int[] field5861 = new int[13];

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "Lnq;")
    public static class268 field5858;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V", line = 3)
    public static void method2589(int arg0) {
        field5861 = null;
        field5858 = null;
        if (arg0 < 50) {
            field5858 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLjava/lang/String;)I", line = 15)
    public static final int method2590(byte arg0, String arg1) {
        ++field5855;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            var3 = arg1.charAt(var4) + -var3 + (var3 << 5);
        }
        int var5 = -85 % ((arg0 - -32) / 39);
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)[[I", line = 37)
    public final int[][] method222(int arg0, int arg1) {
        ++field5856;
        int[][] var3 = super.field256.method1930(arg1, (byte) 103);
        if (super.field256.field4154) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class269.field3751; ++var7) {
                this.method2591(arg0 ^ -27813, arg1, var7);
                int[][] var8 = this.method227(false, class198.field2733, 0);
                var4[var7] = var8[0][class133.field1918];
                var5[var7] = var8[1][class133.field1918];
                var6[var7] = var8[2][class133.field1918];
            }
        }
        if (arg0 != -27832) {
            method2590((byte) 46, (String) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(III)V", line = 79)
    private final void method2591(int arg0, int arg1, int arg2) {
        ++field5859;
        if (arg0 > 3) {
            int var4 = class296.field4148[arg2];
            int var5 = class277.field3873[arg1];
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class198.field2733 = arg1;
                class133.field1918 = arg2;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class198.field2733 = arg2;
                class133.field1918 = arg1;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class198.field2733 = arg2;
                class133.field1918 = -arg1 + class269.field3751;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class198.field2733 = field5862 - arg1;
                class133.field1918 = arg2;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class133.field1918 = class269.field3751 - arg2;
                class198.field2733 = field5862 - arg1;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class133.field1918 = -arg1 + class269.field3751;
                class198.field2733 = field5862 - arg2;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class133.field1918 = arg1;
                class198.field2733 = field5862 - arg2;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class198.field2733 = arg1;
                class133.field1918 = -arg2 + class269.field3751;
            }
            class133.field1918 &= class343.field4677;
            class198.field2733 &= class123.field1710;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)[I", line = 154)
    public final int[] method29(boolean arg0, int arg1) {
        ++field5860;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (!arg0) {
            field5858 = null;
        }
        if (super.field263.field1845) {
            for (int var4 = 0; ~var4 > ~class269.field3751; ++var4) {
                this.method2591(62, arg1, var4);
                int[] var5 = this.method223(0, -11541, class198.field2733);
                var3[var4] = var5[class133.field1918];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lkh;BI)V", line = 190)
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (arg1 <= 50) {
            field5858 = null;
        }
        if (~arg2 == -1) {
            super.field259 = ~arg0.method172((byte) 52) == -2;
        }
        ++field5863;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V", line = 204)
    public static final void method2592(boolean arg0) {
        ++field5857;
        if (!class41.field603) {
            class128.field1806 = true;
            class41.field603 = arg0;
            if (!class133.field1916) {
                class51.field721 += (-class51.field721 + 12.0F) / 2.0F;
            } else {
                class24.field416 = (float) ((int) class24.field416 - -47 & -16);
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V", line = 232)
    public class413() {
        super(1, false);
    }
}
