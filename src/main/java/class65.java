import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class65 extends class5 {

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public static int field937 = -1;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    public static int field948 = -1;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "Lec;")
    public static class99 field938 = new class99(100);

    @OriginalMember(owner = "client!d", name = "O", descriptor = "F")
    public static float field950;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "Ljd;")
    public static class95 field942;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLjd;)V", line = 13)
    public static final void method471(byte arg0, class95 arg1) {
        field933++;
        if (arg0 >= -26) {
            field937 = -5;
        }
        class207.field3172 = arg1;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V", line = 28)
    public static final void method472(int arg0) {
        field930++;
        class130.field2003.method750((byte) 81);
        if (arg0 != -5167) {
            method472(84);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V", line = 43)
    public static final void method473(int arg0, int arg1) {
        field944++;
        class188 var2 = class147.method1111(-60, arg1, arg0);
        var2.method1393((byte) -103);
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V", line = 69)
    public static void method474(byte arg0) {
        int var1 = -107 % ((arg0 - 18) / 47);
        field942 = null;
        field938 = null;
    }
}
