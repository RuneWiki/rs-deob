import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class186 {

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Ljg;")
    public static class241 field2797 = new class241(30);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Lsn;")
    public static class183 field2796;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method1132(int arg0) {
        field2796 = null;
        if (arg0 != 0) {
            method1132(120);
        }
        field2797 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILtg;I)V")
    public static final void method1133(int arg0, class451 arg1, int arg2) {
        if (class261.field3963) {
            class261.field3963 = false;
            arg0 = 0;
        }
        field2793++;
        if (class81.field1083 == null || !class81.field1083.method2781(true, arg1)) {
            class81.field1083 = arg1;
            class432.field6336 = class445.method2750(arg2 - 40501);
            class5.field56 = arg0;
            class344.field5145 = arg0;
            if (class344.field5145 == 0) {
                class241.method1487(30721);
            } else {
                class416.field6176 = class140.field1881;
                class91.field1290 = class95.field1327;
                class150.field2071 = class412.field6130;
                class303.field4581 = class8.field91;
                class173.field2656 = class409.field6099;
                class306.field4629 = class169.field2458;
                class220.field3359 = class227.field3438;
                class390.field5760 = class213.field3200;
                class172.field2641 = class162.field2252;
                class111.field1461 = class355.field5245;
            }
        }
        if (arg2 != 12921) {
            method1132(114);
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
    public static final void method1134(int arg0) {
        if (arg0 != -17470) {
            method1133(-118, (class451) null, 21);
        }
        field2794++;
        class241 var1 = class295.field4482;
        synchronized (class295.field4482) {
            class295.field4482.method1482((byte) 84);
        }
        class241 var2 = field2797;
        synchronized (field2797) {
            field2797.method1482((byte) -97);
        }
    }
}
