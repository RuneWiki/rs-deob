import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class594 extends class682 {

    @OriginalMember(owner = "client!th", name = "k", descriptor = "Lpr;")
    private class445 field8388;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Lqha;")
    private class102 field8384;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "Ldh;")
    public static class320 field8392 = new class320(8, -1);

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field8385;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field8386;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field8387;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field8389;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field8390;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field8391;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IBI)V")
    public final void method289(int arg0, byte arg1, int arg2) {
        ++field8385;
        float var4 = (float) ((3 & arg0) + 1) * -5.0E-4F;
        float var5 = (float) ((arg0 >> 3 & 3) - -1) * 5.0E-4F;
        float var6 = (arg0 & 64) != 0 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = ~(arg0 & 128) != -1;
        super.field9647.method2545(32886, 1);
        if (var7) {
            class40.field461[3] = 0.0F;
            class40.field461[2] = 0.0F;
            class40.field461[0] = var6;
            class40.field461[1] = 0.0F;
        } else {
            class40.field461[1] = 0.0F;
            class40.field461[0] = 0.0F;
            class40.field461[3] = 0.0F;
            class40.field461[2] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class40.field461, 0);
        class40.field461[1] = var6;
        class40.field461[0] = 0.0F;
        class40.field461[2] = 0.0F;
        class40.field461[3] = (float) super.field9647.field5919 * var4 % 1.0F;
        OpenGL.glTexGenfv(8193, 9474, class40.field461, 0);
        if (!this.field8388.field6443) {
            int var8 = (int) ((float) super.field9647.field5919 * var5 * 16.0F);
            super.field9647.method2621(-2, this.field8388.field6445[var8 % 16]);
        } else {
            class40.field461[1] = 0.0F;
            class40.field461[2] = 0.0F;
            class40.field461[0] = 0.0F;
            class40.field461[3] = (float) super.field9647.field5919 * var5 % 1.0F;
            OpenGL.glTexGenfv(8194, 9473, class40.field461, 0);
        }
        super.field9647.method2545(32886, 0);
        if (arg1 < 72) {
            field8392 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)V")
    public final void method287(int arg0, boolean arg1) {
        if (arg0 > 111) {
            ++field8393;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static void method3393(byte arg0) {
        if (arg0 <= 23) {
            method3394(-43, -128, 19, 124, -100);
        }
        field8392 = null;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lnv;Lpr;)V")
    public class594(class417 arg0, class445 arg1) {
        super(arg0);
        this.field8388 = arg1;
        this.field8384 = new class102(arg0, 2);
        this.field8384.method705(0, (byte) 122);
        super.field9647.method2545(32886, 1);
        if (this.field8388.field6443) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field9647.method2545(32886, 0);
        this.field8384.method711(22972);
        this.field8384.method705(1, (byte) -109);
        super.field9647.method2545(32886, 1);
        if (this.field8388.field6443) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field9647.method2545(32886, 0);
        this.field8384.method711(22972);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V")
    public static final void method3394(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -2) {
            field8392 = null;
        }
        ++field8391;
        int var5 = class240.field2859;
        if (var5 != 0) {
            if (~var5 != -2) {
                if (~var5 == -3) {
                    if (arg2 > class198.field2314) {
                        class198.field2314 = arg2;
                    }
                    if (class716.field10055 > arg4) {
                        class716.field10055 = arg4;
                    }
                    if (~arg3 < ~class630.field9064) {
                        class630.field9064 = arg3;
                    }
                    if (~arg1 > ~class507.field7232) {
                        class507.field7232 = arg1;
                    }
                }
            } else {
                class716.field10055 = arg4;
                class240.field2859 = 2;
                class630.field9064 = arg3;
                class507.field7232 = arg1;
                class198.field2314 = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public final void method288(int arg0) {
        ++field8387;
        this.field8384.method712('\u0001', 1);
        super.field9647.method2545(32886, 1);
        super.field9647.method2621(-2, (class292) null);
        super.field9647.method2545(32886, arg0);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)Z")
    public final boolean method286(boolean arg0) {
        if (!arg0) {
            this.method292((class292) null, -76, -121);
        }
        ++field8389;
        return true;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ltha;II)V")
    public final void method292(class292 arg0, int arg1, int arg2) {
        if (arg2 != -16997) {
            field8392 = null;
        }
        ++field8386;
        super.field9647.method2621(-2, arg0);
        super.field9647.method2573(arg1, false);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BZ)V")
    public final void method285(byte arg0, boolean arg1) {
        this.field8384.method712('\u0000', 1);
        ++field8390;
        if (arg0 != 52) {
            this.method289(11, (byte) -90, -18);
        }
        if (this.field8388.field6443) {
            super.field9647.method2545(arg0 ^ 32834, 1);
            super.field9647.method2621(arg0 + -54, this.field8388.field6447);
            super.field9647.method2545(32886, 0);
        }
    }
}
