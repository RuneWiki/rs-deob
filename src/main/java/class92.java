import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class92 extends class5 {

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "S")
    public short field1819 = -32768;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "Led;")
    private static class43 field1818 = class191.method1219("M", false);

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "Led;")
    public static class43 field1821 = class191.method1219(": ", false);

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "Led;")
    public static class43 field1822 = class191.method1219("und haben es deaktiviert)3 Klicken Sie auf der", false);

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "Led;")
    public static class43 field1815 = field1818;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "Led;")
    public static class43 field1823 = class191.method1219("Registrierter Benutzer", false);

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "Led;")
    public static class43 field1828 = class191.method1219(" )2> <col=ffffff>", false);

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "Led;")
    public static class43 field1827 = class191.method1219("Spieler", false);

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "Led;")
    public static class43 field1830 = field1818;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "Led;")
    public static class43 field1829 = class191.method1219("m", false);

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "Z")
    public static boolean field1825;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "[S")
    public static short[] field1817;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "(I)V")
    public static void method590(int arg0) {
        field1823 = null;
        field1829 = null;
        field1822 = null;
        field1830 = null;
        field1827 = null;
        field1815 = null;
        field1828 = null;
        if (arg0 != 0) {
            field1825 = false;
        }
        field1817 = null;
        field1818 = null;
        field1821 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)V")
    public static final void method591(int arg0, byte arg1) {
        field1824++;
        if (arg0 == -1 || !class54.method335(arg1 ^ 0x2D3D0366, arg0)) {
            return;
        }
        class129[] var2 = class12.field177[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class129 var4 = var2[var3];
            if (var4.field2679 != null) {
                class115 var5 = new class115();
                var5.field2238 = var4.field2679;
                var5.field2249 = var4;
                class138.method892(2000000, var5, 25969);
            }
        }
        if (arg1 != -74) {
            field1829 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IB)Lcb;")
    public static final class23 method592(int arg0, byte arg1) {
        field1820++;
        class23 var2 = (class23) class185.field3645.method1106(100, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class32.field598.method367(6, arg0, (byte) -34);
        if (arg1 < 17) {
            field1818 = null;
        }
        class23 var4 = new class23();
        var4.field435 = arg0;
        if (var3 != null) {
            var4.method110(101, new class89(var3));
        }
        var4.method108(false);
        if (var4.field407) {
            var4.field396 = false;
            var4.field406 = 0;
        }
        class185.field3645.method1107((long) arg0, var4, -109);
        return var4;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIII)V")
    public void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1826++;
        class199 var10 = this.method593(6);
        if (var10 != null) {
            var10.method2(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1819 = var10.field1819;
        }
    }

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "(I)Lw;")
    public class199 method593(int arg0) {
        field1816++;
        if (arg0 != 6) {
            field1822 = null;
        }
        return null;
    }
}
