import java.awt.Component;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class94 {

    @OriginalMember(owner = "client!he", name = "d", descriptor = "[I")
    public static int[] field1768 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1770 = -1;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "[I")
    public static int[] field1769 = new int[1000];

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lok;")
    public static class149 field1767;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Lok;")
    public static class149 field1771;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lgf;I)Lud;", line = 6)
    public static final class279 method791(class8 arg0, int arg1) {
        field1766++;
        if (client.method1798(arg0).method1751((byte) 99) == 0) {
            return null;
        }
        int var2 = -50 % ((arg1 - 59) / 42);
        if (arg0.field178 == null || arg0.field178.method2006((byte) 112).method1984(8) == 0) {
            return class205.field3641 ? class173.field3126 : null;
        } else {
            return arg0.field178;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V", line = 42)
    public static final void method792(Throwable arg0, byte arg1, String arg2) {
        field1772++;
        try {
            if (arg1 != -115) {
                method794(55);
            }
            String var3 = "";
            if (arg0 != null) {
                var3 = class286.method2047(-1, arg0);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class55.method513(124, var3);
            String var4 = class119.method949(var3, 0, "%3a", ":");
            String var5 = class119.method949(var4, 0, "%40", "@");
            String var6 = class119.method949(var5, 0, "%26", "&");
            String var7 = class119.method949(var6, 0, "%23", "#");
            if (class77.field1492.field5418 == null) {
                return;
            }
            class206 var8 = class77.field1492.method2170((byte) 117, new URL(class77.field1492.field5418.getCodeBase(), "clienterror.ws?c=" + class52.field1091 + "&u=" + class139.field2542 + "&v1=" + class305.field5424 + "&v2=" + class305.field5413 + "&e=" + var7));
            while (var8.field3655 == 0) {
                class204.method1510(1L, 1);
            }
            if (var8.field3655 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field3657;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lbd;Ljava/awt/Component;IIB)Lth;", line = 96)
    public static final class86 method793(class305 arg0, Component arg1, int arg2, int arg3, byte arg4) {
        field1765++;
        if (class312.field5524 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class86 var5 = (class86) Class.forName("gh").getDeclaredConstructor().newInstance();
                var5.field1658 = arg2;
                var5.field1633 = new int[(class287.field5132 ? 2 : 1) * 256];
                if (arg4 >= -6) {
                    return (class86) null;
                }
                var5.method749(arg1);
                var5.field1667 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field1667 > 16384) {
                    var5.field1667 = 16384;
                }
                var5.method757(var5.field1667);
                if (class51.field1063 > 0 && class274.field4873 == null) {
                    class274.field4873 = new class13();
                    class274.field4873.field407 = arg0;
                    arg0.method2163(class274.field4873, class51.field1063, 7159);
                }
                if (class274.field4873 != null) {
                    if (class274.field4873.field420[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class274.field4873.field420[arg3] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class106 var7 = new class106(arg0, arg3);
                    var7.field1633 = new int[(class287.field5132 ? 2 : 1) * 256];
                    var7.field1658 = arg2;
                    var7.method749(arg1);
                    var7.field1667 = 16384;
                    var7.method757(var7.field1667);
                    if (class51.field1063 > 0 && class274.field4873 == null) {
                        class274.field4873 = new class13();
                        class274.field4873.field407 = arg0;
                        arg0.method2163(class274.field4873, class51.field1063, 7159);
                    }
                    if (class274.field4873 != null) {
                        if (class274.field4873.field420[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class274.field4873.field420[arg3] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class86();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 216)
    public static void method794(int arg0) {
        if (arg0 == -623057722) {
            field1771 = null;
            field1767 = null;
            field1768 = null;
            field1769 = null;
        }
    }
}
