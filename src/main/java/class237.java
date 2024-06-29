import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class237 extends class14 {

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
    private int field3369 = -1;

    @OriginalMember(owner = "client!lr", name = "G", descriptor = "I")
    private int field3373 = -1;

    @OriginalMember(owner = "client!lr", name = "H", descriptor = "I")
    public int field3374;

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "Z")
    public static boolean field3370 = false;

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "Lsi;")
    public static class512 field3375 = new class512(11, 2);

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!lr", name = "F", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "Lqq;")
    public static class52 field3377;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(II)I")
    public static final int method1602(int arg0, int arg1) {
        ++field3376;
        if (arg0 >= -81) {
            field3377 = null;
        }
        if (arg1 < 96) {
            return 0;
        } else {
            return arg1 < 128 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lbv;II)V")
    public class237(class282 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field3374 = arg2;
        super.field241.method1787(this, (byte) 121);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field223, arg2, arg2, 0, class501.method2996(super.field223, (byte) 75), 5121, (byte[]) null, 0);
        }
        this.method123(false, true);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZIII)I")
    public static final int method1603(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            return 61;
        } else {
            int var4 = arg3 & 3;
            ++field3371;
            if (var4 == 0) {
                return arg2;
            } else if (var4 == 1) {
                return arg1;
            } else {
                return var4 == 2 ? -arg2 + 7 : 7 - arg1;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)V")
    public static void method1604(int arg0) {
        field3377 = null;
        if (arg0 >= 80) {
            field3375 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lbv;IIZ[[I)V")
    public class237(class282 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field3374 = arg2;
        super.field241.method1787(this, (byte) 121);
        if (arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                class352.method2226(true, super.field223, var6 + 34069, super.field241.field4121, arg2, arg4[var6], arg2, 32993);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field223, arg2, arg2, 0, 32993, super.field241.field4121, arg4[var7], 0);
            }
        }
        this.method123(false, true);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
    public final void method127(boolean arg0) {
        if (!arg0) {
            OpenGL.glFramebufferTexture2DEXT(this.field3369, this.field3373, 3553, 0, 0);
            ++field3367;
            this.field3373 = -1;
            this.field3369 = -1;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIII)V")
    public final void method1605(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3368;
        OpenGL.glFramebufferTexture2DEXT(arg4, arg2, arg0, super.field230, arg1);
        if (arg3 != -9454) {
            this.field3373 = 126;
        }
        this.field3369 = arg4;
        this.field3373 = arg2;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lbv;IIZ[[BI)V")
    public class237(class282 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field3374 = arg2;
        super.field241.method1787(this, (byte) 121);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field223, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method123(false, true);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IBI)I")
    public static final int method1606(int arg0, byte arg1, int arg2) {
        ++field3372;
        if (arg2 < arg0) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        if (arg1 != -10) {
            return 97;
        } else {
            while (arg0 != 0) {
                int var4 = arg2 % arg0;
                arg2 = arg0;
                arg0 = var4;
            }
            return arg2;
        }
    }
}
