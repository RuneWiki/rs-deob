import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class643 implements class560 {

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "[Lpca;")
    private class713[] field8844 = new class713[9];

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    private int field8841 = 0;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    private int field8842 = -1;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Lqo;")
    private class22 field8852;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    private int field8860;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "Z")
    public static boolean field8857 = false;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "Lria;")
    public static class287 field8843 = new class287();

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field8858 = 0;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field8833;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field8835;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field8845;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field8848;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field8849;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field8850;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    private int field8851;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    private int field8853;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    private int field8855;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field8861;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public final void method3213(byte arg0) {
        field8834++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        if (arg0 == -47) {
            this.field8841 &= 0xFFFFFFFE;
            this.field8842 = this.method3650(-114);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIILq;)V")
    public final void method3644(int arg0, int arg1, int arg2, class429 arg3) {
        this.method3648(0, (byte) -38, arg3, arg0, arg2);
        if (arg1 < -49) {
            field8856++;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public final void method3214(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field8860);
        field8836++;
        this.field8841 |= 0x4;
        if (arg0 != -11762) {
            field8858 = 110;
        }
        this.field8842 = this.method3650(-115);
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V")
    public static void method3645(int arg0) {
        if (arg0 < -124) {
            field8843 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
    public final void method3646(int arg0, int arg1) {
        if (this.field8844[arg1] != null) {
            this.field8844[arg1].method457(-3022);
        }
        if (arg0 != 2983) {
            this.field8860 = -116;
        }
        field8835++;
        this.field8853 &= ~(0x1 << arg1);
        this.field8844[arg1] = null;
    }

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)V")
    public static final void method3647(int arg0) {
        int var1 = 56 / ((arg0 + 56) / 42);
        for (int var2 = 0; var2 < class649.field8920; var2++) {
            class456 var4 = class429.field6148[var2];
            boolean var5 = false;
            if (var4.field6421 == null) {
                var4.field6433--;
                if (var4.field6433 >= (var4.method2715((byte) -66) ? -1500 : -10)) {
                    if (var4.field6425 == 1 && var4.field6428 == null) {
                        var4.field6428 = class642.method3643(class417.field6035, var4.field6430, 0);
                        if (var4.field6428 == null) {
                            continue;
                        }
                        var4.field6433 += var4.field6428.method3641();
                    } else if (var4.method2715((byte) -39) && (var4.field6437 == null || var4.field6434 == null)) {
                        if (var4.field6437 == null) {
                            var4.field6437 = class329.method2096(class107.field1877, var4.field6430);
                        }
                        if (var4.field6437 == null) {
                            continue;
                        }
                        if (var4.field6434 == null) {
                            var4.field6434 = var4.field6437.method2094(new int[] { 22050 });
                            if (var4.field6434 == null) {
                                continue;
                            }
                        }
                    }
                    if (var4.field6433 < 0) {
                        int var6 = 8192;
                        int var7;
                        if (var4.field6423 == 0) {
                            var7 = var4.field6429 * (var4.field6425 == 3 ? class693.field9368.field4412.method820(-32350) : class693.field9368.field4469.method820(-32350)) >> 2;
                        } else {
                            int var8 = var4.field6423 >> 24 & 0x3;
                            if (class58.field1147.field5926 == var8) {
                                int var9 = var4.field6423 & 0xFF << 9;
                                int var10 = class58.field1147.method2457((byte) 52) << 8;
                                int var11 = (var4.field6423 & 0xFF7E29) >> 16;
                                int var12 = (var11 << 9) + var10 + 256 - class58.field1147.field5922;
                                int var13 = (var4.field6423 & 0xFFC1) >> 8;
                                int var14 = (var13 << 9) + 256 - (class58.field1147.field5933 - var10);
                                int var15 = Math.abs(var12) + Math.abs(var14) - 512;
                                if (var15 > var9) {
                                    var4.field6433 = -99999;
                                    continue;
                                }
                                if (var15 < 0) {
                                    var15 = 0;
                                }
                                var7 = (var9 - var15) * class693.field9368.field4431.method820(-32350) * var4.field6429 / var9 >> 2;
                                if (var4.field6417 != null && var4.field6417 instanceof class494) {
                                    class494 var16 = (class494) var4.field6417;
                                    short var17 = var16.field6831;
                                    short var18 = var16.field6838;
                                }
                                if (var12 != 0 || var14 != 0) {
                                    int var19 = -class600.field8231 - ((int) (Math.atan2((double) var12, (double) var14) * 2607.5945876176133D)) - 4096 & 0x3FFF;
                                    if (var19 > 8192) {
                                        var19 = 16384 - var19;
                                    }
                                    int var20;
                                    if (var15 <= 0) {
                                        var20 = 8192;
                                    } else if (var15 >= 4096) {
                                        var20 = 16384;
                                    } else {
                                        var20 = (8192 - var15) / 4096 + 8192;
                                    }
                                    var6 = (16384 - var20 >> 1) + var19 * var20 / 8192;
                                }
                            } else {
                                var7 = 0;
                            }
                        }
                        if (var7 > 0) {
                            class735 var21 = null;
                            if (var4.field6425 == 1) {
                                var21 = var4.field6428.method3640().method4052(class335.field4728);
                            } else if (var4.method2715((byte) -112)) {
                                var21 = var4.field6434;
                            }
                            class563 var22 = var4.field6421 = class563.method3253(var21, var4.field6418, var7, var6);
                            var22.method3259(var4.field6422 - 1);
                            class326.field4510.method1324(var22);
                        }
                    }
                } else {
                    var5 = true;
                }
            } else if (!var4.field6421.method2311((byte) 4)) {
                var5 = true;
            }
            if (var5) {
                class649.field8920--;
                for (int var23 = var2; var23 < class649.field8920; var23++) {
                    class429.field6148[var23] = class429.field6148[var23 + 1];
                }
                var2--;
            }
        }
        field8859++;
        if (class737.field9928 && !class534.method3078(true)) {
            if (class693.field9368.field4457.method820(-32350) != 0 && class277.field3916 != -1) {
                if (class287.field4000 == null) {
                    class580.method3329(0, class277.field3916, false, 124, class78.field1399, class693.field9368.field4457.method820(-32350));
                } else {
                    class333.method2108(2, class287.field4000, class693.field9368.field4457.method820(-32350), class78.field1399, false, 0, class277.field3916);
                }
            }
            class737.field9928 = false;
            class287.field4000 = null;
        } else if (class693.field9368.field4457.method820(-32350) != 0 && class277.field3916 != -1 && !class534.method3078(true)) {
            class726.field9827++;
            class564 var3 = class227.method1594(class22.field376, class72.field1320, -107);
            var3.field7778.method1539((byte) 118, class277.field3916);
            class167.method1260(-54, var3);
            class277.field3916 = -1;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBLq;II)V")
    private final void method3648(int arg0, byte arg1, class429 arg2, int arg3, int arg4) {
        field8845++;
        if (this.field8842 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg3;
        if (arg1 > -16) {
            field8857 = false;
        }
        if ((this.field8853 & ~var6) == 0) {
            this.field8851 = arg2.field6155;
            this.field8855 = arg2.field6155;
        } else if (this.field8851 != arg2.field6155 || this.field8855 != arg2.field6155) {
            throw new RuntimeException();
        }
        arg2.method2613(this.field8842, arg4, class233.field3386[arg3], arg0, -1);
        this.field8844[arg3] = arg2;
        this.field8853 |= var6;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V")
    public final void method3649(int arg0, byte arg1) {
        field8854++;
        if (arg1 != 3) {
            field8843 = null;
        }
        if (this.field8842 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class233.field3386[arg0]);
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
    public final void method3216(int arg0) {
        field8840++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        int var2 = 46 % ((84 - arg0) / 32);
        this.field8841 &= 0xFFFFFFFB;
        this.field8842 = this.method3650(-124);
    }

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "(I)I")
    private final int method3650(int arg0) {
        field8838++;
        if ((this.field8841 & 0x4) != 0) {
            return 36160;
        }
        if (arg0 >= -112) {
            this.method3648(84, (byte) -103, null, 17, 11);
        }
        if ((this.field8841 & 0x2) == 0) {
            return (this.field8841 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V")
    public final void method3218(int arg0) {
        if (arg0 != -32502) {
            this.method3644(-50, 9, 123, null);
        }
        OpenGL.glBindFramebufferEXT(36009, 0);
        field8847++;
        this.field8841 &= 0xFFFFFFFD;
        this.field8842 = this.method3650(arg0 + 32374);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)V")
    public final void method3651(int arg0, int arg1) {
        field8849++;
        if (~this.field8842 == arg0) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class233.field3386[arg1]);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILtp;II)V")
    private final void method3652(int arg0, class533 arg1, int arg2, int arg3) {
        field8861++;
        if (this.field8842 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg2;
        if (~(~var5 & this.field8853) == arg3) {
            this.field8851 = arg1.field7334;
            this.field8855 = arg1.field7338;
        } else if (this.field8851 != arg1.field7334 || this.field8855 != arg1.field7338) {
            throw new RuntimeException();
        }
        arg1.method3065(this.field8842, arg0, 0, class233.field3386[arg2]);
        this.field8844[arg2] = arg1;
        this.field8853 |= var5;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public final void method3215(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field8860);
        if (arg0 != -11421) {
            this.method3654(119, null, 117);
        }
        field8846++;
        this.field8841 |= 0x2;
        this.field8842 = this.method3650(arg0 ^ 0x2CEC);
    }

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "(I)Z")
    public final boolean method3653(int arg0) {
        field8837++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field8842);
        int var3 = -56 / ((71 - arg0) / 45);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILkw;I)V")
    public final void method3654(int arg0, class251 arg1, int arg2) {
        field8850++;
        if (this.field8842 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field8853 & ~var4) == 0) {
            this.field8855 = arg1.field3627;
            this.field8851 = arg1.field3634;
        } else if (this.field8851 != arg1.field3634 || this.field8855 != arg1.field3627) {
            throw new RuntimeException();
        }
        int var5 = -68 / ((arg2 - 64) / 49);
        arg1.method1705(36161, class233.field3386[arg0], this.field8842);
        this.field8844[arg0] = arg1;
        this.field8853 |= var4;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ltp;II)V")
    public final void method3655(class533 arg0, int arg1, int arg2) {
        this.method3652(arg1, arg0, arg2, -1);
        field8848++;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
    public final void method3217(int arg0) {
        field8862++;
        OpenGL.glBindFramebufferEXT(36008, this.field8860);
        this.field8841 |= 0x1;
        this.field8842 = this.method3650(arg0 ^ 0x6A7C);
        if (arg0 != -27141) {
            field8857 = false;
        }
    }

    @OriginalMember(owner = "client!rg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field8833++;
        this.field8852.method336(96, this.field8860);
        super.finalize();
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lqo;)V")
    public class643(class22 arg0) {
        if (!arg0.field642) {
            throw new IllegalStateException("");
        }
        this.field8852 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class62.field1234, 0);
        this.field8860 = class62.field1234[0];
    }
}
