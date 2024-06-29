import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class425 {

    @OriginalMember(owner = "client!iga", name = "e", descriptor = "[Lmu;")
    public static class275[] field6135 = new class275[300];

    @OriginalMember(owner = "client!iga", name = "f", descriptor = "Llk;")
    public static class545 field6136 = null;

    @OriginalMember(owner = "client!iga", name = "g", descriptor = "[I")
    public static int[] field6137 = new int[16];

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "J")
    public long field6132;

    @OriginalMember(owner = "client!iga", name = "h", descriptor = "Lom;")
    public static class344 field6138;

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "Liga;")
    public class425 field6134;

    @OriginalMember(owner = "client!iga", name = "i", descriptor = "Liga;")
    public class425 field6139;

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(I)V")
    public static void method2587(int arg0) {
        field6136 = null;
        field6138 = null;
        field6137 = null;
        field6135 = null;
        if (arg0 != -32345) {
            field6136 = null;
        }
    }

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "(I)V")
    public final void method2588(int arg0) {
        field6133++;
        if (arg0 != 300) {
            this.field6132 = -103L;
        }
        if (this.field6139 != null) {
            this.field6139.field6134 = this.field6134;
            this.field6134.field6139 = this.field6139;
            this.field6139 = null;
            this.field6134 = null;
        }
    }

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "(I)Z")
    public final boolean method2589(int arg0) {
        field6131++;
        if (this.field6139 == null) {
            return false;
        } else {
            if (arg0 != 300) {
                this.field6132 = 19L;
            }
            return true;
        }
    }
}
