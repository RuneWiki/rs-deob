import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class282 {

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "I")
    public int field4252 = -1;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "[Lrk;")
    public static class30[] field4236 = new class30[14];

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field4237 = 0;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "Ldg;")
    public static class376 field4242 = new class376(2, -1);

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Lr;")
    public static class166 field4228;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "Lkea;")
    private class213 field4240;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Ljava/lang/String;")
    private String field4231;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "Ljava/lang/String;")
    private String field4232;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "[I")
    private int[] field4227;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[I")
    private int[] field4233;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "[I")
    private int[] field4239;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "[I")
    private int[] field4241;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "[I")
    private int[] field4243;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "[I")
    private int[] field4245;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "[I")
    private int[] field4246;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "[I")
    private int[] field4251;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "[Ljava/lang/String;")
    private String[] field4238;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "[Ljava/lang/String;")
    private String[] field4244;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "[[I")
    private int[][] field4230;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "[[I")
    private int[][] field4247;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "[[I")
    private int[][] field4250;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II[[[BIILr;IIIIIII)V", line = 4)
    public static final void method1825(int arg0, int arg1, byte[][][] arg2, int arg3, int arg4, class166 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int var13 = -111 % ((-arg8 - 61) / 47);
        field4248++;
        if (arg3 == 0 || arg9 == 0) {
            return;
        }
        if (arg3 == 9) {
            arg11 = arg11 + 1 & 0x3;
            arg3 = 1;
        }
        if (arg3 == 10) {
            arg3 = 1;
            arg11 = arg11 + 3 & 0x3;
        }
        if (arg3 == 11) {
            arg11 = arg11 + 3 & 0x3;
            arg3 = 8;
        }
        arg5.method137(arg10, arg12, arg6, arg7, arg0, arg4, arg2[arg3 - 1][arg11], arg9, arg1);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 69)
    public final void method1826(int arg0) {
        if (arg0 == 0) {
            if (this.field4232 == null) {
                this.field4232 = this.field4231;
            }
            field4229++;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILmo;I)V", line = 84)
    private final void method1827(int arg0, class695 arg1, int arg2) {
        if (arg2 == 1) {
            this.field4231 = arg1.method3874(124);
        } else if (arg2 == 2) {
            this.field4232 = arg1.method3874(126);
        } else if (arg2 == 3) {
            int var22 = arg1.method3826(false);
            this.field4230 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field4230[var23][0] = arg1.method3847((byte) 118);
                this.field4230[var23][1] = arg1.method3880(8);
                this.field4230[var23][2] = arg1.method3880(8);
            }
        } else if (arg2 == 4) {
            int var20 = arg1.method3826(false);
            this.field4247 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field4247[var21][0] = arg1.method3847((byte) 118);
                this.field4247[var21][1] = arg1.method3880(arg0 - 5);
                this.field4247[var21][2] = arg1.method3880(8);
            }
        } else if (arg2 == 5) {
            arg1.method3847((byte) 118);
        } else if (arg2 == 6) {
            arg1.method3826(false);
        } else if (arg2 == 7) {
            arg1.method3826(false);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method3826(false);
            } else if (arg2 == 10) {
                int var4 = arg1.method3826(false);
                this.field4227 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4227[var5] = arg1.method3880(8);
                }
            } else if (arg2 == 12) {
                arg1.method3880(8);
            } else if (arg2 == 13) {
                int var18 = arg1.method3826(false);
                this.field4246 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field4246[var19] = arg1.method3847((byte) 118);
                }
            } else if (arg2 == 14) {
                int var16 = arg1.method3826(false);
                this.field4250 = new int[var16][2];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field4250[var17][0] = arg1.method3826(false);
                    this.field4250[var17][1] = arg1.method3826(false);
                }
            } else if (arg2 == 15) {
                arg1.method3847((byte) 118);
            } else if (arg2 == 17) {
                this.field4252 = arg1.method3847((byte) 118);
            } else if (arg2 == 18) {
                int var14 = arg1.method3826(false);
                this.field4244 = new String[var14];
                this.field4239 = new int[var14];
                this.field4233 = new int[var14];
                this.field4251 = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field4233[var15] = arg1.method3880(8);
                    this.field4239[var15] = arg1.method3880(class189.method1273(arg0, 5));
                    this.field4251[var15] = arg1.method3880(class189.method1273(arg0, 5));
                    this.field4244[var15] = arg1.method3836(false);
                }
            } else if (arg2 == 19) {
                int var6 = arg1.method3826(false);
                this.field4238 = new String[var6];
                this.field4243 = new int[var6];
                this.field4245 = new int[var6];
                this.field4241 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field4245[var7] = arg1.method3880(8);
                    this.field4243[var7] = arg1.method3880(8);
                    this.field4241[var7] = arg1.method3880(8);
                    this.field4238[var7] = arg1.method3836(false);
                }
            } else if (arg2 == 249) {
                int var8 = arg1.method3826(false);
                if (this.field4240 == null) {
                    int var9 = class2.method9(var8, 118);
                    this.field4240 = new class213(var9);
                }
                for (int var10 = 0; var10 < var8; var10++) {
                    boolean var11 = arg1.method3826(false) == 1;
                    int var12 = arg1.method3873(255);
                    class665 var13;
                    if (var11) {
                        var13 = new class500(arg1.method3836(false));
                    } else {
                        var13 = new class111(arg1.method3880(8));
                    }
                    this.field4240.method1403((byte) -18, var13, (long) var12);
                }
            }
        }
        if (arg0 == 13) {
            field4235++;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lmo;I)V", line = 316)
    public final void method1828(class695 arg0, int arg1) {
        field4253++;
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var3 = arg0.method3826(false);
            if (var3 == 0) {
                return;
            }
            this.method1827(13, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILvg;)V", line = 346)
    public static final void method1829(int arg0, class49 arg1) {
        int var2 = 61 % ((arg0 - 79) / 45);
        field4249++;
        class49 var3 = class224.method1483(arg1, 21964);
        int var4;
        int var5;
        if (var3 == null) {
            var5 = class487.field6930;
            var4 = class31.field494;
        } else {
            var4 = var3.field877;
            var5 = var3.field967;
        }
        class178.method1209(arg1, (byte) 1, false, var4, var5);
        class598.method3380(var4, arg1, (byte) -107, var5);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lvg;B)V", line = 386)
    public static final void method1830(class49 arg0, byte arg1) {
        field4234++;
        if (!class245.field3797) {
            return;
        }
        class103.field1613++;
        if (arg0.field959 != null) {
            class49 var2 = class639.method3557(class19.field223, class189.field2716, 1);
            if (var2 != null) {
                class14 var3 = new class14();
                var3.field122 = arg0.field959;
                var3.field127 = var2;
                var3.field129 = arg0;
                class220.method1443(var3);
            }
        }
        class135 var4 = class688.method3794(class112.field1693, class583.field8198, (byte) 38);
        var4.field1978.method3868(arg0.field977, -318419336);
        var4.field1978.method3816(arg0.field1023, -39);
        var4.field1978.method3852(false, class654.field9181);
        var4.field1978.method3879(class19.field223, 128);
        var4.field1978.method3840(false, arg0.field914);
        if (arg1 >= -76) {
            method1831(124);
        }
        var4.field1978.method3840(false, class189.field2716);
        class19.method223(var4, 0);
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V", line = 435)
    public static void method1831(int arg0) {
        int var1 = -2 % ((25 - arg0) / 33);
        field4236 = null;
        field4228 = null;
        field4242 = null;
    }
}
