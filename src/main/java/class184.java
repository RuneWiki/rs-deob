import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class184 {

    @OriginalMember(owner = "client!de", name = "e", descriptor = "[C")
    public static char[] field2769 = new char[128];

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[[Lfm;")
    public static class127[][] field2766;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Z", line = 6)
    public static final boolean method1320(int arg0) {
        field2768++;
        if (class296.field4571) {
            try {
                return !(Boolean) class3.method16("showingVideoAd", class32.field471.field2721, -102);
            } catch (Throwable var2) {
            }
        }
        if (arg0 != 128) {
            method1324(-53);
        }
        return true;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)Z", line = 29)
    public static final boolean method1321(boolean arg0) {
        field2767++;
        try {
            if (class225.field3583 == 2) {
                if (class48.field785 == null) {
                    class48.field785 = class164.method1114(class50.field803, class1.field5, class50.field801);
                    if (class48.field785 == null) {
                        return false;
                    }
                }
                if (class337.field5271 == null) {
                    class337.field5271 = new class323(class175.field2647, class288.field4494);
                }
                if (class160.field2416.method1946(class48.field785, class139.field2168, class337.field5271, 22050, (byte) 126)) {
                    class160.field2416.method1965((byte) -120);
                    class160.field2416.method1939(class48.field781, (byte) 31);
                    class160.field2416.method1956(class150.field2266, class48.field785, false);
                    class337.field5271 = null;
                    class48.field785 = null;
                    class225.field3583 = 0;
                    class50.field803 = null;
                    return true;
                }
            }
            if (!arg0) {
                method1321(true);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class160.field2416.method1968(0);
            class337.field5271 = null;
            class225.field3583 = 0;
            class48.field785 = null;
            class50.field803 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V", line = 82)
    public static final void method1322(Throwable arg0, String arg1, byte arg2) {
        field2765++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class7.method57(0, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class67.method518(var3, arg2 + 24);
            String var4 = class171.method1239(var3, (byte) 120, "%3a", ":");
            String var5 = class171.method1239(var4, (byte) 121, "%40", "@");
            String var6 = class171.method1239(var5, (byte) 123, "%26", "&");
            String var7 = class171.method1239(var6, (byte) 127, "%23", "#");
            if (class308.field4791.field2721 == null) {
                return;
            }
            class197 var8 = class308.field4791.method1295(new URL(class308.field4791.field2721.getCodeBase(), "clienterror.ws?c=" + class291.field4520 + "&u=" + class224.field3561 + "&v1=" + class180.field2706 + "&v2=" + class180.field2705 + "&e=" + var7), true);
            while (var8.field2956 == 0) {
                class5.method26(arg2 + 24, 1L);
            }
            if (var8.field2956 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field2959;
                var9.read();
                var9.close();
            }
            if (arg2 != -24) {
                field2769 = (char[]) null;
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIILwb;IJ)Z", line = 135)
    public static final boolean method1323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class253 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class189.method1347(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V", line = 152)
    public static void method1324(int arg0) {
        if (arg0 < 23) {
            field2766 = (class127[][]) ((class127[][]) null);
        }
        field2769 = null;
        field2766 = (class127[][]) null;
    }
}
