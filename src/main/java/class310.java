import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class310 extends class412 {

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    private int field4017 = -1;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    private int field4020 = -1;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public int field4018;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V", line = 3)
    public final void method260(byte arg0) {
        ++field4021;
        OpenGL.glFramebufferTexture2DEXT(this.field4017, this.field4020, 3553, 0, 0);
        this.field4017 = -1;
        int var2 = 13 % (-arg0 / 38);
        this.field4020 = -1;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lap;II)V", line = 15)
    public class310(class435 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field4018 = arg2;
        super.field5478.method2388((byte) -97, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field5470, arg2, arg2, 0, class282.method1611(74, super.field5470), 5121, (byte[]) null, 0);
        }
        this.method2233((byte) -99, true);
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lap;IIZ[[BI)V", line = 45)
    public class310(class435 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field4018 = arg2;
        super.field5478.method2388((byte) 112, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field5470, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2233((byte) -99, true);
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lap;IIZ[[I)V", line = 81)
    public class310(class435 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field4018 = arg2;
        super.field5478.method2388((byte) -113, this);
        if (!arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field5470, arg2, arg2, 0, 32993, super.field5478.field6036, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                class484.method2813(super.field5470, arg4[var7], arg2, arg2, super.field5478.field6036, (byte) -81, var7 + 34069, 32993);
            }
        }
        this.method2233((byte) -99, true);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIII)V", line = 64)
    public final void method1761(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4019;
        OpenGL.glFramebufferTexture2DEXT(arg3, arg4, arg0, super.field5466, arg1);
        if (arg2 != -12765) {
            field4016 = -74;
        }
        this.field4020 = arg4;
        this.field4017 = arg3;
    }
}
