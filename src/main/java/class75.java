import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class75 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lsg;")
    public static class30 field1667 = class167.method1221((byte) 33, "settings");

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Llk;")
    public static class232 field1665 = new class232(5);

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Lsg;")
    public static class30 field1668 = class167.method1221((byte) 33, "(U");

    @OriginalMember(owner = "client!he", name = "f", descriptor = "[Lva;")
    public static class120[] field1670 = new class120[2048];

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Lnb;")
    public static class265 field1669;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Z")
    public static final boolean method679(int arg0) {
        field1666++;
        try {
            if (arg0 != 0) {
                return false;
            }
            if (class269.field4739 == 2) {
                if (class146.field2805 == null) {
                    class146.field2805 = class165.method1216(class215.field3939, class25.field486, class241.field4266);
                    if (class146.field2805 == null) {
                        return false;
                    }
                }
                if (class112.field2223 == null) {
                    class112.field2223 = new class98(class151.field2874, class268.field4719);
                }
                if (class168.field3108.method633(class24.field464, class112.field2223, (byte) -71, 22050, class146.field2805)) {
                    class168.field3108.method627((byte) 108);
                    class168.field3108.method650(class262.field4622, false);
                    class168.field3108.method643(127, class205.field3675, class146.field2805);
                    class269.field4739 = 0;
                    class146.field2805 = null;
                    class112.field2223 = null;
                    class215.field3939 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class168.field3108.method632((byte) -93);
            class269.field4739 = 0;
            class112.field2223 = null;
            class146.field2805 = null;
            class215.field3939 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static void method680(byte arg0) {
        field1670 = null;
        field1668 = null;
        field1669 = null;
        if (arg0 <= 116) {
            method679(49);
        }
        field1667 = null;
        field1665 = null;
    }
}
