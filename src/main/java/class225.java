import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class225 {

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "J")
    public long field3595 = 0L;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "S")
    public static short field3592 = 1;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public int field3596;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public int field3597;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public int field3602;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public int field3605;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "Loc;")
    public static class291 field3604;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Lj;")
    public class7 field3594;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Lj;")
    public class7 field3599;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V", line = 13)
    public static final void method1597(int arg0, int arg1, int arg2) {
        if (arg2 != -30037) {
            field3604 = (class291) null;
        }
        class344 var3 = class110.method759(7, arg1, false);
        field3606++;
        var3.method2390((byte) -118);
        var3.field5354 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 34)
    public static final void method1598(int arg0) {
        class14.field161 = null;
        class26.field361 = null;
        class14.field162 = null;
        field3603++;
        class307.field4788 = null;
        if (arg0 >= -84) {
            method1600((int[]) null, -87);
        }
        class60.field847 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V", line = 49)
    public static final void method1599(int arg0, int arg1) {
        if (arg1 != 7) {
            field3604 = (class291) null;
        }
        if (class137.field2163 == null || arg0 > class137.field2163.length) {
            class137.field2163 = new int[arg0];
        }
        field3600++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([II)[I", line = 70)
    public static final int[] method1600(int[] arg0, int arg1) {
        if (arg1 < 106) {
            field3592 = 99;
        }
        field3601++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class9.method53(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V", line = 87)
    public static void method1601(byte arg0) {
        field3604 = null;
        if (arg0 < 117) {
            field3604 = (class291) null;
        }
    }
}
