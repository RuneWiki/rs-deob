import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class450 extends class168 {

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "Llaa;")
    private class123 field5970;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "Led;")
    private class707 field5960;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Lbi;")
    private class483 field5948;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    private int field5961;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    private int field5962;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    private int field5968;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    private int field5964;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "[[F")
    private float[][] field5949;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "[[F")
    private float[][] field5967;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "[[F")
    private float[][] field5965;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    private int field5959;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "Lsl;")
    private class461 field5966;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "Lfm;")
    private class736 field5963;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "Ltba;")
    private class165 field5951;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "Lg;")
    private class158 field5957;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "Lju;")
    private class128 field5969;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Luo;")
    private class578 field5954;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "Luo;")
    private class578 field5972;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "Lde;")
    public static class534 field5950 = new class534(8);

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    private int field5947;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "Liea;")
    public static class481 field5958;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III[[ZI)V", line = 18)
    public final void method2531(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
        field5955++;
        if (arg2 != 15229 || this.field5957 == null || this.field5961 > (arg0 + arg4) || this.field5962 < (arg0 - arg4) || arg1 + arg4 < this.field5968 || arg1 - arg4 > this.field5964) {
            return;
        }
        for (int var6 = this.field5968; var6 <= this.field5964; var6++) {
            for (int var7 = this.field5961; var7 <= this.field5962; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg1;
                if (var8 > (-arg4) && var8 < arg4 && var9 > -arg4 && arg4 > var9 && arg3[arg4 + var8][var9 + arg4]) {
                    this.field5948.method2822(arg2 ^ 0xFF3B7D, (int) (this.field5970.method939(-11214) * 255.0F) << 24);
                    this.field5948.method2821((byte) -48, null, this.field5954, this.field5972, null);
                    this.field5948.method2854(4, 0, this.field5959, this.field5957, (byte) -85);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V", line = 76)
    public static void method2532(boolean arg0) {
        field5950 = null;
        if (arg0) {
            field5958 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 91)
    public static final void method2533(int arg0) {
        class214.field2842.method3065(true);
        field5956++;
        if (arg0 != -27374) {
            method2532(true);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZIIIIII)V", line = 110)
    private final void method2534(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5952++;
        long var8 = -1L;
        int var10 = (arg1 << this.field5960.field3550) + arg6;
        int var11 = (arg5 << this.field5960.field3550) + arg2;
        int var12 = this.field5960.method1676(var10, arg0, var11);
        if ((arg6 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class168 var13 = this.field5951.method1160(var8, 119);
            if (var13 != null) {
                this.method2535((byte) -47, ((class273) var13).field3422);
                return;
            }
        }
        short var14 = (short) (this.field5947++);
        if (var8 != -1L) {
            this.field5951.method1153(new class273(var14), var8, -1);
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg2 == 0) {
            var15 = this.field5949[arg4][arg3];
            var16 = this.field5965[arg4][arg3];
            var17 = this.field5967[arg4][arg3];
        } else if (this.field5960.field3557 == arg6 && arg2 == 0) {
            var17 = this.field5967[arg4 + 1][arg3];
            var16 = this.field5965[arg4 + 1][arg3];
            var15 = this.field5949[arg4 + 1][arg3];
        } else if (this.field5960.field3557 == arg6 && this.field5960.field3557 == arg2) {
            var17 = this.field5967[arg4 + 1][arg3 + 1];
            var15 = this.field5949[arg4 + 1][arg3 + 1];
            var16 = this.field5965[arg4 + 1][arg3 + 1];
        } else if (arg6 == 0 && this.field5960.field3557 == arg2) {
            var17 = this.field5967[arg4][arg3 + 1];
            var16 = this.field5965[arg4][arg3 + 1];
            var15 = this.field5949[arg4][arg3 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field5960.field3557;
            float var19 = (float) arg2 / (float) this.field5960.field3557;
            float var20 = this.field5949[arg4][arg3];
            float var21 = this.field5965[arg4][arg3];
            float var22 = this.field5967[arg4][arg3];
            float var23 = this.field5949[arg4 + 1][arg3];
            float var24 = this.field5965[arg4 + 1][arg3];
            float var25 = (this.field5967[arg4][arg3 + 1] - var22) * var18 + var22;
            float var26 = (this.field5965[arg4][arg3 + 1] - var21) * var18 + var21;
            float var27 = (this.field5949[arg4][arg3 + 1] - var20) * var18 + var20;
            float var28 = (this.field5949[arg4 + 1][arg3 + 1] - var23) * var18 + var23;
            float var29 = this.field5967[arg4 + 1][arg3];
            float var30 = (this.field5965[arg4 + 1][arg3 + 1] - var24) * var18 + var24;
            float var31 = (this.field5967[arg4 + 1][arg3 + 1] - var29) * var18 + var29;
            var15 = (var28 - var27) * var19 + var27;
            var16 = (var30 - var26) * var19 + var26;
            var17 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field5970.method932(-16562) - var10);
        float var33 = (float) (this.field5970.method937(113) - var12);
        float var34 = (float) (this.field5970.method938(0) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field5970.method935(0);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var39 + var15 * var37 + var16 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field5970.method934((byte) -114);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field5948.field6903) {
            this.field5963.method4102((float) var10, (byte) -56);
            this.field5963.method4102((float) var12, (byte) -56);
            this.field5963.method4102((float) var11, (byte) -56);
        } else {
            this.field5963.method4104(1482486504, (float) var10);
            this.field5963.method4104(1482486504, (float) var12);
            this.field5963.method4104(1482486504, (float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field5963.method2578(var45, -1221492240);
        this.field5963.method2578(var46, -1221492240);
        this.field5963.method2578(var47, -1221492240);
        this.field5963.method2578(255, -1221492240);
        this.method2535((byte) -41, var14);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BS)V", line = 277)
    private final void method2535(byte arg0, short arg1) {
        if (arg0 > -16) {
            this.field5965 = null;
        }
        if (this.field5948.field6903) {
            this.field5966.method2620(arg1, false);
        } else {
            this.field5966.method2619(arg1, -1);
        }
        field5971++;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lbi;Led;Llaa;[I)V", line = 294)
    public class450(class483 arg0, class707 arg1, class123 arg2, int[] arg3) {
        this.field5970 = arg2;
        this.field5960 = arg1;
        this.field5948 = arg0;
        int var5 = this.field5970.method935(0) - (arg1.field3557 >> 1);
        this.field5961 = this.field5970.method932(-16562) - var5 >> arg1.field3550;
        this.field5962 = var5 + this.field5970.method932(-16562) >> arg1.field3550;
        this.field5968 = this.field5970.method938(0) - var5 >> arg1.field3550;
        this.field5964 = var5 + this.field5970.method938(0) >> arg1.field3550;
        int var6 = this.field5962 + 1 - this.field5961;
        int var7 = this.field5964 + 1 - this.field5968;
        this.field5949 = new float[var6 + 1][var7 + 1];
        this.field5967 = new float[var6 + 1][var7 + 1];
        this.field5965 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field5968 + var8;
            if (var25 > 0 && var25 < (this.field5960.field3555 - 1)) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field5961 + var26;
                    if (var27 > 0 && var27 < this.field5960.field3561 - 1) {
                        int var28 = arg1.method1677(var25, (byte) 57, var27 + 1) - arg1.method1677(var25, (byte) 73, var27 - 1);
                        int var29 = arg1.method1677(var25 + 1, (byte) 104, var27) - arg1.method1677(var25 - 1, (byte) 46, var27);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + var28 * var28 + 65536)));
                        this.field5949[var26][var8] = (float) var28 * var30;
                        this.field5965[var26][var8] = var30 * -256.0F;
                        this.field5967[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field5968; var10 <= this.field5964; var10++) {
            if (var10 >= 0 && arg1.field3555 > var10) {
                for (int var21 = this.field5961; var21 <= this.field5962; var21++) {
                    if (var21 >= 0 && arg1.field3561 > var21) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field9811[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var23.length > var24) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field5959 += 3;
                                    }
                                }
                            } else {
                                this.field5959 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field5962 - this.field5961;
            }
        }
        if (this.field5959 > 0) {
            this.field5966 = new class461(this.field5959 * 2);
            this.field5963 = new class736(this.field5959 * 16);
            this.field5951 = new class165(class565.method3253(127, this.field5959));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field5968; var13 <= this.field5964; var13++) {
                if (var13 >= 0 && var13 < arg1.field3555) {
                    int var14 = 0;
                    for (int var15 = this.field5961; var15 <= this.field5962; var15++) {
                        if (var15 >= 0 && arg1.field3561 > var15) {
                            int var16 = arg3[var12];
                            int[] var17 = arg1.field9811[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field9787[var15][var13];
                                    int[] var19 = arg1.field9808[var15][var13];
                                    int var20 = 0;
                                    label110: while (true) {
                                        while (true) {
                                            if (var17.length <= var20) {
                                                break label110;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method2534(true, var15, var19[var20], var11, var14, var13, var18[var20]);
                                                var20++;
                                                this.method2534(true, var15, var19[var20], var11, var14, var13, var18[var20]);
                                                var20++;
                                                this.method2534(true, var15, var19[var20], var11, var14, var13, var18[var20]);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method2534(true, var15, 0, var11, var14, var13, 0);
                                    this.method2534(true, var15, 0, var11, var14, var13, arg1.field3557);
                                    this.method2534(true, var15, arg1.field3557, var11, var14, var13, 0);
                                } else if (var16 == 2) {
                                    this.method2534(true, var15, 0, var11, var14, var13, arg1.field3557);
                                    this.method2534(true, var15, arg1.field3557, var11, var14, var13, arg1.field3557);
                                    this.method2534(true, var15, 0, var11, var14, var13, 0);
                                } else if (var16 == 5) {
                                    this.method2534(true, var15, arg1.field3557, var11, var14, var13, arg1.field3557);
                                    this.method2534(true, var15, arg1.field3557, var11, var14, var13, 0);
                                    this.method2534(true, var15, 0, var11, var14, var13, arg1.field3557);
                                } else if (var16 == 4) {
                                    this.method2534(true, var15, arg1.field3557, var11, var14, var13, 0);
                                    this.method2534(true, var15, 0, var11, var14, var13, 0);
                                    this.method2534(true, var15, arg1.field3557, var11, var14, var13, arg1.field3557);
                                }
                            }
                        }
                        var14++;
                        var12++;
                    }
                } else {
                    var12 += this.field5962 - this.field5961;
                }
                var11++;
            }
            this.field5957 = this.field5948.method2774(-115, this.field5966.field6193, false, this.field5966.field6180, 5123);
            this.field5969 = this.field5948.method2814(61, this.field5963.field6180, false, this.field5963.field6193, 16);
            this.field5954 = new class578(this.field5969, 5126, 3, 0);
            this.field5972 = new class578(this.field5969, 5121, 4, 12);
        } else {
            this.field5972 = null;
            this.field5957 = null;
            this.field5954 = null;
            this.field5969 = null;
        }
        this.field5951 = null;
        this.field5963 = null;
        this.field5966 = null;
        this.field5949 = this.field5965 = this.field5967 = null;
    }
}
