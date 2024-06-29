import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class176 extends class69 {

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "I")
    public int field3166;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "Lha;")
    public static class46 field3162 = class271.method1828("Lade Schrifts-=tze )2 ", -46);

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "Lha;")
    public static class46 field3161 = class271.method1828(" zuerst von Ihrer Freunde)2Liste(Q", -46);

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3163 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "Lha;")
    public static class46 field3168 = class271.method1828("Spieler kann nicht gefunden werden: ", -46);

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "Lpi;")
    public static class181 field3169;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
    public static final void method1263(int arg0) {
        field3160++;
        class237.field4188.method84(-32377);
        class28.field560.method84(-32377);
        if (arg0 > -49) {
            field3163 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(B)V")
    public static void method1264(byte arg0) {
        field3161 = null;
        int var1 = -31 / ((arg0 - 48) / 59);
        field3168 = null;
        field3163 = null;
        field3162 = null;
        field3169 = null;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class176() {
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(I)V")
    public class176(int arg0) {
        this.field3166 = arg0;
    }
}
