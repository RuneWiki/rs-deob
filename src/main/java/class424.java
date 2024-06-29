import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class424 extends class61 {

    @OriginalMember(owner = "client!gt", name = "Hb", descriptor = "Lsb;")
    public static class266 field6128 = new class266(20, 3);

    @OriginalMember(owner = "client!gt", name = "Jb", descriptor = "Lmo;")
    public static class695 field6130 = new class695("WIP", 2);

    @OriginalMember(owner = "client!gt", name = "Db", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!gt", name = "Eb", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!gt", name = "Fb", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!gt", name = "Gb", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!gt", name = "Ib", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(I)V")
    public class424(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "(I)V")
    public static void method2581(int arg0) {
        field6128 = null;
        field6130 = null;
        if (arg0 != -15131) {
            method2581(-99);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II[IIIIBI)Z")
    public static final boolean method2582(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (~arg3 < ~class356.field5332) {
            arg3 = class356.field5332;
        }
        ++field6125;
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (~arg1 <= ~arg3) {
            return true;
        } else {
            int var8 = -arg1 + arg3 >> 2;
            if (arg6 <= 52) {
                return true;
            } else {
                int var9 = arg1 * arg4 + arg5;
                int var10 = arg1 + -1 + arg0;
                int var10000;
                if (class444.field6397 != 1) {
                    var9 -= 15360;
                    while (true) {
                        --var8;
                        if (~var8 > -1) {
                            int var11 = arg3 - arg1 & 3;
                            while (true) {
                                --var11;
                                if (~var11 > -1) {
                                    return true;
                                }
                                ++var10;
                                if (arg2[var10] > var9) {
                                    return false;
                                }
                                var9 += arg4;
                            }
                        }
                        ++var10;
                        if (var9 < arg2[var10]) {
                            return false;
                        }
                        int var12 = arg4 + var9;
                        var10000 = ~var12;
                        ++var10;
                        if (var10000 > ~arg2[var10]) {
                            return false;
                        }
                        int var13 = arg4 + var12;
                        ++var10;
                        if (~arg2[var10] < ~var13) {
                            return false;
                        }
                        int var14 = arg4 + var13;
                        ++var10;
                        if (arg2[var10] > var14) {
                            return false;
                        }
                        var9 = arg4 + var14;
                    }
                } else {
                    class481.field6911 += var8;
                    while (true) {
                        --var8;
                        if (var8 < 0) {
                            int var15 = -arg1 + arg3 & 3;
                            while (true) {
                                --var15;
                                if (var15 < 0) {
                                    return true;
                                }
                                var10000 = ~var9;
                                ++var10;
                                if (var10000 > ~arg2[var10]) {
                                    arg2[var10] = var9;
                                }
                                var9 += arg4;
                            }
                        }
                        var10000 = ~var9;
                        ++var10;
                        if (var10000 > ~arg2[var10]) {
                            arg2[var10] = var9;
                        }
                        int var16 = arg4 + var9;
                        ++var10;
                        if (var16 < arg2[var10]) {
                            arg2[var10] = var16;
                        }
                        int var17 = arg4 + var16;
                        ++var10;
                        if (~arg2[var10] < ~var17) {
                            arg2[var10] = var17;
                        }
                        int var18 = arg4 + var17;
                        var10000 = ~var18;
                        ++var10;
                        if (var10000 > ~arg2[var10]) {
                            arg2[var10] = var18;
                        }
                        var9 = arg4 + var18;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(FI)V")
    public final void method2583(float arg0, int arg1) {
        ++field6124;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field1397[super.field1393++] = (byte) (var3 >> 24);
        super.field1397[super.field1393++] = (byte) (var3 >> 16);
        super.field1397[super.field1393++] = (byte) (var3 >> 8);
        super.field1397[super.field1393++] = (byte) var3;
        if (arg1 > -69) {
            method2581(88);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IF)V")
    public final void method2584(int arg0, float arg1) {
        ++field6126;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field1397[super.field1393++] = (byte) var3;
        if (arg0 == 0) {
            super.field1397[super.field1393++] = (byte) (var3 >> 8);
            super.field1397[super.field1393++] = (byte) (var3 >> 16);
            super.field1397[super.field1393++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lqh;B)Lbba;")
    public static final class99 method2585(class61 arg0, byte arg1) {
        if (arg1 != -50) {
            method2585((class61) null, (byte) 70);
        }
        ++field6129;
        int var2 = arg0.method730(116);
        return new class99(var2);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method2586(long arg0, byte arg1) {
        ++field6127;
        if (~arg0 < -1L && ~arg0 > -6582952005840035282L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                if (arg1 != -42) {
                    field6130 = null;
                }
                while (~arg0 != -1L) {
                    long var7 = arg0;
                    arg0 /= 37L;
                    var6.append(class481.field6910[(int) (-(arg0 * 37L) + var7)]);
                }
                return var6.reverse().toString();
            }
        } else {
            return null;
        }
    }
}
