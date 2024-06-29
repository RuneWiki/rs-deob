import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class34 extends class295 {

    @OriginalMember(owner = "client!bja", name = "U", descriptor = "Lqw;")
    private class84 field356 = new class84();

    @OriginalMember(owner = "client!bja", name = "Q", descriptor = "I")
    private int field352 = this.field4179 + -2;

    @OriginalMember(owner = "client!bja", name = "m", descriptor = "Llf;")
    public class250 field322;

    @OriginalMember(owner = "client!bja", name = "V", descriptor = "[[B")
    private byte[][] field357;

    @OriginalMember(owner = "client!bja", name = "G", descriptor = "[[[I")
    public int[][][] field342;

    @OriginalMember(owner = "client!bja", name = "lb", descriptor = "[[F")
    private float[][] field373;

    @OriginalMember(owner = "client!bja", name = "A", descriptor = "[[[I")
    private int[][][] field336;

    @OriginalMember(owner = "client!bja", name = "L", descriptor = "[[[I")
    public int[][][] field347;

    @OriginalMember(owner = "client!bja", name = "x", descriptor = "[[[I")
    private int[][][] field333;

    @OriginalMember(owner = "client!bja", name = "K", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "client!bja", name = "o", descriptor = "[[[I")
    public int[][][] field324;

    @OriginalMember(owner = "client!bja", name = "q", descriptor = "[[S")
    public short[][] field326;

    @OriginalMember(owner = "client!bja", name = "Y", descriptor = "[[F")
    private float[][] field360;

    @OriginalMember(owner = "client!bja", name = "W", descriptor = "[[F")
    private float[][] field358;

    @OriginalMember(owner = "client!bja", name = "l", descriptor = "[[[Lsv;")
    private class685[][][] field321;

    @OriginalMember(owner = "client!bja", name = "N", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!bja", name = "t", descriptor = "[[B")
    private byte[][] field329;

    @OriginalMember(owner = "client!bja", name = "cb", descriptor = "Ltca;")
    private class184 field364;

    @OriginalMember(owner = "client!bja", name = "w", descriptor = "Lwg;")
    private class448 field332;

    @OriginalMember(owner = "client!bja", name = "T", descriptor = "Z")
    public static boolean field355 = false;

    @OriginalMember(owner = "client!bja", name = "hb", descriptor = "Ltca;")
    public static class184 field369 = new class184(16);

    @OriginalMember(owner = "client!bja", name = "k", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!bja", name = "n", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!bja", name = "p", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client!bja", name = "r", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!bja", name = "s", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!bja", name = "u", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!bja", name = "v", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!bja", name = "y", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!bja", name = "B", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!bja", name = "C", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!bja", name = "D", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!bja", name = "E", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!bja", name = "F", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client!bja", name = "H", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!bja", name = "I", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!bja", name = "J", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!bja", name = "M", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!bja", name = "O", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!bja", name = "P", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!bja", name = "R", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!bja", name = "S", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!bja", name = "fb", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!bja", name = "gb", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client!bja", name = "ib", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!bja", name = "jb", descriptor = "I")
    private int field371;

    @OriginalMember(owner = "client!bja", name = "Z", descriptor = "Lut;")
    public class135 field361;

    @OriginalMember(owner = "client!bja", name = "ab", descriptor = "Lut;")
    public class135 field362;

    @OriginalMember(owner = "client!bja", name = "db", descriptor = "Lut;")
    private class135 field365;

    @OriginalMember(owner = "client!bja", name = "eb", descriptor = "Lut;")
    public class135 field366;

    @OriginalMember(owner = "client!bja", name = "mb", descriptor = "Lhh;")
    public static class140 field374;

    @OriginalMember(owner = "client!bja", name = "X", descriptor = "Lot;")
    private class615 field359;

    @OriginalMember(owner = "client!bja", name = "kb", descriptor = "Lha;")
    public static class66 field372;

    @OriginalMember(owner = "client!bja", name = "bb", descriptor = "[Lsv;")
    private class685[] field363;

    @OriginalMember(owner = "client!bja", name = "z", descriptor = "[[[I")
    private int[][][] field335;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(III[[ZZI)V", line = 3)
    public final void method185(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field331;
        this.method187(2188, arg4, arg0, arg1, arg3, arg5, -1, arg2);
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(I[SI[Ljava/lang/String;I)V", line = 11)
    public static final void method186(int arg0, short[] arg1, int arg2, String[] arg3, int arg4) {
        ++field348;
        if (arg2 != 2) {
            method192((byte) -80);
        }
        if (arg0 < arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            for (int var9 = arg0; ~arg4 < ~var9; ++var9) {
                if (var7 == null || arg3[var9] != null && (var9 & 1) > arg3[var9].compareTo(var7)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg3[arg4] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method186(arg0, arg1, 2, arg3, var6 + -1);
            method186(var6 + 1, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(IZII[[ZIII)V", line = 67)
    private final void method187(int arg0, boolean arg1, int arg2, int arg3, boolean[][] arg4, int arg5, int arg6, int arg7) {
        if (this.field363 != null) {
            int var9 = arg7 + arg7 + 1;
            int var10 = var9 * var9;
            if (this.field322.field3663.length < var10) {
                this.field322.field3663 = new int[var10];
            }
            if (this.field341 * 2 > this.field322.field3623.field3789.length) {
                this.field322.field3623 = new class453(this.field341 * 2);
            }
            int var11 = -arg7 + arg2;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = -arg7 + arg3;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg2 + arg7;
            if (~var15 < ~(super.field4174 + -1)) {
                var15 = super.field4174 + -1;
            }
            int var16 = arg3 + arg7;
            if (~var16 < ~(super.field4173 - 1)) {
                var16 = super.field4173 + -1;
            }
            int var17 = 0;
            int[] var18 = this.field322.field3663;
            for (int var19 = var11; var19 <= var15; ++var19) {
                boolean[] var25 = arg4[-var12 + var19];
                for (int var26 = var13; ~var26 >= ~var16; ++var26) {
                    if (var25[-var14 + var26]) {
                        var18[var17++] = super.field4174 * var26 + var19;
                    }
                }
            }
            if (arg6 != -1) {
                this.field322.method1622((float) arg6, (byte) 51);
                this.field322.method1612(arg0 + -2172);
            } else {
                this.field322.method1604(false);
            }
            this.field322.method1639((this.field349 & 7) != 0, arg0 + -2196);
            for (int var20 = 0; var20 < this.field363.length; ++var20) {
                this.field363[var20].method3760(var18, 38, var17);
            }
            if (!this.field356.method688(119)) {
                int var21 = this.field322.field3657;
                int var22 = this.field322.field3625;
                this.field322.method540(0, var22, this.field322.field3573);
                this.field322.method1639(false, -8);
                this.field322.method1572(false, false);
                this.field322.method1564(128, (byte) 114);
                this.field322.method1580((byte) -52, -2);
                this.field322.method1595((byte) 111, this.field322.field3576);
                this.field322.method1630(8448, 7681, arg0 + -2066);
                this.field322.method1600(17104, 34166, 0, 770);
                this.field322.method1581(770, 13112, 0, 34167);
                for (class159 var23 = this.field356.method679((byte) -86); var23 != null; var23 = this.field356.method681(-110)) {
                    class192 var24 = (class192) var23;
                    var24.method1271(arg2, arg7, arg3, -37, arg4);
                }
                this.field322.method1600(17104, 5890, 0, 768);
                this.field322.method1581(770, 13112, 0, 5890);
                this.field322.method1595((byte) 93, (class205) null);
                this.field322.method540(var21, var22, this.field322.field3573);
            }
            if (this.field332 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field322.method1634(this.field362, this.field366, (class135) null, (class135) null, (byte) 11);
                this.field332.method2667(arg3, (byte) 87, arg2, arg7, arg1, arg4);
                OpenGL.glPopMatrix();
            }
        }
        if (arg0 != 2188) {
            this.field332 = null;
        }
        ++field343;
    }

    @OriginalMember(owner = "client!bja", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 220)
    public final void method188(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field338;
        if (arg3 != null && this.field336 == null) {
            this.field336 = new int[super.field4174][super.field4173][];
        }
        if (arg5 != null && this.field335 == null) {
            this.field335 = new int[super.field4174][super.field4173][];
        }
        class161 var15 = this.field322.field913;
        this.field347[arg0][arg1] = arg2;
        this.field324[arg0][arg1] = arg4;
        this.field342[arg0][arg1] = arg6;
        this.field333[arg0][arg1] = arg7;
        if (this.field335 != null) {
            this.field335[arg0][arg1] = arg5;
        }
        if (this.field336 != null) {
            this.field336[arg0][arg1] = arg3;
        }
        class685[] var16 = this.field321[arg0][arg1] = new class685[arg6.length];
        for (int var17 = 0; arg6.length > var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(32 & this.field349) != -1 && var18 != -1 && var15.method1114(var18, -99).field7868) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) (var19 << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) var18;
            class159 var22;
            for (var22 = this.field364.method1248(115, var20); var22 != null; var22 = this.field364.method1243(103)) {
                class685 var23 = (class685) var22;
                if (~var23.field9150 == ~var18 && (float) var19 == var23.field9154 && var23.field9161 == arg10 && var23.field9173 == arg11 && ~var23.field9163 == ~arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class685(this, var18, var19, arg10, arg11, arg12);
                this.field364.method1247(4070, var20, var16[var17]);
            } else {
                var16[var17] = (class685) var22;
            }
        }
        if (arg13) {
            this.field329[arg0][arg1] = (byte) class670.method3699(this.field329[arg0][arg1], 1);
        }
        if (~this.field371 > ~arg6.length) {
            this.field371 = arg6.length;
        }
        this.field368 += arg6.length;
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(Luaa;[I)V", line = 300)
    public final void method189(class127 arg0, int[] arg1) {
        ++field334;
        this.field356.method689(new class192(this.field322, this, arg0, arg1), 124);
    }

    @OriginalMember(owner = "client!bja", name = "fa", descriptor = "(IILr;)Lr;", line = 314)
    public final class195 method190(int arg0, int arg1, class195 arg2) {
        ++field330;
        if (~(1 & this.field329[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field4177 >> this.field322.field3517;
            class251 var5 = (class251) arg2;
            class251 var6;
            if (var5 != null && var5.method1650(var4, (byte) 104, var4)) {
                var6 = var5;
                var5.method1651((byte) -111);
            } else {
                var6 = new class251(this.field322, var4, var4);
            }
            var6.method1646(var4, 0, 0, 0, var4);
            this.method193(118, var6, arg0, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "(IIB)I", line = 345)
    public static final int method191(int arg0, int arg1, byte arg2) {
        if (arg2 != -54) {
            return -79;
        } else {
            ++field340;
            int var3 = arg0 >>> 24;
            int var4 = ((16711935 & arg0) * var3 & -16711936 | 16711680 & (65280 & arg0) * var3) >>> 8;
            int var5 = -var3 + 255;
            return (((arg1 & 16711935) * var5 & -16711936 | (arg1 & 65280) * var5 & 16711680) >>> 8) - -var4;
        }
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(B)V", line = 364)
    public static void method192(byte arg0) {
        field369 = null;
        if (arg0 != -102) {
            method191(-17, 63, (byte) -18);
        }
        field372 = null;
        field374 = null;
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(ILkea;II)V", line = 376)
    private final void method193(int arg0, class251 arg1, int arg2, int arg3) {
        ++field345;
        int[] var5 = this.field347[arg2][arg3];
        int[] var6 = this.field324[arg2][arg3];
        int var7 = var5.length;
        if (var7 > this.field322.field3666.length) {
            this.field322.field3664 = new int[var7];
            this.field322.field3666 = new int[var7];
        }
        int[] var8 = this.field322.field3666;
        int[] var9 = this.field322.field3664;
        for (int var10 = 0; var10 < var7; ++var10) {
            var8[var10] = var5[var10] >> this.field322.field3517;
            var9[var10] = var6[var10] >> this.field322.field3517;
        }
        int var11 = 15 / ((66 - arg0) / 49);
        int var12 = 0;
        while (var7 > var12) {
            int var13 = var8[var12];
            int var14 = var9[var12++];
            int var15 = var8[var12];
            int var16 = var9[var12++];
            int var17 = var8[var12];
            int var18 = var9[var12++];
            if (~((-var15 + var13) * (-var18 + var16) + -((var17 - var15) * (-var14 + var16))) < -1) {
                arg1.method1647(var14, var15, (byte) 89, var18, var16, var13, var17);
            }
        }
    }

    @OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(Llf;IIII[[I[[II)V", line = 436)
    public class34(class250 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field322 = arg0;
        this.field357 = new byte[arg3 + 1][arg4 + 1];
        this.field342 = new int[arg3][arg4][];
        this.field373 = new float[super.field4174 + 1][super.field4173 + 1];
        this.field336 = new int[arg3][arg4][];
        this.field347 = new int[arg3][arg4][];
        this.field333 = new int[arg3][arg4][];
        this.field346 = 1 << this.field352;
        this.field324 = new int[arg3][arg4][];
        this.field326 = new short[arg3 * arg4][];
        this.field360 = new float[super.field4174 + 1][super.field4173 - -1];
        this.field358 = new float[super.field4174 + 1][super.field4173 - -1];
        this.field321 = new class685[arg3][arg4][];
        this.field349 = arg2;
        this.field329 = new byte[arg3][arg4];
        for (int var9 = 1; var9 < super.field4173; ++var9) {
            for (int var10 = 1; super.field4174 > var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field360[var10][var9] = (float) var11 * var13;
                this.field358[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field373[var10][var9] = (float) var12 * var13;
            }
        }
        this.field364 = new class184(128);
        if (~(this.field349 & 16) != -1) {
            this.field332 = new class448(this.field322, this);
        }
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(III[[ZZII)V", line = 492)
    public final void method194(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method187(2188, arg4, arg0, arg1, arg3, arg6, arg5, arg2);
        ++field367;
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(II)V", line = 503)
    public final void method195(int arg0, int arg1) {
        ++field353;
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(ILdt;I)Ljava/lang/String;", line = 514)
    public static final String method196(int arg0, class254 arg1, int arg2) {
        ++field344;
        try {
            int var3 = arg1.method1673(-32768);
            if (arg2 < var3) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg1.field3725 += class393.field5664.method3594(var3, arg1.field3789, (byte) -50, arg1.field3725, var4, 0);
            return class755.method4143((byte) 97, var4, var3, arg0);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!bja", name = "YA", descriptor = "()V", line = 548)
    public final void method197() {
        if (~this.field368 >= -1) {
            this.field332 = null;
        } else {
            byte[][] var1 = new byte[super.field4174 - -1][super.field4173 + 1];
            for (int var2 = 1; var2 < super.field4174; ++var2) {
                for (int var103 = 1; var103 < super.field4173; ++var103) {
                    var1[var2][var103] = (byte) ((this.field357[var2][var103 - -1] >> 3) + (this.field357[var2][var103] >> 1) + (this.field357[var2][var103 + -1] >> 2) + (this.field357[var2 + -1][var103] >> 2) + (this.field357[var2 + 1][var103] >> 3));
                }
            }
            this.field363 = new class685[this.field364.method1245((byte) 124)];
            this.field364.method1242(this.field363, -1);
            for (int var3 = 0; this.field363.length > var3; ++var3) {
                this.field363[var3].method3755(this.field368, 14285);
            }
            int var4 = 24;
            if (this.field335 != null) {
                var4 += 4;
            }
            if (~(7 & this.field349) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field322.field3518.method3794(this.field368 * var4, false);
            Stream var6 = new Stream(var5);
            class685[] var7 = new class685[this.field368];
            int var8 = class263.method1773(32051, this.field368 / 4);
            if (~var8 > -2) {
                var8 = 1;
            }
            class184 var9 = new class184(var8);
            class685[] var10 = new class685[this.field371];
            for (int var11 = 0; ~var11 > ~super.field4174; ++var11) {
                for (int var30 = 0; var30 < super.field4173; ++var30) {
                    if (this.field342[var11][var30] != null) {
                        class685[] var31 = this.field321[var11][var30];
                        int[] var32 = this.field347[var11][var30];
                        int[] var33 = this.field324[var11][var30];
                        int[] var34 = this.field333[var11][var30];
                        int[] var35 = this.field342[var11][var30];
                        int[] var36 = this.field336 != null ? this.field336[var11][var30] : null;
                        int[] var37 = this.field335 != null ? this.field335[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field360[var11][var30];
                        float var39 = this.field358[var11][var30];
                        float var40 = this.field373[var11][var30];
                        float var41 = this.field360[var11][var30 + 1];
                        float var42 = this.field358[var11][var30 + 1];
                        float var43 = this.field373[var11][var30 + 1];
                        float var44 = this.field360[var11 + 1][var30 + 1];
                        float var45 = this.field358[var11 + 1][var30 + 1];
                        float var46 = this.field373[var11 + 1][var30 - -1];
                        float var47 = this.field360[var11 + 1][var30];
                        float var48 = this.field358[var11 - -1][var30];
                        float var49 = this.field373[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = 255 & var1[var11 - -1][var30 + 1];
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label341: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class685 var101 = var31[var55];
                            for (int var102 = 0; ~var54 < ~var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label341;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field326[super.field4174 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var35.length > var57; ++var57) {
                            int var58 = (var11 << super.field4179) - -var32[var57];
                            int var59 = (var30 << super.field4179) - -var33[var57];
                            int var60 = var58 >> this.field352;
                            int var61 = var59 >> this.field352;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var61 | (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            int var72;
                            float var73;
                            float var74;
                            float var75;
                            if (~var67 == -1 && ~var68 == -1) {
                                var72 = var69 - var50;
                                var73 = var38;
                                var74 = var39;
                                var75 = var40;
                            } else if (~var67 == -1 && ~super.field4177 == ~var68) {
                                var72 = var69 - var51;
                                var75 = var43;
                                var74 = var42;
                                var73 = var41;
                            } else if (super.field4177 == var67 && ~super.field4177 == ~var68) {
                                var74 = var45;
                                var72 = var69 - var52;
                                var75 = var46;
                                var73 = var44;
                            } else if (super.field4177 == var67 && ~var68 == -1) {
                                var73 = var47;
                                var75 = var49;
                                var72 = var69 - var53;
                                var74 = var48;
                            } else {
                                float var76 = (float) var67 / (float) super.field4177;
                                float var77 = (float) var68 / (float) super.field4177;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (var48 - var39) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (-var41 + var44) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                float var83 = (var46 - var43) * var76 + var43;
                                var73 = (-var78 + var81) * var77 + var78;
                                var74 = (var82 - var79) * var77 + var79;
                                var75 = (-var80 + var83) * var77 + var80;
                                int var84 = var50 - -((var53 - var50) * var67 >> super.field4179);
                                int var85 = ((-var51 + var52) * var67 >> super.field4179) + var51;
                                var72 = var69 - (((-var84 + var85) * var68 >> super.field4179) + var84);
                            }
                            if (var62 != -1) {
                                int var86 = (127 & var62) * var72 >> 7;
                                if (var86 < 2) {
                                    var86 = 2;
                                } else if (~var86 < -127) {
                                    var86 = 126;
                                }
                                if ((this.field349 & 7) == 0) {
                                    float var87 = this.field322.field3552[2] * var75 + this.field322.field3552[1] * var74 + this.field322.field3552[0] * var73;
                                    var71 = this.field322.field3583 + (!(var87 > 0.0F) ? this.field322.field3610 : this.field322.field3656) * var87;
                                }
                                var70 = class217.field2836[65408 & var62 | var86];
                            }
                            class159 var88 = null;
                            if ((this.field346 + -1 & var58) == 0 && (var59 & this.field346 + -1) == 0) {
                                var88 = var9.method1248(101, var65);
                            }
                            int var99;
                            if (var88 == null) {
                                int var90;
                                if (var62 != var63) {
                                    int var89 = (127 & var63) * var72 >> 7;
                                    if (var89 >= 2) {
                                        if (var89 > 126) {
                                            var89 = 126;
                                        }
                                    } else {
                                        var89 = 2;
                                    }
                                    var90 = class217.field2836[var89 | 65408 & var63];
                                    if ((this.field349 & 7) == 0) {
                                        float var91 = this.field322.field3552[2] * var75 + this.field322.field3552[1] * var74 + this.field322.field3552[0] * var73;
                                        float var92 = this.field322.field3583 + (var71 > 0.0F ? this.field322.field3656 : this.field322.field3610) * var71;
                                        int var93 = var90 >> 16 & 255;
                                        int var94 = (65496 & var90) >> 8;
                                        int var95 = var90 & 255;
                                        int var96 = (int) ((float) var93 * var92);
                                        int var97 = (int) ((float) var94 * var92);
                                        if (~var96 <= -1) {
                                            if (var96 > 255) {
                                                var96 = 255;
                                            }
                                        } else {
                                            var96 = 0;
                                        }
                                        if (var97 < 0) {
                                            var97 = 0;
                                        } else if (~var97 < -256) {
                                            var97 = 255;
                                        }
                                        int var98 = (int) ((float) var95 * var92);
                                        if (~var98 > -1) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        var90 = var96 << 16 | var97 << 8 | var98;
                                    }
                                } else {
                                    var90 = var70;
                                }
                                if (!this.field322.field3561) {
                                    var6.method3809((float) var58);
                                    var6.method3809((float) (var64 + this.method1895(var58, var59, 72)));
                                    var6.method3809((float) var59);
                                    var6.method3799((byte) (var90 >> 16));
                                    var6.method3799((byte) (var90 >> 8));
                                    var6.method3799((byte) var90);
                                    var6.method3799(-1);
                                    var6.method3809((float) var58);
                                    var6.method3809((float) var59);
                                    if (this.field335 != null) {
                                        var6.method3809((float) (var37 != null ? var37[var57] - 1 : 0));
                                    }
                                    if (~(this.field349 & 7) != -1) {
                                        var6.method3809(var73);
                                        var6.method3809(var74);
                                        var6.method3809(var75);
                                    }
                                } else {
                                    var6.method3800((float) var58);
                                    var6.method3800((float) (var64 + this.method1895(var58, var59, 94)));
                                    var6.method3800((float) var59);
                                    var6.method3799((byte) (var90 >> 16));
                                    var6.method3799((byte) (var90 >> 8));
                                    var6.method3799((byte) var90);
                                    var6.method3799(-1);
                                    var6.method3800((float) var58);
                                    var6.method3800((float) var59);
                                    if (this.field335 != null) {
                                        var6.method3800((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(this.field349 & 7) != -1) {
                                        var6.method3800(var73);
                                        var6.method3800(var74);
                                        var6.method3800(var75);
                                    }
                                }
                                var99 = this.field325++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method1247(4070, var65, new class603(var56[var57]));
                            } else {
                                var56[var57] = ((class603) var88).field8189;
                                var99 = var56[var57] & 65535;
                                if (var62 != -1 && var7[var99].field2146 > var31[var57].field2146) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method3763(true, var71, var70, var99, var72);
                            }
                            ++this.field341;
                        }
                    }
                }
            }
            for (int var12 = 0; this.field325 > var12; ++var12) {
                class685 var29 = var7[var12];
                if (var29 != null) {
                    var29.method3754(var12, 108);
                }
            }
            for (int var13 = 0; super.field4174 > var13; ++var13) {
                for (int var18 = 0; ~super.field4173 < ~var18; ++var18) {
                    short[] var19 = this.field326[super.field4174 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var19.length < ~var21) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = var19[var21++] & 65535;
                            int var24 = var19[var21++] & 65535;
                            class685 var25 = var7[var22];
                            class685 var26 = var7[var23];
                            class685 var27 = var7[var24];
                            class685 var28 = null;
                            if (var25 != null) {
                                var25.method3756(var13, var18, var20, (byte) 88);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method3756(var13, var18, var20, (byte) 103);
                                if (var28 == null || ~var26.field2146 > ~var28.field2146) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method3756(var13, var18, var20, (byte) 45);
                                if (var28 == null || var27.field2146 < var28.field2146) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method3754(var22, 122);
                                }
                                if (var26 != null) {
                                    var28.method3754(var23, 126);
                                }
                                if (var27 != null) {
                                    var28.method3754(var24, 107);
                                }
                                var28.method3756(var13, var18, var20, (byte) 54);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3797();
            this.field359 = this.field322.method1619(var6.method3801(), var5, var4, false, (byte) -49);
            this.field366 = new class135(this.field359, 5126, 3, 0);
            this.field365 = new class135(this.field359, 5121, 4, 12);
            byte var14;
            if (this.field335 == null) {
                this.field362 = new class135(this.field359, 5126, 2, 16);
                var14 = 24;
            } else {
                this.field362 = new class135(this.field359, 5126, 3, 16);
                var14 = 28;
            }
            if (~(7 & this.field349) != -1) {
                this.field361 = new class135(this.field359, 5126, 3, var14);
            }
            long[] var15 = new long[this.field363.length];
            for (int var16 = 0; this.field363.length > var16; ++var16) {
                class685 var17 = this.field363[var16];
                var15[var16] = var17.field2146;
                var17.method3753(10, this.field325);
            }
            class652.method3628(this.field363, var15, (byte) 126);
            if (this.field332 != null) {
                this.field332.method2669(0);
            }
        }
        ++field339;
        this.field342 = null;
        this.field347 = this.field324 = null;
        this.field364 = null;
        this.field333 = null;
        this.field360 = this.field358 = this.field373 = null;
        this.field335 = null;
        this.field336 = null;
        this.field357 = null;
        this.field321 = null;
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(Ldt;B)V", line = 1129)
    public static final void method198(class254 arg0, byte arg1) {
        if (arg1 != -55) {
            field370 = -127;
        }
        for (int var2 = 0; var2 < class371.field5408; ++var2) {
            int var3 = arg0.method1673(-32768);
            int var4 = arg0.method1728((byte) 98);
            if (~var4 == -65536) {
                var4 = -1;
            }
            if (class447.field6426[var3] != null) {
                class447.field6426[var3].field3872 = var4;
            }
        }
        ++field328;
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(IIZB)Ljava/lang/String;", line = 1158)
    public static final String method199(int arg0, int arg1, boolean arg2, byte arg3) {
        ++field351;
        if (~arg1 <= -3 && ~arg1 >= -37) {
            if (arg2 && ~arg0 <= -1) {
                int var4 = 2;
                for (int var5 = arg0 / arg1; ~var5 != -1; var5 /= arg1) {
                    ++var4;
                }
                int var6 = 82 % ((17 - arg3) / 35);
                char[] var7 = new char[var4];
                var7[0] = '+';
                for (int var8 = var4 - 1; ~var8 < -1; --var8) {
                    int var9 = arg0;
                    arg0 /= arg1;
                    int var10 = -(arg0 * arg1) + var9;
                    if (~var10 <= -11) {
                        var7[var8] = (char) (var10 + 87);
                    } else {
                        var7[var8] = (char) (var10 + 48);
                    }
                }
                return new String(var7);
            } else {
                return Integer.toString(arg0, arg1);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!bja", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 1208)
    public final void method200(class195 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field354;
        if (this.field332 != null && arg0 != null) {
            int var7 = -(this.field322.field3557 * arg2 >> 8) + arg1 >> this.field322.field3517;
            int var8 = -(this.field322.field3563 * arg2 >> 8) + arg3 >> this.field322.field3517;
            this.field332.method2665(var8, arg0, var7, (byte) 73);
        }
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 1226)
    public final boolean method201(class195 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field320;
        if (this.field332 != null && arg0 != null) {
            int var7 = arg1 - (this.field322.field3557 * arg2 >> 8) >> this.field322.field3517;
            int var8 = -(this.field322.field3563 * arg2 >> 8) + arg3 >> this.field322.field3517;
            return this.field332.method2664(var8, var7, arg0, (byte) -67);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bja", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 1243)
    public final void method202(class195 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field327;
        if (this.field332 != null && arg0 != null) {
            int var7 = -(this.field322.field3557 * arg2 >> 8) + arg1 >> this.field322.field3517;
            int var8 = arg3 - (this.field322.field3563 * arg2 >> 8) >> this.field322.field3517;
            this.field332.method2666(var7, var8, arg0, -16);
        }
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1274)
    public final void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field350;
        if (this.field368 > 0) {
            this.field322.method1575((byte) -113);
            this.field322.method1570((byte) 125, false);
            this.field322.method1639(false, -8);
            this.field322.method1593((byte) 29, false);
            this.field322.method1572(false, false);
            this.field322.method1564(0, (byte) 124);
            this.field322.method1580((byte) -52, -2);
            this.field322.method1595((byte) 77, (class205) null);
            class124.field1717[11] = 0.0F;
            class124.field1717[14] = 0.0F;
            class124.field1717[4] = 0.0F;
            class124.field1717[8] = 0.0F;
            class124.field1717[2] = 0.0F;
            class124.field1717[9] = 0.0F;
            class124.field1717[7] = 0.0F;
            class124.field1717[6] = 0.0F;
            class124.field1717[10] = 0.0F;
            class124.field1717[15] = 1.0F;
            class124.field1717[5] = (float) arg2 / ((float) super.field4177 * 128.0F * (float) this.field322.field3421);
            class124.field1717[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field322.field3461) + -1.0F;
            class124.field1717[0] = (float) arg2 / ((float) super.field4177 * 128.0F * (float) this.field322.field3461);
            class124.field1717[1] = 0.0F;
            class124.field1717[3] = 0.0F;
            class124.field1717[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field322.field3421) + 1.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class124.field1717, 0);
            class124.field1717[0] = 1.0F;
            class124.field1717[15] = 1.0F;
            class124.field1717[7] = 0.0F;
            class124.field1717[4] = 0.0F;
            class124.field1717[8] = 0.0F;
            class124.field1717[12] = 0.0F;
            class124.field1717[13] = 0.0F;
            class124.field1717[5] = 0.0F;
            class124.field1717[1] = 0.0F;
            class124.field1717[9] = 1.0F;
            class124.field1717[11] = 0.0F;
            class124.field1717[14] = 0.0F;
            class124.field1717[3] = 0.0F;
            class124.field1717[10] = 0.0F;
            class124.field1717[6] = 1.0F;
            class124.field1717[2] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class124.field1717, 0);
            if (~(this.field349 & 7) == -1) {
                this.field322.method1639(false, -8);
            } else {
                this.field322.method1639(true, -8);
                this.field322.method1591((byte) -40);
            }
            this.field322.method1634(this.field362, this.field366, this.field365, this.field361, (byte) 11);
            if (~this.field322.field3623.field3789.length <= ~(this.field341 * 2)) {
                this.field322.field3623.field3725 = 0;
            } else {
                this.field322.field3623 = new class453(this.field341 * 2);
            }
            int var9 = 0;
            class453 var10 = this.field322.field3623;
            if (!this.field322.field3561) {
                for (int var11 = arg4; arg6 > var11; ++var11) {
                    int var12 = super.field4174 * var11 + arg3;
                    for (int var13 = arg3; var13 < arg5; ++var13) {
                        if (arg7[var13 - arg3][var11 - arg4]) {
                            short[] var14 = this.field326[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var15 > ~var14.length; ++var15) {
                                    ++var9;
                                    var10.method1719(124, 65535 & var14[var15]);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                    int var18 = super.field4174 * var16 + arg3;
                    for (int var19 = arg3; ~var19 > ~arg5; ++var19) {
                        if (arg7[-arg3 + var19][var16 - arg4]) {
                            short[] var20 = this.field326[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var20.length > var21; ++var21) {
                                    var10.method1733(var20[var21] & 65535, -32466);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class561 var17 = new class561(this.field322, 5123, var10.field3789, var10.field3725);
                this.field322.method1568(false, 0, 4, var9, var17);
            }
        }
    }

    @OriginalMember(owner = "client!bja", name = "ka", descriptor = "(III)V", line = 1445)
    public final void method204(int arg0, int arg1, int arg2) {
        if (arg2 > (this.field357[arg0][arg1] & 255)) {
            this.field357[arg0][arg1] = (byte) arg2;
        }
        ++field337;
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1457)
    public final void method205(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field323;
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
        for (int var28 = 0; var28 < var18; ++var28) {
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method188(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }
}
