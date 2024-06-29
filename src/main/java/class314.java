import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class314 extends class277 {

    @OriginalMember(owner = "client!jga", name = "u", descriptor = "Lpea;")
    private class222 field4051;

    @OriginalMember(owner = "client!jga", name = "l", descriptor = "Lfb;")
    private class52 field4042;

    @OriginalMember(owner = "client!jga", name = "o", descriptor = "Lrga;")
    public static class280 field4045 = new class280(63, -1);

    @OriginalMember(owner = "client!jga", name = "p", descriptor = "[I")
    public static int[] field4046 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!jga", name = "r", descriptor = "Lct;")
    public static class414 field4048 = new class414();

    @OriginalMember(owner = "client!jga", name = "v", descriptor = "I")
    public static int field4052 = 100;

    @OriginalMember(owner = "client!jga", name = "i", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!jga", name = "j", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!jga", name = "k", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!jga", name = "m", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!jga", name = "n", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!jga", name = "q", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!jga", name = "s", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!jga", name = "t", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method280(int arg0, boolean arg1) {
        if (arg0 <= -64) {
            ++field4041;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IILrg;)V", line = 19)
    public final void method279(int arg0, int arg1, class615 arg2) {
        ++field4050;
        super.field3475.method2960(arg2, -2);
        if (arg1 != 7) {
            field4049 = -88;
        }
        super.field3475.method3005(false, arg0);
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lrga;Lhr;B)Ltba;", line = 35)
    public static final class704 method1820(class280 arg0, class608 arg1, byte arg2) {
        ++field4039;
        int var3 = -117 % ((10 - arg2) / 63);
        class704 var4 = class72.method423(18375);
        var4.field9930 = arg0;
        var4.field9937 = arg0.field3516;
        if (~var4.field9937 == 0) {
            var4.field9929 = new class30(260);
        } else if (~var4.field9937 == 1) {
            var4.field9929 = new class30(10000);
        } else if (var4.field9937 > 18) {
            if (var4.field9937 <= 98) {
                var4.field9929 = new class30(100);
            } else {
                var4.field9929 = new class30(260);
            }
        } else {
            var4.field9929 = new class30(20);
        }
        var4.field9929.method198((byte) -20, arg1);
        var4.field9929.method197(26951, var4.field9930.method1590(77));
        var4.field9931 = 0;
        return var4;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(III)V", line = 70)
    public final void method276(int arg0, int arg1, int arg2) {
        ++field4044;
        float var4 = (float) ((arg0 & 3) + 1) * -5.0E-4F;
        float var5 = (float) ((3 & arg0 >> 3) - -1) * 5.0E-4F;
        float var6 = ~(64 & arg0) == -1 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var7 = ~(arg0 & 128) != -1;
        super.field3475.method3027(1, true);
        if (!var7) {
            class514.field7025[1] = 0.0F;
            class514.field7025[2] = var6;
            class514.field7025[0] = 0.0F;
            class514.field7025[3] = 0.0F;
        } else {
            class514.field7025[2] = 0.0F;
            class514.field7025[0] = var6;
            class514.field7025[1] = 0.0F;
            class514.field7025[3] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class514.field7025, 0);
        class514.field7025[1] = var6;
        class514.field7025[3] = (float) super.field3475.field7477 * var4 % 1.0F;
        class514.field7025[2] = 0.0F;
        class514.field7025[0] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class514.field7025, 0);
        if (arg1 != 50) {
            method1820((class280) null, (class608) null, (byte) 105);
        }
        if (this.field4051.field2714) {
            class514.field7025[3] = (float) super.field3475.field7477 * var5 % 1.0F;
            class514.field7025[0] = 0.0F;
            class514.field7025[2] = 0.0F;
            class514.field7025[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class514.field7025, 0);
        } else {
            int var8 = (int) ((float) super.field3475.field7477 * var5 * 16.0F);
            super.field3475.method2960(this.field4051.field2715[var8 % 16], -2);
        }
        super.field3475.method3027(0, true);
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)Z", line = 129)
    public final boolean method284(byte arg0) {
        ++field4047;
        return arg0 <= -93;
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(IZ)V", line = 140)
    public final void method277(int arg0, boolean arg1) {
        int var3 = 37 / ((arg0 - 65) / 60);
        ++field4043;
        this.field4042.method333(-29240, '\u0000');
        if (this.field4051.field2714) {
            super.field3475.method3027(1, true);
            super.field3475.method2960(this.field4051.field2719, -2);
            super.field3475.method3027(0, true);
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)V", line = 158)
    public final void method278(int arg0) {
        ++field4040;
        if (arg0 != 1268) {
            method1820((class280) null, (class608) null, (byte) 21);
        }
        this.field4042.method333(-29240, '\u0001');
        super.field3475.method3027(1, true);
        super.field3475.method2960((class615) null, -2);
        super.field3475.method3027(0, true);
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lqj;Lpea;)V", line = 172)
    public class314(class548 arg0, class222 arg1) {
        super(arg0);
        this.field4051 = arg1;
        this.field4042 = new class52(arg0, 2);
        this.field4042.method331(0, 0);
        super.field3475.method3027(1, true);
        if (this.field4051.field2714) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field3475.method3027(0, true);
        this.field4042.method332((byte) 32);
        this.field4042.method331(1, 0);
        super.field3475.method3027(1, true);
        if (this.field4051.field2714) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field3475.method3027(0, true);
        this.field4042.method332((byte) 61);
    }

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "(B)V", line = 205)
    public static void method1821(byte arg0) {
        field4046 = null;
        if (arg0 >= 117) {
            field4045 = null;
            field4048 = null;
        }
    }
}
