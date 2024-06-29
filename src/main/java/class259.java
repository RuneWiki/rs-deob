import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class259 {

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public int field3818 = 1;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "J")
    public static long field3819 = 0L;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "C")
    public char field3815;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILdh;)V", line = 8)
    public final void method1720(int arg0, class209 arg1) {
        if (arg0 < 49) {
            method1722((byte) 114);
        }
        while (true) {
            int var3 = arg1.method1428(32122);
            if (var3 == 0) {
                field3822++;
                return;
            }
            this.method1721(var3, (byte) 52, arg1);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBLdh;)V", line = 28)
    private final void method1721(int arg0, byte arg1, class209 arg2) {
        if (arg0 == 1) {
            this.field3815 = class417.method2501(arg2.method1417(false), (byte) -112);
        } else if (arg0 == 2) {
            this.field3818 = 0;
        }
        field3817++;
        if (arg1 != 52) {
            this.method1720(27, null);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 53)
    public static final void method1722(byte arg0) {
        field3821++;
        class43.method262(22050, (byte) -105, 2, class426.field6401.field1006);
        class287.field4116 = new class183();
        class287.field4116.method1245(819200, 9, 128);
        class35.field368 = class307.method1931(0, class364.field5570, class483.field7077, -458, 22050);
        class35.field368.method2416(3, class287.field4116);
        class434.method2611((byte) 127, class65.field976, class6.field80, class287.field4116, class157.field2296);
        int var1 = -109 % ((-arg0 - 60) / 57);
        class374.field5695 = class307.method1931(1, class364.field5570, class483.field7077, -458, 2048);
        class366.field5591 = new class274();
        class374.field5695.method2416(3, class366.field5591);
        class158.field2320 = new class264(22050, class366.field5600);
        class374.field5696 = class465.field6881.method2940("scape main", false);
    }
}
