import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class348 {

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "Llja;")
    public static class744 field4347 = new class744(42, 3);

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "[I")
    public static int[] field4349 = new int[5];

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "Lev;")
    public static class722 field4350;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLes;)Leb;")
    public static final class653 method2064(byte arg0, class403 arg1) {
        field4346++;
        class653 var2 = new class653();
        if (arg0 != 67) {
            method2064((byte) 85, null);
        }
        var2.field9014 = arg1.method2390((byte) -100);
        var2.field9012 = class578.field7881.method972(var2.field9014, 1);
        return var2;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
    public static void method2065(byte arg0) {
        field4350 = null;
        field4347 = null;
        if (arg0 > 9) {
            field4349 = null;
        }
    }
}
