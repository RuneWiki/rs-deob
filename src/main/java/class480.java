import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class480 extends class425 {

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "Ltr;")
    private class268 field6902;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "Lcf;")
    private class562 field6894;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "Lff;")
    private class9 field6897;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    private int field6885;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    private int field6890;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    private int field6881;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    private int field6889;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "[[F")
    private float[][] field6898;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "[[F")
    private float[][] field6887;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "[[F")
    private float[][] field6884;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    private int field6882;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "Lor;")
    private class595 field6899;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "Lwl;")
    private class378 field6896;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "Lsl;")
    private class427 field6886;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6892;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6883;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    private int field6888;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "Lsl;")
    public static class427 field6895 = new class427(8);

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "[Z")
    public static boolean[] field6901 = new boolean[100];

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!dn", name = "G", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IS)V")
    private final void method2912(int arg0, short arg1) {
        if (Stream.method3580()) {
            this.field6883.method3575(arg1);
        } else {
            this.field6883.method3583(arg1);
        }
        field6893++;
        if (arg0 != -9576) {
            method2915((byte) -11);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)I")
    public static final int method2913(int arg0, int arg1) {
        field6900++;
        return arg0 == 127 ? arg1 & 0x7F : 87;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "([[ZIIIB)V")
    public final void method2914(boolean[][] arg0, int arg1, int arg2, int arg3, byte arg4) {
        field6891++;
        if (this.field6899 == null || this.field6885 > arg2 + arg3 || arg3 - arg2 > this.field6890 || this.field6881 > (arg1 + arg2) || arg1 - arg2 > this.field6889) {
            return;
        }
        if (arg4 <= 126) {
            this.method2912(60, (short) -112);
        }
        for (int var6 = this.field6881; var6 <= this.field6889; var6++) {
            for (int var7 = this.field6885; var7 <= this.field6890; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg1;
                if (-arg2 < var8 && arg2 > var8 && -arg2 < var9 && var9 < arg2 && arg0[arg2 + var8][var9 + arg2]) {
                    this.field6894.method3244(1405835656, (byte) ((int) (this.field6897.method277(-1) * 255.0F)));
                    this.field6894.method2873(1, 0, this.field6896);
                    this.field6894.method2862(13427, this.field6894.field8211);
                    this.field6894.method2872(class634.field9107, 0, -103, this.field6888, 0, this.field6882 / 3, this.field6899);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
    public static void method2915(byte arg0) {
        field6895 = null;
        field6901 = null;
        int var1 = 69 / ((-arg0 - 29) / 47);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIII)V")
    private final void method2916(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6903++;
        long var8 = -1L;
        int var10 = arg2 + (arg0 << this.field6902.field1038);
        int var11 = (arg6 << this.field6902.field1038) + arg4;
        int var12 = this.field6902.method552(arg5 ^ 0xFFFFFFFE, var10, var11);
        if (~(arg2 & 0x7F) == arg5 || (arg4 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | (long) var11 << 16 & 0xFFFFL << 16;
            class425 var13 = this.field6886.method2596(var8, 96);
            if (var13 != null) {
                this.method2912(-9576, ((class408) var13).field5906);
                return;
            }
        }
        short var14 = (short) (this.field6888++);
        if (var8 != -1L) {
            this.field6886.method2598(new class408(var14), var8, (byte) 8);
        }
        float var15;
        float var16;
        float var17;
        if (arg2 == 0 && arg4 == 0) {
            var15 = this.field6887[arg3][arg1];
            var16 = this.field6884[arg3][arg1];
            var17 = this.field6898[arg3][arg1];
        } else if (this.field6902.field1040 == arg2 && arg4 == 0) {
            var17 = this.field6898[arg3 + 1][arg1];
            var15 = this.field6887[arg3 + 1][arg1];
            var16 = this.field6884[arg3 + 1][arg1];
        } else if (this.field6902.field1040 == arg2 && this.field6902.field1040 == arg4) {
            var16 = this.field6884[arg3 + 1][arg1 + 1];
            var15 = this.field6887[arg3 + 1][arg1 + 1];
            var17 = this.field6898[arg3 + 1][arg1 + 1];
        } else if (arg2 == 0 && this.field6902.field1040 == arg4) {
            var17 = this.field6898[arg3][arg1 + 1];
            var15 = this.field6887[arg3][arg1 + 1];
            var16 = this.field6884[arg3][arg1 + 1];
        } else {
            float var18 = (float) arg2 / (float) this.field6902.field1040;
            float var19 = (float) arg4 / (float) this.field6902.field1040;
            float var20 = this.field6887[arg3][arg1];
            float var21 = this.field6898[arg3][arg1];
            float var22 = this.field6884[arg3][arg1];
            float var23 = this.field6887[arg3 + 1][arg1];
            float var24 = this.field6898[arg3 + 1][arg1];
            float var25 = this.field6884[arg3 + 1][arg1];
            float var26 = (this.field6884[arg3][arg1 + 1] - var22) * var18 + var22;
            float var27 = (this.field6887[arg3][arg1 + 1] - var20) * var18 + var20;
            float var28 = (this.field6887[arg3 + 1][arg1 + 1] - var23) * var18 + var23;
            float var29 = (this.field6898[arg3][arg1 + 1] - var21) * var18 + var21;
            float var30 = (this.field6898[arg3 + 1][arg1 + 1] - var24) * var18 + var24;
            var15 = (var28 - var27) * var19 + var27;
            float var31 = (this.field6884[arg3 + 1][arg1 + 1] - var25) * var18 + var25;
            var17 = (var30 - var29) * var19 + var29;
            var16 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field6897.method276(-1) - var10);
        float var33 = (float) (this.field6897.method273(false) - var12);
        float var34 = (float) (this.field6897.method270(-76) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field6897.method274((byte) 34);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var37 + var15 * var38 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field6897.method269(true);
        int var45 = (int) ((float) ((var44 & 0xFF9B74) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF8E) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method3580()) {
            this.field6892.method3582((float) var10);
            this.field6892.method3582((float) var12);
            this.field6892.method3582((float) var11);
        } else {
            this.field6892.method3584((float) var10);
            this.field6892.method3584((float) var12);
            this.field6892.method3584((float) var11);
        }
        if (this.field6894.field8161 == 0) {
            this.field6892.method3570(var47);
            this.field6892.method3570(var46);
            this.field6892.method3570(var45);
        } else {
            this.field6892.method3570(var45);
            this.field6892.method3570(var46);
            this.field6892.method3570(var47);
        }
        this.field6892.method3570(255);
        this.method2912(-9576, var14);
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lcf;Ltr;Lff;[I)V")
    public class480(class562 arg0, class268 arg1, class9 arg2, int[] arg3) {
        this.field6902 = arg1;
        this.field6894 = arg0;
        this.field6897 = arg2;
        int var5 = this.field6897.method274((byte) 34) - (arg1.field1040 >> 1);
        this.field6885 = this.field6897.method276(-1) - var5 >> arg1.field1038;
        this.field6890 = var5 + this.field6897.method276(-1) >> arg1.field1038;
        this.field6881 = this.field6897.method270(-53) - var5 >> arg1.field1038;
        this.field6889 = var5 + this.field6897.method270(-88) >> arg1.field1038;
        int var6 = this.field6890 + 1 - this.field6885;
        int var7 = this.field6889 + 1 - this.field6881;
        this.field6898 = new float[var6 + 1][var7 + 1];
        this.field6887 = new float[var6 + 1][var7 + 1];
        this.field6884 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = var8 + this.field6881;
            if (var27 > 0 && this.field6902.field1043 - 1 > var27) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field6885 + var28;
                    if (var29 > 0 && this.field6902.field1041 - 1 > var29) {
                        int var30 = arg1.method551(var29 + 1, var27, (byte) -114) - arg1.method551(var29 - 1, var27, (byte) -96);
                        int var31 = arg1.method551(var29, var27 + 1, (byte) -107) - arg1.method551(var29, var27 - 1, (byte) -101);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 - (-(var31 * var31) - 65536))));
                        this.field6887[var28][var8] = (float) var30 * var32;
                        this.field6898[var28][var8] = var32 * -256.0F;
                        this.field6884[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field6881; var10 <= this.field6889; var10++) {
            if (var10 >= 0 && arg1.field1043 > var10) {
                for (int var23 = this.field6885; var23 <= this.field6890; var23++) {
                    if (var23 >= 0 && arg1.field1041 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field3987[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field6882 += 3;
                                    }
                                }
                            } else {
                                this.field6882 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field6890 - this.field6885;
            }
        }
        if (this.field6882 <= 0) {
            this.field6899 = null;
            this.field6896 = null;
        } else {
            this.field6886 = new class427(class455.method2740(-1675135295, this.field6882));
            this.field6899 = this.field6894.method2876(false, 3);
            this.field6899.method380(this.field6882, (byte) -17);
            NativeHeapBuffer var11 = this.field6894.method3246(false, this.field6882 * 16, (byte) 104);
            this.field6892 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field6899.method1188(false, true);
                } while (var12 == null);
                this.field6883 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field6881; var15 <= this.field6889; var15++) {
                    if (var15 >= 0 && var15 < arg1.field1043) {
                        int var16 = 0;
                        for (int var17 = this.field6885; var17 <= this.field6890; var17++) {
                            if (var17 >= 0 && var17 < arg1.field1041) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field3987[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field3958[var17][var15];
                                        int[] var21 = arg1.field3988[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var19.length <= var22) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method2916(var17, var13, var20[var22], var16, var21[var22], -1, var15);
                                                    var22++;
                                                    this.method2916(var17, var13, var20[var22], var16, var21[var22], -1, var15);
                                                    var22++;
                                                    this.method2916(var17, var13, var20[var22], var16, var21[var22], -1, var15);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method2916(var17, var13, 0, var16, 0, -1, var15);
                                        this.method2916(var17, var13, arg1.field1040, var16, 0, -1, var15);
                                        this.method2916(var17, var13, 0, var16, arg1.field1040, -1, var15);
                                    } else if (var18 == 2) {
                                        this.method2916(var17, var13, arg1.field1040, var16, 0, -1, var15);
                                        this.method2916(var17, var13, arg1.field1040, var16, arg1.field1040, -1, var15);
                                        this.method2916(var17, var13, 0, var16, 0, -1, var15);
                                    } else if (var18 == 5) {
                                        this.method2916(var17, var13, arg1.field1040, var16, arg1.field1040, -1, var15);
                                        this.method2916(var17, var13, 0, var16, arg1.field1040, -1, var15);
                                        this.method2916(var17, var13, arg1.field1040, var16, 0, -1, var15);
                                    } else if (var18 == 4) {
                                        this.method2916(var17, var13, 0, var16, arg1.field1040, -1, var15);
                                        this.method2916(var17, var13, 0, var16, 0, -1, var15);
                                        this.method2916(var17, var13, arg1.field1040, var16, arg1.field1040, -1, var15);
                                    }
                                }
                            }
                            var16++;
                            var14++;
                        }
                    } else {
                        var14 += this.field6890 - this.field6885;
                    }
                    var13++;
                }
                this.field6883.method3576();
                if (this.field6899.method1185(true)) {
                    this.field6892.method3576();
                    this.field6896 = this.field6894.method2851(true, false);
                    this.field6896.method2170(16, this.field6888 * 16, var11, -69);
                    break;
                }
                this.field6892.method3571(0);
                this.field6886.method2600((byte) -114);
            }
        }
        this.field6887 = this.field6898 = this.field6884 = null;
        this.field6886 = null;
        this.field6883 = null;
        this.field6892 = null;
    }
}
