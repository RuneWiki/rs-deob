import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public abstract class class46 {

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "[I")
    public static int[] field887 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field889;

    static {
        new class44("Ok", "Okay", "OK", "Ok");
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 7)
    public static void method434(int arg0) {
        field887 = null;
        if (arg0 != 18052) {
            method434(92);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lie;I)Lie;")
    public abstract class6 method435(class6 arg0, int arg1);
}
