import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class347 extends class271 implements class452 {

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    private int field4986 = -1;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
    private int field4995 = -1;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    private int field4991;

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "I")
    public int field4996;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "Lod;")
    private class349 field4992;

    @OriginalMember(owner = "client!ve", name = "R", descriptor = "I")
    public int field4999;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    private int field4989;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    private int field4990;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    public static int field4994 = 0;

    @OriginalMember(owner = "client!ve", name = "Q", descriptor = "Z")
    public static boolean field4998 = false;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!ve", name = "P", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!ve", name = "S", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BII)V", line = 3)
    public final void method2110(byte arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg2, 36161, this.field4989);
        field4985++;
        this.field4986 = arg2;
        this.field4995 = arg1;
        int var4 = -92 % ((arg0 + 54) / 63);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Z", line = 17)
    public static final boolean method2111(int arg0, int arg1, int arg2) {
        field4993++;
        if (arg2 != -1) {
            method2111(-70, -98, 124);
        }
        return (arg0 & 0x70000) != 0 | class102.method622(arg1, (byte) 50, arg0) || class163.method1134(arg0, (byte) -120, arg1);
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lod;III)V", line = 84)
    public class347(class349 arg0, int arg1, int arg2, int arg3) {
        this.field4991 = arg1;
        this.field4996 = arg2;
        this.field4992 = arg0;
        this.field4999 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class361.field5553, 0);
        this.field4989 = class361.field5553[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field4989);
        OpenGL.glRenderbufferStorageEXT(36161, this.field4991, this.field4996, this.field4999);
        this.field4990 = this.field4999 * this.field4996 * this.field4992.method2129(this.field4991, -115);
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lod;IIII)V", line = 102)
    public class347(class349 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4999 = arg3;
        this.field4992 = arg0;
        this.field4991 = arg1;
        this.field4996 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class361.field5553, 0);
        this.field4989 = class361.field5553[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field4989);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field4991, this.field4996, this.field4999);
        this.field4990 = this.field4999 * this.field4996 * this.field4992.method2129(this.field4991, -104);
    }

    @OriginalMember(owner = "client!ve", name = "finalize", descriptor = "()V", line = 39)
    protected final void finalize() throws Throwable {
        field4987++;
        this.method2112(-1);
        super.finalize();
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)V", line = 49)
    public final void method2112(int arg0) {
        field4988++;
        if (arg0 > ~this.field4989) {
            this.field4992.method2143((byte) 127, this.field4989, this.field4990);
            this.field4989 = 0;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 65)
    public final void method1726(int arg0) {
        field4997++;
        OpenGL.glFramebufferRenderbufferEXT(this.field4995, this.field4986, 36161, arg0);
        this.field4986 = -1;
        this.field4995 = -1;
    }
}
