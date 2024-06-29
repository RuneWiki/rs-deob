import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class279 extends class232 {

    @OriginalMember(owner = "client!gj", name = "fb", descriptor = "[S")
    private short[] field4689 = new short[257];

    @OriginalMember(owner = "client!gj", name = "jb", descriptor = "I")
    private int field4693 = 0;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "Lhi;")
    public static class82 field4674 = class95.method664((byte) -65, "Textures charg-Bes");

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "Lhi;")
    public static class82 field4680 = class95.method664((byte) -100, "mapfunction");

    @OriginalMember(owner = "client!gj", name = "ib", descriptor = "Lhi;")
    public static class82 field4692 = class95.method664((byte) -49, "Liste der Welten geladen");

    @OriginalMember(owner = "client!gj", name = "kb", descriptor = "Lhi;")
    private static class82 field4694 = class95.method664((byte) -97, "wave:");

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "Lhi;")
    public static class82 field4673 = field4694;

    @OriginalMember(owner = "client!gj", name = "nb", descriptor = "Lhi;")
    private static class82 field4697 = class95.method664((byte) -125, "Created gameworld");

    @OriginalMember(owner = "client!gj", name = "mb", descriptor = "Lhi;")
    public static class82 field4696 = field4694;

    @OriginalMember(owner = "client!gj", name = "Y", descriptor = "Lhi;")
    public static class82 field4682 = field4697;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!gj", name = "Z", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!gj", name = "ab", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!gj", name = "db", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!gj", name = "eb", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!gj", name = "gb", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!gj", name = "hb", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!gj", name = "lb", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "Lum;")
    public static class222 field4679;

    @OriginalMember(owner = "client!gj", name = "bb", descriptor = "Lme;")
    public static class75 field4685;

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "[I")
    private int[] field4676;

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "[I")
    private int[] field4681;

    @OriginalMember(owner = "client!gj", name = "cb", descriptor = "[[I")
    private int[][] field4686;

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 4)
    public class279() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lum;II)Lve;", line = 9)
    public static final class212 method1942(class222 arg0, int arg1, int arg2) {
        if (arg2 != 9465) {
            method1942((class222) null, 77, -31);
        }
        field4695++;
        return class281.method1959(-123, arg0, arg1) ? class39.method307(0) : null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBLbc;)V", line = 24)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg1 != -19) {
            field4697 = (class82) null;
        }
        if (arg0 == 0) {
            this.field4693 = arg2.method1082(-106);
            this.field4686 = new int[arg2.method1082(-82)][2];
            for (int var4 = 0; var4 < this.field4686.length; var4++) {
                this.field4686[var4][0] = arg2.method1090(false);
                this.field4686[var4][1] = arg2.method1090(false);
            }
        }
        field4683++;
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)V", line = 54)
    public final void method144(int arg0) {
        field4688++;
        if (this.field4686 == null) {
            this.field4686 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (this.field4686.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field4693 == 2) {
            this.method1945(0);
        }
        class20.method137(4096);
        this.method1947(-85);
        if (arg0 < 48) {
            this.method80(92, (byte) -46);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIII)I", line = 80)
    public static final int method1943(int arg0, int arg1, int arg2, int arg3) {
        field4678++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg0;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            if (arg1 != 1) {
                field4696 = (class82) null;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(IB)[I", line = 103)
    public final int[] method80(int arg0, byte arg1) {
        field4690++;
        int var3 = -123 % ((-arg1 - 31) / 55);
        int[] var4 = this.field4008.method131((byte) -99, arg0);
        if (this.field4008.field256) {
            int[] var5 = this.method1649(0, (byte) 68, arg0);
            for (int var6 = 0; var6 < class54.field858; var6++) {
                int var7 = var5[var6] >> 4;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > 256) {
                    var7 = 256;
                }
                var4[var6] = this.field4689[var7];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIBIII)V", line = 141)
    public static final void method1944(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 38) {
            method1944(-40, 4, 18, -46, (byte) -127, -5, 91, -7);
        }
        field4687++;
        if (class113.method777((byte) -45, arg3)) {
            client.method857(class277.field4660[arg3], -1, arg2, arg5, arg7, arg1, arg6, arg0);
        }
    }

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "(I)V", line = 156)
    private final void method1945(int arg0) {
        field4677++;
        int[] var2 = this.field4686[1];
        int[] var3 = this.field4686[this.field4686.length - 1];
        int[] var4 = this.field4686[this.field4686.length - 2];
        int[] var5 = this.field4686[arg0];
        this.field4681 = new int[] { var4[0] - (var3[0] - var4[0]), var4[1] + -var3[1] + var4[1] };
        this.field4676 = new int[] { var5[0] - (var2[0] - var5[0]), var5[1] - var2[1] + var5[1] };
    }

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "(I)V", line = 175)
    public static void method1946(int arg0) {
        field4680 = null;
        field4694 = null;
        field4692 = null;
        if (arg0 != 2) {
            field4682 = (class82) null;
        }
        field4685 = null;
        field4696 = null;
        field4673 = null;
        field4679 = null;
        field4682 = null;
        field4697 = null;
        field4674 = null;
    }

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "(I)V", line = 221)
    private final void method1947(int arg0) {
        int var2 = this.field4693;
        if (var2 == 2) {
            for (int var20 = 0; var20 < 257; var20++) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field4686.length - 1 && this.field4686[var22][0] <= var21; var22++) {
                }
                int[] var23 = this.field4686[var22 - 1];
                int[] var24 = this.field4686[var22];
                int var25 = this.method1950(var22 - 2, (byte) 121)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1950(var22 + 1, (byte) 91)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] - var23[0]);
                int var30 = var28 + var26 - var25 - var27;
                int var31 = var29 * var29 >> 12;
                int var32 = var25 - var30 - var26;
                int var33 = var27 - var25;
                int var35 = (var29 * var30 >> 12) * var31 >> 12;
                int var36 = var31 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var36 + var37 + var26 + var35;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field4689[var20] = (short) var38;
            }
        } else if (var2 == 1) {
            for (int var11 = 0; var11 < 257; var11++) {
                int var12 = var11 << 4;
                int var13;
                for (var13 = 1; (this.field4686.length - 1) > var13 && this.field4686[var13][0] <= var12; var13++) {
                }
                int[] var14 = this.field4686[var13];
                int[] var15 = this.field4686[var13 - 1];
                int var16 = (var12 - var15[0] << 12) / (var14[0] - var15[0]);
                int var17 = 4096 - class138.field2368[var16 >> 5 & 0xFF] >> 1;
                int var18 = 4096 - var17;
                int var19 = var15[1] * var18 + (var14[1] * var17) >> 12;
                if (var19 <= -32768) {
                    var19 = -32767;
                }
                if (var19 >= 32768) {
                    var19 = 32767;
                }
                this.field4689[var11] = (short) var19;
            }
        } else {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; this.field4686.length - 1 > var5 && var4 >= this.field4686[var5][0]; var5++) {
                }
                int[] var6 = this.field4686[var5];
                int[] var7 = this.field4686[var5 - 1];
                int var8 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var9 = 4096 - var8;
                int var10 = var7[1] * var9 + (var6[1] * var8) >> 12;
                if (var10 <= -32768) {
                    var10 = -32767;
                }
                if (var10 >= 32768) {
                    var10 = 32767;
                }
                this.field4689[var3] = (short) var10;
            }
        }
        if (arg0 >= -70) {
            this.method1945(-102);
        }
        field4691++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[[F[[FIIBZ[[I[[FBLuk;IIIII)V", line = 392)
    public static final void method1948(int arg0, float[][] arg1, float[][] arg2, int arg3, int arg4, byte arg5, boolean arg6, int[][] arg7, float[][] arg8, byte arg9, class108 arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        field4675++;
        if (arg12 != 1033) {
            return;
        }
        int var16 = (arg4 << 8) + 255;
        int var17 = (arg13 << 8) + 255;
        int var18 = (arg14 << 8) + 255;
        int var19 = (arg15 << 8) + 255;
        int[] var20 = null;
        int[] var21 = class193.field3283[arg5];
        int[] var22 = new int[var21.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class87.method610(var19, arg7, false, var17, 0.0F, var21[var23 + var23 + 1], var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, var21[var23 + var23], -128, arg9, arg10, arg11);
        }
        if (arg6) {
            if (arg5 == 1) {
                var20 = new int[6];
                int var42 = class87.method610(var19, arg7, true, var17, 0.0F, 128, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 64, -128, arg9, arg10, arg11);
                int var43 = class87.method610(var19, arg7, true, var17, 0.0F, 64, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 128, -128, arg9, arg10, arg11);
                var20[0] = var43;
                var20[4] = var22[0];
                var20[1] = var42;
                var20[2] = var22[2];
                var20[3] = var42;
                var20[5] = var22[2];
            } else if (arg5 == 2) {
                var20 = new int[6];
                int var25 = class87.method610(var19, arg7, true, var17, 0.0F, 128, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 128, -125, arg9, arg10, arg11);
                int var26 = class87.method610(var19, arg7, true, var17, 0.0F, 0, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 64, -125, arg9, arg10, arg11);
                var20[3] = var25;
                var20[2] = var25;
                var20[1] = var26;
                var20[4] = var22[1];
                var20[0] = var22[0];
                var20[5] = var22[0];
            } else if (arg5 == 3) {
                var20 = new int[6];
                int var27 = class87.method610(var19, arg7, true, var17, 0.0F, 128, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 0, -121, arg9, arg10, arg11);
                int var28 = class87.method610(var19, arg7, true, var17, 0.0F, 0, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 64, -120, arg9, arg10, arg11);
                var20[3] = var27;
                var20[0] = var22[2];
                var20[4] = var28;
                var20[2] = var27;
                var20[1] = var22[1];
                var20[5] = var22[2];
            } else if (arg5 == 4) {
                int var29 = class87.method610(var19, arg7, true, var17, 0.0F, 128, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 0, -123, arg9, arg10, arg11);
                var20 = new int[] { var22[3], var29, var22[0] };
            } else if (arg5 == 5) {
                int var41 = class87.method610(var19, arg7, true, var17, 0.0F, 128, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 128, -122, arg9, arg10, arg11);
                var20 = new int[] { var22[2], var41, var22[3] };
            } else if (arg5 == 6) {
                var20 = new int[6];
                int var39 = class87.method610(var19, arg7, true, var17, 0.0F, 0, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 128, arg12 - 1161, arg9, arg10, arg11);
                int var40 = class87.method610(var19, arg7, true, var17, 0.0F, 128, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 128, -116, arg9, arg10, arg11);
                var20[1] = var39;
                var20[2] = var40;
                var20[0] = var22[3];
                var20[3] = var40;
                var20[5] = var22[3];
                var20[4] = var22[0];
            } else if (arg5 == 7) {
                var20 = new int[6];
                int var30 = class87.method610(var19, arg7, true, var17, 0.0F, 128, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 0, arg12 - 1160, arg9, arg10, arg11);
                int var31 = class87.method610(var19, arg7, true, var17, 0.0F, 0, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 128, -119, arg9, arg10, arg11);
                var20[0] = var22[1];
                var20[2] = var30;
                var20[1] = var31;
                var20[4] = var22[2];
                var20[5] = var22[1];
                var20[3] = var30;
            } else if (arg5 == 8) {
                var20 = new int[3];
                int var38 = class87.method610(var19, arg7, true, var17, 0.0F, 0, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 0, -121, arg9, arg10, arg11);
                var20[0] = var22[3];
                var20[2] = var22[4];
                var20[1] = var38;
            } else if (arg5 == 9) {
                int var32 = class87.method610(var19, arg7, true, var17, 0.0F, 64, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 128, arg12 ^ 0xFFFFFB89, arg9, arg10, arg11);
                var20 = new int[15];
                int var33 = class87.method610(var19, arg7, true, var17, 0.0F, 32, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 96, -126, arg9, arg10, arg11);
                int var34 = class87.method610(var19, arg7, true, var17, 0.0F, 0, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 64, arg12 ^ 0xFFFFFB81, arg9, arg10, arg11);
                var20[12] = var33;
                var20[9] = var33;
                var20[3] = var33;
                var20[14] = var34;
                var20[0] = var33;
                var20[7] = var22[3];
                var20[1] = var32;
                var20[2] = var22[4];
                var20[4] = var22[4];
                var20[6] = var33;
                var20[5] = var22[3];
                var20[11] = var22[1];
                var20[10] = var22[2];
                var20[8] = var22[2];
                var20[13] = var22[1];
            } else if (arg5 == 10) {
                var20 = new int[9];
                int var37 = class87.method610(var19, arg7, true, var17, 0.0F, 128, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 0, arg12 ^ 0xFFFFFB8A, arg9, arg10, arg11);
                var20[4] = var37;
                var20[5] = var22[4];
                var20[1] = var37;
                var20[6] = var22[4];
                var20[0] = var22[2];
                var20[7] = var37;
                var20[2] = var22[3];
                var20[8] = var22[0];
                var20[3] = var22[3];
            } else if (arg5 == 11) {
                var20 = new int[12];
                int var35 = class87.method610(var19, arg7, true, var17, 0.0F, 64, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 0, arg12 - 1154, arg9, arg10, arg11);
                int var36 = class87.method610(var19, arg7, true, var17, 0.0F, 64, var18, arg8, arg3, arg1, var16, (int[][]) null, arg2, 128, -124, arg9, arg10, arg11);
                var20[8] = var35;
                var20[11] = var36;
                var20[5] = var35;
                var20[1] = var35;
                var20[10] = var22[1];
                var20[0] = var22[3];
                var20[2] = var22[0];
                var20[4] = var22[2];
                var20[6] = var22[2];
                var20[7] = var36;
                var20[3] = var22[3];
                var20[9] = var22[2];
            }
        }
        arg10.method740(arg0, arg11, arg3, var22, var20, false);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)V", line = 675)
    public static final void method1949(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class60 var7 = new class60();
        var7.field946 = arg1 / 128;
        var7.field948 = arg2 / 128;
        var7.field941 = arg3 / 128;
        var7.field923 = arg4 / 128;
        var7.field938 = arg0;
        var7.field932 = arg1;
        var7.field924 = arg2;
        var7.field942 = arg3;
        var7.field939 = arg4;
        var7.field937 = arg5;
        var7.field922 = arg6;
        class171.field2952[class181.field3097++] = var7;
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(IB)[I", line = 705)
    private final int[] method1950(int arg0, byte arg1) {
        field4684++;
        if (arg0 < 0) {
            return this.field4676;
        } else if (this.field4686.length > arg0) {
            if (arg1 < 71) {
                field4694 = (class82) null;
            }
            return this.field4686[arg0];
        } else {
            return this.field4681;
        }
    }
}
