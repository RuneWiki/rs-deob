import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class class120 implements class205 {

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "Z")
    private boolean field1873 = false;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "Lbt;")
    public class33 field1884;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public int field1867;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    private int field1870;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public int field1881;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "Z")
    private boolean field1883;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public int field1872;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Lqv;")
    public static class316 field1868 = new class316(52, 6);

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "[[Z")
    public static boolean[][] field1887 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "Lvr;")
    public static class92 field1878 = new class92(12, 0, 1, 0);

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "Lqt;")
    public static class459 field1888 = new class459(65, 8);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "[I")
    public static int[] field1880;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZB)V")
    public final void method879(boolean arg0, byte arg1) {
        if (arg1 <= 68) {
            this.method882(50);
        }
        if (arg0 != this.field1873) {
            this.field1873 = arg0;
            this.method880(-13205);
        }
        field1871++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    private final void method880(int arg0) {
        field1874++;
        this.field1884.method285(false, this);
        if (arg0 != -13205) {
            this.method884(-38, 102);
        }
        if (this.field1873) {
            OpenGL.glTexParameteri(this.field1881, 10241, this.field1883 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field1881, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field1881, 10241, this.field1883 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field1881, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)I")
    private final int method881(int arg0) {
        field1882++;
        int var2 = this.field1884.method219(-34848, this.field1867) * this.field1870;
        int var3 = -31 % ((arg0 - 8) / 53);
        return this.field1883 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)Z")
    public final boolean method882(int arg0) {
        field1866++;
        if (arg0 != 9728) {
            return false;
        } else if (this.field1884.field758) {
            int var2 = this.method881(arg0 - 9819);
            this.field1884.method285(false, this);
            OpenGL.glGenerateMipmapEXT(this.field1881);
            this.field1883 = true;
            this.method880(-13205);
            this.method884(var2, 22082);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
    public final void method883(int arg0) {
        if (arg0 != -8820) {
            return;
        }
        if (this.field1872 > 0) {
            this.field1884.method313(this.method881(103), true, this.field1872);
            this.field1872 = 0;
        }
        field1886++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
    private final void method884(int arg0, int arg1) {
        if (arg1 == 22082) {
            field1879++;
            this.field1884.field637 -= arg0;
            this.field1884.field637 += this.method881(-61);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZII)I")
    public static final int method885(boolean arg0, int arg1, int arg2) {
        field1876++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (!arg0) {
            method885(false, -16, -11);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)I")
    public final int method886(byte arg0) {
        if (arg0 >= -108) {
            this.field1884 = null;
        }
        field1875++;
        return this.field1872;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lbt;IIIZ)V")
    public class120(class33 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1884 = arg0;
        this.field1867 = arg2;
        this.field1870 = arg3;
        this.field1881 = arg1;
        this.field1883 = arg4;
        OpenGL.glGenTextures(1, class397.field5645, 0);
        this.field1872 = class397.field5645[0];
        this.method884(0, 22082);
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
    public static void method887(int arg0) {
        field1868 = null;
        field1887 = null;
        if (arg0 != 8) {
            field1888 = null;
        }
        field1878 = null;
        field1880 = null;
        field1888 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BZ)V")
    public final void method888(byte arg0, boolean arg1) {
        if (arg0 != 77) {
            this.field1870 = 55;
        }
        if (this.field1883 != arg1) {
            int var3 = this.method881(-103);
            this.field1883 = true;
            this.method880(-13205);
            this.method884(var3, 22082);
        }
        field1885++;
    }

    @OriginalMember(owner = "client!ei", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method883(-8820);
        field1869++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
    public abstract void method889(boolean arg0);
}
