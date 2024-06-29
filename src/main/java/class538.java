import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public abstract class class538 implements class371 {

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "Z")
    private boolean field7877 = false;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "Z")
    private boolean field7882;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public int field7878;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public int field7881;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    private int field7883;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "Lnq;")
    public class325 field7884;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
    public int field7894;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "Lik;")
    public static class141 field7879 = new class141(5000);

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "Lla;")
    public static class319 field7886 = new class319(76, 2);

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    public static int field7892 = -1;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "I")
    public static int field7897 = 2;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "[I")
    public static int[] field7890 = new int[13];

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
    public static int field7895 = 0;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public static int field7887;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    public static int field7888;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
    public static int field7896;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "[S")
    public static short[] field7885;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V", line = 3)
    public final void method3172(int arg0) {
        field7898++;
        if (this.field7894 > 0) {
            this.field7884.method2076(this.field7894, (byte) 29, this.method3174((byte) -100));
            this.field7894 = 0;
        }
        if (arg0 != 6146) {
            this.method3176(false, true);
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V", line = 24)
    public static void method3173(int arg0) {
        field7890 = null;
        field7879 = null;
        field7886 = null;
        if (arg0 == -1) {
            field7885 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)I", line = 37)
    private final int method3174(byte arg0) {
        if (arg0 >= -61) {
            field7886 = null;
        }
        field7889++;
        int var2 = this.field7884.method2077(this.field7878, 34847) * this.field7883;
        return this.field7882 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lnq;IIIZ)V", line = 179)
    public class538(class325 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7882 = arg4;
        this.field7878 = arg2;
        this.field7881 = arg1;
        this.field7883 = arg3;
        this.field7884 = arg0;
        OpenGL.glGenTextures(1, class291.field4261, 0);
        this.field7894 = class291.field4261[0];
        this.method3180(10241, 0);
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)Z", line = 64)
    public final boolean method3175(int arg0) {
        field7896++;
        if (arg0 != -1) {
            field7897 = -19;
        }
        if (!this.field7884.field4939) {
            return false;
        }
        int var2 = this.method3174((byte) -76);
        this.field7884.method2075(this, ~arg0);
        OpenGL.glGenerateMipmapEXT(this.field7881);
        this.field7882 = true;
        this.method3177(arg0 ^ 0xFFFFD7FF);
        this.method3180(10241, var2);
        return true;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZZ)V", line = 89)
    public final void method3176(boolean arg0, boolean arg1) {
        field7880++;
        if (this.field7877 != arg1) {
            this.field7877 = arg1;
            this.method3177(10240);
        }
        if (arg0) {
            this.method3176(true, true);
        }
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V", line = 106)
    private final void method3177(int arg0) {
        this.field7884.method2075(this, 0);
        field7876++;
        if (arg0 != 10240) {
            this.field7883 = -21;
        }
        if (this.field7877) {
            OpenGL.glTexParameteri(this.field7881, 10241, this.field7882 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field7881, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field7881, 10241, this.field7882 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field7881, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)I", line = 128)
    public final int method3178(byte arg0) {
        int var2 = -2 % ((arg0 + 61) / 51);
        field7888++;
        return this.field7894;
    }

    @OriginalMember(owner = "client!lr", name = "finalize", descriptor = "()V", line = 147)
    protected final void finalize() throws Throwable {
        field7893++;
        this.method3172(6146);
        super.finalize();
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(ZZ)V", line = 161)
    public final void method3179(boolean arg0, boolean arg1) {
        if (!arg0) {
            field7885 = null;
        }
        if (arg1 != this.field7882) {
            int var3 = this.method3174((byte) -90);
            this.field7882 = true;
            this.method3177(10240);
            this.method3180(10241, var3);
        }
        field7891++;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)V", line = 197)
    private final void method3180(int arg0, int arg1) {
        this.field7884.field4910 -= arg1;
        field7887++;
        if (arg0 != 10241) {
            this.field7882 = false;
        }
        this.field7884.field4910 += this.method3174((byte) -71);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
    public abstract void method2(boolean arg0);
}
