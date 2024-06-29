import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class553 {

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "[S")
    private static short[] field7700 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "[S")
    private static short[] field7704 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "Z")
    public static boolean field7703 = false;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "[S")
    private static short[] field7705 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "[[S")
    public static short[][] field7707 = new short[][] { field7704, field7705, field7700 };

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V", line = 17)
    public static void method3052(int arg0) {
        field7705 = null;
        field7704 = null;
        field7700 = null;
        if (arg0 >= 8) {
            field7707 = null;
        }
    }
}
