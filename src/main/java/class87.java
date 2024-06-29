import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class87 extends class68 {

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "Lae;")
    public static class6 field2084 = class64.method474(107, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "[I")
    public static int[] field2081 = new int[2048];

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
    public static int field2091 = 0;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    public static int field2095 = -1;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public static int field2083 = 0;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public static int field2088 = 0;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "Lae;")
    public static class6 field2101 = class64.method474(116, "::qa_op_test");

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    public static int field2085 = 0;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
    public static int field2098 = 0;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    public static int field2102 = 0;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
    public int field2094;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "Lvb;")
    public class129 field2090;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "Lba;")
    public class8 field2093;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "[B")
    public byte[] field2086;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "[[[I")
    public static int[][][] field2097;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZ[BZ)V", line = 20)
    public static final void method737(int arg0, boolean arg1, byte[] arg2, boolean arg3) {
        if (arg3) {
            field2084 = null;
        }
        field2089++;
        if (class108.field2590 == null) {
            return;
        }
        if (class49.field1094 >= 0) {
            class108.field2590.method365(false);
            class49.field1094 = -1;
            class130.field3160 = 0;
            class51.field1155 = null;
            field2102 = 20;
        }
        if (arg2 == null) {
            return;
        }
        if (field2102 > 0) {
            class108.field2590.method363(arg0, (byte) 58);
            field2102 = 0;
        }
        class49.field1094 = arg0;
        class108.field2590.method361(arg0, arg2, (byte) 84, arg1);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 56)
    public static final void method738(byte arg0) {
        field2099++;
        class52.method415(class72.field1649, (byte) 108);
        if (class32.field801 != -1) {
            class52.method415(class32.field801, (byte) 116);
        }
        class82.field2005 = 0;
        if (arg0 >= -125) {
            return;
        }
        class60.field1313.method941(10);
        class77.field1805 = class29.method258(class77.field1805);
        class74.method590();
        class95.method784(503, 765, 0, class72.field1649, 0, -1, 0);
        if (class32.field801 != -1) {
            class95.method784(503, 765, 0, class32.field801, 0, -1, 0);
        }
        if (class125.field3052) {
            class4.method20(-112);
        } else {
            class6.method66(18);
            class59.method438(-23401);
        }
        try {
            Graphics var1 = class70.field1564.getGraphics();
            class60.field1313.method1(-128, var1, 0, 0);
        } catch (Exception var2) {
            class70.field1564.repaint();
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(Z)V", line = 96)
    public static void method739(boolean arg0) {
        field2084 = null;
        field2081 = null;
        field2097 = null;
        field2101 = null;
        if (arg0) {
            method742(59, 39, 14);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lbf;II)Lva;", line = 113)
    public static final class128 method740(class14 arg0, int arg1, int arg2) {
        field2082++;
        if (arg1 > -19) {
            return null;
        } else if (class47.method387(arg0, arg2, 84)) {
            return class116.method956(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLbf;)I", line = 137)
    public static final int method741(byte arg0, class14 arg1) {
        field2096++;
        int var2 = 0;
        if (arg1.method147(22411, class54.field1187, class103.field2424)) {
            var2++;
        }
        if (arg1.method147(22411, class54.field1187, class79.field1908)) {
            var2++;
        }
        if (arg1.method147(22411, class54.field1187, class60.field1312)) {
            var2++;
        }
        if (arg1.method147(22411, class54.field1187, class116.field2731)) {
            var2++;
        }
        if (arg1.method147(22411, class54.field1187, class54.field1202)) {
            var2++;
        }
        if (arg1.method147(22411, class54.field1187, class12.field226)) {
            var2++;
        }
        if (arg1.method147(22411, class54.field1187, class117.field2788)) {
            var2++;
        }
        if (arg1.method147(arg0 ^ 0xFFFFA84A, class54.field1187, class137.field3324)) {
            var2++;
        }
        if (arg1.method147(22411, class54.field1187, class26.field660)) {
            var2++;
        }
        if (arg1.method147(22411, class54.field1187, class70.field1553)) {
            var2++;
        }
        if (arg1.method147(22411, class54.field1187, class102.field2398)) {
            var2++;
        }
        if (arg1.method147(22411, class54.field1187, class134.field3274)) {
            var2++;
        }
        if (arg0 != -63) {
            method739(false);
        }
        if (arg1.method147(22411, class54.field1187, class52.field1185)) {
            var2++;
        }
        if (arg1.method147(22411, class54.field1187, class79.field1931)) {
            var2++;
        }
        if (arg1.method147(22411, class54.field1187, class117.field2769)) {
            var2++;
        }
        if (arg1.method147(arg0 + 22474, class54.field1187, class2.field5)) {
            var2++;
        }
        if (arg1.method147(22411, class54.field1187, class107.field2533)) {
            var2++;
        }
        if (arg1.method147(22411, class54.field1187, class111.field2665)) {
            var2++;
        }
        if (arg1.method147(22411, class54.field1187, class138.field3355)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)Z", line = 223)
    public static final boolean method742(int arg0, int arg1, int arg2) {
        field2100++;
        class107 var3 = class80.method687(arg2, (byte) 89);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg0 != 0) {
            field2101 = null;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method907(127, arg1);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)V", line = 284)
    public static final void method743(int arg0, int arg1) {
        field2080++;
        class136 var2 = (class136) class20.field389.method276((byte) -19, (long) arg0);
        if (var2 != null && arg1 >= 60) {
            for (int var3 = 0; var3 < var2.field3312.length; var3++) {
                var2.field3312[var3] = -1;
                var2.field3311[var3] = 0;
            }
        }
    }
}
