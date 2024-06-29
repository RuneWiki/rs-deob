import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class189 {

    @OriginalMember(owner = "client!ad", name = "ib", descriptor = "I")
    private int field132 = 0;

    @OriginalMember(owner = "client!ad", name = "jb", descriptor = "I")
    private int field133 = 10;

    @OriginalMember(owner = "client!ad", name = "hb", descriptor = "I")
    private int field131 = 2048;

    @OriginalMember(owner = "client!ad", name = "nb", descriptor = "[J")
    public static long[] field137 = new long[256];

    @OriginalMember(owner = "client!ad", name = "vb", descriptor = "Lgg;")
    public static class63 field145 = class116.method911(43, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!ad", name = "xb", descriptor = "Lgg;")
    public static class63 field147;

    @OriginalMember(owner = "client!ad", name = "wb", descriptor = "Lgg;")
    private static class63 field146;

    @OriginalMember(owner = "client!ad", name = "yb", descriptor = "Lgg;")
    public static class63 field148;

    @OriginalMember(owner = "client!ad", name = "gb", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!ad", name = "kb", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ad", name = "lb", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ad", name = "mb", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!ad", name = "ob", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ad", name = "pb", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ad", name = "sb", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ad", name = "tb", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ad", name = "qb", descriptor = "Ljc;")
    public static class85 field140;

    @OriginalMember(owner = "client!ad", name = "rb", descriptor = "[I")
    private int[] field141;

    @OriginalMember(owner = "client!ad", name = "ub", descriptor = "[I")
    private int[] field144;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        ++field135;
        this.method89(1);
        if (!arg0) {
            method85(-28, (byte) -104, (class54) null);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field132 = arg2.method64(31790);
                }
            } else {
                this.field131 = arg2.method46((byte) 65);
            }
        } else {
            this.field133 = arg2.method64(31790);
        }
        ++field138;
        if (arg1 < 32) {
            method86(80);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBLff;)I")
    public static final int method85(int arg0, byte arg1, class54 arg2) {
        ++field142;
        if (arg2.field1332 != null && ~arg2.field1332.length < ~arg0) {
            try {
                int[] var3 = arg2.field1332[arg0];
                int var4 = 0;
                byte var5 = 0;
                int var6 = 0;
                while (true) {
                    int var7 = var3[var6++];
                    int var8 = 0;
                    byte var9 = 0;
                    if (var7 == 0) {
                        return var4;
                    }
                    if (~var7 == -16) {
                        var9 = 1;
                    }
                    if (var7 == 16) {
                        var9 = 2;
                    }
                    if (var7 == 1) {
                        var8 = class196.field3934[var3[var6++]];
                    }
                    if (~var7 == -3) {
                        var8 = class114.field2551[var3[var6++]];
                    }
                    if (~var7 == -18) {
                        var9 = 3;
                    }
                    if (~var7 == -4) {
                        var8 = class62.field1565[var3[var6++]];
                    }
                    if (var7 == 4) {
                        int var10 = var3[var6++] << 16;
                        int var11 = var10 + var3[var6++];
                        class54 var12 = class59.method555(var11, 32173);
                        int var13 = var3[var6++];
                        if (~var13 != 0 && (!class59.method554(var13, 13319).field2234 || class51.field1259)) {
                            for (int var14 = 0; ~var14 > ~var12.field1324.length; ++var14) {
                                if (~(var13 + 1) == ~var12.field1324[var14]) {
                                    var8 += var12.field1315[var14];
                                }
                            }
                        }
                    }
                    if (var7 == 5) {
                        var8 = class24.field545[var3[var6++]];
                    }
                    if (~var7 == -7) {
                        var8 = class64.field1638[-1 + class114.field2551[var3[var6++]]];
                    }
                    if (~var7 == -8) {
                        var8 = class24.field545[var3[var6++]] * 100 / 46875;
                    }
                    if (~var7 == -9) {
                        var8 = class3.field72.field1569;
                    }
                    if (~var7 == -10) {
                        for (int var15 = 0; ~var15 > -26; ++var15) {
                            if (class91.field2132[var15]) {
                                var8 += class114.field2551[var15];
                            }
                        }
                    }
                    if (~var7 == -11) {
                        int var16 = var3[var6++] << 16;
                        int var17 = var16 + var3[var6++];
                        class54 var18 = class59.method555(var17, 32173);
                        int var19 = var3[var6++];
                        if (var19 != -1 && (!class59.method554(var19, 13319).field2234 || class51.field1259)) {
                            for (int var20 = 0; var18.field1324.length > var20; ++var20) {
                                if (~(var19 + 1) == ~var18.field1324[var20]) {
                                    var8 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (~var7 == -12) {
                        var8 = class132.field2871;
                    }
                    if (var7 == 12) {
                        var8 = class45.field1073;
                    }
                    if (var7 == 13) {
                        int var21 = class24.field545[var3[var6++]];
                        int var22 = var3[var6++];
                        var8 = ~(var21 & 1 << var22) == -1 ? 0 : 1;
                    }
                    if (var7 == 14) {
                        int var23 = var3[var6++];
                        var8 = class27.method264((byte) 17, var23);
                    }
                    if (~var7 == -19) {
                        var8 = (class3.field72.field1141 >> 7) + class3.field110;
                    }
                    if (~var7 == -20) {
                        var8 = (class3.field72.field1144 >> 7) + class38.field921;
                    }
                    if (~var7 == -21) {
                        var8 = var3[var6++];
                    }
                    if (~var9 != -1) {
                        var5 = var9;
                    } else {
                        if (~var5 == -1) {
                            var4 += var8;
                        }
                        if (var5 == 1) {
                            var4 -= var8;
                        }
                        if (var5 == 2 && ~var8 != -1) {
                            var4 /= var8;
                        }
                        if (~var5 == -4) {
                            var4 *= var8;
                        }
                        var5 = 0;
                    }
                }
            } catch (Exception var24) {
                if (arg1 < 61) {
                    method88(-43, false);
                }
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
    public static void method86(int arg0) {
        field140 = null;
        field145 = null;
        field148 = null;
        if (arg0 != 0) {
            field140 = null;
        }
        field146 = null;
        field147 = null;
        field137 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIILff;Lwb;II)V")
    public static final void method87(int arg0, int arg1, int arg2, class54 arg3, class200 arg4, int arg5, int arg6) {
        int var7 = -20 + Math.min(arg3.field1302 / 2, arg3.field1435 / 2);
        if (arg5 > -44) {
            field148 = null;
        }
        int var8 = arg6 * arg6 - -(arg1 * arg1);
        if (~(var7 * var7) > ~var8 && var8 < 90000) {
            int var9 = class68.field1710 + class121.field2690 & 2047;
            int var10 = class25.field571[var9];
            int var11 = class25.field576[var9];
            int var12 = var11 * 256 / (class199.field3977 + 256);
            int var13 = var10 * 256 / (class199.field3977 - -256);
            int var14 = arg1 * var13 + arg6 * var12 >> 16;
            int var15 = arg1 * var12 + -(arg6 * var13) >> 16;
            double var16 = Math.atan2((double) var14, (double) var15);
            int var18 = (int) (Math.sin(var16) * (double) var7);
            int var19 = (int) (Math.cos(var16) * (double) var7);
            class56.field1476.method1322(arg3.field1302 / 2 + arg2 + -10 - (-var18 + -4), -var19 + -20 + arg0 - -(arg3.field1435 / 2), 20, 20, 15, 15, var16, 256);
        } else {
            class6.method93((byte) -54, arg1, arg2, arg3, arg6, arg0, arg4);
        }
        ++field134;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)Z")
    public static final boolean method88(int arg0, boolean arg1) {
        if (arg1) {
            return true;
        } else {
            ++field130;
            return (arg0 >> 21 & 1) != 0;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class5() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
    private final void method89(int arg0) {
        if (arg0 != 1) {
            this.field141 = null;
        }
        this.field141 = new int[this.field133 + 1];
        this.field144 = new int[this.field133 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field133;
        ++field143;
        int var4 = this.field131 * var3 >> 12;
        for (int var5 = 0; this.field133 > var5; ++var5) {
            this.field144[var5] = var2;
            this.field141[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field144[this.field133] = 4096;
        this.field141[this.field133] = this.field141[0] + 4096;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field136;
        int[] var3 = super.field3825.method681(arg1, (byte) -83);
        if (super.field3825.field1840) {
            int var4 = class21.field496[arg1];
            if (this.field132 != 0) {
                for (int var5 = 0; ~var5 > ~class54.field1430; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class35.field825[var5];
                    int var9 = this.field132;
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var4 + -4096 + var8 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; this.field133 > var10; ++var10) {
                        if (~var6 <= ~this.field144[var10] && ~this.field144[var10 + 1] < ~var6) {
                            if (~this.field141[var10] < ~var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~this.field133 < ~var12; ++var12) {
                    if (~var4 <= ~this.field144[var12] && var4 < this.field144[var12 + 1]) {
                        if (~this.field141[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class102.method850(var3, 0, class54.field1430, var11);
            }
        }
        if (arg0 != 0) {
            this.method90(-25, -47);
        }
        return var3;
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; ++var3) {
                if ((var1 & 1L) != 1L) {
                    var1 >>>= 1;
                } else {
                    var1 = -3932672073523589310L ^ var1 >>> 1;
                }
            }
            field137[var0] = var1;
        }
        field147 = class116.method911(43, "RuneScape wird geladen )2 bitte warten)3)3)3");
        field146 = class116.method911(43, "Loaded fonts");
        field148 = field146;
    }
}
