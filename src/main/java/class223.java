import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class223 {

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public int field3665;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public int field3674;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public int field3669;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field3673 = 1;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lph;")
    public static class229 field3666 = class266.method1858("::clientdrop", 0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Lph;")
    public static class229 field3664 = class266.method1858("::clientjs5drop", 0);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Lsi;")
    public static class66 field3671;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 8)
    public static void method1555(int arg0) {
        field3666 = null;
        if (arg0 > -46) {
            field3671 = (class66) null;
        }
        field3671 = null;
        field3664 = null;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)[Lcc;", line = 28)
    public static final class220[] method1556(int arg0) {
        class220[] var1 = new class220[class301.field4993];
        for (int var2 = 0; var2 < class301.field4993; var2++) {
            if (class99.field1675) {
                var1[var2] = new class258(class266.field4486, class48.field713, class303.field5064[var2], class27.field387[var2], class36.field597[var2], class288.field4729[var2], class279.field4623[var2], class314.field5346);
            } else {
                var1[var2] = new class32(class266.field4486, class48.field713, class303.field5064[var2], class27.field387[var2], class36.field597[var2], class288.field4729[var2], class279.field4623[var2], class314.field5346);
            }
        }
        if (arg0 != 26104) {
            field3668 = 107;
        }
        class214.method1517(arg0 ^ 0xFFFFFE40);
        field3667++;
        return var1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 54)
    public static final void method1557(byte arg0) {
        if (class92.field1549.toLowerCase().indexOf("microsoft") == -1) {
            class146.field2359[92] = 74;
            class146.field2359[61] = 27;
            class146.field2359[45] = 26;
            class146.field2359[47] = 73;
            class146.field2359[93] = 43;
            if (class92.field1566 == null) {
                class146.field2359[222] = 59;
                class146.field2359[192] = 58;
            } else {
                class146.field2359[222] = 58;
                class146.field2359[192] = 28;
                class146.field2359[520] = 59;
            }
            class146.field2359[44] = 71;
            class146.field2359[59] = 57;
            class146.field2359[46] = 72;
            class146.field2359[91] = 42;
        } else {
            class146.field2359[188] = 71;
            class146.field2359[190] = 72;
            class146.field2359[219] = 42;
            class146.field2359[186] = 57;
            class146.field2359[220] = 74;
            class146.field2359[192] = 58;
            class146.field2359[223] = 28;
            class146.field2359[191] = 73;
            class146.field2359[187] = 27;
            class146.field2359[222] = 59;
            class146.field2359[189] = 26;
            class146.field2359[221] = 43;
        }
        field3672++;
        int var1 = -85 % ((arg0 - 61) / 53);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)V", line = 104)
    public static final void method1558(boolean arg0, int arg1) {
        field3670++;
        class254.field4238.method1418((byte) -17, arg1);
        if (arg0) {
            method1557((byte) 5);
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(III)V", line = 135)
    public class223(int arg0, int arg1, int arg2) {
        this.field3665 = arg1;
        this.field3674 = arg2;
        this.field3669 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
    public abstract void method1396(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
    public abstract void method1391(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZII)V")
    public abstract void method1392(boolean arg0, int arg1, int arg2);
}
