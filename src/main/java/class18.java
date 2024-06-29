import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class18 {

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "Lna;")
    public static class26 field168 = class33.method219("Crafting Shop", 77);

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "I")
    public static int field166 = 0;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "Lna;")
    public static class26 field164 = class33.method219("Candle Shop", 92);

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "Lna;")
    public static class26 field165 = class33.method219("Switch to ", 94);

    @OriginalMember(owner = "mapview!j", name = "f", descriptor = "I")
    public static volatile int field169 = 0;

    @OriginalMember(owner = "mapview!j", name = "i", descriptor = "Lna;")
    public static class26 field172 = class33.method219("Vegetable Store", 80);

    @OriginalMember(owner = "mapview!j", name = "h", descriptor = "Lna;")
    public static class26 field171 = class33.method219("Shield Shop", 95);

    @OriginalMember(owner = "mapview!j", name = "j", descriptor = "[J")
    public static long[] field173 = new long[32];

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "J")
    public long field167;

    @OriginalMember(owner = "mapview!j", name = "g", descriptor = "Lj;")
    public class18 field170;

    @OriginalMember(owner = "mapview!j", name = "k", descriptor = "Lj;")
    public class18 field174;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I)[Lna;", line = 8)
    public static final class26[] method94(int arg0) {
        if (arg0 != 0) {
            field166 = -67;
        }
        return new class26[] { class29.field451, class6.field69, class21.field226, class6.field66, class2.field17, class29.field452, class6.field68, class4.field44, class39.field518, class38.field508, class8.field78, class20.field219, class27.field410, class33.field481 };
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(I)V", line = 57)
    public static void method95(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field164 = null;
        field171 = null;
        field165 = null;
        field168 = null;
        field173 = null;
        field172 = null;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(B)V", line = 93)
    public final void method96(byte arg0) {
        if (this.field174 == null) {
            return;
        }
        int var2 = -97 % ((-arg0 - 4) / 60);
        this.field174.field170 = this.field170;
        this.field170.field174 = this.field174;
        this.field174 = null;
        this.field170 = null;
    }
}
