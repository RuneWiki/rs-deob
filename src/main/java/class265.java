import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class265 {

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "[I")
    public static int[] field3502 = new int[2048];

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "Lr;")
    public static class110 field3504;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "Lr;")
    public static class110 field3506;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
    public static void method1498(byte arg0) {
        field3506 = null;
        field3502 = null;
        if (arg0 <= -30) {
            field3504 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZLnk;B)V")
    public static final void method1499(boolean arg0, class464 arg1, byte arg2) {
        field3507++;
        int var3 = arg1.field6368 == 0 ? arg1.field6308 : arg1.field6368;
        int var4 = arg1.field6346 == 0 ? arg1.field6340 : arg1.field6346;
        class37.method276(arg0, var4, arg1.field6440, class146.field2099[arg1.field6440 >> 16], false, var3);
        if (arg1.field6360 != null) {
            class37.method276(arg0, var4, arg1.field6440, arg1.field6360, false, var3);
        }
        class132 var5 = (class132) class214.field2883.method1528((long) arg1.field6440, 119);
        if (var5 != null) {
            class450.method2646(var4, var5.field1939, arg0, (byte) -56, var3);
        }
        int var6 = -66 / ((arg2 + 46) / 40);
    }
}
