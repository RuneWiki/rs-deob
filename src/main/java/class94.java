import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class94 extends class41 {

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
    public static int field1492 = 0;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "Z")
    public static boolean field1499 = false;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
    public static int field1491 = 0;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public static int field1502 = 255;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "Lvb;")
    public static class247 field1493 = new class247();

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "I")
    public static int field1505 = 0;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "Lsc;")
    private static class181 field1507 = class149.method967(255, "purple:");

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "Lsc;")
    public static class181 field1504 = field1507;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "Lsc;")
    public static class181 field1508 = class149.method967(255, "::qa_op_test");

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "S")
    public static short field1506 = 205;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "[I")
    public static int[] field1509 = new int[32];

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "[I")
    public static int[] field1512 = new int[50];

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "[I")
    public static int[] field1510 = new int[4096];

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "Lsc;")
    public static class181 field1511 = class149.method967(255, "<col=ffffff>");

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "Lsc;")
    public static class181 field1513 = field1507;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public int field1485;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "I")
    public int field1496;

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
    public int field1497;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "I")
    public int field1498;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "Lo;")
    public class175 field1486;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "Lo;")
    public class175 field1488;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "Lsc;")
    public class181 field1495;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "Z")
    public boolean field1487;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "[Ljava/lang/Object;")
    public Object[] field1489;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
    public static final void method618(int arg0) {
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        class27.method230(class107.field1740, -60);
        field1503++;
        class145.method934(arg0 + 27, class107.field1740);
        if (class115.field1879 != null) {
            class115.field1879.method267(11198, class107.field1740);
        }
        class159.method1071(arg0 ^ arg0);
        class3.method27(1, class107.field1740);
        class66.method468(class107.field1740, -8087);
        if (class115.field1879 != null) {
            class115.field1879.method266(class107.field1740, (byte) -117);
        }
        class232.method1603(arg0 ^ 0xFFFFB9DB);
        class255.field4463 = 0L;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ldg;IZ)V")
    public static final void method619(class90 arg0, int arg1, boolean arg2) {
        field1501++;
        if (class55.field852 != null) {
            class55.field852.field3933 = arg1 * 8 + 5;
            int var3 = class55.field852.method1529(-32494);
            int var4 = class55.field852.method1529(-32494);
            arg0.method593(var3, (byte) 122, var4);
            return;
        }
        if (arg2) {
            method619((class90) null, 86, true);
        }
        class66.method471(118, true, 255, 0, 255, (class90) null, (byte) 0);
        class179.field3134[arg1] = arg0;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZIBIII)Ltg;")
    public static final class107 method620(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1494++;
        if (arg2 != -118) {
            method620(false, 0, (byte) -69, -92, 65, 62);
        }
        int var6 = (arg1 << 17) + (arg4 << 19) + arg5 + (arg0 ? 65536 : 0);
        long var8 = (long) var6 * 3849834839L + (long) arg3 * 3147483667L;
        class107 var10 = (class107) class188.field3324.method1794(arg2 ^ 0x75, var8);
        if (var10 != null) {
            return var10;
        }
        class72.field1149 = false;
        class107 var11 = class262.method1783(arg1, false, arg3, arg5, arg0, 35, false, arg4);
        if (var11 != null && !class72.field1149) {
            class188.field3324.method1795(14177, var8, var11);
        }
        return var11;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V")
    public static void method621(byte arg0) {
        if (arg0 != -46) {
            method618(-24);
        }
        field1511 = null;
        field1493 = null;
        field1510 = null;
        field1507 = null;
        field1512 = null;
        field1504 = null;
        field1508 = null;
        field1509 = null;
        field1513 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)I")
    public static final int method622(int arg0, byte arg1) {
        int var2 = 1 % ((arg1 - 70) / 48);
        field1490++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V")
    public static final void method623(byte arg0) {
        class16.method142((byte) 96);
        int var1 = 21 / ((arg0 - 77) / 38);
        field1484++;
        System.gc();
        class92.method612(25, 255);
    }
}
