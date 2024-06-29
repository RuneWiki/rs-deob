import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class146 extends class115 {

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "[B")
    public static byte[] field2050 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!rn", name = "J", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!rn", name = "N", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!rn", name = "O", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!rn", name = "P", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field2048;
        if (arg1 != 0) {
            return null;
        } else {
            int[] var3 = super.field1340.method14(111, arg0);
            if (super.field1340.field35) {
                int var4 = class193.field2634[arg0];
                for (int var5 = 0; ~class218.field2979 < ~var5; ++var5) {
                    var3[var5] = this.method868(var4, class43.field530[var5], 16776960) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIII)Lq;")
    public static final class246 method867(int arg0, int arg1, int arg2, int arg3) {
        ++field2053;
        int var4 = arg3 | arg2 << 8;
        class246 var5 = (class246) class71.field802.method410((byte) -16, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        } else {
            byte[] var6 = class78.field889.method348(class78.field889.method344(-106, var4), 0);
            if (var6 != null) {
                if (~var6.length >= -2) {
                    return null;
                } else {
                    class246 var7 = class350.method2234(var6, arg1 ^ 262148);
                    var7.field3339 = arg3;
                    class71.field802.method414(var7, (byte) 66, (long) var4 << 16);
                    return var7;
                }
            } else {
                int var8 = arg3 | arg0 + 65536 << 8;
                class246 var9 = (class246) class71.field802.method410((byte) -96, (long) var8 << 16);
                if (var9 != null) {
                    return var9;
                } else {
                    if (arg1 != 262144) {
                        field2050 = null;
                    }
                    byte[] var10 = class78.field889.method348(class78.field889.method344(arg1 ^ -262238, var8), 0);
                    if (var10 != null) {
                        if (~var10.length >= -2) {
                            return null;
                        } else {
                            class246 var11 = class350.method2234(var10, 4);
                            var11.field3339 = arg3;
                            class71.field802.method414(var11, (byte) 66, (long) var8 << 16);
                            return var11;
                        }
                    } else {
                        int var12 = 16776960 | arg3;
                        class246 var13 = (class246) class71.field802.method410((byte) -69, (long) var12 << 16);
                        if (var13 != null) {
                            return var13;
                        } else {
                            byte[] var14 = class78.field889.method348(class78.field889.method344(64, var12), 0);
                            if (var14 != null) {
                                if (var14.length <= 1) {
                                    return null;
                                } else {
                                    class246 var15 = class350.method2234(var14, 4);
                                    var15.field3339 = arg3;
                                    class71.field802.method414(var15, (byte) 66, (long) var12 << 16);
                                    return var15;
                                }
                            } else {
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)I")
    private final int method868(int arg0, int arg1, int arg2) {
        ++field2051;
        if (arg2 != 16776960) {
            method870(-125);
        }
        int var4 = arg1 - -(arg0 * 57);
        int var5 = var4 ^ var4 << 1;
        return 4096 - (Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lbk;Z)Lop;")
    public static final class102 method869(class211 arg0, boolean arg1) {
        ++field2052;
        if (!arg1) {
            field2050 = null;
        }
        return new class102(arg0.method1344((byte) -4), arg0.method1344((byte) -4), arg0.method1344((byte) -4), arg0.method1344((byte) -4), arg0.method1353(122), arg0.method1353(109), arg0.method1342((byte) -127));
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
    public class146() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "(I)V")
    public static void method870(int arg0) {
        if (arg0 <= 113) {
            field2050 = null;
        }
        field2050 = null;
    }
}
