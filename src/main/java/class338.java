import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class338 {

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public static int field5071 = 0;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "B")
    public byte field5075;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public int field5069;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "Ljava/lang/String;")
    public String field5067;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "Ljava/lang/String;")
    public String field5068;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "Ljava/lang/String;")
    public String field5072;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "Ljava/lang/String;")
    public String field5074;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
    public static final void method2067(int arg0) {
        if (arg0 <= 90) {
            return;
        }
        class373.field5603 = null;
        class285.field4359 = null;
        field5066++;
        class64.field885 = false;
        class245.field3502 = null;
        class35.field441 = null;
        class450.field6362 = null;
        class456.method2706((byte) 114);
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V")
    public static final void method2068(int arg0) {
        if (class395.field5816 != null) {
            class395.field5816.method2226((byte) -128);
        }
        field5073++;
        if (class398.field5829 != null) {
            class398.field5829.method2226((byte) -125);
        }
        class100.method772(22050, 2, class337.field5038.field3936, true);
        class395.field5816 = class285.method1825((byte) 73, 22050, class378.field5618, 0, class21.field261);
        class395.field5816.method2227(class432.field6146, 0);
        class398.field5829 = class285.method1825((byte) 102, 2048, class378.field5618, 1, class21.field261);
        class398.field5829.method2227(class452.field6419, arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lui;Ltq;I)V")
    public static final void method2069(class451 arg0, class63 arg1, int arg2) {
        field5070++;
        if (arg2 != 31784) {
            field5076 = 106;
        }
        if (class314.field4732) {
            return;
        }
        arg1.method589(0);
        class332.field4974 = arg1.method547(class368.method2272(arg0, class384.field5691), true);
        class332.field4974.method1958((class342.field5115 - class332.field4974.method791()) / 2, (class233.field3411 - class332.field4974.method789()) / 2);
        class273.field4160 = arg1.method547(class368.method2272(arg0, class380.field5649), true);
        class273.field4160.method1958((class342.field5115 - class273.field4160.method791()) / 2, 18);
        class314.field4732 = true;
    }
}
