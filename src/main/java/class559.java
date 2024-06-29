import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class559 implements class114 {

    @OriginalMember(owner = "client!ffa", name = "r", descriptor = "I")
    private int field8203 = 0;

    @OriginalMember(owner = "client!ffa", name = "x", descriptor = "[Ldv;")
    private class113[] field8209 = new class113[9];

    @OriginalMember(owner = "client!ffa", name = "z", descriptor = "I")
    private int field8211 = -1;

    @OriginalMember(owner = "client!ffa", name = "k", descriptor = "Luca;")
    private class287 field8196;

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "I")
    private int field8193;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "I")
    public static int field8187;

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "I")
    public static int field8188;

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "I")
    public static int field8189;

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "I")
    public static int field8191;

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "I")
    public static int field8192;

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "I")
    public static int field8194;

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "I")
    public static int field8195;

    @OriginalMember(owner = "client!ffa", name = "l", descriptor = "I")
    public static int field8197;

    @OriginalMember(owner = "client!ffa", name = "m", descriptor = "I")
    public static int field8198;

    @OriginalMember(owner = "client!ffa", name = "n", descriptor = "I")
    public static int field8199;

    @OriginalMember(owner = "client!ffa", name = "o", descriptor = "I")
    public static int field8200;

    @OriginalMember(owner = "client!ffa", name = "p", descriptor = "I")
    public static int field8201;

    @OriginalMember(owner = "client!ffa", name = "q", descriptor = "I")
    private int field8202;

    @OriginalMember(owner = "client!ffa", name = "s", descriptor = "I")
    private int field8204;

    @OriginalMember(owner = "client!ffa", name = "t", descriptor = "I")
    private int field8205;

    @OriginalMember(owner = "client!ffa", name = "u", descriptor = "I")
    public static int field8206;

    @OriginalMember(owner = "client!ffa", name = "v", descriptor = "I")
    public static int field8207;

    @OriginalMember(owner = "client!ffa", name = "w", descriptor = "I")
    public static int field8208;

    @OriginalMember(owner = "client!ffa", name = "y", descriptor = "I")
    public static int field8210;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILaaa;I)V", line = 7)
    public final void method3235(int arg0, class227 arg1, int arg2) {
        this.method3240(arg1, (byte) -58, arg2, 0);
        field8200++;
        int var4 = -57 % ((arg0 - 12) / 37);
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILeg;II)V", line = 17)
    public final void method3236(int arg0, class364 arg1, int arg2, int arg3) {
        if (arg0 != 16795) {
            this.method848((byte) 74);
        }
        field8207++;
        this.method3237(0, arg2, arg1, arg3, -1);
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IILeg;II)V", line = 29)
    private final void method3237(int arg0, int arg1, class364 arg2, int arg3, int arg4) {
        field8210++;
        if (this.field8211 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg3;
        if (~(~var6 & this.field8204) == arg4) {
            this.field8202 = arg2.field5338;
            this.field8205 = arg2.field5338;
        } else if (this.field8205 != arg2.field5338 || this.field8202 != arg2.field5338) {
            throw new RuntimeException();
        }
        arg2.method2233(arg0, (byte) 7, this.field8211, class370.field5487[arg3], arg1);
        this.field8209[arg3] = arg2;
        this.field8204 |= var6;
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(I)Z", line = 57)
    public final boolean method3238(int arg0) {
        if (arg0 < 39) {
            return true;
        } else {
            field8194++;
            int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field8211);
            return var2 == 36053;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(B)V", line = 78)
    public final void method848(byte arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field8193);
        field8188++;
        int var2 = -4 % ((arg0 - 75) / 37);
        this.field8203 |= 0x4;
        this.field8211 = this.method3242(false);
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ldh;IZ)V", line = 90)
    public final void method3239(class267 arg0, int arg1, boolean arg2) {
        field8191++;
        if (this.field8211 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg1;
        if ((~var4 & this.field8204) == 0) {
            this.field8205 = arg0.field3476;
            this.field8202 = arg0.field3492;
        } else if (this.field8205 != arg0.field3476 || this.field8202 != arg0.field3492) {
            throw new RuntimeException();
        }
        arg0.method1598(99, class370.field5487[arg1], this.field8211);
        this.field8209[arg1] = arg0;
        if (arg2) {
            this.field8209 = null;
        }
        this.field8204 |= var4;
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(B)V", line = 125)
    public final void method851(byte arg0) {
        int var2 = 51 % ((arg0 - 21) / 42);
        OpenGL.glBindFramebufferEXT(36008, this.field8193);
        field8195++;
        this.field8203 |= 0x1;
        this.field8211 = this.method3242(false);
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Laaa;BII)V", line = 137)
    private final void method3240(class227 arg0, byte arg1, int arg2, int arg3) {
        field8198++;
        if (this.field8211 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg2;
        if ((this.field8204 & ~var5) == 0) {
            this.field8202 = arg0.field3019;
            this.field8205 = arg0.field3016;
        } else if (this.field8205 != arg0.field3016 || this.field8202 != arg0.field3019) {
            throw new RuntimeException();
        }
        arg0.method1421(this.field8211, arg3, 45, class370.field5487[arg2]);
        this.field8209[arg2] = arg0;
        this.field8204 |= var5;
        if (arg1 != -58) {
            this.method3236(81, null, 115, 97);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIII)V", line = 173)
    public static final void method3241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 1) {
            method3241(-101, -109, -27, 24, -57, 29, 7);
        }
        field8201++;
        if (arg3 != 8 && arg3 != 16) {
            class44 var7 = class603.field8695[arg1][arg2][arg6];
            if (var7 == null) {
                var7 = new class44(arg1);
            }
            if (arg3 == 1) {
                var7.field674 = (short) arg5;
                var7.field665 = (short) arg4;
            } else if (arg3 == 2) {
                var7.field671 = (short) arg5;
                var7.field676 = (short) arg4;
            }
            if (class142.field2060) {
                class168.method1170(arg0 + 64);
                return;
            }
            return;
        }
        if (arg3 != 8) {
            int var8 = (arg2 << class125.field1831) + class263.field3412;
            int var9 = var8 - class263.field3412;
            int var10 = arg6 << class125.field1831;
            int var11 = var10 + class263.field3412;
            int var12 = class262.field3404[arg1].method3822(arg6, arg2 + 1, arg0 ^ 0x1);
            int var13 = class262.field3404[arg1].method3822(arg6 + 1, arg2, arg0 ^ 0x1);
            class191.field2591[class261.field3398++] = new class203(arg3, arg1, var8, var9, var9, var8, var12, var13, var13 - arg4, -arg4 + var12, var10, var11, var11, var10);
            return;
        }
        int var14 = arg2 << class125.field1831;
        int var15 = class263.field3412 + var14;
        int var16 = arg6 << class125.field1831;
        int var17 = class263.field3412 + var16;
        int var18 = class262.field3404[arg1].method3822(arg6, arg2, 0);
        int var19 = class262.field3404[arg1].method3822(arg6 + 1, arg2 + 1, arg0 ^ 0x1);
        class191.field2591[class261.field3398++] = new class203(arg3, arg1, var14, var15, var15, var14, var18, var19, var19 - arg4, -arg4 + var18, var16, var17, var17, var16);
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(Z)I", line = 247)
    private final int method3242(boolean arg0) {
        field8206++;
        if ((this.field8203 & 0x4) != 0) {
            return 36160;
        } else if ((this.field8203 & 0x2) != 0) {
            return 36009;
        } else if ((this.field8203 & 0x1) == 0) {
            if (arg0) {
                this.method849(-19);
            }
            return -1;
        } else {
            return 36008;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "(I)I", line = 272)
    public static final int method3243(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class346.field5108 - 1; var2++) {
            if (arg0 < class6.field207[var2] + class347.field5150[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class346.field5108 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)V", line = 293)
    public final void method3244(int arg0, int arg1) {
        if (arg1 != 36009) {
            this.field8203 = 121;
        }
        if (this.field8209[arg0] != null) {
            this.field8209[arg0].method847((byte) -79);
        }
        field8186++;
        this.field8204 &= ~(0x1 << arg0);
        this.field8209[arg0] = null;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V", line = 313)
    public final void method849(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        int var2 = -19 / ((arg0 - 11) / 51);
        field8197++;
        this.field8203 &= 0xFFFFFFFB;
        this.field8211 = this.method3242(false);
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(II)V", line = 325)
    public final void method3245(int arg0, int arg1) {
        field8199++;
        if (this.field8211 == -1) {
            throw new RuntimeException();
        }
        int var3 = -20 % ((arg1 - 8) / 51);
        OpenGL.glDrawBuffer(class370.field5487[arg0]);
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V", line = 339)
    public final void method852(int arg0) {
        field8192++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field8203 &= 0xFFFFFFFE;
        if (arg0 == -5366) {
            this.field8211 = this.method3242(false);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Luca;)V", line = 417)
    public class559(class287 arg0) {
        if (!arg0.field4062) {
            throw new IllegalStateException("");
        }
        this.field8196 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class541.field8024, 0);
        this.field8193 = class541.field8024[0];
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(B)V", line = 355)
    public final void method850(byte arg0) {
        field8187++;
        OpenGL.glBindFramebufferEXT(36009, this.field8193);
        this.field8203 |= 0x2;
        int var2 = -73 % ((5 - arg0) / 58);
        this.field8211 = this.method3242(false);
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)V", line = 367)
    public final void method853(boolean arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field8208++;
        this.field8203 &= 0xFFFFFFFD;
        this.field8211 = this.method3242(arg0);
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(II)V", line = 382)
    public final void method3246(int arg0, int arg1) {
        if (arg0 != -3) {
            this.field8205 = -58;
        }
        field8190++;
        if (this.field8211 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class370.field5487[arg1]);
    }

    @OriginalMember(owner = "client!ffa", name = "finalize", descriptor = "()V", line = 397)
    protected final void finalize() throws Throwable {
        field8189++;
        this.field8196.method1765(this.field8193, 5532);
        super.finalize();
    }
}
