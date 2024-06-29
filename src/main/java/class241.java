import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class241 {

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Lbe;")
    public static class283 field4063 = class153.method941(-66, "VOLL");

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Lbe;")
    public static class283 field4066 = class153.method941(127, ")4l=");

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field4067 = 0;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "Lbe;")
    public static class283 field4071 = class153.method941(-91, ")2");

    @OriginalMember(owner = "client!u", name = "d", descriptor = "[Lid;")
    public static class245[] field4062 = new class245[6];

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field4073 = 0;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field4074 = -1;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Lwc;")
    public static class96 field4068 = new class96(5000);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1620(int arg0) {
        field4065++;
        class82.field1397 = class190.field3254;
        class89.method578((byte) 122, false);
        class12.method61((byte) 36);
        class24.method172(class82.field1397, 0);
        class213.field3624 = new class191();
        class213.field3624.field1210 = 3000;
        class213.field3624.field1193 = 3000;
        if (class26.field377 == 2) {
            class214.field3637 = class252.field4283 - 48;
            class116.field1976 = class252.field4283 * 128 + 64 - (class214.field3637 * 128);
            class107.field1833 = class192.field3296 - 48;
            class135.field2273 = class192.field3296 * 128 + 64 - class107.field1833 * 128;
            class192.field3296 = class135.field2273 >> 7;
            class252.field4283 = class116.field1976 >> 7;
        } else {
            class38.method238(true);
        }
        class277.method1856(true);
        class58.method381(29744);
        class77.method506(arg0, -30354);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V", line = 46)
    public static void method1621(int arg0) {
        field4062 = null;
        field4066 = null;
        field4068 = null;
        if (arg0 != -19339) {
            field4067 = 127;
        }
        field4063 = null;
        field4071 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lca;B)V", line = 68)
    public static final void method1622(class91 arg0, byte arg1) {
        field4060++;
        long var2 = 0L;
        if (arg0.field1545 == 0) {
            var2 = class288.method1972(arg0.field1535, arg0.field1540, arg0.field1531);
        }
        if (arg1 > -110) {
            return;
        }
        if (arg0.field1545 == 1) {
            var2 = class177.method1170(arg0.field1535, arg0.field1540, arg0.field1531);
        }
        if (arg0.field1545 == 2) {
            var2 = class184.method1214(arg0.field1535, arg0.field1540, arg0.field1531);
        }
        if (arg0.field1545 == 3) {
            var2 = class263.method1783(arg0.field1535, arg0.field1540, arg0.field1531);
        }
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (var2 != 0L) {
            var5 = ((int) var2 & 0x7CC95) >> 14;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var6 = ((int) var2 & 0x379B59) >> 20;
        }
        arg0.field1536 = var4;
        arg0.field1532 = var5;
        arg0.field1539 = var6;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIJI)Z", line = 120)
    public static final boolean method1623(int arg0, int arg1, long arg2, int arg3) {
        int var5 = (int) arg2 >> 14 & 0x1F;
        int var6 = (int) arg2 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class281 var8 = class254.method1722(0, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field4754;
                var10 = var8.field4727;
            } else {
                var9 = var8.field4727;
                var10 = var8.field4754;
            }
            int var11 = var8.field4686;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class53.method335(class213.field3624.field1150[0], var10, 0, 1, class213.field3624.field1178[0], arg0, arg3, var11, true, 0, 2, var9);
        } else {
            class53.method335(class213.field3624.field1150[0], 0, var5 + 1, 1, class213.field3624.field1178[0], arg0, arg3, 0, true, var6, 2, 0);
        }
        class273.field4588 = 2;
        field4059++;
        class140.field2339 = arg1;
        class90.field1527 = class269.field4537;
        class222.field3735 = class47.field647;
        return true;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V", line = 166)
    public static final void method1624(int arg0) {
        class291.field4930.method1636(125);
        field4072++;
        int var1 = -54 % ((25 - arg0) / 45);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 179)
    public static final void method1625(byte arg0) {
        field4069++;
        try {
            if (arg0 != 124) {
                field4064 = -21;
            }
            if (class58.field796 == null) {
                class58.field796 = new class150(class150.field2460, class299.method2022(new class283[] { class86.method556(arg0 ^ 0xFFFFFFE7), class114.field1916 }, (byte) 22).method1911(-27527));
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class58.field796 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)V", line = 205)
    public static final void method1626(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4061++;
        if (arg4 != -14702) {
            method1623(51, -53, 94L, 14);
        }
        for (int var5 = 0; var5 < class217.field3686; var5++) {
            if ((class3.field32[var5] + class288.field4895[var5]) > arg1 && (arg1 + arg2) > class288.field4895[var5] && (class70.field1209[var5] + class62.field861[var5]) > arg3 && class62.field861[var5] < (arg3 + arg0)) {
                class69.field1147[var5] = true;
            }
        }
    }
}
