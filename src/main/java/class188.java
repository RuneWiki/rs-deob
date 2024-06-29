import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public abstract class class188 implements class372 {

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "Z")
    private boolean field2895 = false;

    @OriginalMember(owner = "client!dca", name = "n", descriptor = "I")
    private int field2904;

    @OriginalMember(owner = "client!dca", name = "m", descriptor = "Z")
    private boolean field2903;

    @OriginalMember(owner = "client!dca", name = "o", descriptor = "Lqfa;")
    public class106 field2905;

    @OriginalMember(owner = "client!dca", name = "p", descriptor = "I")
    public int field2906;

    @OriginalMember(owner = "client!dca", name = "i", descriptor = "I")
    public int field2899;

    @OriginalMember(owner = "client!dca", name = "j", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!dca", name = "g", descriptor = "Lcj;")
    public static class721 field2897 = new class721(128);

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!dca", name = "h", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!dca", name = "k", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!dca", name = "l", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!dca", name = "q", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!dca", name = "r", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V", line = 3)
    public static void method1309(byte arg0) {
        if (arg0 > -77) {
            method1316(-55, null);
        }
        field2897 = null;
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(B)V", line = 13)
    public final void method1310(byte arg0) {
        if (arg0 != -102) {
            method1309((byte) 77);
        }
        field2898++;
        if (this.field2900 > 0) {
            this.field2905.method790(this.method1317((byte) 127), this.field2900, arg0 ^ 0xFFFFDC9A);
            this.field2900 = 0;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)V", line = 33)
    private final void method1311(int arg0, int arg1) {
        field2907++;
        this.field2905.field1452 -= arg1;
        this.field2905.field1452 += this.method1317((byte) 116);
        if (arg0 != 5193) {
            method1316(-3, null);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(BZ)V", line = 46)
    public final void method1312(byte arg0, boolean arg1) {
        if (arg0 != -79) {
            this.method1313(73);
        }
        field2893++;
        if (this.field2895 != arg1) {
            this.field2895 = arg1;
            this.method1315((byte) -114);
        }
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)I", line = 64)
    public final int method1313(int arg0) {
        if (arg0 != 9728) {
            this.method1314(31, true);
        }
        field2891++;
        return this.field2900;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZ)V", line = 82)
    public final void method1314(int arg0, boolean arg1) {
        if (arg1 != this.field2903) {
            int var3 = this.method1317((byte) 126);
            this.field2903 = true;
            this.method1315((byte) -115);
            this.method1311(5193, var3);
        }
        field2908++;
        if (arg0 <= 97) {
            this.field2899 = -56;
        }
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lqfa;IIIZ)V", line = 174)
    public class188(class106 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2904 = arg3;
        this.field2903 = arg4;
        this.field2905 = arg0;
        this.field2906 = arg2;
        this.field2899 = arg1;
        OpenGL.glGenTextures(1, class169.field2645, 0);
        this.field2900 = class169.field2645[0];
        this.method1311(5193, 0);
    }

    @OriginalMember(owner = "client!dca", name = "finalize", descriptor = "()V", line = 107)
    protected final void finalize() throws Throwable {
        field2892++;
        this.method1310((byte) -102);
        super.finalize();
    }

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "(B)V", line = 120)
    private final void method1315(byte arg0) {
        this.field2905.method808((byte) 34, this);
        if (arg0 >= -57) {
            this.method1315((byte) 48);
        }
        field2896++;
        if (this.field2895) {
            OpenGL.glTexParameteri(this.field2899, 10241, this.field2903 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field2899, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field2899, 10241, this.field2903 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field2899, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILmea;)Lmea;", line = 142)
    public static final class451 method1316(int arg0, class451 arg1) {
        field2901++;
        class451 var2 = client.method2045(arg1);
        if (arg0 == -18441) {
            if (var2 == null) {
                var2 = arg1.field6332;
            }
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "(B)I", line = 158)
    private final int method1317(byte arg0) {
        field2894++;
        if (arg0 <= 115) {
            return -77;
        } else {
            int var2 = this.field2905.method814(this.field2906, (byte) -127) * this.field2904;
            return this.field2903 ? var2 * 4 / 3 : var2;
        }
    }

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)Z", line = 197)
    public final boolean method1318(int arg0) {
        if (arg0 < 18) {
            method1316(82, null);
        }
        field2902++;
        if (!this.field2905.field1577) {
            return false;
        }
        int var2 = this.method1317((byte) 127);
        this.field2905.method808((byte) 34, this);
        OpenGL.glGenerateMipmapEXT(this.field2899);
        this.field2903 = true;
        this.method1315((byte) -115);
        this.method1311(5193, var2);
        return true;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)V")
    public abstract void method1319(int arg0);
}
