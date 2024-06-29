import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class354 {

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "J")
    public static long field5078;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Leh;")
    public static class246 field5079;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Ldu;")
    public static class242 field5080;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field5077;

    static {
        new class530("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
        field5078 = 0L;
        field5079 = new class246(98, 0);
        field5080 = new class242(9, 16);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 5)
    public static void method2092(int arg0) {
        int var1 = -91 / ((23 - arg0) / 36);
        field5079 = null;
        field5080 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)Z", line = 16)
    public static final boolean method2093(boolean arg0, int arg1) {
        if (arg0) {
            field5080 = null;
        }
        field5076++;
        return arg1 == 6 || arg1 == 8;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)Lbd;", line = 42)
    public static final class45 method2094(int arg0, byte arg1, int arg2) {
        field5075++;
        class45 var3 = (class45) class197.field2802.method2405((long) arg2 << 32 | (long) arg0, -109);
        if (var3 == null) {
            var3 = new class45(arg2, arg0);
            class197.field2802.method2413(var3.field7060, var3, -1);
        }
        if (arg1 >= -13) {
            field5078 = 16L;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)[Lnl;", line = 62)
    public static final class392[] method2095(int arg0) {
        if (class389.field5475 == null) {
            class392[] var1 = class250.method1627((byte) -122, class268.field3914);
            class392[] var2 = new class392[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var4 < var1.length; var4++) {
                class392 var8 = var1[var4];
                if ((var8.field5508 <= 0 || var8.field5508 >= 24) && var8.field5509 >= 800 && var8.field5510 >= 600 && (class494.field6991 >= 96 || class405.field5737 != 0 || var8.field5509 <= 1024 && var8.field5510 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class392 var10 = var2[var9];
                        if (var8.field5509 == var10.field5509 && var8.field5510 == var10.field5510) {
                            if (var8.field5508 > var10.field5508) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class389.field5475 = new class392[var3];
            class182.method1140(var2, 0, class389.field5475, 0, var3);
            int[] var5 = new int[class389.field5475.length];
            for (int var6 = 0; var6 < class389.field5475.length; var6++) {
                class392 var7 = class389.field5475[var6];
                var5[var6] = var7.field5510 * var7.field5509;
            }
            class183.method1144(class389.field5475, arg0 - 15343, var5);
        }
        if (arg0 == 15343) {
            field5077++;
            return class389.field5475;
        } else {
            return null;
        }
    }
}
