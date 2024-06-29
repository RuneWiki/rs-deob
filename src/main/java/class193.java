import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class class193 {

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Z")
    public static boolean field3525 = true;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Lcf;")
    public static class93 field3536 = class147.method1066("hint_mapmarkers", -48);

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Lcf;")
    public static class93 field3537 = class147.method1066("www)2wtqa", -48);

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field3527 = 0;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Z")
    public static boolean field3539 = false;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field3542 = 1;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Lnh;")
    public static class54 field3524 = new class54(64);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public int field3526;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public int field3529;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public int field3533;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public int field3538;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public int field3541;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "[[[Lr;")
    public static class41[][][] field3543;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBI)I")
    public static final int method1381(int arg0, byte arg1, int arg2) {
        if (arg1 <= 106) {
            field3537 = null;
        }
        field3540++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
    public static final void method1382(int arg0, int arg1) {
        field3530++;
        int var2 = 54 % ((-arg1 - 16) / 54);
        class212 var3 = class123.method905(-1205364448, 11, arg0);
        var3.method1502(255);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILee;Lcf;)I")
    public static final int method1383(int arg0, class280 arg1, class93 arg2) {
        field3523++;
        int var3 = arg1.field5027;
        byte[] var4 = arg2.method642(20);
        arg1.method1929(126, var4.length);
        if (arg0 < 110) {
            method1383(-41, (class280) null, (class93) null);
        }
        arg1.field5027 += class37.field562.method693(-1795109117, arg1.field5027, var4.length, arg1.field5011, 0, var4);
        return arg1.field5027 - var3;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
    public abstract void method1234(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)V")
    public abstract void method1235(int arg0, int arg1);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static final void method1384(byte arg0) {
        field3528++;
        int var1 = class183.field3383.method1820(class11.field154);
        for (int var2 = 0; var2 < class253.field4549; var2++) {
            int var6 = class183.field3383.method1820(class3.method12(var2, arg0 - 14));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class253.field4549 * 15 + 21;
        if (arg0 != -42) {
            method1387(-43);
        }
        int var4 = class32.field508 - var1 / 2;
        int var5 = class178.field3145;
        if (var1 + var4 > class150.field2629) {
            var4 = class150.field2629 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if ((var3 + var5) > class169.field2968) {
            var5 = class169.field2968 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class7.field91 == 1) {
            if (class32.field508 == class110.field1884 && class77.field1441 == class178.field3145) {
                class58.field991 = true;
                class7.field91 = 0;
                class61.field1040 = var1;
                class147.field2584 = var5;
                class137.field2394 = var4;
                class266.field4739 = class253.field4549 * 15 + (class4.field48 ? 26 : 22);
            }
        } else if (class32.field508 == field3527 && class58.field992 == class178.field3145) {
            class266.field4739 = (class4.field48 ? 26 : 22) + class253.field4549 * 15;
            class7.field91 = 0;
            class147.field2584 = var5;
            class137.field2394 = var4;
            class58.field991 = true;
            class61.field1040 = var1;
        } else {
            class7.field91 = 1;
            class110.field1884 = field3527;
            class77.field1441 = class58.field992;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method1385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field3535++;
        if (arg1 < 128 || arg0 < 128 || arg1 > 13056 || arg0 > 13056) {
            class227.field4057 = -1;
            class156.field2766 = -1;
            return;
        }
        int var8 = class13.method56(arg0, arg1, (byte) 48, class138.field2405) - arg5;
        int var9 = var8 - class77.field1442;
        int var10 = class179.field3158[class198.field3602];
        int var11 = class179.field3155[class233.field4155];
        int var12 = arg0 - class165.field2919;
        int var13 = arg1 - class166.field2925;
        int var14 = class179.field3158[class233.field4155];
        int var15 = var11 * var12 + var13 * var14 >> 16;
        int var16 = var12 * var14 - (var11 * var13) >> 16;
        int var18 = class179.field3155[class198.field3602];
        int var19 = var9 * var10 - (var16 * var18) >> 16;
        int var20 = var9 * var18 + var10 * var16 >> 16;
        if (arg6 != -30) {
            method1384((byte) -63);
        }
        if (var20 < 50) {
            class156.field2766 = -1;
            class227.field4057 = -1;
        } else {
            class156.field2766 = arg3 + ((var19 << 9) / var20);
            class227.field4057 = (var15 << 9) / var20 + arg4;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(III)V")
    public static final void method1386(int arg0, int arg1, int arg2) {
        class89.field1591 = arg1 - class251.field4518;
        field3531++;
        class14.field168 = class76.field1404 + class183.field3373 - arg2 - 1;
        if (arg0 != 660316969) {
            return;
        }
        int var3 = (int) ((float) class89.field1579.field3270 / class105.field1823) + class89.field1591;
        int var4 = class89.field1591 - ((int) ((float) class89.field1579.field3270 / class105.field1823));
        if (var4 < 0) {
            class89.field1591 = (int) ((float) class89.field1579.field3270 / class105.field1823);
        }
        int var5 = class14.field168 - ((int) ((float) class89.field1579.field3252 / class105.field1823));
        if (var3 > class148.field2599) {
            class89.field1591 = class148.field2599 - ((int) ((float) class89.field1579.field3270 / class105.field1823));
        }
        int var6 = (int) ((float) class89.field1579.field3252 / class105.field1823) + class14.field168;
        if (var5 < 0) {
            class14.field168 = (int) ((float) class89.field1579.field3252 / class105.field1823);
        }
        if (var6 > class183.field3373) {
            class14.field168 = class183.field3373 - ((int) ((float) class89.field1579.field3252 / class105.field1823));
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method1387(int arg0) {
        field3543 = null;
        field3536 = null;
        field3524 = null;
        field3537 = null;
        if (arg0 < 25) {
            field3539 = true;
        }
    }
}
