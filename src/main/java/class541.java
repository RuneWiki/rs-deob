import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public abstract class class541 implements class250 {

    @OriginalMember(owner = "client!baa", name = "k", descriptor = "Z")
    private boolean field8092 = false;

    @OriginalMember(owner = "client!baa", name = "j", descriptor = "Los;")
    public class468 field8091;

    @OriginalMember(owner = "client!baa", name = "o", descriptor = "I")
    public int field8096;

    @OriginalMember(owner = "client!baa", name = "q", descriptor = "I")
    private int field8098;

    @OriginalMember(owner = "client!baa", name = "n", descriptor = "I")
    public int field8095;

    @OriginalMember(owner = "client!baa", name = "m", descriptor = "Z")
    private boolean field8094;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
    public int field8088;

    @OriginalMember(owner = "client!baa", name = "p", descriptor = "Lqp;")
    public static class586 field8097 = new class586(22, 14);

    @OriginalMember(owner = "client!baa", name = "s", descriptor = "I")
    public static int field8100 = 0;

    @OriginalMember(owner = "client!baa", name = "t", descriptor = "Lqp;")
    public static class586 field8101 = new class586(39, 3);

    @OriginalMember(owner = "client!baa", name = "u", descriptor = "Lrk;")
    public static class419 field8102 = new class419();

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    public static int field8082;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
    public static int field8084;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "I")
    public static int field8086;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public static int field8087;

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
    public static int field8089;

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
    public static int field8090;

    @OriginalMember(owner = "client!baa", name = "l", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!baa", name = "r", descriptor = "I")
    public static int field8099;

    @OriginalMember(owner = "client!baa", name = "v", descriptor = "I")
    public static int field8103;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(ZI)V", line = 8)
    public final void method3174(boolean arg0, int arg1) {
        if (this.field8092 != arg0) {
            this.field8092 = arg0;
            this.method3179(arg1 + 17872);
        }
        field8089++;
        if (arg1 != -17759) {
            method3180((byte) -44);
        }
    }

    @OriginalMember(owner = "client!baa", name = "finalize", descriptor = "()V", line = 26)
    protected final void finalize() throws Throwable {
        field8099++;
        this.method3175(81);
        super.finalize();
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Los;IIIZ)V", line = 129)
    public class541(class468 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8091 = arg0;
        this.field8096 = arg1;
        this.field8098 = arg3;
        this.field8095 = arg2;
        this.field8094 = arg4;
        OpenGL.glGenTextures(1, class316.field4729, 0);
        this.field8088 = class316.field4729[0];
        this.method3177(-242, 0);
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V", line = 48)
    public final void method3175(int arg0) {
        int var2 = 14 / ((arg0 + 60) / 60);
        if (this.field8088 > 0) {
            this.field8091.method2795((byte) 63, this.field8088, this.method3182((byte) 37));
            this.field8088 = 0;
        }
        field8093++;
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)I", line = 64)
    public final int method3176(int arg0) {
        field8083++;
        return arg0 == 6881 ? this.field8088 : 7;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)V", line = 77)
    private final void method3177(int arg0, int arg1) {
        field8087++;
        this.field8091.field6974 -= arg1;
        this.field8091.field6974 += this.method3182((byte) 119);
        if (arg0 != -242) {
            this.method3183((byte) -16);
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIZBZ)V", line = 90)
    public static final void method3178(int arg0, int arg1, boolean arg2, byte arg3, boolean arg4) {
        if (arg3 != 14) {
            method3180((byte) -78);
        }
        field8090++;
        class530.method3129(arg2, arg4, arg0, arg1, 32, class626.field9173.length - 1, 0);
        field8100 = 0;
        class313.field4713 = null;
    }

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "(I)V", line = 104)
    private final void method3179(int arg0) {
        field8085++;
        this.field8091.method2811(this, -2);
        if (this.field8092) {
            OpenGL.glTexParameteri(this.field8096, 10241, this.field8094 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field8096, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field8096, 10241, this.field8094 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field8096, 10240, 9728);
        }
        int var2 = 83 / ((arg0 + 1) / 60);
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(B)V", line = 146)
    public static void method3180(byte arg0) {
        field8097 = null;
        if (arg0 != 17) {
            method3180((byte) 52);
        }
        field8101 = null;
        field8102 = null;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(ZB)V", line = 158)
    public final void method3181(boolean arg0, byte arg1) {
        if (this.field8094 != arg0) {
            int var3 = this.method3182((byte) 16);
            this.field8094 = true;
            this.method3179(-105);
            this.method3177(-242, var3);
        }
        int var4 = 5 / ((arg1 - 34) / 49);
        field8082++;
    }

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "(B)I", line = 179)
    private final int method3182(byte arg0) {
        field8086++;
        int var2 = this.field8091.method2777(true, this.field8095) * this.field8098;
        if (arg0 <= 11) {
            this.field8088 = -122;
        }
        return this.field8094 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "(B)Z", line = 196)
    public final boolean method3183(byte arg0) {
        field8084++;
        if (!this.field8091.field6993) {
            int var3 = 80 % ((arg0 + 25) / 47);
            return false;
        }
        int var2 = this.method3182((byte) 28);
        this.field8091.method2811(this, -2);
        OpenGL.glGenerateMipmapEXT(this.field8096);
        this.field8094 = true;
        this.method3179(-97);
        this.method3177(-242, var2);
        return true;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V")
    public abstract void method1363(byte arg0);
}
