import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class657 {

    @OriginalMember(owner = "client!us", name = "n", descriptor = "Lbb;")
    private class351 field8;

    @OriginalMember(owner = "client!us", name = "l", descriptor = "Lbia;")
    private class524 field3;

    @OriginalMember(owner = "client!us", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field12 = new String[] { method10(method9("I\u0006oD ")), method10(method9("G[o(u")), method10(method9("R\u0000-j")), method10(method9("I\u0006o:aR\u001c58 ")), method10(method9("I\u0006oN ")), method10(method9("I\u0006oB ")), method10(method9("I\u0006oC ")), method10(method9("I\u0006oA ")), method10(method9("I\u0006oG ")), method10(method9("I\u0006oE ")), method10(method9("I\u0006o@ ")) };

    @OriginalMember(owner = "client!us", name = "j", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "o", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!us", name = "t", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "m", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!us", name = "p", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!us", name = "s", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!us", name = "r", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!us", name = "q", descriptor = "[I")
    public static int[] field5;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V", line = 5)
    public final void method1(int arg0) {
        try {
            this.field3.method3971(arg0 ^ arg0, '\u0001');
            ++field1;
            super.field9490.method1716(33984, 1);
            super.field9490.method1733((class517) null, 17237);
            super.field9490.method1716(33984, 0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field12[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(I)V", line = 16)
    public static void method2(int arg0) {
        try {
            if (arg0 != 1) {
                field11 = -51;
            }
            field5 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field12[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI)V", line = 27)
    public final void method3(boolean arg0, int arg1) {
        try {
            this.field3.method3971(0, '\u0000');
            ++field10;
            if (arg1 == 1) {
                if (this.field8.field5415) {
                    super.field9490.method1716(arg1 + 33983, 1);
                    super.field9490.method1733(this.field8.field5425, 17237);
                    super.field9490.method1716(33984, 0);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field12[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lffa;Lbb;)V", line = 47)
    public class1(class197 arg0, class351 arg1) {
        super(arg0);
        try {
            this.field8 = arg1;
            this.field3 = new class524(arg0, 2);
            this.field3.method3972(0, (byte) -87);
            super.field9490.method1716(33984, 1);
            if (this.field8.field5415) {
                OpenGL.glTexGeni(8194, 9472, 9217);
                OpenGL.glEnable(3170);
            }
            OpenGL.glTexGeni(8192, 9472, 9216);
            OpenGL.glTexGeni(8193, 9472, 9216);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            super.field9490.method1716(33984, 0);
            this.field3.method3973(124);
            this.field3.method3972(1, (byte) -98);
            super.field9490.method1716(33984, 1);
            if (this.field8.field5415) {
                OpenGL.glDisable(3170);
            }
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            super.field9490.method1716(33984, 0);
            this.field3.method3973(-70);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field12[3] + (arg0 != null ? field12[1] : field12[2]) + ',' + (arg1 != null ? field12[1] : field12[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IBLmw;)V", line = 79)
    public final void method4(int arg0, byte arg1, class517 arg2) {
        try {
            ++field6;
            super.field9490.method1733(arg2, 17237);
            if (arg1 < 117) {
                this.field8 = null;
            }
            super.field9490.method1753(0, arg0);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field12[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field12[1] : field12[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(I)V", line = 92)
    public static final void method5(int arg0) {
        try {
            class108.method949((byte) 126);
            if (arg0 <= 17) {
                field5 = null;
            }
            ++field2;
            class216.field3297 = false;
            class728.method5312(class476.field6905, class387.field5849, class668.field9704, (byte) 112, class371.field5655);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field12[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BZ)V", line = 106)
    public final void method6(byte arg0, boolean arg1) {
        try {
            ++field4;
            if (arg0 != 38) {
                this.method7(64, 53, false);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field12[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIZ)V", line = 116)
    public final void method7(int arg0, int arg1, boolean arg2) {
        try {
            ++field9;
            float var4 = (float) ((arg1 & 3) + 1) * -5.0E-4F;
            float var5 = (float) ((arg1 >> 3 & 3) - -1) * 5.0E-4F;
            float var6 = (arg1 & 64) == 0 ? 4.8828125E-4F : 9.765625E-4F;
            super.field9490.method1716(33984, 1);
            if (arg2) {
                boolean var7 = (128 & arg1) != 0;
                if (var7) {
                    class538.field7901[1] = 0.0F;
                    class538.field7901[0] = var6;
                    class538.field7901[2] = 0.0F;
                    class538.field7901[3] = 0.0F;
                } else {
                    class538.field7901[3] = 0.0F;
                    class538.field7901[1] = 0.0F;
                    class538.field7901[0] = 0.0F;
                    class538.field7901[2] = var6;
                }
                OpenGL.glTexGenfv(8192, 9474, class538.field7901, 0);
                class538.field7901[3] = (float) super.field9490.field2853 * var4 % 1.0F;
                class538.field7901[1] = var6;
                class538.field7901[2] = 0.0F;
                class538.field7901[0] = 0.0F;
                OpenGL.glTexGenfv(8193, 9474, class538.field7901, 0);
                if (this.field8.field5415) {
                    class538.field7901[1] = 0.0F;
                    class538.field7901[3] = (float) super.field9490.field2853 * var5 % 1.0F;
                    class538.field7901[2] = 0.0F;
                    class538.field7901[0] = 0.0F;
                    OpenGL.glTexGenfv(8194, 9473, class538.field7901, 0);
                } else {
                    int var8 = (int) ((float) super.field9490.field2853 * var5 * 16.0F);
                    super.field9490.method1733(this.field8.field5417[var8 % 16], 17237);
                }
                super.field9490.method1716(33984, 0);
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field12[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)Z", line = 172)
    public final boolean method8(int arg0) {
        try {
            ++field7;
            int var2 = -35 % ((arg0 - -17) / 42);
            return true;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field12[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!us", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method9(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 8);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!us", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method10(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 60;
                    break;
                case 1:
                    var10005 = 117;
                    break;
                case 2:
                    var10005 = 65;
                    break;
                case 3:
                    var10005 = 6;
                    break;
                default:
                    var10005 = 8;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
