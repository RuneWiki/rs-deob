import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class527 implements class372 {

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    private int field7733 = 0;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
    private int field7748 = -1;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "[Lov;")
    private class122[] field7737 = new class122[9];

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "Lht;")
    private class410 field7751;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
    private int field7754;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    public static int field7736 = 0;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public static int field7732;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    private int field7734;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public static int field7741;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
    public static int field7750;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
    public static int field7752;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "I")
    private int field7753;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
    public static int field7755;

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "I")
    public static int field7757;

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
    private int field7759;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "I")
    public static int field7760;

    static {
        new class83("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILil;IBI)V", line = 5)
    private final void method3086(int arg0, class7 arg1, int arg2, byte arg3, int arg4) {
        field7757++;
        if (this.field7748 == -1) {
            throw new RuntimeException();
        }
        if (arg3 != 4) {
            this.field7733 = 39;
        }
        int var6 = 0x1 << arg0;
        if ((~var6 & this.field7734) == 0) {
            this.field7759 = arg1.field71;
            this.field7753 = arg1.field71;
        } else if (this.field7753 != arg1.field71 || this.field7759 != arg1.field71) {
            throw new RuntimeException();
        }
        arg1.method40(arg4, (byte) -119, class170.field2417[arg0], arg2, this.field7748);
        this.field7737[arg0] = arg1;
        this.field7734 |= var6;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIILqv;)V", line = 38)
    private final void method3087(int arg0, int arg1, int arg2, class308 arg3) {
        field7730++;
        if (this.field7748 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg2;
        if (arg1 != 31266) {
            this.method3095(58, (byte) -54);
        }
        if ((this.field7734 & ~var5) == 0) {
            this.field7759 = arg3.field4220;
            this.field7753 = arg3.field4219;
        } else if (this.field7753 != arg3.field4219 || this.field7759 != arg3.field4220) {
            throw new RuntimeException();
        }
        arg3.method1748(class170.field2417[arg2], arg0, false, this.field7748);
        this.field7737[arg2] = arg3;
        this.field7734 |= var5;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)Lim;", line = 69)
    public static final class402 method3088(int arg0) {
        field7743++;
        if (arg0 != 1) {
            return null;
        }
        try {
            return (class402) Class.forName("q").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V", line = 90)
    public static final void method3089(int arg0) {
        field7749++;
        if (class437.field6373 != null) {
            return;
        }
        class437.field6373 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        int var3 = 0;
        if (arg0 != 429048714) {
            return;
        }
        while (var3 < 65536) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - var6 * var8;
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (0.6666666666666666D - var20) * (var16 - var18) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class437.field6373[var3] = var35;
            var3++;
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lht;)V", line = 490)
    public class527(class410 arg0) {
        if (!arg0.field5897) {
            throw new IllegalStateException("");
        }
        this.field7751 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class223.field3138, 0);
        this.field7754 = class223.field3138[0];
    }

    @OriginalMember(owner = "client!lr", name = "finalize", descriptor = "()V", line = 210)
    protected final void finalize() throws Throwable {
        this.field7751.method2396(this.field7754, -106);
        field7746++;
        super.finalize();
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V", line = 223)
    public final void method2154(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field7754);
        field7741++;
        this.field7733 |= 0x4;
        if (arg0 == 13781) {
            this.field7748 = this.method3093(-1);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILps;I)V", line = 236)
    public final void method3090(int arg0, class62 arg1, int arg2) {
        field7744++;
        if (this.field7748 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg2;
        if ((this.field7734 & ~var4) == arg0) {
            this.field7759 = arg1.field841;
            this.field7753 = arg1.field840;
        } else if (this.field7753 != arg1.field840 || this.field7759 != arg1.field841) {
            throw new RuntimeException();
        }
        arg1.method391((byte) -99, this.field7748, class170.field2417[arg2]);
        this.field7737[arg2] = arg1;
        this.field7734 |= var4;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)Z", line = 266)
    public static final boolean method3091(int arg0, int arg1, int arg2) {
        field7750++;
        if (arg0 == 656) {
            return (arg2 & 0x20) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)V", line = 277)
    public final void method3092(int arg0, int arg1) {
        field7758++;
        if (this.field7748 == arg0) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class170.field2417[arg1]);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V", line = 289)
    public final void method2151(byte arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        field7745++;
        if (arg0 == -27) {
            this.field7733 &= 0xFFFFFFFB;
            this.field7748 = this.method3093(arg0 + 26);
        }
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)I", line = 307)
    private final int method3093(int arg0) {
        field7739++;
        if (~(this.field7733 & 0x4) != arg0) {
            return 36160;
        } else if ((this.field7733 & 0x2) == 0) {
            return (this.field7733 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILil;I)V", line = 328)
    public final void method3094(int arg0, int arg1, class7 arg2, int arg3) {
        if (arg0 > 82) {
            this.method3086(arg3, arg2, arg1, (byte) 4, 0);
            field7752++;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)V", line = 340)
    public final void method3095(int arg0, byte arg1) {
        if (arg1 != -17) {
            this.field7754 = -44;
        }
        field7747++;
        if (this.field7737[arg0] != null) {
            this.field7737[arg0].method43(-118);
        }
        this.field7734 &= ~(0x1 << arg0);
        this.field7737[arg0] = null;
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(B)Z", line = 358)
    public final boolean method3096(byte arg0) {
        field7760++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field7748);
        if (var2 == 36053) {
            int var3 = 3 % ((arg0 - 77) / 42);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V", line = 377)
    public final void method2153(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field7754);
        field7732++;
        this.field7733 |= 0x1;
        this.field7748 = this.method3093(-1);
        if (arg0 != -6210) {
            this.method2151((byte) 113);
        }
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(B)V", line = 390)
    public final void method2156(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field7738++;
        this.field7733 &= 0xFFFFFFFD;
        this.field7748 = this.method3093(-1);
        int var2 = -100 % ((-arg0 - 29) / 36);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lqv;IB)V", line = 408)
    public final void method3097(class308 arg0, int arg1, byte arg2) {
        if (arg2 > -123) {
            method3088(110);
        }
        field7735++;
        this.method3087(0, 31266, arg1, arg0);
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)V", line = 422)
    public final void method2152(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        if (arg0 > -10) {
            this.field7748 = 61;
        }
        field7731++;
        this.field7733 &= 0xFFFFFFFE;
        this.field7748 = this.method3093(-1);
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(B)V", line = 440)
    public final void method2155(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field7754);
        if (arg0 != 12) {
            this.method3095(99, (byte) -34);
        }
        field7755++;
        this.field7733 |= 0x2;
        this.field7748 = this.method3093(arg0 ^ 0xFFFFFFF3);
    }

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "(B)I", line = 453)
    public final int method3098(byte arg0) {
        field7756++;
        return arg0 == 92 ? this.field7759 : 15;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(II)V", line = 467)
    public final void method3099(int arg0, int arg1) {
        field7740++;
        int var3 = 12 % ((arg1 + 49) / 55);
        if (this.field7748 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class170.field2417[arg0]);
    }
}
