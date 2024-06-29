import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public abstract class class50 implements class402 {

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Ltn;")
    private class166 field645 = class484.field6901;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    private int field649;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "Z")
    private boolean field659;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "Ljb;")
    public class666 field654;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "Lad;")
    public class669 field663;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "Lqda;")
    public class689 field646;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    private int field652;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "[[Ljava/lang/String;")
    public static String[][] field662 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field666 = new Rectangle[100];

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBI[II)V")
    public final void method393(int arg0, byte arg1, int arg2, int[] arg3, int arg4) {
        field664++;
        if (arg4 > 0 && !class452.method2633(arg4, (byte) 127)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class452.method2633(arg2, (byte) 127)) {
            throw new IllegalArgumentException("");
        } else if (class297.field4191 == this.field654) {
            int var6 = 0;
            if (arg1 != -100) {
                method395(41, null);
            }
            int var7 = arg4 < arg2 ? arg4 : arg2;
            int var8 = arg4 >> 1;
            int var9 = arg2 >> 1;
            int[] var10 = arg3;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg0, var6, this.method397((byte) -60), arg4, arg2, 0, 32993, this.field663.field9528, var10, 0);
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
                        int var21 = var18 >> 24 & 0xFF;
                        int var22 = var18 >> 8 & 0xFF;
                        int var23 = var18 >> 16 & 0xFF;
                        int var24 = var10[var14++];
                        int var25 = var18 & 0xFF;
                        int var26 = (var20 >> 24 & 0xFF) + var21;
                        int var27 = (var20 & 0xFF) + var25;
                        int var28 = ((var20 & 0xFFAF87) >> 16) + var23;
                        int var29 = ((var20 & 0xFF8A) >> 8) + var22;
                        int var30 = (var19 & 0xFF) + var27;
                        int var31 = ((var19 & 0xFF5E11) >> 16) + var28;
                        int var32 = (var19 >> 24 & 0xFF) + var26;
                        int var33 = ((var19 & 0xFF4E) >> 8) + var29;
                        int var34 = (var24 >> 24 & 0xFF) + var32;
                        int var35 = (var24 & 0xFF) + var30;
                        int var36 = (var24 >> 8 & 0xFF) + var33;
                        int var37 = (var24 >> 16 & 0xFF) + var31;
                        var11[var12++] = class460.method2676(class248.method1593(var35 >> 2, 255), class460.method2676(class460.method2676(class248.method1593(-16777216, var34 << 22), class248.method1593(var37, 1020) << 14), class248.method1593(var36, 1020) << 6));
                    }
                    var13 += arg4;
                    var14 += arg4;
                }
                int[] var16 = var11;
                var11 = var10;
                arg2 = var9;
                arg4 = var8;
                var10 = var16;
                var9 >>= 0x1;
                var7 >>= 0x1;
                var8 >>= 0x1;
                var6++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLtn;)V")
    public final void method394(byte arg0, class166 arg1) {
        if (arg0 > -92) {
            return;
        }
        field661++;
        if (this.field645 != arg1) {
            this.field645 = arg1;
            this.method401(-103);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILct;)I")
    public static final int method395(int arg0, class479 arg1) {
        field647++;
        if (class171.field2763 == arg1) {
            return 5890;
        } else if (class521.field7683 == arg1) {
            return 34167;
        } else if (class51.field669 == arg1) {
            return 34168;
        } else if (class450.field6484 == arg1) {
            return 34166;
        } else {
            if (arg0 != 20179) {
                field666 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II[BZI)V")
    public final void method396(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        field658++;
        if (arg1 > 0 && !class452.method2633(arg1, (byte) 127)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class452.method2633(arg0, (byte) 127)) {
            int var6 = this.field654.field9362;
            int var7 = 0;
            int var8 = arg1 >= arg0 ? arg0 : arg1;
            int var9 = arg1 >> 1;
            int var10 = arg0 >> 1;
            byte[] var11 = arg2;
            if (!arg3) {
                this.method401(17);
            }
            byte[] var12 = new byte[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Dub(arg4, var7, this.method397((byte) 79), arg1, arg0, 0, class21.method211(this.field654, 49), 5121, var11, 0);
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
                arg0 = var10;
                var11 = var15;
                arg1 = var9;
                var10 >>= 0x1;
                var7++;
                var8 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)I")
    public final int method397(byte arg0) {
        field653++;
        if (class689.field9771 == this.field646) {
            if (class556.field8138 == this.field654) {
                return 6407;
            }
            if (class297.field4191 == this.field654) {
                return 6408;
            }
            if (class665.field9353 == this.field654) {
                return 6406;
            }
            if (class682.field9712 == this.field654) {
                return 6409;
            }
            if (class694.field9862 == this.field654) {
                return 6410;
            }
            if (class609.field8746 == this.field654) {
                return 6145;
            }
        } else if (class689.field9774 == this.field646) {
            if (class556.field8138 == this.field654) {
                return 34843;
            }
            if (class297.field4191 == this.field654) {
                return 34842;
            }
            if (class665.field9353 == this.field654) {
                return 34844;
            }
            if (class682.field9712 == this.field654) {
                return 34846;
            }
            if (class694.field9862 == this.field654) {
                return 34847;
            }
            if (class609.field8746 == this.field654) {
                return 6145;
            }
        } else if (class689.field9775 == this.field646) {
            if (class556.field8138 == this.field654) {
                return 34837;
            }
            if (class297.field4191 == this.field654) {
                return 34836;
            }
            if (class665.field9353 == this.field654) {
                return 34838;
            }
            if (class682.field9712 == this.field654) {
                return 34840;
            }
            if (class694.field9862 == this.field654) {
                return 34841;
            }
            if (class609.field8746 == this.field654) {
                return 6145;
            }
        }
        int var2 = -60 / ((14 - arg0) / 62);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)V")
    public static void method398(int arg0) {
        field662 = null;
        if (arg0 > -34) {
            field666 = null;
        }
        field666 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII[F)V")
    public final void method399(int arg0, int arg1, int arg2, int arg3, float[] arg4) {
        field657++;
        if (arg0 > 0 && !class452.method2633(arg0, (byte) 127)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class452.method2633(arg2, (byte) 127)) {
            int var6 = this.field654.field9362;
            if (arg3 != -994380735) {
                this.method397((byte) 35);
            }
            int var7 = 0;
            int var8 = arg2 > arg0 ? arg0 : arg2;
            int var9 = arg0 >> 1;
            int var10 = arg2 >> 1;
            float[] var11 = arg4;
            float[] var12 = new float[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg1, var7, this.method397((byte) -61), arg0, arg2, 0, class21.method211(this.field654, 49), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg0 * var6;
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
                        var17 += var13;
                        var18 += var13;
                    }
                }
                float[] var15 = var12;
                var12 = var11;
                arg2 = var10;
                arg0 = var9;
                var11 = var15;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var7++;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "(I)I")
    private final int method400(int arg0) {
        field650++;
        if (arg0 > -99) {
            this.field646 = null;
        }
        int var2 = this.field646.field9764 * this.field649 * this.field654.field9362;
        return this.field659 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "(I)V")
    private final void method401(int arg0) {
        this.field663.method2924(13528, this);
        field655++;
        if (class484.field6901 == this.field645) {
            OpenGL.glTexParameteri(this.field651, 10241, this.field659 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field651, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field651, 10241, this.field659 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field651, 10240, 9728);
        }
        if (arg0 >= -55) {
            this.field651 = 81;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
    private final void method402(int arg0, int arg1) {
        int var3 = -72 / ((-arg1 - 55) / 61);
        field656++;
        this.field663.field7272 -= arg0;
        this.field663.field7272 += this.method400(-118);
    }

    @OriginalMember(owner = "client!mm", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method403((byte) 70);
        field644++;
        super.finalize();
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)V")
    private final void method403(byte arg0) {
        if (arg0 < 58) {
            this.field659 = true;
        }
        if (this.field652 > 0) {
            this.field663.method3772(97, this.method400(-127), this.field652);
            this.field652 = 0;
        }
        field648++;
    }

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "(I)V")
    public static final void method404(int arg0) {
        if (arg0 != 12690) {
            field666 = null;
        }
        class400.field5784 = 0;
        field660++;
        class150.field2533.method3896(3);
        class324.field4519 = false;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public final void method405(int arg0) {
        field665++;
        if (arg0 != -29399) {
            this.field645 = null;
        }
        int var2 = this.field663.method2907((byte) -51);
        int var3 = this.field663.field9524[var2];
        if (this.field651 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field651);
            this.field663.field9524[var2] = this.field651;
        }
        OpenGL.glBindTexture(this.field651, this.field652);
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lad;ILjb;Lqda;IZ)V")
    public class50(class669 arg0, int arg1, class666 arg2, class689 arg3, int arg4, boolean arg5) {
        this.field651 = arg1;
        this.field649 = arg4;
        this.field659 = arg5;
        this.field654 = arg2;
        this.field663 = arg0;
        this.field646 = arg3;
        OpenGL.glGenTextures(1, class481.field6876, 0);
        this.field652 = class481.field6876[0];
        this.method401(-87);
        this.method402(0, -119);
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field666[var0] = new Rectangle();
        }
    }
}
