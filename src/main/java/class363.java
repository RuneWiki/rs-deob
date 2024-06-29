import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class363 {

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "Lig;")
    private class15 field5247 = new class15();

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
    private int field5248;

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "I")
    private int field5255;

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "Ldq;")
    private class90 field5253;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "Lvq;")
    public static class24 field5239 = new class24(88, 10);

    @OriginalMember(owner = "client!bt", name = "v", descriptor = "I")
    public static int field5257 = 0;

    @OriginalMember(owner = "client!bt", name = "x", descriptor = "I")
    public static int field5259 = -1;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!bt", name = "w", descriptor = "Lgt;")
    public static class341 field5258;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZLjava/lang/Object;J)V")
    public final void method2299(boolean arg0, Object arg1, long arg2) {
        this.method2306(1, -53, arg2, arg1);
        field5250++;
        if (!arg0) {
            this.method2301((byte) 116);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZ)V")
    public final void method2300(int arg0, boolean arg1) {
        if (!arg1) {
            this.field5253 = null;
        }
        field5251++;
        if (class377.field5509 == null) {
            return;
        }
        for (class163 var3 = (class163) this.field5247.method209(28); var3 != null; var3 = (class163) this.field5247.method217(-27864)) {
            if (var3.method809(false)) {
                if (var3.method808((byte) 107) == null) {
                    var3.method1820(-25246);
                    var3.method299((byte) -86);
                    this.field5248++;
                }
            } else if (++var3.field406 > (long) arg0) {
                class163 var4 = class377.field5509.method236(1, var3);
                this.field5253.method606(1, var4, var3.field3907);
                class286.method1926(var3, (byte) 124, var4);
                var3.method1820(-25246);
                var3.method299((byte) -86);
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)I")
    public final int method2301(byte arg0) {
        field5246++;
        if (arg0 > -67) {
            this.field5247 = null;
        }
        return this.field5248;
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method2302(byte arg0) {
        int var2 = 114 % ((4 - arg0) / 43);
        field5249++;
        class163 var3 = (class163) this.field5253.method604(-75);
        while (var3 != null) {
            Object var4 = var3.method808((byte) 104);
            if (var4 != null) {
                return var4;
            }
            class163 var5 = var3;
            var3 = (class163) this.field5253.method604(-96);
            var5.method1820(-25246);
            var5.method299((byte) -86);
            this.field5248 += var3.field2159;
        }
        return null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lct;B)V")
    public static final void method2303(class104 arg0, byte arg1) {
        int var2 = 113 % ((25 - arg1) / 59);
        field5240++;
        class437.field6380 = arg0;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2304(int arg0) {
        if (arg0 < 23) {
            this.method2305((byte) 52);
        }
        field5252++;
        class163 var2 = (class163) this.field5253.method608((byte) 125);
        while (var2 != null) {
            Object var3 = var2.method808((byte) 109);
            if (var3 != null) {
                return var3;
            }
            class163 var4 = var2;
            var2 = (class163) this.field5253.method604(-86);
            var4.method1820(-25246);
            var4.method299((byte) -86);
            this.field5248 += var2.field2159;
        }
        return null;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)I")
    public final int method2305(byte arg0) {
        if (arg0 <= 120) {
            this.field5248 = -62;
        }
        field5244++;
        return this.field5255;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIJLjava/lang/Object;)V")
    private final void method2306(int arg0, int arg1, long arg2, Object arg3) {
        field5238++;
        if (this.field5255 < arg0) {
            throw new IllegalStateException("s>cs");
        }
        this.method2314(-25135, arg2);
        this.field5248 -= arg0;
        while (this.field5248 < 0) {
            class163 var7 = (class163) this.field5247.method213(0);
            this.method2308(false, var7);
        }
        class118 var6 = new class118(arg3, arg0);
        this.field5253.method606(1, var6, arg2);
        this.field5247.method211(var6, -32256);
        var6.field406 = 0L;
        if (arg1 > -10) {
            this.method2306(-10, 118, -28L, (Object) null);
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
    public final void method2307(int arg0) {
        int var2 = -87 % ((-arg0 - 22) / 35);
        for (class163 var3 = (class163) this.field5247.method209(28); var3 != null; var3 = (class163) this.field5247.method217(-27864)) {
            if (var3.method809(false)) {
                var3.method1820(-25246);
                var3.method299((byte) -86);
                this.field5248 += var3.field2159;
            }
        }
        field5237++;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZLjj;)V")
    private final void method2308(boolean arg0, class163 arg1) {
        if (arg0) {
            this.field5248 = -85;
        }
        if (arg1 != null) {
            arg1.method1820(-25246);
            arg1.method299((byte) -86);
            this.field5248 += arg1.field2159;
        }
        field5254++;
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(B)V")
    public static void method2309(byte arg0) {
        if (arg0 >= -37) {
            field5259 = -89;
        }
        field5239 = null;
        field5258 = null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
    public final Object method2310(byte arg0, long arg1) {
        field5243++;
        class163 var4 = (class163) this.field5253.method609(arg1, 69);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method808((byte) 125);
        if (var5 == null) {
            var4.method1820(-25246);
            var4.method299((byte) -86);
            this.field5248 += var4.field2159;
            return null;
        }
        if (arg0 >= -123) {
            field5258 = null;
        }
        if (var4.method809(false)) {
            class118 var6 = new class118(var5, var4.field2159);
            this.field5253.method606(1, var6, var4.field3907);
            this.field5247.method211(var6, -32256);
            var6.field406 = 0L;
            var4.method1820(-25246);
            var4.method299((byte) -86);
        } else {
            this.field5247.method211(var4, -32256);
            var4.field406 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)I")
    public final int method2311(int arg0) {
        field5236++;
        int var2 = 0;
        int var3 = 25 % ((arg0 - 83) / 38);
        for (class163 var4 = (class163) this.field5247.method209(28); var4 != null; var4 = (class163) this.field5247.method217(-27864)) {
            if (!var4.method809(false)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)Lcs;")
    public static final class401 method2312(int arg0) {
        field5241++;
        if (arg0 != 88) {
            field5239 = null;
        }
        try {
            return (class401) Class.forName("im").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "(I)V")
    public final void method2313(int arg0) {
        field5242++;
        this.field5247.method214(7031);
        if (arg0 <= 91) {
            this.method2305((byte) -107);
        }
        this.field5253.method600(-125);
        this.field5248 = this.field5255;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IJ)V")
    private final void method2314(int arg0, long arg1) {
        field5245++;
        class163 var4 = (class163) this.field5253.method609(arg1, 57);
        this.method2308(false, var4);
        if (arg0 != -25135) {
            field5239 = null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I)V")
    public class363(int arg0) {
        this.field5248 = arg0;
        this.field5255 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field5253 = new class90(var2);
    }

    static {
        new class409("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
    }
}
