import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class200 {

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3192 = "flash3:";

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
    public static int[] field3190 = new int[500];

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3193 = "Use";

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "[[I")
    public static int[][] field3196 = new int[5][5000];

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "J")
    public static long field3191 = 0L;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "C")
    public static char field3194;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3195;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)V")
    public static final void method1350(byte arg0, int arg1) {
        field3188++;
        class193.field3095.method476(false, arg1);
        class227.field3757.method476(false, arg1);
        if (arg0 != -98) {
            field3187 = 28;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method1351(byte arg0) {
        if (arg0 < 70) {
            field3194 = 'p';
        }
        field3192 = null;
        field3193 = null;
        field3196 = null;
        field3195 = null;
        field3190 = null;
    }
}
