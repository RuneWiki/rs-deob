import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class523 extends class692 {

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Lan;")
    private class193 field7328;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Lbfa;")
    private class264 field7329;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field7322 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Z")
    public static boolean field7330 = false;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Lhga;")
    public static class197 field7324;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Lwp;")
    public static class456 field7326;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILfga;I)V")
    public final void method1119(int arg0, class377 arg1, int arg2) {
        if (arg0 < 48) {
            this.method1112(43);
        }
        ++field7327;
        super.field9753.method3384(arg1, (byte) 65);
        super.field9753.method3375(arg2, (byte) 102);
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Llea;Lan;)V")
    public class523(class573 arg0, class193 arg1) {
        super(arg0);
        this.field7328 = arg1;
        this.field7329 = new class264(arg0, 2);
        this.field7329.method1704(0, -124);
        super.field9753.method3321(1, -19587);
        if (this.field7328.field2901) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field9753.method3321(0, -19587);
        this.field7329.method1701((byte) 106);
        this.field7329.method1704(1, -120);
        super.field9753.method3321(1, -19587);
        if (this.field7328.field2901) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field9753.method3321(0, -19587);
        this.field7329.method1701((byte) 82);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
    public final void method1118(boolean arg0, int arg1) {
        ++field7321;
        this.field7329.method1700('\u0000', 3711);
        if (this.field7328.field2901) {
            super.field9753.method3321(1, -19587);
            super.field9753.method3384(this.field7328.field2900, (byte) 92);
            super.field9753.method3321(0, -19587);
        }
        if (arg1 != -3826) {
            this.method1113(-102, true, -18);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)V")
    public static final void method3073(byte arg0, int arg1) {
        if (arg0 < 66) {
            method3073((byte) 114, -72);
        }
        ++field7325;
        class622 var2 = (class622) class108.field1547.method4253((long) arg1, -1);
        if (var2 != null) {
            var2.field8775.method3977(111);
            class661.method3707(var2.field8778, var2.field8782, 2);
            var2.method4237(-1);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public final void method1111(byte arg0) {
        this.field7329.method1700('\u0001', 3711);
        ++field7320;
        super.field9753.method3321(1, -19587);
        super.field9753.method3384((class377) null, (byte) 105);
        if (arg0 != 114) {
            field7330 = true;
        }
        super.field9753.method3321(0, -19587);
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
    public static void method3074(int arg0) {
        field7324 = null;
        field7326 = null;
        field7322 = null;
        if (arg0 != 1) {
            field7322 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)Z")
    public final boolean method1112(int arg0) {
        ++field7323;
        return arg0 < -124;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZI)V")
    public final void method1113(int arg0, boolean arg1, int arg2) {
        ++field7331;
        float var4 = (float) ((arg0 & 3) + 1) * -5.0E-4F;
        float var5 = (float) ((3 & arg0 >> 3) + 1) * 5.0E-4F;
        float var6 = ~(64 & arg0) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        super.field9753.method3321(1, -19587);
        boolean var7 = ~(128 & arg0) != -1;
        if (var7) {
            class663.field9339[0] = var6;
            class663.field9339[1] = 0.0F;
            class663.field9339[3] = 0.0F;
            class663.field9339[2] = 0.0F;
        } else {
            class663.field9339[2] = var6;
            class663.field9339[3] = 0.0F;
            class663.field9339[0] = 0.0F;
            class663.field9339[1] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class663.field9339, 0);
        class663.field9339[2] = 0.0F;
        if (!arg1) {
            field7330 = false;
        }
        class663.field9339[0] = 0.0F;
        class663.field9339[1] = var6;
        class663.field9339[3] = (float) super.field9753.field8133 * var4 % 1.0F;
        OpenGL.glTexGenfv(8193, 9474, class663.field9339, 0);
        if (!this.field7328.field2901) {
            int var8 = (int) ((float) super.field9753.field8133 * var5 * 16.0F);
            super.field9753.method3384(this.field7328.field2898[var8 % 16], (byte) 56);
        } else {
            class663.field9339[0] = 0.0F;
            class663.field9339[1] = 0.0F;
            class663.field9339[2] = 0.0F;
            class663.field9339[3] = (float) super.field9753.field8133 * var5 % 1.0F;
            OpenGL.glTexGenfv(8194, 9473, class663.field9339, 0);
        }
        super.field9753.method3321(0, -19587);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZB)V")
    public final void method1117(boolean arg0, byte arg1) {
        if (arg1 == 57) {
            ++field7319;
        }
    }
}
