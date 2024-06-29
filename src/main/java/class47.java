import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class47 {

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field1021 = 0;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field1022 = 0;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lqe;")
    public static class179 field1024 = class206.method1380("Lade Texturen )2 ", (byte) -126);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public int field1018;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public int field1019;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public int field1020;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "J")
    public long field1026;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Lrb;")
    public class186 field1028;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static final void method314(byte arg0) {
        class236.field4352 = null;
        class108.field2010 = null;
        if (arg0 > 49) {
            class182.field3363 = null;
            field1029++;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Leh;ILeh;)V")
    public static final void method315(class52 arg0, int arg1, class52 arg2) {
        field1025++;
        class28.field616 = arg0;
        if (arg1 != -18532) {
            method317((byte) 50, null);
        }
        class206.field3854 = arg2;
        class178.field3238 = class206.field3854.method336((byte) 61, 3);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method316(int arg0) {
        field1024 = null;
        if (arg0 >= -60) {
            method315(null, -48, null);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLeh;)V")
    public static final void method317(byte arg0, class52 arg1) {
        class131.field2389 = arg1;
        if (arg0 <= 118) {
            field1024 = null;
        }
        field1023++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
    public static final void method318(boolean arg0) {
        if (arg0) {
            field1021 = 33;
        }
        if (class232.field4266 != null) {
            class217 var1 = class232.field4266;
            synchronized (class232.field4266) {
                class232.field4266 = null;
            }
        }
        field1027++;
    }
}
