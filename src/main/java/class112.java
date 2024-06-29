import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class112 extends class166 {

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "Z")
    public static boolean field1663 = true;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "[I")
    public static int[] field1664 = new int[100];

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field1670 = 1;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "Lma;")
    private static class5 field1671 = class12.method119("Loading )2 please wait)3", (byte) 53);

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Lma;")
    public static class5 field1666 = field1671;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "Lma;")
    public static class5 field1674 = class12.method119("W-=hlen Sie eine Option", (byte) 62);

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "[Lch;")
    public static class183[] field1675 = new class183[4];

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "F")
    public static float field1673;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "[I")
    public static int[] field1665;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZILsj;)V", line = 9)
    public static final void method740(boolean arg0, int arg1, class181 arg2) {
        field1668++;
        if (class115.field1713 != null) {
            try {
                class115.field1713.method1184(false);
            } catch (Exception var11) {
            }
            class115.field1713 = null;
        }
        class115.field1713 = arg2;
        class74.method529(false, arg0);
        class151.field2187 = 0;
        class99.field1482 = null;
        class210.field3338.field3610 = 0;
        class241.field4009 = null;
        while (true) {
            class136 var4 = (class136) class274.field4679.method1379(true);
            if (var4 == null) {
                while (true) {
                    class136 var5 = (class136) class24.field422.method1379(true);
                    if (var5 == null) {
                        if (class201.field3191 != 0) {
                            try {
                                class221 var6 = new class221(4);
                                var6.method1542(-101, 4);
                                var6.method1542(-73, class201.field3191);
                                var6.method1539(0, false);
                                class115.field1713.method1185(-22036, 4, var6.field3617, 0);
                            } catch (IOException var10) {
                                try {
                                    class115.field1713.method1184(false);
                                } catch (Exception var9) {
                                }
                                class242.field4038++;
                                class115.field1713 = null;
                            }
                        }
                        if (arg1 == -16492) {
                            class284.field4809 = 0;
                            class303.field5111 = class212.method1404((byte) -98);
                            return;
                        } else {
                            return;
                        }
                    }
                    class216.field3414.method788(arg1 + 16531, var5);
                    class282.field4780.method1376(var5.field5004, -1, var5);
                    class206.field3281++;
                    class136.field2015--;
                }
            }
            class268.field4622.method1376(var4.field5004, -1, var4);
            class116.field1734--;
            class267.field4587++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V", line = 83)
    public static final void method741(int arg0, int arg1) {
        field1672++;
        if (class5.field58 == arg0) {
            return;
        }
        if (class5.field58 == 0) {
            class192.method1259(-18);
        }
        if (arg0 == 40) {
            class27.method192(true, class250.field4148, class65.field1023, class250.field4144);
        }
        if (arg0 != 40 && class197.field3139 != null) {
            class197.field3139.method1184(false);
            class197.field3139 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class147.field2138 = 0;
            field1670 = 1;
            class15.field278 = 1;
            class288.field4867 = 0;
            class180.field2726 = 0;
            class135.method885(true);
        }
        if (arg0 == arg1) {
            class197.method1306(class206.field3285, (byte) -127);
        } else {
            class127.method853(arg1 + 250);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        boolean var3 = class5.field58 == 5 || class5.field58 == 10 || class5.field58 == 28;
        if (var3 != var2) {
            if (var2) {
                class272.field4649 = class9.field136;
                if (class247.field4092 == 0) {
                    class79.method545(2, -1);
                } else {
                    class210.method1396(255, false, (byte) -29, class9.field136, 0, class182.field2775, 2);
                }
                class74.method529(false, false);
            } else {
                class79.method545(2, -1);
                class74.method529(false, true);
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class45.method336();
        }
        class5.field58 = arg0;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 160)
    public static void method742(int arg0) {
        field1674 = null;
        if (arg0 > -109) {
            field1666 = (class5) null;
        }
        field1665 = null;
        field1675 = null;
        field1664 = null;
        field1666 = null;
        field1671 = null;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)[Lrj;", line = 192)
    public static final class237[] method743(int arg0) {
        class237[] var1 = new class237[class79.field1221];
        for (int var2 = 0; var2 < class79.field1221; var2++) {
            int var3 = class179.field2718[var2] * field1665[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class37.field590[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class268.field4610[class204.method1354(var5[var6], 255)];
            }
            var1[var2] = new class109(class282.field4786, class281.field4765, class88.field1315[var2], class287.field4836[var2], field1665[var2], class179.field2718[var2], var4);
        }
        class207.method1365(9);
        field1667++;
        if (arg0 <= 36) {
            return (class237[]) null;
        } else {
            return var1;
        }
    }
}
