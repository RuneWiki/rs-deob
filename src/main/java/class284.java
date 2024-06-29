import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class284 {

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public int field4941 = -1;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Loa;")
    private static class99 field4934 = class221.method1463(2844, "Loaded fonts");

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "[Lch;")
    public static class284[] field4935 = new class284[4];

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Loa;")
    public static class99 field4933 = field4934;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "Loa;")
    public static class99 field4943 = class221.method1463(2844, "d-Broulement:");

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public int field4932;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public int field4936;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public int field4939;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public int field4944;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public int field4946;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public int field4947;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public int field4948;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public int field4949;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Z")
    public static boolean field4937;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method1857(int arg0) {
        field4935 = null;
        field4934 = null;
        field4933 = null;
        if (arg0 == 0) {
            field4943 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBIILed;)V")
    public static final void method1858(int arg0, byte arg1, int arg2, int arg3, class183 arg4) {
        field4950++;
        int var5 = -105 / ((-arg1 - 62) / 39);
        if (class168.field3006 == arg4 || class258.field4497 >= 400) {
            return;
        }
        class99 var11;
        if (arg4.field3210 == 0) {
            boolean var6 = true;
            if (class168.field3006.field3218 != -1 && arg4.field3218 != -1) {
                int var7 = class168.field3006.field3252 <= arg4.field3252 ? arg4.field3252 : class168.field3006.field3252;
                int var8 = class168.field3006.field3218 < arg4.field3218 ? class168.field3006.field3218 : arg4.field3218;
                int var9 = var7 * 10 / 100 + var8 + 5;
                int var10 = class168.field3006.field3252 - arg4.field3252;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > var9) {
                    var6 = false;
                }
            }
            if (arg4.field3252 >= arg4.field3235) {
                var11 = class198.method1332(121, new class99[] { arg4.method1257((byte) 105), var6 ? class174.method1166(class168.field3006.field3252, false, arg4.field3252) : class58.field969, class100.field1712, class210.field3652, class198.method1333(-115, arg4.field3252), class31.field558 });
            } else {
                var11 = class198.method1332(122, new class99[] { arg4.method1257((byte) 96), var6 ? class174.method1166(class168.field3006.field3252, false, arg4.field3252) : class58.field969, class100.field1712, class210.field3652, class198.method1333(-98, arg4.field3252), class260.field4554, class198.method1333(-108, arg4.field3235 - arg4.field3252), class31.field558 });
            }
        } else {
            var11 = class198.method1332(54, new class99[] { arg4.method1257((byte) 60), class100.field1712, class63.field1067, class198.method1333(-102, arg4.field3210), class31.field558 });
        }
        if (class150.field2647 == 1) {
            class173.method1163(class258.field4503, class198.method1332(118, new class99[] { class63.field1074, class185.field3287, var11 }), arg0, (short) 59, 110, arg2, (long) arg3);
            class132.field2317++;
        } else if (!class54.field896) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class183.field3227[var12] != null) {
                    class180.field3144++;
                    short var13 = 0;
                    if (class34.field613 == 0 && class183.field3227[var12].method706(class199.field3461, 124)) {
                        if (class168.field3006.field3252 < arg4.field3252) {
                            var13 = 2000;
                        }
                        if (class168.field3006.field3226 != 0 && arg4.field3226 != 0) {
                            if (class168.field3006.field3226 == arg4.field3226) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class54.field897[var12]) {
                        var13 = 2000;
                    }
                    boolean var14 = false;
                    short var15 = class192.field3373[var12];
                    short var16 = (short) (var13 + var15);
                    class173.method1163(class183.field3227[var12], class198.method1332(69, new class99[] { class58.field969, var11 }), arg0, var16, 98, arg2, (long) arg3);
                }
            }
        } else if ((class33.field592 & 0x8) == 8) {
            class230.field3979++;
            class173.method1163(class169.field3018, class198.method1332(76, new class99[] { class93.field1562, class185.field3287, var11 }), arg0, (short) 37, 119, arg2, (long) arg3);
        }
        for (int var17 = 0; var17 < class258.field4497; var17++) {
            if (class258.field4502[var17] == 33) {
                class122.field2147[var17] = class198.method1332(107, new class99[] { class58.field969, var11 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZZ)V")
    public static final void method1859(boolean arg0, boolean arg1) {
        field4940++;
        if (arg1) {
            return;
        }
        for (class80 var2 = (class80) class93.field1568.method529(10); var2 != null; var2 = (class80) class93.field1568.method533(119)) {
            if (var2.field1425 != null) {
                class165.field2899.method1076(var2.field1425);
                var2.field1425 = null;
            }
            if (var2.field1402 != null) {
                class165.field2899.method1076(var2.field1402);
                var2.field1402 = null;
            }
            var2.method828((byte) 124);
        }
        if (!arg0) {
            return;
        }
        for (class80 var3 = (class80) class111.field2002.method529(10); var3 != null; var3 = (class80) class111.field2002.method533(-111)) {
            if (var3.field1425 != null) {
                class165.field2899.method1076(var3.field1425);
                var3.field1425 = null;
            }
            var3.method828((byte) -31);
        }
        for (class80 var4 = (class80) class220.field3831.method1552(109); var4 != null; var4 = (class80) class220.field3831.method1549(91)) {
            if (var4.field1425 != null) {
                class165.field2899.method1076(var4.field1425);
                var4.field1425 = null;
            }
            var4.method828((byte) 122);
        }
    }
}
