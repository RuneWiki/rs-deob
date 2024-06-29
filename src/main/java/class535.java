import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class535 implements class497 {

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "I")
    private int field7713 = 0;

    @OriginalMember(owner = "client!jaa", name = "u", descriptor = "[Lfr;")
    private class350[] field7725 = new class350[9];

    @OriginalMember(owner = "client!jaa", name = "C", descriptor = "I")
    private int field7733 = -1;

    @OriginalMember(owner = "client!jaa", name = "w", descriptor = "Lad;")
    private class362 field7727;

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
    private int field7706;

    @OriginalMember(owner = "client!jaa", name = "k", descriptor = "[[I")
    public static int[][] field7715 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!jaa", name = "v", descriptor = "[I")
    public static int[] field7726 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!jaa", name = "z", descriptor = "[C")
    private static char[] field7730 = new char[64];

    @OriginalMember(owner = "client!jaa", name = "G", descriptor = "Z")
    public static boolean field7737;

    @OriginalMember(owner = "client!jaa", name = "F", descriptor = "Lkca;")
    public static class73 field7736;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "I")
    private int field7710;

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!jaa", name = "j", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!jaa", name = "l", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!jaa", name = "m", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!jaa", name = "n", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!jaa", name = "o", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!jaa", name = "p", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!jaa", name = "q", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!jaa", name = "r", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!jaa", name = "s", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!jaa", name = "t", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!jaa", name = "x", descriptor = "I")
    public static int field7728;

    @OriginalMember(owner = "client!jaa", name = "y", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!jaa", name = "A", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!jaa", name = "B", descriptor = "I")
    private int field7732;

    @OriginalMember(owner = "client!jaa", name = "D", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!jaa", name = "E", descriptor = "I")
    private int field7735;

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(B)V")
    public static void method3118(byte arg0) {
        field7736 = null;
        field7730 = null;
        if (arg0 <= 15) {
            method3118((byte) -60);
        }
        field7726 = null;
        field7715 = null;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILvda;IIZ)V")
    private final void method3119(int arg0, class158 arg1, int arg2, int arg3, boolean arg4) {
        field7711++;
        if (this.field7733 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg2;
        if (!arg4) {
            field7715 = null;
        }
        if ((this.field7732 & ~var6) == 0) {
            this.field7710 = arg1.field1952;
            this.field7735 = arg1.field1952;
        } else if (this.field7710 != arg1.field1952 || this.field7735 != arg1.field1952) {
            throw new RuntimeException();
        }
        arg1.method912(class72.field776[arg2], 49, this.field7733, arg3, arg0);
        this.field7725[arg2] = arg1;
        this.field7732 |= var6;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILcs;II)V")
    private final void method3120(int arg0, class289 arg1, int arg2, int arg3) {
        field7709++;
        if (this.field7733 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg2;
        if ((~var5 & this.field7732) == 0) {
            this.field7710 = arg1.field3994;
            this.field7735 = arg1.field3988;
        } else if (this.field7710 != arg1.field3994 || this.field7735 != arg1.field3988) {
            throw new RuntimeException();
        }
        arg1.method1870(arg3, (byte) 83, class72.field776[arg2], this.field7733);
        this.field7725[arg2] = arg1;
        this.field7732 |= var5;
        if (arg0 != 21735) {
            this.method3124(101, (byte) 71);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II)V")
    public static final void method3121(int arg0, int arg1) {
        if (arg0 != 1) {
            method3121(72, 52);
        }
        field7720++;
        class467 var2 = class541.method3144(arg1, (byte) -97, 4);
        var2.method2852(arg0 - 1);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZLvda;II)V")
    public final void method3122(boolean arg0, class158 arg1, int arg2, int arg3) {
        this.method3119(0, arg1, arg3, arg2, arg0);
        field7721++;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
    public final void method2979(int arg0) {
        field7717++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field7713 &= 0xFFFFFFFD;
        this.field7733 = this.method3130(-1);
        if (arg0 != -10361) {
            this.method3129(13, -111);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILpg;)V")
    public final void method3123(int arg0, int arg1, class635 arg2) {
        field7728++;
        if (arg0 <= 94) {
            this.method3122(false, null, -110, -16);
        }
        if (this.field7733 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg1;
        if ((~var4 & this.field7732) == 0) {
            this.field7735 = arg2.field9119;
            this.field7710 = arg2.field9134;
        } else if (this.field7710 != arg2.field9134 || this.field7735 != arg2.field9119) {
            throw new RuntimeException();
        }
        arg2.method3623(this.field7733, (byte) 57, class72.field776[arg1]);
        this.field7725[arg1] = arg2;
        this.field7732 |= var4;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IB)V")
    public final void method3124(int arg0, byte arg1) {
        field7723++;
        if (this.field7733 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class72.field776[arg0]);
        if (arg1 != -63) {
            this.field7725 = null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)I")
    public static final int method3125(boolean arg0) {
        if (!arg0) {
            field7736 = null;
        }
        field7731++;
        return 14;
    }

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "(I)V")
    public final void method2983(int arg0) {
        field7707++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field7713 &= 0xFFFFFFFE;
        this.field7733 = this.method3130(-1);
        if (arg0 > -127) {
            this.field7732 = 22;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)V")
    public final void method2980(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field7706);
        if (arg0 != -5879) {
            field7730 = null;
        }
        field7719++;
        this.field7713 |= 0x2;
        this.field7733 = this.method3130(-1);
    }

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(B)Z")
    public final boolean method3126(byte arg0) {
        field7705++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field7733);
        if (var2 == 36053) {
            if (arg0 >= -49) {
                this.method3122(true, null, 44, -71);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(II)V")
    public final void method3127(int arg0, int arg1) {
        if (this.field7725[arg0] != null) {
            this.field7725[arg0].method592(0);
        }
        field7714++;
        if (arg1 != 0) {
            this.field7713 = -20;
        }
        this.field7732 &= ~(0x1 << arg0);
        this.field7725[arg0] = null;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILcs;B)V")
    public final void method3128(int arg0, class289 arg1, byte arg2) {
        int var4 = 1 % ((-arg2 - 60) / 39);
        field7716++;
        this.method3120(21735, arg1, arg0, 0);
    }

    @OriginalMember(owner = "client!jaa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field7727.method2307(-17602, this.field7706);
        field7724++;
        super.finalize();
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V")
    public final void method2982(byte arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field7706);
        if (arg0 <= 73) {
            field7737 = false;
        }
        field7718++;
        this.field7713 |= 0x4;
        this.field7733 = this.method3130(-1);
    }

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(II)V")
    public final void method3129(int arg0, int arg1) {
        field7734++;
        if (this.field7733 == arg1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class72.field776[arg0]);
    }

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(I)V")
    public final void method2981(int arg0) {
        if (arg0 != 18770) {
            this.method3126((byte) 46);
        }
        OpenGL.glBindFramebufferEXT(36160, 0);
        field7729++;
        this.field7713 &= 0xFFFFFFFB;
        this.field7733 = this.method3130(-1);
    }

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "(I)I")
    private final int method3130(int arg0) {
        field7708++;
        if (~(this.field7713 & 0x4) != arg0) {
            return 36160;
        } else if ((this.field7713 & 0x2) == 0) {
            return (this.field7713 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "(I)V")
    public final void method2984(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field7706);
        field7712++;
        this.field7713 |= 0x1;
        if (arg0 < 58) {
            this.field7706 = -100;
        }
        this.field7733 = this.method3130(-1);
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Lad;)V")
    public class535(class362 arg0) {
        if (!arg0.field5481) {
            throw new IllegalStateException("");
        }
        this.field7727 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class504.field7296, 0);
        this.field7706 = class504.field7296[0];
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field7730[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field7730[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field7730[var2] = (char) (var2 - 4);
        }
        field7730[63] = '-';
        field7730[62] = '*';
        field7737 = false;
        field7736 = new class73(47, 3);
    }
}
