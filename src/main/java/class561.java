import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public abstract class class561 implements class60 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lqq;")
    private class599 field8307 = class579.field8529;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public int field8320;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Lqba;")
    public class540 field8314;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Llc;")
    public class629 field8312;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    private int field8315;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Ljt;")
    public class489 field8310;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "Z")
    private boolean field8326;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    private int field8329;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "Lqp;")
    public static class586 field8319 = new class586(48, 2);

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field8321 = 0;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field8324 = 0;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field8306;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field8311;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field8313;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field8317;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field8318;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field8323;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field8327;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public static int field8328;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public static int field8330;

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lqba;ILjt;Llc;IZ)V", line = 601)
    public class561(class540 arg0, int arg1, class489 arg2, class629 arg3, int arg4, boolean arg5) {
        this.field8320 = arg1;
        this.field8314 = arg0;
        this.field8312 = arg3;
        this.field8315 = arg4;
        this.field8310 = arg2;
        this.field8326 = arg5;
        OpenGL.glGenTextures(1, class169.field2294, 0);
        this.field8329 = class169.field2294[0];
        this.method3280((byte) 48);
        this.method3275(0, 16550);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V", line = 14)
    private final void method3275(int arg0, int arg1) {
        if (arg1 != 16550) {
            this.method3285(-113, -104, -11, null, 22);
        }
        this.field8314.field2532 -= arg0;
        field8325++;
        this.field8314.field2532 += this.method3278((byte) 85);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([BIIIZ)V", line = 27)
    public final void method3276(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field8323++;
        if (arg2 > 0 && !class154.method899(arg2, 118)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class154.method899(arg3, 109)) {
            if (arg4) {
                method3279(null, null, (byte) 90);
            }
            int var6 = this.field8310.field7400;
            int var7 = 0;
            int var8 = arg2 >= arg3 ? arg3 : arg2;
            int var9 = arg2 >> 1;
            int var10 = arg3 >> 1;
            byte[] var11 = arg0;
            byte[] var12 = new byte[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Dub(arg1, var7, this.method3277(1), arg2, arg3, 0, class135.method836(false, this.field8310), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg2 * var6;
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
                var11 = var14;
                arg3 = var10;
                arg2 = var9;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var7++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)I", line = 126)
    public final int method3277(int arg0) {
        if (arg0 != 1) {
            this.method3276(null, -107, 103, 122, false);
        }
        field8313++;
        if (class629.field9208 == this.field8312) {
            if (class639.field9293 == this.field8310) {
                return 6407;
            }
            if (class411.field5856 == this.field8310) {
                return 6408;
            }
            if (class566.field8401 == this.field8310) {
                return 6406;
            }
            if (class317.field4741 == this.field8310) {
                return 6409;
            }
            if (class556.field8245 == this.field8310) {
                return 6410;
            }
            if (class492.field7433 == this.field8310) {
                return 6145;
            }
        } else if (class629.field9211 == this.field8312) {
            if (class639.field9293 == this.field8310) {
                return 34843;
            }
            if (class411.field5856 == this.field8310) {
                return 34842;
            }
            if (class566.field8401 == this.field8310) {
                return 34844;
            }
            if (class317.field4741 == this.field8310) {
                return 34846;
            }
            if (class556.field8245 == this.field8310) {
                return 34847;
            }
            if (class492.field7433 == this.field8310) {
                return 6145;
            }
        } else if (class629.field9212 == this.field8312) {
            if (class639.field9293 == this.field8310) {
                return 34837;
            }
            if (class411.field5856 == this.field8310) {
                return 34836;
            }
            if (class566.field8401 == this.field8310) {
                return 34838;
            }
            if (class317.field4741 == this.field8310) {
                return 34840;
            }
            if (class556.field8245 == this.field8310) {
                return 34841;
            }
            if (class492.field7433 == this.field8310) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)I", line = 221)
    private final int method3278(byte arg0) {
        field8318++;
        int var2 = this.field8312.field9202 * this.field8310.field7400 * this.field8315;
        if (arg0 < 82) {
            this.field8314 = null;
        }
        return this.field8326 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljd;Ljd;B)V", line = 234)
    public static final void method3279(class496 arg0, class496 arg1, byte arg2) {
        int var3 = -58 % ((51 - arg2) / 63);
        if (arg1.field7466 != null) {
            arg1.method2997(1);
        }
        field8330++;
        arg1.field7469 = arg0;
        arg1.field7466 = arg0.field7466;
        arg1.field7466.field7469 = arg1;
        arg1.field7469.field7466 = arg1;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V", line = 252)
    private final void method3280(byte arg0) {
        this.field8314.method1152(this, true);
        field8327++;
        if (class579.field8529 == this.field8307) {
            OpenGL.glTexParameteri(this.field8320, 10241, this.field8326 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field8320, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field8320, 10241, this.field8326 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field8320, 10240, 9728);
        }
        if (arg0 != 48) {
            this.field8314 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V", line = 278)
    public final void method380(int arg0) {
        field8306++;
        int var2 = this.field8314.method1149(88);
        if (arg0 <= 3) {
            return;
        }
        int var3 = this.field8314.field8080[var2];
        if (this.field8320 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field8320);
            this.field8314.field8080[var2] = this.field8320;
        }
        OpenGL.glBindTexture(this.field8320, this.field8329);
    }

    @OriginalMember(owner = "client!ld", name = "finalize", descriptor = "()V", line = 319)
    protected final void finalize() throws Throwable {
        this.method3281(98);
        field8309++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)V", line = 333)
    private final void method3281(int arg0) {
        field8311++;
        if (this.field8329 > 0) {
            this.field8314.method3171(this.field8329, this.method3278((byte) 122), 0);
            this.field8329 = 0;
        }
        if (arg0 < 65) {
            this.method3284(-4, -121, -122, null, -72);
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V", line = 350)
    public static void method3282(byte arg0) {
        field8319 = null;
        if (arg0 != -127) {
            field8321 = 5;
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)V", line = 360)
    public static final void method3283(byte arg0) {
        if (arg0 <= 123) {
            method3283((byte) 73);
        }
        field8317++;
        if (class192.field2903 == 6) {
            class550.method3221(0, false);
        } else {
            class349.field5066 = class513.field7606;
            class513.field7606 = null;
            class463.method2749(1, 12);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III[II)V", line = 379)
    public final void method3284(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field8328++;
        if (arg1 > 0 && !class154.method899(arg1, 107)) {
            throw new IllegalArgumentException("");
        } else if (arg0 > 0 && !class154.method899(arg0, 102)) {
            throw new IllegalArgumentException("");
        } else if (class411.field5856 == this.field8310) {
            int var6 = 0;
            int var7 = arg1 < arg0 ? arg1 : arg0;
            int var8 = arg1 >> 1;
            int var9 = arg0 >> 1;
            int[] var10 = arg3;
            int[] var11 = new int[var8 * var9];
            if (arg2 == -27414) {
                while (true) {
                    OpenGL.glTexImage2Di(arg4, var6, this.method3277(1), arg1, arg0, 0, 32993, this.field8314.field8072, var10, 0);
                    if (var7 <= 1) {
                        return;
                    }
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = var13 + arg1;
                    for (int var15 = 0; var15 < var9; var15++) {
                        for (int var17 = 0; var17 < var8; var17++) {
                            int var18 = var10[var13++];
                            int var19 = var10[var13++];
                            int var20 = var10[var14++];
                            int var21 = var18 & 0xFF;
                            int var22 = var10[var14++];
                            int var23 = var18 >> 24 & 0xFF;
                            int var24 = var18 >> 8 & 0xFF;
                            int var25 = var18 >> 16 & 0xFF;
                            int var26 = ((var19 & 0xFF4035) >> 16) + var25;
                            int var27 = (var19 >> 24 & 0xFF) + var23;
                            int var28 = (var19 >> 8 & 0xFF) + var24;
                            int var29 = (var19 & 0xFF) + var21;
                            int var30 = ((var20 & 0xFF9B) >> 8) + var28;
                            int var31 = (var20 & 0xFF) + var29;
                            int var32 = (var20 >> 24 & 0xFF) + var27;
                            int var33 = (var20 >> 16 & 0xFF) + var26;
                            int var34 = (var22 >> 24 & 0xFF) + var32;
                            int var35 = (var22 & 0xFF) + var31;
                            int var36 = ((var22 & 0xFF4D) >> 8) + var30;
                            int var37 = (var22 >> 16 & 0xFF) + var33;
                            var11[var12++] = class313.method1926(class637.method3693(var35 >> 2, 255), class313.method1926(class313.method1926(class637.method3693(16711680, var37 << 14), class637.method3693(var34, 1020) << 22), class637.method3693(65280, var36 << 6)));
                        }
                        var14 += arg1;
                        var13 += arg1;
                    }
                    int[] var16 = var11;
                    var11 = var10;
                    arg0 = var9;
                    var10 = var16;
                    arg1 = var8;
                    var6++;
                    var8 >>= 0x1;
                    var7 >>= 0x1;
                    var9 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lqq;I)V", line = 486)
    public final void method379(class599 arg0, int arg1) {
        if (this.field8307 != arg0) {
            this.field8307 = arg0;
            this.method3280((byte) 48);
        }
        if (arg1 != 2068) {
            this.method379(null, 76);
        }
        field8308++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III[FI)V", line = 504)
    public final void method3285(int arg0, int arg1, int arg2, float[] arg3, int arg4) {
        field8316++;
        if (arg2 > 0 && !class154.method899(arg2, arg0 + 109)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class154.method899(arg1, 91)) {
            int var6 = this.field8310.field7400;
            if (arg0 != 1) {
                this.method3277(67);
            }
            int var7 = 0;
            int var8 = arg1 > arg2 ? arg2 : arg1;
            int var9 = arg2 >> 1;
            int var10 = arg1 >> 1;
            float[] var11 = arg3;
            float[] var12 = new float[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var7, this.method3277(1), arg2, arg1, 0, class135.method836(false, this.field8310), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg2 * var6;
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
                        var17 += var13;
                        var18 += var13;
                    }
                }
                float[] var15 = var12;
                var12 = var11;
                var11 = var15;
                arg2 = var9;
                arg1 = var10;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var7++;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
