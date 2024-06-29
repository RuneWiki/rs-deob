import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public class class40 {

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "I")
    public static int field535 = 0;

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "Ls;")
    public static class34 field536 = class9.method35("Clothes Shop", 220);

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(I)V", line = 18)
    public static void method268(int arg0) {
        field536 = null;
        int var1 = -73 % ((35 - arg0) / 63);
    }
}
