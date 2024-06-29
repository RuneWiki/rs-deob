import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class133 {

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Ljd;")
    private static class85 field2313 = class221.method1499("May", (byte) -113);

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Ljd;")
    private static class85 field2314 = class221.method1499("Aug", (byte) 100);

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Ljd;")
    private static class85 field2320 = class221.method1499("Oct", (byte) 109);

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field2312 = 0;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Ljd;")
    private static class85 field2326 = class221.method1499("Sep", (byte) -100);

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Ljd;")
    private static class85 field2316 = class221.method1499("Dec", (byte) 100);

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "Ljd;")
    private static class85 field2324 = class221.method1499("Nov", (byte) -93);

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "Ljd;")
    private static class85 field2325 = class221.method1499("Jul", (byte) -48);

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Ljd;")
    private static class85 field2315 = class221.method1499("Jun", (byte) -120);

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Ljd;")
    public static class85 field2328 = class221.method1499("floorshadows", (byte) -46);

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Ljd;")
    private static class85 field2321 = class221.method1499("Apr", (byte) -103);

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Ljd;")
    private static class85 field2327 = class221.method1499("Feb", (byte) -88);

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "Ljd;")
    private static class85 field2329 = class221.method1499("Mar", (byte) 121);

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Ljd;")
    private static class85 field2318 = class221.method1499("Jan", (byte) -98);

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "[Ljd;")
    public static class85[] field2330 = new class85[] { field2318, field2327, field2329, field2321, field2313, field2315, field2325, field2314, field2326, field2320, field2324, field2316 };

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lhb;")
    public static class206 field2317;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static void method888(byte arg0) {
        field2313 = null;
        field2326 = null;
        field2317 = null;
        field2315 = null;
        field2328 = null;
        field2321 = null;
        field2314 = null;
        field2318 = null;
        field2325 = null;
        field2327 = null;
        field2330 = null;
        field2320 = null;
        field2324 = null;
        field2329 = null;
        field2316 = null;
        if (arg0 != 74) {
            field2313 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)I")
    public static final int method889(byte arg0) {
        field2322++;
        if (arg0 > -118) {
            field2318 = null;
        }
        return ((class270.field4793 == 0 ? 0 : 1) << 21) + ((class95.field1743 ? 1 : 0) << 19) + ((class98.field1775 ? 1 : 0) << 16) + ((class240.field4136 ? 1 : 0) << 13) + (((class11.field167 & 0x3) << 11) + ((class273.field4826 ? 1 : 0) << 10) + ((class180.field3093 ? 1 : 0) << 9) + ((class214.field3762 ? 1 : 0) << 6) + ((class31.field475 ? 1 : 0) << 5) + ((class3.field38 & 0x7) - -((class24.field351 ? 1 : 0) << 3)) - (-((class236.field4084 ? 1 : 0) << 4) + -((class95.field1735 ? 1 : 0) << 7) - (((class25.field396 ? 1 : 0) << 8) + ((class194.field3308 ? 1 : 0) << 15) - -(class177.field3028 & 0x3 << 17) - -((class85.field1565 == 0 ? 0 : 1) << 20))) - -((class182.field3109 == 0 ? 0 : 1) << 22));
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static final void method890(int arg0) {
        class51.field895 = arg0;
        field2323++;
        class241.field4151 = 0;
        class79.method546(-923);
        class8.method38((byte) -4);
        class197.method1344(61);
        class234.method1567(-100);
        for (int var1 = 0; var1 < class51.field895; var1++) {
            int var3 = class5.field61[var1];
            if (class151.field2555 != class249.field4291[var3].field1009) {
                if (class249.field4291[var3].field795 > 0) {
                    class190.method1308(class249.field4291[var3], (byte) 126);
                }
                class249.field4291[var3] = null;
            }
        }
        if (class85.field1593 != class189.field3249.field4224) {
            throw new RuntimeException("gpp1 pos:" + class189.field3249.field4224 + " psize:" + class85.field1593);
        }
        for (int var2 = 0; var2 < class196.field3375; var2++) {
            if (class249.field4291[class151.field2556[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class196.field3375);
            }
        }
    }
}
