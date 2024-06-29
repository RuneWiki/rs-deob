import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class48 {

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    private int field1116 = 0;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "[Lec;")
    private class32[] field1095;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    private int field1112;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Z")
    public static volatile boolean field1101 = false;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "Lv;")
    private static class146 field1104 = class159.method1226((byte) -37, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Lv;")
    public static class146 field1096 = field1104;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Lv;")
    public static class146 field1102 = class159.method1226((byte) -37, "(U5");

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "[I")
    public static int[] field1097 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "Lv;")
    public static class146 field1108 = class159.method1226((byte) -37, "sl_button");

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Lv;")
    public static class146 field1100 = class159.method1226((byte) -37, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "Z")
    public static boolean field1113 = false;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field1111 = 0;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lv;")
    public static class146 field1094 = class159.method1226((byte) -37, "null");

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "Lv;")
    private static class146 field1118 = class159.method1226((byte) -37, "Welcome to RuneScape");

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Lv;")
    public static class146 field1098 = field1118;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "J")
    private long field1106;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "Ldd;")
    public static class26 field1110;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Lec;")
    private class32 field1105;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "Lec;")
    private class32 field1117;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BJ)Lec;")
    public final class32 method332(byte arg0, long arg1) {
        this.field1106 = arg1;
        class32 var4 = this.field1095[(int) (arg1 & (long) (this.field1112 - 1))];
        field1115++;
        if (arg0 != -79) {
            this.method336(98L, null, -63);
        }
        for (this.field1105 = var4.field664; this.field1105 != var4; this.field1105 = this.field1105.field664) {
            if (this.field1105.field679 == arg1) {
                class32 var5 = this.field1105;
                this.field1105 = this.field1105.field664;
                return var5;
            }
        }
        this.field1105 = null;
        return null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)Lec;")
    public final class32 method333(int arg0) {
        field1099++;
        if (this.field1116 > arg0 && this.field1095[this.field1116 - 1] != this.field1117) {
            class32 var2 = this.field1117;
            this.field1117 = var2.field664;
            return var2;
        }
        while (this.field1112 > this.field1116) {
            class32 var3 = this.field1095[this.field1116++].field664;
            if (this.field1095[this.field1116 - 1] != var3) {
                this.field1117 = var3.field664;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
    public static void method334(boolean arg0) {
        field1104 = null;
        field1118 = null;
        field1094 = null;
        field1108 = null;
        field1110 = null;
        field1098 = null;
        if (!arg0) {
            method334(false);
        }
        field1102 = null;
        field1100 = null;
        field1096 = null;
        field1097 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)Lec;")
    public final class32 method335(byte arg0) {
        field1107++;
        if (this.field1105 == null) {
            return null;
        }
        class32 var2 = this.field1095[(int) (this.field1106 & (long) (this.field1112 - 1))];
        if (arg0 != -10) {
            this.method337(13);
        }
        while (this.field1105 != var2) {
            if (this.field1105.field679 == this.field1106) {
                class32 var3 = this.field1105;
                this.field1105 = this.field1105.field664;
                return var3;
            }
            this.field1105 = this.field1105.field664;
        }
        this.field1105 = null;
        return null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(JLec;I)V")
    public final void method336(long arg0, class32 arg1, int arg2) {
        if (arg2 != -8899) {
            this.field1095 = null;
        }
        if (arg1.field674 != null) {
            arg1.method217(-1264);
        }
        field1109++;
        class32 var5 = this.field1095[(int) ((long) (this.field1112 - 1) & arg0)];
        arg1.field674 = var5.field674;
        arg1.field679 = arg0;
        arg1.field664 = var5;
        arg1.field674.field664 = arg1;
        arg1.field664.field674 = arg1;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I)V")
    public class48(int arg0) {
        this.field1095 = new class32[arg0];
        this.field1112 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class32 var3 = this.field1095[var2] = new class32();
            var3.field674 = var3;
            var3.field664 = var3;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)Lec;")
    public final class32 method337(int arg0) {
        field1103++;
        this.field1116 = 0;
        if (arg0 > -97) {
            this.method336(106L, null, 66);
        }
        return this.method333(0);
    }
}
