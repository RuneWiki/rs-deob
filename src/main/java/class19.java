import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class19 extends class137 {

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
    public int field238 = 0;

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "Ljava/lang/String;")
    public static String field230 = null;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "Z")
    public static boolean field233 = false;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "Ljava/lang/String;")
    public static String field227 = "yellow:";

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "Ldk;")
    public static class251 field234;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method94(int arg0, Throwable arg1, String arg2) {
        field235++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class177.method1296(5, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class61.method416(-113, var3);
            String var4 = method99(var3, ":", "%3a", (byte) 110);
            String var5 = method99(var4, "@", "%40", (byte) 119);
            String var6 = method99(var5, "&", "%26", (byte) 80);
            String var7 = method99(var6, "#", "%23", (byte) -88);
            if (class34.field520.field751 != null) {
                class172 var8 = class34.field520.method314(new URL(class34.field520.field751.getCodeBase(), "clienterror.ws?c=" + class46.field784 + "&u=" + class62.field1027 + "&v1=" + class45.field754 + "&v2=" + class45.field753 + "&e=" + var7), (byte) 127);
                while (var8.field2814 == 0) {
                    class262.method1758(1L, 29552);
                }
                if (var8.field2814 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2817;
                    var9.read();
                    var9.close();
                }
                if (arg0 >= -102) {
                    field226 = -4;
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lwd;IB)V")
    private final void method95(class162 arg0, int arg1, byte arg2) {
        field236++;
        if (arg1 == 2) {
            this.field238 = arg0.method1142(arg2 ^ 0x4A61);
        }
        if (arg2 != -121) {
            field230 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([BI)[B")
    public static final byte[] method96(byte[] arg0, int arg1) {
        field229++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class157.method1074(arg0, 0, var3, arg1, var2);
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "(I)V")
    public static void method97(int arg0) {
        field230 = null;
        if (arg0 != 0) {
            field230 = null;
        }
        field234 = null;
        field227 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= class82.field1374 && class259.field4188 >= arg4 && arg6 >= class85.field1409 && arg3 <= class234.field3774) {
            class288.method1919(arg2, arg6, arg3, arg7 - 2, arg5, arg0, arg1, arg4);
        } else {
            class74.method501(arg2, arg4, (byte) -74, arg5, arg3, arg6, arg1, arg0);
        }
        field237++;
        if (arg7 != 2) {
            field227 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method99(String arg0, String arg1, String arg2, byte arg3) {
        int var4 = arg0.indexOf(arg1);
        int var5 = 97 % ((19 - arg3) / 44);
        while (var4 != -1) {
            arg0 = arg0.substring(0, var4) + arg2 + arg0.substring(arg1.length() + var4);
            var4 = arg0.indexOf(arg1, arg2.length() + var4);
        }
        field228++;
        return arg0;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lwd;I)V")
    public final void method100(class162 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1133((byte) 53);
            if (var3 == 0) {
                field231++;
                if (arg1 != 438) {
                    method94(-6, (Throwable) null, (String) null);
                    return;
                }
                return;
            }
            this.method95(arg0, var3, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIII)V")
    public static final void method101(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 53 % ((16 - arg0) / 61);
        class175 var6 = class182.method1317(10, arg2, false);
        field232++;
        var6.method1279((byte) -80);
        var6.field2855 = arg1;
        var6.field2865 = arg3;
        var6.field2857 = arg4;
    }
}
