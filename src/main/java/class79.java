import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class79 {

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "[Ljava/lang/String;")
    public String[] field1083;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "[I")
    public int[] field1088;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "[B")
    public byte[] field1084;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "[I")
    public int[] field1087;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1080 = "Loaded fonts";

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1079 = new String[5];

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Leg;")
    public static class272 field1092 = new class272(260);

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Z")
    public static boolean field1093 = false;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "[[[B")
    public static byte[][][] field1091;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public static final void method589(boolean arg0) {
        if (!arg0) {
            field1092 = null;
        }
        field1077++;
        if (class128.field2139 > 0) {
            class297.method1985(-1);
        } else {
            class216.field3468 = class149.field2395;
            class149.field2395 = null;
            class233.method1539(40, (byte) 32);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Z")
    public final boolean method590(int arg0, int arg1) {
        field1089++;
        if (arg1 != -2576) {
            this.method593(29, -30);
        }
        return (this.field1084[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)Z")
    public final boolean method591(int arg0, int arg1) {
        field1085++;
        if (arg1 != 4) {
            field1093 = true;
        }
        return (this.field1084[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)I")
    public final int method592(int arg0, int arg1) {
        field1090++;
        if (arg0 != 260) {
            field1093 = true;
        }
        return this.field1084[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(II)Z")
    public final boolean method593(int arg0, int arg1) {
        field1082++;
        if (arg0 != 29988) {
            this.method592(-35, 126);
        }
        return (this.field1084[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method594(int arg0) {
        if (arg0 <= -127) {
            field1079 = null;
            field1091 = null;
            field1080 = null;
            field1092 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(I)V")
    public class79(int arg0) {
        this.field1086 = arg0;
        this.field1083 = new String[this.field1086];
        this.field1088 = new int[this.field1086];
        this.field1084 = new byte[this.field1086];
        this.field1087 = new int[this.field1086];
    }
}
