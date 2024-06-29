import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class434 extends class384 {

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Lwt;")
    private class309 field6340;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "Lai;")
    private class597 field6336;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "Lkca;")
    private class82 field6345;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field6339 = -1;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)Z", line = 4)
    public final boolean method26(int arg0) {
        ++field6338;
        if (arg0 != 13326) {
            return true;
        } else {
            return this.field6345 != null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)V", line = 15)
    public final void method24(boolean arg0, int arg1) {
        ++field6343;
        OpenGL.glBindProgramARB(34336, this.field6345.field852);
        OpenGL.glEnable(34336);
        super.field5349.method2264(0, class324.field4136, (byte) 60);
        if (arg1 != -1) {
            this.field6345 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lke;BI)V", line = 30)
    public final void method27(class596 arg0, byte arg1, int arg2) {
        ++field6335;
        if (arg1 != 123) {
            field6339 = 83;
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lai;Loh;Lwt;)V", line = 42)
    public class434(class597 arg0, class404 arg1, class309 arg2) {
        super(arg0);
        this.field6340 = arg2;
        this.field6336 = arg0;
        if (arg1 != null && this.field6340.method1845((byte) -42) && this.field6336.field8512) {
            this.field6345 = class702.method3942(this.field6336, arg1.method2471((byte) -122, "gl", "transparent_water"), 0, 34336);
        } else {
            this.field6345 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V", line = 58)
    public final void method31(byte arg0) {
        super.field5349.method2264(0, class424.field6157, (byte) 60);
        ++field6342;
        if (arg0 > -18) {
            this.method24(true, 34);
        }
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIZ)V", line = 72)
    public final void method32(int arg0, int arg1, boolean arg2) {
        if (this.field6340.field3849) {
            float var4 = (float) (super.field5349.field5152 % 4000) / 4000.0F;
            super.field5349.method2207((byte) -61, this.field6340.field3846);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
        } else {
            int var5 = super.field5349.field5152 % 4000 * 16 / 4000;
            super.field5349.method2207((byte) -61, this.field6340.field3843[var5]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        ++field6341;
        if (!arg2) {
            this.method32(118, -66, false);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I", line = 105)
    public static final int method2714(int arg0, int arg1) {
        if (arg0 < 94) {
            method2714(-59, -15);
        }
        ++field6337;
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZB)V", line = 117)
    public final void method30(boolean arg0, byte arg1) {
        super.field5349.method2242(-63, class360.field4624, class94.field989);
        ++field6344;
        if (arg1 < 78) {
            field6339 = 73;
        }
    }
}
