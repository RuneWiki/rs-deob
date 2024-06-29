import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class436 extends class682 {

    @OriginalMember(owner = "client!vfa", name = "n", descriptor = "Ldc;")
    private class302 field6324 = new class302();

    @OriginalMember(owner = "client!vfa", name = "q", descriptor = "I")
    private int field6327 = this.field9623 + -2;

    @OriginalMember(owner = "client!vfa", name = "m", descriptor = "Luca;")
    public class287 field6323;

    @OriginalMember(owner = "client!vfa", name = "B", descriptor = "I")
    private int field6338;

    @OriginalMember(owner = "client!vfa", name = "N", descriptor = "[[[I")
    private int[][][] field6349;

    @OriginalMember(owner = "client!vfa", name = "G", descriptor = "[[[I")
    private int[][][] field6343;

    @OriginalMember(owner = "client!vfa", name = "F", descriptor = "I")
    public int field6342;

    @OriginalMember(owner = "client!vfa", name = "Q", descriptor = "[[[I")
    public int[][][] field6352;

    @OriginalMember(owner = "client!vfa", name = "Z", descriptor = "[[F")
    private float[][] field6361;

    @OriginalMember(owner = "client!vfa", name = "Y", descriptor = "[[B")
    private byte[][] field6360;

    @OriginalMember(owner = "client!vfa", name = "t", descriptor = "[[[Leca;")
    private class320[][][] field6330;

    @OriginalMember(owner = "client!vfa", name = "T", descriptor = "[[B")
    private byte[][] field6355;

    @OriginalMember(owner = "client!vfa", name = "E", descriptor = "[[S")
    public short[][] field6341;

    @OriginalMember(owner = "client!vfa", name = "s", descriptor = "[[[I")
    public int[][][] field6329;

    @OriginalMember(owner = "client!vfa", name = "ab", descriptor = "[[F")
    private float[][] field6362;

    @OriginalMember(owner = "client!vfa", name = "db", descriptor = "[[F")
    private float[][] field6365;

    @OriginalMember(owner = "client!vfa", name = "z", descriptor = "[[[I")
    public int[][][] field6336;

    @OriginalMember(owner = "client!vfa", name = "bb", descriptor = "Lefa;")
    private class322 field6363;

    @OriginalMember(owner = "client!vfa", name = "u", descriptor = "Lpga;")
    private class152 field6331;

    @OriginalMember(owner = "client!vfa", name = "W", descriptor = "Lnb;")
    public static class318 field6358 = new class318("LOCAL", 4);

    @OriginalMember(owner = "client!vfa", name = "X", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6359 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!vfa", name = "mb", descriptor = "Lvg;")
    public static class622 field6374 = new class622(94, 10);

    @OriginalMember(owner = "client!vfa", name = "ob", descriptor = "[S")
    public static short[] field6376 = new short[256];

    @OriginalMember(owner = "client!vfa", name = "l", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!vfa", name = "o", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!vfa", name = "p", descriptor = "I")
    private int field6326;

    @OriginalMember(owner = "client!vfa", name = "r", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!vfa", name = "x", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!vfa", name = "y", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!vfa", name = "A", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!vfa", name = "C", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!vfa", name = "D", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!vfa", name = "H", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!vfa", name = "I", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!vfa", name = "J", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!vfa", name = "K", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!vfa", name = "L", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!vfa", name = "O", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!vfa", name = "P", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!vfa", name = "R", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!vfa", name = "S", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!vfa", name = "U", descriptor = "I")
    private int field6356;

    @OriginalMember(owner = "client!vfa", name = "V", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!vfa", name = "gb", descriptor = "I")
    private int field6368;

    @OriginalMember(owner = "client!vfa", name = "hb", descriptor = "I")
    private int field6369;

    @OriginalMember(owner = "client!vfa", name = "nb", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!vfa", name = "cb", descriptor = "Lgv;")
    public class39 field6364;

    @OriginalMember(owner = "client!vfa", name = "eb", descriptor = "Lgv;")
    public class39 field6366;

    @OriginalMember(owner = "client!vfa", name = "fb", descriptor = "Lgv;")
    public class39 field6367;

    @OriginalMember(owner = "client!vfa", name = "ib", descriptor = "Lgv;")
    private class39 field6370;

    @OriginalMember(owner = "client!vfa", name = "kb", descriptor = "Lfba;")
    private class558 field6372;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vfa", name = "pb", descriptor = "Ljava/lang/Class;")
    public static Class field6377;

    @OriginalMember(owner = "client!vfa", name = "v", descriptor = "Ljava/lang/String;")
    public static String field6332;

    @OriginalMember(owner = "client!vfa", name = "lb", descriptor = "[I")
    public static int[] field6373;

    @OriginalMember(owner = "client!vfa", name = "jb", descriptor = "[Leca;")
    private class320[] field6371;

    @OriginalMember(owner = "client!vfa", name = "w", descriptor = "[[[I")
    private int[][][] field6333;

    // $FF: synthetic method
    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2593(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ILuu;IB)V", line = 3)
    private final void method2587(int arg0, class495 arg1, int arg2, byte arg3) {
        ++field6340;
        int[] var5 = this.field6336[arg0][arg2];
        int[] var6 = this.field6352[arg0][arg2];
        int var7 = var5.length;
        if (~this.field6323.field4169.length > ~var7) {
            this.field6323.field4170 = new int[var7];
            this.field6323.field4169 = new int[var7];
        }
        int[] var8 = this.field6323.field4169;
        int[] var9 = this.field6323.field4170;
        for (int var10 = 0; ~var7 < ~var10; ++var10) {
            var8[var10] = var5[var10] >> this.field6323.field4019;
            var9[var10] = var6[var10] >> this.field6323.field4019;
        }
        int var11 = -108 / ((arg3 - -47) / 62);
        int var12 = 0;
        while (var12 < var7) {
            int var13 = var8[var12];
            int var14 = var9[var12++];
            int var15 = var8[var12];
            int var16 = var9[var12++];
            int var17 = var8[var12];
            int var18 = var9[var12++];
            if ((-var15 + var13) * (-var18 + var16) + -((-var14 + var16) * (-var15 + var17)) > 0) {
                arg1.method2830(false, var15, var14, var16, var18, var13, var17);
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 66)
    public static final boolean method2588(String arg0, byte arg1) {
        ++field6328;
        return arg1 < 32 ? true : class645.method3673(field6377 != null ? field6377 : (field6377 = method2593("fs")), arg0, 110);
    }

    @OriginalMember(owner = "client!vfa", name = "v", descriptor = "(IILha;)Lha;", line = 81)
    public final class425 method2171(int arg0, int arg1, class425 arg2) {
        ++field6345;
        if ((1 & this.field6355[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field9629 >> this.field6323.field4019;
            class495 var5 = (class495) arg2;
            class495 var6;
            if (var5 != null && var5.method2829(var4, 112, var4)) {
                var6 = var5;
                var5.method2828(-93);
            } else {
                var6 = new class495(this.field6323, var4, var4);
            }
            var6.method2826(0, var4, 0, var4, false);
            this.method2587(arg0, var6, arg1, (byte) 34);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)V", line = 114)
    public final void method2182(int arg0, int arg1) {
        ++field6348;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lha;IIIIZ)Z", line = 124)
    public final boolean method2176(class425 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6354;
        if (this.field6331 != null && arg0 != null) {
            int var7 = arg1 - (this.field6323.field4143 * arg2 >> 8) >> this.field6323.field4019;
            int var8 = -(this.field6323.field4112 * arg2 >> 8) + arg3 >> this.field6323.field4019;
            return this.field6331.method1082(var7, arg0, var8, -93);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III)V", line = 144)
    public final void method2183(int arg0, int arg1, int arg2) {
        if (arg2 > (this.field6360[arg0][arg1] & 255)) {
            this.field6360[arg0][arg1] = (byte) arg2;
        }
        ++field6351;
    }

    @OriginalMember(owner = "client!vfa", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 160)
    public final void method2184(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field6347;
        if (arg3 != null && this.field6343 == null) {
            this.field6343 = new int[super.field9628][super.field9630][];
        }
        if (arg5 != null && this.field6333 == null) {
            this.field6333 = new int[super.field9628][super.field9630][];
        }
        this.field6336[arg0][arg1] = arg2;
        this.field6352[arg0][arg1] = arg4;
        this.field6329[arg0][arg1] = arg6;
        this.field6349[arg0][arg1] = arg7;
        if (this.field6333 != null) {
            this.field6333[arg0][arg1] = arg5;
        }
        if (this.field6343 != null) {
            this.field6343[arg0][arg1] = arg3;
        }
        class320[] var15 = this.field6330[arg0][arg1] = new class320[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class381 var19;
            for (var19 = this.field6363.method2002((byte) -121, var17); var19 != null; var19 = this.field6363.method1999(90)) {
                class320 var20 = (class320) var19;
                if (~arg8[var16] == ~var20.field4658 && (float) arg9[var16] == var20.field4666 && var20.field4665 == arg10 && ~var20.field4653 == ~arg11 && ~var20.field4650 == ~arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class320(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field6363.method2001(-104, var15[var16], var17);
            } else {
                var15[var16] = (class320) var19;
            }
        }
        if (arg13) {
            this.field6355[arg0][arg1] = (byte) class151.method1076(this.field6355[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field6369) {
            this.field6369 = arg6.length;
        }
        this.field6368 += arg6.length;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Ltg;[I)V", line = 228)
    public final void method2185(class334 arg0, int[] arg1) {
        ++field6350;
        this.field6324.method1909(new class522(this.field6323, this, arg0, arg1), (byte) -81);
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Z[[ZIIIZI)V", line = 239)
    private final void method2589(boolean arg0, boolean[][] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        ++field6357;
        if (!arg5) {
            this.method2174(-116, 66, 36, (boolean[][]) null, false);
        }
        if (this.field6371 != null) {
            int var8 = arg4 + arg4 + 1;
            int var9 = var8 * var8;
            if (this.field6323.field4173.length < var9) {
                this.field6323.field4173 = new int[var9];
            }
            if (this.field6323.field4073.field7952.length < this.field6326 * 2) {
                this.field6323.field4073 = new class449(this.field6326 * 2);
            }
            int var10 = -arg4 + arg2;
            int var11 = var10;
            if (~var10 > -1) {
                var10 = 0;
            }
            int var12 = -arg4 + arg3;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg2 + arg4;
            if (var14 > super.field9628 + -1) {
                var14 = super.field9628 + -1;
            }
            int var15 = arg3 + arg4;
            if (~(super.field9630 + -1) > ~var15) {
                var15 = super.field9630 + -1;
            }
            int var16 = 0;
            int[] var17 = this.field6323.field4173;
            for (int var18 = var10; var18 <= var14; ++var18) {
                boolean[] var24 = arg1[-var11 + var18];
                for (int var25 = var12; ~var15 <= ~var25; ++var25) {
                    if (var24[var25 - var13]) {
                        var17[var16++] = super.field9628 * var25 + var18;
                    }
                }
            }
            if (~arg6 != 0) {
                this.field6323.method1691((float) arg6, arg5);
                this.field6323.method1712(false);
            } else {
                this.field6323.method1730((byte) 90);
            }
            this.field6323.method1705((7 & this.field6342) != 0, (byte) 94);
            for (int var19 = 0; var19 < this.field6371.length; ++var19) {
                this.field6371[var19].method1980(96, var16, var17);
            }
            if (!this.field6324.method1903(-112)) {
                int var20 = this.field6323.field4163;
                int var21 = this.field6323.field4068;
                this.field6323.method718(0, var21, this.field6323.field4094);
                this.field6323.method1705(false, (byte) -93);
                this.field6323.method1694((byte) 92, false);
                this.field6323.method1721(89, 128);
                this.field6323.method1761(-2, 260);
                this.field6323.method1709((byte) -67, this.field6323.field4165);
                this.field6323.method1701(8448, 1, 7681);
                this.field6323.method1755(34166, 34176, 770, 0);
                this.field6323.method1724((byte) 11, 770, 34167, 0);
                for (class381 var22 = this.field6324.method1904(false); var22 != null; var22 = this.field6324.method1901(119)) {
                    class522 var23 = (class522) var22;
                    var23.method2947(arg2, true, arg4, arg1, arg3);
                }
                this.field6323.method1755(5890, 34176, 768, 0);
                this.field6323.method1724((byte) 11, 770, 5890, 0);
                this.field6323.method1709((byte) -84, (class517) null);
                this.field6323.method718(var20, var21, this.field6323.field4094);
            }
            if (this.field6331 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field6323.method1714(this.field6364, -1, (class39) null, (class39) null, this.field6366);
                this.field6331.method1079(arg4, arg0, (byte) -97, arg3, arg2, arg1);
                OpenGL.glPopMatrix();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "DA", descriptor = "(Lha;IIIIZ)V", line = 383)
    public final void method2181(class425 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6337;
        if (this.field6331 != null && arg0 != null) {
            int var7 = -(this.field6323.field4143 * arg2 >> 8) + arg1 >> this.field6323.field4019;
            int var8 = arg3 - (this.field6323.field4112 * arg2 >> 8) >> this.field6323.field4019;
            this.field6331.method1080(var7, arg0, -1, var8);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III[[ZZ)V", line = 403)
    public final void method2174(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field6344;
        this.method2589(arg4, arg3, arg0, arg1, arg2, true, -1);
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIIIIII[[Z)V", line = 411)
    public final void method2170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field6325;
        if (this.field6368 > 0) {
            this.field6323.method1703((byte) -105);
            this.field6323.method1770(false, (byte) 105);
            this.field6323.method1705(false, (byte) 71);
            this.field6323.method1693(false, false);
            this.field6323.method1694((byte) 127, false);
            this.field6323.method1721(25, 0);
            this.field6323.method1761(-2, 260);
            this.field6323.method1709((byte) -86, (class517) null);
            class15.field331[7] = 0.0F;
            class15.field331[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field6323.field3941;
            class15.field331[6] = 0.0F;
            class15.field331[9] = 0.0F;
            class15.field331[0] = (float) arg2 / ((float) super.field9629 * 128.0F * (float) this.field6323.field3941);
            class15.field331[3] = 0.0F;
            class15.field331[15] = 1.0F;
            class15.field331[2] = 0.0F;
            class15.field331[8] = 0.0F;
            class15.field331[10] = 0.0F;
            class15.field331[11] = 0.0F;
            class15.field331[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field6323.field3959) + 1.0F;
            class15.field331[4] = 0.0F;
            class15.field331[5] = (float) arg2 / ((float) super.field9629 * 128.0F * (float) this.field6323.field3959);
            class15.field331[1] = 0.0F;
            class15.field331[14] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class15.field331, 0);
            class15.field331[0] = 1.0F;
            class15.field331[6] = 1.0F;
            class15.field331[14] = 0.0F;
            class15.field331[4] = 0.0F;
            class15.field331[9] = 1.0F;
            class15.field331[7] = 0.0F;
            class15.field331[3] = 0.0F;
            class15.field331[13] = 0.0F;
            class15.field331[11] = 0.0F;
            class15.field331[5] = 0.0F;
            class15.field331[12] = 0.0F;
            class15.field331[1] = 0.0F;
            class15.field331[2] = 0.0F;
            class15.field331[8] = 0.0F;
            class15.field331[10] = 0.0F;
            class15.field331[15] = 1.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class15.field331, 0);
            if (~(this.field6342 & 7) != -1) {
                this.field6323.method1705(true, (byte) 117);
                this.field6323.method1756((byte) -17);
            } else {
                this.field6323.method1705(false, (byte) -125);
            }
            this.field6323.method1714(this.field6364, -1, this.field6367, this.field6370, this.field6366);
            if (~this.field6323.field4073.field7952.length <= ~(this.field6326 * 2)) {
                this.field6323.field4073.field7956 = 0;
            } else {
                this.field6323.field4073 = new class449(this.field6326 * 2);
            }
            int var9 = 0;
            class449 var10 = this.field6323.field4073;
            if (!this.field6323.field4060) {
                for (int var11 = arg4; ~var11 > ~arg6; ++var11) {
                    int var12 = super.field9628 * var11 + arg3;
                    for (int var13 = arg3; ~arg5 < ~var13; ++var13) {
                        if (arg7[-arg3 + var13][var11 - arg4]) {
                            short[] var14 = this.field6341[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var14.length > var15; ++var15) {
                                    ++var9;
                                    var10.method3120(65535 & var14[var15], -23026);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                    int var18 = super.field9628 * var16 + arg3;
                    for (int var19 = arg3; ~var19 > ~arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field6341[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var20.length < ~var21; ++var21) {
                                    var10.method3162(-2003712696, var20[var21] & 65535);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class588 var17 = new class588(this.field6323, 5123, var10.field7952, var10.field7956);
                this.field6323.method1702(4, 0, var9, 28498, var17);
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III[[ZZI)V", line = 583)
    public final void method2168(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method2589(arg4, arg3, arg0, arg1, arg2, true, arg5);
        ++field6353;
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(B)V", line = 594)
    public static void method2590(byte arg0) {
        field6374 = null;
        field6358 = null;
        field6373 = null;
        if (arg0 < 88) {
            field6359 = null;
        }
        field6359 = null;
        field6376 = null;
        field6332 = null;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 609)
    public final void method2167(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field6339;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; ~var18 < ~var28; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method2184(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!vfa", name = "BA", descriptor = "()V", line = 696)
    public final void method2175() {
        ++field6322;
        if (this.field6368 <= 0) {
            this.field6331 = null;
        } else {
            byte[][] var1 = new byte[super.field9628 + 1][super.field9630 + 1];
            for (int var2 = 1; var2 < super.field9628; ++var2) {
                for (int var103 = 1; var103 < super.field9630; ++var103) {
                    var1[var2][var103] = (byte) ((this.field6360[var2][var103] >> 1) + (this.field6360[var2][var103 + 1] >> 3) + (this.field6360[var2 + -1][var103] >> 2) + (this.field6360[var2][var103 - 1] >> 2) + (this.field6360[var2 + 1][var103] >> 3));
                }
            }
            this.field6371 = new class320[this.field6363.method1996((byte) -63)];
            this.field6363.method1994(this.field6371, (byte) 115);
            for (int var3 = 0; this.field6371.length > var3; ++var3) {
                this.field6371[var3].method1987(this.field6368, 64);
            }
            int var4 = 24;
            if (this.field6333 != null) {
                var4 += 4;
            }
            if (~(7 & this.field6342) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field6323.field4018.method2073(this.field6368 * var4, false);
            Stream var6 = new Stream(var5);
            class320[] var7 = new class320[this.field6368];
            int var8 = class334.method2048(this.field6368 / 4, (byte) -46);
            if (var8 < 1) {
                var8 = 1;
            }
            class322 var9 = new class322(var8);
            class320[] var10 = new class320[this.field6369];
            for (int var11 = 0; ~super.field9628 < ~var11; ++var11) {
                for (int var30 = 0; ~super.field9630 < ~var30; ++var30) {
                    if (this.field6329[var11][var30] != null) {
                        class320[] var31 = this.field6330[var11][var30];
                        int[] var32 = this.field6336[var11][var30];
                        int[] var33 = this.field6352[var11][var30];
                        int[] var34 = this.field6349[var11][var30];
                        int[] var35 = this.field6329[var11][var30];
                        int[] var36 = this.field6343 == null ? null : this.field6343[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field6333 != null ? this.field6333[var11][var30] : null;
                        float var38 = this.field6361[var11][var30];
                        float var39 = this.field6362[var11][var30];
                        float var40 = this.field6365[var11][var30];
                        float var41 = this.field6361[var11][var30 - -1];
                        float var42 = this.field6362[var11][var30 + 1];
                        float var43 = this.field6365[var11][var30 - -1];
                        float var44 = this.field6361[var11 + 1][var30 + 1];
                        float var45 = this.field6362[var11 + 1][var30 + 1];
                        float var46 = this.field6365[var11 + 1][var30 + 1];
                        float var47 = this.field6361[var11 - -1][var30];
                        float var48 = this.field6362[var11 + 1][var30];
                        float var49 = this.field6365[var11 + 1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = 255 & var1[var11 - -1][var30 + 1];
                        int var53 = var1[var11 + 1][var30] & 255;
                        int var54 = 0;
                        label339: for (int var55 = 0; ~var55 > ~var35.length; ++var55) {
                            class320 var101 = var31[var55];
                            for (int var102 = 0; var102 < var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label339;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field6341[super.field9628 * var30 - -var11] = new short[var35.length];
                        for (int var57 = 0; var35.length > var57; ++var57) {
                            int var58 = (var11 << super.field9623) - -var32[var57];
                            int var59 = (var30 << super.field9623) + var33[var57];
                            int var60 = var58 >> this.field6327;
                            int var61 = var59 >> this.field6327;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var63 << 48 | (long) var62 << 32 | (long) (var60 << 16) | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            float var72;
                            int var73;
                            float var74;
                            if (var67 == 0 && var68 == 0) {
                                var71 = var40;
                                var72 = var39;
                                var73 = var69 - var50;
                                var74 = var38;
                            } else if (var67 == 0 && super.field9629 == var68) {
                                var71 = var43;
                                var74 = var41;
                                var72 = var42;
                                var73 = var69 - var51;
                            } else if (super.field9629 == var67 && super.field9629 == var68) {
                                var72 = var45;
                                var74 = var44;
                                var73 = var69 - var52;
                                var71 = var46;
                            } else if (super.field9629 == var67 && ~var68 == -1) {
                                var71 = var49;
                                var72 = var48;
                                var74 = var47;
                                var73 = var69 - var53;
                            } else {
                                float var75 = (float) var67 / (float) super.field9629;
                                float var76 = (float) var68 / (float) super.field9629;
                                float var77 = (var47 - var38) * var75 + var38;
                                float var78 = (-var39 + var48) * var75 + var39;
                                float var79 = (var49 - var40) * var75 + var40;
                                float var80 = (var44 - var41) * var75 + var41;
                                float var81 = (var45 - var42) * var75 + var42;
                                var72 = (-var78 + var81) * var76 + var78;
                                float var82 = (var46 - var43) * var75 + var43;
                                var74 = (var80 - var77) * var76 + var77;
                                var71 = (var82 - var79) * var76 + var79;
                                int var83 = ((-var50 + var53) * var67 >> super.field9623) + var50;
                                int var84 = ((var52 - var51) * var67 >> super.field9623) + var51;
                                var73 = var69 - (var83 - -((-var83 + var84) * var68 >> super.field9623));
                            }
                            float var85 = 1.0F;
                            if (var62 != -1) {
                                int var86 = (var62 & 127) * var73 >> 7;
                                if (var86 < 2) {
                                    var86 = 2;
                                } else if (~var86 < -127) {
                                    var86 = 126;
                                }
                                if ((7 & this.field6342) == 0) {
                                    float var87 = this.field6323.field4149[2] * var71 + this.field6323.field4149[1] * var72 + this.field6323.field4149[0] * var74;
                                    var85 = this.field6323.field4121 + var87 * (!(var87 > 0.0F) ? this.field6323.field4125 : this.field6323.field4108);
                                }
                                var70 = class391.field5908[65408 & var62 | var86];
                            }
                            class381 var88 = null;
                            if (~(var58 & this.field6338 + -1) == -1 && ~(this.field6338 + -1 & var59) == -1) {
                                var88 = var9.method2002((byte) -117, var65);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (var62 == var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (var63 & 127) * var73 >> 7;
                                    if (var90 < 2) {
                                        var90 = 2;
                                    } else if (var90 > 126) {
                                        var90 = 126;
                                    }
                                    var89 = class391.field5908[var90 | var63 & 65408];
                                    if ((7 & this.field6342) == 0) {
                                        float var91 = this.field6323.field4149[2] * var71 + this.field6323.field4149[1] * var72 + this.field6323.field4149[0] * var74;
                                        float var92 = this.field6323.field4121 + (!(var85 > 0.0F) ? this.field6323.field4125 : this.field6323.field4108) * var85;
                                        int var93 = (var89 & 16717915) >> 16;
                                        int var94 = var89 >> 8 & 255;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = var89 & 255;
                                        if (~var95 > -1) {
                                            var95 = 0;
                                        } else if (~var95 < -256) {
                                            var95 = 255;
                                        }
                                        int var97 = (int) ((float) var94 * var92);
                                        if (var97 < 0) {
                                            var97 = 0;
                                        } else if (var97 > 255) {
                                            var97 = 255;
                                        }
                                        int var98 = (int) ((float) var96 * var92);
                                        if (~var98 > -1) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        var89 = var95 << 16 | var97 << 8 | var98;
                                    }
                                }
                                if (this.field6323.field4060) {
                                    var6.method2075((float) var58);
                                    var6.method2075((float) (var64 + this.method3824(var58, 117, var59)));
                                    var6.method2075((float) var59);
                                    var6.method2082((byte) (var89 >> 16));
                                    var6.method2082((byte) (var89 >> 8));
                                    var6.method2082((byte) var89);
                                    var6.method2082(-1);
                                    var6.method2075((float) var58);
                                    var6.method2075((float) var59);
                                    if (this.field6333 != null) {
                                        var6.method2075((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if ((7 & this.field6342) != 0) {
                                        var6.method2075(var74);
                                        var6.method2075(var72);
                                        var6.method2075(var71);
                                    }
                                } else {
                                    var6.method2088((float) var58);
                                    var6.method2088((float) (this.method3824(var58, 124, var59) - -var64));
                                    var6.method2088((float) var59);
                                    var6.method2082((byte) (var89 >> 16));
                                    var6.method2082((byte) (var89 >> 8));
                                    var6.method2082((byte) var89);
                                    var6.method2082(-1);
                                    var6.method2088((float) var58);
                                    var6.method2088((float) var59);
                                    if (this.field6333 != null) {
                                        var6.method2088((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(7 & this.field6342) != -1) {
                                        var6.method2088(var74);
                                        var6.method2088(var72);
                                        var6.method2088(var71);
                                    }
                                }
                                var99 = this.field6356++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method2001(90, new class263(var56[var57]), var65);
                            } else {
                                var56[var57] = ((class263) var88).field3409;
                                var99 = var56[var57] & 65535;
                                if (var62 != -1 && var31[var57].field5740 < var7[var99].field5740) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var100 < var54; ++var100) {
                                var10[var100].method1981(-109, var85, var73, var70, var99);
                            }
                            ++this.field6326;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field6356; ++var12) {
                class320 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1986((byte) -98, var12);
                }
            }
            for (int var13 = 0; super.field9628 > var13; ++var13) {
                for (int var18 = 0; super.field9630 > var18; ++var18) {
                    short[] var19 = this.field6341[super.field9628 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var19.length > var21) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = 65535 & var19[var21++];
                            int var24 = 65535 & var19[var21++];
                            class320 var25 = var7[var22];
                            class320 var26 = var7[var23];
                            class320 var27 = var7[var24];
                            class320 var28 = null;
                            if (var25 != null) {
                                var25.method1984(var20, var18, (byte) 127, var13);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method1984(var20, var18, (byte) 127, var13);
                                if (var28 == null || var26.field5740 < var28.field5740) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1984(var20, var18, (byte) 127, var13);
                                if (var28 == null || ~var28.field5740 < ~var27.field5740) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1986((byte) -98, var22);
                                }
                                if (var26 != null) {
                                    var28.method1986((byte) -98, var23);
                                }
                                if (var27 != null) {
                                    var28.method1986((byte) -98, var24);
                                }
                                var28.method1984(var20, var18, (byte) 127, var13);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2084();
            this.field6372 = this.field6323.method1707(false, var6.method2076(), var4, 5126, var5);
            this.field6366 = new class39(this.field6372, 5126, 3, 0);
            this.field6370 = new class39(this.field6372, 5121, 4, 12);
            byte var14;
            if (this.field6333 != null) {
                this.field6364 = new class39(this.field6372, 5126, 3, 16);
                var14 = 28;
            } else {
                this.field6364 = new class39(this.field6372, 5126, 2, 16);
                var14 = 24;
            }
            if (~(this.field6342 & 7) != -1) {
                this.field6367 = new class39(this.field6372, 5126, 3, var14);
            }
            long[] var15 = new long[this.field6371.length];
            for (int var16 = 0; ~var16 > ~this.field6371.length; ++var16) {
                class320 var17 = this.field6371[var16];
                var15[var16] = var17.field5740;
                var17.method1982(this.field6356, false);
            }
            class550.method3213(this.field6371, var15, -69);
            if (this.field6331 != null) {
                this.field6331.method1078((byte) -68);
            }
        }
        this.field6333 = null;
        this.field6360 = null;
        this.field6330 = null;
        this.field6336 = this.field6352 = null;
        this.field6343 = null;
        this.field6361 = this.field6362 = this.field6365 = null;
        this.field6329 = null;
        this.field6363 = null;
        this.field6349 = null;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lps;IBI)V", line = 1276)
    public static final void method2591(class5 arg0, int arg1, byte arg2, int arg3) {
        ++field6334;
        class56.field874 = arg1;
        int var4 = -73 % ((arg2 - -5) / 46);
        class203.field2768 = arg3;
        client.field1440 = arg0;
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Luca;IIII[[I[[II)V", line = 1288)
    public class436(class287 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field6323 = arg0;
        this.field6338 = 1 << this.field6327;
        this.field6349 = new int[arg3][arg4][];
        this.field6343 = new int[arg3][arg4][];
        this.field6342 = arg2;
        this.field6352 = new int[arg3][arg4][];
        this.field6361 = new float[super.field9628 - -1][super.field9630 + 1];
        this.field6360 = new byte[arg3 + 1][arg4 - -1];
        this.field6330 = new class320[arg3][arg4][];
        this.field6355 = new byte[arg3][arg4];
        this.field6341 = new short[arg3 * arg4][];
        this.field6329 = new int[arg3][arg4][];
        this.field6362 = new float[super.field9628 + 1][super.field9630 + 1];
        this.field6365 = new float[super.field9628 - -1][super.field9630 + 1];
        this.field6336 = new int[arg3][arg4][];
        for (int var9 = 1; ~var9 > ~super.field9630; ++var9) {
            for (int var10 = 1; var10 < super.field9628; ++var10) {
                int var11 = arg6[var10 - -1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field6361[var10][var9] = (float) var11 * var13;
                this.field6362[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field6365[var10][var9] = (float) var12 * var13;
            }
        }
        this.field6363 = new class322(128);
        if (~(this.field6342 & 16) != -1) {
            this.field6331 = new class152(this.field6323, this);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)V", line = 1346)
    public static final void method2592(int arg0) {
        if (arg0 != 12) {
            method2588((String) null, (byte) -27);
        }
        if (class600.field8685 != null) {
            try {
                class600.field8685.close();
            } catch (IOException var1) {
            }
        }
        ++field6346;
        class600.field8685 = null;
    }

    @OriginalMember(owner = "client!vfa", name = "E", descriptor = "(Lha;IIIIZ)V", line = 1368)
    public final void method2173(class425 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6335;
        if (this.field6331 != null && arg0 != null) {
            int var7 = -(this.field6323.field4143 * arg2 >> 8) + arg1 >> this.field6323.field4019;
            int var8 = -(this.field6323.field4112 * arg2 >> 8) + arg3 >> this.field6323.field4019;
            this.field6331.method1085(var7, var8, arg0, (byte) -38);
        }
    }
}
