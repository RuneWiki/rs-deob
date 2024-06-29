import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class65 {

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "Z")
    public static boolean field1107 = false;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "Z")
    public static boolean field1106 = false;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "Ltf;")
    public static class198 field1112 = null;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "Lfh;")
    public static class470 field1110 = new class470("LIVE", 0);

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "F")
    public static float field1111;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
    public static void method527(int arg0) {
        field1112 = null;
        if (arg0 != 1) {
            field1111 = -0.16224603F;
        }
        field1110 = null;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZ[B)V")
    public static final void method528(int arg0, boolean arg1, byte[] arg2) {
        if (class413.field5846 == null) {
            class413.field5846 = new class519(20000);
        }
        field1109++;
        int var3 = 66 % ((51 - arg0) / 56);
        class413.field5846.method3058(arg2, (byte) 72, 0, arg2.length);
        if (!arg1) {
            return;
        }
        class159.method1114(class413.field5846.field7545, 21687);
        class111.field1639 = new class219[class400.field5684];
        int var4 = 0;
        for (int var5 = class455.field6620; var5 <= class22.field231; var5++) {
            class219 var6 = class267.method1717(var5, -54);
            if (var6 != null) {
                class111.field1639[var4++] = var6;
            }
        }
        class424.field5995 = false;
        class297.field4434 = class165.method1188((byte) 26);
        class413.field5846 = null;
    }
}
