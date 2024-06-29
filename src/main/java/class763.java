import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class class763 implements class123 {

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Lwga;")
    private class779 field10536 = class503.field6966;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    private int field10535;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "Lsw;")
    public class787 field10555;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "Lpa;")
    public class391 field10545;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Lig;")
    public class258 field10538;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "Z")
    private boolean field10553;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public int field10554;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    private int field10542;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Ljw;")
    public static class581 field10533 = new class581(53, 3);

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field10534;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field10537;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field10539;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field10540;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field10541;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field10543;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field10544;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field10546;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field10547;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field10548;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field10549;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field10550;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field10551;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field10552;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V", line = 3)
    private final void method4230(byte arg0) {
        this.field10545.method3520(true, this);
        field10547++;
        if (arg0 >= -53) {
            return;
        }
        if (class503.field6966 == this.field10536) {
            OpenGL.glTexParameteri(this.field10554, 10241, this.field10553 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field10554, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field10554, 10241, this.field10553 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field10554, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V", line = 27)
    public static final void method4231(int arg0) {
        field10544++;
        int var1 = 0;
        if (arg0 > -110) {
            return;
        }
        for (int var2 = 0; var2 < class597.field8132; var2++) {
            for (int var3 = 0; var3 < class628.field8800; var3++) {
                if (class718.method4012(var1, true, var3, 110, class626.field8501, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 67)
    public final void method1004(int arg0) {
        field10550++;
        int var2 = this.field10545.method3476(-97);
        int var3 = this.field10545.field5793[var2];
        if (this.field10554 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field10554);
            this.field10545.field5793[var2] = this.field10554;
        }
        OpenGL.glBindTexture(this.field10554, this.field10542);
        if (arg0 != 20464) {
            method4233(56);
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)V", line = 97)
    private final void method4232(byte arg0) {
        field10549++;
        if (this.field10542 > 0) {
            this.field10545.method2480(this.field10542, (byte) 90, this.method4236(40));
            this.field10542 = 0;
        }
        if (arg0 < 28) {
            method4231(-27);
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V", line = 113)
    public static void method4233(int arg0) {
        if (arg0 >= 59) {
            field10533 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)V", line = 124)
    private final void method4234(int arg0, boolean arg1) {
        if (arg1) {
            this.field10538 = null;
        }
        this.field10545.field8629 -= arg0;
        field10541++;
        this.field10545.field8629 += this.method4236(-128);
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lpa;ILsw;Lig;IZ)V", line = 627)
    public class763(class391 arg0, int arg1, class787 arg2, class258 arg3, int arg4, boolean arg5) {
        this.field10535 = arg4;
        this.field10555 = arg2;
        this.field10545 = arg0;
        this.field10538 = arg3;
        this.field10553 = arg5;
        this.field10554 = arg1;
        OpenGL.glGenTextures(1, class192.field2556, 0);
        this.field10542 = class192.field2556[0];
        this.method4230((byte) -69);
        this.method4234(0, false);
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)I", line = 145)
    public final int method4235(int arg0) {
        field10540++;
        if (class258.field3847 == this.field10538) {
            if (class742.field10243 == this.field10555) {
                return 6407;
            }
            if (class305.field4404 == this.field10555) {
                return 6408;
            }
            if (class250.field3704 == this.field10555) {
                return 6406;
            }
            if (class170.field2268 == this.field10555) {
                return 6409;
            }
            if (class125.field1891 == this.field10555) {
                return 6410;
            }
            if (class166.field2239 == this.field10555) {
                return 6145;
            }
        } else if (class258.field3850 == this.field10538) {
            if (class742.field10243 == this.field10555) {
                return 34843;
            }
            if (class305.field4404 == this.field10555) {
                return 34842;
            }
            if (class250.field3704 == this.field10555) {
                return 34844;
            }
            if (class170.field2268 == this.field10555) {
                return 34846;
            }
            if (class125.field1891 == this.field10555) {
                return 34847;
            }
            if (class166.field2239 == this.field10555) {
                return 6145;
            }
        } else if (class258.field3851 == this.field10538) {
            if (class742.field10243 == this.field10555) {
                return 34837;
            }
            if (class305.field4404 == this.field10555) {
                return 34836;
            }
            if (class250.field3704 == this.field10555) {
                return 34838;
            }
            if (class170.field2268 == this.field10555) {
                return 34840;
            }
            if (class125.field1891 == this.field10555) {
                return 34841;
            }
            if (class166.field2239 == this.field10555) {
                return 6145;
            }
        }
        if (arg0 != -11391) {
            this.field10553 = true;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)I", line = 244)
    private final int method4236(int arg0) {
        int var2 = -41 % ((arg0 + 60) / 51);
        field10537++;
        int var3 = this.field10538.field3842 * this.field10535 * this.field10555.field10833;
        return this.field10553 ? var3 * 4 / 3 : var3;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B[BIII)V", line = 256)
    public final void method4237(byte arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field10534++;
        if (arg2 > 0 && !class117.method957(-6602, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class117.method957(-6602, arg3)) {
            int var6 = this.field10555.field10833;
            int var7 = 0;
            int var8 = arg2 < arg3 ? arg2 : arg3;
            int var9 = arg2 >> 1;
            if (arg0 > -19) {
                this.field10553 = true;
            }
            int var10 = arg3 >> 1;
            byte[] var11 = arg1;
            byte[] var12 = new byte[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Dub(arg4, var7, this.method4235(-11391), arg2, arg3, 0, class719.method4017(39, this.field10555), 5121, var11, 0);
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
                        var17 += var13;
                        var18 += var13;
                    }
                }
                byte[] var15 = var12;
                var12 = var11;
                var11 = var15;
                arg2 = var9;
                arg3 = var10;
                var8 >>= 0x1;
                var9 >>= 0x1;
                var7++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILwga;)V", line = 353)
    public final void method1003(int arg0, class779 arg1) {
        if (arg0 > -104) {
            this.method4238(-29, 33, null, -69, -109);
        }
        if (this.field10536 != arg1) {
            this.field10536 = arg1;
            this.method4230((byte) -109);
        }
        field10551++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[FII)V", line = 369)
    public final void method4238(int arg0, int arg1, float[] arg2, int arg3, int arg4) {
        field10548++;
        if (arg1 > 0 && !class117.method957(-6602, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class117.method957(-6602, arg0)) {
            if (arg3 != 5126) {
                this.method4235(-80);
            }
            int var6 = this.field10555.field10833;
            int var7 = 0;
            int var8 = arg0 <= arg1 ? arg0 : arg1;
            int var9 = arg1 >> 1;
            int var10 = arg0 >> 1;
            float[] var11 = arg2;
            float[] var12 = new float[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var7, this.method4235(-11391), arg1, arg0, 0, class719.method4017(53, this.field10555), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg1 * var6;
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
                var11 = var15;
                arg1 = var9;
                arg0 = var10;
                var8 >>= 0x1;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjp;)Lfl;", line = 467)
    public static final class770 method4239(int arg0, class376 arg1) {
        field10546++;
        class731 var2 = class613.method3384((byte) -71, arg1);
        if (arg0 <= 24) {
            return null;
        } else {
            int var3 = arg1.method2355(3);
            return new class770(var2.field9027, var2.field9024, var2.field9031, var2.field9028, var2.field9033, var2.field9025, var2.field9029, var2.field9034, var2.field9032, var2.field10134, var2.field10132, var2.field10137, var2.field10135, var2.field10138, var2.field10136, var3);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()V", line = 482)
    public static final void method4240() {
        class201.field2670 = class201.field2666;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([IIIZI)V", line = 485)
    public final void method4241(int[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field10552++;
        if (arg2 > 0 && !class117.method957(-6602, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class117.method957(-6602, arg4)) {
            throw new IllegalArgumentException("");
        } else if (class305.field4404 == this.field10555) {
            int var6 = 0;
            int var7 = arg4 <= arg2 ? arg4 : arg2;
            int var8 = arg2 >> 1;
            if (arg3) {
                int var9 = arg4 >> 1;
                int[] var10 = arg0;
                int[] var11 = new int[var8 * var9];
                while (true) {
                    OpenGL.glTexImage2Di(arg1, var6, this.method4235(-11391), arg2, arg4, 0, 32993, this.field10545.field5792, var10, 0);
                    if (var7 <= 1) {
                        return;
                    }
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = arg2 + var13;
                    int[] var15 = var11;
                    for (int var16 = 0; var16 < var9; var16++) {
                        for (int var17 = 0; var17 < var8; var17++) {
                            int var18 = var10[var13++];
                            int var19 = var10[var14++];
                            int var20 = var10[var13++];
                            int var21 = var18 >> 24 & 0xFF;
                            int var22 = (var18 & 0xFFB0) >> 8;
                            int var23 = (var18 & 0xFF75B2) >> 16;
                            int var24 = var10[var14++];
                            int var25 = var18 & 0xFF;
                            int var26 = (var20 >> 24 & 0xFF) + var21;
                            int var27 = (var20 >> 8 & 0xFF) + var22;
                            int var28 = (var20 & 0xFF) + var25;
                            int var29 = (var20 >> 16 & 0xFF) + var23;
                            int var30 = ((var19 & 0xFFA167) >> 16) + var29;
                            int var31 = (var19 >> 24 & 0xFF) + var26;
                            int var32 = (var19 & 0xFF) + var28;
                            int var33 = ((var19 & 0xFF3A) >> 8) + var27;
                            int var34 = (var24 >> 8 & 0xFF) + var33;
                            int var35 = (var24 >> 24 & 0xFF) + var31;
                            int var36 = ((var24 & 0xFF69D5) >> 16) + var30;
                            int var37 = (var24 & 0xFF) + var32;
                            var11[var12++] = class213.method1409(class213.method1409(class213.method1409(class440.method2643(1020, var36) << 14, class440.method2643(1020, var35) << 22), class440.method2643(65280, var34 << 6)), class440.method2643(255, var37 >> 2));
                        }
                        var14 += arg2;
                        var13 += arg2;
                    }
                    var11 = var10;
                    var10 = var15;
                    arg2 = var8;
                    arg4 = var9;
                    var7 >>= 0x1;
                    var9 >>= 0x1;
                    var8 >>= 0x1;
                    var6++;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pg", name = "finalize", descriptor = "()V", line = 596)
    protected final void finalize() throws Throwable {
        field10539++;
        this.method4232((byte) 71);
        super.finalize();
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lor;Z)V", line = 606)
    public static final void method4242(class668 arg0, boolean arg1) {
        if (class60.field823 == arg0.field9342) {
            class627.field8773[arg0.field9351] = true;
        }
        if (!arg1) {
            field10533 = null;
        }
        field10543++;
    }
}
