import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class99 {

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "[I")
    public static int[] field1378 = new int[6];

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "Lkr;")
    public static class602 field1377 = new class602(101, 6);

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "Lst;")
    public static class335 field1379 = new class335(21, 7);

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "Luv;")
    public static class755 field1380 = null;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1382 = new BigInteger("b24cfee8c82a5dbaaab59dda2d063699105c6a0851c09a24136af17e645e4bd99ce4ee6f808501763d7f9194fcf9c4926e7b34f534371a96d304ea32df76098b", 16);

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "[I")
    public static int[] field1383 = new int[32];

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "[I")
    public static int[] field1381;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method669(boolean arg0, String arg1) {
        System.out.println("Error: " + class723.method4041("%0a", "\n", arg1, 0));
        if (!arg0) {
            field1381 = null;
        }
        field1376++;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public static void method670(int arg0) {
        field1380 = null;
        if (arg0 <= 2) {
            field1382 = null;
        }
        field1378 = null;
        field1377 = null;
        field1379 = null;
        field1382 = null;
        field1383 = null;
        field1381 = null;
    }
}
