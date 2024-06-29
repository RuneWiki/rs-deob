import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class97 {

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "Lke;")
    public static class256 field1737 = class316.method2202(":", 27626);

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Lke;")
    public static class256 field1736 = class316.method2202("cookiehost", 27626);

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lke;")
    public static class256 field1735 = class316.method2202("Chargement des fichiers config )2 ", 27626);

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "[I")
    public static int[] field1741 = new int[2500];

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Lke;")
    public static class256 field1740 = class316.method2202("zap", 27626);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 6)
    public static void method696(int arg0) {
        field1736 = null;
        field1735 = null;
        field1741 = null;
        field1740 = null;
        if (arg0 <= 19) {
            field1736 = (class256) null;
        }
        field1737 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lng;Lng;Lng;BLlc;)Z", line = 24)
    public static final boolean method697(class138 arg0, class138 arg1, class138 arg2, byte arg3, class278 arg4) {
        if (arg3 >= -59) {
            method699(3, -55, (byte) -74, -4, 71, -99);
        }
        class298.field5160 = arg2;
        class188.field3429 = arg4;
        class111.field1934 = arg1;
        field1739++;
        class161.field2865 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V", line = 58)
    public static final void method698(int arg0, int arg1, int arg2) {
        field1734++;
        if (arg0 >= -78) {
            method696(91);
        }
        class77 var3 = class156.method1158(12, false, arg2);
        var3.method584(22992);
        var3.field1455 = arg1;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIBIII)V", line = 82)
    public static final void method699(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var9 = arg5 + 1;
        class73.method550(-29903, class308.field5329[arg5], arg1, arg3, arg4);
        int var8 = arg0 - 1;
        class73.method550(-29903, class308.field5329[arg0], arg1, arg3, arg4);
        field1738++;
        int var6 = var9;
        if (arg2 < 117) {
            method696(-33);
        }
        while (var8 >= var6) {
            int[] var7 = class308.field5329[var6];
            var7[arg3] = var7[arg1] = arg4;
            var6++;
        }
    }
}
