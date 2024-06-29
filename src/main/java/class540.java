import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class540 extends class424 {

    @OriginalMember(owner = "client!wba", name = "q", descriptor = "I")
    public int field7020;

    @OriginalMember(owner = "client!wba", name = "o", descriptor = "I")
    public int field7018;

    @OriginalMember(owner = "client!wba", name = "p", descriptor = "I")
    public static int field7019 = -2;

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!wba", name = "r", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)V", line = 4)
    public static final void method2866(boolean arg0, String arg1, int arg2, String arg3) {
        class83.field1128 = arg3;
        class356.field4607 = arg0;
        field7017++;
        class135.field1784 = arg1;
        if (!class356.field4607 && class57.field769 != 3 && class135.field1784.equals("") || class83.field1128.equals("")) {
            class252.method1602(-108, 3);
            return;
        }
        class185.field2364 = false;
        if (class57.field769 != 1) {
            class561.field7329 = 0;
            class219.field2881 = -1;
        }
        class252.method1602(-115, -3);
        class194.field2540 = 0;
        class401.field5118 = arg2;
        class60.field816 = 1;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V", line = 35)
    public static final void method2867(int arg0) {
        field7021++;
        if (arg0 != 3) {
            method2866(true, null, -58, null);
        }
        int var1 = class260.field3509.method1579(class364.field4697, true);
        if (var1 == 0) {
            class605.field8192 = null;
            class181.method1204((byte) -29, 0);
        } else if (var1 == 1) {
            class616.method3372((byte) 0, 28704);
            class181.method1204((byte) 110, 512);
            if (class159.field1994 != null) {
                class423.method2433((byte) -69);
            }
        } else {
            class616.method3372((byte) (class413.field5318 - 4 & 0xFF), 28704);
            class181.method1204((byte) -74, 2);
        }
        class659.field9184 = class390.field4991;
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(II)V", line = 74)
    public class540(int arg0, int arg1) {
        this.field7020 = arg1;
        this.field7018 = arg0;
    }
}
