import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class126 extends class212 {

    @OriginalMember(owner = "client!oa", name = "gb", descriptor = "I")
    private int field2092 = 0;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
    private int field2081 = 2048;

    @OriginalMember(owner = "client!oa", name = "cb", descriptor = "I")
    private int field2088 = 10;

    @OriginalMember(owner = "client!oa", name = "ib", descriptor = "Ltd;")
    public static class256 field2094 = new class256(0, 0);

    @OriginalMember(owner = "client!oa", name = "lb", descriptor = "Lsc;")
    private static class181 field2097 = class149.method967(255, "Loaded fonts");

    @OriginalMember(owner = "client!oa", name = "kb", descriptor = "I")
    public static int field2096 = 0;

    @OriginalMember(owner = "client!oa", name = "mb", descriptor = "Lsc;")
    public static class181 field2098 = field2097;

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!oa", name = "ab", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!oa", name = "bb", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!oa", name = "db", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!oa", name = "eb", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!oa", name = "fb", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!oa", name = "hb", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "Lwf;")
    public static class204 field2085;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "[I")
    private int[] field2080;

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "[I")
    private int[] field2083;

    @OriginalMember(owner = "client!oa", name = "nb", descriptor = "[I")
    public static int[] field2099;

    @OriginalMember(owner = "client!oa", name = "jb", descriptor = "[[[B")
    public static byte[][][] field2095;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)V")
    public static void method816(byte arg0) {
        if (arg0 > -68) {
            field2098 = null;
        }
        field2094 = null;
        field2095 = null;
        field2085 = null;
        field2099 = null;
        field2098 = null;
        field2097 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        ++field2086;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field2092 = arg0.method1516((byte) 82);
                }
            } else {
                this.field2081 = arg0.method1535(~arg2);
            }
        } else {
            this.field2088 = arg0.method1516((byte) 82);
        }
        if (arg2 != -3) {
            this.field2092 = -69;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        if (arg1 < 25) {
            this.method46(true);
        }
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            int var4 = class176.field3090[arg0];
            if (this.field2092 != 0) {
                for (int var5 = 0; class26.field452 > var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class253.field4416[var5];
                    int var9 = this.field2092;
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (var9 == 3) {
                                var6 = 2048 - -(-var4 + var8 >> 1);
                            }
                        } else {
                            var6 = 2048 - -(var8 - -var4 - 4096 >> 1);
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; this.field2088 > var10; ++var10) {
                        if (~this.field2083[var10] >= ~var6 && ~this.field2083[var10 + 1] < ~var6) {
                            if (this.field2080[var10] > var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field2088; ++var12) {
                    if (var4 >= this.field2083[var12] && var4 < this.field2083[var12 - -1]) {
                        if (~var4 > ~this.field2080[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class252.method1719(var3, 0, class26.field452, var11);
            }
        }
        ++field2093;
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
    public static final void method817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2090;
        for (int var6 = arg3; var6 <= arg1; ++var6) {
            class171.method1133(class149.field2507[var6], arg5, arg0, arg2, (byte) 125);
        }
        if (arg4 != -4780) {
            field2095 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)Z")
    public static final boolean method818(int arg0, int arg1, int arg2, int arg3) {
        if (!class5.method42(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            int var6 = class31.field505[arg0][arg1][arg2] - 1;
            int var7 = var6 - 120;
            int var8 = var6 - 230;
            int var9 = var6 - 238;
            if (arg3 < 16) {
                if (arg3 == 1) {
                    if (var4 > class146.field2391) {
                        if (!class222.method1473(var4, var6, var5)) {
                            return false;
                        }
                        if (!class222.method1473(var4, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class222.method1473(var4, var7, var5)) {
                            return false;
                        }
                        if (!class222.method1473(var4, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class222.method1473(var4, var8, var5)) {
                        return false;
                    }
                    if (!class222.method1473(var4, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 2) {
                    if (var5 < class45.field699) {
                        if (!class222.method1473(var4, var6, var5 + 128)) {
                            return false;
                        }
                        if (!class222.method1473(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class222.method1473(var4, var7, var5 + 128)) {
                            return false;
                        }
                        if (!class222.method1473(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class222.method1473(var4, var8, var5 + 128)) {
                        return false;
                    }
                    if (!class222.method1473(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 4) {
                    if (var4 < class146.field2391) {
                        if (!class222.method1473(var4 + 128, var6, var5)) {
                            return false;
                        }
                        if (!class222.method1473(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class222.method1473(var4 + 128, var7, var5)) {
                            return false;
                        }
                        if (!class222.method1473(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class222.method1473(var4 + 128, var8, var5)) {
                        return false;
                    }
                    if (!class222.method1473(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 8) {
                    if (var5 > class45.field699) {
                        if (!class222.method1473(var4, var6, var5)) {
                            return false;
                        }
                        if (!class222.method1473(var4 + 128, var6, var5)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class222.method1473(var4, var7, var5)) {
                            return false;
                        }
                        if (!class222.method1473(var4 + 128, var7, var5)) {
                            return false;
                        }
                    }
                    if (!class222.method1473(var4, var8, var5)) {
                        return false;
                    }
                    if (!class222.method1473(var4 + 128, var8, var5)) {
                        return false;
                    }
                    return true;
                }
            }
            if (!class222.method1473(var4 + 64, var9, var5 + 64)) {
                return false;
            } else if (arg3 == 16) {
                return class222.method1473(var4, var8, var5 + 128);
            } else if (arg3 == 32) {
                return class222.method1473(var4 + 128, var8, var5 + 128);
            } else if (arg3 == 64) {
                return class222.method1473(var4 + 128, var8, var5);
            } else if (arg3 == 128) {
                return class222.method1473(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    public class126() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        ++field2082;
        this.method820(-81);
        if (!arg0) {
            field2099 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
    public static final void method819(boolean arg0) {
        class128.field2120.method1790(0);
        if (arg0) {
            class115.field1876.method1790(0);
            ++field2089;
        }
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    private final void method820(int arg0) {
        this.field2083 = new int[this.field2088 + 1];
        ++field2084;
        int var2 = 0;
        if (arg0 <= -44) {
            int var3 = 4096 / this.field2088;
            this.field2080 = new int[this.field2088 + 1];
            int var4 = this.field2081 * var3 >> 12;
            for (int var5 = 0; ~var5 > ~this.field2088; ++var5) {
                this.field2083[var5] = var2;
                this.field2080[var5] = var2 + var4;
                var2 += var3;
            }
            this.field2083[this.field2088] = 4096;
            this.field2080[this.field2088] = this.field2080[0] + 4096;
        }
    }
}
