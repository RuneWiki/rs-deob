import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public abstract class class487 implements class670 {

    @OriginalMember(owner = "client!um", name = "j", descriptor = "Z")
    private boolean field6975 = false;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public int field6971;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    public int field6979;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    private int field6967;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "Z")
    private boolean field6970;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "Lus;")
    public class1 field6977;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public int field6972;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "Lqfa;")
    public static class85 field6981 = new class85(97, 6);

    @OriginalMember(owner = "client!um", name = "r", descriptor = "Lsb;")
    public static class266 field6983 = new class266(30, 3);

    @OriginalMember(owner = "client!um", name = "s", descriptor = "F")
    public static float field6984;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field6966;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public static int field6982;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
    private final void method2935(int arg0) {
        if (arg0 != 9984) {
            this.method2939(true, (byte) 50);
        }
        this.field6977.method5(3845, this);
        field6982++;
        if (this.field6975) {
            OpenGL.glTexParameteri(this.field6979, 10241, this.field6970 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field6979, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field6979, 10241, this.field6970 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field6979, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BZ)V")
    public final void method2936(byte arg0, boolean arg1) {
        if (this.field6970 != arg1) {
            int var3 = this.method2943(4);
            this.field6970 = true;
            this.method2935(9984);
            this.method2942(var3, -23715);
        }
        field6973++;
        int var4 = -56 % ((arg0 + 23) / 62);
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)I")
    public final int method2937(int arg0) {
        field6966++;
        int var2 = -20 % ((arg0 - 60) / 52);
        return this.field6972;
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V")
    public final void method2938(int arg0) {
        if (arg0 != -23054) {
            field6983 = null;
        }
        if (this.field6972 > 0) {
            this.field6977.method26(arg0 ^ 0xFFFFA5F2, this.field6972, this.method2943(4));
            this.field6972 = 0;
        }
        field6978++;
    }

    @OriginalMember(owner = "client!um", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6968++;
        this.method2938(-23054);
        super.finalize();
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZB)V")
    public final void method2939(boolean arg0, byte arg1) {
        if (this.field6975 != arg0) {
            this.field6975 = arg0;
            this.method2935(9984);
        }
        field6980++;
        if (arg1 != -69) {
            this.method2939(false, (byte) -4);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Z")
    public final boolean method2940(byte arg0) {
        field6976++;
        if (arg0 != 108) {
            this.method2936((byte) 95, true);
        }
        if (!this.field6977.field278) {
            return false;
        }
        int var2 = this.method2943(arg0 - 104);
        this.field6977.method5(3845, this);
        OpenGL.glGenerateMipmapEXT(this.field6979);
        this.field6970 = true;
        this.method2935(9984);
        this.method2942(var2, arg0 - 23823);
        return true;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V")
    public static void method2941(byte arg0) {
        field6981 = null;
        if (arg0 != -125) {
            field6981 = null;
        }
        field6983 = null;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lus;IIIZ)V")
    public class487(class1 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6971 = arg2;
        this.field6979 = arg1;
        this.field6967 = arg3;
        this.field6970 = arg4;
        this.field6977 = arg0;
        OpenGL.glGenTextures(1, class39.field1064, 0);
        this.field6972 = class39.field1064[0];
        this.method2942(0, -23715);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V")
    private final void method2942(int arg0, int arg1) {
        if (arg1 != -23715) {
            this.method2937(-90);
        }
        field6974++;
        this.field6977.field228 -= arg0;
        this.field6977.field228 += this.method2943(4);
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)I")
    private final int method2943(int arg0) {
        field6969++;
        int var2 = this.field6977.method124(true, this.field6971) * this.field6967;
        if (arg0 != 4) {
            this.method2942(5, -104);
        }
        return this.field6970 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
    public abstract void method1612(int arg0);
}
