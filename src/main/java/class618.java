import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public abstract class class618 implements class399 {

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "Lse;")
    private class267 field8942 = class585.field8484;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "Lua;")
    public class696 field8936;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "Ltia;")
    public class278 field8938;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "Z")
    private boolean field8941;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    private int field8940;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "Ldn;")
    public class544 field8944;

    @OriginalMember(owner = "client!vs", name = "x", descriptor = "I")
    public int field8926;

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "I")
    private int field8934;

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8946 = new String[] { method4523(method4522("m w\u0005y3")), method4523(method4522("u&5+")), method4523(method4522("`}wiE")), method4523(method4522("m w\t\u0010")), method4523(method4522("m w\u0017\u0010")), method4523(method4522("m w\u0011\u0010")), method4523(method4522("m w\u0013\u0010")), method4523(method4522("m w\u0015\u0010")), method4523(method4522("m w\u0014\u0010")), method4523(method4522("m w\b\u0010")), method4523(method4522("m w\u0012\u0010")), method4523(method4522("m w\u0016\u0010")), method4523(method4522("m w!Qu25.B~{")), method4523(method4522("m w\u0006y3")), method4523(method4522("m w{Qu:-y\u0010")), method4523(method4522("m w\n\u0010")), method4523(method4522("m w\u0010\u0010")) };

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
    public static int field8925;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
    public static int field8927;

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!vs", name = "w", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
    public static int field8932;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "I")
    public static int field8933;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "I")
    public static int field8939;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "Lvb;")
    public static class205 field8929;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "Lgda;")
    public static class58 field8924;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILse;)V", line = 6)
    public final void method1170(int arg0, class267 arg1) {
        try {
            field8931++;
            if (arg0 != 15249) {
                this.method4517(null, -102, false, -68, -85);
            }
            if (this.field8942 != arg1) {
                this.field8942 = arg1;
                this.method4515(9729);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8946[13] + arg0 + ',' + (arg1 == null ? field8946[1] : field8946[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)V", line = 25)
    private final void method4511(int arg0, int arg1) {
        try {
            this.field8938.field4123 -= arg0;
            field8939++;
            this.field8938.field4123 += this.method4514(3);
            if (arg1 != -241) {
                this.method1168(63);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8946[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "finalize", descriptor = "()V", line = 40)
    protected final void finalize() throws Throwable {
        try {
            field8930++;
            this.method4516((byte) 119);
            super.finalize();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8946[12] + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V", line = 51)
    public final void method1168(int arg0) {
        try {
            field8932++;
            if (arg0 != 16541) {
                this.method4515(-116);
            }
            int var2 = this.field8938.method2205((byte) -125);
            int var3 = this.field8938.field4545[var2];
            if (this.field8926 != var3) {
                if (var3 != 0) {
                    OpenGL.glBindTexture(var3, 0);
                    OpenGL.glDisable(var3);
                }
                OpenGL.glEnable(this.field8926);
                this.field8938.field4545[var2] = this.field8926;
            }
            OpenGL.glBindTexture(this.field8926, this.field8934);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8946[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "(B)I", line = 81)
    public final int method4512(byte arg0) {
        try {
            field8937++;
            if (arg0 != 83) {
                return 123;
            }
            if (class544.field8004 == this.field8944) {
                if (class556.field8116 == this.field8936) {
                    return 6407;
                }
                if (class313.field5120 == this.field8936) {
                    return 6408;
                }
                if (class335.field5466 == this.field8936) {
                    return 6406;
                }
                if (class411.field6564 == this.field8936) {
                    return 6409;
                }
                if (class225.field3529 == this.field8936) {
                    return 6410;
                }
                if (class9.field106 == this.field8936) {
                    return 6145;
                }
            } else if (class544.field8007 == this.field8944) {
                if (class556.field8116 == this.field8936) {
                    return 34843;
                }
                if (class313.field5120 == this.field8936) {
                    return 34842;
                }
                if (class335.field5466 == this.field8936) {
                    return 34844;
                }
                if (class411.field6564 == this.field8936) {
                    return 34846;
                }
                if (class225.field3529 == this.field8936) {
                    return 34847;
                }
                if (class9.field106 == this.field8936) {
                    return 6145;
                }
            } else if (class544.field8008 == this.field8944) {
                if (class556.field8116 == this.field8936) {
                    return 34837;
                }
                if (class313.field5120 == this.field8936) {
                    return 34836;
                }
                if (class335.field5466 == this.field8936) {
                    return 34838;
                }
                if (class411.field6564 == this.field8936) {
                    return 34840;
                }
                if (class225.field3529 == this.field8936) {
                    return 34841;
                }
                if (class9.field106 == this.field8936) {
                    return 6145;
                }
            }
            throw new IllegalStateException();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8946[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "(I)V", line = 177)
    public static void method4513(int arg0) {
        try {
            if (arg0 <= 94) {
                field8935 = 80;
            }
            field8924 = null;
            field8929 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8946[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)I", line = 189)
    private final int method4514(int arg0) {
        try {
            field8943++;
            if (arg0 != 3) {
                this.field8926 = 63;
            }
            int var2 = this.field8936.field10033 * this.field8944.field7999 * this.field8940;
            return this.field8941 ? var2 * 4 / 3 : var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8946[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "(I)V", line = 207)
    private final void method4515(int arg0) {
        try {
            this.field8938.method2233((byte) -106, this);
            field8922++;
            if (class585.field8484 == this.field8942) {
                OpenGL.glTexParameteri(this.field8926, 10241, this.field8941 ? 9987 : 9729);
                OpenGL.glTexParameteri(this.field8926, 10240, 9729);
            } else {
                OpenGL.glTexParameteri(this.field8926, 10241, this.field8941 ? 9984 : 9728);
                OpenGL.glTexParameteri(this.field8926, 10240, 9728);
            }
            if (arg0 != 9729) {
                this.field8938 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8946[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(B)V", line = 231)
    private final void method4516(byte arg0) {
        try {
            field8925++;
            if (this.field8934 > 0) {
                this.field8938.method2387(this.field8934, -46, this.method4514(3));
                this.field8934 = 0;
            }
            if (arg0 < 112) {
                this.field8941 = false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8946[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "([BIZII)V", line = 249)
    public final void method4517(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        try {
            field8933++;
            if (arg4 > 0 && !class46.method469(arg4, 1010)) {
                throw new IllegalArgumentException("");
            } else if (arg3 <= 0 || class46.method469(arg3, 1010)) {
                int var6 = this.field8936.field10033;
                int var7 = 0;
                int var8 = arg4 >= arg3 ? arg3 : arg4;
                int var9 = arg4 >> 1;
                int var10 = arg3 >> 1;
                byte[] var11 = arg0;
                byte[] var12 = new byte[var6 * var9 * var10];
                while (true) {
                    OpenGL.glTexImage2Dub(arg1, var7, this.method4512((byte) 83), arg4, arg3, 0, class284.method2418(this.field8936, 6410), 5121, var11, 0);
                    if (var8 <= 1) {
                        if (arg2) {
                            this.field8944 = null;
                            return;
                        }
                        return;
                    }
                    int var13 = arg4 * var6;
                    for (int var14 = 0; var14 < var6; var14++) {
                        int var15 = var14;
                        int var16 = var14;
                        int var17 = var13 + var14;
                        for (int var18 = 0; var18 < var10; var18++) {
                            for (int var19 = 0; var19 < var9; var19++) {
                                byte var20 = var11[var16];
                                int var21 = var6 + var16;
                                int var22 = var11[var21] + var20;
                                var16 = var6 + var21;
                                int var23 = var11[var17] + var22;
                                int var24 = var6 + var17;
                                int var25 = var11[var24] + var23;
                                var17 = var6 + var24;
                                var12[var15] = (byte) (var25 >> 2);
                                var15 += var6;
                            }
                            var16 += var13;
                            var17 += var13;
                        }
                    }
                    byte[] var26 = var12;
                    var12 = var11;
                    var11 = var26;
                    arg3 = var10;
                    arg4 = var9;
                    var9 >>= 0x1;
                    var7++;
                    var8 >>= 0x1;
                    var10 >>= 0x1;
                }
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var28) {
            throw class590.method4333(var28, field8946[10] + (arg0 == null ? field8946[1] : field8946[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "([FIIII)V", line = 347)
    public final void method4518(float[] arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field8928++;
            if (arg4 > 0 && !class46.method469(arg4, 1010)) {
                throw new IllegalArgumentException("");
            } else if (arg2 <= 0 || class46.method469(arg2, 1010)) {
                int var6 = this.field8936.field10033;
                int var7 = 0;
                int var8 = arg2 > arg4 ? arg4 : arg2;
                int var9 = arg4 >> 1;
                if (arg1 >= 124) {
                    int var10 = arg2 >> 1;
                    float[] var11 = arg0;
                    float[] var12 = new float[var9 * var10 * var6];
                    while (true) {
                        OpenGL.glTexImage2Df(arg3, var7, this.method4512((byte) 83), arg4, arg2, 0, class284.method2418(this.field8936, 6410), 5126, var11, 0);
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
                        var12 = var11;
                        arg2 = var10;
                        var11 = var14;
                        arg4 = var9;
                        var8 >>= 0x1;
                        var10 >>= 0x1;
                        var7++;
                        var9 >>= 0x1;
                    }
                }
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var28) {
            throw class590.method4333(var28, field8946[11] + (arg0 == null ? field8946[1] : field8946[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILvn;Lwha;)Lnq;", line = 448)
    public static final class487 method4519(int arg0, class330 arg1, class296 arg2) {
        try {
            if (arg0 < 14) {
                field8929 = null;
            }
            field8927++;
            class487 var3 = class53.method552((byte) 36);
            var3.field7360 = arg1;
            var3.field7358 = arg1.field5400;
            if (var3.field7358 == -1) {
                var3.field7362 = new class117(260);
            } else if (var3.field7358 == -2) {
                var3.field7362 = new class117(10000);
            } else if (var3.field7358 <= 18) {
                var3.field7362 = new class117(20);
            } else if (var3.field7358 > 98) {
                var3.field7362 = new class117(260);
            } else {
                var3.field7362 = new class117(100);
            }
            var3.field7362.method1155(-128, arg2);
            var3.field7362.method1154(var3.field7360.method2798((byte) -102), 2);
            var3.field7364 = 0;
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8946[15] + arg0 + ',' + (arg1 == null ? field8946[1] : field8946[2]) + ',' + (arg2 == null ? field8946[1] : field8946[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I[IIBI)V", line = 483)
    public final void method4520(int arg0, int[] arg1, int arg2, byte arg3, int arg4) {
        try {
            field8945++;
            if (arg0 > 0 && !class46.method469(arg0, 1010)) {
                throw new IllegalArgumentException("");
            } else if (arg2 > 0 && !class46.method469(arg2, 1010)) {
                throw new IllegalArgumentException("");
            } else if (class313.field5120 == this.field8936) {
                int var6 = 0;
                int var7 = arg2 <= arg0 ? arg2 : arg0;
                int var8 = arg0 >> 1;
                int var9 = arg2 >> 1;
                if (arg3 != -23) {
                    this.method4516((byte) -20);
                }
                int[] var10 = arg1;
                int[] var11 = new int[var8 * var9];
                while (true) {
                    OpenGL.glTexImage2Di(arg4, var6, this.method4512((byte) 83), arg0, arg2, 0, 32993, this.field8938.field4549, var10, 0);
                    if (var7 <= 1) {
                        return;
                    }
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = arg0 + var13;
                    for (int var15 = 0; var15 < var9; var15++) {
                        for (int var16 = 0; var16 < var8; var16++) {
                            int var17 = var10[var13++];
                            int var18 = var10[var13++];
                            int var19 = var10[var14++];
                            int var20 = var17 & 0xFF;
                            int var21 = var17 >> 24 & 0xFF;
                            int var22 = var17 >> 8 & 0xFF;
                            int var23 = var17 >> 16 & 0xFF;
                            int var24 = var10[var14++];
                            int var25 = (var18 & 0xFF) + var20;
                            int var26 = ((var18 & 0xFFD2) >> 8) + var22;
                            int var27 = (var18 >> 24 & 0xFF) + var21;
                            int var28 = ((var18 & 0xFF49AB) >> 16) + var23;
                            int var29 = (var19 >> 24 & 0xFF) + var27;
                            int var30 = (var19 >> 8 & 0xFF) + var26;
                            int var31 = (var19 & 0xFF) + var25;
                            int var32 = (var19 >> 16 & 0xFF) + var28;
                            int var33 = (var24 & 0xFF) + var31;
                            int var34 = (var24 >> 24 & 0xFF) + var29;
                            int var35 = (var24 >> 16 & 0xFF) + var32;
                            int var36 = (var24 >> 8 & 0xFF) + var30;
                            var11[var12++] = class553.method4099(class553.method4099(class292.method2485(var36 << 6, 65280), class553.method4099(class292.method2485(var35, 1020) << 14, class292.method2485(-16777216, var34 << 22))), class292.method2485(var33 >> 2, 255));
                        }
                        var13 += arg0;
                        var14 += arg0;
                    }
                    int[] var37 = var11;
                    var11 = var10;
                    arg2 = var9;
                    var10 = var37;
                    arg0 = var8;
                    var7 >>= 0x1;
                    var8 >>= 0x1;
                    var6++;
                    var9 >>= 0x1;
                }
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var39) {
            throw class590.method4333(var39, field8946[3] + arg0 + ',' + (arg1 == null ? field8946[1] : field8946[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "(I)V", line = 591)
    public static final void method4521(int arg0) {
        try {
            if (arg0 <= -59) {
                class54.field688.method304(1);
                field8923++;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8946[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Ltia;ILua;Ldn;IZ)V", line = 606)
    public class618(class278 arg0, int arg1, class696 arg2, class544 arg3, int arg4, boolean arg5) {
        try {
            this.field8936 = arg2;
            this.field8938 = arg0;
            this.field8941 = arg5;
            this.field8940 = arg4;
            this.field8944 = arg3;
            this.field8926 = arg1;
            OpenGL.glGenTextures(1, class345.field5606, 0);
            this.field8934 = class345.field5606[0];
            this.method4515(9729);
            this.method4511(0, -241);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field8946[14] + (arg0 == null ? field8946[1] : field8946[2]) + ',' + arg1 + ',' + (arg2 == null ? field8946[1] : field8946[2]) + ',' + (arg3 == null ? field8946[1] : field8946[2]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4522(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x38);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4523(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 27;
                    break;
                case 1:
                    var10005 = 83;
                    break;
                case 2:
                    var10005 = 89;
                    break;
                case 3:
                    var10005 = 71;
                    break;
                default:
                    var10005 = 56;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
