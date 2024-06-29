import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public abstract class class367 implements class130 {

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Z")
    private boolean field4965 = false;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Z")
    private boolean field4964;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public int field4968;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public int field4966;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    private int field4970;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Lno;")
    public class658 field4971;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public int field4961;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field4959 = 1;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field4976 = 0;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Lsba;")
    public static class204 field4972;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BZ)V")
    public final void method2161(byte arg0, boolean arg1) {
        field4969++;
        if (this.field4964 != arg1) {
            int var3 = this.method2162(false);
            this.field4964 = true;
            this.method2169(9987);
            this.method2165(var3, 1);
        }
        if (arg0 != 117) {
            field4976 = 36;
        }
    }

    @OriginalMember(owner = "client!hf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2170(9729);
        field4962++;
        super.finalize();
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)I")
    private final int method2162(boolean arg0) {
        field4957++;
        int var2 = this.field4971.method3682(this.field4966, 119) * this.field4970;
        if (arg0) {
            this.method2163(-21, false);
        }
        return this.field4964 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
    public final void method2163(int arg0, boolean arg1) {
        if (arg0 != -30033) {
            this.field4970 = -13;
        }
        field4960++;
        if (arg1 != this.field4965) {
            this.field4965 = arg1;
            this.method2169(9987);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public static void method2164(int arg0) {
        if (arg0 != 10241) {
            field4959 = 74;
        }
        field4972 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
    private final void method2165(int arg0, int arg1) {
        field4973++;
        if (arg1 != 1) {
            method2168(null, 8);
        }
        this.field4971.field9202 -= arg0;
        this.field4971.field9202 += this.method2162(false);
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)I")
    public final int method2166(int arg0) {
        if (arg0 != -7912) {
            this.field4968 = 124;
        }
        field4967++;
        return this.field4961;
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)Z")
    public final boolean method2167(int arg0) {
        field4975++;
        if (!this.field4971.field9284) {
            if (arg0 < 84) {
                this.field4964 = false;
            }
            return false;
        }
        int var2 = this.method2162(false);
        this.field4971.method3630(this, -2);
        OpenGL.glGenerateMipmapEXT(this.field4968);
        this.field4964 = true;
        this.method2169(9987);
        this.method2165(var2, 1);
        return true;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Leh;I)Lpn;")
    public static final class697 method2168(class335 arg0, int arg1) {
        if (arg1 == -32618) {
            field4974++;
            return new class697(arg0.method2022(-29089), arg0.method2022(-29089), arg0.method2022(-29089), arg0.method2022(-29089), arg0.method2022(-29089), arg0.method2022(-29089), arg0.method2022(-29089), arg0.method2022(-29089), arg0.method2042((byte) 53), arg0.method2034(255));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
    private final void method2169(int arg0) {
        this.field4971.method3630(this, -2);
        field4963++;
        if (arg0 != 9987) {
            return;
        }
        if (this.field4965) {
            OpenGL.glTexParameteri(this.field4968, 10241, this.field4964 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field4968, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field4968, 10241, this.field4964 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field4968, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V")
    public final void method2170(int arg0) {
        field4958++;
        if (this.field4961 > 0) {
            this.field4971.method3642(this.field4961, this.method2162(false), 516);
            this.field4961 = 0;
        }
        if (arg0 != 9729) {
            this.field4971 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lno;IIIZ)V")
    public class367(class658 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4964 = arg4;
        this.field4968 = arg1;
        this.field4966 = arg2;
        this.field4970 = arg3;
        this.field4971 = arg0;
        OpenGL.glGenTextures(1, class295.field4172, 0);
        this.field4961 = class295.field4172[0];
        this.method2165(0, 1);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public abstract void method773(int arg0);
}
