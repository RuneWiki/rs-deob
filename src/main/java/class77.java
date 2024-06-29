import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class77 implements class169 {

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "Ljava/lang/String;")
    private String field1112;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    public static int field1105 = 0;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "Z")
    private boolean field1114;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)I", line = 13)
    public static final int method667(int arg0, int arg1, int arg2) {
        field1113++;
        int var3 = class187.method1301(0, 4, arg0 + 45365, arg1 + 91923) + (class187.method1301(0, 2, arg0 + 10294, arg1 - -37821) - 128 >> 1) + (class187.method1301(0, 1, arg0, arg1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        if (arg2 <= 57) {
            field1105 = 56;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)V", line = 34)
    public static final void method668(byte arg0) {
        if (arg0 == -100) {
            class610.method3376(arg0 + 101);
            field1111++;
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)Z", line = 45)
    public final boolean method669(int arg0) {
        if (arg0 > -24) {
            field1105 = -13;
        }
        field1106++;
        return this.field1114;
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(III)Z", line = 56)
    public static final boolean method670(int arg0, int arg1, int arg2) {
        if (arg1 < 93) {
            field1105 = -82;
        }
        field1107++;
        return (arg2 & 0x70000) != 0 | class328.method2070(arg2, 90, arg0) || class5.method35(arg2, (byte) -60, arg0);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)I", line = 69)
    public final int method269(byte arg0) {
        field1109++;
        int var2 = 18 / ((6 - arg0) / 59);
        int var3 = class782.method4332(false, this.field1112);
        if (var3 >= 0 && var3 <= 100) {
            return var3;
        } else {
            this.field1114 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(III)Z", line = 85)
    public static final boolean method671(int arg0, int arg1, int arg2) {
        field1104++;
        if (!class526.field7216) {
            return false;
        }
        int var3 = arg2 >> 16;
        if (arg1 != 28649) {
            method668((byte) -125);
        }
        int var4 = arg2 & 0xFFFF;
        if (class111.field1528[var3] == null || class111.field1528[var3][var4] == null) {
            return false;
        }
        class668 var5 = class111.field1528[var3][var4];
        if (arg0 == -1 && var5.field9353 == 0) {
            for (class275 var6 = (class275) class280.field4138.method2551((byte) -108); var6 != null; var6 = (class275) class280.field4138.method2542(-94)) {
                if (var6.field4080 == 8 || var6.field4080 == 1001 || var6.field4080 == 18 || var6.field4080 == 30 || var6.field4080 == 19) {
                    for (class668 var7 = class536.method3067(var6.field4077, arg1 - 28649); var7 != null; var7 = class749.method4140(arg1 ^ 0x6FE8, var7)) {
                        if (var5.field9221 == var7.field9221) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class275 var8 = (class275) class280.field4138.method2551((byte) -108); var8 != null; var8 = (class275) class280.field4138.method2542(-124)) {
                if (var8.field4076 == arg0 && var5.field9221 == var8.field4077 && (var8.field4080 == 8 || var8.field4080 == 1001 || var8.field4080 == 18 || var8.field4080 == 30 || var8.field4080 == 19)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIBIIIIZ)Z", line = 154)
    public static final boolean method672(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field1110++;
        if (arg3 != -26) {
            field1105 = -115;
        }
        int var9 = class551.field7456.field1890[0];
        int var10 = class551.field7456.field1884[0];
        if (var9 < 0 || var9 >= class597.field8132 || var10 < 0 || class628.field8800 <= var10) {
            return false;
        } else if (arg5 >= 0 && arg5 < class597.field8132 && arg4 >= 0 && arg4 < class628.field8800) {
            int var11 = class62.method440(arg4, class551.field7456.method655(-125), class30.field453, arg0, arg8, var9, class261.field3872, var10, arg1, 91, class514.field7038[class551.field7456.field2250], arg6, arg5, arg2, arg7);
            if (var11 < 1) {
                return false;
            }
            class779.field10689 = class261.field3872[var11 - 1];
            class692.field9714 = class30.field453[var11 - 1];
            class768.field10595 = false;
            class212.method1405(-59);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 186)
    public class77(String arg0) {
        this.field1112 = arg0;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)Ljq;", line = 194)
    public final class539 method268(int arg0) {
        if (arg0 != -12696) {
            method672(-27, -34, 19, (byte) -16, 122, 2, 73, 72, true);
        }
        field1115++;
        return class539.field7333;
    }
}
