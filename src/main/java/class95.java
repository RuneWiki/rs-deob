import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class95 {

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Lth;")
    public static class55 field1701 = new class55();

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "[Ldn;")
    public static class260[] field1704 = new class260[14];

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Laf;")
    public static class17 field1702 = new class17(0, 0);

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Z")
    public static boolean field1705 = false;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "F")
    public static float field1709 = 0.0F;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "[Z")
    public static boolean[] field1707 = new boolean[200];

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Lth;")
    public static class55 field1706 = new class55();

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Lff;")
    public static class141 field1710 = new class141();

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "[I")
    public static int[] field1708;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)I", line = 9)
    public static final int method632(byte arg0, int arg1) {
        field1698++;
        int var2 = arg1 & 0x3F;
        if (arg0 <= 25) {
            return 74;
        }
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)I", line = 64)
    public static final int method633(byte arg0) {
        field1696++;
        if (arg0 == 34) {
            return class185.field3015 && class342.field5317[81] && class48.field999 > 2 ? class169.field2715[class48.field999 - 2] : class169.field2715[class48.field999 - 1];
        } else {
            return -14;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V", line = 80)
    public static void method634(byte arg0) {
        field1708 = null;
        field1710 = null;
        field1706 = null;
        field1707 = null;
        field1702 = null;
        field1704 = null;
        if (arg0 == 7) {
            field1701 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZIII)V", line = 96)
    public static final void method635(boolean arg0, int arg1, int arg2, int arg3) {
        field1697++;
        class225.method1489(arg0, (byte) -54);
        class201.field3200 = arg1;
        class223.field3524 = arg2;
        class54.method419(arg3, -2);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)Lwh;", line = 108)
    public static final class337 method636(int arg0, int arg1) {
        class337 var2 = (class337) class141.field2333.method1881(true, (long) arg1);
        field1699++;
        if (var2 != null) {
            return var2;
        } else if (arg0 == 22111) {
            byte[] var3 = class130.field2205.method2036(class233.method1540(arg1, (byte) 118), class296.method1984(arg1, (byte) -65), (byte) 111);
            class337 var4 = new class337();
            var4.field5245 = arg1;
            if (var3 != null) {
                var4.method2337(new class202(var3), arg0 - 22239);
            }
            var4.method2321(true);
            if (var4.field5226 != -1) {
                var4.method2335(-15966, method636(22111, var4.field5226), method636(22111, var4.field5201));
            }
            if (var4.field5233 != -1) {
                var4.method2331(-78, method636(arg0 ^ 0x0, var4.field5214), method636(arg0, var4.field5233));
            }
            if (!class46.field959 && var4.field5178) {
                var4.field5227 = class106.field1836;
                var4.field5221 = class86.field1623;
                var4.field5170 = false;
                var4.field5177 = 0;
                var4.field5199 = class171.field2755;
            }
            class141.field2333.method1880(var4, (long) arg1, 56);
            return var4;
        } else {
            return (class337) null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 149)
    public static final void method637(int arg0) {
        class69.field1470.method1884(-22054);
        int var1 = -46 % ((-arg0 - 66) / 54);
        field1703++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILbm;)V", line = 159)
    public static final void method638(int arg0, class307 arg1) {
        if (arg0 != -20) {
            method634((byte) -76);
        }
        field1700++;
        class342.field5312 = arg1;
    }
}
