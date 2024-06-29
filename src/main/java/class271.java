import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public abstract class class271 implements class189 {

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "Z")
    private boolean field4040 = false;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "Z")
    private boolean field4036;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    private int field4034;

    @OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
    public int field4044;

    @OriginalMember(owner = "client!ew", name = "p", descriptor = "Lvd;")
    public class258 field4047;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public int field4033;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "I")
    public int field4042;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!ew", name = "l", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!ew", name = "n", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!ew", name = "o", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!ew", name = "q", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)V", line = 4)
    private final void method1689(int arg0, int arg1) {
        field4035++;
        this.field4047.field3721 -= arg1;
        int var3 = 72 % ((-arg0 - 22) / 50);
        this.field4047.field3721 += this.method1695(4);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BZ)V", line = 16)
    public final void method1690(byte arg0, boolean arg1) {
        field4048++;
        if (this.field4036 != arg1) {
            int var3 = this.method1695(4);
            this.field4036 = true;
            this.method1691(10240);
            this.method1689(61, var3);
        }
        if (arg0 >= -27) {
            this.method1693(false, (byte) -47);
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)V", line = 35)
    private final void method1691(int arg0) {
        if (arg0 != 10240) {
            this.method1692(0);
        }
        field4045++;
        this.field4047.method1546(-2, this);
        if (this.field4040) {
            OpenGL.glTexParameteri(this.field4033, 10241, this.field4036 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field4033, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field4033, 10241, this.field4036 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field4033, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)I", line = 60)
    public final int method1692(int arg0) {
        field4037++;
        int var2 = 41 % ((73 - arg0) / 49);
        return this.field4042;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZB)V", line = 70)
    public final void method1693(boolean arg0, byte arg1) {
        if (arg0 != this.field4040) {
            this.field4040 = arg0;
            this.method1691(10240);
        }
        field4032++;
        int var3 = -61 % ((-arg1 - 36) / 35);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Z)Z", line = 86)
    public final boolean method1694(boolean arg0) {
        if (!arg0) {
            this.method1689(61, 96);
        }
        field4039++;
        if (!this.field4047.field3812) {
            return false;
        }
        int var2 = this.method1695(4);
        this.field4047.method1546(-2, this);
        OpenGL.glGenerateMipmapEXT(this.field4033);
        this.field4036 = true;
        this.method1691(10240);
        this.method1689(-80, var2);
        return true;
    }

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "(I)I", line = 111)
    private final int method1695(int arg0) {
        field4046++;
        if (arg0 != 4) {
            field4041 = -28;
        }
        int var2 = this.field4047.method1569(this.field4044, (byte) 119) * this.field4034;
        return this.field4036 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!ew", name = "finalize", descriptor = "()V", line = 124)
    protected final void finalize() throws Throwable {
        field4038++;
        this.method1696(0);
        super.finalize();
    }

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "(I)V", line = 134)
    public final void method1696(int arg0) {
        field4043++;
        if (this.field4042 > arg0) {
            this.field4047.method1552(this.field4042, 95, this.method1695(4));
            this.field4042 = 0;
        }
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lvd;IIIZ)V", line = 165)
    public class271(class258 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4036 = arg4;
        this.field4034 = arg3;
        this.field4044 = arg2;
        this.field4047 = arg0;
        this.field4033 = arg1;
        OpenGL.glGenTextures(1, class86.field1356, 0);
        this.field4042 = class86.field1356[0];
        this.method1689(-75, 0);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
    public abstract void method737(int arg0);
}
