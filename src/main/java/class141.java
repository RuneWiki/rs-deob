import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public abstract class class141 {

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field2178 = 1;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Lne;")
    public static class52 field2180;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "[I")
    public static int[] field2177;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)V")
    public abstract void method971(boolean arg0, int arg1);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static void method972(int arg0) {
        field2180 = null;
        if (arg0 == 0) {
            field2177 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method973(int arg0, byte arg1);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I")
    public static final int method974(int arg0, int arg1) {
        if (arg1 != 1) {
            field2177 = null;
        }
        field2176++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)Lvj;")
    public abstract class116 method975(int arg0);

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
    public static final void method976(int arg0) {
        field2175++;
        class33.field532.method1782(arg0 - 90);
        class80.field1338.method1782(92);
        class74.field1243.method1782(-105);
        if (arg0 != 0) {
            method972(-64);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Luf;ILuf;)V")
    public static final void method977(class176 arg0, int arg1, class176 arg2) {
        field2179++;
        class143.field2189 = class26.method208(0, class113.field1784, arg0, arg2, false);
        if (arg1 == 127) {
            class249.field3835 = (class40) class143.field2189;
            class124.field1953 = class26.method208(0, class243.field3764, arg0, arg2, false);
            class123.field1925 = class26.method208(0, class226.field3546, arg0, arg2, false);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)I")
    public abstract int method978(int arg0, int arg1);
}
