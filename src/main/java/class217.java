import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class217 extends class41 {

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "Loa;")
    public static class99 field3774 = class221.method1463(2844, "Veuillez patienter )2 tentative de r-Btablissement)3");

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field3773 = 0;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "Loa;")
    private static class99 field3776 = class221.method1463(2844, "Ok");

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "Loa;")
    public static class99 field3771 = field3776;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "Loa;")
    public static class99 field3767 = class221.method1463(2844, "cross");

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "[I")
    public static int[] field3766;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIII)V")
    public static final void method1447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3768++;
        if (arg4 <= 94) {
            method1449(true, -29, (class99) null);
        }
        int var6 = class166.method1127(class137.field2414, arg5, class178.field3101, 8946);
        int var7 = class166.method1127(class137.field2414, arg1, class178.field3101, 8946);
        int var8 = class166.method1127(class79.field1395, arg0, class197.field3437, 8946);
        int var9 = class166.method1127(class79.field1395, arg2, class197.field3437, 8946);
        for (int var10 = var6; var10 <= var7; var10++) {
            class175.method1174(class124.field2177[var10], arg3, -7, var8, var9);
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V")
    public static void method1448(byte arg0) {
        field3776 = null;
        field3767 = null;
        field3774 = null;
        field3766 = null;
        if (arg0 <= 33) {
            field3771 = null;
        }
        field3771 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZILoa;)V")
    public static final void method1449(boolean arg0, int arg1, class99 arg2) {
        field3772++;
        if (!arg0) {
            method1449(true, -107, (class99) null);
        }
        class99 var3 = arg2.method662((byte) 36).method690(84);
        boolean var4 = false;
        for (int var5 = 0; var5 < class190.field3342; var5++) {
            class183 var6 = class259.field4515[class105.field1765[var5]];
            if (var6 != null && var6.field3224 != null && var6.field3224.method706(var3, 114)) {
                class95.method637(0, 0, 1, 0, 2, var6.field1317[0], 1, class168.field3006.field1259[0], var6.field1259[0], 2, false, class168.field3006.field1317[0]);
                if (arg1 == 1) {
                    class131.field2277.method966((byte) 49, 72);
                    class171.field3037++;
                    class131.field2277.method1726(599500008, class105.field1765[var5]);
                } else if (arg1 == 4) {
                    class131.field2277.method966((byte) 49, 230);
                    class76.field1337++;
                    class131.field2277.method1697(class105.field1765[var5], -94);
                } else if (arg1 == 5) {
                    class268.field4717++;
                    class131.field2277.method966((byte) 49, 219);
                    class131.field2277.method1745(class105.field1765[var5], (byte) 5);
                } else if (arg1 == 6) {
                    class131.field2277.method966((byte) 49, 136);
                    class227.field3924++;
                    class131.field2277.method1726(599500008, class105.field1765[var5]);
                } else if (arg1 == 7) {
                    class131.field2277.method966((byte) 49, 130);
                    class284.field4942++;
                    class131.field2277.method1723(class105.field1765[var5], 25009);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class259.method1678(class20.field234, class198.method1332(118, new class99[] { class237.field4097, var3 }), (byte) -126, 0);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ltg;Ltg;Ltg;I)V")
    public static final void method1450(class182 arg0, class182 arg1, class182 arg2, int arg3) {
        client.field2774 = arg1;
        class207.field3576 = arg2;
        field3770++;
        int var4 = 40 % ((-arg3 - 10) / 45);
        class54.field878 = arg0;
    }
}
