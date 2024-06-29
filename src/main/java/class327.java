import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public abstract class class327 implements class408 {

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "Lrha;")
    private class455 field4644 = class362.field5131;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "Z")
    private boolean field4657;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "Lfc;")
    public class642 field4645;

    @OriginalMember(owner = "client!wo", name = "y", descriptor = "I")
    public int field4667;

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "Ldr;")
    public class629 field4665;

    @OriginalMember(owner = "client!wo", name = "A", descriptor = "I")
    private int field4669;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "Lnea;")
    public class600 field4659;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
    private int field4655;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "[S")
    private static short[] field4643 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "Z")
    public static boolean field4650 = false;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "[S")
    private static short[] field4651 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
    public static int field4662 = 0;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "[S")
    private static short[] field4654 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!wo", name = "B", descriptor = "[[S")
    public static short[][] field4670 = new short[][] { field4654, field4643, field4651 };

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!wo", name = "x", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V", line = 3)
    public static void method1985(int arg0) {
        if (arg0 <= 8) {
            method1989((byte) 78);
        }
        field4654 = null;
        field4670 = null;
        field4643 = null;
        field4651 = null;
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)V", line = 17)
    private final void method1986(int arg0) {
        field4652++;
        if (arg0 != 0) {
            this.method1986(63);
        }
        this.field4645.method988(1, this);
        if (class362.field5131 == this.field4644) {
            OpenGL.glTexParameteri(this.field4667, 10241, this.field4657 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field4667, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field4667, 10241, this.field4657 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field4667, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V", line = 39)
    public final void method1159(int arg0) {
        field4660++;
        int var2 = this.field4645.method964(true);
        int var3 = this.field4645.field9138[var2];
        if (this.field4667 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field4667);
            this.field4645.field9138[var2] = this.field4667;
        }
        OpenGL.glBindTexture(this.field4667, this.field4655);
        if (arg0 != 16033) {
            this.method1990(-70, 45, -119, -1, null);
        }
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)I", line = 70)
    public final int method1987(int arg0) {
        field4646++;
        if (arg0 != 1683) {
            return 80;
        }
        if (class629.field8918 == this.field4665) {
            if (class498.field6845 == this.field4659) {
                return 6407;
            }
            if (class133.field2225 == this.field4659) {
                return 6408;
            }
            if (class547.field7573 == this.field4659) {
                return 6406;
            }
            if (class94.field1350 == this.field4659) {
                return 6409;
            }
            if (class505.field6931 == this.field4659) {
                return 6410;
            }
            if (class459.field6273 == this.field4659) {
                return 6145;
            }
        } else if (class629.field8921 == this.field4665) {
            if (class498.field6845 == this.field4659) {
                return 34843;
            }
            if (class133.field2225 == this.field4659) {
                return 34842;
            }
            if (class547.field7573 == this.field4659) {
                return 34844;
            }
            if (class94.field1350 == this.field4659) {
                return 34846;
            }
            if (class505.field6931 == this.field4659) {
                return 34847;
            }
            if (class459.field6273 == this.field4659) {
                return 6145;
            }
        } else if (class629.field8922 == this.field4665) {
            if (class498.field6845 == this.field4659) {
                return 34837;
            }
            if (class133.field2225 == this.field4659) {
                return 34836;
            }
            if (class547.field7573 == this.field4659) {
                return 34838;
            }
            if (class94.field1350 == this.field4659) {
                return 34840;
            }
            if (class505.field6931 == this.field4659) {
                return 34841;
            }
            if (class459.field6273 == this.field4659) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)V", line = 167)
    private final void method1988(int arg0, int arg1) {
        field4658++;
        this.field4645.field1842 -= arg0;
        this.field4645.field1842 += this.method1994(false);
        int var3 = 79 % ((53 - arg1) / 50);
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)V", line = 183)
    public static final void method1989(byte arg0) {
        class314.method1914((long) class594.field8494, 0, class686.field9702);
        field4648++;
        if (class379.field5314 != -1) {
            class538.method3124(true, class379.field5314);
        }
        int var1 = 0;
        if (arg0 >= -67) {
            method1985(-54);
        }
        while (var1 < class538.field7479) {
            if (class438.field6082[var1]) {
                class780.field10685[var1] = true;
            }
            class713.field9957[var1] = class438.field6082[var1];
            class438.field6082[var1] = false;
            var1++;
        }
        class267.field3779 = class594.field8494;
        if (class379.field5314 != -1) {
            class538.field7479 = 0;
            class285.method1809((byte) -42);
        }
        class686.field9702.method512();
        class217.method1492(class686.field9702, false);
        int var2 = class599.method3491((byte) 101);
        if (var2 == -1) {
            var2 = class578.field8338;
        }
        if (var2 == -1) {
            var2 = class25.field274;
        }
        class760.method4196(var2, true);
        class662.field9326 = 0;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIII[F)V", line = 233)
    public final void method1990(int arg0, int arg1, int arg2, int arg3, float[] arg4) {
        field4664++;
        if (arg1 > 0 && !class362.method2181(arg1, -1)) {
            throw new IllegalArgumentException("");
        } else if (arg0 > 0 && !class362.method2181(arg0, -1)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= -99) {
            int var6 = this.field4659.field8555;
            int var7 = 0;
            int var8 = arg0 <= arg1 ? arg0 : arg1;
            int var9 = arg1 >> 1;
            int var10 = arg0 >> 1;
            float[] var11 = arg4;
            float[] var12 = new float[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg3, var7, this.method1987(1683), arg1, arg0, 0, class177.method1293(127, this.field4659), 5126, var11, 0);
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
                arg0 = var10;
                var11 = var15;
                arg1 = var9;
                var7++;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var8 >>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(B)V", line = 330)
    private final void method1991(byte arg0) {
        if (this.field4655 > 0) {
            this.field4645.method3643(this.method1994(false), (byte) -104, this.field4655);
            this.field4655 = 0;
        }
        if (arg0 != 39) {
            method1985(62);
        }
        field4656++;
    }

    @OriginalMember(owner = "client!wo", name = "finalize", descriptor = "()V", line = 347)
    protected final void finalize() throws Throwable {
        field4666++;
        this.method1991((byte) 39);
        super.finalize();
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[BIII)V", line = 363)
    public final void method1992(int arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field4661++;
        if (arg0 > 0 && !class362.method2181(arg0, -1)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class362.method2181(arg4, -1)) {
            if (arg3 < 45) {
                this.field4669 = -74;
            }
            int var6 = this.field4659.field8555;
            int var7 = 0;
            int var8 = arg0 >= arg4 ? arg4 : arg0;
            int var9 = arg0 >> 1;
            int var10 = arg4 >> 1;
            byte[] var11 = arg1;
            byte[] var12 = new byte[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Dub(arg2, var7, this.method1987(1683), arg0, arg4, 0, class177.method1293(127, this.field4659), 5121, var11, 0);
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
                        var18 += var13;
                        var17 += var13;
                    }
                }
                byte[] var15 = var12;
                var12 = var11;
                arg0 = var9;
                arg4 = var10;
                var11 = var15;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var10 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lfc;ILnea;Ldr;IZ)V", line = 625)
    public class327(class642 arg0, int arg1, class600 arg2, class629 arg3, int arg4, boolean arg5) {
        this.field4657 = arg5;
        this.field4645 = arg0;
        this.field4667 = arg1;
        this.field4665 = arg3;
        this.field4669 = arg4;
        this.field4659 = arg2;
        OpenGL.glGenTextures(1, class106.field1528, 0);
        this.field4655 = class106.field1528[0];
        this.method1986(0);
        this.method1988(0, 115);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BII[II)V", line = 474)
    public final void method1993(byte arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field4663++;
        if (arg1 > 0 && !class362.method2181(arg1, -1)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class362.method2181(arg4, -1)) {
            throw new IllegalArgumentException("");
        } else if (class133.field2225 == this.field4659) {
            if (arg0 != -28) {
                this.method1988(26, 4);
            }
            int var6 = 0;
            int var7 = arg4 > arg1 ? arg1 : arg4;
            int var8 = arg1 >> 1;
            int var9 = arg4 >> 1;
            int[] var10 = arg3;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg2, var6, this.method1987(1683), arg1, arg4, 0, 32993, this.field4645.field9137, var10, 0);
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
                        int var21 = var18 & 0xFF;
                        int var22 = var18 >> 24 & 0xFF;
                        int var23 = var18 >> 8 & 0xFF;
                        int var24 = var18 >> 16 & 0xFF;
                        int var25 = var10[var14++];
                        int var26 = (var19 >> 8 & 0xFF) + var23;
                        int var27 = (var19 >> 24 & 0xFF) + var22;
                        int var28 = (var19 & 0xFF) + var21;
                        int var29 = ((var19 & 0xFF4971) >> 16) + var24;
                        int var30 = ((var20 & 0xFFCB) >> 8) + var26;
                        int var31 = (var20 >> 24 & 0xFF) + var27;
                        int var32 = (var20 & 0xFF) + var28;
                        int var33 = ((var20 & 0xFF1037) >> 16) + var29;
                        int var34 = (var25 & 0xFF) + var32;
                        int var35 = ((var25 & 0xFF33) >> 8) + var30;
                        int var36 = (var25 >> 24 & 0xFF) + var31;
                        int var37 = (var25 >> 16 & 0xFF) + var33;
                        var11[var12++] = class694.method3895(class694.method3895(class694.method3895(class194.method1380(var37, 1020) << 14, class194.method1380(1020, var36) << 22), class194.method1380(var35 << 6, 65280)), class194.method1380(1020, var34) >> 2);
                    }
                    var14 += arg1;
                    var13 += arg1;
                }
                var11 = var10;
                var10 = var15;
                arg4 = var9;
                arg1 = var8;
                var7 >>= 0x1;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var6++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)I", line = 579)
    private final int method1994(boolean arg0) {
        field4647++;
        if (arg0) {
            return -84;
        } else {
            int var2 = this.field4659.field8555 * this.field4669 * this.field4665.field8914;
            return this.field4657 ? var2 * 4 / 3 : var2;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILrha;)V", line = 602)
    public final void method211(int arg0, class455 arg1) {
        field4649++;
        if (this.field4644 != arg1) {
            this.field4644 = arg1;
            this.method1986(0);
        }
        if (arg0 != 27691) {
            field4670 = null;
        }
    }
}
