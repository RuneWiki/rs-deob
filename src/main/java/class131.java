import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class131 extends class43 {

    @OriginalMember(owner = "client!bm", name = "vc", descriptor = "Lhj;")
    public static class116 field2053 = new class116(5000);

    @OriginalMember(owner = "client!bm", name = "Hc", descriptor = "[Lpk;")
    public static class44[] field2065 = new class44[4];

    @OriginalMember(owner = "client!bm", name = "Ic", descriptor = "[I")
    public static int[] field2066 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!bm", name = "Kc", descriptor = "Lhj;")
    public static class116 field2068 = new class116(5000);

    @OriginalMember(owner = "client!bm", name = "Lc", descriptor = "[Lwd;")
    public static class162[] field2069 = new class162[2048];

    @OriginalMember(owner = "client!bm", name = "oc", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!bm", name = "pc", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!bm", name = "qc", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!bm", name = "rc", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!bm", name = "sc", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!bm", name = "tc", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!bm", name = "uc", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!bm", name = "wc", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!bm", name = "xc", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!bm", name = "zc", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!bm", name = "Ac", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!bm", name = "Cc", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!bm", name = "Dc", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!bm", name = "Ec", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!bm", name = "Fc", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!bm", name = "Jc", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!bm", name = "yc", descriptor = "Lr;")
    public class253 field2056;

    @OriginalMember(owner = "client!bm", name = "Gc", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2064;

    @OriginalMember(owner = "client!bm", name = "Bc", descriptor = "[I")
    public static int[] field2059;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V")
    public static final void method923(byte arg0) {
        ++field2054;
        if (class139.field2211) {
            if (arg0 <= -15) {
                class211 var1 = class32.method217(class78.field1310, class251.field3997, 113);
                if (var1 != null && var1.field3411 != null) {
                    class126 var2 = new class126();
                    var2.field2000 = var1;
                    var2.field1989 = var1.field3411;
                    class137.method960(200000, var2);
                }
                class92.field1481 = -1;
                class139.field2211 = false;
                class117.method834(var1, (byte) -57);
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIIJILic;)V")
    public final void method9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class171 arg10) {
        ++field2062;
        if (this.field2056 != null) {
            class307 var13 = super.field699 != -1 && ~super.field717 == -1 ? class22.method121(super.field699, true) : null;
            class307 var14 = ~super.field682 == 0 || ~super.field682 == ~this.method292(121).field3006 && var13 != null ? null : class22.method121(super.field682, true);
            class37 var15 = this.field2056.method1701(0, super.field619, var14, super.field688, super.field662, var13, super.field659, super.field679, super.field638, super.field686);
            if (var15 != null) {
                super.field715 = var15.method15();
                class253 var16 = this.field2056;
                if (var16.field4062 != null) {
                    var16 = var16.method1711(true);
                }
                if (class165.field2656 && var16.field4077) {
                    class37 var17 = class174.method1269(super.field710, (byte) 115, arg0, super.field637, this.field2056.field4053, var15, this.field2056.field4046, this.field2056.field4047, super.field621, var14 == null ? var13 : var14, super.field653, var14 != null ? super.field659 : super.field686, this.field2056.field4048, this.field2056.field4065);
                    var17.method9(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field707);
                }
                class37 var18 = null;
                this.method283(-104405563, var15);
                this.method284(arg0, (byte) -119, var15);
                if (~super.field669 != 0 && super.field627 != -1) {
                    class55 var19 = class137.method958(super.field669, (byte) -109);
                    var18 = var19.method379(super.field660, -18882, super.field627, super.field640);
                    if (var18 != null) {
                        var18.method167(0, -super.field698, 0);
                        if (var19.field910) {
                            if (class279.field4474 != 0) {
                                var18.method199(class279.field4474);
                            }
                            if (class139.field2215 != 0) {
                                var18.method201(class139.field2215);
                            }
                            if (~class244.field3884 != -1) {
                                var18.method167(0, class244.field3884, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class31) var15).method171(var18);
                }
                this.method287(var15, -24, var18);
                if (this.field2056.field4048 == 1) {
                    var15.field530 = true;
                }
                var15.method9(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field707);
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field2049;
        if (super.field707 != null) {
            super.field707.method1252();
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)I")
    public static final int method924(int arg0, int arg1) {
        if (arg1 > -71) {
            return -83;
        } else {
            ++field2048;
            return 127 & arg0;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIILpk;B)V")
    public static final void method925(int arg0, int arg1, int arg2, int arg3, int arg4, class44 arg5, byte arg6) {
        ++field2051;
        boolean var7 = true;
        long var8 = 0L;
        if (arg1 == 0) {
            var8 = class276.method1861(arg4, arg0, arg3);
        } else if (arg1 == 1) {
            var8 = class173.method1258(arg4, arg0, arg3);
        } else if (~arg1 == -3) {
            var8 = class203.method1421(arg4, arg0, arg3);
        } else if (~arg1 == -4) {
            var8 = class205.method1435(arg4, arg0, arg3);
        }
        if (arg6 == -99) {
            int var10 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            boolean var11 = false;
            boolean var12 = false;
            int var13 = (int) var8 >> 20 & 3;
            class158 var14 = class5.method29(var10, true);
            int var15 = (int) var8 >> 14 & 31;
            if (var14.method1084(-106)) {
                class68.method474(arg0, arg3, arg4, var14, 0);
            }
            if (var8 != 0L) {
                if (~arg1 == -1) {
                    class159.method1094(arg4, arg0, arg3);
                    if (~var14.field2514 != -1) {
                        arg5.method304(var15, -1, var14.field2493, var13, !var14.field2486, arg0, arg3);
                    }
                } else if (arg1 == 1) {
                    class148.method1031(arg4, arg0, arg3);
                } else if (arg1 != 2) {
                    if (~arg1 == -4) {
                        class277.method1864(arg4, arg0, arg3);
                        if (var14.field2514 == 1) {
                            arg5.method302(arg6 + -6, arg3, arg0);
                        }
                    }
                } else {
                    class290.method1933(arg4, arg0, arg3);
                    if (~var14.field2514 != -1 && var14.field2507 + arg0 < 104 && ~(arg3 - -var14.field2507) > -105 && ~(var14.field2487 + arg0) > -105 && arg3 - -var14.field2487 < 104) {
                        arg5.method297(arg0, (byte) 100, arg3, var14.field2507, var13, !var14.field2486, var14.field2493, var14.field2487);
                    }
                }
                if (var14.field2448 != null) {
                    class158 var20 = var14.method1077(-6291);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BIII)I")
    public static final int method926(byte arg0, int arg1, int arg2, int arg3) {
        ++field2055;
        if (~(class301.field4818[arg3][arg2][arg1] & 8) != -1) {
            return 0;
        } else if (arg3 > 0 && ~(class301.field4818[1][arg2][arg1] & 2) != -1) {
            return arg3 + -1;
        } else {
            int var4 = 71 % ((-43 - arg0) / 36);
            return arg3;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZLr;)V")
    public final void method927(boolean arg0, class253 arg1) {
        this.field2056 = arg1;
        if (arg0) {
            ++field2061;
            if (super.field707 != null) {
                super.field707.method1238();
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "(I)I")
    public final int method290(int arg0) {
        ++field2052;
        if (arg0 != -13800) {
            method923((byte) -26);
        }
        if (this.field2056.field4062 != null) {
            class253 var2 = this.field2056.method1711(true);
            if (var2 != null && var2.field4075 != -1) {
                return var2.field4075;
            }
        }
        return this.field2056.field4075;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIII)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2060;
        if (this.field2056 != null) {
            if (!super.field675) {
                class307 var6 = ~super.field699 != 0 && super.field717 == 0 ? class22.method121(super.field699, true) : null;
                class307 var7 = ~super.field682 == 0 || ~super.field682 == ~this.method292(-54).field3006 && var6 != null ? null : class22.method121(super.field682, true);
                class37 var8 = this.field2056.method1701(0, super.field619, var7, super.field688, super.field662, var6, super.field659, super.field679, super.field638, super.field686);
                if (var8 == null) {
                    return;
                }
                this.method287(var8, -63, (class37) null);
            }
            if (super.field707 != null) {
                super.field707.method1250(arg0, arg1, arg3, arg2, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)V")
    public static void method928(boolean arg0) {
        field2059 = null;
        field2064 = null;
        field2066 = null;
        field2069 = null;
        field2068 = null;
        field2053 = null;
        field2065 = null;
        if (arg0) {
            field2069 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "()I")
    public final int method15() {
        ++field2046;
        return super.field715;
    }

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "(I)V")
    public static final void method929(int arg0) {
        if (arg0 != -5373) {
            field2066 = null;
        }
        class204.field3248.method1257(112);
        class94.field1522.method1257(69);
        ++field2047;
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)Z")
    public final boolean method285(int arg0) {
        ++field2050;
        if (this.field2056 == null) {
            return false;
        } else {
            if (arg0 <= 89) {
                field2053 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;CB)I")
    public static final int method930(String arg0, char arg1, byte arg2) {
        ++field2057;
        int var3 = arg0.length();
        if (arg2 != -63) {
            return -30;
        } else {
            int var4 = 0;
            for (int var5 = 0; ~var3 < ~var5; ++var5) {
                if (~arg0.charAt(var5) == ~arg1) {
                    ++var4;
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "(I)I")
    public final int method291(int arg0) {
        ++field2058;
        if (this.field2056.field4062 != null) {
            class253 var2 = this.field2056.method1711(true);
            if (var2 != null && ~var2.field4026 != 0) {
                return var2.field4026;
            }
        }
        if (this.field2056.field4026 != -1) {
            return this.field2056.field4026;
        } else {
            if (arg0 > -77) {
                this.method285(-123);
            }
            return super.method291(-80);
        }
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)I")
    public final int method286(int arg0) {
        if (arg0 < 42) {
            method930((String) null, (char) 65445, (byte) 117);
        }
        ++field2063;
        if (this.field2056.field4062 != null) {
            class253 var2 = this.field2056.method1711(true);
            if (var2 != null && var2.field4083 != -1) {
                return var2.field4083;
            }
        }
        return super.field626;
    }
}
