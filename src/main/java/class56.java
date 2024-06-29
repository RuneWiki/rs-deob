import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class56 extends class161 {

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    private int field921 = -1;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    private int field929 = 0;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "Z")
    private boolean field914 = false;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    private int field923 = -32768;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "Llb;")
    private class341 field935 = null;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "Z")
    private boolean field931 = true;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    private int field946 = 0;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    private int field927 = -1;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    private int field934 = 0;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "Z")
    private boolean field936 = false;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    private int field937;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    private int field944;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    private int field943;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    private int field939;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    private int field930;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    private int field913;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    private int field941;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    private int field938;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
    private int field933;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Ld;")
    private class43 field918;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    private int field950;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Z")
    public static boolean field919 = false;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "[Ljh;")
    public static class258[] field924 = new class258[2048];

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "Ljava/lang/String;")
    public static String field940 = "skill: ";

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "Ljava/lang/String;")
    public static String field949 = "glow3:";

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "Ldc;")
    private class158 field948;

    @OriginalMember(owner = "client!ld", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.field948 != null) {
            this.field948.method1232();
        }
        field928++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ[[I[[F[[F[[FI[[IBIZIIILua;ZI[ZB[IZI)V", line = 17)
    public static final void method439(int arg0, boolean arg1, int[][] arg2, float[][] arg3, float[][] arg4, float[][] arg5, int arg6, int[][] arg7, byte arg8, int arg9, boolean arg10, int arg11, int arg12, int arg13, class299 arg14, boolean arg15, int arg16, boolean[] arg17, byte arg18, int[] arg19, boolean arg20, int arg21) {
        field920++;
        int var22 = (arg13 << 8) + (arg10 ? 255 : 0);
        int var23 = (arg20 ? 255 : 0) + (arg16 << 8);
        int var24 = (arg9 << 8) + (arg1 ? 255 : 0);
        if (arg8 != -76) {
            field924 = (class258[]) null;
        }
        int var25 = (arg15 ? 255 : 0) + (arg21 << 8);
        int[] var26 = new int[arg19.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg19[var27 + var27];
            int var29 = arg19[var27 + var27 + 1];
            int[][] var30 = arg2 == null || arg17 == null || !arg17[var27] ? arg7 : arg2;
            var26[var27] = class321.method2266(arg4, arg14, var24, (byte) -21, arg3, var23, arg5, var28, arg11, var25, arg18, (float) arg0, false, arg2, var29, var22, arg12, var30);
        }
        arg14.method2143(arg6, arg12, arg11, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIIJILdc;)V", line = 58)
    public final void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class158 arg10) {
        class161 var13 = this.method450((byte) 81);
        field922++;
        if (var13 != null) {
            this.method446((byte) 126, var13);
            var13.method440(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field948);
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(IIIII)V", line = 75)
    public static final void method441(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class183.field2955; var5++) {
            if (class54.field895[var5] + class222.field3637[var5] > arg0 && class54.field895[var5] < arg0 + arg3 && arg2 < class78.field1349[var5] + class358.field5685[var5] && class78.field1349[var5] < (arg2 + arg4)) {
                class270.field4498[var5] = true;
            }
        }
        if (arg1 < -14) {
            field951++;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)V", line = 99)
    private final void method442(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.field937 = -126;
        }
        field947++;
        label94: while (true) {
            if (this.field918 == null) {
                if (this.field914) {
                    return;
                }
                this.method451(-1, (byte) -127);
                if (this.field918 == null) {
                    return;
                }
            }
            int var4 = class332.field5261 - this.field941;
            if (var4 > 100 && this.field918.field661 > 0) {
                int var5 = this.field918.field677.length - this.field918.field661;
                while (var5 > this.field933 && this.field918.field651[this.field933] < var4) {
                    var4 -= this.field918.field651[this.field933];
                    this.field933++;
                }
                if (var5 <= this.field933) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field918.field677.length; var7++) {
                        var6 += this.field918.field651[var7];
                    }
                    var4 %= var6;
                }
                this.field938 = this.field933 + 1;
                if (this.field938 >= this.field918.field677.length) {
                    this.field938 -= this.field918.field661;
                    if (this.field938 < 0 || this.field938 >= this.field918.field677.length) {
                        this.field938 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field918.field651[this.field933] >= var4) {
                            this.field950 = var4;
                            this.field941 = class332.field5261 - var4;
                            return;
                        }
                        class334.method2338(false, arg2, arg0, this.field933, (byte) -13, this.field918);
                        var4 -= this.field918.field651[this.field933];
                        this.field933++;
                        if (this.field918.field677.length <= this.field933) {
                            this.field933 -= this.field918.field661;
                            if (this.field933 < 0 || this.field918.field677.length <= this.field933) {
                                this.field918 = null;
                                continue label94;
                            }
                        }
                        this.field938 = this.field933 + 1;
                    } while (this.field918.field677.length > this.field938);
                    this.field938 -= this.field918.field661;
                } while (this.field938 >= 0 && this.field938 < this.field918.field677.length);
                this.field938 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 202)
    public static void method443(int arg0) {
        field940 = null;
        field949 = null;
        field924 = null;
        int var1 = -121 / ((-arg0 - 3) / 40);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "()I", line = 219)
    public final int method444() {
        field916++;
        return this.field923;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(IIIIIIIZLhd;)V", line = 688)
    public class56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class161 arg8) {
        this.field937 = arg2;
        this.field944 = arg0;
        this.field943 = arg4;
        this.field939 = arg3;
        this.field930 = arg5;
        this.field913 = arg1;
        if (arg8 != null) {
            this.field914 = true;
            if (arg8 instanceof class56) {
                class56 var10 = (class56) arg8;
                if (class42.field607) {
                    var10.method447(10874);
                }
                this.field941 = var10.field941;
                this.field938 = var10.field938;
                this.field933 = var10.field933;
                this.field918 = var10.field918;
                this.field950 = var10.field950;
            } else if (class42.field607) {
                class29 var11 = class166.method1292(0, this.field944);
                if (var11.field418 != null) {
                    var11 = var11.method177(5000);
                }
                if (var11 != null) {
                    class318.method2249(var11, this.field930, 0, true, this.field943, this.field913, this.field939, this.field937, 0);
                }
            }
        }
        if (this.field914) {
            this.method451(arg6, (byte) 76);
        }
        if (class42.field607 && arg8 != null) {
            this.method449(3, true);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V", line = 239)
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class161 var6 = null;
        field910++;
        if (class42.field607) {
            var6 = this.method449(3, true);
        } else {
            this.method442(arg4, -1, arg3);
        }
        if (!this.field936) {
            if (var6 == null) {
                var6 = this.method450((byte) -105);
            }
            if (var6 == null) {
                return;
            }
            this.method446((byte) 126, var6);
        }
        if (this.field948 != null) {
            this.field948.method1230(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLhd;)V", line = 272)
    private final void method446(byte arg0, class161 arg1) {
        field925++;
        if (arg0 != 126) {
            this.method442(-99, 118, 124);
        }
        if (class42.field607) {
            class337 var3 = (class337) arg1;
            if ((this.field948 == null || this.field948.field2485) && (var3.field5345 != null || var3.field5326 != null)) {
                class29 var4 = class166.method1292(0, this.field944);
                if (var4.field418 != null) {
                    var4 = var4.method177(5000);
                }
                if (var4 != null) {
                    this.field948 = new class158(class332.field5261, var4.field414, var4.field342);
                }
            }
            if (this.field948 != null) {
                this.field948.method1228(var3.field5345, var3.field5326, false, var3.field5344, var3.field5365, var3.field5332);
            }
        } else {
            class62 var5 = (class62) arg1;
            if ((this.field948 == null || this.field948.field2485) && (var5.field1047 != null || var5.field1035 != null)) {
                class29 var6 = class166.method1292(0, this.field944);
                if (var6.field418 != null) {
                    var6 = var6.method177(5000);
                }
                if (var6 != null) {
                    this.field948 = new class158(class332.field5261, var6.field414, var6.field342);
                }
            }
            if (this.field948 != null) {
                this.field948.method1228(var5.field1047, var5.field1035, false, var5.field1044, var5.field1042, var5.field1062);
            }
        }
        this.field936 = true;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V", line = 327)
    public final void method447(int arg0) {
        if (arg0 != 10874) {
            this.method450((byte) 35);
        }
        field912++;
        if (this.field935 != null) {
            class249.method1915(this.field935, this.field929, this.field934, this.field946);
            this.field935 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)[Llb;", line = 345)
    public static final class341[] method448(byte arg0) {
        field917++;
        class341[] var1 = new class341[class301.field4845];
        if (arg0 != 112) {
            field915 = 106;
        }
        for (int var2 = 0; var2 < class301.field4845; var2++) {
            var1[var2] = new class341(class164.field2595, class318.field5070, class189.field3035[var2], class19.field211[var2], class221.field3595[var2], class322.field5132[var2], class163.field2578[var2], class121.field2026);
        }
        class211.method1592((byte) 41);
        return var1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)Lhd;", line = 423)
    private final class161 method449(int arg0, boolean arg1) {
        boolean var3 = class208.field3270 != class101.field1656;
        class29 var4 = class166.method1292(0, this.field944);
        field911++;
        if (var4.field418 != null) {
            var4 = var4.method177(5000);
        }
        if (var4 == null) {
            if (class42.field607 && !var3) {
                this.method447(10874);
            }
            this.field921 = this.field933;
            this.field927 = -1;
            return null;
        }
        if (!this.field914 && this.field927 != var4.field417) {
            this.method451(-1, (byte) -125);
        }
        int var5 = arg0 & this.field937;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field414;
            var6 = var4.field342;
        } else {
            var6 = var4.field414;
            var7 = var4.field342;
        }
        int var8 = (var6 >> 1) + this.field943;
        int var9 = (var7 >> 1) + this.field930;
        int var10 = (var6 + 1 >> 1) + this.field943;
        int var11 = (var7 + 1 >> 1) + this.field930;
        this.method442(var9 * 128, -1, var8 * 128);
        boolean var12 = !var3 && var4.field391 && (this.field927 != var4.field417 || (this.field933 != this.field921 || this.field918 != null && (this.field918.field654 || class94.field1575) && this.field938 != this.field933) && class131.field2214 >= 2);
        if (arg1 && !var12) {
            this.field927 = var4.field417;
            this.field921 = this.field933;
            return null;
        }
        int[][] var13 = class101.field1656[this.field939];
        int var14 = var13[var8][var9] + var13[var8][var11] + var13[var10][var9] + var13[var10][var11] >> 2;
        int var15 = (this.field943 << 7) + (var6 << 6);
        int var16 = (this.field930 << 7) + (var7 << 6);
        int[][] var17 = (int[][]) null;
        if (var3) {
            var17 = class208.field3270[0];
        } else if (this.field939 < 3) {
            var17 = class101.field1656[this.field939 + 1];
        }
        if (class42.field607 && var12) {
            class249.method1915(this.field935, this.field929, this.field934, this.field946);
        }
        boolean var18 = this.field935 == null;
        class296 var19;
        if (this.field918 == null) {
            var19 = var4.method179(var18 ? class176.field2824 : this.field935, var13, false, var17, this.field913, var12, var15, this.field937, var16, var14, arg0 ^ 0x7DE0);
        } else {
            var19 = var4.method190(var14, var17, this.field918, this.field937, var16, var15, this.field933, -1, var13, var18 ? class176.field2824 : this.field935, var12, this.field913, this.field950, this.field938);
        }
        if (var19 == null) {
            this.field927 = var4.field417;
            this.field921 = this.field933;
            return null;
        }
        if (class42.field607 && var12) {
            if (var18) {
                class176.field2824 = var19.field4762;
            }
            int var20 = 0;
            if (this.field939 != 0) {
                int[][] var21 = class101.field1656[0];
                var20 = var14 - (var21[var8][var11] + var21[var10][var11] + var21[var8][var9] + var21[var10][var9] >> 2);
            }
            class341 var22 = var19.field4762;
            if (this.field931 && class249.method1913(var22, var15, var20, var16)) {
                this.field931 = false;
            }
            if (!this.field931) {
                class249.method1927(var22, var15, var20, var16);
                this.field929 = var15;
                this.field946 = var16;
                this.field935 = var22;
                if (var18) {
                    class176.field2824 = null;
                }
                this.field934 = var20;
            }
        }
        this.field927 = var4.field417;
        this.field921 = this.field933;
        return var19.field4765;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)Lhd;", line = 565)
    public final class161 method450(byte arg0) {
        field926++;
        int var2 = 69 / ((24 - arg0) / 37);
        return this.method449(3, false);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)V", line = 579)
    private final void method451(int arg0, byte arg1) {
        int var3 = arg0;
        boolean var4 = false;
        field945++;
        if (arg0 == -1) {
            class29 var5 = class166.method1292(0, this.field944);
            class29 var6 = var5;
            if (var5.field418 != null) {
                var5 = var5.method177(5000);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field375 != null) {
                if (this.field918 != null && var5.method194(65535, this.field918.field671)) {
                    return;
                }
                var3 = var5.method189((byte) -82);
                if (this.field927 != var5.field417) {
                    var4 = var5.field343;
                }
            } else if (var5.field337 == -1) {
                if (var6 != null && var6.field375 != null) {
                    if (this.field918 != null && var6.method194(65535, this.field918.field671)) {
                        return;
                    }
                    var3 = var6.method189((byte) -82);
                    if (this.field927 != var6.field417) {
                        var4 = var6.field343;
                    }
                } else if (var6 != null && var6.field337 != -1 && this.field927 != var6.field417) {
                    var3 = var6.field337;
                    var4 = var6.field343;
                }
            } else if (this.field927 != var5.field417) {
                var3 = var5.field337;
                var4 = var5.field343;
            }
        }
        if (var3 == -1) {
            this.field918 = null;
            return;
        }
        int var7 = -118 / ((arg1 + 64) / 61);
        if (this.field918 == null || this.field918.field671 != var3) {
            this.field918 = class198.method1524(var3, 84);
        } else if (this.field918.field668 == 0) {
            return;
        }
        if (var4) {
            this.field933 = (int) (Math.random() * (double) this.field918.field677.length);
            this.field950 = (int) ((double) this.field918.field651[this.field933] * Math.random()) + 1;
        } else {
            this.field950 = 1;
            this.field933 = 0;
        }
        this.field938 = this.field933 + 1;
        if (this.field938 < 0 || this.field918.field677.length <= this.field938) {
            this.field938 = -1;
        }
        this.field941 = class332.field5261 - this.field950;
    }
}
