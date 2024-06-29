import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class484 {

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field7129 = 104;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "Ls;")
    public static class186 field7130 = new class186(85, 8);

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "F")
    public static float field7127;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V", line = 7)
    public static void method2902(byte arg0) {
        if (arg0 < 79) {
            method2902((byte) -15);
        }
        field7130 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIIZZ)V", line = 19)
    public static final void method2903(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class353.field5216 = arg0;
        class19.field312 = 0x1 << class353.field5216;
        class421.field6346 = class19.field312 >> 1;
        class250.field3865 = (int) Math.sqrt((double) (class421.field6346 * class421.field6346 + class421.field6346 * class421.field6346));
        class31.field499 = class19.field312 >> 2;
        class113.field2039 = class19.field312;
        class493.field7231 = arg2;
        class220.field3464 = arg3;
        class97.field1894 = arg4;
        class224.field3513 = new class234[arg1][class493.field7231][class220.field3464];
        class531.field7727 = new class38[arg1];
        if (arg5) {
            class281.field4248 = new int[class493.field7231][class220.field3464];
            class214.field3393 = new byte[class493.field7231][class220.field3464];
            class283.field4264 = new short[class493.field7231][class220.field3464];
            class310.field4698 = new class234[1][class493.field7231][class220.field3464];
            class293.field4481 = new class38[1];
        } else {
            class281.field4248 = null;
            class214.field3393 = null;
            class283.field4264 = null;
            class310.field4698 = null;
            class293.field4481 = null;
        }
        if (arg6) {
            class383.field5598 = new long[arg1][arg2][arg3];
            class248.field3825 = new class188[65535];
            class48.field989 = new boolean[65535];
            class429.field6417 = 0;
        } else {
            class383.field5598 = null;
            class248.field3825 = null;
            class48.field989 = null;
            class429.field6417 = 0;
        }
        class124.method985(false);
        class161.field2589 = new class519[1000];
        class296.field4501 = 0;
        class488.field7187 = new class519[1000];
        class292.field4473 = 0;
        class486.field7165 = new int[arg1][class493.field7231 + 1][class220.field3464 + 1];
        class62.field1266 = new class402[5000];
        class229.field3555 = 0;
        class38.field559 = new boolean[class97.field1894 + class97.field1894 + 1][class97.field1894 + class97.field1894 + 1];
        class486.field7158 = new boolean[class97.field1894 + class97.field1894 + 2][class97.field1894 + class97.field1894 + 2];
        class192.field3104 = null;
    }
}
