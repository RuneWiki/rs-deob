import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class445 implements class689 {

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lkk;")
    private class238 field6469 = class264.field3448;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lwu;")
    public class149 field6458;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Lbk;")
    public class106 field6473;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public int field6467;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Z")
    private boolean field6471;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "Lkd;")
    public class700 field6476;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    private int field6472;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    private int field6470;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "F")
    public static float field6468 = 1.0F;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lvg;")
    public static class622 field6459 = new class622(97, 4);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public final void method1213(int arg0) {
        field6474++;
        int var2 = this.field6476.method3000((byte) 114);
        int var3 = this.field6476.field9952[var2];
        if (arg0 <= 23) {
            this.method1213(-50);
        }
        if (this.field6467 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field6467);
            this.field6476.field9952[var2] = this.field6467;
        }
        OpenGL.glBindTexture(this.field6467, this.field6470);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lha;III[Z)Z")
    public static final boolean method2628(class425 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class383.field5753 != class178.field2480) {
            int var6 = class262.field3404[arg1].method3824(arg2, 116, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class682 var8 = class262.field3404[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method3824(arg2, 124, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method2176(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method2173(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
    private final void method2629(int arg0) {
        field6456++;
        this.field6476.method3011(-127, this);
        if (class264.field3448 == this.field6469) {
            OpenGL.glTexParameteri(this.field6467, 10241, this.field6471 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field6467, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field6467, 10241, this.field6471 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field6467, 10240, 9728);
        }
        if (arg0 != -27029) {
            this.method2636((byte) -106);
        }
    }

    @OriginalMember(owner = "client!kb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6461++;
        this.method2636((byte) 112);
        super.finalize();
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lkk;I)V")
    public final void method1215(class238 arg0, int arg1) {
        field6475++;
        if (this.field6469 != arg0) {
            this.field6469 = arg0;
            this.method2629(-27029);
        }
        if (arg1 != 19759) {
            this.field6473 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)I")
    public final int method2630(int arg0) {
        if (arg0 != 9536) {
            method2628(null, 116, 7, -1, null);
        }
        field6460++;
        if (class106.field1573 == this.field6473) {
            if (class348.field5157 == this.field6458) {
                return 6407;
            }
            if (class564.field8245 == this.field6458) {
                return 6408;
            }
            if (class592.field8601 == this.field6458) {
                return 6406;
            }
            if (class145.field2081 == this.field6458) {
                return 6409;
            }
            if (class579.field8409 == this.field6458) {
                return 6410;
            }
            if (class545.field8041 == this.field6458) {
                return 6145;
            }
        } else if (class106.field1576 == this.field6473) {
            if (class348.field5157 == this.field6458) {
                return 34843;
            }
            if (class564.field8245 == this.field6458) {
                return 34842;
            }
            if (class592.field8601 == this.field6458) {
                return 34844;
            }
            if (class145.field2081 == this.field6458) {
                return 34846;
            }
            if (class579.field8409 == this.field6458) {
                return 34847;
            }
            if (class545.field8041 == this.field6458) {
                return 6145;
            }
        } else if (class106.field1577 == this.field6473) {
            if (class348.field5157 == this.field6458) {
                return 34837;
            }
            if (class564.field8245 == this.field6458) {
                return 34836;
            }
            if (class592.field8601 == this.field6458) {
                return 34838;
            }
            if (class145.field2081 == this.field6458) {
                return 34840;
            }
            if (class579.field8409 == this.field6458) {
                return 34841;
            }
            if (class545.field8041 == this.field6458) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)V")
    private final void method2631(boolean arg0, int arg1) {
        field6466++;
        if (!arg0) {
            method2628(null, 50, 50, -29, null);
        }
        this.field6476.field7660 -= arg1;
        this.field6476.field7660 += this.method2634((byte) 49);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[FZII)V")
    public final void method2632(int arg0, float[] arg1, boolean arg2, int arg3, int arg4) {
        field6463++;
        if (arg0 > 0 && !class346.method2145(-1, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class346.method2145(-1, arg3)) {
            int var6 = this.field6458.field2109;
            int var7 = 0;
            if (!arg2) {
                int var8 = arg3 <= arg0 ? arg3 : arg0;
                int var9 = arg0 >> 1;
                int var10 = arg3 >> 1;
                float[] var11 = arg1;
                float[] var12 = new float[var9 * var10 * var6];
                while (true) {
                    OpenGL.glTexImage2Df(arg4, var7, this.method2630(9536), arg0, arg3, 0, class362.method2224(this.field6458, 6406), 5126, var11, 0);
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
                                float var21 = var11[var17];
                                int var22 = var6 + var17;
                                float var23 = var11[var22] + var21;
                                float var24 = var11[var18] + var23;
                                var17 = var6 + var22;
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
                    arg3 = var10;
                    arg0 = var9;
                    var11 = var15;
                    var10 >>= 0x1;
                    var8 >>= 0x1;
                    var9 >>= 0x1;
                    var7++;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V")
    public static void method2633(int arg0) {
        field6459 = null;
        if (arg0 != 1) {
            method2628(null, -31, -116, -104, null);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)I")
    private final int method2634(byte arg0) {
        field6462++;
        int var2 = this.field6458.field2109 * this.field6473.field1564 * this.field6472;
        int var3 = 12 % ((arg0 + 39) / 50);
        return this.field6471 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BIII)V")
    public final void method2635(int arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field6464++;
        if (arg0 > 0 && !class346.method2145(arg4 ^ 0xFFFFFFFE, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class346.method2145(arg4 ^ 0xFFFFFFFE, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg4 == 1) {
            int var6 = this.field6458.field2109;
            int var7 = 0;
            int var8 = arg2 > arg0 ? arg0 : arg2;
            int var9 = arg0 >> 1;
            int var10 = arg2 >> 1;
            byte[] var11 = arg1;
            byte[] var12 = new byte[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Dub(arg3, var7, this.method2630(9536), arg0, arg2, 0, class362.method2224(this.field6458, 6406), 5121, var11, 0);
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
                            var12[var16] = (byte) (var26 >> 2);
                            var18 = var6 + var25;
                            var16 += var6;
                        }
                        var17 += var13;
                        var18 += var13;
                    }
                }
                byte[] var15 = var12;
                var12 = var11;
                arg2 = var10;
                arg0 = var9;
                var11 = var15;
                var10 >>= 0x1;
                var8 >>= 0x1;
                var7++;
                var9 >>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
    private final void method2636(byte arg0) {
        field6457++;
        if (arg0 <= 39) {
            this.method1215(null, -22);
        }
        if (this.field6470 > 0) {
            this.field6476.method3928(-15, this.field6470, this.method2634((byte) -109));
            this.field6470 = 0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lkd;ILwu;Lbk;IZ)V")
    public class445(class700 arg0, int arg1, class149 arg2, class106 arg3, int arg4, boolean arg5) {
        this.field6458 = arg2;
        this.field6473 = arg3;
        this.field6467 = arg1;
        this.field6471 = arg5;
        this.field6476 = arg0;
        this.field6472 = arg4;
        OpenGL.glGenTextures(1, class244.field3237, 0);
        this.field6470 = class244.field3237[0];
        this.method2629(-27029);
        this.method2631(true, 0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([IIIII)V")
    public final void method2637(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field6465++;
        if (arg2 > 0 && !class346.method2145(-1, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg3 > 0 && !class346.method2145(arg4 - 256, arg3)) {
            throw new IllegalArgumentException("");
        } else if (class564.field8245 == this.field6458) {
            int var6 = 0;
            if (arg4 != 255) {
                this.field6469 = null;
            }
            int var7 = arg2 >= arg3 ? arg3 : arg2;
            int var8 = arg2 >> 1;
            int var9 = arg3 >> 1;
            int[] var10 = arg0;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg1, var6, this.method2630(9536), arg2, arg3, 0, 32993, this.field6476.field9954, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg2 + var13;
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var14++];
                        int var20 = var10[var13++];
                        int var21 = var18 >> 16 & 0xFF;
                        int var22 = var10[var14++];
                        int var23 = (var18 & 0xFFD9) >> 8;
                        int var24 = var18 & 0xFF;
                        int var25 = var18 >> 24 & 0xFF;
                        int var26 = (var20 >> 24 & 0xFF) + var25;
                        int var27 = ((var20 & 0xFF15C1) >> 16) + var21;
                        int var28 = (var20 & 0xFF) + var24;
                        int var29 = (var20 >> 8 & 0xFF) + var23;
                        int var30 = (var19 >> 24 & 0xFF) + var26;
                        int var31 = (var19 & 0xFF) + var28;
                        int var32 = ((var19 & 0xFFB3C7) >> 16) + var27;
                        int var33 = ((var19 & 0xFF39) >> 8) + var29;
                        int var34 = ((var22 & 0xFF60) >> 8) + var33;
                        int var35 = (var22 & 0xFF) + var31;
                        int var36 = (var22 >> 24 & 0xFF) + var30;
                        int var37 = ((var22 & 0xFF1549) >> 16) + var32;
                        var11[var12++] = class151.method1076(class425.method2563(255, var35 >> 2), class151.method1076(class425.method2563(var34, 1020) << 6, class151.method1076(class425.method2563(1020, var36) << 22, class425.method2563(16711680, var37 << 14))));
                    }
                    var14 += arg2;
                    var13 += arg2;
                }
                int[] var16 = var11;
                var11 = var10;
                var10 = var16;
                arg2 = var8;
                arg3 = var9;
                var9 >>= 0x1;
                var7 >>= 0x1;
                var6++;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
