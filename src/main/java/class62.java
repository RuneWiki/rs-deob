import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class62 {

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "Ljava/lang/String;")
    public static String field813 = "Loading - please wait.";

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Ljava/lang/String;")
    public static String field812 = "purple:";

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "Lo;")
    public static class14 field815 = new class14(0, 0);

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Ljava/lang/String;")
    public static String field816 = "Connecting to update server";

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method361(int arg0) {
        field816 = null;
        field813 = null;
        if (arg0 > -126) {
            method363(-65, -17, -31);
        }
        field815 = null;
        field812 = null;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
    public static final void method362(int arg0) {
        int var1 = 3 % ((arg0 - 66) / 42);
        class246.field4034.method1699(0);
        field814++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)J")
    public static final long method363(int arg0, int arg1, int arg2) {
        class246 var3 = class46.field585[arg0][arg1][arg2];
        return var3 == null || var3.field4046 == null ? 0L : var3.field4046.field2977;
    }
}
