import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class355 extends class222 {

    @OriginalMember(owner = "client!hp", name = "I", descriptor = "I")
    private int field5074 = -1;

    @OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
    private int field5079 = -1;

    @OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
    public int field5070;

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
    public int field5069;

    @OriginalMember(owner = "client!hp", name = "G", descriptor = "[I")
    public static int[] field5072 = new int[25];

    @OriginalMember(owner = "client!hp", name = "K", descriptor = "[[I")
    public static int[][] field5076 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!hp", name = "M", descriptor = "Liu;")
    public static class517 field5078 = new class517(89, 3);

    @OriginalMember(owner = "client!hp", name = "P", descriptor = "[I")
    public static int[] field5080 = new int[1];

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!hp", name = "A", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!hp", name = "B", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!hp", name = "H", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!hp", name = "L", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIB)V")
    public final void method2158(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 95) {
            this.method2161((byte[]) null, -108, -13, (byte) -65, false, 98, 87, 109, -62, -48);
        }
        OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.field3347, super.field3328, arg2);
        ++field5065;
        this.field5079 = arg1;
        this.field5074 = arg0;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIB)V")
    public static final void method2159(int arg0, int arg1, byte arg2) {
        if (arg2 < 113) {
            method2165(-40);
        }
        ++field5071;
        int var3 = class26.field358.method3651(-10408, class291.field4210.method3220(false, class538.field7500));
        for (class587 var4 = (class587) class432.field6356.method427(true); var4 != null; var4 = (class587) class432.field6356.method420(false)) {
            int var8 = class469.method2728((byte) -90, var4);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class480.field6825 * 16 - -21;
        int var6 = -(var3 / 2) + arg1;
        if (~(var3 + var6) < ~class68.field1285) {
            var6 = -var3 + class68.field1285;
        }
        if (~var6 > -1) {
            var6 = 0;
        }
        int var7 = arg0;
        if (class442.field6464 < arg0 - -var5) {
            var7 = -var5 + class442.field6464;
        }
        class270.field3975 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class354.field5064 = class480.field6825 * 16 + (!class255.field3709 ? 22 : 26);
        class2.field20 = true;
        class6.field49 = var7;
        class526.field7324 = var3;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(IIIB)I")
    public static final int method2160(int arg0, int arg1, int arg2, byte arg3) {
        ++field5075;
        if (class88.field1594 == null) {
            return 0;
        } else {
            int var4 = arg0 >> 7;
            int var5 = arg1 >> 7;
            if (~var4 <= -1 && ~var5 <= -1 && class146.field2247 + -1 >= var4 && class66.field990 + -1 >= var5) {
                if (arg3 != 103) {
                    return 93;
                } else {
                    int var6 = arg2;
                    if (arg2 < 3 && ~(class104.field1755[1][var4][var5] & 2) != -1) {
                        var6 = arg2 + 1;
                    }
                    return class88.field1594[var6].method695(arg0, arg1);
                }
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "([BIIBZIIIII)V")
    public final void method2161(byte[] arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5066;
        if (~arg1 == -1) {
            arg1 = arg2;
        }
        if (arg4) {
            int var11 = class578.method3304(arg8, (byte) -60);
            int var12 = arg2 * var11;
            int var13 = arg1 * var11;
            byte[] var14 = new byte[arg7 * var12];
            for (int var15 = 0; ~var15 > ~arg7; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + -1 + arg7) * var13 + arg9;
                for (int var18 = 0; ~var18 > ~var12; ++var18) {
                    var14[var16++] = arg0[var17++];
                }
            }
            arg0 = var14;
        }
        super.field3332.method648(-113, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg1 != arg2) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        int var19 = 77 % ((arg3 - 25) / 63);
        OpenGL.glTexSubImage2Dub(super.field3347, 0, arg5, arg6, arg2, arg7, arg8, 5121, arg0, arg9);
        if (~arg1 != ~arg2) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public final void method1492(int arg0) {
        ++field5067;
        OpenGL.glFramebufferTexture2DEXT(this.field5079, this.field5074, super.field3347, 0, 0);
        if (arg0 != -29948) {
            method2160(67, -45, 122, (byte) 107);
        }
        this.field5074 = -1;
        this.field5079 = -1;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Ljj;IIIIZ[IZ)V")
    public class355(class66 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5070 = arg4;
        this.field5069 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; arg4 > var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 + arg4 + -1) * arg3;
                for (int var13 = 0; ~var13 > ~arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field3332.method648(74, this);
        if (arg5 && ~super.field3347 != -34038) {
            class352.method2131(124, super.field3347, 32993, super.field3340, arg6, this.field5069, this.field5070, super.field3332.field1159);
            this.method1487(122, true);
        } else {
            OpenGL.glTexImage2Di(super.field3347, 0, super.field3340, this.field5069, this.field5070, 0, 32993, super.field3332.field1159, arg6, 0);
            this.method1487(127, false);
        }
        this.method1490((byte) 70, true);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIIII)V")
    public final void method2162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5077;
        int var8 = -arg5 - (arg2 - super.field3332.field982);
        super.field3332.method648(75, this);
        if (arg0 < 19) {
            field5078 = null;
        }
        OpenGL.glCopyTexSubImage2D(super.field3347, 0, arg4, -arg2 - (arg6 - this.field5070), arg3, var8, arg1, arg2);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZZ)V")
    public final void method2163(int arg0, boolean arg1, boolean arg2) {
        ++field5068;
        if (arg0 < 44) {
            field5080 = null;
        }
        if (super.field3347 == 3553) {
            super.field3332.method648(-108, this);
            OpenGL.glTexParameteri(super.field3347, 10242, !arg2 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field3347, 10243, arg1 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II[IIIIIIZ)V")
    public final void method2164(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        ++field5073;
        if (~arg0 == -1) {
            arg0 = arg5;
        }
        if (arg4 != -26929) {
            field5072 = null;
        }
        if (arg8) {
            int[] var10 = new int[arg5 * arg7];
            for (int var11 = 0; arg7 > var11; ++var11) {
                int var12 = arg5 * var11;
                int var13 = (arg7 + -1 - var11) * arg0 + arg3;
                for (int var14 = 0; ~arg5 < ~var14; ++var14) {
                    var10[var12++] = arg2[var13++];
                }
            }
            arg2 = var10;
        }
        super.field3332.method648(110, this);
        if (~arg0 != ~arg5) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Di(super.field3347, 0, arg6, arg1, arg5, arg7, 32993, super.field3332.field1159, arg2, arg3);
        if (~arg0 != ~arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Ljj;IIIIZ[FI)V")
    public class355(class66 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5069 = arg3;
        this.field5070 = arg4;
        super.field3332.method648(-13, this);
        if (arg5 && ~super.field3347 != -34038) {
            class457.method2680(arg1, arg7, arg6, arg4, (byte) 116, arg3, arg2);
            this.method1487(88, true);
        } else {
            OpenGL.glTexImage2Df(super.field3347, 0, super.field3340, this.field5069, this.field5070, 0, arg7, 5126, arg6, 0);
            this.method1487(111, false);
        }
        this.method1490((byte) 80, true);
    }

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "(I)V")
    public static void method2165(int arg0) {
        field5072 = null;
        field5076 = null;
        int var1 = -32 % ((-29 - arg0) / 51);
        field5078 = null;
        field5080 = null;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Ljj;IIIII)V")
    public class355(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field5069 = arg4;
        this.field5070 = arg5;
        int var7 = -arg3 + -arg5 + super.field3332.field982;
        super.field3332.method648(-44, this);
        OpenGL.glCopyTexImage2D(super.field3347, 0, super.field3340, arg2, var7, arg4, arg5, 0);
        this.method1490((byte) 74, true);
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Ljj;IIII)V")
    public class355(class66 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field5070 = arg4;
        this.field5069 = arg3;
        super.field3332.method648(-34, this);
        OpenGL.glTexImage2Dub(super.field3347, 0, super.field3340, arg3, arg4, 0, class209.method1337(super.field3340, (byte) 126), 5121, (byte[]) null, 0);
        this.method1490((byte) 112, true);
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Ljj;IIIIZ[BIZ)V")
    public class355(class66 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5070 = arg4;
        this.field5069 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 + -1) * arg3;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field3332.method648(124, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field3347 != -34038) {
            class514.method2877(0, arg7, arg6, arg1, arg3, arg2, arg4);
            this.method1487(116, true);
        } else {
            OpenGL.glTexImage2Dub(super.field3347, 0, super.field3340, this.field5069, this.field5070, 0, arg7, 5121, arg6, 0);
            this.method1487(95, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1490((byte) 120, true);
    }
}
