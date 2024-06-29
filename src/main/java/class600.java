import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class600 {

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "Ltja;")
    public static class288 field8162 = new class288(5, 5);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field8158;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field8160;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field8161;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3333(int arg0, int arg1, byte arg2) {
        field8161++;
        if (arg2 <= 86) {
            return true;
        } else {
            return class162.method1181(arg1, arg0, true) || class291.method1844(arg1, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIJI)V")
    public static final void method3334(int arg0, int arg1, long arg2, int arg3) {
        field8157++;
        if (arg0 <= 70) {
            return;
        }
        int var5 = (int) arg2 >> 14 & 0x1F;
        int var6 = (int) arg2 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class77.method672(0, 0, var5, (byte) -26, arg3, arg1, 0, var6, true);
            return;
        }
        class589 var8 = class350.field5132.method3732((byte) 103, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field7943;
            var9 = var8.field7940;
        } else {
            var9 = var8.field7943;
            var10 = var8.field7940;
        }
        int var11 = var8.field7876;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class77.method672(var11, var9, 0, (byte) -26, arg3, arg1, var10, 0, true);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)V")
    public static void method3335(boolean arg0) {
        if (arg0) {
            field8162 = null;
        }
        field8162 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public static final void method3336(int arg0) {
        field8160++;
        class39.field623 = -1;
        class397.field5830 = 1;
        String var1 = null;
        if (class570.field7586 != null) {
            class376 var2 = new class376(class570.field7586);
            var1 = class667.method3693(-14014, var2.method2366(true));
            class170.field2269 = var2.method2366(true);
        }
        if (var1 == null) {
            class624.method3415(35, arg0 + 19645);
        } else if (arg0 == -19643) {
            class187.method1298("", false, 0, var1, true);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method3337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8158++;
        int var7 = arg3 + arg6;
        if (arg4 != -7515) {
            field8162 = null;
        }
        int var8 = arg0 + arg1;
        int var9 = arg2 + arg5;
        if (!class462.method2736(var8, arg6, var8, var7, arg6, arg5, 1, var8, var9, var9)) {
            return false;
        } else if (class462.method2736(var8, var7, var8, var7, arg6, arg5, 1, var8, arg5, var9)) {
            if (class787.field10837 <= arg6) {
                if (!class462.method2736(arg0, var7, var8, var7, var7, var9, 1, var8, arg5, var9)) {
                    return false;
                }
                if (!class462.method2736(arg0, var7, var8, var7, var7, var9, 1, arg0, arg5, arg5)) {
                    return false;
                }
            } else if (!class462.method2736(arg0, arg6, var8, arg6, arg6, var9, arg4 + 7516, var8, arg5, var9)) {
                return false;
            } else if (!class462.method2736(arg0, arg6, var8, arg6, arg6, var9, 1, arg0, arg5, arg5)) {
                return false;
            }
            if (class328.field4759 <= arg5) {
                if (!class462.method2736(arg0, arg6, var8, var7, arg6, var9, arg4 + 7516, var8, var9, var9)) {
                    return false;
                }
                if (!class462.method2736(arg0, var7, var8, var7, arg6, var9, 1, arg0, var9, var9)) {
                    return false;
                }
            } else if (!class462.method2736(arg0, arg6, var8, var7, arg6, arg5, arg4 ^ 0xFFFFE2A4, var8, arg5, arg5)) {
                return false;
            } else if (!class462.method2736(arg0, var7, var8, var7, arg6, arg5, 1, arg0, arg5, arg5)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}
