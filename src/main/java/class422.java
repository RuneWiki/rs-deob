import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class class422 implements class684 {

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "Ltda;")
    private class663 field5778 = class399.field5476;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Z")
    private boolean field5761;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    private int field5779;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Lvea;")
    public class288 field5773;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Lbja;")
    public class34 field5762;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "Lko;")
    public class529 field5775;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public int field5768;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    private int field5766;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "Lsaa;")
    public static class345 field5777 = new class345(0, 1);

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "Ldt;")
    public static class252 field5780 = new class252("runescape", "RuneScape", 0);

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "Lok;")
    public static class266 field5781 = new class266();

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field5782 = -1;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)I", line = 11)
    private final int method2551(byte arg0) {
        field5776++;
        int var2 = this.field5762.field453 * this.field5779 * this.field5773.field4228;
        if (arg0 != 100) {
            this.field5773 = null;
        }
        return this.field5761 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V", line = 24)
    public static void method2552(int arg0) {
        if (arg0 == 0) {
            field5781 = null;
            field5780 = null;
            field5777 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II[BII)V", line = 36)
    public final void method2553(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field5760++;
        if (arg0 > 0 && !class262.method1704(arg0, arg1 - 14552)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class262.method1704(arg3, arg1 - 14552)) {
            int var6 = this.field5773.field4228;
            int var7 = 0;
            int var8 = arg3 <= arg0 ? arg3 : arg0;
            int var9 = arg0 >> 1;
            int var10 = arg3 >> 1;
            if (arg1 == 14555) {
                byte[] var11 = arg2;
                byte[] var12 = new byte[var6 * var9 * var10];
                while (true) {
                    OpenGL.glTexImage2Dub(arg4, var7, this.method2556(-104), arg0, arg3, 0, class511.method3090(this.field5773, (byte) -39), 5121, var11, 0);
                    if (var8 <= 1) {
                        return;
                    }
                    int var13 = arg0 * var6;
                    byte[] var14 = var12;
                    for (int var15 = 0; var15 < var6; var15++) {
                        int var16 = var15;
                        int var17 = var15;
                        int var18 = var13 + var15;
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
                    var12 = var11;
                    arg3 = var10;
                    var11 = var14;
                    arg0 = var9;
                    var10 >>= 0x1;
                    var9 >>= 0x1;
                    var8 >>= 0x1;
                    var7++;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V", line = 133)
    private final void method2554(byte arg0) {
        int var2 = -80 / ((arg0 - 76) / 43);
        if (this.field5766 > 0) {
            this.field5775.method3198(this.method2551((byte) 100), 121, this.field5766);
            this.field5766 = 0;
        }
        field5770++;
    }

    @OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V", line = 149)
    protected final void finalize() throws Throwable {
        this.method2554((byte) 8);
        field5763++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V", line = 159)
    private final void method2555(boolean arg0) {
        field5765++;
        this.field5775.method1118(0, this);
        if (!arg0) {
            this.method2553(106, 114, null, -67, 110);
        }
        if (class399.field5476 == this.field5778) {
            OpenGL.glTexParameteri(this.field5768, 10241, this.field5761 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field5768, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field5768, 10241, this.field5761 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field5768, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)I", line = 181)
    public final int method2556(int arg0) {
        if (arg0 > -93) {
            return -35;
        }
        field5764++;
        if (class34.field457 == this.field5762) {
            if (class306.field4412 == this.field5773) {
                return 6407;
            }
            if (class691.field9659 == this.field5773) {
                return 6408;
            }
            if (class88.field993 == this.field5773) {
                return 6406;
            }
            if (class154.field2178 == this.field5773) {
                return 6409;
            }
            if (class315.field4480 == this.field5773) {
                return 6410;
            }
            if (class653.field9125 == this.field5773) {
                return 6145;
            }
        } else if (class34.field460 == this.field5762) {
            if (class306.field4412 == this.field5773) {
                return 34843;
            }
            if (class691.field9659 == this.field5773) {
                return 34842;
            }
            if (class88.field993 == this.field5773) {
                return 34844;
            }
            if (class154.field2178 == this.field5773) {
                return 34846;
            }
            if (class315.field4480 == this.field5773) {
                return 34847;
            }
            if (class653.field9125 == this.field5773) {
                return 6145;
            }
        } else if (class34.field461 == this.field5762) {
            if (class306.field4412 == this.field5773) {
                return 34837;
            }
            if (class691.field9659 == this.field5773) {
                return 34836;
            }
            if (class88.field993 == this.field5773) {
                return 34838;
            }
            if (class154.field2178 == this.field5773) {
                return 34840;
            }
            if (class315.field4480 == this.field5773) {
                return 34841;
            }
            if (class653.field9125 == this.field5773) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII[I)V", line = 278)
    public final void method2557(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field5759++;
        if (arg0 > 0 && !class262.method1704(arg0, arg1 + 3)) {
            throw new IllegalArgumentException("");
        } else if (arg1 < arg3 && !class262.method1704(arg3, 3)) {
            throw new IllegalArgumentException("");
        } else if (class691.field9659 == this.field5773) {
            int var6 = 0;
            int var7 = arg0 >= arg3 ? arg3 : arg0;
            int var8 = arg0 >> 1;
            int var9 = arg3 >> 1;
            int[] var10 = arg4;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg2, var6, this.method2556(-116), arg0, arg3, 0, 32993, this.field5775.field7672, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg0 + var13;
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var14++];
                        int var20 = var10[var13++];
                        int var21 = var18 >> 24 & 0xFF;
                        int var22 = var18 >> 16 & 0xFF;
                        int var23 = var10[var14++];
                        int var24 = var18 & 0xFF;
                        int var25 = var18 >> 8 & 0xFF;
                        int var26 = ((var20 & 0xFF63) >> 8) + var25;
                        int var27 = (var20 & 0xFF) + var24;
                        int var28 = (var20 >> 16 & 0xFF) + var22;
                        int var29 = (var20 >> 24 & 0xFF) + var21;
                        int var30 = (var19 & 0xFF) + var27;
                        int var31 = (var19 >> 24 & 0xFF) + var29;
                        int var32 = ((var19 & 0xFF243A) >> 16) + var28;
                        int var33 = ((var19 & 0xFF2A) >> 8) + var26;
                        int var34 = ((var23 & 0xFF91B9) >> 16) + var32;
                        int var35 = (var23 >> 24 & 0xFF) + var31;
                        int var36 = (var23 & 0xFF) + var30;
                        int var37 = ((var23 & 0xFFC4) >> 8) + var33;
                        var11[var12++] = class746.method4158(class702.method3977(1020, var36) >> 2, class746.method4158(class746.method4158(class702.method3977(-16777216, var35 << 22), class702.method3977(1020, var34) << 14), class702.method3977(var37 << 6, 65280)));
                    }
                    var14 += arg0;
                    var13 += arg0;
                }
                int[] var16 = var11;
                var11 = var10;
                arg0 = var8;
                var10 = var16;
                arg3 = var9;
                var8 >>= 0x1;
                var9 >>= 0x1;
                var7 >>= 0x1;
                var6++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)I", line = 383)
    public static final int method2558(int arg0, int arg1) {
        return class392.field5398 == null ? 0 : class392.field5398[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII[F)V", line = 387)
    public final void method2559(int arg0, int arg1, int arg2, int arg3, float[] arg4) {
        field5774++;
        if (arg3 > arg2 && !class262.method1704(arg3, 3)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class262.method1704(arg1, arg2 ^ 0x3)) {
            int var6 = this.field5773.field4228;
            int var7 = 0;
            int var8 = arg1 > arg3 ? arg3 : arg1;
            int var9 = arg3 >> 1;
            int var10 = arg1 >> 1;
            float[] var11 = arg4;
            float[] var12 = new float[var6 * var10 * var9];
            while (true) {
                OpenGL.glTexImage2Df(arg0, var7, this.method2556(arg2 - 124), arg3, arg1, 0, class511.method3090(this.field5773, (byte) -39), 5126, var11, 0);
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
                            float var21 = var11[var17];
                            int var22 = var6 + var17;
                            float var23 = var11[var22] + var21;
                            var17 = var6 + var22;
                            float var24 = var11[var18] + var23;
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
                var11 = var15;
                arg3 = var9;
                arg1 = var10;
                var7++;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V", line = 483)
    private final void method2560(int arg0, int arg1) {
        field5769++;
        this.field5775.field2389 -= arg1;
        int var3 = -78 % ((arg0 + 83) / 36);
        this.field5775.field2389 += this.method2551((byte) 100);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 498)
    public final void method2561(int arg0) {
        field5767++;
        int var2 = this.field5775.method1131(-96);
        int var3 = 58 % ((arg0 + 77) / 43);
        int var4 = this.field5775.field7663[var2];
        if (this.field5768 != var4) {
            if (var4 != 0) {
                OpenGL.glBindTexture(var4, 0);
                OpenGL.glDisable(var4);
            }
            OpenGL.glEnable(this.field5768);
            this.field5775.field7663[var2] = this.field5768;
        }
        OpenGL.glBindTexture(this.field5768, this.field5766);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([Lmv;ILqfa;)Lhw;", line = 526)
    public static final class140 method2562(class394[] arg0, int arg1, class106 arg2) {
        field5758++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field5420 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = arg1; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field5420);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class104.field1207, 0);
        if (class104.field1207[0] == 0) {
            if (class104.field1207[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class104.field1207, 1);
            if (class104.field1207[1] > 1) {
                byte[] var7 = new byte[class104.field1207[1]];
                OpenGL.glGetInfoLogARB(var4, class104.field1207[1], class104.field1207, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class104.field1207[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field5420);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class140(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILtda;)V", line = 593)
    public final void method2563(int arg0, class663 arg1) {
        if (this.field5778 != arg1) {
            this.field5778 = arg1;
            this.method2555(true);
        }
        if (arg0 != -1764) {
            this.field5779 = -119;
        }
        field5772++;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lko;ILvea;Lbja;IZ)V", line = 617)
    public class422(class529 arg0, int arg1, class288 arg2, class34 arg3, int arg4, boolean arg5) {
        this.field5761 = arg5;
        this.field5779 = arg4;
        this.field5773 = arg2;
        this.field5762 = arg3;
        this.field5775 = arg0;
        this.field5768 = arg1;
        OpenGL.glGenTextures(1, class35.field470, 0);
        this.field5766 = class35.field470[0];
        this.method2555(true);
        this.method2560(-125, 0);
    }
}
