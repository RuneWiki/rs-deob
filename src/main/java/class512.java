import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class512 extends class55 {

    @OriginalMember(owner = "client!jq", name = "F", descriptor = "Lsi;")
    private class560 field6936;

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "Luv;")
    private class367 field6922;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "Lcba;")
    private class551 field6919;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
    private int field6917;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
    private int field6921;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
    private int field6920;

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "I")
    private int field6928;

    @OriginalMember(owner = "client!jq", name = "A", descriptor = "[[F")
    private float[][] field6931;

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "[[F")
    private float[][] field6926;

    @OriginalMember(owner = "client!jq", name = "D", descriptor = "[[F")
    private float[][] field6934;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
    private int field6925;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "Ltea;")
    private class241 field6924;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "Lug;")
    private class562 field6916;

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "Lwr;")
    private class459 field6930;

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6923;

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6927;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    private int field6918;

    @OriginalMember(owner = "client!jq", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field6935 = new String[200];

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!jq", name = "y", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!jq", name = "C", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I[[ZIII)V", line = 14)
    public final void method2835(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4) {
        field6933++;
        if (this.field6916 == null || arg2 + arg4 < this.field6917 || this.field6921 < arg2 - arg4 || this.field6920 > arg3 + arg4 || this.field6928 < (arg3 - arg4)) {
            return;
        }
        if (arg0 != 0) {
            this.field6925 = -100;
        }
        for (int var6 = this.field6920; var6 <= this.field6928; var6++) {
            for (int var7 = this.field6917; var7 <= this.field6921; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg3;
                if (var8 > (-arg4) && var8 < arg4 && (-arg4) < var9 && arg4 > var9 && arg1[arg4 + var8][arg4 + var9]) {
                    this.field6922.method2117(4, (byte) ((int) (this.field6919.method3131(false) * 255.0F)));
                    this.field6922.method1325(0, true, this.field6924);
                    this.field6922.method1330(this.field6922.field5151, (byte) 86);
                    this.field6922.method1304(class387.field5460, this.field6918, 0, 26810, this.field6916, 0, this.field6925 / 3);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V", line = 72)
    public static void method2836(int arg0) {
        if (arg0 != 573132577) {
            method2839(28);
        }
        field6935 = null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIII)V", line = 85)
    private final void method2837(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6929++;
        long var8 = -1L;
        int var10 = arg6 + (arg1 << this.field6936.field3722);
        int var11 = (arg2 << this.field6936.field3722) + arg4;
        int var12 = this.field6936.method1683(var10, var11, true);
        if ((arg6 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
            var8 = (long) var11 << 16 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
            class55 var13 = this.field6930.method2552(var8, -1);
            if (var13 != null) {
                this.method2838(((class450) var13).field6288, -29314);
                return;
            }
        }
        short var14 = (short) (this.field6918++);
        if (var8 != -1L) {
            this.field6930.method2558(new class450(var14), var8, arg3 - 1);
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg4 == 0) {
            var15 = this.field6931[arg5][arg0];
            var16 = this.field6934[arg5][arg0];
            var17 = this.field6926[arg5][arg0];
        } else if (this.field6936.field3730 == arg6 && arg4 == 0) {
            var16 = this.field6934[arg5 + 1][arg0];
            var15 = this.field6931[arg5 + 1][arg0];
            var17 = this.field6926[arg5 + 1][arg0];
        } else if (this.field6936.field3730 == arg6 && this.field6936.field3730 == arg4) {
            var15 = this.field6931[arg5 + 1][arg0 + 1];
            var17 = this.field6926[arg5 + 1][arg0 + 1];
            var16 = this.field6934[arg5 + 1][arg0 + 1];
        } else if (arg6 == 0 && this.field6936.field3730 == arg4) {
            var15 = this.field6931[arg5][arg0 + 1];
            var17 = this.field6926[arg5][arg0 + 1];
            var16 = this.field6934[arg5][arg0 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field6936.field3730;
            float var19 = (float) arg4 / (float) this.field6936.field3730;
            float var20 = this.field6926[arg5][arg0];
            float var21 = this.field6934[arg5][arg0];
            float var22 = this.field6931[arg5][arg0];
            float var23 = this.field6926[arg5 + 1][arg0];
            float var24 = this.field6934[arg5 + 1][arg0];
            float var25 = (this.field6931[arg5][arg0 + 1] - var22) * var18 + var22;
            float var26 = (this.field6934[arg5][arg0 + 1] - var21) * var18 + var21;
            float var27 = (this.field6926[arg5][arg0 + 1] - var20) * var18 + var20;
            float var28 = this.field6931[arg5 + 1][arg0];
            float var29 = (this.field6934[arg5 + 1][arg0 + 1] - var24) * var18 + var24;
            float var30 = (this.field6926[arg5 + 1][arg0 + 1] - var23) * var18 + var23;
            var16 = (var29 - var26) * var19 + var26;
            float var31 = (this.field6931[arg5 + 1][arg0 + 1] - var28) * var18 + var28;
            var17 = (var30 - var27) * var19 + var27;
            var15 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field6919.method3130(arg3 + 7019) - var10);
        float var33 = (float) (this.field6919.method3137((byte) 103) - var12);
        float var34 = (float) (this.field6919.method3136(arg3 ^ 0x701B) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field6919.method3133(125);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var38 + var16 * var39 + var17 * var37;
        if ((float) arg3 > var42) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field6919.method3135((byte) -78);
        int var45 = (int) ((float) ((var44 & 0xFFD717) >> 16) * var43);
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
        if (Stream.method3786()) {
            this.field6923.method3784((float) var10);
            this.field6923.method3784((float) var12);
            this.field6923.method3784((float) var11);
        } else {
            this.field6923.method3781((float) var10);
            this.field6923.method3781((float) var12);
            this.field6923.method3781((float) var11);
        }
        if (this.field6922.field5072 == 0) {
            this.field6923.method3793(var47);
            this.field6923.method3793(var46);
            this.field6923.method3793(var45);
        } else {
            this.field6923.method3793(var45);
            this.field6923.method3793(var46);
            this.field6923.method3793(var47);
        }
        this.field6923.method3793(255);
        this.method2838(var14, -29314);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(SI)V", line = 267)
    private final void method2838(short arg0, int arg1) {
        if (arg1 != -29314) {
            this.field6923 = null;
        }
        if (Stream.method3786()) {
            this.field6927.method3791(arg0);
        } else {
            this.field6927.method3792(arg0);
        }
        field6937++;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)Z", line = 286)
    public static final boolean method2839(int arg0) {
        class386.field5452++;
        if (arg0 == -1) {
            class122.field1594 = true;
            field6915++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Luv;Lsi;Lcba;[I)V", line = 303)
    public class512(class367 arg0, class560 arg1, class551 arg2, int[] arg3) {
        this.field6936 = arg1;
        this.field6922 = arg0;
        this.field6919 = arg2;
        int var5 = this.field6919.method3133(-75) - (arg1.field3730 >> 1);
        this.field6917 = this.field6919.method3130(7019) - var5 >> arg1.field3722;
        this.field6921 = var5 + this.field6919.method3130(7019) >> arg1.field3722;
        this.field6920 = this.field6919.method3136(28699) - var5 >> arg1.field3722;
        this.field6928 = this.field6919.method3136(28699) + var5 >> arg1.field3722;
        int var6 = this.field6921 + 1 - this.field6917;
        int var7 = this.field6928 + 1 - this.field6920;
        this.field6931 = new float[var6 + 1][var7 + 1];
        this.field6926 = new float[var6 + 1][var7 + 1];
        this.field6934 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field6920 + var8;
            if (var27 > 0 && this.field6936.field3728 - 1 > var27) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field6917 + var28;
                    if (var29 > 0 && this.field6936.field3727 - 1 > var29) {
                        int var30 = arg1.method1685(var27, -12639, var29 + 1) - arg1.method1685(var27, -12639, var29 - 1);
                        int var31 = arg1.method1685(var27 + 1, -12639, var29) - arg1.method1685(var27 - 1, -12639, var29);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var31 * var31 + var30 * var30 + 65536)));
                        this.field6926[var28][var8] = (float) var30 * var32;
                        this.field6934[var28][var8] = var32 * -256.0F;
                        this.field6931[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field6920; var10 <= this.field6928; var10++) {
            if (var10 >= 0 && var10 < arg1.field3728) {
                for (int var23 = this.field6917; var23 <= this.field6921; var23++) {
                    if (var23 >= 0 && arg1.field3727 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field7905[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field6925 += 3;
                                    }
                                }
                            } else {
                                this.field6925 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field6921 - this.field6917;
            }
        }
        if (this.field6925 <= 0) {
            this.field6924 = null;
            this.field6916 = null;
        } else {
            this.field6930 = new class459(class128.method814(423660257, this.field6925));
            this.field6916 = this.field6922.method1281((byte) 84, false);
            this.field6916.method180(this.field6925, 20779);
            NativeHeapBuffer var11 = this.field6922.method2111(this.field6925 * 16, false, 0);
            this.field6923 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field6916.method179(true, -90);
                } while (var12 == null);
                this.field6927 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field6920; var15 <= this.field6928; var15++) {
                    if (var15 >= 0 && arg1.field3728 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field6917; var17 <= this.field6921; var17++) {
                            if (var17 >= 0 && var17 < arg1.field3727) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field7905[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field7878[var17][var15];
                                        int[] var21 = arg1.field7904[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method2837(var14, var17, var15, 0, var21[var22], var16, var20[var22]);
                                                    var22++;
                                                    this.method2837(var14, var17, var15, 0, var21[var22], var16, var20[var22]);
                                                    var22++;
                                                    this.method2837(var14, var17, var15, 0, var21[var22], var16, var20[var22]);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method2837(var14, var17, var15, 0, 0, var16, 0);
                                        this.method2837(var14, var17, var15, 0, 0, var16, arg1.field3730);
                                        this.method2837(var14, var17, var15, 0, arg1.field3730, var16, 0);
                                    } else if (var18 == 2) {
                                        this.method2837(var14, var17, var15, 0, 0, var16, arg1.field3730);
                                        this.method2837(var14, var17, var15, 0, arg1.field3730, var16, arg1.field3730);
                                        this.method2837(var14, var17, var15, 0, 0, var16, 0);
                                    } else if (var18 == 5) {
                                        this.method2837(var14, var17, var15, 0, arg1.field3730, var16, arg1.field3730);
                                        this.method2837(var14, var17, var15, 0, arg1.field3730, var16, 0);
                                        this.method2837(var14, var17, var15, 0, 0, var16, arg1.field3730);
                                    } else if (var18 == 4) {
                                        this.method2837(var14, var17, var15, 0, arg1.field3730, var16, 0);
                                        this.method2837(var14, var17, var15, 0, 0, var16, 0);
                                        this.method2837(var14, var17, var15, 0, arg1.field3730, var16, arg1.field3730);
                                    }
                                }
                            }
                            var16++;
                            var13++;
                        }
                    } else {
                        var13 += this.field6921 - this.field6917;
                    }
                    var14++;
                }
                this.field6927.method3795();
                if (this.field6916.method178((byte) -96)) {
                    this.field6923.method3795();
                    this.field6924 = this.field6922.method1292(false, 65);
                    this.field6924.method1449((byte) -112, this.field6918 * 16, 16, var11);
                    break;
                }
                this.field6923.method3783(0);
                this.field6930.method2556(-64);
            }
        }
        this.field6926 = this.field6934 = this.field6931 = null;
        this.field6923 = null;
        this.field6930 = null;
        this.field6927 = null;
    }
}
