import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class525 extends class695 {

    @OriginalMember(owner = "client!op", name = "r", descriptor = "[F")
    private float[] field6838 = new float[4];

    @OriginalMember(owner = "client!op", name = "m", descriptor = "Lne;")
    private class176 field6833;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "Lne;")
    private class176 field6839;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "Lne;")
    private class176 field6831;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "Lne;")
    private class176 field6835;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "Z")
    private boolean field6832;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "Lra;")
    public static class361 field6843 = new class361(97, -1);

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!op", name = "u", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!op", name = "x", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "Z")
    private boolean field6836;

    @OriginalMember(owner = "client!op", name = "y", descriptor = "Z")
    private boolean field6845;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V", line = 5)
    public final void method499(byte arg0) {
        ++field6830;
        int var2 = super.field9493.method3090(23203);
        class131 var3 = super.field9493.method3103((byte) 73);
        var3.method941(2, 0.0F, (float) var2, this.field6838, 0.0F, -1.0F);
        if (this.field6845) {
            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field6835.field2195 : this.field6839.field2195);
        } else {
            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field6831.field2195 : this.field6833.field2195);
        }
        OpenGL.glEnable(34336);
        if (arg0 < 61) {
            this.method488((class391) null, true, 63);
        }
        this.field6836 = true;
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field6838[0], this.field6838[1], this.field6838[2], this.field6838[3]);
        this.method500((byte) 76);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lnm;ZI)V", line = 34)
    public final void method488(class391 arg0, boolean arg1, int arg2) {
        super.field9493.method3091(!arg1, arg0);
        ++field6840;
        if (arg1) {
            this.field6833 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)Z", line = 45)
    public final boolean method494(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field6841;
            return this.field6832;
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V", line = 56)
    public final void method491(int arg0) {
        ++field6844;
        if (this.field6836) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field6836 = false;
        }
        if (arg0 < 38) {
            this.method495(42, true);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IZ)V", line = 76)
    public final void method495(int arg0, boolean arg1) {
        if (arg0 != 1) {
            method2808((byte) 99);
        }
        ++field6837;
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(B)V", line = 86)
    public final void method500(byte arg0) {
        if (arg0 != 76) {
            this.method495(-40, true);
        }
        if (this.field6836) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field9493.method361() + -1280), (float) (-768 + super.field9493.method361()), 1.0F / (float) super.field9493.method3134(0), (float) super.field9493.method3135(98) / 255.0F);
        }
        ++field6834;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(III)V", line = 100)
    public final void method489(int arg0, int arg1, int arg2) {
        ++field6842;
        if (arg2 <= 69) {
            this.method500((byte) 85);
        }
    }

    @OriginalMember(owner = "client!op", name = "e", descriptor = "(B)V", line = 114)
    public static void method2808(byte arg0) {
        field6843 = null;
        if (arg0 < 47) {
            method2808((byte) -126);
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lia;Lpe;)V", line = 141)
    public class525(class27 arg0, class615 arg1) {
        super(arg0);
        if (arg0.field428) {
            this.field6833 = class165.method1154(34336, arg1.method3355(0, "uw_ground_unlit", "gl"), 34379, arg0);
            this.field6839 = class165.method1154(34336, arg1.method3355(0, "uw_ground_lit", "gl"), 34379, arg0);
            this.field6831 = class165.method1154(34336, arg1.method3355(0, "uw_model_unlit", "gl"), 34379, arg0);
            this.field6835 = class165.method1154(34336, arg1.method3355(0, "uw_model_lit", "gl"), 34379, arg0);
            this.field6832 = this.field6835 != null & this.field6839 != null & this.field6833 != null & this.field6831 != null;
        } else {
            this.field6832 = false;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZB)V", line = 129)
    public final void method498(boolean arg0, byte arg1) {
        this.field6845 = arg0;
        ++field6846;
        if (arg1 >= -82) {
            this.method495(-56, false);
        }
    }
}
