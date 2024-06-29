import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class175 {

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Lw;")
    public class104 field2929 = new class104();

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "Le;")
    public static class191 field2933 = class54.method368("Standort", 2047);

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "Le;")
    private static class191 field2934 = class54.method368("Attack", 2047);

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Le;")
    public static class191 field2932 = field2934;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "Ld;")
    public static class50 field2943 = new class50(0, 0);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "Lw;")
    private class104 field2942;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "Lqb;")
    public static class76 field2946;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljb;B)V")
    public static final void method1169(class176 arg0, byte arg1) {
        field2938++;
        arg0.field2977 = arg0.field2974;
        if (arg0.field2961 == 0) {
            arg0.field3008 = 0;
            return;
        }
        if (arg0.field3019 != -1 && arg0.field3016 == 0) {
            class248 var2 = class67.method445((byte) -61, arg0.field3019);
            if (arg0.field3010 > 0 && var2.field4396 == 0) {
                arg0.field3008++;
                return;
            }
            if (arg0.field3010 <= 0 && var2.field4388 == 0) {
                arg0.field3008++;
                return;
            }
        }
        if (arg1 != -57) {
            return;
        }
        int var3 = arg0.field2972;
        int var4 = arg0.field3003;
        int var5 = arg0.field2953[arg0.field2961 - 1] * 128 + (arg0.method490((byte) -4) * 64);
        int var6 = arg0.field3014[arg0.field2961 - 1] * 128 + (arg0.method490((byte) -4) * 64);
        if ((var5 - var4) > 256 || (var5 - var4) < -256 || (var6 - var3) > 256 || (var6 - var3) < -256) {
            arg0.field3003 = var5;
            arg0.field2972 = var6;
            return;
        }
        if (var5 > var4) {
            if (var6 > var3) {
                arg0.field2964 = 1280;
            } else if (var3 <= var6) {
                arg0.field2964 = 1536;
            } else {
                arg0.field2964 = 1792;
            }
        } else if (var4 > var5) {
            if (var6 > var3) {
                arg0.field2964 = 768;
            } else if (var6 >= var3) {
                arg0.field2964 = 512;
            } else {
                arg0.field2964 = 256;
            }
        } else if (var6 > var3) {
            arg0.field2964 = 1024;
        } else if (var3 > var6) {
            arg0.field2964 = 0;
        }
        int var7 = arg0.field2964 - arg0.field2999 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field2969;
        int var9 = 4;
        boolean var10 = true;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field3007;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field2970;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field2995;
        }
        if (var8 == -1) {
            var8 = arg0.field3007;
        }
        arg0.field2977 = var8;
        if (arg0 instanceof class156) {
            var10 = ((class156) arg0).field2663.field3178;
        }
        if (var10) {
            if (arg0.field2999 != arg0.field2964 && arg0.field2988 == -1 && arg0.field2960 != 0) {
                var9 = 2;
            }
            if (arg0.field2961 > 2) {
                var9 = 6;
            }
            if (arg0.field2961 > 3) {
                var9 = 8;
            }
            if (arg0.field3008 > 0 && arg0.field2961 > 1) {
                arg0.field3008--;
                var9 = 8;
            }
        } else {
            if (arg0.field2961 > 1) {
                var9 = 6;
            }
            if (arg0.field2961 > 2) {
                var9 = 8;
            }
            if (arg0.field3008 > 0 && arg0.field2961 > 1) {
                arg0.field3008--;
                var9 = 8;
            }
        }
        if (arg0.field2990[arg0.field2961 - 1]) {
            var9 <<= 0x1;
        }
        if (var4 < var5) {
            arg0.field3003 += var9;
            if (var5 < arg0.field3003) {
                arg0.field3003 = var5;
            }
        } else if (var5 < var4) {
            arg0.field3003 -= var9;
            if (arg0.field3003 < var5) {
                arg0.field3003 = var5;
            }
        }
        if (var9 >= 8 && arg0.field3007 == arg0.field2977 && arg0.field2947 != -1) {
            arg0.field2977 = arg0.field2947;
        }
        if (var6 > var3) {
            arg0.field2972 += var9;
            if (arg0.field2972 > var6) {
                arg0.field2972 = var6;
            }
        } else if (var3 > var6) {
            arg0.field2972 -= var9;
            if (var6 > arg0.field2972) {
                arg0.field2972 = var6;
            }
        }
        if (arg0.field3003 == var5 && arg0.field2972 == var6) {
            if (arg0.field3010 > 0) {
                arg0.field3010--;
            }
            arg0.field2961--;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLw;)V")
    public final void method1170(boolean arg0, class104 arg1) {
        field2936++;
        if (arg1.field1724 != null) {
            arg1.method655(63);
        }
        arg1.field1724 = this.field2929;
        arg1.field1711 = this.field2929.field1711;
        arg1.field1724.field1711 = arg1;
        arg1.field1711.field1724 = arg1;
        if (!arg0) {
            method1169((class176) null, (byte) 48);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)Lw;")
    public final class104 method1171(int arg0) {
        if (arg0 != -256) {
            field2939 = -55;
        }
        field2935++;
        class104 var2 = this.field2929.field1711;
        if (this.field2929 == var2) {
            return null;
        } else {
            var2.method655(63);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static void method1172(int arg0) {
        field2932 = null;
        field2933 = null;
        field2943 = null;
        field2934 = null;
        if (arg0 != 0) {
            method1172(96);
        }
        field2946 = null;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)Lw;")
    public final class104 method1173(int arg0) {
        field2940++;
        class104 var2 = this.field2929.field1711;
        if (this.field2929 == var2) {
            this.field2942 = null;
            return null;
        }
        if (arg0 <= 11) {
            field2946 = null;
        }
        this.field2942 = var2.field1711;
        return var2;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)Lw;")
    public final class104 method1174(byte arg0) {
        field2928++;
        class104 var2 = this.field2942;
        if (arg0 != -47) {
            return null;
        } else if (this.field2929 == var2) {
            this.field2942 = null;
            return null;
        } else {
            this.field2942 = var2.field1724;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)Lw;")
    public final class104 method1175(int arg0) {
        field2941++;
        if (arg0 != -1) {
            field2927 = -114;
        }
        class104 var2 = this.field2942;
        if (this.field2929 == var2) {
            this.field2942 = null;
            return null;
        } else {
            this.field2942 = var2.field1711;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lw;B)V")
    public final void method1176(class104 arg0, byte arg1) {
        field2930++;
        if (arg0.field1724 != null) {
            arg0.method655(63);
        }
        arg0.field1711 = this.field2929;
        arg0.field1724 = this.field2929.field1724;
        arg0.field1724.field1711 = arg0;
        if (arg1 == 38) {
            arg0.field1711.field1724 = arg0;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)Lw;")
    public final class104 method1177(boolean arg0) {
        field2945++;
        if (!arg0) {
            return null;
        }
        class104 var2 = this.field2929.field1724;
        if (this.field2929 == var2) {
            this.field2942 = null;
            return null;
        } else {
            this.field2942 = var2.field1724;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class175() {
        this.field2929.field1724 = this.field2929;
        this.field2929.field1711 = this.field2929;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)V")
    public final void method1178(boolean arg0) {
        field2944++;
        while (true) {
            class104 var2 = this.field2929.field1711;
            if (this.field2929 == var2) {
                this.field2942 = null;
                if (arg0) {
                    return;
                } else {
                    this.method1175(-42);
                    return;
                }
            }
            var2.method655(63);
        }
    }
}
