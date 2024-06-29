import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class724 implements class132 {

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lqt;")
    private class525 field9512 = class212.field2911;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Ljc;")
    public class179 field9498;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Ltn;")
    public class749 field9499;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    private int field9500;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "Lds;")
    public class73 field9517;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Z")
    private boolean field9511;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public int field9516;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    private int field9501;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field9504 = 0;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field9502;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field9503;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field9505;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field9506;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field9507;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field9508;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field9509;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field9510;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field9513;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field9514;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field9515;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII[I)V")
    public final void method3874(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field9505++;
        if (arg1 >= -124) {
            this.method774((byte) 94, null);
        }
        if (arg3 > 0 && !class735.method3997(arg3, (byte) -124)) {
            throw new IllegalArgumentException("");
        } else if (arg0 > 0 && !class735.method3997(arg0, (byte) -90)) {
            throw new IllegalArgumentException("");
        } else if (class417.field5505 == this.field9499) {
            int var6 = 0;
            int var7 = arg0 <= arg3 ? arg0 : arg3;
            int var8 = arg3 >> 1;
            int var9 = arg0 >> 1;
            int[] var10 = arg4;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg2, var6, this.method3878(255), arg3, arg0, 0, 32993, this.field9498.field2454, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg3 + var13;
                int[] var15 = var11;
                for (int var16 = 0; var16 < var9; var16++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var14++];
                        int var20 = var10[var13++];
                        int var21 = var18 & 0xFF;
                        int var22 = var10[var14++];
                        int var23 = (var18 & 0xFF7659) >> 16;
                        int var24 = var18 >> 24 & 0xFF;
                        int var25 = (var18 & 0xFFB9) >> 8;
                        int var26 = (var20 >> 24 & 0xFF) + var24;
                        int var27 = ((var20 & 0xFF59) >> 8) + var25;
                        int var28 = (var20 & 0xFF) + var21;
                        int var29 = (var20 >> 16 & 0xFF) + var23;
                        int var30 = (var19 >> 16 & 0xFF) + var29;
                        int var31 = ((var19 & 0xFF9D) >> 8) + var27;
                        int var32 = (var19 & 0xFF) + var28;
                        int var33 = (var19 >> 24 & 0xFF) + var26;
                        int var34 = (var22 >> 24 & 0xFF) + var33;
                        int var35 = ((var22 & 0xFF2F) >> 8) + var31;
                        int var36 = ((var22 & 0xFFF680) >> 16) + var30;
                        int var37 = (var22 & 0xFF) + var32;
                        var11[var12++] = class77.method473(class77.method473(class77.method473(class249.method1625(1020, var34) << 22, class249.method1625(var36 << 14, 16711680)), class249.method1625(1020, var35) << 6), class249.method1625(1020, var37) >> 2);
                    }
                    var13 += arg3;
                    var14 += arg3;
                }
                var11 = var10;
                var10 = var15;
                arg3 = var8;
                arg0 = var9;
                var7 >>= 0x1;
                var8 >>= 0x1;
                var9 >>= 0x1;
                var6++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLqt;)V")
    public final void method774(byte arg0, class525 arg1) {
        if (this.field9512 != arg1) {
            this.field9512 = arg1;
            this.method3881(14495);
        }
        field9510++;
        int var3 = 30 / ((-arg0 - 66) / 35);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    private final void method3875(boolean arg0) {
        if (arg0) {
            this.field9511 = false;
        }
        if (this.field9501 > 0) {
            this.field9498.method1198(this.field9501, -105, this.method3876(true));
            this.field9501 = 0;
        }
        field9513++;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)I")
    private final int method3876(boolean arg0) {
        if (!arg0) {
            this.method3874(-54, 33, -24, -107, null);
        }
        field9503++;
        int var2 = this.field9499.field10221 * this.field9517.field987 * this.field9500;
        return this.field9511 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
    private final void method3877(int arg0, int arg1) {
        this.field9498.field9104 -= arg1;
        field9502++;
        this.field9498.field9104 += this.method3876(true);
        if (arg0 != 34836) {
            field9504 = 14;
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)I")
    public final int method3878(int arg0) {
        field9514++;
        if (arg0 != 255) {
            field9504 = -47;
        }
        if (class73.field990 == this.field9517) {
            if (class276.field3599 == this.field9499) {
                return 6407;
            }
            if (class417.field5505 == this.field9499) {
                return 6408;
            }
            if (class483.field6239 == this.field9499) {
                return 6406;
            }
            if (class104.field1407 == this.field9499) {
                return 6409;
            }
            if (class470.field6127 == this.field9499) {
                return 6410;
            }
            if (class238.field3237 == this.field9499) {
                return 6145;
            }
        } else if (class73.field993 == this.field9517) {
            if (class276.field3599 == this.field9499) {
                return 34843;
            }
            if (class417.field5505 == this.field9499) {
                return 34842;
            }
            if (class483.field6239 == this.field9499) {
                return 34844;
            }
            if (class104.field1407 == this.field9499) {
                return 34846;
            }
            if (class470.field6127 == this.field9499) {
                return 34847;
            }
            if (class238.field3237 == this.field9499) {
                return 6145;
            }
        } else if (class73.field994 == this.field9517) {
            if (class276.field3599 == this.field9499) {
                return 34837;
            }
            if (class417.field5505 == this.field9499) {
                return 34836;
            }
            if (class483.field6239 == this.field9499) {
                return 34838;
            }
            if (class104.field1407 == this.field9499) {
                return 34840;
            }
            if (class470.field6127 == this.field9499) {
                return 34841;
            }
            if (class238.field3237 == this.field9499) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II[FII)V")
    public final void method3879(int arg0, int arg1, float[] arg2, int arg3, int arg4) {
        field9508++;
        if (arg4 > 0 && !class735.method3997(arg4, (byte) -127)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class735.method3997(arg0, (byte) -102)) {
            int var6 = this.field9499.field10221;
            int var7 = 0;
            int var8 = arg4 >= arg0 ? arg0 : arg4;
            int var9 = arg4 >> 1;
            int var10 = arg0 >> 1;
            if (arg1 == -32722) {
                float[] var11 = arg2;
                float[] var12 = new float[var6 * var9 * var10];
                while (true) {
                    OpenGL.glTexImage2Df(arg3, var7, this.method3878(255), arg4, arg0, 0, class735.method3999((byte) -85, this.field9499), 5126, var11, 0);
                    if (var8 <= 1) {
                        return;
                    }
                    int var13 = arg4 * var6;
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
                            var17 += var13;
                            var18 += var13;
                        }
                    }
                    float[] var15 = var12;
                    var12 = var11;
                    arg4 = var9;
                    var11 = var15;
                    arg0 = var10;
                    var10 >>= 0x1;
                    var9 >>= 0x1;
                    var7++;
                    var8 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public final void method773(byte arg0) {
        field9506++;
        int var2 = this.field9498.method3733((byte) 117);
        int var3 = this.field9498.field2450[var2];
        if (this.field9516 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field9516);
            this.field9498.field2450[var2] = this.field9516;
        }
        if (arg0 >= -12) {
            this.method774((byte) -66, null);
        }
        OpenGL.glBindTexture(this.field9516, this.field9501);
    }

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field9507++;
        this.method3875(false);
        super.finalize();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([BIBII)V")
    public final void method3880(byte[] arg0, int arg1, byte arg2, int arg3, int arg4) {
        field9509++;
        if (arg3 > 0 && !class735.method3997(arg3, (byte) -106)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class735.method3997(arg1, (byte) -85)) {
            int var6 = this.field9499.field10221;
            int var7 = 0;
            int var8 = arg1 > arg3 ? arg3 : arg1;
            int var9 = arg3 >> 1;
            int var10 = arg1 >> 1;
            byte[] var11 = arg0;
            byte[] var12 = new byte[var6 * var10 * var9];
            if (arg2 <= 49) {
                this.field9500 = -127;
            }
            while (true) {
                OpenGL.glTexImage2Dub(arg4, var7, this.method3878(255), arg3, arg1, 0, class735.method3999((byte) -85, this.field9499), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg3 * var6;
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
                arg1 = var10;
                arg3 = var9;
                var11 = var15;
                var7++;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
    private final void method3881(int arg0) {
        this.field9498.method3756(arg0 ^ 0x3895, this);
        if (arg0 != 14495) {
            return;
        }
        field9515++;
        if (class212.field2911 == this.field9512) {
            OpenGL.glTexParameteri(this.field9516, 10241, this.field9511 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field9516, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field9516, 10241, this.field9511 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field9516, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ljc;ILtn;Lds;IZ)V")
    public class724(class179 arg0, int arg1, class749 arg2, class73 arg3, int arg4, boolean arg5) {
        this.field9498 = arg0;
        this.field9499 = arg2;
        this.field9500 = arg4;
        this.field9517 = arg3;
        this.field9511 = arg5;
        this.field9516 = arg1;
        OpenGL.glGenTextures(1, class483.field6240, 0);
        this.field9501 = class483.field6240[0];
        this.method3881(14495);
        this.method3877(34836, 0);
    }
}
