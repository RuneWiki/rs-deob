import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public abstract class class42 implements class12 {

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "Llda;")
    private class485 field499 = class601.field8433;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "Z")
    private boolean field502;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "Lwt;")
    public class309 field510;

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "Lbda;")
    public class505 field516;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
    public int field508;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "Lfha;")
    public class378 field506;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Llda;I)V", line = 3)
    public final void method81(class485 arg0, int arg1) {
        if (this.field499 != arg0) {
            this.field499 = arg0;
            this.method285((byte) 46);
        }
        field505++;
        if (arg1 != -21969) {
            this.field513 = -104;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)V", line = 19)
    private final void method277(int arg0, int arg1) {
        this.field506.field3515 -= arg0;
        field503++;
        this.field506.field3515 += this.method279((byte) -114);
        if (arg1 != -6203) {
            this.field506 = null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILha;)V", line = 41)
    public static final void method278(int arg0, class58 arg1) {
        class415.field5857 = new class655[class24.field340.length];
        field512++;
        if (arg0 != 255) {
            method282(44, -100);
        }
        for (int var2 = 0; var2 < class24.field340.length; var2++) {
            int var3 = class24.field340[var2];
            class143 var4 = class228.method1422(class735.field10238, arg0 ^ 0xFD, var3);
            class59 var5 = arg1.method459(var4, class204.method1236(class288.field4076, var3), true);
            class415.field5857[var2] = new class655(var5, var4);
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V", line = 67)
    public final void method80(int arg0) {
        field514++;
        int var2 = this.field506.method1655((byte) 123);
        int var3 = this.field506.field5413[var2];
        if (this.field508 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field508);
            this.field506.field5413[var2] = this.field508;
        }
        OpenGL.glBindTexture(this.field508, this.field513);
        if (arg0 != 20276) {
            this.field516 = null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "finalize", descriptor = "()V", line = 99)
    protected final void finalize() throws Throwable {
        field517++;
        this.method286(-126);
        super.finalize();
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)I", line = 110)
    private final int method279(byte arg0) {
        field515++;
        int var2 = this.field516.field7239 * this.field510.field4299 * this.field498;
        if (arg0 == -114) {
            return this.field502 ? var2 * 4 / 3 : var2;
        } else {
            return 76;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "([FIIIZ)V", line = 124)
    public final void method280(float[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field501++;
        if (arg3 > 0 && !class253.method1681(arg3, (byte) 81)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class253.method1681(arg1, (byte) 112)) {
            int var6 = this.field516.field7239;
            int var7 = 0;
            if (!arg4) {
                int var8 = arg3 < arg1 ? arg3 : arg1;
                int var9 = arg3 >> 1;
                int var10 = arg1 >> 1;
                float[] var11 = arg0;
                float[] var12 = new float[var6 * var9 * var10];
                while (true) {
                    OpenGL.glTexImage2Df(arg2, var7, this.method284(-125), arg3, arg1, 0, class651.method3587((byte) -88, this.field516), 5126, var11, 0);
                    if (var8 <= 1) {
                        return;
                    }
                    int var13 = arg3 * var6;
                    float[] var14 = var12;
                    for (int var15 = 0; var15 < var6; var15++) {
                        int var16 = var15;
                        int var17 = var15;
                        int var18 = var15 + var13;
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
                    var12 = var11;
                    arg3 = var9;
                    arg1 = var10;
                    var11 = var14;
                    var8 >>= 0x1;
                    var9 >>= 0x1;
                    var10 >>= 0x1;
                    var7++;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[BII)V", line = 225)
    public final void method281(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field518++;
        if (arg3 > 0 && !class253.method1681(arg3, (byte) 120)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class253.method1681(arg4, (byte) 99)) {
            int var6 = this.field516.field7239;
            int var7 = 0;
            int var8 = -32 / ((5 - arg0) / 60);
            int var9 = arg3 >= arg4 ? arg4 : arg3;
            int var10 = arg3 >> 1;
            int var11 = arg4 >> 1;
            byte[] var12 = arg2;
            byte[] var13 = new byte[var6 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Dub(arg1, var7, this.method284(-51), arg3, arg4, 0, class651.method3587((byte) -114, this.field516), 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg3 * var6;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var6 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var6 + var23;
                            int var26 = var6 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var6 + var26;
                            var17 += var6;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                arg3 = var10;
                var12 = var16;
                arg4 = var11;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)I", line = 321)
    public static final int method282(int arg0, int arg1) {
        field504++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        if (arg0 != -1350259935) {
            method282(29, 19);
        }
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IBII[I)V", line = 339)
    public final void method283(int arg0, byte arg1, int arg2, int arg3, int[] arg4) {
        field511++;
        if (arg3 > 0 && !class253.method1681(arg3, (byte) 94)) {
            throw new IllegalArgumentException("");
        } else if (arg0 > 0 && !class253.method1681(arg0, (byte) 72)) {
            throw new IllegalArgumentException("");
        } else if (class165.field2263 == this.field516) {
            int var6 = 0;
            int var7 = arg3 >= arg0 ? arg0 : arg3;
            int var8 = arg3 >> 1;
            int var9 = arg0 >> 1;
            int[] var10 = arg4;
            if (arg1 == -2) {
                int[] var11 = new int[var8 * var9];
                while (true) {
                    OpenGL.glTexImage2Di(arg2, var6, this.method284(arg1 ^ 0x51), arg3, arg0, 0, 32993, this.field506.field5412, var10, 0);
                    if (var7 <= 1) {
                        return;
                    }
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = arg3 + var13;
                    for (int var15 = 0; var15 < var9; var15++) {
                        for (int var17 = 0; var17 < var8; var17++) {
                            int var18 = var10[var13++];
                            int var19 = var10[var13++];
                            int var20 = var10[var14++];
                            int var21 = var18 >> 24 & 0xFF;
                            int var22 = (var18 & 0xFF7E) >> 8;
                            int var23 = var18 & 0xFF;
                            int var24 = var10[var14++];
                            int var25 = var18 >> 16 & 0xFF;
                            int var26 = (var19 >> 24 & 0xFF) + var21;
                            int var27 = (var19 & 0xFF) + var23;
                            int var28 = (var19 >> 16 & 0xFF) + var25;
                            int var29 = (var19 >> 8 & 0xFF) + var22;
                            int var30 = (var20 >> 24 & 0xFF) + var26;
                            int var31 = ((var20 & 0xFFBF) >> 8) + var29;
                            int var32 = (var20 & 0xFF) + var27;
                            int var33 = ((var20 & 0xFFF6B0) >> 16) + var28;
                            int var34 = ((var24 & 0xFF8F50) >> 16) + var33;
                            int var35 = ((var24 & 0xFFD9) >> 8) + var31;
                            int var36 = (var24 & 0xFF) + var32;
                            int var37 = (var24 >> 24 & 0xFF) + var30;
                            var11[var12++] = class325.method2116(class286.method1877(var36 >> 2, 255), class325.method2116(class325.method2116(class286.method1877(var37 << 22, -16777216), class286.method1877(1020, var34) << 14), class286.method1877(var35, 1020) << 6));
                        }
                        var14 += arg3;
                        var13 += arg3;
                    }
                    int[] var16 = var11;
                    var11 = var10;
                    arg3 = var8;
                    arg0 = var9;
                    var10 = var16;
                    var8 >>= 0x1;
                    var7 >>= 0x1;
                    var6++;
                    var9 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)I", line = 445)
    public final int method284(int arg0) {
        field500++;
        if (arg0 >= -12) {
            method278(7, null);
        }
        if (class309.field4305 == this.field510) {
            if (class499.field7165 == this.field516) {
                return 6407;
            }
            if (class165.field2263 == this.field516) {
                return 6408;
            }
            if (class233.field3143 == this.field516) {
                return 6406;
            }
            if (class91.field1081 == this.field516) {
                return 6409;
            }
            if (class403.field5708 == this.field516) {
                return 6410;
            }
            if (class413.field5819 == this.field516) {
                return 6145;
            }
        } else if (class309.field4308 == this.field510) {
            if (class499.field7165 == this.field516) {
                return 34843;
            }
            if (class165.field2263 == this.field516) {
                return 34842;
            }
            if (class233.field3143 == this.field516) {
                return 34844;
            }
            if (class91.field1081 == this.field516) {
                return 34846;
            }
            if (class403.field5708 == this.field516) {
                return 34847;
            }
            if (class413.field5819 == this.field516) {
                return 6145;
            }
        } else if (class309.field4309 == this.field510) {
            if (class499.field7165 == this.field516) {
                return 34837;
            }
            if (class165.field2263 == this.field516) {
                return 34836;
            }
            if (class233.field3143 == this.field516) {
                return 34838;
            }
            if (class91.field1081 == this.field516) {
                return 34840;
            }
            if (class403.field5708 == this.field516) {
                return 34841;
            }
            if (class413.field5819 == this.field516) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lfha;ILbda;Lwt;IZ)V", line = 546)
    public class42(class378 arg0, int arg1, class505 arg2, class309 arg3, int arg4, boolean arg5) {
        this.field502 = arg5;
        this.field510 = arg3;
        this.field516 = arg2;
        this.field498 = arg4;
        this.field508 = arg1;
        this.field506 = arg0;
        OpenGL.glGenTextures(1, class580.field8184, 0);
        this.field513 = class580.field8184[0];
        this.method285((byte) 46);
        this.method277(0, -6203);
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(B)V", line = 567)
    private final void method285(byte arg0) {
        field509++;
        this.field506.method1663(this, -2);
        if (arg0 != 46) {
            return;
        }
        if (class601.field8433 == this.field499) {
            OpenGL.glTexParameteri(this.field508, 10241, this.field502 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field508, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field508, 10241, this.field502 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field508, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)V", line = 589)
    private final void method286(int arg0) {
        if (arg0 > -120) {
            return;
        }
        field507++;
        if (this.field513 > 0) {
            this.field506.method2375((byte) -120, this.field513, this.method279((byte) -114));
            this.field513 = 0;
        }
    }
}
