import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class514 extends class477 {

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "Z")
    private boolean field7557 = false;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "Z")
    private boolean field7560;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "[Llm;")
    private class244[] field7554;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "[Lbt;")
    public static class88[] field7559 = new class88[2048];

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "[I")
    public static int[] field7568 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Lbf;")
    private class181 field7555;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BII)V", line = 3)
    public final void method272(byte arg0, int arg1, int arg2) {
        if (this.field7557) {
            super.field6964.method2741((byte) -38, 1);
            super.field6964.method2771(this.field7554[arg1 + -1], -16785);
            super.field6964.method2741((byte) -38, 0);
        }
        ++field7565;
        if (arg0 <= 33) {
            field7558 = 108;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V", line = 24)
    public final void method269(byte arg0) {
        ++field7551;
        if (this.field7557) {
            if (!this.field7560) {
                super.field6964.method2741((byte) -38, 2);
                super.field6964.method2771((class31) null, -16785);
            }
            super.field6964.method2741((byte) -38, 1);
            super.field6964.method2771((class31) null, -16785);
            super.field6964.method2741((byte) -38, 0);
            this.field7555.method1190((byte) 68, '\u0001');
            this.field7557 = false;
        } else {
            super.field6964.method2775(770, 5890, 0, -74);
        }
        if (arg0 != 126) {
            this.field7560 = true;
        }
        super.field6964.method2794(8448, 8448, true);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V", line = 53)
    public static void method3057(int arg0) {
        field7559 = null;
        field7568 = null;
        if (arg0 != 37) {
            field7558 = 21;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lgk;)V", line = 75)
    public class514(class463 arg0) {
        super(arg0);
        if (arg0.field6802) {
            this.field7560 = arg0.field6779 < 3;
            int var2 = !this.field7560 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (~var14 != -2) {
                            if (var14 != 2) {
                                if (var14 == 3) {
                                    var15 = -var12;
                                } else if (var14 != 4) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field7554 = new class244[3];
            this.field7554[0] = new class244(super.field6964, 6406, 64, false, var4, 6406);
            this.field7554[1] = new class244(super.field6964, 6406, 64, false, var5, 6406);
            this.field7554[2] = new class244(super.field6964, 6406, 64, false, var3, 6406);
            this.method3059((byte) -30);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lrh;II)V", line = 187)
    public final void method266(class31 arg0, int arg1, int arg2) {
        ++field7567;
        super.field6964.method2771(arg0, arg1 ^ 16794);
        super.field6964.method2739(arg2, 0);
        if (arg1 != -11) {
            method3058((class323) null, 51);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lwk;I)Z", line = 202)
    public static final boolean method3058(class323 arg0, int arg1) {
        if (arg1 < 43) {
            method3058((class323) null, -24);
        }
        ++field7561;
        class402 var2 = class52.field715.method1164(arg0.method413(-30502), 0);
        if (~var2.field5379 == 0) {
            return true;
        } else {
            class451 var3 = class471.field6882.method1562(var2.field5379, -18299);
            return var3.field6278 == -1 ? true : var3.method2673(0);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)V", line = 226)
    public final void method271(boolean arg0, int arg1) {
        if (arg1 != -13) {
            this.method270(false, true);
        }
        super.field6964.method2794(8448, 7681, true);
        ++field7563;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V", line = 237)
    private final void method3059(byte arg0) {
        this.field7555 = new class181(super.field6964, 2);
        ++field7552;
        this.field7555.method1188(0, (byte) -98);
        super.field6964.method2741((byte) -38, 1);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (!this.field7560) {
            super.field6964.method2794(7681, 8448, true);
            super.field6964.method2781(34168, 0, arg0 + 2509, 768);
            super.field6964.method2741((byte) -38, 2);
            super.field6964.method2794(260, 7681, true);
            super.field6964.method2781(34168, 0, arg0 + 2509, 768);
            super.field6964.method2781(34168, 1, 2479, 770);
            super.field6964.method2775(770, 34167, 0, arg0 ^ 121);
        } else {
            super.field6964.method2794(260, 7681, true);
            super.field6964.method2781(5890, 0, 2479, 770);
            super.field6964.method2775(770, 34167, 0, arg0 ^ 61);
        }
        super.field6964.method2741((byte) -38, 0);
        this.field7555.method1193(arg0 ^ 97);
        this.field7555.method1188(1, (byte) 112);
        super.field6964.method2741((byte) -38, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        if (arg0 != -30) {
            method3061(-107L, false);
        }
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field7560) {
            super.field6964.method2794(8448, 8448, true);
            super.field6964.method2781(5890, 0, 2479, 768);
            super.field6964.method2741((byte) -38, 2);
            super.field6964.method2794(8448, 8448, true);
            super.field6964.method2781(5890, 0, 2479, 768);
            super.field6964.method2781(34168, 1, 2479, 768);
            super.field6964.method2775(770, 5890, 0, 125);
        } else {
            super.field6964.method2794(8448, 8448, true);
            super.field6964.method2781(5890, 0, 2479, 768);
            super.field6964.method2775(770, 5890, 0, 73);
        }
        super.field6964.method2741((byte) -38, 0);
        this.field7555.method1193(-125);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILqt;I)V", line = 306)
    public static final void method3060(int arg0, int arg1, class295 arg2, int arg3) {
        if (arg1 == 11036) {
            if (arg2.field5191 == arg0 && ~arg0 != 0) {
                class44 var4 = class403.field5429.method1962(arg0, false);
                int var5 = var4.field643;
                if (~var5 == -2) {
                    arg2.field5233 = 1;
                    arg2.field5176 = 0;
                    arg2.field5225 = 0;
                    arg2.field5177 = arg3;
                    arg2.field5180 = 0;
                    class284.method1729(arg2.field6239, arg2.field5176, 111, arg2.field6220, arg2.field6241, var4, false);
                }
                if (var5 == 2) {
                    arg2.field5225 = 0;
                }
            } else if (~arg0 == 0 || ~arg2.field5191 == 0 || ~class403.field5429.method1962(arg0, false).field648 <= ~class403.field5429.method1962(arg2.field5191, false).field648) {
                arg2.field5233 = 1;
                arg2.field5225 = 0;
                arg2.field5176 = 0;
                arg2.field5180 = 0;
                arg2.field5177 = arg3;
                arg2.field5191 = arg0;
                arg2.field5252 = arg2.field5244;
                if (~arg2.field5191 != 0) {
                    class284.method1729(arg2.field6239, arg2.field5176, 122, arg2.field6220, arg2.field6241, class403.field5429.method1962(arg2.field5191, false), false);
                }
            }
            ++field7566;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)Z", line = 363)
    public final boolean method264(byte arg0) {
        if (arg0 < 45) {
            return true;
        } else {
            ++field7562;
            return true;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(JZ)Ljava/lang/String;", line = 374)
    public static final String method3061(long arg0, boolean arg1) {
        ++field7556;
        if (arg0 > 0L && ~arg0 > -6582952005840035282L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else if (!arg1) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg0;
                while (~var4 != -1L) {
                    var4 /= 37L;
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (~arg0 != -1L) {
                    long var7 = arg0;
                    arg0 /= 37L;
                    var6.append(class351.field4494[(int) (-(arg0 * 37L) + var7)]);
                }
                return var6.reverse().toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZZ)V", line = 415)
    public final void method270(boolean arg0, boolean arg1) {
        if (this.field7555 != null && arg1) {
            if (!this.field7560) {
                super.field6964.method2741((byte) -38, 2);
                super.field6964.method2771(super.field6964.field6746, -16785);
                super.field6964.method2741((byte) -38, 0);
            }
            this.field7555.method1190((byte) 91, '\u0000');
            this.field7557 = true;
        } else {
            super.field6964.method2775(770, 34168, 0, 86);
        }
        if (arg0) {
            ++field7553;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V", line = 441)
    public static final void method3062(int arg0, int arg1) {
        ++field7564;
        if (arg0 == 13665) {
            class436 var2 = class459.method2712(12, arg1, -1759243680);
            var2.method2567(16013);
        }
    }
}
