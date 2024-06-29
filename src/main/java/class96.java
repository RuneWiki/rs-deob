import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class96 extends class280 {

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "Lcc;")
    public static class216 field1414 = new class216(50);

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "[I")
    public static int[] field1420 = new int[25];

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "[Lli;")
    public static class297[] field1425 = new class297[8];

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "Z")
    public static boolean field1421 = false;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field1424 = new String[8];

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public int field1417;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "Lek;")
    public static class167 field1423;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIILvk;)V")
    public static final void method742(int arg0, int arg1, int arg2, int arg3, class36 arg4) {
        field1419++;
        if (arg1 < 38) {
            return;
        }
        for (class23 var5 = (class23) class297.field4694.method1384(2); var5 != null; var5 = (class23) class297.field4694.method1388((byte) 80)) {
            if (var5.field269 == arg0 && (arg3 * 128) == var5.field248 && arg2 * 128 == var5.field252 && var5.field254.field477 == arg4.field477) {
                if (var5.field251 != null) {
                    class73.field1057.method795(var5.field251);
                    var5.field251 = null;
                }
                if (var5.field261 != null) {
                    class73.field1057.method795(var5.field261);
                    var5.field261 = null;
                }
                var5.method1922(-1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([BZIII[Lth;)V")
    public static final void method743(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4, class113[] arg5) {
        field1412++;
        if (arg3 != 2) {
            field1424 = null;
        }
        class152 var6 = new class152(arg0);
        int var7 = -1;
        while (true) {
            int var8 = var6.method1080(false);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method1103(3);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var6.method1111(255);
                int var14 = var9 >> 12;
                int var15 = var13 >> 2;
                int var16 = var13 & 0x3;
                int var17 = arg2 + var11;
                int var18 = var12 + arg4;
                if (var18 > 0 && var17 > 0 && var18 < 103 && var17 < 103) {
                    class113 var19 = null;
                    if (!arg1) {
                        int var20 = var14;
                        if ((class86.field1277[1][var18][var17] & 0x2) == 2) {
                            var20 = var14 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg5[var20];
                        }
                    }
                    class16.method115(var17, var7, arg1, var19, var14, !arg1, var14, var18, (byte) -127, var16, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
    public static void method744(byte arg0) {
        field1424 = null;
        field1414 = null;
        field1425 = null;
        field1420 = null;
        field1423 = null;
        int var1 = -35 / ((94 - arg0) / 32);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(DI)V")
    public static final void method745(double arg0, int arg1) {
        field1416++;
        if (class2.field18 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class101.field1477[var3] = var4 <= 255 ? var4 : 255;
            }
            class2.field18 = arg0;
        }
        if (arg1 != 256) {
            method746(71, (class128) null);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(ILq;)V")
    public static final void method746(int arg0, class128 arg1) {
        field1415++;
        if (class264.field4290 == arg1.field1902 || arg1.field1932 == -1 || arg1.field1941 != 0 || (arg1.field1970 + 1) > class285.method1939(arg1.field1932, 112).field2263[arg1.field1921]) {
            int var2 = class264.field4290 - arg1.field1913;
            int var3 = arg1.field1902 - arg1.field1913;
            int var4 = arg1.field1901 * 128 + arg1.method205(-98) * 64;
            int var5 = arg1.field1952 * 128 + (arg1.method205(-88) * 64);
            int var6 = arg1.field1874 * 128 + (arg1.method205(-80) * 64);
            int var7 = arg1.field1904 * 128 + arg1.method205(-95) * 64;
            arg1.field1910 = ((var3 - var2) * var5 + var2 * var7) / var3;
            arg1.field1979 = ((var3 - var2) * var4 + (var2 * var6)) / var3;
        }
        arg1.field1954 = 0;
        if (arg0 >= -33) {
            return;
        }
        if (arg1.field1890 == 0) {
            arg1.field1928 = 1024;
        }
        if (arg1.field1890 == 1) {
            arg1.field1928 = 1536;
        }
        if (arg1.field1890 == 2) {
            arg1.field1928 = 0;
        }
        if (arg1.field1890 == 3) {
            arg1.field1928 = 512;
        }
        arg1.field1893 = arg1.field1928;
    }
}
