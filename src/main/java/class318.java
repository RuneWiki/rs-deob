import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class318 extends class252 {

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "I")
    private int field4247;

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4248 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!gt", name = "v", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!gt", name = "x", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "[I")
    public static int[] field4245;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "(I)V", line = 5)
    public static void method1893(int arg0) {
        if (arg0 == 22911) {
            field4245 = null;
            field4248 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lur;II[BI)V", line = 18)
    public class318(class377 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field4247 = arg2;
        super.field3354.method2236(this, -23);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field3364, 0, super.field3356, this.field4247, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1555((byte) 125, true);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZ)V", line = 35)
    public final void method1894(int arg0, boolean arg1) {
        super.field3354.method2236(this, 122);
        ++field4246;
        OpenGL.glTexParameteri(super.field3364, 10242, arg1 ? 10497 : 33071);
        if (arg0 != 33071) {
            field4248 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V", line = 47)
    public final void method863(byte arg0) {
        ++field4244;
        if (arg0 != 103) {
            this.method863((byte) -66);
        }
    }
}
