import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class571 {

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Lre;")
    private class603 field8081;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "[I")
    public static int[] field8080 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Lqe;")
    public static class469 field8082 = new class469(87, -2);

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "F")
    public static float field8084;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field8077;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field8079;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Lwe;")
    private class408 field8083;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Lwe;", line = 4)
    public final class408 method3306(int arg0) {
        int var2 = 26 % ((arg0 - 61) / 57);
        field8078++;
        class408 var3 = this.field8083;
        if (this.field8081.field8521 == var3) {
            this.field8083 = null;
            return null;
        } else {
            this.field8083 = var3.field6156;
            return var3;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(CI)Z", line = 26)
    public static final boolean method3307(char arg0, int arg1) {
        field8079++;
        if (arg1 != 90) {
            field8080 = null;
        }
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)Lwe;", line = 39)
    public final class408 method3308(byte arg0) {
        field8077++;
        class408 var2 = this.field8081.field8521.field6156;
        if (this.field8081.field8521 == var2) {
            this.field8083 = null;
            return null;
        }
        if (arg0 >= -83) {
            field8082 = null;
        }
        this.field8083 = var2.field6156;
        return var2;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V", line = 61)
    public static void method3309(int arg0) {
        field8080 = null;
        if (arg0 >= 71) {
            field8082 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 81)
    public class571() {
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lre;)V", line = 87)
    public class571(class603 arg0) {
        this.field8081 = arg0;
    }
}
