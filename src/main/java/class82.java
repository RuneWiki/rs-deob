import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class82 {

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Lkd;")
    public static class73 field2063 = class126.method1070((byte) -66, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "Lkd;")
    public static class73 field2066 = class126.method1070((byte) -66, "<col=40ff00>");

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "Lkd;")
    private static class73 field2071 = class126.method1070((byte) -66, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "Lkd;")
    public static class73 field2075 = class126.method1070((byte) -66, ":duelreq:");

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "Lkd;")
    public static class73 field2072 = field2071;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "Lkd;")
    private static class73 field2074 = class126.method1070((byte) -66, "Checking for updates )2 ");

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field2062 = 1;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "Lkd;")
    public static class73 field2073 = field2074;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Lkd;")
    public static class73 field2064 = class126.method1070((byte) -66, "Einloggen");

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "Lq;")
    public static class111 field2077;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Lde;")
    public static class27 field2061;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "Lgd;")
    public static class46 field2070;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "[Lpb;")
    public static class106[] field2079;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static void method694(byte arg0) {
        field2072 = null;
        field2070 = null;
        field2075 = null;
        field2079 = null;
        int var1 = 0 / ((25 - arg0) / 32);
        field2073 = null;
        field2066 = null;
        field2061 = null;
        field2077 = null;
        field2064 = null;
        field2071 = null;
        field2074 = null;
        field2063 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIB)V")
    public static final void method695(int arg0, int arg1, byte arg2) {
        if (arg2 < 81) {
            return;
        }
        field2069++;
        long var3 = (long) ((arg0 << 16) + arg1);
        class122 var5 = (class122) class115.field2894.method1099(96, var3);
        if (var5 != null) {
            class80.field2017.method655(var5, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)I")
    public static final int method696(int arg0, int arg1, int arg2, int arg3) {
        field2076++;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg0 / arg2;
        int var6 = arg3 / arg2;
        int var7 = arg2 - 1 & arg3;
        if (arg1 != -17803) {
            method696(68, 68, 57, -37);
        }
        int var8 = class94.method778((byte) -58, var6, var5);
        int var9 = class94.method778((byte) -76, var6, var5 + 1);
        int var10 = class94.method778((byte) -95, var6 + 1, var5);
        int var11 = class94.method778((byte) 54, var6 + 1, var5 - -1);
        int var12 = class42.method319(var4, arg2, var8, var9, (byte) 127);
        int var13 = class42.method319(var4, arg2, var10, var11, (byte) 79);
        return class42.method319(var7, arg2, var12, var13, (byte) 123);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILf;BII)V")
    public static final void method697(int arg0, class36 arg1, byte arg2, int arg3, int arg4) {
        field2067++;
        if (class62.field1635 >= 50 || class99.field2492 == 0 || (arg1.field979 == null || arg4 >= arg1.field979.length)) {
            return;
        }
        int var5 = arg1.field979[arg4];
        if (var5 == 0 || arg2 > -29) {
            return;
        }
        int var6 = var5 >> 8;
        int var7 = (arg0 - 64) / 128;
        int var8 = var5 >> 4 & 0x7;
        class20.field572[class62.field1635] = var6;
        int var9 = (arg3 - 64) / 128;
        int var10 = var5 & 0xF;
        class150.field3708[class62.field1635] = var8;
        class38.field1032[class62.field1635] = 0;
        class2.field154[class62.field1635] = null;
        class42.field1123[class62.field1635] = (var7 << 16) + (var9 << 8) + var10;
        class62.field1635++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZIZ)I")
    public static final int method698(boolean arg0, int arg1, boolean arg2) {
        int var3 = 0;
        if (arg2) {
            var3 += class57.field1512 + class143.field3564;
        }
        if (arg1 != 6717) {
            method700((byte) 44);
        }
        if (arg0) {
            var3 += class102.field2529 + class61.field1599;
        }
        field2060++;
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([BIII)Z")
    public static final boolean method699(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            method696(35, -105, -85, 113);
        }
        boolean var4 = true;
        field2065++;
        class114 var5 = new class114(arg0);
        int var6 = -1;
        label58: while (true) {
            int var7 = var5.method963((byte) -116);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method963((byte) -116);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method957((byte) 50) >> 2;
                    int var15 = arg3 + var13;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class149 var17 = class122.method1045(31, var6);
                        if (var14 != 22 || !class77.field1971 || var17.field3696 != 0 || var17.field3648 == 1 || var17.field3702) {
                            var9 = true;
                            if (!var17.method1198(arg1 + 111)) {
                                class81.field2053++;
                                var4 = false;
                            }
                        }
                    }
                }
                int var10 = var5.method963((byte) -116);
                if (var10 == 0) {
                    break;
                }
                var5.method957((byte) 45);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
    public static final void method700(byte arg0) {
        for (int var1 = 0; var1 < client.field618; var1++) {
            int var3 = class55.field1455[var1];
            class9 var4 = class133.field3345[var3];
            if (var4 != null) {
                class2.method18(var4, (byte) -114, var4.field301.field800);
            }
        }
        int var2 = 26 % ((arg0 + 33) / 53);
        field2068++;
    }
}
