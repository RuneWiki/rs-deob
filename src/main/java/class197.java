import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class197 extends class374 {

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lbt;")
    private class89 field2885;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lce;")
    private class328 field2890;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Z")
    public static boolean field2892 = false;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Z")
    public static boolean field2893 = false;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Ltv;")
    public static class294 field2886;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lclient;")
    public static client field2894;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
    public final void method20(int arg0, int arg1, int arg2) {
        ++field2887;
        float var4 = (float) ((arg0 & 3) + 1) * -5.0E-4F;
        float var5 = (float) ((arg0 >> 3 & 3) + 1) * 5.0E-4F;
        float var6 = (arg0 & 64) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        super.field5646.method1553(1, -8156);
        boolean var7 = ~(arg0 & 128) != -1;
        if (var7) {
            class3.field28[1] = 0.0F;
            class3.field28[0] = var6;
            class3.field28[2] = 0.0F;
            class3.field28[3] = 0.0F;
        } else {
            class3.field28[3] = 0.0F;
            class3.field28[1] = 0.0F;
            class3.field28[2] = var6;
            class3.field28[0] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class3.field28, 0);
        class3.field28[0] = 0.0F;
        class3.field28[2] = 0.0F;
        class3.field28[3] = (float) super.field5646.field3703 * var4 % 1.0F;
        class3.field28[1] = var6;
        if (arg1 == -20857) {
            OpenGL.glTexGenfv(8193, 9474, class3.field28, 0);
            if (!this.field2885.field1386) {
                int var8 = (int) ((float) super.field5646.field3703 * var5 * 16.0F);
                super.field5646.method1546(-2, this.field2885.field1385[var8 % 16]);
            } else {
                class3.field28[2] = 0.0F;
                class3.field28[0] = 0.0F;
                class3.field28[1] = 0.0F;
                class3.field28[3] = (float) super.field5646.field3703 * var5 % 1.0F;
                OpenGL.glTexGenfv(8194, 9473, class3.field28, 0);
            }
            super.field5646.method1553(0, arg1 ^ 20131);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        this.field2890.method2035(-114, '\u0001');
        if (arg0 >= 74) {
            ++field2891;
            super.field5646.method1553(1, -8156);
            super.field5646.method1546(-2, (class271) null);
            super.field5646.method1553(0, -8156);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
    public static void method1295(byte arg0) {
        field2886 = null;
        if (arg0 == 35) {
            field2894 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZZ)V")
    public final void method25(boolean arg0, boolean arg1) {
        this.field2890.method2035(55, '\u0000');
        if (arg1) {
            ++field2889;
            if (this.field2885.field1386) {
                super.field5646.method1553(1, -8156);
                super.field5646.method1546(-2, this.field2885.field1387);
                super.field5646.method1553(0, -8156);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lvd;Lbt;)V")
    public class197(class258 arg0, class89 arg1) {
        super(arg0);
        this.field2885 = arg1;
        this.field2890 = new class328(arg0, 2);
        this.field2890.method2036((byte) -107, 0);
        super.field5646.method1553(1, -8156);
        if (this.field2885.field1386) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field5646.method1553(0, -8156);
        this.field2890.method2041((byte) 33);
        this.field2890.method2036((byte) -107, 1);
        super.field5646.method1553(1, -8156);
        if (this.field2885.field1386) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field5646.method1553(0, -8156);
        this.field2890.method2041((byte) 33);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)V")
    public final void method19(boolean arg0, int arg1) {
        ++field2895;
        if (arg1 > -2) {
            field2886 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLew;I)V")
    public final void method18(boolean arg0, class271 arg1, int arg2) {
        super.field5646.method1546(-2, arg1);
        ++field2896;
        super.field5646.method1582(arg2, arg0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Z")
    public final boolean method21(byte arg0) {
        ++field2897;
        return arg0 >= 85;
    }
}
