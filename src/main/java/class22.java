import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class22 {

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "[Le;")
    public static class191[] field312 = new class191[8];

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field317 = 0;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Le;")
    public static class191 field318 = class54.method368("scrollen:", 2047);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field320 = -1;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "[Lc;")
    public static class60[] field313;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lng;BLng;)V")
    public static final void method162(class121 arg0, byte arg1, class121 arg2) {
        if (arg1 == -99) {
            class258.field4579 = arg0;
            class3.field24 = arg2;
            field314++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static final void method163(int arg0) {
        field311++;
        class105.method675(5, -2252);
        class227.method1622(5, -9919);
        class93.method569(0, 5);
        if (arg0 >= -15) {
            return;
        }
        class3.method10(5, 30554);
        method166(5, (byte) 120);
        class270.method1846(10438, 5);
        class128.method871((byte) -110, 5);
        class207.method1427(5, 2);
        class66.method433((byte) -29, 5);
        class173.method1166(5, 499);
        class91.method552(5, (byte) 123);
        class236.method1670(50, -1);
        class261.method1795(14265, 5);
        class233.method1644(5, (byte) -57);
        class201.field3609.method990(62, 5);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public static void method164(int arg0) {
        field318 = null;
        field313 = null;
        field312 = null;
        if (arg0 != -31330) {
            field319 = -93;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static final void method165(byte arg0) {
        if (arg0 != 17) {
            method163(115);
        }
        boolean var1 = false;
        field321++;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class167.field2824 - 1); var2++) {
                if (class188.field3306[var2] < 1000 && class188.field3306[var2 + 1] > 1000) {
                    var1 = false;
                    class191 var3 = class33.field475[var2];
                    class33.field475[var2] = class33.field475[var2 + 1];
                    class33.field475[var2 + 1] = var3;
                    class191 var4 = class170.field2881[var2];
                    class170.field2881[var2] = class170.field2881[var2 + 1];
                    class170.field2881[var2 + 1] = var4;
                    int var5 = class270.field4761[var2];
                    class270.field4761[var2] = class270.field4761[var2 + 1];
                    class270.field4761[var2 + 1] = var5;
                    int var6 = class166.field2800[var2];
                    class166.field2800[var2] = class166.field2800[var2 + 1];
                    class166.field2800[var2 + 1] = var6;
                    short var7 = class188.field3306[var2];
                    class188.field3306[var2] = class188.field3306[var2 + 1];
                    class188.field3306[var2 + 1] = var7;
                    long var8 = class209.field3727[var2];
                    class209.field3727[var2] = class209.field3727[var2 + 1];
                    class209.field3727[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)V")
    private static final void method166(int arg0, byte arg1) {
        field316++;
        if (arg1 >= 104) {
            class210.field3729.method990(59, arg0);
            class142.field2363.method990(75, arg0);
            class169.field2868.method990(84, arg0);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BILng;)Lwa;")
    public static final class226 method167(byte arg0, int arg1, class121 arg2) {
        field315++;
        if (arg0 >= -114) {
            method163(-104);
        }
        return class179.method1202(16748257, arg2, arg1) ? class127.method864(102) : null;
    }
}
