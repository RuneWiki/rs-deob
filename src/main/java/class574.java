import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public abstract class class574 implements class686 {

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "Ldj;")
    private class197 field8141 = class377.field5117;

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "Z")
    private boolean field8145;

    @OriginalMember(owner = "client!mfa", name = "r", descriptor = "Lrt;")
    public class179 field8157;

    @OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
    public int field8151;

    @OriginalMember(owner = "client!mfa", name = "p", descriptor = "Lsq;")
    public class485 field8155;

    @OriginalMember(owner = "client!mfa", name = "n", descriptor = "I")
    private int field8153;

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "Lmr;")
    public class221 field8143;

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "I")
    private int field8146;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
    public static int field8142;

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
    public static int field8144;

    @OriginalMember(owner = "client!mfa", name = "h", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!mfa", name = "i", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!mfa", name = "j", descriptor = "I")
    public static int field8149;

    @OriginalMember(owner = "client!mfa", name = "k", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!mfa", name = "m", descriptor = "I")
    public static int field8152;

    @OriginalMember(owner = "client!mfa", name = "o", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!mfa", name = "q", descriptor = "I")
    public static int field8156;

    @OriginalMember(owner = "client!mfa", name = "s", descriptor = "I")
    public static int field8158;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)V")
    public final void method2076(boolean arg0) {
        if (!arg0) {
            return;
        }
        field8154++;
        int var2 = this.field8143.method2043(4);
        int var3 = this.field8143.field2736[var2];
        if (this.field8151 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field8151);
            this.field8143.field2736[var2] = this.field8151;
        }
        OpenGL.glBindTexture(this.field8151, this.field8146);
    }

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "(I)V")
    private final void method3241(int arg0) {
        if (arg0 != 6408) {
            this.method3243(68, false);
        }
        if (this.field8146 > 0) {
            this.field8143.method1277((byte) 115, this.method3246(22), this.field8146);
            this.field8146 = 0;
        }
        field8144++;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I[BIII)V")
    public final void method3242(int arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field8156++;
        if (arg3 != 22489) {
            return;
        }
        if (arg0 > 0 && !class483.method2792(arg0, -3)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class483.method2792(arg2, -3)) {
            int var6 = this.field8155.field6991;
            int var7 = 0;
            int var8 = arg2 > arg0 ? arg0 : arg2;
            int var9 = arg0 >> 1;
            int var10 = arg2 >> 1;
            byte[] var11 = arg1;
            byte[] var12 = new byte[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Dub(arg4, var7, this.method3244(8), arg0, arg2, 0, class181.method1102(this.field8155, (byte) 38), 5121, var11, 0);
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
                byte[] var15 = var12;
                var12 = var11;
                var11 = var15;
                arg0 = var9;
                arg2 = var10;
                var10 >>= 0x1;
                var7++;
                var8 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IZ)V")
    private final void method3243(int arg0, boolean arg1) {
        field8149++;
        this.field8143.field4502 -= arg0;
        this.field8143.field4502 += this.method3246(78);
        if (!arg1) {
            this.method3244(42);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "(I)I")
    public final int method3244(int arg0) {
        field8158++;
        if (class179.field2008 == this.field8157) {
            if (class293.field3663 == this.field8155) {
                return 6407;
            }
            if (class412.field5529 == this.field8155) {
                return 6408;
            }
            if (class274.field3431 == this.field8155) {
                return 6406;
            }
            if (class379.field5140 == this.field8155) {
                return 6409;
            }
            if (class363.field4868 == this.field8155) {
                return 6410;
            }
            if (class496.field7182 == this.field8155) {
                return 6145;
            }
        } else if (class179.field2011 == this.field8157) {
            if (class293.field3663 == this.field8155) {
                return 34843;
            }
            if (class412.field5529 == this.field8155) {
                return 34842;
            }
            if (class274.field3431 == this.field8155) {
                return 34844;
            }
            if (class379.field5140 == this.field8155) {
                return 34846;
            }
            if (class363.field4868 == this.field8155) {
                return 34847;
            }
            if (class496.field7182 == this.field8155) {
                return 6145;
            }
        } else if (class179.field2012 == this.field8157) {
            if (class293.field3663 == this.field8155) {
                return 34837;
            }
            if (class412.field5529 == this.field8155) {
                return 34836;
            }
            if (class274.field3431 == this.field8155) {
                return 34838;
            }
            if (class379.field5140 == this.field8155) {
                return 34840;
            }
            if (class363.field4868 == this.field8155) {
                return 34841;
            }
            if (class496.field7182 == this.field8155) {
                return 6145;
            }
        }
        int var2 = 13 / ((arg0 - 67) / 32);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Ldj;B)V")
    public final void method2077(class197 arg0, byte arg1) {
        if (arg1 != 93) {
            this.method3246(-99);
        }
        field8140++;
        if (this.field8141 != arg0) {
            this.field8141 = arg0;
            this.method3247(true);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II[III)V")
    public final void method3245(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field8148++;
        if (arg4 > 0 && !class483.method2792(arg4, -3)) {
            throw new IllegalArgumentException("");
        } else if (arg1 > 0 && !class483.method2792(arg1, -3)) {
            throw new IllegalArgumentException("");
        } else if (class412.field5529 == this.field8155) {
            int var6 = 0;
            int var7 = arg4 >= arg1 ? arg1 : arg4;
            int var8 = arg4 >> 1;
            int var9 = arg1 >> 1;
            int[] var10 = arg2;
            int[] var11 = new int[var8 * var9];
            if (arg0 != 13787) {
                this.field8151 = -126;
            }
            while (true) {
                OpenGL.glTexImage2Di(arg3, var6, this.method3244(123), arg4, arg1, 0, 32993, this.field8143.field2739, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg4 + var13;
                int[] var15 = var11;
                for (int var16 = 0; var16 < var9; var16++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var13++];
                        int var20 = var10[var14++];
                        int var21 = var10[var14++];
                        int var22 = var18 & 0xFF;
                        int var23 = (var18 & 0xFFA3) >> 8;
                        int var24 = (var18 & 0xFFBA82) >> 16;
                        int var25 = var18 >> 24 & 0xFF;
                        int var26 = (var19 >> 24 & 0xFF) + var25;
                        int var27 = (var19 & 0xFF) + var22;
                        int var28 = (var19 >> 16 & 0xFF) + var24;
                        int var29 = (var19 >> 8 & 0xFF) + var23;
                        int var30 = (var20 >> 24 & 0xFF) + var26;
                        int var31 = (var20 & 0xFF) + var27;
                        int var32 = (var20 >> 8 & 0xFF) + var29;
                        int var33 = ((var20 & 0xFF09BF) >> 16) + var28;
                        int var34 = (var21 >> 24 & 0xFF) + var30;
                        int var35 = ((var21 & 0xFFDBD4) >> 16) + var33;
                        int var36 = (var21 >> 8 & 0xFF) + var32;
                        int var37 = (var21 & 0xFF) + var31;
                        var11[var12++] = class422.method2436(class105.method572(var37 >> 2, 255), class422.method2436(class422.method2436(class105.method572(var34, 1020) << 22, class105.method572(var35, 1020) << 14), class105.method572(1020, var36) << 6));
                    }
                    var13 += arg4;
                    var14 += arg4;
                }
                var11 = var10;
                arg1 = var9;
                arg4 = var8;
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

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "(I)I")
    private final int method3246(int arg0) {
        field8142++;
        if (arg0 <= 14) {
            this.method3246(-113);
        }
        int var2 = this.field8155.field6991 * this.field8157.field2003 * this.field8153;
        return this.field8145 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!mfa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field8150++;
        this.method3241(6408);
        super.finalize();
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(Z)V")
    private final void method3247(boolean arg0) {
        this.field8143.method1997(126, this);
        if (!arg0) {
            this.method3242(-40, null, -97, 95, 124);
        }
        field8152++;
        if (class377.field5117 == this.field8141) {
            OpenGL.glTexParameteri(this.field8151, 10241, this.field8145 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field8151, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field8151, 10241, this.field8145 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field8151, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "([FIIII)V")
    public final void method3248(float[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field8147++;
        if (arg2 > 0 && !class483.method2792(arg2, -3)) {
            throw new IllegalArgumentException("");
        } else if (arg3 >= arg4 || class483.method2792(arg4, -3)) {
            int var6 = this.field8155.field6991;
            int var7 = 0;
            int var8 = arg4 > arg2 ? arg2 : arg4;
            int var9 = arg2 >> 1;
            int var10 = arg4 >> 1;
            float[] var11 = arg0;
            float[] var12 = new float[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Df(arg1, var7, this.method3244(-121), arg2, arg4, 0, class181.method1102(this.field8155, (byte) 56), 5126, var11, 0);
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
                            float var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            float var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = var26 * 0.25F;
                            var16 += var6;
                        }
                        var17 += var13;
                        var18 += var13;
                    }
                }
                var12 = var11;
                arg2 = var9;
                var11 = var14;
                arg4 = var10;
                var8 >>= 0x1;
                var7++;
                var9 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lmr;ILsq;Lrt;IZ)V")
    public class574(class221 arg0, int arg1, class485 arg2, class179 arg3, int arg4, boolean arg5) {
        this.field8145 = arg5;
        this.field8157 = arg3;
        this.field8151 = arg1;
        this.field8155 = arg2;
        this.field8153 = arg4;
        this.field8143 = arg0;
        OpenGL.glGenTextures(1, class560.field8000, 0);
        this.field8146 = class560.field8000[0];
        this.method3247(true);
        this.method3243(0, true);
    }
}
