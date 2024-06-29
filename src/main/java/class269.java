import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class269 implements class324 {

    @OriginalMember(owner = "client!gia", name = "f", descriptor = "I")
    private int field3837 = 0;

    @OriginalMember(owner = "client!gia", name = "o", descriptor = "I")
    private int field3846 = -1;

    @OriginalMember(owner = "client!gia", name = "p", descriptor = "[Lrh;")
    private class264[] field3847 = new class264[9];

    @OriginalMember(owner = "client!gia", name = "j", descriptor = "Leea;")
    private class131 field3841;

    @OriginalMember(owner = "client!gia", name = "B", descriptor = "I")
    private int field3859;

    @OriginalMember(owner = "client!gia", name = "c", descriptor = "Lqfa;")
    public static class98 field3834 = new class98(43, 4);

    @OriginalMember(owner = "client!gia", name = "q", descriptor = "I")
    public static int field3848 = 0;

    @OriginalMember(owner = "client!gia", name = "w", descriptor = "[I")
    public static int[] field3854 = new int[128];

    @OriginalMember(owner = "client!gia", name = "C", descriptor = "Lgda;")
    public static class53 field3860;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!gia", name = "d", descriptor = "I")
    private int field3835;

    @OriginalMember(owner = "client!gia", name = "e", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!gia", name = "g", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!gia", name = "h", descriptor = "I")
    private int field3839;

    @OriginalMember(owner = "client!gia", name = "i", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!gia", name = "k", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!gia", name = "l", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!gia", name = "m", descriptor = "I")
    private int field3844;

    @OriginalMember(owner = "client!gia", name = "n", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!gia", name = "r", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!gia", name = "s", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!gia", name = "t", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!gia", name = "u", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!gia", name = "v", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!gia", name = "x", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!gia", name = "y", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!gia", name = "z", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!gia", name = "A", descriptor = "I")
    public static int field3858;

    static {
        for (int var0 = 0; var0 < field3854.length; var0++) {
            field3854[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field3854[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field3854[var2] = var2 - 71;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field3854[var3] = var3 + 52 - 48;
        }
        field3854[42] = field3854[43] = 62;
        field3854[45] = field3854[47] = 63;
        field3860 = new class53(65, -1);
    }

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "(B)Z", line = 5)
    public final boolean method1749(byte arg0) {
        field3840++;
        if (arg0 != -116) {
            this.field3837 = 115;
        }
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field3846);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!gia", name = "d", descriptor = "(I)I", line = 31)
    private final int method1750(int arg0) {
        field3845++;
        if ((this.field3837 & 0x4) != 0) {
            return 36160;
        } else if (arg0 != 36160) {
            return -78;
        } else if ((this.field3837 & 0x2) == 0) {
            return (this.field3837 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)V", line = 52)
    public final void method1751(int arg0) {
        field3833++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        if (arg0 == 30226) {
            this.field3837 &= 0xFFFFFFFE;
            this.field3846 = this.method1750(36160);
        }
    }

    @OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(Leea;)V", line = 314)
    public class269(class131 arg0) {
        if (!arg0.field1858) {
            throw new IllegalStateException("");
        }
        this.field3841 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class457.field6440, 0);
        this.field3859 = class457.field6440[0];
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(Z)V", line = 68)
    public final void method1752(boolean arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field3859);
        field3851++;
        this.field3837 |= 0x1;
        this.field3846 = this.method1750(36160);
        if (!arg0) {
            this.method1752(true);
        }
    }

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "(I)V", line = 82)
    public final void method1753(int arg0) {
        field3857++;
        OpenGL.glBindFramebufferEXT(36160, this.field3859);
        this.field3837 |= 0x4;
        if (arg0 != -23783) {
            this.method1760(101, 37, 47, null);
        }
        this.field3846 = this.method1750(arg0 ^ 0xFFFF2E59);
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(B)V", line = 102)
    public final void method1754(byte arg0) {
        field3838++;
        if (arg0 == 30) {
            OpenGL.glBindFramebufferEXT(36009, 0);
            this.field3837 &= 0xFFFFFFFD;
            this.field3846 = this.method1750(arg0 ^ 0x8D5E);
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(II)V", line = 115)
    public final void method1755(int arg0, int arg1) {
        field3855++;
        if (this.field3846 == arg1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class310.field4313[arg0]);
    }

    @OriginalMember(owner = "client!gia", name = "c", descriptor = "(I)V", line = 135)
    public final void method1756(int arg0) {
        field3843++;
        OpenGL.glBindFramebufferEXT(36009, this.field3859);
        this.field3837 |= 0x2;
        this.field3846 = this.method1750(36160);
        if (arg0 != -6521) {
            this.method1750(-87);
        }
    }

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "(Z)V", line = 148)
    public final void method1757(boolean arg0) {
        field3850++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        if (!arg0) {
            field3854 = null;
        }
        this.field3837 &= 0xFFFFFFFB;
        this.field3846 = this.method1750(36160);
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIILku;)V", line = 161)
    private final void method1758(int arg0, int arg1, int arg2, int arg3, class375 arg4) {
        field3832++;
        if (this.field3846 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg1;
        if ((~var6 & this.field3844) == 0) {
            this.field3835 = arg4.field5254;
            this.field3839 = arg4.field5254;
        } else if (this.field3839 != arg4.field5254 || this.field3835 != arg4.field5254) {
            throw new RuntimeException();
        }
        arg4.method2358(class310.field4313[arg1], arg0, false, arg3, this.field3846);
        this.field3847[arg1] = arg4;
        this.field3844 |= var6;
        int var7 = -50 / ((arg2 + 39) / 34);
    }

    @OriginalMember(owner = "client!gia", name = "finalize", descriptor = "()V", line = 191)
    protected final void finalize() throws Throwable {
        field3842++;
        this.field3841.method944(0, this.field3859);
        super.finalize();
    }

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "(II)V", line = 214)
    public final void method1759(int arg0, int arg1) {
        int var3 = -97 % ((arg1 + 17) / 42);
        field3858++;
        if (this.field3846 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class310.field4313[arg0]);
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIILku;)V", line = 227)
    public final void method1760(int arg0, int arg1, int arg2, class375 arg3) {
        if (arg0 == 19658) {
            this.method1758(arg2, arg1, arg0 - 19739, 0, arg3);
            field3852++;
        }
    }

    @OriginalMember(owner = "client!gia", name = "c", descriptor = "(II)V", line = 240)
    public final void method1761(int arg0, int arg1) {
        field3856++;
        if (this.field3847[arg1] != null) {
            this.field3847[arg1].method1299(arg0 ^ 0xFFFFFFA4);
        }
        this.field3844 &= ~(arg0 << arg1);
        this.field3847[arg1] = null;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(IILnha;)V", line = 252)
    public final void method1762(int arg0, int arg1, class321 arg2) {
        field3853++;
        if (this.field3846 == -1) {
            throw new RuntimeException();
        }
        int var4 = arg1 << arg0;
        if ((this.field3844 & ~var4) == 0) {
            this.field3835 = arg2.field4442;
            this.field3839 = arg2.field4435;
        } else if (this.field3839 != arg2.field4435 || this.field3835 != arg2.field4442) {
            throw new RuntimeException();
        }
        arg2.method2068(this.field3846, (byte) 125, class310.field4313[arg0]);
        this.field3847[arg0] = arg2;
        this.field3844 |= var4;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(ILmfa;II)V", line = 286)
    private final void method1763(int arg0, class615 arg1, int arg2, int arg3) {
        field3849++;
        if (this.field3846 == -1) {
            throw new RuntimeException();
        }
        int var5 = arg3 << arg0;
        if ((this.field3844 & ~var5) == 0) {
            this.field3835 = arg1.field8610;
            this.field3839 = arg1.field8604;
        } else if (this.field3839 != arg1.field8604 || this.field3835 != arg1.field8610) {
            throw new RuntimeException();
        }
        arg1.method3439(class310.field4313[arg0], this.field3846, -1, arg2);
        this.field3847[arg0] = arg1;
        this.field3844 |= var5;
    }

    @OriginalMember(owner = "client!gia", name = "e", descriptor = "(I)V", line = 328)
    public static void method1764(int arg0) {
        field3834 = null;
        if (arg0 > 100) {
            field3860 = null;
            field3854 = null;
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(IILmfa;)V", line = 376)
    public final void method1765(int arg0, int arg1, class615 arg2) {
        field3836++;
        this.method1763(arg0, arg2, arg1, 1);
    }
}
