import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class435 extends class431 implements class185 {

    @OriginalMember(owner = "client!or", name = "B", descriptor = "Lck;")
    public class436 field6376;

    @OriginalMember(owner = "client!or", name = "P", descriptor = "Z")
    private boolean field6389;

    @OriginalMember(owner = "client!or", name = "x", descriptor = "Lsk;")
    public static class423 field6373 = new class423("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!or", name = "w", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!or", name = "y", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!or", name = "z", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!or", name = "C", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!or", name = "D", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!or", name = "E", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!or", name = "F", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!or", name = "G", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!or", name = "H", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!or", name = "I", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!or", name = "J", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!or", name = "K", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!or", name = "L", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!or", name = "M", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!or", name = "N", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)I", line = 4)
    public final int method174(byte arg0) {
        if (arg0 < 113) {
            field6374 = 111;
        }
        ++field6372;
        return this.field6376.field6400;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V", line = 17)
    public final void method163(int arg0) {
        if (arg0 != 8793) {
            this.method173(76);
        }
        ++field6388;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Z", line = 28)
    public final boolean method161(int arg0) {
        ++field6385;
        if (arg0 != 15275) {
            field6382 = 125;
        }
        return this.field6376.method2542(-1);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 39)
    public static final String method2540(String arg0, int arg1) {
        ++field6384;
        int var2 = arg0.length();
        int var3 = arg1;
        for (int var4 = 0; var2 > var4; ++var4) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; ++var6) {
            char var7 = arg0.charAt(var6);
            if (var7 != '<') {
                if (~var7 == -63) {
                    var5.append("<gt>");
                } else {
                    var5.append(var7);
                }
            } else {
                var5.append("<lt>");
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZLqq;)V", line = 85)
    public final void method176(boolean arg0, class318 arg1) {
        if (arg0) {
            this.field6376.method2549(10, arg1);
            ++field6377;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lqq;I)V", line = 106)
    public final void method171(class318 arg0, int arg1) {
        this.field6376.method2547(-12, arg0);
        if (arg1 != 1577) {
            field6373 = null;
        }
        ++field6378;
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)I", line = 118)
    public final int method173(int arg0) {
        if (arg0 != 1438) {
            this.method169((byte) -113, (class318) null);
        }
        ++field6381;
        return this.field6376.field6391;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(Z)V", line = 130)
    public static void method2541(boolean arg0) {
        field6373 = null;
        if (!arg0) {
            method2540((String) null, 37);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)I", line = 146)
    public final int method170(boolean arg0) {
        ++field6387;
        if (!arg0) {
            this.method173(-37);
        }
        return this.field6376.field6421;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lqq;Lin;IIIIIZIIIIII)V", line = 158)
    public class435(class318 arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class378.method2273(arg11, 4, arg12));
        this.field6376 = new class436(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field6389 = arg1.field895 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(B)I", line = 168)
    public final int method1099(byte arg0) {
        int var2 = -28 % ((16 - arg0) / 41);
        ++field6383;
        return this.field6376.method2543(4);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lqq;BII)Z", line = 178)
    public final boolean method162(class318 arg0, byte arg1, int arg2, int arg3) {
        ++field6386;
        class198 var5 = this.field6376.method2550(false, super.field6339, super.field6346, arg0, arg1 + -72, false, 131072);
        if (var5 == null) {
            return false;
        } else {
            class496 var6 = arg0.method1976();
            if (arg1 != -44) {
                return true;
            } else {
                var6.method198(super.field6346 + super.field6344, super.field6336, super.field6339 - -super.field6342);
                return var5.method495(arg2, arg3, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lqq;ZI)Lcd;", line = 197)
    public final class198 method167(class318 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field6374 = 10;
        }
        ++field6379;
        return this.field6376.method2550(false, 0, 0, arg0, -72, false, arg2);
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(ZLqq;)V", line = 208)
    public final void method172(boolean arg0, class318 arg1) {
        ++field6380;
        class198 var3 = this.field6376.method2550(true, super.field6339, super.field6346, arg1, -32, arg0, 262144);
        if (var3 != null) {
            int var4 = super.field6346 >> 7;
            int var5 = super.field6339 >> 7;
            this.field6376.method2548(var5, var4, -400, var4, var3, false, arg1, var5);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BLqq;)Lkm;", line = 227)
    public final class227 method169(byte arg0, class318 arg1) {
        ++field6375;
        class198 var3 = this.field6376.method2550(true, super.field6339, super.field6346, arg1, -31, false, 2048);
        if (arg0 >= -11) {
            this.method162((class318) null, (byte) -83, 116, -60);
        }
        if (var3 == null) {
            return null;
        } else {
            class496 var4 = arg1.method1976();
            var4.method198(super.field6346 - -super.field6344, super.field6336, super.field6342 + super.field6339);
            class227 var5 = null;
            if (this.field6389) {
                var5 = class145.method951(1, 0);
            }
            if (this.field6376.field6402 == null) {
                var3.method461(var4, var5 == null ? null : var5.field3476[0], 0);
            } else {
                class372 var6 = this.field6376.field6402.method2882();
                arg1.method1983(var3, var6, var4, var5 == null ? null : var5.field3476[0], 0);
            }
            int var7 = super.field6346 >> 7;
            int var8 = super.field6339 >> 7;
            this.field6376.method2548(var8, var7, -400, var7, var3, true, arg1, var8);
            return var5;
        }
    }
}
