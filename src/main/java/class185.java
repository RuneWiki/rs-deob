import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class class185 implements class641 {

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Z")
    private boolean field2171 = false;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    private int field2175;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "Z")
    private boolean field2173;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Ljaa;")
    public class576 field2172;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public int field2169;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public int field2180;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public int field2185;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "Ldr;")
    public static class675 field2184 = new class675(18, 11);

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public static int field2187 = 0;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "Lhm;")
    public static class208 field2189 = new class208(50);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "Lml;")
    public static class360 field2186;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "Loga;")
    public static class442 field2182;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BZ)V", line = 6)
    public final void method1094(byte arg0, boolean arg1) {
        if (arg0 != -50) {
            this.method1101(97, false);
        }
        if (this.field2173 != arg1) {
            int var3 = this.method1100(true);
            this.field2173 = true;
            this.method1096(25230);
            this.method1104(21592, var3);
        }
        field2179++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 26)
    public static void method1095(int arg0) {
        field2184 = null;
        if (arg0 < -5) {
            field2189 = null;
            field2182 = null;
            field2186 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V", line = 50)
    private final void method1096(int arg0) {
        this.field2172.method3194((byte) 75, this);
        field2168++;
        if (arg0 != 25230) {
            this.method1103(true);
        }
        if (this.field2171) {
            OpenGL.glTexParameteri(this.field2169, 10241, this.field2173 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field2169, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field2169, 10241, this.field2173 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field2169, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V", line = 75)
    public final void method1097(boolean arg0) {
        if (!arg0) {
            return;
        }
        if (this.field2185 > 0) {
            this.field2172.method3137(this.field2185, this.method1100(true), false);
            this.field2185 = 0;
        }
        field2167++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;I)V", line = 95)
    public static final void method1098(String arg0, File arg1, int arg2) {
        field2181++;
        if (arg2 >= -22) {
            method1095(123);
        }
        class186.field2190.put(arg0, arg1);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)I", line = 108)
    public final int method1099(byte arg0) {
        if (arg0 >= -121) {
            this.field2185 = -52;
        }
        field2174++;
        return this.field2185;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(Z)I", line = 120)
    private final int method1100(boolean arg0) {
        if (!arg0) {
            field2182 = null;
        }
        field2178++;
        int var2 = this.field2172.method3162(this.field2180, (byte) 89) * this.field2175;
        return this.field2173 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!tj", name = "finalize", descriptor = "()V", line = 135)
    protected final void finalize() throws Throwable {
        this.method1097(true);
        field2176++;
        super.finalize();
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)V", line = 146)
    public final void method1101(int arg0, boolean arg1) {
        field2170++;
        if (this.field2171 != arg1) {
            this.field2171 = arg1;
            this.method1096(arg0 + 14990);
        }
        if (arg0 != 10240) {
            method1095(-28);
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Ljaa;IIIZ)V", line = 228)
    public class185(class576 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2175 = arg3;
        this.field2173 = arg4;
        this.field2172 = arg0;
        this.field2169 = arg1;
        this.field2180 = arg2;
        OpenGL.glGenTextures(1, class447.field5621, 0);
        this.field2185 = class447.field5621[0];
        this.method1104(21592, 0);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Z", line = 166)
    public static final boolean method1102(int arg0, int arg1) {
        field2183++;
        class501 var2 = (class501) class345.field4438.method1909(true);
        if (arg0 != 9729) {
            return true;
        }
        while (var2 != null) {
            if (class453.method2489((byte) 104, var2.field6242) && (long) arg1 == var2.field6247) {
                return true;
            }
            var2 = (class501) class345.field4438.method1916((byte) 107);
        }
        return false;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(Z)Z", line = 188)
    public final boolean method1103(boolean arg0) {
        field2177++;
        if (!this.field2172.field7667) {
            if (arg0) {
                method1102(-43, 45);
            }
            return false;
        }
        int var2 = this.method1100(true);
        this.field2172.method3194((byte) 75, this);
        OpenGL.glGenerateMipmapEXT(this.field2169);
        this.field2173 = true;
        this.method1096(25230);
        this.method1104(21592, var2);
        return true;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V", line = 213)
    private final void method1104(int arg0, int arg1) {
        field2188++;
        if (arg0 == 21592) {
            this.field2172.field7609 -= arg1;
            this.field2172.field7609 += this.method1100(true);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public abstract void method298(byte arg0);
}
