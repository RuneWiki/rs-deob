import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class573 extends class610 {

    @OriginalMember(owner = "client!go", name = "n", descriptor = "Lh;")
    private class609 field7717;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "Lml;")
    private class353 field7712;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
    public static final void method3153(byte arg0) {
        ++field7718;
        class212.method1390(64, false);
        if (arg0 < -40) {
            if (~class539.field7310 <= -1 && ~class539.field7310 != -1) {
                class339.method2033(class539.field7310, -28863);
                class539.field7310 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)V")
    public final void method257(boolean arg0, int arg1) {
        if (arg1 <= -19) {
            this.field7712.method2094((byte) 115, '\u0000');
            ++field7714;
            if (this.field7717.field8462) {
                super.field8473.method1747(1, (byte) 108);
                super.field8473.method1804(false, this.field7717.field8466);
                super.field8473.method1747(0, (byte) 108);
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Z")
    public final boolean method262(int arg0) {
        ++field7715;
        if (arg0 != -1) {
            this.field7712 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIB)V")
    public final void method258(int arg0, int arg1, byte arg2) {
        ++field7716;
        float var4 = (float) ((3 & arg1) + 1) * -5.0E-4F;
        float var5 = (float) ((arg1 >> 3 & 3) + 1) * 5.0E-4F;
        float var6 = ~(64 & arg1) == -1 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var7 = ~(arg1 & 128) != -1;
        if (arg2 == 70) {
            super.field8473.method1747(1, (byte) 108);
            if (!var7) {
                class421.field5952[1] = 0.0F;
                class421.field5952[3] = 0.0F;
                class421.field5952[2] = var6;
                class421.field5952[0] = 0.0F;
            } else {
                class421.field5952[1] = 0.0F;
                class421.field5952[2] = 0.0F;
                class421.field5952[3] = 0.0F;
                class421.field5952[0] = var6;
            }
            OpenGL.glTexGenfv(8192, 9474, class421.field5952, 0);
            class421.field5952[0] = 0.0F;
            class421.field5952[1] = var6;
            class421.field5952[3] = (float) super.field8473.field4221 * var4 % 1.0F;
            class421.field5952[2] = 0.0F;
            OpenGL.glTexGenfv(8193, 9474, class421.field5952, 0);
            if (!this.field7717.field8462) {
                int var8 = (int) ((float) super.field8473.field4221 * var5 * 16.0F);
                super.field8473.method1804(false, this.field7717.field8461[var8 % 16]);
            } else {
                class421.field5952[2] = 0.0F;
                class421.field5952[0] = 0.0F;
                class421.field5952[1] = 0.0F;
                class421.field5952[3] = (float) super.field8473.field4221 * var5 % 1.0F;
                OpenGL.glTexGenfv(8194, 9473, class421.field5952, 0);
            }
            super.field8473.method1747(0, (byte) 108);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZZ)V")
    public final void method254(boolean arg0, boolean arg1) {
        ++field7713;
        if (!arg0) {
            method3153((byte) -101);
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Len;Lh;)V")
    public class573(class289 arg0, class609 arg1) {
        super(arg0);
        this.field7717 = arg1;
        this.field7712 = new class353(arg0, 2);
        this.field7712.method2097(0, -14434);
        super.field8473.method1747(1, (byte) 108);
        if (this.field7717.field8462) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field8473.method1747(0, (byte) 108);
        this.field7712.method2099(6493);
        this.field7712.method2097(1, -14434);
        super.field8473.method1747(1, (byte) 108);
        if (this.field7717.field8462) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field8473.method1747(0, (byte) 108);
        this.field7712.method2099(6493);
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
    public final void method252(int arg0) {
        this.field7712.method2094((byte) 116, '\u0001');
        ++field7720;
        super.field8473.method1747(1, (byte) 108);
        super.field8473.method1804(false, (class591) null);
        super.field8473.method1747(0, (byte) 108);
        if (arg0 != 31130) {
            this.method258(-8, 13, (byte) -62);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IILit;)V")
    public final void method255(int arg0, int arg1, class591 arg2) {
        ++field7719;
        super.field8473.method1804(false, arg2);
        if (arg0 != 256) {
            this.field7712 = null;
        }
        super.field8473.method1801(arg1, 34166);
    }
}
