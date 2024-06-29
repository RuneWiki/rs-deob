import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class123 {

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Lid;")
    public static class149 field2162 = class60.method382("rect_debug=", (byte) 17);

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "Lid;")
    public static class149 field2163 = class60.method382("M-Bmoire attribu-Be", (byte) 36);

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "Lid;")
    private static class149 field2170 = class60.method382("fr", (byte) 78);

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "Lid;")
    private static class149 field2171 = class60.method382("en", (byte) 36);

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "Lid;")
    public static class149 field2172 = class60.method382("Jeter", (byte) 48);

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "Lid;")
    private static class149 field2166 = class60.method382("de", (byte) 89);

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Lid;")
    private static class149 field2167 = class60.method382("pt", (byte) 85);

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "[Lid;")
    public static class149[] field2176 = new class149[] { field2171, field2166, field2170, field2167 };

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    private int field2161;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public int field2164;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public int field2175;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)Lda;")
    public static final class185 method865(int arg0, int arg1) {
        class185 var2 = (class185) class71.field1243.method1293((long) arg0, false);
        field2174++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class16.field228.method1562(-809612665, arg0, arg1);
        class185 var4 = new class185();
        if (var3 != null) {
            var4.method1276(new class74(var3), (byte) -99, arg0);
        }
        class71.field1243.method1295((long) arg0, var4, (byte) -71);
        return var4;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public static void method866(byte arg0) {
        if (arg0 != -105) {
            field2170 = null;
        }
        field2167 = null;
        field2170 = null;
        field2163 = null;
        field2176 = null;
        field2171 = null;
        field2166 = null;
        field2172 = null;
        field2162 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)Lrh;")
    public final class46 method867(int arg0) {
        if (arg0 != -6864) {
            return null;
        }
        class46 var2 = (class46) class255.field4461.method1293((long) this.field2161, false);
        field2169++;
        if (var2 != null) {
            return var2;
        }
        class46 var3 = class156.method1125(0, class71.field1242, false, this.field2161);
        if (var3 != null) {
            class255.field4461.method1295((long) this.field2161, var3, (byte) -71);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IILgd;)V")
    public final void method868(int arg0, int arg1, class74 arg2) {
        while (true) {
            int var4 = arg2.method489((byte) -31);
            if (var4 == 0) {
                field2165++;
                if (arg0 != 2) {
                    method865(84, -53);
                    return;
                }
                return;
            }
            this.method870(var4, arg1, arg2, (byte) 105);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)Z")
    public static final boolean method869(boolean arg0) {
        field2173++;
        if (!arg0) {
            method866((byte) -92);
        }
        return class8.field99;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IILgd;B)V")
    private final void method870(int arg0, int arg1, class74 arg2, byte arg3) {
        int var5 = 66 % ((47 - arg3) / 50);
        if (arg0 == 1) {
            this.field2161 = arg2.method485(-2386);
        } else if (arg0 == 2) {
            this.field2175 = arg2.method489((byte) -64);
            this.field2164 = arg2.method489((byte) -48);
        }
        field2168++;
    }
}
