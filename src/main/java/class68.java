import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class68 extends class509 {

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "Lmm;")
    private class19 field1077;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "Lgw;")
    private class108 field1087;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "[I")
    public static int[] field1082 = new int[14];

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "Lpn;")
    public static class49 field1084 = new class49(45, 4);

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "F")
    public static float field1088;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BZ)V", line = 3)
    public final void method128(byte arg0, boolean arg1) {
        if (arg0 >= 44) {
            ++field1075;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIZ)V", line = 14)
    public final void method123(int arg0, int arg1, boolean arg2) {
        ++field1086;
        float var4 = (float) ((3 & arg1) + 1) * -5.0E-4F;
        float var5 = (float) (((arg1 & 24) >> 3) + 1) * 5.0E-4F;
        float var6 = ~(arg1 & 64) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = ~(128 & arg1) != -1;
        super.field7409.method1756(1, -121);
        if (arg2) {
            field1088 = -0.26833758F;
        }
        if (!var7) {
            class184.field2822[0] = 0.0F;
            class184.field2822[1] = 0.0F;
            class184.field2822[3] = 0.0F;
            class184.field2822[2] = var6;
        } else {
            class184.field2822[3] = 0.0F;
            class184.field2822[2] = 0.0F;
            class184.field2822[1] = 0.0F;
            class184.field2822[0] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class184.field2822, 0);
        class184.field2822[0] = 0.0F;
        class184.field2822[2] = 0.0F;
        class184.field2822[3] = (float) super.field7409.field3927 * var4 % 1.0F;
        class184.field2822[1] = var6;
        OpenGL.glTexGenfv(8193, 9474, class184.field2822, 0);
        if (!this.field1077.field212) {
            int var8 = (int) ((float) super.field7409.field3927 * var5 * 16.0F);
            super.field7409.method1749(25752, this.field1077.field215[var8 % 16]);
        } else {
            class184.field2822[1] = 0.0F;
            class184.field2822[2] = 0.0F;
            class184.field2822[0] = 0.0F;
            class184.field2822[3] = (float) super.field7409.field3927 * var5 % 1.0F;
            OpenGL.glTexGenfv(8194, 9473, class184.field2822, 0);
        }
        super.field7409.method1756(0, 99);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BILin;)V", line = 70)
    public final void method125(byte arg0, int arg1, class169 arg2) {
        if (arg0 < 9) {
            method493((class161) null, 89);
        }
        ++field1081;
        super.field7409.method1749(25752, arg2);
        super.field7409.method1734(-87, arg1);
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)V", line = 87)
    public static void method490(int arg0) {
        field1082 = null;
        field1084 = null;
        if (arg0 <= 98) {
            field1084 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lgk;ILgk;)V", line = 99)
    public static final void method491(class472 arg0, int arg1, class472 arg2) {
        ++field1078;
        if (arg2.field6921 != null) {
            arg2.method2859(-128);
        }
        arg2.field6924 = arg0.field6924;
        arg2.field6921 = arg0;
        int var3 = -126 % ((arg1 - 9) / 57);
        arg2.field6921.field6924 = arg2;
        arg2.field6924.field6921 = arg2;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BIIIILza;)V", line = 115)
    public static final void method492(byte arg0, int arg1, int arg2, int arg3, int arg4, class299 arg5) {
        arg5.method571(arg4, arg2, arg1 + arg4, arg2 - -arg3);
        ++field1085;
        arg5.method1991(arg2, -16777216, arg1, arg3, 70, arg4);
        if (~class307.field4698 <= -101) {
            float var6 = (float) class362.field5349 / (float) class362.field5357;
            int var7 = 108 % ((59 - arg0) / 32);
            int var8 = arg1;
            int var9 = arg3;
            if (var6 < 1.0F) {
                var9 = (int) ((float) arg1 * var6);
            } else {
                var8 = (int) ((float) arg3 / var6);
            }
            int var10 = (-var9 + arg3) / 2 + arg2;
            int var11 = (-var8 + arg1) / 2 + arg4;
            if (class328.field4958 == null || class328.field4958.method398() != arg1 || class328.field4958.method399() != arg3) {
                class362.method2301(class362.field5350, class362.field5349 + class362.field5345, class362.field5357 + class362.field5350, class362.field5345, var11, var10, var8 + var11, var10 - -var9);
                class362.method2305(arg5);
                class328.field4958 = arg5.method601(var11, var10, var8, var9, false);
            }
            class328.field4958.method2316(var11, var10);
            int var12 = class374.field5533 * var8 / class362.field5357;
            int var13 = class63.field1000 * var9 / class362.field5349;
            int var14 = class455.field6764 * var8 / class362.field5357 + var11;
            int var15 = -(class23.field271 * var9 / class362.field5349) + var10 - (-var9 - -var13);
            int var16 = -1996554240;
            if (class401.field5923 == class268.field4258) {
                var16 = -1996488705;
            }
            arg5.method506(var14, var15, var12, var13, var16, 1);
            arg5.method602(var14, var15, var12, var13, var16, 0);
            if (class178.field2722 > 0) {
                int var17;
                if (class287.field4472 > 50) {
                    var17 = -(class287.field4472 * 5) + 500;
                } else {
                    var17 = class287.field4472 * 5;
                }
                for (class53 var18 = (class53) class362.field5333.method295((byte) -3); var18 != null; var18 = (class53) class362.field5333.method296(true)) {
                    class30 var19 = class362.field5329.method2182(var18.field824, (byte) -42);
                    if (class142.method1021(false, var19)) {
                        if (~class53.field810 != ~var18.field824) {
                            if (~class237.field3569 != 0 && class237.field3569 == var19.field368) {
                                int var20 = var18.field816 * var8 / class362.field5357 + var11;
                                int var21 = (-var18.field809 + class362.field5349) * var9 / class362.field5349 + var10;
                                arg5.method1991(var21 - 2, 16776960 | var17 << 24, 4, 4, 62, var20 - 2);
                            }
                        } else {
                            int var22 = var18.field816 * var8 / class362.field5357 + var11;
                            int var23 = (-var18.field809 + class362.field5349) * var9 / class362.field5349 + var10;
                            arg5.method1991(var23 + -2, 16776960 | var17 << 24, 4, 4, 43, var22 + -2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)Z", line = 218)
    public final boolean method124(int arg0) {
        ++field1083;
        if (arg0 != -32170) {
            this.method128((byte) -89, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Ltt;Lmm;)V", line = 229)
    public class68(class249 arg0, class19 arg1) {
        super(arg0);
        this.field1077 = arg1;
        this.field1087 = new class108(arg0, 2);
        this.field1087.method848(0, true);
        super.field7409.method1756(1, -87);
        if (this.field1077.field212) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field7409.method1756(0, 99);
        this.field1087.method851(92);
        this.field1087.method848(1, true);
        super.field7409.method1756(1, 114);
        if (this.field1077.field212) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field7409.method1756(0, -117);
        this.field1087.method851(84);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lbs;I)Z", line = 262)
    public static final boolean method493(class161 arg0, int arg1) {
        ++field1079;
        class395 var2 = class247.field3693.method2281(arg0.method99((byte) -107), arg1 ^ 9379);
        if (var2.field5814 == arg1) {
            return true;
        } else {
            class444 var3 = class384.field5647.method769(var2.field5814, arg1 ^ -35);
            return ~var3.field6605 == 0 ? true : var3.method2739(false);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V", line = 286)
    public final void method121(byte arg0) {
        this.field1087.method850(false, '\u0001');
        ++field1080;
        super.field7409.method1756(1, arg0 + -120);
        super.field7409.method1749(arg0 ^ 25790, (class169) null);
        super.field7409.method1756(0, 120);
        if (arg0 != 38) {
            field1082 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)V", line = 300)
    public final void method122(boolean arg0, int arg1) {
        this.field1087.method850(false, '\u0000');
        if (arg1 != 64) {
            field1084 = null;
        }
        ++field1076;
        if (this.field1077.field212) {
            super.field7409.method1756(1, -28);
            super.field7409.method1749(25752, this.field1077.field211);
            super.field7409.method1756(0, -29);
        }
    }
}
