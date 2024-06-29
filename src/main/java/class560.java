import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class560 implements class345 {

    @OriginalMember(owner = "client!iu", name = "t", descriptor = "[Lgo;")
    private class412[] field7656 = new class412[9];

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    private int field7641 = -1;

    @OriginalMember(owner = "client!iu", name = "y", descriptor = "I")
    private int field7661 = 0;

    @OriginalMember(owner = "client!iu", name = "o", descriptor = "Lag;")
    private class469 field7651;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
    private int field7643;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "Leba;")
    public static class550 field7648 = new class550(10, -1);

    @OriginalMember(owner = "client!iu", name = "s", descriptor = "Ltt;")
    public static class338 field7655 = new class338(67, 8);

    @OriginalMember(owner = "client!iu", name = "A", descriptor = "[I")
    public static int[] field7663 = new int[4];

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    private int field7637;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    private int field7644;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    public static int field7645;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!iu", name = "n", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!iu", name = "p", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!iu", name = "q", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!iu", name = "r", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!iu", name = "u", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!iu", name = "v", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!iu", name = "w", descriptor = "I")
    private int field7659;

    @OriginalMember(owner = "client!iu", name = "x", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!iu", name = "B", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)V", line = 4)
    public static void method3104(int arg0) {
        field7663 = null;
        field7655 = null;
        if (arg0 <= 1) {
            field7655 = null;
        }
        field7648 = null;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BI)V", line = 16)
    public final void method3105(byte arg0, int arg1) {
        if (this.field7656[arg1] != null) {
            this.field7656[arg1].method395(33071);
        }
        field7649++;
        this.field7637 &= ~(0x1 << arg1);
        if (arg0 == 107) {
            this.field7656[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIILd;)V", line = 33)
    public final void method3106(int arg0, int arg1, int arg2, class327 arg3) {
        if (arg2 != -20138) {
            this.field7644 = 44;
        }
        field7658++;
        this.method3114(arg0, arg1, 0, arg3, arg2 ^ 0xFFFFB157);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)V", line = 45)
    public final void method3107(int arg0, int arg1) {
        if (arg0 != 18457) {
            return;
        }
        field7654++;
        if (this.field7641 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class587.field8107[arg1]);
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)V", line = 61)
    public final void method2058(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field7638++;
        this.field7661 &= 0xFFFFFFFD;
        this.field7641 = this.method3108(-90);
        if (arg0 != 1325) {
            this.method3111((byte) 73, null, -47);
        }
    }

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "(I)I", line = 74)
    private final int method3108(int arg0) {
        field7650++;
        if ((this.field7661 & 0x4) != 0) {
            return 36160;
        } else if ((this.field7661 & 0x2) != 0) {
            return 36009;
        } else if ((this.field7661 & 0x1) == 0) {
            return arg0 >= -60 ? 53 : -1;
        } else {
            return 36008;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V", line = 96)
    public final void method2056(byte arg0) {
        int var2 = 37 % ((15 - arg0) / 62);
        field7647++;
        OpenGL.glBindFramebufferEXT(36160, this.field7643);
        this.field7661 |= 0x4;
        this.field7641 = this.method3108(-102);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIILdga;)V", line = 108)
    private final void method3109(int arg0, int arg1, int arg2, class441 arg3) {
        field7653++;
        if (this.field7641 == -1) {
            throw new RuntimeException();
        }
        if (arg2 <= 97) {
            this.method2058(-34);
        }
        int var5 = 0x1 << arg0;
        if ((~var5 & this.field7637) == 0) {
            this.field7644 = arg3.field5862;
            this.field7659 = arg3.field5857;
        } else if (this.field7644 != arg3.field5862 || this.field7659 != arg3.field5857) {
            throw new RuntimeException();
        }
        arg3.method2496(arg1, 0, this.field7641, class587.field8107[arg0]);
        this.field7656[arg0] = arg3;
        this.field7637 |= var5;
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(II)V", line = 142)
    public final void method3110(int arg0, int arg1) {
        field7646++;
        if (this.field7641 == arg0) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class587.field8107[arg1]);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V", line = 154)
    public final void method2057(int arg0) {
        field7639++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field7661 &= 0xFFFFFFFB;
        this.field7641 = this.method3108(-65);
        if (arg0 > -120) {
            this.method3107(113, -2);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)V", line = 168)
    public final void method2055(boolean arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field7640++;
        if (!arg0) {
            this.field7661 &= 0xFFFFFFFE;
            this.field7641 = this.method3108(-103);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BLdga;I)V", line = 184)
    public final void method3111(byte arg0, class441 arg1, int arg2) {
        field7645++;
        if (arg0 >= -83) {
            this.method3105((byte) 99, -121);
        }
        this.method3109(arg2, 0, 122, arg1);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILmea;I)V", line = 197)
    public final void method3112(int arg0, class72 arg1, int arg2) {
        field7642++;
        if (this.field7641 == -1) {
            throw new RuntimeException();
        }
        int var4 = arg0 << arg2;
        if ((this.field7637 & ~var4) == 0) {
            this.field7659 = arg1.field857;
            this.field7644 = arg1.field844;
        } else if (this.field7644 != arg1.field844 || this.field7659 != arg1.field857) {
            throw new RuntimeException();
        }
        arg1.method396(this.field7641, 23295, class587.field8107[arg2]);
        this.field7656[arg2] = arg1;
        this.field7637 |= var4;
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(B)Z", line = 225)
    public final boolean method3113(byte arg0) {
        field7660++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field7641);
        if (var2 == 36053) {
            return arg0 > 116;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "(I)V", line = 246)
    public final void method2060(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field7643);
        field7652++;
        this.field7661 |= 0x2;
        if (arg0 == 12185) {
            this.field7641 = this.method3108(arg0 - 12263);
        }
    }

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V", line = 259)
    public final void method2059(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field7643);
        if (arg0 >= 113) {
            field7662++;
            this.field7661 |= 0x1;
            this.field7641 = this.method3108(-119);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIILd;I)V", line = 283)
    private final void method3114(int arg0, int arg1, int arg2, class327 arg3, int arg4) {
        field7657++;
        if (this.field7641 == -1) {
            throw new RuntimeException();
        }
        int var6 = arg4 << arg0;
        if ((this.field7637 & ~var6) == 0) {
            this.field7644 = arg3.field4395;
            this.field7659 = arg3.field4395;
        } else if (this.field7644 != arg3.field4395 || this.field7659 != arg3.field4395) {
            throw new RuntimeException();
        }
        arg3.method1905(this.field7641, (byte) -98, arg1, class587.field8107[arg0], arg2);
        this.field7656[arg0] = arg3;
        this.field7637 |= var6;
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lag;)V", line = 340)
    public class560(class469 arg0) {
        if (!arg0.field6507) {
            throw new IllegalStateException("");
        }
        this.field7651 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class332.field4451, 0);
        this.field7643 = class332.field4451[0];
    }

    @OriginalMember(owner = "client!iu", name = "finalize", descriptor = "()V", line = 329)
    protected final void finalize() throws Throwable {
        field7664++;
        this.field7651.method2656(-4891, this.field7643);
        super.finalize();
    }
}
