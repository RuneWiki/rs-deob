import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class80 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field1399 = 2;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field1406 = 0;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Lai;")
    public static class10 field1407 = class44.method278("Clientscript error )2 check log for details", -86);

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "Lai;")
    public static class10 field1402 = class44.method278("Bitte versuchen Sie)1", 100);

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lai;")
    private static class10 field1400 = class44.method278("Unable to find ", -126);

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Lai;")
    public static class10 field1405 = field1400;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
    public static final void method490(int arg0, int arg1) {
        field1403++;
        if (arg0 == -1 || !class130.field2476[arg0]) {
            return;
        }
        class134.field2522.method136(arg0, (byte) 45);
        if (class205.field3990[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = arg1; var3 < class205.field3990[arg0].length; var3++) {
            if (class205.field3990[arg0][var3] != null) {
                if (class205.field3990[arg0][var3].field3888 == 2) {
                    var2 = false;
                } else {
                    class205.field3990[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class205.field3990[arg0] = null;
        }
        class130.field2476[arg0] = false;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)J")
    public static final synchronized long method491(int arg0) {
        field1404++;
        if (arg0 != 2) {
            return 40L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < class57.field1000) {
            class186.field3555 += class57.field1000 - var1;
        }
        class57.field1000 = var1;
        return class186.field3555 + var1;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public static void method492(int arg0) {
        if (arg0 == 0) {
            field1402 = null;
            field1405 = null;
            field1400 = null;
            field1407 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZI)Lai;")
    public static final class10 method493(boolean arg0, int arg1) {
        field1401++;
        if (!arg0) {
            field1407 = null;
        }
        if (arg1 < 100000) {
            return class67.method440(0, new class10[] { class194.field3697, class119.method846(0, arg1), class146.field2793 });
        } else if (arg1 < 10000000) {
            return class67.method440(0, new class10[] { class96.field1762, class119.method846(0, arg1 / 1000), class186.field3536, class146.field2793 });
        } else {
            return class67.method440(0, new class10[] { class140.field2645, class119.method846(0, arg1 / 1000000), class179.field3387, class146.field2793 });
        }
    }
}
