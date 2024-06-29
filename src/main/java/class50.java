import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class50 extends class234 {

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    public static int field973 = 0;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "Lvd;")
    public static class222 field971 = class212.method1357("hint_mapmarkers", 10731);

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "Lvd;")
    public static class222 field975 = class212.method1357("", 10731);

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "Lvd;")
    public static class222 field972 = class212.method1357("event_opbase", 10731);

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "Lvd;")
    private static class222 field978 = class212.method1357("go back to the main RuneScape webpage", 10731);

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "Lvd;")
    public static class222 field976 = field978;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public static int field977 = 0;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
    public static final void method364(boolean arg0) {
        if (arg0) {
            return;
        }
        field974++;
        try {
            if (class59.field1099 == 1) {
                int var1 = class18.field435.method1063((byte) -113);
                if (var1 > 0 && class18.field435.method1049(false)) {
                    int var2 = var1 - class46.field941;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class18.field435.method1065(var2, (byte) -36);
                } else {
                    class18.field435.method1043((byte) -24);
                    class18.field435.method1062(22397);
                    class10.field189 = null;
                    class134.field2589 = null;
                    if (class40.field884 == null) {
                        class59.field1099 = 0;
                    } else {
                        class59.field1099 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class18.field435.method1043((byte) -116);
            class40.field884 = null;
            class10.field189 = null;
            class59.field1099 = 0;
            class134.field2589 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I")
    public static final int method365(int arg0, int arg1) {
        field970++;
        if (arg1 <= 122) {
            field975 = null;
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V")
    public static void method366(byte arg0) {
        field975 = null;
        field978 = null;
        field972 = null;
        field971 = null;
        int var1 = 41 % ((arg0 + 33) / 47);
        field976 = null;
    }
}
