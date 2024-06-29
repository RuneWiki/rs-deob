import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class53 extends class22 {

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "Lva;")
    public static class121 field1226 = class107.method797("(U(Y", -10983);

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "Lva;")
    public static class121 field1234 = class107.method797("(X100(U(Y", -10983);

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "Lva;")
    public static class121 field1236 = class107.method797("(U", -10983);

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "Lva;")
    private static class121 field1230 = class107.method797("You need a members account to login to this world)3", -10983);

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "Lva;")
    public static class121 field1227 = field1230;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public int field1221;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    public int field1225;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "Lw;")
    public static class125 field1229;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "Lhe;")
    public static class47 field1223;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "[I")
    public int[] field1224;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "[I")
    public int[] field1231;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "[I")
    public int[] field1233;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "[I")
    public static int[] field1237;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "[Lfa;")
    public class32[] field1220;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "[Lfa;")
    public class32[] field1238;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "[[[B")
    public byte[][][] field1228;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILhe;)Z", line = 13)
    public static final boolean method375(int arg0, int arg1, class47 arg2) {
        if (arg0 != 13530) {
            return true;
        }
        field1235++;
        byte[] var3 = arg2.method321(15970, arg1);
        if (var3 == null) {
            return false;
        } else {
            class69.method485(24507, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V", line = 39)
    public static void method376(boolean arg0) {
        field1230 = null;
        if (!arg0) {
            field1237 = null;
        }
        field1226 = null;
        field1229 = null;
        field1236 = null;
        field1223 = null;
        field1234 = null;
        field1227 = null;
        field1237 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)V", line = 64)
    public static final void method377(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 85 / ((32 - arg3) / 59);
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                class45.field1058[arg0][arg2 + var5][arg1 + var8] = 0;
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class45.field1058[arg0][arg2][arg1 + var6] = class45.field1058[arg0][arg2 - 1][arg1 + var6];
            }
        }
        if (arg1 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                class45.field1058[arg0][arg2 + var7][arg1] = class45.field1058[arg0][arg2 + var7][arg1 - 1];
            }
        }
        if (arg2 > 0 && class45.field1058[arg0][arg2 - 1][arg1] != 0) {
            class45.field1058[arg0][arg2][arg1] = class45.field1058[arg0][arg2 - 1][arg1];
        } else if (arg1 > 0 && class45.field1058[arg0][arg2][arg1 - 1] != 0) {
            class45.field1058[arg0][arg2][arg1] = class45.field1058[arg0][arg2][arg1 - 1];
        } else if (arg2 > 0 && arg1 > 0 && class45.field1058[arg0][arg2 - 1][arg1 - 1] != 0) {
            class45.field1058[arg0][arg2][arg1] = class45.field1058[arg0][arg2 - 1][arg1 - 1];
        }
        field1232++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)V", line = 131)
    public static final void method378(byte arg0, int arg1) {
        field1218++;
        if (arg1 == -1 || !class61.field1482[arg1]) {
            return;
        }
        class107.field2435.method331(true, arg1);
        if (class126.field2872[arg1] == null) {
            return;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0 != -99) {
            field1223 = null;
        }
        while (class126.field2872[arg1].length > var3) {
            if (class126.field2872[arg1][var3] != null) {
                if (class126.field2872[arg1][var3].field479 == 2) {
                    var2 = false;
                } else {
                    class126.field2872[arg1][var3] = null;
                }
            }
            var3++;
        }
        if (var2) {
            class126.field2872[arg1] = null;
        }
        class61.field1482[arg1] = false;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 182)
    public static final void method379(int arg0) {
        class128.field2946.method984(-1);
        int var1 = 44 / ((arg0 + 79) / 41);
        field1217++;
        class75.field1732 = class83.method577(class75.field1732);
    }
}
