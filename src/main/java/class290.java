import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class290 {

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
    public int field4001 = 1;

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "Lcja;")
    public static class46 field4000 = new class46(8);

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "C")
    public char field4003;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "Lel;")
    public static class574 field4002;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V")
    public static void method1848(int arg0) {
        if (arg0 == -4259) {
            field4002 = null;
            field4000 = null;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(ILfca;)V")
    public final void method1849(int arg0, class93 arg1) {
        while (true) {
            int var3 = arg1.method793((byte) 85);
            if (var3 == 0) {
                field3999++;
                if (arg0 != 8) {
                    this.method1850((byte) -92, null, 97);
                    return;
                }
                return;
            }
            this.method1850((byte) 93, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(BLfca;I)V")
    private final void method1850(byte arg0, class93 arg1, int arg2) {
        field3998++;
        if (arg0 != 93) {
            this.field4003 = (char) 65521;
        }
        if (arg2 == 1) {
            this.field4003 = class283.method1823(-27037, arg1.method766((byte) 122));
        } else if (arg2 == 2) {
            this.field4001 = 0;
        }
    }
}
