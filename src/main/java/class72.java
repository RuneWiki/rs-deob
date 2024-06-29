import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class72 {

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Lwm;")
    public static class152 field1046 = class157.method1048("mem=", 114);

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1048 = 127;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Lne;")
    public static class235 field1047 = new class235(500);

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "[I")
    public static int[] field1050 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Lwm;")
    public static class152 field1051 = class157.method1048("Ladevorgang )2 bitte warten Sie)3", 118);

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field1053 = -1;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Lah;")
    public static class205 field1049;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Z")
    public static boolean field1052;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "[S")
    public static short[] field1044;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V", line = 8)
    public static final void method491(byte arg0) {
        field1045++;
        while (class73.field1058.method1067(class288.field4882, (byte) 73) >= 11) {
            int var1 = class73.field1058.method1075(false, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class22.field380[var1] == null) {
                var2 = true;
                class22.field380[var1] = new class12();
                if (class120.field1701[var1] != null) {
                    class22.field380[var1].method63((byte) 122, class120.field1701[var1]);
                }
            }
            class325.field5670[class194.field3114++] = var1;
            class12 var3 = class22.field380[var1];
            var3.field4251 = class142.field2187;
            int var4 = class73.field1058.method1075(false, 1);
            int var5 = class73.field1058.method1075(false, 5);
            int var6 = class73.field1058.method1075(false, 1);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var6 == 1) {
                class235.field3851[class238.field3912++] = var1;
            }
            int var7 = class183.field2912[class73.field1058.method1075(false, 3)];
            if (var2) {
                var3.field4209 = var3.field4161 = var7;
            }
            int var8 = class73.field1058.method1075(false, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method60(3, class85.field1176.field4188[0] + var8, class85.field1176.field4245[0] - -var5, var4 == 1);
        }
        if (arg0 < 50) {
            method492(49);
        }
        class73.field1058.method1064(4);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 77)
    public static void method492(int arg0) {
        field1046 = null;
        field1044 = null;
        field1049 = null;
        field1050 = null;
        field1051 = null;
        if (arg0 == 0) {
            field1047 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)I", line = 109)
    public static int method493(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
