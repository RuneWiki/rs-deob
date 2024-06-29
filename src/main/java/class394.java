import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public abstract class class394 implements class315 {

    @OriginalMember(owner = "client!om", name = "d", descriptor = "Lko;")
    private class531 field5101 = class140.field1751;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "Lpe;")
    public class636 field5099;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "Lnv;")
    public class439 field5105;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "Ldw;")
    public class748 field5118;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "Z")
    private boolean field5100;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public int field5112;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    private int field5107;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    private int field5110;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "[I")
    public static int[] field5119 = new int[8];

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public static int field5111 = -1;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "F")
    public static float field5103;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII[F)V", line = 4)
    public final void method2309(int arg0, int arg1, int arg2, int arg3, float[] arg4) {
        field5115++;
        if (arg0 != 1477883553) {
            return;
        }
        if (arg2 > 0 && !class152.method1091(arg2, arg0 ^ 0xA7E94903)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class152.method1091(arg3, arg0 ^ 0xA7E94979)) {
            int var6 = this.field5099.field8671;
            int var7 = 0;
            int var8 = arg3 <= arg2 ? arg3 : arg2;
            int var9 = arg2 >> 1;
            int var10 = arg3 >> 1;
            float[] var11 = arg4;
            float[] var12 = new float[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Df(arg1, var7, this.method2311(-588507160), arg2, arg3, 0, class563.method3265((byte) -126, this.field5099), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg2 * var6;
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
                var11 = var15;
                arg3 = var10;
                arg2 = var9;
                var8 >>= 0x1;
                var7++;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V", line = 102)
    private final void method2310(int arg0) {
        if (arg0 < this.field5110) {
            this.field5105.method2592(this.method2314(-125), this.field5110, 771);
            this.field5110 = 0;
        }
        field5113++;
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V", line = 120)
    public final void method1726(int arg0) {
        field5104++;
        int var2 = this.field5105.method2655(123);
        if (arg0 >= -93) {
            return;
        }
        int var3 = this.field5105.field5888[var2];
        if (this.field5112 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field5112);
            this.field5105.field5888[var2] = this.field5112;
        }
        OpenGL.glBindTexture(this.field5112, this.field5110);
    }

    @OriginalMember(owner = "client!om", name = "f", descriptor = "(I)I", line = 149)
    public final int method2311(int arg0) {
        if (arg0 != -588507160) {
            this.method1439(null, 82);
        }
        field5116++;
        if (class748.field10384 == this.field5118) {
            if (class574.field7863 == this.field5099) {
                return 6407;
            }
            if (class141.field1759 == this.field5099) {
                return 6408;
            }
            if (class205.field2451 == this.field5099) {
                return 6406;
            }
            if (class677.field9284 == this.field5099) {
                return 6409;
            }
            if (class216.field2549 == this.field5099) {
                return 6410;
            }
            if (class308.field3821 == this.field5099) {
                return 6145;
            }
        } else if (class748.field10387 == this.field5118) {
            if (class574.field7863 == this.field5099) {
                return 34843;
            }
            if (class141.field1759 == this.field5099) {
                return 34842;
            }
            if (class205.field2451 == this.field5099) {
                return 34844;
            }
            if (class677.field9284 == this.field5099) {
                return 34846;
            }
            if (class216.field2549 == this.field5099) {
                return 34847;
            }
            if (class308.field3821 == this.field5099) {
                return 6145;
            }
        } else if (class748.field10388 == this.field5118) {
            if (class574.field7863 == this.field5099) {
                return 34837;
            }
            if (class141.field1759 == this.field5099) {
                return 34836;
            }
            if (class205.field2451 == this.field5099) {
                return 34838;
            }
            if (class677.field9284 == this.field5099) {
                return 34840;
            }
            if (class216.field2549 == this.field5099) {
                return 34841;
            }
            if (class308.field3821 == this.field5099) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)V", line = 246)
    private final void method2312(int arg0, byte arg1) {
        field5117++;
        this.field5105.field6211 -= arg0;
        this.field5105.field6211 += this.method2314(101);
        if (arg1 <= 100) {
            this.field5101 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIB[B)V", line = 258)
    public final void method2313(int arg0, int arg1, int arg2, byte arg3, byte[] arg4) {
        field5102++;
        if (arg0 > 0 && !class152.method1091(arg0, arg3 ^ 0x48)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class152.method1091(arg1, -23)) {
            int var6 = this.field5099.field8671;
            int var7 = 0;
            int var8 = arg1 <= arg0 ? arg1 : arg0;
            int var9 = arg0 >> 1;
            int var10 = arg1 >> 1;
            byte[] var11 = arg4;
            byte[] var12 = new byte[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Dub(arg2, var7, this.method2311(-588507160), arg0, arg1, 0, class563.method3265((byte) -126, this.field5099), 5121, var11, 0);
                if (var8 <= 1) {
                    if (arg3 != -122) {
                        this.method2315((byte) 62);
                        return;
                    }
                    return;
                }
                int var13 = arg0 * var6;
                byte[] var14 = var12;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = var15;
                    int var17 = var15;
                    int var18 = var15 + var13;
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
                        var18 += var13;
                        var17 += var13;
                    }
                }
                var12 = var11;
                arg1 = var10;
                var11 = var14;
                arg0 = var9;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var7++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!om", name = "finalize", descriptor = "()V", line = 356)
    protected final void finalize() throws Throwable {
        field5109++;
        this.method2310(0);
        super.finalize();
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "(I)I", line = 368)
    private final int method2314(int arg0) {
        field5114++;
        int var2 = 63 / ((arg0 + 29) / 36);
        int var3 = this.field5118.field10374 * this.field5107 * this.field5099.field8671;
        return this.field5100 ? var3 * 4 / 3 : var3;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lnv;ILpe;Ldw;IZ)V", line = 445)
    public class394(class439 arg0, int arg1, class636 arg2, class748 arg3, int arg4, boolean arg5) {
        this.field5099 = arg2;
        this.field5105 = arg0;
        this.field5118 = arg3;
        this.field5100 = arg5;
        this.field5112 = arg1;
        this.field5107 = arg4;
        OpenGL.glGenTextures(1, class440.field5918, 0);
        this.field5110 = class440.field5918[0];
        this.method2315((byte) 38);
        this.method2312(0, (byte) 124);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V", line = 385)
    private final void method2315(byte arg0) {
        field5106++;
        this.field5105.method2643(-2, this);
        if (arg0 < 30) {
            this.method1439(null, -95);
        }
        if (class140.field1751 == this.field5101) {
            OpenGL.glTexParameteri(this.field5112, 10241, this.field5100 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field5112, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field5112, 10241, this.field5100 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field5112, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lko;I)V", line = 414)
    public final void method1439(class531 arg0, int arg1) {
        field5120++;
        if (arg1 >= -19) {
            this.field5105 = null;
        }
        if (this.field5101 != arg0) {
            this.field5101 = arg0;
            this.method2315((byte) 39);
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V", line = 435)
    public static void method2316(byte arg0) {
        field5119 = null;
        if (arg0 > -83) {
            method2316((byte) 98);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II[III)V", line = 467)
    public final void method2317(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field5098++;
        if (arg4 > 0 && !class152.method1091(arg4, arg3 ^ 0x5892)) {
            throw new IllegalArgumentException("");
        } else if (arg1 > 0 && !class152.method1091(arg1, -24)) {
            throw new IllegalArgumentException("");
        } else if (class141.field1759 == this.field5099) {
            int var6 = 0;
            int var7 = arg4 < arg1 ? arg4 : arg1;
            int var8 = arg4 >> 1;
            if (arg3 == -22784) {
                int var9 = arg1 >> 1;
                int[] var10 = arg2;
                int[] var11 = new int[var8 * var9];
                while (true) {
                    OpenGL.glTexImage2Di(arg0, var6, this.method2311(-588507160), arg4, arg1, 0, 32993, this.field5105.field5891, var10, 0);
                    if (var7 <= 1) {
                        return;
                    }
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = arg4 + var13;
                    for (int var15 = 0; var15 < var9; var15++) {
                        for (int var17 = 0; var17 < var8; var17++) {
                            int var18 = var10[var13++];
                            int var19 = var10[var14++];
                            int var20 = var10[var13++];
                            int var21 = var10[var14++];
                            int var22 = (var18 & 0xFF2A) >> 8;
                            int var23 = (var18 & 0xFFC284) >> 16;
                            int var24 = var18 >> 24 & 0xFF;
                            int var25 = var18 & 0xFF;
                            int var26 = (var20 >> 24 & 0xFF) + var24;
                            int var27 = ((var20 & 0xFF30C6) >> 16) + var23;
                            int var28 = (var20 >> 8 & 0xFF) + var22;
                            int var29 = (var20 & 0xFF) + var25;
                            int var30 = (var19 & 0xFF) + var29;
                            int var31 = (var19 >> 8 & 0xFF) + var28;
                            int var32 = ((var19 & 0xFFA859) >> 16) + var27;
                            int var33 = (var19 >> 24 & 0xFF) + var26;
                            int var34 = (var21 >> 16 & 0xFF) + var32;
                            int var35 = (var21 >> 8 & 0xFF) + var31;
                            int var36 = (var21 >> 24 & 0xFF) + var33;
                            int var37 = (var21 & 0xFF) + var30;
                            var11[var12++] = class5.method105(class296.method1733(var37, 1020) >> 2, class5.method105(class296.method1733(65280, var35 << 6), class5.method105(class296.method1733(var34, 1020) << 14, class296.method1733(var36, 1020) << 22)));
                        }
                        var13 += arg4;
                        var14 += arg4;
                    }
                    int[] var16 = var11;
                    var11 = var10;
                    arg4 = var8;
                    var10 = var16;
                    arg1 = var9;
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
}
