import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class403 extends class231 {

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
    public int field6053;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "Lps;")
    public static class5 field6050 = null;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!lo", name = "w", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "[[Lcaa;")
    public static class538[][] field6051;

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(ILtca;Lvea;III)V")
    public class403(int arg0, class545 arg1, class305 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6053 = arg5;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BI)V")
    public static final void method2486(byte arg0, int arg1) {
        field6054++;
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        class311.field4571 = arg1;
        if (arg0 < 70) {
            method2487(113, 78, -1);
        }
        class46.field714 = new class16[class322.field4686[class311.field4571] + 1];
        class218.field2904 = 0;
        class89.field1357 = 0;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)Lmh;")
    public final class139 method599(int arg0) {
        field6052++;
        int var2 = 12 / ((arg0 + 89) / 34);
        return class498.field7042;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)Z")
    public static final boolean method2487(int arg0, int arg1, int arg2) {
        field6047++;
        if (arg0 != 0) {
            field6049 = -12;
        }
        return class623.method3589(arg2, arg1, (byte) 80) & (class48.method290(arg1, arg0 ^ 0x2D5F, arg2) | (arg2 & 0x2000) != 0 | class215.method1358(arg2, (byte) -60, arg1));
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILeda;Leda;ZIIZ)I")
    public static final int method2488(int arg0, class116 arg1, class116 arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field6048++;
        if (arg0 >= -79) {
            field6050 = null;
        }
        int var7 = class369.method2279(arg6, arg1, arg2, (byte) 100, arg4);
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class369.method2279(arg3, arg1, arg2, (byte) 100, arg5);
            return arg3 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(BI)I")
    public static final int method2489(byte arg0, int arg1) {
        field6046++;
        if (arg0 != -25) {
            field6051 = null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
    public static void method2490(byte arg0) {
        field6050 = null;
        field6051 = null;
        if (arg0 > -31) {
            field6051 = null;
        }
    }
}
