import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class class664 implements class619 {

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Ltd;")
    private class691 field9408 = class627.field8525;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Z")
    private boolean field9407;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Lnl;")
    public class50 field9405;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public int field9404;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Leea;")
    public class680 field9395;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lmc;")
    public class381 field9406;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    private int field9411;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    private int field9410;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lnd;")
    public static class409 field9401 = new class409("RC", 1);

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field9418 = 0;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field9413 = -1;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "Lcb;")
    public static class318 field9415 = new class318(1, 2);

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field9396;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field9400;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field9402;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field9403;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field9412;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field9414;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field9419;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "Lur;")
    public static class133 field9420;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static void method3676(byte arg0) {
        field9401 = null;
        field9420 = null;
        if (arg0 < 97) {
            method3676((byte) -64);
        }
        field9415 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    private final void method3677(boolean arg0) {
        if (arg0) {
            this.method172(null, (byte) -118);
        }
        field9412++;
        if (this.field9410 > 0) {
            this.field9406.method2308(this.field9410, -121, this.method3680(-125));
            this.field9410 = 0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)I")
    public final int method3678(int arg0) {
        field9399++;
        if (class680.field9664 == this.field9395) {
            if (class426.field5922 == this.field9405) {
                return 6407;
            }
            if (class420.field5862 == this.field9405) {
                return 6408;
            }
            if (class394.field5654 == this.field9405) {
                return 6406;
            }
            if (class609.field8310 == this.field9405) {
                return 6409;
            }
            if (class603.field8244 == this.field9405) {
                return 6410;
            }
            if (class168.field2104 == this.field9405) {
                return 6145;
            }
        } else if (class680.field9667 == this.field9395) {
            if (class426.field5922 == this.field9405) {
                return 34843;
            }
            if (class420.field5862 == this.field9405) {
                return 34842;
            }
            if (class394.field5654 == this.field9405) {
                return 34844;
            }
            if (class609.field8310 == this.field9405) {
                return 34846;
            }
            if (class603.field8244 == this.field9405) {
                return 34847;
            }
            if (class168.field2104 == this.field9405) {
                return 6145;
            }
        } else if (class680.field9668 == this.field9395) {
            if (class426.field5922 == this.field9405) {
                return 34837;
            }
            if (class420.field5862 == this.field9405) {
                return 34836;
            }
            if (class394.field5654 == this.field9405) {
                return 34838;
            }
            if (class609.field8310 == this.field9405) {
                return 34840;
            }
            if (class603.field8244 == this.field9405) {
                return 34841;
            }
            if (class168.field2104 == this.field9405) {
                return 6145;
            }
        }
        if (arg0 == -17641) {
            throw new IllegalStateException();
        }
        return -55;
    }

    @OriginalMember(owner = "client!lc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field9402++;
        this.method3677(false);
        super.finalize();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[FIBI)V")
    public final void method3679(int arg0, float[] arg1, int arg2, byte arg3, int arg4) {
        field9396++;
        int var6 = -12 / ((-arg3 - 81) / 32);
        if (arg0 > 0 && !class144.method986(arg0, (byte) -128)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class144.method986(arg4, (byte) -99)) {
            int var7 = this.field9405.field663;
            int var8 = 0;
            int var9 = arg0 >= arg4 ? arg4 : arg0;
            int var10 = arg0 >> 1;
            int var11 = arg4 >> 1;
            float[] var12 = arg1;
            float[] var13 = new float[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg2, var8, this.method3678(-17641), arg0, arg4, 0, class54.method313(-94, this.field9405), 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg0 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                var12 = var16;
                arg4 = var11;
                arg0 = var10;
                var9 >>= 0x1;
                var8++;
                var11 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)I")
    private final int method3680(int arg0) {
        int var2 = 5 / ((-arg0 - 9) / 54);
        field9416++;
        int var3 = this.field9395.field9661 * this.field9411 * this.field9405.field663;
        return this.field9407 ? var3 * 4 / 3 : var3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)I")
    public static final int method3681(boolean arg0, int arg1) {
        field9417++;
        if (arg0) {
            field9413 = 47;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method3682(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class675.field9559++;
        class482.field6489 = 0;
        for (int var6 = class331.field4843; var6 < class87.field1079; var6++) {
            class651[][] var15 = class145.field1841[var6];
            for (int var16 = class502.field6784; var16 < class368.field5298; var16++) {
                for (int var17 = class552.field7557; var17 < class542.field7444; var17++) {
                    class651 var18 = var15[var16][var17];
                    if (var18 != null) {
                        if (class554.field7580[var16 + class351.field5123 - class297.field3975][var17 + class351.field5123 - class274.field3710] && arg1 == null || var6 < arg2 || arg1[var6][var16][var17] != arg3) {
                            var18.field9235 = true;
                            var18.field9231 = true;
                            if (var18.field9228 == null) {
                                var18.field9223 = false;
                            } else {
                                var18.field9223 = true;
                            }
                            class482.field6489++;
                        } else {
                            var18.field9235 = false;
                            var18.field9231 = false;
                            var18.field9226 = 0;
                            if (var16 >= class297.field3975 - 16 && var16 <= class297.field3975 + 16 && var17 >= class274.field3710 - 16 && var17 <= class274.field3710 + 16 && (var18.field9220 != null || var18.field9224 != null || var18.field9238 != null || var18.field9234 != null || var18.field9227 != null || var18.field9228 != null)) {
                                class297.field3973.method512(var18, 19048);
                            }
                        }
                    }
                }
            }
        }
        for (int var7 = class331.field4843; var7 < class87.field1079; var7++) {
            if (class277.field3750.method1791() && var7 >= arg2 && arg1 != null) {
                int var8 = class554.field7580.length;
                if (class554.field7580.length + class502.field6784 > class149.field1872) {
                    var8 -= class554.field7580.length + class502.field6784 - class149.field1872;
                }
                int var9 = class554.field7580[0].length;
                if (class554.field7580[0].length + class552.field7557 > class334.field4887) {
                    var9 -= class554.field7580[0].length + class552.field7557 - class334.field4887;
                }
                int var10 = class171.field2144;
                while (true) {
                    if (var10 >= var8) {
                        class297.field3973.method516(class397.field5666[var7], -1, true, var7);
                        break;
                    }
                    int var11 = class502.field6784 + var10 - class171.field2144;
                    for (int var12 = class680.field9671; var12 < var9; var12++) {
                        class32.field307[var10][var12] = false;
                        if (class554.field7580[var10][var12]) {
                            int var13 = class552.field7557 + var12 - class680.field9671;
                            for (int var14 = var7; var14 >= 0; var14--) {
                                if (class145.field1841[var14][var11][var13] != null && class145.field1841[var14][var11][var13].field9239 == var7) {
                                    class32.field307[var10][var12] = class145.field1841[var14][var11][var13].field9235;
                                    break;
                                }
                            }
                        }
                    }
                    var10++;
                }
            } else {
                class297.field3973.method516(class397.field5666[var7], -1, false, var7);
            }
            class297.field3973.method510(true);
        }
        if (!class33.method199(true)) {
            class33.method199(false);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ltd;B)V")
    public final void method172(class691 arg0, byte arg1) {
        field9419++;
        int var3 = 118 / ((2 - arg1) / 53);
        if (this.field9408 != arg0) {
            this.field9408 = arg0;
            this.method3686(567693345);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
    private final void method3683(int arg0, int arg1) {
        this.field9406.field4376 -= arg0;
        field9403++;
        if (arg1 == 34837) {
            this.field9406.field4376 += this.method3680(86);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B[BIII)V")
    public final void method3684(byte arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field9398++;
        if (arg2 > 0 && !class144.method986(arg2, (byte) -103)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class144.method986(arg3, (byte) -126)) {
            if (arg0 != 42) {
                method3687(-74, null);
            }
            int var6 = this.field9405.field663;
            int var7 = 0;
            int var8 = arg3 <= arg2 ? arg3 : arg2;
            int var9 = arg2 >> 1;
            int var10 = arg3 >> 1;
            byte[] var11 = arg1;
            byte[] var12 = new byte[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Dub(arg4, var7, this.method3678(-17641), arg2, arg3, 0, class54.method313(-123, this.field9405), 5121, var11, 0);
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
                byte[] var15 = var12;
                var12 = var11;
                arg2 = var9;
                var11 = var15;
                arg3 = var10;
                var10 >>= 0x1;
                var8 >>= 0x1;
                var9 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([IIIII)V")
    public final void method3685(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field9409++;
        if (arg1 > 0 && !class144.method986(arg1, (byte) -100)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class144.method986(arg2, (byte) -124)) {
            throw new IllegalArgumentException("");
        } else if (class420.field5862 == this.field9405) {
            int var6 = 0;
            int var7 = arg1 < arg2 ? arg1 : arg2;
            int var8 = arg1 >> 1;
            if (arg4 == -7441) {
                int var9 = arg2 >> 1;
                int[] var10 = arg0;
                int[] var11 = new int[var8 * var9];
                while (true) {
                    OpenGL.glTexImage2Di(arg3, var6, this.method3678(-17641), arg1, arg2, 0, 32993, this.field9406.field5546, var10, 0);
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
                            int var21 = (var18 & 0xFF3838) >> 16;
                            int var22 = var18 & 0xFF;
                            int var23 = var18 >> 8 & 0xFF;
                            int var24 = var10[var14++];
                            int var25 = var18 >> 24 & 0xFF;
                            int var26 = (var19 >> 16 & 0xFF) + var21;
                            int var27 = (var19 & 0xFF) + var22;
                            int var28 = (var19 >> 24 & 0xFF) + var25;
                            int var29 = (var19 >> 8 & 0xFF) + var23;
                            int var30 = (var20 & 0xFF) + var27;
                            int var31 = ((var20 & 0xFF65) >> 8) + var29;
                            int var32 = ((var20 & 0xFF8CFF) >> 16) + var26;
                            int var33 = (var20 >> 24 & 0xFF) + var28;
                            int var34 = ((var24 & 0xFF231C) >> 16) + var32;
                            int var35 = (var24 & 0xFF) + var30;
                            int var36 = (var24 >> 24 & 0xFF) + var33;
                            int var37 = ((var24 & 0xFF81) >> 8) + var31;
                            var11[var12++] = class288.method1722(class230.method1424(1020, var35) >> 2, class288.method1722(class230.method1424(65280, var37 << 6), class288.method1722(class230.method1424(1020, var36) << 22, class230.method1424(1020, var34) << 14)));
                        }
                        var14 += arg1;
                        var13 += arg1;
                    }
                    var11 = var10;
                    arg1 = var8;
                    arg2 = var9;
                    var10 = var15;
                    var6++;
                    var7 >>= 0x1;
                    var9 >>= 0x1;
                    var8 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
    private final void method3686(int arg0) {
        field9397++;
        if (arg0 != 567693345) {
            this.field9408 = null;
        }
        this.field9406.method1884(this, -2);
        if (class627.field8525 == this.field9408) {
            OpenGL.glTexParameteri(this.field9404, 10241, this.field9407 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field9404, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field9404, 10241, this.field9407 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field9404, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public final void method163(int arg0) {
        field9400++;
        int var2 = this.field9406.method1980(0);
        if (arg0 != 9901) {
            this.method3685(null, -5, -121, 105, -86);
        }
        int var3 = this.field9406.field5552[var2];
        if (this.field9404 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field9404);
            this.field9406.field5552[var2] = this.field9404;
        }
        OpenGL.glBindTexture(this.field9404, this.field9410);
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lmc;ILnl;Leea;IZ)V")
    public class664(class381 arg0, int arg1, class50 arg2, class680 arg3, int arg4, boolean arg5) {
        this.field9407 = arg5;
        this.field9405 = arg2;
        this.field9404 = arg1;
        this.field9395 = arg3;
        this.field9406 = arg0;
        this.field9411 = arg4;
        OpenGL.glGenTextures(1, class576.field7964, 0);
        this.field9410 = class576.field7964[0];
        this.method3686(567693345);
        this.method3683(0, 34837);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILfca;)V")
    public static final void method3687(int arg0, class188 arg1) {
        if (arg1.field2304 == 5 && arg1.field2324 != -1) {
            class33.method198(arg1, -16777216, class9.field103);
        }
        field9414++;
        if (arg0 != 1640) {
            method3687(10, null);
        }
    }
}
