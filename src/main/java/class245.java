import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public abstract class class245 implements class649 {

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "Lnd;")
    private class545 field3194 = class705.field9884;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public int field3184;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "Lkt;")
    public class159 field3189;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Lkq;")
    public class594 field3179;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "Z")
    private boolean field3195;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lhl;")
    public class529 field3178;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    private int field3188;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    private int field3191;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "[I")
    public static int[] field3177 = new int[4];

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[FZII)V", line = 3)
    public final void method1466(int arg0, float[] arg1, boolean arg2, int arg3, int arg4) {
        field3187++;
        if (arg0 > 0 && !class143.method891(arg0, 0)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class143.method891(arg3, 0)) {
            int var6 = this.field3189.field2006;
            if (!arg2) {
                int var7 = 0;
                int var8 = arg0 < arg3 ? arg0 : arg3;
                int var9 = arg0 >> 1;
                int var10 = arg3 >> 1;
                float[] var11 = arg1;
                float[] var12 = new float[var9 * var10 * var6];
                while (true) {
                    OpenGL.glTexImage2Df(arg4, var7, this.method1471(0), arg0, arg3, 0, class303.method1814(false, this.field3189), 5126, var11, 0);
                    if (var8 <= 1) {
                        return;
                    }
                    int var13 = arg0 * var6;
                    for (int var14 = 0; var14 < var6; var14++) {
                        int var16 = var14;
                        int var17 = var14;
                        int var18 = var14 + var13;
                        for (int var19 = 0; var19 < var10; var19++) {
                            for (int var20 = 0; var20 < var9; var20++) {
                                float var21 = var11[var17];
                                int var22 = var6 + var17;
                                float var23 = var11[var22] + var21;
                                var17 = var6 + var22;
                                float var24 = var11[var18] + var23;
                                int var25 = var6 + var18;
                                float var26 = var11[var25] + var24;
                                var12[var16] = var26 * 0.25F;
                                var18 = var6 + var25;
                                var16 += var6;
                            }
                            var18 += var13;
                            var17 += var13;
                        }
                    }
                    float[] var15 = var12;
                    var12 = var11;
                    arg0 = var9;
                    arg3 = var10;
                    var11 = var15;
                    var7++;
                    var8 >>= 0x1;
                    var10 >>= 0x1;
                    var9 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)V", line = 102)
    public static void method1467(int arg0) {
        field3177 = null;
        if (arg0 != 0) {
            method1474(-76, -123);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 113)
    public final void method1468(int arg0) {
        field3175++;
        if (arg0 <= 14) {
            return;
        }
        int var2 = this.field3178.method2125(109);
        int var3 = this.field3178.field7197[var2];
        if (this.field3184 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field3184);
            this.field3178.field7197[var2] = this.field3184;
        }
        OpenGL.glBindTexture(this.field3184, this.field3191);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 143)
    private final void method1469(byte arg0) {
        if (arg0 != -75) {
            this.field3195 = false;
        }
        field3190++;
        if (this.field3191 > 0) {
            this.field3178.method2930(-80, this.field3191, this.method1472((byte) -95));
            this.field3191 = 0;
        }
    }

    @OriginalMember(owner = "client!bj", name = "finalize", descriptor = "()V", line = 160)
    protected final void finalize() throws Throwable {
        field3192++;
        this.method1469((byte) -75);
        super.finalize();
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BLnd;)V", line = 172)
    public final void method272(byte arg0, class545 arg1) {
        field3182++;
        if (arg0 == -81 && this.field3194 != arg1) {
            this.field3194 = arg1;
            this.method1476(14093);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([BIIII)V", line = 189)
    public final void method1470(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field3186++;
        if (arg3 > 0 && !class143.method891(arg3, 0)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class143.method891(arg2, 0)) {
            int var6 = this.field3189.field2006;
            int var7 = 0;
            if (arg1 <= 0) {
                this.field3189 = null;
            }
            int var8 = arg3 >= arg2 ? arg2 : arg3;
            int var9 = arg3 >> 1;
            int var10 = arg2 >> 1;
            byte[] var11 = arg0;
            byte[] var12 = new byte[var6 * var10 * var9];
            while (true) {
                OpenGL.glTexImage2Dub(arg4, var7, this.method1471(0), arg3, arg2, 0, class303.method1814(false, this.field3189), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg3 * var6;
                byte[] var14 = var12;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = var15;
                    int var17 = var15;
                    int var18 = var13 + var15;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            byte var21 = var11[var17];
                            int var22 = var6 + var17;
                            int var23 = var11[var22] + var21;
                            int var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            int var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = (byte) (var26 >> 2);
                            var16 += var6;
                        }
                        var17 += var13;
                        var18 += var13;
                    }
                }
                var12 = var11;
                var11 = var14;
                arg3 = var9;
                arg2 = var10;
                var10 >>= 0x1;
                var7++;
                var9 >>= 0x1;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)I", line = 289)
    public final int method1471(int arg0) {
        field3176++;
        if (arg0 != 0) {
            this.method1477(94, (byte) -47);
        }
        if (class594.field8277 == this.field3179) {
            if (class450.field6286 == this.field3189) {
                return 6407;
            }
            if (class758.field10567 == this.field3189) {
                return 6408;
            }
            if (class695.field9710 == this.field3189) {
                return 6406;
            }
            if (class431.field6067 == this.field3189) {
                return 6409;
            }
            if (class423.field5926 == this.field3189) {
                return 6410;
            }
            if (class268.field3544 == this.field3189) {
                return 6145;
            }
        } else if (class594.field8280 == this.field3179) {
            if (class450.field6286 == this.field3189) {
                return 34843;
            }
            if (class758.field10567 == this.field3189) {
                return 34842;
            }
            if (class695.field9710 == this.field3189) {
                return 34844;
            }
            if (class431.field6067 == this.field3189) {
                return 34846;
            }
            if (class423.field5926 == this.field3189) {
                return 34847;
            }
            if (class268.field3544 == this.field3189) {
                return 6145;
            }
        } else if (class594.field8281 == this.field3179) {
            if (class450.field6286 == this.field3189) {
                return 34837;
            }
            if (class758.field10567 == this.field3189) {
                return 34836;
            }
            if (class695.field9710 == this.field3189) {
                return 34838;
            }
            if (class431.field6067 == this.field3189) {
                return 34840;
            }
            if (class423.field5926 == this.field3189) {
                return 34841;
            }
            if (class268.field3544 == this.field3189) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)I", line = 393)
    private final int method1472(byte arg0) {
        field3193++;
        int var2 = 119 % ((-arg0 - 56) / 35);
        int var3 = this.field3189.field2006 * this.field3188 * this.field3179.field8274;
        return this.field3195 ? var3 * 4 / 3 : var3;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lf;B)Ljava/lang/String;", line = 409)
    public static final String method1473(class756 arg0, byte arg1) {
        field3183++;
        if (arg1 <= 11) {
            field3177 = null;
        }
        return arg0.field10550 + " <col=ffffff>>";
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)Lega;", line = 422)
    public static final class711 method1474(int arg0, int arg1) {
        field3181++;
        if (arg1 != 31866) {
            method1474(20, 98);
        }
        class711 var2 = (class711) class194.field2325.method1571(-126, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class38.field396.method2885(arg0, 1, false);
        class711 var4 = new class711();
        var4.field9926 = arg0;
        if (var3 != null) {
            var4.method3985(new class611(var3), arg1 - 14739);
        }
        var4.method3988(arg1 - 31865);
        if (var4.field9924 == 2 && class351.field4692.method2552((long) arg0, -1) == null) {
            class351.field4692.method2558(new class629(class111.field1477), (long) arg0, -1);
            class387.field5467[class111.field1477++] = var4;
        }
        class194.field2325.method1574((long) arg0, var4, (byte) -80);
        return var4;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[IIII)V", line = 457)
    public final void method1475(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field3196++;
        if (arg0 > 0 && !class143.method891(arg0, 0)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class143.method891(arg2, 0)) {
            throw new IllegalArgumentException("");
        } else if (class758.field10567 == this.field3189) {
            int var6 = 0;
            int var7 = arg0 < arg2 ? arg0 : arg2;
            int var8 = arg0 >> 1;
            int var9 = arg2 >> 1;
            if (arg3 != 526364520) {
                this.method1475(-17, null, 58, 71, 102);
            }
            int[] var10 = arg1;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg4, var6, this.method1471(0), arg0, arg2, 0, 32993, this.field3178.field7193, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg0 + var13;
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var13++];
                        int var20 = var10[var14++];
                        int var21 = var18 >> 8 & 0xFF;
                        int var22 = var18 & 0xFF;
                        int var23 = var18 >> 16 & 0xFF;
                        int var24 = var18 >> 24 & 0xFF;
                        int var25 = var10[var14++];
                        int var26 = ((var19 & 0xFF9127) >> 16) + var23;
                        int var27 = (var19 >> 8 & 0xFF) + var21;
                        int var28 = (var19 >> 24 & 0xFF) + var24;
                        int var29 = (var19 & 0xFF) + var22;
                        int var30 = (var20 & 0xFF) + var29;
                        int var31 = (var20 >> 8 & 0xFF) + var27;
                        int var32 = (var20 >> 24 & 0xFF) + var28;
                        int var33 = ((var20 & 0xFF9E4B) >> 16) + var26;
                        int var34 = (var25 & 0xFF) + var30;
                        int var35 = ((var25 & 0xFF51) >> 8) + var31;
                        int var36 = (var25 >> 24 & 0xFF) + var32;
                        int var37 = (var25 >> 16 & 0xFF) + var33;
                        var11[var12++] = class344.method2020(class321.method1919(1020, var34) >> 2, class344.method2020(class344.method2020(class321.method1919(1020, var36) << 22, class321.method1919(1020, var37) << 14), class321.method1919(1020, var35) << 6));
                    }
                    var13 += arg0;
                    var14 += arg0;
                }
                int[] var16 = var11;
                var11 = var10;
                arg0 = var8;
                arg2 = var9;
                var10 = var16;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var7 >>= 0x1;
                var6++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "(I)V", line = 564)
    private final void method1476(int arg0) {
        this.field3178.method2148(this, -122);
        field3185++;
        if (arg0 != 14093) {
            return;
        }
        if (class705.field9884 == this.field3194) {
            OpenGL.glTexParameteri(this.field3184, 10241, this.field3195 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field3184, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field3184, 10241, this.field3195 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field3184, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lhl;ILkt;Lkq;IZ)V", line = 592)
    public class245(class529 arg0, int arg1, class159 arg2, class594 arg3, int arg4, boolean arg5) {
        this.field3184 = arg1;
        this.field3189 = arg2;
        this.field3179 = arg3;
        this.field3195 = arg5;
        this.field3178 = arg0;
        this.field3188 = arg4;
        OpenGL.glGenTextures(1, class163.field2046, 0);
        this.field3191 = class163.field2046[0];
        this.method1476(14093);
        this.method1477(0, (byte) 123);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)V", line = 611)
    private final void method1477(int arg0, byte arg1) {
        if (arg1 <= 107) {
            this.field3179 = null;
        }
        field3180++;
        this.field3178.field5032 -= arg0;
        this.field3178.field5032 += this.method1472((byte) -91);
    }
}
