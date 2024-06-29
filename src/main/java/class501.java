import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class class501 implements class486 {

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "Z")
    private boolean field6911 = false;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public int field6920;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "Lbo;")
    public class511 field6916;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Z")
    private boolean field6907;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    private int field6917;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public int field6913;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    public int field6924;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "Lwl;")
    public static class280 field6923 = new class280();

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method2859(int arg0, boolean arg1) {
        if (arg0 != 0) {
            return;
        }
        field6919++;
        if (arg1 != this.field6907) {
            int var3 = this.method2860(arg0 - 58);
            this.field6907 = true;
            this.method2867(127);
            this.method2869(var3, (byte) -68);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)I", line = 26)
    private final int method2860(int arg0) {
        if (arg0 > -38) {
            return -70;
        } else {
            field6918++;
            int var2 = this.field6916.method2981(-78, this.field6913) * this.field6917;
            return this.field6907 ? var2 * 4 / 3 : var2;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V", line = 39)
    public final void method2861(boolean arg0) {
        if (arg0) {
            this.field6917 = -8;
        }
        if (this.field6924 > 0) {
            this.field6916.method2965(this.field6924, this.method2860(-73), 1);
            this.field6924 = 0;
        }
        field6909++;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lbo;IIIZ)V", line = 210)
    public class501(class511 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6920 = arg1;
        this.field6916 = arg0;
        this.field6907 = arg4;
        this.field6917 = arg3;
        this.field6913 = arg2;
        OpenGL.glGenTextures(1, class180.field2588, 0);
        this.field6924 = class180.field2588[0];
        this.method2869(0, (byte) -68);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II[B)[B", line = 62)
    public static final byte[] method2862(int arg0, int arg1, byte[] arg2) {
        if (arg0 != 22615) {
            method2862(-73, 79, null);
        }
        field6922++;
        byte[] var3 = new byte[arg1];
        class254.method1529(arg2, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "finalize", descriptor = "()V", line = 78)
    protected final void finalize() throws Throwable {
        this.method2861(false);
        field6906++;
        super.finalize();
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBII)I", line = 88)
    public static final int method2863(int arg0, byte arg1, int arg2, int arg3) {
        field6915++;
        int var4 = ((arg2 & 0xFF00FF) * arg3 & 0xFF00FF00 | (arg2 & 0xFF00) * arg3 & 0xFF0000) >>> 8;
        int var5 = 255 - arg3;
        int var6 = 82 / ((61 - arg1) / 43);
        return (((arg0 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg0 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)I", line = 101)
    public final int method2864(byte arg0) {
        if (arg0 <= 102) {
            field6923 = null;
        }
        field6908++;
        return this.field6924;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V", line = 115)
    public static void method2865(int arg0) {
        field6923 = null;
        if (arg0 >= -58) {
            field6923 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(IZ)V", line = 125)
    public final void method2866(int arg0, boolean arg1) {
        if (arg0 != 10241) {
            method2862(-27, -58, null);
        }
        field6914++;
        if (this.field6911 != arg1) {
            this.field6911 = arg1;
            this.method2867(78);
        }
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V", line = 141)
    private final void method2867(int arg0) {
        field6912++;
        if (arg0 <= 66) {
            this.field6916 = null;
        }
        this.field6916.method2980(this, 121);
        if (this.field6911) {
            OpenGL.glTexParameteri(this.field6920, 10241, this.field6907 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field6920, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field6920, 10241, this.field6907 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field6920, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(I)Z", line = 164)
    public final boolean method2868(int arg0) {
        field6921++;
        int var2 = 0 / ((54 - arg0) / 47);
        if (!this.field6916.field7510) {
            return false;
        }
        int var3 = this.method2860(-84);
        this.field6916.method2980(this, 108);
        OpenGL.glGenerateMipmapEXT(this.field6920);
        this.field6907 = true;
        this.method2867(107);
        this.method2869(var3, (byte) -68);
        return true;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)V", line = 189)
    private final void method2869(int arg0, byte arg1) {
        if (arg1 == -68) {
            this.field6916.field7415 -= arg0;
            field6910++;
            this.field6916.field7415 += this.method2860(-89);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public abstract void method1503(int arg0);
}
