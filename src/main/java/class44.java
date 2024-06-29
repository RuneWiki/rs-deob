import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class44 {

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field530 = 0;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field535 = 0;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field536 = 100;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Lqc;")
    public static class99 field534 = new class99(50);

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "F")
    public static float field533;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Ldn;")
    public class132 field531;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "Lkm;")
    public static class133 field543;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Lkm;")
    public static class133 field544;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Ltj;")
    public class258 field532;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "[I")
    public static int[] field542;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V", line = 5)
    public static final void method281(int arg0, int arg1) {
        if (arg0 >= -44) {
            method281(-96, -62);
        }
        field529++;
        class312.field4712 = arg1;
        class126.field1721 = -1;
        class210.field3044 = -1;
        class93.method699(93);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 32)
    public static void method282(byte arg0) {
        field542 = null;
        field534 = null;
        field543 = null;
        field544 = null;
        if (arg0 >= -56) {
            field540 = -73;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 51)
    public static final void method283(int arg0) {
        class96 var1 = class186.field2565;
        synchronized (class186.field2565) {
            class337.field5067 = class68.field941;
            class206.field2962 = class243.field3470;
            class106.field1427++;
            if (arg0 >= -62) {
                method284(-43, -8, -3, -5, 34);
            }
            class282.field4220 = class342.field5119;
            class123.field1666 = class207.field2974;
            class217.field3104 = class235.field3323;
            class155.field2142 = class66.field872;
            class153.field2128 = class251.field3598;
            class207.field2974 = 0;
        }
        field538++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V", line = 81)
    public static final void method284(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field537++;
        class143 var5 = class163.method1176((byte) -84, arg2, 4);
        var5.method1032((byte) 114);
        var5.field1958 = arg0;
        if (arg4 < 70) {
            field540 = 49;
        }
        var5.field1963 = arg1;
        var5.field1965 = arg3;
    }
}
