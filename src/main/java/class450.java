import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class450 extends class446 {

    @OriginalMember(owner = "client!av", name = "u", descriptor = "I")
    private int field6701;

    @OriginalMember(owner = "client!av", name = "w", descriptor = "Le;")
    public static class369 field6703;

    @OriginalMember(owner = "client!av", name = "z", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!av", name = "y", descriptor = "Lki;")
    public static class498 field6705;

    @OriginalMember(owner = "client!av", name = "B", descriptor = "[I")
    public static int[] field6708;

    @OriginalMember(owner = "client!av", name = "A", descriptor = "F")
    public static float field6707;

    @OriginalMember(owner = "client!av", name = "r", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!av", name = "s", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!av", name = "t", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!av", name = "v", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!av", name = "x", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!av", name = "C", descriptor = "Lie;")
    public static class6 field6709;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
    public final void method1726(int arg0) {
        ++field6698;
        if (arg0 != 0) {
            method2717((byte) 125, 15);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Z[J[Ljava/lang/Object;)V")
    public static final void method2715(boolean arg0, long[] arg1, Object[] arg2) {
        ++field6704;
        class451.method2720(arg2, arg1.length - 1, (byte) 21, arg1, 0);
        if (!arg0) {
            field6703 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(IZ)V")
    public final void method2716(int arg0, boolean arg1) {
        ++field6702;
        if (arg0 != 8416) {
            method2718((byte) -74);
        }
        super.field6637.method2200(this, (byte) 112);
        OpenGL.glTexParameteri(super.field6633, 10242, !arg1 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(BI)Lid;")
    public static final class412 method2717(byte arg0, int arg1) {
        ++field6699;
        if (class76.field1131 && ~arg1 <= ~class89.field1355 && class26.field278 >= arg1) {
            if (arg0 != 86) {
                method2717((byte) 10, 116);
            }
            return class6.field83[arg1 - class89.field1355];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
    public static void method2718(byte arg0) {
        if (arg0 == 35) {
            field6708 = null;
            field6705 = null;
            field6709 = null;
            field6703 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lod;II[BI)V")
    public class450(class349 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field6701 = arg2;
        super.field6637.method2200(this, (byte) 113);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field6633, 0, super.field6646, this.field6701, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2683(true, 0);
    }

    static {
        new class475("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field6703 = new class369(0);
        field6706 = 0;
        field6705 = new class498(54, 16);
        field6708 = new int[1];
        field6707 = 0.0F;
    }
}
