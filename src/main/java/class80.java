import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class80 extends class431 {

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "Z")
    public static boolean field1143 = false;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "[I")
    public static int[] field1144 = new int[1000];

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public int field1146;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public int field1147;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public int field1151;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public int field1153;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public int field1154;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    public int field1157;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    public int field1158;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public int field1160;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    public int field1166;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public int field1167;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public int field1169;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "Lnt;")
    public class151 field1150;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "Ldb;")
    public class213 field1162;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "Lfi;")
    public class392 field1165;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "Lul;")
    public static class406 field1142;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "Lul;")
    public static class406 field1152;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "Lfv;")
    public class79 field1156;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public static void method677(byte arg0) {
        field1152 = null;
        field1142 = null;
        int var1 = 6 % ((arg0 + 7) / 51);
        field1144 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public final void method678(int arg0) {
        if (arg0 >= -7) {
            return;
        }
        this.field1150 = null;
        this.field1162 = null;
        this.field1156 = null;
        field1149++;
        this.field1165 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLod;I)I")
    public static final int method679(byte arg0, class352 arg1, int arg2) {
        field1168++;
        byte var3 = -1;
        if (arg0 != 2) {
            method677((byte) -71);
        }
        return var3;
    }
}
