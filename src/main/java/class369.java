import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class369 {

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "Z")
    public static boolean field5013 = false;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field5012 = 0;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "[I")
    public static int[] field5014;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
    public static void method2210(int arg0) {
        if (arg0 <= 60) {
            field5012 = 40;
        }
        field5014 = null;
    }

    static {
        new class104("Ok", "Okay", "OK", "Ok");
        field5014 = new int[8];
    }
}
