import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class179 {

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    public int field2507;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public int field2512;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "Lhp;")
    public class179 field2509;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "Lci;")
    public class261 field2505;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
    public static int field2508 = -1;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public int field2500;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public int field2501;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
    public int field2511;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "Lqj;")
    public static class296 field2502;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)Lgp;")
    public static final class31 method1189(int arg0) {
        field2504++;
        if (class429.field6168 < class126.field1775.length) {
            return class126.field1775[class429.field6168++];
        } else {
            if (arg0 >= -6) {
                method1190(-117, 122);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V")
    public static final void method1190(int arg0, int arg1) {
        if (!class48.field732) {
            arg0 = -1;
        }
        field2510++;
        if (class413.field5995 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class374 var2 = class433.method2721(arg0, 33);
            class18 var3 = var2.method2448(-1312);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class204.field2772.method2260(var3.method111(), var3.method106(), new Point(var2.field5340, var2.field5330), class41.field617, arg1 ^ 0xC4A, var3.method113());
                class413.field5995 = arg0;
            }
        }
        if (arg1 == 3163 && arg0 == -1 && class413.field5995 != -1) {
            class204.field2772.method2260(-1, -1, new Point(), class41.field617, 17, (int[]) null);
            class413.field5995 = -1;
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
    public static void method1191(int arg0) {
        if (arg0 < 32) {
            field2508 = -123;
        }
        field2502 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZ)V")
    public static final void method1192(int arg0, boolean arg1) {
        if (!arg1) {
            method1190(63, -107);
        }
        class190 var2 = class132.field1834;
        synchronized (class132.field1834) {
            class132.field1834.method1254(arg0, 127);
        }
        field2503++;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(II)V")
    public class179(int arg0, int arg1) {
        this.field2507 = arg1;
        this.field2512 = arg0;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lhp;I)V")
    public class179(class179 arg0, int arg1) {
        this.field2509 = arg0;
        this.field2512 = this.field2509.field2512;
        this.field2505 = this.field2509.field2505;
        this.field2507 = this.field2509.field2507 + arg1;
    }
}
