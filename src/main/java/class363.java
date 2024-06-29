import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public abstract class class363 extends class103 {

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
    public int field5151;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
    public int field5149;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
    public int field5152;

    @OriginalMember(owner = "client!nba", name = "k", descriptor = "I")
    public int field5156;

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "[I")
    public static int[] field5150 = new int[1];

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "J")
    public static long field5153 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IZ)Z", line = 10)
    public static final boolean method2190(int arg0, boolean arg1) {
        if (!arg1) {
            field5153 = 11L;
        }
        field5155++;
        return arg0 == 2 || arg0 == 4 || arg0 == 5;
    }

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "(I)V", line = 22)
    public static void method2191(int arg0) {
        field5150 = null;
        if (arg0 < 105) {
            field5153 = -73L;
        }
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(IIII)V", line = 39)
    public class363(int arg0, int arg1, int arg2, int arg3) {
        this.field5151 = arg2;
        this.field5149 = arg3;
        this.field5152 = arg1;
        this.field5156 = arg0;
    }
}
