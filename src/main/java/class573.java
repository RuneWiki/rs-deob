import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class573 {

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "[I")
    public static int[] field7995 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "Lrga;")
    public static class280 field7997 = new class280(26, 11);

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 10)
    public static void method3162(int arg0) {
        field7995 = null;
        if (arg0 != 12531) {
            method3163(32);
        }
        field7997 = null;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)Ltba;", line = 27)
    public static final class704 method3163(int arg0) {
        field7996++;
        class704 var1 = class72.method423(18375);
        var1.field9937 = 0;
        if (arg0 > -94) {
            field7997 = null;
        }
        var1.field9930 = null;
        var1.field9929 = new class30(5000);
        return var1;
    }
}
