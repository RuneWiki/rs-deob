import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class39 implements class95 {

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    private int field447 = 0;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "[Luj;")
    private class457[] field457 = new class457[9];

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    private int field456 = -1;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Lck;")
    private class733 field440;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client!vd", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() throws Throwable {
        field446++;
        this.field440.method3949(this.field455, 3553);
        super.finalize();
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)Z", line = 21)
    public final boolean method234(int arg0) {
        field451++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field456);
        if (var2 == 36053) {
            if (arg0 > -50) {
                this.method238(73, 6, true, null, -37);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V", line = 42)
    public final void method235(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field438++;
        this.field447 &= 0xFFFFFFFE;
        this.field456 = this.method245((byte) -78);
        if (arg0 != 9412) {
            this.method250((byte) 16);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 56)
    public final void method236(int arg0, int arg1) {
        if (this.field457[arg0] != null) {
            this.field457[arg0].method760((byte) -59);
        }
        field453++;
        this.field443 &= ~(0x1 << arg0);
        this.field457[arg0] = null;
        if (arg1 != -3) {
            this.field457 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)V", line = 74)
    public final void method237(byte arg0, int arg1) {
        field444++;
        if (this.field456 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class349.field4272[arg1]);
        int var3 = -30 % ((-arg0 - 81) / 41);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIZLmaa;I)V", line = 87)
    private final void method238(int arg0, int arg1, boolean arg2, class528 arg3, int arg4) {
        field442++;
        if (this.field456 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg1;
        if ((this.field443 & ~var6) == 0) {
            this.field445 = arg3.field6706;
            this.field459 = arg3.field6706;
        } else if (this.field445 != arg3.field6706 || this.field459 != arg3.field6706) {
            throw new RuntimeException();
        }
        arg3.method2900(arg4, (byte) 123, arg0, this.field456, class349.field4272[arg1]);
        this.field457[arg1] = arg3;
        this.field443 |= var6;
        if (arg2) {
            this.method235(-62);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lgha;II)V", line = 121)
    public final void method239(class520 arg0, int arg1, int arg2) {
        this.method240(0, arg0, 120, arg2);
        if (arg1 > 50) {
            field454++;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILgha;II)V", line = 134)
    private final void method240(int arg0, class520 arg1, int arg2, int arg3) {
        field439++;
        if (arg2 < 60) {
            return;
        }
        if (this.field456 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg3;
        if ((~var5 & this.field443) == 0) {
            this.field445 = arg1.field6614;
            this.field459 = arg1.field6617;
        } else if (this.field445 != arg1.field6614 || this.field459 != arg1.field6617) {
            throw new RuntimeException();
        }
        arg1.method2870(class349.field4272[arg3], this.field456, 3314, arg0);
        this.field457[arg3] = arg1;
        this.field443 |= var5;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 167)
    public final void method241(int arg0) {
        field449++;
        OpenGL.glBindFramebufferEXT(36160, this.field455);
        this.field447 |= 0x4;
        this.field456 = this.method245((byte) -78);
        if (arg0 != -4114) {
            this.method238(-96, -114, false, null, 86);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 182)
    public final void method242(int arg0) {
        if (arg0 != 13352) {
            this.method250((byte) 38);
        }
        OpenGL.glBindFramebufferEXT(36160, 0);
        field450++;
        this.field447 &= 0xFFFFFFFB;
        this.field456 = this.method245((byte) -78);
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lck;)V", line = 356)
    public class39(class733 arg0) {
        if (!arg0.field9880) {
            throw new IllegalStateException("");
        }
        this.field440 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class520.field6622, 0);
        this.field455 = class520.field6622[0];
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILru;Z)V", line = 199)
    public final void method243(int arg0, class709 arg1, boolean arg2) {
        field448++;
        if (this.field456 == -1) {
            throw new RuntimeException();
        } else if (!arg2) {
            int var4 = 0x1 << arg0;
            if ((~var4 & this.field443) == 0) {
                this.field445 = arg1.field9374;
                this.field459 = arg1.field9368;
            } else if (this.field445 != arg1.field9374 || this.field459 != arg1.field9368) {
                throw new RuntimeException();
            }
            arg1.method3830(!arg2, this.field456, class349.field4272[arg0]);
            this.field457[arg0] = arg1;
            this.field443 |= var4;
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V", line = 233)
    public final void method244(int arg0) {
        field437++;
        if (arg0 != -8040) {
            this.field443 = 45;
        }
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field447 &= 0xFFFFFFFD;
        this.field456 = this.method245((byte) -78);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)I", line = 246)
    private final int method245(byte arg0) {
        if (arg0 != -78) {
            this.field445 = -18;
        }
        field435++;
        if ((this.field447 & 0x4) != 0) {
            return 36160;
        } else if ((this.field447 & 0x2) == 0) {
            return (this.field447 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lmaa;III)V", line = 269)
    public final void method246(class528 arg0, int arg1, int arg2, int arg3) {
        field452++;
        if (arg2 < -49) {
            this.method238(0, arg3, false, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)V", line = 283)
    public final void method247(boolean arg0, int arg1) {
        field436++;
        if (arg0) {
            this.method242(-52);
        }
        if (this.field456 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class349.field4272[arg1]);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V", line = 298)
    public final void method248(boolean arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field455);
        field458++;
        this.field447 |= 0x2;
        this.field456 = this.method245((byte) -78);
        if (!arg0) {
            this.field443 = 42;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)I", line = 312)
    public static final int method249(int arg0, int arg1, int arg2, int arg3) {
        field434++;
        int var4 = arg0 & 0x3;
        if (arg3 != -10561) {
            return 113;
        } else if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 4095 - arg2;
        } else {
            return 4095 - arg1;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 336)
    public final void method250(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field455);
        field441++;
        if (arg0 == 126) {
            this.field447 |= 0x1;
            this.field456 = this.method245((byte) -78);
        }
    }
}
