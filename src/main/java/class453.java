import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class453 implements class87 {

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    private int field6322 = 0;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    private int field6345 = -1;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "[Lnj;")
    private class401[] field6340 = new class401[9];

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "Lgk;")
    private class463 field6334;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    private int field6325;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field6331 = 52;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    private int field6321;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    private int field6328;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    private int field6336;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public static int field6349;

    static {
        new class169("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)I", line = 3)
    public final int method2682(boolean arg0) {
        if (arg0) {
            this.field6322 = -35;
        }
        field6326++;
        return this.field6321;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)V", line = 19)
    public final void method2683(int arg0, int arg1) {
        field6329++;
        int var3 = -17 % ((-arg0 - 4) / 57);
        if (this.field6345 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class21.field391[arg1]);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)V", line = 34)
    public final void method2684(int arg0, int arg1) {
        field6347++;
        if (this.field6340[arg0] != null) {
            this.field6340[arg0].method220(0);
        }
        this.field6328 &= ~(arg1 << arg0);
        this.field6340[arg0] = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V", line = 52)
    public final void method553(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field6349++;
        this.field6322 &= 0xFFFFFFFE;
        this.field6345 = this.method2691(350);
        int var2 = -43 % ((arg0 - 13) / 32);
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V", line = 68)
    public final void method551(int arg0) {
        field6343++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field6322 &= 0xFFFFFFFB;
        if (arg0 == -8279) {
            this.field6345 = this.method2691(350);
        }
    }

    @OriginalMember(owner = "client!jh", name = "finalize", descriptor = "()V", line = 82)
    protected final void finalize() throws Throwable {
        field6332++;
        this.field6334.method2737(34166, this.field6325);
        super.finalize();
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lsr;IBI)V", line = 92)
    private final void method2685(class346 arg0, int arg1, byte arg2, int arg3) {
        field6348++;
        if (this.field6345 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg1;
        int var6 = 34 % ((arg2 + 50) / 63);
        if ((~var5 & this.field6328) == 0) {
            this.field6336 = arg0.field4409;
            this.field6321 = arg0.field4416;
        } else if (this.field6336 != arg0.field4409 || this.field6321 != arg0.field4416) {
            throw new RuntimeException();
        }
        arg0.method2034(arg3, 0, class21.field391[arg1], this.field6345);
        this.field6340[arg1] = arg0;
        this.field6328 |= var5;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILhp;I)V", line = 122)
    public final void method2686(int arg0, class288 arg1, int arg2) {
        field6327++;
        if (arg2 != 620) {
            field6341 = -97;
        }
        if (this.field6345 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field6328 & ~var4) == 0) {
            this.field6321 = arg1.field3688;
            this.field6336 = arg1.field3677;
        } else if (this.field6336 != arg1.field3677 || this.field6321 != arg1.field3688) {
            throw new RuntimeException();
        }
        arg1.method1749(this.field6345, class21.field391[arg0], true);
        this.field6340[arg0] = arg1;
        this.field6328 |= var4;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLsr;I)V", line = 163)
    public final void method2687(byte arg0, class346 arg1, int arg2) {
        int var4 = -90 / ((-arg0 - 19) / 62);
        field6324++;
        this.method2685(arg1, arg2, (byte) -120, 0);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V", line = 173)
    public final void method549(int arg0) {
        if (arg0 != 18500) {
            method2689(null, (byte) 49);
        }
        field6330++;
        OpenGL.glBindFramebufferEXT(36009, this.field6325);
        this.field6322 |= 0x2;
        this.field6345 = this.method2691(350);
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lgk;)V", line = 383)
    public class453(class463 arg0) {
        if (!arg0.field6719) {
            throw new IllegalStateException("");
        }
        this.field6334 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class438.field6104, 0);
        this.field6325 = class438.field6104[0];
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 195)
    public final void method548(int arg0) {
        if (arg0 > -104) {
            field6341 = 58;
        }
        field6339++;
        OpenGL.glBindFramebufferEXT(36008, this.field6325);
        this.field6322 |= 0x1;
        this.field6345 = this.method2691(350);
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(II)V", line = 208)
    public final void method2688(int arg0, int arg1) {
        if (arg0 < 0) {
            return;
        }
        field6344++;
        if (this.field6345 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class21.field391[arg1]);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lqa;B)V", line = 223)
    public static final void method2689(class129 arg0, byte arg1) {
        field6335++;
        arg0.method925(0, 0, class23.field419, 350);
        arg0.method861(0, 0, class23.field419, 350, class342.field4357 << 24 | 0x332277, 1);
        int var2 = 350 / class8.field87;
        if (class165.field2139 > 0) {
            int var3 = 346 - class8.field87 - 4;
            int var4 = var2 * var3 / (var2 - (1 - class165.field2139));
            int var5 = 4;
            if (class165.field2139 > 1) {
                var5 += (var3 - var4) * (class165.field2139 - class92.field1277 - 1) / (class165.field2139 - 1);
            }
            arg0.method861(class23.field419 - 16, var5, 12, var4, class342.field4357 << 24 | 0x332277, 2);
            for (int var6 = class92.field1277; var6 < (class92.field1277 + var2) && class165.field2139 > var6; var6++) {
                String[] var7 = class332.method1978((byte) -58, '\b', class99.field1384[var6]);
                int var8 = (class23.field419 - 8 - 16) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg0.method925(var10, 0, var10 + var8 - 8, 350);
                    class43.field635.method1118(348 - class329.field4217 - class99.field1379.field3546 - (var6 - class92.field1277) * class8.field87, var10, -16777216, -1, -8634, var7[var9]);
                }
            }
        }
        arg0.method925(0, 0, class23.field419, 350);
        arg0.method920(1, 0, 350 - class329.field4217, -1, class23.field419);
        class200.field2590.method1118(350 - class157.field2070.field3546 - 1, 10, -16777216, -1, -8634, "--> " + class268.field3398);
        int var11 = -1;
        int var12 = 43 / ((arg1 + 57) / 52);
        if ((class264.field3353 % 30) > 15) {
            var11 = 16777215;
        }
        arg0.method826(var11, 12, 350 - class157.field2070.field3546 - 11, (byte) 53, class157.field2070.method1704((byte) 104, "--> " + class268.field3398.substring(0, class502.field7381)) + 10);
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V", line = 285)
    public final void method550(int arg0) {
        field6323++;
        OpenGL.glBindFramebufferEXT(36160, this.field6325);
        this.field6322 |= 0x4;
        this.field6345 = this.method2691(350);
        int var2 = -20 % ((26 - arg0) / 46);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILlm;II)V", line = 302)
    private final void method2690(int arg0, int arg1, class244 arg2, int arg3, int arg4) {
        field6346++;
        if (this.field6345 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg0;
        if (~(~var6 & this.field6328) == arg3) {
            this.field6321 = arg2.field3130;
            this.field6336 = arg2.field3130;
        } else if (this.field6336 != arg2.field3130 || this.field6321 != arg2.field3130) {
            throw new RuntimeException();
        }
        arg2.method1531(arg4, arg1, class21.field391[arg0], this.field6345, (byte) 93);
        this.field6340[arg0] = arg2;
        this.field6328 |= var6;
    }

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "(I)I", line = 338)
    private final int method2691(int arg0) {
        field6333++;
        if ((this.field6322 & 0x4) != 0) {
            return 36160;
        } else if (arg0 != 350) {
            return -41;
        } else if ((this.field6322 & 0x2) == 0) {
            return (this.field6322 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)V", line = 360)
    public final void method552(int arg0) {
        field6338++;
        if (arg0 != -25299) {
            this.field6336 = -113;
        }
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field6322 &= 0xFFFFFFFD;
        this.field6345 = this.method2691(350);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILlm;IB)V", line = 373)
    public final void method2692(int arg0, class244 arg1, int arg2, byte arg3) {
        field6342++;
        this.method2690(arg2, arg0, arg1, arg3 + 108, 0);
        if (arg3 != -109) {
            field6331 = 74;
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)Z", line = 398)
    public final boolean method2693(byte arg0) {
        field6337++;
        if (arg0 >= -111) {
            method2689(null, (byte) -125);
        }
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field6345);
        return var2 == 36053;
    }
}
