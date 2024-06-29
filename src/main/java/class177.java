import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class177 {

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field3232 = 0;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Lid;")
    public static class149 field3235 = class60.method382("::clientdrop", (byte) 15);

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "Lid;")
    public static class149 field3234 = class60.method382("Poser", (byte) 75);

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "Lid;")
    public static class149 field3237 = null;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field3231 = -1;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "Laj;")
    public static class47 field3236;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static void method1246(int arg0) {
        if (arg0 != 906) {
            field3234 = null;
        }
        field3236 = null;
        field3235 = null;
        field3234 = null;
        field3237 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
    public static final void method1247(boolean arg0) {
        class224.field3944 = 0;
        class96.field1690 = -1;
        class62.field1109 = 0;
        class60.field1092 = 0;
        class208.field3720.field1340 = 0;
        class246.field4327 = -1;
        if (!arg0) {
            return;
        }
        class32.field481 = false;
        class271.field4876 = 0;
        class210.field3748 = 0;
        class11.field150.field1340 = 0;
        field3238++;
        class14.field203 = -1;
        class283.field5010 = -1;
        class68.field1188 = 0;
        for (int var1 = 0; var1 < class107.field1851.length; var1++) {
            if (class107.field1851[var1] != null) {
                class107.field1851[var1].field2399 = -1;
            }
        }
        for (int var2 = 0; var2 < class38.field572.length; var2++) {
            if (class38.field572[var2] != null) {
                class38.field572[var2].field2399 = -1;
            }
        }
        class217.method1463(118);
        class194.field3468 = 1;
        class50.method329(-11461, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class94.field1664[var3] = true;
        }
        class147.method1008((byte) -119);
    }
}
