import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class106 implements class473 {

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    private int field1102 = -1;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "[Lmba;")
    private class419[] field1111 = new class419[9];

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    private int field1107 = 0;

    @OriginalMember(owner = "client!er", name = "z", descriptor = "Lnv;")
    private class417 field1119;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    private int field1095;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    private int field1096;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    private int field1100;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!er", name = "p", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!er", name = "s", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!er", name = "t", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!er", name = "u", descriptor = "I")
    private int field1114;

    @OriginalMember(owner = "client!er", name = "v", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!er", name = "w", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!er", name = "x", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!er", name = "y", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!er", name = "A", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V", line = 5)
    public final void method723(int arg0) {
        field1104++;
        OpenGL.glBindFramebufferEXT(36160, this.field1095);
        if (arg0 != 25631) {
            field1115 = -17;
        }
        this.field1107 |= 0x4;
        this.field1102 = this.method733((byte) -68);
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V", line = 18)
    public final void method724(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field1095);
        if (arg0 != -3090) {
            this.method730(105, 22, -4, null);
        }
        field1105++;
        this.field1107 |= 0x2;
        this.field1102 = this.method733((byte) 96);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lds;II)V", line = 33)
    public final void method725(class14 arg0, int arg1, int arg2) {
        field1112++;
        if (this.field1102 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg2;
        if ((this.field1096 & ~var4) == 0) {
            this.field1114 = arg0.field116;
            this.field1100 = arg0.field121;
        } else if (this.field1100 != arg0.field121 || this.field1114 != arg0.field116) {
            throw new RuntimeException();
        }
        if (arg1 != 26867) {
            this.method731(91);
        }
        arg0.method69(class439.field6377[arg2], 36161, this.field1102);
        this.field1111[arg2] = arg0;
        this.field1096 |= var4;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V", line = 64)
    public final void method726(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        field1106++;
        if (arg0 < -46) {
            this.field1107 &= 0xFFFFFFFB;
            this.field1102 = this.method733((byte) 94);
        }
    }

    @OriginalMember(owner = "client!er", name = "f", descriptor = "(I)Z", line = 78)
    public final boolean method727(int arg0) {
        field1109++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field1102);
        return arg0 == var2;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)V", line = 97)
    public final void method728(byte arg0, int arg1) {
        if (arg0 != 7) {
            this.field1111 = null;
        }
        field1113++;
        if (this.field1102 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class439.field6377[arg1]);
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V", line = 112)
    public final void method729(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field1095);
        field1094++;
        if (arg0 <= 76) {
            this.field1114 = 6;
        }
        this.field1107 |= 0x1;
        this.field1102 = this.method733((byte) -97);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIILwn;)V", line = 128)
    private final void method730(int arg0, int arg1, int arg2, class720 arg3) {
        field1098++;
        int var5 = 14 % ((arg0 + 49) / 52);
        if (this.field1102 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg2;
        if ((~var6 & this.field1096) == 0) {
            this.field1100 = arg3.field10099;
            this.field1114 = arg3.field10100;
        } else if (this.field1100 != arg3.field10099 || this.field1114 != arg3.field10100) {
            throw new RuntimeException();
        }
        arg3.method4019((byte) -119, arg1, this.field1102, class439.field6377[arg2]);
        this.field1111[arg2] = arg3;
        this.field1096 |= var6;
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(I)V", line = 160)
    public final void method731(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        int var2 = -38 / ((-arg0 - 8) / 56);
        field1116++;
        this.field1107 &= 0xFFFFFFFE;
        this.field1102 = this.method733((byte) -69);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ltc;III)V", line = 172)
    public final void method732(class351 arg0, int arg1, int arg2, int arg3) {
        this.method735(36160, arg3, arg2, arg0, 0);
        field1117++;
        if (arg1 >= -44) {
            this.method732(null, 55, 118, -97);
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(B)I", line = 186)
    private final int method733(byte arg0) {
        field1120++;
        int var2 = 124 % ((30 - arg0) / 57);
        if ((this.field1107 & 0x4) != 0) {
            return 36160;
        } else if ((this.field1107 & 0x2) == 0) {
            return (this.field1107 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IZLwn;)V", line = 207)
    public final void method734(int arg0, boolean arg1, class720 arg2) {
        if (arg1) {
            this.method736((byte) -22);
        }
        field1103++;
        this.method730(-106, 0, arg0, arg2);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIILtc;I)V", line = 219)
    private final void method735(int arg0, int arg1, int arg2, class351 arg3, int arg4) {
        field1118++;
        if (this.field1102 == -1) {
            throw new RuntimeException();
        } else if (arg0 == 36160) {
            int var6 = 0x1 << arg2;
            if ((this.field1096 & ~var6) == 0) {
                this.field1114 = arg3.field4518;
                this.field1100 = arg3.field4518;
            } else if (this.field1100 != arg3.field4518 || this.field1114 != arg3.field4518) {
                throw new RuntimeException();
            }
            arg3.method2080(arg4, 26697, this.field1102, class439.field6377[arg2], arg1);
            this.field1111[arg2] = arg3;
            this.field1096 |= var6;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V", line = 250)
    public final void method736(byte arg0) {
        field1108++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        if (arg0 == 70) {
            this.field1107 &= 0xFFFFFFFD;
            this.field1102 = this.method733((byte) 89);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)V", line = 273)
    public final void method737(int arg0, byte arg1) {
        if (arg1 != -118) {
            this.method731(-27);
        }
        if (this.field1111[arg0] != null) {
            this.field1111[arg0].method66(arg1 + 51);
        }
        field1110++;
        this.field1096 &= ~(0x1 << arg0);
        this.field1111[arg0] = null;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lnv;)V", line = 324)
    public class106(class417 arg0) {
        if (!arg0.field6033) {
            throw new IllegalStateException("");
        }
        this.field1119 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class704.field9913, 0);
        this.field1095 = class704.field9913[0];
    }

    @OriginalMember(owner = "client!er", name = "finalize", descriptor = "()V", line = 296)
    protected final void finalize() throws Throwable {
        this.field1119.method2569(this.field1095, (byte) -103);
        field1101++;
        super.finalize();
    }

    @OriginalMember(owner = "client!er", name = "g", descriptor = "(I)V", line = 305)
    public static final void method738(int arg0) {
        field1099++;
        int var1 = 116 % ((9 - arg0) / 61);
        class471.field6718 = -1;
        class75.field796 = -1;
        class125.field1308 = 0;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)V", line = 339)
    public final void method739(int arg0, int arg1) {
        field1097++;
        if (this.field1102 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class439.field6377[arg0]);
        if (arg1 != 1) {
            this.method732(null, 82, 32, -83);
        }
    }
}
