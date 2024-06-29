import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class104 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lkd;")
    public static class73 field2583 = class126.method1070((byte) -66, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Lkd;")
    public static class73 field2590 = class126.method1070((byte) -66, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lkd;")
    public static class73 field2585 = class126.method1070((byte) -66, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Z")
    public static boolean field2592 = false;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Lie;")
    public static class61 field2587 = new class61();

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field2597 = 0;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Lkd;")
    private static class73 field2596 = class126.method1070((byte) -66, "Loaded update list");

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field2600 = 255;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Lkd;")
    public static class73 field2602 = class126.method1070((byte) -66, "Bitte geben Sie Ihren Benutzenamen ein)3");

    @OriginalMember(owner = "client!p", name = "s", descriptor = "Lkd;")
    public static class73 field2601 = class126.method1070((byte) -66, "Hier klicken)1 um fortzufahren)3)3)3");

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Z")
    public static boolean field2598 = false;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Lkd;")
    public static class73 field2595 = class126.method1070((byte) -66, "System)2Update in: ");

    @OriginalMember(owner = "client!p", name = "v", descriptor = "Lkd;")
    public static class73 field2604 = field2596;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "Z")
    public static boolean field2603 = false;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "J")
    public static long field2599;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Lq;")
    public static class111 field2591;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLq;Lq;)V")
    public static final void method832(byte arg0, class111 arg1, class111 arg2) {
        if (arg0 != 4) {
            field2591 = null;
        }
        class89.field2227 = arg2;
        class81.field2051 = arg1;
        field2589++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static final void method833(int arg0) {
        field2584++;
        class81 var1 = class71.field1795;
        synchronized (class71.field1795) {
            class98.field2455 = class2.field156;
            class31.field869 = class98.field2443;
            class3.field161 = class120.field3065;
            class105.field2615 = class28.field817;
            class103.field2570 = class145.field3581;
            class42.field1134 = class81.field2043;
            class13.field409 = class71.field1796;
            class28.field817 = 0;
            if (arg0 != -339) {
                field2602 = null;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V")
    public static final void method834(int arg0, int arg1, int arg2) {
        field2594++;
        int var3 = 0;
        if (arg2 >= -104) {
            field2604 = null;
        }
        for (int var4 = 0; var4 < 100; var4++) {
            if (class76.field1952[var4] != null) {
                int var5 = class110.field2702[var4];
                int var6 = class62.field1622 + 74 - var3 * 14;
                if (var6 < -20) {
                    break;
                }
                if (var5 == 0) {
                    var3++;
                }
                class73 var7 = class18.field530[var4];
                if (var7 != null && var7.method642(106, class131.field3284)) {
                    var7 = var7.method638(5, 127);
                }
                if (var7 != null && var7.method642(-86, class42.field1122)) {
                    var7 = var7.method638(5, 126);
                }
                if ((var5 == 1 || var5 == 2) && (var5 == 1 || class133.field3342 == 0 || class133.field3342 == 1 && class115.method978(82, var7))) {
                    var3++;
                    if (arg1 > var6 - 14 && var6 >= arg1 && !var7.method616(-71, class73.field1901.field3025)) {
                        class153.field3763++;
                        class45.field1190++;
                        if (class64.field1691 >= 1) {
                            class64.field1677++;
                            class80.method684(class32.method258(-108, new class73[] { client.field615, var7 }), false, 8, class77.field1963, 0, 0, 0);
                        }
                        class80.method684(class32.method258(-67, new class73[] { client.field615, var7 }), false, 53, class18.field527, 0, 0, 0);
                        class80.method684(class32.method258(-62, new class73[] { client.field615, var7 }), false, 49, class123.field3145, 0, 0, 0);
                    }
                }
                if ((var5 == 3 || var5 == 7) && class80.field2025 == 0 && (var5 == 7 || class25.field711 == 0 || class25.field711 == 1 && class115.method978(121, var7))) {
                    var3++;
                    if (var6 - 14 < arg1 && var6 >= arg1) {
                        class153.field3763++;
                        if (class64.field1691 >= 1) {
                            class80.method684(class32.method258(-96, new class73[] { client.field615, var7 }), false, 8, class77.field1963, 0, 0, 0);
                            class64.field1677++;
                        }
                        class80.method684(class32.method258(-123, new class73[] { client.field615, var7 }), false, 53, class18.field527, 0, 0, 0);
                        class45.field1190++;
                        class80.method684(class32.method258(-76, new class73[] { client.field615, var7 }), false, 49, class123.field3145, 0, 0, 0);
                    }
                }
                if (var5 == 4 && (class13.field410 == 0 || class13.field410 == 1 && class115.method978(122, var7))) {
                    var3++;
                    if (var6 - 14 < arg1 && var6 >= arg1) {
                        class12.field399++;
                        class80.method684(class32.method258(-95, new class73[] { client.field615, var7 }), false, 26, class25.field705, 0, 0, 0);
                    }
                }
                if ((var5 == 5 || var5 == 6) && class80.field2025 == 0 && class25.field711 < 2) {
                    var3++;
                }
                if (var5 == 8 && (class13.field410 == 0 || class13.field410 == 1 && class115.method978(120, var7))) {
                    var3++;
                    if (var6 - 14 < arg1 && var6 >= arg1) {
                        class80.method684(class32.method258(-106, new class73[] { client.field615, var7 }), false, 33, class62.field1625, 0, 0, 0);
                        class121.field3082++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II[La;IIIILa;ZIII)La;")
    public static final class1 method835(int arg0, int arg1, class1[] arg2, int arg3, int arg4, int arg5, int arg6, class1 arg7, boolean arg8, int arg9, int arg10, int arg11) {
        field2588++;
        if (arg0 > arg1 || arg3 < arg5 || arg1 >= arg6 || arg3 >= arg4) {
            return null;
        }
        for (int var12 = 0; var12 < arg2.length; var12++) {
            class1 var13 = arg2[var12];
            if (var13 != null && var13.field101 == arg10 && !class112.method910(var13, -2667) && arg7 != var13) {
                int var14 = var13.field60 + arg0 - arg9;
                int var15 = arg5 + var13.field115 - arg11;
                if (var13.field81 == 0) {
                    class1 var16 = method835(var14, arg1, arg2, arg3, var13.field63 + var15, var15, var13.field96 + var14, arg7, false, var13.field73, var13.field45, var13.field86);
                    if (var16 != null) {
                        return var16;
                    }
                    if (var13.field126 != null) {
                        class1 var17 = method835(var14, arg1, var13.field126, arg3, var13.field63 + var15, var15, var13.field96 + var14, arg7, false, var13.field73, var13.field45, var13.field86);
                        if (var17 != null) {
                            return var17;
                        }
                    }
                }
                if (class5.method24(class153.method1225(var13, -124), -1) && arg1 >= var14 && var15 <= arg3 && var13.field96 + var14 > arg1 && arg3 < var13.field63 + var15) {
                    return var13;
                }
            }
        }
        if (arg8) {
            method836(96);
        }
        return null;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public static void method836(int arg0) {
        field2596 = null;
        field2591 = null;
        field2601 = null;
        field2583 = null;
        field2604 = null;
        field2590 = null;
        field2585 = null;
        field2587 = null;
        field2595 = null;
        int var1 = -108 % ((-arg0 - 18) / 33);
        field2602 = null;
    }
}
