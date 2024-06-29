import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class124 {

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Led;")
    public static class43 field2459 = class191.method1219("scrollen:", false);

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Led;")
    private static class43 field2460 = class191.method1219("Loading textures )2 ", false);

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Led;")
    public static class43 field2462 = field2460;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Led;")
    public static class43 field2465 = class191.method1219("<col=ffffff>", false);

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Led;")
    private static class43 field2461 = class191.method1219("Examine", false);

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field2457 = 0;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Led;")
    public static class43 field2455 = field2461;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Led;")
    public static class43 field2458 = class191.method1219("(Z", false);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Lga;")
    public static class58 field2463;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lga;Lga;I)I")
    public static final int method800(class58 arg0, class58 arg1, int arg2) {
        field2464++;
        int var3 = 0;
        if (arg0.method361((byte) 127, class18.field314, class68.field1363)) {
            var3++;
        }
        if (arg1.method361((byte) 124, class88.field1723, class68.field1363)) {
            var3++;
        }
        if (arg1.method361((byte) 126, class101.field1924, class68.field1363)) {
            var3++;
        }
        if (arg1.method361((byte) 126, class119.field2381, class68.field1363)) {
            var3++;
        }
        if (arg2 <= 14) {
            return -90;
        }
        if (arg1.method361((byte) 127, class105.field2017, class68.field1363)) {
            var3++;
        }
        if (arg1.method361((byte) 120, class140.field2916, class68.field1363)) {
            var3++;
        }
        arg1.method361((byte) 124, class64.field1315, class68.field1363);
        arg1.method361((byte) 126, class91.field1812, class68.field1363);
        arg1.method361((byte) 121, class53.field1072, class68.field1363);
        arg1.method361((byte) 127, class204.field3980, class68.field1363);
        arg1.method361((byte) 126, class2.field50, class68.field1363);
        return var3;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)Lob;")
    public static final class129 method801(byte arg0, int arg1) {
        field2454++;
        if (arg0 != -36) {
            return null;
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class12.field177[var2] == null || class12.field177[var2][var3] == null) {
            boolean var4 = class54.method335(arg0 - 758973196, var2);
            if (!var4) {
                return null;
            }
        }
        return class12.field177[var2][var3];
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method802(int arg0) {
        field2459 = null;
        field2465 = null;
        field2455 = null;
        field2461 = null;
        field2463 = null;
        if (arg0 == 27710) {
            field2460 = null;
            field2458 = null;
            field2462 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([Led;I)[Led;")
    public static final class43[] method803(class43[] arg0, int arg1) {
        field2467++;
        if (arg1 != 5) {
            method800(null, null, -128);
        }
        class43[] var2 = new class43[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class167.method1036(new class43[] { class30.method161(var3, 10), class92.field1821 }, true);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class167.method1036(new class43[] { var2[var3], arg0[var3] }, true);
            }
        }
        return var2;
    }
}
