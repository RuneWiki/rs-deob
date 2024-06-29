import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class163 extends class556 {

    @OriginalMember(owner = "client!aq", name = "Y", descriptor = "I")
    private int field2240 = 0;

    @OriginalMember(owner = "client!aq", name = "T", descriptor = "I")
    private int field2235 = 0;

    @OriginalMember(owner = "client!aq", name = "rb", descriptor = "Z")
    public boolean field2259 = false;

    @OriginalMember(owner = "client!aq", name = "ib", descriptor = "I")
    private int field2250 = 0;

    @OriginalMember(owner = "client!aq", name = "R", descriptor = "Z")
    private boolean field2233 = true;

    @OriginalMember(owner = "client!aq", name = "ub", descriptor = "I")
    private int field2262 = 0;

    @OriginalMember(owner = "client!aq", name = "ab", descriptor = "I")
    private int field2242 = 0;

    @OriginalMember(owner = "client!aq", name = "xb", descriptor = "I")
    private int field2265 = -1;

    @OriginalMember(owner = "client!aq", name = "V", descriptor = "I")
    private int field2237;

    @OriginalMember(owner = "client!aq", name = "eb", descriptor = "I")
    public int field2246;

    @OriginalMember(owner = "client!aq", name = "Z", descriptor = "Lmk;")
    private class56 field2241;

    @OriginalMember(owner = "client!aq", name = "S", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!aq", name = "U", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!aq", name = "W", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!aq", name = "X", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!aq", name = "bb", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!aq", name = "db", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!aq", name = "fb", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!aq", name = "hb", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!aq", name = "jb", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!aq", name = "kb", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!aq", name = "mb", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!aq", name = "nb", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!aq", name = "ob", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!aq", name = "pb", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!aq", name = "qb", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!aq", name = "sb", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!aq", name = "tb", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!aq", name = "vb", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!aq", name = "wb", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!aq", name = "cb", descriptor = "Lsl;")
    public static class461 field2244;

    @OriginalMember(owner = "client!aq", name = "gb", descriptor = "Lod;")
    private class509 field2248;

    @OriginalMember(owner = "client!aq", name = "lb", descriptor = "Lnd;")
    public static class547 field2253;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lha;Lka;ILpda;)V", line = 6)
    private final void method1136(class60 arg0, class474 arg1, int arg2, class631 arg3) {
        arg1.method271(arg3);
        ++field2254;
        if (arg2 != 0) {
            this.field2259 = false;
        }
        class569[] var5 = arg1.method268();
        class521[] var6 = arg1.method253();
        if ((this.field2248 == null || this.field2248.field7170) && (var5 != null || var6 != null)) {
            this.field2248 = class509.method2978(class463.field6224, true);
        }
        if (this.field2248 != null) {
            this.field2248.method2968(arg0, (long) class463.field6224, var5, var6, false);
            this.field2248.method2972(super.field5796, super.field7734, super.field7741, super.field7746, super.field7744);
        }
    }

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "(B)V", line = 32)
    public final void method749(byte arg0) {
        if (arg0 > -41) {
            this.field2259 = true;
        }
        ++field2245;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lha;III)Lka;", line = 43)
    private final class474 method1137(class60 arg0, int arg1, int arg2, int arg3) {
        ++field2264;
        class164 var5 = class234.field3057.method2095(arg3, (byte) 3);
        if (arg2 != 0) {
            this.method87((byte) 48);
        }
        class282 var6 = class707.field9826[super.field5796];
        class282 var7 = super.field5793 >= 3 ? null : class707.field9826[super.field5793 + 1];
        return !this.field2259 ? var5.method1150(super.field5800, super.field5801, var6, (byte) 2, arg1, this.field2250, class66.field941, this.field2235, super.field5797, var7, this.field2265, true, arg0) : var5.method1150(super.field5800, super.field5801, var6, (byte) 2, arg1, 0, class66.field941, -1, super.field5797, var7, -1, true, arg0);
    }

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "(B)Z", line = 67)
    public final boolean method83(byte arg0) {
        if (arg0 != -69) {
            this.field2242 = 61;
        }
        ++field2261;
        return false;
    }

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "(I)I", line = 78)
    public final int method84(int arg0) {
        ++field2256;
        if (arg0 != 1027) {
            this.field2241 = null;
        }
        return this.field2242;
    }

    @OriginalMember(owner = "client!aq", name = "finalize", descriptor = "()V", line = 93)
    protected final void finalize() {
        if (this.field2248 != null) {
            this.field2248.method2977();
        }
        ++field2234;
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(II)V", line = 103)
    public final void method1138(int arg0, int arg1) {
        ++field2263;
        if (!this.field2259) {
            this.field2250 += arg1;
            int var3 = 1 % ((5 - arg0) / 53);
            while (~this.field2241.field773[this.field2235] > ~this.field2250) {
                this.field2250 -= this.field2241.field773[this.field2235];
                ++this.field2235;
                if (this.field2241.field771.length <= this.field2235) {
                    this.field2259 = true;
                    break;
                }
            }
            if (!this.field2259) {
                class758.method4218(this.field2235, this, 0, this.field2241);
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "(I)Z", line = 132)
    public final boolean method85(int arg0) {
        ++field2239;
        if (arg0 >= -79) {
            this.field2250 = 113;
        }
        return this.field2233;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lha;I)V", line = 144)
    public final void method744(class60 arg0, int arg1) {
        ++field2258;
        class474 var3 = this.method1137(arg0, 0, arg1, this.field2237);
        if (var3 != null) {
            class631 var4 = arg0.method531();
            var4.method596(super.field5801, super.field5800, super.field5797);
            this.method1136(arg0, var3, 0, var4);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BILha;I)Z", line = 162)
    public final boolean method752(byte arg0, int arg1, class60 arg2, int arg3) {
        if (arg0 > -41) {
            return false;
        } else {
            ++field2238;
            return false;
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 469)
    public class163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field2240 = arg12;
        this.field2237 = arg0;
        this.field2246 = arg2 - -arg1;
        class164 var14 = class234.field3057.method2095(this.field2237, (byte) 31);
        int var15 = var14.field2276;
        if (~var15 != 0) {
            this.field2241 = class66.field941.method1299((byte) -120, var15);
            this.field2259 = false;
        } else {
            this.field2259 = true;
        }
        if (~this.field2246 == ~arg2) {
            class758.method4218(this.field2235, this, 0, this.field2241);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILrba;Lha;ZII)V", line = 178)
    public final void method754(int arg0, int arg1, class435 arg2, class60 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 == 30558) {
            ++field2252;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "(B)I", line = 190)
    public final int method87(byte arg0) {
        ++field2251;
        if (arg0 != 121) {
            this.method759(16);
        }
        return this.field2262;
    }

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "(I)Z", line = 201)
    public final boolean method759(int arg0) {
        ++field2257;
        if (arg0 != 0) {
            this.field2242 = -53;
        }
        return false;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lda;Lha;IZLjl;Ljava/lang/String;)V", line = 219)
    public static final void method1139(class61 arg0, class60 arg1, int arg2, boolean arg3, class274 arg4, String arg5) {
        if (arg2 > 96) {
            ++field2249;
            boolean var6 = !class3.field32 || class134.method986(0);
            if (var6) {
                if (class3.field32 && var6) {
                    class274 var7 = class160.field2216;
                    class61 var8 = arg1.method500(var7, class590.field8276, true);
                    int var9 = var7.method1618(250, (class481[]) null, arg5, 46);
                    int var10 = var7.method1622((class481[]) null, arg5, 250, 117, var7.field3444);
                    int var11 = class528.field7362.field10135;
                    int var12 = var11 + 4;
                    int var13 = var12 * 2 + var10;
                    int var14 = var12 * 2 + var9;
                    if (~class322.field4151 < ~var13) {
                        var13 = class322.field4151;
                    }
                    if (class662.field9317 > var14) {
                        var14 = class662.field9317;
                    }
                    int var15 = class638.field8797.method735(0, var14, class482.field6548) + class599.field8346;
                    int var16 = class660.field9190.method3397(var13, class478.field6509, -101) - -class699.field9731;
                    if (class676.field9448) {
                        var15 += class209.method1347(0);
                        var16 += class453.method2540(-114);
                    }
                    arg1.method508(class282.field3562, false).method138(class358.field4620.field10135 + var15, class358.field4620.field10132 + var16, var14 - class358.field4620.field10135 * 2, -(class358.field4620.field10132 * 2) + var13, 1, 0, 0);
                    arg1.method508(class358.field4620, true).method2759(var15, var16);
                    class358.field4620.method4063();
                    arg1.method508(class358.field4620, true).method2759(var14 + var15 + -var11, var16);
                    class358.field4620.method4053();
                    arg1.method508(class358.field4620, true).method2759(var14 + var15 + -var11, var16 - -var13 + -var11);
                    class358.field4620.method4063();
                    arg1.method508(class358.field4620, true).method2759(var15, var13 + var16 + -var11);
                    class358.field4620.method4053();
                    arg1.method508(class528.field7362, true).method2766(var15, class358.field4620.field10132 + var16, var11, -(class358.field4620.field10132 * 2) + var13);
                    class528.field7362.method4057();
                    arg1.method508(class528.field7362, true).method2766(var15 - -class358.field4620.field10135, var16, var14 - class358.field4620.field10135 * 2, var11);
                    class528.field7362.method4057();
                    arg1.method508(class528.field7362, true).method2766(var15 - var11 + var14, class358.field4620.field10132 + var16, var11, var13 - class358.field4620.field10132 * 2);
                    class528.field7362.method4057();
                    arg1.method508(class528.field7362, true).method2766(class358.field4620.field10135 + var15, -var11 + var13 + var16, -(class358.field4620.field10135 * 2) + var14, var11);
                    class528.field7362.method4057();
                    var8.method566(1, var12 + var16, -16777216 | class21.field385, var12 + var15, -(var12 * 2) + var14, 0, 1, (int[]) null, 13518, var13 - var12 * 2, -1, 0, 0, (class489) null, arg5, (class481[]) null);
                    class167.method1169(var16, var14, var13, 16184, var15);
                } else {
                    int var17 = arg4.method1618(250, (class481[]) null, arg5, 46);
                    int var18 = arg4.method1616((class481[]) null, -1, 250, arg5) * 13;
                    byte var19 = 4;
                    int var20 = 6 - -var19;
                    int var21 = var19 + 6;
                    arg1.method528(var20 - var19, -var19 + var21, var17 + var19 + var19, var18 + var19 + var19, -16777216, 0);
                    arg1.method460(var20 - var19, -var19 + var21, var17 - -var19 + var19, var18 + var19 + var19, -1, 0);
                    arg0.method566(1, var21, -1, var20, var17, 0, 1, (int[]) null, 13518, var18, -1, 0, 0, (class489) null, arg5, (class481[]) null);
                    class167.method1169(-var19 + var21, var17 - -var19 + var19, var18 + var19 + var19, 16184, -var19 + var20);
                }
                if (arg3) {
                    try {
                        if (class676.field9448) {
                            class283.method1691(-122);
                        } else {
                            arg1.method492(79);
                        }
                    } catch (class230 var22) {
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V", line = 319)
    public static final void method1140(int arg0) {
        ++field2260;
        if (arg0 < 79) {
            field2244 = null;
        }
        int var1 = class33.field545.length;
        for (int var2 = 0; var1 > var2; ++var2) {
            if (class33.field545[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; ~class343.field4342 < ~var4; ++var4) {
                    if (class201.field2708[var2] == class150.field2079[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (~var3 == 0) {
                    class150.field2079[class343.field4342] = class201.field2708[var2];
                    var3 = class343.field4342++;
                }
                class461 var5 = new class461(class33.field545[var2]);
                int var6 = 0;
                while (var5.field6193 < class33.field545[var2].length && ~var6 > -512 && ~class646.field8947 > -1024) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method2566(-2);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 8118) >> 7;
                    int var11 = 63 & var8;
                    int var12 = (class201.field2708[var2] >> 8) * 64 - class332.field4232 - -var10;
                    int var13 = (class201.field2708[var2] & 255) * 64 + var11 + -class447.field5936;
                    class131 var14 = class300.field3941.method3859(var5.method2566(-2), (byte) 99);
                    class592 var15 = (class592) class207.field2745.method1160((long) var7, 122);
                    if (var15 == null && (1 & var14.field1848) > 0 && ~class440.field5865 == ~var9 && ~var12 <= -1 && class409.field5183 > var12 - -var14.field1918 && var13 >= 0 && class543.field7597 > var13 - -var14.field1918) {
                        class733 var16 = new class733();
                        var16.field189 = var7;
                        class592 var17 = new class592(var16);
                        class207.field2745.method1153(var17, (long) var7, -1);
                        class638.field8801[class54.field752++] = var17;
                        class751.field10483[class646.field8947++] = var7;
                        var16.field231 = class463.field6224;
                        var16.method4090(var14, 0);
                        var16.method92(var16.field10192.field1918, -109);
                        var16.field253 = var16.field10192.field1913 << 3;
                        var16.method86(-7554, true, var16.field10192.field1861 + 4 << 11 & 15401);
                        var16.method4091(var16.method82((byte) 49), true, var12, var9, var13, (byte) 91);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V", line = 419)
    public final void method1141(boolean arg0) {
        if (this.field2248 != null) {
            this.field2248.method2977();
        }
        ++field2247;
        if (!arg0) {
            this.method87((byte) -41);
        }
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(Z)V", line = 445)
    public static void method1142(boolean arg0) {
        field2253 = null;
        if (!arg0) {
            method1140(-90);
        }
        field2244 = null;
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(Lha;I)Ljk;", line = 494)
    public final class635 method755(class60 arg0, int arg1) {
        ++field2255;
        class474 var3 = this.method1137(arg0, 2048 | (this.field2240 != 0 ? 5 : 0), 0, this.field2237);
        int var4 = -31 % ((-39 - arg1) / 55);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field2240 != -1) {
                var3.method270(this.field2240 * 2048);
            }
            class631 var5 = arg0.method531();
            var5.method596(super.field5801, super.field5800, super.field5797);
            this.method1136(arg0, var3, 0, var5);
            class635 var6 = class510.method2982(false, 0, 1);
            if (class232.field3053) {
                var3.method255(var5, var6.field8760[0], class286.field3600, 0);
            } else {
                var3.method250(var5, var6.field8760[0], 0);
            }
            if (this.field2248 != null) {
                class741 var7 = this.field2248.method2969();
                if (!class232.field3053) {
                    arg0.method455(var7);
                } else {
                    arg0.method545(var7, class286.field3600);
                }
            }
            this.field2233 = var3.method287();
            this.field2262 = var3.method286();
            this.field2242 = var3.method248();
            return var6;
        }
    }

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "(ILha;)Lwg;", line = 539)
    public final class428 method750(int arg0, class60 arg1) {
        if (arg0 > -22) {
            return null;
        } else {
            ++field2236;
            return null;
        }
    }
}
