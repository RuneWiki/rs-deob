import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class334 {

    @OriginalMember(owner = "client!si", name = "c", descriptor = "[[I")
    private int[][] field5116;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    private int field5131;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    private int field5114;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "[[S")
    public static short[][] field5124 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field5119 = -1;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Z")
    public static boolean field5115 = true;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "J")
    public static volatile long field5121 = 0L;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "Ljava/lang/String;")
    public static String field5129 = "K";

    @OriginalMember(owner = "client!si", name = "q", descriptor = "[I")
    public static int[] field5130 = new int[256];

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Lgn;")
    public static class257 field5118;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "[I")
    public static int[] field5125;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V", line = 5)
    public static final void method2299(byte arg0) {
        if (arg0 < 80) {
            method2302(-118, (byte) -77);
        }
        if (class124.field2133.toLowerCase().indexOf("microsoft") == -1) {
            if (class124.field2152 == null) {
                class2.field38[222] = 59;
                class2.field38[192] = 58;
            } else {
                class2.field38[222] = 58;
                class2.field38[192] = 28;
                class2.field38[520] = 59;
            }
            class2.field38[47] = 73;
            class2.field38[93] = 43;
            class2.field38[59] = 57;
            class2.field38[61] = 27;
            class2.field38[91] = 42;
            class2.field38[92] = 74;
            class2.field38[44] = 71;
            class2.field38[46] = 72;
            class2.field38[45] = 26;
        } else {
            class2.field38[222] = 59;
            class2.field38[188] = 71;
            class2.field38[220] = 74;
            class2.field38[190] = 72;
            class2.field38[192] = 58;
            class2.field38[189] = 26;
            class2.field38[191] = 73;
            class2.field38[187] = 27;
            class2.field38[186] = 57;
            class2.field38[221] = 43;
            class2.field38[223] = 28;
            class2.field38[219] = 42;
        }
        field5123++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V", line = 64)
    public static final void method2300(int arg0) {
        field5117++;
        int var1 = class123.field2122;
        if (arg0 != 0) {
            field5125 = (int[]) null;
        }
        int var2 = class294.field4488;
        int var3 = class177.field2864 - class134.field2257 - var1;
        int var4 = class61.field1183 - class88.field1658 - var2;
        if (var2 <= 0 && var4 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class177.field2866 != null) {
                var5 = class177.field2866;
            } else if (class283.field4376 == null) {
                var5 = class177.field2849.field2139;
            } else {
                var5 = class283.field4376;
            }
            int var6 = 0;
            int var7 = 0;
            if (class283.field4376 == var5) {
                Insets var8 = class283.field4376.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var2 > 0) {
                var9.fillRect(var6, var7, var2, class177.field2864);
            }
            if (var1 > 0) {
                var9.fillRect(var6, var7, class61.field1183, var1);
            }
            if (var4 > 0) {
                var9.fillRect(class61.field1183 + var6 - var4, var7, var4, class177.field2864);
            }
            if (var3 > 0) {
                var9.fillRect(var6, class177.field2864 + var7 - var3, class61.field1183, var3);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V", line = 133)
    public static final void method2301(boolean arg0) {
        int[] var1 = new int[class328.field5038];
        int var2 = 0;
        field5126++;
        for (int var3 = 0; var3 < class328.field5038; var3++) {
            class337 var4 = class95.method636(22111, var3);
            if (var4.field5184 >= 0 || var4.field5186 >= 0) {
                var1[var2++] = var3;
            }
        }
        class203.field3303 = new int[var2];
        if (!arg0) {
            for (int var5 = 0; var5 < var2; var5++) {
                class203.field3303[var5] = var1[var5];
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)Z", line = 186)
    public static final boolean method2302(int arg0, byte arg1) {
        field5128++;
        if (arg0 >= 0 && class18.field326.length > arg0) {
            return arg1 == 119 ? class18.field326[arg0] : false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([I[IBLve;[I)V", line = 205)
    public static final void method2303(int[] arg0, int[] arg1, byte arg2, class278 arg3, int[] arg4) {
        if (arg2 != 92) {
            method2303((int[]) null, (int[]) null, (byte) -16, (class278) null, (int[]) null);
        }
        for (int var5 = 0; var5 < arg0.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg0[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var6 != 0 && arg3.field1945.length > var9; var9++) {
                if ((var6 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg3.field1945[var9] = null;
                    } else {
                        class260 var10 = class279.method1882(25397, var7);
                        int var11 = var10.field4038;
                        class341 var12 = arg3.field1945[var9];
                        if (var12 != null) {
                            if (var12.field5300 == var7) {
                                if (var11 == 0) {
                                    var12 = arg3.field1945[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field5294 = var8;
                                    var12.field5287 = 1;
                                    var12.field5289 = 0;
                                    var12.field5292 = 0;
                                    var12.field5295 = 0;
                                    class255.method1705(arg3.field1872, arg3.field1869, (byte) -72, var10, 0, class66.field1265 == arg3);
                                } else if (var11 == 2) {
                                    var12.field5292 = 0;
                                }
                            } else if (var10.field4035 >= class279.method1882(25397, var12.field5300).field4035) {
                                var12 = arg3.field1945[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class341 var13 = arg3.field1945[var9] = new class341();
                            var13.field5287 = 1;
                            var13.field5295 = 0;
                            var13.field5294 = var8;
                            var13.field5292 = 0;
                            var13.field5300 = var7;
                            var13.field5289 = 0;
                            class255.method1705(arg3.field1872, arg3.field1869, (byte) -54, var10, 0, class66.field1265 == arg3);
                        }
                    }
                }
                var6 >>>= 0x1;
            }
        }
        field5120++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I", line = 304)
    public final int method2304(int arg0, int arg1) {
        field5132++;
        if (this.field5116 != null) {
            arg1 = (int) ((long) this.field5114 * (long) arg1 / (long) this.field5131);
        }
        if (arg0 != 5702) {
            this.field5116 = (int[][]) ((int[][]) null);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I[B)[B", line = 320)
    public final byte[] method2305(int arg0, byte[] arg1) {
        field5122++;
        if (this.field5116 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field5114 / (long) this.field5131) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var8 = arg1[var7];
                int[] var9 = this.field5116[var6];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var5 + var10] += var9[var10] * var8;
                }
                int var11 = this.field5114 + var6;
                int var12 = var11 / this.field5131;
                var5 += var12;
                var6 = var11 - this.field5131 * var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 > 127) {
                    arg1[var13] = 127;
                } else {
                    arg1[var13] = (byte) var14;
                }
            }
        }
        return arg0 == 0 ? arg1 : (byte[]) null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)I", line = 391)
    public final int method2306(int arg0, boolean arg1) {
        if (this.field5116 != null) {
            arg0 = (int) ((long) this.field5114 * (long) arg0 / (long) this.field5131) + 6;
        }
        if (arg1) {
            field5119 = 28;
        }
        field5134++;
        return arg0;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V", line = 406)
    public static void method2307(int arg0) {
        field5129 = null;
        if (arg0 == 59) {
            field5124 = (short[][]) null;
            field5118 = null;
            field5130 = null;
            field5125 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II[J[II)V", line = 421)
    public static final void method2308(int arg0, int arg1, long[] arg2, int[] arg3, int arg4) {
        field5133++;
        if (arg0 <= 98 || arg1 <= arg4) {
            return;
        }
        int var5 = (arg1 + arg4) / 2;
        int var6 = arg4;
        long var7 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var7;
        int var9 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var9;
        for (int var10 = arg4; var10 < arg1; var10++) {
            if (arg2[var10] < (long) (var10 & 0x1) + var7) {
                long var11 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6] = var11;
                int var13 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6++] = var13;
            }
        }
        arg2[arg1] = arg2[var6];
        arg2[var6] = var7;
        arg3[arg1] = arg3[var6];
        arg3[var6] = var9;
        method2308(100, var6 - 1, arg2, arg3, arg4);
        method2308(106, arg1, arg2, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(II)V", line = 478)
    public class334(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class97.method643(arg1, arg0, -75);
            int var4 = arg0 / var3;
            this.field5116 = new int[var4][14];
            this.field5131 = var4;
            int var5 = arg1 / var3;
            this.field5114 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field5116[var6];
                double var10 = (double) var5 / (double) var4;
                int var12 = (int) Math.floor(var7 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var12 < var13) {
                    double var14 = ((double) var12 - var7) * 3.141592653589793D;
                    double var16 = var10;
                    if (-1.0E-4D > var14 || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }
}
