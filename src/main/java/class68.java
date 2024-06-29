import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class68 extends class97 {

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "Z")
    public static boolean field1711 = false;

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "I")
    public static int field1719 = 0;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "Lwb;")
    public static class148 field1700 = new class148(new byte[5000]);

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "Lwd;")
    private static class150 field1721 = class2.method9(true, "Select");

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "Lwd;")
    public static class150 field1722 = field1721;

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "Li;")
    public static class56 field1720 = new class56(64);

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "Z")
    public static boolean field1723 = false;

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "I")
    public static int field1725 = -1;

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "I")
    public static int field1724 = 0;

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "Lwd;")
    public static class150 field1726 = class2.method9(true, "p12_full");

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "Lwd;")
    public static class150 field1727 = null;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public int field1698;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public int field1699;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    public int field1708;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
    public int field1709;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
    public int field1710;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
    public int field1712;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "I")
    public int field1713;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
    public int field1714;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "I")
    public int field1716;

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "I")
    public int field1717;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "Lra;")
    public class117 field1705;

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "Lra;")
    public class117 field1718;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "Lie;")
    public class61 field1706;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "[I")
    public int[] field1703;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public final void method519(int arg0) {
        field1702++;
        int var2 = this.field1717;
        class61 var3 = this.field1706.method479((byte) -55);
        if (arg0 < 114) {
            method520(-2, -66);
        }
        if (var3 == null) {
            this.field1712 = 0;
            this.field1717 = -1;
            this.field1703 = null;
            this.field1714 = 0;
            this.field1698 = 0;
        } else {
            this.field1703 = var3.field1600;
            this.field1698 = var3.field1536 * 128;
            this.field1714 = var3.field1585;
            this.field1712 = var3.field1549;
            this.field1717 = var3.field1580;
        }
        if (this.field1717 != var2 && this.field1705 != null) {
            class146.field3541.method660(this.field1705);
            this.field1705 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
    public static final void method520(int arg0, int arg1) {
        class9.method57(-72, arg0);
        class11.method73((byte) 121, arg0);
        field1697++;
        if (arg1 != 2) {
            method524(-114, (byte) 38);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILwd;ZILwd;I)V")
    public static final void method521(int arg0, int arg1, class150 arg2, boolean arg3, int arg4, class150 arg5, int arg6) {
        if (class125.field2900 < 500) {
            if (arg5.method1174((byte) -123) <= 0) {
                class2.field50[class125.field2900] = arg2;
            } else {
                class2.field50[class125.field2900] = class111.method786((byte) -114, new class150[] { arg2, class50.field1369, arg5 });
            }
            class66.field1687[class125.field2900] = arg1;
            class9.field205[class125.field2900] = arg0;
            class91.field2115[class125.field2900] = arg4;
            class116.field2663[class125.field2900] = arg6;
            class125.field2900++;
        }
        field1715++;
        if (arg3) {
            field1727 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lv;ILv;)V")
    public static final void method522(class140 arg0, int arg1, class140 arg2) {
        field1707++;
        if (class97.field2227) {
            class49.method371(1, arg0, arg2);
            return;
        }
        if (class137.field3209 == 0 || class137.field3209 == 5) {
            byte var3 = 20;
            arg0.method1052(class83.field1987, 382, 245 - var3, 16777215);
            int var4 = 253 - var3;
            class120.method866(230, var4, 304, 34, 9179409);
            class120.method866(231, var4 + 1, 302, 32, 0);
            class120.method872(232, var4 + 2, class46.field1234 * 3, 30, 9179409);
            class120.method872(class46.field1234 * 3 + 232, var4 + 2, 300 - class46.field1234 * 3, 30, 0);
            arg0.method1052(class94.field2181, 382, 276 - var3, 16777215);
        }
        if (class137.field3209 == 20) {
            class92.field2145.method803(382 - class92.field2145.field2653 / 2, -(class92.field2145.field2647 / 2) + 271);
            short var5 = 211;
            arg0.method1055(class94.field2169, 382, var5, 16776960, true);
            int var23 = var5 + 15;
            arg0.method1055(class94.field2186, 382, var23, 16776960, true);
            int var24 = var23 + 15;
            arg0.method1055(class94.field2188, 382, var24, 16776960, true);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg0.method1047(class111.method786((byte) -112, new class150[] { class97.field2221, class94.field2171 }), 292, var26, 16777215, true);
            int var28 = var26 + 15;
            arg0.method1047(class111.method786((byte) -115, new class150[] { class18.field491, class94.field2190.method1184(true) }), 294, var28, 16777215, true);
            int var29 = var28 + 15;
        }
        if (class137.field3209 == 10) {
            class92.field2145.method803(202, 171);
            if (class147.field3563 == 0) {
                short var6 = 251;
                arg0.method1055(class127.field2936, 382, var6, 16776960, true);
                int var27 = var6 + 30;
                short var7 = 302;
                short var8 = 291;
                class82.field1980.method803(var7 - 73, var8 + -20);
                arg0.method1040(class21.field570, var7 - 73, var8 + -20, 144, 40, 16777215, true, 1, 1, 0);
                short var9 = 462;
                class82.field1980.method803(var9 - 73, var8 + -20);
                arg0.method1040(class147.field3567, var9 - 73, var8 + -20, 144, 40, 16777215, true, 1, 1, 0);
            } else if (class147.field3563 == 2) {
                short var13 = 211;
                arg0.method1055(class94.field2169, 382, var13, 16776960, true);
                int var34 = var13 + 15;
                arg0.method1055(class94.field2186, 382, var34, 16776960, true);
                short var14 = 321;
                int var35 = var34 + 15;
                short var15 = 302;
                arg0.method1055(class94.field2188, 382, var35, 16776960, true);
                int var36 = var35 + 15;
                int var37 = var36 + 10;
                arg0.method1047(class111.method786((byte) -114, new class150[] { class97.field2221, class94.field2171, class113.field2643 == 0 & class11.field280 % 40 < 20 ? class108.field2439 : class94.field2178 }), 292, var37, 16777215, true);
                int var38 = var37 + 15;
                arg0.method1047(class111.method786((byte) 43, new class150[] { class18.field491, class94.field2190.method1184(true), class113.field2643 == 1 & class11.field280 % 40 < 20 ? class108.field2439 : class94.field2178 }), 294, var38, 16777215, true);
                int var39 = var38 + 15;
                class82.field1980.method803(var15 - 73, var14 + -20);
                arg0.method1055(class105.field2375, var15, var14 + 5, 16777215, true);
                short var16 = 462;
                class82.field1980.method803(var16 - 73, var14 + -20);
                arg0.method1055(class83.field2006, var16, var14 + 5, 16777215, true);
            } else if (class147.field3563 == 3) {
                short var10 = 236;
                short var11 = 382;
                short var12 = 321;
                arg0.method1055(class61.field1587, 382, 211, 16776960, true);
                arg0.method1055(class104.field2354, 382, var10, 16777215, true);
                int var30 = var10 + 15;
                arg0.method1055(class25.field743, 382, var30, 16777215, true);
                int var31 = var30 + 15;
                arg0.method1055(class88.field2077, 382, var31, 16777215, true);
                int var32 = var31 + 15;
                arg0.method1055(class144.field3477, 382, var32, 16777215, true);
                class82.field1980.method803(var11 - 73, var12 - 20);
                int var33 = var32 + 15;
                arg0.method1055(class83.field2006, var11, var12 + 5, 16777215, true);
            }
        }
        if (class26.field791 > 0) {
            class14.method106(class26.field791, (byte) 122);
            class26.field791 = 0;
        }
        class142.method1078(arg1 - 725);
        class56.field1452[class23.field665 ? 1 : 0].method803(arg1, 463);
        if (class137.field3209 > 5 && class29.field873 != 2 && class96.field2218 == 0) {
            if (class131.field3102 == null) {
                class131.field3102 = class86.method617(class20.field525, (byte) -109, class66.field1677, class94.field2178);
            } else {
                byte var17 = 5;
                byte var18 = 35;
                short var19 = 463;
                byte var20 = 100;
                class131.field3102.method803(var17, var19);
                arg0.method1055(class111.method786((byte) -114, new class150[] { class17.field460, class20.field516, class29.method239(1000, class128.field3028) }), var20 / 2 + var17, var18 / 2 + var19 - 2, 16777215, true);
                if (class125.field2897 == null) {
                    arg2.method1055(class37.field1031, var17 + var20 / 2, var19 - (-(var18 / 2) - 12), 16777215, true);
                } else {
                    arg2.method1055(class144.field3487, var20 / 2 + var17, var18 / 2 + var19 + 12, 16777215, true);
                }
            }
        }
        try {
            Graphics var21 = class142.field3439.getGraphics();
            class21.field583.method287(var21, true, 0, 0);
        } catch (Exception var22) {
            class142.field3439.repaint();
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    public static void method523(boolean arg0) {
        field1700 = null;
        field1720 = null;
        field1721 = null;
        field1722 = null;
        field1726 = null;
        field1727 = null;
        if (!arg0) {
            method522(null, 27, null);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)I")
    public static final int method524(int arg0, byte arg1) {
        field1701++;
        if (arg1 >= -14) {
            return -40;
        }
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return var2 + arg0;
    }
}
