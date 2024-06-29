import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class332 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Loh;")
    public static class404 field4306;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method1986(int arg0) {
        field4306 = null;
        if (arg0 != 2715) {
            method1988((byte) -120, -128);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Z")
    public static final boolean method1987(int arg0, int arg1) {
        int var2 = -74 % ((-arg1 - 10) / 33);
        field4302++;
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V")
    public static final void method1988(byte arg0, int arg1) {
        field4304++;
        if (arg0 == -37) {
            class47 var2 = class258.method1546(1, arg1, (byte) 121);
            var2.method274(false);
        }
    }
}
