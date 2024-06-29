import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class196 extends class194 {

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public int field3438 = 0;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    public int field3456 = -1;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "Lqk;")
    public static class207 field3446 = class24.method212(255, "<col=ffff00>");

    @OriginalMember(owner = "client!t", name = "z", descriptor = "[I")
    public static int[] field3449 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public static int field3452 = 3353893;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "Lqk;")
    public static class207 field3453 = class24.method212(255, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!t", name = "F", descriptor = "Lqk;")
    public static class207 field3455 = class24.method212(255, "Cabbage");

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public int field3439;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public int field3442;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public int field3445;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public int field3447;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public int field3448;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    public int field3450;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    public int field3451;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    public int field3454;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    public int field3458;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "I")
    public int field3459;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public static final void method1360(int arg0) {
        field3457++;
        int var1 = 123 % ((arg0 - 79) / 39);
        if (class52.field1000 != null) {
            class182.method1287(0, class52.field1000);
            class52.field1000 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(Z)V")
    public static void method1361(boolean arg0) {
        field3449 = null;
        field3453 = null;
        field3446 = null;
        field3455 = null;
        if (arg0) {
            method1365(-4);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BLv;)V")
    public static final void method1362(byte arg0, class149 arg1) {
        field3441++;
        if (arg1.field2568.length - arg1.field2593 < 1) {
            return;
        }
        int var2 = arg1.method1045((byte) 126);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg1.field2568.length - arg1.field2593 < var3) {
            return;
        }
        class116.field2013 = arg1.method1045((byte) -127);
        if (class116.field2013 < 1) {
            class116.field2013 = 1;
        } else if (class116.field2013 > 4) {
            class116.field2013 = 4;
        }
        class125.method882(42, arg1.method1045((byte) 84) == 1);
        class256.field4585 = arg1.method1045((byte) 127) == 1;
        class278.field4884 = arg1.method1045((byte) 127) == 1;
        class247.field4476 = arg1.method1045((byte) -115) == 1;
        class10.field139 = arg1.method1045((byte) 123) == 1;
        client.field2694 = arg1.method1045((byte) -54) == 1;
        class261.field4655 = arg1.method1045((byte) 124) == 1;
        class230.field4214 = arg1.method1045((byte) -126) == 1;
        class231.field4238 = arg1.method1045((byte) -47);
        if (class231.field4238 > 2) {
            class231.field4238 = 2;
        }
        if (var2 >= 2) {
            class287.field5125 = arg1.method1045((byte) -26) == 1;
        } else {
            class287.field5125 = arg1.method1045((byte) 106) == 1;
            arg1.method1045((byte) 80);
        }
        class120.field2087 = arg1.method1045((byte) -111) == 1;
        class85.field1545 = arg1.method1045((byte) 117) == 1;
        class47.field938 = arg1.method1045((byte) -56);
        if (class47.field938 > 2) {
            class47.field938 = 2;
        }
        class65.field1182 = class47.field938;
        class190.field3348 = arg1.method1045((byte) 115) == 1;
        class32.field653 = arg1.method1045((byte) -113);
        if (class32.field653 > 127) {
            class32.field653 = 127;
        }
        class123.field2125 = arg1.method1045((byte) -66);
        class167.field2927 = arg1.method1045((byte) 103);
        if (class167.field2927 > 127) {
            class167.field2927 = 127;
        }
        if (var2 >= 1) {
            class40.field806 = arg1.method1050(arg0 ^ 0x4BD14794);
            class13.field196 = arg1.method1050(1272006568);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1045((byte) 109);
        }
        if (var2 >= 4) {
            int var4 = arg1.method1045((byte) -24);
            if (class170.field3023 < 96) {
                var4 = 0;
            }
            class64.method463(var4);
        }
        if (var2 >= 5) {
            class173.field3094 = arg1.method1076(65280);
        }
        if (var2 >= 6) {
            class156.field2743 = arg1.method1045((byte) -124);
        }
        if (var2 >= 7) {
            class135.field2336 = arg1.method1045((byte) -100) == 1;
        }
        if (var2 >= 8) {
            class214.field3808 = arg1.method1045((byte) -91) == 1;
        }
        if (var2 >= 9) {
            class231.field4235 = arg1.method1045((byte) 98);
        }
        if (var2 >= 10) {
            class235.field4342 = arg1.method1045((byte) -105) != 0;
        }
        if (var2 >= 11) {
            class62.field1127 = arg1.method1045((byte) 81) != 0;
        }
        if (arg0 != 60) {
            method1364((class99) null, (class99) null, -54);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1363(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var6 = arg0 - arg2;
        int var7 = arg4 - arg1;
        field3440++;
        if (var6 == 0) {
            if (var7 != 0) {
                class283.method1923(arg2, arg4, true, arg1, arg3);
            }
        } else if (var7 == 0) {
            class220.method1563(arg3, arg0, arg2, -99, arg1);
        } else {
            int var8 = -71 % ((-arg5 - 31) / 48);
            int var9 = (var7 << 12) / var6;
            int var10 = arg1 - (arg2 * var9 >> 12);
            int var11;
            int var12;
            if (arg2 < class124.field2158) {
                var11 = var10 + (class124.field2158 * var9 >> 12);
                var12 = class124.field2158;
            } else if (arg2 > class88.field1599) {
                var11 = (class88.field1599 * var9 >> 12) + var10;
                var12 = class88.field1599;
            } else {
                var12 = arg2;
                var11 = arg1;
            }
            int var13;
            int var14;
            if (arg0 < class124.field2158) {
                var14 = class124.field2158;
                var13 = (class124.field2158 * var9 >> 12) + var10;
            } else if (arg0 <= class88.field1599) {
                var13 = arg4;
                var14 = arg0;
            } else {
                var13 = (class88.field1599 * var9 >> 12) + var10;
                var14 = class88.field1599;
            }
            if (class204.field3580 > var13) {
                var13 = class204.field3580;
                var14 = (class204.field3580 - var10 << 12) / var9;
            } else if (var13 > class204.field3602) {
                var14 = (class204.field3602 - var10 << 12) / var9;
                var13 = class204.field3602;
            }
            if (class204.field3580 > var11) {
                var11 = class204.field3580;
                var12 = (class204.field3580 - var10 << 12) / var9;
            } else if (var11 > class204.field3602) {
                var11 = class204.field3602;
                var12 = (class204.field3602 - var10 << 12) / var9;
            }
            class129.method903(0, var12, arg3, var14, var11, var13);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lpk;Lpk;I)I")
    public static final int method1364(class99 arg0, class99 arg1, int arg2) {
        int var3 = -115 / ((arg2 + 85) / 34);
        int var4 = 0;
        field3444++;
        if (arg0.method723(class217.field3854, true)) {
            var4++;
        }
        if (arg0.method723(class121.field2091, true)) {
            var4++;
        }
        if (arg0.method723(class199.field3491, true)) {
            var4++;
        }
        if (arg1.method723(class217.field3854, true)) {
            var4++;
        }
        if (arg1.method723(class121.field2091, true)) {
            var4++;
        }
        if (arg1.method723(class199.field3491, true)) {
            var4++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
    public static final void method1365(int arg0) {
        field3460++;
        int var1 = class182.field3250;
        int var2 = class132.field2279;
        int var3 = class214.field3806;
        int var4 = 6116423;
        int var5 = class17.field268;
        class23.method167(var1, var5, var2, var3, var4);
        class23.method167(var1 + 1, var5 + 1, var2 - 2, 16, 0);
        class23.method166(var1 + 1, var5 - -18, var2 - 2, var3 + -19, 0);
        class284.field4996.method1613(class83.field1533, var1 + 3, var5 + 14, var4, -1);
        int var6 = class268.field4747;
        int var7 = class20.field322;
        int var8 = 12 / ((-arg0 - 58) / 56);
        for (int var9 = 0; var9 < class268.field4751; var9++) {
            int var10 = var5 + ((class268.field4751 + -1 - var9) * 15) + 31;
            int var11 = 16777215;
            if (var7 > var1 && var1 + var2 > var7 && var10 - 13 < var6 && (var10 + 3) > var6) {
                var11 = 16776960;
            }
            class284.field4996.method1613(class244.method1718(var9, 0), var1 + 3, var10, var11, 0);
        }
        class140.method973(class132.field2279, class182.field3250, (byte) -63, class17.field268, class214.field3806);
    }
}
