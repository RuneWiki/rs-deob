import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public class class284 implements class409 {

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "Lfq;")
    private class211 field4358;

    @OriginalMember(owner = "client!tja", name = "f", descriptor = "Lju;")
    private class135 field4363;

    @OriginalMember(owner = "client!tja", name = "h", descriptor = "I")
    public static int field4365 = 0;

    @OriginalMember(owner = "client!tja", name = "e", descriptor = "Ljo;")
    public static class351 field4362 = new class351(12, 3);

    @OriginalMember(owner = "client!tja", name = "b", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!tja", name = "c", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!tja", name = "d", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!tja", name = "g", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!tja", name = "i", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(Z)V", line = 5)
    public final void method811(boolean arg0) {
        field4360++;
        if (arg0) {
            method1916(null, 119, -96, -124, -71, (byte) -127, -17);
        }
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(ZB)V", line = 17)
    public final void method374(boolean arg0, byte arg1) {
        field4364++;
        if (arg1 != -105) {
            return;
        }
        class380 var3 = this.field4363.method954(0, this.field4358.field3060);
        if (var3 == null) {
            return;
        }
        int var4 = this.field4358.field3053.method2164(class785.field10790, 0, this.field4358.field3059) + this.field4358.field3058;
        int var5 = this.field4358.field3050.method1378((byte) 51, class264.field3734, this.field4358.field3057) + this.field4358.field3055;
        if (this.field4358.field3056) {
            class638.field8979.method457(var4, var5, this.field4358.field3059, this.field4358.field3057, this.field4358.field3051, 0);
        }
        int var6 = var5 + this.method1914(5, var3.field5452, false, class546.field7704, var5, var4) * 12;
        int var9 = var6 + 8;
        if (this.field4358.field3056) {
            class638.field8979.method438(var4, var9, var4 + this.field4358.field3059 - 1, var9, this.field4358.field3051, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method1914(5, var3.field5455, false, class546.field7704, var6, var4) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method1914(5, var3.field5457, false, class546.field7704, var10, var4) * 12;
    }

    @OriginalMember(owner = "client!tja", name = "<init>", descriptor = "(Lju;Lfq;)V", line = 54)
    public class284(class135 arg0, class211 arg1) {
        this.field4358 = arg1;
        this.field4363 = arg0;
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(ILjava/lang/String;ZLda;II)I", line = 63)
    private final int method1914(int arg0, String arg1, boolean arg2, class67 arg3, int arg4, int arg5) {
        if (arg2) {
            this.method374(false, (byte) -126);
        }
        field4366++;
        return arg3.method516(arg4 + arg0, -(arg0 * 2) + this.field4358.field3057, arg1, 0, 0, 0, this.field4358.field3059 - (arg0 * 2), 0, this.field4358.field3049, arg0 + arg5, (byte) 89, 0, null, null, null, this.field4358.field3054);
    }

    @OriginalMember(owner = "client!tja", name = "b", descriptor = "(B)V", line = 74)
    public static void method1915(byte arg0) {
        if (arg0 != -68) {
            field4362 = null;
        }
        field4362 = null;
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(B)Z", line = 84)
    public final boolean method814(byte arg0) {
        field4359++;
        int var2 = 93 % ((-arg0 - 65) / 37);
        return this.field4363.method953(true);
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "([BIIIIBI)Z", line = 95)
    public static final boolean method1916(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field4361++;
        int var7 = arg6 % arg3;
        int var8 = 121 / ((arg5 - 2) / 62);
        int var9;
        if (var7 == 0) {
            var9 = 0;
        } else {
            var9 = arg3 - var7;
        }
        int var10 = -((arg4 + arg3 - 1) / arg3);
        int var11 = -((arg6 - (1 - arg3)) / arg3);
        for (int var12 = var10; var12 < 0; var12++) {
            for (int var13 = var11; var13 < 0; var13++) {
                if (arg0[arg2] == 0) {
                    return true;
                }
                arg2 += arg3;
            }
            int var14 = arg2 - var9;
            if (arg0[var14 - 1] == 0) {
                return true;
            }
            arg2 = arg1 + var14;
        }
        return false;
    }
}
