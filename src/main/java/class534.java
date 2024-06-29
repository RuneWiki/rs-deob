import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class534 extends class318 {

    @OriginalMember(owner = "client!ms", name = "v", descriptor = "Luo;")
    private class408 field7859;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "Lac;")
    private class380 field7852;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
    public static int field7853 = -1;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
    public static int field7856 = 0;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "[I")
    public static int[] field7847 = new int[6];

    @OriginalMember(owner = "client!ms", name = "z", descriptor = "[S")
    public static short[] field7863 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
    public static int field7851;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
    public static int field7854;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
    public static int field7858;

    @OriginalMember(owner = "client!ms", name = "x", descriptor = "I")
    public static int field7861;

    @OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!ms", name = "w", descriptor = "Lrn;")
    private class178 field7860;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "[[[I")
    public static int[][][] field7849;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "([IZ)Ljava/lang/String;", line = 7)
    public static final String method3165(int[] arg0, boolean arg1) {
        ++field7857;
        StringBuffer var2 = new StringBuffer();
        int var3 = field7846;
        for (int var4 = 0; ~arg0.length < ~var4; ++var4) {
            class12 var5 = class327.field4930.method147(1, arg0[var4]);
            if (var5.field172 != -1) {
                class16 var6 = (class16) class398.field5949.method87((long) var5.field172, -2062335807);
                if (var6 == null) {
                    class84 var7 = class84.method702(class176.field2627, var5.field172, 0);
                    if (var7 != null) {
                        var6 = class377.field5692.method345(var7, true);
                        class398.field5949.method84((long) var5.field172, var6, (byte) 27);
                    }
                }
                if (var6 != null) {
                    class305.field4603[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    ++var3;
                }
            }
        }
        if (arg1) {
            field7863 = null;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)Z", line = 62)
    public final boolean method721(int arg0) {
        ++field7862;
        return arg0 != 0 ? true : true;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZ)V", line = 73)
    public final void method722(int arg0, boolean arg1) {
        int var3 = -8 / ((-23 - arg0) / 46);
        super.field4800.method1242(34162, 8448, 260);
        ++field7850;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)V", line = 84)
    public final void method723(byte arg0) {
        ++field7848;
        this.field7860.method1191('\u0001', (byte) 110);
        if (super.field4800.field3094 > 0) {
            super.field4800.method1307(1, (byte) 92);
            super.field4800.method1289(-19391, (class454) null);
            super.field4800.method1297(0.0F, (byte) 121, 1.0F);
            super.field4800.method1307(0, (byte) 92);
        }
        super.field4800.method1242(34162, 8448, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        if (arg0 >= 91) {
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lkd;Luo;)V", line = 109)
    public class534(class188 arg0, class408 arg1) {
        super(arg0);
        this.field7859 = arg1;
        this.method3168((byte) -69);
        this.field7852 = new class380(super.field4800, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field7852.method2384(2, false);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II[F)[F", line = 121)
    public static final float[] method3166(int arg0, int arg1, float[] arg2) {
        ++field7858;
        int var3 = 111 % ((-14 - arg0) / 41);
        float[] var4 = new float[arg1];
        class414.method2603(arg2, 0, var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V", line = 136)
    public final void method719(int arg0, int arg1, int arg2) {
        ++field7861;
        if (~(1 & arg1) != -2) {
            if (!this.field7859.field6091) {
                super.field4800.method1289(-19391, this.field7859.field6090[0]);
            } else {
                super.field4800.method1289(-19391, this.field7859.field6093);
                class483.field6950[0] = 0.0F;
                class483.field6950[1] = 0.0F;
                class483.field6950[3] = 0.0F;
                class483.field6950[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class483.field6950, 0);
            }
        } else if (this.field7859.field6091) {
            super.field4800.method1289(-19391, this.field7859.field6093);
            class483.field6950[3] = (float) (super.field4800.field3027 % 4000) / 4000.0F;
            class483.field6950[2] = 0.0F;
            class483.field6950[1] = 0.0F;
            class483.field6950[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class483.field6950, 0);
        } else {
            int var4 = super.field4800.field3027 % 4000 * 16 / 4000;
            super.field4800.method1289(arg2 + -19391, this.field7859.field6090[var4]);
        }
        if (arg2 != 0) {
            this.method719(60, -14, 55);
        }
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V", line = 189)
    public static void method3167(int arg0) {
        field7849 = null;
        if (arg0 == 6798) {
            field7847 = null;
            field7863 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZZ)V", line = 207)
    public final void method718(boolean arg0, boolean arg1) {
        if (arg1) {
            field7863 = null;
        }
        if (super.field4800.field3094 > 0) {
            float var3 = -0.5F / (float) super.field4800.field3094;
            super.field4800.method1307(1, (byte) 92);
            class483.field6950[0] = 0.0F;
            class483.field6950[3] = super.field4800.field3140 * var3 + 0.25F;
            class483.field6950[1] = 0.0F;
            class483.field6950[2] = var3;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class483.field6950, 0);
            OpenGL.glPopMatrix();
            super.field4800.method1297((float) super.field4800.field3094, (byte) 121, 0.5F);
            super.field4800.method1289(-19391, this.field7852);
            super.field4800.method1307(0, (byte) 92);
        }
        ++field7854;
        this.field7860.method1191('\u0000', (byte) -26);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lav;IB)V", line = 242)
    public final void method715(class454 arg0, int arg1, byte arg2) {
        if (arg2 >= -108) {
            this.method723((byte) -77);
        }
        ++field7855;
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(B)V", line = 252)
    private final void method3168(byte arg0) {
        this.field7860 = new class178(super.field4800, 2);
        ++field7851;
        this.field7860.method1192(0, (byte) -77);
        super.field4800.method1307(1, (byte) 92);
        super.field4800.method1242(34162, 260, 7681);
        super.field4800.method1266(768, 0, 34168, 8960);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        if (arg0 != -69) {
            method3166(20, -32, (float[]) null);
        }
        super.field4800.method1307(0, (byte) 92);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field7859.field6091) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field7860.method1196(120);
        this.field7860.method1192(1, (byte) -2);
        super.field4800.method1307(1, (byte) 92);
        super.field4800.method1242(arg0 + 34231, 8448, 8448);
        super.field4800.method1266(768, 0, 5890, 8960);
        OpenGL.glDisable(3168);
        super.field4800.method1307(0, (byte) 92);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field7859.field6091) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field7860.method1196(114);
    }
}
