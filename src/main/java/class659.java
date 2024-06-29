import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public abstract class class659 implements class644 {

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "Lfw;")
    private class52 field9353 = class151.field1872;

    @OriginalMember(owner = "client!mga", name = "x", descriptor = "Lfca;")
    public class75 field9372;

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "Ldda;")
    public class349 field9354;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "I")
    private int field9352;

    @OriginalMember(owner = "client!mga", name = "u", descriptor = "Lbv;")
    public class279 field9369;

    @OriginalMember(owner = "client!mga", name = "l", descriptor = "Z")
    private boolean field9360;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
    public int field9349;

    @OriginalMember(owner = "client!mga", name = "q", descriptor = "I")
    private int field9365;

    @OriginalMember(owner = "client!mga", name = "v", descriptor = "Lmq;")
    public static class472 field9370 = new class472(64);

    @OriginalMember(owner = "client!mga", name = "w", descriptor = "Lsq;")
    public static class161 field9371 = new class161(2, 2);

    @OriginalMember(owner = "client!mga", name = "y", descriptor = "Z")
    public static boolean field9373 = false;

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
    public static int field9350;

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
    public static int field9351;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "I")
    public static int field9355;

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
    public static int field9356;

    @OriginalMember(owner = "client!mga", name = "i", descriptor = "I")
    public static int field9357;

    @OriginalMember(owner = "client!mga", name = "j", descriptor = "I")
    public static int field9358;

    @OriginalMember(owner = "client!mga", name = "k", descriptor = "I")
    public static int field9359;

    @OriginalMember(owner = "client!mga", name = "m", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!mga", name = "n", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!mga", name = "o", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!mga", name = "p", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!mga", name = "r", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!mga", name = "s", descriptor = "I")
    public static int field9367;

    @OriginalMember(owner = "client!mga", name = "t", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(II)V", line = 4)
    private final void method3728(int arg0, int arg1) {
        this.field9354.field5426 -= arg1;
        if (arg0 <= 34) {
            this.method1701(-87);
        }
        field9362++;
        this.field9354.field5426 += this.method3734(39);
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(ILfw;)V", line = 16)
    public final void method798(int arg0, class52 arg1) {
        field9366++;
        if (this.field9353 != arg1) {
            this.field9353 = arg1;
            this.method3731(-16322);
        }
        if (arg0 != -13883) {
            this.field9349 = 118;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(ZILrda;)V", line = 33)
    public static final void method3729(boolean arg0, int arg1, class613 arg2) {
        field9357++;
        if (class271.field3704 >= 400) {
            return;
        }
        if (class206.field2472 != arg2) {
            if (arg1 < 75) {
                method3729(true, 25, null);
            }
            String var3;
            if (arg2.field8807 == 0) {
                boolean var4 = true;
                if (class206.field2472.field8784 != -1 && arg2.field8784 != -1) {
                    int var5 = class206.field2472.field8802 <= arg2.field8802 ? arg2.field8802 : class206.field2472.field8802;
                    int var6 = class206.field2472.field8784 >= arg2.field8784 ? arg2.field8784 : class206.field2472.field8784;
                    int var7 = var5 * 10 / 100 + var6 + 5;
                    int var8 = class206.field2472.field8802 - arg2.field8802;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var8 > var7) {
                        var4 = false;
                    }
                }
                String var9 = class588.field8518 == class356.field4753 ? class424.field6068.method2561(class370.field4980, 0) : class424.field6066.method2561(class370.field4980, 0);
                if (arg2.field8802 < arg2.field8811) {
                    var3 = arg2.method3521(true, (byte) -116) + (var4 ? class244.method1483(false, arg2.field8802, class206.field2472.field8802) : "<col=ffffff>") + " (" + var9 + arg2.field8802 + "+" + (arg2.field8811 - arg2.field8802) + ")";
                } else {
                    var3 = arg2.method3521(true, (byte) -83) + (var4 ? class244.method1483(false, arg2.field8802, class206.field2472.field8802) : "<col=ffffff>") + " (" + var9 + arg2.field8802 + ")";
                }
            } else if (arg2.field8807 == -1) {
                var3 = arg2.method3521(true, (byte) -87);
            } else {
                var3 = arg2.method3521(true, (byte) -103) + " (" + class424.field6067.method2561(class370.field4980, 0) + arg2.field8807 + ")";
            }
            if (class99.field1336 && !arg0 && (class251.field3440 & 0x8) != 0) {
                class474.field6633++;
                class240.method1471((long) arg2.field2664, -24453, 16, false, -1, class564.field8154, 0, class52.field844, 0, true, class255.field3461 + " -> <col=ffffff>" + var3);
            }
            if (arg0) {
                class240.method1471(0L, -24453, -1, true, 0, -1, 0, "<col=cccccc>" + var3, 0, false, "");
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class664.field9403[var10] != null) {
                        short var11 = 0;
                        if (class668.field9580 == class588.field8518 && class664.field9403[var10].equalsIgnoreCase(class424.field6061.method2561(class370.field4980, 0))) {
                            if (class206.field2472.field8802 < arg2.field8802) {
                                var11 = 2000;
                            }
                            if (class206.field2472.field8792 != 0 && arg2.field8792 != 0) {
                                if (class206.field2472.field8792 == arg2.field8792) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class544.field7889[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class630.field9030[var10] + var11);
                        int var13 = class440.field6292[var10] == -1 ? class660.field9376 : class440.field6292[var10];
                        class240.method1471((long) arg2.field2664, -24453, var12, false, -1, var13, 0, class664.field9403[var10], 0, true, "<col=ffffff>" + var3);
                        class385.field5128++;
                    }
                }
            }
            if (!arg0) {
                for (class377 var14 = (class377) class34.field679.method1132((byte) 72); var14 != null; var14 = (class377) class34.field679.method1134(8446)) {
                    if (var14.field5062 == 60) {
                        var14.field5059 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class99.field1336 && (class251.field3440 & 0x10) != 0) {
            class674.field9679++;
            class240.method1471(0L, -24453, 50, false, -1, class564.field8154, 0, class52.field844, 0, true, class255.field3461 + " -> <col=ffffff>" + class424.field6075.method2561(class370.field4980, 0));
        }
    }

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "(I)V", line = 187)
    private final void method3730(int arg0) {
        if (this.field9365 > 0) {
            this.field9354.method1990(this.field9365, -102, this.method3734(-101));
            this.field9365 = 0;
        }
        int var2 = 68 % ((17 - arg0) / 45);
        field9367++;
    }

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "(I)V", line = 202)
    private final void method3731(int arg0) {
        this.field9354.method2316((byte) 113, this);
        if (arg0 != -16322) {
            this.field9360 = true;
        }
        field9361++;
        if (class151.field1872 == this.field9353) {
            OpenGL.glTexParameteri(this.field9349, 10241, this.field9360 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field9349, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field9349, 10241, this.field9360 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field9349, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(III[B)I", line = 224)
    public static final int method3732(int arg0, int arg1, int arg2, byte[] arg3) {
        field9363++;
        int var4 = -1;
        if (arg1 < 36) {
            method3736(-61);
        }
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = class442.field6298[(arg3[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(B)V", line = 247)
    public static void method3733(byte arg0) {
        field9370 = null;
        field9371 = null;
        if (arg0 < 55) {
            method3729(false, -126, null);
        }
    }

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "(I)I", line = 258)
    private final int method3734(int arg0) {
        int var2 = 53 % ((-arg0 - 35) / 54);
        field9358++;
        int var3 = this.field9372.field1114 * this.field9352 * this.field9369.field3788;
        return this.field9360 ? var3 * 4 / 3 : var3;
    }

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "(I)I", line = 271)
    public final int method3735(int arg0) {
        if (arg0 != -8573) {
            return -124;
        }
        field9356++;
        if (class279.field3793 == this.field9369) {
            if (class666.field9494 == this.field9372) {
                return 6407;
            }
            if (class391.field5229 == this.field9372) {
                return 6408;
            }
            if (class384.field5117 == this.field9372) {
                return 6406;
            }
            if (class702.field9917 == this.field9372) {
                return 6409;
            }
            if (class426.field6122 == this.field9372) {
                return 6410;
            }
            if (class438.field6259 == this.field9372) {
                return 6145;
            }
        } else if (class279.field3796 == this.field9369) {
            if (class666.field9494 == this.field9372) {
                return 34843;
            }
            if (class391.field5229 == this.field9372) {
                return 34842;
            }
            if (class384.field5117 == this.field9372) {
                return 34844;
            }
            if (class702.field9917 == this.field9372) {
                return 34846;
            }
            if (class426.field6122 == this.field9372) {
                return 34847;
            }
            if (class438.field6259 == this.field9372) {
                return 6145;
            }
        } else if (class279.field3797 == this.field9369) {
            if (class666.field9494 == this.field9372) {
                return 34837;
            }
            if (class391.field5229 == this.field9372) {
                return 34836;
            }
            if (class384.field5117 == this.field9372) {
                return 34838;
            }
            if (class702.field9917 == this.field9372) {
                return 34840;
            }
            if (class426.field6122 == this.field9372) {
                return 34841;
            }
            if (class438.field6259 == this.field9372) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "(I)V", line = 367)
    public static final void method3736(int arg0) {
        field9351++;
        class685.method3883(true);
        if (arg0 < 86) {
            return;
        }
        class37.field707 = null;
        class502.field7008 = null;
        class377.field5073 = null;
        class562.field8128 = null;
        class143.field1780 = null;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIZI[I)V", line = 386)
    public final void method3737(int arg0, int arg1, boolean arg2, int arg3, int[] arg4) {
        if (!arg2) {
            this.method3728(127, 44);
        }
        field9350++;
        if (arg0 > 0 && !class326.method1894(arg0, 32)) {
            throw new IllegalArgumentException("");
        } else if (arg1 > 0 && !class326.method1894(arg1, 32)) {
            throw new IllegalArgumentException("");
        } else if (class391.field5229 == this.field9372) {
            int var6 = 0;
            int var7 = arg0 >= arg1 ? arg1 : arg0;
            int var8 = arg0 >> 1;
            int var9 = arg1 >> 1;
            int[] var10 = arg4;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg3, var6, this.method3735(-8573), arg0, arg1, 0, 32993, this.field9354.field4666, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = var13 + arg0;
                int[] var15 = var11;
                for (int var16 = 0; var16 < var9; var16++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var14++];
                        int var20 = var10[var13++];
                        int var21 = var18 & 0xFF;
                        int var22 = var10[var14++];
                        int var23 = var18 >> 24 & 0xFF;
                        int var24 = (var18 & 0xFF39) >> 8;
                        int var25 = var18 >> 16 & 0xFF;
                        int var26 = (var20 >> 8 & 0xFF) + var24;
                        int var27 = (var20 & 0xFF) + var21;
                        int var28 = (var20 >> 16 & 0xFF) + var25;
                        int var29 = (var20 >> 24 & 0xFF) + var23;
                        int var30 = (var19 & 0xFF) + var27;
                        int var31 = (var19 >> 24 & 0xFF) + var29;
                        int var32 = ((var19 & 0xFF17) >> 8) + var26;
                        int var33 = (var19 >> 16 & 0xFF) + var28;
                        int var34 = ((var22 & 0xFF97) >> 8) + var32;
                        int var35 = (var22 & 0xFF) + var30;
                        int var36 = (var22 >> 24 & 0xFF) + var31;
                        int var37 = ((var22 & 0xFFE6E2) >> 16) + var33;
                        var11[var12++] = class242.method1474(class435.method2605(var35, 1020) >> 2, class242.method1474(class242.method1474(class435.method2605(1020, var36) << 22, class435.method2605(1020, var37) << 14), class435.method2605(var34 << 6, 65280)));
                    }
                    var14 += arg0;
                    var13 += arg0;
                }
                var11 = var10;
                arg0 = var8;
                arg1 = var9;
                var10 = var15;
                var7 >>= 0x1;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var6++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I[FIZI)V", line = 496)
    public final void method3738(int arg0, float[] arg1, int arg2, boolean arg3, int arg4) {
        field9359++;
        if (arg4 > 0 && !class326.method1894(arg4, 32)) {
            throw new IllegalArgumentException("");
        }
        if (arg3) {
            this.field9353 = null;
        }
        if (arg0 > 0 && !class326.method1894(arg0, 32)) {
            throw new IllegalArgumentException("");
        }
        int var6 = this.field9372.field1114;
        int var7 = 0;
        int var8 = arg0 > arg4 ? arg4 : arg0;
        int var9 = arg4 >> 1;
        int var10 = arg0 >> 1;
        float[] var11 = arg1;
        float[] var12 = new float[var6 * var10 * var9];
        while (true) {
            OpenGL.glTexImage2Df(arg2, var7, this.method3735(-8573), arg4, arg0, 0, class499.method2903(7491, this.field9372), 5126, var11, 0);
            if (var8 <= 1) {
                return;
            }
            int var13 = arg4 * var6;
            float[] var14 = var12;
            for (int var15 = 0; var15 < var6; var15++) {
                int var16 = var15;
                int var17 = var15;
                int var18 = var13 + var15;
                for (int var19 = 0; var19 < var10; var19++) {
                    for (int var20 = 0; var20 < var9; var20++) {
                        float var21 = var11[var17];
                        int var22 = var6 + var17;
                        float var23 = var11[var22] + var21;
                        var17 = var6 + var22;
                        float var24 = var11[var18] + var23;
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
            var12 = var11;
            arg0 = var10;
            arg4 = var9;
            var11 = var14;
            var7++;
            var8 >>= 0x1;
            var9 >>= 0x1;
            var10 >>= 0x1;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(III[BI)V", line = 596)
    public final void method3739(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field9368++;
        if (arg0 > 0 && !class326.method1894(arg0, 32)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class326.method1894(arg1, 32)) {
            int var6 = this.field9372.field1114;
            int var7 = 0;
            int var8 = arg1 > arg0 ? arg0 : arg1;
            int var9 = arg0 >> 1;
            int var10 = arg1 >> 1;
            byte[] var11 = arg3;
            if (arg2 <= 86) {
                this.field9360 = false;
            }
            byte[] var12 = new byte[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Dub(arg4, var7, this.method3735(-8573), arg0, arg1, 0, class499.method2903(7491, this.field9372), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg0 * var6;
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
                var12 = var11;
                arg0 = var9;
                var11 = var14;
                arg1 = var10;
                var7++;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Ldda;ILfca;Lbv;IZ)V", line = 759)
    public class659(class349 arg0, int arg1, class75 arg2, class279 arg3, int arg4, boolean arg5) {
        this.field9372 = arg2;
        this.field9354 = arg0;
        this.field9352 = arg4;
        this.field9369 = arg3;
        this.field9360 = arg5;
        this.field9349 = arg1;
        OpenGL.glGenTextures(1, class500.field6987, 0);
        this.field9365 = class500.field6987[0];
        this.method3731(-16322);
        this.method3728(113, 0);
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)V", line = 711)
    public final void method1701(int arg0) {
        field9355++;
        int var2 = this.field9354.method2379(89);
        int var3 = this.field9354.field4670[var2];
        if (this.field9349 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field9349);
            this.field9354.field4670[var2] = this.field9349;
        }
        OpenGL.glBindTexture(this.field9349, this.field9365);
        if (arg0 != 2669) {
            this.method3735(21);
        }
    }

    @OriginalMember(owner = "client!mga", name = "finalize", descriptor = "()V", line = 740)
    protected final void finalize() throws Throwable {
        field9364++;
        this.method3730(121);
        super.finalize();
    }
}
