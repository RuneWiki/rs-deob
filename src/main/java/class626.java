import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class626 extends class294 {

    @OriginalMember(owner = "client!re", name = "N", descriptor = "Lok;")
    private class266 field8790 = new class266();

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Lqfa;")
    public class106 field8766;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    private int field8787;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "[[B")
    private byte[][] field8765;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    private int field8769;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "[[[I")
    private int[][][] field8786;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "[[[I")
    public int[][][] field8773;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "[[[I")
    public int[][][] field8763;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "[[[Lmt;")
    private class416[][][] field8768;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "[[F")
    private float[][] field8801;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "[[F")
    private float[][] field8799;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "[[S")
    public short[][] field8792;

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "[[F")
    private float[][] field8803;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "[[[I")
    public int[][][] field8783;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public int field8788;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "[[B")
    private byte[][] field8798;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "[[[I")
    private int[][][] field8774;

    @OriginalMember(owner = "client!re", name = "db", descriptor = "Ljo;")
    private class353 field8806;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "Llea;")
    private class637 field8778;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "Z")
    public static boolean field8777 = false;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field8762;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field8770;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field8775;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    private int field8794;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    private int field8796;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "I")
    public static int field8797;

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "I")
    private int field8805;

    @OriginalMember(owner = "client!re", name = "hb", descriptor = "I")
    private int field8810;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "Lei;")
    public class189 field8800;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "Lei;")
    public class189 field8802;

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "Lei;")
    public class189 field8804;

    @OriginalMember(owner = "client!re", name = "gb", descriptor = "Lei;")
    private class189 field8809;

    @OriginalMember(owner = "client!re", name = "fb", descriptor = "Lgda;")
    private class61 field8808;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "Ljava/lang/Object;")
    public static Object field8764;

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "[Lmt;")
    private class416[] field8807;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "[Lrca;")
    public static class478[] field8776;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "[[[I")
    private int[][][] field8785;

    @OriginalMember(owner = "client!re", name = "fa", descriptor = "(IILr;)Lr;")
    public final class194 method1902(int arg0, int arg1, class194 arg2) {
        ++field8781;
        if ((1 & this.field8765[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field4284 >> this.field8766.field1439;
            class45 var5 = (class45) arg2;
            class45 var6;
            if (var5 != null && var5.method331(var4, var4, -95)) {
                var6 = var5;
                var5.method328((byte) -92);
            } else {
                var6 = new class45(this.field8766, var4, var4);
            }
            var6.method330(21, var4, 0, 0, var4);
            this.method3598(-22667, var6, arg0, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!re", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1911(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8771;
        if (this.field8778 != null && arg0 != null) {
            int var7 = -(this.field8766.field1569 * arg2 >> 8) + arg1 >> this.field8766.field1439;
            int var8 = -(this.field8766.field1498 * arg2 >> 8) + arg3 >> this.field8766.field1439;
            this.field8778.method3644(var8, true, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1915(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method3599(arg3, arg4, arg6, 6266, arg5, arg1, arg0, arg2);
        ++field8795;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
    public final void method1917(int arg0, int arg1) {
        ++field8791;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILvba;II)V")
    private final void method3598(int arg0, class45 arg1, int arg2, int arg3) {
        ++field8779;
        int[] var5 = this.field8763[arg2][arg3];
        int[] var6 = this.field8773[arg2][arg3];
        int var7 = var5.length;
        if (var7 > this.field8766.field1586.length) {
            this.field8766.field1588 = new int[var7];
            this.field8766.field1586 = new int[var7];
        }
        int[] var8 = this.field8766.field1586;
        int[] var9 = this.field8766.field1588;
        for (int var10 = 0; var7 > var10; ++var10) {
            var8[var10] = var5[var10] >> this.field8766.field1439;
            var9[var10] = var6[var10] >> this.field8766.field1439;
        }
        int var11 = 0;
        while (~var11 > ~var7) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if (~((-var14 + var12) * (-var17 + var15) + -((var16 - var14) * (-var13 + var15))) < -1) {
                arg1.method329(var12, arg0 + 1770410683, var13, var16, var17, var15, var14);
            }
        }
        if (arg0 != -22667) {
            this.field8808 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lqfa;IIII[[I[[II)V")
    public class626(class106 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field8766 = arg0;
        this.field8787 = super.field4285 + -2;
        this.field8765 = new byte[arg3][arg4];
        this.field8769 = 1 << this.field8787;
        this.field8786 = new int[arg3][arg4][];
        this.field8773 = new int[arg3][arg4][];
        this.field8763 = new int[arg3][arg4][];
        this.field8768 = new class416[arg3][arg4][];
        this.field8801 = new float[super.field4289 - -1][super.field4290 - -1];
        this.field8799 = new float[super.field4289 + 1][super.field4290 + 1];
        this.field8792 = new short[arg3 * arg4][];
        this.field8803 = new float[super.field4289 + 1][super.field4290 + 1];
        this.field8783 = new int[arg3][arg4][];
        this.field8788 = arg2;
        this.field8798 = new byte[arg3 - -1][arg4 + 1];
        this.field8774 = new int[arg3][arg4][];
        for (int var9 = 1; ~super.field4290 < ~var9; ++var9) {
            for (int var10 = 1; var10 < super.field4289; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * arg7 * 4 + var11 * var11)));
                this.field8799[var10][var9] = (float) var11 * var13;
                this.field8803[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field8801[var10][var9] = (float) var12 * var13;
            }
        }
        this.field8806 = new class353(128);
        if (~(16 & this.field8788) != -1) {
            this.field8778 = new class637(this.field8766, this);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([[ZZIIIIII)V")
    private final void method3599(boolean[][] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (this.field8807 != null) {
            int var9 = arg7 + arg7 + 1;
            int var10 = var9 * var9;
            if (~this.field8766.field1589.length > ~var10) {
                this.field8766.field1589 = new int[var10];
            }
            if (this.field8794 * 2 > this.field8766.field1485.field7050.length) {
                this.field8766.field1485 = new class538(this.field8794 * 2);
            }
            int var11 = -arg7 + arg6;
            int var12 = var11;
            if (~var11 > -1) {
                var11 = 0;
            }
            int var13 = -arg7 + arg5;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg6 + arg7;
            if (super.field4289 + -1 < var15) {
                var15 = super.field4289 + -1;
            }
            int var16 = arg5 + arg7;
            if (~(super.field4290 + -1) > ~var16) {
                var16 = super.field4290 - 1;
            }
            int var17 = 0;
            int[] var18 = this.field8766.field1589;
            for (int var19 = var11; var15 >= var19; ++var19) {
                boolean[] var25 = arg0[-var12 + var19];
                for (int var26 = var13; ~var26 >= ~var16; ++var26) {
                    if (var25[var26 - var14]) {
                        var18[var17++] = super.field4289 * var26 + var19;
                    }
                }
            }
            if (arg4 == -1) {
                this.field8766.method767(-223);
            } else {
                this.field8766.method819(3, (float) arg4);
                this.field8766.method777(-30909);
            }
            this.field8766.method756(~(7 & this.field8788) != -1, 117);
            for (int var20 = 0; this.field8807.length > var20; ++var20) {
                this.field8807[var20].method2536(5890, var18, var17);
            }
            if (!this.field8790.method1737(-17429)) {
                int var21 = this.field8766.field1513;
                int var22 = this.field8766.field1580;
                this.field8766.method502(0, var22, this.field8766.field1495);
                this.field8766.method756(false, 90);
                this.field8766.method791(false, true);
                this.field8766.method800(128, arg3 ^ 30222);
                this.field8766.method747(-2, -2142656808);
                this.field8766.method808((byte) 34, this.field8766.field1510);
                this.field8766.method802(7681, 11762, 8448);
                this.field8766.method789(34166, 770, 0, (byte) 47);
                this.field8766.method745(34167, arg3 + -6204, 770, 0);
                for (class577 var23 = this.field8790.method1731((byte) -115); var23 != null; var23 = this.field8790.method1724(arg3 + -6266)) {
                    class212 var24 = (class212) var23;
                    var24.method1456(arg5, arg6, arg7, arg0, (byte) -120);
                }
                this.field8766.method789(5890, 768, 0, (byte) 47);
                this.field8766.method745(5890, -101, 770, 0);
                this.field8766.method808((byte) 34, (class188) null);
                this.field8766.method502(var21, var22, this.field8766.field1495);
            }
            if (this.field8778 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field8766.method754((class189) null, this.field8800, arg3 ^ 6157, this.field8804, (class189) null);
                this.field8778.method3646(arg0, arg5, arg6, (byte) 107, arg1, arg7);
                OpenGL.glPopMatrix();
            }
        }
        ++field8780;
        if (arg3 != 6266) {
            this.method1907((class154) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lqm;[I)V")
    public final void method1907(class154 arg0, int[] arg1) {
        this.field8790.method1727(new class212(this.field8766, this, arg0, arg1), (byte) 68);
        ++field8784;
    }

    @OriginalMember(owner = "client!re", name = "ka", descriptor = "(III)V")
    public final void method1906(int arg0, int arg1, int arg2) {
        if ((255 & this.field8798[arg0][arg1]) < arg2) {
            this.field8798[arg0][arg1] = (byte) arg2;
        }
        ++field8767;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field8762;
        if (this.field8810 > 0) {
            this.field8766.method805(-119);
            this.field8766.method797((byte) 90, false);
            this.field8766.method756(false, 110);
            this.field8766.method785(false, (byte) 123);
            this.field8766.method791(false, true);
            this.field8766.method800(0, 28276);
            this.field8766.method747(-2, -2142656808);
            this.field8766.method808((byte) 34, (class188) null);
            class446.field6085[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field8766.field1223;
            class446.field6085[14] = 0.0F;
            class446.field6085[15] = 1.0F;
            class446.field6085[9] = 0.0F;
            class446.field6085[11] = 0.0F;
            class446.field6085[2] = 0.0F;
            class446.field6085[5] = (float) arg2 / ((float) super.field4284 * 128.0F * (float) this.field8766.field1223);
            class446.field6085[6] = 0.0F;
            class446.field6085[7] = 0.0F;
            class446.field6085[3] = 0.0F;
            class446.field6085[4] = 0.0F;
            class446.field6085[10] = 0.0F;
            class446.field6085[8] = 0.0F;
            class446.field6085[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field8766.field1282) + -1.0F;
            class446.field6085[1] = 0.0F;
            class446.field6085[0] = (float) arg2 / ((float) super.field4284 * 128.0F * (float) this.field8766.field1282);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class446.field6085, 0);
            class446.field6085[5] = 0.0F;
            class446.field6085[4] = 0.0F;
            class446.field6085[7] = 0.0F;
            class446.field6085[8] = 0.0F;
            class446.field6085[12] = 0.0F;
            class446.field6085[13] = 0.0F;
            class446.field6085[10] = 0.0F;
            class446.field6085[14] = 0.0F;
            class446.field6085[2] = 0.0F;
            class446.field6085[9] = 1.0F;
            class446.field6085[15] = 1.0F;
            class446.field6085[0] = 1.0F;
            class446.field6085[1] = 0.0F;
            class446.field6085[6] = 1.0F;
            class446.field6085[11] = 0.0F;
            class446.field6085[3] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class446.field6085, 0);
            if (~(this.field8788 & 7) == -1) {
                this.field8766.method756(false, 95);
            } else {
                this.field8766.method756(true, 87);
                this.field8766.method753(-92);
            }
            this.field8766.method754(this.field8809, this.field8800, 103, this.field8804, this.field8802);
            if (~this.field8766.field1485.field7050.length > ~(this.field8794 * 2)) {
                this.field8766.field1485 = new class538(this.field8794 * 2);
            } else {
                this.field8766.field1485.field7042 = 0;
            }
            int var9 = 0;
            class538 var10 = this.field8766.field1485;
            if (!this.field8766.field1514) {
                for (int var11 = arg4; arg6 > var11; ++var11) {
                    int var12 = super.field4289 * var11 - -arg3;
                    for (int var13 = arg3; ~arg5 < ~var13; ++var13) {
                        if (arg7[-arg3 + var13][var11 - arg4]) {
                            short[] var14 = this.field8792[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var15 < var14.length; ++var15) {
                                    var10.method2965(var14[var15] & 65535, (byte) 58);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                    int var18 = super.field4289 * var16 - -arg3;
                    for (int var19 = arg3; var19 < arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field8792[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var20.length > var21; ++var21) {
                                    ++var9;
                                    var10.method2957(var20[var21] & 65535, 1267307848);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class738 var17 = new class738(this.field8766, 5123, var10.field7050, var10.field7042);
                this.field8766.method781(5889, 0, var17, 4, var9);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1905(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8770;
        if (this.field8778 != null && arg0 != null) {
            int var7 = -(this.field8766.field1569 * arg2 >> 8) + arg1 >> this.field8766.field1439;
            int var8 = -(this.field8766.field1498 * arg2 >> 8) + arg3 >> this.field8766.field1439;
            return this.field8778.method3645(-7389, arg0, var8, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static void method3600(int arg0) {
        if (arg0 >= -88) {
            field8777 = true;
        }
        field8764 = null;
        field8776 = null;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)Lng;")
    public static final class360 method3601(int arg0) {
        if (arg0 <= 56) {
            return null;
        } else {
            ++field8761;
            class360 var1 = (class360) class763.field10504.method2172(63);
            if (var1 != null) {
                --class343.field4789;
                return var1;
            } else {
                return new class360();
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "YA", descriptor = "()V")
    public final void method1913() {
        ++field8797;
        if (~this.field8810 >= -1) {
            this.field8778 = null;
        } else {
            byte[][] var1 = new byte[super.field4289 + 1][super.field4290 + 1];
            for (int var2 = 1; super.field4289 > var2; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field4290; ++var103) {
                    var1[var2][var103] = (byte) ((this.field8798[var2][var103 + 1] >> 3) + (this.field8798[var2 + 1][var103] >> 3) + (this.field8798[var2][var103] >> 1) + (this.field8798[var2][var103 - 1] >> 2) + (this.field8798[var2 + -1][var103] >> 2));
                }
            }
            this.field8807 = new class416[this.field8806.method2244(false)];
            this.field8806.method2251(-112, this.field8807);
            for (int var3 = 0; this.field8807.length > var3; ++var3) {
                this.field8807[var3].method2533((byte) -40, this.field8810);
            }
            int var4 = 24;
            if (this.field8785 != null) {
                var4 += 4;
            }
            if ((7 & this.field8788) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field8766.field1435.method3939(this.field8810 * var4, false);
            Stream var6 = new Stream(var5);
            class416[] var7 = new class416[this.field8810];
            int var8 = class189.method1324(this.field8810 / 4, (byte) -98);
            if (var8 < 1) {
                var8 = 1;
            }
            class353 var9 = new class353(var8);
            class416[] var10 = new class416[this.field8805];
            for (int var11 = 0; var11 < super.field4289; ++var11) {
                for (int var30 = 0; ~var30 > ~super.field4290; ++var30) {
                    if (this.field8783[var11][var30] != null) {
                        class416[] var31 = this.field8768[var11][var30];
                        int[] var32 = this.field8763[var11][var30];
                        int[] var33 = this.field8773[var11][var30];
                        int[] var34 = this.field8774[var11][var30];
                        int[] var35 = this.field8783[var11][var30];
                        int[] var36 = this.field8786 != null ? this.field8786[var11][var30] : null;
                        int[] var37 = this.field8785 != null ? this.field8785[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field8799[var11][var30];
                        float var39 = this.field8803[var11][var30];
                        float var40 = this.field8801[var11][var30];
                        float var41 = this.field8799[var11][var30 - -1];
                        float var42 = this.field8803[var11][var30 + 1];
                        float var43 = this.field8801[var11][var30 + 1];
                        float var44 = this.field8799[var11 - -1][var30 - -1];
                        float var45 = this.field8803[var11 + 1][var30 - -1];
                        float var46 = this.field8801[var11 + 1][var30 - -1];
                        float var47 = this.field8799[var11 - -1][var30];
                        float var48 = this.field8803[var11 - -1][var30];
                        float var49 = this.field8801[var11 + 1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = var1[var11 + 1][var30 + 1] & 255;
                        int var53 = var1[var11 - -1][var30] & 255;
                        int var54 = 0;
                        label339: for (int var55 = 0; ~var35.length < ~var55; ++var55) {
                            class416 var101 = var31[var55];
                            for (int var102 = 0; var102 < var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label339;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field8792[super.field4289 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var35.length > var57; ++var57) {
                            int var58 = (var11 << super.field4285) + var32[var57];
                            int var59 = (var30 << super.field4285) - -var33[var57];
                            int var60 = var58 >> this.field8787;
                            int var61 = var59 >> this.field8787;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var63 << 48 | (long) var62 << 32 | (long) (var60 << 16) | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            int var73;
                            float var74;
                            float var75;
                            if (var67 == 0 && var68 == 0) {
                                var72 = var39;
                                var73 = var69 - var50;
                                var74 = var40;
                                var75 = var38;
                            } else if (var67 == 0 && ~super.field4284 == ~var68) {
                                var72 = var42;
                                var74 = var43;
                                var75 = var41;
                                var73 = var69 - var51;
                            } else if (~super.field4284 == ~var67 && super.field4284 == var68) {
                                var72 = var45;
                                var75 = var44;
                                var74 = var46;
                                var73 = var69 - var52;
                            } else if (~super.field4284 == ~var67 && var68 == 0) {
                                var73 = var69 - var53;
                                var74 = var49;
                                var72 = var48;
                                var75 = var47;
                            } else {
                                float var76 = (float) var67 / (float) super.field4284;
                                float var77 = (float) var68 / (float) super.field4284;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (var48 - var39) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (var45 - var42) * var76 + var42;
                                var75 = (var81 - var78) * var77 + var78;
                                var72 = (-var79 + var82) * var77 + var79;
                                float var83 = (-var43 + var46) * var76 + var43;
                                var74 = (-var80 + var83) * var77 + var80;
                                int var84 = ((var53 - var50) * var67 >> super.field4285) + var50;
                                int var85 = var51 - -((-var51 + var52) * var67 >> super.field4285);
                                var73 = var69 - (var84 - -((-var84 + var85) * var68 >> super.field4285));
                            }
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var73 >> 7;
                                if (~var86 <= -3) {
                                    if (~var86 < -127) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                var70 = class779.field10694[var62 & 65408 | var86];
                                if ((7 & this.field8788) == 0) {
                                    float var87 = this.field8766.field1542[2] * var74 + this.field8766.field1542[1] * var72 + this.field8766.field1542[0] * var75;
                                    var71 = (!(var87 > 0.0F) ? this.field8766.field1535 : this.field8766.field1558) * var87 + this.field8766.field1543;
                                }
                            }
                            class577 var88 = null;
                            if ((var58 & this.field8769 + -1) == 0 && (this.field8769 + -1 & var59) == 0) {
                                var88 = var9.method2242(var65, -1);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (var62 == var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (127 & var63) * var73 >> 7;
                                    if (var90 >= 2) {
                                        if (~var90 < -127) {
                                            var90 = 126;
                                        }
                                    } else {
                                        var90 = 2;
                                    }
                                    var89 = class779.field10694[var63 & 65408 | var90];
                                    if ((this.field8788 & 7) == 0) {
                                        float var91 = this.field8766.field1542[2] * var74 + this.field8766.field1542[1] * var72 + this.field8766.field1542[0] * var75;
                                        float var92 = this.field8766.field1543 + var71 * (var71 > 0.0F ? this.field8766.field1558 : this.field8766.field1535);
                                        int var93 = 255 & var89 >> 16;
                                        int var94 = var89 >> 8 & 255;
                                        int var95 = var89 & 255;
                                        int var96 = (int) ((float) var93 * var92);
                                        int var97 = (int) ((float) var94 * var92);
                                        if (var96 < 0) {
                                            var96 = 0;
                                        } else if (var96 > 255) {
                                            var96 = 255;
                                        }
                                        if (~var97 > -1) {
                                            var97 = 0;
                                        } else if (var97 > 255) {
                                            var97 = 255;
                                        }
                                        int var98 = (int) ((float) var95 * var92);
                                        if (~var98 <= -1) {
                                            if (~var98 < -256) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var89 = var98 | var97 << 8 | var96 << 16;
                                    }
                                }
                                if (this.field8766.field1514) {
                                    var6.method3952((float) var58);
                                    var6.method3952((float) (var64 + this.method1918(var58, (byte) 127, var59)));
                                    var6.method3952((float) var59);
                                    var6.method3955((byte) (var89 >> 16));
                                    var6.method3955((byte) (var89 >> 8));
                                    var6.method3955((byte) var89);
                                    var6.method3955(-1);
                                    var6.method3952((float) var58);
                                    var6.method3952((float) var59);
                                    if (this.field8785 != null) {
                                        var6.method3952((float) (var37 != null ? var37[var57] - 1 : 0));
                                    }
                                    if ((this.field8788 & 7) != 0) {
                                        var6.method3952(var75);
                                        var6.method3952(var72);
                                        var6.method3952(var74);
                                    }
                                } else {
                                    var6.method3949((float) var58);
                                    var6.method3949((float) (this.method1918(var58, (byte) 127, var59) - -var64));
                                    var6.method3949((float) var59);
                                    var6.method3955((byte) (var89 >> 16));
                                    var6.method3955((byte) (var89 >> 8));
                                    var6.method3955((byte) var89);
                                    var6.method3955(-1);
                                    var6.method3949((float) var58);
                                    var6.method3949((float) var59);
                                    if (this.field8785 != null) {
                                        var6.method3949((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(7 & this.field8788) != -1) {
                                        var6.method3949(var75);
                                        var6.method3949(var72);
                                        var6.method3949(var74);
                                    }
                                }
                                var99 = this.field8796++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method2241(52, var65, new class75(var56[var57]));
                            } else {
                                var56[var57] = ((class75) var88).field853;
                                var99 = 65535 & var56[var57];
                                if (var62 != -1 && ~var7[var99].field8133 < ~var31[var57].field8133) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var100 < var54; ++var100) {
                                var10[var100].method2530(var73, var99, var71, 256, var70);
                            }
                            ++this.field8794;
                        }
                    }
                }
            }
            for (int var12 = 0; this.field8796 > var12; ++var12) {
                class416 var29 = var7[var12];
                if (var29 != null) {
                    var29.method2532(var12, 90);
                }
            }
            for (int var13 = 0; var13 < super.field4289; ++var13) {
                for (int var18 = 0; var18 < super.field4290; ++var18) {
                    short[] var19 = this.field8792[super.field4289 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var21 < var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = 65535 & var19[var21++];
                            int var24 = var19[var21++] & 65535;
                            class416 var25 = var7[var22];
                            class416 var26 = var7[var23];
                            class416 var27 = var7[var24];
                            class416 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method2529(26025, var20, var13, var18);
                            }
                            if (var26 != null) {
                                var26.method2529(26025, var20, var13, var18);
                                if (var28 == null || ~var28.field8133 < ~var26.field8133) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method2529(26025, var20, var13, var18);
                                if (var28 == null || var27.field8133 < var28.field8133) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method2532(var22, 125);
                                }
                                if (var26 != null) {
                                    var28.method2532(var23, 109);
                                }
                                if (var27 != null) {
                                    var28.method2532(var24, 97);
                                }
                                var28.method2529(26025, var20, var13, var18);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3945();
            this.field8808 = this.field8766.method778(var5, var6.method3944(), var4, -124, false);
            this.field8804 = new class189(this.field8808, 5126, 3, 0);
            this.field8809 = new class189(this.field8808, 5121, 4, 12);
            byte var14;
            if (this.field8785 == null) {
                var14 = 24;
                this.field8800 = new class189(this.field8808, 5126, 2, 16);
            } else {
                this.field8800 = new class189(this.field8808, 5126, 3, 16);
                var14 = 28;
            }
            if (~(this.field8788 & 7) != -1) {
                this.field8802 = new class189(this.field8808, 5126, 3, var14);
            }
            long[] var15 = new long[this.field8807.length];
            for (int var16 = 0; ~this.field8807.length < ~var16; ++var16) {
                class416 var17 = this.field8807[var16];
                var15[var16] = var17.field8133;
                var17.method2535(true, this.field8796);
            }
            class186.method1305(var15, this.field8807, -99);
            if (this.field8778 != null) {
                this.field8778.method3642(-1);
            }
        }
        this.field8783 = null;
        this.field8785 = null;
        this.field8798 = null;
        this.field8768 = null;
        this.field8806 = null;
        this.field8799 = this.field8803 = this.field8801 = null;
        this.field8763 = this.field8773 = null;
        this.field8786 = null;
        this.field8774 = null;
    }

    @OriginalMember(owner = "client!re", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1908(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field8772;
        if (arg5 != null && this.field8785 == null) {
            this.field8785 = new int[super.field4289][super.field4290][];
        }
        class160 var15 = this.field8766.field774;
        if (arg3 != null && this.field8786 == null) {
            this.field8786 = new int[super.field4289][super.field4290][];
        }
        this.field8763[arg0][arg1] = arg2;
        this.field8773[arg0][arg1] = arg4;
        this.field8783[arg0][arg1] = arg6;
        this.field8774[arg0][arg1] = arg7;
        if (this.field8785 != null) {
            this.field8785[arg0][arg1] = arg5;
        }
        if (this.field8786 != null) {
            this.field8786[arg0][arg1] = arg3;
        }
        class416[] var16 = this.field8768[arg0][arg1] = new class416[arg6.length];
        for (int var17 = 0; ~arg6.length < ~var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(this.field8788 & 32) != -1 && var18 != -1 && var15.method1208((byte) 47, var18).field6570) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) var18 | (long) (var19 << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42;
            class577 var22;
            for (var22 = this.field8806.method2242(var20, -1); var22 != null; var22 = this.field8806.method2250(true)) {
                class416 var23 = (class416) var22;
                if (var23.field5705 == var18 && (float) var19 == var23.field5709 && var23.field5700 == arg10 && ~var23.field5712 == ~arg11 && var23.field5697 == arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class416(this, var18, var19, arg10, arg11, arg12);
                this.field8806.method2241(-64, var20, var16[var17]);
            } else {
                var16[var17] = (class416) var22;
            }
        }
        if (arg13) {
            this.field8765[arg0][arg1] = (byte) class746.method4158(this.field8765[arg0][arg1], 1);
        }
        if (~this.field8805 > ~arg6.length) {
            this.field8805 = arg6.length;
        }
        this.field8810 += arg6.length;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)V")
    public static final void method3602(boolean arg0, int arg1) {
        ++field8793;
        class784.field10773.method1884(class571.field8060.method440());
        int[] var2 = class571.field8060.method510();
        class77.field874 = var2[3];
        class5.field44 = var2[1];
        class10.field192 = var2[arg1];
        class377.field5207 = var2[2];
        if (!arg0) {
            class571.field8060.method503(class62.field743, class186.field2852, class788.field10814, class403.field5509);
            class282.method1828(class348.field4863, 11266);
        } else {
            class571.field8060.method503(class547.field7867, class161.field2551, class5.field43, class251.field3703);
            class282.method1828(class199.field3044, 11266);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1903(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field8789;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
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
        this.method1908(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!re", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1916(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8775;
        if (this.field8778 != null && arg0 != null) {
            int var7 = -(this.field8766.field1569 * arg2 >> 8) + arg1 >> this.field8766.field1439;
            int var8 = -(this.field8766.field1498 * arg2 >> 8) + arg3 >> this.field8766.field1439;
            this.field8778.method3647(arg0, var7, -1, var8);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1909(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field8782;
        this.method3599(arg3, arg4, arg5, 6266, -1, arg1, arg0, arg2);
    }
}
