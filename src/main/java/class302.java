import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class302 {

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    private int field4737;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "[[I")
    private int[][] field4734;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    private int field4727;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[Ldn;")
    public static class229[] field4721 = new class229[50];

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "D")
    public static double field4723 = -1.0D;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "[Le;")
    public static class160[] field4730 = new class160[14];

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "[I")
    public static int[] field4722 = new int[2000];

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field4725 = 1;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "[S")
    public static short[] field4738 = new short[] { 33, 5, 46, 30, 11, 40, 41, 38 };

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4741 = "Loading title screen - ";

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "[J")
    public static long[] field4742 = new long[100];

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "Llb;")
    public static class211 field4728;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "Z")
    public static boolean field4729;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)I", line = 4)
    public final int method2110(int arg0, byte arg1) {
        field4724++;
        if (this.field4734 != null) {
            arg0 = (int) ((long) this.field4737 * (long) arg0 / (long) this.field4727) + 6;
        }
        if (arg1 != 116) {
            field4735 = 15;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[IIJ)Ljava/lang/String;", line = 20)
    public static final String method2111(int arg0, int[] arg1, int arg2, long arg3) {
        field4739++;
        if (arg2 != 14) {
            return (String) null;
        }
        if (class10.field102 != null) {
            String var5 = class10.field102.method1101(arg1, arg0, arg3, (byte) 58);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[B)[B", line = 45)
    public final byte[] method2112(int arg0, byte[] arg1) {
        if (this.field4734 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field4737 / (long) this.field4727) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var8 = arg1[var7];
                int[] var9 = this.field4734[var6];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var5 + var10] += var9[var10] * var8;
                }
                int var11 = this.field4737 + var6;
                int var12 = var11 / this.field4727;
                var6 = var11 - this.field4727 * var12;
                var5 += var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 <= 127) {
                    arg1[var13] = (byte) var14;
                } else {
                    arg1[var13] = 127;
                }
            }
        }
        if (arg0 == -6443) {
            field4740++;
            return arg1;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIBIIIII)V", line = 123)
    public static final void method2113(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4736++;
        if (arg4 == arg6) {
            class176.method1277(arg0, arg5, arg7, arg1, arg6, false, arg3);
            return;
        }
        if (class298.field4667 <= arg5 - arg6 && class327.field5072 >= (arg5 + arg6) && (arg7 - arg4) >= class34.field432 && (arg7 + arg4) <= class75.field1064) {
            class162.method1166(arg5, arg3, true, arg1, arg7, arg0, arg6, arg4);
        } else {
            class301.method2108(arg7, false, arg4, arg1, arg3, arg5, arg0, arg6);
        }
        if (arg2 > -1) {
            field4728 = (class211) null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V", line = 151)
    public static void method2114(boolean arg0) {
        field4741 = null;
        field4738 = null;
        if (!arg0) {
            return;
        }
        field4742 = null;
        field4730 = null;
        field4722 = null;
        field4721 = null;
        field4728 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIZI)V", line = 177)
    public static final void method2115(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field4731++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class257.method1784((byte) 91, arg0 + arg4, class298.field4667, class327.field5072);
        if (arg3) {
            method2113(102, 11, (byte) 65, 56, -89, -78, -25, -27);
        }
        int var10 = class257.method1784((byte) 91, arg0 - arg4, class298.field4667, class327.field5072);
        class138.method1047(arg1, var9, var10, 7, class320.field4990[arg2]);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg2 - var6;
                int var12 = arg2 + var6;
                if (var12 >= class34.field432 && var11 <= class75.field1064) {
                    int var13 = class257.method1784((byte) 91, arg0 + var5, class298.field4667, class327.field5072);
                    int var14 = class257.method1784((byte) 91, arg0 - var5, class298.field4667, class327.field5072);
                    if (class75.field1064 >= var12) {
                        class138.method1047(arg1, var13, var14, 7, class320.field4990[var12]);
                    }
                    if (var11 >= class34.field432) {
                        class138.method1047(arg1, var13, var14, 7, class320.field4990[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg2 + var5;
            int var16 = arg2 - var5;
            if (class34.field432 <= var15 && var16 <= class75.field1064) {
                int var17 = class257.method1784((byte) 91, arg0 + var6, class298.field4667, class327.field5072);
                int var18 = class257.method1784((byte) 91, arg0 - var6, class298.field4667, class327.field5072);
                if (var15 <= class75.field1064) {
                    class138.method1047(arg1, var17, var18, 7, class320.field4990[var15]);
                }
                if (var16 >= class34.field432) {
                    class138.method1047(arg1, var17, var18, 7, class320.field4990[var16]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(IB)I", line = 263)
    public final int method2116(int arg0, byte arg1) {
        field4733++;
        if (arg1 >= -89) {
            return 107;
        } else {
            if (this.field4734 != null) {
                arg0 = (int) ((long) this.field4737 * (long) arg0 / (long) this.field4727);
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(IB)V", line = 280)
    public static final void method2117(int arg0, byte arg1) {
        field4726++;
        if (arg1 != 127) {
            method2117(-69, (byte) 30);
        }
        if (class179.method1294(arg0, 1)) {
            class290.method2052(arg1 ^ 0x7E, -1, class305.field4779[arg0]);
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(II)V", line = 303)
    public class302(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class199.method1444(127, arg0, arg1);
            int var4 = arg1 / var3;
            this.field4737 = var4;
            int var5 = arg0 / var3;
            this.field4734 = new int[var5][14];
            this.field4727 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field4734[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (-1.0E-4D > var14 || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
