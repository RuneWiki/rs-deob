import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class41 extends class116 {

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "Z")
    public boolean field1046 = false;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "Lic;")
    public static class59 field1053 = class59.method433(0, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "Z")
    public static volatile boolean field1049 = true;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
    public static volatile int field1056 = 0;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "Laf;")
    public static class7 field1050 = new class7(512);

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    public static int field1059 = 0;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "Lic;")
    private static class59 field1061 = class59.method433(0, "Loading title screen )2 ");

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "Lic;")
    public static class59 field1062 = field1061;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "Lic;")
    public static class59 field1060 = class59.method433(0, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "Z")
    public static boolean field1064 = false;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    public static int field1065 = 0;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "Ldd;")
    public static class26 field1057;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "Ldd;")
    public static class26 field1058;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1063;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(JZ)V")
    public static final void method311(long arg0, boolean arg1) {
        field1045++;
        if (arg0 == 0L) {
            return;
        }
        if (class65.field1649 >= 100 && class116.field2735 != 1 || class65.field1649 >= 200) {
            class127.method972(class68.field1692, class38.field1000, 0, 26018);
            return;
        }
        class59 var3 = class90.method744(37, arg0).method459(28452);
        for (int var4 = 0; var4 < class65.field1649; var4++) {
            if (class84.field2114[var4] == arg0) {
                class127.method972(class46.method358(new class59[] { var3, class30.field784 }, (byte) -75), class38.field1000, 0, 26018);
                return;
            }
        }
        for (int var5 = 0; var5 < class76.field1863; var5++) {
            if (class5.field110[var5] == arg0) {
                class127.method972(class46.method358(new class59[] { class96.field2430, var3, class149.field3264 }, (byte) -75), class38.field1000, 0, 26018);
                return;
            }
        }
        if (var3.method421(class159.field3650.field1225, arg1)) {
            class127.method972(class34.field906, class38.field1000, 0, 26018);
            return;
        }
        class90.field2270++;
        class102.field2486[class65.field1649] = var3;
        class84.field2114[class65.field1649] = arg0;
        class90.field2284[class65.field1649] = 0;
        class23.field537[class65.field1649] = 0;
        class65.field1649++;
        class127.field2884 = class94.field2400;
        class125.field2842.method1072(162, -1);
        class125.field2842.method1201(arg0, (byte) 38);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static final void method312(int arg0) {
        class60.method484(15);
        field1052++;
        class89.method729(-82603320);
        class158.method1219((byte) 122);
        class143.method1067((byte) 114);
        class1.method4((byte) -123);
        class87.method714((byte) -118);
        class106.method825(true);
        class106.method831(500);
        class21.method116(256);
        class54.method401(false);
        class60.method493(false);
        class87.method721(true);
        ((class43) class11.field235).method324((byte) -58);
        class147.field3203.method676((byte) -124);
        class89.field2265.method195((byte) 84);
        class98.field2445.method195((byte) 111);
        class40.field1013.method195((byte) 95);
        class103.field2514.method195((byte) -120);
        class38.field993.method195((byte) 76);
        class73.field1832.method195((byte) 62);
        class89.field2266.method195((byte) -121);
        class100.field2476.method195((byte) -120);
        if (arg0 != 200) {
            field1060 = null;
        }
        class9.field189.method195((byte) 126);
        class77.field1892.method195((byte) 105);
        class84.field2083.method195((byte) 58);
        class154.field3332.method195((byte) 46);
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
    public static void method313(int arg0) {
        field1062 = null;
        field1058 = null;
        field1061 = null;
        field1060 = null;
        field1053 = null;
        field1050 = null;
        if (arg0 == 14854) {
            field1057 = null;
            field1063 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)I")
    public static final int method314(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field1055++;
        if (var4 == 0) {
            return arg2;
        }
        if (arg0 <= 97) {
            field1060 = null;
        }
        if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
    public static final void method315(int arg0) {
        while (true) {
            if (class10.field213.method1071(class34.field914, true) >= 27) {
                int var1 = class10.field213.method1064(15, -7284);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class47.field1210[var1] == null) {
                        class47.field1210[var1] = new class90();
                        var2 = true;
                    }
                    class90 var3 = class47.field1210[var1];
                    class53.field1309[class103.field2510++] = var1;
                    var3.field1749 = class23.field561;
                    var3.field2276 = class21.method119(arg0 ^ 0xA, class10.field213.method1064(14, -7284));
                    int var4 = class10.field213.method1064(5, arg0 - 7287);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class142.field3121[class10.field213.method1064(3, -7284)];
                    if (var2) {
                        var3.field1702 = var3.field1724 = var5;
                    }
                    int var6 = class10.field213.method1064(5, -7284);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class10.field213.method1064(1, -7284);
                    int var8 = class10.field213.method1064(1, -7284);
                    if (var8 == 1) {
                        class3.field62[class106.field2526++] = var1;
                    }
                    var3.field1713 = var3.field2276.field2803;
                    var3.field1757 = var3.field2276.field2816;
                    var3.field1745 = var3.field2276.field2851;
                    var3.field1717 = var3.field2276.field2824;
                    var3.field1712 = var3.field2276.field2817;
                    var3.field1737 = var3.field2276.field2822;
                    var3.field1710 = var3.field2276.field2802;
                    if (var3.field1710 == 0) {
                        var3.field1724 = 0;
                    }
                    var3.field1748 = var3.field2276.field2839;
                    var3.field1693 = var3.field2276.field2807;
                    var3.method549((byte) -24, var7 == 1, class159.field3650.field1704[0] + var6, class159.field3650.field1719[0] + var4);
                    continue;
                }
            }
            if (arg0 != 3) {
                method314(8, 30, 3, 22);
            }
            class10.field213.method1070(-16777217);
            field1054++;
            return;
        }
    }
}
