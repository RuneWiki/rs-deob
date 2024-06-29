import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class62 extends RuntimeException {

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1436;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Ljava/lang/String;")
    public String field1431;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Lr;")
    public static class118 field1435 = class153.method1136(89, "::qa_op_test");

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Lqb;")
    public static class113 field1432 = new class113();

    @OriginalMember(owner = "client!j", name = "k", descriptor = "Lge;")
    public static class47 field1440 = new class47(64);

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Lr;")
    public static class118 field1442 = class153.method1136(76, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field1441 = 0;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "Ljc;")
    public static class65 field1443;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "[I")
    public static int[] field1434;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "[I")
    public static int[] field1439;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Lr;")
    public static final class118 method556(int arg0, int arg1, int arg2) {
        field1437++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return class106.field2469;
        } else if (var3 < -6) {
            return class120.field2784;
        } else if (var3 < -3) {
            return class101.field2345;
        } else {
            int var4 = -62 / ((-arg0 - 34) / 54);
            if (var3 < 0) {
                return class132.field3019;
            } else if (var3 > 9) {
                return class92.field2195;
            } else if (var3 > 6) {
                return class115.field2700;
            } else if (var3 > 3) {
                return class97.field2267;
            } else if (var3 > 0) {
                return class157.field3624;
            } else {
                return class73.field1690;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class62(Throwable arg0, String arg1) {
        this.field1436 = arg0;
        this.field1431 = arg1;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method557(int arg0) {
        field1439 = null;
        field1432 = null;
        field1435 = null;
        field1443 = null;
        field1434 = null;
        field1442 = null;
        field1440 = null;
        if (arg0 > -32) {
            field1435 = null;
        }
    }
}
