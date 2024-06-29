import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class133 extends class386 {

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    private int field2175 = -1;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    private int field2177 = -1;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public int field2179;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public int field2178;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "Lac;")
    public static class501 field2182 = new class501("WTWIP", 3);

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI[IIIIIIB)V", line = 4)
    public final void method1152(boolean arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        if (arg4 == 0) {
            arg4 = arg5;
        }
        if (arg8 < 26) {
            this.method1157(-18, -59, -39, false);
        }
        ++field2186;
        if (arg0) {
            int[] var10 = new int[arg5 * arg6];
            for (int var11 = 0; ~var11 > ~arg6; ++var11) {
                int var12 = arg5 * var11;
                int var13 = (arg6 - var11 + -1) * arg4 + arg1;
                for (int var14 = 0; var14 < arg5; ++var14) {
                    var10[var12++] = arg2[var13++];
                }
            }
            arg2 = var10;
        }
        super.field6003.method856(false, this);
        if (~arg4 != ~arg5) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Di(super.field5990, 0, arg3, arg7, arg5, arg6, 32993, super.field6003.field1388, arg2, arg1);
        if (arg4 != arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIZII)V", line = 55)
    public static final void method1153(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            method1154(true);
        }
        for (int var5 = 0; ~class700.field9880 < ~var5; ++var5) {
            Rectangle var6 = class462.field6896[var5];
            if (~(var6.x + var6.width) < ~arg0 && ~var6.x > ~(arg0 + arg1) && arg4 < var6.y - -var6.height && arg3 + arg4 > var6.y) {
                class532.field7753[var5] = true;
            }
        }
        ++field2176;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ler;IIIIZ[BIZ)V", line = 78)
    public class133(class92 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2179 = arg4;
        this.field2178 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; var11 < arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + -1 + arg4) * arg3;
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field6003.method856(false, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field5990 != 34037) {
            class273.method1925(arg2, arg6, arg1, arg3, arg7, arg4, 191014433);
            this.method2507(true, 9987);
        } else {
            OpenGL.glTexImage2Dub(super.field5990, 0, super.field5988, this.field2178, this.field2179, 0, arg7, 5121, arg6, 0);
            this.method2507(false, 9987);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2509(true, -120);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ler;IIII)V", line = 131)
    public class133(class92 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field2178 = arg3;
        this.field2179 = arg4;
        super.field6003.method856(false, this);
        OpenGL.glTexImage2Dub(super.field5990, 0, super.field5988, arg3, arg4, 0, class329.method2212(super.field5988, -116), 5121, (byte[]) null, 0);
        this.method2509(true, -110);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ler;IIIII)V", line = 143)
    public class133(class92 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field2178 = arg4;
        this.field2179 = arg5;
        int var7 = super.field6003.field1242 - arg5 - arg3;
        super.field6003.method856(false, this);
        OpenGL.glCopyTexImage2D(super.field5990, 0, super.field5988, arg2, var7, arg4, arg5, 0);
        this.method2509(true, -118);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ler;IIIIZ[IIIZ)V", line = 157)
    public class133(class92 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2178 = arg3;
        this.field2179 = arg4;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; arg4 > var12; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (-var12 + arg4 - 1) * arg3;
                for (int var15 = 0; ~var15 > ~arg3; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field6003.method856(false, this);
        if (~super.field5990 != -34038 && arg5 && ~arg7 == -1 && arg8 == 0) {
            class126.method1109(arg6, 32993, this.field2178, super.field5988, this.field2179, -12421, super.field5990, super.field6003.field1388);
            this.method2507(true, 9987);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field5990, 0, super.field5988, this.field2178, this.field2179, 0, 32993, super.field6003.field1388, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method2507(false, 9987);
        }
        this.method2509(true, -114);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ler;IIIIZ[FI)V", line = 211)
    public class133(class92 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2178 = arg3;
        this.field2179 = arg4;
        super.field6003.method856(false, this);
        if (arg5 && super.field5990 != 34037) {
            class330.method2214(arg4, arg7, arg3, arg1, (byte) 63, arg2, arg6);
            this.method2507(true, 9987);
        } else {
            OpenGL.glTexImage2Df(super.field5990, 0, super.field5988, this.field2178, this.field2179, 0, arg7, 5126, arg6, 0);
            this.method2507(false, 9987);
        }
        this.method2509(true, -48);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Z)V", line = 233)
    public static void method1154(boolean arg0) {
        field2182 = null;
        if (arg0) {
            method1156((byte) -85);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIZIIII[BI)V", line = 243)
    public final void method1155(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        if (arg0 == 0) {
            arg0 = arg6;
        }
        ++field2180;
        if (arg3) {
            int var11 = class470.method2915(arg7, 124);
            int var12 = arg6 * var11;
            int var13 = arg0 * var11;
            byte[] var14 = new byte[arg1 * var12];
            for (int var15 = 0; ~var15 > ~arg1; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg1 + -1) * var13 + arg2;
                for (int var18 = 0; var18 < var12; ++var18) {
                    var14[var16++] = arg8[var17++];
                }
            }
            arg8 = var14;
        }
        super.field6003.method856(false, this);
        if (arg4 != 10243) {
            this.field2175 = 72;
        }
        OpenGL.glPixelStorei(3317, 1);
        if (arg0 != arg6) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Dub(super.field5990, 0, arg5, arg9, arg6, arg1, arg7, 5121, arg8, arg2);
        if (~arg0 != ~arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V", line = 301)
    public static final void method1156(byte arg0) {
        if (class652.field9132 == null) {
            class652.field9132 = class687.method3900(3);
            class255.field4056 = class652.field9132[0];
            class226.field3639 = class112.method1033(-11752);
        }
        ++field2183;
        if (class204.field3327 == null) {
            class591.method3450(0);
        }
        class687 var1 = class255.field4056;
        int var2 = class623.method3611((byte) -52);
        if (class255.field4056 == var1) {
            class695.field9753 = class255.field4056.field9637.method1091(class135.field2206, 1);
            if (class255.field4056.field9628) {
                class153.field2577 = (-class255.field4056.field9634 + class255.field4056.field9624) * var2 / 100 + class255.field4056.field9634;
            }
            if (class255.field4056.field9630) {
                class695.field9753 = class695.field9753 + class153.field2577 + "%";
            }
        } else if (class687.field9656 == class255.field4056) {
            class204.field3327 = null;
            class68.method715(3, (byte) -59);
        } else {
            class695.field9753 = var1.field9627.method1091(class135.field2206, 1);
            class153.field2577 = var1.field9624;
            if (class255.field4056.field9630) {
                class695.field9753 = class695.field9753 + var1.field9624 + "%";
            }
            if (class255.field4056.field9628 || var1.field9628) {
                class226.field3639 = class112.method1033(-11752);
            }
        }
        if (arg0 > -26) {
            field2182 = null;
        }
        if (class204.field3327 != null) {
            class204.field3327.method2938(class153.field2577, class255.field4056, class226.field3639, -24436, class695.field9753);
            if (class341.field5519 != null) {
                for (int var3 = class205.field3352 - -1; ~var3 > ~class341.field5519.length; ++var3) {
                    if (~class341.field5519[var3].method2064(90) <= -101 && var3 - 1 == class205.field3352 && ~class682.field9564 <= -2 && class204.field3327.method2936(1)) {
                        try {
                            class341.field5519[var3].method2066(25766);
                        } catch (Exception var4) {
                            class341.field5519 = null;
                            return;
                        }
                        class204.field3327.method2935((byte) -106, class341.field5519[var3]);
                        ++class205.field3352;
                        if (class341.field5519.length + -1 <= class205.field3352 && class341.field5519.length > 1) {
                            class205.field3352 = class310.field4883.method3896(12288) ? 0 : -1;
                        }
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIZ)V", line = 399)
    public final void method1157(int arg0, int arg1, int arg2, boolean arg3) {
        ++field2181;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.field5990, super.field5993, arg2);
        if (arg3) {
            this.method1155(-17, 68, -127, false, -92, -65, -32, 102, (byte[]) null, -39);
        }
        this.field2175 = arg0;
        this.field2177 = arg1;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 415)
    public final void method667(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field2175, this.field2177, super.field5990, 0, 0);
        ++field2184;
        if (arg0 == 13035) {
            this.field2175 = -1;
            this.field2177 = -1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZZB)V", line = 432)
    public final void method1158(boolean arg0, boolean arg1, byte arg2) {
        ++field2187;
        if (arg2 < 61) {
            this.method1157(4, -126, -121, true);
        }
        if (super.field5990 == 3553) {
            super.field6003.method856(false, this);
            OpenGL.glTexParameteri(super.field5990, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field5990, 10243, arg0 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIII)V", line = 456)
    public final void method1159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2185;
        int var8 = -arg4 - arg1 + super.field6003.field1242;
        super.field6003.method856(false, this);
        OpenGL.glCopyTexSubImage2D(super.field5990, 0, arg5, -arg2 + this.field2179 + -arg4, arg6, var8, arg3, arg4);
        if (arg0 <= -64) {
            OpenGL.glFlush();
        }
    }
}
