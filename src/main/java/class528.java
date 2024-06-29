import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class528 extends class128 {

    @OriginalMember(owner = "client!maa", name = "u", descriptor = "I")
    private int field6702 = -1;

    @OriginalMember(owner = "client!maa", name = "D", descriptor = "I")
    private int field6709 = -1;

    @OriginalMember(owner = "client!maa", name = "y", descriptor = "I")
    public int field6706;

    @OriginalMember(owner = "client!maa", name = "z", descriptor = "Z")
    public static boolean field6707 = true;

    @OriginalMember(owner = "client!maa", name = "B", descriptor = "Ljava/lang/String;")
    public static String field6708 = null;

    @OriginalMember(owner = "client!maa", name = "E", descriptor = "F")
    public static float field6710;

    @OriginalMember(owner = "client!maa", name = "v", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!maa", name = "w", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!maa", name = "x", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "(B)V", line = 3)
    public static void method2899(byte arg0) {
        field6708 = null;
        int var1 = -68 % ((arg0 - -4) / 38);
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lck;IIZ[[BI)V", line = 22)
    public class528(class733 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field6706 = arg2;
        super.field1709.method3975((byte) 115, this);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field1702, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method759(0, true);
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lck;II)V", line = 42)
    public class528(class733 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field6706 = arg2;
        super.field1709.method3975((byte) 122, this);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field1702, arg2, arg2, 0, class316.method1848(super.field1702, -102), 5121, (byte[]) null, 0);
        }
        this.method759(0, true);
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lck;IIZ[[I)V", line = 63)
    public class528(class733 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field6706 = arg2;
        super.field1709.method3975((byte) 123, this);
        if (!arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field1702, arg2, arg2, 0, 32993, super.field1709.field9887, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class87.method538(super.field1702, arg2, 112, var7 + 34069, 32993, super.field1709.field9887, arg4[var7], arg2);
            }
        }
        this.method759(0, true);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)V", line = 94)
    public final void method760(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field6709, this.field6702, 3553, 0, 0);
        ++field6704;
        int var2 = -126 % ((65 - arg0) / 52);
        this.field6709 = -1;
        this.field6702 = -1;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IBIII)V", line = 111)
    public final void method2900(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 25) {
            field6707 = false;
        }
        ++field6703;
        OpenGL.glFramebufferTexture2DEXT(arg3, arg4, arg0, super.field1707, arg2);
        this.field6709 = arg3;
        this.field6702 = arg4;
    }
}
