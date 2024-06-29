import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class24 implements Runnable {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Z")
    public static boolean field589 = false;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lja;")
    public static class62 field590 = class30.method243(43, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Lja;")
    public static class62 field596 = class30.method243(43, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field597 = 0;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
    public static int[] field598 = new int[2000];

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Lja;")
    public static class62 field592 = class30.method243(43, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Lja;")
    public static class62 field602 = class30.method243(43, "mapfunction");

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Lja;")
    private static class62 field603 = class30.method243(43, "The server is being updated)3");

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Lja;")
    public static class62 field591 = field603;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "[[B")
    public static byte[][] field601;

    @OriginalMember(owner = "client!dc", name = "run", descriptor = "()V")
    public final void run() {
        field594++;
        try {
            while (true) {
                class105 var1 = class36.field863;
                class144 var2;
                synchronized (class36.field863) {
                    var2 = (class144) class36.field863.method840(true);
                }
                if (var2 == null) {
                    class146.method1168(-19127, 100L);
                    Object var3 = class40.field925;
                    synchronized (class40.field925) {
                        if (class130.field2976 <= 1) {
                            class130.field2976 = 0;
                            class40.field925.notifyAll();
                            return;
                        }
                        class130.field2976--;
                    }
                } else {
                    if (var2.field3357 == 0) {
                        var2.field3369.method1120(var2.field3367, var2.field3367.length, (byte) -75, (int) var2.field3493);
                        class105 var5 = class36.field863;
                        synchronized (class36.field863) {
                            var2.method1176((byte) 21);
                        }
                    } else if (var2.field3357 == 1) {
                        var2.field3367 = var2.field3369.method1122((int) var2.field3493, 7115);
                        class105 var4 = class36.field863;
                        synchronized (class36.field863) {
                            class53.field1203.method847(var2, (byte) 108);
                        }
                    }
                    Object var6 = class40.field925;
                    synchronized (class40.field925) {
                        if (class130.field2976 <= 1) {
                            class130.field2976 = 0;
                            class40.field925.notifyAll();
                            return;
                        }
                        class130.field2976 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class93.method715(var17, null, true);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static final void method191(int arg0) {
        class63 var1 = (class63) class133.field3035.method840(true);
        if (arg0 < 50) {
            field590 = null;
        }
        while (var1 != null) {
            if (var1.field1557 != null) {
                var1.method481(-93);
            }
            var1 = (class63) class133.field3035.method841((byte) 18);
        }
        field595++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)I")
    public static int method192(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
    public static void method193(boolean arg0) {
        field603 = null;
        field601 = null;
        field592 = null;
        field596 = null;
        field590 = null;
        if (arg0) {
            field598 = null;
        }
        field591 = null;
        field598 = null;
        field602 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static final void method194(byte arg0) {
        field604++;
        if (class71.field1812 != null) {
            return;
        }
        if (arg0 != 112) {
            method195(33, 71, null, 30);
        }
        if (class150.field3540 != null) {
            return;
        }
        int var1 = class70.field1792;
        if (class119.field2709) {
            if (var1 != 1) {
                int var2 = class103.field2398;
                int var3 = class84.field2032;
                if (var2 < class84.field2021 - 10 || var2 > class57.field1410 + class84.field2021 + 10 || class79.field1914 - 10 > var3 || class79.field1914 + class148.field3484 + 10 < var3) {
                    class119.field2709 = false;
                    class4.method19(arg0 - 23819, class84.field2021, class57.field1410, class79.field1914, class148.field3484);
                }
            }
            if (var1 == 1) {
                int var4 = class57.field1410;
                int var5 = class84.field2021;
                int var6 = class79.field1914;
                int var7 = class29.field713;
                int var8 = class4.field56;
                int var9 = -1;
                for (int var10 = 0; var10 < class128.field2889; var10++) {
                    int var11 = (class128.field2889 - var10 - 1) * 15 + var6 + 31;
                    if (var7 > var5 && var7 < var4 + var5 && var8 > var11 - 13 && var11 + 3 > var8) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class77.method622(2, var9);
                }
                class119.field2709 = false;
                class4.method19(-23707, class84.field2021, class57.field1410, class79.field1914, class148.field3484);
                return;
            }
            return;
        }
        if (var1 == 1 && class128.field2889 > 0) {
            int var12 = class146.field3437[class128.field2889 - 1];
            if (var12 == 21 || var12 == 19 || var12 == 8 || var12 == 43 || var12 == 29 || var12 == 5 || var12 == 26 || var12 == 20 || var12 == 37 || var12 == 40 || var12 == 1 || var12 == 1004) {
                int var13 = class12.field288[class128.field2889 - 1];
                int var14 = class59.field1440[class128.field2889 - 1];
                class54 var15 = class62.method456(var14, (byte) 90);
                if (class84.method655(0, class22.method171(var15, (byte) 32)) || class82.method643(class22.method171(var15, (byte) -113), true)) {
                    class34.field799 = false;
                    class26.field620 = 0;
                    if (class71.field1812 != null) {
                        client.method163(class71.field1812, -69);
                    }
                    class71.field1812 = class62.method456(var14, (byte) 116);
                    class130.field2964 = class29.field713;
                    class148.field3496 = var13;
                    class52.field1196 = class4.field56;
                    client.method163(class71.field1812, -89);
                    return;
                }
            }
        }
        if (var1 == 1 && (class1.field15 == 1 && class128.field2889 > 2 || class83.method648(-107, class128.field2889 - 1))) {
            var1 = 2;
        }
        if (var1 == 1 && class128.field2889 > 0) {
            class77.method622(2, class128.field2889 - 1);
        }
        if (var1 != 2 || class128.field2889 <= 0) {
            return;
        }
        class103.method830((byte) 50);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILhe;I)V")
    public static final void method195(int arg0, int arg1, class54 arg2, int arg3) {
        field600++;
        if (class150.field3540 != null || class119.field2709 || (arg2 == null || class50.method350((byte) 124, arg2) == null)) {
            return;
        }
        class150.field3540 = arg2;
        class86.field2059 = class50.method350((byte) 127, arg2);
        class15.field339 = false;
        class93.field2175 = arg1;
        class67.field1666 = arg3;
        if (arg0 != -22572) {
            method194((byte) 66);
        }
        class146.field3435 = 0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)I")
    public static final int method196(int arg0, int arg1, int arg2) {
        int var3 = arg2 * 57 + arg0;
        if (arg1 == 0) {
            int var4 = var3 ^ var3 << 13;
            field593++;
            int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return var5 >> 19 & 0xFF;
        } else {
            return 79;
        }
    }
}
