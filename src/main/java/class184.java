import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class184 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIII)I", line = 6)
    public static final int method1282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2757++;
        if (class529.field7807 == null) {
            return 0;
        }
        if (arg4 != 1292655687) {
            method1283(true);
        }
        if (arg5 < 3) {
            int var6 = arg3 >> 7;
            int var7 = arg1 >> 7;
            if (arg2 < 0 || arg0 < 0 || arg2 > class237.field3436 - 1 || class83.field1366 - 1 < arg0) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > class237.field3436 - 1 || (class83.field1366 - 1) < var7) {
                return 0;
            }
            boolean var8 = (class364.field5475[1][arg3 >> 7][arg1 >> 7] & 0x2) != 0;
            if ((arg3 & 0x7F) == 0) {
                boolean var9 = (class364.field5475[1][var6 - 1][arg1 >> 7] & 0x2) != 0;
                boolean var10 = (class364.field5475[1][var6][arg1 >> 7] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class364.field5475[1][arg2][arg0] & 0x2) != 0;
                }
            }
            if ((arg1 & 0x7F) == 0) {
                boolean var11 = (class364.field5475[1][arg3 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class364.field5475[1][arg3 >> 7][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class364.field5475[1][arg2][arg0] & 0x2) != 0;
                }
            }
            if (var8) {
                arg5++;
            }
        }
        return class529.field7807[arg5].method273(arg3, arg1);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V", line = 68)
    public static final void method1283(boolean arg0) {
        field2756++;
        class386.field5728 = class339.method2217(2048, true, 35, 4, 8, arg0, 0.4F, 8);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ltn;IBI)V", line = 76)
    public static final void method1284(class58 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 0) {
            return;
        }
        field2755++;
        if (class301.field4287) {
            class93 var9 = class458.field6759 == -1 ? null : class219.field3164.method2570((byte) -32, class458.field6759);
            if (!client.method1349(arg0).method780(-1) || (class288.field4144 & 0x20) == 0) {
                return;
            }
            if (var9 == null || arg0.method417(class458.field6759, var9.field1529, 127) != var9.field1529) {
                class192.method1313(arg0.field946, class189.field2797, class318.field4553 + " -> " + arg0.field992, class200.field2920, arg0.field840, false, 0L, (byte) 35, 30, true, arg0.field955);
                class508.field7426++;
            }
            return;
        }
        for (int var4 = 9; var4 >= 5; var4--) {
            String var8 = class274.method1746(-94, arg0, var4);
            if (var8 != null) {
                class192.method1313(arg0.field946, class61.method543(arg0, (byte) -2, var4), arg0.field992, var8, arg0.field840, false, (long) (var4 + 1), (byte) 35, 1002, true, arg0.field955);
                class342.field5214++;
            }
        }
        String var5 = class114.method844((byte) 9, arg0);
        if (var5 != null) {
            class192.method1313(arg0.field946, arg0.field935, arg0.field992, var5, arg0.field840, false, 0L, (byte) 35, 46, true, arg0.field955);
            class407.field5979++;
        }
        for (int var6 = 4; var6 >= 0; var6--) {
            String var7 = class274.method1746(-90, arg0, var6);
            if (var7 != null) {
                class192.method1313(arg0.field946, class61.method543(arg0, (byte) -2, var6), arg0.field992, var7, arg0.field840, false, (long) (var6 + 1), (byte) 35, 15, true, arg0.field955);
                class342.field5214++;
            }
        }
        if (!client.method1349(arg0).method784((byte) -91)) {
            return;
        }
        class511.field7542++;
        if (arg0.field832 == null) {
            class192.method1313(arg0.field946, -1, "", class92.field1512.method1273(true, class370.field5530), arg0.field840, false, 0L, (byte) 35, 47, true, arg0.field955);
            return;
        }
        class192.method1313(arg0.field946, -1, "", arg0.field832, arg0.field840, false, 0L, (byte) 35, 47, true, arg0.field955);
        return;
    }
}
