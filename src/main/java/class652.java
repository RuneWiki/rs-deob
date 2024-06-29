import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class652 {

    @OriginalMember(owner = "client!oo", name = "u", descriptor = "Ldha;")
    private class83 field9115;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    private int field9095;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    private int field9107;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "Ljo;")
    private class353 field9103;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "Lbu;")
    public static class21 field9101 = new class21(23, 8);

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "Z")
    public static boolean field9109 = false;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "Luh;")
    public static class176 field9110 = new class176(1, 2, 2, 0);

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field9097;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public static int field9098;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field9099;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public static int field9100;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public static int field9102;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public static int field9105;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
    public static int field9111;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
    public static int field9112;

    @OriginalMember(owner = "client!oo", name = "s", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!oo", name = "t", descriptor = "I")
    public static int field9114;

    @OriginalMember(owner = "client!oo", name = "v", descriptor = "I")
    public static int field9116;

    @OriginalMember(owner = "client!oo", name = "w", descriptor = "Z")
    public static boolean field9117;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "[Ljd;")
    public static class241[] field9096;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V", line = 6)
    public static void method3731(boolean arg0) {
        field9101 = null;
        field9096 = null;
        if (!arg0) {
            method3731(false);
        }
        field9110 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILdja;)V", line = 21)
    private final void method3732(int arg0, class324 arg1) {
        if (arg1 != null) {
            arg1.method3387((byte) -127);
            arg1.method827(3);
            this.field9107 += arg1.field4550;
        }
        field9116++;
        if (arg0 != 0) {
            field9101 = null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)I", line = 40)
    public final int method3733(byte arg0) {
        field9104++;
        int var2 = 0;
        class324 var3 = (class324) this.field9115.method636(256);
        if (arg0 >= -49) {
            method3731(false);
        }
        while (var3 != null) {
            if (!var3.method939(8519)) {
                var2++;
            }
            var3 = (class324) this.field9115.method637(false);
        }
        return var2;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLjava/lang/Object;JI)V", line = 68)
    public final void method3734(boolean arg0, Object arg1, long arg2, int arg3) {
        field9106++;
        if (this.field9095 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        if (arg0) {
            this.method3735(-71);
        }
        this.method3736(0, arg2);
        this.field9107 -= arg3;
        while (this.field9107 < 0) {
            class324 var7 = (class324) this.field9115.method633(18801);
            this.method3732(0, var7);
        }
        class124 var6 = new class124(arg1, arg3);
        this.field9103.method2241(39, arg2, var6);
        this.field9115.method626((byte) -115, var6);
        var6.field1597 = 0L;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 97)
    public final void method3735(int arg0) {
        this.field9115.method629(false);
        field9113++;
        this.field9103.method2240(-92);
        this.field9107 = this.field9095;
        if (arg0 != 2) {
            this.method3742((byte) 124, -71L);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IJ)V", line = 110)
    private final void method3736(int arg0, long arg1) {
        field9098++;
        class324 var4 = (class324) this.field9103.method2242(arg1, arg0 - 1);
        this.method3732(arg0, var4);
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(I)V", line = 120)
    public class652(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)I", line = 123)
    public final int method3737(int arg0) {
        field9105++;
        return arg0 >= -24 ? -72 : this.field9095;
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 136)
    public final Object method3738(int arg0) {
        field9114++;
        class324 var2 = (class324) this.field9103.method2248(-15690);
        if (arg0 < 11) {
            this.method3742((byte) -20, 105L);
        }
        while (var2 != null) {
            Object var3 = var2.method938(2);
            if (var3 != null) {
                return var3;
            }
            class324 var4 = var2;
            var2 = (class324) this.field9103.method2248(-15690);
            var4.method3387((byte) 121);
            var4.method827(3);
            this.field9107 += var4.field4550;
        }
        return null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(JBLjava/lang/Object;)V", line = 167)
    public final void method3739(long arg0, byte arg1, Object arg2) {
        field9111++;
        if (arg1 <= 9) {
            this.method3738(-101);
        }
        this.method3734(false, arg2, arg0, 1);
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)Ljava/lang/Object;", line = 180)
    public final Object method3740(byte arg0) {
        field9102++;
        class324 var2 = (class324) this.field9103.method2243((byte) 100);
        while (var2 != null) {
            Object var3 = var2.method938(2);
            if (var3 != null) {
                return var3;
            }
            class324 var4 = var2;
            var2 = (class324) this.field9103.method2248(arg0 - 15788);
            var4.method3387((byte) -43);
            var4.method827(3);
            this.field9107 += var4.field4550;
        }
        if (arg0 != 98) {
            this.method3744(false);
        }
        return null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V", line = 213)
    public final void method3741(int arg0, int arg1) {
        if (class46.field590 != null) {
            for (class324 var3 = (class324) this.field9115.method636(arg1 + 256); var3 != null; var3 = (class324) this.field9115.method637(false)) {
                if (var3.method939(arg1 + 8519)) {
                    if (var3.method938(2) == null) {
                        var3.method3387((byte) 116);
                        var3.method827(3);
                        this.field9107 += var3.field4550;
                    }
                } else if ((long) arg0 < ++var3.field1597) {
                    class324 var4 = class46.field590.method1043(-7, var3);
                    this.field9103.method2241(76, var3.field8133, var4);
                    class715.method4016(var3, var4, (byte) -128);
                    var3.method3387((byte) 125);
                    var3.method827(3);
                }
            }
        }
        if (arg1 != 0) {
            this.method3737(5);
        }
        field9100++;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BJ)Ljava/lang/Object;", line = 266)
    public final Object method3742(byte arg0, long arg1) {
        field9108++;
        if (arg0 != 67) {
            this.method3741(93, 3);
        }
        class324 var4 = (class324) this.field9103.method2242(arg1, arg0 - 68);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method938(2);
        if (var5 == null) {
            var4.method3387((byte) -125);
            var4.method827(3);
            this.field9107 += var4.field4550;
            return null;
        }
        if (var4.method939(8519)) {
            class124 var6 = new class124(var5, var4.field4550);
            this.field9103.method2241(-54, var4.field8133, var6);
            this.field9115.method626((byte) 61, var6);
            var6.field1597 = 0L;
            var4.method3387((byte) 114);
            var4.method827(3);
        } else {
            this.field9115.method626((byte) -118, var4);
            var4.field1597 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "(I)V", line = 313)
    public final void method3743(int arg0) {
        field9097++;
        for (class324 var2 = (class324) this.field9115.method636(256); var2 != null; var2 = (class324) this.field9115.method637(false)) {
            if (var2.method939(8519)) {
                var2.method3387((byte) 111);
                var2.method827(arg0 ^ 0xB);
                this.field9107 += var2.field4550;
            }
        }
        if (arg0 != 8) {
            this.field9107 = -62;
        }
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(Z)I", line = 340)
    public final int method3744(boolean arg0) {
        if (arg0) {
            field9110 = null;
        }
        field9099++;
        return this.field9107;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(II)V", line = 358)
    public class652(int arg0, int arg1) {
        this.field9115 = new class83();
        this.field9095 = arg0;
        this.field9107 = arg0;
        int var3;
        for (var3 = 1; arg0 > (var3 + var3) && var3 < arg1; var3 += var3) {
        }
        this.field9103 = new class353(var3);
    }
}
