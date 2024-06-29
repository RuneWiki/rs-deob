import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class132 {

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "J")
    public long field2568 = 0L;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field2547 = 0;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Lhh;")
    private static class163 field2554 = class137.method1065("Connection lost)3", 17);

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "Lhh;")
    public static class163 field2562 = field2554;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field2560 = 128;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "Lhh;")
    private static class163 field2564 = class137.method1065("Loaded interfaces", 17);

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public static int field2561 = -1;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Lhh;")
    public static class163 field2553 = field2564;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public int field2545;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public int field2548;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public int field2549;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public int field2550;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public int field2551;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public int field2552;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public int field2555;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public int field2556;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public int field2557;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public int field2559;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public int field2565;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "Lta;")
    public class165 field2558;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "Ljava/awt/Frame;")
    public static Frame field2563;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method1041(int arg0) {
        field2563 = null;
        field2562 = null;
        field2564 = null;
        field2553 = null;
        if (arg0 != 1) {
            field2564 = null;
        }
        field2554 = null;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)Lpg;")
    public static final class81 method1042(int arg0) {
        field2546++;
        class81 var1 = new class81(24);
        var1.method655(0, 2);
        var1.method655(0, class211.field3824);
        var1.method655(0, class114.field2149 ? 1 : 0);
        var1.method655(arg0 - 1, class73.field1368 ? 1 : 0);
        var1.method655(0, class119.field2247 ? 1 : 0);
        var1.method655(arg0 ^ 0x1, class208.field3781 ? 1 : 0);
        var1.method655(0, class210.field3801 ? 1 : 0);
        var1.method655(0, class126.field2438 ? 1 : 0);
        var1.method655(0, class9.field154 ? 1 : 0);
        var1.method655(0, client.field2006 ? 1 : 0);
        var1.method655(0, class22.field353);
        var1.method655(arg0 ^ arg0, class48.field804 ? 1 : 0);
        var1.method655(0, class84.field1593 ? 1 : 0);
        var1.method655(0, class88.field1633 ? 1 : 0);
        var1.method655(0, class103.field1975);
        var1.method655(0, class244.field4306 ? 1 : 0);
        var1.method655(arg0 ^ 0x1, class215.field3928);
        var1.method655(0, class77.field1453);
        var1.method655(arg0 ^ 0x1, class2.field46);
        var1.method631(class4.field91, -1);
        var1.method631(class116.field2205, -1);
        return var1;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BLpa;)V")
    public static final void method1043(byte arg0, class123 arg1) {
        field2567++;
        if (arg0 > -74) {
            method1042(-87);
        }
        field2566 = arg1.method983(24108, class92.field1713);
    }
}
