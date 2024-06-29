import jaggl.OpenGL;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class class696 implements class355 {

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "Lqt;")
    private class634 field9799 = class267.field3864;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Z")
    private boolean field9779;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public int field9787;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Lkca;")
    public class82 field9780;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    private int field9778;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Leea;")
    public class132 field9790;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Lti;")
    public class438 field9791;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    private int field9797;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lcw;")
    public static class179 field9784 = new class179("stellardawn", 1);

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "Z")
    public static boolean field9798 = true;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field9781;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field9782;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field9783;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field9785;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field9786;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field9788;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field9789;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field9792;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field9793;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field9794;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field9795;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field9796;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lqt;I)V", line = 3)
    public final void method979(class634 arg0, int arg1) {
        if (this.field9799 != arg0) {
            this.field9799 = arg0;
            this.method3911(32257);
        }
        field9788++;
        if (arg1 >= -81) {
            this.method3910(36);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[BII)V", line = 23)
    public final void method3904(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field9794++;
        if (arg4 > 0 && !class278.method1826((byte) 120, arg4)) {
            throw new IllegalArgumentException("");
        }
        int var6 = 13 % ((-arg0 - 2) / 49);
        if (arg3 > 0 && !class278.method1826((byte) 126, arg3)) {
            throw new IllegalArgumentException("");
        }
        int var7 = this.field9780.field1515;
        int var8 = 0;
        int var9 = arg3 > arg4 ? arg4 : arg3;
        int var10 = arg4 >> 1;
        int var11 = arg3 >> 1;
        byte[] var12 = arg2;
        byte[] var13 = new byte[var10 * var11 * var7];
        while (true) {
            OpenGL.glTexImage2Dub(arg1, var8, this.method3910(0), arg4, arg3, 0, class491.method2955(this.field9780, false), 5121, var12, 0);
            if (var9 <= 1) {
                return;
            }
            int var14 = arg4 * var7;
            byte[] var15 = var13;
            for (int var16 = 0; var16 < var7; var16++) {
                int var17 = var16;
                int var18 = var16;
                int var19 = var14 + var16;
                for (int var20 = 0; var20 < var11; var20++) {
                    for (int var21 = 0; var21 < var10; var21++) {
                        byte var22 = var12[var18];
                        int var23 = var7 + var18;
                        int var24 = var12[var23] + var22;
                        int var25 = var12[var19] + var24;
                        var18 = var7 + var23;
                        int var26 = var7 + var19;
                        int var27 = var12[var26] + var25;
                        var13[var17] = (byte) (var27 >> 2);
                        var19 = var7 + var26;
                        var17 += var7;
                    }
                    var18 += var14;
                    var19 += var14;
                }
            }
            var13 = var12;
            arg4 = var10;
            arg3 = var11;
            var12 = var15;
            var9 >>= 0x1;
            var8++;
            var11 >>= 0x1;
            var10 >>= 0x1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V", line = 120)
    public static final void method3905(int arg0) {
        field9783++;
        if (class330.field4654 != null || arg0 > -45) {
            return;
        }
        int var1 = class452.field6245;
        int var2 = class57.field1060;
        int var3 = class556.field7778 - class206.field2956 - var1;
        int var4 = class194.field2788 - class363.field5105 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class754.field10504 != null) {
                var5 = class754.field10504;
            } else if (class476.field6812 == null) {
                var5 = class407.field5670;
            } else {
                var5 = class476.field6812;
            }
            int var6 = 0;
            int var7 = 0;
            if (class754.field10504 == var5) {
                Insets var8 = class754.field10504.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class194.field2788);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class556.field7778, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class556.field7778 - var3, var7, var3, class194.field2788);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class194.field2788 + var7 - var4, class556.field7778, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!ic", name = "finalize", descriptor = "()V", line = 190)
    protected final void finalize() throws Throwable {
        field9786++;
        this.method3908((byte) 10);
        super.finalize();
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V", line = 202)
    public static void method3906(int arg0) {
        field9784 = null;
        if (arg0 != -560294160) {
            method3906(12);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)I", line = 212)
    private final int method3907(byte arg0) {
        if (arg0 >= -3) {
            field9784 = null;
        }
        field9793++;
        int var2 = this.field9791.field6113 * this.field9778 * this.field9780.field1515;
        return this.field9779 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V", line = 228)
    private final void method3908(byte arg0) {
        field9795++;
        if (this.field9797 > 0) {
            this.field9790.method1011(this.field9797, this.method3907((byte) -51), -1);
            this.field9797 = 0;
        }
        if (arg0 != 10) {
            method3914(91, 68);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[IIII)V", line = 247)
    public final void method3909(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field9792++;
        if (arg0 > 0 && !class278.method1826((byte) 127, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class278.method1826((byte) 127, arg2)) {
            throw new IllegalArgumentException("");
        } else if (class282.field4019 == this.field9780) {
            int var6 = 0;
            int var7 = arg0 >= arg2 ? arg2 : arg0;
            int var8 = arg0 >> 1;
            int var9 = arg2 >> 1;
            int[] var10 = arg1;
            if (arg4 != 31996) {
                this.method3910(45);
            }
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg3, var6, this.method3910(arg4 - 31996), arg0, arg2, 0, 32993, this.field9790.field2094, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = var13 + arg0;
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var14++];
                        int var20 = var10[var13++];
                        int var21 = var18 & 0xFF;
                        int var22 = (var18 & 0xFF41) >> 8;
                        int var23 = var10[var14++];
                        int var24 = var18 >> 24 & 0xFF;
                        int var25 = var18 >> 16 & 0xFF;
                        int var26 = (var20 & 0xFF) + var21;
                        int var27 = (var20 >> 16 & 0xFF) + var25;
                        int var28 = (var20 >> 24 & 0xFF) + var24;
                        int var29 = ((var20 & 0xFFEA) >> 8) + var22;
                        int var30 = (var19 >> 16 & 0xFF) + var27;
                        int var31 = (var19 >> 24 & 0xFF) + var28;
                        int var32 = ((var19 & 0xFFE9) >> 8) + var29;
                        int var33 = (var19 & 0xFF) + var26;
                        int var34 = (var23 & 0xFF) + var33;
                        int var35 = (var23 >> 16 & 0xFF) + var30;
                        int var36 = (var23 >> 24 & 0xFF) + var31;
                        int var37 = ((var23 & 0xFFB4) >> 8) + var32;
                        var11[var12++] = class164.method1221(class555.method3246(255, var34 >> 2), class164.method1221(class555.method3246(var37, 1020) << 6, class164.method1221(class555.method3246(1020, var36) << 22, class555.method3246(var35 << 14, 16711680))));
                    }
                    var14 += arg0;
                    var13 += arg0;
                }
                int[] var16 = var11;
                var11 = var10;
                arg0 = var8;
                arg2 = var9;
                var10 = var16;
                var8 >>= 0x1;
                var6++;
                var9 >>= 0x1;
                var7 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 354)
    public final void method980(int arg0) {
        int var2 = 124 % ((arg0 + 29) / 46);
        field9796++;
        int var3 = this.field9790.method2727(true);
        int var4 = this.field9790.field2088[var3];
        if (this.field9787 != var4) {
            if (var4 != 0) {
                OpenGL.glBindTexture(var4, 0);
                OpenGL.glDisable(var4);
            }
            OpenGL.glEnable(this.field9787);
            this.field9790.field2088[var3] = this.field9787;
        }
        OpenGL.glBindTexture(this.field9787, this.field9797);
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)I", line = 382)
    public final int method3910(int arg0) {
        field9782++;
        if (arg0 != 0) {
            return 92;
        }
        if (class438.field6117 == this.field9791) {
            if (class369.field5177 == this.field9780) {
                return 6407;
            }
            if (class282.field4019 == this.field9780) {
                return 6408;
            }
            if (class643.field9137 == this.field9780) {
                return 6406;
            }
            if (class582.field8222 == this.field9780) {
                return 6409;
            }
            if (class98.field1673 == this.field9780) {
                return 6410;
            }
            if (class218.field3109 == this.field9780) {
                return 6145;
            }
        } else if (class438.field6120 == this.field9791) {
            if (class369.field5177 == this.field9780) {
                return 34843;
            }
            if (class282.field4019 == this.field9780) {
                return 34842;
            }
            if (class643.field9137 == this.field9780) {
                return 34844;
            }
            if (class582.field8222 == this.field9780) {
                return 34846;
            }
            if (class98.field1673 == this.field9780) {
                return 34847;
            }
            if (class218.field3109 == this.field9780) {
                return 6145;
            }
        } else if (class438.field6121 == this.field9791) {
            if (class369.field5177 == this.field9780) {
                return 34837;
            }
            if (class282.field4019 == this.field9780) {
                return 34836;
            }
            if (class643.field9137 == this.field9780) {
                return 34838;
            }
            if (class582.field8222 == this.field9780) {
                return 34840;
            }
            if (class98.field1673 == this.field9780) {
                return 34841;
            }
            if (class218.field3109 == this.field9780) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)V", line = 482)
    private final void method3911(int arg0) {
        this.field9790.method2732(-91, this);
        field9781++;
        if (arg0 != 32257) {
            return;
        }
        if (class267.field3864 == this.field9799) {
            OpenGL.glTexParameteri(this.field9787, 10241, this.field9779 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field9787, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field9787, 10241, this.field9779 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field9787, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[FII)V", line = 505)
    public final void method3912(int arg0, int arg1, float[] arg2, int arg3, int arg4) {
        field9785++;
        if (arg4 > 0 && !class278.method1826((byte) 122, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class278.method1826((byte) 121, arg1)) {
            int var6 = this.field9780.field1515;
            int var7 = 0;
            int var8 = arg1 > arg4 ? arg4 : arg1;
            int var9 = arg4 >> 1;
            if (arg0 == 17405) {
                int var10 = arg1 >> 1;
                float[] var11 = arg2;
                float[] var12 = new float[var9 * var10 * var6];
                while (true) {
                    OpenGL.glTexImage2Df(arg3, var7, this.method3910(0), arg4, arg1, 0, class491.method2955(this.field9780, false), 5126, var11, 0);
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
                                var18 = var6 + var25;
                                var12[var16] = var26 * 0.25F;
                                var16 += var6;
                            }
                            var17 += var13;
                            var18 += var13;
                        }
                    }
                    var12 = var11;
                    arg4 = var9;
                    arg1 = var10;
                    var11 = var14;
                    var9 >>= 0x1;
                    var8 >>= 0x1;
                    var7++;
                    var10 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V", line = 603)
    private final void method3913(int arg0, int arg1) {
        this.field9790.field6440 -= arg0;
        field9789++;
        if (arg1 != 0) {
            this.method3913(-52, -48);
        }
        this.field9790.field6440 += this.method3907((byte) -73);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)I", line = 622)
    public static final int method3914(int arg0, int arg1) {
        return class128.field1929 == null ? 0 : class128.field1929[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Leea;ILkca;Lti;IZ)V", line = 631)
    public class696(class132 arg0, int arg1, class82 arg2, class438 arg3, int arg4, boolean arg5) {
        this.field9779 = arg5;
        this.field9787 = arg1;
        this.field9780 = arg2;
        this.field9778 = arg4;
        this.field9790 = arg0;
        this.field9791 = arg3;
        OpenGL.glGenTextures(1, class592.field8308, 0);
        this.field9797 = class592.field8308[0];
        this.method3911(32257);
        this.method3913(0, 0);
    }
}
