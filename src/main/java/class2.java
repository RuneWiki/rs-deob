import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class137 {

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "[I")
    public int[] field7 = new int[] { -1 };

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "[I")
    public int[] field18 = new int[1];

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "[I")
    public static int[] field6 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "J")
    public static long field8 = 0L;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "Laf;")
    public static class7 field13 = class48.method406(40, ":");

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "[Z")
    public static boolean[] field9 = new boolean[100];

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
    public static int field19 = 0;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "[I")
    public static int[] field21 = new int[1000];

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "Laf;")
    public static class7 field11 = class48.method406(40, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "[Lo;")
    public static class97[] field20 = new class97[16];

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "Lva;")
    public static class145 field16;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "Ljava/lang/String;")
    public static String field5;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
    public static void method13(byte arg0) {
        field13 = null;
        field9 = null;
        field21 = null;
        if (arg0 != -17) {
            method17(false);
        }
        field6 = null;
        field20 = null;
        field11 = null;
        field5 = null;
        field16 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
    public static final void method14(boolean arg0) {
        field14++;
        if (!arg0) {
            return;
        }
        for (int var1 = 0; var1 < class98.field2325; var1++) {
            int var2 = class21.field537[var1];
            class141 var3 = class121.field2843[var2];
            int var4 = class91.field2100.method931((byte) 124);
            if ((var4 & 0x2) != 0) {
                var3.field469 = class91.field2100.method947(13771);
                int var5 = class91.field2100.method971(764811120);
                var3.field448 = var5 >> 16;
                var3.field500 = (var5 & 0xFFFF) + class155.field3611;
                if (var3.field469 == 65535) {
                    var3.field469 = -1;
                }
                var3.field475 = 0;
                var3.field477 = 0;
                if (var3.field500 > class155.field3611) {
                    var3.field475 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var6 = class91.field2100.method931((byte) 124);
                int var7 = class91.field2100.method962(1206579365);
                var3.method184(class155.field3611, var7, var6, 0);
                var3.field468 = class155.field3611 + 300;
                var3.field496 = class91.field2100.method931((byte) 124);
                var3.field467 = class91.field2100.method931((byte) 124);
            }
            if ((var4 & 0x8) != 0) {
                var3.field3323 = class135.method1101(class91.field2100.method978(-86), 3215);
                var3.field447 = var3.field3323.field2249;
                var3.field454 = var3.field3323.field2240;
                var3.field460 = var3.field3323.field2233;
                var3.field472 = var3.field3323.field2255;
                var3.field459 = var3.field3323.field2257;
                var3.field466 = var3.field3323.field2252;
                var3.field490 = var3.field3323.field2225;
                var3.field473 = var3.field3323.field2220;
                var3.field465 = var3.field3323.field2224;
            }
            if ((var4 & 0x10) != 0) {
                var3.field445 = class91.field2100.method978(-84);
                if (var3.field445 == 65535) {
                    var3.field445 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field444 = class91.field2100.method978(-121);
                var3.field494 = class91.field2100.method965(false);
            }
            if ((var4 & 0x20) != 0) {
                int var8 = class91.field2100.method931((byte) 124);
                int var9 = class91.field2100.method962(1206579365);
                var3.method184(class155.field3611, var9, var8, 0);
                var3.field468 = class155.field3611 + 300;
                var3.field496 = class91.field2100.method962(1206579365);
                var3.field467 = class91.field2100.method948((byte) 121);
            }
            if ((var4 & 0x4) != 0) {
                var3.field453 = class91.field2100.method979(26250);
                var3.field488 = 100;
            }
            if ((var4 & 0x80) != 0) {
                int var10 = class91.field2100.method969(126);
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = class91.field2100.method931((byte) 124);
                if (var3.field478 == var10 && var10 != -1) {
                    int var12 = class87.method710(var10, 6491).field2165;
                    if (var12 == 1) {
                        var3.field463 = 0;
                        var3.field457 = var11;
                        var3.field499 = 0;
                        var3.field487 = 0;
                    }
                    if (var12 == 2) {
                        var3.field499 = 0;
                    }
                } else if (var10 == -1 || var3.field478 == -1 || class87.method710(var10, 6491).field2181 >= class87.method710(var3.field478, 6491).field2181) {
                    var3.field499 = 0;
                    var3.field463 = 0;
                    var3.field457 = var11;
                    var3.field478 = var10;
                    var3.field487 = 0;
                    var3.field471 = var3.field455;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)V")
    public static final void method15(boolean arg0, int arg1) {
        class3.field39 = -1;
        field15++;
        class79.field1831 = 0;
        class26.field689 = arg1;
        class82.field1932 = null;
        class108.field2647 = arg0;
        class148.field3479 = 1;
        class20.field517 = -1;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)V")
    public static final void method16(int arg0, int arg1) {
        int var2 = -102 / ((16 - arg1) / 61);
        field17++;
        for (class123 var3 = (class123) class51.field1222.method127(-96); var3 != null; var3 = (class123) class51.field1222.method123(false)) {
            if ((long) arg0 == (var3.field3261 >> 48 & 0xFFFFL)) {
                var3.method1124((byte) 62);
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
    public static final void method17(boolean arg0) {
        if (!arg0) {
            method14(false);
        }
        field10++;
        for (class69 var1 = (class69) class48.field1157.method758(255); var1 != null; var1 = (class69) class48.field1157.method766(-48)) {
            if (class8.field186 != var1.field1504 || var1.field1509) {
                var1.method1124((byte) 62);
            } else if (class155.field3611 >= var1.field1516) {
                var1.method554(true, class108.field2646);
                if (var1.field1509) {
                    var1.method1124((byte) 62);
                } else {
                    class47.field1151.method1024(var1.field1504, var1.field1502, var1.field1515, var1.field1500, 60, var1, 0, -1, false);
                }
            }
        }
    }
}
