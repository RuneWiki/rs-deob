import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public abstract class class119 {

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "[I")
    public static int[] field1614 = new int[14];

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Ltj;")
    public static class108 field1609;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Lbk;")
    public static class211 field1611;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Lqg;")
    public static class270 field1615;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZII)V", line = 15)
    public static final void method728(boolean arg0, int arg1, int arg2) {
        field1617++;
        class276 var3 = class264.method1816((byte) -105, arg1, 14);
        if (arg0) {
            var3.method1876((byte) -114);
            var3.field3986 = arg2;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 32)
    public static void method729(int arg0) {
        field1611 = null;
        field1609 = null;
        field1615 = null;
        if (arg0 != 1) {
            field1609 = null;
        }
        field1614 = null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V", line = 52)
    public static final void method730(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class248.field3704[var1] = false;
        }
        field1612++;
        if (arg0 != 13888) {
            return;
        }
        class316.field4637 = 0;
        class245.field3660 = -1;
        class223.field3324 = 0;
        class336.field4878 = 1;
        class194.field2801 = -1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILtj;Ltj;)V", line = 76)
    public static final void method731(int arg0, class108 arg1, class108 arg2) {
        class255.field3784 = arg2;
        if (arg0 != 21896) {
            method731(-71, (class108) null, (class108) null);
        }
        class261.field3861 = arg1;
        field1616++;
        class261.field3861.method651(0, 36);
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V", line = 94)
    public static final void method732(int arg0) {
        if (arg0 > -56) {
            method729(-125);
        }
        field1610++;
        class215.field3080 = 1;
        class57.field762 = 0;
        class30.field368 = -1;
        class384.field5439 = 0;
        class265.field3895 = false;
        class26.field319 = 0;
        class384.field5440 = -3;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[B)V")
    public abstract void method481(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)[B")
    public abstract byte[] method480(byte arg0);
}
