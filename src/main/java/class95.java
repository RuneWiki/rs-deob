import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class95 extends class531 {

    @OriginalMember(owner = "client!oia", name = "i", descriptor = "Lgo;")
    private class653 field1074;

    @OriginalMember(owner = "client!oia", name = "p", descriptor = "Loi;")
    private class78 field1081;

    @OriginalMember(owner = "client!oia", name = "k", descriptor = "Lsaa;")
    public static class345 field1076 = new class345(9, 2);

    @OriginalMember(owner = "client!oia", name = "g", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!oia", name = "h", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!oia", name = "j", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!oia", name = "l", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!oia", name = "m", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!oia", name = "o", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!oia", name = "q", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!oia", name = "r", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!oia", name = "t", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!oia", name = "s", descriptor = "Lm;")
    public static class203 field1084;

    @OriginalMember(owner = "client!oia", name = "n", descriptor = "Ljd;")
    public static class241 field1079;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(ZI)V", line = 7)
    public final void method309(boolean arg0, int arg1) {
        if (arg1 >= -67) {
            field1079 = null;
        }
        ++field1073;
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)Z", line = 21)
    public final boolean method304(int arg0) {
        ++field1078;
        if (arg0 < 125) {
            this.method304(35);
        }
        return true;
    }

    @OriginalMember(owner = "client!oia", name = "d", descriptor = "(I)V", line = 37)
    public static void method693(int arg0) {
        field1079 = null;
        field1076 = null;
        if (arg0 != 0) {
            method694((byte) -48);
        }
        field1084 = null;
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(ZI)V", line = 49)
    public final void method301(boolean arg0, int arg1) {
        this.field1081.method606(true, '\u0000');
        ++field1075;
        if (this.field1074.field9123) {
            super.field7676.method813((byte) 103, 1);
            super.field7676.method808((byte) 34, this.field1074.field9121);
            super.field7676.method813((byte) 103, 0);
        }
        if (arg1 >= -9) {
            this.method311((byte) 25, -93, -88);
        }
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)V", line = 69)
    public final void method300(int arg0) {
        ++field1085;
        this.field1081.method606(true, '\u0001');
        super.field7676.method813((byte) 103, arg0);
        super.field7676.method808((byte) 34, (class188) null);
        super.field7676.method813((byte) 103, 0);
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(B)Z", line = 81)
    public static final boolean method694(byte arg0) {
        if (arg0 != -93) {
            method693(-85);
        }
        ++field1077;
        return class90.field1011 != 0 ? true : class686.field9533.method2747(115);
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(IZLdca;)V", line = 96)
    public final void method307(int arg0, boolean arg1, class188 arg2) {
        super.field7676.method808((byte) 34, arg2);
        ++field1082;
        if (arg1) {
            method694((byte) 35);
        }
        super.field7676.method795(arg0, 34023);
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(BII)V", line = 108)
    public final void method311(byte arg0, int arg1, int arg2) {
        ++field1072;
        float var4 = (float) ((arg1 & 3) + 1) * -5.0E-4F;
        float var5 = (float) (((arg1 & 26) >> 3) - -1) * 5.0E-4F;
        float var6 = (64 & arg1) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var7 = (arg1 & 128) != 0;
        super.field7676.method813((byte) 103, 1);
        if (!var7) {
            class154.field2187[2] = var6;
            class154.field2187[0] = 0.0F;
            class154.field2187[1] = 0.0F;
            class154.field2187[3] = 0.0F;
        } else {
            class154.field2187[2] = 0.0F;
            class154.field2187[3] = 0.0F;
            class154.field2187[1] = 0.0F;
            class154.field2187[0] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class154.field2187, 0);
        class154.field2187[1] = var6;
        class154.field2187[3] = (float) super.field7676.field1437 * var4 % 1.0F;
        class154.field2187[0] = 0.0F;
        class154.field2187[2] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class154.field2187, 0);
        if (this.field1074.field9123) {
            class154.field2187[1] = 0.0F;
            class154.field2187[0] = 0.0F;
            class154.field2187[3] = (float) super.field7676.field1437 * var5 % 1.0F;
            class154.field2187[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class154.field2187, 0);
        } else {
            int var8 = (int) ((float) super.field7676.field1437 * var5 * 16.0F);
            super.field7676.method808((byte) 34, this.field1074.field9120[var8 % 16]);
        }
        super.field7676.method813((byte) 103, 0);
        if (arg0 > -55) {
            field1076 = null;
        }
    }

    @OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(Lqfa;Lgo;)V", line = 166)
    public class95(class106 arg0, class653 arg1) {
        super(arg0);
        this.field1074 = arg1;
        this.field1081 = new class78(arg0, 2);
        this.field1081.method607(0, false);
        super.field7676.method813((byte) 103, 1);
        if (this.field1074.field9123) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field7676.method813((byte) 103, 0);
        this.field1081.method608(false);
        this.field1081.method607(1, false);
        super.field7676.method813((byte) 103, 1);
        if (this.field1074.field9123) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field7676.method813((byte) 103, 0);
        this.field1081.method608(false);
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(FFIFLafa;ZIIFFI)[B", line = 201)
    public static final byte[] method695(float arg0, float arg1, int arg2, float arg3, class363 arg4, boolean arg5, int arg6, int arg7, float arg8, float arg9, int arg10) {
        if (!arg5) {
            field1084 = null;
        }
        ++field1083;
        byte[] var11 = new byte[arg2 * arg7 * arg6];
        class689.method3894(-6927, arg8, arg7, arg9, arg0, arg4, arg1, arg3, 0, arg10, arg6, var11, arg2);
        return var11;
    }
}
