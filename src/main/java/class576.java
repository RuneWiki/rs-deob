import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class576 {

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Llc;")
    public static class435 field8275 = new class435(80, -1);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field8274;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field8276;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field8277;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field8278;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lha;Lhb;I)I", line = 5)
    public static final int method3413(class543 arg0, class584 arg1, int arg2) {
        int var3 = -90 / ((77 - arg2) / 41);
        field8276++;
        if (arg1.field8324 != -1) {
            return arg1.field8324;
        }
        if (arg1.field8323 != -1) {
            class679 var4 = arg0.field7881.method962(arg1.field8323, 2904);
            if (!var4.field9639) {
                return var4.field9631;
            }
        }
        return arg1.field8337;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 30)
    public static void method3414(int arg0) {
        if (arg0 == 80) {
            field8275 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V", line = 41)
    public static final void method3415(byte arg0) {
        class593.method3479(false, (long) class703.field9918, class211.field3164);
        field8277++;
        if (class346.field4771 != -1) {
            class339.method2088(class346.field4771, arg0 + 3651);
        }
        for (int var1 = 0; var1 < class727.field10212; var1++) {
            if (class108.field1545[var1]) {
                class567.field8200[var1] = true;
            }
            class486.field7003[var1] = class108.field1545[var1];
            class108.field1545[var1] = false;
        }
        class207.field3140 = class703.field9918;
        if (class346.field4771 != -1) {
            class727.field10212 = 0;
            class495.method3009(-1);
        }
        class211.field3164.method328();
        class493.method3002(3, class211.field3164);
        int var2 = class683.method3877(126);
        if (var2 == -1) {
            var2 = class548.field7953;
        }
        if (var2 == -1) {
            var2 = class718.field10132;
        }
        if (arg0 != 54) {
            method3415((byte) -100);
        }
        class174.method1258((byte) 127, var2);
        class731.field10244 = 0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIII)V", line = 95)
    public static final void method3416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8274++;
        if (arg4 != 0) {
            return;
        }
        int var8 = class183.method1292(class377.field5458, -1, class362.field5291, arg0);
        int var9 = class183.method1292(class377.field5458, -1, class362.field5291, arg5);
        int var10 = class183.method1292(class200.field2976, -1, class204.field3061, arg6);
        int var11 = class183.method1292(class200.field2976, -1, class204.field3061, arg7);
        int var12 = class183.method1292(class377.field5458, ~arg4, class362.field5291, arg0 + arg1);
        int var13 = class183.method1292(class377.field5458, -1, class362.field5291, arg5 - arg1);
        for (int var14 = var8; var14 < var12; var14++) {
            class518.method3153(var11, var10, class193.field2839[var14], arg4 ^ 0xFFFFFFF9, arg2);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class518.method3153(var11, var10, class193.field2839[var15], -7, arg2);
        }
        int var16 = class183.method1292(class200.field2976, -1, class204.field3061, arg1 + arg6);
        int var17 = class183.method1292(class200.field2976, -1, class204.field3061, arg7 - arg1);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class193.field2839[var18];
            class518.method3153(var16, var10, var19, -7, arg2);
            class518.method3153(var17, var16, var19, -7, arg3);
            class518.method3153(var11, var17, var19, -7, arg2);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", line = 149)
    public static final String method3417(String arg0, String arg1, String arg2, int arg3) {
        field8278++;
        for (int var4 = arg1.indexOf(arg0); var4 != -1; var4 = arg1.indexOf(arg0, var4 + arg2.length())) {
            arg1 = arg1.substring(0, var4) + arg2 + arg1.substring(arg0.length() + var4);
        }
        int var5 = -83 % ((arg3 - 6) / 54);
        return arg1;
    }
}
