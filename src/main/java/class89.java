import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class89 extends class237 {

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    private int field1109;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    private int field1106;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    private int field1104;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    private int field1096;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
    private int field1114;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    private int field1098;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field1102 = 0;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "[Lbl;")
    public static class259[] field1113 = new class259[2048];

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "Z")
    public static boolean field1115 = true;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "Leh;")
    public static class137 field1095;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "Ltd;")
    public static class175 field1103;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "Lgk;")
    public static class184 field1100;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method484(int arg0, String[] arg1) {
        String[] var2 = new String[5];
        field1094++;
        if (arg0 != 17594) {
            method484(-89, (String[]) null);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)Z")
    public final boolean method485(int arg0, int arg1, int arg2) {
        if (arg0 != 5) {
            this.field1096 = -64;
        }
        field1099++;
        return this.field1105 <= arg2 && this.field1108 >= arg2 && this.field1093 <= arg1 && this.field1101 >= arg1;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Leh;I)V")
    public static final void method486(class137 arg0, int arg1) {
        class201.field3185 = arg0;
        field1107++;
        if (arg1 != 2048) {
            field1103 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
    public static void method487(int arg0) {
        field1095 = null;
        field1100 = null;
        field1103 = null;
        field1113 = null;
        if (arg0 < 90) {
            field1100 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBI)Z")
    public final boolean method488(int arg0, byte arg1, int arg2) {
        int var4 = 117 / ((arg1 - 9) / 61);
        field1111++;
        return arg2 >= this.field1096 && arg2 <= this.field1104 && this.field1114 <= arg0 && this.field1098 >= arg0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)Z")
    public final boolean method489(int arg0, int arg1, int arg2, int arg3) {
        field1097++;
        if (arg2 == 0) {
            return this.field1106 == arg1 && arg0 >= this.field1096 && arg0 <= this.field1104 && arg3 >= this.field1114 && arg3 <= this.field1098;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(III)[I")
    public final int[] method490(int arg0, int arg1, int arg2) {
        field1112++;
        if (arg2 != 5) {
            field1095 = null;
        }
        return new int[] { this.field1106, arg0 + this.field1096 - this.field1105, -this.field1093 + this.field1114 + arg1 };
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1109 = arg1;
        this.field1106 = arg0;
        this.field1104 = arg4;
        this.field1096 = arg2;
        this.field1105 = arg6;
        this.field1114 = arg3;
        this.field1093 = arg7;
        this.field1108 = arg8;
        this.field1098 = arg5;
        this.field1101 = arg9;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BII)[I")
    public final int[] method491(byte arg0, int arg1, int arg2) {
        field1110++;
        if (arg0 <= 55) {
            this.field1096 = -8;
        }
        return new int[] { this.field1109, arg1 + this.field1105 - this.field1096, arg2 - -this.field1093 - this.field1114 };
    }
}
