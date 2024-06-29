import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class159 {

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "[I")
    public static int[] field2596 = new int[128];

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "[I")
    public static int[] field2604 = new int[2];

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Z")
    public static boolean field2605 = false;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public int field2595;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public int field2603;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public int field2606;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "J")
    public long field2600;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Lwg;")
    public class178 field2601;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Llc;")
    public static class86 field2599;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1182(String arg0, byte arg1) {
        int var2 = 107 / ((arg1 + 22) / 58);
        System.out.println("Error: " + class97.method751("%0a", arg0, "\n", (byte) -61));
        field2598++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
    public static final void method1183(boolean arg0) {
        field2597++;
        for (int var1 = -1; var1 < class121.field1772; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class207.field3326[var1];
            }
            class29 var6 = class92.field1374[var5];
            if (var6 != null && var6.field1961 > 0) {
                var6.field1961--;
                if (var6.field1961 == 0) {
                    var6.field1872 = null;
                }
            }
        }
        if (!arg0) {
            method1187((byte) -128, false, (class17) null);
        }
        for (int var2 = 0; var2 < class21.field235; var2++) {
            int var3 = class39.field556[var2];
            class18 var4 = class169.field2730[var3];
            if (var4 != null && var4.field1961 > 0) {
                var4.field1961--;
                if (var4.field1961 == 0) {
                    var4.field1872 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public static void method1184(byte arg0) {
        field2599 = null;
        field2596 = null;
        field2604 = null;
        if (arg0 != 100) {
            field2604 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILv;)V")
    public static final void method1185(int arg0, class152 arg1) {
        field2609++;
        int var2 = arg1.method1103(3);
        if (arg0 != -10388) {
            method1183(false);
        }
        class133.field2190 = new class282[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class133.field2190[var3] = new class282();
            class133.field2190[var3].field4486 = arg1.method1103(3);
            class133.field2190[var3].field4485 = arg1.method1091(1813);
        }
        class38.field541 = arg1.method1103(3);
        class78.field1135 = arg1.method1103(3);
        class290.field4599 = arg1.method1103(3);
        class10.field104 = new class223[class78.field1135 + 1 - class38.field541];
        for (int var4 = 0; var4 < class290.field4599; var4++) {
            int var5 = arg1.method1103(3);
            class223 var6 = class10.field104[var5] = new class223();
            var6.field2611 = arg1.method1111(255);
            var6.field2614 = arg1.method1097(127);
            var6.field3569 = class38.field541 + var5;
            var6.field3570 = arg1.method1091(1813);
            var6.field3574 = arg1.method1091(1813);
        }
        class19.field210 = arg1.method1097(126);
        class244.field3964 = true;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static final void method1186(int arg0) {
        if (arg0 != -8) {
            return;
        }
        while (class50.field732.method562((byte) 122, class221.field3534) >= 11) {
            int var1 = class50.field732.method554(11, -42);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class92.field1374[var1] == null) {
                var2 = true;
                class92.field1374[var1] = new class29();
                if (class239.field3812[var1] != null) {
                    class92.field1374[var1].method203(class239.field3812[var1], (byte) -127);
                }
            }
            class207.field3326[class121.field1772++] = var1;
            class29 var3 = class92.field1374[var1];
            var3.field1977 = class264.field4290;
            int var4 = class63.field942[class50.field732.method554(3, -50)];
            if (var2) {
                var3.field1928 = var3.field1893 = var4;
            }
            int var5 = class50.field732.method554(1, -41);
            int var6 = class50.field732.method554(5, arg0 - 106);
            int var7 = class50.field732.method554(5, arg0 - 65);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class50.field732.method554(1, arg0 - 62);
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var8 == 1) {
                class188.field3045[class121.field1773++] = var1;
            }
            var3.method204(false, class186.field2993.field1917[0] + var7, var5 == 1, class186.field2993.field1974[0] + var6);
        }
        class50.field732.method560(false);
        field2602++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BZLdb;)V")
    public static final void method1187(byte arg0, boolean arg1, class17 arg2) {
        field2608++;
        int var3 = arg2.field191;
        int var4 = (int) arg2.field4459;
        arg2.method1922(-1);
        if (arg1) {
            class48.method370(var3, (byte) 114);
        }
        class33.method252(var3, (byte) 127);
        class131 var5 = class122.method891(var4, (byte) -128);
        if (var5 != null) {
            class274.method1896(var5, 10);
        }
        int var6 = class243.field3890;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class141.method1009(class207.field3318[var7], -4)) {
                class25.method180(var7, (byte) -127);
            }
        }
        int var8 = 17 / ((arg0 - 53) / 38);
        if (class243.field3890 == 1) {
            class206.field3315 = false;
            class194.method1440(class98.field1440, class116.field1670, class192.field3096, -9, class101.field1500);
        } else {
            class194.method1440(class98.field1440, class116.field1670, class192.field3096, -36, class101.field1500);
            int var9 = class285.field4511.method1257(class280.field4466);
            for (int var10 = 0; var10 < class243.field3890; var10++) {
                int var11 = class285.field4511.method1257(class188.method1401(2, var10));
                if (var11 > var9) {
                    var9 = var11;
                }
            }
            class101.field1500 = var9 + 8;
            class98.field1440 = class243.field3890 * 15 + (class202.field3232 ? 26 : 22);
        }
        if (class211.field3384 != -1) {
            class113.method832((byte) 115, 1, class211.field3384);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V")
    public static final void method1188(byte arg0) {
        field2607++;
        int var1 = 22 / ((arg0 + 56) / 61);
        int var2 = 0;
        for (int var3 = 0; var3 < 104; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                if (class242.method1697(var2, var3, -113, var4, class220.field3525, true)) {
                    var2++;
                }
                if (var2 >= 512) {
                    return;
                }
            }
        }
    }
}
