import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class18 extends class128 {

    @OriginalMember(owner = "client!sl", name = "xc", descriptor = "Z")
    public static boolean field196 = false;

    @OriginalMember(owner = "client!sl", name = "wc", descriptor = "Lcc;")
    public static class216 field195 = new class216(64);

    @OriginalMember(owner = "client!sl", name = "yc", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!sl", name = "zc", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!sl", name = "Ac", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!sl", name = "Bc", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!sl", name = "Cc", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!sl", name = "Ec", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!sl", name = "Fc", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!sl", name = "Hc", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!sl", name = "Ic", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!sl", name = "Jc", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!sl", name = "Gc", descriptor = "Ls;")
    public class245 field205;

    @OriginalMember(owner = "client!sl", name = "Dc", descriptor = "Lclient;")
    public static client field202;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "()I")
    public final int method3() {
        ++field197;
        return super.field1892;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILs;)V")
    public final void method122(int arg0, class245 arg1) {
        this.field205 = arg1;
        if (super.field1886 != null) {
            super.field1886.method1160();
        }
        ++field200;
        if (arg0 != -3662) {
            method127(17);
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)Z")
    public final boolean method123(byte arg0) {
        ++field199;
        if (arg0 != 85) {
            this.method122(-115, (class245) null);
        }
        return this.field205 != null;
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)I")
    public final int method124(int arg0) {
        ++field204;
        if (arg0 != 127) {
            field195 = null;
        }
        if (this.field205.field3972 != null) {
            class245 var2 = this.field205.method1758(true);
            if (var2 != null && var2.field4008 != -1) {
                return var2.field4008;
            }
        }
        return super.field1927;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZI)Lnd;")
    public static final class270 method125(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            class270 var2 = (class270) class162.field2641.method310(-24190, (long) arg1);
            ++field203;
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class20.field225.method643(arg1, 26, false);
                class270 var4 = new class270();
                if (var3 != null) {
                    var4.method1877(5613, new class152(var3));
                }
                class162.field2641.method312((long) arg1, var4, (byte) 114);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BI)I")
    public static final int method126(byte arg0, int arg1) {
        int var2 = -98 % ((arg0 - 69) / 57);
        ++field207;
        return 127 & arg1 >> 11;
    }

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "(I)V")
    public static void method127(int arg0) {
        if (arg0 != -1) {
            method127(-92);
        }
        field195 = null;
        field202 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIIIJILbj;)V")
    public final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class157 arg10) {
        ++field198;
        if (this.field205 != null) {
            class141 var13 = super.field1932 != -1 && super.field1941 == 0 ? class285.method1939(super.field1932, 112) : null;
            class141 var14 = ~super.field1966 == 0 || super.field1966 == this.method917((byte) 118).field3760 && var13 != null ? null : class285.method1939(super.field1966, 112);
            class22 var15 = this.field205.method1759(var13, super.field1921, super.field1889, var14, super.field1970, super.field1937, super.field1888, super.field1875, 736535824, super.field1951);
            if (var15 != null) {
                super.field1892 = var15.method3();
                class245 var16 = this.field205;
                if (var16.field3972 != null) {
                    var16 = var16.method1758(true);
                }
                if (class25.field287 && var16.field3968) {
                    class22 var17 = class198.method1458(this.field205.field4012, var14 == null ? super.field1921 : super.field1875, super.field1907, this.field205.field3997, var14 == null ? var13 : var14, super.field1979, this.field205.field4003, super.field1910, var15, false, this.field205.field3981, super.field1950, this.field205.field4004, arg0);
                    var17.method2(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field1886);
                }
                this.method926(125, var15);
                this.method920(arg0, -24517, var15);
                class22 var18 = null;
                if (super.field1934 != -1 && super.field1948 != -1) {
                    class55 var19 = class187.method1387((byte) 61, super.field1934);
                    var18 = var19.method412(super.field1948, super.field1891, -16861, super.field1923);
                    if (var18 != null) {
                        var18.method156(0, -super.field1944, 0);
                        if (var19.field790) {
                            if (~class56.field802 != -1) {
                                var18.method161(class56.field802);
                            }
                            if (~class184.field2977 != -1) {
                                var18.method152(class184.field2977);
                            }
                            if (class138.field2231 != 0) {
                                var18.method156(0, class138.field2231, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class246) var15).method1770(var18);
                }
                if (this.field205.field3997 == 1) {
                    var15.field246 = true;
                }
                var15.method2(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field1886);
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field206;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIII)V")
    public final void method4(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field208;
        if (this.field205 != null) {
            ;
        }
    }
}
