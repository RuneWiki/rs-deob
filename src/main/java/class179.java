import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public abstract class class179 implements class520 {

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Z")
    private boolean field2838 = false;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public int field2832;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Z")
    private boolean field2834;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    private int field2833;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public int field2829;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "Lih;")
    public class214 field2845;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public int field2843;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field2844 = 0;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "[I")
    public static int[] field2847 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V", line = 3)
    public static void method1203(int arg0) {
        field2847 = null;
        if (arg0 != 0) {
            field2847 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)I", line = 13)
    public final int method1204(boolean arg0) {
        field2841++;
        if (arg0) {
            this.field2834 = false;
        }
        return this.field2843;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)Z", line = 35)
    public final boolean method1205(byte arg0) {
        field2831++;
        if (!this.field2845.field3724) {
            if (arg0 < 57) {
                this.method1204(true);
            }
            return false;
        }
        int var2 = this.method1212(false);
        this.field2845.method1471(true, this);
        OpenGL.glGenerateMipmapEXT(this.field2829);
        this.field2834 = true;
        this.method1211((byte) 12);
        this.method1206(true, var2);
        return true;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V", line = 61)
    private final void method1206(boolean arg0, int arg1) {
        this.field2845.field3614 -= arg1;
        field2839++;
        this.field2845.field3614 += this.method1212(false);
        if (!arg0) {
            this.method1208(false, 17);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V", line = 74)
    public static final void method1207(int arg0, int arg1) {
        class471.field6970 = arg0;
        class129.field2226 = -1;
        field2840++;
        class129.field2226 = -1;
        int var2 = -126 % ((arg1 - 55) / 56);
        class430.method2621((byte) 125);
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(ZI)V", line = 88)
    public final void method1208(boolean arg0, int arg1) {
        if (arg0 != this.field2838) {
            this.field2838 = arg0;
            this.method1211((byte) 12);
        }
        field2835++;
        if (arg1 > -99) {
            this.field2843 = 31;
        }
    }

    @OriginalMember(owner = "client!kk", name = "finalize", descriptor = "()V", line = 107)
    protected final void finalize() throws Throwable {
        field2842++;
        this.method1209(56);
        super.finalize();
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V", line = 118)
    public final void method1209(int arg0) {
        if (this.field2843 > 0) {
            this.field2845.method1419(this.field2843, 8192, this.method1212(false));
            this.field2843 = 0;
        }
        field2830++;
        if (arg0 <= 50) {
            this.method1206(true, 62);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZB)V", line = 135)
    public final void method1210(boolean arg0, byte arg1) {
        if (this.field2834 != arg0) {
            int var3 = this.method1212(false);
            this.field2834 = true;
            this.method1211((byte) 12);
            this.method1206(true, var3);
        }
        field2837++;
        if (arg1 > -99) {
            this.field2832 = 125;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V", line = 156)
    private final void method1211(byte arg0) {
        if (arg0 != 12) {
            return;
        }
        field2846++;
        this.field2845.method1471(true, this);
        if (this.field2838) {
            OpenGL.glTexParameteri(this.field2829, 10241, this.field2834 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field2829, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field2829, 10241, this.field2834 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field2829, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(Z)I", line = 179)
    private final int method1212(boolean arg0) {
        if (arg0) {
            return 91;
        } else {
            field2836++;
            int var2 = this.field2845.method1448(-74, this.field2832) * this.field2833;
            return this.field2834 ? var2 * 4 / 3 : var2;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lih;IIIZ)V", line = 203)
    public class179(class214 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2832 = arg2;
        this.field2834 = arg4;
        this.field2833 = arg3;
        this.field2829 = arg1;
        this.field2845 = arg0;
        OpenGL.glGenTextures(1, class203.field3212, 0);
        this.field2843 = class203.field3212[0];
        this.method1206(true, 0);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public abstract void method1213(int arg0);
}
