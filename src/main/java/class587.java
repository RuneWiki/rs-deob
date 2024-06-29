import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public abstract class class587 implements class445 {

    @OriginalMember(owner = "client!jca", name = "l", descriptor = "Lfj;")
    private class564 field8399 = class241.field3384;

    @OriginalMember(owner = "client!jca", name = "y", descriptor = "Ldk;")
    public class435 field8412;

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "Lpi;")
    public class424 field8393;

    @OriginalMember(owner = "client!jca", name = "z", descriptor = "Lge;")
    public class608 field8413;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    private int field8388;

    @OriginalMember(owner = "client!jca", name = "p", descriptor = "I")
    public int field8403;

    @OriginalMember(owner = "client!jca", name = "i", descriptor = "Z")
    private boolean field8396;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
    private int field8389;

    @OriginalMember(owner = "client!jca", name = "v", descriptor = "[I")
    public static int[] field8409 = new int[2];

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "I")
    public static int field8390;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
    public static int field8391;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!jca", name = "j", descriptor = "I")
    public static int field8397;

    @OriginalMember(owner = "client!jca", name = "k", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!jca", name = "m", descriptor = "I")
    public static int field8400;

    @OriginalMember(owner = "client!jca", name = "n", descriptor = "I")
    public static int field8401;

    @OriginalMember(owner = "client!jca", name = "q", descriptor = "I")
    public static int field8404;

    @OriginalMember(owner = "client!jca", name = "r", descriptor = "I")
    public static int field8405;

    @OriginalMember(owner = "client!jca", name = "s", descriptor = "I")
    public static int field8406;

    @OriginalMember(owner = "client!jca", name = "t", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!jca", name = "u", descriptor = "I")
    public static int field8408;

    @OriginalMember(owner = "client!jca", name = "w", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!jca", name = "x", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!jca", name = "o", descriptor = "Lan;")
    public static class21 field8402;

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "[Lkba;")
    public static class88[] field8394;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
    public final void method1482(int arg0) {
        field8390++;
        if (arg0 != -31490) {
            field8397 = -50;
        }
        int var2 = this.field8393.method2302((byte) 78);
        int var3 = this.field8393.field6025[var2];
        if (this.field8403 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field8403);
            this.field8393.field6025[var2] = this.field8403;
        }
        OpenGL.glBindTexture(this.field8403, this.field8389);
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(III[BI)V")
    public final void method3442(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field8405++;
        if (arg0 > 0 && !class130.method886(1, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class130.method886(1, arg1)) {
            int var6 = this.field8412.field6194;
            int var7 = 0;
            if (arg4 >= -24) {
                this.method3446((byte) 56);
            }
            int var8 = arg1 <= arg0 ? arg1 : arg0;
            int var9 = arg0 >> 1;
            int var10 = arg1 >> 1;
            byte[] var11 = arg3;
            byte[] var12 = new byte[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Dub(arg2, var7, this.method3448(-1), arg0, arg1, 0, class32.method327(this.field8412, (byte) -76), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg0 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var13 + var14;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            byte var21 = var11[var17];
                            int var22 = var6 + var17;
                            int var23 = var11[var22] + var21;
                            var17 = var6 + var22;
                            int var24 = var11[var18] + var23;
                            int var25 = var6 + var18;
                            int var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = (byte) (var26 >> 2);
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                byte[] var15 = var12;
                var12 = var11;
                arg0 = var9;
                arg1 = var10;
                var11 = var15;
                var7++;
                var8 >>= 0x1;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "(I)V")
    public static void method3443(int arg0) {
        field8394 = null;
        field8409 = null;
        field8402 = null;
        if (arg0 != -1) {
            field8394 = null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZZIII)I")
    public static final int method3444(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field8407++;
        if (arg3 != -11716) {
            return 16;
        }
        class133 var5 = class568.method3229(arg2, (byte) -88, arg0);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field2115.length; var7++) {
            if (var5.field2115[var7] >= 0 && var5.field2115[var7] < class181.field2574.field2017) {
                class621 var8 = class181.field2574.method866(var5.field2115[var7], (byte) 79);
                int var9 = var8.method3628(arg4, (byte) -61, class533.field7455.method3115(128, arg4).field323);
                if (arg1) {
                    var6 += var5.field2116[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)V")
    private final void method3445(int arg0, int arg1) {
        this.field8393.field5376 -= arg1;
        field8391++;
        if (arg0 != 0) {
            field8409 = null;
        }
        this.field8393.field5376 += this.method3449((byte) -85);
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZLfj;)V")
    public final void method1483(boolean arg0, class564 arg1) {
        if (arg0) {
            return;
        }
        if (this.field8399 != arg1) {
            this.field8399 = arg1;
            this.method3446((byte) -41);
        }
        field8395++;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)V")
    private final void method3446(byte arg0) {
        field8400++;
        this.field8393.method2267(arg0 ^ 0xFFFFFFD5, this);
        if (arg0 != -41) {
            this.method3445(-88, -108);
        }
        if (class241.field3384 == this.field8399) {
            OpenGL.glTexParameteri(this.field8403, 10241, this.field8396 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field8403, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field8403, 10241, this.field8396 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field8403, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(II)Z")
    public static final boolean method3447(int arg0, int arg1) {
        field8401++;
        if (arg1 == -28130) {
            return arg0 == 9 || arg0 == 10 || arg0 == 11;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "(I)I")
    public final int method3448(int arg0) {
        field8411++;
        if (arg0 != -1) {
            return 81;
        }
        if (class608.field8759 == this.field8413) {
            if (class351.field4715 == this.field8412) {
                return 6407;
            }
            if (class49.field958 == this.field8412) {
                return 6408;
            }
            if (class519.field7310 == this.field8412) {
                return 6406;
            }
            if (class571.field7865 == this.field8412) {
                return 6409;
            }
            if (class75.field1196 == this.field8412) {
                return 6410;
            }
            if (class25.field453 == this.field8412) {
                return 6145;
            }
        } else if (class608.field8762 == this.field8413) {
            if (class351.field4715 == this.field8412) {
                return 34843;
            }
            if (class49.field958 == this.field8412) {
                return 34842;
            }
            if (class519.field7310 == this.field8412) {
                return 34844;
            }
            if (class571.field7865 == this.field8412) {
                return 34846;
            }
            if (class75.field1196 == this.field8412) {
                return 34847;
            }
            if (class25.field453 == this.field8412) {
                return 6145;
            }
        } else if (class608.field8763 == this.field8413) {
            if (class351.field4715 == this.field8412) {
                return 34837;
            }
            if (class49.field958 == this.field8412) {
                return 34836;
            }
            if (class519.field7310 == this.field8412) {
                return 34838;
            }
            if (class571.field7865 == this.field8412) {
                return 34840;
            }
            if (class75.field1196 == this.field8412) {
                return 34841;
            }
            if (class25.field453 == this.field8412) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(B)I")
    private final int method3449(byte arg0) {
        field8408++;
        if (arg0 >= -78) {
            return -98;
        } else {
            int var2 = this.field8413.field8755 * this.field8388 * this.field8412.field6194;
            return this.field8396 ? var2 * 4 / 3 : var2;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "([IIBII)V")
    public final void method3450(int[] arg0, int arg1, byte arg2, int arg3, int arg4) {
        field8406++;
        if (arg4 > 0 && !class130.method886(1, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg1 > 0 && !class130.method886(1, arg1)) {
            throw new IllegalArgumentException("");
        } else if (class49.field958 == this.field8412) {
            int var6 = 0;
            int var7 = -56 % ((7 - arg2) / 45);
            int var8 = arg1 <= arg4 ? arg1 : arg4;
            int var9 = arg4 >> 1;
            int var10 = arg1 >> 1;
            int[] var11 = arg0;
            int[] var12 = new int[var9 * var10];
            while (true) {
                OpenGL.glTexImage2Di(arg3, var6, this.method3448(-1), arg4, arg1, 0, 32993, this.field8393.field6024, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = 0;
                int var14 = 0;
                int var15 = var14 + arg4;
                int[] var16 = var12;
                for (int var17 = 0; var17 < var10; var17++) {
                    for (int var18 = 0; var18 < var9; var18++) {
                        int var19 = var11[var14++];
                        int var20 = var11[var14++];
                        int var21 = var11[var15++];
                        int var22 = var19 & 0xFF;
                        int var23 = var19 >> 8 & 0xFF;
                        int var24 = var19 >> 24 & 0xFF;
                        int var25 = var11[var15++];
                        int var26 = (var19 & 0xFFE4D8) >> 16;
                        int var27 = (var20 >> 24 & 0xFF) + var24;
                        int var28 = (var20 >> 16 & 0xFF) + var26;
                        int var29 = (var20 >> 8 & 0xFF) + var23;
                        int var30 = (var20 & 0xFF) + var22;
                        int var31 = (var21 & 0xFF) + var30;
                        int var32 = (var21 >> 16 & 0xFF) + var28;
                        int var33 = ((var21 & 0xFF63) >> 8) + var29;
                        int var34 = (var21 >> 24 & 0xFF) + var27;
                        int var35 = (var25 & 0xFF) + var31;
                        int var36 = (var25 >> 24 & 0xFF) + var34;
                        int var37 = ((var25 & 0xFF36) >> 8) + var33;
                        int var38 = (var25 >> 16 & 0xFF) + var32;
                        var12[var13++] = class73.method578(class73.method578(class589.method3454(65280, var37 << 6), class73.method578(class589.method3454(16711680, var38 << 14), class589.method3454(1020, var36) << 22)), class589.method3454(var35 >> 2, 255));
                    }
                    var14 += arg4;
                    var15 += arg4;
                }
                var12 = var11;
                arg1 = var10;
                arg4 = var9;
                var11 = var16;
                var6++;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jca", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field8392++;
        this.method3451((byte) 10);
        super.finalize();
    }

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(B)V")
    private final void method3451(byte arg0) {
        if (this.field8389 > 0) {
            this.field8393.method2526(this.method3449((byte) -108), this.field8389, false);
            this.field8389 = 0;
        }
        field8404++;
        if (arg0 != 10) {
            field8397 = -68;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIII[F)V")
    public final void method3452(int arg0, int arg1, int arg2, int arg3, float[] arg4) {
        field8398++;
        int var6 = -52 / ((-arg2 - 29) / 55);
        if (arg3 > 0 && !class130.method886(1, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class130.method886(1, arg0)) {
            int var7 = this.field8412.field6194;
            int var8 = 0;
            int var9 = arg0 <= arg3 ? arg0 : arg3;
            int var10 = arg3 >> 1;
            int var11 = arg0 >> 1;
            float[] var12 = arg4;
            float[] var13 = new float[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg1, var8, this.method3448(-1), arg3, arg0, 0, class32.method327(this.field8412, (byte) -82), 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg3 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var15 + var14;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                arg3 = var10;
                var12 = var16;
                arg0 = var11;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lpi;ILdk;Lge;IZ)V")
    public class587(class424 arg0, int arg1, class435 arg2, class608 arg3, int arg4, boolean arg5) {
        this.field8412 = arg2;
        this.field8393 = arg0;
        this.field8413 = arg3;
        this.field8388 = arg4;
        this.field8403 = arg1;
        this.field8396 = arg5;
        OpenGL.glGenTextures(1, class325.field4376, 0);
        this.field8389 = class325.field4376[0];
        this.method3446((byte) -41);
        this.method3445(0, 0);
    }
}
