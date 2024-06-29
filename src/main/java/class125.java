import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class125 extends class169 implements class401 {

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "Lej;")
    public class359 field1885;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "Z")
    private boolean field1879;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "Ljo;")
    public static class382 field1877 = new class382(4);

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "[I")
    public static int[] field1887 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "Z")
    public static boolean field1884 = false;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field1893 = new String[100];

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lya;Lpf;IIIIIZIIIIII)V", line = 3)
    public class125(class11 arg0, class486 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class20.method213(-56, arg12, arg11));
        this.field1885 = new class359(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field1879 = ~arg1.field7230 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V", line = 13)
    public static final void method920(int arg0) {
        ++field1878;
        class506 var1 = class14.method185(arg0 ^ -1304589713, 0, arg0);
        var1.method2986(-77);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I", line = 23)
    public final int method223(int arg0) {
        if (arg0 != -19634) {
            this.method231((byte) 71, (class11) null);
        }
        ++field1875;
        return this.field1885.field5491;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lya;I)V", line = 34)
    public final void method234(class11 arg0, int arg1) {
        if (arg1 != 28007) {
            this.method238((class11) null, 40);
        }
        ++field1873;
        class398 var3 = this.field1885.method2157(super.field2488, 262144, true, -23872, arg0, false, super.field2487);
        if (var3 != null) {
            int var4 = super.field2487 >> 7;
            int var5 = super.field2488 >> 7;
            this.field1885.method2154(arg0, var5, var5, var4, var3, (byte) 88, false, var4);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLya;)V", line = 55)
    public final void method231(byte arg0, class11 arg1) {
        ++field1891;
        this.field1885.method2155(arg1, (byte) 80);
        if (arg0 != 33) {
            method922(false);
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)I", line = 66)
    public final int method921(byte arg0) {
        if (arg0 > -109) {
            this.method232(true);
        }
        ++field1892;
        return this.field1885.method2153((byte) -115);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lya;I)Lmo;", line = 80)
    public final class268 method238(class11 arg0, int arg1) {
        ++field1889;
        class398 var3 = this.field1885.method2157(super.field2488, 2048, true, -23872, arg0, false, super.field2487);
        if (var3 == null) {
            return null;
        } else {
            class511 var4 = arg0.method66();
            var4.method1307(super.field2490 + super.field2487, super.field2482, super.field2493 + super.field2488);
            class268 var5 = null;
            if (this.field1879) {
                var5 = class281.method1757(0, 1);
            }
            if (this.field1885.field5505 == null) {
                var3.method640(var4, var5 != null ? var5.field3992[0] : null, 0);
            } else {
                class46 var6 = this.field1885.field5505.method2316();
                arg0.method73(var3, var6, var4, var5 == null ? null : var5.field3992[0], 0);
            }
            int var7 = super.field2487 >> 7;
            int var8 = super.field2488 >> 7;
            if (arg1 != -1) {
                return null;
            } else {
                this.field1885.method2154(arg0, var8, var8, var7, var3, (byte) 88, true, var7);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(Z)V", line = 122)
    public static void method922(boolean arg0) {
        field1877 = null;
        if (!arg0) {
            method923((byte) -127);
        }
        field1887 = null;
        field1893 = null;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)I", line = 134)
    public final int method240(int arg0) {
        if (arg0 != -15578) {
            field1877 = null;
        }
        ++field1886;
        return this.field1885.field5492;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lya;B)V", line = 146)
    public final void method225(class11 arg0, byte arg1) {
        int var3 = 79 / ((arg1 - 42) / 36);
        ++field1882;
        this.field1885.method2149(arg0, 9816);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V", line = 162)
    public final void method229(boolean arg0) {
        ++field1883;
        if (arg0) {
            this.method241(112, (class11) null, -39);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)I", line = 179)
    public final int method222(byte arg0) {
        if (arg0 >= -99) {
            field1880 = 5;
        }
        ++field1881;
        return this.field1885.field5500;
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(B)Z", line = 192)
    public static final boolean method923(byte arg0) {
        ++field1890;
        if (arg0 != -112) {
            method923((byte) -30);
        }
        return class52.field674 != class149.field2269 || ~class234.field3291 <= -3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)Z", line = 203)
    public final boolean method232(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field1888;
            return this.field1885.method2148((byte) 20);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILya;I)Lt;", line = 217)
    public final class398 method241(int arg0, class11 arg1, int arg2) {
        ++field1874;
        int var4 = -77 % ((arg2 - 62) / 42);
        return this.field1885.method2157(0, arg0, false, -23872, arg1, false, 0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILya;II)Z", line = 229)
    public final boolean method233(int arg0, class11 arg1, int arg2, int arg3) {
        if (arg2 != 2) {
            this.field1879 = true;
        }
        ++field1876;
        class398 var5 = this.field1885.method2157(super.field2488, 131072, false, -23872, arg1, false, super.field2487);
        if (var5 == null) {
            return false;
        } else {
            class511 var6 = arg1.method66();
            var6.method1307(super.field2490 + super.field2487, super.field2482, super.field2488 - -super.field2493);
            return var5.method655(arg0, arg3, var6, false);
        }
    }
}
