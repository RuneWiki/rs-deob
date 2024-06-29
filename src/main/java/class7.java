import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public abstract class class7 implements class563 {

    @OriginalMember(owner = "client!il", name = "m", descriptor = "Lpw;")
    private class606 field70 = class619.field9140;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "Lui;")
    public class194 field66;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "Lag;")
    public class587 field69;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "Z")
    private boolean field60;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    private int field77;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Laq;")
    public class141 field63;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    private int field73;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public static int field76;

    static {
        new class572("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIII[B)V", line = 5)
    public static final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field58++;
        if (arg2 >= arg1) {
            return;
        }
        int var6 = arg0 + arg2;
        int var7 = arg1 - arg2 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg1 - arg2 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        int var9 = -77 % ((-arg3 - 30) / 50);
                        return;
                    }
                    arg5[var6++] = 1;
                }
            }
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(B)V", line = 33)
    public final void method22(byte arg0) {
        field65++;
        int var2 = this.field69.method2611((byte) 88);
        int var3 = this.field69.field8715[var2];
        int var4 = -117 % ((-arg0 - 72) / 49);
        if (this.field78 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field78);
            this.field69.field8715[var2] = this.field78;
        }
        OpenGL.glBindTexture(this.field78, this.field73);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IB[FII)V", line = 61)
    public final void method23(int arg0, byte arg1, float[] arg2, int arg3, int arg4) {
        field67++;
        if (arg3 > 0 && !class452.method2749(arg3, false)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class452.method2749(arg0, false)) {
            int var6 = this.field63.field1992;
            int var7 = 0;
            int var8 = arg3 >= arg0 ? arg0 : arg3;
            int var9 = arg3 >> 1;
            int var10 = arg0 >> 1;
            float[] var11 = arg2;
            if (arg1 >= -55) {
                this.field78 = -112;
            }
            float[] var12 = new float[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var7, this.method29((byte) -86), arg3, arg0, 0, class546.method3319(104, this.field63), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg3 * var6;
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
                arg3 = var9;
                var11 = var14;
                arg0 = var10;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var7++;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!il", name = "finalize", descriptor = "()V", line = 161)
    protected final void finalize() throws Throwable {
        field75++;
        this.method24(0);
        super.finalize();
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V", line = 172)
    private final void method24(int arg0) {
        field71++;
        if (this.field73 > arg0) {
            this.field69.method3491((byte) 100, this.method28(arg0 ^ 0x4), this.field73);
            this.field73 = 0;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)V", line = 188)
    private final void method25(int arg0, byte arg1) {
        field72++;
        int var3 = 24 / ((arg1 + 60) / 44);
        this.field69.field6078 -= arg0;
        this.field69.field6078 += this.method28(4);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I[BIBI)V", line = 200)
    public final void method26(int arg0, byte[] arg1, int arg2, byte arg3, int arg4) {
        field62++;
        if (arg3 >= -36) {
            this.method24(-77);
        }
        if (arg0 > 0 && !class452.method2749(arg0, false)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class452.method2749(arg4, false)) {
            int var6 = this.field63.field1992;
            int var7 = 0;
            int var8 = arg0 < arg4 ? arg0 : arg4;
            int var9 = arg0 >> 1;
            int var10 = arg4 >> 1;
            byte[] var11 = arg1;
            byte[] var12 = new byte[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Dub(arg2, var7, this.method29((byte) -86), arg0, arg4, 0, class546.method3319(55, this.field63), 5121, var11, 0);
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
                            int var24 = var11[var18] + var23;
                            var17 = var6 + var22;
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
                arg4 = var10;
                var8 >>= 0x1;
                var9 >>= 0x1;
                var7++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIII)V", line = 299)
    public static final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class521 var7 = new class521();
        var7.field7431 = arg1 >> class115.field1626;
        var7.field7430 = arg2 >> class115.field1626;
        var7.field7423 = arg3 >> class115.field1626;
        var7.field7418 = arg4 >> class115.field1626;
        var7.field7432 = arg0;
        var7.field7434 = arg1;
        var7.field7435 = arg2;
        var7.field7427 = arg3;
        var7.field7426 = arg4;
        var7.field7437 = arg5;
        var7.field7417 = arg6;
        class393.field5407[class441.field5889++] = var7;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)I", line = 317)
    private final int method28(int arg0) {
        if (arg0 != 4) {
            this.field66 = null;
        }
        field76++;
        int var2 = this.field63.field1992 * this.field77 * this.field66.field2870;
        return this.field60 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(B)I", line = 334)
    public final int method29(byte arg0) {
        if (arg0 != -86) {
            return -79;
        }
        field68++;
        if (class194.field2874 == this.field66) {
            if (class245.field3536 == this.field63) {
                return 6407;
            }
            if (class488.field6956 == this.field63) {
                return 6408;
            }
            if (class613.field9072 == this.field63) {
                return 6406;
            }
            if (class609.field9043 == this.field63) {
                return 6409;
            }
            if (class540.field8108 == this.field63) {
                return 6410;
            }
            if (class272.field3847 == this.field63) {
                return 6145;
            }
        } else if (class194.field2877 == this.field66) {
            if (class245.field3536 == this.field63) {
                return 34843;
            }
            if (class488.field6956 == this.field63) {
                return 34842;
            }
            if (class613.field9072 == this.field63) {
                return 34844;
            }
            if (class609.field9043 == this.field63) {
                return 34846;
            }
            if (class540.field8108 == this.field63) {
                return 34847;
            }
            if (class272.field3847 == this.field63) {
                return 6145;
            }
        } else if (class194.field2878 == this.field66) {
            if (class245.field3536 == this.field63) {
                return 34837;
            }
            if (class488.field6956 == this.field63) {
                return 34836;
            }
            if (class613.field9072 == this.field63) {
                return 34838;
            }
            if (class609.field9043 == this.field63) {
                return 34840;
            }
            if (class540.field8108 == this.field63) {
                return 34841;
            }
            if (class272.field3847 == this.field63) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILte;)V", line = 428)
    public static final void method30(int arg0, class527 arg1) {
        if (class87.field1259 == null) {
            class56 var2 = new class56();
            byte[] var3 = var2.method363(128, arg0 + 3968, 128, 16);
            class87.field1259 = class609.method3579(var3, 136, false);
        }
        field59++;
        if (class194.field2880 == null) {
            class482 var4 = new class482();
            byte[] var5 = var4.method2903(16, 128, 128, (byte) 116);
            class194.field2880 = class609.method3579(var5, 136, false);
        }
        if (arg0 != 128) {
            method27(-18, 39, -105, -16, 82, 2, 55);
        }
        class242 var6 = arg1.field7743;
        if (var6.method1538(-109) && class313.field4316 == null) {
            byte[] var7 = class627.method3664(0.5F, 4.0F, 4.0F, 16, 8, new class470(419684), 0.6F, 128, 127, 16.0F, 128);
            class313.field4316 = class609.method3579(var7, arg0 ^ 0x8, false);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lpw;I)V", line = 472)
    public final void method31(class606 arg0, int arg1) {
        if (this.field70 != arg0) {
            this.field70 = arg0;
            this.method33(-104);
        }
        field61++;
        if (arg1 != 29557) {
            this.method24(-41);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I[IIII)V", line = 488)
    public final void method32(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field64++;
        if (arg0 > 0 && !class452.method2749(arg0, false)) {
            throw new IllegalArgumentException("");
        } else if (arg3 > 0 && !class452.method2749(arg3, false)) {
            throw new IllegalArgumentException("");
        } else if (class488.field6956 == this.field63) {
            int var6 = 0;
            int var7 = arg0 < arg3 ? arg0 : arg3;
            int var8 = arg0 >> 1;
            int var9 = arg3 >> 1;
            int[] var10 = arg1;
            if (arg4 != 255) {
                this.method24(22);
            }
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg2, var6, this.method29((byte) -86), arg0, arg3, 0, 32993, this.field69.field8711, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg0 + var13;
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var14++];
                        int var20 = var10[var13++];
                        int var21 = (var18 & 0xFFC1) >> 8;
                        int var22 = var18 & 0xFF;
                        int var23 = var10[var14++];
                        int var24 = var18 >> 24 & 0xFF;
                        int var25 = var18 >> 16 & 0xFF;
                        int var26 = (var20 >> 16 & 0xFF) + var25;
                        int var27 = (var20 >> 24 & 0xFF) + var24;
                        int var28 = (var20 & 0xFF) + var22;
                        int var29 = ((var20 & 0xFF4F) >> 8) + var21;
                        int var30 = (var19 & 0xFF) + var28;
                        int var31 = (var19 >> 16 & 0xFF) + var26;
                        int var32 = (var19 >> 8 & 0xFF) + var29;
                        int var33 = (var19 >> 24 & 0xFF) + var27;
                        int var34 = (var23 >> 24 & 0xFF) + var33;
                        int var35 = (var23 >> 16 & 0xFF) + var31;
                        int var36 = (var23 & 0xFF) + var30;
                        int var37 = (var23 >> 8 & 0xFF) + var32;
                        var11[var12++] = class473.method2847(class473.method2847(class37.method245(var37, 1020) << 6, class473.method2847(class37.method245(var35, 1020) << 14, class37.method245(var34 << 22, -16777216))), class37.method245(var36 >> 2, 255));
                    }
                    var14 += arg0;
                    var13 += arg0;
                }
                int[] var16 = var11;
                var11 = var10;
                var10 = var16;
                arg3 = var9;
                arg0 = var8;
                var8 >>= 0x1;
                var9 >>= 0x1;
                var7 >>= 0x1;
                var6++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V", line = 595)
    private final void method33(int arg0) {
        this.field69.method2632(this, 0);
        field74++;
        if (class619.field9140 == this.field70) {
            OpenGL.glTexParameteri(this.field78, 10241, this.field60 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field78, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field78, 10241, this.field60 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field78, 10240, 9728);
        }
        int var2 = 76 % ((-arg0 - 50) / 32);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lag;ILaq;Lui;IZ)V", line = 626)
    public class7(class587 arg0, int arg1, class141 arg2, class194 arg3, int arg4, boolean arg5) {
        this.field66 = arg3;
        this.field69 = arg0;
        this.field60 = arg5;
        this.field77 = arg4;
        this.field63 = arg2;
        this.field78 = arg1;
        OpenGL.glGenTextures(1, class378.field5213, 0);
        this.field73 = class378.field5213[0];
        this.method33(-106);
        this.method25(0, (byte) -120);
    }
}
