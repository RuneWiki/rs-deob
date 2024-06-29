import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class276 implements class577 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    private int field4451 = -1;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[Lgfa;")
    private class697[] field4455 = new class697[9];

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    private int field4469 = 0;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Ler;")
    private class92 field4456;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    private int field4460;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "Lhga;")
    public static class158 field4472 = new class158(65, 8);

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "Lhga;")
    public static class158 field4476 = new class158(62, 12);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    private int field4454;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    private int field4458;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    private int field4470;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V", line = 5)
    public static void method1962(byte arg0) {
        if (arg0 != 31) {
            method1975(9, -56, (byte) 101);
        }
        field4476 = null;
        field4472 = null;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V", line = 16)
    public final void method1963(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field4460);
        field4453++;
        this.field4469 |= 0x2;
        if (arg0 >= -112) {
            this.method1966((byte) -119);
        }
        this.field4451 = this.method1979(-3886);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BILlaa;)V", line = 32)
    public final void method1964(byte arg0, int arg1, class106 arg2) {
        field4461++;
        if (this.field4451 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg1;
        if ((~var4 & this.field4454) == 0) {
            this.field4458 = arg2.field1712;
            this.field4470 = arg2.field1715;
        } else if (this.field4470 != arg2.field1715 || this.field4458 != arg2.field1712) {
            throw new RuntimeException();
        }
        arg2.method1006(69, this.field4451, class155.field2654[arg1]);
        this.field4455[arg1] = arg2;
        this.field4454 |= var4;
        if (arg0 <= 34) {
            this.method1974(true, -28, -50, null);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V", line = 66)
    public final void method1965(int arg0, int arg1) {
        if (arg0 < 66) {
            this.method1972((byte) -78, 116);
        }
        if (this.field4455[arg1] != null) {
            this.field4455[arg1].method667(13035);
        }
        field4477++;
        this.field4454 &= ~(0x1 << arg1);
        this.field4455[arg1] = null;
    }

    @OriginalMember(owner = "client!nb", name = "finalize", descriptor = "()V", line = 84)
    protected final void finalize() throws Throwable {
        this.field4456.method873(false, this.field4460);
        field4452++;
        super.finalize();
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 96)
    public final void method1966(byte arg0) {
        field4450++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        if (arg0 >= -83) {
            this.method1965(-48, -26);
        }
        this.field4469 &= 0xFFFFFFFB;
        this.field4451 = this.method1979(-3886);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)V", line = 109)
    public final void method1967(int arg0, int arg1) {
        if (arg1 != -5) {
            field4472 = null;
        }
        field4474++;
        if (this.field4451 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class155.field2654[arg0]);
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Ler;)V", line = 357)
    public class276(class92 arg0) {
        if (!arg0.field1472) {
            throw new IllegalStateException("");
        }
        this.field4456 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class591.field8390, 0);
        this.field4460 = class591.field8390[0];
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILwh;B)V", line = 127)
    public final void method1968(int arg0, class133 arg1, byte arg2) {
        this.method1974(true, 0, arg0, arg1);
        field4475++;
        int var4 = 90 % ((arg2 - 73) / 53);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILqn;II)V", line = 138)
    private final void method1969(int arg0, int arg1, class58 arg2, int arg3, int arg4) {
        field4462++;
        if (this.field4451 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg3;
        if (arg1 > -122) {
            this.field4456 = null;
        }
        if ((~var6 & this.field4454) == 0) {
            this.field4458 = arg2.field758;
            this.field4470 = arg2.field758;
        } else if (this.field4470 != arg2.field758 || this.field4458 != arg2.field758) {
            throw new RuntimeException();
        }
        arg2.method669(arg0, (byte) 97, this.field4451, class155.field2654[arg3], arg4);
        this.field4455[arg3] = arg2;
        this.field4454 |= var6;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)Z", line = 171)
    public final boolean method1970(byte arg0) {
        field4465++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field4451);
        int var3 = 51 % (-arg0 / 61);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V", line = 200)
    public final void method1971(boolean arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field4459++;
        if (!arg0) {
            this.method1969(123, -42, null, -42, 51);
        }
        this.field4469 &= 0xFFFFFFFD;
        this.field4451 = this.method1979(-3886);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)V", line = 215)
    public final void method1972(byte arg0, int arg1) {
        field4464++;
        int var3 = -22 / ((70 - arg0) / 50);
        if (this.field4451 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class155.field2654[arg1]);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 230)
    public final void method1973(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field4457++;
        this.field4469 &= 0xFFFFFFFE;
        if (arg0 < -80) {
            this.field4451 = this.method1979(-3886);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZIILwh;)V", line = 243)
    private final void method1974(boolean arg0, int arg1, int arg2, class133 arg3) {
        field4466++;
        if (this.field4451 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg2;
        if ((this.field4454 & ~var5) == 0) {
            this.field4458 = arg3.field2179;
            this.field4470 = arg3.field2178;
        } else if (this.field4470 != arg3.field2178 || this.field4458 != arg3.field2179) {
            throw new RuntimeException();
        }
        if (!arg0) {
            this.method1971(false);
        }
        arg3.method1157(this.field4451, class155.field2654[arg2], arg1, false);
        this.field4455[arg2] = arg3;
        this.field4454 |= var5;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIB)Z", line = 278)
    public static final boolean method1975(int arg0, int arg1, byte arg2) {
        field4471++;
        if (arg2 < 62) {
            field4472 = null;
        }
        return class53.method590(arg0, -50, arg1) | (arg0 & 0x70000) != 0 || class403.method2586(arg1, arg0, 126);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V", line = 289)
    public final void method1976(boolean arg0) {
        field4463++;
        OpenGL.glBindFramebufferEXT(36008, this.field4460);
        this.field4469 |= 0x1;
        this.field4451 = this.method1979(-3886);
        if (arg0) {
            this.method1968(-34, null, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V", line = 302)
    public final void method1977(int arg0) {
        field4467++;
        OpenGL.glBindFramebufferEXT(36160, this.field4460);
        this.field4469 |= 0x4;
        if (arg0 != -18856) {
            this.method1967(35, 35);
        }
        this.field4451 = this.method1979(-3886);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lqn;IIB)V", line = 315)
    public final void method1978(class58 arg0, int arg1, int arg2, byte arg3) {
        field4473++;
        if (arg3 < 58) {
            this.method1973(-9);
        }
        this.method1969(0, -124, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)I", line = 332)
    private final int method1979(int arg0) {
        field4468++;
        if ((this.field4469 & 0x4) != 0) {
            return 36160;
        } else if ((this.field4469 & 0x2) == 0) {
            if (arg0 != -3886) {
                this.field4470 = -125;
            }
            return (this.field4469 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }
}
