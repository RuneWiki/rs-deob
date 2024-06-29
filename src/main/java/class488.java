import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class488 {

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "Z")
    public static boolean field6875;

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "Liu;")
    public static class517 field6874;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "Ljava/lang/String;")
    public static String field6873;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method2790(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class162.field2401 = arg0;
        class390.field5828 = 0x1 << class162.field2401;
        class468.field6745 = class390.field5828 >> 1;
        class434.field6377 = (int) Math.sqrt((double) (class468.field6745 * class468.field6745 + class468.field6745 * class468.field6745));
        class214.field3240 = class390.field5828 >> 2;
        class619.field8736 = class390.field5828;
        class362.field5145 = arg2;
        class305.field4400 = arg3;
        class90.field1610 = arg4;
        class598.field8507 = new class184[arg1][class362.field5145][class305.field4400];
        class587.field8363 = new class542[arg1];
        if (arg5) {
            class99.field1716 = new int[class362.field5145][class305.field4400];
            class103.field1746 = new byte[class362.field5145][class305.field4400];
            class470.field6764 = new short[class362.field5145][class305.field4400];
            class245.field3546 = new class184[1][class362.field5145][class305.field4400];
            class73.field1360 = new class542[1];
        } else {
            class99.field1716 = null;
            class103.field1746 = null;
            class470.field6764 = null;
            class245.field3546 = null;
            class73.field1360 = null;
        }
        if (arg6) {
            class90.field1621 = new long[arg1][arg2][arg3];
            class477.field6820 = new class624[65535];
            class93.field1644 = new boolean[65535];
            class73.field1363 = 0;
        } else {
            class90.field1621 = null;
            class477.field6820 = null;
            class93.field1644 = null;
            class73.field1363 = 0;
        }
        class555.method3111(false);
        class350.field5012 = new class314[1000];
        class546.field7593 = 0;
        class54.field781 = new class314[1000];
        class168.field2451 = 0;
        class310.field4552 = new int[arg1][class362.field5145 + 1][class305.field4400 + 1];
        class393.field5892 = new class360[5000];
        class262.field3831 = 0;
        class183.field2645 = new boolean[class90.field1610 + class90.field1610 + 1][class90.field1610 + class90.field1610 + 1];
        class604.field8600 = new boolean[class90.field1610 + class90.field1610 + 2][class90.field1610 + class90.field1610 + 2];
        class181.field2624 = null;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
    public static void method2791(int arg0) {
        field6874 = null;
        if (arg0 <= 90) {
            method2790(56, 59, 23, -8, -37, true, false);
        }
        field6873 = null;
    }

    static {
        new class567("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field6875 = false;
        field6874 = new class517(67, 12);
    }
}
