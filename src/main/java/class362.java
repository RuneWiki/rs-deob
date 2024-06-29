import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class362 extends class314 {

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "[I")
    public static int[] field5721 = new int[14];

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "Z")
    public static boolean field5725 = true;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZII)V", line = 4)
    private final void method2413(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            ++field5724;
            int var4 = class328.field5091[arg1];
            int var5 = class657.field9166[arg2];
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class73.field917 = arg2;
                class664.field9244 = arg1;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class664.field9244 = arg2;
                class73.field917 = arg1;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class664.field9244 = -arg2 + class81.field1009;
                class73.field917 = arg1;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class73.field917 = -arg2 + class246.field3926;
                class664.field9244 = arg1;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class664.field9244 = -arg1 + class81.field1009;
                class73.field917 = -arg2 + class246.field3926;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class73.field917 = -arg1 + class246.field3926;
                class664.field9244 = -arg2 + class81.field1009;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class664.field9244 = arg2;
                class73.field917 = -arg1 + class246.field3926;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class73.field917 = arg2;
                class664.field9244 = class81.field1009 - arg1;
            }
            class664.field9244 &= class504.field7373;
            class73.field917 &= class66.field849;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)[[I", line = 79)
    public final int[][] method4(int arg0, byte arg1) {
        ++field5726;
        if (arg1 < 68) {
            this.method2413(true, -81, -126);
        }
        int[][] var3 = super.field4931.method1345(arg0, 0);
        if (super.field4931.field2799) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class81.field1009 > var7; ++var7) {
                this.method2413(true, var7, arg0);
                int[][] var8 = this.method2143(0, class73.field917, (byte) -4);
                var4[var7] = var8[0][class664.field9244];
                var5[var7] = var8[1][class664.field9244];
                var6[var7] = var8[2][class664.field9244];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V", line = 124)
    public static void method2414(byte arg0) {
        field5721 = null;
        if (arg0 <= 86) {
            field5725 = false;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILpca;)V", line = 139)
    public static final void method2415(int arg0, class665 arg1) {
        if (~class581.field8274 == ~arg1.field9405) {
            class532.field7753[arg1.field9412] = true;
        }
        ++field5723;
        if (arg0 >= -117) {
            method2415(-45, (class665) null);
        }
    }

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "(I)Lkt;", line = 156)
    public static final class143 method2416(int arg0) {
        ++field5727;
        if (class378.field5883 != null && class508.field7422 != null) {
            if (arg0 != 255) {
                return null;
            } else {
                class508.field7422.method3664((byte) 118, class378.field5883);
                class143 var1 = (class143) class508.field7422.method3663(arg0 + -251);
                if (var1 == null) {
                    return null;
                } else {
                    class257 var2 = class378.field5873.method3286(29982, var1.field2408);
                    return var2 != null && var2.field4095 && var2.method1822((byte) -63, class378.field5870) ? var1 : class680.method3876((byte) -78);
                }
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)[I", line = 189)
    public final int[] method6(int arg0, int arg1) {
        ++field5722;
        int[] var3 = super.field4928.method534((byte) -54, arg0);
        if (super.field4928.field618) {
            for (int var4 = 0; ~var4 > ~class81.field1009; ++var4) {
                this.method2413(true, var4, arg0);
                int[] var5 = this.method2140(0, class73.field917, -125);
                var3[var4] = var5[class664.field9244];
            }
        }
        if (arg1 <= 109) {
            method2415(-45, (class665) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V", line = 223)
    public class362() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLie;I)V", line = 226)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (~arg2 == -1) {
            super.field4936 = ~arg1.method70(-9059) == -2;
        }
        ++field5728;
        if (arg0 > -1) {
            method2416(112);
        }
    }
}
