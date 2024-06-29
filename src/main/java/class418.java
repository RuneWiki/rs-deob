import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public abstract class class418 implements class199 {

    @OriginalMember(owner = "client!mw", name = "p", descriptor = "Z")
    private boolean field5894 = false;

    @OriginalMember(owner = "client!mw", name = "u", descriptor = "I")
    private int field5899;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
    public int field5882;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "Lgi;")
    public class583 field5883;

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "Z")
    private boolean field5880;

    @OriginalMember(owner = "client!mw", name = "k", descriptor = "I")
    public int field5889;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
    public int field5879;

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field5892 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!mw", name = "q", descriptor = "[[I")
    public static int[][] field5895 = new int[128][128];

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!mw", name = "i", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!mw", name = "j", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!mw", name = "l", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!mw", name = "o", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!mw", name = "s", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!mw", name = "t", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "Lan;")
    public static class21 field5891;

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5886;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "Z")
    public static boolean field5881;

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(B)V")
    public final void method2506(byte arg0) {
        if (this.field5879 > 0) {
            this.field5883.method3335(this.field5879, (byte) 78, this.method2511(4));
            this.field5879 = 0;
        }
        field5885++;
        int var2 = 29 % ((-arg0 - 68) / 43);
    }

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "(B)V")
    private final void method2507(byte arg0) {
        this.field5883.method3358(32886, this);
        field5896++;
        int var2 = 115 / ((72 - arg0) / 35);
        if (this.field5894) {
            OpenGL.glTexParameteri(this.field5882, 10241, this.field5880 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field5882, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field5882, 10241, this.field5880 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field5882, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!mw", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2506((byte) -112);
        field5888++;
        super.finalize();
    }

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "(B)I")
    public final int method2508(byte arg0) {
        if (arg0 != 20) {
            this.method2508((byte) -26);
        }
        field5893++;
        return this.field5879;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZ)V")
    public final void method2509(int arg0, boolean arg1) {
        if (arg0 != 10240) {
            return;
        }
        if (this.field5880 != arg1) {
            int var3 = this.method2511(arg0 - 10236);
            this.field5880 = true;
            this.method2507((byte) 115);
            this.method2514(false, var3);
        }
        field5887++;
    }

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "(B)Z")
    public final boolean method2510(byte arg0) {
        field5884++;
        if (arg0 != -98) {
            field5886 = null;
        }
        if (!this.field5883.field8306) {
            return false;
        }
        int var2 = this.method2511(4);
        this.field5883.method3358(32886, this);
        OpenGL.glGenerateMipmapEXT(this.field5882);
        this.field5880 = true;
        this.method2507((byte) -20);
        this.method2514(false, var2);
        return true;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)I")
    private final int method2511(int arg0) {
        field5897++;
        int var2 = this.field5883.method3367(3553, this.field5889) * this.field5899;
        if (arg0 != 4) {
            field5891 = null;
        }
        return this.field5880 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V")
    public static void method2512(int arg0) {
        field5891 = null;
        field5886 = null;
        if (arg0 >= 10) {
            field5895 = null;
            field5892 = null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZZ)V")
    public final void method2513(boolean arg0, boolean arg1) {
        if (arg0) {
            field5891 = null;
        }
        if (arg1 != this.field5894) {
            this.field5894 = arg1;
            this.method2507((byte) 10);
        }
        field5898++;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZI)V")
    private final void method2514(boolean arg0, int arg1) {
        this.field5883.field8216 -= arg1;
        if (arg0) {
            this.method2514(true, -7);
        }
        field5890++;
        this.field5883.field8216 += this.method2511(4);
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lgi;IIIZ)V")
    public class418(class583 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5899 = arg3;
        this.field5882 = arg1;
        this.field5883 = arg0;
        this.field5880 = arg4;
        this.field5889 = arg2;
        OpenGL.glGenTextures(1, class211.field2979, 0);
        this.field5879 = class211.field2979[0];
        this.method2514(false, 0);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V")
    public abstract void method1220(byte arg0);
}
