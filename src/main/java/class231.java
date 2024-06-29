import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class231 extends class23 {

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
    private int field4217 = 4096;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "[I")
    private int[] field4215 = new int[3];

    @OriginalMember(owner = "client!jl", name = "T", descriptor = "I")
    private int field4222 = 4096;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "I")
    private int field4218 = 409;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "I")
    private int field4216 = 4096;

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "Lli;")
    public static class191 field4221 = new class191();

    @OriginalMember(owner = "client!jl", name = "W", descriptor = "[[[B")
    public static byte[][][] field4225 = new byte[4][104][104];

    @OriginalMember(owner = "client!jl", name = "ab", descriptor = "Llc;")
    private static class143 field4229 = class66.method374("wave2:", -1);

    @OriginalMember(owner = "client!jl", name = "Y", descriptor = "Llc;")
    public static class143 field4227 = field4229;

    @OriginalMember(owner = "client!jl", name = "X", descriptor = "Llc;")
    public static class143 field4226 = field4229;

    @OriginalMember(owner = "client!jl", name = "Z", descriptor = "Lob;")
    public static class256 field4228 = new class256();

    @OriginalMember(owner = "client!jl", name = "cb", descriptor = "I")
    public static int field4231 = 1;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!jl", name = "U", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!jl", name = "bb", descriptor = "Lvg;")
    public static class230 field4230;

    @OriginalMember(owner = "client!jl", name = "db", descriptor = "Lcb;")
    public static class248 field4232;

    @OriginalMember(owner = "client!jl", name = "V", descriptor = "Ljava/awt/Font;")
    public static Font field4224;

    @OriginalMember(owner = "client!jl", name = "R", descriptor = "[I")
    public static int[] field4220;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field4226 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            int var5 = arg0.method1282(113);
                            this.field4215[1] = class129.method777(65280, var5) >> 4;
                            this.field4215[0] = class129.method777(var5, 16711680) << 4;
                            this.field4215[2] = class129.method777(255, var5) >> 12;
                        }
                    } else {
                        this.field4216 = arg0.method1275(128);
                    }
                } else {
                    this.field4222 = arg0.method1275(128);
                }
            } else {
                this.field4217 = arg0.method1275(128);
            }
        } else {
            this.field4218 = arg0.method1275(128);
        }
        ++field4219;
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(B)V")
    public static void method1569(byte arg0) {
        field4221 = null;
        field4229 = null;
        field4228 = null;
        field4226 = null;
        field4225 = null;
        if (arg0 != 119) {
            field4224 = null;
        }
        field4232 = null;
        field4224 = null;
        field4227 = null;
        field4220 = null;
        field4230 = null;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
    public class231() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZ)V")
    public static final void method1570(int arg0, boolean arg1) {
        class186.field3380.method835(1, arg0);
        if (!arg1) {
            field4225 = null;
        }
        ++field4214;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        int[][] var3 = super.field366.method209(0, arg0);
        ++field4223;
        if (arg1 != 1) {
            this.field4216 = -5;
        }
        if (super.field366.field508) {
            int[][] var4 = this.method161(arg0, 0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class72.field1359 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field4215[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~this.field4218 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field4215[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field4218) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field4215[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field4218 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field4216 * var12 >> 12;
                            var9[var11] = this.field4222 * var14 >> 12;
                            var10[var11] = this.field4217 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIII)V")
    public static final void method1571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4213;
        int var6 = -arg3 + arg5;
        int var7 = arg2 - arg0;
        if (var6 != 0) {
            if (~var7 == -1) {
                class227.method1551(arg3, arg0, -17089, arg5, arg1);
            } else {
                if (arg4 != 27677) {
                    method1569((byte) -65);
                }
                int var8 = (var7 << 12) / var6;
                int var9 = -(arg3 * var8 >> 12) + arg0;
                int var10;
                int var11;
                if (arg5 < class31.field481) {
                    var10 = class31.field481;
                    var11 = (class31.field481 * var8 >> 12) + var9;
                } else if (~class9.field173 <= ~arg5) {
                    var11 = arg2;
                    var10 = arg5;
                } else {
                    var10 = class9.field173;
                    var11 = var9 - -(class9.field173 * var8 >> 12);
                }
                if (var11 >= class188.field3398) {
                    if (var11 > class239.field4321) {
                        var10 = (-var9 + class239.field4321 << 12) / var8;
                        var11 = class239.field4321;
                    }
                } else {
                    var11 = class188.field3398;
                    var10 = (class188.field3398 - var9 << 12) / var8;
                }
                int var12;
                int var13;
                if (arg3 < class31.field481) {
                    var12 = (class31.field481 * var8 >> 12) + var9;
                    var13 = class31.field481;
                } else if (~class9.field173 <= ~arg3) {
                    var12 = arg0;
                    var13 = arg3;
                } else {
                    var13 = class9.field173;
                    var12 = var9 - -(class9.field173 * var8 >> 12);
                }
                if (~var12 <= ~class188.field3398) {
                    if (class239.field4321 < var12) {
                        var13 = (-var9 + class239.field4321 << 12) / var8;
                        var12 = class239.field4321;
                    }
                } else {
                    var12 = class188.field3398;
                    var13 = (class188.field3398 - var9 << 12) / var8;
                }
                class110.method663(arg1, var13, (byte) 111, var10, var11, var12);
            }
        } else {
            if (var7 != 0) {
                class135.method813(arg2, arg3, arg0, false, arg1);
            }
        }
    }
}
