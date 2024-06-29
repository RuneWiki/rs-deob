import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class45 {

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lv;")
    public static class122 field1165 = class55.method425(-127, "Spiel)2Fenster geladen)3");

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Lv;")
    public static class122 field1173 = class55.method425(-61, "Passwort: ");

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lv;")
    public static class122 field1174 = class55.method425(-87, "backvmid2");

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Lv;")
    public static class122 field1172 = class55.method425(-82, "(U");

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Lv;")
    public static class122 field1171 = class55.method425(-103, "_");

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lfe;")
    public static class36 field1164 = new class36();

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lmb;")
    public static class74 field1166;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "[I")
    public static int[] field1169;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "[Lvb;")
    public static class124[] field1176;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILmb;)V", line = 30)
    public static final void method376(int arg0, class74 arg1) {
        class69.field1812 = arg1;
        field1162++;
        if (arg0 != -3) {
            field1174 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)Z", line = 44)
    public static final boolean method377(byte arg0, int arg1) {
        field1170++;
        if (class109.field2681[arg1]) {
            return true;
        } else if (class75.field2016.method617(arg1, true)) {
            int var2 = class75.field2016.method601(-80, arg1);
            if (var2 == 0) {
                class109.field2681[arg1] = true;
                return true;
            }
            if (class76.field2039[arg1] == null) {
                class76.field2039[arg1] = new class36[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class76.field2039[arg1][var3] == null) {
                    byte[] var4 = class75.field2016.method611(0, arg1, var3);
                    if (var4 != null) {
                        class76.field2039[arg1][var3] = new class36();
                        class76.field2039[arg1][var3].method326(true, new class64(var4));
                    }
                }
            }
            if (arg0 != 32) {
                field1164 = null;
            }
            class109.field2681[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)I", line = 113)
    public static final int method378(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field1160++;
        if (arg0 <= 99) {
            method376(99, null);
        }
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 139)
    public static void method379(int arg0) {
        field1172 = null;
        field1169 = null;
        field1164 = null;
        field1173 = null;
        field1176 = null;
        field1174 = null;
        if (arg0 >= -74) {
            method376(-21, null);
        }
        field1165 = null;
        field1171 = null;
        field1166 = null;
    }
}
