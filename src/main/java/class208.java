import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class208 extends class578 implements class141 {

    @OriginalMember(owner = "client!su", name = "O", descriptor = "Z")
    private boolean field2976 = false;

    @OriginalMember(owner = "client!su", name = "bb", descriptor = "Lfc;")
    public class258 field2989;

    @OriginalMember(owner = "client!su", name = "T", descriptor = "Z")
    private boolean field2981;

    @OriginalMember(owner = "client!su", name = "L", descriptor = "I")
    public static int field2973 = 0;

    @OriginalMember(owner = "client!su", name = "N", descriptor = "Lkg;")
    public static class271 field2975 = new class271("", 14);

    @OriginalMember(owner = "client!su", name = "ib", descriptor = "Lqaa;")
    public static class27 field2996 = new class27(45, -1);

    @OriginalMember(owner = "client!su", name = "gb", descriptor = "F")
    public static float field2994;

    @OriginalMember(owner = "client!su", name = "G", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!su", name = "H", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!su", name = "I", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!su", name = "K", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!su", name = "M", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!su", name = "P", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!su", name = "Q", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!su", name = "R", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!su", name = "S", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!su", name = "U", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!su", name = "V", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!su", name = "W", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!su", name = "X", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!su", name = "Y", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!su", name = "Z", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!su", name = "ab", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!su", name = "cb", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!su", name = "db", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!su", name = "eb", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!su", name = "hb", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!su", name = "jb", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!su", name = "kb", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!su", name = "J", descriptor = "Ltb;")
    private class397 field2971;

    @OriginalMember(owner = "client!su", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field2993;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "(B)Z")
    public final boolean method395(byte arg0) {
        ++field2979;
        if (arg0 != 84) {
            this.field2971 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)Z")
    public final boolean method1113(int arg0) {
        if (arg0 != -24333) {
            method1448((byte) -121);
        }
        ++field2988;
        return this.field2989.method1753(false);
    }

    @OriginalMember(owner = "client!su", name = "f", descriptor = "(I)V")
    public final void method400(int arg0) {
        if (arg0 >= 33) {
            ++field2990;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lha;I)V")
    public final void method1108(class58 arg0, int arg1) {
        this.field2989.method1752(arg0, (byte) -45);
        int var3 = 97 / ((arg1 - 44) / 49);
        ++field2998;
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)V")
    public final void method1114(int arg0) {
        ++field2992;
        if (arg0 <= 63) {
            this.method390((class58) null, -74, false, 29);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lha;IZI)Z")
    public final boolean method390(class58 arg0, int arg1, boolean arg2, int arg3) {
        ++field2986;
        if (!arg2) {
            field2996 = null;
        }
        class469 var5 = this.field2989.method1747(131072, -1, arg0, false, false);
        if (var5 == null) {
            return false;
        } else {
            class280 var6 = arg0.method530();
            var6.method157(super.field644, super.field651, super.field648);
            return class339.field4781 ? var5.method318(arg3, arg1, var6, false, 0, class220.field3129) : var5.method348(arg3, arg1, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lha;Luw;IIIIIZII)V")
    public class208(class58 arg0, class414 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field5726);
        this.field2989 = new class258(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field2981 = ~arg1.field5737 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(BLha;)Lvw;")
    public final class304 method396(byte arg0, class58 arg1) {
        ++field2969;
        class469 var3 = this.field2989.method1747(2048, -1, arg1, true, false);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 <= 3) {
                this.method405((byte) -36, -20, (class58) null, (class43) null, false, -13, -115);
            }
            class280 var4 = arg1.method530();
            var4.method157(super.field644, super.field651, super.field648);
            class304 var5 = class359.method2239(1, this.field2981, (byte) 127);
            int var6 = super.field644 >> 9;
            int var7 = super.field648 >> 9;
            this.field2989.method1754(var7, arg1, -193, var4, true, var7, var6, var3, var6);
            if (!class339.field4781) {
                var3.method329(var4, var5.field4298[0], 0);
            } else {
                var3.method343(var4, var5.field4298[0], class220.field3129, 0);
            }
            if (this.field2989.field3736 != null) {
                class624 var8 = this.field2989.field3736.method4185();
                if (class339.field4781) {
                    arg1.method643(var8, class220.field3129);
                } else {
                    arg1.method593(var8);
                }
            }
            this.field2976 = var3.method332() || this.field2989.field3736 != null;
            if (this.field2971 != null) {
                class715.method3982(-24762, super.field648, super.field651, this.field2971, var3, super.field644);
            } else {
                this.field2971 = class719.method4012(super.field644, super.field648, var3, super.field651, (byte) -108);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)I")
    public final int method1111(boolean arg0) {
        if (arg0) {
            this.field2971 = null;
        }
        ++field2995;
        return this.field2989.field3755;
    }

    @OriginalMember(owner = "client!su", name = "h", descriptor = "(I)I")
    public final int method404(int arg0) {
        ++field2987;
        if (arg0 != 65535) {
            this.method1108((class58) null, -99);
        }
        return this.field2989.method1755(1709088134);
    }

    @OriginalMember(owner = "client!su", name = "g", descriptor = "(B)Z")
    public final boolean method399(byte arg0) {
        if (arg0 != 38) {
            field2975 = null;
        }
        ++field2985;
        return this.field2976;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BLha;)V")
    public final void method1110(byte arg0, class58 arg1) {
        this.field2989.method1751(arg1, true);
        if (arg0 >= 9) {
            ++field2980;
        }
    }

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(BLha;)V")
    public final void method401(byte arg0, class58 arg1) {
        if (arg0 == -39) {
            ++field2978;
            class469 var3 = this.field2989.method1747(262144, -1, arg1, true, true);
            if (var3 != null) {
                int var4 = super.field644 >> 9;
                int var5 = super.field648 >> 9;
                class280 var6 = arg1.method530();
                var6.method157(super.field644, super.field651, super.field648);
                this.field2989.method1754(var5, arg1, -193, var6, false, var5, var4, var3, var4);
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ZI)V")
    public static final void method1447(boolean arg0, int arg1) {
        ++field2972;
        if (class750.field10477 == null) {
            class242.method1624(11875);
        }
        if (arg0) {
            class750.field10477.method2262(0);
        }
        if (arg1 != 45) {
            method1447(false, 32);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lha;Z)Ltb;")
    public final class397 method397(class58 arg0, boolean arg1) {
        ++field2968;
        if (arg1) {
            this.method1108((class58) null, 12);
        }
        return this.field2971;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BILha;Lgs;ZII)V")
    public final void method405(byte arg0, int arg1, class58 arg2, class43 arg3, boolean arg4, int arg5, int arg6) {
        ++field2977;
        if (arg0 > -5) {
            field2982 = -122;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!su", name = "h", descriptor = "(B)Z")
    public final boolean method402(byte arg0) {
        ++field2984;
        return arg0 < 28;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)I")
    public final int method1109(byte arg0) {
        ++field2970;
        int var2 = -57 % ((-45 - arg0) / 39);
        return this.field2989.field3764;
    }

    @OriginalMember(owner = "client!su", name = "i", descriptor = "(B)V")
    public static void method1448(byte arg0) {
        field2975 = null;
        field2993 = null;
        if (arg0 >= -67) {
            method1448((byte) -49);
        }
        field2996 = null;
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(B)I")
    public final int method1112(byte arg0) {
        int var2 = 125 % ((-75 - arg0) / 34);
        ++field2991;
        return this.field2989.field3757;
    }

    @OriginalMember(owner = "client!su", name = "d", descriptor = "(B)I")
    public final int method393(byte arg0) {
        ++field2983;
        return arg0 != -83 ? -41 : this.field2989.method1757(false);
    }
}
