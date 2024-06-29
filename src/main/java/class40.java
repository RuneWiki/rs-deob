import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class40 {

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "[I")
    public static int[] field506 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public static volatile int field505 = 0;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILe;I[[IZ)V", line = 7)
    public static final void method267(int arg0, class312 arg1, int arg2, int[][] arg3, boolean arg4) {
        field502++;
        if (arg0 != 8261) {
            return;
        }
        for (int var5 = 0; var5 < arg2; var5++) {
            int[][] var6;
            if (arg3 == null) {
                var6 = null;
            } else {
                var6 = new int[class80.field1003 + 1][class380.field5751 + 1];
                for (int var7 = 0; var7 <= class380.field5751; var7++) {
                    for (int var8 = 0; var8 <= class80.field1003; var8++) {
                        var6[var8][var7] = class281.field4509[var5][var8][var7] - arg3[var8][var7];
                    }
                }
            }
            int var9 = 0;
            int var10 = 0;
            if (!arg4) {
                if (class377.field5695) {
                    var9 |= 0x2;
                }
                if (class220.field3627) {
                    var10 |= 0x8;
                }
                if (class299.field4755 != 0) {
                    if (var5 == 0 || class27.field314 >= 96) {
                        var10 |= 0x10;
                    }
                    var9 |= 0x1;
                }
            }
            if (class377.field5695) {
                var10 |= 0x7;
            }
            class129 var11 = arg1.method623(class80.field1003, class380.field5751, class281.field4509[var5], var6, 128, var9, var10);
            class313.method2099(var5, var11);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BLmo;)V", line = 84)
    public static final void method268(byte arg0, class447 arg1) {
        if (arg0 != 103) {
            method267(-51, (class312) null, -113, (int[][]) null, false);
        }
        class230.field3837 = arg1;
        field501++;
        class413.field6112 = class230.field3837.method2758(4, 14535);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V", line = 99)
    public static void method269(int arg0) {
        field506 = null;
        if (arg0 < 71) {
            field506 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)Z", line = 113)
    public static final boolean method270(int arg0, int arg1, int arg2) {
        field504++;
        if (!class262.field4214) {
            return false;
        }
        if (arg0 != -30) {
            field503 = -25;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class203.field3266[var3] == null || class203.field3266[var3][var4] == null) {
            return false;
        }
        class172 var5 = class203.field3266[var3][var4];
        if (arg1 == -1 && var5.field2707 == 0) {
            for (class418 var6 = (class418) class86.field1089.method253((byte) -6); var6 != null; var6 = (class418) class86.field1089.method247((byte) 49)) {
                if (var6.field6192 == 29 || var6.field6192 == 1004 || var6.field6192 == 46 || var6.field6192 == 37 || var6.field6192 == 25) {
                    for (class172 var7 = class196.method1375(var6.field6186, (byte) -56); var7 != null; var7 = class213.method1497(var7, 18758)) {
                        if (var5.field2865 == var7.field2865) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class418 var8 = (class418) class86.field1089.method253((byte) -6); var8 != null; var8 = (class418) class86.field1089.method247((byte) -117)) {
                if (var8.field6187 == arg1 && var5.field2865 == var8.field6186 && (var8.field6192 == 29 || var8.field6192 == 1004 || var8.field6192 == 46 || var8.field6192 == 37 || var8.field6192 == 25)) {
                    return true;
                }
            }
        }
        return false;
    }
}
