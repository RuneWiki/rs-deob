import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class460 {

    @OriginalMember(owner = "client!av", name = "c", descriptor = "Lbd;")
    public static class44 field6662 = new class44("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!av", name = "d", descriptor = "[I")
    public static int[] field6663 = new int[25];

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public static int field6664 = 0;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
    public static void method2729(byte arg0) {
        field6663 = null;
        if (arg0 < -120) {
            field6662 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(B)V")
    public static final void method2730(byte arg0) {
        class431.field6196 = class425.field6028.field1863 + class425.field6028.field1854 + 2;
        class290.field4298 = new String[500];
        field6661++;
        class14.field156 = class218.field3334.field1863 + class218.field3334.field1854 + 2;
        for (int var1 = 0; var1 < class290.field4298.length; var1++) {
            class290.field4298[var1] = "";
        }
        if (arg0 != -102) {
            field6664 = -13;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2731(String arg0, int arg1) {
        if (arg1 >= 67) {
            System.out.println("Error: " + class67.method533("\n", false, arg0, "%0a"));
            field6660++;
        }
    }
}
