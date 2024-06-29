import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class178 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field2801 = 0;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "[I")
    public static int[] field2802 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field2804 = 0;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Lqh;")
    public static class201 field2800;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "[[B")
    public static byte[][] field2806;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
    public static final void method1211(String arg0, int arg1, Throwable arg2) {
        field2799++;
        try {
            String var3 = "";
            if (arg1 >= -108) {
                field2804 = -67;
            }
            if (arg2 != null) {
                var3 = class137.method964((byte) -76, arg2);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class221.method1538((byte) -93, var3);
            String var4 = class189.method1292(":", var3, "%3a", true);
            String var5 = class189.method1292("@", var4, "%40", true);
            String var6 = class189.method1292("&", var5, "%26", true);
            String var7 = class189.method1292("#", var6, "%23", true);
            if (class236.field3855.field2620 != null) {
                class163 var8 = class236.field3855.method1143((byte) -30, new URL(class236.field3855.field2620.getCodeBase(), "clienterror.ws?c=" + class63.field1029 + "&u=" + class53.field919 + "&v1=" + class165.field2614 + "&v2=" + class165.field2613 + "&e=" + var7));
                while (var8.field2589 == 0) {
                    class43.method358(1L, false);
                }
                if (var8.field2589 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2594;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lqh;ZBLqh;)V")
    public static final void method1212(class201 arg0, boolean arg1, byte arg2, class201 arg3) {
        field2805++;
        class145.field2328 = arg0;
        class66.field1093 = arg3;
        class201.field3208 = arg1;
        if (arg2 >= -112) {
            method1211((String) null, -121, (Throwable) null);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
    public static void method1213(boolean arg0) {
        if (arg0) {
            field2802 = null;
        }
        field2800 = null;
        field2802 = null;
        field2806 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIZIB)Ld;")
    public static final class238 method1214(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5) {
        if (arg5 >= -119) {
            field2806 = null;
        }
        field2803++;
        int var7 = (arg1 << 19) + arg4 + (arg3 ? 65536 : 0) + (arg2 << 17);
        long var8 = (long) arg0 * 3147483667L + (long) var7 * 3849834839L;
        class238 var10 = (class238) class39.field742.method480(var8, 110);
        if (var10 != null) {
            return var10;
        }
        class69.field1142 = false;
        class238 var11 = class101.method746(arg2, arg3, arg1, false, false, 0, arg4, arg0);
        if (var11 != null && !class69.field1142) {
            class39.field742.method474(var8, (byte) 74, var11);
        }
        return var11;
    }
}
