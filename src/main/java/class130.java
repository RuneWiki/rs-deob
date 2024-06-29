import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class130 extends class297 {

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    private int field2081 = 2048;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    private int field2082 = 0;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    private int field2072 = 10;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field2078 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "[J")
    public static long[] field2080 = new long[200];

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "[I")
    private int[] field2071;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "[I")
    private int[] field2084;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lpd;ILrd;)Ltd;", line = 9)
    public static final class256 method1005(class3 arg0, int arg1, class183 arg2) {
        field2083++;
        if (arg1 != -6739) {
            return (class256) null;
        }
        long var3 = ((long) arg2.field2895 << 32) + (((long) arg2.field2891 << 56) - (long) (-(arg2.field2898 + 1 << 16) - arg2.field2888));
        class256 var5 = (class256) arg0.method79(var3, (byte) 0);
        if (var5 == null) {
            var5 = new class256(arg2.field2898, (float) arg2.field2888, true, false, arg2.field2895);
            arg0.method75(var5, -1, var3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V", line = 35)
    public static final void method1006(byte arg0) {
        field2088++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class137.field2225 - 1; var2++) {
                if (class120.field1960[var2] < 1000 && class120.field1960[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class285.field4441[var2];
                    class285.field4441[var2] = class285.field4441[var2 + 1];
                    class285.field4441[var2 + 1] = var3;
                    String var4 = class301.field4800[var2];
                    class301.field4800[var2] = class301.field4800[var2 + 1];
                    class301.field4800[var2 + 1] = var4;
                    int var5 = class304.field4847[var2];
                    class304.field4847[var2] = class304.field4847[var2 + 1];
                    class304.field4847[var2 + 1] = var5;
                    int var6 = class247.field3683[var2];
                    class247.field3683[var2] = class247.field3683[var2 + 1];
                    class247.field3683[var2 + 1] = var6;
                    int var7 = class179.field2856[var2];
                    class179.field2856[var2] = class179.field2856[var2 + 1];
                    class179.field2856[var2 + 1] = var7;
                    short var8 = class120.field1960[var2];
                    class120.field1960[var2] = class120.field1960[var2 + 1];
                    class120.field1960[var2 + 1] = var8;
                    long var9 = class319.field5002[var2];
                    class319.field5002[var2] = class319.field5002[var2 + 1];
                    class319.field5002[var2 + 1] = var9;
                }
            }
        }
        if (arg0 >= -61) {
            method1006((byte) -97);
        }
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V", line = 92)
    public static void method1007(int arg0) {
        if (arg0 == -31845) {
            field2080 = null;
            field2078 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILaj;)V", line = 108)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg1 != 255) {
            return;
        }
        field2074++;
        if (arg0 == 0) {
            this.field2072 = arg2.method15((byte) 59);
        } else if (arg0 == 1) {
            this.field2081 = arg2.method56(19612);
        } else if (arg0 == 2) {
            this.field2082 = arg2.method15((byte) -81);
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V", line = 475)
    public class130() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)[I", line = 164)
    public final int[] method173(int arg0, boolean arg1) {
        int[] var3 = this.field4760.method215(arg0, 19142);
        field2075++;
        if (!arg1) {
            method1010((int[]) null, 9);
        }
        if (this.field4760.field388) {
            int var4 = class264.field3901[arg0];
            if (this.field2082 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field2072; var6++) {
                    if (var4 >= this.field2084[var6] && this.field2084[var6 + 1] > var4) {
                        if (this.field2071[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class330.method2313(var3, 0, class31.field491, var5);
            } else {
                for (int var7 = 0; var7 < class31.field491; var7++) {
                    int var8 = 0;
                    int var9 = class251.field3705[var7];
                    short var10 = 0;
                    int var11 = this.field2082;
                    if (var11 == 1) {
                        var8 = var9;
                    } else if (var11 == 2) {
                        var8 = (var9 + var4 - 4096 >> 1) + 2048;
                    } else if (var11 == 3) {
                        var8 = (var9 - var4 >> 1) + 2048;
                    }
                    for (int var12 = 0; var12 < this.field2072; var12++) {
                        if (this.field2084[var12] <= var8 && var8 < this.field2084[var12 + 1]) {
                            if (this.field2071[var12] > var8) {
                                var10 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var10;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIIII)V", line = 276)
    public static final void method1008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2085++;
        if (arg6 <= 58) {
            return;
        }
        for (int var9 = 0; var9 < class62.field903.field1782; var9++) {
            if (class62.field903.method863(0, var9)) {
                int[] var10 = class322.field5049.method720((byte) -92, (class62.field903.field1780[var9] & 0x387419A8) >> 28, class62.field903.field1780[var9] & 0x3FFF, class62.field903.field1780[var9] >> 14 & 0x3FFF);
                if (var10 != null) {
                    int var11 = var10[1] - class227.field3512;
                    int var12 = class286.field4473 + class188.field2953 - var10[2] - 1;
                    int var13 = (var11 - arg0) * (arg4 - arg8) / (arg1 - arg0) + arg8;
                    int var14 = arg3 + ((arg5 - arg3) * (var12 - arg7) / (arg2 - arg7));
                    int var15 = class62.field903.method860(var9, (byte) -77);
                    int var16 = 16777215;
                    class132 var17 = null;
                    if (var15 == 0) {
                        if ((double) class342.field5298 == 3.0D) {
                            var17 = class306.field4857;
                        }
                        if ((double) class342.field5298 == 4.0D) {
                            var17 = class41.field635;
                        }
                        if ((double) class342.field5298 == 6.0D) {
                            var17 = class331.field5165;
                        }
                        if ((double) class342.field5298 >= 8.0D) {
                            var17 = class3.field102;
                        }
                    }
                    if (var15 == 1) {
                        if ((double) class342.field5298 == 3.0D) {
                            var17 = class331.field5165;
                        }
                        if ((double) class342.field5298 == 4.0D) {
                            var17 = class3.field102;
                        }
                        if ((double) class342.field5298 == 6.0D) {
                            var17 = class151.field2487;
                        }
                        if ((double) class342.field5298 >= 8.0D) {
                            var17 = class10.field234;
                        }
                    }
                    if (var15 == 2) {
                        if ((double) class342.field5298 == 3.0D) {
                            var17 = class151.field2487;
                        }
                        var16 = 16755200;
                        if ((double) class342.field5298 == 4.0D) {
                            var17 = class10.field234;
                        }
                        if ((double) class342.field5298 == 6.0D) {
                            var17 = class340.field5255;
                        }
                        if ((double) class342.field5298 >= 8.0D) {
                            var17 = class108.field1764;
                        }
                    }
                    if (class62.field903.field1781[var9] != -1) {
                        var16 = class62.field903.field1781[var9];
                    }
                    if (var17 != null) {
                        int var18 = class156.field2560.method1488(class62.field903.field1775[var9], (int[]) null, class299.field4781);
                        int var19 = var14 - var17.method1020() * (var18 - 1) / 2;
                        int var20 = var19 + var17.method1021() / 2;
                        for (int var21 = 0; var21 < var18; var21++) {
                            String var22 = class299.field4781[var21];
                            if (var18 - 1 > var21) {
                                var22 = var22.substring(0, var22.length() - 4);
                            }
                            var17.method1022(var22, var13, var20, var16, true);
                            var20 += var17.method1020();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V", line = 408)
    public final void method247(byte arg0) {
        field2086++;
        this.method1009(arg0 ^ 0xFFFFB3A5);
        if (arg0 != 68) {
            method1008(-77, 105, -58, -45, 125, -103, 98, -99, -63);
        }
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V", line = 419)
    private final void method1009(int arg0) {
        if (arg0 != -19487) {
            return;
        }
        field2073++;
        int var2 = 4096 / this.field2072;
        this.field2071 = new int[this.field2072 + 1];
        this.field2084 = new int[this.field2072 + 1];
        int var3 = this.field2081 * var2 >> 12;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2072; var5++) {
            this.field2084[var5] = var4;
            this.field2071[var5] = var3 + var4;
            var4 += var2;
        }
        this.field2084[this.field2072] = 4096;
        this.field2071[this.field2072] = this.field2071[0] + 4096;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([II)[I", line = 457)
    public static final int[] method1010(int[] arg0, int arg1) {
        field2087++;
        if (arg0 == null) {
            return null;
        }
        int[] var2 = new int[arg0.length];
        class330.method2307(arg0, 0, var2, 0, arg0.length);
        if (arg1 != 4096) {
            method1010((int[]) null, 74);
        }
        return var2;
    }
}
