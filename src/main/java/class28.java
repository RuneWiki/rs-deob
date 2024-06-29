import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class28 extends class367 implements class231 {

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "Lwca;")
    public class308 field383;

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "Z")
    private boolean field389;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "[B")
    public static byte[] field373 = new byte[520];

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "Lkm;")
    private class120 field372;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "Lkk;")
    public static class149 field371;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILqa;Z)Lr;", line = 4)
    public final class519 method254(int arg0, class167 arg1, boolean arg2) {
        if (arg2) {
            this.method262(-18);
        }
        ++field380;
        return this.field383.method1908(arg0, -1, arg1, false, false, 0, 0);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILqa;)V", line = 15)
    public final void method255(int arg0, class167 arg1) {
        this.field383.method1919(-118, arg1);
        ++field390;
        int var3 = -27 % ((-46 - arg0) / 42);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lraa;)V", line = 25)
    public static final void method256(class624 arg0) {
        if (class73.field1363 < 65535) {
            class637 var1 = arg0.field8805;
            class477.field6820[class73.field1363] = arg0;
            class93.field1644[class73.field1363] = false;
            ++class73.field1363;
            int var2 = arg0.field8804;
            if (arg0.field8800) {
                var2 = 0;
            }
            int var3 = arg0.field8804;
            if (arg0.field8791) {
                var3 = class146.field2246 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method3677(-26984) - var1.method3683(0) + class468.field6745 >> class162.field2401;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method3677(-26984) + var1.method3683(0) - class468.field6745 >> class162.field2401;
                if (var7 >= class305.field4400) {
                    var7 = class305.field4400 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field8811[var5++];
                    int var10 = (var1.method3681(-27102) - var1.method3683(0) + class468.field6745 >> class162.field2401) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class362.field5145) {
                        var11 = class362.field5145 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class90.field1621[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class90.field1621[var4][var12][var8] = var13 | (long) class73.field1363;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class90.field1621[var4][var12][var8] = var13 | (long) class73.field1363 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class90.field1621[var4][var12][var8] = var13 | (long) class73.field1363 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class90.field1621[var4][var12][var8] = var13 | (long) class73.field1363 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V", line = 117)
    public static final void method257(int arg0) {
        class609.method3465(false);
        ++field381;
        if (arg0 <= 7) {
            method256((class624) null);
        }
        class547.method3064((byte) -75);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)I", line = 130)
    public final int method258(byte arg0) {
        if (arg0 != -36) {
            return 101;
        } else {
            ++field382;
            return this.field383.field4430;
        }
    }

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "(I)V", line = 141)
    public static void method259(int arg0) {
        if (arg0 != -1235) {
            method265(false);
        }
        field371 = null;
        field373 = null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(ILqa;)Lkm;", line = 158)
    public final class120 method260(int arg0, class167 arg1) {
        ++field386;
        return arg0 >= -50 ? null : this.field372;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(B)I", line = 170)
    public final int method261(byte arg0) {
        ++field370;
        if (arg0 >= -116) {
            field373 = null;
        }
        return this.field383.method1918(-99);
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lqa;Ltk;IIIIIZIIIIII)V", line = 184)
    public class28(class167 arg0, class370 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class553.method3105((byte) 65, arg11, arg12));
        this.field383 = new class308(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field389 = arg1.field5276 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)Z", line = 193)
    public final boolean method262(int arg0) {
        if (arg0 != -21131) {
            field371 = null;
        }
        ++field378;
        return this.field383.method1910(-1);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLqa;II)Z", line = 205)
    public final boolean method263(byte arg0, class167 arg1, int arg2, int arg3) {
        ++field385;
        class519 var5 = this.field383.method1908(131072, arg0 + -30, arg1, false, false, super.field5198, super.field5209);
        if (arg0 != 29) {
            field373 = null;
        }
        if (var5 == null) {
            return false;
        } else {
            class105 var6 = arg1.method637();
            var6.method884(super.field5209 + super.field5200, super.field5207, super.field5204 + super.field5198);
            return var5.method1399(arg2, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)I", line = 224)
    public final int method264(int arg0) {
        ++field379;
        if (arg0 != -25792) {
            this.method255(-21, (class167) null);
        }
        return this.field383.field4455;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(Z)V", line = 236)
    public static final void method265(boolean arg0) {
        if (!arg0) {
            field373 = null;
        }
        class341.field4914 = 0;
        ++field375;
        int var1 = (class644.field9367.field5108 >> 7) + class382.field5687;
        int var2 = (class644.field9367.field5109 >> 7) + class597.field8500;
        if (~var1 <= -3054 && ~var1 >= -3157 && var2 >= 3056 && ~var2 >= -3137) {
            class341.field4914 = 1;
        }
        if (var1 >= 3072 && ~var1 >= -3119 && var2 >= 9492 && var2 <= 9535) {
            class341.field4914 = 1;
        }
        if (class341.field4914 == 1 && var1 >= 3139 && ~var1 >= -3200 && ~var2 <= -3009 && var2 <= 3062) {
            class341.field4914 = 0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lqa;B)V", line = 263)
    public final void method266(class167 arg0, byte arg1) {
        ++field384;
        class519 var3 = this.field383.method1908(262144, -1, arg0, false, true, super.field5198, super.field5209);
        if (arg1 != -40) {
            field371 = null;
        }
        if (var3 != null) {
            int var4 = super.field5209 >> 7;
            int var5 = super.field5198 >> 7;
            this.field383.method1907(var3, false, var5, arg0, arg1 + 34205, var5, var4, var4);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lqa;I)Lbi;", line = 285)
    public final class465 method267(class167 arg0, int arg1) {
        ++field376;
        class519 var3 = this.field383.method1908(2048, -1, arg0, false, true, super.field5198, super.field5209);
        if (var3 == null) {
            return null;
        } else {
            class105 var4 = arg0.method637();
            var4.method884(super.field5209 + super.field5200, super.field5207, super.field5198 - -super.field5204);
            class465 var5 = null;
            if (this.field389) {
                var5 = class603.method3437((byte) -22, 1);
            }
            if (this.field383.field4460 != null) {
                class616 var6 = this.field383.field4460.method3350();
                arg0.method553(var3, var6, var4, var5 != null ? var5.field6707[0] : null, 0);
            } else {
                var3.method1379(var4, var5 != null ? var5.field6707[0] : null, 0);
            }
            if (arg1 != 2) {
                return null;
            } else {
                if (this.field372 == null) {
                    this.field372 = class577.method3298(var3, super.field5209, super.field5198, (byte) 65, super.field5207);
                } else {
                    class221.method1477(var3, this.field372, super.field5198, super.field5209, -8040, super.field5207);
                }
                int var7 = super.field5209 >> 7;
                int var8 = super.field5198 >> 7;
                this.field383.method1907(var3, true, var8, arg0, 34165, var8, var7, var7);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZLqa;)V", line = 337)
    public final void method268(boolean arg0, class167 arg1) {
        if (!arg0) {
            this.method255(103, (class167) null);
        }
        ++field387;
        this.field383.method1911(arg1, -8881);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)I", line = 354)
    public final int method269(int arg0) {
        ++field388;
        if (arg0 != -13265) {
            this.method261((byte) -111);
        }
        return this.field383.field4433;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V", line = 365)
    public final void method270(int arg0) {
        int var2 = 71 / ((arg0 - -1) / 47);
        ++field377;
    }
}
