import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class17 implements class152 {

    @OriginalMember(owner = "client!n", name = "q", descriptor = "Ldca;")
    private class161 field296 = class379.field5910;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public int field292;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Lbea;")
    public class205 field300;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "Lmg;")
    public class134 field298;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Z")
    private boolean field286;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Los;")
    public class408 field285;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field295 = -1;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "Lhga;")
    public static class158 field302;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Lwb;")
    public static class303 field282;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "[[I")
    public static int[][] field280;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ldca;B)V")
    public final void method246(class161 arg0, byte arg1) {
        field291++;
        if (this.field296 != arg0) {
            this.field296 = arg0;
            this.method256(9987);
        }
        int var3 = 75 / ((arg1 - 64) / 39);
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
    public final void method247(int arg0) {
        field301++;
        int var2 = this.field300.method2277(arg0 + 34863);
        int var3 = this.field300.field3442[var2];
        if (this.field292 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field292);
            this.field300.field3442[var2] = this.field292;
        }
        if (arg0 != -4112) {
            field280 = null;
        }
        OpenGL.glBindTexture(this.field292, this.field294);
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(I)I")
    public final int method248(int arg0) {
        if (arg0 != 10241) {
            this.field292 = 24;
        }
        field284++;
        if (class134.field2197 == this.field298) {
            if (class189.field3150 == this.field285) {
                return 6407;
            }
            if (class86.field1055 == this.field285) {
                return 6408;
            }
            if (class203.field3311 == this.field285) {
                return 6406;
            }
            if (class442.field6728 == this.field285) {
                return 6409;
            }
            if (class135.field2205 == this.field285) {
                return 6410;
            }
            if (class436.field6648 == this.field285) {
                return 6145;
            }
        } else if (class134.field2200 == this.field298) {
            if (class189.field3150 == this.field285) {
                return 34843;
            }
            if (class86.field1055 == this.field285) {
                return 34842;
            }
            if (class203.field3311 == this.field285) {
                return 34844;
            }
            if (class442.field6728 == this.field285) {
                return 34846;
            }
            if (class135.field2205 == this.field285) {
                return 34847;
            }
            if (class436.field6648 == this.field285) {
                return 6145;
            }
        } else if (class134.field2201 == this.field298) {
            if (class189.field3150 == this.field285) {
                return 34837;
            }
            if (class86.field1055 == this.field285) {
                return 34836;
            }
            if (class203.field3311 == this.field285) {
                return 34838;
            }
            if (class442.field6728 == this.field285) {
                return 34840;
            }
            if (class135.field2205 == this.field285) {
                return 34841;
            }
            if (class436.field6648 == this.field285) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)V")
    private final void method249(int arg0, byte arg1) {
        field297++;
        this.field300.field5312 -= arg0;
        this.field300.field5312 += this.method250((byte) 117);
        if (arg1 >= -65) {
            field282 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)I")
    private final int method250(byte arg0) {
        if (arg0 <= 90) {
            return 5;
        } else {
            field287++;
            int var2 = this.field285.field6299 * this.field298.field2196 * this.field288;
            return this.field286 ? var2 * 4 / 3 : var2;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([IIIIB)V")
    public final void method251(int[] arg0, int arg1, int arg2, int arg3, byte arg4) {
        field289++;
        if (arg4 != -3) {
            field295 = 6;
        }
        if (arg3 > 0 && !class416.method2649(arg3, true)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class416.method2649(arg2, true)) {
            throw new IllegalArgumentException("");
        } else if (class86.field1055 == this.field285) {
            int var6 = 0;
            int var7 = arg2 > arg3 ? arg3 : arg2;
            int var8 = arg3 >> 1;
            int var9 = arg2 >> 1;
            int[] var10 = arg0;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg1, var6, this.method248(10241), arg3, arg2, 0, 32993, this.field300.field3438, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = var13 + arg3;
                int[] var15 = var11;
                for (int var16 = 0; var16 < var9; var16++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var13++];
                        int var20 = var10[var14++];
                        int var21 = var18 >> 24 & 0xFF;
                        int var22 = (var18 & 0xFF0481) >> 16;
                        int var23 = var18 & 0xFF;
                        int var24 = var10[var14++];
                        int var25 = (var18 & 0xFFC6) >> 8;
                        int var26 = ((var19 & 0xFF7A9F) >> 16) + var22;
                        int var27 = (var19 >> 8 & 0xFF) + var25;
                        int var28 = (var19 & 0xFF) + var23;
                        int var29 = (var19 >> 24 & 0xFF) + var21;
                        int var30 = (var20 >> 16 & 0xFF) + var26;
                        int var31 = (var20 >> 24 & 0xFF) + var29;
                        int var32 = (var20 >> 8 & 0xFF) + var27;
                        int var33 = (var20 & 0xFF) + var28;
                        int var34 = (var24 >> 24 & 0xFF) + var31;
                        int var35 = ((var24 & 0xFF99) >> 8) + var32;
                        int var36 = (var24 & 0xFF) + var33;
                        int var37 = ((var24 & 0xFF0B87) >> 16) + var30;
                        var11[var12++] = class81.method769(class453.method2846(var36 >> 2, 255), class81.method769(class453.method2846(var35 << 6, 65280), class81.method769(class453.method2846(1020, var37) << 14, class453.method2846(1020, var34) << 22)));
                    }
                    var14 += arg3;
                    var13 += arg3;
                }
                var11 = var10;
                arg2 = var9;
                var10 = var15;
                arg3 = var8;
                var6++;
                var8 >>= 0x1;
                var7 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIII)V")
    public static final void method252(int arg0, int arg1, int arg2, int arg3) {
        class252 var4 = class454.field6818[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class180 var5 = var4.field4028;
        class180 var6 = var4.field4023;
        if (var5 != null) {
            var5.field3027 = (short) (var5.field3027 * arg3 / (0x10 << class439.field6699 - 7));
            var5.field3024 = (short) (var5.field3024 * arg3 / (0x10 << class439.field6699 - 7));
        }
        if (var6 != null) {
            var6.field3027 = (short) (var6.field3027 * arg3 / (0x10 << class439.field6699 - 7));
            var6.field3024 = (short) (var6.field3024 * arg3 / (0x10 << class439.field6699 - 7));
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([FIIII)V")
    public final void method253(float[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 58) {
            this.method247(104);
        }
        field293++;
        if (arg3 > 0 && !class416.method2649(arg3, true)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class416.method2649(arg2, true)) {
            int var6 = this.field285.field6299;
            int var7 = 0;
            int var8 = arg3 >= arg2 ? arg2 : arg3;
            int var9 = arg3 >> 1;
            int var10 = arg2 >> 1;
            float[] var11 = arg0;
            float[] var12 = new float[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var7, this.method248(10241), arg3, arg2, 0, class250.method1782((byte) 94, this.field285), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg3 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var14 + var13;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            float var21 = var11[var17];
                            int var22 = var6 + var17;
                            float var23 = var11[var22] + var21;
                            float var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            float var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = var26 * 0.25F;
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                float[] var15 = var12;
                var12 = var11;
                arg3 = var9;
                arg2 = var10;
                var11 = var15;
                var10 >>= 0x1;
                var7++;
                var9 >>= 0x1;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III[BI)V")
    public final void method254(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field283++;
        if (arg1 > 0 && !class416.method2649(arg1, true)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class416.method2649(arg4, true)) {
            int var6 = this.field285.field6299;
            if (arg0 == 34841) {
                int var7 = 0;
                int var8 = arg4 > arg1 ? arg1 : arg4;
                int var9 = arg1 >> 1;
                int var10 = arg4 >> 1;
                byte[] var11 = arg3;
                byte[] var12 = new byte[var9 * var10 * var6];
                while (true) {
                    OpenGL.glTexImage2Dub(arg2, var7, this.method248(10241), arg1, arg4, 0, class250.method1782((byte) 123, this.field285), 5121, var11, 0);
                    if (var8 <= 1) {
                        return;
                    }
                    int var13 = arg1 * var6;
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
                                var12[var16] = (byte) (var26 >> 2);
                                var18 = var6 + var25;
                                var16 += var6;
                            }
                            var18 += var13;
                            var17 += var13;
                        }
                    }
                    var12 = var11;
                    arg4 = var10;
                    arg1 = var9;
                    var11 = var14;
                    var7++;
                    var9 >>= 0x1;
                    var8 >>= 0x1;
                    var10 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
    public static void method255(int arg0) {
        field302 = null;
        if (arg0 == 255) {
            field282 = null;
            field280 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field299++;
        this.method257(29693);
        super.finalize();
    }

    @OriginalMember(owner = "client!n", name = "g", descriptor = "(I)V")
    private final void method256(int arg0) {
        field290++;
        this.field300.method2271(this, 5180);
        if (arg0 != 9987) {
            field282 = null;
        }
        if (class379.field5910 == this.field296) {
            OpenGL.glTexParameteri(this.field292, 10241, this.field286 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field292, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field292, 10241, this.field286 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field292, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!n", name = "h", descriptor = "(I)V")
    private final void method257(int arg0) {
        if (this.field294 > 0) {
            this.field300.method1583(false, this.field294, this.method250((byte) 114));
            this.field294 = 0;
        }
        field281++;
        if (arg0 != 29693) {
            this.method250((byte) 10);
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lbea;ILos;Lmg;IZ)V")
    public class17(class205 arg0, int arg1, class408 arg2, class134 arg3, int arg4, boolean arg5) {
        this.field292 = arg1;
        this.field300 = arg0;
        this.field298 = arg3;
        this.field288 = arg4;
        this.field286 = arg5;
        this.field285 = arg2;
        OpenGL.glGenTextures(1, class38.field524, 0);
        this.field294 = class38.field524[0];
        this.method256(9987);
        this.method249(0, (byte) -123);
    }
}
