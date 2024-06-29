import java.awt.Frame;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class48 {

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Lhi;")
    public static class82 field800 = null;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field798 = 0;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Z")
    public static boolean field802 = false;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field795;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)I", line = 7)
    public static final int method344(byte arg0, int arg1) {
        field797++;
        int var2 = arg1 >> 6 & 0x3;
        int var3 = arg1 & 0x3F;
        if (var3 == 18) {
            if (var2 == 0) {
                return 1;
            }
            if (var2 == 1) {
                return 2;
            }
            if (var2 == 2) {
                return 4;
            }
            if (var2 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var2 == 0) {
                return 16;
            }
            if (var2 == 1) {
                return 32;
            }
            if (var2 == 2) {
                return 64;
            }
            if (var2 == 3) {
                return 128;
            }
        }
        int var4 = 32 / ((66 - arg0) / 60);
        return 0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILum;)V", line = 65)
    public static final void method345(int arg0, class222 arg1) {
        if (arg0 <= 0) {
            method344((byte) -19, -26);
        }
        class217.field3766 = arg1;
        field794++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 77)
    public static void method346(int arg0) {
        if (arg0 != 0) {
            method348(-81, (String) null, (Throwable) null);
        }
        field800 = null;
        field795 = null;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(BI)Z", line = 92)
    public static final boolean method347(byte arg0, int arg1) {
        field799++;
        int var2 = -65 % ((arg0 + 31) / 34);
        return (arg1 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V", line = 115)
    public static final void method348(int arg0, String arg1, Throwable arg2) {
        field796++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class222.method1586(arg2, 1072411137);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class25.field334.field2109 == null) {
                return;
            }
            class301 var8 = class25.field334.method816(arg0 ^ 0xFFFFFFFE, new URL(class25.field334.field2109.getCodeBase(), "clienterror.ws?c=" + class165.field2887 + "&u=" + class9.field71 + "&v1=" + class120.field2120 + "&v2=" + class120.field2110 + "&e=" + var7));
            while (var8.field5121 == 0) {
                class290.method2001(1L, false);
            }
            if (~var8.field5121 == arg0) {
                DataInputStream var9 = (DataInputStream) var8.field5122;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIBII)V", line = 166)
    public static final void method349(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class227 var5 = class215.method1531(-1, 8, arg4);
        if (arg2 != 27) {
            return;
        }
        var5.method1616(64);
        var5.field3923 = arg0;
        var5.field3929 = arg3;
        var5.field3927 = arg1;
        field801++;
    }
}
