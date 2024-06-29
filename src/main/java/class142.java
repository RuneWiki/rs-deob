import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class142 {

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lod;")
    public static class101 field3264 = class46.method335(-126, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Lod;")
    private static class101 field3267 = class46.method335(126, "Error loading your profile)3");

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lod;")
    public static class101 field3269 = class46.method335(118, "(U1");

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Lod;")
    public static class101 field3265 = class46.method335(-101, "<img=0>");

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field3275 = -1;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field3272 = 0;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field3271 = 0;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Lod;")
    public static class101 field3276 = field3267;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Lod;")
    public static class101 field3273 = class46.method335(99, "(Y<)4col>");

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field3277 = 0;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Lod;")
    private static class101 field3280 = class46.method335(-79, "skill)2");

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Lod;")
    public static class101 field3270 = field3280;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Ltf;")
    public static class138 field3278;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Lc;")
    public static class15 field3268;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static final void method1130(String arg0, Throwable arg1, int arg2) {
        field3274++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class75.method515(arg1, arg2 - 7552);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class20.field441.field3453 != null) {
                class74 var8 = class20.field441.method1173(new URL(class20.field441.field3453.getCodeBase(), "clienterror.ws?c=" + class13.field286 + "&u=" + class24.field597 + "&v1=" + class151.field3463 + "&v2=" + class151.field3454 + "&e=" + var7), 115);
                if (arg2 != 7565) {
                    field3277 = 14;
                }
                while (var8.field1591 == 0) {
                    class127.method981((byte) -86, 1L);
                }
                if (var8.field1591 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1590;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[Lod;IB)Lod;")
    public static final class101 method1131(int arg0, class101[] arg1, int arg2, byte arg3) {
        field3261++;
        int var4 = 0;
        int var5 = -65 % ((41 - arg3) / 34);
        for (int var6 = 0; var6 < arg0; var6++) {
            if (arg1[arg2 + var6] == null) {
                arg1[arg2 + var6] = class50.field1167;
            }
            var4 += arg1[arg2 + var6].field2231;
        }
        byte[] var7 = new byte[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0; var9++) {
            class101 var11 = arg1[arg2 + var9];
            class60.method417(var11.field2223, 0, var7, var8, var11.field2231);
            var8 += var11.field2231;
        }
        class101 var10 = new class101();
        var10.field2231 = var4;
        var10.field2223 = var7;
        return var10;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method1132(int arg0) {
        field3267 = null;
        field3278 = null;
        field3269 = null;
        if (arg0 != 29651) {
            method1132(-92);
        }
        field3270 = null;
        field3280 = null;
        field3265 = null;
        field3276 = null;
        field3268 = null;
        field3273 = null;
        field3264 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3266++;
        if ((arg4 & 0x1) == arg6) {
            int var7 = arg0;
            arg0 = arg1;
            arg1 = var7;
        }
        int var8 = arg2 & 0x3;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return 7 + 1 - arg0 - arg5;
        } else if (var8 == 2) {
            return 1 + 7 - arg1 - arg3;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method1134(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3263++;
        if (class143.method1139(101, arg1)) {
            class154.field3505 = null;
            class126.method967(true, arg5, -1, class100.field2161[arg1], arg6, arg4, arg7, arg0, arg2, arg8);
            if (class154.field3505 != null) {
                class126.method967(true, arg5, -1412584499, class154.field3505, class75.field1611, arg4, arg7, class156.field3584, arg2, arg8);
                class154.field3505 = null;
            }
            int var10 = 116 / ((arg3 - 28) / 61);
        } else if (arg5 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class129.field2938[var9] = true;
            }
        } else {
            class129.field2938[arg5] = true;
        }
    }
}
