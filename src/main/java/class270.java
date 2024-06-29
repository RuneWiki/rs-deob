import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class270 extends class30 {

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "[I")
    public int[] field3760;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "[I")
    public int[] field3757;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field3761 = 0;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3758;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V")
    public static final void method1735(int arg0, int arg1, int arg2) {
        class452 var3 = class443.field6672[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field6812 != null) {
            var3.field6812 = null;
        }
        if (var3.field6797 != null) {
            var3.field6797 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
    public static void method1736(int arg0) {
        if (arg0 != 51) {
            field3761 = -63;
        }
        field3758 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI)Z")
    public static final boolean method1737(byte arg0, int arg1) {
        field3759++;
        if (arg1 == 51 || arg1 == 12 || arg1 == 18 || arg1 == 13 || arg1 == 1012) {
            return true;
        } else {
            if (arg0 != -36) {
                field3758 = null;
            }
            return arg1 == 25 || arg1 == 1007;
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(III)V")
    public static final void method1738(int arg0, int arg1, int arg2) {
        class452 var3 = class443.field6672[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field6809 != null) {
            var3.field6809 = null;
        }
        if (var3.field6815 != null) {
            var3.field6815 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(II[I[I)V")
    public class270(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field3760 = arg2;
        this.field3757 = arg3;
    }
}
