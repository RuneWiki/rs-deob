import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class445 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Lka;")
    public static class473 field6549 = new class473(50);

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field6553 = 0;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILza;I)V", line = 3)
    public static final void method2630(int arg0, int arg1, class295 arg2, int arg3) {
        class119.field1860 = new class382[arg3][arg1];
        field6551++;
        class228.field3204 = arg2;
        if (class222.field3144 != null) {
            class280.field3811 = class443.method2612(class222.field3144[1], class222.field3144[4], class222.field3144[2], class222.field3144[0], class222.field3144[5], 111, class222.field3144[3]);
        }
        class366.field5257 = new class382();
        class35.method255((byte) -98);
        if (arg0 >= -28) {
            field6552 = -46;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V", line = 25)
    public static final void method2631(int arg0, int arg1) {
        class321.field4414 = arg0;
        if (arg1 != 28314) {
            method2632((byte) 28);
        }
        class281.field3828 = -1;
        field6550++;
        class281.field3828 = -1;
        class409.method2400((byte) 2);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 48)
    public static void method2632(byte arg0) {
        field6549 = null;
        if (arg0 != 61) {
            method2630(-128, 118, null, -104);
        }
    }
}
