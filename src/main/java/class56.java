import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class56 {

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "[I")
    private int[] field1095;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "[I")
    public static int[] field1084 = new int[50];

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field1085 = 0;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field1090 = 0;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Llc;")
    public static class143 field1086 = class66.method374("Lade Schrifts-=tze )2 ", -1);

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "[I")
    public static int[] field1093 = new int[32768];

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Ljg;")
    public static class264 field1087;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
    public static void method334(boolean arg0) {
        field1093 = null;
        field1086 = null;
        if (!arg0) {
            method334(true);
        }
        field1084 = null;
        field1087 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZS)Z")
    public static final boolean method335(boolean arg0, short arg1) {
        field1083++;
        if (arg1 == 2 || arg1 == 6 || arg1 == 42 || arg1 == 11 || arg1 == 13 || arg1 == 57 || arg1 == 26 || arg1 == 31) {
            return true;
        } else if (arg1 == 7 || arg1 == 38 || arg1 == 1006 || arg1 == 1002) {
            return true;
        } else if (arg1 == 29 || arg1 == 39 || arg1 == 34 || arg1 == 16 || arg1 == 21) {
            return true;
        } else {
            if (!arg0) {
                method336(76, 78);
            }
            return arg1 == 28 || arg1 == 33 || arg1 == 20 || arg1 == 25 || arg1 == 47 || arg1 == 14;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Z")
    public static final boolean method336(int arg0, int arg1) {
        field1088++;
        if (arg1 != -27838) {
            field1093 = null;
        }
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)I")
    public final int method337(int arg0, int arg1) {
        if (arg1 != 0) {
            field1087 = null;
        }
        int var3 = (this.field1095.length >> 1) - 1;
        int var4 = arg0 & var3;
        field1089++;
        while (true) {
            int var5 = this.field1095[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1095[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([I)V")
    public class56(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field1095 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1095[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field1095[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field1095[var5 + var5] = arg0[var4];
            this.field1095[var5 + var5 + 1] = var4++;
        }
    }
}
