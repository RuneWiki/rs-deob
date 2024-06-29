import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class33 {

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "I")
    public static int field437 = 0;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "I")
    public static int field436 = 0;

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "I")
    public static int field439 = 0;

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Laa;IZI)Lea;", line = 29)
    public static final class10 method233(class2 arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            field439 = 76;
        }
        return class31.method226(arg3, arg0, 0, arg1) ? class29.method206(-1) : null;
    }
}
