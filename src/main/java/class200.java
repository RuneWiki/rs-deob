import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class200 {

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Leg;")
    public static class37 field3398 = class174.method1167(" (X", -33);

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field3396 = 0;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field3402 = 0;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field3404 = 0;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "[I")
    public static int[] field3401 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1 };

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Ljl;")
    public static class101 field3400;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Leg;")
    public static class37 field3399;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "[Lja;")
    public static class105[] field3395;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIILme;JZ)V")
    public static final void method1389(int arg0, int arg1, int arg2, int arg3, class67 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class239 var8 = new class239();
        var8.field4251 = arg4;
        var8.field4245 = arg1 * 128 + 64;
        var8.field4241 = arg2 * 128 + 64;
        var8.field4240 = arg3;
        var8.field4244 = arg5;
        if (class286.field5048[arg0][arg1][arg2] == null) {
            class286.field5048[arg0][arg1][arg2] = new class111(arg0, arg1, arg2);
        }
        class286.field5048[arg0][arg1][arg2].field1876 = var8;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static final void method1390(int arg0) {
        class213.field3680.method1702(80);
        field3397++;
        int var1 = class213.field3680.method1705((byte) 115, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class213.field3680.method1705((byte) 99, 2);
        if (var2 == 0) {
            class203.field3463[class255.field4524++] = 2047;
        } else if (var2 == 1) {
            int var3 = class213.field3680.method1705((byte) 108, 3);
            class82.field1285.method769(false, var3, arg0 + 24103);
            int var4 = class213.field3680.method1705((byte) 120, 1);
            if (var4 == 1) {
                class203.field3463[class255.field4524++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class213.field3680.method1705((byte) 122, 3);
            class82.field1285.method769(true, var5, 24138);
            int var6 = class213.field3680.method1705((byte) 115, 3);
            class82.field1285.method769(true, var6, arg0 + 24103);
            int var7 = class213.field3680.method1705((byte) 115, 1);
            if (var7 == 1) {
                class203.field3463[class255.field4524++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class213.field3680.method1705((byte) 103, 7);
            int var9 = class213.field3680.method1705((byte) 123, 1);
            if (var9 == 1) {
                class203.field3463[class255.field4524++] = 2047;
            }
            int var10 = class213.field3680.method1705((byte) 107, 7);
            class237.field4140 = class213.field3680.method1705((byte) 106, 2);
            int var11 = class213.field3680.method1705((byte) 127, 1);
            class82.field1285.method1301(var10, var8, var11 == 1, arg0 ^ 0x11A7);
        } else if (arg0 != 35) {
            method1392(-116, (String) null, (Throwable) null);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public static void method1391(int arg0) {
        field3401 = null;
        field3398 = null;
        field3399 = null;
        if (arg0 != 128) {
            field3399 = null;
        }
        field3400 = null;
        field3395 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method1392(int arg0, String arg1, Throwable arg2) {
        field3405++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class82.method552((byte) 110, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class166.method1118(var3, arg0 ^ 0x38);
            String var4 = var3.replace((char) arg0, '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class66.field1052.field3504 != null) {
                class251 var8 = class66.field1052.method1425(new URL(class66.field1052.field3504.getCodeBase(), "clienterror.ws?c=" + class95.field1488 + "&u=" + class10.field165 + "&v1=" + class207.field3498 + "&v2=" + class207.field3510 + "&e=" + var7), arg0 ^ 0x53);
                while (var8.field4488 == 0) {
                    class144.method1008(110, 1L);
                }
                if (var8.field4488 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field4483;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }
}
