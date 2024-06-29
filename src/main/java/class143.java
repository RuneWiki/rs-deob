import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class class143 {

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lbf;")
    public static class199 field2474 = new class199(4);

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field2477 = 0;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lqk;")
    public static class207 field2476 = class24.method212(255, "Angreifen");

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static void method986(byte arg0) {
        field2474 = null;
        if (arg0 != -63) {
            field2477 = -34;
        }
        field2476 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)V")
    public static final void method987(byte arg0, int arg1) {
        field2475++;
        if (arg0 <= 58) {
            method988((class99) null, 48, (class99) null);
        }
        class86.field1566.method1383(-8052, arg1);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lpk;ILpk;)V")
    public static final void method988(class99 arg0, int arg1, class99 arg2) {
        class167.field2940 = class235.method1677(false, 0, arg2, class217.field3854, arg0);
        field2473++;
        class284.field4983 = (class205) class167.field2940;
        if (arg1 > 79) {
            class176.field3183 = class235.method1677(false, 0, arg2, class121.field2091, arg0);
            class284.field4996 = class235.method1677(false, 0, arg2, class199.field3491, arg0);
        }
    }
}
