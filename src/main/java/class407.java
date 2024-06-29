import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public abstract class class407 implements class467 {

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "Lqaa;")
    private class26 field5737 = class81.field1132;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    private int field5750;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "Lkf;")
    public class229 field5740;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "Z")
    private boolean field5748;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "Lps;")
    public class82 field5732;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "Lmc;")
    public class120 field5749;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public int field5733;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    private int field5736;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[FIIB)V")
    public final void method2317(int arg0, float[] arg1, int arg2, int arg3, byte arg4) {
        field5730++;
        if (arg2 > 0 && !class17.method89(arg2, 508337774)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class17.method89(arg0, 508337774)) {
            int var6 = this.field5740.field3277;
            int var7 = 0;
            int var8 = arg2 >= arg0 ? arg0 : arg2;
            int var9 = arg2 >> 1;
            int var10 = arg0 >> 1;
            if (arg4 <= -94) {
                float[] var11 = arg1;
                float[] var12 = new float[var6 * var10 * var9];
                while (true) {
                    OpenGL.glTexImage2Df(arg3, var7, this.method2322(false), arg2, arg0, 0, class422.method2400((byte) 61, this.field5740), 5126, var11, 0);
                    if (var8 <= 1) {
                        return;
                    }
                    int var13 = arg2 * var6;
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
                                var12[var16] = var26 * 0.25F;
                                var18 = var6 + var25;
                                var16 += var6;
                            }
                            var17 += var13;
                            var18 += var13;
                        }
                    }
                    var12 = var11;
                    arg2 = var9;
                    arg0 = var10;
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

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
    public final void method129(byte arg0) {
        field5751++;
        if (arg0 != -33) {
            return;
        }
        int var2 = this.field5749.method3179((byte) 82);
        int var3 = this.field5749.field1670[var2];
        if (this.field5733 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field5733);
            this.field5749.field1670[var2] = this.field5733;
        }
        OpenGL.glBindTexture(this.field5733, this.field5736);
    }

    @OriginalMember(owner = "client!bn", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5741++;
        this.method2319(6071);
        super.finalize();
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII[B)V")
    public final void method2318(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        field5744++;
        if (arg3 > 0 && !class17.method89(arg3, 508337774)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class17.method89(arg0, 508337774)) {
            int var6 = this.field5740.field3277;
            if (arg1 != 1) {
                method2321(-121, 0.6222861F, -50, 88, null, -0.14304921F, 72, -71, (byte) -58, 107, 8, -3, -1.0986261F);
            }
            int var7 = 0;
            int var8 = arg0 <= arg3 ? arg0 : arg3;
            int var9 = arg3 >> 1;
            int var10 = arg0 >> 1;
            byte[] var11 = arg4;
            byte[] var12 = new byte[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Dub(arg2, var7, this.method2322(false), arg3, arg0, 0, class422.method2400((byte) 61, this.field5740), 5121, var11, 0);
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
                arg0 = var10;
                var9 >>= 0x1;
                var7++;
                var10 >>= 0x1;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
    private final void method2319(int arg0) {
        if (this.field5736 > 0) {
            this.field5749.method859(this.field5736, (byte) 56, this.method2324(28570));
            this.field5736 = 0;
        }
        field5745++;
        if (arg0 != 6071) {
            this.field5748 = false;
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
    public static final void method2320(int arg0) {
        if (class249.field3516 < 1024.0F) {
            class249.field3516 = 1024.0F;
        }
        field5739++;
        while (class646.field9167 >= 16384.0F) {
            class646.field9167 -= 16384.0F;
        }
        if (class249.field3516 > 3072.0F) {
            class249.field3516 = 3072.0F;
        }
        if (arg0 != 29199) {
            return;
        }
        while (class646.field9167 < 0.0F) {
            class646.field9167 += 16384.0F;
        }
        int var1 = class581.field8108 >> 9;
        int var2 = class652.field9218 >> 9;
        int var3 = class203.method1355(class652.field9218, class581.field8108, arg0 - 29195, class233.field3305);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && class86.field1185 - 4 > var1 && class526.field7212 - 4 > var2) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class233.field3305;
                    if (var7 < 3 && class105.method800((byte) 28, var6, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class340.field4946.field3773 != null && class340.field4946.field3773[var7] != null) {
                        var8 = (class340.field4946.field3773[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 + var3 - class144.field2149[var7].method273(var5, var6);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 2) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class21.field289) {
            class21.field289 += (var10 - class21.field289) / 24;
        } else if (class21.field289 > var10) {
            class21.field289 += (var10 - class21.field289) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IFII[FFIIBIIIF)V")
    public static final void method2321(int arg0, float arg1, int arg2, int arg3, float[] arg4, float arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11, float arg12) {
        int var13 = arg10 - arg9;
        field5752++;
        int var14 = arg2 - arg7;
        int var15 = arg6 - arg0;
        float var16 = arg4[2] * (float) var14 + arg4[0] * (float) var15 + arg4[1] * (float) var13;
        if (arg8 >= -87) {
            field5738 = -1;
        }
        float var17 = arg4[5] * (float) var14 + arg4[4] * (float) var13 + arg4[3] * (float) var15;
        float var18 = arg4[8] * (float) var14 + arg4[6] * (float) var15 + arg4[7] * (float) var13;
        float var19;
        float var20;
        if (arg3 == 0) {
            var19 = arg12 + 0.5F - var18;
            var20 = arg5 + var16 + 0.5F;
        } else if (arg3 == 1) {
            var20 = arg5 + var16 + 0.5F;
            var19 = arg12 + var18 + 0.5F;
        } else if (arg3 == 2) {
            var19 = arg1 + 0.5F - var17;
            var20 = arg5 + 0.5F - var16;
        } else if (arg3 == 3) {
            var20 = arg5 + var16 + 0.5F;
            var19 = arg1 + 0.5F - var17;
        } else if (arg3 == 4) {
            var20 = arg12 + var18 + 0.5F;
            var19 = arg1 + 0.5F - var17;
        } else {
            var20 = arg12 + 0.5F - var18;
            var19 = arg1 + 0.5F - var17;
        }
        if (arg11 == 1) {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        } else if (arg11 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg11 == 3) {
            float var21 = var20;
            var20 = var19;
            var19 = -var21;
        }
        class325.field4802 = var19;
        class693.field9719 = var20;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(Z)I")
    public final int method2322(boolean arg0) {
        field5753++;
        if (arg0) {
            field5738 = -10;
        }
        if (class82.field1147 == this.field5732) {
            if (class145.field2161 == this.field5740) {
                return 6407;
            }
            if (class583.field8126 == this.field5740) {
                return 6408;
            }
            if (class381.field5355 == this.field5740) {
                return 6406;
            }
            if (class94.field1240 == this.field5740) {
                return 6409;
            }
            if (class312.field4637 == this.field5740) {
                return 6410;
            }
            if (class283.field3931 == this.field5740) {
                return 6145;
            }
        } else if (class82.field1150 == this.field5732) {
            if (class145.field2161 == this.field5740) {
                return 34843;
            }
            if (class583.field8126 == this.field5740) {
                return 34842;
            }
            if (class381.field5355 == this.field5740) {
                return 34844;
            }
            if (class94.field1240 == this.field5740) {
                return 34846;
            }
            if (class312.field4637 == this.field5740) {
                return 34847;
            }
            if (class283.field3931 == this.field5740) {
                return 6145;
            }
        } else if (class82.field1151 == this.field5732) {
            if (class145.field2161 == this.field5740) {
                return 34837;
            }
            if (class583.field8126 == this.field5740) {
                return 34836;
            }
            if (class381.field5355 == this.field5740) {
                return 34838;
            }
            if (class94.field1240 == this.field5740) {
                return 34840;
            }
            if (class312.field4637 == this.field5740) {
                return 34841;
            }
            if (class283.field3931 == this.field5740) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III[II)V")
    public final void method2323(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field5746++;
        if (arg1 > 0 && !class17.method89(arg1, 508337774)) {
            throw new IllegalArgumentException("");
        } else if (arg0 > 0 && !class17.method89(arg0, 508337774)) {
            throw new IllegalArgumentException("");
        } else if (arg2 == 16384) {
            if (class583.field8126 != this.field5740) {
                throw new IllegalArgumentException("");
            }
            int var6 = 0;
            int var7 = arg1 < arg0 ? arg1 : arg0;
            int var8 = arg1 >> 1;
            int var9 = arg0 >> 1;
            int[] var10 = arg3;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg4, var6, this.method2322(false), arg1, arg0, 0, 32993, this.field5749.field1666, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg1 + var13;
                int[] var15 = var11;
                for (int var16 = 0; var16 < var9; var16++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var13++];
                        int var20 = var10[var14++];
                        int var21 = var10[var14++];
                        int var22 = var18 & 0xFF;
                        int var23 = var18 >> 24 & 0xFF;
                        int var24 = var18 >> 8 & 0xFF;
                        int var25 = var18 >> 16 & 0xFF;
                        int var26 = ((var19 & 0xFFB9) >> 8) + var24;
                        int var27 = (var19 >> 24 & 0xFF) + var23;
                        int var28 = (var19 & 0xFF) + var22;
                        int var29 = (var19 >> 16 & 0xFF) + var25;
                        int var30 = (var20 >> 24 & 0xFF) + var27;
                        int var31 = ((var20 & 0xFF85) >> 8) + var26;
                        int var32 = (var20 >> 16 & 0xFF) + var29;
                        int var33 = (var20 & 0xFF) + var28;
                        int var34 = (var21 & 0xFF) + var33;
                        int var35 = ((var21 & 0xFF9B) >> 8) + var31;
                        int var36 = (var21 >> 24 & 0xFF) + var30;
                        int var37 = ((var21 & 0xFFB665) >> 16) + var32;
                        var11[var12++] = class266.method1624(class266.method1624(class249.method1537(var35 << 6, 65280), class266.method1624(class249.method1537(var37, 1020) << 14, class249.method1537(var36 << 22, -16777216))), class249.method1537(255, var34 >> 2));
                    }
                    var14 += arg1;
                    var13 += arg1;
                }
                var11 = var10;
                arg0 = var9;
                arg1 = var8;
                var10 = var15;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var7 >>= 0x1;
                var6++;
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)I")
    private final int method2324(int arg0) {
        field5734++;
        if (arg0 == 28570) {
            int var2 = this.field5732.field1141 * this.field5740.field3277 * this.field5750;
            return this.field5748 ? var2 * 4 / 3 : var2;
        } else {
            return -90;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BLqaa;)V")
    public final void method131(byte arg0, class26 arg1) {
        field5731++;
        if (this.field5737 != arg1) {
            this.field5737 = arg1;
            this.method2327(-23268);
        }
        if (arg0 < 24) {
            this.field5740 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZLfaa;Lfaa;)V")
    public static final void method2325(boolean arg0, class140 arg1, class140 arg2) {
        field5747++;
        class1.method5(1, class10.field205);
        class550.field7453++;
        if (arg0) {
            method2325(true, null, null);
        }
        class288.field4014.method741(arg1.field2100, (byte) 27);
        class288.field4014.method731(-2045573048, arg1.field1969);
        class288.field4014.method752(73, arg2.field2092);
        class288.field4014.method705(!arg0, arg2.field2100);
        class288.field4014.method740(arg1.field2092, !arg0);
        class288.field4014.method731(-2045573048, arg2.field1969);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)V")
    private final void method2326(int arg0, int arg1) {
        this.field5749.field7944 -= arg1;
        field5743++;
        this.field5749.field7944 += this.method2324(28570);
        if (arg0 < 92) {
            field5738 = -81;
        }
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "(I)V")
    private final void method2327(int arg0) {
        if (arg0 != -23268) {
            this.field5733 = -70;
        }
        field5742++;
        this.field5749.method3232(false, this);
        if (class81.field1132 == this.field5737) {
            OpenGL.glTexParameteri(this.field5733, 10241, this.field5748 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field5733, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field5733, 10241, this.field5748 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field5733, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lmc;ILkf;Lps;IZ)V")
    public class407(class120 arg0, int arg1, class229 arg2, class82 arg3, int arg4, boolean arg5) {
        this.field5750 = arg4;
        this.field5740 = arg2;
        this.field5748 = arg5;
        this.field5732 = arg3;
        this.field5749 = arg0;
        this.field5733 = arg1;
        OpenGL.glGenTextures(1, class311.field4618, 0);
        this.field5736 = class311.field4618[0];
        this.method2327(-23268);
        this.method2326(108, 0);
    }
}
