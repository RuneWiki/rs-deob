import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class241 extends class46 {

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public int field3847 = -1;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public int field3860 = 0;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "Lpg;")
    public static class320 field3846 = new class320(64);

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field3852 = 0;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "Lpg;")
    public static class320 field3856 = new class320(64);

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field3864 = 0;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public int field3843;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public int field3844;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public int field3849;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public int field3850;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public int field3851;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public int field3854;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public int field3855;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public int field3857;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public int field3859;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public int field3863;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "Ll;")
    public static class133 field3861;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "[I")
    public static int[] field3865;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBILtb;)V", line = 13)
    public static final void method1671(int arg0, byte arg1, int arg2, class220 arg3) {
        field3853++;
        if (class222.field3537 != null || class339.field5305 || arg3 == null || class119.method876(2, arg3) == null) {
            return;
        }
        class222.field3537 = arg3;
        if (arg1 <= 94) {
            method1671(-119, (byte) 125, -102, (class220) null);
        }
        class125.field1957 = class119.method876(2, arg3);
        class203.field3041 = false;
        class136.field2152 = arg2;
        class339.field5303 = 0;
        class77.field1245 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIB)V", line = 51)
    public static final void method1672(int arg0, int arg1, byte arg2) {
        int var3 = class289.field4502 * arg1 >> 8;
        if (arg2 != 64) {
            method1675(103, (class133) null, (class133) null);
        }
        field3848++;
        if (arg0 == -1 && !class186.field2783) {
            class228.method1615(arg2 - 63);
        } else if (arg0 != -1 && (class43.field694 != arg0 || !class40.method331(arg2 - 60)) && var3 != 0 && !class186.field2783) {
            class112.method836(arg0, var3, (byte) 65, false, 2, class192.field2872, 0);
        }
        class43.field694 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 80)
    public static final void method1673(byte arg0) {
        for (class239 var1 = (class239) class304.field4739.method636(arg0 ^ 0x19); var1 != null; var1 = (class239) class304.field4739.method638(52)) {
            if (var1.field3819) {
                var1.method1664(-8187);
            }
        }
        if (arg0 != -26) {
            field3846 = (class320) null;
        }
        for (class239 var2 = (class239) class272.field4223.method636(-1); var2 != null; var2 = (class239) class272.field4223.method638(114)) {
            if (var2.field3819) {
                var2.method1664(-8187);
            }
        }
        field3845++;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V", line = 111)
    public static void method1674(int arg0) {
        field3856 = null;
        field3861 = null;
        if (arg0 > -60) {
            field3864 = -28;
        }
        field3846 = null;
        field3865 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILl;Ll;)V", line = 128)
    public static final void method1675(int arg0, class133 arg1, class133 arg2) {
        class130.field2043 = arg2;
        field3858++;
        class95.field1527 = arg1;
        if (arg0 != 0) {
            method1672(47, -43, (byte) 73);
        }
    }
}
