import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class101 extends class84 implements class145 {

    @OriginalMember(owner = "client!qfa", name = "A", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client!qfa", name = "K", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client!qfa", name = "E", descriptor = "I")
    public static int field1399 = 0;

    @OriginalMember(owner = "client!qfa", name = "J", descriptor = "F")
    public static float field1404 = 1024.0F;

    @OriginalMember(owner = "client!qfa", name = "H", descriptor = "I")
    public static int field1402 = 2;

    @OriginalMember(owner = "client!qfa", name = "y", descriptor = "[Lmk;")
    public static class56[] field1393 = new class56[14];

    @OriginalMember(owner = "client!qfa", name = "B", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!qfa", name = "C", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!qfa", name = "D", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!qfa", name = "F", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!qfa", name = "G", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!qfa", name = "I", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!qfa", name = "L", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!qfa", name = "M", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!qfa", name = "N", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!qfa", name = "O", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!qfa", name = "P", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!qfa", name = "Q", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!qfa", name = "z", descriptor = "Lbl;")
    public static class651 field1394;

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(I)Z", line = 6)
    public final boolean method803(int arg0) {
        ++field1406;
        return arg0 > -36 ? false : false;
    }

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "(I)V", line = 18)
    public static void method804(int arg0) {
        if (arg0 < -32) {
            field1393 = null;
            field1394 = null;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILet;III[BIII)V", line = 36)
    public final void method805(int arg0, class596 arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        ++field1407;
        super.field1159.method2396(22357, this);
        if (arg2 == 0) {
            arg2 = arg6;
        }
        OpenGL.glPixelStorei(3317, 1);
        if (arg2 != arg6) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Dub(super.field1141, 0, arg4, arg7, arg6, arg0, class705.method3951(arg1, 87), 5121, arg5, arg8);
        if (arg3 != -8981) {
            field1394 = null;
        }
        if (~arg2 != ~arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)I", line = 59)
    public final int method806(int arg0) {
        ++field1401;
        if (arg0 < 116) {
            this.method812(-41, -73, 65, 78, (int[]) null, 26, 56, 5);
        }
        return this.field1395;
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Ltk;Let;II[FII)V", line = 71)
    public class101(class347 arg0, class596 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class285.field3593, arg2 * arg3, false);
        this.field1395 = arg3;
        this.field1405 = arg2;
        super.field1159.method2396(22357, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field1141, 0, this.method702(94), arg2, arg3, 0, class705.method3951(super.field1161, -55), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Ltk;Let;II[BII)V", line = 85)
    public class101(class347 arg0, class596 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class285.field3589, arg2 * arg3, false);
        this.field1405 = arg2;
        this.field1395 = arg3;
        super.field1159.method2396(22357, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field1141, 0, this.method702(99), arg2, arg3, 0, class705.method3951(super.field1161, -95), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Ltk;Let;Lwha;II)V", line = 102)
    public class101(class347 arg0, class596 arg1, class285 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field1395 = arg4;
        this.field1405 = arg3;
        super.field1159.method2396(22357, this);
        OpenGL.glTexImage2Dub(super.field1141, 0, this.method702(99), arg3, arg4, 0, class705.method3951(super.field1161, 77), class93.method753(-44, super.field1142), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II[IIIII)V", line = 114)
    public final void method807(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1397;
        int[] var8 = new int[this.field1405 * this.field1395];
        super.field1159.method2396(22357, this);
        OpenGL.glGetTexImagei(super.field1141, 0, 32993, 5121, var8, 0);
        if (arg5 == 19229) {
            for (int var9 = 0; arg4 > var9; ++var9) {
                class135.method995(var8, (arg4 + -1 + arg6 + -var9) * this.field1405, arg2, arg3 - -(arg0 * var9), arg0);
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(FI)F", line = 138)
    public final float method808(float arg0, int arg1) {
        if (arg1 != 9347) {
            return 0.759525F;
        } else {
            ++field1400;
            return arg0;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(III)V", line = 155)
    public static final void method809(int arg0, int arg1, int arg2) {
        ++field1411;
        if (arg0 == 0) {
            class37 var3 = class636.method3571(16, arg1, -81);
            var3.method232(-3);
            var3.field579 = arg2;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I[BILtk;)Lap;", line = 169)
    public static final class479 method810(int arg0, byte[] arg1, int arg2, class347 arg3) {
        ++field1410;
        if (arg2 != -4348) {
            return null;
        } else if (arg1 == null) {
            return null;
        } else {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg0, var4);
            OpenGL.glProgramRawARB(arg0, 34933, arg1);
            OpenGL.glGetIntegerv(34379, class249.field3200, 0);
            if (~class249.field3200[0] != 0) {
                OpenGL.glBindProgramARB(arg0, 0);
                return null;
            } else {
                OpenGL.glBindProgramARB(arg0, 0);
                return new class479(arg3, arg0, var4);
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIII)V", line = 199)
    public static final void method811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1403;
        class630.method3539(112, arg0);
        int var7 = 0;
        int var8 = -arg1 + arg0;
        if (~var8 > -1) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        if (arg6 != 3317) {
            field1394 = null;
        }
        int var13 = -1;
        if (~arg3 <= ~class546.field7619 && arg3 <= class760.field10606) {
            int[] var14 = class432.field5765[arg3];
            int var15 = class720.method4025(class667.field9373, arg5 - arg0, class225.field2994, 0);
            int var16 = class720.method4025(class667.field9373, arg5 - -arg0, class225.field2994, 0);
            int var17 = class720.method4025(class667.field9373, -var8 + arg5, class225.field2994, 0);
            int var18 = class720.method4025(class667.field9373, arg5 - -var8, class225.field2994, 0);
            class636.method3569(var17, arg4, var15, 347845800, var14);
            class636.method3569(var18, arg2, var17, 347845800, var14);
            class636.method3569(var16, arg4, var18, 347845800, var14);
        }
        int var19 = -1;
        while (~var9 < ~var7) {
            var13 += 2;
            var19 += 2;
            var12 += var19;
            var10 += var13;
            if (var12 >= 0 && ~var11 <= -2) {
                --var11;
                class80.field1108[var11] = var7;
                var12 -= var11 << 1;
            }
            ++var7;
            if (~var10 <= -1) {
                --var9;
                var10 -= var9 << 1;
                int var20 = -var9 + arg3;
                int var21 = arg3 + var9;
                if (var21 >= class546.field7619 && class760.field10606 >= var20) {
                    if (var9 < var8) {
                        int var22 = class80.field1108[var9];
                        int var23 = class720.method4025(class667.field9373, arg5 + var7, class225.field2994, 0);
                        int var24 = class720.method4025(class667.field9373, -var7 + arg5, class225.field2994, 0);
                        int var25 = class720.method4025(class667.field9373, arg5 + var22, class225.field2994, 0);
                        int var26 = class720.method4025(class667.field9373, arg5 - var22, class225.field2994, 0);
                        if (var21 <= class760.field10606) {
                            int[] var27 = class432.field5765[var21];
                            class636.method3569(var26, arg4, var24, arg6 ^ 347846749, var27);
                            class636.method3569(var25, arg2, var26, 347845800, var27);
                            class636.method3569(var23, arg4, var25, 347845800, var27);
                        }
                        if (class546.field7619 <= var20) {
                            int[] var28 = class432.field5765[var20];
                            class636.method3569(var26, arg4, var24, 347845800, var28);
                            class636.method3569(var25, arg2, var26, 347845800, var28);
                            class636.method3569(var23, arg4, var25, 347845800, var28);
                        }
                    } else {
                        int var29 = class720.method4025(class667.field9373, arg5 - -var7, class225.field2994, 0);
                        int var30 = class720.method4025(class667.field9373, -var7 + arg5, class225.field2994, 0);
                        if (~var21 >= ~class760.field10606) {
                            class636.method3569(var29, arg4, var30, 347845800, class432.field5765[var21]);
                        }
                        if (~var20 <= ~class546.field7619) {
                            class636.method3569(var29, arg4, var30, 347845800, class432.field5765[var20]);
                        }
                    }
                }
            }
            int var31 = -var7 + arg3;
            int var32 = arg3 - -var7;
            if (~var32 <= ~class546.field7619 && class760.field10606 >= var31) {
                int var33 = arg5 + var9;
                int var34 = -var9 + arg5;
                if (~var33 <= ~class667.field9373 && var34 <= class225.field2994) {
                    int var35 = class720.method4025(class667.field9373, var33, class225.field2994, arg6 + -3317);
                    int var36 = class720.method4025(class667.field9373, var34, class225.field2994, 0);
                    if (~var7 > ~var8) {
                        int var37 = var7 > var11 ? class80.field1108[var7] : var11;
                        int var38 = class720.method4025(class667.field9373, arg5 + var37, class225.field2994, 0);
                        int var39 = class720.method4025(class667.field9373, arg5 - var37, class225.field2994, 0);
                        if (~var32 >= ~class760.field10606) {
                            int[] var40 = class432.field5765[var32];
                            class636.method3569(var39, arg4, var36, 347845800, var40);
                            class636.method3569(var38, arg2, var39, 347845800, var40);
                            class636.method3569(var35, arg4, var38, 347845800, var40);
                        }
                        if (class546.field7619 <= var31) {
                            int[] var41 = class432.field5765[var31];
                            class636.method3569(var39, arg4, var36, 347845800, var41);
                            class636.method3569(var38, arg2, var39, 347845800, var41);
                            class636.method3569(var35, arg4, var38, 347845800, var41);
                        }
                    } else {
                        if (class760.field10606 >= var32) {
                            class636.method3569(var35, arg4, var36, 347845800, class432.field5765[var32]);
                        }
                        if (~class546.field7619 >= ~var31) {
                            class636.method3569(var35, arg4, var36, arg6 ^ 347846749, class432.field5765[var31]);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIII[IIII)V", line = 384)
    public final void method812(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
        super.field1159.method2396(22357, this);
        if (arg7 != -25782) {
            field1404 = 1.673954F;
        }
        if (arg1 == 0) {
            arg1 = arg5;
        }
        ++field1396;
        if (~arg1 != ~arg5) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Di(super.field1141, 0, arg0, arg3, arg5, arg6, 32993, super.field1159.field4487, arg4, arg2);
        if (arg1 != arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Ltk;II[III)V", line = 409)
    public class101(class347 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class269.field3396, class285.field3589, arg1 * arg2, false);
        this.field1405 = arg1;
        this.field1395 = arg2;
        super.field1159.method2396(22357, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field1141, 0, 6408, this.field1405, this.field1395, 0, 32993, super.field1159.field4487, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BZZ)V", line = 423)
    public final void method813(byte arg0, boolean arg1, boolean arg2) {
        int var4 = 18 % ((7 - arg0) / 50);
        ++field1398;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IF)F", line = 432)
    public final float method814(int arg0, float arg1) {
        ++field1408;
        return arg0 != 20275 ? 0.9110058F : arg1;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)I", line = 444)
    public final int method815(int arg0) {
        if (arg0 != 11283) {
            this.method807(118, -50, (int[]) null, -55, 95, -115, 103);
        }
        ++field1409;
        return this.field1405;
    }
}
