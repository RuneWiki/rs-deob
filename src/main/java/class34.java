import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class34 extends class203 implements class37 {

    @OriginalMember(owner = "client!rca", name = "A", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!rca", name = "F", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client!rca", name = "E", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client!rca", name = "z", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!rca", name = "C", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!rca", name = "D", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!rca", name = "I", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!rca", name = "H", descriptor = "Lkr;")
    public static class329 field517;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(III)Z")
    public static final boolean method204(int arg0, int arg1, int arg2) {
        ++field513;
        if (arg2 != 0) {
            field518 = -52;
        }
        return (393216 & arg0) != 0 | class603.method3462(arg0, arg1, (byte) -19) || class508.method2842(arg1, (byte) 79, arg0);
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lph;Luda;III[B)V")
    public class34(class442 arg0, class509 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class280.field3663, arg2 * arg3 * arg4, false);
        this.field512 = arg4;
        this.field516 = arg2;
        this.field515 = arg3;
        super.field2672.method3344(29639, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field2657, 0, this.method1301(34843), this.field516, this.field515, this.field512, 0, class562.method3158((byte) 127, super.field2656), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZI)Z")
    public static final boolean method205(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field518 = -120;
        }
        ++field511;
        return ~(262144 & arg2) != -1 | class597.method3440((byte) 107, arg2, arg0) || class211.method1343(arg2, 0, arg0);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V")
    public static void method206(int arg0) {
        if (arg0 != -10703) {
            field518 = 65;
        }
        field517 = null;
    }

    static {
        new class344("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
    }
}
