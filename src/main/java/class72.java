import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class72 {

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Loc;")
    public static class99 field1822 = class48.method402((byte) -104, "m-Ochte sich mit Ihnen duellieren)3");

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Loc;")
    private static class99 field1819 = class48.method402((byte) -104, "Loading textures )2 ");

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Loc;")
    public static class99 field1821 = class48.method402((byte) -104, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!k", name = "o", descriptor = "Loc;")
    public static class99 field1831 = class48.method402((byte) -104, "Freie Welt");

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Loc;")
    public static class99 field1830 = class48.method402((byte) -104, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!k", name = "u", descriptor = "Z")
    public static boolean field1837 = false;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Loc;")
    private static class99 field1826 = class48.method402((byte) -104, "System update in: ");

    @OriginalMember(owner = "client!k", name = "r", descriptor = "Loc;")
    public static class99 field1834 = field1826;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "Loc;")
    public static class99 field1839 = field1819;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Loc;")
    private static class99 field1833 = class48.method402((byte) -104, "wave2:");

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Loc;")
    public static class99 field1828 = field1833;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Loc;")
    public static class99 field1827 = field1833;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "[Ljc;")
    public static class64[] field1820;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZB)V")
    public static final void method655(int arg0, int arg1, boolean arg2, byte arg3) {
        field1838++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class63.field1673 = arg0;
        int var4 = 14 % ((arg3 + 14) / 55);
        class130.field3203 = arg2;
        class33.field792 = arg1;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)I")
    public static final int method656(int arg0, int arg1, int arg2, int arg3) {
        field1825++;
        if (arg0 != 65280) {
            method657(6, 83, true, 94);
        }
        int var4 = 256 - arg3;
        return ((arg1 & 0xFF00) * arg3 + (arg2 & 0xFF00) * var4 & 0xFF0000) + ((arg1 & 0xFF00FF) * arg3 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) >> 8;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZI)Loc;")
    public static final class99 method657(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = 29 / ((arg0 + 20) / 34);
        int var5 = 1;
        field1817++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        for (int var6 = arg3 / arg1; var6 != 0; var6 /= arg1) {
            var5++;
        }
        int var7 = var5;
        if (arg3 < 0 || arg2) {
            var7 = var5 + 1;
        }
        byte[] var8 = new byte[var7];
        if (arg3 < 0) {
            var8[0] = 45;
        } else if (arg2) {
            var8[0] = 43;
        }
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = arg3 % arg1;
            if (var11 < 0) {
                var11 = -var11;
            }
            arg3 /= arg1;
            if (var11 > 9) {
                var11 += 39;
            }
            var8[var7 - var9 - 1] = (byte) (var11 + 48);
        }
        class99 var10 = new class99();
        var10.field2391 = var7;
        var10.field2394 = var8;
        return var10;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static final void method658(int arg0) {
        class73.field1847.method998(true);
        field1824++;
        if (arg0 != 38) {
            field1834 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V")
    public static final void method659(Throwable arg0, byte arg1, String arg2) {
        field1836++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class7.method90(true, arg0);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            if (arg1 <= 106) {
                field1828 = null;
            }
            String var7 = var6.replace('#', '_');
            if (class104.field2537.field1214 != null) {
                class28 var8 = class104.field2537.method420(new URL(class104.field2537.field1214.getCodeBase(), "clienterror.ws?c=" + class18.field474 + "&u=" + class110.field2720 + "&v1=" + class50.field1220 + "&v2=" + class50.field1213 + "&e=" + var7), false);
                while (var8.field688 == 0) {
                    class57.method509(-127, 1L);
                }
                if (var8.field688 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field685;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Loc;Loc;BLpc;)[Ldc;")
    public static final class24[] method660(class99 arg0, class99 arg1, byte arg2, class105 arg3) {
        field1835++;
        if (arg2 >= -87) {
            method655(21, -49, true, (byte) -21);
        }
        int var4 = arg3.method883(arg1, 120);
        int var5 = arg3.method898(arg0, 60, var4);
        return class113.method955(var4, (byte) 122, arg3, var5);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
    public static final void method661(int arg0, int arg1) {
        field1818++;
        class36 var2 = (class36) class14.field327.method1001((long) arg0, (byte) 111);
        if (var2 != null && arg1 == 25540) {
            for (int var3 = 0; var3 < var2.field923.length; var3++) {
                var2.field923[var3] = -1;
                var2.field917[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static void method662(byte arg0) {
        field1822 = null;
        field1831 = null;
        field1819 = null;
        field1828 = null;
        field1826 = null;
        field1839 = null;
        field1834 = null;
        field1827 = null;
        if (arg0 < 34) {
            field1820 = null;
        }
        field1833 = null;
        field1820 = null;
        field1830 = null;
        field1821 = null;
    }
}
