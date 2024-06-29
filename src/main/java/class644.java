import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class644 {

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "Lfja;")
    public static class783 field8900 = new class783(3, 4);

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "Lmo;")
    public static class780 field8904 = new class780("", 19);

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "I")
    public static int field8905;

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILir;B)V", line = 3)
    public static final void method3578(int arg0, class28 arg1, byte arg2) {
        int var3 = -10 / ((arg2 - 45) / 42);
        if (class633.field8768) {
            class633.field8768 = false;
            arg0 = 0;
        }
        field8899++;
        if (class744.field10271 != null && class744.field10271.method181(arg1, -24031)) {
            return;
        }
        class744.field10271 = arg1;
        class704.field9678 = class197.method1423(1);
        class408.field5596 = arg0;
        class248.field3504 = arg0;
        if (class248.field3504 != 0) {
            class640.field8809 = class454.field6197;
            class480.field6474 = class524.field7126;
            class423.field5797 = class789.field10819;
            class65.field916 = class408.field5594;
            class565.field7992 = class449.field6155;
            class287.field3958 = class714.field9834;
            class7.field155 = class339.field4580;
            class111.field1923 = class563.field7981;
            class682.field9502 = class65.field932;
            class519.field7046 = class177.field2786;
            return;
        }
        class715.method3978(1);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V", line = 47)
    public static void method3579(int arg0) {
        if (arg0 != -23707) {
            field8906 = -117;
        }
        field8904 = null;
        field8900 = null;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(III)Z", line = 59)
    public static final boolean method3580(int arg0, int arg1, int arg2) {
        int var3 = -40 % ((arg0 + 50) / 45);
        field8903++;
        return class439.method2558(arg1, -1, arg2) | (arg1 & 0x800) != 0 || class4.method23(arg1, false, arg2);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IILfca;)V", line = 73)
    public static final void method3581(int arg0, int arg1, class93 arg2) {
        if (arg1 != 30987) {
            return;
        }
        if (class769.field10595 != null) {
            try {
                class769.field10595.method2553(-1, 0L);
                class769.field10595.method2552(arg0, 24, arg2.field1413, arg1 ^ 0xFFFF86F4);
            } catch (Exception var3) {
            }
        }
        field8902++;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Z)V", line = 93)
    public static final void method3582(boolean arg0) {
        if (arg0) {
            method3580(-16, -114, -12);
        }
        field8905++;
        if (class695.field9619 != null) {
            class695.field9619.method3416(arg0);
        }
        if (class146.field2463 == null) {
            return;
        }
        while (true) {
            try {
                class146.field2463.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILjava/awt/Component;)Lpr;", line = 120)
    public static final class472 method3583(int arg0, Component arg1) {
        field8901++;
        if (arg0 < 59) {
            method3579(-24);
        }
        return new class224(arg1);
    }
}
