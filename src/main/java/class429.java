import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class429 extends class36 {

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    private int field6152 = -1;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    private int field6153 = -1;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public int field6155;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "[Lgt;")
    public static class456[] field6148 = new class456[50];

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "[J")
    public static long[] field6147;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field6149;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIII)V")
    public final void method2613(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6150;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg1, super.field878, arg3);
        if (arg4 != -1) {
            field6149 = null;
        }
        this.field6153 = arg0;
        this.field6152 = arg2;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lqo;II)V")
    public class429(class22 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field6155 = arg2;
        super.field870.method256((byte) -81, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field877, arg2, arg2, 0, class397.method2484(true, super.field877), 5121, (byte[]) null, 0);
        }
        this.method456(9728, true);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public final void method457(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field6153, this.field6152, 3553, 0, 0);
        ++field6151;
        this.field6152 = -1;
        if (arg0 != -3022) {
            field6154 = 60;
        }
        this.field6153 = -1;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lqo;IIZ[[BI)V")
    public class429(class22 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field6155 = arg2;
        super.field870.method256((byte) -127, this);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field877, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method456(9728, true);
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lqo;IIZ[[I)V")
    public class429(class22 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field6155 = arg2;
        super.field870.method256((byte) -77, this);
        if (arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                class321.method2054(var6 + 34069, super.field877, arg2, super.field870.field634, arg2, arg4[var6], 32993, -83);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field877, arg2, arg2, 0, 32993, super.field870.field634, arg4[var7], 0);
            }
        }
        this.method456(9728, true);
    }

    @OriginalMember(owner = "client!q", name = "f", descriptor = "(I)V")
    public static void method2614(int arg0) {
        field6149 = null;
        field6147 = null;
        field6148 = null;
        if (arg0 != -1) {
            field6149 = null;
        }
    }
}
