import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class45 extends class144 {

    @OriginalMember(owner = "client!sd", name = "pc", descriptor = "Ljava/lang/String;")
    public static String field637 = "Connected to update server";

    @OriginalMember(owner = "client!sd", name = "zc", descriptor = "I")
    public static int field647 = 0;

    @OriginalMember(owner = "client!sd", name = "Ac", descriptor = "[I")
    public static int[] field648 = new int[500];

    @OriginalMember(owner = "client!sd", name = "Bc", descriptor = "I")
    public static int field649 = 0;

    @OriginalMember(owner = "client!sd", name = "mc", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!sd", name = "nc", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!sd", name = "oc", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!sd", name = "qc", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!sd", name = "rc", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!sd", name = "sc", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!sd", name = "tc", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!sd", name = "wc", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!sd", name = "yc", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!sd", name = "uc", descriptor = "Led;")
    public static class186 field642;

    @OriginalMember(owner = "client!sd", name = "vc", descriptor = "Lhc;")
    public static class235 field643;

    @OriginalMember(owner = "client!sd", name = "xc", descriptor = "Lja;")
    public class60 field645;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)V")
    public static final void method324(int arg0) {
        for (int var1 = 0; ~var1 > ~class141.field2155; ++var1) {
            int var2 = class244.field3972[var1];
            class45 var3 = class255.field4082[var2];
            int var4 = class236.field3814.method633(96);
            if ((64 & var4) != 0) {
                var4 += class236.field3814.method633(arg0 ^ -12) << 8;
            }
            if ((var4 & 512) != 0) {
                var3.field2252 = class236.field3814.method645(arg0 ^ -11572);
                var3.field2202 = class236.field3814.method677((byte) -100);
            }
            if (~(4 & var4) != -1) {
                var3.field2223 = class236.field3814.method679((byte) -95);
                if (~var3.field2223 == -65536) {
                    var3.field2223 = -1;
                }
            }
            if (~(var4 & 256) != -1) {
                int var5 = class236.field3814.method627(arg0 + 237);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                int[] var8 = new int[var5];
                for (int var9 = 0; ~var9 > ~var5; ++var9) {
                    int var10 = class236.field3814.method679((byte) 118);
                    if (~var10 == -65536) {
                        var10 = -1;
                    }
                    var6[var9] = var10;
                    var7[var9] = class236.field3814.method653(false);
                    var8[var9] = class236.field3814.method679((byte) 97);
                }
                class202.method1365(false, var6, var7, var3, var8);
            }
            if ((32 & var4) != 0) {
                int var11 = class236.field3814.method627(arg0 + 185);
                int var12 = class236.field3814.method633(56);
                var3.method976(class192.field2978, var11, var12, false);
            }
            if (~(1 & var4) != -1) {
                int var13 = class236.field3814.method679((byte) 97);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = class236.field3814.method653(false);
                class31.method243(var3, true, var14, var13);
            }
            if ((var4 & 16) != 0) {
                int var15 = class236.field3814.method682(-23595);
                int var16 = class236.field3814.method627(56);
                var3.method976(class192.field2978, var15, var16, false);
                var3.field2277 = class192.field2978 - -300;
                var3.field2219 = class236.field3814.method653(false);
            }
            if (~(var4 & 128) != -1) {
                boolean var17 = true;
                int var18 = class236.field3814.method645(11596);
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = class236.field3814.method641(-1);
                if (~var18 != 0 && var3.field2299 != -1 && class148.method996(arg0 ^ 17, class16.method158(var18, true).field3852).field440 < class148.method996(arg0 + 35, class16.method158(var3.field2299, true).field3852).field440) {
                    var17 = false;
                }
                if (var17) {
                    var3.field2201 = var19 >> 16;
                    var3.field2299 = var18;
                    var3.field2203 = 0;
                    var3.field2289 = 0;
                    var3.field2236 = class192.field2978 - -(var19 & 65535);
                    var3.field2261 = 1;
                    if (~class192.field2978 > ~var3.field2236) {
                        var3.field2289 = -1;
                    }
                    if (var3.field2299 != -1 && ~class192.field2978 == ~var3.field2236) {
                        int var20 = class16.method158(var3.field2299, true).field3852;
                        if (var20 != -1) {
                            class30 var21 = class148.method996(-63, var20);
                            if (var21 != null && var21.field439 != null) {
                                class52.method390(false, var21, 0, 120, var3.field2278, var3.field2240);
                            }
                        }
                    }
                }
            }
            if (~(var4 & 8) != -1) {
                var3.field2286 = class236.field3814.method675((byte) 16);
                var3.field2207 = 100;
            }
            if ((var4 & 2) != 0) {
                if (var3.field645.method458(arg0 + 2)) {
                    class161.method1098(12537, var3);
                }
                var3.method327(-89, class62.method469(class236.field3814.method645(arg0 ^ -11572), -74));
                var3.method967(var3.field645.field977, (byte) -30);
                var3.field2260 = var3.field645.field1036;
                var3.field2270 = var3.field645.field1012;
                if (var3.field645.method458(44)) {
                    class3.method13(var3.field2271[0], class240.field3892, 0, var3, (class193) null, var3.field2268[0], (class236) null, arg0 + 229);
                }
            }
        }
        if (arg0 == -128) {
            ++field638;
        }
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(B)V")
    public static final void method325(byte arg0) {
        ++field644;
        if (!class166.field2599) {
            if (arg0 <= 121) {
                method324(-57);
            }
            class115.field1877 = true;
            if (class109.field1782) {
                class16.field244 = (float) ((int) class16.field244 + -65 & -128);
            } else {
                class157.field2445 += (-24.0F - class157.field2445) / 2.0F;
            }
            class166.field2599 = true;
        }
    }

    @OriginalMember(owner = "client!sd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field634;
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)I")
    public final int method326(int arg0) {
        ++field635;
        if (arg0 <= 17) {
            return -124;
        } else {
            if (~class167.field2613 != -1 && this.field645.field1020 != null) {
                class60 var2 = this.field645.method459(true);
                if (var2 != null && ~var2.field1012 != 0) {
                    return var2.field1012;
                }
            }
            return super.field2270;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILja;)V")
    public final void method327(int arg0, class60 arg1) {
        this.field645 = arg1;
        if (super.field2284 != null) {
            super.field2284.method492();
        }
        if (arg0 < -10) {
            ++field646;
        }
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)Z")
    public final boolean method328(int arg0) {
        if (arg0 != 0) {
            field637 = null;
        }
        ++field640;
        return this.field645 != null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V")
    public final void method82(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field641;
        if (this.field645 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIJILri;)V")
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class67 arg10) {
        ++field639;
        if (this.field645 != null) {
            class30 var13 = ~super.field2214 != 0 && super.field2239 == 0 ? class148.method996(-99, super.field2214) : null;
            class30 var14 = ~super.field2250 == 0 || super.field2250 == this.method972((byte) -71).field4496 && var13 != null ? null : class148.method996(-58, super.field2250);
            class9 var15 = this.field645.method449(var13, var14, super.field2288, super.field2212, super.field2273, super.field2291, super.field2199, (byte) 57, super.field2296, super.field2287);
            if (var15 != null) {
                super.field2228 = var15.method102();
                class60 var16 = this.field645;
                if (var16.field1020 != null) {
                    var16 = var16.method459(true);
                }
                if (class19.field291 && var16.field992) {
                    class9 var17 = class291.method1948(super.field2234, this.field645.field993, var15, this.field645.field977, -1409, var14 != null ? super.field2212 : super.field2199, this.field645.field998, super.field2278, super.field2200, arg0, var14 != null ? var14 : var13, this.field645.field1039, super.field2240, this.field645.field1029);
                    var17.method100(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field2284);
                }
                this.method977(var15, (byte) -89);
                class9 var18 = null;
                this.method975((byte) 105, var15, arg0);
                if (super.field2299 != -1 && super.field2289 != -1) {
                    class238 var19 = class16.method158(super.field2299, true);
                    var18 = var19.method1638((byte) 74, super.field2261, super.field2289, super.field2203);
                    if (var18 != null) {
                        var18.method90(0, -super.field2201, 0);
                        if (var19.field3855) {
                            if (class88.field1483 != 0) {
                                var18.method89(class88.field1483);
                            }
                            if (~class166.field2601 != -1) {
                                var18.method95(class166.field2601);
                            }
                            if (class8.field166 != 0) {
                                var18.method90(0, class8.field166, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class54) var15).method408(var18);
                }
                if (~this.field645.field977 == -2) {
                    var15.field170 = true;
                }
                var15.method100(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field2284);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)V")
    public static void method329(boolean arg0) {
        field643 = null;
        field637 = null;
        field642 = null;
        if (arg0) {
            field648 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()I")
    public final int method102() {
        ++field636;
        return super.field2228;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I")
    public static int method330(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
