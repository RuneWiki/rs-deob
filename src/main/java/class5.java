import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 extends class220 {

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
    public static int field45 = 0;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "Z")
    public static boolean field46;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field49;
        if (arg0 != -11543) {
            return null;
        } else {
            int[] var3 = super.field3125.method2005(arg1, (byte) 119);
            if (super.field3125.field4676) {
                int[] var4 = this.method1366(0, (byte) -40, arg1);
                for (int var5 = 0; ~var5 > ~class344.field5043; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class5() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        ++field43;
        if (arg1 != 0) {
            this.method1(60, -122);
        }
        int[][] var3 = super.field3135.method1774(arg0, -2);
        if (super.field3135.field4087) {
            int[][] var4 = this.method1369(0, (byte) 117, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class344.field5043; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method44(boolean arg0, String arg1) {
        if (!arg0) {
            method46(true, -125);
        }
        ++field44;
        for (int var2 = 0; ~var2 > ~class284.field4150.length; ++var2) {
            if (class284.field4150[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIII)I")
    public static final int method45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field42;
        if (class88.field1226 == null) {
            return 0;
        } else if (arg0 != -668) {
            return 11;
        } else {
            if (~arg3 > -4) {
                int var6 = arg1 >> 7;
                int var7 = arg5 >> 7;
                if (arg4 < 0 || ~arg2 > -1 || ~arg4 < ~(class324.field4652 + -1) || arg2 > class336.field4964 + -1) {
                    return 0;
                }
                if (~var6 > -2 || var7 < 1 || class324.field4652 + -1 < var6 || var7 > class336.field4964 + -1) {
                    return 0;
                }
                boolean var8 = ~(class37.field606[1][arg1 >> 7][arg5 >> 7] & 2) != -1;
                if (~(127 & arg1) == -1) {
                    boolean var9 = ~(2 & class37.field606[1][var6 + -1][arg5 >> 7]) != -1;
                    boolean var10 = (2 & class37.field606[1][var6][arg5 >> 7]) != 0;
                    if (!var10 != !var9) {
                        var8 = ~(class37.field606[1][arg4][arg2] & 2) != -1;
                    }
                }
                if (~(arg5 & 127) == -1) {
                    boolean var11 = ~(2 & class37.field606[1][arg1 >> 7][var7 + -1]) != -1;
                    boolean var12 = (2 & class37.field606[1][arg1 >> 7][var7]) != 0;
                    if (var12 == !var11) {
                        var8 = (2 & class37.field606[1][arg4][arg2]) != 0;
                    }
                }
                if (var8) {
                    ++arg3;
                }
            }
            return class88.field1226[arg3].method797(arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IBLil;)V")
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (arg0 == 0) {
            super.field3131 = ~arg2.method1697(arg1 ^ 69) == -2;
        }
        ++field47;
        if (arg1 != -49) {
            field45 = 32;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)V")
    public static final void method46(boolean arg0, int arg1) {
        ++field50;
        if (!arg0 != !field46) {
            field46 = arg0;
            class410.method2666(104);
            int var2 = -121 / ((11 - arg1) / 50);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Loq;IIIII)V")
    public static final void method47(class120 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field1611 = 0;
        for (int var6 = 0; var6 < 4; ++var6) {
            if (arg0.field1610[var6] != null) {
                ++arg0.field1611;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field1611; ++var7) {
            int var8 = class38.field612[arg1][arg2][arg3];
            while (var8 != 0) {
                class413 var12 = class74.field997[(var8 & 255) - 1];
                var8 >>>= 8;
                if (arg0.field1610[var7] == var12) {
                    continue label50;
                }
            }
            int var9 = class38.field612[arg1][arg4][arg5];
            while (var9 != 0) {
                class413 var11 = class74.field997[(var9 & 255) - 1];
                var9 >>>= 8;
                if (arg0.field1610[var7] == var11) {
                    continue label50;
                }
            }
            for (int var10 = var7; var10 < arg0.field1611 - 1; ++var10) {
                arg0.field1610[var10] = arg0.field1610[var10 + 1];
            }
            --arg0.field1611;
        }
    }
}
