import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class621 implements class122 {

    @OriginalMember(owner = "client!et", name = "r", descriptor = "[Lcu;")
    private class233[] field8648 = new class233[9];

    @OriginalMember(owner = "client!et", name = "m", descriptor = "I")
    private int field8643 = 0;

    @OriginalMember(owner = "client!et", name = "x", descriptor = "I")
    private int field8654 = -1;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "Lhk;")
    private class111 field8638;

    @OriginalMember(owner = "client!et", name = "q", descriptor = "I")
    private int field8647;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    public static int field8631;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    private int field8633;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    public static int field8635;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "I")
    public static int field8637;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public static int field8639;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "I")
    private int field8640;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "I")
    public static int field8642;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "I")
    public static int field8645;

    @OriginalMember(owner = "client!et", name = "p", descriptor = "I")
    public static int field8646;

    @OriginalMember(owner = "client!et", name = "s", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!et", name = "t", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!et", name = "u", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!et", name = "v", descriptor = "I")
    public static int field8652;

    @OriginalMember(owner = "client!et", name = "w", descriptor = "I")
    public static int field8653;

    @OriginalMember(owner = "client!et", name = "y", descriptor = "I")
    private int field8655;

    @OriginalMember(owner = "client!et", name = "z", descriptor = "I")
    public static int field8656;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(I)V")
    public final void method1067(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field8647);
        field8632++;
        this.field8643 |= 0x4;
        this.field8654 = this.method3501(true);
        if (arg0 != 30055) {
            this.method3500((byte) -70, 122);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)V")
    public final void method3495(int arg0, int arg1) {
        field8642++;
        if (~this.field8654 == arg1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class686.field9544[arg0]);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V")
    public final void method1065(byte arg0) {
        field8639++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field8643 &= 0xFFFFFFFE;
        this.field8654 = this.method3501(true);
        if (arg0 != -98) {
            this.method3504(true, -13);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILfw;I)V")
    public final void method3496(int arg0, class63 arg1, int arg2) {
        field8652++;
        if (this.field8654 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg2;
        if ((this.field8640 & ~var4) == 0) {
            this.field8655 = arg1.field874;
            this.field8633 = arg1.field869;
        } else if (this.field8633 != arg1.field869 || this.field8655 != arg1.field874) {
            throw new RuntimeException();
        }
        if (arg0 > -104) {
            this.method3504(false, -43);
        }
        arg1.method434(this.field8654, (byte) -1, class686.field9544[arg2]);
        this.field8648[arg2] = arg1;
        this.field8640 |= var4;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)V")
    public final void method1064(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field8637++;
        this.field8643 &= 0xFFFFFFFD;
        this.field8654 = this.method3501(true);
        if (arg0 != -11251) {
            this.method3495(-108, 84);
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(B)Z")
    public final boolean method3497(byte arg0) {
        field8634++;
        if (arg0 < 22) {
            this.field8640 = 60;
        }
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field8654);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILkf;IB)V")
    private final void method3498(int arg0, class268 arg1, int arg2, byte arg3) {
        field8635++;
        if (arg3 != -75) {
            this.method3502(-91, 53, null);
        }
        if (this.field8654 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg2;
        if ((this.field8640 & ~var5) == 0) {
            this.field8655 = arg1.field3759;
            this.field8633 = arg1.field3757;
        } else if (this.field8633 != arg1.field3757 || this.field8655 != arg1.field3759) {
            throw new RuntimeException();
        }
        arg1.method1743((byte) 92, class686.field9544[arg2], this.field8654, arg0);
        this.field8648[arg2] = arg1;
        this.field8640 |= var5;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IILbja;IB)V")
    private final void method3499(int arg0, int arg1, class34 arg2, int arg3, byte arg4) {
        field8641++;
        if (this.field8654 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg1;
        if ((this.field8640 & ~var6) == 0) {
            this.field8655 = arg2.field570;
            this.field8633 = arg2.field570;
        } else if (this.field8633 != arg2.field570 || this.field8655 != arg2.field570) {
            throw new RuntimeException();
        }
        if (arg4 > -15) {
            this.method1067(29);
        }
        arg2.method202(arg3, arg0, 5, this.field8654, class686.field9544[arg1]);
        this.field8648[arg1] = arg2;
        this.field8640 |= var6;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
    public final void method1063(int arg0) {
        field8644++;
        if (arg0 != -10507) {
            this.field8638 = null;
        }
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field8643 &= 0xFFFFFFFB;
        this.field8654 = this.method3501(true);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BI)V")
    public final void method3500(byte arg0, int arg1) {
        if (this.field8648[arg1] != null) {
            this.field8648[arg1].method129(-66);
        }
        if (arg0 >= 118) {
            field8651++;
            this.field8640 &= ~(0x1 << arg1);
            this.field8648[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)I")
    private final int method3501(boolean arg0) {
        field8650++;
        if (!arg0) {
            return 26;
        } else if ((this.field8643 & 0x4) != 0) {
            return 36160;
        } else if ((this.field8643 & 0x2) == 0) {
            return (this.field8643 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V")
    public final void method1066(int arg0) {
        field8645++;
        OpenGL.glBindFramebufferEXT(36009, this.field8647);
        if (arg0 == -30731) {
            this.field8643 |= 0x2;
            this.field8654 = this.method3501(true);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IILkf;)V")
    public final void method3502(int arg0, int arg1, class268 arg2) {
        this.method3498(0, arg2, arg0, (byte) -75);
        field8631++;
        int var4 = 82 % ((-arg1 - 29) / 44);
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V")
    public final void method1068(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field8647);
        field8649++;
        if (arg0 < -65) {
            this.field8643 |= 0x1;
            this.field8654 = this.method3501(true);
        }
    }

    @OriginalMember(owner = "client!et", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field8636++;
        this.field8638.method966((byte) -103, this.field8647);
        super.finalize();
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IILbja;I)V")
    public final void method3503(int arg0, int arg1, class34 arg2, int arg3) {
        field8646++;
        this.method3499(0, arg1, arg2, arg0, (byte) -44);
        if (arg3 > -79) {
            this.field8638 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ZI)V")
    public final void method3504(boolean arg0, int arg1) {
        field8656++;
        if (this.field8654 == -1) {
            throw new RuntimeException();
        } else if (arg0) {
            OpenGL.glDrawBuffer(class686.field9544[arg1]);
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lhk;)V")
    public class621(class111 arg0) {
        if (!arg0.field2041) {
            throw new IllegalStateException("");
        }
        this.field8638 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class355.field4846, 0);
        this.field8647 = class355.field4846[0];
    }
}
