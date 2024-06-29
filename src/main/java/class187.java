import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class187 extends class197 {

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    private int field2286 = -1;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    private int field2284 = -1;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    public int field2289;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "Ljn;")
    public static class668 field2287;

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lkga;II)V")
    public class187(class506 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field2289 = arg2;
        super.field2388.method2932(true, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field2394, arg2, arg2, 0, class215.method1313((byte) -96, super.field2394), 5121, (byte[]) null, 0);
        }
        this.method1211(true, (byte) 33);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public final void method1160(byte arg0) {
        ++field2283;
        OpenGL.glFramebufferTexture2DEXT(this.field2284, this.field2286, 3553, 0, 0);
        this.field2284 = -1;
        this.field2286 = -1;
        int var2 = -73 / ((arg0 - -50) / 54);
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lkga;IIZ[[BI)V")
    public class187(class506 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field2289 = arg2;
        super.field2388.method2932(true, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field2394, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1211(true, (byte) 33);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIII)V")
    public final void method1161(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2285;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg4, super.field2397, arg3);
        if (arg1 != 6) {
            this.field2289 = -31;
        }
        this.field2286 = arg2;
        this.field2284 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lkga;IIZ[[I)V")
    public class187(class506 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field2289 = arg2;
        super.field2388.method2932(true, this);
        if (!arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field2394, arg2, arg2, 0, 32993, super.field2388.field7310, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class375.method2180(34069 - -var7, arg2, super.field2388.field7310, 32993, super.field2394, 0, arg2, arg4[var7]);
            }
        }
        this.method1211(true, (byte) 33);
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V")
    public static void method1162(int arg0) {
        if (arg0 == 7585) {
            field2287 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BII)Z")
    public static final boolean method1163(byte arg0, int arg1, int arg2) {
        ++field2288;
        if (arg0 != 64) {
            method1163((byte) 39, -81, -104);
        }
        return ~(256 & arg1) != -1;
    }
}
