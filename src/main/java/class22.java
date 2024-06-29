import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class22 {

    @OriginalMember(owner = "client!an", name = "f", descriptor = "[[I")
    public static int[][] field151 = new int[6][];

    @OriginalMember(owner = "client!an", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field147 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!an", name = "h", descriptor = "Ljava/lang/String;")
    public static String field153 = null;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "Z")
    public static boolean field152 = false;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "Lui;")
    public static class193 field146;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V", line = 20)
    public static void method138(boolean arg0) {
        field153 = null;
        field151 = null;
        field146 = null;
        if (!arg0) {
            field152 = false;
        }
        field147 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IZIBIILjava/lang/String;Ljava/lang/String;JZI)V", line = 34)
    public static final void method139(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, String arg6, String arg7, long arg8, boolean arg9, int arg10) {
        field149++;
        if (class473.field6634 || class199.field2397 >= 500) {
            return;
        }
        int var12 = arg4 == -1 ? class71.field684 : arg4;
        class99 var13 = new class99(arg7, arg6, var12, arg0, arg10, arg8, arg5, arg2, arg1, arg9);
        class89.field1096.method1040(var13, -104);
        if (arg3 != 65) {
            field153 = null;
        }
        class199.field2397++;
    }
}
