import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class485 {

    @OriginalMember(owner = "client!rw", name = "i", descriptor = "Z")
    public boolean field6914 = false;

    @OriginalMember(owner = "client!rw", name = "q", descriptor = "Ljn;")
    private class117 field6922 = new class117(64);

    @OriginalMember(owner = "client!rw", name = "r", descriptor = "Ljn;")
    public class117 field6923 = new class117(500);

    @OriginalMember(owner = "client!rw", name = "s", descriptor = "Ljn;")
    public class117 field6924 = new class117(30);

    @OriginalMember(owner = "client!rw", name = "t", descriptor = "Ljn;")
    public class117 field6925 = new class117(50);

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "Lvo;")
    public class345 field6912;

    @OriginalMember(owner = "client!rw", name = "p", descriptor = "Lvo;")
    private class345 field6921;

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "Z")
    public boolean field6909;

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "Lhp;")
    public static class329 field6913 = new class329();

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!rw", name = "j", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!rw", name = "k", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!rw", name = "l", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!rw", name = "m", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!rw", name = "n", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!rw", name = "o", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!rw", name = "u", descriptor = "I")
    public int field6926;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZB)V")
    public final void method2826(boolean arg0, byte arg1) {
        field6910++;
        if (arg0 != this.field6909 && arg1 > 79) {
            this.field6909 = arg0;
            this.method2832(-2276);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V")
    public static void method2827(int arg0) {
        if (arg0 == 25477) {
            field6913 = null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)V")
    public final void method2828(int arg0, int arg1) {
        class117 var3 = this.field6922;
        synchronized (this.field6922) {
            this.field6922.method939(28093, arg1);
        }
        field6908++;
        class117 var4 = this.field6923;
        synchronized (this.field6923) {
            this.field6923.method939(28093, arg1);
        }
        class117 var5 = this.field6924;
        synchronized (this.field6924) {
            this.field6924.method939(28093, arg1);
        }
        class117 var6 = this.field6925;
        synchronized (this.field6925) {
            this.field6925.method939(28093, arg1);
        }
        int var7 = -56 / ((arg0 + 53) / 42);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(BZ)V")
    public final void method2829(byte arg0, boolean arg1) {
        field6906++;
        if (arg1 == this.field6914) {
            return;
        }
        if (arg0 > -114) {
            method2831(-67, (byte) -87);
        }
        this.field6914 = arg1;
        this.method2832(-2276);
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(II)V")
    public final void method2830(int arg0, int arg1) {
        int var3 = -128 % ((arg0 - 75) / 33);
        this.field6922 = new class117(arg1);
        field6915++;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static final String method2831(int arg0, byte arg1) {
        field6917++;
        String var2 = Integer.toString(arg0);
        int var3 = -22 / ((-arg1 - 70) / 46);
        for (int var4 = var2.length() - 3; var4 > 0; var4 -= 3) {
            var2 = var2.substring(0, var4) + "," + var2.substring(var4);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class343.field4782.method2059(class238.field3511, true) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class343.field4784.method2059(class238.field3511, true) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)V")
    public final void method2832(int arg0) {
        field6920++;
        class117 var2 = this.field6922;
        synchronized (this.field6922) {
            this.field6922.method936(-82);
            if (arg0 != -2276) {
                method2827(-40);
            }
        }
        class117 var3 = this.field6923;
        synchronized (this.field6923) {
            this.field6923.method936(arg0 + 2235);
        }
        class117 var4 = this.field6924;
        synchronized (this.field6924) {
            this.field6924.method936(arg0 + 2201);
        }
        class117 var5 = this.field6925;
        synchronized (this.field6925) {
            this.field6925.method936(-66);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method2833(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field6916++;
        class131 var10 = null;
        for (class131 var11 = (class131) class221.field3303.method3905(-110); var11 != null; var11 = (class131) class221.field3303.method3899(0)) {
            if (var11.field2129 == arg3 && var11.field2128 == arg5 && var11.field2140 == arg7 && var11.field2135 == arg1) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class131();
            var10.field2135 = arg1;
            var10.field2128 = arg5;
            var10.field2140 = arg7;
            var10.field2129 = arg3;
            if (arg5 >= 0 && arg7 >= 0 && arg5 < class430.field6136 && class580.field8504 > arg7) {
                class539.method3172(var10, (byte) -85);
            }
            class221.field3303.method3904(var10, 0);
        }
        var10.field2136 = arg2;
        if (arg8 <= -31) {
            var10.field2138 = arg9;
            var10.field2130 = arg0;
            var10.field2139 = arg4;
            var10.field2131 = arg6;
        }
    }

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "(II)Lnf;")
    public final class119 method2834(int arg0, int arg1) {
        field6907++;
        class117 var3 = this.field6922;
        class119 var4;
        synchronized (this.field6922) {
            var4 = (class119) this.field6922.method941((long) arg1, arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field6921;
        byte[] var6;
        synchronized (this.field6921) {
            var6 = this.field6921.method2081(arg0 ^ 0xFFFFFF80, class336.method1997(255, arg1), class349.method2125(arg1, (byte) 113));
        }
        class119 var7 = new class119();
        var7.field1953 = arg1;
        var7.field1951 = this;
        if (var6 != null) {
            var7.method957((byte) 120, new class465(var6));
        }
        var7.method968(true);
        if (!this.field6909 && var7.field1915) {
            var7.field1936 = null;
            var7.field1948 = null;
        }
        if (var7.field1960) {
            var7.field1921 = 0;
            var7.field1879 = false;
        }
        class117 var8 = this.field6922;
        synchronized (this.field6922) {
            this.field6922.method949((long) arg1, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "(II)V")
    public final void method2835(int arg0, int arg1) {
        this.field6926 = arg1;
        field6911++;
        class117 var3 = this.field6923;
        synchronized (this.field6923) {
            this.field6923.method936(-39);
        }
        class117 var4 = this.field6924;
        synchronized (this.field6924) {
            this.field6924.method936(-106);
        }
        if (arg0 != -1) {
            this.method2832(-112);
        }
        class117 var5 = this.field6925;
        synchronized (this.field6925) {
            this.field6925.method936(-117);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)V")
    public final void method2836(boolean arg0) {
        field6919++;
        class117 var2 = this.field6922;
        synchronized (this.field6922) {
            this.field6922.method950((byte) -127);
        }
        class117 var3 = this.field6923;
        synchronized (this.field6923) {
            this.field6923.method950((byte) 33);
        }
        class117 var4 = this.field6924;
        synchronized (this.field6924) {
            this.field6924.method950((byte) 119);
            if (arg0) {
                this.method2836(false);
            }
        }
        class117 var5 = this.field6925;
        synchronized (this.field6925) {
            this.field6925.method950((byte) -122);
        }
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lgn;IZLvo;Lvo;)V")
    public class485(class529 arg0, int arg1, boolean arg2, class345 arg3, class345 arg4) {
        this.field6912 = arg4;
        this.field6921 = arg3;
        this.field6909 = arg2;
        if (this.field6921 != null) {
            int var6 = this.field6921.method2102(true) - 1;
            this.field6921.method2098(0, var6);
        }
    }
}
