import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class94 {

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Lpe;")
    public static class109 field2027 = class141.method1120(" weitere Optionen", 0);

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Lpe;")
    private static class109 field2026 = class141.method1120("Connection timed out)3", 0);

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field2031 = 0;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Lpe;")
    public static class109 field2028 = class141.method1120("Benutzername: ", 0);

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Lpe;")
    public static class109 field2030 = field2026;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Lpe;")
    public static class109 field2025 = class141.method1120("null", 0);

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "[Z")
    public static boolean[] field2034 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "Lpe;")
    public static class109 field2032 = class141.method1120("jolt", 0);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Lcf;")
    public static class21 field2024;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Le;")
    public static class29 field2033;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lna;")
    public static class91 field2023;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)J")
    public static final synchronized long method779(int arg0) {
        field2022++;
        long var1 = System.currentTimeMillis();
        if (var1 < class153.field3360) {
            class27.field633 += class153.field3360 - var1;
        }
        class153.field3360 = var1;
        int var3 = -74 % ((45 - arg0) / 59);
        return class27.field633 + var1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static void method780(boolean arg0) {
        field2025 = null;
        field2028 = null;
        field2023 = null;
        field2026 = null;
        field2033 = null;
        field2032 = null;
        field2027 = null;
        field2030 = null;
        field2024 = null;
        if (arg0) {
            field2034 = null;
        }
    }
}
