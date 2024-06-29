import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class12 implements class607 {

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    private int field212 = -1;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    private int field222 = 0;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "[Lnca;")
    private class54[] field224 = new class54[9];

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "Lqj;")
    private class548 field218;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B[J[I)V", line = 4)
    public static final void method88(byte arg0, long[] arg1, int[] arg2) {
        field213++;
        int var3 = 19 % ((arg0 + 24) / 34);
        class500.method2693(arg1.length - 1, false, arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V", line = 14)
    public final void method89(int arg0, int arg1) {
        if (this.field224[arg0] != null) {
            this.field224[arg0].method216(29468);
        }
        field225++;
        this.field217 &= ~(arg1 << arg0);
        this.field224[arg0] = null;
    }

    @OriginalMember(owner = "client!qk", name = "finalize", descriptor = "()V", line = 27)
    protected final void finalize() throws Throwable {
        this.field218.method2991(false, this.field219);
        field203++;
        super.finalize();
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V", line = 40)
    public final void method90(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        if (arg0 != 20966) {
            this.method90(-79);
        }
        field207++;
        this.field222 &= 0xFFFFFFFD;
        this.field212 = this.method94((byte) -58);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lwaa;BIII)V", line = 55)
    private final void method91(class33 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field209++;
        if (this.field212 == -1) {
            throw new RuntimeException();
        }
        int var6 = 12 / ((-arg1 - 42) / 38);
        int var7 = 0x1 << arg3;
        if ((~var7 & this.field217) == 0) {
            this.field208 = arg0.field463;
            this.field200 = arg0.field463;
        } else if (this.field200 != arg0.field463 || this.field208 != arg0.field463) {
            throw new RuntimeException();
        }
        arg0.method218((byte) 109, class44.field590[arg3], this.field212, arg2, arg4);
        this.field224[arg3] = arg0;
        this.field217 |= var7;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 87)
    public final void method92(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field219);
        field220++;
        if (arg0 == -5908) {
            this.field222 |= 0x4;
            this.field212 = this.method94((byte) -43);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILpm;BI)V", line = 100)
    private final void method93(int arg0, class133 arg1, byte arg2, int arg3) {
        field216++;
        if (this.field212 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field217 & ~var5) == 0) {
            this.field200 = arg1.field1728;
            this.field208 = arg1.field1740;
        } else if (this.field200 != arg1.field1728 || this.field208 != arg1.field1740) {
            throw new RuntimeException();
        }
        arg1.method772(arg3, this.field212, class44.field590[arg0], (byte) 107);
        if (arg2 < 51) {
            this.field224 = null;
        }
        this.field224[arg0] = arg1;
        this.field217 |= var5;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)I", line = 133)
    private final int method94(byte arg0) {
        field202++;
        int var2 = -80 % ((arg0 - 18) / 34);
        if ((this.field222 & 0x4) != 0) {
            return 36160;
        } else if ((this.field222 & 0x2) == 0) {
            return (this.field222 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZ)V", line = 154)
    public final void method95(int arg0, boolean arg1) {
        field223++;
        if (!arg1) {
            return;
        }
        if (this.field212 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class44.field590[arg0]);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)Z", line = 169)
    public final boolean method96(boolean arg0) {
        field211++;
        if (arg0) {
            return false;
        } else {
            int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field212);
            return var2 == 36053;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V", line = 191)
    public final void method97(int arg0) {
        field199++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field222 &= 0xFFFFFFFB;
        if (arg0 != -9828) {
            this.field218 = null;
        }
        this.field212 = this.method94((byte) 86);
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V", line = 206)
    public final void method98(int arg0) {
        if (arg0 >= -127) {
            this.method100((byte) -100, 64);
        }
        field210++;
        OpenGL.glBindFramebufferEXT(36009, this.field219);
        this.field222 |= 0x2;
        this.field212 = this.method94((byte) -75);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILpca;I)V", line = 220)
    public final void method99(int arg0, class400 arg1, int arg2) {
        field205++;
        if (this.field212 == -1) {
            throw new RuntimeException();
        }
        if (arg2 != -2693) {
            this.method96(true);
        }
        int var4 = 0x1 << arg0;
        if ((this.field217 & ~var4) == 0) {
            this.field200 = arg1.field5019;
            this.field208 = arg1.field5015;
        } else if (this.field200 != arg1.field5019 || this.field208 != arg1.field5015) {
            throw new RuntimeException();
        }
        arg1.method2135(arg2 + 2819, class44.field590[arg0], this.field212);
        this.field224[arg0] = arg1;
        this.field217 |= var4;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)V", line = 253)
    public final void method100(byte arg0, int arg1) {
        int var3 = 31 / ((arg0 + 6) / 42);
        field214++;
        if (this.field212 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class44.field590[arg1]);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 266)
    public final void method101(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field219);
        field206++;
        if (arg0 > 78) {
            this.field222 |= 0x1;
            this.field212 = this.method94((byte) 97);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBLwaa;I)V", line = 284)
    public final void method102(int arg0, byte arg1, class33 arg2, int arg3) {
        field201++;
        this.method91(arg2, (byte) -110, arg3, arg0, 0);
        if (arg1 != -64) {
            this.method99(120, null, -107);
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lqj;)V", line = 340)
    public class12(class548 arg0) {
        if (!arg0.field7593) {
            throw new IllegalStateException("");
        }
        this.field218 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class161.field2129, 0);
        this.field219 = class161.field2129[0];
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lpm;BI)V", line = 307)
    public final void method103(class133 arg0, byte arg1, int arg2) {
        this.method93(arg2, arg0, (byte) 55, 0);
        if (arg1 != 1) {
            field221 = 80;
        }
        field204++;
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V", line = 328)
    public final void method104(int arg0) {
        field215++;
        if (arg0 != 16401) {
            this.method91(null, (byte) -83, -24, 44, -61);
        }
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field222 &= 0xFFFFFFFE;
        this.field212 = this.method94((byte) 120);
    }
}
