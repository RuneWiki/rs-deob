import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class229 extends class395 implements class722 {

    @OriginalMember(owner = "client!gj", name = "sb", descriptor = "S")
    private short field3097;

    @OriginalMember(owner = "client!gj", name = "db", descriptor = "B")
    private byte field3082;

    @OriginalMember(owner = "client!gj", name = "ob", descriptor = "Z")
    private boolean field3093;

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "Z")
    private boolean field3073;

    @OriginalMember(owner = "client!gj", name = "bb", descriptor = "Z")
    private boolean field3080;

    @OriginalMember(owner = "client!gj", name = "rb", descriptor = "B")
    private byte field3096;

    @OriginalMember(owner = "client!gj", name = "fb", descriptor = "Z")
    private boolean field3084;

    @OriginalMember(owner = "client!gj", name = "kb", descriptor = "Lr;")
    private class709 field3089;

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "Lka;")
    public class284 field3074;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "[[I")
    public static int[][] field3070 = new int[128][128];

    @OriginalMember(owner = "client!gj", name = "tb", descriptor = "D")
    public static double field3098;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!gj", name = "Y", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!gj", name = "Z", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!gj", name = "ab", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!gj", name = "cb", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!gj", name = "eb", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!gj", name = "gb", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!gj", name = "hb", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!gj", name = "ib", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!gj", name = "jb", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!gj", name = "lb", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!gj", name = "mb", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!gj", name = "nb", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!gj", name = "pb", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!gj", name = "qb", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!gj", name = "ub", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!gj", name = "vb", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!gj", name = "wb", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!gj", name = "xb", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!gj", name = "yb", descriptor = "Liha;")
    private class613 field3103;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gj", name = "zb", descriptor = "Ljava/lang/Class;")
    public static Class field3104;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
    public final void method795(int arg0) {
        ++field3069;
        if (this.field3074 != null) {
            this.field3074.method1705();
        }
        if (arg0 <= 31) {
            this.method1362(-113, (byte) 74, (class548) null);
        }
    }

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "(I)V")
    public final void method641(int arg0) {
        ++field3079;
        this.field3080 = false;
        if (this.field3074 != null) {
            this.field3074.method1691(-65537 & this.field3074.method1703());
        }
        if (arg0 <= 91) {
            this.method653((class548) null, (byte) -76);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)I")
    public final int method782(byte arg0) {
        ++field3102;
        int var2 = 95 / ((-5 - arg0) / 54);
        return this.field3097 & 65535;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(B)V")
    public static void method1358(byte arg0) {
        int var1 = -49 % ((43 - arg0) / 62);
        field3070 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZLha;)V")
    public final void method659(boolean arg0, class548 arg1) {
        ++field3090;
        if (arg0) {
            this.field3103 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "(I)I")
    public final int method790(int arg0) {
        if (arg0 != -11692) {
            field3070 = null;
        }
        ++field3099;
        return this.field3074 != null ? this.field3074.method1668() : 0;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLha;ZILuq;II)V")
    public final void method648(byte arg0, class548 arg1, boolean arg2, int arg3, class318 arg4, int arg5, int arg6) {
        if (arg0 >= -8) {
            this.method641(-70);
        }
        ++field3075;
        if (!(arg4 instanceof class539)) {
            if (arg4 instanceof class229) {
                class229 var8 = (class229) arg4;
                if (this.field3074 != null && var8.field3074 != null) {
                    this.field3074.method1654(var8.field3074, arg6, arg3, arg5, arg2);
                    return;
                }
            }
        } else {
            class539 var9 = (class539) arg4;
            if (this.field3074 == null || var9.field7487 == null) {
                return;
            }
            this.field3074.method1654(var9.field7487, arg6, arg3, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "(I)Z")
    public final boolean method783(int arg0) {
        ++field3091;
        if (arg0 != 0) {
            this.method648((byte) 76, (class548) null, true, 5, (class318) null, -119, 23);
        }
        if (this.field3074 != null) {
            return !this.field3074.method1689();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lha;Lts;IIIIIZIIIIIIZ)V")
    public class229(class548 arg0, class220 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field2932 == 1, class97.method665(arg12, 10629, arg13));
        this.field3097 = (short) arg1.field2964;
        this.field3082 = (byte) arg12;
        this.field3093 = arg7;
        this.field3073 = arg1.field2948 != 0 && !arg7;
        super.field4419 = (byte) arg3;
        this.field3080 = arg14;
        this.field3096 = (byte) arg13;
        this.field3084 = arg0.method1490() && arg1.field2956 && !this.field3093 && ~class332.field4707.field4787.method942(0) != -1;
        int var16 = 2048;
        if (this.field3080) {
            var16 |= 65536;
        }
        class308 var17 = this.method1360(arg0, this.field3084, (byte) 126, var16);
        if (var17 != null) {
            this.field3089 = var17.field4321;
            this.field3074 = var17.field4319;
            if (this.field3080) {
                this.field3074 = this.field3074.method1659((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(Lha;B)Liha;")
    public final class613 method653(class548 arg0, byte arg1) {
        ++field3076;
        if (arg1 != 13) {
            this.field3097 = 85;
        }
        if (this.field3103 == null) {
            this.field3103 = class491.method2980(super.field4418, -105, super.field4413, this.method1362(0, (byte) 23, arg0), super.field4410);
        }
        return this.field3103;
    }

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "(I)I")
    public final int method1359(int arg0) {
        ++field3100;
        if (arg0 != 0) {
            return 39;
        } else {
            return this.field3074 == null ? 15 : this.field3074.method1658() / 4;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lha;ZBI)Lcn;")
    private final class308 method1360(class548 arg0, boolean arg1, byte arg2, int arg3) {
        ++field3095;
        if (arg2 != 126) {
            return null;
        } else {
            class220 var5 = class20.field192.method716(6, 65535 & this.field3097);
            class341 var6;
            class341 var7;
            if (!this.field3093) {
                if (~super.field4419 > -4) {
                    var6 = class550.field7649[super.field4419 + 1];
                } else {
                    var6 = null;
                }
                var7 = class550.field7649[super.field4419];
            } else {
                var6 = class550.field7649[0];
                var7 = class371.field5240[super.field4419];
            }
            return var5.method1295(~this.field3082 == -12 ? 4 - -this.field3096 : this.field3096, -5488, (class77) null, arg3, arg0, ~this.field3082 == -12 ? 10 : this.field3082, super.field4418, arg1, super.field4413, var6, var7, super.field4410);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILha;IB)Z")
    public final boolean method644(int arg0, class548 arg1, int arg2, byte arg3) {
        ++field3071;
        class284 var5 = this.method1362(131072, (byte) -93, arg1);
        if (arg3 >= -58) {
            this.method785(-38);
        }
        if (var5 != null) {
            class744 var6 = arg1.method1404();
            var6.method905(super.field4410, super.field4413, super.field4418);
            return !class301.field4261 ? var5.method1669(arg0, arg2, var6, false, 0) : var5.method1653(arg0, arg2, var6, false, 0, class3.field30);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)I")
    public final int method794(int arg0) {
        if (arg0 < 92) {
            this.field3103 = null;
        }
        ++field3085;
        return this.field3096;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lha;I)Lua;")
    public final class3 method660(class548 arg0, int arg1) {
        ++field3088;
        if (this.field3074 == null) {
            return null;
        } else if (arg1 != -1) {
            return null;
        } else {
            class744 var3 = arg0.method1404();
            var3.method905(super.field4410, super.field4413, super.field4418);
            class3 var4 = class682.method3841(1, this.field3073, 28389);
            if (!class301.field4261) {
                this.field3074.method1686(var3, var4.field18[0], 0);
            } else {
                this.field3074.method1682(var3, var4.field18[0], class3.field30, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "(I)Z")
    public final boolean method785(int arg0) {
        ++field3072;
        if (arg0 > -117) {
            method1363(-113, (Object) null, false);
        }
        return this.field3074 != null ? this.field3074.method1673() : false;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)Z")
    public final boolean method781(int arg0) {
        if (arg0 > -86) {
            return true;
        } else {
            ++field3086;
            return this.field3084;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)Z")
    public final boolean method642(byte arg0) {
        if (arg0 != 2) {
            this.method795(110);
        }
        ++field3101;
        return this.field3080;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZIII)Z")
    public static final boolean method1361(boolean arg0, int arg1, int arg2, int arg3) {
        ++field3068;
        class722 var4 = (class722) class376.method2357(arg2, arg3, arg1);
        boolean var5 = arg0;
        if (var4 != null) {
            var5 = arg0 & class68.method538((byte) 104, var4);
        }
        class722 var6 = (class722) class141.method932(arg2, arg3, arg1, field3104 != null ? field3104 : (field3104 = method1364("bda")));
        if (var6 != null) {
            var5 &= class68.method538((byte) -60, var6);
        }
        class722 var7 = (class722) class134.method851(arg2, arg3, arg1);
        if (var7 != null) {
            var5 &= class68.method538((byte) 122, var7);
        }
        return var5;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBLha;)Lka;")
    private final class284 method1362(int arg0, byte arg1, class548 arg2) {
        ++field3078;
        if (this.field3074 != null && arg2.method1484(this.field3074.method1703(), arg0) == 0) {
            return this.field3074;
        } else {
            int var4 = 112 / ((arg1 - -24) / 36);
            class308 var5 = this.method1360(arg2, false, (byte) 126, arg0);
            return var5 != null ? var5.field4319 : null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)I")
    public final int method784(int arg0) {
        ++field3087;
        if (arg0 != -4532) {
            this.field3073 = false;
        }
        return this.field3082;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
    public static final byte[] method1363(int arg0, Object arg1, boolean arg2) {
        ++field3077;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class605.method3446(3, var3) : var3;
        } else if (arg1 instanceof class483) {
            class483 var4 = (class483) arg1;
            return var4.method2941(0);
        } else if (arg0 <= 25) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lha;B)V")
    public final void method792(class548 arg0, byte arg1) {
        ++field3094;
        if (arg1 < -105) {
            Object var3 = null;
            class709 var5;
            if (this.field3089 == null && this.field3084) {
                class308 var4 = this.method1360(arg0, true, (byte) 126, 262144);
                var5 = var4 == null ? null : var4.field4321;
            } else {
                var5 = this.field3089;
                this.field3089 = null;
            }
            if (var5 != null) {
                class569.method3336(var5, super.field4419, super.field4410, super.field4418, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)I")
    public final int method793(byte arg0) {
        ++field3092;
        if (arg0 != -86) {
            this.method1359(-39);
        }
        return this.field3074 == null ? 0 : this.field3074.method1697();
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lha;Z)V")
    public final void method786(class548 arg0, boolean arg1) {
        ++field3081;
        Object var3 = null;
        class709 var5;
        if (this.field3089 == null && this.field3084) {
            class308 var4 = this.method1360(arg0, true, (byte) 126, 262144);
            var5 = var4 == null ? null : var4.field4321;
        } else {
            var5 = this.field3089;
            this.field3089 = null;
        }
        if (var5 != null) {
            class569.method3337(var5, super.field4419, super.field4410, super.field4418, (boolean[]) null);
        }
        if (!arg1) {
            this.method1359(23);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1364(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
