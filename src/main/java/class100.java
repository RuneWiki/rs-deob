import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class100 {

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Lc;")
    public static class125 field1955 = new class125();

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "Lr;")
    public static class66 field1961 = class93.method641(43, ":trade:");

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "[Lr;")
    public static class66[] field1957 = new class66[8];

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field1959 = 0;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Lr;")
    private static class66 field1956 = class93.method641(43, " has logged in)3");

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Lr;")
    public static class66 field1958 = field1956;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static final void method685(byte arg0) {
        field1960++;
        class215.method1385(class241.field4187, -127);
        class254.field4466++;
        if (class139.field2577 && class217.field3740) {
            int var1 = class170.field3021;
            int var2 = var1 - class164.field2934;
            if (class188.field3270 > var2) {
                var2 = class188.field3270;
            }
            int var3 = class50.field896;
            int var4 = var3 - class183.field3199;
            if (class215.field3691 > var4) {
                var4 = class215.field3691;
            }
            if (class241.field4187.field1215 + var2 > class188.field3270 + class135.field2502.field1215) {
                var2 = class188.field3270 + class135.field2502.field1215 - class241.field4187.field1215;
            }
            if (arg0 > -112) {
                field1961 = null;
            }
            if ((class215.field3691 + class135.field2502.field1196) < (var4 + class241.field4187.field1196)) {
                var4 = class215.field3691 + class135.field2502.field1196 - class241.field4187.field1196;
            }
            int var5 = var2 - class85.field1668;
            int var6 = var4 - class110.field2121;
            int var7 = class241.field4187.field1193;
            if (class241.field4187.field1232 < class254.field4466 && (var7 < var5 || var5 < (-var7) || var6 > var7 || (-var7) > var6)) {
                class109.field2115 = true;
            }
            int var8 = class135.field2502.field1170 + var2 - class188.field3270;
            int var9 = var4 + class135.field2502.field1141 - class215.field3691;
            if (class241.field4187.field1130 != null && class109.field2115) {
                class237 var10 = new class237();
                var10.field4113 = var9;
                var10.field4118 = class241.field4187.field1130;
                var10.field4121 = var8;
                var10.field4120 = class241.field4187;
                class8.method34(var10, 16);
            }
            if (class30.field452 == 0) {
                if (class109.field2115) {
                    if (class241.field4187.field1101 != null) {
                        class237 var11 = new class237();
                        var11.field4125 = class20.field272;
                        var11.field4113 = var9;
                        var11.field4118 = class241.field4187.field1101;
                        var11.field4120 = class241.field4187;
                        var11.field4121 = var8;
                        class8.method34(var11, 16);
                    }
                    if (class20.field272 != null && client.method587(class241.field4187) != null) {
                        class28.field412.method578(68, 179);
                        class231.field3992++;
                        class28.field412.method1666(544537784, class20.field272.field1115);
                        class28.field412.method1666(544537784, class241.field4187.field1115);
                        class28.field412.method1650(false, class241.field4187.field1190);
                        class28.field412.method1656(class20.field272.field1190, (byte) 38);
                    }
                } else if ((class133.field2475 == 1 || class40.method241((byte) -126, class176.field3105 - 1)) && class176.field3105 > 2) {
                    class105.method723((byte) -25);
                } else if (class176.field3105 > 0) {
                    class21.method92((byte) 49);
                }
                class241.field4187 = null;
            }
        } else if (class254.field4466 > 1) {
            class241.field4187 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)Z")
    public static final boolean method686(int arg0) {
        field1952++;
        if (class150.field2704 != arg0) {
            try {
                class89.field1730.method474(class95.field1835.field2184, (byte) -123);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
    public static void method687(int arg0) {
        field1958 = null;
        field1957 = null;
        if (arg0 != 0) {
            field1955 = null;
        }
        field1955 = null;
        field1961 = null;
        field1956 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIILcj;)[Ljb;")
    public static final class256[] method688(int arg0, int arg1, int arg2, class28 arg3) {
        field1954++;
        if (arg0 != 0) {
            method686(-51);
        }
        return class31.method174(-29381, arg1, arg3, arg2) ? class233.method1523((byte) 15) : null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIB)V")
    public static final void method689(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = 0;
        if (arg4 >= -25) {
            method687(-89);
        }
        while (var5 < class87.field1701) {
            if (arg0 < (class246.field4293[var5] + class157.field2827[var5]) && class246.field4293[var5] < arg0 + arg2 && class45.field831[var5] + class181.field3167[var5] > arg1 && class181.field3167[var5] < (arg1 + arg3)) {
                class255.field4485[var5] = true;
            }
            var5++;
        }
        field1953++;
    }
}
