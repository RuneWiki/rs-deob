import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class420 extends class115 {

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public static int field6035 = -14475237;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public static int field6036 = 12;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "I")
    public static int field6040 = 0;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "Ljava/lang/String;")
    public static String field6043 = "Loaded input handler";

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "Z")
    public static boolean field6046 = true;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "Lra;")
    public static class57 field6039;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "(I)Lpm;", line = 5)
    public static final class348 method2606(int arg0) {
        if (arg0 != 0) {
            field6036 = 72;
        }
        ++field6037;
        class348 var1 = (class348) class228.field3110.method2(15056);
        if (var1 != null) {
            var1.method2290((byte) 98);
            var1.method2519(-2107);
            return var1;
        } else {
            class348 var2;
            do {
                var2 = (class348) class240.field3262.method2(15056);
                if (var2 == null) {
                    return null;
                }
                if (~var2.method2220(98) < ~class203.method1299((byte) 5)) {
                    return null;
                }
                var2.method2290((byte) 98);
                var2.method2519(-2107);
            } while ((var2.field5780 & Long.MIN_VALUE) == 0L);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(CI)C", line = 46)
    public static final char method2607(char arg0, int arg1) {
        ++field6034;
        if (arg0 != 181 && ~arg0 != -403) {
            if (arg1 > -48) {
                method2609(-106, (byte) 107);
            }
            return Character.toTitleCase(arg0);
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLbk;I)V", line = 61)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (arg2 == 0) {
            super.field1347 = ~arg1.method1342((byte) -126) == -2;
        }
        if (arg0 < 83) {
            field6040 = 29;
        }
        ++field6033;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V", line = 75)
    private final void method2608(int arg0, int arg1, int arg2) {
        ++field6038;
        int var4 = class43.field530[arg2];
        int var5 = class193.field2634[arg1];
        float var6 = (float) Math.atan2((double) (arg0 + var4), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class433.field6299 = arg1;
            class117.field1392 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class117.field1392 = arg1;
            class433.field6299 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class117.field1392 = -arg1 + class218.field2979;
            class433.field6299 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class117.field1392 = arg2;
            class433.field6299 = -arg1 + class392.field5738;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class433.field6299 = -arg1 + class392.field5738;
            class117.field1392 = class218.field2979 - arg2;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class433.field6299 = class392.field5738 - arg2;
            class117.field1392 = -arg1 + class218.field2979;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class433.field6299 = -arg2 + class392.field5738;
            class117.field1392 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class117.field1392 = -arg2 + class218.field2979;
            class433.field6299 = arg1;
        }
        class117.field1392 &= class92.field1013;
        class433.field6299 &= class315.field4488;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)V", line = 161)
    public static final void method2609(int arg0, byte arg1) {
        if (class299.field4267 == null || ~arg0 < ~class299.field4267.length) {
            class299.field4267 = new int[arg0];
        }
        if (arg1 >= -31) {
            field6043 = null;
        }
        ++field6044;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)[[I", line = 176)
    public final int[][] method144(int arg0, int arg1) {
        int var3 = 110 / ((arg1 - -80) / 45);
        ++field6045;
        int[][] var4 = super.field1342.method2530(arg0, (byte) 110);
        if (super.field1342.field5819) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class218.field2979 < ~var8; ++var8) {
                this.method2608(-2048, arg0, var8);
                int[][] var9 = this.method639((byte) 34, class433.field6299, 0);
                var5[var8] = var9[0][class117.field1392];
                var6[var8] = var9[1][class117.field1392];
                var7[var8] = var9[2][class117.field1392];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[B)Z", line = 217)
    public static final boolean method2610(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field6041;
        boolean var4 = true;
        class211 var5 = new class211(arg3);
        int var6 = -1;
        if (arg1 != 0) {
            method2611(35);
        }
        label56: while (true) {
            int var7 = var5.method1347(arg1 ^ -1063535536);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method1376(128);
                    if (var11 == 0) {
                        continue label56;
                    }
                    var8 += var11 - 1;
                    int var12 = 63 & var8;
                    int var13 = (4093 & var8) >> 6;
                    int var14 = var5.method1342((byte) -126) >> 2;
                    int var15 = var13 - -arg0;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && ~var16 < -1 && ~(class279.field3935 + -1) < ~var15 && ~var16 > ~(class164.field2287 - 1)) {
                        class327 var17 = class157.method1036(0, var6);
                        if (~var14 != -23 || class281.field3945 || ~var17.field4677 != -1 || var17.field4617 == 1 || var17.field4662) {
                            var9 = true;
                            if (!var17.method2025(arg1 ^ 126)) {
                                ++class70.field783;
                                var4 = false;
                            }
                        }
                    }
                }
                int var10 = var5.method1376(128);
                if (var10 == 0) {
                    break;
                }
                var5.method1342((byte) -126);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V", line = 311)
    public class420() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "(I)V", line = 314)
    public static void method2611(int arg0) {
        field6039 = null;
        field6043 = null;
        if (arg0 != 0) {
            method2607('Y', -35);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)[I", line = 329)
    public final int[] method57(int arg0, int arg1) {
        ++field6042;
        int[] var3 = super.field1340.method14(arg1 + 28, arg0);
        if (super.field1340.field35) {
            for (int var4 = 0; ~var4 > ~class218.field2979; ++var4) {
                this.method2608(-2048, arg0, var4);
                int[] var5 = this.method631(true, 0, class433.field6299);
                var3[var4] = var5[class117.field1392];
            }
        }
        if (arg1 != 0) {
            method2611(127);
        }
        return var3;
    }
}
