import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class84 extends class124 {

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
    public int field1780 = 1000;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "Lpe;")
    public static class109 field1776 = class141.method1120("Hidden)2", 0);

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "Lpe;")
    private static class109 field1781 = class141.method1120("Loading interfaces )2 ", 0);

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "Lpe;")
    public static class109 field1777 = field1781;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "Ljb;")
    public static class64 field1779 = new class64(4096);

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "[I")
    public static int[] field1784 = new int[2048];

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
    public static int field1783 = 0;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    public static int field1786 = -1;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "Lbc;")
    public static class11 field1785 = new class11(64);

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "Z")
    public static boolean field1791 = false;

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "Lpe;")
    public static class109 field1790 = class141.method1120("Abbrechen", 0);

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "Lre;")
    public static class123 field1788;

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "Lk;")
    public static class69 field1789;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIIII)V")
    public void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1782++;
        class155 var10 = this.method16(9698);
        if (var10 != null) {
            this.field1780 = var10.field1780;
            var10.method710(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
    public static void method711(int arg0) {
        field1779 = null;
        field1784 = null;
        field1781 = null;
        field1777 = null;
        field1789 = null;
        field1776 = null;
        field1788 = null;
        field1790 = null;
        field1785 = null;
        if (arg0 != 23649) {
            field1781 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)Lwb;")
    public class155 method16(int arg0) {
        field1787++;
        if (arg0 != 9698) {
            field1792 = 27;
        }
        return null;
    }
}
