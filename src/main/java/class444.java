import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class444 extends class460 {

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    private int field6114 = -1;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    private int field6113 = -1;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public int field6108;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "F")
    public static float field6112;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lrda;IIZ[[BI)V", line = 6)
    public class444(class663 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field6108 = arg2;
        super.field6291.method3639(-2, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field6297, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2615(false, true);
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lrda;IIZ[[I)V", line = 26)
    public class444(class663 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field6108 = arg2;
        super.field6291.method3639(-2, this);
        if (!arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field6297, arg2, arg2, 0, 32993, super.field6291.field9083, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                class247.method1526(arg2, var7 + 34069, arg2, super.field6297, (byte) 34, arg4[var7], 32993, super.field6291.field9083);
            }
        }
        this.method2615(false, true);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILku;)I", line = 58)
    public static final int method2552(int arg0, class380 arg1) {
        ++field6110;
        if (class300.field4263 == arg1) {
            return 9216;
        } else if (class716.field9864 != arg1) {
            if (class536.field7059 == arg1) {
                return 34066;
            } else {
                int var2 = -10 / ((7 - arg0) / 52);
                throw new IllegalArgumentException();
            }
        } else {
            return 34065;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 81)
    public final void method2032(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field6113, this.field6114, 3553, 0, 0);
        if (arg0 < 106) {
            this.method2553(53, 96, -102, -103, true);
        }
        ++field6111;
        this.field6113 = -1;
        this.field6114 = -1;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lrda;II)V", line = 95)
    public class444(class663 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field6108 = arg2;
        super.field6291.method3639(-2, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field6297, arg2, arg2, 0, class555.method3088(super.field6297, 42), 5121, (byte[]) null, 0);
        }
        this.method2615(false, true);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZ)V", line = 119)
    public final void method2553(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg0, arg3, arg1, super.field6293, arg2);
        if (arg4) {
            this.field6108 = -18;
        }
        ++field6109;
        this.field6113 = arg0;
        this.field6114 = arg3;
    }
}
