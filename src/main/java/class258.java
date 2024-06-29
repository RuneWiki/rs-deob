import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class258 {

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Lcf;")
    private static class93 field4643 = class147.method1066("wave:", -48);

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "Lcf;")
    private static class93 field4650 = class147.method1066("glow2:", -48);

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Lcf;")
    public static class93 field4644 = class147.method1066("jaune:", -48);

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "Lcf;")
    public static class93 field4651 = field4643;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Lcf;")
    public static class93 field4648 = field4650;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Lcf;")
    public static class93 field4641 = field4650;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Lcf;")
    public static class93 field4646 = field4643;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "[Ljb;")
    public static class268[] field4642;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "[S")
    public static short[] field4645;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V")
    public static final void method1740(int arg0, int arg1) {
        field4640++;
        class212 var2 = class123.method905(arg1 - 1205364448, 5, arg0);
        var2.method1502(255);
        if (arg1 != 0) {
            field4646 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method1741(int arg0) {
        field4644 = null;
        field4646 = null;
        field4642 = null;
        field4643 = null;
        if (arg0 != 11411) {
            method1740(-109, -39);
        }
        field4651 = null;
        field4648 = null;
        field4641 = null;
        field4645 = null;
        field4650 = null;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)I")
    public static final int method1742(int arg0) {
        int var1 = 50 % ((arg0 - 17) / 51);
        field4647++;
        return class108.field1851 && class176.field3048[81] && class253.field4549 > 2 ? class214.field3911[class253.field4549 - 2] : class214.field3911[class253.field4549 - 1];
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BIIII)V")
    public static final void method1743(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class285.field5105.field5027 = 0;
        field4649++;
        class285.field5105.method1916(86, 81);
        class285.field5105.method1916(arg3, 63);
        class285.field5105.method1916(arg1, 75);
        class285.field5105.method1908(-119, arg4);
        class285.field5105.method1908(-119, arg2);
        class283.field5078 = 1;
        class208.field3735 = 0;
        class68.field1235 = -3;
        class266.field4738 = 0;
        if (arg0 <= 126) {
            method1740(40, 13);
        }
    }
}
