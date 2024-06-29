import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class365 implements class691 {

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "[Lau;")
    private class737[] field4826 = new class737[9];

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
    private int field4840 = -1;

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "I")
    private int field4844 = 0;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "Lac;")
    private class541 field4816;

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
    private int field4841;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "Lgm;")
    public static class125 field4818 = new class125("", 18);

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "Lil;")
    public static class7 field4838 = new class7();

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    private int field4823;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
    private int field4827;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    private int field4832;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "[I")
    public static int[] field4820;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILaaa;I)V", line = 3)
    public final void method2084(int arg0, class616 arg1, int arg2) {
        field4837++;
        this.method2099(0, arg1, -128, arg0);
        if (arg2 <= 106) {
            this.method2092((byte) 25);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILhw;II)V", line = 14)
    private final void method2085(int arg0, int arg1, class132 arg2, int arg3, int arg4) {
        field4817++;
        if (~this.field4840 == arg4) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg1;
        if ((~var6 & this.field4823) == 0) {
            this.field4832 = arg2.field1696;
            this.field4827 = arg2.field1696;
        } else if (this.field4827 != arg2.field1696 || this.field4832 != arg2.field1696) {
            throw new RuntimeException();
        }
        arg2.method835(arg0, class315.field4253[arg1], arg3, this.field4840, (byte) -99);
        this.field4826[arg1] = arg2;
        this.field4823 |= var6;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)V", line = 45)
    public final void method2086(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field4841);
        if (arg0 == 77) {
            field4834++;
            this.field4844 |= 0x1;
            this.field4840 = this.method2090(3);
        }
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(B)V", line = 58)
    public final void method2087(byte arg0) {
        field4821++;
        if (arg0 <= 10) {
            this.method2085(87, 67, null, -88, -66);
        }
        OpenGL.glBindFramebufferEXT(36160, this.field4841);
        this.field4844 |= 0x4;
        this.field4840 = this.method2090(3);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V", line = 72)
    public static void method2088(boolean arg0) {
        field4818 = null;
        field4838 = null;
        field4820 = null;
        if (!arg0) {
            method2088(false);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)V", line = 88)
    public final void method2089(int arg0, int arg1) {
        field4835++;
        if (arg0 > -20) {
            return;
        }
        if (this.field4840 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class315.field4253[arg1]);
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)I", line = 104)
    private final int method2090(int arg0) {
        field4842++;
        if ((this.field4844 & 0x4) != 0) {
            return 36160;
        } else if ((this.field4844 & 0x2) != 0) {
            return 36009;
        } else if ((this.field4844 & 0x1) == 0) {
            if (arg0 != 3) {
                field4838 = null;
            }
            return -1;
        } else {
            return 36008;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIBI[I)Z", line = 124)
    public static final boolean method2091(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int[] arg7) {
        field4828++;
        if (arg6 > class38.field394) {
            arg6 = class38.field394;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg6 <= arg0) {
            return true;
        }
        if (arg5 >= -18) {
            field4838 = null;
        }
        int var8 = arg0 * arg1 + arg4;
        int var9 = arg6 - arg0 >> 2;
        int var10 = arg0 + arg2 - 1;
        if (class354.field4725 == 1) {
            class51.field536 += var9;
            while (true) {
                var9--;
                int var10000;
                if (var9 < 0) {
                    int var11 = arg6 - arg0 & 0x3;
                    while (true) {
                        var11--;
                        if (var11 < 0) {
                            return true;
                        }
                        var10000 = ~var8;
                        var10++;
                        if (var10000 > ~arg7[var10]) {
                            arg7[var10] = var8;
                        }
                        var8 += arg1;
                    }
                }
                var10++;
                if (var8 < arg7[var10]) {
                    arg7[var10] = var8;
                }
                int var12 = arg1 + var8;
                var10++;
                if (arg7[var10] > var12) {
                    arg7[var10] = var12;
                }
                int var13 = arg1 + var12;
                var10000 = ~var13;
                var10++;
                if (var10000 > ~arg7[var10]) {
                    arg7[var10] = var13;
                }
                int var14 = arg1 + var13;
                var10000 = ~var14;
                var10++;
                if (var10000 > ~arg7[var10]) {
                    arg7[var10] = var14;
                }
                var8 = arg1 + var14;
            }
        } else {
            int var15 = var8 - 38400;
            while (true) {
                var9--;
                if (var9 < 0) {
                    int var16 = arg6 - arg0 & 0x3;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            return true;
                        }
                        var10++;
                        if (arg7[var10] > var15) {
                            return false;
                        }
                        var15 += arg1;
                    }
                }
                var10++;
                if (arg7[var10] > var15) {
                    return false;
                }
                int var17 = arg1 + var15;
                var10++;
                if (arg7[var10] > var17) {
                    return false;
                }
                int var18 = arg1 + var17;
                var10++;
                if (arg7[var10] > var18) {
                    return false;
                }
                int var19 = arg1 + var18;
                var10++;
                if (arg7[var10] > var19) {
                    return false;
                }
                var15 = arg1 + var19;
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)V", line = 221)
    public final void method2092(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field4841);
        if (arg0 > -113) {
            this.method2090(-82);
        }
        field4831++;
        this.field4844 |= 0x2;
        this.field4840 = this.method2090(3);
    }

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "(B)V", line = 240)
    public final void method2093(byte arg0) {
        field4829++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field4844 &= 0xFFFFFFFD;
        if (arg0 != -30) {
            method2091(-109, -55, 70, 87, -56, (byte) 83, 20, null);
        }
        this.field4840 = this.method2090(3);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)V", line = 260)
    public final void method2094(int arg0, boolean arg1) {
        if (!arg1) {
            this.method2093((byte) 2);
        }
        if (this.field4826[arg0] != null) {
            this.field4826[arg0].method832((byte) -120);
        }
        field4824++;
        this.field4823 &= ~(0x1 << arg0);
        this.field4826[arg0] = null;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIILhw;)V", line = 277)
    public final void method2095(int arg0, int arg1, int arg2, class132 arg3) {
        this.method2085(arg1, arg2, arg3, arg0, 0);
        field4830++;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V", line = 286)
    public final void method2096(int arg0) {
        if (arg0 != -27095) {
            this.field4844 = -9;
        }
        OpenGL.glBindFramebufferEXT(36008, 0);
        field4836++;
        this.field4844 &= 0xFFFFFFFE;
        this.field4840 = this.method2090(arg0 ^ 0xFFFF962A);
    }

    @OriginalMember(owner = "client!rr", name = "finalize", descriptor = "()V", line = 299)
    protected final void finalize() throws Throwable {
        this.field4816.method2980((byte) -103, this.field4841);
        field4819++;
        super.finalize();
    }

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "(B)Z", line = 310)
    public final boolean method2097(byte arg0) {
        field4833++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field4840);
        if (var2 == 36053) {
            if (arg0 != 74) {
                this.method2094(-5, true);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(II)V", line = 331)
    public final void method2098(int arg0, int arg1) {
        field4825++;
        if (~this.field4840 == arg0) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class315.field4253[arg1]);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILaaa;II)V", line = 342)
    private final void method2099(int arg0, class616 arg1, int arg2, int arg3) {
        field4822++;
        if (this.field4840 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg3;
        if ((this.field4823 & ~var5) == 0) {
            this.field4827 = arg1.field8645;
            this.field4832 = arg1.field8639;
        } else if (this.field4827 != arg1.field8645 || this.field4832 != arg1.field8639) {
            throw new RuntimeException();
        }
        if (arg2 >= -89) {
            this.field4826 = null;
        }
        arg1.method3470(this.field4840, true, class315.field4253[arg3], arg0);
        this.field4826[arg3] = arg1;
        this.field4823 |= var5;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BILis;)V", line = 376)
    public final void method2100(byte arg0, int arg1, class503 arg2) {
        field4839++;
        if (this.field4840 == -1) {
            throw new RuntimeException();
        }
        if (arg0 < 56) {
            this.field4840 = -95;
        }
        int var4 = 0x1 << arg1;
        if ((~var4 & this.field4823) == 0) {
            this.field4832 = arg2.field6833;
            this.field4827 = arg2.field6832;
        } else if (this.field4827 != arg2.field6832 || this.field4832 != arg2.field6833) {
            throw new RuntimeException();
        }
        arg2.method2806(0, this.field4840, class315.field4253[arg1]);
        this.field4826[arg1] = arg2;
        this.field4823 |= var4;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lac;)V", line = 437)
    public class365(class541 arg0) {
        if (!arg0.field7671) {
            throw new IllegalStateException("");
        }
        this.field4816 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class399.field5646, 0);
        this.field4841 = class399.field5646[0];
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V", line = 420)
    public final void method2101(byte arg0) {
        field4843++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        if (arg0 != 69) {
            this.field4841 = 94;
        }
        this.field4844 &= 0xFFFFFFFB;
        this.field4840 = this.method2090(arg0 - 66);
    }
}
