import jaggl.OpenGL;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class348 extends class538 {

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
    private int field5375;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
    public static int field5377 = 2;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "Lla;")
    public static class319 field5378 = new class319(14, -2);

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
    public static int field5380 = -1;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "F")
    public static float field5371;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lnq;II[BI)V")
    public class348(class325 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field5375 = arg2;
        super.field7884.method2075(this, 0);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field7881, 0, super.field7878, this.field5375, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3176(false, true);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZ)V")
    public final void method2247(int arg0, boolean arg1) {
        super.field7884.method2075(this, arg0 ^ arg0);
        ++field5370;
        OpenGL.glTexParameteri(super.field7881, 10242, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)V")
    public static void method2248(int arg0) {
        field5378 = null;
        if (arg0 != 1) {
            method2248(-55);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
    public final void method2(boolean arg0) {
        if (!arg0) {
            ++field5372;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLuu;Lqa;)V")
    public static final void method2249(byte arg0, class191 arg1, class165 arg2) {
        if (arg0 > -108) {
            field5371 = -1.0646689F;
        }
        ++field5373;
        if (!class201.field2704) {
            arg2.method834(0);
            class451.field6771 = arg2.method774(class252.method1631(arg1, class290.field4253), true);
            class451.field6771.method2201((class147.field1961 + -class451.field6771.method302()) / 2, (class107.field1525 + -class451.field6771.method306()) / 2);
            class534.field7851 = arg2.method774(class252.method1631(arg1, class94.field1372), true);
            class534.field7851.method2201((class147.field1961 - class534.field7851.method302()) / 2, 18);
            class201.field2704 = true;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLjava/awt/Component;)Llv;")
    public static final class313 method2250(byte arg0, Component arg1) {
        if (arg0 >= -117) {
            return null;
        } else {
            ++field5374;
            return new class451(arg1);
        }
    }
}
