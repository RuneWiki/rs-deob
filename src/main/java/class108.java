import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class108 extends class192 implements class518 {

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "B")
    private byte field1928;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "B")
    private byte field1917;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "B")
    private byte field1925;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "S")
    private short field1916;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "Z")
    private boolean field1933;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "Z")
    private boolean field1920;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "Z")
    private boolean field1910;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "Li;")
    private class515 field1922;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Le;")
    private class530 field1911;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "Llo;")
    public static class306 field1921 = new class306("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "Lrr;")
    public static class280 field1931 = new class280(9, 0, 4, 1);

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "Lec;")
    public static class68 field1935 = null;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "Lpu;")
    public static class411 field1934 = new class411();

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "[C")
    public static char[] field1936 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(Z)V", line = 4)
    public static void method779(boolean arg0) {
        field1935 = null;
        field1921 = null;
        if (!arg0) {
            field1935 = null;
        }
        field1931 = null;
        field1934 = null;
        field1936 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILza;)Le;", line = 22)
    private final class530 method780(int arg0, int arg1, class491 arg2) {
        if (arg0 != 14704) {
            this.field1922 = null;
        }
        ++field1913;
        if (this.field1911 != null && arg2.method902(this.field1911.method741(), arg1) == 0) {
            return this.field1911;
        } else {
            class489 var4 = this.method781(arg2, false, (byte) 98, arg1);
            return var4 != null ? var4.field7150 : null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)I", line = 42)
    public final int method274(int arg0) {
        ++field1909;
        if (arg0 != -2) {
            field1936 = null;
        }
        return this.field1911 != null ? this.field1911.method726() : 0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lza;III)Z", line = 56)
    public final boolean method27(class491 arg0, int arg1, int arg2, int arg3) {
        ++field1908;
        class530 var5 = this.method780(14704, 131072, arg0);
        if (arg1 < 121) {
            return true;
        } else if (var5 != null) {
            class202 var6 = arg0.method820();
            var6.method1246(super.field2978, super.field2981, super.field2988);
            return var5.method776(arg3, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lza;Lp;IIIIZIIIII)V", line = 85)
    public class108(class491 arg0, class39 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class295.method1892(arg11, arg10, -16353));
        this.field1928 = (byte) arg2;
        super.field2978 = arg3;
        this.field1917 = (byte) arg10;
        this.field1925 = (byte) arg11;
        this.field1916 = (short) arg1.field587;
        this.field1933 = arg6;
        super.field2988 = arg5;
        this.field1920 = arg1.field618 != 0 && !arg6;
        this.field1910 = arg0.method841() && arg1.field655 && !this.field1933 && class510.field7403.method2041(126, class511.field7485) != 0;
        class489 var13 = this.method781(arg0, this.field1910, (byte) 98, 2048);
        if (var13 != null) {
            this.field1922 = var13.field7152;
            this.field1911 = var13.field7150;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lza;ZBI)Ljl;", line = 109)
    private final class489 method781(class491 arg0, boolean arg1, byte arg2, int arg3) {
        ++field1930;
        if (arg2 != 98) {
            return null;
        } else {
            class39 var5 = class61.field928.method791(this.field1916 & 65535, true);
            class220 var6;
            class220 var7;
            if (!this.field1933) {
                var6 = class511.field7488[this.field1928];
                if (~this.field1928 <= -4) {
                    var7 = null;
                } else {
                    var7 = class511.field7488[this.field1928 + 1];
                }
            } else {
                var6 = class320.field5039[this.field1928];
                var7 = class511.field7488[0];
            }
            return var5.method298(arg0, super.field2978, var6, super.field2988, arg1, arg3, this.field1917, super.field2981, var7, this.field1925, 7280);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I", line = 140)
    public final int method28(byte arg0) {
        if (arg0 != -118) {
            field1937 = -20;
        }
        ++field1932;
        return 65535 & this.field1916;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILza;)V", line = 154)
    public final void method34(int arg0, class491 arg1) {
        ++field1919;
        if (arg0 == 25747) {
            Object var3 = null;
            class515 var5;
            if (this.field1922 == null && this.field1910) {
                class489 var4 = this.method781(arg1, true, (byte) 98, 262144);
                var5 = var4 != null ? var4.field7152 : null;
            } else {
                var5 = this.field1922;
                this.field1922 = null;
            }
            if (var5 != null) {
                class335.method2114(var5, this.field1928, super.field2978, super.field2988, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILza;I)Le;", line = 187)
    public final class530 method32(int arg0, class491 arg1, int arg2) {
        ++field1926;
        int var4 = -63 / ((arg2 - -24) / 60);
        return this.method780(14704, arg0, arg1);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I", line = 197)
    public final int method38(int arg0) {
        ++field1923;
        return arg0 != 5638 ? 109 : this.field1925;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLza;)V", line = 209)
    public final void method26(byte arg0, class491 arg1) {
        if (arg0 != 111) {
            field1936 = null;
        }
        ++field1929;
        Object var3 = null;
        class515 var5;
        if (this.field1922 == null && this.field1910) {
            class489 var4 = this.method781(arg1, true, (byte) 98, 262144);
            var5 = var4 == null ? null : var4.field7152;
        } else {
            var5 = this.field1922;
            this.field1922 = null;
        }
        if (var5 != null) {
            class219.method1506(var5, this.field1928, super.field2978, super.field2988, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(ILza;)Lsr;", line = 237)
    public final class430 method40(int arg0, class491 arg1) {
        ++field1912;
        if (this.field1911 == null) {
            return null;
        } else {
            class202 var3 = arg1.method820();
            if (arg0 > -24) {
                this.method28((byte) 6);
            }
            var3.method1246(super.field2983 + super.field2978, super.field2981, super.field2988 - -super.field2984);
            class430 var4 = null;
            if (this.field1920) {
                var4 = class21.method111((byte) 117, 1);
            }
            this.field1911.method736(var3, var4 == null ? null : var4.field6447[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(BLza;)V", line = 263)
    public final void method43(byte arg0, class491 arg1) {
        if (arg0 != 35) {
            this.field1920 = false;
        }
        ++field1915;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)Z", line = 276)
    public final boolean method33(byte arg0) {
        ++field1918;
        int var2 = -94 / ((arg0 - 8) / 45);
        return this.field1910;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V", line = 287)
    public final void method31(int arg0) {
        ++field1914;
        if (this.field1911 != null) {
            this.field1911.method743();
        }
        int var2 = -74 % ((arg0 - 57) / 48);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I", line = 301)
    public final int method29(int arg0) {
        int var2 = -3 % ((arg0 - 40) / 52);
        ++field1927;
        return this.field1917;
    }
}
