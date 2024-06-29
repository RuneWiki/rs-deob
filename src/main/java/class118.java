import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class118 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Ldf;")
    private static class51 field1974 = class46.method233(" ", 100);

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "S")
    public static short field1980 = 320;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Ldf;")
    public static class51 field1979 = field1974;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Ldf;")
    public static class51 field1978 = class46.method233("", 100);

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lu;")
    public static class111 field1976;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Lu;")
    public static class111 field1982;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "[I")
    public static int[] field1975;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method855(byte arg0) {
        field1978 = null;
        field1982 = null;
        field1975 = null;
        field1976 = null;
        field1979 = null;
        if (arg0 != -123) {
            method855((byte) -25);
        }
        field1974 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BIZI)I")
    public static final int method856(byte arg0, int arg1, boolean arg2, int arg3) {
        class136 var4 = (class136) class7.field77.method1453((long) arg3, 1);
        field1981++;
        if (var4 == null) {
            return 0;
        }
        int var5 = 100 % ((14 - arg0) / 38);
        int var6 = 0;
        for (int var7 = 0; var7 < var4.field2258.length; var7++) {
            if (var4.field2258[var7] >= 0 && class19.field270 > var4.field2258[var7]) {
                class222 var8 = class219.method1508(var4.field2258[var7], (byte) -54);
                if (var8.field3894 != null) {
                    class255 var9 = (class255) var8.field3894.method1453((long) arg1, 1);
                    if (var9 != null) {
                        if (arg2) {
                            var6 += var4.field2256[var7] * var9.field4454;
                        } else {
                            var6 += var9.field4454;
                        }
                    }
                }
            }
        }
        return var6;
    }
}
