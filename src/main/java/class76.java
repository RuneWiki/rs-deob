import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class76 extends class136 {

    @OriginalMember(owner = "client!wb", name = "Hb", descriptor = "Z")
    public static boolean field1239 = false;

    @OriginalMember(owner = "client!wb", name = "Rb", descriptor = "Ljava/lang/String;")
    public static String field1249 = "wave:";

    @OriginalMember(owner = "client!wb", name = "Kb", descriptor = "[J")
    public static long[] field1242 = new long[32];

    @OriginalMember(owner = "client!wb", name = "Qb", descriptor = "Ljava/lang/String;")
    public static String field1248 = "Loaded sprites";

    @OriginalMember(owner = "client!wb", name = "Xb", descriptor = "[I")
    public static int[] field1255 = new int[14];

    @OriginalMember(owner = "client!wb", name = "Fb", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!wb", name = "Gb", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!wb", name = "Ib", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!wb", name = "Jb", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!wb", name = "Lb", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!wb", name = "Mb", descriptor = "I")
    private int field1244;

    @OriginalMember(owner = "client!wb", name = "Nb", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!wb", name = "Ob", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!wb", name = "Pb", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!wb", name = "Tb", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!wb", name = "Ub", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!wb", name = "Wb", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!wb", name = "Sb", descriptor = "Lsd;")
    private class156 field1250;

    @OriginalMember(owner = "client!wb", name = "Vb", descriptor = "[[[I")
    public static int[][][] field1253;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZII)I")
    public static final int method601(boolean arg0, int arg1, int arg2) {
        ++field1245;
        if (arg0) {
            return -113;
        } else {
            int var3 = arg2 >>> 31;
            return (arg2 + var3) / arg1 + -var3;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)J")
    public static final long method602(int arg0, int arg1, int arg2) {
        class129 var3 = class26.field455[arg0][arg1][arg2];
        return var3 != null && var3.field2144 != null ? var3.field2144.field2107 : 0L;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[I)V")
    public final void method603(int arg0, int[] arg1) {
        this.field1250 = new class156(arg1);
        ++field1252;
        if (arg0 != 9801) {
            field1248 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lta;)V")
    public static final void method604(class190 arg0) {
        for (int var1 = arg0.field3115; var1 <= arg0.field3114; ++var1) {
            for (int var2 = arg0.field3110; var2 <= arg0.field3108; ++var2) {
                class129 var3 = class26.field455[arg0.field3116][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2142; ++var4) {
                        if (var3.field2131[var4] == arg0) {
                            --var3.field2142;
                            for (int var5 = var4; var5 < var3.field2142; ++var5) {
                                var3.field2131[var5] = var3.field2131[var5 + 1];
                                var3.field2125[var5] = var3.field2125[var5 + 1];
                            }
                            var3.field2131[var3.field2142] = null;
                            break;
                        }
                    }
                    var3.field2130 = 0;
                    for (int var6 = 0; var6 < var3.field2142; ++var6) {
                        var3.field2130 |= var3.field2125[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "(B)V")
    public final void method605(byte arg0) {
        super.field2231 = (this.field1244 + 7) / 8;
        ++field1243;
        int var2 = -79 / ((arg0 - -31) / 34);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIB[B)V")
    public final void method606(int arg0, int arg1, byte arg2, byte[] arg3) {
        for (int var5 = 0; ~var5 > ~arg1; ++var5) {
            arg3[arg0 + var5] = (byte) (super.field2263[super.field2231++] + -this.field1250.method1127(class172.method1232(arg2, -29823)));
        }
        if (arg2 != -45) {
            field1242 = null;
        }
        ++field1251;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(IB)V")
    public final void method607(int arg0, byte arg1) {
        super.field2263[super.field2231++] = (byte) (this.field1250.method1127(29778) + arg0);
        if (arg1 > 58) {
            ++field1246;
        }
    }

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "(I)V")
    public final void method608(int arg0) {
        if (arg0 == 1) {
            ++field1241;
            this.field1244 = super.field2231 * 8;
        }
    }

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "(I)V")
    public static void method609(int arg0) {
        field1248 = null;
        field1249 = null;
        if (arg0 == 15418) {
            field1253 = null;
            field1255 = null;
            field1242 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I)V")
    public class76(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(Z)I")
    public final int method610(boolean arg0) {
        ++field1238;
        if (arg0) {
            this.method613(-28, 102);
        }
        return 255 & super.field2263[super.field2231++] - this.field1250.method1127(29778);
    }

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "(II)V")
    public static final void method611(int arg0, int arg1) {
        ++field1247;
        if (class279.method1878(arg1 ^ arg1, arg0)) {
            class114[] var2 = class128.field2119[arg0];
            for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                class114 var4 = var2[var3];
                if (var4 != null) {
                    var4.field1825 = 0;
                    var4.field1912 = 1;
                    var4.field1819 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "(II)I")
    public final int method612(int arg0, int arg1) {
        ++field1237;
        int var3 = -(this.field1244 & 7) + 8;
        int var4 = this.field1244 >> 3;
        int var5 = 0;
        this.field1244 += arg0;
        if (arg1 > -118) {
            return -6;
        } else {
            while (~var3 > ~arg0) {
                var5 += (class2.field22[var3] & super.field2263[var4++]) << -var3 + arg0;
                arg0 -= var3;
                var3 = 8;
            }
            int var6;
            if (~arg0 == ~var3) {
                var6 = (class2.field22[var3] & super.field2263[var4]) + var5;
            } else {
                var6 = (super.field2263[var4] >> -arg0 + var3 & class2.field22[arg0]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "(II)I")
    public final int method613(int arg0, int arg1) {
        ++field1254;
        int var3 = 60 / ((-11 - arg0) / 49);
        return arg1 * 8 + -this.field1244;
    }
}
