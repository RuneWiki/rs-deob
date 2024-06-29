import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class428 extends class454 {

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
    private int field6361 = -1;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    private int field6366 = -1;

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
    public int field6368;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "[B")
    public static byte[] field6363 = new byte[2048];

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field6365 = new String[100];

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "Lhn;")
    public static class509 field6364 = new class509(16, 8);

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
    public static int field6372 = 0;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 3)
    public final void method1031(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field6361, this.field6366, 3553, 0, 0);
        ++field6369;
        this.field6361 = -1;
        this.field6366 = -1;
        if (arg0 <= 98) {
            this.method1031(-63);
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lkd;II)V", line = 16)
    public class428(class188 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field6368 = arg2;
        super.field6619.method1289(-19391, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field6616, arg2, arg2, 0, class491.method2920((byte) 85, super.field6616), 5121, (byte[]) null, 0);
        }
        this.method2757(true, -83);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)I", line = 33)
    public static final int method2667(int arg0, int arg1, int arg2) {
        if (arg0 >= -40) {
            field6365 = null;
        }
        ++field6370;
        return arg1 != 4 && ~arg1 != -6 ? 256 : class357.field5290[arg2 & 3];
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V", line = 51)
    public static void method2668(boolean arg0) {
        field6364 = null;
        field6363 = null;
        field6365 = null;
        if (!arg0) {
            method2670(46, (char) 65420);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZIIII)V", line = 64)
    public final void method2669(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg2, arg3, arg4, super.field6609, arg1);
        ++field6367;
        this.field6361 = arg2;
        this.field6366 = arg3;
        if (arg0) {
            field6364 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lkd;IIZ[[BI)V", line = 77)
    public class428(class188 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field6368 = arg2;
        super.field6619.method1289(-19391, this);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field6616, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2757(true, -51);
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lkd;IIZ[[I)V", line = 101)
    public class428(class188 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field6368 = arg2;
        super.field6619.method1289(-19391, this);
        if (!arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field6616, arg2, arg2, 0, 32993, super.field6619.field3078, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                class26.method183(arg4[var7], super.field6619.field3078, -792335088, arg2, var7 + 34069, arg2, 32993, super.field6616);
            }
        }
        this.method2757(true, -68);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IC)Z", line = 132)
    public static final boolean method2670(int arg0, char arg1) {
        ++field6362;
        if (arg0 >= -71) {
            return false;
        } else if (~arg1 <= -33 && ~arg1 >= -127) {
            return true;
        } else if (arg1 >= 160 && arg1 <= 255) {
            return true;
        } else {
            return ~arg1 == -8365 || ~arg1 == -339 || arg1 == 8212 || ~arg1 == -340 || arg1 == 376;
        }
    }
}
