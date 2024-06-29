import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class class36 implements class713 {

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Z")
    private boolean field875 = false;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Z")
    private boolean field879;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public int field868;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    private int field866;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public int field877;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Lqo;")
    public class22 field870;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public int field878;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field867 = 0;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Z", line = 3)
    public final boolean method449(int arg0) {
        field871++;
        int var2 = 22 / ((arg0 + 31) / 50);
        if (!this.field870.field642) {
            return false;
        }
        int var3 = this.method450(-120);
        this.field870.method256((byte) -102, this);
        OpenGL.glGenerateMipmapEXT(this.field868);
        this.field879 = true;
        this.method455(true);
        this.method453(var3, 121);
        return true;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)I", line = 28)
    private final int method450(int arg0) {
        field880++;
        if (arg0 >= -96) {
            this.field866 = -92;
        }
        int var2 = this.field870.method334(this.field877, 2) * this.field866;
        return this.field879 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V", line = 45)
    public final void method451(int arg0) {
        field882++;
        if (this.field878 > 0) {
            this.field870.method189(this.field878, (byte) 121, this.method450(arg0 + 19838));
            this.field878 = 0;
        }
        if (arg0 != -19948) {
            this.field878 = -40;
        }
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)I", line = 62)
    public final int method452(int arg0) {
        field872++;
        if (arg0 < 29) {
            this.method455(true);
        }
        return this.field878;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V", line = 73)
    private final void method453(int arg0, int arg1) {
        field873++;
        if (arg1 < 17) {
            this.field875 = true;
        }
        this.field870.field570 -= arg0;
        this.field870.field570 += this.method450(-106);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZB)V", line = 95)
    public final void method454(boolean arg0, byte arg1) {
        if (arg1 != -123) {
            this.method452(50);
        }
        if (this.field879 != arg0) {
            int var3 = this.method450(-119);
            this.field879 = true;
            this.method455(true);
            this.method453(var3, 115);
        }
        field869++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V", line = 116)
    private final void method455(boolean arg0) {
        field876++;
        if (!arg0) {
            this.field868 = -74;
        }
        this.field870.method256((byte) -87, this);
        if (this.field875) {
            OpenGL.glTexParameteri(this.field868, 10241, this.field879 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field868, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field868, 10241, this.field879 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field868, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)V", line = 141)
    public final void method456(int arg0, boolean arg1) {
        if (this.field875 != arg1) {
            this.field875 = arg1;
            this.method455(true);
        }
        field874++;
        if (arg0 != 9728) {
            this.method455(false);
        }
    }

    @OriginalMember(owner = "client!ud", name = "finalize", descriptor = "()V", line = 159)
    protected final void finalize() throws Throwable {
        field881++;
        this.method451(-19948);
        super.finalize();
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lqo;IIIZ)V", line = 172)
    public class36(class22 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field879 = arg4;
        this.field868 = arg1;
        this.field866 = arg3;
        this.field877 = arg2;
        this.field870 = arg0;
        OpenGL.glGenTextures(1, class700.field9475, 0);
        this.field878 = class700.field9475[0];
        this.method453(0, 94);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public abstract void method457(int arg0);
}
