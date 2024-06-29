import jaggl.OpenGL;
import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class745 extends class489 {

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "Lfaa;")
    private class452 field10397;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Lbp;")
    private class458 field10396;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field10390;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field10391;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field10392;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field10394;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field10395;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field10398;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field10399;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field10400;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Ljava/applet/Applet;")
    public static Applet field10393;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)Z", line = 3)
    public final boolean method7(byte arg0) {
        if (arg0 <= 95) {
            method4165((byte) -9);
        }
        ++field10391;
        return true;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V", line = 16)
    public static void method4165(byte arg0) {
        if (arg0 <= 120) {
            method4166(-67);
        }
        field10393 = null;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(IZ)V", line = 27)
    public final void method9(int arg0, boolean arg1) {
        ++field10400;
        if (arg0 != -5) {
            this.field10396 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 40)
    public final void method6(int arg0) {
        this.field10396.method2682('\u0001', 115);
        ++field10390;
        super.field6956.method2135(1, -5027);
        super.field6956.method2120(-1, (class411) null);
        super.field6956.method2135(arg0, -5027);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)V", line = 51)
    public final void method10(int arg0, boolean arg1) {
        this.field10396.method2682('\u0000', 120);
        ++field10395;
        if (this.field10397.field6337) {
            super.field6956.method2135(1, -5027);
            super.field6956.method2120(-1, this.field10397.field6332);
            super.field6956.method2135(0, -5027);
        }
        int var3 = 125 / ((arg0 - -43) / 37);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V", line = 70)
    public final void method8(int arg0, int arg1, int arg2) {
        ++field10392;
        float var4 = (float) ((3 & arg1) + 1) * -5.0E-4F;
        float var5 = (float) (((28 & arg1) >> 3) + 1) * 5.0E-4F;
        float var6 = (64 & arg1) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        super.field6956.method2135(1, -5027);
        boolean var7 = ~(arg1 & 128) != -1;
        if (var7) {
            class197.field2534[2] = 0.0F;
            class197.field2534[1] = 0.0F;
            class197.field2534[0] = var6;
            class197.field2534[3] = 0.0F;
        } else {
            class197.field2534[2] = var6;
            class197.field2534[1] = 0.0F;
            class197.field2534[3] = 0.0F;
            class197.field2534[0] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class197.field2534, 0);
        if (arg2 == 40) {
            class197.field2534[1] = var6;
            class197.field2534[2] = 0.0F;
            class197.field2534[0] = 0.0F;
            class197.field2534[3] = (float) super.field6956.field4961 * var4 % 1.0F;
            OpenGL.glTexGenfv(8193, 9474, class197.field2534, 0);
            if (!this.field10397.field6337) {
                int var8 = (int) ((float) super.field6956.field4961 * var5 * 16.0F);
                super.field6956.method2120(-1, this.field10397.field6340[var8 % 16]);
            } else {
                class197.field2534[2] = 0.0F;
                class197.field2534[1] = 0.0F;
                class197.field2534[0] = 0.0F;
                class197.field2534[3] = (float) super.field6956.field4961 * var5 % 1.0F;
                OpenGL.glTexGenfv(8194, 9473, class197.field2534, 0);
            }
            super.field6956.method2135(0, -5027);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V", line = 129)
    public static final void method4166(int arg0) {
        if (arg0 == 0) {
            if (class303.field3891 == 2) {
                class573.field7997[0].method2452(class317.field4078[0]);
                class573.field7997[1].method2452(class317.field4078[1]);
            } else if (class303.field3891 == 3) {
                class573.field7997[0].method2452(class317.field4078[0]);
                class573.field7997[1].method2452(class317.field4078[1]);
                class573.field7997[2].method2452(class317.field4078[2]);
            } else {
                class573.field7997[0].method2452(class317.field4078[0]);
                class573.field7997[1].method2452(class317.field4078[1]);
                class573.field7997[2].method2452(class317.field4078[2]);
                class573.field7997[3].method2452(class317.field4078[3]);
            }
        } else if (arg0 == 1) {
            if (class303.field3891 == 2) {
                class573.field7997[0].method2452(class317.field4078[2]);
            } else if (class303.field3891 == 3) {
                class573.field7997[0].method2452(class317.field4078[3]);
                class573.field7997[1].method2452(class317.field4078[4]);
            } else {
                class573.field7997[0].method2452(class317.field4078[4]);
                class573.field7997[1].method2452(class317.field4078[5]);
                class573.field7997[2].method2452(class317.field4078[6]);
            }
        } else {
            if (arg0 == 2) {
                if (class303.field3891 == 2) {
                    class573.field7997[0].method2452(class317.field4078[3]);
                    return;
                }
                if (class303.field3891 == 3) {
                    class573.field7997[0].method2452(class317.field4078[5]);
                    return;
                }
                class573.field7997[0].method2452(class317.field4078[7]);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Leq;Lfaa;)V", line = 201)
    public class745(class357 arg0, class452 arg1) {
        super(arg0);
        this.field10397 = arg1;
        this.field10396 = new class458(arg0, 2);
        this.field10396.method2686(0, (byte) -104);
        super.field6956.method2135(1, -5027);
        if (this.field10397.field6337) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field6956.method2135(0, -5027);
        this.field10396.method2685(0);
        this.field10396.method2686(1, (byte) -74);
        super.field6956.method2135(1, -5027);
        if (this.field10397.field6337) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field6956.method2135(0, -5027);
        this.field10396.method2685(0);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLkp;I)V", line = 235)
    public final void method12(byte arg0, class411 arg1, int arg2) {
        super.field6956.method2120(-1, arg1);
        ++field10398;
        super.field6956.method2153(-91, arg2);
        if (arg0 > -66) {
            field10394 = -6;
        }
    }
}
