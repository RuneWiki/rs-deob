import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class257 extends class37 {

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "Loe;")
    private class183 field3495 = new class183();

    @OriginalMember(owner = "client!sm", name = "S", descriptor = "I")
    private int field3511 = this.field696 + -2;

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "Lkga;")
    public class506 field3502;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "[[[I")
    public int[][][] field3489;

    @OriginalMember(owner = "client!sm", name = "R", descriptor = "I")
    private int field3510;

    @OriginalMember(owner = "client!sm", name = "Q", descriptor = "[[[I")
    public int[][][] field3509;

    @OriginalMember(owner = "client!sm", name = "M", descriptor = "[[[I")
    public int[][][] field3505;

    @OriginalMember(owner = "client!sm", name = "gb", descriptor = "[[F")
    private float[][] field3525;

    @OriginalMember(owner = "client!sm", name = "jb", descriptor = "[[F")
    private float[][] field3528;

    @OriginalMember(owner = "client!sm", name = "X", descriptor = "I")
    public int field3516;

    @OriginalMember(owner = "client!sm", name = "ib", descriptor = "[[B")
    private byte[][] field3527;

    @OriginalMember(owner = "client!sm", name = "lb", descriptor = "[[F")
    private float[][] field3530;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "[[S")
    public short[][] field3486;

    @OriginalMember(owner = "client!sm", name = "Z", descriptor = "[[[Lut;")
    private class108[][][] field3518;

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "[[[I")
    private int[][][] field3496;

    @OriginalMember(owner = "client!sm", name = "U", descriptor = "[[[I")
    private int[][][] field3513;

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "[[B")
    private byte[][] field3498;

    @OriginalMember(owner = "client!sm", name = "mb", descriptor = "Lwaa;")
    private class652 field3531;

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "Lcu;")
    private class200 field3494;

    @OriginalMember(owner = "client!sm", name = "Y", descriptor = "[I")
    public static int[] field3517 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!sm", name = "H", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!sm", name = "I", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
    private int field3503;

    @OriginalMember(owner = "client!sm", name = "L", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "I")
    private int field3506;

    @OriginalMember(owner = "client!sm", name = "O", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!sm", name = "P", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!sm", name = "T", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!sm", name = "V", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!sm", name = "W", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!sm", name = "bb", descriptor = "I")
    private int field3520;

    @OriginalMember(owner = "client!sm", name = "kb", descriptor = "I")
    private int field3529;

    @OriginalMember(owner = "client!sm", name = "ab", descriptor = "Lrba;")
    public class399 field3519;

    @OriginalMember(owner = "client!sm", name = "eb", descriptor = "Lrba;")
    public class399 field3523;

    @OriginalMember(owner = "client!sm", name = "fb", descriptor = "Lrba;")
    private class399 field3524;

    @OriginalMember(owner = "client!sm", name = "hb", descriptor = "Lrba;")
    public class399 field3526;

    @OriginalMember(owner = "client!sm", name = "db", descriptor = "Lew;")
    private class458 field3522;

    @OriginalMember(owner = "client!sm", name = "cb", descriptor = "[Lut;")
    private class108[] field3521;

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "[[[B")
    public static byte[][][] field3493;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "[[[I")
    private int[][][] field3483;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "(IILha;)Lha;")
    public final class54 method423(int arg0, int arg1, class54 arg2) {
        ++field3492;
        if ((this.field3498[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field695 >> this.field3502.field7261;
            class357 var5 = (class357) arg2;
            class357 var6;
            if (var5 != null && var5.method2011(var4, var4, true)) {
                var6 = var5;
                var5.method2013(0);
            } else {
                var6 = new class357(this.field3502, var4, var4);
            }
            var6.method2015(113, 0, var4, 0, var4);
            this.method1569(arg1, -6939, arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III[[ZZI)V")
    public final void method435(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field3514;
        this.method1566(arg5, arg4, (byte) 70, arg3, arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lul;[I)V")
    public final void method426(class530 arg0, int[] arg1) {
        this.field3495.method1129(new class456(this.field3502, this, arg0, arg1), 262144);
        ++field3507;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3490;
        if (~this.field3520 < -1) {
            this.field3502.method2973(-97);
            this.field3502.method2943(false, (byte) -109);
            this.field3502.method2969(false, (byte) -104);
            this.field3502.method2952(false, (byte) 24);
            this.field3502.method2931((byte) -102, false);
            this.field3502.method2996(0, true);
            this.field3502.method2988(true, -2);
            this.field3502.method2932(true, (class197) null);
            class128.field1623[14] = 0.0F;
            class128.field1623[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field3502.field7089) + -1.0F;
            class128.field1623[2] = 0.0F;
            class128.field1623[4] = 0.0F;
            class128.field1623[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3502.field7059) + 1.0F;
            class128.field1623[3] = 0.0F;
            class128.field1623[9] = 0.0F;
            class128.field1623[5] = (float) arg2 / ((float) super.field695 * 128.0F * (float) this.field3502.field7059);
            class128.field1623[7] = 0.0F;
            class128.field1623[8] = 0.0F;
            class128.field1623[0] = (float) arg2 / ((float) super.field695 * 128.0F * (float) this.field3502.field7089);
            class128.field1623[11] = 0.0F;
            class128.field1623[15] = 1.0F;
            class128.field1623[6] = 0.0F;
            class128.field1623[1] = 0.0F;
            class128.field1623[10] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class128.field1623, 0);
            class128.field1623[14] = 0.0F;
            class128.field1623[3] = 0.0F;
            class128.field1623[15] = 1.0F;
            class128.field1623[5] = 0.0F;
            class128.field1623[9] = 1.0F;
            class128.field1623[12] = 0.0F;
            class128.field1623[11] = 0.0F;
            class128.field1623[0] = 1.0F;
            class128.field1623[1] = 0.0F;
            class128.field1623[4] = 0.0F;
            class128.field1623[7] = 0.0F;
            class128.field1623[10] = 0.0F;
            class128.field1623[13] = 0.0F;
            class128.field1623[8] = 0.0F;
            class128.field1623[2] = 0.0F;
            class128.field1623[6] = 1.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class128.field1623, 0);
            if (~(this.field3516 & 7) == -1) {
                this.field3502.method2969(false, (byte) -104);
            } else {
                this.field3502.method2969(true, (byte) -104);
                this.field3502.method2940((byte) 9);
            }
            this.field3502.method2960(this.field3523, this.field3526, 0, this.field3519, this.field3524);
            if (this.field3503 * 2 <= this.field3502.field7352.field5205.length) {
                this.field3502.field7352.field5195 = 0;
            } else {
                this.field3502.field7352 = new class226(this.field3503 * 2);
            }
            int var9 = 0;
            class226 var10 = this.field3502.field7352;
            if (this.field3502.field7353) {
                for (int var11 = arg4; var11 < arg6; ++var11) {
                    int var12 = super.field702 * var11 + arg3;
                    for (int var13 = arg3; ~var13 > ~arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field3486[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var15 < var14.length; ++var15) {
                                    var10.method2261((byte) 60, 65535 & var14[var15]);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; var16 < arg6; ++var16) {
                    int var18 = super.field702 * var16 + arg3;
                    for (int var19 = arg3; var19 < arg5; ++var19) {
                        if (arg7[var19 - arg3][-arg4 + var16]) {
                            short[] var20 = this.field3486[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var21 < var20.length; ++var21) {
                                    ++var9;
                                    var10.method2236(65535 & var20[var21], 70);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class267 var17 = new class267(this.field3502, 5123, var10.field5205, var10.field5195);
                this.field3502.method2984(var9, 0, 4, var17, 512);
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method427(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3500;
        if (this.field3494 != null && arg0 != null) {
            int var7 = -(this.field3502.field7408 * arg2 >> 8) + arg1 >> this.field3502.field7261;
            int var8 = arg3 - (this.field3502.field7402 * arg2 >> 8) >> this.field3502.field7261;
            return this.field3494.method1218(true, var8, var7, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)V")
    public static final void method1565(int arg0, int arg1) {
        if (!class221.field2851.field4151) {
            arg1 = -1;
        }
        ++field3504;
        if (class273.field3728 != arg1) {
            if (~arg1 != 0) {
                class485 var2 = class404.field5708.method2763(arg1, -75);
                class495 var3 = var2.method2835(true);
                if (var3 != null) {
                    class517.field7570.method1520(class646.field9190, var3.method2882(), var3.method2875(), var3.method2883(), new Point(var2.field6796, var2.field6793), arg0 + 120);
                    class273.field3728 = arg1;
                } else {
                    arg1 = -1;
                }
            }
            if (arg0 == arg1 && ~class273.field3728 != 0) {
                class517.field7570.method1520(class646.field9190, -1, -1, (int[]) null, new Point(), 118);
                class273.field3728 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZB[[ZIII)V")
    private final void method1566(int arg0, boolean arg1, byte arg2, boolean[][] arg3, int arg4, int arg5, int arg6) {
        if (this.field3521 != null) {
            int var8 = arg5 - -arg5 + 1;
            int var9 = var8 * var8;
            if (~var9 < ~this.field3502.field7417.length) {
                this.field3502.field7417 = new int[var9];
            }
            if (~(this.field3503 * 2) < ~this.field3502.field7352.field5205.length) {
                this.field3502.field7352 = new class226(this.field3503 * 2);
            }
            int var10 = -arg5 + arg6;
            int var11 = var10;
            if (var10 < 0) {
                var10 = 0;
            }
            int var12 = -arg5 + arg4;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg5 + arg6;
            if (var14 > super.field702 - 1) {
                var14 = super.field702 - 1;
            }
            int var15 = arg4 + arg5;
            if (var15 > super.field706 + -1) {
                var15 = super.field706 + -1;
            }
            int var16 = 0;
            int[] var17 = this.field3502.field7417;
            for (int var18 = var10; var18 <= var14; ++var18) {
                boolean[] var24 = arg3[-var11 + var18];
                for (int var25 = var12; var15 >= var25; ++var25) {
                    if (var24[-var13 + var25]) {
                        var17[var16++] = super.field702 * var25 + var18;
                    }
                }
            }
            if (~arg0 == 0) {
                this.field3502.method2942(-20);
            } else {
                this.field3502.method2956((float) arg0, (byte) 117);
                this.field3502.method2971((byte) -9);
            }
            this.field3502.method2969((this.field3516 & 7) != 0, (byte) -104);
            for (int var19 = 0; ~var19 > ~this.field3521.length; ++var19) {
                this.field3521[var19].method788(-1, var17, var16);
            }
            if (!this.field3495.method1130((byte) 97)) {
                int var20 = this.field3502.field7380;
                int var21 = this.field3502.field7372;
                this.field3502.method273(0, var21, this.field3502.field7396);
                this.field3502.method2969(false, (byte) -104);
                this.field3502.method2931((byte) -106, false);
                this.field3502.method2996(128, true);
                this.field3502.method2988(true, -2);
                this.field3502.method2932(true, this.field3502.field7323);
                this.field3502.method2948(8448, 7681, (byte) 104);
                this.field3502.method2968(770, 0, (byte) -76, 34166);
                this.field3502.method2938(-128, 34167, 770, 0);
                for (class513 var22 = this.field3495.method1132((byte) 81); var22 != null; var22 = this.field3495.method1134(8446)) {
                    class456 var23 = (class456) var22;
                    var23.method2709(arg3, arg5, arg6, false, arg4);
                }
                this.field3502.method2968(768, 0, (byte) -76, 5890);
                this.field3502.method2938(-127, 5890, 770, 0);
                this.field3502.method2932(true, (class197) null);
                this.field3502.method273(var20, var21, this.field3502.field7396);
            }
            if (this.field3494 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field3502.method2960((class399) null, this.field3526, 0, this.field3519, (class399) null);
                this.field3494.method1220(arg4, arg1, arg3, true, arg6, arg5);
                OpenGL.glPopMatrix();
            }
        }
        ++field3488;
        if (arg2 != 70) {
            this.field3495 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lkga;IIII[[I[[II)V")
    public class257(class506 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field3502 = arg0;
        this.field3489 = new int[arg3][arg4][];
        this.field3510 = 1 << this.field3511;
        this.field3509 = new int[arg3][arg4][];
        this.field3505 = new int[arg3][arg4][];
        this.field3525 = new float[super.field702 + 1][super.field706 - -1];
        this.field3528 = new float[super.field702 - -1][super.field706 + 1];
        this.field3516 = arg2;
        this.field3527 = new byte[arg3 + 1][arg4 + 1];
        this.field3530 = new float[super.field702 + 1][super.field706 + 1];
        this.field3486 = new short[arg3 * arg4][];
        this.field3518 = new class108[arg3][arg4][];
        this.field3496 = new int[arg3][arg4][];
        this.field3513 = new int[arg3][arg4][];
        this.field3498 = new byte[arg3][arg4];
        for (int var9 = 1; super.field706 > var9; ++var9) {
            for (int var10 = 1; ~super.field702 < ~var10; ++var10) {
                int var11 = arg6[var10 - -1][var9] + -arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field3525[var10][var9] = (float) var11 * var13;
                this.field3528[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field3530[var10][var9] = (float) var12 * var13;
            }
        }
        this.field3531 = new class652(128);
        if (~(this.field3516 & 16) != -1) {
            this.field3494 = new class200(this.field3502, this);
        }
    }

    @OriginalMember(owner = "client!sm", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final void method430(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3501;
        if (this.field3494 != null && arg0 != null) {
            int var7 = -(this.field3502.field7408 * arg2 >> 8) + arg1 >> this.field3502.field7261;
            int var8 = -(this.field3502.field7402 * arg2 >> 8) + arg3 >> this.field3502.field7261;
            this.field3494.method1219(15573, arg0, var7, var8);
        }
    }

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final void method429(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3515;
        if (this.field3494 != null && arg0 != null) {
            int var7 = -(this.field3502.field7408 * arg2 >> 8) + arg1 >> this.field3502.field7261;
            int var8 = arg3 - (this.field3502.field7402 * arg2 >> 8) >> this.field3502.field7261;
            this.field3494.method1215(var7, arg0, var8, 6214);
        }
    }

    @OriginalMember(owner = "client!sm", name = "BA", descriptor = "()V")
    public final void method432() {
        ++field3491;
        if (this.field3520 <= 0) {
            this.field3494 = null;
        } else {
            byte[][] var1 = new byte[super.field702 + 1][super.field706 + 1];
            for (int var2 = 1; ~super.field702 < ~var2; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field706; ++var103) {
                    var1[var2][var103] = (byte) ((this.field3527[var2][var103 - 1] >> 2) + (this.field3527[var2 + 1][var103] >> 3) + (this.field3527[var2 + -1][var103] >> 2) + (this.field3527[var2][var103 + 1] >> 3) + (this.field3527[var2][var103] >> 1));
                }
            }
            this.field3521 = new class108[this.field3531.method3673(17467)];
            this.field3531.method3675(this.field3521, -24);
            for (int var3 = 0; this.field3521.length > var3; ++var3) {
                this.field3521[var3].method789(this.field3520, 0);
            }
            int var4 = 24;
            if (this.field3483 != null) {
                var4 += 4;
            }
            if (~(7 & this.field3516) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field3502.field7262.method3569(this.field3520 * var4, false);
            Stream var6 = new Stream(var5);
            class108[] var7 = new class108[this.field3520];
            int var8 = class13.method143(this.field3520 / 4, 92);
            if (~var8 > -2) {
                var8 = 1;
            }
            class652 var9 = new class652(var8);
            class108[] var10 = new class108[this.field3529];
            for (int var11 = 0; ~var11 > ~super.field702; ++var11) {
                for (int var30 = 0; super.field706 > var30; ++var30) {
                    if (this.field3489[var11][var30] != null) {
                        class108[] var31 = this.field3518[var11][var30];
                        int[] var32 = this.field3505[var11][var30];
                        int[] var33 = this.field3509[var11][var30];
                        int[] var34 = this.field3496[var11][var30];
                        int[] var35 = this.field3489[var11][var30];
                        int[] var36 = this.field3513 != null ? this.field3513[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field3483 != null ? this.field3483[var11][var30] : null;
                        float var38 = this.field3525[var11][var30];
                        float var39 = this.field3528[var11][var30];
                        float var40 = this.field3530[var11][var30];
                        float var41 = this.field3525[var11][var30 + 1];
                        float var42 = this.field3528[var11][var30 + 1];
                        float var43 = this.field3530[var11][var30 + 1];
                        float var44 = this.field3525[var11 - -1][var30 - -1];
                        float var45 = this.field3528[var11 + 1][var30 + 1];
                        float var46 = this.field3530[var11 - -1][var30 + 1];
                        float var47 = this.field3525[var11 + 1][var30];
                        float var48 = this.field3528[var11 - -1][var30];
                        float var49 = this.field3530[var11 - -1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = var1[var11 - -1][var30 + 1] & 255;
                        int var53 = var1[var11 + 1][var30] & 255;
                        int var54 = 0;
                        label339: for (int var55 = 0; var35.length > var55; ++var55) {
                            class108 var101 = var31[var55];
                            for (int var102 = 0; ~var54 < ~var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label339;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field3486[super.field702 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var35.length > var57; ++var57) {
                            int var58 = (var11 << super.field696) + var32[var57];
                            int var59 = (var30 << super.field696) - -var33[var57];
                            int var60 = var58 >> this.field3511;
                            int var61 = var59 >> this.field3511;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32 | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            int var72;
                            float var73;
                            float var74;
                            if (~var67 == -1 && var68 == 0) {
                                var71 = var38;
                                var72 = var69 - var50;
                                var73 = var40;
                                var74 = var39;
                            } else if (var67 == 0 && super.field695 == var68) {
                                var74 = var42;
                                var72 = var69 - var51;
                                var73 = var43;
                                var71 = var41;
                            } else if (super.field695 == var67 && ~super.field695 == ~var68) {
                                var71 = var44;
                                var72 = var69 - var52;
                                var74 = var45;
                                var73 = var46;
                            } else if (~super.field695 == ~var67 && var68 == 0) {
                                var74 = var48;
                                var71 = var47;
                                var73 = var49;
                                var72 = var69 - var53;
                            } else {
                                float var75 = (float) var67 / (float) super.field695;
                                float var76 = (float) var68 / (float) super.field695;
                                float var77 = (var47 - var38) * var75 + var38;
                                float var78 = (var48 - var39) * var75 + var39;
                                float var79 = (var49 - var40) * var75 + var40;
                                float var80 = (-var41 + var44) * var75 + var41;
                                float var81 = (var45 - var42) * var75 + var42;
                                float var82 = (-var43 + var46) * var75 + var43;
                                var74 = (-var78 + var81) * var76 + var78;
                                var71 = (var80 - var77) * var76 + var77;
                                var73 = (-var79 + var82) * var76 + var79;
                                int var83 = var50 - -((var53 - var50) * var67 >> super.field696);
                                int var84 = ((var52 - var51) * var67 >> super.field696) + var51;
                                var72 = var69 - (var83 - -((var84 - var83) * var68 >> super.field696));
                            }
                            float var85 = 1.0F;
                            if (var62 != -1) {
                                int var86 = (var62 & 127) * var72 >> 7;
                                if (~var86 > -3) {
                                    var86 = 2;
                                } else if (~var86 < -127) {
                                    var86 = 126;
                                }
                                var70 = class285.field3868[var62 & 65408 | var86];
                                if (~(7 & this.field3516) == -1) {
                                    float var87 = this.field3502.field7324[2] * var73 + this.field3502.field7324[0] * var71 + this.field3502.field7324[1] * var74;
                                    var85 = this.field3502.field7311 + (!(var87 > 0.0F) ? this.field3502.field7321 : this.field3502.field7404) * var87;
                                }
                            }
                            class513 var88 = null;
                            if (~(this.field3510 + -1 & var58) == -1 && (this.field3510 + -1 & var59) == 0) {
                                var88 = var9.method3678(var65, -127);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class384) var88).field5118;
                                var89 = var56[var57] & 65535;
                                if (~var62 != 0 && var7[var89].field7519 > var31[var57].field7519) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var91;
                                if (var62 != var63) {
                                    int var90 = (var63 & 127) * var72 >> 7;
                                    if (~var90 > -3) {
                                        var90 = 2;
                                    } else if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                    var91 = class285.field3868[var63 & 65408 | var90];
                                    if (~(7 & this.field3516) == -1) {
                                        float var92 = this.field3502.field7324[2] * var73 + this.field3502.field7324[0] * var71 + this.field3502.field7324[1] * var74;
                                        float var93 = this.field3502.field7311 + var85 * (var85 > 0.0F ? this.field3502.field7404 : this.field3502.field7321);
                                        int var94 = (16744468 & var91) >> 16;
                                        int var95 = (65392 & var91) >> 8;
                                        int var96 = (int) ((float) var94 * var93);
                                        int var97 = var91 & 255;
                                        int var98 = (int) ((float) var95 * var93);
                                        if (~var96 > -1) {
                                            var96 = 0;
                                        } else if (var96 > 255) {
                                            var96 = 255;
                                        }
                                        if (var98 < 0) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        int var99 = (int) ((float) var97 * var93);
                                        if (~var99 > -1) {
                                            var99 = 0;
                                        } else if (var99 > 255) {
                                            var99 = 255;
                                        }
                                        var91 = var99 | var96 << 16 | var98 << 8;
                                    }
                                } else {
                                    var91 = var70;
                                }
                                if (this.field3502.field7353) {
                                    var6.method3584((float) var58);
                                    var6.method3584((float) (this.method428(true, var58, var59) + var64));
                                    var6.method3584((float) var59);
                                    var6.method3576((byte) (var91 >> 16));
                                    var6.method3576((byte) (var91 >> 8));
                                    var6.method3576((byte) var91);
                                    var6.method3576(-1);
                                    var6.method3584((float) var58);
                                    var6.method3584((float) var59);
                                    if (this.field3483 != null) {
                                        var6.method3584((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(7 & this.field3516) != -1) {
                                        var6.method3584(var71);
                                        var6.method3584(var74);
                                        var6.method3584(var73);
                                    }
                                } else {
                                    var6.method3577((float) var58);
                                    var6.method3577((float) (var64 + this.method428(true, var58, var59)));
                                    var6.method3577((float) var59);
                                    var6.method3576((byte) (var91 >> 16));
                                    var6.method3576((byte) (var91 >> 8));
                                    var6.method3576((byte) var91);
                                    var6.method3576(-1);
                                    var6.method3577((float) var58);
                                    var6.method3577((float) var59);
                                    if (this.field3483 != null) {
                                        var6.method3577((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if ((7 & this.field3516) != 0) {
                                        var6.method3577(var71);
                                        var6.method3577(var74);
                                        var6.method3577(var73);
                                    }
                                }
                                var89 = this.field3506++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method3670(var65, new class384(var56[var57]), (byte) 127);
                            }
                            for (int var100 = 0; ~var54 < ~var100; ++var100) {
                                var10[var100].method786(var72, var89, true, var85, var70);
                            }
                            ++this.field3503;
                        }
                    }
                }
            }
            for (int var12 = 0; var12 < this.field3506; ++var12) {
                class108 var29 = var7[var12];
                if (var29 != null) {
                    var29.method784((byte) 63, var12);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field702; ++var13) {
                for (int var18 = 0; ~super.field706 < ~var18; ++var18) {
                    short[] var19 = this.field3486[super.field702 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = var19[var21++] & 65535;
                            int var24 = var19[var21++] & 65535;
                            class108 var25 = var7[var22];
                            class108 var26 = var7[var23];
                            class108 var27 = var7[var24];
                            class108 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method785(var20, var18, var13, -1);
                            }
                            if (var26 != null) {
                                var26.method785(var20, var18, var13, -1);
                                if (var28 == null || var26.field7519 < var28.field7519) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method785(var20, var18, var13, -1);
                                if (var28 == null || ~var28.field7519 < ~var27.field7519) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method784((byte) 63, var22);
                                }
                                if (var26 != null) {
                                    var28.method784((byte) 63, var23);
                                }
                                if (var27 != null) {
                                    var28.method784((byte) 63, var24);
                                }
                                var28.method785(var20, var18, var13, -1);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3578();
            this.field3522 = this.field3502.method2934(var6.method3583(), var4, var5, false, true);
            this.field3526 = new class399(this.field3522, 5126, 3, 0);
            this.field3524 = new class399(this.field3522, 5121, 4, 12);
            byte var14;
            if (this.field3483 == null) {
                var14 = 24;
                this.field3519 = new class399(this.field3522, 5126, 2, 16);
            } else {
                this.field3519 = new class399(this.field3522, 5126, 3, 16);
                var14 = 28;
            }
            if ((7 & this.field3516) != 0) {
                this.field3523 = new class399(this.field3522, 5126, 3, var14);
            }
            long[] var15 = new long[this.field3521.length];
            for (int var16 = 0; var16 < this.field3521.length; ++var16) {
                class108 var17 = this.field3521[var16];
                var15[var16] = var17.field7519;
                var17.method791((byte) -13, this.field3506);
            }
            class164.method1034((byte) 123, this.field3521, var15);
            if (this.field3494 != null) {
                this.field3494.method1214(1);
            }
        }
        this.field3489 = null;
        this.field3525 = this.field3528 = this.field3530 = null;
        this.field3483 = null;
        this.field3531 = null;
        this.field3496 = null;
        this.field3513 = null;
        this.field3518 = null;
        this.field3527 = null;
        this.field3505 = this.field3509 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III[[ZZ)V")
    public final void method436(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method1566(-1, arg4, (byte) 70, arg3, arg1, arg2, arg0);
        ++field3484;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BII)B")
    public static final byte method1567(byte arg0, int arg1, int arg2) {
        ++field3497;
        if (arg0 > -61) {
            return 30;
        } else if (~arg1 != -10) {
            return 0;
        } else {
            return (byte) ((arg2 & 1) != 0 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V")
    public final void method424(int arg0, int arg1) {
        ++field3512;
    }

    @OriginalMember(owner = "client!sm", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method431(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg3 != null && this.field3513 == null) {
            this.field3513 = new int[super.field702][super.field706][];
        }
        ++field3499;
        if (arg5 != null && this.field3483 == null) {
            this.field3483 = new int[super.field702][super.field706][];
        }
        this.field3505[arg0][arg1] = arg2;
        this.field3509[arg0][arg1] = arg4;
        this.field3489[arg0][arg1] = arg6;
        this.field3496[arg0][arg1] = arg7;
        if (this.field3483 != null) {
            this.field3483[arg0][arg1] = arg5;
        }
        if (this.field3513 != null) {
            this.field3513[arg0][arg1] = arg3;
        }
        class108[] var15 = this.field3518[arg0][arg1] = new class108[arg6.length];
        for (int var16 = 0; var16 < arg6.length; ++var16) {
            long var17 = (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class513 var19;
            for (var19 = this.field3531.method3678(var17, -128); var19 != null; var19 = this.field3531.method3671((byte) 82)) {
                class108 var20 = (class108) var19;
                if (~arg8[var16] == ~var20.field1400 && (float) arg9[var16] == var20.field1403 && var20.field1402 == arg10 && var20.field1404 == arg11 && ~var20.field1397 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class108) var19;
            } else {
                var15[var16] = new class108(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field3531.method3670(var17, var15[var16], (byte) 127);
            }
        }
        if (arg13) {
            this.field3498[arg0][arg1] = (byte) class242.method1474(this.field3498[arg0][arg1], 1);
        }
        if (arg6.length > this.field3529) {
            this.field3529 = arg6.length;
        }
        this.field3520 += arg6.length;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)V")
    public static void method1568(boolean arg0) {
        field3493 = null;
        field3517 = null;
        if (arg0) {
            method1568(false);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method425(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field3485;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
        int var27 = 0;
        for (int var28 = 0; ~var28 > ~var18; ++var28) {
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
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
        this.method431(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIILtm;)V")
    private final void method1569(int arg0, int arg1, int arg2, class357 arg3) {
        if (arg1 == -6939) {
            ++field3508;
            int[] var5 = this.field3505[arg2][arg0];
            int[] var6 = this.field3509[arg2][arg0];
            int var7 = var5.length;
            if (~var7 < ~this.field3502.field7416.length) {
                this.field3502.field7415 = new int[var7];
                this.field3502.field7416 = new int[var7];
            }
            int[] var8 = this.field3502.field7416;
            int[] var9 = this.field3502.field7415;
            for (int var10 = 0; var10 < var7; ++var10) {
                var8[var10] = var5[var10] >> this.field3502.field7261;
                var9[var10] = var6[var10] >> this.field3502.field7261;
            }
            int var11 = 0;
            while (var11 < var7) {
                int var12 = var8[var11];
                int var13 = var9[var11++];
                int var14 = var8[var11];
                int var15 = var9[var11++];
                int var16 = var8[var11];
                int var17 = var9[var11++];
                if (~((-var14 + var12) * (-var17 + var15) + -((-var13 + var15) * (-var14 + var16))) < -1) {
                    arg3.method2010(var14, var13, var16, var12, var15, (byte) 24, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)V")
    public final void method434(int arg0, int arg1, int arg2) {
        ++field3487;
        if (~arg2 < ~(this.field3527[arg0][arg1] & 255)) {
            this.field3527[arg0][arg1] = (byte) arg2;
        }
    }
}
