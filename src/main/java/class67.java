import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class67 extends class196 {

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "[I")
    public static int[] field1176 = new int[100];

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "Lai;")
    private static class10 field1175 = class44.method278("Login server offline)3", -20);

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "J")
    public static volatile long field1174 = 0L;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "Lai;")
    private static class10 field1181 = class44.method278("New User", 127);

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "Lai;")
    public static class10 field1179 = field1175;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "Lai;")
    public static class10 field1173 = field1181;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
    public static int field1177 = 0;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    public int field1166;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "Lmb;")
    public static class111 field1183;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "Lte;")
    public static class177 field1162;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "Lbf;")
    public static class17 field1172;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "[Lta;")
    public static class173[] field1178;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "[[B")
    public static byte[][] field1169;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZIIIIILme;I)V")
    public static final void method437(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class114 arg6, int arg7) {
        if (arg0) {
            return;
        }
        field1163++;
        if (arg5 < 0 || arg5 >= 104 || arg7 < 0 || arg7 >= 104) {
            while (true) {
                int var10 = arg6.method767(true);
                if (var10 == 0) {
                    return;
                }
                if (var10 == 1) {
                    arg6.method767(true);
                    return;
                }
                if (var10 <= 49) {
                    arg6.method767(true);
                }
            }
        }
        class185.field3527[arg2][arg5][arg7] = 0;
        while (true) {
            int var8 = arg6.method767(true);
            if (var8 == 0) {
                if (arg2 == 0) {
                    class186.field3556[0][arg5][arg7] = -class100.method650(arg7 + arg1 + 556238, 60, arg4 + arg5 + 932731) * 8;
                    return;
                } else {
                    class186.field3556[arg2][arg5][arg7] = class186.field3556[arg2 - 1][arg5][arg7] - 240;
                    return;
                }
            }
            if (var8 == 1) {
                int var9 = arg6.method767(true);
                if (var9 == 1) {
                    var9 = 0;
                }
                if (arg2 == 0) {
                    class186.field3556[0][arg5][arg7] = -var9 * 8;
                    return;
                }
                class186.field3556[arg2][arg5][arg7] = class186.field3556[arg2 - 1][arg5][arg7] - var9 * 8;
                return;
            }
            if (var8 <= 49) {
                class104.field1947[arg2][arg5][arg7] = arg6.method759((byte) 127);
                class20.field298[arg2][arg5][arg7] = (byte) ((var8 - 2) / 4);
                class82.field1433[arg2][arg5][arg7] = (byte) class123.method861(3, var8 + arg3 - 2);
            } else if (var8 <= 81) {
                class185.field3527[arg2][arg5][arg7] = (byte) (var8 - 49);
            } else {
                class153.field2934[arg2][arg5][arg7] = (byte) (var8 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
    public static void method438(int arg0) {
        field1169 = null;
        field1183 = null;
        field1172 = null;
        field1181 = null;
        field1179 = null;
        field1162 = null;
        int var1 = 9 / ((-arg0 - 21) / 53);
        field1173 = null;
        field1178 = null;
        field1175 = null;
        field1176 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lme;II)V")
    private final void method439(class114 arg0, int arg1, int arg2) {
        field1182++;
        if (arg2 < 42) {
            method441(-103);
        }
        if (arg1 == 1) {
            this.field1165 = arg0.method762((byte) 109);
            this.field1184 = arg0.method767(true);
            this.field1166 = arg0.method767(true);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[Lai;)Lai;")
    public static final class10 method440(int arg0, class10[] arg1) {
        field1180++;
        if (arg0 != 0) {
            field1169 = null;
        }
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class193.method1234(-111, arg1.length, arg1, 0);
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)V")
    public static final void method441(int arg0) {
        field1168++;
        if (class180.field3418 != null) {
            class180.field3418.method1329(16128);
        }
        if (class153.field2950 != null) {
            class153.field2950.method1329(arg0 + 16129);
        }
        if (arg0 != -1) {
            field1178 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILme;)V")
    public final void method442(int arg0, class114 arg1) {
        if (arg0 > -67) {
            method437(false, -1, -11, 122, 49, 56, null, -103);
        }
        field1167++;
        while (true) {
            int var3 = arg1.method767(true);
            if (var3 == 0) {
                return;
            }
            this.method439(arg1, var3, 101);
        }
    }
}
