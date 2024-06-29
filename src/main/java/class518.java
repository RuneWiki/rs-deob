import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class518 extends class87 {

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    private int field7355 = -1;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    private int field7354 = -1;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    public int field7358;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field7356;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public static int field7357;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)V")
    public final void method3079(int arg0, int arg1, int arg2, int arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg0, arg4, arg1, super.field1568, arg2);
        ++field7353;
        this.field7355 = arg4;
        if (arg3 == 0) {
            this.field7354 = arg0;
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Loea;IIZ[[BI)V")
    public class518(class594 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field7358 = arg2;
        super.field1571.method3425(this, 100);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field1562, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method818(true, (byte) 11);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Loea;II)V")
    public class518(class594 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field7358 = arg2;
        super.field1571.method3425(this, 63);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field1562, arg2, arg2, 0, class634.method3649(super.field1562, (byte) -101), 5121, (byte[]) null, 0);
        }
        this.method818(true, (byte) 11);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public final void method827(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field7354, this.field7355, 3553, arg0, 0);
        ++field7356;
        this.field7354 = -1;
        this.field7355 = -1;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Loea;IIZ[[I)V")
    public class518(class594 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field7358 = arg2;
        super.field1571.method3425(this, 90);
        if (!arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field1562, arg2, arg2, 0, 32993, super.field1571.field8651, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                class77.method773(-6, arg2, super.field1571.field8651, arg4[var7], 34069 - -var7, arg2, 32993, super.field1562);
            }
        }
        this.method818(true, (byte) 11);
    }
}
