import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class106 {

    @OriginalMember(owner = "client!cea", name = "h", descriptor = "[I")
    public static int[] field1420 = new int[6];

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!cea", name = "g", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
    public static final void method597(String arg0, int arg1, Throwable arg2) {
        field1415++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class281.method1592(arg2, (byte) -103);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class516.method2794(var3, true);
            String var4 = class597.method3284(0, var3, ":", "%3a");
            String var5 = class597.method3284(0, var4, "@", "%40");
            String var6 = class597.method3284(0, var5, "&", "%26");
            String var7 = class597.method3284(0, var6, "#", "%23");
            if (class231.field2887 != null) {
                class264 var8 = class258.field3151.method3624(new URL(class231.field2887.getCodeBase(), "clienterror.ws?c=" + class68.field929 + "&u=" + class396.field4996 + "&v1=" + class648.field9137 + "&v2=" + class648.field9157 + "&e=" + var7), 4851);
                while (var8.field3358 == 0) {
                    class419.method2233(-28448, 1L);
                }
                if (~var8.field3358 == arg1) {
                    DataInputStream var9 = (DataInputStream) var8.field3356;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "([[BLgl;I)V")
    public static final void method598(byte[][] arg0, class646 arg1, int arg2) {
        field1413++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class630 var11 = new class630(var10);
                int var12 = class564.field7842[var5] >> 8;
                int var13 = class564.field7842[var5] & 0xFF;
                int var14 = var12 * 64 - class145.field1879;
                int var15 = var13 * 64 - class630.field8817;
                class671.method3767((byte) 76);
                arg1.method506(var15, var14, class145.field1879, arg2 ^ 0xFFFFFF8E, var11, class630.field8817, class154.field1991);
                arg1.method3609(class32.field452, var15, var11, var3, 6714, var14);
                if (!arg1.field1238 && (class313.field4036 / 8) == var12 && (class285.field3532 / 8) == var13 && var3[0] != -1) {
                    class419.field5274 = class64.field879.method2869(class470.field5972, var3[1], var3[2], var3[3], -29532, var3[0]);
                    class657.field9292 = var3[4];
                }
            }
        }
        if (arg2 != 8) {
            field1420 = null;
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class564.field7842[var6] >> 8) * 64 - class145.field1879;
            int var8 = (class564.field7842[var6] & 0xFF) * 64 - class630.field8817;
            byte[] var9 = arg0[var6];
            if (var9 == null && class285.field3532 < 800) {
                class671.method3767((byte) 76);
                arg1.method508(var8, 64, (byte) 89, var7, 64);
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(B)V")
    public static void method599(byte arg0) {
        field1420 = null;
        if (arg0 < 2) {
            method600(-8, 88, 87);
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(III)Z")
    public static final boolean method600(int arg0, int arg1, int arg2) {
        field1417++;
        if (arg2 >= -126) {
            return false;
        } else {
            return (arg1 & 0x10000) != 0;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZLjava/lang/String;IILjava/lang/String;)V")
    public static final void method601(boolean arg0, String arg1, int arg2, int arg3, String arg4) {
        class433.method2279(-1, 339, arg1, arg0, arg3, true, arg4);
        field1419++;
        if (arg2 != 160) {
            method602(null, (byte) 114, 107);
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ldr;BI)V")
    public static final void method602(class395 arg0, byte arg1, int arg2) {
        field1418++;
        if (class265.field3368 >= 50 || arg0 == null || arg0.field4973 == null || arg0.field4973.length <= arg2 || arg0.field4973[arg2] == null) {
            return;
        }
        int var3 = arg0.field4973[arg2][0];
        int var4 = var3 >> 8;
        if (arg0.field4973[arg2].length > 1) {
            int var5 = (int) (Math.random() * (double) arg0.field4973[arg2].length);
            if (var5 > 0) {
                var4 = arg0.field4973[arg2][var5];
            }
        }
        int var6 = (var3 & 0xF9) >> 5;
        if (arg0.field4984) {
            class602.method3306(var4, var6, 0, false, 255, false);
        } else {
            class160.method925(255, var4, var6, 0, 29830);
        }
        int var7 = 114 % ((30 - arg1) / 46);
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(III)V")
    public static final void method603(int arg0, int arg1, int arg2) {
        field1414++;
        if (arg0 == -1630137275 && class525.method2860((byte) 110, arg1)) {
            class571.method3153(class103.field1390[arg1], arg2, false);
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
    public static final String method604(int arg0, int arg1, byte[] arg2, int arg3) {
        field1416++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg2[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class286.field3555[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        if (arg0 == 26144) {
            return new String(var4, 0, var5);
        } else {
            return null;
        }
    }
}
