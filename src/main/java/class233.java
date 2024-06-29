import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class233 {

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "Ljn;")
    private class86 field3306 = new class86();

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field3308 = 0;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "Lf;")
    public static class191 field3304;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "Ljn;")
    private class86 field3310;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIIIIIIIIII)V", line = 3)
    public static final void method1578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field3312++;
        if (class455.field6683 == null) {
            return;
        }
        class337 var15;
        if (arg0 >= 0) {
            int var14 = arg0 - 1;
            var15 = class151.field2174[var14];
        } else {
            int var16 = -arg0 - 1;
            if (class452.field6641 == var16) {
                var15 = class339.field5365;
            } else {
                var15 = class439.field6539[var16];
            }
        }
        if (var15 == null) {
            return;
        }
        class130 var17 = class56.field755.method2031(124, arg6);
        int var18;
        int var19;
        if (arg7 == 1 || arg7 == 3) {
            var19 = var17.field1843;
            var18 = var17.field1898;
        } else {
            var18 = var17.field1843;
            var19 = var17.field1898;
        }
        int var20 = (var18 >> 1) + arg3;
        int var21 = arg3 + (var18 + 1 >> 1);
        int var22 = (var19 >> 1) + arg13;
        int var23 = (var19 + 1 >> 1) + arg13;
        class206 var24 = class455.field6683[arg4];
        int var25 = var24.method849(var20, var22) + var24.method849(var21, var22) + var24.method849(var20, var23) + var24.method849(var21, var23) >> 2;
        class406 var26 = new class406();
        var26.field6144 = arg6;
        var26.field6137 = class405.field6116 + arg5;
        var26.field6143 = arg2;
        var26.field6128 = arg7;
        var26.field6136 = arg3;
        var26.field6140 = var15.field2210;
        var26.field6132 = arg13;
        var26.field6125 = class405.field6116 + arg9;
        if (arg10 < arg11) {
            int var27 = arg11;
            arg11 = arg10;
            arg10 = var27;
        }
        var26.field6141 = arg3 + arg10;
        var26.field6133 = arg3 + arg11;
        if (arg1 != -8835) {
            field3304 = null;
        }
        if (arg12 < arg8) {
            int var28 = arg8;
            arg8 = arg12;
            arg12 = var28;
        }
        var26.field6146 = var25;
        var26.field6142 = arg8 + arg13;
        var26.field6139 = (var26.field6136 << 7) + (var18 << 6);
        var26.field6138 = arg12 + arg13;
        var26.field6131 = (var26.field6132 << 7) + (var19 << 6);
        class286.field4266.method1958(var26, 0);
        var15.field5341 = var26;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 102)
    public static void method1579(int arg0) {
        if (arg0 == 0) {
            field3304 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V", line = 114)
    public final void method1580(int arg0) {
        field3305++;
        while (true) {
            class86 var2 = this.field3306.field1177;
            if (this.field3306 == var2) {
                if (arg0 == -5735) {
                    this.field3310 = null;
                    return;
                } else {
                    return;
                }
            }
            var2.method560((byte) -101);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)Ljn;", line = 139)
    public final class86 method1581(byte arg0) {
        field3303++;
        class86 var2 = this.field3306.field1177;
        if (this.field3306 == var2) {
            this.field3310 = null;
            return null;
        }
        this.field3310 = var2.field1177;
        if (arg0 != 53) {
            field3304 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljn;I)V", line = 165)
    public final void method1582(class86 arg0, int arg1) {
        field3313++;
        if (arg0.field1180 != null) {
            arg0.method560((byte) 82);
        }
        arg0.field1180 = this.field3306.field1180;
        arg0.field1177 = this.field3306;
        if (arg1 != -1) {
            this.method1583(81);
        }
        arg0.field1180.field1177 = arg0;
        arg0.field1177.field1180 = arg0;
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V", line = 192)
    public class233() {
        this.field3306.field1177 = this.field3306;
        this.field3306.field1180 = this.field3306;
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)Ljn;", line = 202)
    public final class86 method1583(int arg0) {
        field3307++;
        class86 var2 = this.field3306.field1177;
        if (this.field3306 == var2) {
            return null;
        }
        var2.method560((byte) -35);
        if (arg0 <= 80) {
            field3304 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)I", line = 223)
    public final int method1584(int arg0) {
        field3309++;
        int var2 = 0;
        class86 var3 = this.field3306.field1177;
        while (this.field3306 != var3) {
            var3 = var3.field1177;
            var2++;
        }
        if (arg0 != -9679) {
            this.field3310 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "(I)Ljn;", line = 249)
    public final class86 method1585(int arg0) {
        field3311++;
        class86 var2 = this.field3310;
        if (this.field3306 == var2) {
            this.field3310 = null;
            return null;
        }
        if (arg0 != -1) {
            this.method1584(23);
        }
        this.field3310 = var2.field1177;
        return var2;
    }
}
