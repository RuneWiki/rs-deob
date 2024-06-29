import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class607 extends class27 {

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Lud;")
    private class33 field8439;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "Lqm;")
    private class129 field8434;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Lgo;")
    public static class581 field8441 = new class581(10, 2, 2, 0);

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "Lem;")
    public static class206 field8446 = new class206(113, 12);

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field8447 = 0;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "Llh;")
    public static class487 field8448 = new class487(21, 8);

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field8435;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field8436;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field8437;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field8438;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field8440;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field8442;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field8444;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field8445;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Z)V", line = 7)
    public static final void method3414(boolean arg0) {
        ++field8436;
        if (class296.field4059 != null) {
            class618.field8608 = new class28();
            class618.field8608.method278(class423.field5954, class296.field4059.field7349.method555(class697.field9900, arg0), class296.field4059.field7344, 4309, class296.field4059);
            class308.field4258 = new Thread(class618.field8608, "");
            class308.field4258.start();
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V", line = 22)
    public final void method256(byte arg0) {
        if (arg0 == 50) {
            ++field8443;
            this.field8434.method918(1, '\u0001');
            super.field337.method3220(arg0 + -50, 1);
            super.field337.method3206((class136) null, (byte) 26);
            super.field337.method3220(0, 0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BZ)V", line = 39)
    public final void method258(byte arg0, boolean arg1) {
        ++field8440;
        this.field8434.method918(1, '\u0000');
        if (arg0 < -80) {
            if (this.field8439.field412) {
                super.field337.method3220(0, 1);
                super.field337.method3206(this.field8439.field415, (byte) 26);
                super.field337.method3220(0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V", line = 57)
    public final void method261(int arg0, int arg1, int arg2) {
        ++field8444;
        float var4 = (float) ((3 & arg0) + 1) * -5.0E-4F;
        float var5 = (float) ((arg0 >> 3 & 3) + 1) * 5.0E-4F;
        float var6 = ~(64 & arg0) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = ~(arg0 & 128) != -1;
        super.field337.method3220(arg2 ^ arg2, 1);
        if (var7) {
            class67.field912[1] = 0.0F;
            class67.field912[0] = var6;
            class67.field912[3] = 0.0F;
            class67.field912[2] = 0.0F;
        } else {
            class67.field912[0] = 0.0F;
            class67.field912[2] = var6;
            class67.field912[1] = 0.0F;
            class67.field912[3] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class67.field912, 0);
        class67.field912[2] = 0.0F;
        class67.field912[1] = var6;
        class67.field912[3] = (float) super.field337.field7834 * var4 % 1.0F;
        class67.field912[0] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class67.field912, 0);
        if (this.field8439.field412) {
            class67.field912[2] = 0.0F;
            class67.field912[3] = (float) super.field337.field7834 * var5 % 1.0F;
            class67.field912[0] = 0.0F;
            class67.field912[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class67.field912, 0);
        } else {
            int var8 = (int) ((float) super.field337.field7834 * var5 * 16.0F);
            super.field337.method3206(this.field8439.field414[var8 % 16], (byte) 26);
        }
        super.field337.method3220(0, 0);
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Llj;Lud;)V", line = 110)
    public class607(class565 arg0, class33 arg1) {
        super(arg0);
        this.field8439 = arg1;
        this.field8434 = new class129(arg0, 2);
        this.field8434.method919(0, 4864);
        super.field337.method3220(0, 1);
        if (this.field8439.field412) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field337.method3220(0, 0);
        this.field8434.method915((byte) 95);
        this.field8434.method919(1, 4864);
        super.field337.method3220(0, 1);
        if (this.field8439.field412) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field337.method3220(0, 0);
        this.field8434.method915((byte) 95);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)Z", line = 144)
    public static final boolean method3415(int arg0, int arg1, int arg2) {
        if (arg1 != 29965) {
            field8445 = -86;
        }
        ++field8437;
        return (class630.method3525(arg0, true, arg2) | class577.method3293((byte) 112, arg2, arg0) | class141.method990(arg0, arg2, -27160)) & class308.method1868((byte) -127, arg0, arg2);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 157)
    public static void method3416(int arg0) {
        field8448 = null;
        if (arg0 == 28818) {
            field8441 = null;
            field8446 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILvf;)V", line = 173)
    public final void method257(int arg0, int arg1, class136 arg2) {
        if (arg1 != -10479) {
            this.method260(true);
        }
        ++field8438;
        super.field337.method3206(arg2, (byte) 26);
        super.field337.method3205(arg1 ^ -15598, arg0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)V", line = 185)
    public final void method263(boolean arg0, int arg1) {
        if (arg1 != 8) {
            field8441 = null;
        }
        ++field8435;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)Z", line = 195)
    public final boolean method260(boolean arg0) {
        if (arg0) {
            field8447 = 116;
        }
        ++field8442;
        return true;
    }
}
