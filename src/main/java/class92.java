import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class92 extends class206 implements class285 {

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "Z")
    private boolean field1078;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "Z")
    private boolean field1066;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "B")
    private byte field1067;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "S")
    private short field1056;

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "Z")
    private boolean field1080;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "B")
    private byte field1075;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "Z")
    private boolean field1063;

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "Ljn;")
    private class396 field1059;

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "Lve;")
    private class307 field1064;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "Z")
    public static boolean field1058 = true;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "F")
    public static float field1057;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "Lam;")
    public static class286 field1062;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I")
    public final int method356(int arg0) {
        ++field1072;
        if (arg0 != 10397) {
            field1058 = false;
        }
        return this.field1056 & 65535;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lvm;I)V")
    public final void method352(class322 arg0, int arg1) {
        ++field1076;
        if (arg1 != 0) {
            field1054 = 12;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZIIILai;ILvm;)V")
    public final void method353(boolean arg0, int arg1, int arg2, int arg3, class128 arg4, int arg5, class322 arg6) {
        ++field1073;
        if (arg1 >= 36) {
            if (arg4 instanceof class92) {
                class92 var8 = (class92) arg4;
                if (this.field1059 != null && var8.field1059 != null) {
                    this.field1059.method2293(var8.field1059, arg3, arg2, arg5, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
    public final void method346(int arg0) {
        this.field1066 = false;
        ++field1053;
        if (arg0 >= -13) {
            this.method357(false, (class322) null);
        }
        if (this.field1059 != null) {
            this.field1059.method2267(this.field1059.method2312() & -32769);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lvm;IB)Ljn;")
    private final class396 method504(class322 arg0, int arg1, byte arg2) {
        ++field1079;
        if (this.field1059 != null && arg0.method1620(this.field1059.method2312(), arg1) == 0) {
            return this.field1059;
        } else {
            if (arg2 <= 105) {
                this.method356(74);
            }
            class56 var4 = this.method507(false, arg0, arg1, (byte) 50);
            return var4 == null ? null : var4.field567;
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)I")
    public final int method351(byte arg0) {
        ++field1071;
        if (arg0 != 103) {
            this.method350((byte) -44);
        }
        return this.field1067;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLvm;)V")
    public final void method357(boolean arg0, class322 arg1) {
        ++field1069;
        Object var3 = null;
        if (arg0) {
            this.method504((class322) null, -38, (byte) -113);
        }
        class307 var5;
        if (this.field1064 == null && this.field1063) {
            class56 var4 = this.method507(true, arg1, 131072, (byte) 50);
            var5 = var4 != null ? var4.field569 : null;
        } else {
            var5 = this.field1064;
            this.field1064 = null;
        }
        if (var5 != null) {
            class434.method2681(var5, this.field1075, super.field2775, super.field2776, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)Z")
    public final boolean method345(byte arg0) {
        if (arg0 != -72) {
            this.method345((byte) 46);
        }
        ++field1049;
        return this.field1066;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLtq;)V")
    public static final void method505(byte arg0, class250 arg1) {
        ++field1060;
        if (~(arg1.field3406.length - arg1.field3389) <= -2) {
            int var2 = arg1.method1350(31351);
            if (~var2 <= -1 && var2 <= 1) {
                if (arg1.field3406.length + -arg1.field3389 >= 2) {
                    int var3 = arg1.method1374(-2);
                    int var4 = 13 / ((-6 - arg0) / 54);
                    if (var3 * 6 == arg1.field3406.length - arg1.field3389) {
                        while (true) {
                            int var5;
                            int var6;
                            do {
                                do {
                                    do {
                                        if (arg1.field3406.length <= arg1.field3389) {
                                            return;
                                        }
                                        var5 = arg1.method1374(-2);
                                        var6 = arg1.method1359(255);
                                    } while (class142.field1810.length <= var5);
                                } while (!class279.field3799[var5]);
                            } while (class418.method2599(var5, (byte) -24).field2771 == '1' && (~var6 > 0 || ~var6 < -2));
                            class142.field1810[var5] = var6;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIILvm;)Z")
    public final boolean method344(int arg0, int arg1, int arg2, class322 arg3) {
        ++field1052;
        class396 var5 = this.method504(arg3, 65536, (byte) 114);
        if (arg0 != -23563) {
            this.field1056 = 29;
        }
        if (var5 != null) {
            class247 var6 = arg3.method1650();
            var6.method747(super.field2775, super.field2780, super.field2776);
            return var5.method2300(arg1, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    public final void method350(byte arg0) {
        if (arg0 < 114) {
            this.method507(false, (class322) null, 94, (byte) -37);
        }
        if (this.field1059 != null) {
            this.field1059.method2308();
        }
        ++field1074;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lvm;II)Ljn;")
    public final class396 method349(class322 arg0, int arg1, int arg2) {
        if (arg1 != -24206) {
            return null;
        } else {
            ++field1065;
            return this.method504(arg0, arg2, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public static void method506(boolean arg0) {
        field1062 = null;
        if (!arg0) {
            field1062 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLvm;IB)Lf;")
    private final class56 method507(boolean arg0, class322 arg1, int arg2, byte arg3) {
        ++field1055;
        class225 var5 = class281.method1655((byte) -28, 65535 & this.field1056);
        if (arg3 != 50) {
            this.method352((class322) null, 117);
        }
        class54 var6;
        class54 var7;
        if (this.field1078) {
            var6 = class272.field3682[0];
            var7 = class275.field3707[this.field1075];
        } else {
            var7 = class272.field3682[this.field1075];
            if (this.field1075 < 3) {
                var6 = class272.field3682[this.field1075 + 1];
            } else {
                var6 = null;
            }
        }
        return var5.method1214(arg0, var7, super.field2780, var6, arg2, super.field2775, true, 22, arg1, this.field1067, super.field2776);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Z")
    public final boolean method358(byte arg0) {
        if (arg0 != 24) {
            return false;
        } else {
            ++field1061;
            return this.field1063;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)I")
    public final int method339(int arg0) {
        int var2 = -120 / ((19 - arg0) / 32);
        ++field1050;
        return 22;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLvm;)V")
    public final void method347(byte arg0, class322 arg1) {
        ++field1070;
        Object var3 = null;
        class307 var5;
        if (this.field1064 == null && this.field1063) {
            class56 var4 = this.method507(true, arg1, 131072, (byte) 50);
            var5 = var4 == null ? null : var4.field569;
        } else {
            var5 = this.field1064;
            this.field1064 = null;
        }
        if (arg0 == -108) {
            if (var5 != null) {
                class307.method1803(var5, this.field1075, super.field2775, super.field2776, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lvm;Lds;IIIIZIZ)V")
    public class92(class322 arg0, class225 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field3067, arg1.field3043);
        this.field1078 = arg6;
        this.field1066 = arg8;
        super.field2776 = (short) arg5;
        this.field1067 = (byte) arg7;
        this.field1056 = (short) arg1.field3051;
        super.field2775 = (short) arg3;
        this.field1080 = ~arg1.field3027 != -1;
        this.field1075 = (byte) arg2;
        this.field1063 = arg0.method1585() && arg1.field3056 && !this.field1078 && class169.field2133 != 0;
        int var10 = 1024;
        if (this.field1066) {
            var10 |= 32768;
        }
        class56 var11 = this.method507(this.field1063, arg0, var10, (byte) 50);
        if (var11 != null) {
            this.field1059 = var11.field567;
            this.field1064 = var11.field569;
            if (this.field1066) {
                this.field1059 = this.field1059.method2297((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method508(String arg0, int arg1) throws ClassNotFoundException {
        ++field1068;
        if (arg1 <= 16) {
            field1054 = -48;
        }
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else {
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lvm;Z)Ldn;")
    public final class321 method355(class322 arg0, boolean arg1) {
        ++field1077;
        if (this.field1059 == null) {
            return null;
        } else {
            class247 var3 = arg0.method1650();
            var3.method747(super.field2775, super.field2780, super.field2776);
            class321 var4 = null;
            if (this.field1080) {
                var4 = class204.method1110(258, 1);
            }
            if (arg1) {
                return null;
            } else {
                this.field1059.method2284(var3, var4 == null ? null : var4.field4293[0], 0);
                return var4;
            }
        }
    }
}
