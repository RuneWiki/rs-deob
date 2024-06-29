import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class129 {

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Lec;")
    public static class32 field2977 = class73.method594("und Ihr Passwort ein)3", true);

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lec;")
    public static class32 field2974 = class73.method594("oberen Rand der Webseite ausw-=hlen)3", true);

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "[I")
    public static int[] field2976 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lec;")
    public static class32 field2975 = class73.method594("Lade)3)3)3", true);

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Lec;")
    private static class32 field2984 = class73.method594("Loaded textures", true);

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Lec;")
    public static class32 field2982 = field2984;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Lea;")
    public static class30 field2972;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lae;")
    public static class6 field2979;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method997(int arg0) {
        field2976 = null;
        field2984 = null;
        field2974 = null;
        field2982 = null;
        field2975 = null;
        if (arg0 != -1) {
            field2974 = null;
        }
        field2979 = null;
        field2972 = null;
        field2977 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLjd;)Lec;")
    public static final class32 method998(byte arg0, class66 arg1) {
        field2978++;
        if (arg0 != 33) {
            method998((byte) -108, null);
        }
        return class103.method830(0, 32767, arg1);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lbf;I)V")
    public static final void method999(class14 arg0, int arg1) {
        class91.field2090 = arg0;
        field2973++;
        if (arg1 != 32767) {
            field2977 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILea;BLea;I)Lnf;")
    public static final class96 method1000(int arg0, class30 arg1, byte arg2, class30 arg3, int arg4) {
        field2981++;
        if (class28.method193(arg0, arg3, -308039560, arg4)) {
            int var5 = 115 / ((arg2 - 24) / 44);
            return class15.method102(arg1.method206(arg0, arg4, -109), true);
        } else {
            return null;
        }
    }
}
