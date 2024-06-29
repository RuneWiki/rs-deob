import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class35 {

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(III)Z")
    public static final boolean method317(int arg0, int arg1, int arg2) {
        field532++;
        if (!class322.field4113) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class323.field4125[var3] == null || class323.field4125[var3][var4] == null) {
            return false;
        }
        class460 var5 = class323.field4125[var3][var4];
        if (arg1 == -1 && var5.field6483 == 0) {
            for (class718 var6 = (class718) class565.field7906.method3111(55); var6 != null; var6 = (class718) class565.field7906.method3116(-64)) {
                if (var6.field10134 == 11 || var6.field10134 == 1011 || var6.field10134 == 30 || var6.field10134 == 21 || var6.field10134 == 59) {
                    for (class460 var7 = class102.method684(5025, var6.field10130); var7 != null; var7 = class389.method2323(var7, 65)) {
                        if (var5.field6524 == var7.field6524) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class718 var8 = (class718) class565.field7906.method3111(103); var8 != null; var8 = (class718) class565.field7906.method3116(-106)) {
                if (var8.field10136 == arg1 && var5.field6524 == var8.field10130 && (var8.field10134 == 11 || var8.field10134 == 1011 || var8.field10134 == 30 || var8.field10134 == 21 || var8.field10134 == 59)) {
                    return true;
                }
            }
        }
        int var9 = -36 % ((-arg0 - 58) / 37);
        return false;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method318(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field531++;
        if (arg0 != 0) {
            return;
        }
        if (arg1 < 512 || arg6 < 512 || class613.field8591 * 512 - 1024 < arg1 || arg6 > (class1.field3 * 512 - 1024)) {
            class681.field9310[0] = class681.field9310[1] = -1;
            return;
        }
        int var10 = class592.method3287(false, arg6, arg8, arg1) - arg9;
        if (class107.field1323) {
            class614.method3370(true, true);
        } else {
            class261.field3318.method1973(arg5, 0, 0);
            class458.field6407.method77(class261.field3318);
        }
        if (class306.field3936) {
            class458.field6407.method173(arg1, var10, arg6, class468.field6738, class681.field9310);
        } else {
            class458.field6407.method109(arg1, var10, arg6, class681.field9310);
        }
        if (class107.field1323) {
            class586.method3263((byte) -114);
        } else {
            class261.field3318.method1973(-arg5, 0, 0);
            class458.field6407.method77(class261.field3318);
        }
    }
}
