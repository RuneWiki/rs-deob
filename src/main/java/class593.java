import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class593 extends class213 {

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "Lmc;")
    private class381 field8139;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "Lrba;")
    private class494 field8140;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "Lwaa;")
    private class536 field8134;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "Z")
    public static boolean field8135 = false;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field8138 = 0;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field8128;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field8132;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field8133;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILaw;)V", line = 4)
    public final void method19(int arg0, int arg1, class619 arg2) {
        ++field8131;
        if (arg1 != 8) {
            method3298(false, (byte) 50);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V", line = 16)
    public final void method28(int arg0, int arg1, int arg2) {
        if (this.field8140.field6681) {
            float var4 = (float) (super.field2766.field4453 % 4000) / 4000.0F;
            super.field2766.method1884(this.field8140.field6679, arg0 + 16593);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
        } else {
            int var5 = super.field2766.field4453 % 4000 * 16 / 4000;
            super.field2766.method1884(this.field8140.field6678[var5], -2);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        ++field8133;
        if (arg0 != -16595) {
            this.field8140 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)Z", line = 43)
    public final boolean method22(byte arg0) {
        ++field8130;
        if (arg0 != 75) {
            field8129 = 93;
        }
        return this.field8134 != null;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(ZI)V", line = 55)
    public final void method17(boolean arg0, int arg1) {
        ++field8132;
        OpenGL.glBindProgramARB(34336, this.field8134.field7368);
        if (arg1 < 37) {
            method3298(true, (byte) 95);
        }
        OpenGL.glEnable(34336);
        super.field2766.method1997(class668.field9495, 0, -83);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(ZI)V", line = 69)
    public final void method23(boolean arg0, int arg1) {
        ++field8128;
        super.field2766.method1917(false, class129.field1635, class66.field868);
        if (arg1 != -18) {
            field8135 = false;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 82)
    public final void method20(int arg0) {
        super.field2766.method1997(class322.field4722, 0, -63);
        ++field8137;
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        if (arg0 > 32) {
            OpenGL.glDisable(34336);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZB)V", line = 102)
    public static final void method3298(boolean arg0, byte arg1) {
        if (arg1 > 92) {
            if (arg0) {
                if (~class316.field4599 != 0) {
                    class313.method2025(-108, class316.field4599);
                }
                for (class524 var2 = (class524) class54.field742.method2499(-81); var2 != null; var2 = (class524) class54.field742.method2503(0)) {
                    if (!var2.method174(64)) {
                        var2 = (class524) class54.field742.method2499(-31);
                        if (var2 == null) {
                            break;
                        }
                    }
                    class63.method389(true, false, var2, -76);
                }
                class316.field4599 = -1;
                class54.field742 = new class436(8);
                class327.method2095(-22991);
                class316.field4599 = class315.field4597;
                class255.method1599(false, true);
                class578.method3251((byte) 110);
                class317.method2041(class316.field4599);
            }
            ++field8136;
            class168.field2096 = true;
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lmc;Lpq;Lrba;)V", line = 147)
    public class593(class381 arg0, class159 arg1, class494 arg2) {
        super(arg0);
        this.field8139 = arg0;
        this.field8140 = arg2;
        if (this.field8140.method2788(72) && this.field8139.field5548) {
            this.field8134 = class316.method2039(this.field8139, arg1.method1063("gl", "transparent_water", 93), 0, 34336);
        } else {
            this.field8134 = null;
        }
    }
}
