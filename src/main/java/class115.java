import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class115 {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field2067 = 0;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field2068 = 0;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field2070 = 0;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field2066 = 0;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Lia;")
    public static class257 field2078 = class28.method234(-10, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field2080 = 0;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public int field2069;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public int field2071;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public int field2076;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "J")
    public long field2079;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Lij;")
    public class166 field2075;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Lvb;")
    public static class226 field2072;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILme;)Lme;")
    public static final class44 method820(int arg0, class44 arg1) {
        field2073++;
        if (arg0 != -2154) {
            return null;
        }
        class44 var2 = client.method579(arg1);
        if (var2 == null) {
            var2 = arg1.field862;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method821(int arg0) {
        if (arg0 != 1476) {
            field2078 = null;
        }
        field2078 = null;
        field2072 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IJ)V")
    public static final void method822(int arg0, long arg1) {
        field2077++;
        if (arg1 == 0L) {
            return;
        }
        class117.field2098++;
        class205.field3524.method908(false, 33);
        class205.field3524.method1044(false, arg1);
        if (arg0 != 0) {
            method821(14);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILia;ILia;ILia;)V")
    public static final void method823(int arg0, class257 arg1, int arg2, class257 arg3, int arg4, class257 arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class38.field762[var6] = class38.field762[var6 - 1];
            class68.field1362[var6] = class68.field1362[var6 - 1];
            class129.field2303[var6] = class129.field2303[var6 - 1];
            class87.field1689[var6] = class87.field1689[var6 - 1];
            class53.field1146[var6] = class53.field1146[var6 - 1];
        }
        class38.field762[0] = arg2;
        class68.field1362[0] = arg1;
        class129.field2303[0] = arg3;
        field2065++;
        class87.field1689[0] = arg5;
        class89.field1703++;
        int var7 = 83 % ((-arg4 - 45) / 54);
        class137.field2458 = class111.field2038;
        class53.field1146[0] = arg0;
    }
}
