import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class175 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Lpi;")
    public static class340 field2246 = new class340(109, 3);

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 3)
    public static void method1138(byte arg0) {
        field2246 = null;
        if (arg0 != 29) {
            field2246 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLoh;I)Lpd;", line = 17)
    public static final class319 method1139(byte arg0, class448 arg1, int arg2) {
        field2247++;
        int var3 = -113 % ((-arg0 - 42) / 59);
        class319 var4;
        if (class61.field801 == null) {
            var4 = new class319();
        } else {
            var4 = class61.field801;
            class61.field801 = class61.field801.field4102;
            var4.field4102 = null;
            class242.field3110--;
        }
        var4.field4107 = arg1;
        var4.field4104 = arg2;
        return var4;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)Lnm;", line = 47)
    public static final class270 method1140(int arg0, int arg1, int arg2) {
        class510 var3 = class470.field6877[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7502;
    }
}
