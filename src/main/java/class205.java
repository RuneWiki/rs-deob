import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class205 extends class252 {

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "I")
    private int field2704 = -1;

    @OriginalMember(owner = "client!wt", name = "A", descriptor = "I")
    private int field2709 = -1;

    @OriginalMember(owner = "client!wt", name = "D", descriptor = "I")
    public int field2712;

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "I")
    public int field2708;

    @OriginalMember(owner = "client!wt", name = "C", descriptor = "I")
    public int field2711;

    @OriginalMember(owner = "client!wt", name = "y", descriptor = "Ljc;")
    public static class305 field2707 = new class305(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!wt", name = "E", descriptor = "Lho;")
    public static class103 field2713 = new class103(35, -1);

    @OriginalMember(owner = "client!wt", name = "w", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!wt", name = "x", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!wt", name = "B", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "(I)V")
    public static void method1303(int arg0) {
        field2713 = null;
        if (arg0 != 32879) {
            field2713 = null;
        }
        field2707 = null;
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lur;IIII[BI)V")
    public class205(class377 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field2712 = arg2;
        this.field2708 = arg3;
        this.field2711 = arg4;
        super.field3354.method2236(this, 107);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field3364, 0, super.field3356, this.field2712, this.field2708, this.field2711, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1555((byte) 120, true);
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lur;IIII)V")
    public class205(class377 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field2712 = arg2;
        this.field2711 = arg4;
        this.field2708 = arg3;
        super.field3354.method2236(this, 99);
        OpenGL.glTexImage3Dub(super.field3364, 0, super.field3356, this.field2712, this.field2708, this.field2711, 0, class105.method639(-80, super.field3356), 5121, (byte[]) null, 0);
        this.method1555((byte) 116, true);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIIIIBI)V")
    public final void method1304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        ++field2706;
        if (arg6 != -96) {
            this.field2711 = -75;
        }
        super.field3354.method2236(this, 125);
        OpenGL.glCopyTexSubImage3D(super.field3364, 0, arg4, arg3, arg2, arg1, arg7, arg0, arg5);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
    public final void method863(byte arg0) {
        ++field2710;
        OpenGL.glFramebufferTexture3DEXT(this.field2704, this.field2709, super.field3364, 0, 0, 0);
        this.field2709 = -1;
        if (arg0 != 103) {
            this.method863((byte) 110);
        }
        this.field2704 = -1;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)V")
    public static final void method1305(boolean arg0) {
        class94.field1120 = 0;
        if (arg0) {
            method1305(true);
        }
        ++field2705;
        int var1 = (class96.field1170.field3704 >> 7) + class357.field4867;
        int var2 = (class96.field1170.field3694 >> 7) + class418.field6074;
        if (~var1 <= -3054 && var1 <= 3156 && var2 >= 3056 && ~var2 >= -3137) {
            class94.field1120 = 1;
        }
        if (~var1 <= -3073 && var1 <= 3118 && var2 >= 9492 && ~var2 >= -9536) {
            class94.field1120 = 1;
        }
        if (~class94.field1120 == -2 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && ~var2 >= -3063) {
            class94.field1120 = 0;
        }
    }
}
