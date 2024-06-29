import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class288 {

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field4920 = -1;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "Ljf;")
    public static class229 field4921 = class212.method1457((byte) 122, "titlebg");

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "Ljf;")
    private static class229 field4924 = class212.method1457((byte) 99, "Unable to find ");

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field4927 = 0;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "Ljf;")
    private static class229 field4922 = class212.method1457((byte) 112, "glow3:");

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "Ljf;")
    public static class229 field4925 = field4924;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field4934 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "Ljf;")
    public static class229 field4935 = field4922;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "Ljf;")
    public static class229 field4926 = class212.method1457((byte) 96, "http:)4)4");

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "Ljf;")
    public static class229 field4937 = field4922;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "Ljf;")
    public static class229 field4932 = class212.method1457((byte) 65, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "[[[B")
    public static byte[][][] field4933;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 9)
    public static void method2008(int arg0) {
        field4922 = null;
        field4926 = null;
        if (arg0 != 2) {
            method2009(65);
        }
        field4921 = null;
        field4925 = null;
        field4924 = null;
        field4935 = null;
        field4937 = null;
        field4933 = (byte[][][]) null;
        field4932 = null;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V", line = 31)
    public static final void method2009(int arg0) {
        class171.field2972.method1398(-118);
        field4936++;
        int var1 = class171.field2972.method1396(1, -126);
        int var2 = -107 / ((arg0 + 31) / 35);
        if (var1 == 0) {
            return;
        }
        int var3 = class171.field2972.method1396(2, -127);
        if (var3 == 0) {
            class201.field3529[class100.field1762++] = 2047;
        } else if (var3 == 1) {
            int var11 = class171.field2972.method1396(3, -8);
            class301.field5124.method791(false, (byte) -103, var11);
            int var12 = class171.field2972.method1396(1, -128);
            if (var12 == 1) {
                class201.field3529[class100.field1762++] = 2047;
            }
        } else if (var3 == 2) {
            int var8 = class171.field2972.method1396(3, -128);
            class301.field5124.method791(true, (byte) -103, var8);
            int var9 = class171.field2972.method1396(3, -126);
            class301.field5124.method791(true, (byte) -103, var9);
            int var10 = class171.field2972.method1396(1, 51);
            if (var10 == 1) {
                class201.field3529[class100.field1762++] = 2047;
            }
        } else if (var3 == 3) {
            int var4 = class171.field2972.method1396(1, -126);
            class16.field254 = class171.field2972.method1396(2, -128);
            int var5 = class171.field2972.method1396(1, -128);
            if (var5 == 1) {
                class201.field3529[class100.field1762++] = 2047;
            }
            int var6 = class171.field2972.method1396(7, 12);
            int var7 = class171.field2972.method1396(7, -13);
            class301.field5124.method301(var4 == 1, var7, false, var6);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIII)V", line = 128)
    public static final void method2010(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4;
        if (arg2 != -2) {
            return;
        }
        while (arg3 >= var6) {
            class34.method306(arg5, class173.field3021[var6], (byte) 125, arg1, arg0);
            var6++;
        }
        field4930++;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIZ)Ljf;", line = 187)
    public static final class229 method2011(int arg0, int arg1, int arg2, boolean arg3) {
        field4929++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var4 = arg1 / arg0;
        int var5 = 1;
        if (arg2 != 27097) {
            field4922 = (class229) null;
        }
        while (var4 != 0) {
            var4 /= arg0;
            var5++;
        }
        int var6 = var5;
        if (arg1 < 0 || arg3) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = arg1 % arg0;
            arg1 /= arg0;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class229 var10 = new class229();
        var10.field3944 = var7;
        var10.field3973 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILkh;)V", line = 252)
    public static final void method2012(int arg0, class14 arg1) {
        field4923++;
        int var2 = -11 / ((arg0 + 32) / 50);
        while (true) {
            while (arg1.field174.length > arg1.field195) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (arg1.method93(false) == 1) {
                    var3 = true;
                    var4 = arg1.method93(false);
                    var5 = arg1.method93(false);
                }
                int var6 = arg1.method93(false);
                int var7 = arg1.method93(false);
                int var8 = class254.field4432 - (var7 * 64 + -class127.field2269) - 1;
                int var9 = var6 * 64 - class290.field4953;
                if (var9 >= 0 && (var8 - 63) >= 0 && class113.field2037 > var9 + 63 && class254.field4432 > var8) {
                    int var10 = var9 >> 6;
                    int var11 = var8 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var3 || var12 >= var4 * 8 && var12 < var4 * 8 + 8 && var5 * 8 <= var13 && var13 < var5 * 8 + 8) {
                                byte var14 = arg1.method98(true);
                                if (var14 != 0) {
                                    if (class80.field1463[var10][var11] == null) {
                                        class80.field1463[var10][var11] = new byte[4096];
                                    }
                                    class80.field1463[var10][var11][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg1.method98(true);
                                    if (class8.field82[var10][var11] == null) {
                                        class8.field82[var10][var11] = new byte[4096];
                                    }
                                    class8.field82[var10][var11][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var3 ? 64 : 4096); var16++) {
                        byte var17 = arg1.method98(true);
                        if (var17 != 0) {
                            arg1.field195++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V", line = 375)
    public static final void method2013(int arg0, int arg1) {
        class122 var2 = class323.method2175(arg1, arg0, arg1 - 25875);
        field4928++;
        var2.method865(-81);
    }
}
