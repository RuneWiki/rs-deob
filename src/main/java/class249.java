import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class249 {

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "[I")
    public static int[] field4025 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lnk;")
    public static class130 field4022;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Lff;")
    public static class19 field4023;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[[B")
    public static byte[][] field4024;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method1712(int arg0) {
        field4025 = null;
        field4022 = null;
        field4024 = null;
        field4023 = null;
        int var1 = 119 / ((arg0 - 54) / 52);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)V")
    public static final void method1713(int arg0, byte arg1) {
        field4026++;
        class41 var2 = class221.method1492((byte) -42, arg0, 1);
        var2.method303(arg1 + 24071);
        if (arg1 != -90) {
            field4025 = null;
        }
    }
}
