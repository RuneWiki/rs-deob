import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class586 extends class573 {

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "[I")
    public static int[] field8458 = new int[4096];

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    public static int field8452;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    public static int field8453;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    public static int field8455;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    public static int field8457;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field8459;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        ++field8454;
        if (arg1 == 0) {
            super.field8334 = arg0.method732(-559537960) == 1;
        }
        if (arg2 != 3) {
            method3353(-13);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIII)I")
    public static final int method3351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8455;
        if (arg0 != -7648) {
            return -78;
        } else if (class485.field6947 == null) {
            return 0;
        } else {
            if (~arg1 > -4) {
                int var6 = arg2 >> 9;
                int var7 = arg5 >> 9;
                if (~arg3 > -1 || arg4 < 0 || class675.field9604 + -1 < arg3 || ~arg4 < ~(class218.field3316 - 1)) {
                    return 0;
                }
                if (var6 < 1 || var7 < 1 || ~(class675.field9604 - 1) > ~var6 || class218.field3316 - 1 < var7) {
                    return 0;
                }
                boolean var8 = (2 & class517.field7301[1][arg2 >> 9][arg5 >> 9]) != 0;
                if ((arg2 & 511) == 0) {
                    boolean var9 = ~(class517.field7301[1][var6 + -1][arg5 >> 9] & 2) != -1;
                    boolean var10 = ~(class517.field7301[1][var6][arg5 >> 9] & 2) != -1;
                    if (var9 == !var10) {
                        var8 = ~(2 & class517.field7301[1][arg3][arg4]) != -1;
                    }
                }
                if (~(511 & arg5) == -1) {
                    boolean var11 = ~(class517.field7301[1][arg2 >> 9][var7 + -1] & 2) != -1;
                    boolean var12 = ~(2 & class517.field7301[1][arg2 >> 9][var7]) != -1;
                    if (!var11 != !var12) {
                        var8 = (class517.field7301[1][arg3][arg4] & 2) != 0;
                    }
                }
                if (var8) {
                    ++arg1;
                }
            }
            return class485.field6947[arg1].method552(1, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field8457;
        if (arg1 != 1) {
            method3351(54, 7, -68, -74, -88, -27);
        }
        int[] var3 = super.field8321.method3164(arg0, -122);
        if (super.field8321.field7825) {
            for (int var4 = 0; class540.field7555 > var4; ++var4) {
                this.method3352(-116, var4, arg0);
                int[] var5 = this.method3292(0, 0, class608.field8859);
                var3[var4] = var5[class117.field2075];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(III)V")
    private final void method3352(int arg0, int arg1, int arg2) {
        ++field8456;
        int var4 = class51.field1194[arg1];
        int var5 = class230.field3460[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        int var7 = 17 / ((arg0 - -28) / 48);
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class117.field2075 = arg1;
            class608.field8859 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class608.field8859 = arg1;
            class117.field2075 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class117.field2075 = class540.field7555 - arg2;
            class608.field8859 = arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class117.field2075 = arg1;
            class608.field8859 = -arg2 + class419.field6037;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class117.field2075 = class540.field7555 - arg1;
            class608.field8859 = -arg2 + class419.field6037;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class608.field8859 = class419.field6037 - arg1;
            class117.field2075 = -arg2 + class540.field7555;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class117.field2075 = arg2;
            class608.field8859 = class419.field6037 - arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class117.field2075 = -arg1 + class540.field7555;
            class608.field8859 = arg2;
        }
        class117.field2075 &= class591.field8492;
        class608.field8859 &= class189.field3019;
    }

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "(I)V")
    public static void method3353(int arg0) {
        field8458 = null;
        if (arg0 < 94) {
            method3353(92);
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        ++field8453;
        int[][] var3 = super.field8320.method1504(arg1, -2);
        if (super.field8320.field3295) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class540.field7555 < ~var7; ++var7) {
                this.method3352(51, var7, arg1);
                int[][] var8 = this.method3293(0, 127, class608.field8859);
                var4[var7] = var8[0][class117.field2075];
                var5[var7] = var8[1][class117.field2075];
                var6[var7] = var8[2][class117.field2075];
            }
        }
        if (arg0 > -116) {
            field8458 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B[Llk;I)V")
    public static final void method3354(byte arg0, class545[] arg1, int arg2) {
        ++field8459;
        int var3 = 0;
        int var4 = -115 % ((-31 - arg0) / 52);
        while (~arg1.length < ~var3) {
            class545 var5 = arg1[var3];
            if (var5 != null) {
                if (var5.field7649 == 0) {
                    if (var5.field7641 != null) {
                        method3354((byte) 71, var5.field7641, arg2);
                    }
                    class601 var6 = (class601) class78.field1572.method2596((long) var5.field7755, 120);
                    if (var6 != null) {
                        class467.method2786(var6.field8614, 32768, arg2);
                    }
                }
                if (~arg2 == -1 && var5.field7666 != null) {
                    class476 var7 = new class476();
                    var7.field6850 = var5;
                    var7.field6842 = var5.field7666;
                    class683.method3847(var7);
                }
                if (arg2 == 1 && var5.field7686 != null) {
                    label60: {
                        if (~var5.field7697 <= -1) {
                            class545 var8 = class415.method2533((byte) -101, var5.field7755);
                            if (var8 == null || var8.field7641 == null || var8.field7641.length <= var5.field7697 || var8.field7641[var5.field7697] != var5) {
                                break label60;
                            }
                        }
                        class476 var9 = new class476();
                        var9.field6850 = var5;
                        var9.field6842 = var5.field7686;
                        class683.method3847(var9);
                    }
                }
            }
            ++var3;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class586() {
        super(1, false);
    }
}
