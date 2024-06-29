import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class283 extends class509 {

    @OriginalMember(owner = "client!al", name = "t", descriptor = "Lqba;")
    private class540 field4184;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "Lui;")
    private class588 field4183;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "Lon;")
    private class596 field4182;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "Lnj;")
    public static class487 field4186 = new class487("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!al", name = "B", descriptor = "I")
    public static int field4192 = 0;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZILmn;)V", line = 8)
    public final void method42(boolean arg0, int arg1, class60 arg2) {
        ++field4185;
        if (!arg0) {
            field4186 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZB)V", line = 18)
    public final void method35(boolean arg0, byte arg1) {
        OpenGL.glBindProgramARB(34336, this.field4182.field8783);
        ++field4181;
        OpenGL.glEnable(34336);
        int var3 = 44 % ((arg1 - 40) / 36);
        super.field7558.method1160(0, (byte) -113, class352.field5118);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)Z", line = 30)
    public static final boolean method1773(int arg0, int arg1) {
        if (arg1 != -3) {
            return false;
        } else {
            ++field4188;
            return ~arg0 == -3 || arg0 == 6 || arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IBI)V", line = 41)
    public final void method43(int arg0, byte arg1, int arg2) {
        ++field4193;
        if (this.field4183.field8722) {
            float var4 = (float) (super.field7558.field2599 % 4000) / 4000.0F;
            super.field7558.method1152(this.field4183.field8721, true);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
        } else {
            int var5 = super.field7558.field2599 % 4000 * 16 / 4000;
            super.field7558.method1152(this.field4183.field8728[var5], true);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        if (arg1 != -60) {
            method1774(-68);
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V", line = 68)
    public final void method38(byte arg0) {
        if (arg0 != 59) {
            method1773(4, 70);
        }
        super.field7558.method1160(0, (byte) -113, class248.field3625);
        ++field4189;
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lqba;Ldda;Lui;)V", line = 87)
    public class283(class540 arg0, class597 arg1, class588 arg2) {
        super(arg0);
        this.field4184 = arg0;
        this.field4183 = arg2;
        if (this.field4183.method3432(true) && this.field4184.field8074) {
            this.field4182 = class483.method2925(arg1.method3466("transparent_water", 0, "gl"), -29157, this.field4184, 34336);
        } else {
            this.field4182 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)Z", line = 106)
    public final boolean method40(int arg0) {
        ++field4187;
        if (arg0 <= 44) {
            return true;
        } else {
            return this.field4182 != null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZ)V", line = 118)
    public final void method39(int arg0, boolean arg1) {
        if (arg0 != 0) {
            method1774(-42);
        }
        ++field4191;
        super.field7558.method1102(class43.field527, class308.field4477, arg0 + 126);
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V", line = 132)
    public static void method1774(int arg0) {
        if (arg0 == 0) {
            field4186 = null;
        }
    }
}
