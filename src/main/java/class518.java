import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class518 extends class190 {

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "Lah;")
    private class374 field7497;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "Liw;")
    private class607 field7487;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "Lcb;")
    public static class631 field7489 = new class631(55, -1);

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "Lla;")
    public static class422 field7495;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)V")
    public final void method910(boolean arg0) {
        ++field7492;
        this.field7487.method3477((byte) 51, '\u0001');
        super.field3195.method1298(1, (byte) -124);
        if (arg0) {
            this.field7497 = null;
        }
        super.field3195.method1306((class487) null, 60);
        super.field3195.method1298(0, (byte) -124);
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)I")
    public static final int method3090(int arg0) {
        if (arg0 != 64) {
            field7489 = null;
        }
        ++field7491;
        return class630.field8864;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILnba;I)V")
    public final void method911(int arg0, class487 arg1, int arg2) {
        super.field3195.method1306(arg1, 98);
        ++field7486;
        super.field3195.method1334(arg2 + arg2, arg0);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIB)V")
    public final void method914(int arg0, int arg1, byte arg2) {
        ++field7493;
        float var4 = (float) ((3 & arg0) - -1) * -5.0E-4F;
        float var5 = (float) (((27 & arg0) >> 3) + 1) * 5.0E-4F;
        float var6 = (arg0 & 64) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        if (arg2 != -122) {
            this.method915(false, -103);
        }
        boolean var7 = (128 & arg0) != 0;
        super.field3195.method1298(1, (byte) -124);
        if (var7) {
            class249.field3988[2] = 0.0F;
            class249.field3988[1] = 0.0F;
            class249.field3988[3] = 0.0F;
            class249.field3988[0] = var6;
        } else {
            class249.field3988[2] = var6;
            class249.field3988[0] = 0.0F;
            class249.field3988[1] = 0.0F;
            class249.field3988[3] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class249.field3988, 0);
        class249.field3988[0] = 0.0F;
        class249.field3988[1] = var6;
        class249.field3988[2] = 0.0F;
        class249.field3988[3] = (float) super.field3195.field2757 * var4 % 1.0F;
        OpenGL.glTexGenfv(8193, 9474, class249.field3988, 0);
        if (!this.field7497.field5655) {
            int var8 = (int) ((float) super.field3195.field2757 * var5 * 16.0F);
            super.field3195.method1306(this.field7497.field5651[var8 % 16], 118);
        } else {
            class249.field3988[1] = 0.0F;
            class249.field3988[3] = (float) super.field3195.field2757 * var5 % 1.0F;
            class249.field3988[0] = 0.0F;
            class249.field3988[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class249.field3988, 0);
        }
        super.field3195.method1298(0, (byte) -124);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZI)V")
    public final void method915(boolean arg0, int arg1) {
        ++field7496;
        this.field7487.method3477((byte) 108, '\u0000');
        if (this.field7497.field5655) {
            super.field3195.method1298(1, (byte) -124);
            super.field3195.method1306(this.field7497.field5656, 81);
            super.field3195.method1298(0, (byte) -124);
        }
        if (arg1 != 0) {
            method3091(48);
        }
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)V")
    public static void method3091(int arg0) {
        int var1 = 121 % ((-89 - arg0) / 32);
        field7489 = null;
        field7495 = null;
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(III)Z")
    public static final boolean method3092(int arg0, int arg1, int arg2) {
        ++field7488;
        if (arg1 != 458752) {
            field7489 = null;
        }
        return class502.method3038(arg0, arg2, -116) | (arg0 & 458752) != 0 || class461.method2827(0, arg0, arg2);
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lrs;Lah;)V")
    public class518(class166 arg0, class374 arg1) {
        super(arg0);
        this.field7497 = arg1;
        this.field7487 = new class607(arg0, 2);
        this.field7487.method3481(80, 0);
        super.field3195.method1298(1, (byte) -124);
        if (this.field7497.field5655) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field3195.method1298(0, (byte) -124);
        this.field7487.method3479((byte) -31);
        this.field7487.method3481(33, 1);
        super.field3195.method1298(1, (byte) -124);
        if (this.field7497.field5655) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field3195.method1298(0, (byte) -124);
        this.field7487.method3479((byte) -89);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IZ)V")
    public final void method909(int arg0, boolean arg1) {
        if (arg0 == 16450) {
            ++field7494;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)Z")
    public final boolean method908(int arg0) {
        if (arg0 <= 37) {
            this.method911(116, (class487) null, -121);
        }
        ++field7490;
        return true;
    }
}
