import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class60 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field1503 = 0;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lgd;")
    private static class40 field1507 = class14.method90(false, "Loaded gamescreen");

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field1504 = 0;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "[I")
    public static int[] field1508 = new int[] { 0, 0, 2, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, -2, 0, 1, 0, 1, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 6, 6, 0, 0, 0, 0, 0, 0, 0, 10, 2, 4, 0, 10, 0, 2, 0, 0, 0, 7, 4, 0, 0, 2, 5, 6, 0, 0, 0, 0, 2, 1, 0, 0, 15, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 3, 10, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 2, 6, 0, 0, 0, 14, 0, 0, 0, -2, 0, 0, 0, 7, 0, 6, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 3, 4, 5, 0, 0, 0, 0, 3, 2, 3, 0, 0, 0, 0, 0, -2, 0, -2, 0, 0, 0, 0, 6, 0, 0, 0, 6, 0, 0, -2, 0, -2, 0, 0, 4, 0, 0, 0, 6, 0, 0, 6, 0, 0, 0, 0, 4, 0, 0, -2, 0, 1, 0, 0, 0, 0, 2, 0, 0, 0, 5, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, -1, 3, 0, 6, 1, 0, 0, 0, 1, 5, 0, 0, 0 };

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field1511 = 7759444;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Lgd;")
    public static class40 field1513 = field1507;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "J")
    public static volatile long field1509 = 0L;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Lee;")
    public static class30 field1505;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Ljava/awt/Image;")
    public static Image field1512;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "[[I")
    public static int[][] field1502;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIII)Z", line = 19)
    public static final boolean method446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1506++;
        if (class94.method638(arg6, 0)) {
            if (arg1 < 54) {
                field1507 = null;
            }
            return class91.method617(0, (byte) -41, arg5, 0, -1, arg4, class129.field3093[arg6], arg0, arg3, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 46)
    public static void method447(int arg0) {
        field1507 = null;
        field1512 = null;
        field1502 = null;
        field1508 = null;
        field1513 = null;
        field1505 = null;
        if (arg0 != 1585) {
            field1509 = -38L;
        }
    }
}
