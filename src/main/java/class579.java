import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class579 extends class512 {

    @OriginalMember(owner = "client!po", name = "u", descriptor = "Lsb;")
    private class93 field8276;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "Ljo;")
    private class20 field8273;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "Loha;")
    private class445 field8275;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public static int field8270;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "I")
    public static int field8274;

    @OriginalMember(owner = "client!po", name = "v", descriptor = "I")
    public static int field8277;

    @OriginalMember(owner = "client!po", name = "w", descriptor = "I")
    public static int field8278;

    @OriginalMember(owner = "client!po", name = "x", descriptor = "I")
    public static int field8279;

    @OriginalMember(owner = "client!po", name = "y", descriptor = "I")
    public static int field8280;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "Lwu;")
    public static class557 field8272;

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lsb;Lwu;Ljo;)V")
    public class579(class93 arg0, class557 arg1, class20 arg2) {
        super(arg0);
        this.field8276 = arg0;
        this.field8273 = arg2;
        if (arg1 != null && this.field8273.method96(-114) && this.field8276.field1360) {
            this.field8275 = class477.method2822(this.field8276, (byte) 44, arg1.method3330((byte) 67, "transparent_water", "gl"), 34336);
        } else {
            this.field8275 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lua;I)V")
    public static final void method3449(class3 arg0, int arg1) {
        if (arg0.field8 != null) {
            arg0.field8.field3702 = 0;
        }
        arg0.field7 = false;
        ++field8271;
        if (arg1 <= -9) {
            for (class3 var2 = arg0.method8(); var2 != null; var2 = arg0.method4()) {
                method3449(var2, -81);
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIZ)V")
    public final void method38(int arg0, int arg1, boolean arg2) {
        ++field8278;
        if (this.field8273.field247) {
            float var4 = (float) (super.field7153.field6811 % 4000) / 4000.0F;
            super.field7153.method2933((byte) -50, this.field8273.field244);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
        } else {
            int var5 = super.field7153.field6811 % 4000 * 16 / 4000;
            super.field7153.method2933((byte) 105, this.field8273.field242[var5]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        if (arg2) {
            this.field8276 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ZZ)V")
    public final void method33(boolean arg0, boolean arg1) {
        ++field8279;
        if (!arg0) {
            this.method40(76, 102, (class117) null);
        }
        super.field7153.method2878(class35.field498, 28768, class253.field3501);
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "(I)Z")
    public final boolean method35(int arg0) {
        int var2 = -120 % ((arg0 - -72) / 37);
        ++field8280;
        return this.field8275 != null;
    }

    @OriginalMember(owner = "client!po", name = "f", descriptor = "(I)V")
    public static void method3450(int arg0) {
        if (arg0 < 76) {
            method3449((class3) null, 56);
        }
        field8272 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IZ)V")
    public final void method36(int arg0, boolean arg1) {
        OpenGL.glBindProgramARB(34336, this.field8275.field6085);
        ++field8277;
        OpenGL.glEnable(34336);
        super.field7153.method2946(0, class214.field3017, (byte) 127);
        if (arg0 >= -62) {
            this.method39(-5);
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
    public final void method39(int arg0) {
        super.field7153.method2946(0, class186.field2725, (byte) 127);
        ++field8274;
        OpenGL.glBindProgramARB(34336, 0);
        if (arg0 == 6) {
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IILlo;)V")
    public final void method40(int arg0, int arg1, class117 arg2) {
        ++field8270;
        if (arg1 != -37) {
            this.method33(true, true);
        }
    }
}
