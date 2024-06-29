import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class292 implements class324 {

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    private int field4331 = 0;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "[Lbv;")
    private class205[] field4333 = new class205[9];

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
    private int field4340 = -1;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "Lbt;")
    private class33 field4332;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    private int field4327;

    @OriginalMember(owner = "client!nn", name = "t", descriptor = "[I")
    public static int[] field4344 = new int[200];

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
    private int field4341;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
    private int field4342;

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!nn", name = "u", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!nn", name = "v", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!nn", name = "y", descriptor = "I")
    private int field4349;

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!nn", name = "A", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!nn", name = "B", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V", line = 4)
    public final void method1865(int arg0) {
        field4345++;
        OpenGL.glBindFramebufferEXT(36009, this.field4327);
        this.field4331 |= 0x2;
        this.field4340 = this.method1867(arg0 + 58368);
        if (arg0 != -22359) {
            this.field4342 = -66;
        }
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)Z", line = 17)
    public final boolean method1866(int arg0) {
        field4330++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field4340);
        return ~var2 == arg0;
    }

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "(I)I", line = 40)
    private final int method1867(int arg0) {
        field4325++;
        if ((this.field4331 & 0x4) != 0) {
            return 36160;
        } else if ((this.field4331 & 0x2) != 0) {
            return 36009;
        } else if (arg0 == 36009) {
            return (this.field4331 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZ)V", line = 66)
    public final void method1868(int arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field4337++;
        if (this.field4340 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class430.field6185[arg0]);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZILhp;)V", line = 80)
    public final void method1869(int arg0, boolean arg1, int arg2, class221 arg3) {
        this.method1881(114, arg2, 0, arg3, arg0);
        field4339++;
        if (arg1) {
            this.method1875(null, 21, 69, 20);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)V", line = 92)
    public final void method1870(boolean arg0) {
        field4338++;
        if (arg0) {
            this.field4332 = null;
        }
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field4331 &= 0xFFFFFFFB;
        this.field4340 = this.method1867(36009);
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)V", line = 106)
    public static void method1871(byte arg0) {
        field4344 = null;
        if (arg0 != -1) {
            field4344 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lbt;)V", line = 360)
    public class292(class33 arg0) {
        if (!arg0.field758) {
            throw new IllegalStateException("");
        }
        this.field4332 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class267.field4018, 0);
        this.field4327 = class267.field4018[0];
    }

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)V", line = 122)
    public final void method1872(int arg0) {
        field4348++;
        OpenGL.glBindFramebufferEXT(36160, this.field4327);
        int var2 = 39 / ((-arg0 - 12) / 47);
        this.field4331 |= 0x4;
        this.field4340 = this.method1867(36009);
    }

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "(I)I", line = 134)
    public final int method1873(int arg0) {
        field4334++;
        if (arg0 != -3498) {
            this.field4331 = 34;
        }
        return this.field4349;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IILuk;)V", line = 147)
    public final void method1874(int arg0, int arg1, class176 arg2) {
        field4335++;
        this.method1875(arg2, arg0, 0, -82);
        if (arg1 != 1) {
            this.method1866(-66);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Luk;III)V", line = 158)
    private final void method1875(class176 arg0, int arg1, int arg2, int arg3) {
        field4351++;
        if (this.field4340 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg1;
        if ((this.field4342 & ~var5) == 0) {
            this.field4341 = arg0.field2626;
            this.field4349 = arg0.field2628;
        } else if (this.field4341 != arg0.field2626 || this.field4349 != arg0.field2628) {
            throw new RuntimeException();
        }
        arg0.method1234(arg2, class430.field6185[arg1], this.field4340, (byte) 105);
        if (arg3 <= -58) {
            this.field4333[arg1] = arg0;
            this.field4342 |= var5;
        }
    }

    @OriginalMember(owner = "client!nn", name = "finalize", descriptor = "()V", line = 191)
    protected final void finalize() throws Throwable {
        this.field4332.method208(false, this.field4327);
        field4343++;
        super.finalize();
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V", line = 203)
    public final void method1876(int arg0) {
        field4352++;
        OpenGL.glBindFramebufferEXT(36008, this.field4327);
        this.field4331 |= 0x1;
        this.field4340 = this.method1867(36009);
        if (arg0 != -1868) {
            method1871((byte) -85);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V", line = 222)
    public final void method1877(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field4328++;
        this.field4331 &= 0xFFFFFFFD;
        if (arg0 <= -92) {
            this.field4340 = this.method1867(36009);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BI)V", line = 237)
    public final void method1878(byte arg0, int arg1) {
        int var3 = 78 / ((-arg0 - 30) / 62);
        if (this.field4333[arg1] != null) {
            this.field4333[arg1].method889(true);
        }
        field4329++;
        this.field4342 &= ~(0x1 << arg1);
        this.field4333[arg1] = null;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V", line = 255)
    public final void method1879(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field4336++;
        this.field4331 &= 0xFFFFFFFE;
        this.field4340 = this.method1867(36009);
        int var2 = 89 % ((33 - arg0) / 32);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILjava/lang/String;)I", line = 267)
    public static final int method1880(int arg0, String arg1) {
        if (arg0 <= 59) {
            method1880(112, null);
        }
        field4347++;
        return class434.method2568(true, 10, (byte) 106, arg1);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIILhp;I)V", line = 278)
    private final void method1881(int arg0, int arg1, int arg2, class221 arg3, int arg4) {
        field4350++;
        if (this.field4340 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg1;
        if ((this.field4342 & ~var6) == 0) {
            this.field4341 = arg3.field3383;
            this.field4349 = arg3.field3383;
        } else if (this.field4341 != arg3.field3383 || this.field4349 != arg3.field3383) {
            throw new RuntimeException();
        }
        arg3.method1502(arg2, -96, this.field4340, arg4, class430.field6185[arg1]);
        if (arg0 > 101) {
            this.field4333[arg1] = arg3;
            this.field4342 |= var6;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)V", line = 313)
    public final void method1882(int arg0, int arg1) {
        field4346++;
        if (this.field4340 == arg0) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class430.field6185[arg1]);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BILat;)V", line = 329)
    public final void method1883(byte arg0, int arg1, class262 arg2) {
        field4326++;
        if (this.field4340 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg1;
        if ((~var4 & this.field4342) == 0) {
            this.field4341 = arg2.field3947;
            this.field4349 = arg2.field3953;
        } else if (this.field4341 != arg2.field3947 || this.field4349 != arg2.field3953) {
            throw new RuntimeException();
        }
        arg2.method1693(this.field4340, (byte) 89, class430.field6185[arg1]);
        int var5 = 94 % ((arg0 + 15) / 41);
        this.field4333[arg1] = arg2;
        this.field4342 |= var4;
    }
}
