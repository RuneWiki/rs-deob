import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class88 extends class328 implements class191 {

    @OriginalMember(owner = "client!jv", name = "K", descriptor = "I")
    private int field994;

    @OriginalMember(owner = "client!jv", name = "I", descriptor = "I")
    private int field1000;

    @OriginalMember(owner = "client!jv", name = "L", descriptor = "[Ljava/lang/String;")
    private static final String[] field1003 = new String[] { method753(method752("\f5k\u007fJ\b*1}\u000b")), method753(method752("\u001dmkm^")), method753(method752("\b6)/")), method753(method752("\f5k\u0000\u000b")), method753(method752("\f5k\u000b\u000b")), method753(method752("\f5k\u0001\u000b")), method753(method752("\f5k\u0014\u000b")), method753(method752("\f5k\n\u000b")), method753(method752("\f5k\u0006\u000b")), method753(method752("\f5k\u0002\u000b")), method753(method752("\f5k\u0005\u000b")), method753(method752("\f5k\u0015\u000b")), method753(method752("\f5k\u0004\u000b")), method753(method752("\f5k\u0007\u000b")), method753(method752("\f5k\u0016\u000b")) };

    @OriginalMember(owner = "client!jv", name = "F", descriptor = "Lel;")
    public static class573 field996 = new class573(129, -1);

    @OriginalMember(owner = "client!jv", name = "A", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!jv", name = "x", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!jv", name = "y", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!jv", name = "J", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!jv", name = "v", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!jv", name = "w", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!jv", name = "B", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!jv", name = "D", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!jv", name = "C", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!jv", name = "G", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!jv", name = "E", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!jv", name = "u", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!jv", name = "H", descriptor = "[I")
    public static int[] field993;

    @OriginalMember(owner = "client!jv", name = "z", descriptor = "[I")
    public static int[] field997;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BF)F", line = 3)
    public final float method740(byte arg0, float arg1) {
        try {
            if (arg0 >= -32) {
                return 1.1820103F;
            } else {
                ++field999;
                return arg1 / (float) this.field994;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1003[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lrda;Leu;IIZ[FII)V", line = 15)
    public class88(class690 arg0, class505 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class157.field1956, arg2 * arg3, arg4);
        try {
            this.field994 = arg2;
            this.field1000 = arg3;
            super.field5165.method2467(12, this);
            if (!arg4 && ~arg7 == -1 && arg6 == 0) {
                this.method2770(arg3, arg5, 89, super.field5167, arg2);
            } else {
                OpenGL.glPixelStorei(3314, arg7);
                OpenGL.glTexImage2Df(super.field5167, 0, this.method2773(-121), arg2, arg3, 0, class311.method2626((byte) -117, super.field5179), 5126, arg5, arg6 * 4);
                OpenGL.glPixelStorei(3314, 0);
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field1003[0] + (arg0 != null ? field1003[1] : field1003[2]) + ',' + (arg1 != null ? field1003[1] : field1003[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1003[1] : field1003[2]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(II[FILeu;IIII)V", line = 36)
    public final void method741(int arg0, int arg1, float[] arg2, int arg3, class505 arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            super.field5165.method2467(12, this);
            ++field998;
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexSubImage2Df(super.field5167, 0, arg5, arg3, arg1, arg8, class311.method2626((byte) -117, arg4), 5121, arg2, arg0);
            if (arg6 != 1) {
                this.field1000 = -10;
            }
            OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field1003[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1003[1] : field1003[2]) + ',' + arg3 + ',' + (arg4 != null ? field1003[1] : field1003[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I[BIIIIILeu;I)V", line = 51)
    public final void method742(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class505 arg7, int arg8) {
        try {
            ++field987;
            super.field5165.method2467(12, this);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glPixelStorei(3314, arg0);
            if (arg6 != 9588) {
                this.method742(-89, (byte[]) null, 62, -61, -95, 114, 121, (class505) null, 106);
            }
            OpenGL.glTexSubImage2Dub(super.field5167, 0, arg4, arg5, arg3, arg2, class311.method2626((byte) -117, arg7), 5121, arg1, arg8);
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field1003[8] + arg0 + ',' + (arg1 != null ? field1003[1] : field1003[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field1003[1] : field1003[2]) + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)I", line = 68)
    public final int method743(byte arg0) {
        try {
            if (arg0 != -101) {
                this.method748(-34, 0.08886457F);
            }
            ++field995;
            return this.field994;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1003[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "(I)V", line = 83)
    public static void method744(int arg0) {
        try {
            if (arg0 == 31524) {
                field996 = null;
                field997 = null;
                field993 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1003[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lla;ILha;)V", line = 95)
    public static final void method745(class476 arg0, int arg1, class66 arg2) {
        try {
            ++field990;
            class481[] var3 = class481.method3673(arg0, class766.field11074, 0);
            class110.field1283 = new class581[var3.length];
            for (int var4 = 0; ~var3.length < ~var4; ++var4) {
                class110.field1283[var4] = arg2.method487(var3[var4], true);
            }
            class481[] var5 = class481.method3673(arg0, class412.field6085, 0);
            class783.field11415 = new class581[var5.length];
            for (int var6 = 0; ~var5.length < ~var6; ++var6) {
                class783.field11415[var6] = arg2.method487(var5[var6], true);
            }
            class481[] var7 = class481.method3673(arg0, class90.field1033, 0);
            class744.field10821 = new class581[var7.length];
            for (int var8 = 0; var7.length > var8; ++var8) {
                class744.field10821[var8] = arg2.method487(var7[var8], true);
            }
            class481[] var9 = class481.method3673(arg0, class194.field2604, 0);
            class91.field1039 = new class581[var9.length];
            for (int var10 = 0; ~var9.length < ~var10; ++var10) {
                class91.field1039[var10] = arg2.method487(var9[var10], true);
            }
            class481[] var11 = class481.method3673(arg0, class397.field5934, 0);
            class125.field1469 = new class581[var11.length];
            for (int var12 = 0; ~var12 > ~var11.length; ++var12) {
                class125.field1469[var12] = arg2.method487(var11[var12], true);
            }
            class481[] var13 = class481.method3673(arg0, class252.field3902, 0);
            class715.field10345 = new class581[var13.length];
            for (int var14 = arg1; ~var13.length < ~var14; ++var14) {
                class715.field10345[var14] = arg2.method487(var13[var14], true);
            }
            class481[] var15 = class481.method3673(arg0, class399.field5953, 0);
            class704.field10229 = new class581[var15.length];
            for (int var16 = 0; var16 < var15.length; ++var16) {
                class704.field10229[var16] = arg2.method487(var15[var16], true);
            }
            class481[] var17 = class481.method3673(arg0, class562.field8356, 0);
            class451.field6615 = new class581[var17.length];
            for (int var18 = 0; ~var18 > ~var17.length; ++var18) {
                class451.field6615[var18] = arg2.method487(var17[var18], true);
            }
            class481[] var19 = class481.method3673(arg0, class243.field3732, 0);
            class774.field11246 = new class581[var19.length];
            for (int var20 = 0; ~var19.length < ~var20; ++var20) {
                class774.field11246[var20] = arg2.method487(var19[var20], true);
            }
            class481[] var21 = class481.method3673(arg0, class680.field9861, 0);
            class50.field575 = new class581[var21.length];
            for (int var22 = 0; var22 < var21.length; ++var22) {
                class50.field575[var22] = arg2.method487(var21[var22], true);
            }
            class481[] var23 = class481.method3673(arg0, class433.field6366, 0);
            class71.field781 = new class581[var23.length];
            for (int var24 = 0; var23.length > var24; ++var24) {
                class71.field781[var24] = arg2.method487(var23[var24], true);
            }
            class481[] var25 = class481.method3673(arg0, class331.field5198, 0);
            class208.field3193 = new class581[var25.length];
            for (int var26 = 0; ~var25.length < ~var26; ++var26) {
                class208.field3193[var26] = arg2.method487(var25[var26], true);
            }
            class770.field11183 = arg2.method487(class481.method3675(arg0, class433.field6360, 0), true);
            class604.field8852 = arg2.method487(class481.method3675(arg0, class627.field9188, 0), true);
            class481[] var27 = class481.method3673(arg0, class280.field4196, 0);
            class242.field3681 = new class581[var27.length];
            for (int var28 = 0; var27.length > var28; ++var28) {
                class242.field3681[var28] = arg2.method487(var27[var28], true);
            }
        } catch (RuntimeException var30) {
            throw class759.method5498(var30, field1003[14] + (arg0 != null ? field1003[1] : field1003[2]) + ',' + arg1 + ',' + (arg2 != null ? field1003[1] : field1003[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "([IIBIIIII)V", line = 222)
    public final void method746(int[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            super.field5165.method2467(arg2 ^ -98, this);
            ++field986;
            OpenGL.glPixelStorei(3314, arg3);
            if (arg2 != -110) {
                this.field994 = 45;
            }
            OpenGL.glTexSubImage2Di(super.field5167, 0, arg4, arg5, arg6, arg7, 32993, super.field5165.field10112, arg0, arg1);
            OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field1003[7] + (arg0 != null ? field1003[1] : field1003[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lrda;Leu;IIZ[BII)V", line = 236)
    public class88(class690 arg0, class505 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class157.field1952, arg2 * arg3, arg4);
        try {
            this.field994 = arg2;
            this.field1000 = arg3;
            super.field5165.method2467(12, this);
            OpenGL.glPixelStorei(3317, 1);
            if (arg4 && ~arg7 == -1 && ~arg6 == -1) {
                this.method2780(arg5, super.field5167, arg3, (byte) 106, arg2);
            } else {
                OpenGL.glPixelStorei(3314, arg7);
                OpenGL.glTexImage2Dub(super.field5167, 0, this.method2773(-120), arg2, arg3, 0, class311.method2626((byte) -117, super.field5179), 5121, arg5, arg6);
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field1003[0] + (arg0 != null ? field1003[1] : field1003[2]) + ',' + (arg1 != null ? field1003[1] : field1003[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1003[1] : field1003[2]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)I", line = 258)
    public final int method747(byte arg0) {
        try {
            if (arg0 != -120) {
                field1002 = -46;
            }
            ++field1001;
            return this.field1000;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1003[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lrda;Leu;Lpj;II)V", line = 269)
    public class88(class690 arg0, class505 arg1, class157 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        try {
            this.field994 = arg3;
            this.field1000 = arg4;
            super.field5165.method2467(12, this);
            OpenGL.glTexImage2Dub(super.field5167, 0, this.method2773(-90), arg3, arg4, 0, class311.method2626((byte) -117, super.field5179), class694.method5071(super.field5162, -82), (byte[]) null, 0);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field1003[0] + (arg0 != null ? field1003[1] : field1003[2]) + ',' + (arg1 != null ? field1003[1] : field1003[2]) + ',' + (arg2 != null ? field1003[1] : field1003[2]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IF)F", line = 280)
    public final float method748(int arg0, float arg1) {
        try {
            ++field992;
            if (arg0 != -19847) {
                this.method748(42, 0.5637216F);
            }
            return arg1 / (float) this.field1000;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1003[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)Z", line = 291)
    public final boolean method749(int arg0) {
        try {
            ++field989;
            if (arg0 <= 3) {
                this.method743((byte) 107);
            }
            return true;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1003[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "([IIIIIII)V", line = 303)
    public final void method750(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field991;
            int[] var8 = new int[this.field994 * this.field1000];
            super.field5165.method2467(12, this);
            if (arg4 != -2946) {
                field997 = null;
            }
            OpenGL.glGetTexImagei(super.field5167, 0, 32993, 5121, var8, 0);
            for (int var9 = 0; ~var9 > ~arg2; ++var9) {
                class467.method3553(var8, (arg1 - (-arg2 + var9 + 1)) * this.field994, arg0, arg6 * var9 + arg5, arg6);
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field1003[3] + (arg0 != null ? field1003[1] : field1003[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lrda;IIZ[III)V", line = 328)
    public class88(class690 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class215.field3276, class157.field1952, arg1 * arg2, arg3);
        try {
            this.field994 = arg1;
            this.field1000 = arg2;
            super.field5165.method2467(12, this);
            if (arg3 && ~arg6 == -1 && arg5 == 0) {
                this.method2775(arg4, super.field5167, (byte) -5, arg2, arg1);
            } else {
                OpenGL.glPixelStorei(3314, arg6);
                OpenGL.glTexImage2Di(super.field5167, 0, 6408, this.field994, this.field1000, 0, 32993, super.field5165.field10112, arg4, arg5 * 4);
                OpenGL.glPixelStorei(3314, 0);
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field1003[0] + (arg0 != null ? field1003[1] : field1003[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1003[1] : field1003[2]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZIZ)V", line = 354)
    public final void method751(boolean arg0, int arg1, boolean arg2) {
        try {
            super.field5165.method2467(12, this);
            ++field988;
            OpenGL.glTexParameteri(super.field5167, 10242, arg0 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field5167, 10243, arg2 ? 10497 : 33071);
            if (arg1 < 27) {
                method745((class476) null, -118, (class66) null);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1003[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method752(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method753(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 102;
                    break;
                case 1:
                    var10005 = 67;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 67;
                    break;
                default:
                    var10005 = 35;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
