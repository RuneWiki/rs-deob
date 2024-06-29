import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class241 {

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Lha;")
    public static class46 field4283 = class271.method1828(":tradereq:", -46);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lha;")
    public static class46 field4280 = class271.method1828("leuchten1:", -46);

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "[S")
    public static short[] field4285 = new short[256];

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Z")
    public static boolean field4281;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILwj;)V")
    public static final void method1654(int arg0, class121 arg1) {
        arg1.field2262 = false;
        field4282++;
        if (arg1.field2264 != null) {
            arg1.field2264.field3494 = 0;
        }
        if (arg0 != 0) {
            field4283 = null;
        }
        for (class121 var2 = arg1.method651(); var2 != null; var2 = arg1.method656()) {
            method1654(0, var2);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static void method1655(int arg0) {
        field4285 = null;
        if (arg0 <= 80) {
            method1655(-18);
        }
        field4283 = null;
        field4280 = null;
    }
}
