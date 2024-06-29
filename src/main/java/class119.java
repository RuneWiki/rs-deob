import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class119 extends class26 {

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "[Lco;")
    public class294[] field1549 = new class294[5];

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "[I")
    public int[] field1568 = new int[5];

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    public int field1560 = 0;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    public int field1561;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    public int field1569;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1545 = "flash1:";

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "[Leg;")
    public static class314[] field1576 = new class314[14];

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "Lic;")
    public static class329 field1570 = new class329(16);

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "B")
    public byte field1547;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "I")
    public int field1557;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    public int field1562;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
    public int field1563;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public int field1573;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
    public int field1575;

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "Lqf;")
    public class104 field1550;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "Lnh;")
    public class119 field1571;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "Lvf;")
    public class183 field1558;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "Lvk;")
    public static class188 field1554;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "Lve;")
    public class231 field1552;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "Lto;")
    public class244 field1567;

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "Ldm;")
    public class24 field1577;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "Llb;")
    public class359 field1572;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "Lvl;")
    public class66 field1566;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "Z")
    public boolean field1548;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "Z")
    public boolean field1555;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "Z")
    public boolean field1574;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "[I")
    public static int[] field1578;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)I", line = 4)
    public static final int method866(boolean arg0, int arg1) {
        field1546++;
        return arg0 ? arg1 & 0xFF : -12;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(III)V", line = 13)
    public class119(int arg0, int arg1, int arg2) {
        this.field1569 = this.field1561 = arg0;
        this.field1556 = arg1;
        this.field1553 = arg2;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lvc;III)V", line = 30)
    public static final void method867(class260 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class66.field847) {
            class119 var4 = class345.field5367[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1577 != null && var4.field1577.field269.method950()) {
                arg0.method962(var4.field1577.field269, 128, 0, 0, true);
            }
        }
        if (arg3 < class66.field847) {
            class119 var5 = class345.field5367[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1577 != null && var5.field1577.field269.method950()) {
                arg0.method962(var5.field1577.field269, 0, 0, 128, true);
            }
        }
        if (arg2 < class66.field847 && arg3 < class300.field4413) {
            class119 var6 = class345.field5367[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1577 != null && var6.field1577.field269.method950()) {
                arg0.method962(var6.field1577.field269, 128, 0, 128, true);
            }
        }
        if (arg2 < class66.field847 && arg3 > 0) {
            class119 var7 = class345.field5367[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1577 != null && var7.field1577.field269.method950()) {
                arg0.method962(var7.field1577.field269, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 77)
    public static final void method868(int arg0, String arg1, String arg2, String arg3, int arg4) {
        class65.method474(arg1, arg4, arg2, arg0, arg3, 0);
        field1559++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I", line = 88)
    public static final int method869(int arg0, int arg1) {
        field1565++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1 != 14005) {
            method866(false, 7);
        }
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)Lg;", line = 110)
    public static final class42 method870(byte arg0) {
        field1564++;
        class42 var1 = (class42) class276.field3959.method739((byte) 64);
        if (var1 != null) {
            var1.method179((byte) 51);
            var1.method1556(255);
            return var1;
        }
        int var2 = -11 % ((arg0) / 53);
        class42 var3;
        do {
            var3 = (class42) class315.field4641.method739((byte) 117);
            if (var3 == null) {
                return null;
            }
            if (var3.method309(-92) > class6.method37(10828)) {
                return null;
            }
            var3.method179((byte) 51);
            var3.method1556(255);
        } while ((var3.field3011 & Long.MIN_VALUE) == 0L);
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V", line = 164)
    public static void method871(int arg0) {
        field1578 = null;
        field1570 = null;
        field1554 = null;
        field1545 = null;
        if (arg0 != 14888) {
            field1576 = (class314[]) null;
        }
        field1576 = null;
    }
}
