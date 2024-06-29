import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class621 {

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "I")
    public static int field8958 = 0;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "[I")
    public static int[] field8957;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)V")
    public static void method3589(byte arg0) {
        if (arg0 >= 120) {
            field8957 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(II)I")
    public static final int method3590(int arg0, int arg1) {
        field8956++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg1 != 4) {
            method3590(60, -69);
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V")
    public static final void method3591(String arg0, Throwable arg1, byte arg2) {
        field8959++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class694.method3900(arg1, 0);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class676.method3828(0, var3);
            String var4 = class442.method2654(":", var3, -1, "%3a");
            String var5 = class442.method2654("@", var4, -1, "%40");
            String var6 = class442.method2654("&", var5, -1, "%26");
            String var7 = class442.method2654("#", var6, -1, "%23");
            if (class81.field1504 != null && arg2 <= -56) {
                class637 var8 = class159.field2373.method2291(0, new URL(class81.field1504.getCodeBase(), "clienterror.ws?c=" + class11.field146 + "&u=" + class609.field8825 + "&v1=" + class367.field5127 + "&v2=" + class367.field5129 + "&e=" + var7));
                while (var8.field9091 == 0) {
                    class246.method1639(1L, (byte) -92);
                }
                if (var8.field9091 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field9093;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }
}
