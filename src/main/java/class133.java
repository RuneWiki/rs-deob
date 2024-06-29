import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class133 extends class499 {

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "Lpe;")
    private class432 field1920;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "Lht;")
    private class410 field1922;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Ljt;")
    private class67 field1908;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    private int field1927;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    private int field1921;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    private int field1911;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
    private int field1917;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "[[F")
    private float[][] field1919;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "[[F")
    private float[][] field1916;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "[[F")
    private float[][] field1907;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "Llh;")
    private class365 field1930;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "Lom;")
    private class251 field1909;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "Lbj;")
    private class159 field1923;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "Lnk;")
    private class502 field1928;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "Lbm;")
    private class74 field1914;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "Lds;")
    private class12 field1924;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "Lds;")
    private class12 field1931;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field1926 = new String[200];

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Z")
    public static boolean field1906 = false;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "Ljm;")
    public static class485 field1932 = new class485(67, 7);

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "Luf;")
    public static class310 field1933 = new class310(19, 20);

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    private int field1913;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    private int field1915;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIII)V", line = 16)
    public static final void method876(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1910++;
        if (class343.field4727 <= arg1 && arg1 <= class54.field753) {
            int var5 = class497.method2935(class175.field2497, arg2, class382.field5379, -125);
            int var6 = class497.method2935(class175.field2497, arg4, class382.field5379, -126);
            class489.method2872(var5, var6, 0, arg3, arg1);
        }
        if (arg0 != 0) {
            method877(116);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 34)
    public static void method877(int arg0) {
        field1926 = null;
        field1933 = null;
        if (arg0 == 1) {
            field1932 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIBIIII)V", line = 48)
    private final void method878(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field1929++;
        long var8 = -1L;
        int var10 = (arg5 << this.field1908.field492) + arg1;
        int var11 = (arg6 << this.field1908.field492) + arg3;
        int var12 = this.field1908.method232(var10, var11);
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class499 var13 = this.field1923.method979((byte) 28, var8);
            if (var13 != null) {
                this.method879(5917, ((class472) var13).field6897);
                return;
            }
        }
        short var14 = (short) (this.field1915++);
        if (var8 != -1L) {
            this.field1923.method990(var8, (byte) 7, new class472(var14));
        }
        if (arg2 != 67) {
            method877(-82);
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg3 == 0) {
            var15 = this.field1907[arg4][arg0];
            var16 = this.field1916[arg4][arg0];
            var17 = this.field1919[arg4][arg0];
        } else if (this.field1908.field494 == arg1 && arg3 == 0) {
            var16 = this.field1916[arg4 + 1][arg0];
            var17 = this.field1919[arg4 + 1][arg0];
            var15 = this.field1907[arg4 + 1][arg0];
        } else if (this.field1908.field494 == arg1 && this.field1908.field494 == arg3) {
            var17 = this.field1919[arg4 + 1][arg0 + 1];
            var15 = this.field1907[arg4 + 1][arg0 + 1];
            var16 = this.field1916[arg4 + 1][arg0 + 1];
        } else if (arg1 == 0 && this.field1908.field494 == arg3) {
            var15 = this.field1907[arg4][arg0 + 1];
            var17 = this.field1919[arg4][arg0 + 1];
            var16 = this.field1916[arg4][arg0 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field1908.field494;
            float var19 = (float) arg3 / (float) this.field1908.field494;
            float var20 = this.field1919[arg4][arg0];
            float var21 = this.field1916[arg4][arg0];
            float var22 = this.field1907[arg4][arg0];
            float var23 = this.field1919[arg4 + 1][arg0];
            float var24 = this.field1916[arg4 + 1][arg0];
            float var25 = (this.field1916[arg4 + 1][arg0 + 1] - var24) * var18 + var24;
            float var26 = (this.field1919[arg4][arg0 + 1] - var20) * var18 + var20;
            float var27 = (this.field1907[arg4][arg0 + 1] - var22) * var18 + var22;
            float var28 = this.field1907[arg4 + 1][arg0];
            float var29 = (this.field1919[arg4 + 1][arg0 + 1] - var23) * var18 + var23;
            float var30 = (this.field1916[arg4][arg0 + 1] - var21) * var18 + var21;
            var16 = (var25 - var30) * var19 + var30;
            float var31 = (this.field1907[arg4 + 1][arg0 + 1] - var28) * var18 + var28;
            var17 = (var29 - var26) * var19 + var26;
            var15 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field1920.method2578(true) - var10);
        float var33 = (float) (this.field1920.method2573(102) - var12);
        float var34 = (float) (this.field1920.method2572(false) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field1920.method2574(false);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var38 + var16 * var39 + var17 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field1920.method2577(arg2 ^ 0x3C);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field1922.field5931) {
            this.field1909.method1477((float) var10, (byte) 121);
            this.field1909.method1477((float) var12, (byte) 117);
            this.field1909.method1477((float) var11, (byte) -113);
        } else {
            this.field1909.method1476(9, (float) var10);
            this.field1909.method1476(-108, (float) var12);
            this.field1909.method1476(-117, (float) var11);
        }
        this.field1909.method2084(var45, false);
        this.field1909.method2084(var46, false);
        this.field1909.method2084(var47, false);
        this.field1909.method2084(255, false);
        this.method879(arg2 ^ 0x175E, var14);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IS)V", line = 218)
    private final void method879(int arg0, short arg1) {
        if (this.field1922.field5931) {
            this.field1930.method2070(81954016, arg1);
        } else {
            this.field1930.method2115((byte) 82, arg1);
        }
        field1918++;
        this.field1913++;
        if (arg0 != 5917) {
            this.field1924 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lht;Ljt;Lpe;[I)V", line = 243)
    public class133(class410 arg0, class67 arg1, class432 arg2, int[] arg3) {
        this.field1920 = arg2;
        this.field1922 = arg0;
        this.field1908 = arg1;
        int var5 = this.field1920.method2574(false) - (arg1.field494 >> 1);
        this.field1927 = this.field1920.method2578(true) - var5 >> arg1.field492;
        this.field1921 = var5 + this.field1920.method2578(true) >> arg1.field492;
        this.field1911 = this.field1920.method2572(false) - var5 >> arg1.field492;
        this.field1917 = var5 + this.field1920.method2572(false) >> arg1.field492;
        int var6 = this.field1921 + 1 - this.field1927;
        int var7 = this.field1917 + 1 - this.field1911;
        this.field1919 = new float[var6 + 1][var7 + 1];
        this.field1916 = new float[var6 + 1][var7 + 1];
        this.field1907 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field1911 + var8;
            if (var24 > 0 && var24 < (this.field1908.field497 - 1)) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = var25 + this.field1927;
                    if (var26 > 0 && (this.field1908.field495 - 1) > var26) {
                        int var27 = arg1.method221(var26 + 1, var24) - arg1.method221(var26 - 1, var24);
                        int var28 = arg1.method221(var26, var24 + 1) - arg1.method221(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 - (-var28 * var28 - 65536))));
                        this.field1919[var25][var8] = (float) var27 * var29;
                        this.field1916[var25][var8] = var29 * -256.0F;
                        this.field1907[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field1911; var11 <= this.field1917; var11++) {
            if (var11 >= 0 && var11 < arg1.field497) {
                for (int var21 = this.field1927; var21 <= this.field1921; var21++) {
                    if (var21 >= 0 && arg1.field495 > var21) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field942[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field1921 - this.field1927;
            }
        }
        if (var9 > 0) {
            this.field1930 = new class365(var9 * 2);
            this.field1909 = new class251(var9 * 16);
            this.field1923 = new class159(class420.method2513(var9, 0));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field1911; var14 <= this.field1917; var14++) {
                if (var14 >= 0 && arg1.field497 > var14) {
                    int var15 = 0;
                    for (int var16 = this.field1927; var16 <= this.field1921; var16++) {
                        if (var16 >= 0 && var16 < arg1.field495) {
                            int var17 = arg3[var12];
                            int[] var18 = arg1.field942[var16][var14];
                            int[] var19 = arg1.field930[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method878(var13, var18[var20], (byte) 67, var19[var20], var15, var16, var14);
                                    }
                                } else if (var17 == 3) {
                                    this.method878(var13, 0, (byte) 67, 0, var15, var16, var14);
                                    this.method878(var13, arg1.field494, (byte) 67, 0, var15, var16, var14);
                                    this.method878(var13, 0, (byte) 67, arg1.field494, var15, var16, var14);
                                } else if (var17 == 2) {
                                    this.method878(var13, arg1.field494, (byte) 67, 0, var15, var16, var14);
                                    this.method878(var13, arg1.field494, (byte) 67, arg1.field494, var15, var16, var14);
                                    this.method878(var13, 0, (byte) 67, 0, var15, var16, var14);
                                } else if (var17 == 5) {
                                    this.method878(var13, arg1.field494, (byte) 67, arg1.field494, var15, var16, var14);
                                    this.method878(var13, 0, (byte) 67, arg1.field494, var15, var16, var14);
                                    this.method878(var13, arg1.field494, (byte) 67, 0, var15, var16, var14);
                                } else if (var17 == 4) {
                                    this.method878(var13, 0, (byte) 67, arg1.field494, var15, var16, var14);
                                    this.method878(var13, 0, (byte) 67, 0, var15, var16, var14);
                                    this.method878(var13, arg1.field494, (byte) 67, arg1.field494, var15, var16, var14);
                                }
                            }
                        }
                        var15++;
                        var12++;
                    }
                } else {
                    var12 += this.field1921 - this.field1927;
                }
                var13++;
            }
            this.field1928 = this.field1922.method2402(1, this.field1930.field5069, this.field1930.field5073, false, 5123);
            this.field1914 = this.field1922.method2389(false, 16, this.field1909.field5073, 1145, this.field1909.field5069);
            this.field1924 = new class12(this.field1922, this.field1914, 5126, 3, 0);
            this.field1931 = new class12(this.field1922, this.field1914, 5121, 4, 12);
        } else {
            this.field1931 = null;
            this.field1928 = null;
            this.field1914 = null;
            this.field1924 = null;
        }
        this.field1909 = null;
        this.field1930 = null;
        this.field1923 = null;
        this.field1919 = this.field1916 = this.field1907 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBI[[ZI)V", line = 458)
    public final void method880(int arg0, byte arg1, int arg2, boolean[][] arg3, int arg4) {
        field1912++;
        if (arg1 != -32 || this.field1928 == null || arg2 + arg4 < this.field1927 || (arg4 - arg2) > this.field1921 || arg0 + arg2 < this.field1911 || arg0 - arg2 > this.field1917) {
            return;
        }
        for (int var6 = this.field1911; var6 <= this.field1917; var6++) {
            for (int var7 = this.field1927; var7 <= this.field1921; var7++) {
                int var8 = var7 - arg4;
                int var9 = var6 - arg0;
                if (var8 > (-arg2) && arg2 > var8 && var9 > -arg2 && var9 < arg2 && arg3[arg2 + var8][arg2 + var9]) {
                    this.field1922.method2408((int) (this.field1920.method2575(115) * 255.0F) << 24, (byte) 85);
                    this.field1922.method2439(null, (byte) -56, this.field1924, this.field1931, null);
                    this.field1922.method2420(0, this.field1913, arg1 - 7, this.field1928, 4);
                    return;
                }
            }
        }
    }
}
