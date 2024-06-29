import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class131 extends class123 {

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "[I")
    public int[] field3073 = new int[5];

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "[Lgd;")
    public class46[] field3079 = new class46[5];

    @OriginalMember(owner = "client!tc", name = "fb", descriptor = "I")
    public int field3085 = 0;

    @OriginalMember(owner = "client!tc", name = "lb", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "client!tc", name = "pb", descriptor = "I")
    public int field3095;

    @OriginalMember(owner = "client!tc", name = "gb", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "Loa;")
    public static class98 field3060 = class38.method349(255, "0(U");

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "Loa;")
    private static class98 field3066 = class38.method349(255, "Please remove ");

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "Loa;")
    private static class98 field3064 = class38.method349(255, " million");

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public static int field3061 = 0;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "Loa;")
    public static class98 field3063 = field3064;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "Loa;")
    private static class98 field3065 = class38.method349(255, "Service unavailable)3");

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "Loa;")
    private static class98 field3069 = class38.method349(255, "Enter name of player to add to list");

    @OriginalMember(owner = "client!tc", name = "db", descriptor = "Loa;")
    public static class98 field3083 = field3066;

    @OriginalMember(owner = "client!tc", name = "cb", descriptor = "I")
    public static int field3082 = 0;

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "Loa;")
    public static class98 field3068 = field3069;

    @OriginalMember(owner = "client!tc", name = "mb", descriptor = "Loa;")
    public static class98 field3092 = field3065;

    @OriginalMember(owner = "client!tc", name = "nb", descriptor = "Loa;")
    public static class98 field3093 = class38.method349(255, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "Loa;")
    public static class98 field3067 = field3066;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "I")
    public int field3078;

    @OriginalMember(owner = "client!tc", name = "hb", descriptor = "I")
    public int field3087;

    @OriginalMember(owner = "client!tc", name = "ib", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!tc", name = "jb", descriptor = "I")
    public int field3089;

    @OriginalMember(owner = "client!tc", name = "kb", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!tc", name = "ob", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "Lpa;")
    public class105 field3071;

    @OriginalMember(owner = "client!tc", name = "eb", descriptor = "Lse;")
    public class127 field3084;

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "Ltb;")
    public static class130 field3081;

    @OriginalMember(owner = "client!tc", name = "qb", descriptor = "Ltc;")
    public class131 field3096;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "Lte;")
    public class133 field3072;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "Lu;")
    public class134 field3077;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "Lce;")
    public class20 field3080;

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "Lma;")
    public class84 field3076;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "Z")
    public boolean field3070;

    @OriginalMember(owner = "client!tc", name = "rb", descriptor = "Z")
    public boolean field3097;

    @OriginalMember(owner = "client!tc", name = "sb", descriptor = "Z")
    public boolean field3098;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
    public static void method1072(int arg0) {
        field3083 = null;
        field3081 = null;
        field3093 = null;
        field3092 = null;
        field3064 = null;
        field3065 = null;
        field3068 = null;
        field3069 = null;
        if (arg0 != 0) {
            field3066 = null;
        }
        field3063 = null;
        field3060 = null;
        field3067 = null;
        field3066 = null;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
    public static final void method1073(int arg0) {
        field3062++;
        for (class126 var1 = (class126) class119.field2656.method512(57); var1 != null; var1 = (class126) class119.field2656.method513(-97)) {
            if (var1.field2796 != null) {
                var1.method990(-1);
            }
        }
        int var2 = -114 % ((arg0 - 31) / 36);
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(III)V")
    public class131(int arg0, int arg1, int arg2) {
        this.field3091 = arg1;
        this.field3095 = arg2;
        this.field3075 = this.field3086 = arg0;
    }
}
