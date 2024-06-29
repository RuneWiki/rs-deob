import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class class135 {

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field2135 = 0;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "[I")
    public static int[] field2141 = new int[2500];

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field2138 = 0;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public int field2134;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public int field2137;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public int field2140;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public int field2142;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Lsj;")
    public static class177 field2143;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
    public static final void method912(int arg0, int arg1) {
        class246.field4034.method1695(arg1, 0);
        field2133++;
        if (arg0 != -199) {
            field2143 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
    public abstract void method913(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public static void method914(byte arg0) {
        field2143 = null;
        field2141 = null;
        if (arg0 < 88) {
            field2138 = -93;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)V")
    public abstract void method915(int arg0, int arg1);
}
