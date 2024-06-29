import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class260 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[I")
    public static int[] field4522 = new int[25];

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Lub;")
    private static class227 field4525 = class257.method1749("cyan:", 17263);

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Lub;")
    public static class227 field4528 = class257.method1749("<col=ffff00>", 17263);

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field4527 = 0;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Lub;")
    public static class227 field4530 = field4525;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field4534 = 0;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "Lub;")
    public static class227 field4537 = field4525;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public int field4524;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public int field4526;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public int field4529;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public int field4536;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "J")
    public long field4538;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Lfh;")
    public class180 field4521;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Lfh;")
    public class180 field4523;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lfh;")
    public class180 field4531;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Lpd;")
    public static class196 field4532;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ln;ILn;II)Lpd;")
    public static final class196 method1755(class138 arg0, int arg1, class138 arg2, int arg3, int arg4) {
        if (arg4 != 18004) {
            method1756(-5);
        }
        field4535++;
        return class123.method760(arg0, arg1, arg3, 91) ? class80.method466(6169, arg2.method884(arg3, -44, arg1)) : null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static final void method1756(int arg0) {
        class251 var1 = class61.field1121;
        synchronized (class61.field1121) {
            class12.field230++;
            class122.field2197 = class193.field3276;
            class100.field1752 = class225.field3795;
            client.field1451 = class56.field1021;
            class50.field885 = class149.field2606;
            class232.field4043 = class37.field618;
            class81.field1403 = class60.field1117;
            class83.field1462 = class211.field3573;
            class149.field2606 = arg0;
        }
        field4533++;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static void method1757(int arg0) {
        field4522 = null;
        field4537 = null;
        field4530 = null;
        field4528 = null;
        if (arg0 != 25) {
            field4525 = null;
        }
        field4525 = null;
        field4532 = null;
    }
}
