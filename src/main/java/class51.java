import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class51 extends class185 {

    @OriginalMember(owner = "client!gda", name = "B", descriptor = "I")
    private int field650 = -1;

    @OriginalMember(owner = "client!gda", name = "D", descriptor = "I")
    private int field652 = -1;

    @OriginalMember(owner = "client!gda", name = "E", descriptor = "I")
    public int field653;

    @OriginalMember(owner = "client!gda", name = "C", descriptor = "I")
    public static int field651 = 0;

    @OriginalMember(owner = "client!gda", name = "H", descriptor = "I")
    public static int field656 = 0;

    @OriginalMember(owner = "client!gda", name = "A", descriptor = "F")
    public static float field649;

    @OriginalMember(owner = "client!gda", name = "x", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!gda", name = "y", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!gda", name = "z", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!gda", name = "G", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!gda", name = "F", descriptor = "[[S")
    public static short[][] field654;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "([BI)[B", line = 5)
    public static final byte[] method296(byte[] arg0, int arg1) {
        ++field647;
        if (arg1 <= 98) {
            method296((byte[]) null, 39);
        }
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class70.method557(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Ljaa;IIZ[[I)V", line = 21)
    public class51(class576 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field653 = arg2;
        super.field2172.method3194((byte) 75, this);
        if (arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                class46.method284(32993, (byte) -49, arg2, arg4[var6], super.field2172.field7726, var6 + 34069, super.field2180, arg2);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field2180, arg2, arg2, 0, 32993, super.field2172.field7726, arg4[var7], 0);
            }
        }
        this.method1101(10240, true);
    }

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "(B)V", line = 52)
    public static void method297(byte arg0) {
        field654 = null;
        if (arg0 >= -101) {
            field656 = 15;
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Ljaa;IIZ[[BI)V", line = 63)
    public class51(class576 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field653 = arg2;
        super.field2172.method3194((byte) 75, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field2180, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1101(10240, true);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V", line = 85)
    public final void method298(byte arg0) {
        ++field655;
        OpenGL.glFramebufferTexture2DEXT(this.field650, this.field652, 3553, 0, 0);
        this.field652 = -1;
        if (arg0 == -99) {
            this.field650 = -1;
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Ljaa;II)V", line = 123)
    public class51(class576 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field653 = arg2;
        super.field2172.method3194((byte) 75, this);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field2180, arg2, arg2, 0, class443.method2433((byte) 27, super.field2180), 5121, (byte[]) null, 0);
        }
        this.method1101(10240, true);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIIIB)V", line = 107)
    public final void method299(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field648;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg3, super.field2185, arg1);
        this.field650 = arg0;
        if (arg4 < 39) {
            this.field650 = 64;
        }
        this.field652 = arg2;
    }
}
