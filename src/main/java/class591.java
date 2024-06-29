import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public abstract class class591 implements class521 {

    @OriginalMember(owner = "client!it", name = "o", descriptor = "Z")
    private boolean field8238 = false;

    @OriginalMember(owner = "client!it", name = "s", descriptor = "Z")
    private boolean field8242;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "Len;")
    public class289 field8237;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "I")
    private int field8236;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public int field8226;

    @OriginalMember(owner = "client!it", name = "r", descriptor = "I")
    public int field8241;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "I")
    public int field8231;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field8229 = -1;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "Lkh;")
    public static class15 field8233 = new class15();

    @OriginalMember(owner = "client!it", name = "q", descriptor = "Ljava/lang/String;")
    public static String field8240 = "";

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field8224;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field8225;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public static int field8227;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field8228;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    public static int field8230;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "I")
    public static int field8232;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public static int field8234;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!it", name = "t", descriptor = "I")
    public static int field8243;

    @OriginalMember(owner = "client!it", name = "u", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!it", name = "v", descriptor = "I")
    public static int field8245;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "Ltt;")
    public static class79 field8235;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)I", line = 3)
    private final int method3284(int arg0) {
        field8239++;
        if (arg0 != 4) {
            this.method3284(118);
        }
        int var2 = this.field8237.method1754(this.field8226, 122) * this.field8236;
        return this.field8242 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V", line = 21)
    private final void method3285(int arg0) {
        field8234++;
        this.field8237.method1804(false, this);
        if (this.field8238) {
            OpenGL.glTexParameteri(this.field8241, 10241, this.field8242 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field8241, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field8241, 10241, this.field8242 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field8241, 10240, 9728);
        }
        if (arg0 != 17338) {
            this.method3292(-113);
        }
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "(I)I", line = 47)
    public final int method3286(int arg0) {
        field8232++;
        if (arg0 >= -92) {
            this.field8238 = false;
        }
        return this.field8231;
    }

    @OriginalMember(owner = "client!it", name = "e", descriptor = "(I)Z", line = 65)
    public final boolean method3287(int arg0) {
        field8230++;
        if (arg0 != -10286) {
            field8229 = -86;
        }
        if (!this.field8237.field4252) {
            return false;
        }
        int var2 = this.method3284(4);
        this.field8237.method1804(false, this);
        OpenGL.glGenerateMipmapEXT(this.field8241);
        this.field8242 = true;
        this.method3285(arg0 + 27624);
        this.method3293(arg0 + 10222, var2);
        return true;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IZ)V", line = 88)
    public final void method3288(int arg0, boolean arg1) {
        if (arg1 != this.field8238) {
            this.field8238 = arg1;
            this.method3285(arg0 ^ 0x43BA);
        }
        if (arg0 != 0) {
            field8240 = null;
        }
        field8224++;
    }

    @OriginalMember(owner = "client!it", name = "finalize", descriptor = "()V", line = 107)
    protected final void finalize() throws Throwable {
        this.method3292(0);
        field8227++;
        super.finalize();
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Len;IIIZ)V", line = 151)
    public class591(class289 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8242 = arg4;
        this.field8237 = arg0;
        this.field8236 = arg3;
        this.field8226 = arg2;
        this.field8241 = arg1;
        OpenGL.glGenTextures(1, class123.field1701, 0);
        this.field8231 = class123.field1701[0];
        this.method3293(-115, 0);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ZZ)V", line = 129)
    public final void method3289(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method3287(103);
        }
        if (this.field8242 != arg0) {
            int var3 = this.method3284(4);
            this.field8242 = true;
            this.method3285(17338);
            this.method3293(-28, var3);
        }
        field8225++;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Laca;IZ)V", line = 168)
    public static final void method3290(class667 arg0, int arg1, boolean arg2) {
        if (arg2) {
            method3290(null, -80, false);
        }
        field8244++;
        if (class87.field1190) {
            class87.field1190 = false;
            arg1 = 0;
        }
        if (class334.field4896 != null && class334.field4896.method3698(arg0, -101)) {
            return;
        }
        class334.field4896 = arg0;
        class550.field7449 = class680.method3756(-117);
        class546.field7406 = arg1;
        class281.field3929 = arg1;
        if (class281.field3929 != 0) {
            class121.field1677 = class569.field7651;
            class26.field339 = class269.field3826;
            class278.field3894 = class624.field8697;
            class67.field888 = class629.field8789;
            class64.field848 = class621.field8655;
            class622.field8664 = class664.field9363;
            class509.field6982 = class326.field4814;
            class601.field8336 = class506.field6931;
            class514.field7025 = class627.field8745;
            class633.field8865 = class225.field3228;
            return;
        }
        class420.method2394(0);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V", line = 209)
    public static void method3291(byte arg0) {
        field8235 = null;
        if (arg0 != 7) {
            method3290(null, 92, false);
        }
        field8240 = null;
        field8233 = null;
    }

    @OriginalMember(owner = "client!it", name = "f", descriptor = "(I)V", line = 223)
    public final void method3292(int arg0) {
        if (this.field8231 > arg0) {
            this.field8237.method1782(this.field8231, this.method3284(4), arg0 ^ 0xFFFFBD5F);
            this.field8231 = 0;
        }
        field8228++;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)V", line = 236)
    private final void method3293(int arg0, int arg1) {
        this.field8237.field4234 -= arg1;
        if (arg0 <= -21) {
            field8243++;
            this.field8237.field4234 += this.method3284(4);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
    public abstract void method1953(int arg0);
}
