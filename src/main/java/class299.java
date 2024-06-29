import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class299 extends class194 {

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    private int field4531;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "Loq;")
    public static class231 field4533 = new class231("", 14);

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "Lsk;")
    public static class423 field4537 = new class423("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "F")
    public static float field4529;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "Llt;")
    public static class458 field4536;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "[Lrn;")
    public static class168[] field4532;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(B)V")
    public static final void method1805(byte arg0) {
        class208.method1272(true);
        ++field4534;
        class197.method1223(class463.field7116.field2957, 2, 22050, 8000);
        class462.field7108 = class85.method603(22050, 0, class7.field86, class257.field3919, 14405);
        if (arg0 <= 55) {
            method1807(78);
        }
        class462.field7108.method1640(class220.field3381, -35);
        class386.field5607 = class85.method603(2048, 1, class7.field86, class257.field3919, 14405);
        class386.field5607.method1640(class178.field2786, -38);
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(ZI)V")
    public final void method1806(boolean arg0, int arg1) {
        super.field3065.method2586(this, false);
        if (arg1 < 25) {
            this.method1111((byte) 108);
        }
        ++field4535;
        OpenGL.glTexParameteri(super.field3066, 10242, !arg0 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public final void method1111(byte arg0) {
        ++field4530;
        if (arg0 >= -104) {
            method1805((byte) -128);
        }
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)V")
    public static void method1807(int arg0) {
        field4536 = null;
        field4532 = null;
        field4533 = null;
        if (arg0 >= -31) {
            field4533 = null;
        }
        field4537 = null;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lbl;II[BI)V")
    public class299(class442 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field4531 = arg2;
        super.field3065.method2586(this, false);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field3066, 0, super.field3067, this.field4531, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1208(true, false);
    }
}
