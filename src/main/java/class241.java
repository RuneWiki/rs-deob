import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class241 {

    @OriginalMember(owner = "client!i", name = "b", descriptor = "[B")
    public static byte[] field3694;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "[I")
    public static int[] field3697;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Z")
    public static boolean field3699;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "[Lpa;")
    public static class2[] field3702;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1701(int arg0) {
        field3700++;
        class160.method1160();
        class67.method416(1);
        class145.method1073((byte) -92);
        class248.field3936.method2003(-103);
        class55.field656 = new class19();
        ((class138) class104.field1438).method948(-128);
        class3.method26();
        class195.field2960 = new class244[255];
        class195.field2970 = 0;
        class124.method825();
        class358.method2477();
        class44.method273(arg0 ^ 0xFFF05673);
        class151.method1104(-1, false);
        class332.method2300(87);
        class28.method207((byte) -128);
        for (int var1 = 0; var1 < 2048; var1++) {
            class67 var2 = class105.field1443[var1];
            if (var2 != null) {
                var2.field3725 = null;
            }
        }
        if (class272.field4317) {
            class358.method2476(104, 104);
            class123.method791(class151.field2386, false);
            class141.method988();
        }
        class232.method1606(class65.field786, -114, class107.field1476);
        class120.method778((byte) -125, class65.field786);
        class302.field4709 = null;
        class201.field3051 = null;
        class315.field4948 = null;
        class180.field2702 = null;
        class120.field1666 = null;
        if (client.field4443 == 5) {
            class208.method1457(class65.field786, (byte) 119);
        }
        if (arg0 != 1048575) {
            field3699 = true;
        }
        if (client.field4443 == 10) {
            class88.method561(false, 8);
        }
        if (client.field4443 == 30) {
            class219.method1525((byte) -75, 25);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V", line = 73)
    public static final void method1702(int arg0, int arg1) {
        if (arg1 != 511) {
            field3702 = (class2[]) null;
        }
        class344.field5462.method387(arg0, false);
        field3701++;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V", line = 84)
    public static void method1703(int arg0) {
        field3702 = null;
        if (arg0 > -14) {
            method1707(-123, true);
        }
        field3697 = null;
        field3694 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 96)
    public static final String method1704(int arg0, long arg1) {
        field3696++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        }
        if (arg0 > -13) {
            method1707(-1, true);
        }
        if (arg1 % 37L == 0L) {
            return null;
        }
        long var3 = arg1;
        int var5 = 0;
        while (var3 != 0L) {
            var3 /= 37L;
            var5++;
        }
        StringBuffer var6 = new StringBuffer(var5);
        while (arg1 != 0L) {
            long var7 = arg1;
            arg1 /= 37L;
            char var9 = class128.field1868[(int) (var7 - (arg1 * 37L))];
            if (var9 == '_') {
                var9 = ' ';
                int var10 = var6.length() - 1;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            var6.append(var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V", line = 153)
    public static final void method1705(int arg0, int arg1) {
        if (arg1 > -117) {
            method1703(-10);
        }
        field3693++;
        class279 var2 = class147.method1085(arg0, -19443, 2);
        var2.method1996(true);
    }

    static {
        int var0 = 0;
        field3694 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3694[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + (var2 * var2 + 65535)) / 65535.0F))));
            }
        }
        field3697 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field3699 = false;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIII)V", line = 191)
    public static final void method1706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class328.field5286 = arg1;
        class54.field616 = arg3;
        class76.field987 = arg4;
        if (arg2 != 4194303) {
            method1701(0);
        }
        class189.field2840 = arg5;
        field3698++;
        class32.field376 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)V", line = 218)
    public static final void method1707(int arg0, boolean arg1) {
        class293.method2089(-1, class95.field1307, class345.field5482, arg1, class165.field2546);
        field3695++;
        if (arg0 != 536870911) {
            field3694 = (byte[]) null;
        }
    }
}
