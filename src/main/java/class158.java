import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public abstract class class158 implements class754 {

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "Z")
    private boolean field2274 = false;

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "Z")
    private boolean field2271;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public int field2261;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
    public int field2272;

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
    private int field2276;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "Lkw;")
    public class346 field2275;

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "I")
    public int field2269;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "Z")
    public static boolean field2259 = false;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!ou", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1127(0);
        field2267++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IZ)V")
    private final void method1124(int arg0, boolean arg1) {
        this.field2275.field4988 -= arg0;
        field2264++;
        this.field2275.field4988 += this.method1128((byte) -121);
        if (!arg1) {
            this.field2276 = -19;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)Ljj;")
    public static final class657 method1125(int arg0, int arg1) {
        field2270++;
        class657 var2 = (class657) class137.field1880.method2311((long) arg1, (byte) -115);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class151.field2210.method2600(0, arg1, 0);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        int var4 = -109 / (-arg0 / 38);
        class657 var5;
        try {
            var5 = class3.method10(-40, var3);
        } catch (Exception var7) {
            throw new RuntimeException(var7.getMessage() + " S: " + arg1);
        }
        class137.field1880.method2313((long) arg1, var5, (byte) -38);
        return var5;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(B)Z")
    public final boolean method1126(byte arg0) {
        field2265++;
        if (arg0 != -61) {
            this.field2269 = -14;
        }
        if (!this.field2275.field5006) {
            return false;
        }
        int var2 = this.method1128((byte) -119);
        this.field2275.method2164(6, this);
        OpenGL.glGenerateMipmapEXT(this.field2261);
        this.field2271 = true;
        this.method1130(arg0 ^ 0xFFFFD8C0);
        this.method1124(var2, true);
        return true;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
    public final void method1127(int arg0) {
        if (arg0 != 0) {
            this.field2272 = 78;
        }
        if (this.field2269 > 0) {
            this.field2275.method2132(3, this.method1128((byte) -126), this.field2269);
            this.field2269 = 0;
        }
        field2273++;
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(B)I")
    private final int method1128(byte arg0) {
        field2262++;
        if (arg0 >= -111) {
            return -42;
        } else {
            int var2 = this.field2275.method2199(26885, this.field2272) * this.field2276;
            return this.field2271 ? var2 * 4 / 3 : var2;
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(IZ)V")
    public final void method1129(int arg0, boolean arg1) {
        field2268++;
        if (arg0 <= 114) {
            this.field2271 = true;
        }
        if (arg1 != this.field2271) {
            int var3 = this.method1128((byte) -124);
            this.field2271 = true;
            this.method1130(9987);
            this.method1124(var3, true);
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
    private final void method1130(int arg0) {
        field2266++;
        if (arg0 != 9987) {
            return;
        }
        this.field2275.method2164(arg0 - 9981, this);
        if (this.field2274) {
            OpenGL.glTexParameteri(this.field2261, 10241, this.field2271 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field2261, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field2261, 10241, this.field2271 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field2261, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BZ)V")
    public final void method1131(byte arg0, boolean arg1) {
        if (arg0 != 42) {
            return;
        }
        field2260++;
        if (arg1 != this.field2274) {
            this.field2274 = arg1;
            this.method1130(9987);
        }
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)I")
    public final int method1132(int arg0) {
        if (arg0 != 0) {
            this.field2261 = 124;
        }
        field2263++;
        return this.field2269;
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lkw;IIIZ)V")
    public class158(class346 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2271 = arg4;
        this.field2261 = arg1;
        this.field2272 = arg2;
        this.field2276 = arg3;
        this.field2275 = arg0;
        OpenGL.glGenTextures(1, class344.field4735, 0);
        this.field2269 = class344.field4735[0];
        this.method1124(0, true);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V")
    public abstract void method463(byte arg0);
}
