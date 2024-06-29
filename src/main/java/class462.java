import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class462 extends class141 {

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "Lpt;")
    private class376 field6683;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "Luv;")
    private class250 field6687;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "Lhl;")
    public static class375 field6679 = new class375(16);

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "Lqv;")
    public static class316 field6686 = new class316(83, 2);

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lbt;Lpt;)V")
    public class462(class33 arg0, class376 arg1) {
        super(arg0);
        this.field6683 = arg1;
        this.field6687 = new class250(arg0, 2);
        this.field6687.method1622(0, (byte) 69);
        super.field2178.method277(1, (byte) 124);
        if (this.field6683.field5415) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field2178.method277(0, (byte) 62);
        this.field6687.method1624(-22853);
        this.field6687.method1622(1, (byte) 69);
        super.field2178.method277(1, (byte) 111);
        if (this.field6683.field5415) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field2178.method277(0, (byte) 89);
        this.field6687.method1624(-22853);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lei;II)V")
    public final void method57(class120 arg0, int arg1, int arg2) {
        super.field2178.method285(false, arg0);
        ++field6678;
        if (arg2 < 89) {
            field6686 = null;
        }
        super.field2178.method249(arg1, -2);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public final void method48(int arg0) {
        int var2 = 11 / ((-51 - arg0) / 45);
        ++field6682;
        this.field6687.method1625('\u0001', (byte) -36);
        super.field2178.method277(1, (byte) 102);
        super.field2178.method285(false, (class120) null);
        super.field2178.method277(0, (byte) 125);
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)V")
    public static void method2736(int arg0) {
        field6679 = null;
        if (arg0 == -27919) {
            field6686 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)V")
    public final void method51(int arg0, boolean arg1) {
        this.field6687.method1625('\u0000', (byte) -36);
        ++field6688;
        if (this.field6683.field5415) {
            super.field2178.method277(1, (byte) 127);
            super.field2178.method285(false, this.field6683.field5408);
            super.field2178.method277(0, (byte) 106);
        }
        if (arg0 != -21897) {
            this.field6683 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI)V")
    public final void method53(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.field6683 = null;
        }
        ++field6680;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)Z")
    public final boolean method55(int arg0) {
        ++field6684;
        return arg0 == 0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBI)I")
    public static final int method2737(int arg0, byte arg1, int arg2) {
        int var3 = -62 / ((arg1 - 64) / 34);
        ++field6677;
        return ~arg2 != -2 && ~arg2 != -4 ? class293.field4355[arg0 & 3] : class474.field6916[arg0 & 3];
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public static final void method2738(byte arg0) {
        ++field6676;
        class212.field3194.method3103(4);
        class276.field4124.field7558 = 0;
        class269.field4041 = null;
        class30.field405 = null;
        class501.field7244 = null;
        if (arg0 != 41) {
            method2738((byte) 21);
        }
        class246.field3680 = 0;
        class126.field1986 = null;
        class505.field7301 = 0;
        class336.field4966.field7558 = 0;
        class58.method495((byte) -79);
        class248.field3713 = null;
        class491.field7085 = 0;
        class290.field4314 = 0;
        class524.field7653 = null;
        class413.field5842 = 0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIII)V")
    public static final void method2739(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            field6686 = null;
        }
        ++field6681;
        if (~(-arg4 + arg2) <= ~class465.field6763 && arg2 + arg4 <= class176.field2630 && -arg4 + arg0 >= class424.field5996 && arg0 + arg4 <= class333.field4936) {
            class424.method2511(arg4, arg1, 2, arg2, arg0);
        } else {
            class222.method1511(arg2, arg0, arg1, arg4, 74);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V")
    public final void method49(int arg0, int arg1, int arg2) {
        ++field6685;
        float var4 = (float) ((arg2 & 3) + 1) * -5.0E-4F;
        if (arg0 != 1400) {
            field6679 = null;
        }
        float var5 = (float) (((27 & arg2) >> 3) + 1) * 5.0E-4F;
        float var6 = ~(arg2 & 64) == -1 ? 4.8828125E-4F : 9.765625E-4F;
        super.field2178.method277(1, (byte) 93);
        boolean var7 = ~(128 & arg2) != -1;
        if (var7) {
            class315.field4690[2] = 0.0F;
            class315.field4690[1] = 0.0F;
            class315.field4690[3] = 0.0F;
            class315.field4690[0] = var6;
        } else {
            class315.field4690[0] = 0.0F;
            class315.field4690[1] = 0.0F;
            class315.field4690[3] = 0.0F;
            class315.field4690[2] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class315.field4690, 0);
        class315.field4690[1] = var6;
        class315.field4690[2] = 0.0F;
        class315.field4690[0] = 0.0F;
        class315.field4690[3] = (float) super.field2178.field625 * var4 % 1.0F;
        OpenGL.glTexGenfv(8193, 9474, class315.field4690, 0);
        if (!this.field6683.field5415) {
            int var8 = (int) ((float) super.field2178.field625 * var5 * 16.0F);
            super.field2178.method285(false, this.field6683.field5409[var8 % 16]);
        } else {
            class315.field4690[1] = 0.0F;
            class315.field4690[3] = (float) super.field2178.field625 * var5 % 1.0F;
            class315.field4690[0] = 0.0F;
            class315.field4690[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class315.field4690, 0);
        }
        super.field2178.method277(0, (byte) 67);
    }
}
