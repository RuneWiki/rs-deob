import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class178 {

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "Lmb;")
    public static class96 field3075 = null;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Lmb;")
    private static class96 field3086 = class243.method1708("Loading wordpack )2 ", (byte) 92);

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "Lmb;")
    public static class96 field3084 = class243.method1708("Cabbage", (byte) 127);

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Lmb;")
    public static class96 field3079 = field3086;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "Lmb;")
    public static class96 field3087 = class243.method1708("", (byte) 94);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Lle;")
    public static class110 field3085;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Lce;")
    public static class111 field3083;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Lff;")
    public static class3 field3077;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)I")
    public static final int method1267(int arg0, byte arg1) {
        field3076++;
        if (arg1 <= 68) {
            method1270(3, -94, false, 28, -16);
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lmb;Z)I")
    public static final int method1268(class96 arg0, boolean arg1) {
        field3074++;
        if (arg1) {
            return 28;
        }
        for (int var2 = 0; var2 < class133.field2390.length; var2++) {
            if (class133.field2390[var2].method679(arg0, 18452)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static final void method1269(int arg0) {
        int var1 = 9 % ((arg0 - 43) / 54);
        field3081++;
        class2.method8((byte) -128);
        class183.method1288(0);
        class140.method1042((byte) -74);
        class276.method1866(false);
        class268.method1834(true);
        class77.method554(2047);
        class11.method95(true);
        class79.method562(121);
        class82.method577(47);
        class222.method1527(64);
        class237.method1614(17319436);
        class74.method535(256000);
        class154.method1127((byte) -51);
        class253.method1764(124);
        ((class114) class240.field4167).method889(-95);
        class57.field1004.method160((byte) 71);
        class68.field1189.method25(0);
        class229.field3922.method25(0);
        class39.field685.method25(0);
        field3077.method25(0);
        class92.field1523.method25(0);
        class181.field3155.method25(0);
        class236.field4058.method25(0);
        class103.field1735.method25(0);
        class122.field2265.method25(0);
        class97.field1634.method25(0);
        class212.field3660.method25(0);
        class265.field4633.method83(0);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIZII)V")
    public static final void method1270(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (client.field1994 <= arg4 && class9.field149 >= arg4) {
            int var5 = class268.method1841(class162.field2884, class9.field145, 0, arg3);
            int var6 = class268.method1841(class162.field2884, class9.field145, 0, arg0);
            class231.method1577(var5, arg4, arg1, var6, 8);
        }
        field3082++;
        if (arg2) {
            method1268((class96) null, true);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static void method1271(byte arg0) {
        field3084 = null;
        field3085 = null;
        if (arg0 >= -19) {
            field3087 = null;
        }
        field3086 = null;
        field3083 = null;
        field3079 = null;
        field3075 = null;
        field3087 = null;
        field3077 = null;
    }
}
