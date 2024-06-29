import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class232 {

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3514 = "glow3:";

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Lhc;")
    public static class235 field3510;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1530(int arg0);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static final void method1531(byte arg0) {
        int var1 = -18 % ((-arg0 - 45) / 49);
        class160.field2244.method546(-90762264);
        class57.field819.method546(-90762264);
        field3512++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public static void method1532(boolean arg0) {
        field3514 = null;
        field3510 = null;
        if (!arg0) {
            field3509 = -105;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([BI)V")
    public abstract void method1533(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lol;B)V")
    public static final void method1534(class215 arg0, byte arg1) {
        field3513++;
        int var2 = -1;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field3243 == 0) {
            var3 = class140.method945(arg0.field3242, arg0.field3230, arg0.field3232);
        }
        int var7 = -109 / ((59 - arg1) / 61);
        if (arg0.field3243 == 1) {
            var3 = class33.method223(arg0.field3242, arg0.field3230, arg0.field3232);
        }
        if (arg0.field3243 == 2) {
            var3 = class176.method1156(arg0.field3242, arg0.field3230, arg0.field3232);
        }
        if (arg0.field3243 == 3) {
            var3 = class69.method431(arg0.field3242, arg0.field3230, arg0.field3232);
        }
        if (var3 != 0L) {
            var6 = ((int) var3 & 0x32DC5B) >> 20;
            var5 = ((int) var3 & 0x7C4AD) >> 14;
            var2 = Integer.MAX_VALUE & (int) (var3 >>> 32);
        }
        arg0.field3235 = var2;
        arg0.field3241 = var6;
        arg0.field3238 = var5;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public static final void method1535(int arg0) {
        class293.field4601 = 0;
        field3511++;
        class242.field3711 = 0;
        class286.method1922(-4232);
        class39.method259(3);
        class288.method1939(-32637);
        class171.method1121(0);
        for (int var1 = 0; var1 < class293.field4601; var1++) {
            int var3 = class74.field1041[var1];
            if (class52.field740 != class154.field2133[var3].field4090) {
                if (class154.field2133[var3].field1202 > 0) {
                    class73.method460((byte) 125, class154.field2133[var3]);
                }
                class154.field2133[var3] = null;
            }
        }
        if (class105.field1460 != class233.field3518.field3402) {
            throw new RuntimeException("gpp1 pos:" + class233.field3518.field3402 + " psize:" + class105.field1460);
        }
        int var2 = 0;
        if (arg0 >= -17) {
            method1535(-126);
        }
        while (var2 < class103.field1442) {
            if (class154.field2133[class205.field2848[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class103.field1442);
            }
            var2++;
        }
    }
}
