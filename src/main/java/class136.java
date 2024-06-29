import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class class136 implements class87 {

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Z")
    private boolean field1922 = false;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public int field1930;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    private int field1926;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public int field1925;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Z")
    private boolean field1920;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "Llj;")
    public class565 field1927;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public int field1915;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lvn;")
    public static class283 field1916;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1923;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BZ)V", line = 7)
    public final void method944(byte arg0, boolean arg1) {
        if (this.field1922 != arg1) {
            this.field1922 = arg1;
            this.method953((byte) -101);
        }
        if (arg0 != -111) {
            this.field1925 = -11;
        }
        field1921++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 25)
    public static void method945(int arg0) {
        if (arg0 < 38) {
            field1923 = null;
        }
        field1916 = null;
        field1923 = null;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)I", line = 36)
    public final int method946(byte arg0) {
        field1913++;
        if (arg0 >= -59) {
            field1916 = null;
        }
        return this.field1915;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V", line = 48)
    public static final void method947(int arg0) {
        class483.field6636.method974(-20470);
        if (arg0 != 9984) {
            method947(-45);
        }
        field1918++;
        class564.field7622.method2119(0);
        class513.field7036.method2119(0);
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)Z", line = 62)
    public final boolean method948(byte arg0) {
        field1914++;
        if (arg0 <= 105) {
            this.field1927 = null;
        }
        if (!this.field1927.field7949) {
            return false;
        }
        int var2 = this.method952(10240);
        this.field1927.method3206(this, (byte) 26);
        OpenGL.glGenerateMipmapEXT(this.field1925);
        this.field1920 = true;
        this.method953((byte) -31);
        this.method954(var2, 3);
        return true;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)V", line = 90)
    public final void method949(byte arg0) {
        field1924++;
        if (this.field1915 > 0) {
            this.field1927.method3199(true, this.method952(arg0 ^ 0xFFFFD7BD), this.field1915);
            this.field1915 = 0;
        }
        if (arg0 != -67) {
            field1923 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)I", line = 107)
    public static int method950(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)V", line = 119)
    public final void method951(int arg0, boolean arg1) {
        field1912++;
        if (this.field1920 != arg1) {
            int var3 = this.method952(10240);
            this.field1920 = true;
            this.method953((byte) 124);
            this.method954(var3, 3);
        }
        if (arg0 <= 117) {
            this.method954(-128, -55);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Llj;IIIZ)V", line = 193)
    public class136(class565 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1930 = arg2;
        this.field1926 = arg3;
        this.field1925 = arg1;
        this.field1920 = arg4;
        this.field1927 = arg0;
        OpenGL.glGenTextures(1, class653.field9090, 0);
        this.field1915 = class653.field9090[0];
        this.method954(0, 3);
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)I", line = 145)
    private final int method952(int arg0) {
        if (arg0 != 10240) {
            this.method949((byte) 113);
        }
        field1911++;
        int var2 = this.field1927.method3183(this.field1930, (byte) -49) * this.field1926;
        return this.field1920 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(B)V", line = 158)
    private final void method953(byte arg0) {
        field1917++;
        int var2 = -104 / ((arg0 - 43) / 32);
        this.field1927.method3206(this, (byte) 26);
        if (this.field1922) {
            OpenGL.glTexParameteri(this.field1925, 10241, this.field1920 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field1925, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field1925, 10241, this.field1920 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field1925, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)V", line = 179)
    private final void method954(int arg0, int arg1) {
        field1929++;
        this.field1927.field7851 -= arg0;
        this.field1927.field7851 += this.method952(10240);
        if (arg1 != 3) {
            field1923 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "finalize", descriptor = "()V", line = 210)
    protected final void finalize() throws Throwable {
        this.method949((byte) -67);
        field1919++;
        super.finalize();
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public abstract void method240(byte arg0);
}
