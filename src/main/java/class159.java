import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class159 extends class110 {

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "I")
    public static int field2383 = 128;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
    public static int field2385 = -1;

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2386 = "Opened title screen";

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "(I)V", line = 4)
    public static final void method1125(int arg0) {
        field2384++;
        class247.method1666(class145.field2197, -128);
        class245.field3654++;
        if (class194.field2898 && class185.field2762) {
            int var1 = class237.field3557;
            int var2 = var1 - class283.field4282;
            if (class140.field2116 > var2) {
                var2 = class140.field2116;
            }
            int var3 = class132.field2036;
            int var4 = class145.field2197.field5024;
            if (arg0 != -28222) {
                field2382 = -34;
            }
            if ((class145.field2197.field4994 + var2) > (class140.field2116 + class189.field2819.field4994)) {
                var2 = class140.field2116 + class189.field2819.field4994 - class145.field2197.field4994;
            }
            int var5 = var2 - class236.field3541;
            int var6 = var3 - class315.field4762;
            int var7 = var2 + class189.field2819.field5023 - class140.field2116;
            if (class301.field4602 > var6) {
                var6 = class301.field4602;
            }
            if (class145.field2197.field5018 + var6 > class301.field4602 + class189.field2819.field5018) {
                var6 = class301.field4602 + class189.field2819.field5018 - class145.field2197.field5018;
            }
            int var8 = var6 - (class301.field4602 - class189.field2819.field5093);
            int var9 = var6 - class305.field4657;
            if (class245.field3654 > class145.field2197.field4993 && (var9 > var4 || var9 < (-var4) || var4 < var5 || var5 < -var4)) {
                class75.field973 = true;
            }
            if (class145.field2197.field5070 != null && class75.field973) {
                class286 var10 = new class286();
                var10.field4330 = class145.field2197;
                var10.field4310 = class145.field2197.field5070;
                var10.field4329 = var8;
                var10.field4327 = var7;
                class9.method39(var10, arg0 ^ 0xFFFF88B0);
            }
            if (class183.field2744 == 0) {
                if (class75.field973) {
                    if (class145.field2197.field4934 != null) {
                        class286 var11 = new class286();
                        var11.field4327 = var7;
                        var11.field4329 = var8;
                        var11.field4330 = class145.field2197;
                        var11.field4312 = class287.field4339;
                        var11.field4310 = class145.field2197.field4934;
                        class9.method39(var11, 6514);
                    }
                    if (class287.field4339 != null && client.method898(class145.field2197) != null) {
                        class234.field3507.method28(218, false);
                        class234.field3507.method1841(95, class145.field2197.field5040);
                        class130.field2018++;
                        class234.field3507.method1806(class287.field4339.field5086, 9897);
                        class234.field3507.method1815(85, class145.field2197.field5086);
                        class234.field3507.method1817(true, class287.field4339.field5040);
                    }
                } else if ((class226.field3439 == 1 || class291.method2035((byte) 74, class190.field2829 - 1)) && class190.field2829 > 2) {
                    class281.method1963(true);
                } else if (class190.field2829 > 0) {
                    class298.method2076(false);
                }
                class145.field2197 = null;
            }
        } else if (class245.field3654 > 1) {
            class145.field2197 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lgg;III)V", line = 124)
    public static final void method1126(class69 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field1549 == arg3 && arg3 != -1) {
            class272 var4 = class72.method468(arg3, 97);
            int var5 = var4.field4177;
            if (var5 == 1) {
                arg0.field1538 = arg1;
                arg0.field1519 = 0;
                arg0.field1496 = 1;
                arg0.field1487 = 0;
                arg0.field1486 = 0;
                class167.method1170(arg0.field1505, var4, arg0.field1486, -64, arg0.field1566, false);
            }
            if (var5 == 2) {
                arg0.field1519 = 0;
            }
        } else if (arg3 == -1 || arg0.field1549 == -1 || class72.method468(arg3, 110).field4158 >= class72.method468(arg0.field1549, -121).field4158) {
            arg0.field1538 = arg1;
            arg0.field1487 = 0;
            arg0.field1549 = arg3;
            arg0.field1519 = 0;
            arg0.field1486 = 0;
            arg0.field1569 = arg0.field1483;
            arg0.field1496 = 1;
            if (arg0.field1549 != -1) {
                class167.method1170(arg0.field1505, class72.method468(arg0.field1549, 11), arg0.field1486, -64, arg0.field1566, false);
            }
        }
        int var6 = -35 % ((-arg2 - 62) / 43);
        field2387++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 180)
    public static final String method1127(int arg0, byte arg1) {
        field2388++;
        int var2 = 16 / ((-arg1 - 9) / 53);
        return arg0 >= 999999999 ? "*" : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "(I)V", line = 194)
    public static void method1128(int arg0) {
        field2386 = null;
        int var1 = 41 / ((-arg0 - 9) / 34);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)[I", line = 203)
    public final int[] method46(int arg0, int arg1) {
        field2390++;
        if (arg0 != 1) {
            method1125(95);
        }
        return class249.field3714;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIB)V", line = 230)
    public static final void method1129(int arg0, int arg1, int arg2, byte arg3) {
        field2389++;
        String var4 = "::tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
        System.out.println(var4);
        if (arg3 < -90) {
            class160.method1133((byte) -82, var4);
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 246)
    public class159() {
        super(0, true);
    }
}
