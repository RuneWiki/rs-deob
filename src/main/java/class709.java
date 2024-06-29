import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class709 extends class487 {

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    private int field9985;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
    public static int field9984;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
    public static int field9986;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
    public static int field9987;

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "I")
    public static int field9988;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIBII)V")
    public static final void method3927(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field9987;
        if (arg3 >= -37) {
            field9986 = -48;
        }
        for (int var6 = arg4; arg0 >= var6; ++var6) {
            class608.method3484(class77.field1131[var6], arg1, -7, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lrs;II[BI)V")
    public class709(class166 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field9985 = arg2;
        super.field7044.method1306(this, 93);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field7045, 0, super.field7033, this.field9985, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2967(true, true);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
    public final void method2069(byte arg0) {
        ++field9988;
        if (arg0 != -31) {
            this.method2069((byte) -26);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BZ)V")
    public final void method3928(byte arg0, boolean arg1) {
        int var3 = -59 / ((arg0 - -77) / 42);
        ++field9984;
        super.field7044.method1306(this, 34);
        OpenGL.glTexParameteri(super.field7045, 10242, arg1 ? 10497 : 33071);
    }
}
