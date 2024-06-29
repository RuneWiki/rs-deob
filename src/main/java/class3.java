import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "[I")
    public static int[] field40 = new int[1];

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field42 = 0;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "[I")
    public static int[] field44 = new int[4];

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field43 = 0;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "Lbt;")
    public static class48 field39;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)V")
    public static void method96(boolean arg0) {
        if (!arg0) {
            field42 = 49;
        }
        field40 = null;
        field39 = null;
        field44 = null;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILha;)V")
    public static final void method97(int arg0, class66 arg1) {
        field38++;
        if (!(class245.field2894 >= 2 || class104.field1336) || class634.field8654 != null) {
            return;
        }
        if (arg0 != 14325) {
            field42 = 16;
        }
        String var2;
        if (class104.field1336 && class245.field2894 < 2) {
            var2 = class535.field7539 + class637.field8707.method3584(class770.field10592, true) + class481.field6718 + " ->";
        } else if (class45.field603 && class348.field4350.method216(-93, 81) && class245.field2894 > 2) {
            var2 = class209.method1320(class748.field10391, -5);
        } else {
            class75 var3 = class748.field10391;
            if (var3 == null) {
                return;
            }
            var2 = class209.method1320(var3, -17);
            int[] var4 = null;
            if (class174.method1177(20, var3.field1029)) {
                var4 = class121.field1555.method2882((int) var3.field1027, arg0 ^ 0xFFFF9E4C).field4245;
            } else if (var3.field1032 != -1) {
                var4 = class121.field1555.method2882(var3.field1032, -22087).field4245;
            } else if (class247.method1488((byte) 79, var3.field1029)) {
                class273 var7 = (class273) class30.field444.method2121(100, (long) ((int) var3.field1027));
                if (var7 != null) {
                    class388 var8 = var7.field3210;
                    class479 var9 = var8.field5003;
                    if (var9.field6636 != null) {
                        var9 = var9.method2843(class2.field30, 228);
                    }
                    if (var9 != null) {
                        var4 = var9.field6677;
                    }
                }
            } else if (class501.method2975(var3.field1029, (byte) 118)) {
                Object var5 = null;
                class174 var6;
                if (var3.field1029 == 1011) {
                    var6 = class379.field4811.method4192(27324, (int) var3.field1027);
                } else {
                    var6 = class379.field4811.method4192(27324, (int) (var3.field1027 >>> 32 & 0x7FFFFFFFL));
                }
                if (var6.field2157 != null) {
                    var6 = var6.method1178(false, class2.field30);
                }
                if (var6 != null) {
                    var4 = var6.field2142;
                }
            }
            if (var4 != null) {
                var2 = var2 + class686.method3839(arg0 - 14325, var4);
            }
        }
        if (class245.field2894 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class245.field2894 - 2) + class637.field8700.method3584(class770.field10592, true);
        }
        if (class659.field9061 != null) {
            class67 var10 = class659.field9061.method3523((byte) 92, arg1);
            if (var10 == null) {
                var10 = class452.field6380;
            }
            var10.method654((byte) 67, class256.field3026, class338.field4187, class659.field9061.field8416, class659.field9061.field8406, class659.field9061.field8407, class375.field4701, class503.field7114, var2, class659.field9061.field8340, class659.field9061.field8480, class326.field4044, class644.field8774, class61.field821, class659.field9061.field8506);
            class181.method1214(2740, class375.field4701[3], class375.field4701[0], class375.field4701[1], class375.field4701[2]);
        } else if (class213.field2516 != null && class672.field9229 == class359.field4463) {
            int var11 = class452.field6380.method669(0, class398.field5199 + 16, class644.field8774, class256.field3026, 96, var2, 16777215, class503.field7114, class37.field555 + 4, class338.field4187);
            class181.method1214(arg0 ^ 0x3D41, 16, class37.field555 + 4, class398.field5199, var11 + class332.field4108.method1819(var2, (byte) -14));
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Loia;B)V")
    public static final void method98(class97 arg0, byte arg1) {
        if (arg0.field1285 != null) {
            arg0.field1285.field8104 = 0;
        }
        arg0.field1287 = false;
        field37++;
        if (arg1 >= 20) {
            for (class97 var2 = arg0.method745(); var2 != null; var2 = arg0.method763()) {
                method98(var2, (byte) 22);
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
    public static final void method99(int arg0, int arg1) {
        class375.field4709 = new int[arg0];
        field41++;
        if (arg1 < 123) {
            field42 = -90;
        }
        class473.field6599 = new int[arg0];
        class789.field10869 = new int[arg0];
        class353.field4383 = new int[arg0];
        class450.field6371 = new int[arg0];
    }
}
