import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class121 extends class182 {

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
    public static int field2024 = 0;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "Luj;")
    public static class132 field2021 = new class132(512);

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "I")
    public static int field2028 = 0;

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "[I")
    public static int[] field2030 = new int[256];

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "Z")
    public static boolean field2032 = false;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "Lqk;")
    public static class104 field2029;

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "[S")
    public static short[] field2027;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(JJ)J")
    public static long method909(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "(I)V")
    public static final void method910(int arg0) {
        class196.field3160 = null;
        field2025++;
        class132.field2183 = null;
        if (arg0 <= 60) {
            field2030 = null;
        }
        class51.field861 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZIB)Ljava/lang/String;")
    public static final String method911(boolean arg0, int arg1, byte arg2) {
        field2020++;
        if (arg0 && arg1 >= 0) {
            return arg2 >= -119 ? null : class101.method718(48, arg0, 10, arg1);
        } else {
            return Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class121() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        field2026++;
        if (arg0) {
            field2030 = null;
        }
        return class207.field3415;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public static final void method912(boolean arg0) {
        class190.field3074.method94(34);
        field2022++;
        if (!arg0) {
            method910(65);
        }
    }

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "(I)V")
    public static void method913(int arg0) {
        field2027 = null;
        field2021 = null;
        field2030 = null;
        field2029 = null;
        if (arg0 != 0) {
            field2028 = 121;
        }
    }
}
