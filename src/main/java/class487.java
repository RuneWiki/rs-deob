import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class487 extends class271 {

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    private int field7246 = -1;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    private int field7251 = -1;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public int field7244;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field7253 = 999999;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public static int field7252 = -1;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "Lfp;")
    public static class437 field7248 = new class437(2, 4, 4, 0);

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public static int field7254 = 500;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "Luv;")
    public static class2 field7255 = new class2(4, 3);

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lvd;IIZ[[I)V")
    public class487(class258 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field7244 = arg2;
        super.field4047.method1546(-2, this);
        if (!arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field4044, arg2, arg2, 0, 32993, super.field4047.field3846, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class465.method2703(arg2, var7 + 34069, super.field4044, arg4[var7], arg2, (byte) -52, super.field4047.field3846, 32993);
            }
        }
        this.method1693(true, (byte) -95);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Z")
    public static final boolean method2910(int arg0, int arg1, int arg2) {
        int var3 = 97 % ((-69 - arg2) / 32);
        ++field7250;
        return ~(540800 & arg0) != -1;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lvd;IIZ[[BI)V")
    public class487(class258 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field7244 = arg2;
        super.field4047.method1546(-2, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field4044, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1693(true, (byte) -115);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public final void method737(int arg0) {
        if (arg0 != 6407) {
            field7248 = null;
        }
        OpenGL.glFramebufferTexture2DEXT(this.field7246, this.field7251, 3553, 0, 0);
        ++field7245;
        this.field7246 = -1;
        this.field7251 = -1;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lvd;II)V")
    public class487(class258 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field7244 = arg2;
        super.field4047.method1546(-2, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field4044, arg2, arg2, 0, class399.method2406(super.field4044, true), 5121, (byte[]) null, 0);
        }
        this.method1693(true, (byte) -85);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(Z)V")
    public static void method2911(boolean arg0) {
        field7248 = null;
        field7255 = null;
        if (arg0) {
            method2911(false);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZII)V")
    public final void method2912(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg4, arg0, arg1, super.field4042, arg3);
        ++field7249;
        this.field7251 = arg0;
        this.field7246 = arg4;
        if (arg2) {
            field7254 = -48;
        }
    }
}
