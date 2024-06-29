import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class394 extends class184 {

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "Lqr;")
    private class64 field5517;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "Leha;")
    private class89 field5516;

    @OriginalMember(owner = "client!mt", name = "q", descriptor = "[I")
    public static int[] field5520 = new int[14];

    @OriginalMember(owner = "client!mt", name = "t", descriptor = "Z")
    public static boolean field5523 = false;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!mt", name = "r", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!mt", name = "s", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILvk;Ljava/awt/Frame;)V")
    public static final void method2446(int arg0, class367 arg1, Frame arg2) {
        while (true) {
            class637 var3 = arg1.method2279(arg2, (byte) 68);
            while (var3.field9091 == 0) {
                class246.method1639(10L, (byte) -118);
            }
            if (var3.field9091 == 1) {
                if (arg0 >= -72) {
                    field5523 = false;
                }
                ++field5521;
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class246.method1639(100L, (byte) -68);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZI)V")
    public final void method704(boolean arg0, int arg1) {
        ++field5518;
        if (arg1 != -28981) {
            field5523 = true;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)Z")
    public final boolean method698(int arg0) {
        if (arg0 != -20958) {
            return false;
        } else {
            ++field5511;
            return true;
        }
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Loea;Lqr;)V")
    public class394(class594 arg0, class64 arg1) {
        super(arg0);
        this.field5517 = arg1;
        this.field5516 = new class89(arg0, 2);
        this.field5516.method836(4864, 0);
        super.field2626.method3413(1, 33984);
        if (this.field5517.field1157) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field2626.method3413(0, 33984);
        this.field5516.method832(99);
        this.field5516.method836(4864, 1);
        super.field2626.method3413(1, 33984);
        if (this.field5517.field1157) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field2626.method3413(0, 33984);
        this.field5516.method832(99);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIZ)V")
    public final void method705(int arg0, int arg1, boolean arg2) {
        ++field5514;
        if (arg2) {
            method2448(46);
        }
        float var4 = (float) ((3 & arg1) + 1) * -5.0E-4F;
        float var5 = (float) ((arg1 >> 3 & 3) + 1) * 5.0E-4F;
        float var6 = (64 & arg1) != 0 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = (128 & arg1) != 0;
        super.field2626.method3413(1, 33984);
        if (var7) {
            class98.field1674[1] = 0.0F;
            class98.field1674[2] = 0.0F;
            class98.field1674[0] = var6;
            class98.field1674[3] = 0.0F;
        } else {
            class98.field1674[2] = var6;
            class98.field1674[1] = 0.0F;
            class98.field1674[0] = 0.0F;
            class98.field1674[3] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class98.field1674, 0);
        class98.field1674[0] = 0.0F;
        class98.field1674[2] = 0.0F;
        class98.field1674[1] = var6;
        class98.field1674[3] = (float) super.field2626.field8544 * var4 % 1.0F;
        OpenGL.glTexGenfv(8193, 9474, class98.field1674, 0);
        if (!this.field5517.field1157) {
            int var8 = (int) ((float) super.field2626.field8544 * var5 * 16.0F);
            super.field2626.method3425(this.field5517.field1164[var8 % 16], -78);
        } else {
            class98.field1674[0] = 0.0F;
            class98.field1674[1] = 0.0F;
            class98.field1674[2] = 0.0F;
            class98.field1674[3] = (float) super.field2626.field8544 * var5 % 1.0F;
            OpenGL.glTexGenfv(8194, 9473, class98.field1674, 0);
        }
        super.field2626.method3413(0, 33984);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZ)V")
    public final void method699(int arg0, boolean arg1) {
        ++field5513;
        this.field5516.method834((byte) 105, '\u0000');
        if (arg0 <= -54) {
            if (this.field5517.field1157) {
                super.field2626.method3413(1, 33984);
                super.field2626.method3425(this.field5517.field1156, 88);
                super.field2626.method3413(0, 33984);
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)I")
    public static final int method2447(int arg0) {
        ++field5512;
        return ~class435.field6079 == arg0 ? class584.field8240 : class198.field2843;
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(I)Llda;")
    public static final class483 method2448(int arg0) {
        ++field5515;
        if (~class261.field3819.length < ~class595.field8699) {
            return class261.field3819[class595.field8699++];
        } else {
            if (arg0 != 0) {
                field5523 = true;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "(I)V")
    public static void method2449(int arg0) {
        field5520 = null;
        if (arg0 >= -20) {
            method2446(-36, (class367) null, (Frame) null);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Liia;ZI)V")
    public final void method700(class87 arg0, boolean arg1, int arg2) {
        super.field2626.method3425(arg0, 111);
        ++field5522;
        if (arg1) {
            this.method698(104);
        }
        super.field2626.method3417(arg2, 0);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V")
    public final void method702(boolean arg0) {
        this.field5516.method834((byte) 105, '\u0001');
        ++field5519;
        if (!arg0) {
            field5520 = null;
        }
        super.field2626.method3413(1, 33984);
        super.field2626.method3425((class87) null, -47);
        super.field2626.method3413(0, 33984);
    }
}
