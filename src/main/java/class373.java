import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class373 extends class37 {

    @OriginalMember(owner = "client!ur", name = "J", descriptor = "Z")
    public boolean field5020 = false;

    @OriginalMember(owner = "client!ur", name = "D", descriptor = "I")
    private int field5014 = 0;

    @OriginalMember(owner = "client!ur", name = "C", descriptor = "I")
    private int field5013 = 0;

    @OriginalMember(owner = "client!ur", name = "V", descriptor = "I")
    private int field5032 = -1;

    @OriginalMember(owner = "client!ur", name = "Z", descriptor = "I")
    private int field5036 = 0;

    @OriginalMember(owner = "client!ur", name = "W", descriptor = "I")
    private int field5033 = -32768;

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
    public int field5023;

    @OriginalMember(owner = "client!ur", name = "O", descriptor = "I")
    private int field5025;

    @OriginalMember(owner = "client!ur", name = "H", descriptor = "I")
    private int field5018;

    @OriginalMember(owner = "client!ur", name = "B", descriptor = "Ldc;")
    private class5 field5012;

    @OriginalMember(owner = "client!ur", name = "U", descriptor = "Lwl;")
    public static class280 field5031 = new class280();

    @OriginalMember(owner = "client!ur", name = "bb", descriptor = "Lra;")
    public static class70 field5038 = new class70(8, 0, 4, 1);

    @OriginalMember(owner = "client!ur", name = "db", descriptor = "Ljava/util/Random;")
    public static Random field5040 = new Random();

    @OriginalMember(owner = "client!ur", name = "E", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!ur", name = "F", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!ur", name = "G", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!ur", name = "I", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!ur", name = "K", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!ur", name = "L", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!ur", name = "P", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!ur", name = "Q", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!ur", name = "R", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!ur", name = "S", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!ur", name = "T", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!ur", name = "X", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!ur", name = "Y", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!ur", name = "ab", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!ur", name = "N", descriptor = "Llr;")
    private class527 field5024;

    @OriginalMember(owner = "client!ur", name = "cb", descriptor = "[Lf;")
    public static class529[] field5039;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method343(int arg0, int arg1, class162 arg2, int arg3) {
        ++field5030;
        if (arg0 != -1) {
            this.field5032 = 38;
        }
        return false;
    }

    @OriginalMember(owner = "client!ur", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field5024 != null) {
            this.field5024.method3099();
        }
        ++field5026;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
    public static final void method2154(int arg0) {
        ++field5021;
        int var1 = class252.field3333.length;
        int var2 = 0;
        if (arg0 == 14583) {
            while (var2 < var1) {
                if (class252.field3333[var2] != null) {
                    int var3 = -1;
                    for (int var4 = 0; ~class13.field253 < ~var4; ++var4) {
                        if (class308.field4054[var4] == class149.field2131[var2]) {
                            var3 = var4;
                            break;
                        }
                    }
                    if (var3 == -1) {
                        class308.field4054[class13.field253] = class149.field2131[var2];
                        var3 = class13.field253++;
                    }
                    class379 var5 = new class379(class252.field3333[var2]);
                    int var6 = 0;
                    while (~class252.field3333[var2].length < ~var5.field5173 && var6 < 511 && ~class60.field942 > -1024) {
                        int var7 = var3 | var6++ << 6;
                        int var8 = var5.method2212((byte) 83);
                        int var9 = var8 >> 14;
                        int var10 = 63 & var8 >> 7;
                        int var11 = 63 & var8;
                        int var12 = (class149.field2131[var2] >> 8) * 64 + var10 - class401.field5382;
                        int var13 = (class149.field2131[var2] & 255) * 64 - -var11 + -class421.field5762;
                        class506 var14 = class206.field2849.method2554(117, var5.method2212((byte) 83));
                        if (class291.field3822[var7] == null && ~(var14.field6993 & 1) < -1 && class455.field6229 == var9 && ~var12 <= -1 && ~class12.field251 < ~(var14.field6956 + var12) && ~var13 <= -1 && ~(var13 - -var14.field6956) > ~class289.field3782) {
                            class291.field3822[var7] = new class117();
                            class291.field3822[var7].field6170 = var7;
                            class117 var15 = class291.field3822[var7];
                            class162.field2369[class60.field942++] = var7;
                            var15.field6235 = class31.field516;
                            var15.method803(var14, (byte) 124);
                            var15.method2589(var15.field1661.field6956, (byte) 39);
                            var15.field6177 = var15.field1661.field6963 << 3;
                            if (var15.field6177 != 0) {
                                var15.method2593((var15.field1661.field6992 + 4 & 1501560839) << 11, false);
                            } else {
                                var15.method2593(0, false);
                            }
                            var15.method800(0, true, var13, var15.method2590(0), var12, var9);
                        }
                    }
                }
                ++var2;
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field5023 = arg2 - -arg1;
        this.field5014 = arg12;
        this.field5025 = arg0;
        this.field5018 = arg4;
        class155 var14 = class441.field6049.method725(14896, this.field5025);
        int var15 = var14.field2271;
        if (var15 == -1) {
            this.field5020 = true;
        } else {
            this.field5012 = class423.field5791.method1601(var15, (byte) -122);
            this.field5020 = false;
        }
        if (this.field5023 == arg2) {
            class291.method1711(this.field5012, this.field5013, super.field574, -124, super.field573, super.field584, false);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILqa;II)Lc;")
    private final class121 method2155(int arg0, class162 arg1, int arg2, int arg3) {
        ++field5035;
        if (arg2 >= -52) {
            return null;
        } else {
            class155 var5 = class441.field6049.method725(14896, arg0);
            class35 var6 = class209.field2868[super.field573];
            class35 var7 = ~this.field5018 <= -4 ? null : class209.field2868[this.field5018 - -1];
            return !this.field5020 ? var5.method1066(this.field5036, true, -129, var7, super.field568, this.field5013, arg1, super.field574, arg3, class423.field5791, var6, this.field5032, super.field584) : var5.method1066(0, true, -129, var7, super.field568, -1, arg1, super.field574, arg3, class423.field5791, var6, -1, super.field584);
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(ILqa;)Lfm;")
    public final class514 method339(int arg0, class162 arg1) {
        ++field5034;
        class121 var3 = this.method2155(this.field5025, arg1, -103, (this.field5014 == 0 ? 0 : 5) | 2048);
        if (var3 == null) {
            return null;
        } else if (arg0 != 9124) {
            return null;
        } else {
            if (~this.field5014 != -1) {
                var3.method838(this.field5014 * 2048);
            }
            class414 var4 = arg1.method611();
            var4.method971(super.field584, super.field568, super.field574);
            if (this.field5024 == null) {
                var3.method853(var4, (class357) null, 0);
            } else {
                class411 var5 = this.field5024.method3100();
                arg1.method534(var3, var5, var4, (class357) null, 0);
            }
            this.field5033 = var3.method861();
            this.method2157((byte) -100, var3, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)V")
    public final void method2156(int arg0, int arg1) {
        if (arg0 != -1) {
            this.field5036 = -25;
        }
        ++field5022;
        if (!this.field5020) {
            this.field5036 += arg1;
            while (this.field5036 > this.field5012.field127[this.field5013]) {
                this.field5036 -= this.field5012.field127[this.field5013];
                ++this.field5013;
                if (this.field5013 >= this.field5012.field129.length) {
                    this.field5020 = true;
                    break;
                }
            }
            if (!this.field5020) {
                class291.method1711(this.field5012, this.field5013, super.field574, -76, super.field573, super.field584, false);
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLc;Lqa;)V")
    private final void method2157(byte arg0, class121 arg1, class162 arg2) {
        ++field5029;
        class96[] var4 = arg1.method851();
        class516[] var5 = arg1.method840();
        if (arg0 == -100) {
            if ((this.field5024 == null || this.field5024.field7790) && (var4 != null || var5 != null)) {
                this.field5024 = new class527(class31.field516);
            }
            if (this.field5024 != null) {
                this.field5024.method3107(arg2, (long) class31.field516, var4, var5, false);
                this.field5024.method3106(super.field573, super.field581, super.field580, super.field587, super.field569);
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILqa;Leq;IIZ)V")
    public final void method127(int arg0, int arg1, class162 arg2, class140 arg3, int arg4, int arg5, boolean arg6) {
        ++field5017;
        if (arg0 != 1) {
            this.method2155(70, (class162) null, 127, 5);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(B)I")
    public final int method285(byte arg0) {
        if (arg0 < 113) {
            this.field5020 = true;
        }
        ++field5016;
        return this.field5033;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V")
    public final void method2158(int arg0) {
        ++field5027;
        if (arg0 == 511) {
            if (this.field5024 != null) {
                this.field5024.method3099();
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)V")
    public static void method2159(int arg0) {
        field5038 = null;
        field5031 = null;
        if (arg0 != 4152) {
            field5038 = null;
        }
        field5039 = null;
        field5040 = null;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)I")
    public static final int method2160(int arg0, int arg1) {
        if (arg0 != -28485) {
            field5038 = null;
        }
        ++field5019;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lqa;Z)V")
    public final void method334(class162 arg0, boolean arg1) {
        if (!arg1) {
            this.field5013 = 123;
        }
        ++field5028;
        class121 var3 = this.method2155(this.field5025, arg0, -96, 0);
        if (var3 != null) {
            this.method2157((byte) -100, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)Z")
    public final boolean method126(byte arg0) {
        if (arg0 != 54) {
            return false;
        } else {
            ++field5015;
            return false;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V")
    public final void method125(boolean arg0) {
        ++field5037;
        if (arg0) {
            throw new IllegalStateException();
        }
    }
}
