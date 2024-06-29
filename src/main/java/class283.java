import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class283 {

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "Leea;")
    public static class114 field3931 = new class114();

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "[I")
    public static int[] field3933 = new int[8];

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "[I")
    public static int[] field3935 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public int field3926;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public int field3927;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public int field3928;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public int field3929;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public int field3930;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public int field3932;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field3934;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V", line = 4)
    public static void method1833(int arg0) {
        field3933 = null;
        field3931 = null;
        if (arg0 < -1) {
            field3935 = null;
            field3934 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)I", line = 18)
    public static int method1834(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
