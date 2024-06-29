import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class143 {

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "B")
    private byte field3067;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public int field3056;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public int field3054;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public int field3057;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public int field3062;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public int field3055;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Lch;")
    public static class29 field3058 = new class29(128);

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "[I")
    public static int[] field3061 = new int[5];

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "Lgg;")
    private static class63 field3064 = class116.method911(43, "Unexpected server response)3");

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "Lgg;")
    private static class63 field3066 = class116.method911(43, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "Lgg;")
    public static class63 field3070 = class116.method911(43, ":tradereq:");

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Lgg;")
    private static class63 field3063 = class116.method911(43, " from your ignore list first)3");

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Lgg;")
    public static class63 field3069 = field3064;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "Lgg;")
    public static class63 field3060 = field3066;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "Lgg;")
    public static class63 field3071 = field3063;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field3076 = 0;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "[I")
    public static int[] field3068 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Lgg;")
    public static class63 field3065 = class116.method911(43, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field3074 = 0;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "Lgg;")
    public static class63 field3078 = class116.method911(43, ":duelfriend:");

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "Lwb;")
    public static class200 field3077;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "Ljc;")
    public static class85 field3073;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static void method1022(byte arg0) {
        if (arg0 <= 116) {
            field3065 = null;
        }
        field3058 = null;
        field3063 = null;
        field3071 = null;
        field3077 = null;
        field3061 = null;
        field3078 = null;
        field3066 = null;
        field3069 = null;
        field3073 = null;
        field3068 = null;
        field3070 = null;
        field3064 = null;
        field3065 = null;
        field3060 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)I")
    public final int method1023(int arg0) {
        if (arg0 != 4) {
            field3068 = null;
        }
        field3059++;
        return (this.field3067 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)I")
    public final int method1024(byte arg0) {
        if (arg0 > -93) {
            this.field3054 = -10;
        }
        field3075++;
        return this.field3067 & 0x7;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class143() {
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lab;)V")
    public class143(class3 arg0) {
        this.field3067 = arg0.method73((byte) 29);
        this.field3056 = arg0.method46((byte) 65);
        this.field3054 = arg0.method56(-1);
        this.field3057 = arg0.method56(-1);
        this.field3062 = arg0.method56(-1);
        this.field3055 = arg0.method56(-1);
    }
}
