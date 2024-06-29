import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class120 extends class187 {

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "Z")
    public static boolean field1844 = false;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Z")
    public static boolean field1841 = false;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field1839 = 2301979;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field1851 = new String[200];

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1848 = "flash2:";

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public int field1836;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public int field1838;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public int field1842;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public int field1846;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "Ljh;")
    public class207 field1845;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "Ljh;")
    public class207 field1852;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "Ljava/lang/String;")
    public String field1854;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "Z")
    public boolean field1847;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "[Ljava/lang/Object;")
    public Object[] field1837;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)V", line = 12)
    public static final void method815(int arg0, byte arg1) {
        field1849++;
        if (arg1 != -43) {
            field1841 = true;
        }
        class75 var2 = class204.method1371(10, 7, arg0);
        var2.method533(22461);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLwf;Lwf;)V", line = 25)
    public static final void method816(byte arg0, class306 arg1, class306 arg2) {
        if (arg0 <= -32) {
            class322.field5020 = arg1;
            field1850++;
            class3.field33 = arg2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIZ)V", line = 38)
    public static final void method817(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class228.field3650 = arg1;
        class84.field1276 = arg2;
        class50.field712 = arg3;
        class2.field15 = new class174[arg0][class228.field3650][class84.field1276];
        class193.field2911 = new int[arg0][class228.field3650 + 1][class84.field1276 + 1];
        if (class333.field5166) {
            class126.field1962 = new class217[4][];
        }
        if (arg4) {
            class10.field94 = new class174[1][class228.field3650][class84.field1276];
            class150.field2367 = new int[class228.field3650][class84.field1276];
            class46.field655 = new int[1][class228.field3650 + 1][class84.field1276 + 1];
            if (class333.field5166) {
                class274.field4222 = new class217[1][];
            }
        } else {
            class10.field94 = (class174[][][]) null;
            class150.field2367 = (int[][]) null;
            class46.field655 = (int[][][]) null;
            class274.field4222 = (class217[][]) null;
        }
        class95.method653(false);
        class234.field3766 = new class58[500];
        class175.field2684 = 0;
        class38.field485 = new class58[500];
        class268.field4136 = 0;
        class160.field2484 = new int[arg0][class228.field3650 + 1][class84.field1276 + 1];
        class118.field1828 = new class272[5000];
        class33.field420 = 0;
        class123.field1932 = new class272[100];
        class131.field2057 = new boolean[class50.field712 + class50.field712 + 1][class50.field712 + class50.field712 + 1];
        class79.field1174 = new boolean[class50.field712 + class50.field712 + 2][class50.field712 + class50.field712 + 2];
        class265.field4096 = new byte[arg0][class228.field3650][class84.field1276];
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIZII)V", line = 82)
    public static final void method818(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg0 != 2) {
            return;
        }
        class268.field4127 = 0L;
        field1855++;
        int var5 = class166.method1132(false);
        if (arg1 == 3 || var5 == 3) {
            arg2 = true;
        }
        boolean var6 = false;
        if (class224.field3567.startsWith("mac") && arg1 > 0) {
            arg2 = true;
        }
        if (var5 > 0 != arg1 > 0) {
            var6 = true;
        }
        if (arg2 && arg1 > 0) {
            var6 = true;
        }
        class280.method1846(var6, var5, arg1, arg4, arg3, arg2, (byte) 27);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(Z)V", line = 111)
    public static void method819(boolean arg0) {
        field1848 = null;
        field1851 = null;
        if (arg0) {
            field1851 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V", line = 139)
    public static final void method820(int arg0, int arg1) {
        class163.field2515.method1287(arg0, 114);
        if (arg1 != 500) {
            field1841 = false;
        }
        class245.field3850.method1287(arg0, arg1 ^ 0xFFFFFE54);
        field1840++;
    }
}
