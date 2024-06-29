import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class149 extends class99 {

    @OriginalMember(owner = "client!ve", name = "eb", descriptor = "I")
    public int field3518 = 0;

    @OriginalMember(owner = "client!ve", name = "V", descriptor = "Laf;")
    private static class7 field3509 = class48.method406(40, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!ve", name = "U", descriptor = "Laf;")
    public static class7 field3508 = class48.method406(40, "AUS");

    @OriginalMember(owner = "client!ve", name = "W", descriptor = "Laf;")
    private static class7 field3510 = class48.method406(40, "Your ignore list is full)3 Max of 100 hit");

    @OriginalMember(owner = "client!ve", name = "T", descriptor = "Laf;")
    public static class7 field3507 = field3509;

    @OriginalMember(owner = "client!ve", name = "ab", descriptor = "[I")
    public static int[] field3514 = new int[2000];

    @OriginalMember(owner = "client!ve", name = "Y", descriptor = "Laf;")
    public static class7 field3512 = class48.method406(40, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!ve", name = "db", descriptor = "Laf;")
    private static class7 field3517 = class48.method406(40, "Location");

    @OriginalMember(owner = "client!ve", name = "fb", descriptor = "Laf;")
    public static class7 field3519 = field3510;

    @OriginalMember(owner = "client!ve", name = "cb", descriptor = "Laf;")
    public static class7 field3516 = class48.method406(40, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!ve", name = "gb", descriptor = "Laf;")
    public static class7 field3520 = field3517;

    @OriginalMember(owner = "client!ve", name = "Z", descriptor = "Laf;")
    public static class7 field3513 = class48.method406(40, "<col=00ff80>");

    @OriginalMember(owner = "client!ve", name = "ib", descriptor = "I")
    public static int field3522 = 0;

    @OriginalMember(owner = "client!ve", name = "hb", descriptor = "Laf;")
    public static class7 field3521 = class48.method406(40, "Versteckt");

    @OriginalMember(owner = "client!ve", name = "R", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ve", name = "S", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!ve", name = "X", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!ve", name = "bb", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILrd;I)V")
    private final void method1193(int arg0, class122 arg1, int arg2) {
        if (arg0 == arg2) {
            this.field3518 = arg1.method965(false);
        }
        field3506++;
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(B)V")
    public static void method1194(byte arg0) {
        field3521 = null;
        if (arg0 > -39) {
            return;
        }
        field3519 = null;
        field3510 = null;
        field3517 = null;
        field3514 = null;
        field3508 = null;
        field3513 = null;
        field3516 = null;
        field3520 = null;
        field3509 = null;
        field3512 = null;
        field3507 = null;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)I")
    public static final int method1195(int arg0) {
        if (arg0 >= -106) {
            method1195(-101);
        }
        int var1 = class119.method921(class143.field3392, -21697, class8.field186, class75.field1753);
        field3515++;
        return var1 - class103.field2506 >= 800 || (class25.field670[class8.field186][class75.field1753 >> 7][class143.field3392 >> 7] & 0x4) == 0 ? 3 : class8.field186;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lrd;B)V")
    public final void method1196(class122 arg0, byte arg1) {
        field3511++;
        while (true) {
            int var3 = arg0.method931((byte) 124);
            if (var3 == 0) {
                int var4 = 13 / ((21 - arg1) / 38);
                return;
            }
            this.method1193(var3, arg0, 5);
        }
    }
}
