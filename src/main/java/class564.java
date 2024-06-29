import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class564 extends class531 {

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "Lgo;")
    private class653 field8009;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "Lpu;")
    private class587 field8008;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "Z")
    public static boolean field8004 = false;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "Lti;")
    public static class463 field8005 = new class463();

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "Lbu;")
    public static class21 field8015 = new class21(34, -2);

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field7997;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field8001;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field8002;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field8006;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public static int field8007;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public static int field8010;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field8011;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field8013;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field8014;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "Laha;")
    public static class401 field7999;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "Loi;")
    private class78 field7998;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "Lwia;")
    public static class791 field8000;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "[Ljd;")
    public static class241[] field8003;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(ZI)V", line = 3)
    public final void method301(boolean arg0, int arg1) {
        if (super.field7676.field1580 > 0) {
            float var3 = -0.5F / (float) super.field7676.field1580;
            super.field7676.method813((byte) 103, 1);
            class286.field4212[1] = 0.0F;
            class286.field4212[0] = 0.0F;
            class286.field4212[3] = super.field7676.field1528 * var3 + 0.25F;
            class286.field4212[2] = var3;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class286.field4212, 0);
            OpenGL.glPopMatrix();
            super.field7676.method782((float) super.field7676.field1580, 0.5F, 1029);
            super.field7676.method808((byte) 34, this.field8008);
            super.field7676.method813((byte) 103, 0);
        }
        if (arg1 > -9) {
            method3328(false);
        }
        ++field8014;
        this.field7998.method606(true, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V", line = 37)
    public static void method3325(int arg0) {
        field7999 = null;
        if (arg0 < 78) {
            method3328(false);
        }
        field8015 = null;
        field8000 = null;
        field8005 = null;
        field8003 = null;
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)V", line = 51)
    private final void method3326(int arg0) {
        this.field7998 = new class78(super.field7676, 2);
        ++field8006;
        this.field7998.method607(0, false);
        super.field7676.method813((byte) 103, 1);
        super.field7676.method802(260, 11762, 7681);
        super.field7676.method789(34168, 768, 0, (byte) 47);
        OpenGL.glTexGeni(8192, arg0, 9216);
        OpenGL.glEnable(3168);
        super.field7676.method813((byte) 103, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field8009.field9123) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field7998.method608(false);
        this.field7998.method607(1, false);
        super.field7676.method813((byte) 103, 1);
        super.field7676.method802(8448, arg0 + 2290, 8448);
        super.field7676.method789(5890, 768, 0, (byte) 47);
        OpenGL.glDisable(3168);
        super.field7676.method813((byte) 103, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field8009.field9123) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field7998.method608(false);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V", line = 94)
    public final void method300(int arg0) {
        ++field7997;
        this.field7998.method606(true, '\u0001');
        if (~super.field7676.field1580 < -1) {
            super.field7676.method813((byte) 103, 1);
            super.field7676.method808((byte) 34, (class188) null);
            super.field7676.method782(0.0F, 1.0F, arg0 + 1028);
            super.field7676.method813((byte) 103, 0);
        }
        if (arg0 == 1) {
            super.field7676.method802(8448, arg0 + 11761, 8448);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lqfa;Lgo;)V", line = 119)
    public class564(class106 arg0, class653 arg1) {
        super(arg0);
        this.field8009 = arg1;
        this.method3326(9472);
        this.field8008 = new class587(super.field7676, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field8008.method3424(4, false);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIILha;BIIIIIILjga;)V", line = 134)
    public static final void method3327(int arg0, int arg1, int arg2, class65 arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class746 arg11) {
        if (~arg1 < ~arg2 && ~(arg2 + arg8) < ~arg1 && arg10 + -13 < arg6 && ~arg6 > ~(arg10 + 3) && arg11.field10336) {
            arg9 = arg7;
        }
        if (arg4 < -52) {
            ++field8011;
            int[] var12 = null;
            if (!class776.method4271(arg11.field10340, 1951)) {
                if (~arg11.field10343 != 0) {
                    var12 = class313.field4456.method1681(arg11.field10343, 127).field9642;
                } else if (class460.method2740(false, arg11.field10340)) {
                    class205 var13 = (class205) class645.field9014.method2242((long) ((int) arg11.field10333), -1);
                    if (var13 != null) {
                        class665 var14 = var13.field3181;
                        class110 var15 = var14.field9240;
                        if (var15.field1657 != null) {
                            var15 = var15.method840(class537.field7727, -123);
                        }
                        if (var15 != null) {
                            var12 = var15.field1669;
                        }
                    }
                } else if (class457.method2724(arg11.field10340, (byte) 89)) {
                    Object var16 = null;
                    class282 var17;
                    if (arg11.field10340 != 1010) {
                        var17 = class277.field4038.method3919(true, (int) (2147483647L & arg11.field10333 >>> 32));
                    } else {
                        var17 = class277.field4038.method3919(true, (int) arg11.field10333);
                    }
                    if (var17.field4117 != null) {
                        var17 = var17.method1826(class537.field7727, -118);
                    }
                    if (var17 != null) {
                        var12 = var17.field4169;
                    }
                }
            } else {
                var12 = class313.field4456.method1681((int) arg11.field10333, 89).field9642;
            }
            String var18 = class287.method1854(arg11, (byte) 38);
            if (var12 != null) {
                var18 = var18 + class354.method2255(-1, var12);
            }
            class269.field3907.method570(arg9, class569.field8030, class132.field1980, arg10, -116, 0, var18, arg2 + 3);
            if (arg11.field10338) {
                class84.field927.method1604(arg2 + 5 - -class395.field5431.method41(var18, -100), arg10 - 12);
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZLdca;)V", line = 211)
    public final void method307(int arg0, boolean arg1, class188 arg2) {
        ++field8012;
        if (arg1) {
            this.field8009 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)Z", line = 221)
    public final boolean method304(int arg0) {
        if (arg0 <= 125) {
            return true;
        } else {
            ++field8001;
            return true;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V", line = 233)
    public static final void method3328(boolean arg0) {
        ++field8013;
        if (!arg0) {
            if (class519.field7328.field6674 && class556.field7930.field763 != -1) {
                class157.method1204(class556.field7930.field763, class556.field7930.field760, 50000);
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BII)V", line = 246)
    public final void method311(byte arg0, int arg1, int arg2) {
        ++field8010;
        if (arg0 > -55) {
            this.field8008 = null;
        }
        if (~(arg1 & 1) != -2) {
            if (this.field8009.field9123) {
                super.field7676.method808((byte) 34, this.field8009.field9119);
                class286.field4212[1] = 0.0F;
                class286.field4212[3] = 0.0F;
                class286.field4212[2] = 0.0F;
                class286.field4212[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class286.field4212, 0);
            } else {
                super.field7676.method808((byte) 34, this.field8009.field9122[0]);
            }
        } else if (this.field8009.field9123) {
            super.field7676.method808((byte) 34, this.field8009.field9119);
            class286.field4212[2] = 0.0F;
            class286.field4212[0] = 0.0F;
            class286.field4212[3] = (float) (super.field7676.field1437 % 4000) / 4000.0F;
            class286.field4212[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class286.field4212, 0);
        } else {
            int var4 = super.field7676.field1437 % 4000 * 16 / 4000;
            super.field7676.method808((byte) 34, this.field8009.field9122[var4]);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)V", line = 300)
    public final void method309(boolean arg0, int arg1) {
        if (arg1 >= -67) {
            field8015 = null;
        }
        ++field8007;
        super.field7676.method802(8448, 11762, 260);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lmea;I)V", line = 312)
    public static final void method3329(class451 arg0, int arg1) {
        if (class42.field542 == arg0.field6291) {
            class698.field9719[arg0.field6251] = true;
        }
        ++field8002;
        if (arg1 != 8195) {
            field8015 = null;
        }
    }
}
