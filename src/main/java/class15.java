import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class15 extends class238 {

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
    private int field116 = -1;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
    private int field120 = -1;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    public int field117;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public static int field113 = -1;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    public static int field119 = 0;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V", line = 4)
    public final void method112(byte arg0) {
        ++field118;
        OpenGL.glFramebufferTexture2DEXT(this.field120, this.field116, 3553, 0, 0);
        this.field116 = -1;
        this.field120 = -1;
        if (arg0 != 53) {
            this.method112((byte) 30);
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lmh;II)V", line = 17)
    public class15(class537 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field117 = arg2;
        super.field2988.method3083((byte) 111, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field2990, arg2, arg2, 0, class13.method105(6410, super.field2990), 5121, (byte[]) null, 0);
        }
        this.method1358((byte) 115, true);
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lmh;IIZ[[BI)V", line = 38)
    public class15(class537 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field117 = arg2;
        super.field2988.method3083((byte) 110, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field2990, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1358((byte) 118, true);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII)V", line = 58)
    public final void method113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 6) {
            this.field117 = -70;
        }
        OpenGL.glFramebufferTexture2DEXT(arg1, arg2, arg4, super.field2992, arg3);
        ++field114;
        this.field120 = arg1;
        this.field116 = arg2;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lmh;IIZ[[I)V", line = 72)
    public class15(class537 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field117 = arg2;
        super.field2988.method3083((byte) 70, this);
        if (arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                class313.method1738(var6 + 34069, super.field2990, arg4[var6], 98, arg2, arg2, 32993, super.field2988.field7776);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field2990, arg2, arg2, 0, 32993, super.field2988.field7776, arg4[var7], 0);
            }
        }
        this.method1358((byte) 126, true);
    }
}
