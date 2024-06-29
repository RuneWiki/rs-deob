import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class60 implements class386 {

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "[Lam;")
    private class536[] field860 = new class536[9];

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    private int field871 = -1;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    private int field874 = 0;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "Lpg;")
    private class333 field873;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    private int field876;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "[I")
    public static int[] field870 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    private int field857;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    private int field864;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    private int field878;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V", line = 3)
    public final void method386(int arg0, int arg1) {
        if (arg1 != -29199) {
            return;
        }
        field875++;
        if (this.field871 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class278.field3784[arg0]);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lrc;BI)V", line = 18)
    public final void method387(class22 arg0, byte arg1, int arg2) {
        field877++;
        if (this.field871 == -1) {
            throw new RuntimeException();
        }
        if (arg1 <= 107) {
            this.field857 = 35;
        }
        int var4 = 0x1 << arg2;
        if ((~var4 & this.field857) == 0) {
            this.field864 = arg0.field308;
            this.field878 = arg0.field301;
        } else if (this.field878 != arg0.field301 || this.field864 != arg0.field308) {
            throw new RuntimeException();
        }
        arg0.method136(this.field871, (byte) -12, class278.field3784[arg2]);
        this.field860[arg2] = arg0;
        this.field857 |= var4;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)V", line = 50)
    public final void method388(int arg0, int arg1) {
        if (arg0 > -112) {
            this.method391(79);
        }
        field861++;
        if (this.field871 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class278.field3784[arg1]);
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V", line = 66)
    public static void method389(boolean arg0) {
        if (arg0) {
            method389(true);
        }
        field870 = null;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V", line = 76)
    public final void method390(byte arg0) {
        field880++;
        if (arg0 != -127) {
            this.method401(52);
        }
        OpenGL.glBindFramebufferEXT(36160, this.field876);
        this.field874 |= 0x4;
        this.field871 = this.method391(-1);
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)I", line = 90)
    private final int method391(int arg0) {
        field863++;
        if (~(this.field874 & 0x4) != arg0) {
            return 36160;
        } else if ((this.field874 & 0x2) == 0) {
            return (this.field874 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)I", line = 113)
    public final int method392(int arg0) {
        int var2 = 38 / ((-arg0 - 61) / 54);
        field854++;
        return this.field864;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V", line = 123)
    public final void method393(byte arg0) {
        if (arg0 == -97) {
            field869++;
            OpenGL.glBindFramebufferEXT(36160, 0);
            this.field874 &= 0xFFFFFFFB;
            this.field871 = this.method391(-1);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILgi;II)V", line = 137)
    private final void method394(int arg0, int arg1, class490 arg2, int arg3, int arg4) {
        field865++;
        if (this.field871 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg1;
        if (~(this.field857 & ~var6) == arg0) {
            this.field864 = arg2.field7082;
            this.field878 = arg2.field7082;
        } else if (this.field878 != arg2.field7082 || this.field864 != arg2.field7082) {
            throw new RuntimeException();
        }
        arg2.method2906(arg4, arg3, this.field871, class278.field3784[arg1], (byte) 66);
        this.field860[arg1] = arg2;
        this.field857 |= var6;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 164)
    public final void method395(int arg0) {
        if (arg0 <= 2) {
            this.method391(-8);
        }
        OpenGL.glBindFramebufferEXT(36008, this.field876);
        field858++;
        this.field874 |= 0x1;
        this.field871 = this.method391(-1);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lpg;)V", line = 371)
    public class60(class333 arg0) {
        if (!arg0.field4773) {
            throw new IllegalStateException("");
        }
        this.field873 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class221.field3127, 0);
        this.field876 = class221.field3127[0];
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V", line = 188)
    public final void method396(boolean arg0) {
        field859++;
        if (!arg0) {
            this.field878 = -127;
        }
        OpenGL.glBindFramebufferEXT(36009, this.field876);
        this.field874 |= 0x2;
        this.field871 = this.method391(-1);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V", line = 203)
    public final void method397(int arg0, byte arg1) {
        field868++;
        if (this.field860[arg0] != null) {
            this.field860[arg0].method137(false);
        }
        this.field857 &= ~(0x1 << arg0);
        if (arg1 != -81) {
            this.method388(-39, 27);
        }
        this.field860[arg0] = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BIILgi;)V", line = 223)
    public final void method398(byte arg0, int arg1, int arg2, class490 arg3) {
        if (arg0 < -31) {
            this.method394(-1, arg2, arg3, 0, arg1);
            field879++;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Lbp;", line = 235)
    public static final class63 method399(int arg0, int arg1, int arg2) {
        class532 var3 = class103.field1632[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7835;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V", line = 245)
    public final void method400(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field867++;
        if (arg0 == 13646) {
            this.field874 &= 0xFFFFFFFD;
            this.field871 = this.method391(arg0 - 13647);
        }
    }

    @OriginalMember(owner = "client!eb", name = "finalize", descriptor = "()V", line = 261)
    protected final void finalize() throws Throwable {
        this.field873.method1979(-34847, this.field876);
        field872++;
        super.finalize();
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)Z", line = 270)
    public final boolean method401(int arg0) {
        field855++;
        if (arg0 == -1) {
            int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field871);
            return var2 == 36053;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V", line = 294)
    public final void method402(byte arg0) {
        field862++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field874 &= 0xFFFFFFFE;
        if (arg0 > -30) {
            this.field878 = 60;
        }
        this.field871 = this.method391(-1);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)V", line = 312)
    public static final void method403(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            field870 = null;
        }
        int var4 = class76.field1075.field3685 * arg1 >> 8;
        field881++;
        if (arg3 == -1 && !class363.field5221) {
            class50.method336(-20439);
        } else if (arg3 != -1 && (class72.field1027 != arg3 || !class40.method281((byte) -125)) && var4 != 0 && !class363.field5221) {
            class118.method870(-10960, arg0, class437.field6309, false, var4, arg3, 0);
        }
        class72.field1027 = arg3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLbd;II)V", line = 338)
    private final void method404(boolean arg0, class142 arg1, int arg2, int arg3) {
        field856++;
        if (this.field871 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg2;
        if (!arg0) {
            return;
        }
        if ((~var5 & this.field857) == 0) {
            this.field878 = arg1.field2110;
            this.field864 = arg1.field2108;
        } else if (this.field878 != arg1.field2110 || this.field864 != arg1.field2108) {
            throw new RuntimeException();
        }
        arg1.method995(arg3, class278.field3784[arg2], this.field871, -15651);
        this.field860[arg2] = arg1;
        this.field857 |= var5;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILbd;)V", line = 385)
    public final void method405(int arg0, int arg1, class142 arg2) {
        if (arg0 < -54) {
            this.method404(true, arg2, arg1, 0);
            field866++;
        }
    }
}
