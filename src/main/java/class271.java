import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class271 extends class101 {

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "Lct;")
    private class156 field4006;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "[I")
    private int[] field4008;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public int field3993;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public int field3998;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public int field3997;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public int field3996;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "F")
    public float field4007;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "Ldia;")
    private class246 field3999;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "Lhb;")
    private class757 field4002;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Ljw;")
    public static class581 field3994 = new class581(77, 28);

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "Lwe;")
    private class430 field3992;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "Ljaclib/memory/Stream;")
    private Stream field3988;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field4001;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)Z", line = 3)
    public static final boolean method1759(int arg0, int arg1, int arg2) {
        int var3 = -105 % ((arg2 + 9) / 34);
        field4009++;
        return class619.method3401(arg0, 9209, arg1) & class743.method4117(arg0, arg1, 2048);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILbba;)V", line = 18)
    public static final void method1760(int arg0, class124 arg1) {
        field4004++;
        if (arg0 <= 126) {
            method1760(-26, null);
        }
        int var2 = arg1.field1836 - class100.field1401;
        int var3 = arg1.field1814 * 512 + (arg1.method655(-126) * 256);
        int var4 = arg1.field1841 * 512 + arg1.method655(-126) * 256;
        arg1.field2257 += (var3 - arg1.field2257) / var2;
        arg1.field1881 = 0;
        arg1.field2259 += (var4 - arg1.field2259) / var2;
        if (arg1.field1830 == 0) {
            arg1.method1008(8192, (byte) 78);
        }
        if (arg1.field1830 == 1) {
            arg1.method1008(12288, (byte) 123);
        }
        if (arg1.field1830 == 2) {
            arg1.method1008(0, (byte) 89);
        }
        if (arg1.field1830 == 3) {
            arg1.method1008(4096, (byte) 104);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II[BBIII)Z", line = 56)
    public static final boolean method1761(int arg0, int arg1, byte[] arg2, byte arg3, int arg4, int arg5, int arg6) {
        field4000++;
        int var7 = arg6 % arg4;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg4 - var7;
        }
        int var9 = -((arg4 + arg0 - 1) / arg4);
        int var10 = -((arg6 + arg4 - 1) / arg4);
        if (arg3 != 113) {
            field3994 = null;
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg2[arg5] == 0) {
                    return true;
                }
                arg5 += arg4;
            }
            int var13 = arg5 - var8;
            if (arg2[var13 - 1] == 0) {
                return true;
            }
            arg5 = arg1 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ldga;I[[B)V", line = 107)
    public static final void method1762(class219 arg0, int arg1, byte[][] arg2) {
        field3989++;
        int var3 = -91 % ((arg1 - 30) / 45);
        for (int var4 = 0; var4 < arg0.field2883; var4++) {
            class230.method1508((byte) -62);
            for (int var5 = 0; var5 < (class597.field8132 >> 3); var5++) {
                for (int var6 = 0; var6 < (class628.field8800 >> 3); var6++) {
                    int var7 = class590.field7953[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0.field2895 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFE167) >> 14;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class186.field2487.length; var13++) {
                                if (class186.field2487[var13] == var12 && arg2[var13] != null) {
                                    arg0.method1441(var8, class514.field7038, var5 * 8, var6 * 8, -1, class379.field5542, var4, (var10 & 0x7) * 8, (var11 & 0x7) * 8, var9, arg2[var13]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[Ljava/lang/String;)V", line = 177)
    public static final void method1763(int arg0, String[] arg1) {
        field4005++;
        if (arg1.length > 1) {
            for (int var2 = 0; var2 < arg1.length; var2++) {
                if (arg1[var2].startsWith("pause")) {
                    int var3 = 5;
                    try {
                        var3 = Integer.parseInt(arg1[var2].substring(6));
                    } catch (Exception var4) {
                    }
                    class164.method1188((byte) -117, "Pausing for " + var3 + " seconds...");
                    class517.field7063 = arg1;
                    class380.field5556 = var2 + 1;
                    class430.field6120 = (long) (var3 * 1000) + class302.method1910(0);
                    return;
                }
                class704.field9864 = arg1[var2];
                class210.method1395(false, -18422);
            }
        } else {
            class704.field9864 = class704.field9864 + arg1[0];
            class643.field8926 += arg1[0].length();
        }
        if (arg0 != -31780) {
            field3994 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([IIB)V", line = 225)
    public final void method1764(int[] arg0, int arg1, byte arg2) {
        if (arg2 != -91) {
            this.method1766(69, (byte) -119);
        }
        field4012++;
        int var4 = 0;
        class406 var5 = this.field3999.field3639;
        var5.field5459 = 0;
        if (this.field3999.field3588) {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg0[var6];
                short[] var8 = this.field4006.field2121[var7];
                int var9 = this.field4008[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((0x1 << var10++ & var9) == 0) {
                            var11 += 3;
                        } else {
                            var5.method2415(false, var8[var11++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method2415(false, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method2415(false, var8[var11++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg0[var12];
                short[] var14 = this.field4006.field2121[var13];
                int var15 = this.field4008[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var14.length > var17) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method2368(127, var14[var17++] & 0xFFFF);
                            var4++;
                            var5.method2368(119, var14[var17++] & 0xFFFF);
                            var5.method2368(121, var14[var17++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field4002.method1373(var5.field5459, true, 5123, var5.field5518);
        this.field3999.method1600(this.field4006.field2161, this.field3992, this.field4006.field2166, (byte) 65, this.field4006.field2167);
        this.field3999.method1580((this.field4006.field2158 & 0x8) != 0, -32055, ~(this.field4006.field2158 & 0x7) != -1, this.field3998);
        if (this.field3999.field3583) {
            this.field3999.method557(Integer.MAX_VALUE, this.field3996, this.field3993, this.field3997);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field4007, 1.0F / this.field4007, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field3999.method1600(this.field4006.field2161, this.field3992, this.field4006.field2166, (byte) 47, this.field4006.field2167);
        this.field3999.method1586(this.field4002, var4, 4, true, 0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)V", line = 348)
    public final void method1765(int arg0, int arg1, int arg2, int arg3) {
        field3991++;
        this.field4008[this.field4006.field4301 * arg2 + arg1] = class213.method1409(this.field4008[this.field4006.field4301 * arg2 + arg1], 0x1 << arg0);
        if (arg3 != 1340270824) {
            this.field3999 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)V", line = 359)
    public final void method1766(int arg0, byte arg1) {
        if (arg1 >= -48) {
            this.method1768(118, -102, 64, 73, 0.27253672F);
        }
        this.field3988.method3925(arg0 * 4 + 3);
        field4011++;
        this.field3988.method3917(-1);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V", line = 384)
    public static void method1767(boolean arg0) {
        if (arg0) {
            field3994 = null;
        }
        field3994 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIF)V", line = 394)
    public final void method1768(int arg0, int arg1, int arg2, int arg3, float arg4) {
        if (~this.field3998 != arg2) {
            class662 var6 = this.field3999.field912.method1174(this.field3998, true);
            int var7 = var6.field9146 & 0xFF;
            if (var7 != 0 && var6.field9140 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field9133 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg3 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg3 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var14 >> 8) + ((var12 << 8 & 0xFF0019) + (var13 & 0xFF00));
            }
        }
        field3995++;
        this.field3988.method3925(arg1 * 4);
        if (arg4 != 1.0F) {
            int var15 = (arg3 & 0xFF505A) >> 16;
            int var16 = (arg3 & 0xFF23) >> 8;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg4);
            int var19 = (int) ((float) var16 * arg4);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg4);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var20 | var19 << 8 | var18 << 16;
        }
        this.field3988.method3917((byte) (arg3 >> 16));
        this.field3988.method3917((byte) (arg3 >> 8));
        this.field3988.method3917((byte) arg3);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V", line = 505)
    public final void method1769(int arg0, int arg1) {
        field3990++;
        this.field4001 = this.field3999.field3533.method3913(arg0 * 4, true);
        if (arg1 != -17605) {
            field4010 = 113;
        }
        this.field3988 = new Stream(this.field4001);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)V", line = 517)
    public final void method1770(int arg0, int arg1) {
        this.field3988.method3922();
        field4003++;
        class401 var3 = this.field3999.method1656(this.field4001, false, arg0 * arg1, arg0 ^ 0x3, 4);
        this.field3992 = new class430(var3, 5121, 4, 0);
        this.field3988 = null;
        this.field4001 = null;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lct;IIIII)V", line = 530)
    public class271(class156 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4006 = arg0;
        this.field4008 = new int[this.field4006.field4301 * this.field4006.field4300];
        this.field3993 = arg4;
        this.field3998 = arg1;
        this.field3997 = arg5;
        this.field3996 = arg3;
        this.field4007 = arg2;
        this.field3999 = this.field4006.field2156;
        this.field4002 = new class757(this.field3999, 5123, null, 1);
    }
}
