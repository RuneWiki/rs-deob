import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class403 {

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "[I")
    public static int[] field5757 = new int[2];

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V", line = 3)
    public static final void method2445(int arg0, int arg1) {
        class68.field1054 = -1;
        class672.field9575 = 3;
        class556.field8080 = 100;
        class727.field10217 = arg1;
        field5761++;
        int var2 = 105 / ((-arg0 - 36) / 53);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIIIIII)Z", line = 16)
    public static final boolean method2446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5758++;
        if (!class37.method190((byte) -101, arg9, arg7, arg6)) {
            return false;
        }
        int var10 = class633.field8935[0];
        int var11 = class633.field8935[2];
        int var12 = class633.field8935[1];
        if (!class37.method190((byte) 40, arg2, arg5, arg8)) {
            return false;
        }
        int var13 = class633.field8935[1];
        int var14 = class633.field8935[2];
        int var15 = class633.field8935[0];
        if (!class37.method190((byte) -114, arg0, arg3, arg1)) {
            return false;
        }
        int var16 = class633.field8935[0];
        int var17 = class633.field8935[2];
        if (arg4 < 2) {
            return true;
        } else {
            int var18 = class633.field8935[1];
            return class590.method3468(var18, var16, var15, var12, var13, var11, var14, var17, var10, true);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;BIZ)V", line = 55)
    public static final void method2447(boolean arg0, int arg1, String arg2, String arg3, byte arg4, int arg5, boolean arg6) {
        class634.field8938.field6037 = 1;
        field5760++;
        String var7 = arg3.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg5 != -1) {
            class167 var11 = class332.field4513.method1901(-4115, arg5);
            if (var11 == null || arg6 != var11.method1195(-116)) {
                return;
            }
            if (var11.method1195(-116)) {
                var10 = var11.field2373;
            } else {
                var9 = var11.field2364;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class425.field6147.field10379; var13++) {
            class424 var16 = class425.field6147.method4144(var13, 125);
            if ((!arg0 || var16.field6076) && var16.field6131 == -1 && var16.field6092 == -1 && var16.field6115 == 0 && var16.field6070.toLowerCase().indexOf(var7) != -1) {
                if (arg5 != -1) {
                    if (arg6) {
                        if (!arg2.equals(var16.method2640(var10, arg5, (byte) 30))) {
                            continue;
                        }
                    } else if (arg1 != var16.method2634(var9, arg5, false)) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class340.field4686 = null;
                    class756.field10521 = -1;
                    return;
                }
                if (var12 >= var8.length) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class756.field10521 = var12;
        class340.field4686 = var8;
        class642.field9140 = 0;
        String[] var14 = new String[class756.field10521];
        for (int var15 = 0; var15 < class756.field10521; var15++) {
            var14[var15] = class425.field6147.method4144(var8[var15], 124).field6070;
        }
        if (arg4 > -36) {
            field5757 = null;
        }
        class655.method3754((byte) 123, class340.field4686, var14);
        class634.field8938.method2589(0);
        class634.field8938.field6037 = 2;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V", line = 171)
    public static void method2448(byte arg0) {
        field5757 = null;
        if (arg0 != 16) {
            method2446(57, 71, -12, 2, 61, -69, 100, -65, 104, -24);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZII)V", line = 184)
    public static final void method2449(boolean arg0, int arg1, int arg2) {
        class235.method1641(class608.field8632.method3543(-24350, class45.field748), arg0, arg1, 126);
        if (arg2 > 0) {
            field5757 = null;
        }
        field5759++;
    }
}
