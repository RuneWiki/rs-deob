import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class48 {

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Lkc;")
    public static class67 field1155 = class19.method144("Ein kostenloses Spielkonto erstellen)3", 110);

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Lkc;")
    public static class67 field1159 = class19.method144("@red@", 101);

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field1163 = 0;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field1158 = -1;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field1151 = 1;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "[I")
    public static int[] field1162 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Lkc;")
    private static class67 field1160 = class19.method144("Could not complete login)3", 71);

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "Lkc;")
    private static class67 field1161 = class19.method144("Offline", 71);

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "Lkc;")
    public static class67 field1164 = field1161;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Lkc;")
    public static class67 field1156 = field1160;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "[I")
    public static int[] field1157;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BZ)V", line = 10)
    public static final void method396(byte arg0, boolean arg1) {
        field1165++;
        if (class98.field2213 == null) {
            return;
        }
        try {
            class140 var2 = new class140(4);
            var2.method1115((byte) 49, arg1 ? 2 : 3);
            var2.method1096(0, (byte) 79);
            class98.field2213.method754(4, 32741, 0, var2.field3325);
        } catch (IOException var4) {
            try {
                class98.field2213.method751(-2);
            } catch (Exception var3) {
            }
            class98.field2213 = null;
            class29.field618++;
        }
        if (arg0 != 75) {
            field1164 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 42)
    public static void method397(int arg0) {
        field1161 = null;
        field1160 = null;
        field1164 = null;
        field1159 = null;
        field1162 = null;
        field1156 = null;
        field1155 = null;
        if (arg0 == 1) {
            field1157 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z[BIII)V", line = 65)
    public static final void method398(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field1152++;
        if (class52.field1280 == null || arg3 != -1) {
            return;
        }
        if (class97.field2189 >= 0) {
            arg2 -= 20;
            if (arg2 < 1) {
                arg2 = 1;
            }
            field1163 = arg2;
            if (class97.field2189 == 0) {
                class25.field539 = 0;
            } else {
                int var5 = class83.method650(-126, class97.field2189);
                int var6 = var5 - class119.field2805;
                class25.field539 = (var6 + arg2 + 3600 - 1) / arg2;
            }
            client.field465 = arg1;
            class14.field302 = arg0;
            class106.field2413 = arg4;
        } else if (field1163 == 0) {
            class46.method385(arg4, 7833, arg0, arg1);
        } else {
            class106.field2413 = arg4;
            class14.field302 = arg0;
            client.field465 = arg1;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lac;ILac;Lac;)V", line = 117)
    public static final void method399(class4 arg0, int arg1, class4 arg2, class4 arg3) {
        if (arg1 != 4223) {
            method398(false, null, -16, 118, -74);
        }
        class67.field1619 = arg0;
        field1154++;
        class111.field2549 = arg3;
        class12.field276 = arg2;
        class54.field1305 = new class33[class111.field2549.method46((byte) 110)][];
        class121.field2858 = new boolean[class111.field2549.method46((byte) 62)];
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Led;B)Z", line = 143)
    public static final boolean method400(class33 arg0, byte arg1) {
        field1150++;
        if (arg0.field769 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1 != -55) {
            method398(true, null, 106, 126, -48);
        }
        while (var2 < arg0.field769.length) {
            int var3 = class91.method712(false, arg0, var2);
            int var4 = arg0.field744[var2];
            if (arg0.field769[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field769[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field769[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }
}
