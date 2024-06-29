import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class110 {

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public static int field1573 = -1;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "J")
    public static long field1574;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)Lfl;")
    public static final class518 method674(int arg0, int arg1, int arg2) {
        if (class108.field1553[arg0][arg1][arg2] == null) {
            boolean var3 = class108.field1553[0][arg1][arg2] != null && class108.field1553[0][arg1][arg2].field7571 != null;
            if (var3 && arg0 >= class208.field2979 - 1) {
                return null;
            }
            class170.method1174(arg0, arg1, arg2);
        }
        return class108.field1553[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
    public static final void method675(int arg0) {
        if (class35.field368 != null) {
            class35.field368.method2409(arg0 - 36249);
        }
        field1575++;
        if (class374.field5695 != null) {
            class374.field5695.method2409(-16934);
        }
        if (arg0 != 19315) {
            method675(126);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILvg;)V")
    public static final void method676(int arg0, class38 arg1) {
        if (arg1.field492 == arg0 && arg1.field535 != -1) {
            class407.method2450(arg1, class348.field5015, 5705);
        }
        field1571++;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZI)V")
    public static final void method677(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method677(-42, false, 78);
        }
        field1572++;
        if (class525.method3102(arg2, -1)) {
            class461.method2779(arg0, 126, class185.field2754[arg2]);
        }
    }
}
