import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class326 {

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "I")
    public int field4660 = -1;

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "[I")
    public static int[] field4657 = new int[1];

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "[Ltea;")
    public static class240[] field4655 = new class240[4];

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "Lru;")
    public class193 field4653;

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "Lvd;")
    public static class39 field4658;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "[I")
    public int[] field4652;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field4651;

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "[[B")
    public static byte[][] field4656;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V", line = 3)
    public static void method2071(int arg0) {
        field4655 = null;
        field4658 = null;
        if (arg0 != -1) {
            method2071(-116);
        }
        field4656 = null;
        field4657 = null;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V", line = 37)
    public static final void method2072(int arg0, Throwable arg1, String arg2) {
        field4659++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class266.method1711(true, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class394.method2522(var3, 55);
            String var4 = class35.method182(":", "%3a", var3, 69);
            String var5 = class35.method182("@", "%40", var4, arg0 ^ 0xE9A);
            String var6 = class35.method182("&", "%26", var5, 117);
            String var7 = class35.method182("#", "%23", var6, -22);
            if (class87.field1248 == null) {
                return;
            }
            class197 var8 = class629.field8792.method4055(new URL(class87.field1248.getCodeBase(), "clienterror.ws?c=" + class474.field6897 + "&u=" + (class758.field10601 == null ? String.valueOf(class538.field7689) : class758.field10601) + "&v1=" + class711.field10023 + "&v2=" + class711.field10035 + "&e=" + var7), (byte) 37);
            while (var8.field2986 == 0) {
                class277.method1759(1L, arg0 ^ 0xFFFFF134);
            }
            if (var8.field2986 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field2990;
                var9.read();
                var9.close();
            }
        } catch (Exception var10) {
        }
        if (arg0 != -3753) {
            field4656 = null;
        }
    }
}
