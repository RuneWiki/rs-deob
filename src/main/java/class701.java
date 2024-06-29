import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class701 implements class341 {

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[Lnga;")
    private class241[] field9776 = new class241[9];

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    private int field9788 = -1;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    private int field9796 = 0;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "Lji;")
    private class622 field9795;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    private int field9787;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Lra;")
    public static class361 field9781 = new class361(91, 5);

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "[I")
    public static int[] field9794 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field9772;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    private int field9773;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field9774;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field9775;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field9777;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field9778;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field9779;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field9780;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field9782;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field9783;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field9784;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field9785;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    private int field9786;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field9789;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public static int field9790;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field9791;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field9792;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field9793;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    private int field9797;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field9798;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field9799;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public static int field9800;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field9801;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 3)
    public final void method1977(byte arg0) {
        field9799++;
        OpenGL.glBindFramebufferEXT(36160, this.field9787);
        this.field9796 |= 0x4;
        if (arg0 <= -45) {
            this.field9788 = this.method3844((byte) -52);
        }
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)Z", line = 17)
    public final boolean method3833(int arg0) {
        if (arg0 != 22734) {
            this.method1978(92);
        }
        field9780++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field9788);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V", line = 38)
    public final void method1978(int arg0) {
        field9779++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field9796 &= 0xFFFFFFFD;
        this.field9788 = this.method3844((byte) -52);
        if (arg0 != 20236) {
            this.method3838(91, 13, -22, null);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)Z", line = 52)
    public static final boolean method3834(int arg0, int arg1, int arg2) {
        if (arg0 >= -88) {
            method3834(-126, -114, 11);
        }
        field9777++;
        return ((arg1 & 0x2000) != 0 | class247.method1555(arg2, arg1, (byte) 104) | class198.method1305(true, arg2, arg1)) & class447.method2541(2048, arg2, arg1);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V", line = 72)
    public final void method3835(int arg0, int arg1) {
        if (arg0 < 44) {
            return;
        }
        field9783++;
        if (this.field9788 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class630.field8789[arg1]);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIILgfa;I)V", line = 87)
    private final void method3836(int arg0, int arg1, int arg2, class660 arg3, int arg4) {
        field9793++;
        if (this.field9788 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg2;
        if ((~var6 & this.field9773) == 0) {
            this.field9786 = arg3.field9202;
            this.field9797 = arg3.field9202;
        } else if (this.field9797 != arg3.field9202 || this.field9786 != arg3.field9202) {
            throw new RuntimeException();
        }
        int var7 = -90 / ((arg4 - 68) / 44);
        arg3.method3627(this.field9788, (byte) -114, arg0, class630.field8789[arg2], arg1);
        this.field9776[arg2] = arg3;
        this.field9773 |= var6;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILgfa;IZ)V", line = 118)
    public final void method3837(int arg0, class660 arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field9798 = 47;
        }
        this.method3836(arg0, 0, arg2, arg1, 121);
        field9772++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIILvga;)V", line = 129)
    private final void method3838(int arg0, int arg1, int arg2, class239 arg3) {
        field9791++;
        if (this.field9788 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if (arg1 != -9641) {
            this.method1973(-126);
        }
        if ((this.field9773 & ~var5) == 0) {
            this.field9797 = arg3.field3212;
            this.field9786 = arg3.field3213;
        } else if (this.field9797 != arg3.field3212 || this.field9786 != arg3.field3213) {
            throw new RuntimeException();
        }
        arg3.method1505(arg1 + 39121, arg2, class630.field8789[arg0], this.field9788);
        this.field9776[arg0] = arg3;
        this.field9773 |= var5;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILwj;)V", line = 164)
    public final void method3839(int arg0, int arg1, class565 arg2) {
        field9789++;
        if (this.field9788 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg1;
        if ((~var4 & this.field9773) == 0) {
            this.field9797 = arg2.field7374;
            this.field9786 = arg2.field7380;
        } else if (this.field9797 != arg2.field7374 || this.field9786 != arg2.field7380) {
            throw new RuntimeException();
        }
        arg2.method3021(class630.field8789[arg1], 6810, this.field9788);
        this.field9776[arg1] = arg2;
        this.field9773 |= var4;
        if (arg0 != -15959) {
            this.method3833(97);
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lji;)V", line = 351)
    public class701(class622 arg0) {
        if (!arg0.field8640) {
            throw new IllegalStateException("");
        }
        this.field9795 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class11.field121, 0);
        this.field9787 = class11.field121[0];
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)V", line = 200)
    public final void method3840(byte arg0, int arg1) {
        field9792++;
        if (this.field9788 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class630.field8789[arg1]);
        if (arg0 < 14) {
            field9798 = -73;
        }
    }

    @OriginalMember(owner = "client!qf", name = "finalize", descriptor = "()V", line = 214)
    protected final void finalize() throws Throwable {
        field9785++;
        this.field9795.method3417(false, this.field9787);
        super.finalize();
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lvga;IB)V", line = 223)
    public final void method3841(class239 arg0, int arg1, byte arg2) {
        this.method3838(arg1, -9641, 0, arg0);
        int var4 = -90 / ((arg2 + 12) / 51);
        field9782++;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V", line = 235)
    public static void method3842(byte arg0) {
        if (arg0 > -108) {
            method3834(78, 17, 59);
        }
        field9794 = null;
        field9781 = null;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)V", line = 251)
    public final void method3843(int arg0, int arg1) {
        if (arg0 != -26732) {
            this.method3837(47, null, 120, false);
        }
        field9778++;
        if (this.field9776[arg1] != null) {
            this.field9776[arg1].method1502((byte) 74);
        }
        this.field9773 &= ~(0x1 << arg1);
        this.field9776[arg1] = null;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V", line = 269)
    public final void method1975(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        field9775++;
        this.field9796 &= 0xFFFFFFFB;
        if (arg0 == -17227) {
            this.field9788 = this.method3844((byte) -52);
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)I", line = 282)
    private final int method3844(byte arg0) {
        field9790++;
        if ((this.field9796 & 0x4) != 0) {
            return 36160;
        } else if ((this.field9796 & 0x2) != 0) {
            return 36009;
        } else if ((this.field9796 & 0x1) == 0) {
            if (arg0 != -52) {
                this.method3833(-120);
            }
            return -1;
        } else {
            return 36008;
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V", line = 305)
    public final void method1976(int arg0) {
        field9784++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field9796 &= 0xFFFFFFFE;
        if (arg0 != -30127) {
            this.method1977((byte) 97);
        }
        this.field9788 = this.method3844((byte) -52);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 321)
    public final void method1973(int arg0) {
        if (arg0 != 3843) {
            this.field9787 = -51;
        }
        OpenGL.glBindFramebufferEXT(36008, this.field9787);
        field9801++;
        this.field9796 |= 0x1;
        this.field9788 = this.method3844((byte) -52);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V", line = 365)
    public final void method1974(int arg0) {
        field9774++;
        OpenGL.glBindFramebufferEXT(36009, this.field9787);
        if (arg0 < 72) {
            this.method1974(-16);
        }
        this.field9796 |= 0x2;
        this.field9788 = this.method3844((byte) -52);
    }
}
