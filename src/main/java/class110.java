import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class110 {

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lcd;")
    public static class64 field2025 = class44.method335((byte) 71, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Lcd;")
    public static class64 field2020 = class44.method335((byte) 71, "Hidden)2use");

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Lcd;")
    public static class64 field2032 = class44.method335((byte) 71, "1");

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public int field2019;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public int field2021;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public int field2022;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public int field2023;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public int field2024;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public int field2026;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public int field2028;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public int field2029;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public int field2030;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public int field2031;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public int field2033;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public int field2034;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public int field2037;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public int field2039;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public int field2041;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public int field2043;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "Lqm;")
    public static class222 field2038;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lte;Ljava/lang/Object;I)V", line = 12)
    public static final void method799(class282 arg0, Object arg1, int arg2) {
        field2036++;
        if (arg0.field4851 == null) {
            return;
        }
        int var3 = -114 / ((arg2 - 40) / 60);
        for (int var4 = 0; var4 < 50 && arg0.field4851.peekEvent() != null; var4++) {
            class267.method1871(10, 1L);
        }
        if (arg1 != null) {
            arg0.field4851.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V", line = 36)
    public static void method800(boolean arg0) {
        field2025 = null;
        field2020 = null;
        if (!arg0) {
            field2038 = null;
            field2032 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I", line = 84)
    public static final int method801(int arg0) {
        field2040++;
        if (class158.field2785) {
            return 0;
        }
        if (arg0 != 1) {
            method800(false);
        }
        if (class141.method1001((byte) -33)) {
            return class69.field1324 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 103)
    public static final void method802(String arg0, int arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field2042++;
        System.exit(arg1);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V", line = 111)
    public static final void method803(boolean arg0) {
        if (arg0) {
            class304.field5203 = class61.field1192;
            class96.field1764 = class184.field3155;
            class85.field1567 = class35.field568;
        } else {
            class304.field5203 = class298.field5146;
            class96.field1764 = class266.field4571;
            class85.field1567 = class42.field684;
        }
        class183.field3140 = class304.field5203.length;
    }
}
