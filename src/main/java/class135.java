import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class135 extends class254 implements class161 {

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "B")
    private byte field1924;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "B")
    private byte field1939;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "Z")
    private boolean field1930;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "S")
    private short field1917;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "B")
    private byte field1931;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "Z")
    private boolean field1922;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "Z")
    private boolean field1934;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "Z")
    private boolean field1920;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "Lek;")
    private class294 field1938;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "Lhc;")
    public class75 field1923;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "[I")
    public static int[] field1925 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "Lqj;")
    public static class296 field1929;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "[I")
    public static int[] field1926;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)I", line = 3)
    public final int method126(int arg0) {
        ++field1933;
        return arg0 != -13482 ? -121 : this.field1917 & 65535;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILaa;B)Lhc;", line = 17)
    private final class75 method936(int arg0, class281 arg1, byte arg2) {
        if (arg2 != 46) {
            return null;
        } else {
            ++field1936;
            if (this.field1923 != null && arg1.method1732(this.field1923.method533(), arg0) == 0) {
                return this.field1923;
            } else {
                class169 var4 = this.method939(65535, arg0, arg1, false);
                return var4 == null ? null : var4.field2401;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)V", line = 38)
    public static void method937(int arg0) {
        field1926 = null;
        if (arg0 != 1) {
            field1929 = null;
        }
        field1925 = null;
        field1929 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Laa;Z)V", line = 50)
    public final void method128(class281 arg0, boolean arg1) {
        ++field1940;
        if (!arg1) {
            this.field1920 = false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)Z", line = 64)
    public final boolean method127(byte arg0) {
        int var2 = -34 / ((-52 - arg0) / 33);
        ++field1918;
        return this.field1920;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)I", line = 82)
    public final int method124(int arg0) {
        ++field1941;
        if (arg0 != -11197) {
            field1925 = null;
        }
        return this.field1931;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)I", line = 99)
    public final int method123(byte arg0) {
        if (arg0 < 108) {
            this.method128((class281) null, false);
        }
        ++field1935;
        return this.field1924;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V", line = 110)
    public final void method135(byte arg0) {
        this.field1930 = false;
        if (arg0 != -123) {
            this.field1931 = 47;
        }
        ++field1944;
        if (this.field1923 != null) {
            this.field1923.method508(this.field1923.method533() & -32769);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBI)V", line = 126)
    public static final void method938(int arg0, byte arg1, int arg2) {
        ++field1942;
        if (arg1 > 72) {
            int var3 = class307.field4211.field956[0];
            int var4 = class307.field4211.field944[0];
            if (class180.field2521 != 1) {
                if (!class386.method2522(var4, 0, false, 1, -3, (byte) -120, var3, 0, 1, arg0, arg2)) {
                    class386.method2522(var4, 0, false, 1, -2, (byte) -65, var3, 0, 1, arg0, arg2);
                }
            } else if (!class386.method2522(var4, 0, false, 1, -2, (byte) 72, var3, 0, 1, arg0, arg2)) {
                class386.method2522(var4, 0, false, 1, -3, (byte) 95, var3, 0, 1, arg0, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)Z", line = 156)
    public final boolean method137(int arg0) {
        ++field1921;
        if (arg0 != 0) {
            this.field1931 = 87;
        }
        return this.field1930;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V", line = 168)
    public final void method138(int arg0) {
        if (this.field1923 != null) {
            this.field1923.method494();
        }
        if (arg0 == -4728) {
            ++field1916;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILaa;Z)Lvn;", line = 184)
    private final class169 method939(int arg0, int arg1, class281 arg2, boolean arg3) {
        ++field1937;
        class369 var5 = class310.method1961(this.field1917 & arg0, (byte) 35);
        class156 var6;
        class156 var7;
        if (this.field1922) {
            var6 = class156.field2213[0];
            var7 = class435.field6248[this.field1939];
        } else {
            var7 = class156.field2213[this.field1939];
            if (~this.field1939 > -4) {
                var6 = class156.field2213[this.field1939 + 1];
            } else {
                var6 = null;
            }
        }
        return var5.method2362(super.field3490, var7, this.field1924, arg2, 89, this.field1931, var6, super.field3481, super.field3488, arg3, arg1);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZIILaa;ILqh;)V", line = 211)
    public final void method129(int arg0, boolean arg1, int arg2, int arg3, class281 arg4, int arg5, class43 arg6) {
        if (!(arg6 instanceof class135)) {
            if (arg6 instanceof class86) {
                class86 var8 = (class86) arg6;
                if (this.field1923 != null && var8.field1313 != null) {
                    this.field1923.method535(var8.field1313, arg3, arg5, arg2, arg1);
                }
            }
        } else {
            class135 var9 = (class135) arg6;
            if (this.field1923 != null && var9.field1923 != null) {
                this.field1923.method535(var9.field1923, arg3, arg5, arg2, arg1);
            }
        }
        ++field1928;
        if (arg0 != 0) {
            this.method138(-39);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Laa;B)V", line = 240)
    public final void method133(class281 arg0, byte arg1) {
        ++field1943;
        Object var3 = null;
        class294 var5;
        if (this.field1938 == null && this.field1920) {
            class169 var4 = this.method939(arg1 ^ -65435, 131072, arg0, true);
            var5 = var4 == null ? null : var4.field2405;
        } else {
            var5 = this.field1938;
            this.field1938 = null;
        }
        if (arg1 != -102) {
            this.field1917 = 52;
        }
        if (var5 != null) {
            class209.method1358(var5, this.field1939, super.field3481, super.field3488, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Laa;IB)Lhc;", line = 275)
    public final class75 method134(class281 arg0, int arg1, byte arg2) {
        if (arg2 >= -25) {
            this.method939(-6, 86, (class281) null, true);
        }
        ++field1919;
        return this.method936(arg1, arg0, (byte) 46);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIILaa;)Z", line = 287)
    public final boolean method136(int arg0, int arg1, int arg2, class281 arg3) {
        ++field1932;
        if (arg0 != 0) {
            return true;
        } else {
            class75 var5 = this.method936(65536, arg3, (byte) 46);
            if (var5 != null) {
                class261 var6 = arg3.method1769();
                var6.method882(super.field3481, super.field3490, super.field3488);
                return var5.method516(arg1, arg2, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Laa;B)V", line = 311)
    public final void method122(class281 arg0, byte arg1) {
        ++field1927;
        Object var3 = null;
        class294 var5;
        if (this.field1938 == null && this.field1920) {
            class169 var4 = this.method939(65535, 131072, arg0, true);
            var5 = var4 == null ? null : var4.field2405;
        } else {
            var5 = this.field1938;
            this.field1938 = null;
        }
        if (arg1 <= 16) {
            field1929 = null;
        }
        if (var5 != null) {
            class409.method2624(var5, this.field1939, super.field3481, super.field3488, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Laa;I)Lcn;", line = 338)
    public final class300 method131(class281 arg0, int arg1) {
        ++field1915;
        if (arg1 <= 72) {
            return null;
        } else if (this.field1923 == null) {
            return null;
        } else {
            class261 var3 = arg0.method1769();
            var3.method882(super.field3481, super.field3490, super.field3488);
            class300 var4 = null;
            if (this.field1934) {
                var4 = class8.method54((byte) -114, 1);
            }
            this.field1923.method514(var3, var4 != null ? var4.field4152[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Laa;Lsk;IIIIZIIZ)V", line = 365)
    public class135(class281 arg0, class369 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class107.method727((byte) 126, arg7, arg8));
        this.field1924 = (byte) arg7;
        super.field3488 = (short) arg5;
        this.field1939 = (byte) arg2;
        this.field1930 = arg9;
        this.field1917 = (short) arg1.field5204;
        this.field1931 = (byte) arg8;
        super.field3481 = (short) arg3;
        this.field1922 = arg6;
        this.field1934 = arg1.field5221 != 0 && !arg6;
        this.field1920 = arg0.method1753() && arg1.field5176 && !this.field1922 && class410.field5956 != 0;
        int var11 = 1024;
        if (this.field1930) {
            var11 |= 32768;
        }
        class169 var12 = this.method939(65535, var11, arg0, this.field1920);
        if (var12 != null) {
            this.field1938 = var12.field2405;
            this.field1923 = var12.field2401;
            if (this.field1930) {
                this.field1923 = this.field1923.method529((byte) 0, var11, false);
                return;
            }
        }
    }
}
