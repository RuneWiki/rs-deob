import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class206 {

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field3312 = 0;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
    public static int[] field3313 = new int[200];

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Z")
    public static boolean field3314 = true;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Z")
    public static boolean field3315 = false;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3317;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "[[B")
    public static byte[][] field3311;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
    public static final int method1510(int arg0, int arg1) {
        if (arg1 == -847897881) {
            field3310++;
            return arg0 >>> 7;
        } else {
            return -105;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static void method1511(int arg0) {
        field3313 = null;
        field3311 = null;
        if (arg0 == -847897881) {
            field3317 = null;
        }
    }
}
