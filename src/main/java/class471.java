import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class471 extends class7 {

    @OriginalMember(owner = "client!lv", name = "u", descriptor = "I")
    private int field6510;

    @OriginalMember(owner = "client!lv", name = "v", descriptor = "Ljw;")
    public static class581 field6511 = new class581(42, -2);

    @OriginalMember(owner = "client!lv", name = "w", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!lv", name = "x", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(III)Lcl;")
    public static final class280 method2772(int arg0, int arg1, int arg2) {
        class243 var3 = class626.field8501[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3277;
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(II)I")
    public static int method2773(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "(I)V")
    public static void method2774(int arg0) {
        field6511 = null;
        if (arg0 != 3552) {
            method2772(102, -2, 9);
        }
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Ldia;II[BI)V")
    public class471(class246 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field6510 = arg2;
        super.field81.method1653((byte) 100, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field68, 0, super.field67, this.field6510, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method52(false, true);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
    public final void method58(int arg0) {
        ++field6513;
        if (arg0 != -1) {
            field6511 = null;
        }
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(BZ)V")
    public final void method2775(byte arg0, boolean arg1) {
        super.field81.method1653((byte) 103, this);
        if (arg0 <= 72) {
            this.field6510 = -59;
        }
        ++field6512;
        OpenGL.glTexParameteri(super.field68, 10242, !arg1 ? 33071 : 10497);
    }
}
