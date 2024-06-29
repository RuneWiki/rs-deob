import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class76 {

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Z")
    public boolean field1547 = true;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public int field1538;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public int field1539;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lob;")
    private static class141 field1531 = class175.method1195(40, "Wed");

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "J")
    public static volatile long field1535 = 0L;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "Lob;")
    private static class141 field1544 = class175.method1195(40, "Thu");

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "Lob;")
    private static class141 field1548 = class175.method1195(40, "Tue");

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "Lob;")
    private static class141 field1550 = class175.method1195(40, "Sat");

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Lob;")
    private static class141 field1546 = class175.method1195(40, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Lob;")
    private static class141 field1552 = class175.method1195(40, "Fri");

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Lob;")
    private static class141 field1549 = class175.method1195(40, "Sun");

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lob;")
    public static class141 field1532 = field1546;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Lob;")
    private static class141 field1545 = class175.method1195(40, "Mon");

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "[Lob;")
    public static class141[] field1542 = new class141[] { field1549, field1545, field1548, field1531, field1544, field1552, field1550 };

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Lvc;")
    public static class212 field1541 = new class212(260);

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "[[[Lpi;")
    public static class158[][][] field1559 = new class158[4][104][104];

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "Lob;")
    private static class141 field1561 = class175.method1195(40, "Started 3d library");

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "Lob;")
    private static class141 field1563 = class175.method1195(40, "Please wait)3)3)3");

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "Lob;")
    private static class141 field1557 = class175.method1195(40, "Select a world");

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "Lob;")
    public static class141 field1554 = field1563;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "Lob;")
    public static class141 field1560 = field1561;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "Lob;")
    public static class141 field1558 = field1557;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "Lpe;")
    public static class154 field1555;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "Ljava/awt/Font;")
    public static Font field1562;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "[S")
    public static short[] field1556;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method530(int arg0) {
        field1563 = null;
        if (arg0 != -16225) {
            field1556 = null;
        }
        field1561 = null;
        field1560 = null;
        field1542 = null;
        field1544 = null;
        field1552 = null;
        field1550 = null;
        field1562 = null;
        field1546 = null;
        field1555 = null;
        field1558 = null;
        field1557 = null;
        field1556 = null;
        field1531 = null;
        field1545 = null;
        field1548 = null;
        field1532 = null;
        field1549 = null;
        field1559 = null;
        field1541 = null;
        field1554 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Z")
    public static final boolean method531(int arg0, int arg1) {
        field1551++;
        if (arg0 < 64) {
            return true;
        } else {
            return (arg1 >> 30 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIILaa;JZ)V")
    public static final void method532(int arg0, int arg1, int arg2, int arg3, class2 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class124 var8 = new class124();
        var8.field2379 = arg4;
        var8.field2386 = arg1 * 128 + 64;
        var8.field2385 = arg2 * 128 + 64;
        var8.field2389 = arg3;
        var8.field2391 = arg5;
        if (class131.field2506[arg0][arg1][arg2] == null) {
            class131.field2506[arg0][arg1][arg2] = new class153(arg0, arg1, arg2);
        }
        class131.field2506[arg0][arg1][arg2].field2926 = var8;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V")
    public static final void method533(int arg0, int arg1) {
        field1536++;
        if (class66.method443(true, arg0)) {
            class115.method739(class224.field4232[arg0], -1, -121);
            if (arg1 > -82) {
                method531(-109, 83);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)V")
    public static final void method534(int arg0, byte arg1) {
        field1533++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class6.field76[arg0];
        int var3 = class133.field2529[arg0];
        if (arg1 != -37) {
            method531(-101, -46);
        }
        int var4 = (int) class161.field3123[arg0];
        long var5 = class161.field3123[arg0];
        int var7 = class157.field3026[arg0];
        if (var7 >= 2000) {
            var7 -= 2000;
        }
        if (var7 == 10) {
            class122.field2346++;
            class7.field120.method32(61, 12885);
            class7.field120.method975(var3, 1198513704);
            class7.field120.method972(26894, var4);
            class7.field120.method972(26894, var2);
            class90.field1799 = 0;
            class191.field3693 = class192.method1268(var3, -118);
            class17.field300 = var2;
        }
        if (var7 == 8) {
            class135.field2571++;
            class7.field120.method32(210, 12885);
            class7.field120.method972(26894, var2);
            class7.field120.method1009(-112, var4);
            class7.field120.method964(var3, -2100837416);
            class90.field1799 = 0;
            class191.field3693 = class192.method1268(var3, -121);
            class17.field300 = var2;
        }
        if (var7 == 6) {
            class38 var8 = class116.field2231[var4];
            if (var8 != null) {
                class152.field2910++;
                class162.method1130(2, 1, var8.field3870[0], var8.field3892[0], (byte) -117, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
                class97.field1921 = class81.field1630;
                class7.field98 = class195.field3737;
                class10.field208 = 0;
                class92.field1852 = 2;
                class7.field120.method32(35, 12885);
                class7.field120.method1004(-99, var4);
            }
        }
        if (var7 == 46) {
            class170.field3355++;
            class123.method798(var2, var5, 11, var3);
            class7.field120.method32(69, 12885);
            class7.field120.method1004(-102, class83.field1644 + var3);
            class7.field120.method1009(106, class83.field1649 + var2);
            class7.field120.method994(-123, (int) (var5 >>> 32) & Integer.MAX_VALUE);
        }
        if (var7 == 11) {
            class131 var9 = class10.field172[var4];
            if (var9 != null) {
                class82.field1638++;
                class162.method1130(2, 1, var9.field3870[0], var9.field3892[0], (byte) 40, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
                class97.field1921 = class81.field1630;
                class10.field208 = 0;
                class7.field98 = class195.field3737;
                class92.field1852 = 2;
                class7.field120.method32(65, arg1 + 12922);
                class7.field120.method972(26894, var4);
            }
        }
        if (var7 == 42) {
            class38 var10 = class116.field2231[var4];
            if (var10 != null) {
                class87.field1735++;
                class162.method1130(2, 1, var10.field3870[0], var10.field3892[0], (byte) -117, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
                class92.field1852 = 2;
                class10.field208 = 0;
                class7.field98 = class195.field3737;
                class97.field1921 = class81.field1630;
                class7.field120.method32(157, arg1 + 12922);
                class7.field120.method986(class158.field3054, false);
                class7.field120.method1009(35, class128.field2436);
                class7.field120.method1009(-120, var4);
            }
        }
        if (var7 == 30) {
            class38 var11 = class116.field2231[var4];
            if (var11 != null) {
                class162.method1130(2, 1, var11.field3870[0], var11.field3892[0], (byte) 45, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
                class10.field208 = 0;
                class79.field1597++;
                class92.field1852 = 2;
                class97.field1921 = class81.field1630;
                class7.field98 = class195.field3737;
                class7.field120.method32(247, 12885);
                class7.field120.method994(-109, var4);
            }
        }
        if (var7 == 3) {
            class35.method246(arg1 - 87);
            class170 var12 = class192.method1268(var3, -65);
            class6.field71 = var2;
            class132.field2514 = var4;
            class16.field285 = var3;
            class29.field568 = 1;
            class38.method252(var12, -80);
            class179.field3522 = class220.method1422(new class141[] { class114.field2185, class96.method645((byte) -61, var4).field937, class57.field1095 }, arg1 + 34);
            if (class179.field3522 == null) {
                class179.field3522 = class224.field4239;
            }
            return;
        }
        if (var7 == 23) {
            class123.method798(var2, var5, 11, var3);
            class7.field120.method32(233, 12885);
            class68.field1337++;
            class7.field120.method1009(63, var2 + class83.field1649);
            class7.field120.method972(26894, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class7.field120.method972(26894, class83.field1644 + var3);
        }
        if (var7 == 31) {
            class162.field3143++;
            class7.field120.method32(47, 12885);
            class7.field120.method1009(50, var4);
            class7.field120.method986(var3, false);
            class7.field120.method972(26894, var2);
            class90.field1799 = 0;
            class191.field3693 = class192.method1268(var3, -64);
            class17.field300 = var2;
        }
        if (var7 == 1004) {
            class92.field1852 = 2;
            class129.field2450++;
            class97.field1921 = class81.field1630;
            class10.field208 = 0;
            class7.field98 = class195.field3737;
            class7.field120.method32(191, 12885);
            class7.field120.method994(arg1 ^ 0x55, var4);
        }
        if (var7 == 14) {
            class131 var13 = class10.field172[var4];
            if (var13 != null) {
                class162.method1130(2, 1, var13.field3870[0], var13.field3892[0], (byte) 114, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
                class7.field98 = class195.field3737;
                class10.field208 = 0;
                class119.field2308++;
                class92.field1852 = 2;
                class97.field1921 = class81.field1630;
                class7.field120.method32(245, 12885);
                class7.field120.method972(26894, class6.field71);
                class7.field120.method972(26894, var4);
                class7.field120.method1004(-125, class132.field2514);
                class7.field120.method986(class16.field285, false);
            }
        }
        if (var7 == 7) {
            class24.field463++;
            class7.field120.method32(118, 12885);
            class7.field120.method964(var3, -2100837416);
            class7.field120.method1009(60, var4);
            class7.field120.method972(26894, var2);
            class90.field1799 = 0;
            class191.field3693 = class192.method1268(var3, arg1 ^ 0x68);
            class17.field300 = var2;
        }
        if (var7 == 1001) {
            class170 var14 = class192.method1268(var3, -85);
            if (var14 == null || var14.field3319[var2] < 100000) {
                class38.field747++;
                class7.field120.method32(59, arg1 + 12922);
                class7.field120.method994(arg1 ^ 0x4A, var4);
            } else {
                class131.method836(0, (byte) -107, class111.field2128, class220.method1422(new class141[] { class78.method543((byte) 93, var14.field3319[var2]), class97.field1919, class96.method645((byte) -61, var4).field937 }, arg1 + 34));
            }
            class90.field1799 = 0;
            class191.field3693 = class192.method1268(var3, arg1 - 45);
            class17.field300 = var2;
        }
        if (var7 == 24) {
            class131 var15 = class10.field172[var4];
            if (var15 != null) {
                class162.method1130(2, 1, var15.field3870[0], var15.field3892[0], (byte) 102, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
                class175.field3478++;
                class10.field208 = 0;
                class92.field1852 = 2;
                class7.field98 = class195.field3737;
                class97.field1921 = class81.field1630;
                class7.field120.method32(49, 12885);
                class7.field120.method1004(arg1 ^ 0x43, var4);
            }
        }
        if (var7 == 1002) {
            class10.field208 = 0;
            class7.field98 = class195.field3737;
            class97.field1921 = class81.field1630;
            class92.field1852 = 2;
            class131 var16 = class10.field172[var4];
            if (var16 != null) {
                class10 var17 = var16.field2507;
                if (var17.field197 != null) {
                    var17 = var17.method61((byte) 121);
                }
                if (var17 != null) {
                    class8.field129++;
                    class7.field120.method32(22, arg1 + 12922);
                    class7.field120.method1009(-123, var17.field169);
                }
            }
        }
        if (var7 == 5 && class123.method798(var2, var5, 11, var3)) {
            class124.field2387++;
            class7.field120.method32(239, arg1 + 12922);
            class7.field120.method972(26894, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class7.field120.method994(-128, class83.field1644 + var3);
            class7.field120.method1009(arg1 + 50, class83.field1649 + var2);
            class7.field120.method970(class158.field3054, (byte) -18);
            class7.field120.method994(-128, class128.field2436);
        }
        if (var7 == 4) {
            class7.field120.method32(106, 12885);
            class7.field120.method1004(-111, var2);
            class7.field120.method972(arg1 + 26931, var4);
            class7.field120.method970(var3, (byte) -18);
            class90.field1799 = 0;
            class215.field4096++;
            class191.field3693 = class192.method1268(var3, arg1 - 86);
            class17.field300 = var2;
        }
        if (var7 == 51) {
            class123.method798(var2, var5, 11, var3);
            class135.field2567++;
            class7.field120.method32(87, arg1 + 12922);
            class7.field120.method1009(-111, var2 + class83.field1649);
            class7.field120.method994(-120, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class7.field120.method972(26894, class83.field1644 + var3);
        }
        if (var7 == 15 || var7 == 1003) {
            class174.method1191(arg1 + 23465, var2, var3, var4, class223.field4210[arg0]);
        }
        if (var7 == 37) {
            class131 var18 = class10.field172[var4];
            if (var18 != null) {
                class162.method1130(2, 1, var18.field3870[0], var18.field3892[0], (byte) 36, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
                class7.field98 = class195.field3737;
                class97.field1921 = class81.field1630;
                class72.field1437++;
                class10.field208 = 0;
                class92.field1852 = 2;
                class7.field120.method32(171, 12885);
                class7.field120.method994(arg1 - 65, var4);
            }
        }
        if (var7 == 48) {
            class224.field4240++;
            boolean var19 = class162.method1130(2, 0, var2, var3, (byte) -116, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 0);
            if (!var19) {
                class162.method1130(2, 1, var2, var3, (byte) -116, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
            }
            class7.field98 = class195.field3737;
            class10.field208 = 0;
            class92.field1852 = 2;
            class97.field1921 = class81.field1630;
            class7.field120.method32(7, 12885);
            class7.field120.method1004(-120, class83.field1644 + var3);
            class7.field120.method1009(46, var4);
            class7.field120.method1004(arg1 - 56, class83.field1649 + var2);
        }
        if (var7 == 28) {
            class7.field120.method32(139, 12885);
            class7.field120.method986(var3, false);
            class37.field742++;
            class7.field120.method1004(arg1 ^ 0x5C, var2);
            class7.field120.method1004(-121, var4);
            class90.field1799 = 0;
            class191.field3693 = class192.method1268(var3, -78);
            class17.field300 = var2;
        }
        if (var7 == 36) {
            class170 var21 = class204.method1352(var2, (byte) 56, var3);
            if (var21 != null) {
                class35.method246(arg1 - 89);
                class6.method38(var3, class54.method365(class26.method180(var21, 18125), false), var2, (byte) 69);
                class29.field568 = 0;
                class4.field45 = class41.method270((byte) -11, var21);
                if (class4.field45 == null) {
                    class4.field45 = class165.field3203;
                }
                if (!var21.field3305) {
                    class185.field3607 = class220.method1422(new class141[] { class197.field3762, var21.field3341, class57.field1095 }, -3);
                    return;
                }
                class185.field3607 = class220.method1422(new class141[] { var21.field3352, class57.field1095 }, -3);
            }
            return;
        }
        if (var7 == 58) {
            class53.field1010++;
            class7.field120.method32(199, arg1 + 12922);
            class7.field120.method1004(-91, var2);
            class7.field120.method986(var3, false);
            class7.field120.method1009(arg1 + 106, var4);
            class90.field1799 = 0;
            class191.field3693 = class192.method1268(var3, -126);
            class17.field300 = var2;
        }
        if (var7 == 43) {
            class202.method1343(class66.field1287, var2, var3);
        }
        if (var7 == 25) {
            class224.field4237++;
            class7.field120.method32(218, 12885);
            class7.field120.method970(var3, (byte) -33);
            class170 var22 = class192.method1268(var3, -112);
            if (var22.field3300 != null && var22.field3300[0][0] == 5) {
                int var23 = var22.field3300[0][1];
                if (class180.field3538[var23] != var22.field3403[0]) {
                    class180.field3538[var23] = var22.field3403[0];
                    class69.method455((byte) -122, var23);
                }
            }
        }
        if (var7 == 38) {
            class152.field2915++;
            boolean var24 = class162.method1130(2, 0, var2, var3, (byte) -118, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 0);
            if (!var24) {
                class162.method1130(2, 1, var2, var3, (byte) 83, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
            }
            class7.field98 = class195.field3737;
            class92.field1852 = 2;
            class97.field1921 = class81.field1630;
            class10.field208 = 0;
            class7.field120.method32(8, 12885);
            class7.field120.method972(arg1 ^ 0xFFFF96D5, var4);
            class7.field120.method1009(-115, class83.field1649 + var2);
            class7.field120.method1004(-94, class6.field71);
            class7.field120.method964(class16.field285, -2100837416);
            class7.field120.method1009(arg1 ^ 0xFFFFFF94, class132.field2514);
            class7.field120.method1004(-117, class83.field1644 + var3);
        }
        if (var7 == 22) {
            class123.field2352++;
            class7.field120.method32(234, 12885);
            class7.field120.method964(class158.field3054, -2100837416);
            class7.field120.method986(var3, false);
            class7.field120.method1009(-114, class128.field2436);
            class7.field120.method972(26894, var2);
        }
        if (var7 == 21) {
            class179.field3529++;
            class7.field120.method32(56, 12885);
            class7.field120.method986(var3, false);
            class7.field120.method972(26894, class6.field71);
            class7.field120.method994(arg1 - 81, class132.field2514);
            class7.field120.method975(class16.field285, 1198513704);
            class7.field120.method1004(-103, var4);
            class7.field120.method994(arg1 - 80, var2);
            class90.field1799 = 0;
            class191.field3693 = class192.method1268(var3, -123);
            class17.field300 = var2;
        }
        if (var7 == 12) {
            class190.method1262(arg1 + 108015605);
        }
        if (var7 == 49) {
            class7.field120.method32(36, 12885);
            class7.field120.method1004(-91, var2);
            class159.field3079++;
            class7.field120.method975(var3, 1198513704);
            class7.field120.method972(26894, var4);
            class90.field1799 = 0;
            class191.field3693 = class192.method1268(var3, -107);
            class17.field300 = var2;
        }
        if (var7 == 1) {
            class31.field626++;
            class7.field120.method32(143, 12885);
            class7.field120.method994(arg1 - 79, var2);
            class7.field120.method975(var3, 1198513704);
            class7.field120.method972(26894, var4);
            class90.field1799 = 0;
            class191.field3693 = class192.method1268(var3, arg1 ^ 0x11);
            class17.field300 = var2;
        }
        if (var7 == 18) {
            class131 var26 = class10.field172[var4];
            if (var26 != null) {
                class162.method1130(2, 1, var26.field3870[0], var26.field3892[0], (byte) 97, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
                class97.field1921 = class81.field1630;
                class92.field1852 = 2;
                class7.field98 = class195.field3737;
                class10.field208 = 0;
                class7.field120.method32(86, 12885);
                class7.field120.method1004(arg1 - 90, var4);
                class203.field3842++;
            }
        }
        if (var7 == 2) {
            class38 var27 = class116.field2231[var4];
            if (var27 != null) {
                class88.field1755++;
                class162.method1130(2, 1, var27.field3870[0], var27.field3892[0], (byte) 85, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
                class7.field98 = class195.field3737;
                class97.field1921 = class81.field1630;
                class10.field208 = 0;
                class92.field1852 = 2;
                class7.field120.method32(32, arg1 + 12922);
                class7.field120.method1004(-127, var4);
            }
        }
        if (var7 == 39) {
            class170 var28 = class192.method1268(var3, -64);
            boolean var29 = true;
            if (var28.field3314 > 0) {
                var29 = class118.method768(var28, false);
            }
            if (var29) {
                class224.field4237++;
                class7.field120.method32(218, 12885);
                class7.field120.method970(var3, (byte) 90);
            }
        }
        if (var7 == 57) {
            class141.field2694++;
            boolean var30 = class162.method1130(2, 0, var2, var3, (byte) -110, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 0);
            if (!var30) {
                class162.method1130(2, 1, var2, var3, (byte) 78, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
            }
            class97.field1921 = class81.field1630;
            class10.field208 = 0;
            class7.field98 = class195.field3737;
            class92.field1852 = 2;
            class7.field120.method32(216, 12885);
            class7.field120.method1009(66, var4);
            class7.field120.method972(26894, class83.field1644 + var3);
            class7.field120.method994(-127, class83.field1649 + var2);
        }
        if (var7 == 1005) {
            class92.field1852 = 2;
            class10.field208 = 0;
            class97.field1921 = class81.field1630;
            class7.field98 = class195.field3737;
            class7.field120.method32(59, 12885);
            class7.field120.method994(-105, var4);
            class38.field747++;
        }
        if (var7 == 16) {
            class38 var32 = class116.field2231[var4];
            if (var32 != null) {
                class118.field2301++;
                class162.method1130(2, 1, var32.field3870[0], var32.field3892[0], (byte) 9, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
                class10.field208 = 0;
                class97.field1921 = class81.field1630;
                class92.field1852 = 2;
                class7.field98 = class195.field3737;
                class7.field120.method32(232, arg1 ^ 0xFFFFCD8E);
                class7.field120.method1009(-112, var4);
            }
        }
        if (var7 == 47 && class123.method798(var2, var5, 11, var3)) {
            class170.field3331++;
            class7.field120.method32(148, 12885);
            class7.field120.method994(-120, class83.field1644 + var3);
            class7.field120.method972(26894, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class7.field120.method1004(-98, class83.field1649 + var2);
            class7.field120.method1004(arg1 - 77, class6.field71);
            class7.field120.method975(class16.field285, arg1 + 1198513741);
            class7.field120.method1004(-103, class132.field2514);
        }
        if (var7 == 45) {
            class136.field2599++;
            boolean var33 = class162.method1130(2, 0, var2, var3, (byte) 65, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 0);
            if (!var33) {
                class162.method1130(2, 1, var2, var3, (byte) 81, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
            }
            class97.field1921 = class81.field1630;
            class10.field208 = 0;
            class7.field98 = class195.field3737;
            class92.field1852 = 2;
            class7.field120.method32(211, 12885);
            class7.field120.method972(26894, var3 + class83.field1644);
            class7.field120.method994(arg1 ^ 0x55, var2 + class83.field1649);
            class7.field120.method994(-120, var4);
        }
        if (var7 == 32) {
            class131 var35 = class10.field172[var4];
            if (var35 != null) {
                class162.method1130(2, 1, var35.field3870[0], var35.field3892[0], (byte) -110, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
                class147.field2879++;
                class92.field1852 = 2;
                class10.field208 = 0;
                class7.field98 = class195.field3737;
                class97.field1921 = class81.field1630;
                class7.field120.method32(189, arg1 + 12922);
                class7.field120.method986(class158.field3054, false);
                class7.field120.method994(-121, class128.field2436);
                class7.field120.method994(-123, var4);
            }
        }
        if (var7 == 35 && class181.field3555 == null) {
            class58.method395(var2, var3, (byte) 119);
            class181.field3555 = class204.method1352(var2, (byte) 56, var3);
            class38.method252(class181.field3555, -97);
        }
        if (var7 == 40) {
            class38 var36 = class116.field2231[var4];
            if (var36 != null) {
                class83.field1665++;
                class162.method1130(2, 1, var36.field3870[0], var36.field3892[0], (byte) -126, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
                class97.field1921 = class81.field1630;
                class10.field208 = 0;
                class7.field98 = class195.field3737;
                class92.field1852 = 2;
                class7.field120.method32(90, 12885);
                class7.field120.method994(-112, var4);
            }
        }
        if (var7 == 17) {
            class123.method798(var2, var5, 11, var3);
            class73.field1463++;
            class7.field120.method32(217, 12885);
            class7.field120.method972(26894, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class7.field120.method994(arg1 ^ 0x4D, var3 + class83.field1644);
            class7.field120.method972(26894, class83.field1649 + var2);
        }
        if (var7 == 41) {
            class38 var37 = class116.field2231[var4];
            if (var37 != null) {
                class20.field341++;
                class162.method1130(2, 1, var37.field3870[0], var37.field3892[0], (byte) -109, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
                class7.field98 = class195.field3737;
                class92.field1852 = 2;
                class10.field208 = 0;
                class97.field1921 = class81.field1630;
                class7.field120.method32(229, 12885);
                class7.field120.method994(-125, var4);
                class7.field120.method972(26894, class132.field2514);
                class7.field120.method986(class16.field285, false);
                class7.field120.method1009(-114, class6.field71);
            }
        }
        if (var7 == 20) {
            class130.field2492++;
            class7.field120.method32(98, arg1 + 12922);
            class7.field120.method964(var3, -2100837416);
            class7.field120.method1004(arg1 ^ 0x55, var2);
            class7.field120.method975(class158.field3054, arg1 ^ 0xB89021F3);
            class7.field120.method994(-118, class128.field2436);
            class7.field120.method1004(arg1 - 85, var4);
            class90.field1799 = 0;
            class191.field3693 = class192.method1268(var3, -74);
            class17.field300 = var2;
        }
        if (var7 == 1007) {
            class220.field4171++;
            class123.method798(var2, var5, 11, var3);
            class7.field120.method32(119, 12885);
            class7.field120.method972(26894, class83.field1649 + var2);
            class7.field120.method994(arg1 ^ 0x5B, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class7.field120.method1009(arg1 + 75, var3 - -class83.field1644);
        }
        if (var7 == 29) {
            class38 var38 = class116.field2231[var4];
            if (var38 != null) {
                class162.method1130(2, 1, var38.field3870[0], var38.field3892[0], (byte) -124, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
                class97.field1921 = class81.field1630;
                class174.field3463++;
                class92.field1852 = 2;
                class7.field98 = class195.field3737;
                class10.field208 = 0;
                class7.field120.method32(78, 12885);
                class7.field120.method994(-108, var4);
            }
        }
        if (var7 == 50) {
            class7.field120.method32(218, 12885);
            class7.field120.method970(var3, (byte) 113);
            class224.field4237++;
            class170 var39 = class192.method1268(var3, arg1 ^ 0x4F);
            if (var39.field3300 != null && var39.field3300[0][0] == 5) {
                int var40 = var39.field3300[0][1];
                class180.field3538[var40] = 1 - class180.field3538[var40];
                class69.method455((byte) -102, var40);
            }
        }
        if (var7 == 26) {
            class27.field517++;
            boolean var41 = class162.method1130(2, 0, var2, var3, (byte) 61, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 0);
            if (!var41) {
                class162.method1130(2, 1, var2, var3, (byte) -120, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
            }
            class10.field208 = 0;
            class7.field98 = class195.field3737;
            class92.field1852 = 2;
            class97.field1921 = class81.field1630;
            class7.field120.method32(42, 12885);
            class7.field120.method970(class158.field3054, (byte) 55);
            class7.field120.method994(-122, var2 + class83.field1649);
            class7.field120.method1004(arg1 ^ 0x7B, var3 + class83.field1644);
            class7.field120.method972(26894, class128.field2436);
            class7.field120.method994(-106, var4);
        }
        if (var7 == 44) {
            class38 var43 = class116.field2231[var4];
            if (var43 != null) {
                class202.field3810++;
                class162.method1130(2, 1, var43.field3870[0], var43.field3892[0], (byte) -106, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
                class10.field208 = 0;
                class97.field1921 = class81.field1630;
                class7.field98 = class195.field3737;
                class92.field1852 = 2;
                class7.field120.method32(200, 12885);
                class7.field120.method994(-124, var4);
            }
        }
        if (var7 == 34) {
            boolean var44 = class162.method1130(2, 0, var2, var3, (byte) -115, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 0);
            if (!var44) {
                class162.method1130(2, 1, var2, var3, (byte) 109, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
            }
            class97.field1921 = class81.field1630;
            class10.field208 = 0;
            class92.field1852 = 2;
            class114.field2181++;
            class7.field98 = class195.field3737;
            class7.field120.method32(224, 12885);
            class7.field120.method994(arg1 - 74, var4);
            class7.field120.method1004(-126, var3 + class83.field1644);
            class7.field120.method1004(-98, class83.field1649 + var2);
        }
        if (var7 == 9) {
            class131 var46 = class10.field172[var4];
            if (var46 != null) {
                class57.field1111++;
                class162.method1130(2, 1, var46.field3870[0], var46.field3892[0], (byte) 36, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
                class92.field1852 = 2;
                class97.field1921 = class81.field1630;
                class7.field98 = class195.field3737;
                class10.field208 = 0;
                class7.field120.method32(188, 12885);
                class7.field120.method1009(57, var4);
            }
        }
        if (var7 == 19) {
            class38 var47 = class116.field2231[var4];
            if (var47 != null) {
                class162.method1130(2, 1, var47.field3870[0], var47.field3892[0], (byte) 89, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
                class92.field1852 = 2;
                class7.field98 = class195.field3737;
                class97.field1921 = class81.field1630;
                class10.field208 = 0;
                class16.field286++;
                class7.field120.method32(37, 12885);
                class7.field120.method1004(-108, var4);
            }
        }
        if (var7 == 33) {
            class7.field120.method32(174, 12885);
            class7.field120.method986(var3, false);
            class215.field4099++;
            class7.field120.method972(26894, var4);
            class7.field120.method1004(arg1 ^ 0x43, var2);
            class90.field1799 = 0;
            class191.field3693 = class192.method1268(var3, -87);
            class17.field300 = var2;
        }
        if (var7 == 13) {
            boolean var48 = class162.method1130(2, 0, var2, var3, (byte) -127, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 0);
            class184.field3597++;
            if (!var48) {
                class162.method1130(2, 1, var2, var3, (byte) 94, false, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 1);
            }
            class7.field98 = class195.field3737;
            class92.field1852 = 2;
            class10.field208 = 0;
            class97.field1921 = class81.field1630;
            class7.field120.method32(180, 12885);
            class7.field120.method1009(3, class83.field1644 + var3);
            class7.field120.method1004(-107, var4);
            class7.field120.method994(-117, class83.field1649 + var2);
        }
        if (class29.field568 != 0) {
            class29.field568 = 0;
            class38.method252(class192.method1268(class16.field285, -88), -110);
        }
        if (class61.field1194) {
            class35.method246(-107);
        }
        if (class191.field3693 != null && class90.field1799 == 0) {
            class38.method252(class191.field3693, -106);
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1547 = arg6;
        this.field1538 = arg5;
        this.field1543 = arg3;
        this.field1539 = arg4;
        this.field1540 = arg1;
        this.field1534 = arg0;
        this.field1553 = arg2;
    }
}
