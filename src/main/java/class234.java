import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class234 {

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "[I")
    public static int[] field3303 = new int[14];

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "[I")
    public static int[] field3318 = new int[100];

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field3316 = 0;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "[[I")
    public static int[][] field3320 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field3313 = -1;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "B")
    public byte field3301;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "B")
    public byte field3306;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "B")
    public byte field3309;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "B")
    public byte field3312;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Lo;")
    public static class285 field3302;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Lhd;")
    public static class56 field3304;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "S")
    public short field3299;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Z")
    public boolean field3307;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "Z")
    public boolean field3311;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "Z")
    public boolean field3314;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "Z")
    public boolean field3315;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "Z")
    public boolean field3322;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZIIIIIIIIIII)V", line = 22)
    public static final void method1611(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg1) {
            return;
        }
        class129 var13 = new class129();
        var13.field1771 = arg6;
        var13.field1769 = arg9;
        var13.field1779 = arg0;
        var13.field1768 = arg4;
        field3317++;
        var13.field1770 = arg2;
        var13.field1766 = arg11;
        var13.field1773 = arg8;
        var13.field1774 = arg5;
        var13.field1767 = arg10;
        var13.field1764 = arg3;
        var13.field1762 = arg12;
        var13.field1777 = arg7;
        class240.field3398.method1339((byte) -109, var13);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 47)
    public static void method1612(int arg0) {
        field3303 = null;
        if (arg0 >= 31) {
            field3320 = (int[][]) null;
            field3304 = null;
            field3318 = null;
            field3302 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)I", line = 68)
    public static final int method1613(int arg0, boolean arg1) {
        field3319++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        if (arg1) {
            int var6 = var5 | var5 >>> 8;
            int var7 = var6 | var6 >>> 16;
            return ~var7 & arg0;
        } else {
            return -42;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 97)
    public static final void method1614(byte arg0) {
        if (arg0 <= 62) {
            method1616(57, -54);
        }
        class333.field5014.method717((byte) 107);
        field3300++;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BI)Lql;", line = 112)
    public static final class28 method1615(byte arg0, int arg1) {
        field3305++;
        class28 var2 = (class28) class292.field4354.method365((long) arg1, 35);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class179.field2404.method955(class264.method1795(-43, arg1), class132.method942(arg1, 255), -21853);
        class28 var4 = new class28();
        if (arg0 != 46) {
            field3310 = -20;
        }
        if (var3 != null) {
            var4.method169(arg0 ^ 0x53, new class316(var3));
        }
        class292.field4354.method369(arg0 ^ 0x2E, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lui;", line = 142)
    public static final class194 method1616(int arg0, int arg1) {
        if (arg0 != 14) {
            field3304 = (class56) null;
        }
        class194 var2 = (class194) class213.field3073.method716((long) arg1, false);
        field3308++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class97.field1311.method955(32, arg1, -21853);
        class194 var4 = new class194();
        if (var3 != null) {
            var4.method1363(arg0 - 14, new class316(var3));
        }
        var4.method1359(-79);
        class213.field3073.method721((long) arg1, var4, arg0 - 14);
        return var4;
    }
}
