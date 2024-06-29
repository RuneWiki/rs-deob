import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class253 {

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Lfl;")
    public static class80 field4140 = new class80();

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4145 = null;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Lvh;")
    public static class108 field4144;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Z")
    public static boolean field4142;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method1674(int arg0) {
        if (arg0 > -55) {
            field4146 = 52;
        }
        field4145 = null;
        field4144 = null;
        field4140 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)V")
    public static final void method1675(int arg0, int arg1) {
        class79.field1362.method63(0, arg1);
        if (arg0 == -29529) {
            class274.field4390.method63(0, arg1);
            field4141++;
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
    public static final void method1676(int arg0) {
        if (arg0 != -25034) {
            method1676(-114);
        }
        for (class66 var1 = (class66) class63.field1092.method379(6347); var1 != null; var1 = (class66) class63.field1092.method378(88)) {
            class177 var2 = var1.field1102;
            if (class176.field2886 != var2.field2905 || var2.field2908) {
                var1.method547(10026);
            } else if (class266.field4301 >= var2.field2910) {
                var2.method1175((byte) 26, class191.field3087);
                if (var2.field2908) {
                    var1.method547(10026);
                } else {
                    class121.method823(var2.field2905, var2.field2904, var2.field2926, var2.field2916, 60, var2, 0, -1L, false);
                }
            }
        }
        field4139++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V")
    public static final void method1677(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class193.field3126; var3++) {
            for (int var4 = 0; var4 < class191.field3084; var4++) {
                for (int var5 = 0; var5 < class277.field4439; var5++) {
                    class109 var6 = class79.field1367[var3][var4][var5];
                    if (var6 != null) {
                        class212 var7 = var6.field1957;
                        if (var7 != null && var7.field3572.method1209()) {
                            class124.method850(var7.field3572, var3, var4, var5, 1, 1);
                            if (var7.field3575 != null && var7.field3575.method1209()) {
                                class124.method850(var7.field3575, var3, var4, var5, 1, 1);
                                var7.field3572.method1206(var7.field3575, 0, 0, 0, false);
                                var7.field3575 = var7.field3575.method1210(arg0, arg1, arg2);
                            }
                            var7.field3572 = var7.field3572.method1210(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1968; var8++) {
                            class173 var10 = var6.field1961[var8];
                            if (var10 != null && var10.field2842.method1209()) {
                                class124.method850(var10.field2842, var3, var4, var5, var10.field2855 + 1 - var10.field2840, var10.field2843 - var10.field2839 + 1);
                                var10.field2842 = var10.field2842.method1210(arg0, arg1, arg2);
                            }
                        }
                        class11 var9 = var6.field1978;
                        if (var9 != null && var9.field158.method1209()) {
                            class87.method570(var9.field158, var3, var4, var5);
                            var9.field158 = var9.field158.method1210(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)Ljava/lang/String;")
    public static final String method1678(int arg0) {
        if (arg0 < 64) {
            return null;
        }
        String var1;
        if (class183.field2976 == 1 && class275.field4399 < 2) {
            var1 = class45.field631 + class42.field618 + class258.field4208 + " ->";
        } else if (class76.field1241 && class275.field4399 < 2) {
            var1 = class6.field67 + class42.field618 + field4145 + " ->";
        } else if (class119.field2117 && class12.field169[81] && class275.field4399 > 2) {
            var1 = class245.method1639((byte) 43, class275.field4399 - 2);
        } else {
            var1 = class245.method1639((byte) -96, class275.field4399 - 1);
        }
        field4143++;
        if (class275.field4399 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class275.field4399 - 2) + class134.field2323;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static final void method1679(byte arg0) {
        field4138++;
        class110.field1983 = null;
        class199.field3226 = null;
        if (arg0 < -65) {
            class12.field168 = null;
            class54.field941 = null;
            class213.field3588 = null;
            class112.field2028 = null;
        }
    }
}
