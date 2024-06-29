import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class586 {

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "Lcl;")
    public class280 field7972 = new class280();

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "Lmw;")
    public static class517 field7975 = new class517(32, 3);

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "Lmw;")
    public static class517 field7976 = new class517(60, 16);

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    public static int field7973;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public static int field7974;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
    public static void method3296(int arg0) {
        field7975 = null;
        field7976 = null;
        if (arg0 != -9) {
            method3297(true, 38);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZI)Z")
    public static final boolean method3297(boolean arg0, int arg1) {
        field7973++;
        if (!arg0) {
            field7976 = null;
        }
        return arg1 == 7 || arg1 == 8 || arg1 == 9;
    }
}
