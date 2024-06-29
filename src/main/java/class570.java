import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class570 extends class657 {

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Lbb;")
    private class351 field8439;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Lu;")
    private class81 field8432;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8444 = new String[] { method4264(method4263("2-!\u000b\u0014")), method4264(method4263("2-!\u000f\u0014")), method4264(method4263("2-!\n\u0014")), method4264(method4263("2-!\f\u0014")), method4264(method4263("'g!`A")), method4264(method4263("2<c\"")), method4264(method4263("2-!\u0006\u0014")), method4264(method4263("2-!rU2 {p\u0014")), method4264(method4263("2-!\t\u0014")), method4264(method4263("2-!\u0007\u0014")), method4264(method4263("2-!\b\u0014")), method4264(method4263("2-!\r\u0014")) };

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field8433;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field8434;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field8435;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field8436;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field8437;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field8440;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field8441;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field8442;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Lbia;")
    private class524 field8438;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public final void method1(int arg0) {
        try {
            this.field8438.method3971(arg0, '\u0001');
            ++field8433;
            if (super.field9490.field2905 > 0) {
                super.field9490.method1716(33984, 1);
                super.field9490.method1733((class517) null, 17237);
                super.field9490.method1675(1.0F, -104, 0.0F);
                super.field9490.method1716(33984, 0);
            }
            super.field9490.method1684((byte) -61, 8448, 8448);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8444[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V")
    public static final void method4260(int arg0, int arg1) {
        try {
            ++field8435;
            class753 var2 = (class753) class195.field2615.method977((long) arg0, 1);
            if (var2 != null) {
                var2.field10956 = !var2.field10956;
                var2.field10955.method922(arg1 ^ 25526, var2.field10956);
            }
            if (arg1 != -28942) {
                method4261(-87, (byte) -5, (class344) null);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8444[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)V")
    public final void method3(boolean arg0, int arg1) {
        try {
            if (super.field9490.field2905 > 0) {
                float var3 = -0.5F / (float) super.field9490.field2905;
                super.field9490.method1716(arg1 ^ 33985, 1);
                class747.field10866[1] = 0.0F;
                class747.field10866[0] = 0.0F;
                class747.field10866[3] = super.field9490.field2993 * var3 + 0.25F;
                class747.field10866[2] = var3;
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glTexGenfv(8192, 9474, class747.field10866, 0);
                OpenGL.glPopMatrix();
                super.field9490.method1675(0.5F, arg1 ^ -99, (float) super.field9490.field2905);
                super.field9490.method1733(this.field8432, 17237);
                super.field9490.method1716(33984, 0);
            }
            ++field8436;
            this.field8438.method3971(0, '\u0000');
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(0.25F, 0.25F, (float) arg1);
            OpenGL.glMatrixMode(5888);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8444[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BZ)V")
    public final void method6(byte arg0, boolean arg1) {
        try {
            super.field9490.method1684((byte) -61, 8448, 260);
            ++field8437;
            if (arg0 != 38) {
                this.method3(false, -111);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8444[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        try {
            ++field8442;
            int var2 = -46 / ((arg0 - -17) / 42);
            return true;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8444[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZ)V")
    public final void method7(int arg0, int arg1, boolean arg2) {
        try {
            if (!arg2) {
                method4260(49, -35);
            }
            if (~(arg1 & 1) == -2) {
                if (this.field8439.field5415) {
                    super.field9490.method1733(this.field8439.field5421, 17237);
                    class747.field10866[1] = 0.0F;
                    class747.field10866[2] = 0.0F;
                    class747.field10866[3] = (float) (super.field9490.field2853 % 4000) / 4000.0F;
                    class747.field10866[0] = 0.0F;
                    OpenGL.glTexGenfv(8194, 9473, class747.field10866, 0);
                } else {
                    int var4 = super.field9490.field2853 % 4000 * 16 / 4000;
                    super.field9490.method1733(this.field8439.field5423[var4], 17237);
                }
            } else if (this.field8439.field5415) {
                super.field9490.method1733(this.field8439.field5421, 17237);
                class747.field10866[1] = 0.0F;
                class747.field10866[3] = 0.0F;
                class747.field10866[0] = 0.0F;
                class747.field10866[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class747.field10866, 0);
            } else {
                super.field9490.method1733(this.field8439.field5423[0], 17237);
            }
            ++field8441;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8444[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lffa;Lbb;)V")
    public class570(class197 arg0, class351 arg1) {
        super(arg0);
        try {
            this.field8439 = arg1;
            this.method4262((byte) -66);
            this.field8432 = new class81(super.field9490, 6406, 2, new byte[] { 0, -1 }, 6406);
            this.field8432.method703(false, false);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8444[7] + (arg0 != null ? field8444[4] : field8444[5]) + ',' + (arg1 != null ? field8444[4] : field8444[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBLhs;)V")
    public static final void method4261(int arg0, byte arg1, class344 arg2) {
        try {
            ++field8440;
            if (~class86.field958 > -51) {
                if (arg2 != null && arg2.field5339 != null && arg0 < arg2.field5339.length && arg2.field5339[arg0] != null) {
                    int var3 = arg2.field5339[arg0][0];
                    int var4 = var3 >> 8;
                    int var5 = (236 & var3) >> 5;
                    if (arg1 != 121) {
                        method4260(-35, -22);
                    }
                    if (~arg2.field5339[arg0].length < -2) {
                        int var6 = (int) ((double) arg2.field5339[arg0].length * Math.random());
                        if (var6 > 0) {
                            var4 = arg2.field5339[arg0][var6];
                        }
                    }
                    int var7 = 256;
                    if (arg2.field5356 != null && arg2.field5351 != null) {
                        var7 = class218.method1905((byte) 94, arg2.field5351[arg0], arg2.field5356[arg0]);
                    }
                    if (!arg2.field5360) {
                        class655.method4802(0, var7, var5, 255, var4, (byte) -95);
                    } else {
                        class603.method4474(255, 0, var4, var7, (byte) -123, var5, false);
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field8444[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8444[4] : field8444[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBLmw;)V")
    public final void method4(int arg0, byte arg1, class517 arg2) {
        try {
            if (arg1 <= 117) {
                this.field8432 = null;
            }
            ++field8443;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8444[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8444[4] : field8444[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
    private final void method4262(byte arg0) {
        try {
            ++field8434;
            this.field8438 = new class524(super.field9490, 2);
            this.field8438.method3972(0, (byte) -81);
            super.field9490.method1716(33984, 1);
            super.field9490.method1684((byte) -61, 260, 7681);
            super.field9490.method1739(34168, 0, (byte) 19, 768);
            OpenGL.glTexGeni(8192, 9472, 9216);
            OpenGL.glEnable(3168);
            super.field9490.method1716(33984, 0);
            OpenGL.glTexEnvf(8960, 34163, 2.0F);
            if (this.field8439.field5415) {
                OpenGL.glTexGeni(8194, 9472, 9217);
                OpenGL.glTexGeni(8195, 9472, 9217);
                OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
                OpenGL.glEnable(3170);
                OpenGL.glEnable(3171);
            }
            this.field8438.method3973(125);
            this.field8438.method3972(1, (byte) -128);
            if (arg0 > -39) {
                this.field8438 = null;
            }
            super.field9490.method1716(33984, 1);
            super.field9490.method1684((byte) -61, 8448, 8448);
            super.field9490.method1739(5890, 0, (byte) 19, 768);
            OpenGL.glDisable(3168);
            super.field9490.method1716(33984, 0);
            OpenGL.glTexEnvf(8960, 34163, 1.0F);
            if (this.field8439.field5415) {
                OpenGL.glDisable(3170);
                OpenGL.glDisable(3171);
            }
            this.field8438.method3973(-93);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8444[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4263(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 60);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4264(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 92;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 15;
                    break;
                case 3:
                    var10005 = 78;
                    break;
                default:
                    var10005 = 60;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
