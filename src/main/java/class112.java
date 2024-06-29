import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class112 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lqf;")
    private static class117 field2614 = class72.method514(108, "Moderator option: Mute player for 48 hours: <lt>ON<gt>");

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Lqf;")
    public static class117 field2618 = field2614;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2625 = 0;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "Lqf;")
    public static class117 field2627 = class72.method514(103, " <col=ffff00>");

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field2626 = 0;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lqf;")
    public static class117 field2617 = class72.method514(119, "Ignorieren");

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public int field2619;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public int field2620;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public int field2621;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public int field2624;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public int field2629;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lee;")
    public class34 field2623;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "Lee;")
    public class34 field2628;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "Lee;")
    public class34 field2630;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static final void method831(int arg0) {
        field2622++;
        int var1 = 75 / ((arg0 - 3) / 43);
        class91.field2225 = 0;
        class139.field3318 = 0;
        class100.method782((byte) 112);
        class70.method496((byte) 84);
        class8.method39((byte) -23);
        class31.method249((byte) -84);
        for (int var2 = 0; var2 < class139.field3318; var2++) {
            int var4 = class91.field2221[var2];
            if (class43.field856 != class149.field3709[var4].field2008) {
                class149.field3709[var4] = null;
            }
        }
        if (class71.field1502 != class96.field2338.field1691) {
            throw new RuntimeException("gpp1 pos:" + class96.field2338.field1691 + " psize:" + class71.field1502);
        }
        for (int var3 = 0; var3 < class66.field1387; var3++) {
            if (class149.field3709[class20.field326[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class66.field1387);
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static void method832(boolean arg0) {
        field2627 = null;
        field2614 = null;
        field2618 = null;
        field2617 = null;
        if (!arg0) {
            method832(false);
        }
    }
}
