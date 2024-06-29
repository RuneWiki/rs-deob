import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class25 {

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field249 = 0;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "[I")
    public static int[] field248 = new int[13];

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field250 = 0;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
    public static void method145(int arg0) {
        if (arg0 <= 87) {
            field249 = 4;
        }
        field248 = null;
    }
}
