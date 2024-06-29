import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class350 {

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    public int field4884;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "[I")
    public int[] field4882;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "[I")
    public int[] field4881;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "Lej;")
    public static class124 field4880 = new class124(80, 7);

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "Lmu;")
    public static class303 field4883 = new class303(43, 4);

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "F")
    public static float field4885;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
    public static void method2194(int arg0) {
        if (arg0 != 40960) {
            field4883 = null;
        }
        field4880 = null;
        field4883 = null;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)I")
    public static final int method2195(int arg0, int arg1) {
        if (arg0 != -3358) {
            return 126;
        }
        field4886++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(I)V")
    public class350(int arg0) {
        this.field4884 = arg0;
        this.field4882 = new int[this.field4884];
        this.field4881 = new int[this.field4884];
    }
}
