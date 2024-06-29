import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class604 implements class107 {

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "[Ltl;")
    private class754[] field8565 = new class754[9];

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    private int field8572 = 0;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    private int field8573 = -1;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "Lkw;")
    private class346 field8569;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    private int field8561;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field8555;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field8556;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    private int field8558;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    private int field8560;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field8563;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field8564;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field8566;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field8567;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field8568;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field8570;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field8571;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field8574;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field8575;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field8577;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    private int field8579;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
    public static int field8581;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static int field8582;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "[I")
    public static int[] field8580;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V", line = 7)
    public static final void method3516(int arg0) {
        field8563++;
        class646.field9295 = 0;
        class442.field6293 = 0;
        class692.field9802 = 0;
        class65.field1014 = 0;
        int var1 = 74 % ((40 - arg0) / 57);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V", line = 19)
    public final void method793(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        if (arg0 != 92) {
            this.field8573 = 123;
        }
        field8570++;
        this.field8572 &= 0xFFFFFFFD;
        this.field8573 = this.method3528(true);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILso;B)V", line = 32)
    public final void method3517(int arg0, class537 arg1, byte arg2) {
        field8559++;
        if (arg2 <= 59) {
            return;
        }
        if (this.field8573 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((~var4 & this.field8558) == 0) {
            this.field8579 = arg1.field7816;
            this.field8560 = arg1.field7815;
        } else if (this.field8579 != arg1.field7816 || this.field8560 != arg1.field7815) {
            throw new RuntimeException();
        }
        arg1.method3244(this.field8573, class691.field9798[arg0], 95);
        this.field8565[arg0] = arg1;
        this.field8558 |= var4;
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)V", line = 65)
    public final void method795(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field8561);
        field8574++;
        this.field8572 |= 0x4;
        this.field8573 = this.method3528(true);
        if (arg0 != 2234) {
            this.method794((byte) 117);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Z", line = 80)
    public static final boolean method3518(int arg0, int arg1, int arg2) {
        int var3 = -93 % ((arg0 - 35) / 33);
        field8575++;
        return (arg1 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V", line = 91)
    public final void method3519(int arg0, int arg1) {
        field8568++;
        if (this.field8565[arg0] != null) {
            this.field8565[arg0].method463((byte) -103);
        }
        this.field8558 &= ~(0x1 << arg0);
        this.field8565[arg0] = null;
        int var3 = -66 / ((-arg1 - 11) / 52);
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)V", line = 106)
    public static void method3520(int arg0) {
        field8580 = null;
        if (arg0 >= -88) {
            method3516(83);
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)V", line = 117)
    public final void method3521(int arg0, int arg1) {
        field8577++;
        if (this.field8573 == -1) {
            throw new RuntimeException();
        }
        if (arg1 != -23712) {
            this.method3526(null, 79, -16, 36, (byte) 59);
        }
        OpenGL.glDrawBuffer(class691.field9798[arg0]);
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)Z", line = 133)
    public final boolean method3522(byte arg0) {
        field8576++;
        if (arg0 >= -37) {
            return false;
        } else {
            int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field8573);
            return var2 == 36053;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ldm;III)V", line = 154)
    public final void method3523(class96 arg0, int arg1, int arg2, int arg3) {
        this.method3526(arg0, arg2, arg1, arg3, (byte) 67);
        field8557++;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)V", line = 162)
    public final void method794(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field8556++;
        this.field8572 &= 0xFFFFFFFE;
        this.field8573 = this.method3528(true);
        if (arg0 <= 122) {
            this.method3525(-85, -21, 111, null);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 176)
    public final void method790(int arg0) {
        field8562++;
        if (arg0 <= 42) {
            this.method792(44);
        }
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field8572 &= 0xFFFFFFFB;
        this.field8573 = this.method3528(true);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V", line = 190)
    public final void method3524(byte arg0, int arg1) {
        field8566++;
        if (this.field8573 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class691.field9798[arg1]);
        if (arg0 <= 109) {
            field8580 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "finalize", descriptor = "()V", line = 204)
    protected final void finalize() throws Throwable {
        this.field8569.method2174(this.field8561, -98);
        field8581++;
        super.finalize();
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIILol;)V", line = 213)
    private final void method3525(int arg0, int arg1, int arg2, class246 arg3) {
        field8564++;
        if (this.field8573 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field8558 & ~var5) == arg1) {
            this.field8579 = arg3.field3595;
            this.field8560 = arg3.field3594;
        } else if (this.field8579 != arg3.field3595 || this.field8560 != arg3.field3594) {
            throw new RuntimeException();
        }
        arg3.method1674(arg1 - 1, arg2, this.field8573, class691.field9798[arg0]);
        this.field8565[arg0] = arg3;
        this.field8558 |= var5;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ldm;IIIB)V", line = 247)
    private final void method3526(class96 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field8567++;
        if (this.field8573 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg3;
        if ((~var6 & this.field8558) == 0) {
            this.field8579 = arg0.field1391;
            this.field8560 = arg0.field1391;
        } else if (this.field8579 != arg0.field1391 || this.field8560 != arg0.field1391) {
            throw new RuntimeException();
        }
        arg0.method735(class691.field9798[arg3], arg1, arg2, (byte) -122, this.field8573);
        this.field8565[arg3] = arg0;
        if (arg4 != 67) {
            this.field8565 = null;
        }
        this.field8558 |= var6;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lkw;)V", line = 361)
    public class604(class346 arg0) {
        if (!arg0.field5006) {
            throw new IllegalStateException("");
        }
        this.field8569 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class387.field5595, 0);
        this.field8561 = class387.field5595[0];
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZLol;)V", line = 282)
    public final void method3527(int arg0, boolean arg1, class246 arg2) {
        if (!arg1) {
            this.method3525(arg0, 0, 0, arg2);
            field8578++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V", line = 293)
    public final void method792(int arg0) {
        field8555++;
        if (arg0 != -1752) {
            method3518(95, -30, -20);
        }
        OpenGL.glBindFramebufferEXT(36009, this.field8561);
        this.field8572 |= 0x2;
        this.field8573 = this.method3528(true);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V", line = 311)
    public final void method791(int arg0) {
        if (arg0 == 21631) {
            OpenGL.glBindFramebufferEXT(36008, this.field8561);
            field8582++;
            this.field8572 |= 0x1;
            this.field8573 = this.method3528(true);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)I", line = 329)
    private final int method3528(boolean arg0) {
        field8571++;
        if ((this.field8572 & 0x4) != 0) {
            return 36160;
        } else if ((this.field8572 & 0x2) == 0) {
            if (!arg0) {
                field8580 = null;
            }
            return (this.field8572 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }
}
