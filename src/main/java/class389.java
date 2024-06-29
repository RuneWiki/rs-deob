import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class389 extends class591 {

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    private int field5457 = -1;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    private int field5460 = -1;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public int field5456;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "Lmaa;")
    public static class433 field5461 = new class433("", 11);

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "Lhs;")
    public static class295 field5463 = new class295(2, 1);

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "Lpj;")
    public static class132 field5462;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "[I")
    public static int[] field5464;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 3)
    public final void method1953(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field5460, this.field5457, 3553, 0, 0);
        ++field5458;
        this.field5460 = arg0;
        this.field5457 = -1;
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)I", line = 13)
    public static final int method2236(int arg0) {
        if (arg0 != 34067) {
            field5461 = null;
        }
        ++field5455;
        return class85.field1170;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Len;IIZ[[I)V", line = 27)
    public class389(class289 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field5456 = arg2;
        super.field8237.method1804(false, this);
        if (arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                client.method1642(super.field8237.field4282, arg2, arg4[var6], 1, 32993, var6 + 34069, arg2, super.field8226);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field8226, arg2, arg2, 0, 32993, super.field8237.field4282, arg4[var7], 0);
            }
        }
        this.method3288(0, true);
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Len;II)V", line = 91)
    public class389(class289 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field5456 = arg2;
        super.field8237.method1804(false, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field8226, arg2, arg2, 0, class448.method2575((byte) -111, super.field8226), 5121, (byte[]) null, 0);
        }
        this.method3288(0, true);
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Len;IIZ[[BI)V", line = 116)
    public class389(class289 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field5456 = arg2;
        super.field8237.method1804(false, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field8226, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method3288(0, true);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIZI)V", line = 64)
    public final void method2237(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg4, arg0, arg2, super.field8231, arg1);
        ++field5459;
        this.field5457 = arg0;
        this.field5460 = arg4;
        if (!arg3) {
            this.field5457 = -18;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)V", line = 77)
    public static void method2238(byte arg0) {
        field5464 = null;
        if (arg0 == 16) {
            field5461 = null;
            field5463 = null;
            field5462 = null;
        }
    }
}
