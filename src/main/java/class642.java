import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class642 {

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    private int field9056;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field9049;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field9050;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field9051;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field9052;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field9055;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IC)V")
    public final void method3574(int arg0, char arg1) {
        if (arg0 > 51) {
            field9049++;
            OpenGL.glCallList(this.field9056 + arg1);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static final void method3575(byte arg0) {
        field9052++;
        if (arg0 != -85) {
            field9054 = -58;
        }
        class229.field3593.method2279(arg0 + 85);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBZ)Lib;")
    public static final class138 method3576(int arg0, byte arg1, boolean arg2) {
        field9055++;
        if (arg1 > -25) {
            method3575((byte) 28);
        }
        long var3 = (long) ((arg2 ? Integer.MIN_VALUE : 0) | arg0);
        return (class138) class555.field7856.method1405(var3, (byte) -76);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
    public final void method3577(byte arg0) {
        field9051++;
        if (arg0 <= -24) {
            OpenGL.glEndList();
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)I")
    public static final int method3578(int arg0, int arg1) {
        return class161.field2313 == null ? 0 : class161.field2313[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)V")
    public final void method3579(byte arg0, int arg1) {
        if (arg0 < -65) {
            field9050++;
            OpenGL.glNewList(this.field9056 + arg1, 4864);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V")
    public static final void method3580(int arg0, int arg1, int arg2) {
        field9053++;
        if (arg0 != 26394) {
            method3578(40, 60);
        }
        class191 var3 = class6.method38(6, -128, arg2);
        var3.method1285((byte) -1);
        var3.field2754 = arg1;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lok;I)V")
    public class642(class228 arg0, int arg1) {
        this.field9056 = OpenGL.glGenLists(arg1);
    }
}
