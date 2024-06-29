import java.awt.Container;
import java.awt.Insets;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class227 extends class34 {

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "[I")
    public static int[] field4135 = new int[256];

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4145;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "Lcc;")
    private static class209 field4150;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Lcc;")
    public static class209 field4151;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public int field4130;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public int field4131;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public int field4142;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public int field4144;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public int field4147;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "Lcc;")
    public class209 field4139;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Lji;")
    public class42 field4136;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "Lji;")
    public class42 field4143;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "Lwj;")
    public static class6 field4148;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "Z")
    public boolean field4132;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "[Lcc;")
    public static class209[] field4146;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "[Ljava/lang/Object;")
    public Object[] field4134;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILtf;)V")
    public static final void method1591(int arg0, class106 arg1) {
        field4140++;
        for (int var2 = 0; var2 < class215.field3891; var2++) {
            int var4 = arg1.method760(255);
            int var5 = arg1.method736(122);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class62.field1232[var4] != null) {
                class62.field1232[var4].field2380 = var5;
            }
        }
        int var3 = -92 / ((arg0 - 67) / 49);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method1592(byte arg0) {
        field4145 = null;
        field4148 = null;
        field4150 = null;
        int var1 = 104 % ((18 - arg0) / 32);
        field4151 = null;
        field4146 = null;
        field4135 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)V")
    public static final void method1593(int arg0, int arg1, int arg2, int arg3) {
        field4137++;
        class209 var4 = class229.method1604(new class209[] { class68.field1308, class66.method485(arg0, (byte) 41), class197.field3530, class66.method485(arg2 >> 6, (byte) 46), class197.field3530, class66.method485(arg1 >> 6, (byte) 81), class197.field3530, class66.method485(arg2 & 0x3F, (byte) 72), class197.field3530, class66.method485(arg1 & 0x3F, (byte) 50) }, (byte) 34);
        if (arg3 <= 16) {
            method1592((byte) -21);
        }
        var4.method1464(89);
        class13.method98(var4, true);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLsj;)I")
    public static final int method1594(byte arg0, class49 arg1) {
        int var2 = 0;
        if (arg0 != 48) {
            return 72;
        }
        field4133++;
        if (arg1.method351((byte) 67, class110.field2220)) {
            var2++;
        }
        if (arg1.method351((byte) -111, class72.field1355)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
    public static final void method1595(byte arg0) {
        field4138++;
        if (arg0 != 40) {
            method1593(-87, -111, -118, 33);
        }
        Container var1;
        if (class84.field1682 != null) {
            var1 = class84.field1682;
        } else if (class230.field4176 == null) {
            var1 = class230.field4187.field2638;
        } else {
            var1 = class230.field4176;
        }
        class117.field2337 = var1.getSize().width;
        class234.field4220 = var1.getSize().height;
        if (class230.field4176 == var1) {
            Insets var2 = class230.field4176.getInsets();
            class234.field4220 -= var2.top + var2.bottom;
            class117.field2337 -= var2.right + var2.left;
        }
        if (class258.method1788(-127) >= 2) {
            class25.field442 = class117.field2337;
            class50.field989 = 0;
            class209.field3779 = 0;
            class50.field981 = class234.field4220;
        } else {
            class25.field442 = 765;
            class50.field981 = 503;
            class209.field3779 = (class117.field2337 - 765) / 2;
            class50.field989 = 0;
        }
        class122.field2411.setSize(class25.field442, class50.field981);
        if (class230.field4176 == var1) {
            Insets var3 = class230.field4176.getInsets();
            class122.field2411.setLocation(class209.field3779 + var3.left, class50.field989 + var3.top);
        } else {
            class122.field2411.setLocation(class209.field3779, class50.field989);
        }
        if (class149.field2727 != -1) {
            class141.method980(arg0 + 69, true);
        }
        class3.method17((byte) -66);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZLde;I)V")
    public static final void method1596(int arg0, boolean arg1, class108 arg2, int arg3) {
        if (arg1) {
            return;
        }
        field4141++;
        if (arg2.field1541 == arg3 && arg3 != -1) {
            class241 var4 = class245.method1706(arg3, (byte) 120);
            int var5 = var4.field4367;
            if (var5 == 1) {
                arg2.field1566 = 0;
                arg2.field1539 = arg0;
                arg2.field1521 = 0;
                arg2.field1506 = 0;
                class224.method1577(arg2.field1521, var4, arg2.field1534, arg2.field1571, 128, class223.field4069 == arg2);
            }
            if (var5 == 2) {
                arg2.field1506 = 0;
                return;
            }
        } else if (arg3 == -1 || arg2.field1541 == -1 || class245.method1706(arg3, (byte) 124).field4362 >= class245.method1706(arg2.field1541, (byte) 120).field4362) {
            arg2.field1566 = 0;
            arg2.field1506 = 0;
            arg2.field1573 = arg2.field1510;
            arg2.field1539 = arg0;
            arg2.field1541 = arg3;
            arg2.field1521 = 0;
            if (arg2.field1541 != -1) {
                class224.method1577(arg2.field1521, class245.method1706(arg2.field1541, (byte) 126), arg2.field1534, arg2.field1571, 128, class223.field4069 == arg2);
                return;
            }
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1597(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class5.field76 * arg3 + class209.field3789 * arg0 >> 16;
        int var6 = class209.field3789 * arg3 - class5.field76 * arg0 >> 16;
        int var7 = class201.field3595 * arg1 + class167.field3015 * var6 >> 16;
        int var8 = class167.field3015 * arg1 - class201.field3595 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class201.field3595 * arg2 + class167.field3015 * var6 >> 16;
        int var12 = class167.field3015 * arg2 - class201.field3595 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class154.field2806 && var13 < class154.field2806) {
            return false;
        } else if (var9 > class47.field909 && var13 > class47.field909) {
            return false;
        } else if (var10 < class134.field2547 && var14 < class134.field2547) {
            return false;
        } else {
            return var10 <= class138.field2592 || var14 <= class138.field2592;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)J")
    public static final long method1598(int arg0, int arg1, int arg2) {
        class109 var3 = class106.field2089[arg0][arg1][arg2];
        return var3 == null || var3.field2213 == null ? 0L : var3.field2213.field3385;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4135[var0] = var1;
        }
        field4145 = new CRC32();
        field4150 = class95.method669(84, " has logged out)3");
        field4151 = field4150;
    }
}
