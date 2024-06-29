import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class243 extends class487 {

    @OriginalMember(owner = "client!mda", name = "w", descriptor = "I")
    private int field3670 = -1;

    @OriginalMember(owner = "client!mda", name = "u", descriptor = "I")
    private int field3668 = -1;

    @OriginalMember(owner = "client!mda", name = "x", descriptor = "I")
    public int field3671;

    @OriginalMember(owner = "client!mda", name = "y", descriptor = "Lsl;")
    public static class427 field3672 = new class427(32);

    @OriginalMember(owner = "client!mda", name = "z", descriptor = "Lqfa;")
    public static class85 field3673 = new class85(16, 1);

    @OriginalMember(owner = "client!mda", name = "t", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!mda", name = "v", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!mda", name = "A", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIIII)V")
    public final void method1610(int arg0, int arg1, int arg2, int arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg2, super.field6972, arg3);
        if (arg4 != 0) {
            this.field3668 = 81;
        }
        ++field3667;
        this.field3670 = arg1;
        this.field3668 = arg0;
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lus;IIZ[[BI)V")
    public class243(class1 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field3671 = arg2;
        super.field6977.method5(3845, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field6971, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2939(true, (byte) -69);
    }

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "(I)V")
    public static void method1611(int arg0) {
        field3672 = null;
        if (arg0 != -1) {
            field3672 = null;
        }
        field3673 = null;
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lus;IIZ[[I)V")
    public class243(class1 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field3671 = arg2;
        super.field6977.method5(3845, this);
        if (!arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(34069 - -var6, 0, super.field6971, arg2, arg2, 0, 32993, super.field6977.field320, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                class432.method2629(var7 + 34069, arg4[var7], (byte) 36, 32993, arg2, super.field6977.field320, arg2, super.field6971);
            }
        }
        this.method2939(true, (byte) -69);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V")
    public final void method1612(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field3668, this.field3670, 3553, 0, 0);
        ++field3669;
        this.field3668 = -1;
        if (arg0 < 114) {
            this.field3670 = -56;
        }
        this.field3670 = -1;
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lus;II)V")
    public class243(class1 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field3671 = arg2;
        super.field6977.method5(3845, this);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field6971, arg2, arg2, 0, class502.method2994(-127, super.field6971), 5121, (byte[]) null, 0);
        }
        this.method2939(true, (byte) -69);
    }
}
