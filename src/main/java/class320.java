import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class320 extends class311 {

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "J")
    public static long field5009 = 0L;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "[I")
    public static int[] field5008;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 7)
    public static void method2169(int arg0) {
        if (arg0 == -1) {
            field5008 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILmd;III)Z", line = 25)
    public static final boolean method2170(int arg0, int arg1, int arg2, class17 arg3, int arg4, int arg5, int arg6) {
        class7 var7 = class23.method172(arg0 ^ 0x57, arg3.field192);
        field5012++;
        if (var7.field75 == -1) {
            return true;
        }
        int var9;
        if (arg3.field238) {
            int var8 = arg3.field210 + arg2;
            var9 = var8 & 0x3;
        } else {
            var9 = 0;
        }
        class20 var10 = var7.method44((byte) 96, arg3.field172, var9);
        if (var10 == null) {
            return false;
        } else if (arg0 == 0) {
            int var11 = var10.field1171;
            int var12 = arg3.field212;
            int var13 = var10.field1175;
            int var14 = arg3.field187;
            if ((var9 & 0x1) == 1) {
                var14 = arg3.field212;
                var12 = arg3.field187;
            }
            if (var7.field80) {
                var11 = var12 * 4;
                var13 = var14 * 4;
            }
            if (var7.field70 == 0) {
                var10.method153(arg1 * 4 + 48, (-arg4 + 104 + -var14) * 4 + 48, var11, var13);
            } else {
                var10.method152(arg1 * 4 + 48, (-arg4 + 104 + -var14) * 4 + 48, var11, var13, var7.field70);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(B)V", line = 92)
    public static final void method2171(byte arg0) {
        field5010++;
        if (class304.field4758 == 10 && class333.field5166) {
            class231.method1583(28, (byte) -46);
        }
        if (arg0 != 17) {
            method2172(-66, 113);
        }
        if (class304.field4758 == 30) {
            class231.method1583(25, (byte) -61);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Ljava/lang/String;", line = 109)
    public static final String method2172(int arg0, int arg1) {
        field5014++;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class158.field2465 + " (" + var2 + ")</col>";
        } else if (var2.length() <= 6) {
            if (arg0 < 37) {
                method2169(-71);
            }
            return " <col=ffff00>" + var2 + "</col>";
        } else {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class106.field1628 + " (" + var2 + ")</col>";
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILwf;I)Ln;", line = 141)
    public static final class178 method2173(int arg0, int arg1, class306 arg2, int arg3) {
        if (arg3 != 17136) {
            method2170(108, 26, -115, (class17) null, 103, 74, 74);
        }
        field5013++;
        return class156.method1093(true, arg1, arg0, arg2) ? class69.method494(-31610) : null;
    }
}
